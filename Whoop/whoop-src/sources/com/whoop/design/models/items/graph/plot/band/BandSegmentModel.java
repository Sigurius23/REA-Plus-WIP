package com.whoop.design.models.items.graph.plot.band;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nx1.C27219a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;", "", "", "Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;", "points", "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "style", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPoints", "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BandSegmentModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<BandDataPointModel> points;
    private final BandPlotStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BandSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C27219a(19)), AbstractC30060g.m92087G(enumC23463i, new C27219a(20))};
    }

    public /* synthetic */ BandSegmentModel(int i13, List list, BandPlotStyle bandPlotStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, BandSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.points = C25271y.f99162w;
        } else {
            this.points = list;
        }
        this.style = bandPlotStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BandDataPointModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.band.BandPlotStyle", BandPlotStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BandSegmentModel copy$default(BandSegmentModel bandSegmentModel, List list, BandPlotStyle bandPlotStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = bandSegmentModel.points;
        }
        if ((i13 & 2) != 0) {
            bandPlotStyle = bandSegmentModel.style;
        }
        return bandSegmentModel.copy(list, bandPlotStyle);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BandSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.points, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.points);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
    }

    public final List<BandDataPointModel> component1() {
        return this.points;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BandPlotStyle getStyle() {
        return this.style;
    }

    public final BandSegmentModel copy(List<BandDataPointModel> points, BandPlotStyle style) {
        AbstractC22676k.m65750j(points, "points");
        return new BandSegmentModel(points, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BandSegmentModel)) {
            return false;
        }
        BandSegmentModel bandSegmentModel = (BandSegmentModel) other;
        return AbstractC22676k.m65745e(this.points, bandSegmentModel.points) && this.style == bandSegmentModel.style;
    }

    public final List<BandDataPointModel> getPoints() {
        return this.points;
    }

    public final BandPlotStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        BandPlotStyle bandPlotStyle = this.style;
        return iHashCode + (bandPlotStyle == null ? 0 : bandPlotStyle.hashCode());
    }

    public String toString() {
        return "BandSegmentModel(points=" + this.points + ", style=" + this.style + ")";
    }

    public BandSegmentModel(List<BandDataPointModel> points, BandPlotStyle bandPlotStyle) {
        AbstractC22676k.m65750j(points, "points");
        this.points = points;
        this.style = bandPlotStyle;
    }

    public /* synthetic */ BandSegmentModel(List list, BandPlotStyle bandPlotStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, bandPlotStyle);
    }
}
