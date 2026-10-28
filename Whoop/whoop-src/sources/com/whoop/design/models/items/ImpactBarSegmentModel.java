package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010!¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "horizontalPosition", "Lcom/whoop/design/util/TextResource;", "markerTextDisplay", "Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "segmentMarker", "Lcom/whoop/design/models/items/ImpactStyle;", "impactStyle", "<init>", "(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "component4", "()Lcom/whoop/design/models/items/ImpactStyle;", "copy", "(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getHorizontalPosition", "Lcom/whoop/design/util/TextResource;", "getMarkerTextDisplay", "Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;", "getSegmentMarker", "Lcom/whoop/design/models/items/ImpactStyle;", "getImpactStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactBarSegmentModel implements DesignSystemModel {
    private final Double horizontalPosition;
    private final ImpactStyle impactStyle;
    private final TextResource markerTextDisplay;
    private final ImpactBarSegmentTypicalMarker segmentMarker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(9))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImpactBarSegmentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactBarSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImpactBarSegmentModel(int i13, Double d3, TextResource textResource, ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker, ImpactStyle impactStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ImpactBarSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.horizontalPosition = d3;
        this.markerTextDisplay = textResource;
        this.segmentMarker = impactBarSegmentTypicalMarker;
        this.impactStyle = impactStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ ImpactBarSegmentModel copy$default(ImpactBarSegmentModel impactBarSegmentModel, Double d3, TextResource textResource, ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker, ImpactStyle impactStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = impactBarSegmentModel.horizontalPosition;
        }
        if ((i13 & 2) != 0) {
            textResource = impactBarSegmentModel.markerTextDisplay;
        }
        if ((i13 & 4) != 0) {
            impactBarSegmentTypicalMarker = impactBarSegmentModel.segmentMarker;
        }
        if ((i13 & 8) != 0) {
            impactStyle = impactBarSegmentModel.impactStyle;
        }
        return impactBarSegmentModel.copy(d3, textResource, impactBarSegmentTypicalMarker, impactStyle);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactBarSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.horizontalPosition);
        output.encodeNullableSerializableElement(serialDesc, 1, C25452a.f99689a, self.markerTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, ImpactBarSegmentTypicalMarker$$serializer.INSTANCE, self.segmentMarker);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.impactStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getHorizontalPosition() {
        return this.horizontalPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getMarkerTextDisplay() {
        return this.markerTextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImpactBarSegmentTypicalMarker getSegmentMarker() {
        return this.segmentMarker;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final ImpactBarSegmentModel copy(Double horizontalPosition, TextResource markerTextDisplay, ImpactBarSegmentTypicalMarker segmentMarker, ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        return new ImpactBarSegmentModel(horizontalPosition, markerTextDisplay, segmentMarker, impactStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactBarSegmentModel)) {
            return false;
        }
        ImpactBarSegmentModel impactBarSegmentModel = (ImpactBarSegmentModel) other;
        return AbstractC22676k.m65745e(this.horizontalPosition, impactBarSegmentModel.horizontalPosition) && AbstractC22676k.m65745e(this.markerTextDisplay, impactBarSegmentModel.markerTextDisplay) && AbstractC22676k.m65745e(this.segmentMarker, impactBarSegmentModel.segmentMarker) && this.impactStyle == impactBarSegmentModel.impactStyle;
    }

    public final Double getHorizontalPosition() {
        return this.horizontalPosition;
    }

    public final ImpactStyle getImpactStyle() {
        return this.impactStyle;
    }

    public final TextResource getMarkerTextDisplay() {
        return this.markerTextDisplay;
    }

    public final ImpactBarSegmentTypicalMarker getSegmentMarker() {
        return this.segmentMarker;
    }

    public int hashCode() {
        Double d3 = this.horizontalPosition;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        TextResource textResource = this.markerTextDisplay;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker = this.segmentMarker;
        return this.impactStyle.hashCode() + ((iHashCode2 + (impactBarSegmentTypicalMarker != null ? impactBarSegmentTypicalMarker.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ImpactBarSegmentModel(horizontalPosition=" + this.horizontalPosition + ", markerTextDisplay=" + this.markerTextDisplay + ", segmentMarker=" + this.segmentMarker + ", impactStyle=" + this.impactStyle + ")";
    }

    public ImpactBarSegmentModel(Double d3, TextResource textResource, ImpactBarSegmentTypicalMarker impactBarSegmentTypicalMarker, ImpactStyle impactStyle) {
        AbstractC22676k.m65750j(impactStyle, "impactStyle");
        this.horizontalPosition = d3;
        this.markerTextDisplay = textResource;
        this.segmentMarker = impactBarSegmentTypicalMarker;
        this.impactStyle = impactStyle;
    }
}
