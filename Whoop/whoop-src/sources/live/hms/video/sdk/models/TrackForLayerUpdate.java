package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import live.hms.video.media.settings.HMSSimulcastLayer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006$"}, m65681d2 = {"Llive/hms/video/sdk/models/TrackForLayerUpdate;", "", "expectedLayer", "Llive/hms/video/sdk/models/Layer;", "currentLayer", "trackId", "", "subscriberDegraded", "", "publisherDegraded", "<init>", "(Llive/hms/video/sdk/models/Layer;Llive/hms/video/sdk/models/Layer;Ljava/lang/String;ZZ)V", "getExpectedLayer", "()Llive/hms/video/sdk/models/Layer;", "getCurrentLayer", "getTrackId", "()Ljava/lang/String;", "getSubscriberDegraded", "()Z", "getPublisherDegraded", "getExpectedSimulcastLayer", "Llive/hms/video/media/settings/HMSSimulcastLayer;", "getCurrentSimulcastLayer", "getSimulcastLayer", "layer", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class TrackForLayerUpdate {

    @SerializedName("current_layer")
    private final Layer currentLayer;

    @SerializedName("expected_layer")
    private final Layer expectedLayer;

    @SerializedName("publisher_degraded")
    private final boolean publisherDegraded;

    @SerializedName("subscriber_degraded")
    private final boolean subscriberDegraded;

    @SerializedName("track_id")
    private final String trackId;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layer.values().length];
            try {
                iArr[Layer.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layer.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layer.medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Layer.high.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TrackForLayerUpdate(Layer expectedLayer, Layer currentLayer, String trackId, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(expectedLayer, "expectedLayer");
        AbstractC22676k.m65750j(currentLayer, "currentLayer");
        AbstractC22676k.m65750j(trackId, "trackId");
        this.expectedLayer = expectedLayer;
        this.currentLayer = currentLayer;
        this.trackId = trackId;
        this.subscriberDegraded = z4;
        this.publisherDegraded = z13;
    }

    public static /* synthetic */ TrackForLayerUpdate copy$default(TrackForLayerUpdate trackForLayerUpdate, Layer layer, Layer layer2, String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            layer = trackForLayerUpdate.expectedLayer;
        }
        if ((i13 & 2) != 0) {
            layer2 = trackForLayerUpdate.currentLayer;
        }
        if ((i13 & 4) != 0) {
            str = trackForLayerUpdate.trackId;
        }
        if ((i13 & 8) != 0) {
            z4 = trackForLayerUpdate.subscriberDegraded;
        }
        if ((i13 & 16) != 0) {
            z13 = trackForLayerUpdate.publisherDegraded;
        }
        boolean z14 = z13;
        String str2 = str;
        return trackForLayerUpdate.copy(layer, layer2, str2, z4, z14);
    }

    private final HMSSimulcastLayer getSimulcastLayer(Layer layer) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[layer.ordinal()];
        if (i13 == 1) {
            return HMSSimulcastLayer.NONE;
        }
        if (i13 == 2) {
            return HMSSimulcastLayer.LOW;
        }
        if (i13 == 3) {
            return HMSSimulcastLayer.MEDIUM;
        }
        if (i13 == 4) {
            return HMSSimulcastLayer.HIGH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Layer getExpectedLayer() {
        return this.expectedLayer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Layer getCurrentLayer() {
        return this.currentLayer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSubscriberDegraded() {
        return this.subscriberDegraded;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPublisherDegraded() {
        return this.publisherDegraded;
    }

    public final TrackForLayerUpdate copy(Layer expectedLayer, Layer currentLayer, String trackId, boolean subscriberDegraded, boolean publisherDegraded) {
        AbstractC22676k.m65750j(expectedLayer, "expectedLayer");
        AbstractC22676k.m65750j(currentLayer, "currentLayer");
        AbstractC22676k.m65750j(trackId, "trackId");
        return new TrackForLayerUpdate(expectedLayer, currentLayer, trackId, subscriberDegraded, publisherDegraded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackForLayerUpdate)) {
            return false;
        }
        TrackForLayerUpdate trackForLayerUpdate = (TrackForLayerUpdate) other;
        return this.expectedLayer == trackForLayerUpdate.expectedLayer && this.currentLayer == trackForLayerUpdate.currentLayer && AbstractC22676k.m65745e(this.trackId, trackForLayerUpdate.trackId) && this.subscriberDegraded == trackForLayerUpdate.subscriberDegraded && this.publisherDegraded == trackForLayerUpdate.publisherDegraded;
    }

    public final Layer getCurrentLayer() {
        return this.currentLayer;
    }

    public final HMSSimulcastLayer getCurrentSimulcastLayer() {
        return getSimulcastLayer(this.currentLayer);
    }

    public final Layer getExpectedLayer() {
        return this.expectedLayer;
    }

    public final HMSSimulcastLayer getExpectedSimulcastLayer() {
        return getSimulcastLayer(this.expectedLayer);
    }

    public final boolean getPublisherDegraded() {
        return this.publisherDegraded;
    }

    public final boolean getSubscriberDegraded() {
        return this.subscriberDegraded;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.publisherDegraded) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.currentLayer.hashCode() + (this.expectedLayer.hashCode() * 31)) * 31, 31, this.trackId), 31, this.subscriberDegraded);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("TrackForLayerUpdate(expectedLayer=");
        sb4.append(this.expectedLayer);
        sb4.append(", currentLayer=");
        sb4.append(this.currentLayer);
        sb4.append(", trackId=");
        sb4.append(this.trackId);
        sb4.append(", subscriberDegraded=");
        sb4.append(this.subscriberDegraded);
        sb4.append(", publisherDegraded=");
        return AbstractC2875y.m8305r(sb4, this.publisherDegraded, ')');
    }

    public /* synthetic */ TrackForLayerUpdate(Layer layer, Layer layer2, String str, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(layer, layer2, str, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13);
    }
}
