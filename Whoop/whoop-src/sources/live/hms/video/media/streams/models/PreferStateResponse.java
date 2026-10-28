package live.hms.video.media.streams.models;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/media/streams/models/PreferStateResponse;", "Llive/hms/video/media/streams/models/HMSDataChannelResponse;", "info", "Llive/hms/video/media/streams/models/PreferLayerResponseInfo;", "<init>", "(Llive/hms/video/media/streams/models/PreferLayerResponseInfo;)V", "getInfo", "()Llive/hms/video/media/streams/models/PreferLayerResponseInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PreferStateResponse implements HMSDataChannelResponse {

    @SerializedName("result")
    private final PreferLayerResponseInfo info;

    public PreferStateResponse(PreferLayerResponseInfo info) {
        AbstractC22676k.m65750j(info, "info");
        this.info = info;
    }

    public static /* synthetic */ PreferStateResponse copy$default(PreferStateResponse preferStateResponse, PreferLayerResponseInfo preferLayerResponseInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            preferLayerResponseInfo = preferStateResponse.info;
        }
        return preferStateResponse.copy(preferLayerResponseInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferLayerResponseInfo getInfo() {
        return this.info;
    }

    public final PreferStateResponse copy(PreferLayerResponseInfo info) {
        AbstractC22676k.m65750j(info, "info");
        return new PreferStateResponse(info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreferStateResponse) && AbstractC22676k.m65745e(this.info, ((PreferStateResponse) other).info);
    }

    public final PreferLayerResponseInfo getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    public String toString() {
        return "PreferStateResponse(info=" + this.info + ')';
    }
}
