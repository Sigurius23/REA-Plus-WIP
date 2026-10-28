package com.whoop.sage.onboarding.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import j72.EnumC21402g;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "", "title", "buttonTitle", "", "optionLimit", "", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionOption;", "options", "Lj72/g;", "buttonNextId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lj72/g;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lj72/g;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/util/List;", "component5", "()Lj72/g;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lj72/g;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getButtonTitle", "Ljava/lang/Integer;", "getOptionLimit", "Ljava/util/List;", "getOptions", "Lj72/g;", "getButtonNextId", "Companion", "$serializer", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageOnboardingSelectionScreen implements SageOnboardingContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final EnumC21402g buttonNextId;
    private final String buttonTitle;
    private final Integer optionLimit;
    private final List<SageOnboardingSelectionOption> options;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingSelectionScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSelectionScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageOnboardingSelectionScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16497d0(27)), AbstractC30060g.m92087G(enumC23463i, new C16497d0(28))};
    }

    public /* synthetic */ SageOnboardingSelectionScreen(int i13, String str, String str2, Integer num, List list, EnumC21402g enumC21402g, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SageOnboardingSelectionScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.buttonTitle = str2;
        this.optionLimit = num;
        this.options = list;
        this.buttonNextId = enumC21402g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SageOnboardingSelectionOption$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.sage.onboarding.presentation.SageOnboardingScreenId", EnumC21402g.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SageOnboardingSelectionScreen copy$default(SageOnboardingSelectionScreen sageOnboardingSelectionScreen, String str, String str2, Integer num, List list, EnumC21402g enumC21402g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageOnboardingSelectionScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = sageOnboardingSelectionScreen.buttonTitle;
        }
        if ((i13 & 4) != 0) {
            num = sageOnboardingSelectionScreen.optionLimit;
        }
        if ((i13 & 8) != 0) {
            list = sageOnboardingSelectionScreen.options;
        }
        if ((i13 & 16) != 0) {
            enumC21402g = sageOnboardingSelectionScreen.buttonNextId;
        }
        EnumC21402g enumC21402g2 = enumC21402g;
        Integer num2 = num;
        return sageOnboardingSelectionScreen.copy(str, str2, num2, list, enumC21402g2);
    }

    public static final /* synthetic */ void write$Self$sage_release(SageOnboardingSelectionScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.optionLimit);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.options);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.buttonNextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOptionLimit() {
        return this.optionLimit;
    }

    public final List<SageOnboardingSelectionOption> component4() {
        return this.options;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final SageOnboardingSelectionScreen copy(String title, String buttonTitle, Integer optionLimit, List<SageOnboardingSelectionOption> options, EnumC21402g buttonNextId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        return new SageOnboardingSelectionScreen(title, buttonTitle, optionLimit, options, buttonNextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingSelectionScreen)) {
            return false;
        }
        SageOnboardingSelectionScreen sageOnboardingSelectionScreen = (SageOnboardingSelectionScreen) other;
        return AbstractC22676k.m65745e(this.title, sageOnboardingSelectionScreen.title) && AbstractC22676k.m65745e(this.buttonTitle, sageOnboardingSelectionScreen.buttonTitle) && AbstractC22676k.m65745e(this.optionLimit, sageOnboardingSelectionScreen.optionLimit) && AbstractC22676k.m65745e(this.options, sageOnboardingSelectionScreen.options) && this.buttonNextId == sageOnboardingSelectionScreen.buttonNextId;
    }

    public final EnumC21402g getButtonNextId() {
        return this.buttonNextId;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final Integer getOptionLimit() {
        return this.optionLimit;
    }

    public final List<SageOnboardingSelectionOption> getOptions() {
        return this.options;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.buttonTitle);
        Integer num = this.optionLimit;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31, this.options);
        EnumC21402g enumC21402g = this.buttonNextId;
        return iM31983b + (enumC21402g != null ? enumC21402g.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.buttonTitle;
        Integer num = this.optionLimit;
        List<SageOnboardingSelectionOption> list = this.options;
        EnumC21402g enumC21402g = this.buttonNextId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageOnboardingSelectionScreen(title=", str, ", buttonTitle=", str2, ", optionLimit=");
        sbM32001t.append(num);
        sbM32001t.append(", options=");
        sbM32001t.append(list);
        sbM32001t.append(", buttonNextId=");
        sbM32001t.append(enumC21402g);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SageOnboardingSelectionScreen(String title, String buttonTitle, Integer num, List<SageOnboardingSelectionOption> options, EnumC21402g enumC21402g) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.title = title;
        this.buttonTitle = buttonTitle;
        this.optionLimit = num;
        this.options = options;
        this.buttonNextId = enumC21402g;
    }
}
