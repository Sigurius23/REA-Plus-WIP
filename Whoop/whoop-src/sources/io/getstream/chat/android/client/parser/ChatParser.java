package io.getstream.chat.android.client.parser;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.errors.ChatErrorCode;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.socket.ErrorDetail;
import io.getstream.chat.android.client.socket.ErrorResponse;
import java.util.List;
import n23.AbstractC26205h;
import n23.C26199b;
import n23.C26200c;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29222x0;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0001H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010%\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/parser/ChatParser;", "", "", "moreInfo", "moreInfoTemplate", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lio/getstream/chat/android/client/socket/ErrorDetail;", "details", "buildDetailsTemplate", "(Ljava/util/List;)Ljava/lang/String;", "any", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "T", "raw", "Ljava/lang/Class;", "clazz", "fromJson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lpg3/x0;", "builder", "configRetrofit", "(Lpg3/x0;)Lpg3/x0;", "Ln23/h;", "fromJsonOrError", "(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;", "Lud3/x0;", "okHttpResponse", "Ln23/c;", "toError", "(Lud3/x0;)Ln23/c;", "Lud3/a1;", "errorResponseBody", "(Lud3/a1;)Ln23/c;", "getTag", "()Ljava/lang/String;", "tag", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatParser {
    private default String buildDetailsTemplate(List<ErrorDetail> details) {
        return !details.isEmpty() ? AbstractC11895b.m31998q("\nError details: ", details) : "";
    }

    private default String getTag() {
        return "Chat:ChatParser";
    }

    private default String moreInfoTemplate(String moreInfo) {
        return !AbstractC39414r.m125890i0(moreInfo) ? AbstractC11266d.m30461o("\nMore information available at ", moreInfo) : "";
    }

    C29222x0 configRetrofit(C29222x0 builder);

    <T> T fromJson(String raw, Class<T> clazz);

    default <T> AbstractC26205h fromJsonOrError(String raw, Class<T> clazz) {
        AbstractC22676k.m65750j(raw, "raw");
        AbstractC22676k.m65750j(clazz, "clazz");
        try {
            return new C26204g(fromJson(raw, clazz));
        } catch (Throwable th3) {
            return new C26203f(new C26201d("fromJsonOrError error parsing of " + clazz + " into " + raw, th3));
        }
    }

    default C26200c toError(C34850x0 okHttpResponse) {
        ErrorResponse errorResponse;
        C26199b c26199b = C26200c.f103911e;
        AbstractC22676k.m65750j(okHttpResponse, "okHttpResponse");
        int i13 = okHttpResponse.f146792z;
        try {
            String strM109860m = okHttpResponse.m109934i(Long.MAX_VALUE).m109860m();
            if (strM109860m.length() == 0) {
                return ChatErrorKt.fromChatErrorCode$default(c26199b, ChatErrorCode.NO_ERROR_BODY, i13, null, 4, null);
            }
            try {
                errorResponse = (ErrorResponse) fromJson(strM109860m, ErrorResponse.class);
            } catch (Throwable unused) {
                ErrorResponse errorResponse2 = new ErrorResponse(0, null, 0, null, null, null, 63, null);
                errorResponse2.setMessage(strM109860m);
                errorResponse = errorResponse2;
            }
            return new C26200c(errorResponse.getMessage() + moreInfoTemplate(errorResponse.getMoreInfo()) + buildDetailsTemplate(errorResponse.getDetails()), errorResponse.getCode(), i13, 8);
        } catch (Throwable th3) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:ChatParser")) {
                C2343i.f9271c.log(enumC2341g, "Chat:ChatParser", "[toError] failed", th3);
            }
            return ChatErrorKt.fromChatErrorCode(c26199b, ChatErrorCode.NETWORK_FAILED, i13, th3);
        }
    }

    String toJson(Object any);

    default C26200c toError(AbstractC34799a1 errorResponseBody) {
        AbstractC22676k.m65750j(errorResponseBody, "errorResponseBody");
        try {
            ErrorResponse errorResponse = (ErrorResponse) fromJson(errorResponseBody.m109860m(), ErrorResponse.class);
            int code = errorResponse.getCode();
            String message = errorResponse.getMessage();
            return new C26200c(message + moreInfoTemplate(errorResponse.getMoreInfo()), code, errorResponse.getStatusCode(), 8);
        } catch (Throwable th3) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:ChatParser")) {
                C2343i.f9271c.log(enumC2341g, "Chat:ChatParser", "[toError] failed", th3);
            }
            return ChatErrorKt.fromChatErrorCode$default(C26200c.f103911e, ChatErrorCode.NETWORK_FAILED, 0, th3, 2, null);
        }
    }
}
