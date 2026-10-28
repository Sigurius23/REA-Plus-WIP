package com.whoop.sleep.coach.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "", "", "modalTitleDisplay", "modalSubtextDisplay", "buttonActionDisplayText", "dismissActionDisplayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModalTitleDisplay", "getModalSubtextDisplay", "getButtonActionDisplayText", "getDismissActionDisplayText", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepCoachInteractionModal {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("button_action_display_text")
    private final String buttonActionDisplayText;

    @SerializedName("dismiss_action_display_text")
    private final String dismissActionDisplayText;

    @SerializedName("modal_subtext_display")
    private final String modalSubtextDisplay;

    @SerializedName("modal_title_display")
    private final String modalTitleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepCoachInteractionModal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepCoachInteractionModal(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SleepCoachInteractionModal$$serializer.INSTANCE.getDescriptor());
        }
        this.modalTitleDisplay = str;
        this.modalSubtextDisplay = str2;
        this.buttonActionDisplayText = str3;
        this.dismissActionDisplayText = str4;
    }

    public static /* synthetic */ SleepCoachInteractionModal copy$default(SleepCoachInteractionModal sleepCoachInteractionModal, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepCoachInteractionModal.modalTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = sleepCoachInteractionModal.modalSubtextDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = sleepCoachInteractionModal.buttonActionDisplayText;
        }
        if ((i13 & 8) != 0) {
            str4 = sleepCoachInteractionModal.dismissActionDisplayText;
        }
        return sleepCoachInteractionModal.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(SleepCoachInteractionModal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.modalTitleDisplay);
        output.encodeStringElement(serialDesc, 1, self.modalSubtextDisplay);
        output.encodeStringElement(serialDesc, 2, self.buttonActionDisplayText);
        output.encodeStringElement(serialDesc, 3, self.dismissActionDisplayText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModalTitleDisplay() {
        return this.modalTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModalSubtextDisplay() {
        return this.modalSubtextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonActionDisplayText() {
        return this.buttonActionDisplayText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDismissActionDisplayText() {
        return this.dismissActionDisplayText;
    }

    public final SleepCoachInteractionModal copy(String modalTitleDisplay, String modalSubtextDisplay, String buttonActionDisplayText, String dismissActionDisplayText) {
        AbstractC22676k.m65750j(modalTitleDisplay, "modalTitleDisplay");
        AbstractC22676k.m65750j(modalSubtextDisplay, "modalSubtextDisplay");
        AbstractC22676k.m65750j(buttonActionDisplayText, "buttonActionDisplayText");
        AbstractC22676k.m65750j(dismissActionDisplayText, "dismissActionDisplayText");
        return new SleepCoachInteractionModal(modalTitleDisplay, modalSubtextDisplay, buttonActionDisplayText, dismissActionDisplayText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepCoachInteractionModal)) {
            return false;
        }
        SleepCoachInteractionModal sleepCoachInteractionModal = (SleepCoachInteractionModal) other;
        return AbstractC22676k.m65745e(this.modalTitleDisplay, sleepCoachInteractionModal.modalTitleDisplay) && AbstractC22676k.m65745e(this.modalSubtextDisplay, sleepCoachInteractionModal.modalSubtextDisplay) && AbstractC22676k.m65745e(this.buttonActionDisplayText, sleepCoachInteractionModal.buttonActionDisplayText) && AbstractC22676k.m65745e(this.dismissActionDisplayText, sleepCoachInteractionModal.dismissActionDisplayText);
    }

    public final String getButtonActionDisplayText() {
        return this.buttonActionDisplayText;
    }

    public final String getDismissActionDisplayText() {
        return this.dismissActionDisplayText;
    }

    public final String getModalSubtextDisplay() {
        return this.modalSubtextDisplay;
    }

    public final String getModalTitleDisplay() {
        return this.modalTitleDisplay;
    }

    public int hashCode() {
        return this.dismissActionDisplayText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.modalTitleDisplay.hashCode() * 31, 31, this.modalSubtextDisplay), 31, this.buttonActionDisplayText);
    }

    public String toString() {
        String str = this.modalTitleDisplay;
        String str2 = this.modalSubtextDisplay;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("SleepCoachInteractionModal(modalTitleDisplay=", str, ", modalSubtextDisplay=", str2, ", buttonActionDisplayText="), this.buttonActionDisplayText, ", dismissActionDisplayText=", this.dismissActionDisplayText, ")");
    }

    public SleepCoachInteractionModal(String modalTitleDisplay, String modalSubtextDisplay, String buttonActionDisplayText, String dismissActionDisplayText) {
        AbstractC22676k.m65750j(modalTitleDisplay, "modalTitleDisplay");
        AbstractC22676k.m65750j(modalSubtextDisplay, "modalSubtextDisplay");
        AbstractC22676k.m65750j(buttonActionDisplayText, "buttonActionDisplayText");
        AbstractC22676k.m65750j(dismissActionDisplayText, "dismissActionDisplayText");
        this.modalTitleDisplay = modalTitleDisplay;
        this.modalSubtextDisplay = modalSubtextDisplay;
        this.buttonActionDisplayText = buttonActionDisplayText;
        this.dismissActionDisplayText = dismissActionDisplayText;
    }
}
