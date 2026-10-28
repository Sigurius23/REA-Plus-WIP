package com.whoop.whattoexpect.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001f¨\u00061"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;", "", "", "textDisplay", "", "currentStep", "totalSteps", "", "Lcom/whoop/whattoexpect/domain/models/TextDisplayOption;", "textDisplayOptions", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$what_to_expect_release", "(Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IILjava/util/List;)Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextDisplay", "I", "getCurrentStep", "getTotalSteps", "Ljava/util/List;", "getTextDisplayOptions", "Companion", "$serializer", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CurrentProgressSteps {
    private final int currentStep;
    private final String textDisplay;
    private final List<TextDisplayOption> textDisplayOptions;
    private final int totalSteps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(27))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;", "serializer", "()Lwc3/c;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CurrentProgressSteps$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CurrentProgressSteps(int i13, String str, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CurrentProgressSteps$$serializer.INSTANCE.getDescriptor());
        }
        this.textDisplay = str;
        this.currentStep = i14;
        this.totalSteps = i15;
        this.textDisplayOptions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TextDisplayOption$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrentProgressSteps copy$default(CurrentProgressSteps currentProgressSteps, String str, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = currentProgressSteps.textDisplay;
        }
        if ((i15 & 2) != 0) {
            i13 = currentProgressSteps.currentStep;
        }
        if ((i15 & 4) != 0) {
            i14 = currentProgressSteps.totalSteps;
        }
        if ((i15 & 8) != 0) {
            list = currentProgressSteps.textDisplayOptions;
        }
        return currentProgressSteps.copy(str, i13, i14, list);
    }

    public static final /* synthetic */ void write$Self$what_to_expect_release(CurrentProgressSteps self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.textDisplay);
        output.encodeIntElement(serialDesc, 1, self.currentStep);
        output.encodeIntElement(serialDesc, 2, self.totalSteps);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textDisplayOptions);
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

    public final CurrentProgressSteps copy(String textDisplay, int currentStep, int totalSteps, List<TextDisplayOption> textDisplayOptions) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        return new CurrentProgressSteps(textDisplay, currentStep, totalSteps, textDisplayOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentProgressSteps)) {
            return false;
        }
        CurrentProgressSteps currentProgressSteps = (CurrentProgressSteps) other;
        return AbstractC22676k.m65745e(this.textDisplay, currentProgressSteps.textDisplay) && this.currentStep == currentProgressSteps.currentStep && this.totalSteps == currentProgressSteps.totalSteps && AbstractC22676k.m65745e(this.textDisplayOptions, currentProgressSteps.textDisplayOptions);
    }

    public final int getCurrentStep() {
        return this.currentStep;
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
        return this.textDisplayOptions.hashCode() + AbstractC11266d.m30448b(this.totalSteps, AbstractC11266d.m30448b(this.currentStep, this.textDisplay.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.textDisplay;
        int i13 = this.currentStep;
        int i14 = this.totalSteps;
        List<TextDisplayOption> list = this.textDisplayOptions;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "CurrentProgressSteps(textDisplay=", str, ", currentStep=", ", totalSteps=");
        sbM30467u.append(i14);
        sbM30467u.append(", textDisplayOptions=");
        sbM30467u.append(list);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public CurrentProgressSteps(String textDisplay, int i13, int i14, List<TextDisplayOption> textDisplayOptions) {
        AbstractC22676k.m65750j(textDisplay, "textDisplay");
        AbstractC22676k.m65750j(textDisplayOptions, "textDisplayOptions");
        this.textDisplay = textDisplay;
        this.currentStep = i13;
        this.totalSteps = i14;
        this.textDisplayOptions = textDisplayOptions;
    }
}
