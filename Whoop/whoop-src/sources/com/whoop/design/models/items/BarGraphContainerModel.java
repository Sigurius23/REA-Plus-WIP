package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/BarGraphContainerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "durationTitleDisplay", "durationDisplay", "typicalRangeTitleDisplay", "", "Lcom/whoop/design/models/items/HeartRateZone;", "heartRateZones", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "timeSpliceLayoutDirection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BarGraphContainerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/graph/LayoutDirection;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Lcom/whoop/design/models/items/BarGraphContainerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDurationTitleDisplay", "getDurationDisplay", "getTypicalRangeTitleDisplay", "Ljava/util/List;", "getHeartRateZones", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "getTimeSpliceLayoutDirection", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarGraphContainerModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String durationDisplay;
    private final String durationTitleDisplay;
    private final List<HeartRateZone> heartRateZones;
    private final LayoutDirection timeSpliceLayoutDirection;
    private final String typicalRangeTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BarGraphContainerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarGraphContainerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(6)), AbstractC30060g.m92087G(enumC23463i, new C36954a(7))};
    }

    public BarGraphContainerModel() {
        this((String) null, (String) null, (String) null, (List) null, (LayoutDirection) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HeartRateZone$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return LayoutDirection.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarGraphContainerModel copy$default(BarGraphContainerModel barGraphContainerModel, String str, String str2, String str3, List list, LayoutDirection layoutDirection, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = barGraphContainerModel.durationTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = barGraphContainerModel.durationDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = barGraphContainerModel.typicalRangeTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            list = barGraphContainerModel.heartRateZones;
        }
        if ((i13 & 16) != 0) {
            layoutDirection = barGraphContainerModel.timeSpliceLayoutDirection;
        }
        LayoutDirection layoutDirection2 = layoutDirection;
        String str4 = str3;
        return barGraphContainerModel.copy(str, str2, str4, list, layoutDirection2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarGraphContainerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.durationTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.durationTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.durationDisplay, "")) {
            output.encodeStringElement(serialDesc, 1, self.durationDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.typicalRangeTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 2, self.typicalRangeTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.heartRateZones, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.heartRateZones);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.timeSpliceLayoutDirection == LayoutDirection.LEFT_TO_RIGHT) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.timeSpliceLayoutDirection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDurationTitleDisplay() {
        return this.durationTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDurationDisplay() {
        return this.durationDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTypicalRangeTitleDisplay() {
        return this.typicalRangeTitleDisplay;
    }

    public final List<HeartRateZone> component4() {
        return this.heartRateZones;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LayoutDirection getTimeSpliceLayoutDirection() {
        return this.timeSpliceLayoutDirection;
    }

    public final BarGraphContainerModel copy(String durationTitleDisplay, String durationDisplay, String typicalRangeTitleDisplay, List<HeartRateZone> heartRateZones, LayoutDirection timeSpliceLayoutDirection) {
        AbstractC22676k.m65750j(durationTitleDisplay, "durationTitleDisplay");
        AbstractC22676k.m65750j(durationDisplay, "durationDisplay");
        AbstractC22676k.m65750j(typicalRangeTitleDisplay, "typicalRangeTitleDisplay");
        AbstractC22676k.m65750j(heartRateZones, "heartRateZones");
        AbstractC22676k.m65750j(timeSpliceLayoutDirection, "timeSpliceLayoutDirection");
        return new BarGraphContainerModel(durationTitleDisplay, durationDisplay, typicalRangeTitleDisplay, heartRateZones, timeSpliceLayoutDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarGraphContainerModel)) {
            return false;
        }
        BarGraphContainerModel barGraphContainerModel = (BarGraphContainerModel) other;
        return AbstractC22676k.m65745e(this.durationTitleDisplay, barGraphContainerModel.durationTitleDisplay) && AbstractC22676k.m65745e(this.durationDisplay, barGraphContainerModel.durationDisplay) && AbstractC22676k.m65745e(this.typicalRangeTitleDisplay, barGraphContainerModel.typicalRangeTitleDisplay) && AbstractC22676k.m65745e(this.heartRateZones, barGraphContainerModel.heartRateZones) && this.timeSpliceLayoutDirection == barGraphContainerModel.timeSpliceLayoutDirection;
    }

    public final String getDurationDisplay() {
        return this.durationDisplay;
    }

    public final String getDurationTitleDisplay() {
        return this.durationTitleDisplay;
    }

    public final List<HeartRateZone> getHeartRateZones() {
        return this.heartRateZones;
    }

    public final LayoutDirection getTimeSpliceLayoutDirection() {
        return this.timeSpliceLayoutDirection;
    }

    public final String getTypicalRangeTitleDisplay() {
        return this.typicalRangeTitleDisplay;
    }

    public int hashCode() {
        return this.timeSpliceLayoutDirection.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.durationTitleDisplay.hashCode() * 31, 31, this.durationDisplay), 31, this.typicalRangeTitleDisplay), 31, this.heartRateZones);
    }

    public String toString() {
        String str = this.durationTitleDisplay;
        String str2 = this.durationDisplay;
        String str3 = this.typicalRangeTitleDisplay;
        List<HeartRateZone> list = this.heartRateZones;
        LayoutDirection layoutDirection = this.timeSpliceLayoutDirection;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BarGraphContainerModel(durationTitleDisplay=", str, ", durationDisplay=", str2, ", typicalRangeTitleDisplay=");
        AbstractC36095b.m114694v(str3, ", heartRateZones=", ", timeSpliceLayoutDirection=", sbM32001t, list);
        sbM32001t.append(layoutDirection);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ BarGraphContainerModel(int i13, String str, String str2, String str3, List list, LayoutDirection layoutDirection, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.durationTitleDisplay = "";
        } else {
            this.durationTitleDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.durationDisplay = "";
        } else {
            this.durationDisplay = str2;
        }
        if ((i13 & 4) == 0) {
            this.typicalRangeTitleDisplay = "";
        } else {
            this.typicalRangeTitleDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.heartRateZones = C25271y.f99162w;
        } else {
            this.heartRateZones = list;
        }
        if ((i13 & 16) == 0) {
            this.timeSpliceLayoutDirection = LayoutDirection.LEFT_TO_RIGHT;
        } else {
            this.timeSpliceLayoutDirection = layoutDirection;
        }
    }

    public BarGraphContainerModel(String durationTitleDisplay, String durationDisplay, String typicalRangeTitleDisplay, List<HeartRateZone> heartRateZones, LayoutDirection timeSpliceLayoutDirection) {
        AbstractC22676k.m65750j(durationTitleDisplay, "durationTitleDisplay");
        AbstractC22676k.m65750j(durationDisplay, "durationDisplay");
        AbstractC22676k.m65750j(typicalRangeTitleDisplay, "typicalRangeTitleDisplay");
        AbstractC22676k.m65750j(heartRateZones, "heartRateZones");
        AbstractC22676k.m65750j(timeSpliceLayoutDirection, "timeSpliceLayoutDirection");
        this.durationTitleDisplay = durationTitleDisplay;
        this.durationDisplay = durationDisplay;
        this.typicalRangeTitleDisplay = typicalRangeTitleDisplay;
        this.heartRateZones = heartRateZones;
        this.timeSpliceLayoutDirection = timeSpliceLayoutDirection;
    }

    public /* synthetic */ BarGraphContainerModel(String str, String str2, String str3, List list, LayoutDirection layoutDirection, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? LayoutDirection.LEFT_TO_RIGHT : layoutDirection);
    }
}
