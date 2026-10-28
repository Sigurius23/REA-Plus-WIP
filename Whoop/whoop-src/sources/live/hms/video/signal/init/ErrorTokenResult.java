package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/signal/init/ErrorTokenResult;", "", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ErrorTokenResult {

    @SerializedName("message")
    private final String errorMessage;

    public ErrorTokenResult(String str) {
        this.errorMessage = str;
    }

    public static /* synthetic */ ErrorTokenResult copy$default(ErrorTokenResult errorTokenResult, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = errorTokenResult.errorMessage;
        }
        return errorTokenResult.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final ErrorTokenResult copy(String errorMessage) {
        return new ErrorTokenResult(errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorTokenResult) && AbstractC22676k.m65745e(this.errorMessage, ((ErrorTokenResult) other).errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("ErrorTokenResult(errorMessage="), this.errorMessage, ')');
    }
}
