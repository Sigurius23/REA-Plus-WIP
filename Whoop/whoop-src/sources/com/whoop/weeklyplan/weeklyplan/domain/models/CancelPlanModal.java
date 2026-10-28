package com.whoop.weeklyplan.weeklyplan.domain.models;

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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "", "", "titleDisplay", "descriptionDisplay", "buttonDisplay", "cancelDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getDescriptionDisplay", "getButtonDisplay", "getCancelDisplay", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CancelPlanModal {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonDisplay;
    private final String cancelDisplay;
    private final String descriptionDisplay;
    private final String titleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/CancelPlanModal;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CancelPlanModal$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CancelPlanModal(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CancelPlanModal$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.descriptionDisplay = str2;
        this.buttonDisplay = str3;
        this.cancelDisplay = str4;
    }

    public static /* synthetic */ CancelPlanModal copy$default(CancelPlanModal cancelPlanModal, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cancelPlanModal.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = cancelPlanModal.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = cancelPlanModal.buttonDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = cancelPlanModal.cancelDisplay;
        }
        return cancelPlanModal.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(CancelPlanModal self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 2, self.buttonDisplay);
        output.encodeStringElement(serialDesc, 3, self.cancelDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCancelDisplay() {
        return this.cancelDisplay;
    }

    public final CancelPlanModal copy(String titleDisplay, String descriptionDisplay, String buttonDisplay, String cancelDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(cancelDisplay, "cancelDisplay");
        return new CancelPlanModal(titleDisplay, descriptionDisplay, buttonDisplay, cancelDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelPlanModal)) {
            return false;
        }
        CancelPlanModal cancelPlanModal = (CancelPlanModal) other;
        return AbstractC22676k.m65745e(this.titleDisplay, cancelPlanModal.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, cancelPlanModal.descriptionDisplay) && AbstractC22676k.m65745e(this.buttonDisplay, cancelPlanModal.buttonDisplay) && AbstractC22676k.m65745e(this.cancelDisplay, cancelPlanModal.cancelDisplay);
    }

    public final String getButtonDisplay() {
        return this.buttonDisplay;
    }

    public final String getCancelDisplay() {
        return this.cancelDisplay;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        return this.cancelDisplay.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.descriptionDisplay), 31, this.buttonDisplay);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("CancelPlanModal(titleDisplay=", str, ", descriptionDisplay=", str2, ", buttonDisplay="), this.buttonDisplay, ", cancelDisplay=", this.cancelDisplay, ")");
    }

    public CancelPlanModal(String titleDisplay, String descriptionDisplay, String buttonDisplay, String cancelDisplay) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonDisplay, "buttonDisplay");
        AbstractC22676k.m65750j(cancelDisplay, "cancelDisplay");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonDisplay = buttonDisplay;
        this.cancelDisplay = cancelDisplay;
    }
}
