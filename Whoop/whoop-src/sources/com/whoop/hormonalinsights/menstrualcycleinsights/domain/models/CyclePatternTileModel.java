package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jn\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010!J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010.¨\u0006I"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "type", "", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "cycles", "", "todayIndex", "", "showDividers", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "button", "emptyState", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Integer;", "component5", "()Z", "component6", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "component7", "()Lcom/whoop/design/models/DesignSystemModel;", "component8", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getType", "Ljava/util/List;", "getCycles", "Ljava/lang/Integer;", "getTodayIndex", "Z", "getShowDividers", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "getButton", "Lcom/whoop/design/models/DesignSystemModel;", "getEmptyState", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CyclePatternTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CyclePatternButtonModel button;
    private final List<DailyTickMarkPlotModel> cycles;
    private final DesignSystemModel emptyState;
    private final GenericInteraction genericInteraction;
    private final boolean showDividers;
    private final String titleDisplay;
    private final Integer todayIndex;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CyclePatternTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(11)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(12)), null};
    }

    public /* synthetic */ CyclePatternTileModel(int i13, String str, String str2, List list, Integer num, boolean z4, CyclePatternButtonModel cyclePatternButtonModel, DesignSystemModel designSystemModel, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CyclePatternTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.type = str2;
        this.cycles = list;
        this.todayIndex = num;
        this.showDividers = z4;
        this.button = cyclePatternButtonModel;
        this.emptyState = designSystemModel;
        if ((i13 & 128) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DailyTickMarkPlotModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CyclePatternTileModel copy$default(CyclePatternTileModel cyclePatternTileModel, String str, String str2, List list, Integer num, boolean z4, CyclePatternButtonModel cyclePatternButtonModel, DesignSystemModel designSystemModel, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cyclePatternTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = cyclePatternTileModel.type;
        }
        if ((i13 & 4) != 0) {
            list = cyclePatternTileModel.cycles;
        }
        if ((i13 & 8) != 0) {
            num = cyclePatternTileModel.todayIndex;
        }
        if ((i13 & 16) != 0) {
            z4 = cyclePatternTileModel.showDividers;
        }
        if ((i13 & 32) != 0) {
            cyclePatternButtonModel = cyclePatternTileModel.button;
        }
        if ((i13 & 64) != 0) {
            designSystemModel = cyclePatternTileModel.emptyState;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = cyclePatternTileModel.genericInteraction;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        GenericInteraction genericInteraction2 = genericInteraction;
        boolean z13 = z4;
        CyclePatternButtonModel cyclePatternButtonModel2 = cyclePatternButtonModel;
        return cyclePatternTileModel.copy(str, str2, list, num, z13, cyclePatternButtonModel2, designSystemModel2, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CyclePatternTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.type);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.cycles);
        output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.todayIndex);
        output.encodeBooleanElement(serialDesc, 4, self.showDividers);
        output.encodeNullableSerializableElement(serialDesc, 5, CyclePatternButtonModel$$serializer.INSTANCE, self.button);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.emptyState);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.genericInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<DailyTickMarkPlotModel> component3() {
        return this.cycles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTodayIndex() {
        return this.todayIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowDividers() {
        return this.showDividers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CyclePatternButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignSystemModel getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final CyclePatternTileModel copy(String titleDisplay, String type, List<DailyTickMarkPlotModel> cycles, Integer todayIndex, boolean showDividers, CyclePatternButtonModel button, DesignSystemModel emptyState, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cycles, "cycles");
        return new CyclePatternTileModel(titleDisplay, type, cycles, todayIndex, showDividers, button, emptyState, genericInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CyclePatternTileModel)) {
            return false;
        }
        CyclePatternTileModel cyclePatternTileModel = (CyclePatternTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, cyclePatternTileModel.titleDisplay) && AbstractC22676k.m65745e(this.type, cyclePatternTileModel.type) && AbstractC22676k.m65745e(this.cycles, cyclePatternTileModel.cycles) && AbstractC22676k.m65745e(this.todayIndex, cyclePatternTileModel.todayIndex) && this.showDividers == cyclePatternTileModel.showDividers && AbstractC22676k.m65745e(this.button, cyclePatternTileModel.button) && AbstractC22676k.m65745e(this.emptyState, cyclePatternTileModel.emptyState) && AbstractC22676k.m65745e(this.genericInteraction, cyclePatternTileModel.genericInteraction);
    }

    public final CyclePatternButtonModel getButton() {
        return this.button;
    }

    public final List<DailyTickMarkPlotModel> getCycles() {
        return this.cycles;
    }

    public final DesignSystemModel getEmptyState() {
        return this.emptyState;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final boolean getShowDividers() {
        return this.showDividers;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final Integer getTodayIndex() {
        return this.todayIndex;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.type), 31, this.cycles);
        Integer num = this.todayIndex;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (num == null ? 0 : num.hashCode())) * 31, 31, this.showDividers);
        CyclePatternButtonModel cyclePatternButtonModel = this.button;
        int iHashCode = (iM8289b + (cyclePatternButtonModel == null ? 0 : cyclePatternButtonModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.emptyState;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        return iHashCode2 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.type;
        List<DailyTickMarkPlotModel> list = this.cycles;
        Integer num = this.todayIndex;
        boolean z4 = this.showDividers;
        CyclePatternButtonModel cyclePatternButtonModel = this.button;
        DesignSystemModel designSystemModel = this.emptyState;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CyclePatternTileModel(titleDisplay=", str, ", type=", str2, ", cycles=");
        sbM32001t.append(list);
        sbM32001t.append(", todayIndex=");
        sbM32001t.append(num);
        sbM32001t.append(", showDividers=");
        sbM32001t.append(z4);
        sbM32001t.append(", button=");
        sbM32001t.append(cyclePatternButtonModel);
        sbM32001t.append(", emptyState=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", genericInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CyclePatternTileModel(String titleDisplay, String type, List<DailyTickMarkPlotModel> cycles, Integer num, boolean z4, CyclePatternButtonModel cyclePatternButtonModel, DesignSystemModel designSystemModel, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cycles, "cycles");
        this.titleDisplay = titleDisplay;
        this.type = type;
        this.cycles = cycles;
        this.todayIndex = num;
        this.showDividers = z4;
        this.button = cyclePatternButtonModel;
        this.emptyState = designSystemModel;
        this.genericInteraction = genericInteraction;
    }

    public /* synthetic */ CyclePatternTileModel(String str, String str2, List list, Integer num, boolean z4, CyclePatternButtonModel cyclePatternButtonModel, DesignSystemModel designSystemModel, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, num, z4, cyclePatternButtonModel, designSystemModel, (i13 & 128) != 0 ? null : genericInteraction);
    }
}
