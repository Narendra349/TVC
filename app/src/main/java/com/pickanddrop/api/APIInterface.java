package com.pickanddrop.api;

import com.pickanddrop.dto.DeliveryDTO;
import com.pickanddrop.dto.LocationDTO;
import com.pickanddrop.dto.LoginDTO;
import com.pickanddrop.dto.OtherDTO;
import com.pickanddrop.fragment.ForgotPassword;
import com.pickanddrop.model.ChangePasswordModel;
import com.pickanddrop.model.ForgotPasswordModel;
import com.pickanddrop.model.LoginModel;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface APIInterface {

//    @FormUrlEncoded
//    @POST("login")
//    Call<LoginDTO> callLoginApi(@FieldMap Map<String, String> map);

    @POST("ApiController/driverlogin")
    Call<LoginDTO> callLoginApi(@Body LoginModel loginModel);

//    @FormUrlEncoded
//    @POST("forgetPassword")
//    Call<OtherDTO> callForgotApi(@FieldMap Map<String, String> map);

    @POST("ApiController/forgetPassword")
    Call<OtherDTO> callForgotApi(@Body ForgotPasswordModel forgotPasswordModel);

    @FormUrlEncoded
    @POST("ApiController/create_order")
    Call<OtherDTO> callCreateOrderApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/rescheduleOrder")
    Call<OtherDTO> callRescheduleOrderApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/cancelDelivery")
    Call<OtherDTO> callCancelOrderApi(@FieldMap Map<String, String> map);


//    @FormUrlEncoded
//    @POST("changePassword")
//    Call<OtherDTO> callChangePassword(@FieldMap Map<String, String> map);

    @POST("ApiController/changePassword")
    Call<OtherDTO> callChangePassword(@Body ChangePasswordModel changePasswordModel);

//    @Multipart
//    @POST("registration")
//    Call<OtherDTO> callSignUpApi(
//            @PartMap() Map<String, RequestBody> partMap,
//            @Part MultipartBody.Part profileImage);

    @Multipart
    @POST("ApiController/driverRegistration")
    Call<OtherDTO> callSignUpApi(
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part profileImage, @Part MultipartBody.Part lisenceImage,
            @Part MultipartBody.Part insuranceImage);

    @Multipart
    @POST("ApiController/editProfile")
    Call<LoginDTO> callEditProfileApi(
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part profileImage);

    @FormUrlEncoded
    @POST("ApiController/deliveryDetail")
    Call<DeliveryDTO> callDeliveryDetailsApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/get_user_deliveries")
    Call<DeliveryDTO>callUserCurrentDeliveryApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/customerOrderHistory")
    Call<DeliveryDTO> callUserHistoryDeliveryApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/driverOrderHistory")
    Call<DeliveryDTO> callDriverHistoryDeliveryApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/get_driver_deliveries")
    Call<DeliveryDTO> callDriverCurrentDeliveryApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/notifications")
    Call<DeliveryDTO> callNotificationListApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/getNearByDeliveryBoys")
    Call<LocationDTO> getNearDriver(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/getNearByDeliveries")
    Call<DeliveryDTO> callNearDeliveriesForDriverApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/acceptDeliveryRequest")
    Call<OtherDTO> callAcceptDeliveriesForDriverApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/pickupdelivery")
    Call<OtherDTO> callPickupDeliveriesForDriverApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/changeReportproblemstatus")
    Call<OtherDTO> callReOrderApi(@FieldMap Map<String, String> map);

    @Multipart
    @POST("ApiController/deliverOrder")
    Call<LoginDTO> callDeliverOrderApi(
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part signatureImage,
            @Part MultipartBody.Part itemImage);

    @FormUrlEncoded
    @POST("ApiController/getSettings")
    Call<OtherDTO> getSettingForPrice(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/reportProblem")
    Call<OtherDTO> callReportProblemApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/review")
    Call<OtherDTO> callReviewApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/logout")
    Call<OtherDTO> callLogoutApi(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("ApiController/addNotifyCount")
    Call<OtherDTO> callAddNotifyCount(@FieldMap Map<String, String> map);

}

