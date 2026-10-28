package live.hms.video.signal.jsonrpc.models;

import com.google.gson.annotations.SerializedName;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/JsonRpcError;", "", "code", "", "message", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class JsonRpcError {

    @SerializedName("code")
    private final int code;

    @SerializedName("message")
    private final String message;

    public JsonRpcError(int i13, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.code = i13;
        this.message = message;
    }

    public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = jsonRpcError.code;
        }
        if ((i14 & 2) != 0) {
            str = jsonRpcError.message;
        }
        return jsonRpcError.copy(i13, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final JsonRpcError copy(int code, String message) {
        AbstractC22676k.m65750j(message, "message");
        return new JsonRpcError(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcError)) {
            return false;
        }
        JsonRpcError jsonRpcError = (JsonRpcError) other;
        return this.code == jsonRpcError.code && AbstractC22676k.m65745e(this.message, jsonRpcError.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("JsonRpcError(code=");
        sb4.append(this.code);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.message, ')');
    }
}
