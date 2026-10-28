package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jh\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010*¨\u0006A"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "", "", "toggleDisplay", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "toggleType", "selectedStyle", "sliderDisplay", "", "", "sliderOptions", "", "toggled", "", "selectedSliderOption", "<init>", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "component3", "component4", "component5", "()Ljava/util/Map;", "component6", "()Z", "component7", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Double;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToggleDisplay", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/JournalToggleType;", "getToggleType", "getSelectedStyle", "getSliderDisplay", "Ljava/util/Map;", "getSliderOptions", "Z", "getToggled", "Ljava/lang/Double;", "getSelectedSliderOption", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogPeriodToggle {
    private static final InterfaceC23462h[] $childSerializers;
    private final Double selectedSliderOption;
    private final String selectedStyle;
    private final String sliderDisplay;
    private final Map<String, Float> sliderOptions;
    private final String toggleDisplay;
    private final JournalToggleType toggleType;
    private final boolean toggled;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodToggle;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogPeriodToggle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C30526a(21)), null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(22)), null, null};
    }

    public /* synthetic */ LogPeriodToggle(int i13, String str, JournalToggleType journalToggleType, String str2, String str3, Map map, boolean z4, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, LogPeriodToggle$$serializer.INSTANCE.getDescriptor());
        }
        this.toggleDisplay = str;
        this.toggleType = journalToggleType;
        this.selectedStyle = str2;
        this.sliderDisplay = str3;
        this.sliderOptions = map;
        this.toggled = z4;
        this.selectedSliderOption = d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.JournalToggleType", JournalToggleType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, FloatSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogPeriodToggle copy$default(LogPeriodToggle logPeriodToggle, String str, JournalToggleType journalToggleType, String str2, String str3, Map map, boolean z4, Double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = logPeriodToggle.toggleDisplay;
        }
        if ((i13 & 2) != 0) {
            journalToggleType = logPeriodToggle.toggleType;
        }
        if ((i13 & 4) != 0) {
            str2 = logPeriodToggle.selectedStyle;
        }
        if ((i13 & 8) != 0) {
            str3 = logPeriodToggle.sliderDisplay;
        }
        if ((i13 & 16) != 0) {
            map = logPeriodToggle.sliderOptions;
        }
        if ((i13 & 32) != 0) {
            z4 = logPeriodToggle.toggled;
        }
        if ((i13 & 64) != 0) {
            d3 = logPeriodToggle.selectedSliderOption;
        }
        boolean z13 = z4;
        Double d14 = d3;
        Map map2 = map;
        String str4 = str2;
        return logPeriodToggle.copy(str, journalToggleType, str4, str3, map2, z13, d14);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogPeriodToggle self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toggleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.toggleType);
        output.encodeStringElement(serialDesc, 2, self.selectedStyle);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.sliderDisplay);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.sliderOptions);
        output.encodeBooleanElement(serialDesc, 5, self.toggled);
        output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.selectedSliderOption);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToggleDisplay() {
        return this.toggleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JournalToggleType getToggleType() {
        return this.toggleType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSelectedStyle() {
        return this.selectedStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSliderDisplay() {
        return this.sliderDisplay;
    }

    public final Map<String, Float> component5() {
        return this.sliderOptions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getToggled() {
        return this.toggled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getSelectedSliderOption() {
        return this.selectedSliderOption;
    }

    public final LogPeriodToggle copy(String toggleDisplay, JournalToggleType toggleType, String selectedStyle, String sliderDisplay, Map<String, Float> sliderOptions, boolean toggled, Double selectedSliderOption) {
        AbstractC22676k.m65750j(toggleDisplay, "toggleDisplay");
        AbstractC22676k.m65750j(toggleType, "toggleType");
        AbstractC22676k.m65750j(selectedStyle, "selectedStyle");
        return new LogPeriodToggle(toggleDisplay, toggleType, selectedStyle, sliderDisplay, sliderOptions, toggled, selectedSliderOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogPeriodToggle)) {
            return false;
        }
        LogPeriodToggle logPeriodToggle = (LogPeriodToggle) other;
        return AbstractC22676k.m65745e(this.toggleDisplay, logPeriodToggle.toggleDisplay) && this.toggleType == logPeriodToggle.toggleType && AbstractC22676k.m65745e(this.selectedStyle, logPeriodToggle.selectedStyle) && AbstractC22676k.m65745e(this.sliderDisplay, logPeriodToggle.sliderDisplay) && AbstractC22676k.m65745e(this.sliderOptions, logPeriodToggle.sliderOptions) && this.toggled == logPeriodToggle.toggled && AbstractC22676k.m65745e(this.selectedSliderOption, logPeriodToggle.selectedSliderOption);
    }

    public final Double getSelectedSliderOption() {
        return this.selectedSliderOption;
    }

    public final String getSelectedStyle() {
        return this.selectedStyle;
    }

    public final String getSliderDisplay() {
        return this.sliderDisplay;
    }

    public final Map<String, Float> getSliderOptions() {
        return this.sliderOptions;
    }

    public final String getToggleDisplay() {
        return this.toggleDisplay;
    }

    public final JournalToggleType getToggleType() {
        return this.toggleType;
    }

    public final boolean getToggled() {
        return this.toggled;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.toggleType.hashCode() + (this.toggleDisplay.hashCode() * 31)) * 31, 31, this.selectedStyle);
        String str = this.sliderDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Float> map = this.sliderOptions;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.toggled);
        Double d3 = this.selectedSliderOption;
        return iM8289b + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.toggleDisplay;
        JournalToggleType journalToggleType = this.toggleType;
        String str2 = this.selectedStyle;
        String str3 = this.sliderDisplay;
        Map<String, Float> map = this.sliderOptions;
        boolean z4 = this.toggled;
        Double d3 = this.selectedSliderOption;
        StringBuilder sb4 = new StringBuilder("LogPeriodToggle(toggleDisplay=");
        sb4.append(str);
        sb4.append(", toggleType=");
        sb4.append(journalToggleType);
        sb4.append(", selectedStyle=");
        AbstractC11266d.m30444B(sb4, str2, ", sliderDisplay=", str3, ", sliderOptions=");
        sb4.append(map);
        sb4.append(", toggled=");
        sb4.append(z4);
        sb4.append(", selectedSliderOption=");
        sb4.append(d3);
        sb4.append(")");
        return sb4.toString();
    }

    public LogPeriodToggle(String toggleDisplay, JournalToggleType toggleType, String selectedStyle, String str, Map<String, Float> map, boolean z4, Double d3) {
        AbstractC22676k.m65750j(toggleDisplay, "toggleDisplay");
        AbstractC22676k.m65750j(toggleType, "toggleType");
        AbstractC22676k.m65750j(selectedStyle, "selectedStyle");
        this.toggleDisplay = toggleDisplay;
        this.toggleType = toggleType;
        this.selectedStyle = selectedStyle;
        this.sliderDisplay = str;
        this.sliderOptions = map;
        this.toggled = z4;
        this.selectedSliderOption = d3;
    }
}
