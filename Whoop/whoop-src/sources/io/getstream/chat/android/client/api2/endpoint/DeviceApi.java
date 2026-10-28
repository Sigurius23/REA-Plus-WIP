package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AuthenticatedApi;
import io.getstream.chat.android.client.api2.model.requests.AddDeviceRequest;
import io.getstream.chat.android.client.api2.model.response.CompletableResponse;
import io.getstream.chat.android.client.api2.model.response.DevicesResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/DeviceApi;", "", "getDevices", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/DevicesResponse;", "addDevices", "Lio/getstream/chat/android/client/api2/model/response/CompletableResponse;", "request", "Lio/getstream/chat/android/client/api2/model/requests/AddDeviceRequest;", "deleteDevice", "id", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
@AuthenticatedApi
public interface DeviceApi {
    @InterfaceC37284o("/devices")
    RetrofitCall<CompletableResponse> addDevices(@InterfaceC37270a AddDeviceRequest request);

    @InterfaceC37271b("/devices")
    RetrofitCall<CompletableResponse> deleteDevice(@InterfaceC37289t("id") String id4);

    @InterfaceC37275f("/devices")
    RetrofitCall<DevicesResponse> getDevices();
}
