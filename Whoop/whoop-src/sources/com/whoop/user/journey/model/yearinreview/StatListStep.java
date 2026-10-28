package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJl\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b6\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b:\u0010\u001e¨\u0006="}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StatListStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "title", "footerText", "", "Lcom/whoop/user/journey/model/yearinreview/StatItemModel;", "stats", "name", "theme", "themeVariant", "wirFooterText", "wirFooterSubText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/StatListStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/StatListStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getFooterText", "Ljava/util/List;", "getStats", "getName", "getTheme", "getThemeVariant", "getWirFooterText", "getWirFooterSubText", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StatListStep implements UserJourneyStep {
    private final String footerText;
    private final String name;
    private final List<StatItemModel> stats;
    private final String theme;
    private final String themeVariant;
    private final String title;
    private final String wirFooterSubText;
    private final String wirFooterText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(18)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/StatListStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/StatListStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StatListStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StatListStep(int i13, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (254 != (i13 & 254)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 254, StatListStep$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        this.footerText = str2;
        this.stats = list;
        this.name = str3;
        this.theme = str4;
        this.themeVariant = str5;
        this.wirFooterText = str6;
        this.wirFooterSubText = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StatItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatListStep copy$default(StatListStep statListStep, String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = statListStep.title;
        }
        if ((i13 & 2) != 0) {
            str2 = statListStep.footerText;
        }
        if ((i13 & 4) != 0) {
            list = statListStep.stats;
        }
        if ((i13 & 8) != 0) {
            str3 = statListStep.name;
        }
        if ((i13 & 16) != 0) {
            str4 = statListStep.theme;
        }
        if ((i13 & 32) != 0) {
            str5 = statListStep.themeVariant;
        }
        if ((i13 & 64) != 0) {
            str6 = statListStep.wirFooterText;
        }
        if ((i13 & 128) != 0) {
            str7 = statListStep.wirFooterSubText;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return statListStep.copy(str, str2, list, str3, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(StatListStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        output.encodeStringElement(serialDesc, 1, self.footerText);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.stats);
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeStringElement(serialDesc, 4, self.theme);
        output.encodeStringElement(serialDesc, 5, self.themeVariant);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.wirFooterText);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.wirFooterSubText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    public final List<StatItemModel> component3() {
        return this.stats;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWirFooterText() {
        return this.wirFooterText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWirFooterSubText() {
        return this.wirFooterSubText;
    }

    public final StatListStep copy(String title, String footerText, List<StatItemModel> stats, String name, String theme, String themeVariant, String wirFooterText, String wirFooterSubText) {
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(stats, "stats");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new StatListStep(title, footerText, stats, name, theme, themeVariant, wirFooterText, wirFooterSubText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatListStep)) {
            return false;
        }
        StatListStep statListStep = (StatListStep) other;
        return AbstractC22676k.m65745e(this.title, statListStep.title) && AbstractC22676k.m65745e(this.footerText, statListStep.footerText) && AbstractC22676k.m65745e(this.stats, statListStep.stats) && AbstractC22676k.m65745e(this.name, statListStep.name) && AbstractC22676k.m65745e(this.theme, statListStep.theme) && AbstractC22676k.m65745e(this.themeVariant, statListStep.themeVariant) && AbstractC22676k.m65745e(this.wirFooterText, statListStep.wirFooterText) && AbstractC22676k.m65745e(this.wirFooterSubText, statListStep.wirFooterSubText);
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getName() {
        return this.name;
    }

    public final List<StatItemModel> getStats() {
        return this.stats;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWirFooterSubText() {
        return this.wirFooterSubText;
    }

    public final String getWirFooterText() {
        return this.wirFooterText;
    }

    public int hashCode() {
        String str = this.title;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.footerText), 31, this.stats), 31, this.name), 31, this.theme), 31, this.themeVariant);
        String str2 = this.wirFooterText;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wirFooterSubText;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.footerText;
        List<StatItemModel> list = this.stats;
        String str3 = this.name;
        String str4 = this.theme;
        String str5 = this.themeVariant;
        String str6 = this.wirFooterText;
        String str7 = this.wirFooterSubText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StatListStep(title=", str, ", footerText=", str2, ", stats=");
        AbstractC17176i.m48511m(", name=", str3, ", theme=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", themeVariant=", str5, ", wirFooterText=");
        return AbstractC11266d.m30464r(sbM32001t, str6, ", wirFooterSubText=", str7, ")");
    }

    public StatListStep(String str, String footerText, List<StatItemModel> stats, String name, String theme, String themeVariant, String str2, String str3) {
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(stats, "stats");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.title = str;
        this.footerText = footerText;
        this.stats = stats;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
        this.wirFooterText = str2;
        this.wirFooterSubText = str3;
    }

    public /* synthetic */ StatListStep(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, list, str3, str4, str5, str6, str7);
    }
}
