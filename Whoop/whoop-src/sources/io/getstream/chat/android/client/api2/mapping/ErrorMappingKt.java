package io.getstream.chat.android.client.api2.mapping;

import io.getstream.chat.android.client.api2.model.dto.ErrorDetailDto;
import io.getstream.chat.android.client.api2.model.dto.ErrorDto;
import io.getstream.chat.android.client.errors.ChatError;
import io.getstream.chat.android.client.errors.ChatErrorDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000¨\u0006\u0005"}, m65681d2 = {"toDomain", "Lio/getstream/chat/android/client/errors/ChatError;", "Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;", "Lio/getstream/chat/android/client/errors/ChatErrorDetail;", "Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ErrorMappingKt {
    public static final ChatError toDomain(ErrorDto errorDto) {
        AbstractC22676k.m65750j(errorDto, "<this>");
        int code = errorDto.getCode();
        String message = errorDto.getMessage();
        int statusCode = errorDto.getStatusCode();
        Map<String, String> exception_fields = errorDto.getException_fields();
        String more_info = errorDto.getMore_info();
        List<ErrorDetailDto> details = errorDto.getDetails();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(details, 10));
        Iterator<T> it = details.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((ErrorDetailDto) it.next()));
        }
        ChatError chatError = new ChatError(code, message, statusCode, exception_fields, more_info, arrayList, null, 64, null);
        chatError.setDuration(errorDto.getDuration());
        return chatError;
    }

    public static final ChatErrorDetail toDomain(ErrorDetailDto errorDetailDto) {
        AbstractC22676k.m65750j(errorDetailDto, "<this>");
        return new ChatErrorDetail(errorDetailDto.getCode(), errorDetailDto.getMessages());
    }
}
