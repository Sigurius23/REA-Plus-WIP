package live.hms.video.signal.jsonrpc.models;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/models/JsonRpcResponse;", "", "id", "", "result", "Lcom/google/gson/JsonElement;", "error", "Llive/hms/video/signal/jsonrpc/models/JsonRpcError;", "<init>", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Llive/hms/video/signal/jsonrpc/models/JsonRpcError;)V", "getId", "()Ljava/lang/String;", "getResult", "()Lcom/google/gson/JsonElement;", "getError", "()Llive/hms/video/signal/jsonrpc/models/JsonRpcError;", "version", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class JsonRpcResponse {

    @SerializedName("error")
    private final JsonRpcError error;

    @SerializedName("id")
    private final String id;

    @SerializedName("result")
    private final JsonElement result;

    @SerializedName("jsonrpc")
    private final String version;

    public JsonRpcResponse(String id4, JsonElement result, JsonRpcError error) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(error, "error");
        this.id = id4;
        this.result = result;
        this.error = error;
        this.version = HMSConstantsKt.cJsonRpcVersion;
    }

    public static /* synthetic */ JsonRpcResponse copy$default(JsonRpcResponse jsonRpcResponse, String str, JsonElement jsonElement, JsonRpcError jsonRpcError, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = jsonRpcResponse.id;
        }
        if ((i13 & 2) != 0) {
            jsonElement = jsonRpcResponse.result;
        }
        if ((i13 & 4) != 0) {
            jsonRpcError = jsonRpcResponse.error;
        }
        return jsonRpcResponse.copy(str, jsonElement, jsonRpcError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonRpcError getError() {
        return this.error;
    }

    public final JsonRpcResponse copy(String id4, JsonElement result, JsonRpcError error) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(error, "error");
        return new JsonRpcResponse(id4, result, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JsonRpcResponse)) {
            return false;
        }
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) other;
        return AbstractC22676k.m65745e(this.id, jsonRpcResponse.id) && AbstractC22676k.m65745e(this.result, jsonRpcResponse.result) && AbstractC22676k.m65745e(this.error, jsonRpcResponse.error);
    }

    public final JsonRpcError getError() {
        return this.error;
    }

    public final String getId() {
        return this.id;
    }

    public final JsonElement getResult() {
        return this.result;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.error.hashCode() + ((this.result.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "JsonRpcResponse(id=" + this.id + ", result=" + this.result + ", error=" + this.error + ')';
    }
}
