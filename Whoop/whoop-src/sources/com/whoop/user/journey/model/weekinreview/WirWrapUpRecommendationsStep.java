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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJR\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b2\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b4\u0010\u001e¨\u00067"}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/WirWrapUpRecommendationsStep;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "Lcom/whoop/user/journey/model/weekinreview/Recommendation;", "recommendations", "", "footerText", "footerSubText", "name", "theme", "themeVariant", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/weekinreview/WirWrapUpRecommendationsStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/weekinreview/WirWrapUpRecommendationsStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRecommendations", "Ljava/lang/String;", "getFooterText", "getFooterSubText", "getName", "getTheme", "getThemeVariant", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WirWrapUpRecommendationsStep implements UserJourneyStep {
    private final String footerSubText;
    private final String footerText;
    private final String name;
    private final List<Recommendation> recommendations;
    private final String theme;
    private final String themeVariant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3509a(7)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/weekinreview/WirWrapUpRecommendationsStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/weekinreview/WirWrapUpRecommendationsStep;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WirWrapUpRecommendationsStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WirWrapUpRecommendationsStep(int i13, List list, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, WirWrapUpRecommendationsStep$$serializer.INSTANCE.getDescriptor());
        }
        this.recommendations = list;
        this.footerText = str;
        this.footerSubText = str2;
        this.name = str3;
        this.theme = str4;
        this.themeVariant = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Recommendation$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WirWrapUpRecommendationsStep copy$default(WirWrapUpRecommendationsStep wirWrapUpRecommendationsStep, List list, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = wirWrapUpRecommendationsStep.recommendations;
        }
        if ((i13 & 2) != 0) {
            str = wirWrapUpRecommendationsStep.footerText;
        }
        if ((i13 & 4) != 0) {
            str2 = wirWrapUpRecommendationsStep.footerSubText;
        }
        if ((i13 & 8) != 0) {
            str3 = wirWrapUpRecommendationsStep.name;
        }
        if ((i13 & 16) != 0) {
            str4 = wirWrapUpRecommendationsStep.theme;
        }
        if ((i13 & 32) != 0) {
            str5 = wirWrapUpRecommendationsStep.themeVariant;
        }
        String str6 = str4;
        String str7 = str5;
        return wirWrapUpRecommendationsStep.copy(list, str, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(WirWrapUpRecommendationsStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.recommendations);
        output.encodeStringElement(serialDesc, 1, self.footerText);
        output.encodeStringElement(serialDesc, 2, self.footerSubText);
        output.encodeStringElement(serialDesc, 3, self.name);
        output.encodeStringElement(serialDesc, 4, self.theme);
        output.encodeStringElement(serialDesc, 5, self.themeVariant);
    }

    public final List<Recommendation> component1() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
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

    public final WirWrapUpRecommendationsStep copy(List<Recommendation> recommendations, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new WirWrapUpRecommendationsStep(recommendations, footerText, footerSubText, name, theme, themeVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WirWrapUpRecommendationsStep)) {
            return false;
        }
        WirWrapUpRecommendationsStep wirWrapUpRecommendationsStep = (WirWrapUpRecommendationsStep) other;
        return AbstractC22676k.m65745e(this.recommendations, wirWrapUpRecommendationsStep.recommendations) && AbstractC22676k.m65745e(this.footerText, wirWrapUpRecommendationsStep.footerText) && AbstractC22676k.m65745e(this.footerSubText, wirWrapUpRecommendationsStep.footerSubText) && AbstractC22676k.m65745e(this.name, wirWrapUpRecommendationsStep.name) && AbstractC22676k.m65745e(this.theme, wirWrapUpRecommendationsStep.theme) && AbstractC22676k.m65745e(this.themeVariant, wirWrapUpRecommendationsStep.themeVariant);
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

    public final List<Recommendation> getRecommendations() {
        return this.recommendations;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public int hashCode() {
        return this.themeVariant.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.recommendations.hashCode() * 31, 31, this.footerText), 31, this.footerSubText), 31, this.name), 31, this.theme);
    }

    public String toString() {
        List<Recommendation> list = this.recommendations;
        String str = this.footerText;
        String str2 = this.footerSubText;
        String str3 = this.name;
        String str4 = this.theme;
        String str5 = this.themeVariant;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("WirWrapUpRecommendationsStep(recommendations=", ", footerText=", str, ", footerSubText=", list);
        AbstractC11266d.m30444B(sbM79507k, str2, ", name=", str3, ", theme=");
        return AbstractC11266d.m30464r(sbM79507k, str4, ", themeVariant=", str5, ")");
    }

    public WirWrapUpRecommendationsStep(List<Recommendation> recommendations, String footerText, String footerSubText, String name, String theme, String themeVariant) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.recommendations = recommendations;
        this.footerText = footerText;
        this.footerSubText = footerSubText;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
    }
}
