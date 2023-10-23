package Model.ResponseModel;

import Model.ResponseModel.PageResourceResponse;
import Model.ResponseModel.SupportResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PageResponse {
    public int page;
    @JsonProperty("per_page")
    public int perPage;
    public int total;
    @JsonProperty("total_pages")
    public int totalPages;
    public PageResourceResponse data;
    public SupportResponse support;
}

