package ash.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long id;
    private String itemName;
    private UploadFile attachFile; // 파일 명을 분리하기 위함
    private List<UploadFile> imageFiles;
}
