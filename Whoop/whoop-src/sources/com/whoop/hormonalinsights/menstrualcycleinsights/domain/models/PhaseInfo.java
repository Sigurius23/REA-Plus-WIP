package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30527b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003¢\u0006\u0004\b%\u0010#J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b&\u0010'Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010#R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u0010#R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010'¨\u0006<"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;", "", "", "backgroundUrl", "titleDisplay", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegend;", "legends", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;", "stats", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;", "buttons", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseEducationContent;", "education", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundUrl", "getTitleDisplay", "Ljava/util/List;", "getLegends", "getStats", "getButtons", "Ljava/util/Map;", "getEducation", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PhaseInfo {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundUrl;
    private final List<GraphButton> buttons;
    private final Map<String, PhaseEducationContent> education;
    private final List<PhaseLegend> legends;
    private final List<MenstrualPhaseStateSection> stats;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PhaseInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30527b(3)), AbstractC30060g.m92087G(enumC23463i, new C30527b(4)), AbstractC30060g.m92087G(enumC23463i, new C30527b(5)), AbstractC30060g.m92087G(enumC23463i, new C30527b(6))};
    }

    public /* synthetic */ PhaseInfo(int i13, String str, String str2, List list, List list2, List list3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PhaseInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundUrl = str;
        this.titleDisplay = str2;
        this.legends = list;
        this.stats = list2;
        this.buttons = list3;
        this.education = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(PhaseLegend$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(MenstrualPhaseStateSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(GraphButton$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, PhaseEducationContent$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhaseInfo copy$default(PhaseInfo phaseInfo, String str, String str2, List list, List list2, List list3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = phaseInfo.backgroundUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = phaseInfo.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            list = phaseInfo.legends;
        }
        if ((i13 & 8) != 0) {
            list2 = phaseInfo.stats;
        }
        if ((i13 & 16) != 0) {
            list3 = phaseInfo.buttons;
        }
        if ((i13 & 32) != 0) {
            map = phaseInfo.education;
        }
        List list4 = list3;
        Map map2 = map;
        return phaseInfo.copy(str, str2, list, list2, list4, map2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PhaseInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.backgroundUrl);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.legends);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.stats);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.buttons);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.education);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final List<PhaseLegend> component3() {
        return this.legends;
    }

    public final List<MenstrualPhaseStateSection> component4() {
        return this.stats;
    }

    public final List<GraphButton> component5() {
        return this.buttons;
    }

    public final Map<String, PhaseEducationContent> component6() {
        return this.education;
    }

    public final PhaseInfo copy(String backgroundUrl, String titleDisplay, List<PhaseLegend> legends, List<MenstrualPhaseStateSection> stats, List<GraphButton> buttons, Map<String, PhaseEducationContent> education) {
        AbstractC22676k.m65750j(backgroundUrl, "backgroundUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(legends, "legends");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(education, "education");
        return new PhaseInfo(backgroundUrl, titleDisplay, legends, stats, buttons, education);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhaseInfo)) {
            return false;
        }
        PhaseInfo phaseInfo = (PhaseInfo) other;
        return AbstractC22676k.m65745e(this.backgroundUrl, phaseInfo.backgroundUrl) && AbstractC22676k.m65745e(this.titleDisplay, phaseInfo.titleDisplay) && AbstractC22676k.m65745e(this.legends, phaseInfo.legends) && AbstractC22676k.m65745e(this.stats, phaseInfo.stats) && AbstractC22676k.m65745e(this.buttons, phaseInfo.buttons) && AbstractC22676k.m65745e(this.education, phaseInfo.education);
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final List<GraphButton> getButtons() {
        return this.buttons;
    }

    public final Map<String, PhaseEducationContent> getEducation() {
        return this.education;
    }

    public final List<PhaseLegend> getLegends() {
        return this.legends;
    }

    public final List<MenstrualPhaseStateSection> getStats() {
        return this.stats;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.backgroundUrl.hashCode() * 31, 31, this.titleDisplay), 31, this.legends);
        List<MenstrualPhaseStateSection> list = this.stats;
        return this.education.hashCode() + AbstractC11895b.m31983b((iM31983b + (list == null ? 0 : list.hashCode())) * 31, 31, this.buttons);
    }

    public String toString() {
        String str = this.backgroundUrl;
        String str2 = this.titleDisplay;
        List<PhaseLegend> list = this.legends;
        List<MenstrualPhaseStateSection> list2 = this.stats;
        List<GraphButton> list3 = this.buttons;
        Map<String, PhaseEducationContent> map = this.education;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PhaseInfo(backgroundUrl=", str, ", titleDisplay=", str2, ", legends=");
        AbstractC21702c.m61148s(sbM32001t, list, ", stats=", list2, ", buttons=");
        sbM32001t.append(list3);
        sbM32001t.append(", education=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PhaseInfo(String backgroundUrl, String titleDisplay, List<PhaseLegend> legends, List<MenstrualPhaseStateSection> list, List<GraphButton> buttons, Map<String, PhaseEducationContent> education) {
        AbstractC22676k.m65750j(backgroundUrl, "backgroundUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(legends, "legends");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(education, "education");
        this.backgroundUrl = backgroundUrl;
        this.titleDisplay = titleDisplay;
        this.legends = legends;
        this.stats = list;
        this.buttons = buttons;
        this.education = education;
    }
}
