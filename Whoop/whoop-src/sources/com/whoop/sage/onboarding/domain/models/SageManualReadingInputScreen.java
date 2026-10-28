package com.whoop.sage.onboarding.domain.models;

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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'Jb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b8\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b=\u0010'¨\u0006A"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "titleDisplay", "descriptionDisplay", "", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputSectionText;", "inputSections", "nextButtonText", "Lj72/g;", "buttonNextId", "Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "systolicRange", "diastolicRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj72/g;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj72/g;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lj72/g;", "component6", "()Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj72/g;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;Lcom/whoop/sage/onboarding/domain/models/SageInputRange;)Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getDescriptionDisplay", "Ljava/util/List;", "getInputSections", "getNextButtonText", "Lj72/g;", "getButtonNextId", "Lcom/whoop/sage/onboarding/domain/models/SageInputRange;", "getSystolicRange", "getDiastolicRange", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageManualReadingInputScreen implements SageOnboardingContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final EnumC21402g buttonNextId;
    private final String descriptionDisplay;
    private final SageInputRange diastolicRange;
    private final List<SageManualReadingInputSectionText> inputSections;
    private final String nextButtonText;
    private final SageInputRange systolicRange;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageManualReadingInputScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageManualReadingInputScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageManualReadingInputScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(15)), null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(16)), null, null};
    }

    public /* synthetic */ SageManualReadingInputScreen(int i13, String str, String str2, List list, String str3, EnumC21402g enumC21402g, SageInputRange sageInputRange, SageInputRange sageInputRange2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SageManualReadingInputScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.descriptionDisplay = str2;
        this.inputSections = list;
        this.nextButtonText = str3;
        this.buttonNextId = enumC21402g;
        this.systolicRange = sageInputRange;
        this.diastolicRange = sageInputRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SageManualReadingInputSectionText$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.sage.onboarding.presentation.SageOnboardingScreenId", EnumC21402g.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageManualReadingInputScreen copy$default(SageManualReadingInputScreen sageManualReadingInputScreen, String str, String str2, List list, String str3, EnumC21402g enumC21402g, SageInputRange sageInputRange, SageInputRange sageInputRange2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageManualReadingInputScreen.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = sageManualReadingInputScreen.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            list = sageManualReadingInputScreen.inputSections;
        }
        if ((i13 & 8) != 0) {
            str3 = sageManualReadingInputScreen.nextButtonText;
        }
        if ((i13 & 16) != 0) {
            enumC21402g = sageManualReadingInputScreen.buttonNextId;
        }
        if ((i13 & 32) != 0) {
            sageInputRange = sageManualReadingInputScreen.systolicRange;
        }
        if ((i13 & 64) != 0) {
            sageInputRange2 = sageManualReadingInputScreen.diastolicRange;
        }
        SageInputRange sageInputRange3 = sageInputRange;
        SageInputRange sageInputRange4 = sageInputRange2;
        EnumC21402g enumC21402g2 = enumC21402g;
        List list2 = list;
        return sageManualReadingInputScreen.copy(str, str2, list2, str3, enumC21402g2, sageInputRange3, sageInputRange4);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageManualReadingInputScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.inputSections);
        output.encodeStringElement(serialDesc, 3, self.nextButtonText);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.buttonNextId);
        SageInputRange$$serializer sageInputRange$$serializer = SageInputRange$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, sageInputRange$$serializer, self.systolicRange);
        output.encodeNullableSerializableElement(serialDesc, 6, sageInputRange$$serializer, self.diastolicRange);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final List<SageManualReadingInputSectionText> component3() {
        return this.inputSections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SageInputRange getSystolicRange() {
        return this.systolicRange;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SageInputRange getDiastolicRange() {
        return this.diastolicRange;
    }

    public final SageManualReadingInputScreen copy(String titleDisplay, String descriptionDisplay, List<SageManualReadingInputSectionText> inputSections, String nextButtonText, EnumC21402g buttonNextId, SageInputRange systolicRange, SageInputRange diastolicRange) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(inputSections, "inputSections");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        return new SageManualReadingInputScreen(titleDisplay, descriptionDisplay, inputSections, nextButtonText, buttonNextId, systolicRange, diastolicRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageManualReadingInputScreen)) {
            return false;
        }
        SageManualReadingInputScreen sageManualReadingInputScreen = (SageManualReadingInputScreen) other;
        return AbstractC22676k.m65745e(this.titleDisplay, sageManualReadingInputScreen.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, sageManualReadingInputScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.inputSections, sageManualReadingInputScreen.inputSections) && AbstractC22676k.m65745e(this.nextButtonText, sageManualReadingInputScreen.nextButtonText) && this.buttonNextId == sageManualReadingInputScreen.buttonNextId && AbstractC22676k.m65745e(this.systolicRange, sageManualReadingInputScreen.systolicRange) && AbstractC22676k.m65745e(this.diastolicRange, sageManualReadingInputScreen.diastolicRange);
    }

    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final SageInputRange getDiastolicRange() {
        return this.diastolicRange;
    }

    public final List<SageManualReadingInputSectionText> getInputSections() {
        return this.inputSections;
    }

    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    public final SageInputRange getSystolicRange() {
        return this.systolicRange;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.descriptionDisplay), 31, this.inputSections), 31, this.nextButtonText);
        EnumC21402g enumC21402g = this.buttonNextId;
        int iHashCode = (iM30450d + (enumC21402g == null ? 0 : enumC21402g.hashCode())) * 31;
        SageInputRange sageInputRange = this.systolicRange;
        int iHashCode2 = (iHashCode + (sageInputRange == null ? 0 : sageInputRange.hashCode())) * 31;
        SageInputRange sageInputRange2 = this.diastolicRange;
        return iHashCode2 + (sageInputRange2 != null ? sageInputRange2.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        List<SageManualReadingInputSectionText> list = this.inputSections;
        String str3 = this.nextButtonText;
        EnumC21402g enumC21402g = this.buttonNextId;
        SageInputRange sageInputRange = this.systolicRange;
        SageInputRange sageInputRange2 = this.diastolicRange;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageManualReadingInputScreen(titleDisplay=", str, ", descriptionDisplay=", str2, ", inputSections=");
        AbstractC17176i.m48511m(", nextButtonText=", str3, ", buttonNextId=", sbM32001t, list);
        sbM32001t.append(enumC21402g);
        sbM32001t.append(", systolicRange=");
        sbM32001t.append(sageInputRange);
        sbM32001t.append(", diastolicRange=");
        sbM32001t.append(sageInputRange2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SageManualReadingInputScreen(String titleDisplay, String descriptionDisplay, List<SageManualReadingInputSectionText> inputSections, String nextButtonText, EnumC21402g enumC21402g, SageInputRange sageInputRange, SageInputRange sageInputRange2) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(inputSections, "inputSections");
        AbstractC22676k.m65750j(nextButtonText, "nextButtonText");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.inputSections = inputSections;
        this.nextButtonText = nextButtonText;
        this.buttonNextId = enumC21402g;
        this.systolicRange = sageInputRange;
        this.diastolicRange = sageInputRange2;
    }
}
