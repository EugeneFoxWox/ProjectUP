package Model.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthSuccessfulResponseModel {
    public Integer id;
    public String token;

    public AuthSuccessfulResponseModel(String token) {

    }
}
