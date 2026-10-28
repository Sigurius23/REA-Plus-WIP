package live.hms.video.media.streams.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/media/streams/models/PreferStateResponseError;", "Llive/hms/video/media/streams/models/HMSDataChannelResponse;", "code", "", "message", "", "data", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getData", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/media/streams/models/PreferStateResponseError;", "equals", "", "other", "", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PreferStateResponseError implements HMSDataChannelResponse {

    @SerializedName("code")
    private final Integer code;

    @SerializedName("data")
    private final String data;

    @SerializedName("message")
    private final String message;

    public PreferStateResponseError(Integer num, String str, String str2) {
        this.code = num;
        this.message = str;
        this.data = str2;
    }

    public static /* synthetic */ PreferStateResponseError copy$default(PreferStateResponseError preferStateResponseError, Integer num, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = preferStateResponseError.code;
        }
        if ((i13 & 2) != 0) {
            str = preferStateResponseError.message;
        }
        if ((i13 & 4) != 0) {
            str2 = preferStateResponseError.data;
        }
        return preferStateResponseError.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final PreferStateResponseError copy(Integer code, String message, String data) {
        return new PreferStateResponseError(code, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferStateResponseError)) {
            return false;
        }
        PreferStateResponseError preferStateResponseError = (PreferStateResponseError) other;
        return AbstractC22676k.m65745e(this.code, preferStateResponseError.code) && AbstractC22676k.m65745e(this.message, preferStateResponseError.message) && AbstractC22676k.m65745e(this.data, preferStateResponseError.data);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("PreferStateResponseError(code=");
        sb4.append(this.code);
        sb4.append(", message=");
        sb4.append(this.message);
        sb4.append(", data=");
        return AbstractC25012a.m73377j(sb4, this.data, ')');
    }
}
