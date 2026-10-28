package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cp0.C10977m;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBm\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010!Jf\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b6\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b7\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b8\u0010!¨\u0006;"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/FinaleStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "Lcom/whoop/user/journey/model/yearinreview/RecapStatistic;", "recapStats", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "", "name", "theme", "themeVariant", "footerText", "footerSubText", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/FinaleStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/FinaleStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecapStats", "getHighlightedTexts", "Ljava/lang/String;", "getName", "getTheme", "getThemeVariant", "getFooterText", "getFooterSubText", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinaleStep implements UserJourneyStep {
    private static final InterfaceC23462h[] $childSerializers;
    private final String footerSubText;
    private final String footerText;
    private final List<HighlightedText> highlightedTexts;
    private final String name;
    private final List<RecapStatistic> recapStats;
    private final String theme;
    private final String themeVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/FinaleStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/FinaleStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FinaleStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C10977m(28)), AbstractC30060g.m92087G(enumC23463i, new C10977m(29)), null, null, null, null, null};
    }

    public /* synthetic */ FinaleStep(int i13, List list, List list2, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, FinaleStep$$serializer.INSTANCE.getDescriptor());
        }
        this.recapStats = list;
        this.highlightedTexts = list2;
        this.name = str;
        this.theme = str2;
        this.themeVariant = str3;
        if ((i13 & 32) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str4;
        }
        if ((i13 & 64) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RecapStatistic$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinaleStep copy$default(FinaleStep finaleStep, List list, List list2, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = finaleStep.recapStats;
        }
        if ((i13 & 2) != 0) {
            list2 = finaleStep.highlightedTexts;
        }
        if ((i13 & 4) != 0) {
            str = finaleStep.name;
        }
        if ((i13 & 8) != 0) {
            str2 = finaleStep.theme;
        }
        if ((i13 & 16) != 0) {
            str3 = finaleStep.themeVariant;
        }
        if ((i13 & 32) != 0) {
            str4 = finaleStep.footerText;
        }
        if ((i13 & 64) != 0) {
            str5 = finaleStep.footerSubText;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str;
        return finaleStep.copy(list, list2, str9, str2, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(FinaleStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.recapStats);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.highlightedTexts);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeStringElement(serialDesc, 3, self.theme);
        output.encodeStringElement(serialDesc, 4, self.themeVariant);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.footerText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.footerSubText == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.footerSubText);
    }

    public final List<RecapStatistic> component1() {
        return this.recapStats;
    }

    public final List<HighlightedText> component2() {
        return this.highlightedTexts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final FinaleStep copy(List<RecapStatistic> recapStats, List<HighlightedText> highlightedTexts, String name, String theme, String themeVariant, String footerText, String footerSubText) {
        AbstractC22676k.m65750j(recapStats, "recapStats");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new FinaleStep(recapStats, highlightedTexts, name, theme, themeVariant, footerText, footerSubText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinaleStep)) {
            return false;
        }
        FinaleStep finaleStep = (FinaleStep) other;
        return AbstractC22676k.m65745e(this.recapStats, finaleStep.recapStats) && AbstractC22676k.m65745e(this.highlightedTexts, finaleStep.highlightedTexts) && AbstractC22676k.m65745e(this.name, finaleStep.name) && AbstractC22676k.m65745e(this.theme, finaleStep.theme) && AbstractC22676k.m65745e(this.themeVariant, finaleStep.themeVariant) && AbstractC22676k.m65745e(this.footerText, finaleStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, finaleStep.footerSubText);
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final List<HighlightedText> getHighlightedTexts() {
        return this.highlightedTexts;
    }

    public final String getName() {
        return this.name;
    }

    public final List<RecapStatistic> getRecapStats() {
        return this.recapStats;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.recapStats.hashCode() * 31, 31, this.highlightedTexts), 31, this.name), 31, this.theme), 31, this.themeVariant);
        String str = this.footerText;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.footerSubText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<RecapStatistic> list = this.recapStats;
        List<HighlightedText> list2 = this.highlightedTexts;
        String str = this.name;
        String str2 = this.theme;
        String str3 = this.themeVariant;
        String str4 = this.footerText;
        String str5 = this.footerSubText;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("FinaleStep(recapStats=", ", highlightedTexts=", list, ", name=", list2);
        AbstractC11266d.m30444B(sbM124380j, str, ", theme=", str2, ", themeVariant=");
        AbstractC11266d.m30444B(sbM124380j, str3, ", footerText=", str4, ", footerSubText=");
        return AbstractC25012a.m73376i(str5, ")", sbM124380j);
    }

    public FinaleStep(List<RecapStatistic> recapStats, List<HighlightedText> highlightedTexts, String name, String theme, String themeVariant, String str, String str2) {
        AbstractC22676k.m65750j(recapStats, "recapStats");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.recapStats = recapStats;
        this.highlightedTexts = highlightedTexts;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
        this.footerText = str;
        this.footerSubText = str2;
    }

    public /* synthetic */ FinaleStep(List list, List list2, String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, str, str2, str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5);
    }
}
