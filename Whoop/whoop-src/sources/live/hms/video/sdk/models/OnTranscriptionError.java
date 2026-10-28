package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/sdk/models/OnTranscriptionError;", "", "code", "", "message", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Llive/hms/video/sdk/models/OnTranscriptionError;", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class OnTranscriptionError {

    @SerializedName("code")
    private final Integer code;

    @SerializedName("message")
    private final String message;

    public OnTranscriptionError(Integer num, String str) {
        this.code = num;
        this.message = str;
    }

    public static /* synthetic */ OnTranscriptionError copy$default(OnTranscriptionError onTranscriptionError, Integer num, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = onTranscriptionError.code;
        }
        if ((i13 & 2) != 0) {
            str = onTranscriptionError.message;
        }
        return onTranscriptionError.copy(num, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final OnTranscriptionError copy(Integer code, String message) {
        return new OnTranscriptionError(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnTranscriptionError)) {
            return false;
        }
        OnTranscriptionError onTranscriptionError = (OnTranscriptionError) other;
        return AbstractC22676k.m65745e(this.code, onTranscriptionError.code) && AbstractC22676k.m65745e(this.message, onTranscriptionError.message);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("OnTranscriptionError(code=");
        sb4.append(this.code);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.message, ')');
    }
}
