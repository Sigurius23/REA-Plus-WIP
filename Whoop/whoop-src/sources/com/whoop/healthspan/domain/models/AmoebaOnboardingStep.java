package com.whoop.healthspan.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "subtitleDisplay", "buttonTextDisplay", "", "buttonRevealsAmoeba", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Z", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitleDisplay", "getSubtitleDisplay", "getButtonTextDisplay", "Z", "getButtonRevealsAmoeba", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AmoebaOnboardingStep {
    private final boolean buttonRevealsAmoeba;
    private final TextResource buttonTextDisplay;
    private final TextResource subtitleDisplay;
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/AmoebaOnboardingStep;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AmoebaOnboardingStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AmoebaOnboardingStep(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AmoebaOnboardingStep$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = textResource;
        this.subtitleDisplay = textResource2;
        this.buttonTextDisplay = textResource3;
        this.buttonRevealsAmoeba = z4;
    }

    public static /* synthetic */ AmoebaOnboardingStep copy$default(AmoebaOnboardingStep amoebaOnboardingStep, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = amoebaOnboardingStep.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = amoebaOnboardingStep.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource3 = amoebaOnboardingStep.buttonTextDisplay;
        }
        if ((i13 & 8) != 0) {
            z4 = amoebaOnboardingStep.buttonRevealsAmoeba;
        }
        return amoebaOnboardingStep.copy(textResource, textResource2, textResource3, z4);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(AmoebaOnboardingStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.subtitleDisplay);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.buttonTextDisplay);
        output.encodeBooleanElement(serialDesc, 3, self.buttonRevealsAmoeba);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getButtonRevealsAmoeba() {
        return this.buttonRevealsAmoeba;
    }

    public final AmoebaOnboardingStep copy(TextResource titleDisplay, TextResource subtitleDisplay, TextResource buttonTextDisplay, boolean buttonRevealsAmoeba) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        return new AmoebaOnboardingStep(titleDisplay, subtitleDisplay, buttonTextDisplay, buttonRevealsAmoeba);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmoebaOnboardingStep)) {
            return false;
        }
        AmoebaOnboardingStep amoebaOnboardingStep = (AmoebaOnboardingStep) other;
        return AbstractC22676k.m65745e(this.titleDisplay, amoebaOnboardingStep.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, amoebaOnboardingStep.subtitleDisplay) && AbstractC22676k.m65745e(this.buttonTextDisplay, amoebaOnboardingStep.buttonTextDisplay) && this.buttonRevealsAmoeba == amoebaOnboardingStep.buttonRevealsAmoeba;
    }

    public final boolean getButtonRevealsAmoeba() {
        return this.buttonRevealsAmoeba;
    }

    public final TextResource getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.buttonRevealsAmoeba) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.subtitleDisplay, 31), this.buttonTextDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.subtitleDisplay;
        TextResource textResource3 = this.buttonTextDisplay;
        boolean z4 = this.buttonRevealsAmoeba;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AmoebaOnboardingStep(titleDisplay=", textResource, ", subtitleDisplay=", textResource2, ", buttonTextDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", buttonRevealsAmoeba=");
        sbM106658q.append(z4);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public AmoebaOnboardingStep(TextResource titleDisplay, TextResource subtitleDisplay, TextResource buttonTextDisplay, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.buttonTextDisplay = buttonTextDisplay;
        this.buttonRevealsAmoeba = z4;
    }
}
