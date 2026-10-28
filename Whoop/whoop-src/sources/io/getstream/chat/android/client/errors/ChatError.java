package io.getstream.chat.android.client.errors;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/errors/ChatError;", "", "code", "", "message", "", "statusCode", "exceptionFields", "", "moreInfo", "details", "", "Lio/getstream/chat/android/client/errors/ChatErrorDetail;", AttachmentExtensionsKt.EXTRA_DURATION, "<init>", "(ILjava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "setStatusCode", "(I)V", "getExceptionFields", "()Ljava/util/Map;", "getMoreInfo", "setMoreInfo", "getDetails", "()Ljava/util/List;", "getDuration", "setDuration", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChatError {
    private final int code;
    private final List<ChatErrorDetail> details;
    private String duration;
    private final Map<String, String> exceptionFields;
    private String message;
    private String moreInfo;
    private int statusCode;

    public ChatError() {
        this(0, null, 0, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatError copy$default(ChatError chatError, int i13, String str, int i14, Map map, String str2, List list, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = chatError.code;
        }
        if ((i15 & 2) != 0) {
            str = chatError.message;
        }
        if ((i15 & 4) != 0) {
            i14 = chatError.statusCode;
        }
        if ((i15 & 8) != 0) {
            map = chatError.exceptionFields;
        }
        if ((i15 & 16) != 0) {
            str2 = chatError.moreInfo;
        }
        if ((i15 & 32) != 0) {
            list = chatError.details;
        }
        if ((i15 & 64) != 0) {
            str3 = chatError.duration;
        }
        List list2 = list;
        String str4 = str3;
        String str5 = str2;
        int i16 = i14;
        return chatError.copy(i13, str, i16, map, str5, list2, str4);
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

    public final List<ChatErrorDetail> component6() {
        return this.details;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final ChatError copy(int code, String message, int statusCode, Map<String, String> exceptionFields, String moreInfo, List<ChatErrorDetail> details, String duration) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        AbstractC22676k.m65750j(details, "details");
        AbstractC22676k.m65750j(duration, "duration");
        return new ChatError(code, message, statusCode, exceptionFields, moreInfo, details, duration);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatError)) {
            return false;
        }
        ChatError chatError = (ChatError) other;
        return this.code == chatError.code && AbstractC22676k.m65745e(this.message, chatError.message) && this.statusCode == chatError.statusCode && AbstractC22676k.m65745e(this.exceptionFields, chatError.exceptionFields) && AbstractC22676k.m65745e(this.moreInfo, chatError.moreInfo) && AbstractC22676k.m65745e(this.details, chatError.details) && AbstractC22676k.m65745e(this.duration, chatError.duration);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ChatErrorDetail> getDetails() {
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
        return this.duration.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.exceptionFields, AbstractC11266d.m30448b(this.statusCode, AbstractC11266d.m30450d(Integer.hashCode(this.code) * 31, 31, this.message), 31), 31), 31, this.moreInfo), 31, this.details);
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
        List<ChatErrorDetail> list = this.details;
        String str3 = this.duration;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ChatError(code=", ", message=", str, ", statusCode=");
        sbM53373n.append(i14);
        sbM53373n.append(", exceptionFields=");
        sbM53373n.append(map);
        sbM53373n.append(", moreInfo=");
        AbstractC36095b.m114694v(str2, ", details=", ", duration=", sbM53373n, list);
        return AbstractC25012a.m73376i(str3, ")", sbM53373n);
    }

    public ChatError(int i13, String message, int i14, Map<String, String> exceptionFields, String moreInfo, List<ChatErrorDetail> details, String duration) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        AbstractC22676k.m65750j(details, "details");
        AbstractC22676k.m65750j(duration, "duration");
        this.code = i13;
        this.message = message;
        this.statusCode = i14;
        this.exceptionFields = exceptionFields;
        this.moreInfo = moreInfo;
        this.details = details;
        this.duration = duration;
    }

    public /* synthetic */ ChatError(int i13, String str, int i14, Map map, String str2, List list, String str3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? -1 : i14, (i15 & 8) != 0 ? C25272z.f99163w : map, (i15 & 16) != 0 ? "" : str2, (i15 & 32) != 0 ? C25271y.f99162w : list, (i15 & 64) != 0 ? "" : str3);
    }
}
