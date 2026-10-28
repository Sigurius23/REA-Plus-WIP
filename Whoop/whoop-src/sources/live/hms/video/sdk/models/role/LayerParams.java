package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/sdk/models/role/LayerParams;", "", "rid", "", "scaleResolutionDownBy", "", "maxBitrate", "", "maxFramerate", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRid", "()Ljava/lang/String;", "getScaleResolutionDownBy", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMaxBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxFramerate", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Llive/hms/video/sdk/models/role/LayerParams;", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class LayerParams {

    @SerializedName("maxBitrate")
    private final Integer maxBitrate;

    @SerializedName("maxFramerate")
    private final Integer maxFramerate;

    @SerializedName("rid")
    private final String rid;

    @SerializedName("scaleResolutionDownBy")
    private final Float scaleResolutionDownBy;

    public LayerParams(String str, Float f13, Integer num, Integer num2) {
        this.rid = str;
        this.scaleResolutionDownBy = f13;
        this.maxBitrate = num;
        this.maxFramerate = num2;
    }

    public static /* synthetic */ LayerParams copy$default(LayerParams layerParams, String str, Float f13, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = layerParams.rid;
        }
        if ((i13 & 2) != 0) {
            f13 = layerParams.scaleResolutionDownBy;
        }
        if ((i13 & 4) != 0) {
            num = layerParams.maxBitrate;
        }
        if ((i13 & 8) != 0) {
            num2 = layerParams.maxFramerate;
        }
        return layerParams.copy(str, f13, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRid() {
        return this.rid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getScaleResolutionDownBy() {
        return this.scaleResolutionDownBy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxFramerate() {
        return this.maxFramerate;
    }

    public final LayerParams copy(String rid, Float scaleResolutionDownBy, Integer maxBitrate, Integer maxFramerate) {
        return new LayerParams(rid, scaleResolutionDownBy, maxBitrate, maxFramerate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LayerParams)) {
            return false;
        }
        LayerParams layerParams = (LayerParams) other;
        return AbstractC22676k.m65745e(this.rid, layerParams.rid) && AbstractC22676k.m65745e(this.scaleResolutionDownBy, layerParams.scaleResolutionDownBy) && AbstractC22676k.m65745e(this.maxBitrate, layerParams.maxBitrate) && AbstractC22676k.m65745e(this.maxFramerate, layerParams.maxFramerate);
    }

    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    public final Integer getMaxFramerate() {
        return this.maxFramerate;
    }

    public final String getRid() {
        return this.rid;
    }

    public final Float getScaleResolutionDownBy() {
        return this.scaleResolutionDownBy;
    }

    public int hashCode() {
        String str = this.rid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f13 = this.scaleResolutionDownBy;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Integer num = this.maxBitrate;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxFramerate;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LayerParams(rid=" + this.rid + ", scaleResolutionDownBy=" + this.scaleResolutionDownBy + ", maxBitrate=" + this.maxBitrate + ", maxFramerate=" + this.maxFramerate + ')';
    }
}
