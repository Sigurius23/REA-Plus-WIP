package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;", "", "code", "", "message", "", "StatusCode", AttachmentExtensionsKt.EXTRA_DURATION, "exception_fields", "", "more_info", "details", "", "Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getStatusCode", "getDuration", "getException_fields", "()Ljava/util/Map;", "getMore_info", "getDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ErrorDto {
    private final int StatusCode;
    private final int code;
    private final List<ErrorDetailDto> details;
    private final String duration;
    private final Map<String, String> exception_fields;
    private final String message;
    private final String more_info;

    public ErrorDto() {
        this(0, null, 0, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorDto copy$default(ErrorDto errorDto, int i13, String str, int i14, String str2, Map map, String str3, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = errorDto.code;
        }
        if ((i15 & 2) != 0) {
            str = errorDto.message;
        }
        if ((i15 & 4) != 0) {
            i14 = errorDto.StatusCode;
        }
        if ((i15 & 8) != 0) {
            str2 = errorDto.duration;
        }
        if ((i15 & 16) != 0) {
            map = errorDto.exception_fields;
        }
        if ((i15 & 32) != 0) {
            str3 = errorDto.more_info;
        }
        if ((i15 & 64) != 0) {
            list = errorDto.details;
        }
        String str4 = str3;
        List list2 = list;
        Map map2 = map;
        int i16 = i14;
        return errorDto.copy(i13, str, i16, str2, map2, str4, list2);
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
        return this.StatusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, String> component5() {
        return this.exception_fields;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMore_info() {
        return this.more_info;
    }

    public final List<ErrorDetailDto> component7() {
        return this.details;
    }

    public final ErrorDto copy(int code, String message, int StatusCode, String duration, Map<String, String> exception_fields, String more_info, List<ErrorDetailDto> details) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(exception_fields, "exception_fields");
        AbstractC22676k.m65750j(more_info, "more_info");
        AbstractC22676k.m65750j(details, "details");
        return new ErrorDto(code, message, StatusCode, duration, exception_fields, more_info, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDto)) {
            return false;
        }
        ErrorDto errorDto = (ErrorDto) other;
        return this.code == errorDto.code && AbstractC22676k.m65745e(this.message, errorDto.message) && this.StatusCode == errorDto.StatusCode && AbstractC22676k.m65745e(this.duration, errorDto.duration) && AbstractC22676k.m65745e(this.exception_fields, errorDto.exception_fields) && AbstractC22676k.m65745e(this.more_info, errorDto.more_info) && AbstractC22676k.m65745e(this.details, errorDto.details);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ErrorDetailDto> getDetails() {
        return this.details;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, String> getException_fields() {
        return this.exception_fields;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMore_info() {
        return this.more_info;
    }

    public final int getStatusCode() {
        return this.StatusCode;
    }

    public int hashCode() {
        return this.details.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11821e(this.exception_fields, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.StatusCode, AbstractC11266d.m30450d(Integer.hashCode(this.code) * 31, 31, this.message), 31), 31, this.duration), 31), 31, this.more_info);
    }

    public String toString() {
        int i13 = this.code;
        String str = this.message;
        int i14 = this.StatusCode;
        String str2 = this.duration;
        Map<String, String> map = this.exception_fields;
        String str3 = this.more_info;
        List<ErrorDetailDto> list = this.details;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ErrorDto(code=", ", message=", str, ", StatusCode=");
        AbstractC11895b.m31979B(i14, ", duration=", str2, ", exception_fields=", sbM53373n);
        sbM53373n.append(map);
        sbM53373n.append(", more_info=");
        sbM53373n.append(str3);
        sbM53373n.append(", details=");
        return AbstractC3855a.m11829m(sbM53373n, list, ")");
    }

    public ErrorDto(int i13, String message, int i14, String duration, Map<String, String> exception_fields, String more_info, List<ErrorDetailDto> details) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(exception_fields, "exception_fields");
        AbstractC22676k.m65750j(more_info, "more_info");
        AbstractC22676k.m65750j(details, "details");
        this.code = i13;
        this.message = message;
        this.StatusCode = i14;
        this.duration = duration;
        this.exception_fields = exception_fields;
        this.more_info = more_info;
        this.details = details;
    }

    public /* synthetic */ ErrorDto(int i13, String str, int i14, String str2, Map map, String str3, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? -1 : i14, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? C25272z.f99163w : map, (i15 & 32) != 0 ? "" : str3, (i15 & 64) != 0 ? C25271y.f99162w : list);
    }
}
