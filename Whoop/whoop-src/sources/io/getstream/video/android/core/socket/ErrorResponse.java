package io.getstream.video.android.core.socket;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rBs\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J^\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J(\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)HÁ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010/\u0012\u0004\b8\u00109\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00107R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010=R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\u001bR(\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00101\u0012\u0004\bB\u00109\u001a\u0004\b@\u0010\u0016\"\u0004\bA\u00104R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\bC\u0010\u0016\"\u0004\bD\u00104¨\u0006H"}, m65681d2 = {"Lio/getstream/video/android/core/socket/ErrorResponse;", "", "", "code", "", "message", "statusCode", "", "details", "", "exceptionFields", "moreInfo", "<init>", "(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "seen1", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Map;", "component6", "copy", "(ILjava/lang/String;ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/video/android/core/socket/ErrorResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stream_video_android_core_release", "(Lio/getstream/video/android/core/socket/ErrorResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getCode", "Ljava/lang/String;", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getStatusCode", "setStatusCode", "(I)V", "getStatusCode$annotations", "()V", "Ljava/util/List;", "getDetails", "setDetails", "(Ljava/util/List;)V", "Ljava/util/Map;", "getExceptionFields", "getMoreInfo", "setMoreInfo", "getMoreInfo$annotations", "getDuration", "setDuration", "Companion", "$serializer", "io/getstream/video/android/core/socket/a", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ErrorResponse extends Throwable {
    private static final InterfaceC37138c[] $childSerializers;
    public static final C19967a Companion = new C19967a();
    private final int code;
    private List<String> details;
    private String duration;
    private final Map<String, String> exceptionFields;
    private String message;
    private String moreInfo;
    private int statusCode;

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new InterfaceC37138c[]{null, null, null, new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null};
    }

    public ErrorResponse() {
        this(0, null, 0, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, int i13, String str, int i14, List list, Map map, String str2, int i15, Object obj) {
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
            list = errorResponse.details;
        }
        if ((i15 & 16) != 0) {
            map = errorResponse.exceptionFields;
        }
        if ((i15 & 32) != 0) {
            str2 = errorResponse.moreInfo;
        }
        Map map2 = map;
        String str3 = str2;
        return errorResponse.copy(i13, str, i14, list, map2, str3);
    }

    @InterfaceC37143h("more_info")
    public static /* synthetic */ void getMoreInfo$annotations() {
    }

    @InterfaceC37143h("StatusCode")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public static final /* synthetic */ void write$Self$stream_video_android_core_release(ErrorResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.code != -1) {
            output.encodeIntElement(serialDesc, 0, self.code);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.getMessage(), "")) {
            output.encodeStringElement(serialDesc, 1, self.getMessage());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.statusCode != -1) {
            output.encodeIntElement(serialDesc, 2, self.statusCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.details, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.details);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.exceptionFields, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.exceptionFields);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.moreInfo, "")) {
            output.encodeStringElement(serialDesc, 5, self.moreInfo);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.duration, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 6, self.duration);
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

    public final List<String> component4() {
        return this.details;
    }

    public final Map<String, String> component5() {
        return this.exceptionFields;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMoreInfo() {
        return this.moreInfo;
    }

    public final ErrorResponse copy(int code, String message, int statusCode, List<String> details, Map<String, String> exceptionFields, String moreInfo) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(details, "details");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        return new ErrorResponse(code, message, statusCode, details, exceptionFields, moreInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return this.code == errorResponse.code && AbstractC22676k.m65745e(this.message, errorResponse.message) && this.statusCode == errorResponse.statusCode && AbstractC22676k.m65745e(this.details, errorResponse.details) && AbstractC22676k.m65745e(this.exceptionFields, errorResponse.exceptionFields) && AbstractC22676k.m65745e(this.moreInfo, errorResponse.moreInfo);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<String> getDetails() {
        return this.details;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final Map<String, String> getExceptionFields() {
        return this.exceptionFields;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getMoreInfo() {
        return this.moreInfo;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.moreInfo.hashCode() + AbstractC3855a.m11821e(this.exceptionFields, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.statusCode, AbstractC11266d.m30450d(Integer.hashCode(this.code) * 31, 31, this.message), 31), 31, this.details), 31);
    }

    public final void setDetails(List<String> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.details = list;
    }

    public final void setDuration(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.duration = str;
    }

    public void setMessage(String str) {
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

    @Override // java.lang.Throwable
    public String toString() {
        int i13 = this.code;
        String str = this.message;
        int i14 = this.statusCode;
        List<String> list = this.details;
        Map<String, String> map = this.exceptionFields;
        String str2 = this.moreInfo;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ErrorResponse(code=", ", message=", str, ", statusCode=");
        sbM53373n.append(i14);
        sbM53373n.append(", details=");
        sbM53373n.append(list);
        sbM53373n.append(", exceptionFields=");
        sbM53373n.append(map);
        sbM53373n.append(", moreInfo=");
        sbM53373n.append(str2);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    @InterfaceC23457c
    public /* synthetic */ ErrorResponse(int i13, int i14, String str, @InterfaceC37143h("StatusCode") int i15, List list, Map map, @InterfaceC37143h("more_info") String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.code = -1;
        } else {
            this.code = i14;
        }
        if ((i13 & 2) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i13 & 4) == 0) {
            this.statusCode = -1;
        } else {
            this.statusCode = i15;
        }
        if ((i13 & 8) == 0) {
            this.details = C25271y.f99162w;
        } else {
            this.details = list;
        }
        if ((i13 & 16) == 0) {
            this.exceptionFields = C25272z.f99163w;
        } else {
            this.exceptionFields = map;
        }
        if ((i13 & 32) == 0) {
            this.moreInfo = "";
        } else {
            this.moreInfo = str2;
        }
        if ((i13 & 64) == 0) {
            this.duration = "";
        } else {
            this.duration = str3;
        }
    }

    public /* synthetic */ ErrorResponse(int i13, String str, int i14, List list, Map map, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? -1 : i13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? -1 : i14, (i15 & 8) != 0 ? C25271y.f99162w : list, (i15 & 16) != 0 ? C25272z.f99163w : map, (i15 & 32) != 0 ? "" : str2);
    }

    public ErrorResponse(int i13, String message, int i14, List<String> details, Map<String, String> exceptionFields, String moreInfo) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(details, "details");
        AbstractC22676k.m65750j(exceptionFields, "exceptionFields");
        AbstractC22676k.m65750j(moreInfo, "moreInfo");
        this.code = i13;
        this.message = message;
        this.statusCode = i14;
        this.details = details;
        this.exceptionFields = exceptionFields;
        this.moreInfo = moreInfo;
        this.duration = "";
    }
}
