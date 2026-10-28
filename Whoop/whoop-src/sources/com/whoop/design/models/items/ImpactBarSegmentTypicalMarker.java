package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001a¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "Lcom/whoop/design/models/DesignSystemModel;", "", "markerPosition", "Lcom/whoop/design/util/TextResource;", "markerLabelDisplay", "markerSublabelDisplay", "<init>", "(DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "copy", "(DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getMarkerPosition", "Lcom/whoop/design/util/TextResource;", "getMarkerLabelDisplay", "getMarkerSublabelDisplay", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactBarSegmentTypicalMarker implements DesignSystemModel {
    private final TextResource markerLabelDisplay;
    private final double markerPosition;
    private final TextResource markerSublabelDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactBarSegmentTypicalMarker$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ImpactBarSegmentTypicalMarker(double d3, TextResource textResource, TextResource textResource2) {
        this.markerPosition = d3;
        this.markerLabelDisplay = textResource;
        this.markerSublabelDisplay = textResource2;
    }

    public static /* synthetic */ ImpactBarSegmentTypicalMarker copy$default(ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker, double d3, TextResource textResource, TextResource textResource2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = impactBarSegmentTypicalMarker.markerPosition;
        }
        if ((i13 & 2) != 0) {
            textResource = impactBarSegmentTypicalMarker.markerLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource2 = impactBarSegmentTypicalMarker.markerSublabelDisplay;
        }
        return impactBarSegmentTypicalMarker.copy(d3, textResource, textResource2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactBarSegmentTypicalMarker self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.markerPosition);
        C25452a c25452a = C25452a.f99689a;
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.markerLabelDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, c25452a, self.markerSublabelDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getMarkerPosition() {
        return this.markerPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getMarkerLabelDisplay() {
        return this.markerLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getMarkerSublabelDisplay() {
        return this.markerSublabelDisplay;
    }

    public final ImpactBarSegmentTypicalMarker copy(double markerPosition, TextResource markerLabelDisplay, TextResource markerSublabelDisplay) {
        return new ImpactBarSegmentTypicalMarker(markerPosition, markerLabelDisplay, markerSublabelDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactBarSegmentTypicalMarker)) {
            return false;
        }
        ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker = (ImpactBarSegmentTypicalMarker) other;
        return Double.compare(this.markerPosition, impactBarSegmentTypicalMarker.markerPosition) == 0 && AbstractC22676k.m65745e(this.markerLabelDisplay, impactBarSegmentTypicalMarker.markerLabelDisplay) && AbstractC22676k.m65745e(this.markerSublabelDisplay, impactBarSegmentTypicalMarker.markerSublabelDisplay);
    }

    public final TextResource getMarkerLabelDisplay() {
        return this.markerLabelDisplay;
    }

    public final double getMarkerPosition() {
        return this.markerPosition;
    }

    public final TextResource getMarkerSublabelDisplay() {
        return this.markerSublabelDisplay;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.markerPosition) * 31;
        TextResource textResource = this.markerLabelDisplay;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.markerSublabelDisplay;
        return iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0);
    }

    public String toString() {
        return "ImpactBarSegmentTypicalMarker(markerPosition=" + this.markerPosition + ", markerLabelDisplay=" + this.markerLabelDisplay + ", markerSublabelDisplay=" + this.markerSublabelDisplay + ")";
    }

    public /* synthetic */ ImpactBarSegmentTypicalMarker(int i13, double d3, TextResource textResource, TextResource textResource2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ImpactBarSegmentTypicalMarker$$serializer.INSTANCE.getDescriptor());
        }
        this.markerPosition = d3;
        this.markerLabelDisplay = textResource;
        this.markerSublabelDisplay = textResource2;
    }
}
