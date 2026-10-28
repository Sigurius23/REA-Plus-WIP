package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0085\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J~\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u0016¨\u0006A"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "", "", "navigationTitleDisplay", "headerDisplay", "subtitle", "selectedHeader", "unselectedHeader", "", "legend", "selectedEmptyState", "unselectedEmptyState", "timeRange", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getNavigationTitleDisplay", "getHeaderDisplay", "getSubtitle", "getSelectedHeader", "getUnselectedHeader", "Ljava/util/List;", "getLegend", "getSelectedEmptyState", "getUnselectedEmptyState", "getTimeRange", "getButtonText", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricScreen {
    private final String buttonText;
    private final String headerDisplay;
    private final List<String> legend;
    private final String navigationTitleDisplay;
    private final String selectedEmptyState;
    private final String selectedHeader;
    private final String subtitle;
    private final String timeRange;
    private final String unselectedEmptyState;
    private final String unselectedHeader;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(10)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricScreen(int i13, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, MetricScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitleDisplay = str;
        this.headerDisplay = str2;
        this.subtitle = str3;
        this.selectedHeader = str4;
        this.unselectedHeader = str5;
        this.legend = list;
        this.selectedEmptyState = str6;
        this.unselectedEmptyState = str7;
        this.timeRange = str8;
        this.buttonText = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MetricScreen copy$default(MetricScreen metricScreen, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = metricScreen.navigationTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = metricScreen.headerDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = metricScreen.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = metricScreen.selectedHeader;
        }
        if ((i13 & 16) != 0) {
            str5 = metricScreen.unselectedHeader;
        }
        if ((i13 & 32) != 0) {
            list = metricScreen.legend;
        }
        if ((i13 & 64) != 0) {
            str6 = metricScreen.selectedEmptyState;
        }
        if ((i13 & 128) != 0) {
            str7 = metricScreen.unselectedEmptyState;
        }
        if ((i13 & 256) != 0) {
            str8 = metricScreen.timeRange;
        }
        if ((i13 & 512) != 0) {
            str9 = metricScreen.buttonText;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        List list2 = list;
        return metricScreen.copy(str, str2, str3, str4, str14, list2, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(MetricScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitleDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.headerDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.selectedHeader);
        output.encodeStringElement(serialDesc, 4, self.unselectedHeader);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.legend);
        output.encodeStringElement(serialDesc, 6, self.selectedEmptyState);
        output.encodeStringElement(serialDesc, 7, self.unselectedEmptyState);
        output.encodeStringElement(serialDesc, 8, self.timeRange);
        output.encodeStringElement(serialDesc, 9, self.buttonText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitleDisplay() {
        return this.navigationTitleDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderDisplay() {
        return this.headerDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedHeader() {
        return this.selectedHeader;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnselectedHeader() {
        return this.unselectedHeader;
    }

    public final List<String> component6() {
        return this.legend;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSelectedEmptyState() {
        return this.selectedEmptyState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUnselectedEmptyState() {
        return this.unselectedEmptyState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    public final MetricScreen copy(String navigationTitleDisplay, String headerDisplay, String subtitle, String selectedHeader, String unselectedHeader, List<String> legend, String selectedEmptyState, String unselectedEmptyState, String timeRange, String buttonText) {
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(selectedHeader, "selectedHeader");
        AbstractC22676k.m65750j(unselectedHeader, "unselectedHeader");
        AbstractC22676k.m65750j(legend, "legend");
        AbstractC22676k.m65750j(selectedEmptyState, "selectedEmptyState");
        AbstractC22676k.m65750j(unselectedEmptyState, "unselectedEmptyState");
        AbstractC22676k.m65750j(timeRange, "timeRange");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        return new MetricScreen(navigationTitleDisplay, headerDisplay, subtitle, selectedHeader, unselectedHeader, legend, selectedEmptyState, unselectedEmptyState, timeRange, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricScreen)) {
            return false;
        }
        MetricScreen metricScreen = (MetricScreen) other;
        return AbstractC22676k.m65745e(this.navigationTitleDisplay, metricScreen.navigationTitleDisplay) && AbstractC22676k.m65745e(this.headerDisplay, metricScreen.headerDisplay) && AbstractC22676k.m65745e(this.subtitle, metricScreen.subtitle) && AbstractC22676k.m65745e(this.selectedHeader, metricScreen.selectedHeader) && AbstractC22676k.m65745e(this.unselectedHeader, metricScreen.unselectedHeader) && AbstractC22676k.m65745e(this.legend, metricScreen.legend) && AbstractC22676k.m65745e(this.selectedEmptyState, metricScreen.selectedEmptyState) && AbstractC22676k.m65745e(this.unselectedEmptyState, metricScreen.unselectedEmptyState) && AbstractC22676k.m65745e(this.timeRange, metricScreen.timeRange) && AbstractC22676k.m65745e(this.buttonText, metricScreen.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getHeaderDisplay() {
        return this.headerDisplay;
    }

    public final List<String> getLegend() {
        return this.legend;
    }

    public final String getNavigationTitleDisplay() {
        return this.navigationTitleDisplay;
    }

    public final String getSelectedEmptyState() {
        return this.selectedEmptyState;
    }

    public final String getSelectedHeader() {
        return this.selectedHeader;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTimeRange() {
        return this.timeRange;
    }

    public final String getUnselectedEmptyState() {
        return this.unselectedEmptyState;
    }

    public final String getUnselectedHeader() {
        return this.unselectedHeader;
    }

    public int hashCode() {
        int iHashCode = this.navigationTitleDisplay.hashCode() * 31;
        String str = this.headerDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return this.buttonText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.selectedHeader), 31, this.unselectedHeader), 31, this.legend), 31, this.selectedEmptyState), 31, this.unselectedEmptyState), 31, this.timeRange);
    }

    public String toString() {
        String str = this.navigationTitleDisplay;
        String str2 = this.headerDisplay;
        String str3 = this.subtitle;
        String str4 = this.selectedHeader;
        String str5 = this.unselectedHeader;
        List<String> list = this.legend;
        String str6 = this.selectedEmptyState;
        String str7 = this.unselectedEmptyState;
        String str8 = this.timeRange;
        String str9 = this.buttonText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MetricScreen(navigationTitleDisplay=", str, ", headerDisplay=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectedHeader=", str4, ", unselectedHeader=");
        AbstractC36095b.m114694v(str5, ", legend=", ", selectedEmptyState=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", unselectedEmptyState=", str7, ", timeRange=");
        return AbstractC11266d.m30464r(sbM32001t, str8, ", buttonText=", str9, ")");
    }

    public MetricScreen(String navigationTitleDisplay, String str, String str2, String selectedHeader, String unselectedHeader, List<String> legend, String selectedEmptyState, String unselectedEmptyState, String timeRange, String buttonText) {
        AbstractC22676k.m65750j(navigationTitleDisplay, "navigationTitleDisplay");
        AbstractC22676k.m65750j(selectedHeader, "selectedHeader");
        AbstractC22676k.m65750j(unselectedHeader, "unselectedHeader");
        AbstractC22676k.m65750j(legend, "legend");
        AbstractC22676k.m65750j(selectedEmptyState, "selectedEmptyState");
        AbstractC22676k.m65750j(unselectedEmptyState, "unselectedEmptyState");
        AbstractC22676k.m65750j(timeRange, "timeRange");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.navigationTitleDisplay = navigationTitleDisplay;
        this.headerDisplay = str;
        this.subtitle = str2;
        this.selectedHeader = selectedHeader;
        this.unselectedHeader = unselectedHeader;
        this.legend = legend;
        this.selectedEmptyState = selectedEmptyState;
        this.unselectedEmptyState = unselectedEmptyState;
        this.timeRange = timeRange;
        this.buttonText = buttonText;
    }
}
