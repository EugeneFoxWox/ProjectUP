package Model.ResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PagesResponse {
    public int page;
    @JsonProperty("per_page")
    public int perPage;
    public int total;
    @JsonProperty("total_pages")
    public int totalPages;
    public ArrayList<PageResourceResponse> data;
    public SupportResponse support;
}
