package io.getstream.chat.android.client.socket;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JW\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/ErrorResponse;", "", "code", "", "message", "", "statusCode", "exceptionFields", "", "moreInfo", "details", "", "Lio/getstream/chat/android/client/socket/ErrorDetail;", "<init>", "(ILjava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "setStatusCode", "(I)V", "getExceptionFields", "()Ljava/util/Map;", "getMoreInfo", "setMoreInfo", "getDetails", "()Ljava/util/List;", AttachmentExtensionsKt.EXTRA_DURATION, "getDuration", "setDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ErrorResponse {
    private final int code;
    private final List<ErrorDetail> details;
    private String duration;
    private final Map<String, String> exceptionFields;
    private String message;
    private String moreInfo;
    private int statusCode;

    public ErrorResponse() {
        this(0, null, 0, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, int i13, String str, int i14, Map map, String str2, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = errorResponse.code;
        }
        if ((i15 & 2) != 0) {
            str = errorResponse.message;
        }
        if ((i15 & 4) != 0) {
            i14 = errorResponse.statusCode;
        }
        if ((i15 & 8) != 0) {
            map = errorResponse.exceptionFields;
        }
        if ((i15 & 16) != 0) {
            str2 = errorResponse.moreInfo;
        }
        if ((i15 & 32) != 0) {
            list = errorResponse.details;
        }
        String str3 = str2;
        List list2 = list;
        return errorResponse.copy(i13, str, i14, map, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Map<String, String> component4() {
        return this.exceptionFields;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMoreInfo() {
        return this.moreInfo;
    }

    public final List<ErrorDetail> component6() {
        return this.details;
    }

    public final ErrorResponse copy(int code, String message, int statusCode, Map<String, String> exceptionFields, String moreInfo, List<ErrorDetail> details) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        AbstractC22676k.m65750j(details, "details");
        return new ErrorResponse(code, message, statusCode, exceptionFields, moreInfo, details);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return this.code == errorResponse.code && AbstractC22676k.m65745e(this.message, errorResponse.message) && this.statusCode == errorResponse.statusCode && AbstractC22676k.m65745e(this.exceptionFields, errorResponse.exceptionFields) && AbstractC22676k.m65745e(this.moreInfo, errorResponse.moreInfo) && AbstractC22676k.m65745e(this.details, errorResponse.details);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ErrorDetail> getDetails() {
        return this.details;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, String> getExceptionFields() {
        return this.exceptionFields;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMoreInfo() {
        return this.moreInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final int hashCode() {
        return this.details.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.exceptionFields, AbstractC11266d.m30448b(this.statusCode, AbstractC11266d.m30450d(Integer.hashCode(this.code) * 31, 31, this.message), 31), 31), 31, this.moreInfo);
    }

    public final void setDuration(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.duration = str;
    }

    public final void setMessage(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.message = str;
    }

    public final void setMoreInfo(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.moreInfo = str;
    }

    public final void setStatusCode(int i13) {
        this.statusCode = i13;
    }

    public final String toString() {
        int i13 = this.code;
        String str = this.message;
        int i14 = this.statusCode;
        Map<String, String> map = this.exceptionFields;
        String str2 = this.moreInfo;
        List<ErrorDetail> list = this.details;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ErrorResponse(code=", ", message=", str, ", statusCode=");
        sbM53373n.append(i14);
        sbM53373n.append(", exceptionFields=");
        sbM53373n.append(map);
        sbM53373n.append(", moreInfo=");
        return AbstractC30007c.m91840j(str2, ", details=", ")", sbM53373n, list);
    }

    public ErrorResponse(int i13, String message, int i14, Map<String, String> exceptionFields, String moreInfo, List<ErrorDetail> details) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        AbstractC22676k.m65750j(details, "details");
        this.code = i13;
        this.message = message;
        this.statusCode = i14;
        this.exceptionFields = exceptionFields;
        this.moreInfo = moreInfo;
        this.details = details;
        this.duration = "";
    }

    public /* synthetic */ ErrorResponse(int i13, String str, int i14, Map map, String str2, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? -1 : i14, (i15 & 8) != 0 ? C25272z.f99163w : map, (i15 & 16) != 0 ? "" : str2, (i15 & 32) != 0 ? C25271y.f99162w : list);
    }
}
