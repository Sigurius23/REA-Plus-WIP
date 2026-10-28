package live.hms.video.media.settings;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;", "", "resolution", "Llive/hms/video/media/settings/HMSVideoResolution;", "layer", "Llive/hms/video/media/settings/HMSLayer;", "<init>", "(Llive/hms/video/media/settings/HMSVideoResolution;Llive/hms/video/media/settings/HMSLayer;)V", "getResolution", "()Llive/hms/video/media/settings/HMSVideoResolution;", "getLayer", "()Llive/hms/video/media/settings/HMSLayer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSSimulcastLayerDefinition {
    private final HMSLayer layer;
    private final HMSVideoResolution resolution;

    public HMSSimulcastLayerDefinition(HMSVideoResolution resolution, HMSLayer layer) {
        AbstractC22676k.m65750j(resolution, "resolution");
        AbstractC22676k.m65750j(layer, "layer");
        this.resolution = resolution;
        this.layer = layer;
    }

    public static /* synthetic */ HMSSimulcastLayerDefinition copy$default(HMSSimulcastLayerDefinition hMSSimulcastLayerDefinition, HMSVideoResolution hMSVideoResolution, HMSLayer hMSLayer, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSVideoResolution = hMSSimulcastLayerDefinition.resolution;
        }
        if ((i13 & 2) != 0) {
            hMSLayer = hMSSimulcastLayerDefinition.layer;
        }
        return hMSSimulcastLayerDefinition.copy(hMSVideoResolution, hMSLayer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSLayer getLayer() {
        return this.layer;
    }

    public final HMSSimulcastLayerDefinition copy(HMSVideoResolution resolution, HMSLayer layer) {
        AbstractC22676k.m65750j(resolution, "resolution");
        AbstractC22676k.m65750j(layer, "layer");
        return new HMSSimulcastLayerDefinition(resolution, layer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSSimulcastLayerDefinition)) {
            return false;
        }
        HMSSimulcastLayerDefinition hMSSimulcastLayerDefinition = (HMSSimulcastLayerDefinition) other;
        return AbstractC22676k.m65745e(this.resolution, hMSSimulcastLayerDefinition.resolution) && this.layer == hMSSimulcastLayerDefinition.layer;
    }

    public final HMSLayer getLayer() {
        return this.layer;
    }

    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return this.layer.hashCode() + (this.resolution.hashCode() * 31);
    }

    public String toString() {
        return "HMSSimulcastLayerDefinition(resolution=" + this.resolution + ", layer=" + this.layer + ')';
    }
}
