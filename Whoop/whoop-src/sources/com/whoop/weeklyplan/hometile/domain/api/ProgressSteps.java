package com.whoop.weeklyplan.hometile.domain.api;

import a13.C0148f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010#¨\u00067"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;", "", "", "textDisplay", "", "currentStep", "totalSteps", "", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;", "textDisplayOptions", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "style", "<init>", "(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "copy", "(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "I", "getCurrentStep", "getTotalSteps", "Ljava/util/List;", "getTextDisplayOptions", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "getStyle", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressSteps {
    private static final InterfaceC23462h[] $childSerializers;
    private final int currentStep;
    private final TextDisplayStyle style;
    private final String textDisplay;
    private final List<TextDisplayOption> textDisplayOptions;
    private final int totalSteps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressSteps$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C0148f(20)), AbstractC30060g.m92087G(enumC23463i, new C0148f(21))};
    }

    public /* synthetic */ ProgressSteps(int i13, String str, int i14, int i15, List list, TextDisplayStyle textDisplayStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ProgressSteps$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.currentStep = i14;
        this.totalSteps = i15;
        this.textDisplayOptions = list;
        this.style = textDisplayStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TextDisplayOption$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weeklyplan.hometile.domain.api.TextDisplayStyle", TextDisplayStyle.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressSteps copy$default(ProgressSteps progressSteps, String str, int i13, int i14, List list, TextDisplayStyle textDisplayStyle, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = progressSteps.textDisplay;
        }
        if ((i15 & 2) != 0) {
            i13 = progressSteps.currentStep;
        }
        if ((i15 & 4) != 0) {
            i14 = progressSteps.totalSteps;
        }
        if ((i15 & 8) != 0) {
            list = progressSteps.textDisplayOptions;
        }
        if ((i15 & 16) != 0) {
            textDisplayStyle = progressSteps.style;
        }
        TextDisplayStyle textDisplayStyle2 = textDisplayStyle;
        int i16 = i14;
        return progressSteps.copy(str, i13, i16, list, textDisplayStyle2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressSteps self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.textDisplay);
        output.encodeIntElement(serialDesc, 1, self.currentStep);
        output.encodeIntElement(serialDesc, 2, self.totalSteps);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textDisplayOptions);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextDisplay() {
        return this.textDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final List<TextDisplayOption> component4() {
        return this.textDisplayOptions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final ProgressSteps copy(String textDisplay, int currentStep, int totalSteps, List<TextDisplayOption> textDisplayOptions, TextDisplayStyle style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        AbstractC22676k.m65750j(style, "style");
        return new ProgressSteps(textDisplay, currentStep, totalSteps, textDisplayOptions, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressSteps)) {
            return false;
        }
        ProgressSteps progressSteps = (ProgressSteps) other;
        return AbstractC22676k.m65745e(this.textDisplay, progressSteps.textDisplay) && this.currentStep == progressSteps.currentStep && this.totalSteps == progressSteps.totalSteps && AbstractC22676k.m65745e(this.textDisplayOptions, progressSteps.textDisplayOptions) && this.style == progressSteps.style;
    }

    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final String getTextDisplay() {
        return this.textDisplay;
    }

    public final List<TextDisplayOption> getTextDisplayOptions() {
        return this.textDisplayOptions;
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.totalSteps, AbstractC11266d.m30448b(this.currentStep, this.textDisplay.hashCode() * 31, 31), 31), 31, this.textDisplayOptions);
    }

    public String toString() {
        String str = this.textDisplay;
        int i13 = this.currentStep;
        int i14 = this.totalSteps;
        List<TextDisplayOption> list = this.textDisplayOptions;
        TextDisplayStyle textDisplayStyle = this.style;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ProgressSteps(textDisplay=", str, ", currentStep=", ", totalSteps=");
        sbM30467u.append(i14);
        sbM30467u.append(", textDisplayOptions=");
        sbM30467u.append(list);
        sbM30467u.append(", style=");
        sbM30467u.append(textDisplayStyle);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public ProgressSteps(String textDisplay, int i13, int i14, List<TextDisplayOption> textDisplayOptions, TextDisplayStyle style) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        AbstractC22676k.m65750j(style, "style");
        this.textDisplay = textDisplay;
        this.currentStep = i13;
        this.totalSteps = i14;
        this.textDisplayOptions = textDisplayOptions;
        this.style = style;
    }
}
