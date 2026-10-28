package com.whoop.design.models.items.graph.plot;

import com.whoop.design.models.items.graph.plot.band.BandPlotStyle;
import com.whoop.design.models.items.graph.plot.band.BandSegmentModel;
import com.whoop.design.models.items.graph.plot.band.BandSegmentModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import na1.C26511a;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#JL\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BandPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;", "segments", "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "style", "", "id", "", "hideWhileScrubbing", "skipScrubbing", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/BandPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/BandPlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSegments", "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;", "getStyle", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BandPlotModel extends GraphPlot {
    private static final InterfaceC23462h[] $childSerializers;
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final List<BandSegmentModel> segments;
    private final Boolean skipScrubbing;
    private final BandPlotStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BandPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/BandPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BandPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C26511a(0)), AbstractC30060g.m92087G(enumC23463i, new C26511a(1)), null, null, null};
    }

    public BandPlotModel() {
        this((List) null, (BandPlotStyle) null, (String) null, (Boolean) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BandSegmentModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.band.BandPlotStyle", BandPlotStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BandPlotModel copy$default(BandPlotModel bandPlotModel, List list, BandPlotStyle bandPlotStyle, String str, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = bandPlotModel.segments;
        }
        if ((i13 & 2) != 0) {
            bandPlotStyle = bandPlotModel.style;
        }
        if ((i13 & 4) != 0) {
            str = bandPlotModel.id;
        }
        if ((i13 & 8) != 0) {
            bool = bandPlotModel.hideWhileScrubbing;
        }
        if ((i13 & 16) != 0) {
            bool2 = bandPlotModel.skipScrubbing;
        }
        Boolean bool3 = bool2;
        String str2 = str;
        return bandPlotModel.copy(list, bandPlotStyle, str2, bool, bool3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BandPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.segments, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.segments);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.style != BandPlotStyle.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.id, "band")) {
            output.encodeStringElement(serialDesc, 2, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getHideWhileScrubbing() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getSkipScrubbing() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
    }

    public final List<BandSegmentModel> component1() {
        return this.segments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BandPlotStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final BandPlotModel copy(List<BandSegmentModel> segments, BandPlotStyle style, String id4, Boolean hideWhileScrubbing, Boolean skipScrubbing) {
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        return new BandPlotModel(segments, style, id4, hideWhileScrubbing, skipScrubbing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BandPlotModel)) {
            return false;
        }
        BandPlotModel bandPlotModel = (BandPlotModel) other;
        return AbstractC22676k.m65745e(this.segments, bandPlotModel.segments) && this.style == bandPlotModel.style && AbstractC22676k.m65745e(this.id, bandPlotModel.id) && AbstractC22676k.m65745e(this.hideWhileScrubbing, bandPlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, bandPlotModel.skipScrubbing);
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    public final List<BandSegmentModel> getSegments() {
        return this.segments;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final BandPlotStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.style.hashCode() + (this.segments.hashCode() * 31)) * 31, 31, this.id);
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        List<BandSegmentModel> list = this.segments;
        BandPlotStyle bandPlotStyle = this.style;
        String str = this.id;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        StringBuilder sb4 = new StringBuilder("BandPlotModel(segments=");
        sb4.append(list);
        sb4.append(", style=");
        sb4.append(bandPlotStyle);
        sb4.append(", id=");
        AbstractC36095b.m114692t(bool, str, ", hideWhileScrubbing=", ", skipScrubbing=", sb4);
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public /* synthetic */ BandPlotModel(int i13, List list, BandPlotStyle bandPlotStyle, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.segments = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.style = BandPlotStyle.UNKNOWN;
        } else {
            this.style = bandPlotStyle;
        }
        if ((i13 & 4) == 0) {
            this.id = "band";
        } else {
            this.id = str;
        }
        if ((i13 & 8) == 0) {
            this.hideWhileScrubbing = null;
        } else {
            this.hideWhileScrubbing = bool;
        }
        if ((i13 & 16) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BandPlotModel(List<BandSegmentModel> segments, BandPlotStyle style, String id4, Boolean bool, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(segments, "segments");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        this.segments = segments;
        this.style = style;
        this.id = id4;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
    }

    public /* synthetic */ BandPlotModel(List list, BandPlotStyle bandPlotStyle, String str, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? BandPlotStyle.UNKNOWN : bandPlotStyle, (i13 & 4) != 0 ? "band" : str, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? null : bool2);
    }
}
