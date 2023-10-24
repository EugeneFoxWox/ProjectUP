package Model.RequestsModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class AuthSuccessfulRequestModel {
    public String email;
    public String password;

    public AuthSuccessfulRequestModel(String email) {

    }
}

