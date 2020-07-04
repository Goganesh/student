package ru.student3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileFinder {

    public List<String> getAllFilesForPathAndExtension(String pathName, String extensionName) throws IOException {
        List<String> files = new ArrayList<>();

        // определяем объект для каталога
        File dir = new File(pathName);
        // если объект представляет каталог
        if(dir.isDirectory())
        {
            // получаем все вложенные объекты в каталоге
            for(File item : dir.listFiles()){
                if(item.isFile()){
                    if(getFileExtension(item).equals(extensionName))
                        files.add(item.getName());
                    //System.out.println(item.getName() + "  \t file");
                }
            }
        }

        return files;
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".")+1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }
}
