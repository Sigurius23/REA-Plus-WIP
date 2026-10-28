package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import j72.EnumC21402g;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "imageUrl", "title", "subtitle", "", "Lcom/whoop/sage/onboarding/domain/models/SageInfoCheckboxSection;", "sections", "checkboxText", "nextButtonText", "Lj72/g;", "buttonNextId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lj72/g;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTitle", "getSubtitle", "Ljava/util/List;", "getSections", "getCheckboxText", "getNextButtonText", "Lj72/g;", "getButtonNextId", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageOnboardingInfoCheckboxScreen implements SageOnboardingContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final EnumC21402g buttonNextId;
    private final String checkboxText;
    private final String imageUrl;
    private final String nextButtonText;
    private final List<SageInfoCheckboxSection> sections;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingInfoCheckboxScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingInfoCheckboxScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageOnboardingInfoCheckboxScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(20)), null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(21))};
    }

    public /* synthetic */ SageOnboardingInfoCheckboxScreen(int i13, String str, String str2, String str3, List list, String str4, String str5, EnumC21402g enumC21402g, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SageOnboardingInfoCheckboxScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.sections = list;
        this.checkboxText = str4;
        this.nextButtonText = str5;
        this.buttonNextId = enumC21402g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SageInfoCheckboxSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.sage.onboarding.presentation.SageOnboardingScreenId", EnumC21402g.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageOnboardingInfoCheckboxScreen copy$default(SageOnboardingInfoCheckboxScreen sageOnboardingInfoCheckboxScreen, String str, String str2, String str3, List list, String str4, String str5, EnumC21402g enumC21402g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageOnboardingInfoCheckboxScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = sageOnboardingInfoCheckboxScreen.title;
        }
        if ((i13 & 4) != 0) {
            str3 = sageOnboardingInfoCheckboxScreen.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = sageOnboardingInfoCheckboxScreen.sections;
        }
        if ((i13 & 16) != 0) {
            str4 = sageOnboardingInfoCheckboxScreen.checkboxText;
        }
        if ((i13 & 32) != 0) {
            str5 = sageOnboardingInfoCheckboxScreen.nextButtonText;
        }
        if ((i13 & 64) != 0) {
            enumC21402g = sageOnboardingInfoCheckboxScreen.buttonNextId;
        }
        String str6 = str5;
        EnumC21402g enumC21402g2 = enumC21402g;
        String str7 = str4;
        String str8 = str3;
        return sageOnboardingInfoCheckboxScreen.copy(str, str2, str8, list, str7, str6, enumC21402g2);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageOnboardingInfoCheckboxScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sections);
        output.encodeStringElement(serialDesc, 4, self.checkboxText);
        output.encodeStringElement(serialDesc, 5, self.nextButtonText);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.buttonNextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<SageInfoCheckboxSection> component4() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCheckboxText() {
        return this.checkboxText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final SageOnboardingInfoCheckboxScreen copy(String imageUrl, String title, String subtitle, List<SageInfoCheckboxSection> sections, String checkboxText, String nextButtonText, EnumC21402g buttonNextId) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkboxText, "checkboxText");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        return new SageOnboardingInfoCheckboxScreen(imageUrl, title, subtitle, sections, checkboxText, nextButtonText, buttonNextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingInfoCheckboxScreen)) {
            return false;
        }
        SageOnboardingInfoCheckboxScreen sageOnboardingInfoCheckboxScreen = (SageOnboardingInfoCheckboxScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, sageOnboardingInfoCheckboxScreen.imageUrl) && AbstractC22676k.m65745e(this.title, sageOnboardingInfoCheckboxScreen.title) && AbstractC22676k.m65745e(this.subtitle, sageOnboardingInfoCheckboxScreen.subtitle) && AbstractC22676k.m65745e(this.sections, sageOnboardingInfoCheckboxScreen.sections) && AbstractC22676k.m65745e(this.checkboxText, sageOnboardingInfoCheckboxScreen.checkboxText) && AbstractC22676k.m65745e(this.nextButtonText, sageOnboardingInfoCheckboxScreen.nextButtonText) && this.buttonNextId == sageOnboardingInfoCheckboxScreen.buttonNextId;
    }

    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final String getCheckboxText() {
        return this.checkboxText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final List<SageInfoCheckboxSection> getSections() {
        return this.sections;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.sections), 31, this.checkboxText), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        return iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode());
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<SageInfoCheckboxSection> list = this.sections;
        String str4 = this.checkboxText;
        String str5 = this.nextButtonText;
        EnumC21402g enumC21402g = this.buttonNextId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageOnboardingInfoCheckboxScreen(imageUrl=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114694v(str3, ", sections=", ", checkboxText=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str4, ", nextButtonText=", str5, ", buttonNextId=");
        sbM32001t.append(enumC21402g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SageOnboardingInfoCheckboxScreen(String imageUrl, String title, String subtitle, List<SageInfoCheckboxSection> sections, String checkboxText, String nextButtonText, EnumC21402g enumC21402g) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkboxText, "checkboxText");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.sections = sections;
        this.checkboxText = checkboxText;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
    }
}
