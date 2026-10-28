package com.whoop.design.models.items.graph.plot;

import com.whoop.design.models.items.graph.plot.bar.BarGroupModel;
import com.whoop.design.models.items.graph.plot.bar.BarGroupModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import na1.C26511a;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJB\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BarPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;", "barGroups", "", "id", "", "hideWhileScrubbing", "skipScrubbing", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/BarPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/BarPlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBarGroups", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarPlotModel extends GraphPlot {
    private final List<BarGroupModel> barGroups;
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final Boolean skipScrubbing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26511a(2)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/BarPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/BarPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BarPlotModel() {
        this((List) null, (String) null, (Boolean) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BarGroupModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarPlotModel copy$default(BarPlotModel barPlotModel, List list, String str, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = barPlotModel.barGroups;
        }
        if ((i13 & 2) != 0) {
            str = barPlotModel.id;
        }
        if ((i13 & 4) != 0) {
            bool = barPlotModel.hideWhileScrubbing;
        }
        if ((i13 & 8) != 0) {
            bool2 = barPlotModel.skipScrubbing;
        }
        return barPlotModel.copy(list, str, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.barGroups, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.barGroups);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.id, "bar")) {
            output.encodeStringElement(serialDesc, 1, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.getHideWhileScrubbing(), Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.getSkipScrubbing() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
    }

    public final List<BarGroupModel> component1() {
        return this.barGroups;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final BarPlotModel copy(List<BarGroupModel> barGroups, String id4, Boolean hideWhileScrubbing, Boolean skipScrubbing) {
        AbstractC22676k.m65750j(barGroups, "barGroups");
        AbstractC22676k.m65750j(id4, "id");
        return new BarPlotModel(barGroups, id4, hideWhileScrubbing, skipScrubbing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarPlotModel)) {
            return false;
        }
        BarPlotModel barPlotModel = (BarPlotModel) other;
        return AbstractC22676k.m65745e(this.barGroups, barPlotModel.barGroups) && AbstractC22676k.m65745e(this.id, barPlotModel.id) && AbstractC22676k.m65745e(this.hideWhileScrubbing, barPlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, barPlotModel.skipScrubbing);
    }

    public final List<BarGroupModel> getBarGroups() {
        return this.barGroups;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.barGroups.hashCode() * 31, 31, this.id);
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        List<BarGroupModel> list = this.barGroups;
        String str = this.id;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("BarPlotModel(barGroups=", ", id=", str, ", hideWhileScrubbing=", list);
        sbM79507k.append(bool);
        sbM79507k.append(", skipScrubbing=");
        sbM79507k.append(bool2);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    public /* synthetic */ BarPlotModel(int i13, List list, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.barGroups = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.id = "bar";
        } else {
            this.id = str;
        }
        if ((i13 & 4) == 0) {
            this.hideWhileScrubbing = Boolean.FALSE;
        } else {
            this.hideWhileScrubbing = bool;
        }
        if ((i13 & 8) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarPlotModel(List<BarGroupModel> barGroups, String id4, Boolean bool, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(barGroups, "barGroups");
        AbstractC22676k.m65750j(id4, "id");
        this.barGroups = barGroups;
        this.id = id4;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
    }

    public /* synthetic */ BarPlotModel(List list, String str, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? "bar" : str, (i13 & 4) != 0 ? Boolean.FALSE : bool, (i13 & 8) != 0 ? null : bool2);
    }
}
