package live.hms.video.connection.subscribe.queuemanagement;

import com.google.gson.annotations.SerializedName;
import live.hms.video.media.streams.models.HMSDataChannelRequestParams;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.IdHelper;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/connection/subscribe/queuemanagement/RpcRequestWrapper;", "", "method", "", "params", "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "id", "jsonRpc", "<init>", "(Ljava/lang/String;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "getId", "getJsonRpc", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class RpcRequestWrapper {

    @SerializedName("id")
    private final String id;

    @SerializedName("jsonrpc")
    private final String jsonRpc;

    @SerializedName("method")
    private final String method;

    @SerializedName("params")
    private final HMSDataChannelRequestParams params;

    public RpcRequestWrapper(String method, HMSDataChannelRequestParams params, String id4, String jsonRpc) {
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(jsonRpc, "jsonRpc");
        this.method = method;
        this.params = params;
        this.id = id4;
        this.jsonRpc = jsonRpc;
    }

    public static /* synthetic */ RpcRequestWrapper copy$default(RpcRequestWrapper rpcRequestWrapper, String str, HMSDataChannelRequestParams hMSDataChannelRequestParams, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rpcRequestWrapper.method;
        }
        if ((i13 & 2) != 0) {
            hMSDataChannelRequestParams = rpcRequestWrapper.params;
        }
        if ((i13 & 4) != 0) {
            str2 = rpcRequestWrapper.id;
        }
        if ((i13 & 8) != 0) {
            str3 = rpcRequestWrapper.jsonRpc;
        }
        return rpcRequestWrapper.copy(str, hMSDataChannelRequestParams, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSDataChannelRequestParams getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJsonRpc() {
        return this.jsonRpc;
    }

    public final RpcRequestWrapper copy(String method, HMSDataChannelRequestParams params, String id4, String jsonRpc) {
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(params, "params");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(jsonRpc, "jsonRpc");
        return new RpcRequestWrapper(method, params, id4, jsonRpc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RpcRequestWrapper)) {
            return false;
        }
        RpcRequestWrapper rpcRequestWrapper = (RpcRequestWrapper) other;
        return AbstractC22676k.m65745e(this.method, rpcRequestWrapper.method) && AbstractC22676k.m65745e(this.params, rpcRequestWrapper.params) && AbstractC22676k.m65745e(this.id, rpcRequestWrapper.id) && AbstractC22676k.m65745e(this.jsonRpc, rpcRequestWrapper.jsonRpc);
    }

    public final String getId() {
        return this.id;
    }

    public final String getJsonRpc() {
        return this.jsonRpc;
    }

    public final String getMethod() {
        return this.method;
    }

    public final HMSDataChannelRequestParams getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.jsonRpc.hashCode() + AbstractC11266d.m30450d((this.params.hashCode() + (this.method.hashCode() * 31)) * 31, 31, this.id);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("RpcRequestWrapper(method=");
        sb4.append(this.method);
        sb4.append(", params=");
        sb4.append(this.params);
        sb4.append(", id=");
        sb4.append(this.id);
        sb4.append(", jsonRpc=");
        return AbstractC25012a.m73377j(sb4, this.jsonRpc, ')');
    }

    public /* synthetic */ RpcRequestWrapper(String str, HMSDataChannelRequestParams hMSDataChannelRequestParams, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hMSDataChannelRequestParams, (i13 & 4) != 0 ? IdHelper.INSTANCE.makeCallSignalId() : str2, (i13 & 8) != 0 ? HMSConstantsKt.cJsonRpcVersion : str3);
    }
}
