package com.fullstack.dto;

import java.io.Serializable;
import java.net.URLEncoder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadResultDTO implements Serializable{

   private String fileName;
   private String uuid;
   private String folderPath;
   
   // 나중에 이미지를 업로드 시 이미지 패스 경로를 리턴하는 메서드 정의.
   public String getImageURL() {
      try {
         return URLEncoder.encode(folderPath + "/" + uuid + "_" + fileName, "UTF-8");
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println(e.getMessage());
      }
      return "";
   }
}