package br.com.como_voce_mora.api;

import br.com.como_voce_mora.model.AnswerRequest;
import br.com.como_voce_mora.model.DwellerId;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServiceApi {
    @GET("getdwellerId")
    public Call<DwellerId> getUserData();

    @POST("save")
    public Call<AnswerRequest> saveAnswer(@Body AnswerRequest answerRequest);
}
