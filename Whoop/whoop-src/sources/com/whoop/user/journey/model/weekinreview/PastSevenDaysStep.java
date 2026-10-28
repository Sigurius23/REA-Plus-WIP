package com.whoop.user.journey.model.weekinreview;

import bo2.C3509a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b6\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b9\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b:\u0010\u001e¨\u0006="}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/PastSevenDaysStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "backgroundImageUrl", "", "Lcom/whoop/user/journey/model/weekinreview/Day;", "days", "footerText", "footerSubText", "name", "type", "theme", "themeVariant", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/weekinreview/PastSevenDaysStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/PastSevenDaysStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundImageUrl", "Ljava/util/List;", "getDays", "getFooterText", "getFooterSubText", "getName", "getType", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PastSevenDaysStep implements UserJourneyStep {
    private final String backgroundImageUrl;
    private final List<Day> days;
    private final String footerSubText;
    private final String footerText;
    private final String name;
    private final String theme;
    private final String themeVariant;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3509a(5)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/PastSevenDaysStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/weekinreview/PastSevenDaysStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PastSevenDaysStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PastSevenDaysStep(int i13, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, PastSevenDaysStep$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundImageUrl = str;
        this.days = list;
        this.footerText = str2;
        this.footerSubText = str3;
        this.name = str4;
        this.type = str5;
        this.theme = str6;
        this.themeVariant = str7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Day$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PastSevenDaysStep copy$default(PastSevenDaysStep pastSevenDaysStep, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pastSevenDaysStep.backgroundImageUrl;
        }
        if ((i13 & 2) != 0) {
            list = pastSevenDaysStep.days;
        }
        if ((i13 & 4) != 0) {
            str2 = pastSevenDaysStep.footerText;
        }
        if ((i13 & 8) != 0) {
            str3 = pastSevenDaysStep.footerSubText;
        }
        if ((i13 & 16) != 0) {
            str4 = pastSevenDaysStep.name;
        }
        if ((i13 & 32) != 0) {
            str5 = pastSevenDaysStep.type;
        }
        if ((i13 & 64) != 0) {
            str6 = pastSevenDaysStep.theme;
        }
        if ((i13 & 128) != 0) {
            str7 = pastSevenDaysStep.themeVariant;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return pastSevenDaysStep.copy(str, list, str2, str3, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(PastSevenDaysStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.backgroundImageUrl);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.days);
        output.encodeStringElement(serialDesc, 2, self.footerText);
        output.encodeStringElement(serialDesc, 3, self.footerSubText);
        output.encodeStringElement(serialDesc, 4, self.name);
        output.encodeStringElement(serialDesc, 5, self.type);
        output.encodeStringElement(serialDesc, 6, self.theme);
        output.encodeStringElement(serialDesc, 7, self.themeVariant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<Day> component2() {
        return this.days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final PastSevenDaysStep copy(String backgroundImageUrl, List<Day> days, String footerText, String footerSubText, String name, String type, String theme, String themeVariant) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(days, "days");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new PastSevenDaysStep(backgroundImageUrl, days, footerText, footerSubText, name, type, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PastSevenDaysStep)) {
            return false;
        }
        PastSevenDaysStep pastSevenDaysStep = (PastSevenDaysStep) other;
        return AbstractC22676k.m65745e(this.backgroundImageUrl, pastSevenDaysStep.backgroundImageUrl) && AbstractC22676k.m65745e(this.days, pastSevenDaysStep.days) && AbstractC22676k.m65745e(this.footerText, pastSevenDaysStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, pastSevenDaysStep.footerSubText) && AbstractC22676k.m65745e(this.name, pastSevenDaysStep.name) && AbstractC22676k.m65745e(this.type, pastSevenDaysStep.type) && AbstractC22676k.m65745e(this.theme, pastSevenDaysStep.theme) && AbstractC22676k.m65745e(this.themeVariant, pastSevenDaysStep.themeVariant);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<Day> getDays() {
        return this.days;
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.backgroundImageUrl.hashCode() * 31, 31, this.days), 31, this.footerText), 31, this.footerSubText), 31, this.name), 31, this.type), 31, this.theme);
    }

    public String toString() {
        String str = this.backgroundImageUrl;
        List<Day> list = this.days;
        String str2 = this.footerText;
        String str3 = this.footerSubText;
        String str4 = this.name;
        String str5 = this.type;
        String str6 = this.theme;
        String str7 = this.themeVariant;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("PastSevenDaysStep(backgroundImageUrl=", str, ", days=", ", footerText=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", footerSubText=", str3, ", name=");
        AbstractC11266d.m30444B(sbM94766o, str4, ", type=", str5, ", theme=");
        return AbstractC11266d.m30464r(sbM94766o, str6, ", themeVariant=", str7, ")");
    }

    public PastSevenDaysStep(String backgroundImageUrl, List<Day> days, String footerText, String footerSubText, String name, String type, String theme, String themeVariant) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(days, "days");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.backgroundImageUrl = backgroundImageUrl;
        this.days = days;
        this.footerText = footerText;
        this.footerSubText = footerSubText;
        this.name = name;
        this.type = type;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
