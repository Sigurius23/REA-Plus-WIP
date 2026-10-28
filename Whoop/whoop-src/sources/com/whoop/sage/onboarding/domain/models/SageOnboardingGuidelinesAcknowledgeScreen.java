package com.whoop.sage.onboarding.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import hc3.AbstractC17176i;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J`\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b8\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010(¨\u0006C"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "backgroundImageUrl", "titleDisplay", "", "Lcom/whoop/sage/onboarding/domain/models/SageGuideline;", "guidelines", "primaryButtonTextDisplay", "secondaryButtonTextDisplay", "Lj72/g;", "primaryButtonNextId", "Lcom/whoop/navigation/e;", "secondaryButtonNavigation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Lj72/g;", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lj72/g;Lcom/whoop/navigation/e;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundImageUrl", "getTitleDisplay", "Ljava/util/List;", "getGuidelines", "getPrimaryButtonTextDisplay", "getSecondaryButtonTextDisplay", "Lj72/g;", "getPrimaryButtonNextId", "Lcom/whoop/navigation/e;", "getSecondaryButtonNavigation", "getSecondaryButtonNavigation$annotations", "()V", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageOnboardingGuidelinesAcknowledgeScreen implements SageOnboardingContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final List<SageGuideline> guidelines;
    private final EnumC21402g primaryButtonNextId;
    private final String primaryButtonTextDisplay;
    private final C9598e secondaryButtonNavigation;
    private final String secondaryButtonTextDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingGuidelinesAcknowledgeScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingGuidelinesAcknowledgeScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageOnboardingGuidelinesAcknowledgeScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(17)), null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(18)), AbstractC30060g.m92087G(enumC23463i, new C16497d0(19))};
    }

    public /* synthetic */ SageOnboardingGuidelinesAcknowledgeScreen(int i13, String str, String str2, List list, String str3, String str4, EnumC21402g enumC21402g, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SageOnboardingGuidelinesAcknowledgeScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.backgroundImageUrl = str;
        this.titleDisplay = str2;
        this.guidelines = list;
        this.primaryButtonTextDisplay = str3;
        this.secondaryButtonTextDisplay = str4;
        this.primaryButtonNextId = enumC21402g;
        this.secondaryButtonNavigation = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SageGuideline$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.sage.onboarding.presentation.SageOnboardingScreenId", EnumC21402g.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageOnboardingGuidelinesAcknowledgeScreen copy$default(SageOnboardingGuidelinesAcknowledgeScreen sageOnboardingGuidelinesAcknowledgeScreen, String str, String str2, List list, String str3, String str4, EnumC21402g enumC21402g, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageOnboardingGuidelinesAcknowledgeScreen.backgroundImageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = sageOnboardingGuidelinesAcknowledgeScreen.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            list = sageOnboardingGuidelinesAcknowledgeScreen.guidelines;
        }
        if ((i13 & 8) != 0) {
            str3 = sageOnboardingGuidelinesAcknowledgeScreen.primaryButtonTextDisplay;
        }
        if ((i13 & 16) != 0) {
            str4 = sageOnboardingGuidelinesAcknowledgeScreen.secondaryButtonTextDisplay;
        }
        if ((i13 & 32) != 0) {
            enumC21402g = sageOnboardingGuidelinesAcknowledgeScreen.primaryButtonNextId;
        }
        if ((i13 & 64) != 0) {
            c9598e = sageOnboardingGuidelinesAcknowledgeScreen.secondaryButtonNavigation;
        }
        EnumC21402g enumC21402g2 = enumC21402g;
        C9598e c9598e2 = c9598e;
        String str5 = str4;
        List list2 = list;
        return sageOnboardingGuidelinesAcknowledgeScreen.copy(str, str2, list2, str3, str5, enumC21402g2, c9598e2);
    }

    public static /* synthetic */ void getSecondaryButtonNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$sage_release(SageOnboardingGuidelinesAcknowledgeScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.guidelines);
        output.encodeStringElement(serialDesc, 3, self.primaryButtonTextDisplay);
        output.encodeStringElement(serialDesc, 4, self.secondaryButtonTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.primaryButtonNextId);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.secondaryButtonNavigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final List<SageGuideline> component3() {
        return this.guidelines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrimaryButtonTextDisplay() {
        return this.primaryButtonTextDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryButtonTextDisplay() {
        return this.secondaryButtonTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC21402g getPrimaryButtonNextId() {
        return this.primaryButtonNextId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getSecondaryButtonNavigation() {
        return this.secondaryButtonNavigation;
    }

    public final SageOnboardingGuidelinesAcknowledgeScreen copy(String backgroundImageUrl, String titleDisplay, List<SageGuideline> guidelines, String primaryButtonTextDisplay, String secondaryButtonTextDisplay, EnumC21402g primaryButtonNextId, C9598e secondaryButtonNavigation) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(guidelines, "guidelines");
        AbstractC22676k.m65750j(primaryButtonTextDisplay, "primaryButtonTextDisplay");
        AbstractC22676k.m65750j(secondaryButtonTextDisplay, "secondaryButtonTextDisplay");
        return new SageOnboardingGuidelinesAcknowledgeScreen(backgroundImageUrl, titleDisplay, guidelines, primaryButtonTextDisplay, secondaryButtonTextDisplay, primaryButtonNextId, secondaryButtonNavigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingGuidelinesAcknowledgeScreen)) {
            return false;
        }
        SageOnboardingGuidelinesAcknowledgeScreen sageOnboardingGuidelinesAcknowledgeScreen = (SageOnboardingGuidelinesAcknowledgeScreen) other;
        return AbstractC22676k.m65745e(this.backgroundImageUrl, sageOnboardingGuidelinesAcknowledgeScreen.backgroundImageUrl) && AbstractC22676k.m65745e(this.titleDisplay, sageOnboardingGuidelinesAcknowledgeScreen.titleDisplay) && AbstractC22676k.m65745e(this.guidelines, sageOnboardingGuidelinesAcknowledgeScreen.guidelines) && AbstractC22676k.m65745e(this.primaryButtonTextDisplay, sageOnboardingGuidelinesAcknowledgeScreen.primaryButtonTextDisplay) && AbstractC22676k.m65745e(this.secondaryButtonTextDisplay, sageOnboardingGuidelinesAcknowledgeScreen.secondaryButtonTextDisplay) && this.primaryButtonNextId == sageOnboardingGuidelinesAcknowledgeScreen.primaryButtonNextId && AbstractC22676k.m65745e(this.secondaryButtonNavigation, sageOnboardingGuidelinesAcknowledgeScreen.secondaryButtonNavigation);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<SageGuideline> getGuidelines() {
        return this.guidelines;
    }

    public final EnumC21402g getPrimaryButtonNextId() {
        return this.primaryButtonNextId;
    }

    public final String getPrimaryButtonTextDisplay() {
        return this.primaryButtonTextDisplay;
    }

    public final C9598e getSecondaryButtonNavigation() {
        return this.secondaryButtonNavigation;
    }

    public final String getSecondaryButtonTextDisplay() {
        return this.secondaryButtonTextDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.backgroundImageUrl.hashCode() * 31, 31, this.titleDisplay), 31, this.guidelines), 31, this.primaryButtonTextDisplay), 31, this.secondaryButtonTextDisplay);
        EnumC21402g enumC21402g = this.primaryButtonNextId;
        int iHashCode = (iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode())) * 31;
        C9598e c9598e = this.secondaryButtonNavigation;
        return iHashCode + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.backgroundImageUrl;
        String str2 = this.titleDisplay;
        List<SageGuideline> list = this.guidelines;
        String str3 = this.primaryButtonTextDisplay;
        String str4 = this.secondaryButtonTextDisplay;
        EnumC21402g enumC21402g = this.primaryButtonNextId;
        C9598e c9598e = this.secondaryButtonNavigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageOnboardingGuidelinesAcknowledgeScreen(backgroundImageUrl=", str, ", titleDisplay=", str2, ", guidelines=");
        AbstractC17176i.m48511m(", primaryButtonTextDisplay=", str3, ", secondaryButtonTextDisplay=", sbM32001t, list);
        sbM32001t.append(str4);
        sbM32001t.append(", primaryButtonNextId=");
        sbM32001t.append(enumC21402g);
        sbM32001t.append(", secondaryButtonNavigation=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public SageOnboardingGuidelinesAcknowledgeScreen(String backgroundImageUrl, String titleDisplay, List<SageGuideline> guidelines, String primaryButtonTextDisplay, String secondaryButtonTextDisplay, EnumC21402g enumC21402g, C9598e c9598e) {
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(guidelines, "guidelines");
        AbstractC22676k.m65750j(primaryButtonTextDisplay, "primaryButtonTextDisplay");
        AbstractC22676k.m65750j(secondaryButtonTextDisplay, "secondaryButtonTextDisplay");
        this.backgroundImageUrl = backgroundImageUrl;
        this.titleDisplay = titleDisplay;
        this.guidelines = guidelines;
        this.primaryButtonTextDisplay = primaryButtonTextDisplay;
        this.secondaryButtonTextDisplay = secondaryButtonTextDisplay;
        this.primaryButtonNextId = enumC21402g;
        this.secondaryButtonNavigation = c9598e;
    }
}
