package io.getstream.chat.android.client.api2.mapping;

import io.getstream.chat.android.client.api2.model.response.SocketErrorResponse;
import io.getstream.chat.android.client.socket.ErrorDetail;
import io.getstream.chat.android.client.socket.ErrorResponse;
import io.getstream.chat.android.client.socket.SocketErrorMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, m65681d2 = {"toDomain", "Lio/getstream/chat/android/client/socket/SocketErrorMessage;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;", "Lio/getstream/chat/android/client/socket/ErrorResponse;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;", "Lio/getstream/chat/android/client/socket/ErrorDetail;", "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse$ErrorDetail;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SocketErrorMappingKt {
    public static final SocketErrorMessage toDomain(SocketErrorResponse socketErrorResponse) {
        AbstractC22676k.m65750j(socketErrorResponse, "<this>");
        SocketErrorResponse.ErrorResponse error = socketErrorResponse.getError();
        return new SocketErrorMessage(error != null ? toDomain(error) : null);
    }

    public static final ErrorResponse toDomain(SocketErrorResponse.ErrorResponse errorResponse) {
        AbstractC22676k.m65750j(errorResponse, "<this>");
        int code = errorResponse.getCode();
        String message = errorResponse.getMessage();
        int statusCode = errorResponse.getStatusCode();
        Map<String, String> exception_fields = errorResponse.getException_fields();
        String more_info = errorResponse.getMore_info();
        List<SocketErrorResponse.ErrorResponse.ErrorDetail> details = errorResponse.getDetails();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(details, 10));
        Iterator<T> it = details.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((SocketErrorResponse.ErrorResponse.ErrorDetail) it.next()));
        }
        ErrorResponse errorResponse2 = new ErrorResponse(code, message, statusCode, exception_fields, more_info, arrayList);
        errorResponse2.setDuration(errorResponse.getDuration());
        return errorResponse2;
    }

    public static final ErrorDetail toDomain(SocketErrorResponse.ErrorResponse.ErrorDetail errorDetail) {
        AbstractC22676k.m65750j(errorDetail, "<this>");
        return new ErrorDetail(errorDetail.getCode(), errorDetail.getMessages());
    }
}
