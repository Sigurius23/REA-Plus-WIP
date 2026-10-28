package io.getstream.chat.android.client.api2.endpoint;

import io.getstream.chat.android.client.api.AnonymousApi;
import io.getstream.chat.android.client.api2.model.requests.GuestUserRequest;
import io.getstream.chat.android.client.api2.model.response.TokenResponse;
import io.getstream.chat.android.client.call.RetrofitCall;
import p715kotlin.Metadata;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes5.dex */
@AnonymousApi
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/endpoint/GuestApi;", "", "getGuestUser", "Lio/getstream/chat/android/client/call/RetrofitCall;", "Lio/getstream/chat/android/client/api2/model/response/TokenResponse;", "body", "Lio/getstream/chat/android/client/api2/model/requests/GuestUserRequest;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface GuestApi {
    @InterfaceC37284o("/guest")
    RetrofitCall<TokenResponse> getGuestUser(@InterfaceC37270a GuestUserRequest body);
}
