package af2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xe2.EnumC38233b;
import ye2.C39479a;
import ye2.C39480b;

/* JADX INFO: renamed from: af2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b3\u00106R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b(\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b/\u0010:¨\u0006;"}, m65681d2 = {"Laf2/j;", "", "Laf2/d;", "repeatDays", "Laf2/k;", "wakeMode", "Laf2/c;", "wakeTime", "Laf2/g;", "sleepGoal", "Lye2/a;", "scheduleSaveSuccessModal", "scheduleSavingModal", "Lye2/b;", "scheduleSaveErrorModal", "Lxe2/b;", "currentDisplay", "Laf2/f;", "scheduleFlow", "<init>", "(Laf2/d;Laf2/k;Laf2/c;Laf2/g;Lye2/a;Lye2/a;Lye2/b;Lxe2/b;Laf2/f;)V", "a", "(Laf2/d;Laf2/k;Laf2/c;Laf2/g;Lye2/a;Lye2/a;Lye2/b;Lxe2/b;Laf2/f;)Laf2/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laf2/d;", "d", "()Laf2/d;", "b", "Laf2/k;", "j", "()Laf2/k;", "c", "Laf2/c;", "k", "()Laf2/c;", "Laf2/g;", "i", "()Laf2/g;", "e", "Lye2/a;", "g", "()Lye2/a;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lye2/b;", "()Lye2/b;", "Lxe2/b;", "()Lxe2/b;", "Laf2/f;", "()Laf2/f;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0820j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C0814d repeatDays;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C0821k wakeMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C0813c wakeTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C0817g sleepGoal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39479a scheduleSaveSuccessModal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39479a scheduleSavingModal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C39480b scheduleSaveErrorModal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC38233b currentDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC0816f scheduleFlow;

    public C0820j(C0814d repeatDays, C0821k wakeMode, C0813c wakeTime, C0817g sleepGoal, C39479a scheduleSaveSuccessModal, C39479a scheduleSavingModal, C39480b scheduleSaveErrorModal, EnumC38233b currentDisplay, InterfaceC0816f scheduleFlow) {
        AbstractC22676k.m65750j(repeatDays, "repeatDays");
        AbstractC22676k.m65750j(wakeMode, "wakeMode");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(scheduleSaveSuccessModal, "scheduleSaveSuccessModal");
        AbstractC22676k.m65750j(scheduleSavingModal, "scheduleSavingModal");
        AbstractC22676k.m65750j(scheduleSaveErrorModal, "scheduleSaveErrorModal");
        AbstractC22676k.m65750j(currentDisplay, "currentDisplay");
        AbstractC22676k.m65750j(scheduleFlow, "scheduleFlow");
        this.repeatDays = repeatDays;
        this.wakeMode = wakeMode;
        this.wakeTime = wakeTime;
        this.sleepGoal = sleepGoal;
        this.scheduleSaveSuccessModal = scheduleSaveSuccessModal;
        this.scheduleSavingModal = scheduleSavingModal;
        this.scheduleSaveErrorModal = scheduleSaveErrorModal;
        this.currentDisplay = currentDisplay;
        this.scheduleFlow = scheduleFlow;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0820j m2009b(C0820j c0820j, C0814d c0814d, C0821k c0821k, C0813c c0813c, C0817g c0817g, C39479a c39479a, C39479a c39479a2, C39480b c39480b, EnumC38233b enumC38233b, InterfaceC0816f interfaceC0816f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c0814d = c0820j.repeatDays;
        }
        if ((i13 & 2) != 0) {
            c0821k = c0820j.wakeMode;
        }
        if ((i13 & 4) != 0) {
            c0813c = c0820j.wakeTime;
        }
        if ((i13 & 8) != 0) {
            c0817g = c0820j.sleepGoal;
        }
        if ((i13 & 16) != 0) {
            c39479a = c0820j.scheduleSaveSuccessModal;
        }
        if ((i13 & 32) != 0) {
            c39479a2 = c0820j.scheduleSavingModal;
        }
        if ((i13 & 64) != 0) {
            c39480b = c0820j.scheduleSaveErrorModal;
        }
        if ((i13 & 128) != 0) {
            enumC38233b = c0820j.currentDisplay;
        }
        if ((i13 & 256) != 0) {
            interfaceC0816f = c0820j.scheduleFlow;
        }
        EnumC38233b enumC38233b2 = enumC38233b;
        InterfaceC0816f interfaceC0816f2 = interfaceC0816f;
        C39479a c39479a3 = c39479a2;
        C39480b c39480b2 = c39480b;
        C39479a c39479a4 = c39479a;
        C0813c c0813c2 = c0813c;
        return c0820j.m2010a(c0814d, c0821k, c0813c2, c0817g, c39479a4, c39479a3, c39480b2, enumC38233b2, interfaceC0816f2);
    }

    /* JADX INFO: renamed from: a */
    public final C0820j m2010a(C0814d repeatDays, C0821k wakeMode, C0813c wakeTime, C0817g sleepGoal, C39479a scheduleSaveSuccessModal, C39479a scheduleSavingModal, C39480b scheduleSaveErrorModal, EnumC38233b currentDisplay, InterfaceC0816f scheduleFlow) {
        AbstractC22676k.m65750j(repeatDays, "repeatDays");
        AbstractC22676k.m65750j(wakeMode, "wakeMode");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(scheduleSaveSuccessModal, "scheduleSaveSuccessModal");
        AbstractC22676k.m65750j(scheduleSavingModal, "scheduleSavingModal");
        AbstractC22676k.m65750j(scheduleSaveErrorModal, "scheduleSaveErrorModal");
        AbstractC22676k.m65750j(currentDisplay, "currentDisplay");
        AbstractC22676k.m65750j(scheduleFlow, "scheduleFlow");
        return new C0820j(repeatDays, wakeMode, wakeTime, sleepGoal, scheduleSaveSuccessModal, scheduleSavingModal, scheduleSaveErrorModal, currentDisplay, scheduleFlow);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC38233b getCurrentDisplay() {
        return this.currentDisplay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0814d getRepeatDays() {
        return this.repeatDays;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC0816f getScheduleFlow() {
        return this.scheduleFlow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0820j)) {
            return false;
        }
        C0820j c0820j = (C0820j) other;
        return AbstractC22676k.m65745e(this.repeatDays, c0820j.repeatDays) && AbstractC22676k.m65745e(this.wakeMode, c0820j.wakeMode) && AbstractC22676k.m65745e(this.wakeTime, c0820j.wakeTime) && AbstractC22676k.m65745e(this.sleepGoal, c0820j.sleepGoal) && AbstractC22676k.m65745e(this.scheduleSaveSuccessModal, c0820j.scheduleSaveSuccessModal) && AbstractC22676k.m65745e(this.scheduleSavingModal, c0820j.scheduleSavingModal) && AbstractC22676k.m65745e(this.scheduleSaveErrorModal, c0820j.scheduleSaveErrorModal) && this.currentDisplay == c0820j.currentDisplay && AbstractC22676k.m65745e(this.scheduleFlow, c0820j.scheduleFlow);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C39480b getScheduleSaveErrorModal() {
        return this.scheduleSaveErrorModal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C39479a getScheduleSaveSuccessModal() {
        return this.scheduleSaveSuccessModal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C39479a getScheduleSavingModal() {
        return this.scheduleSavingModal;
    }

    public int hashCode() {
        return this.scheduleFlow.hashCode() + ((this.currentDisplay.hashCode() + ((this.scheduleSaveErrorModal.hashCode() + ((this.scheduleSavingModal.hashCode() + ((this.scheduleSaveSuccessModal.hashCode() + ((this.sleepGoal.hashCode() + ((this.wakeTime.hashCode() + ((this.wakeMode.hashCode() + (this.repeatDays.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C0817g getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C0821k getWakeMode() {
        return this.wakeMode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C0813c getWakeTime() {
        return this.wakeTime;
    }

    public String toString() {
        return "SleepScheduleComponentsDomainObject(repeatDays=" + this.repeatDays + ", wakeMode=" + this.wakeMode + ", wakeTime=" + this.wakeTime + ", sleepGoal=" + this.sleepGoal + ", scheduleSaveSuccessModal=" + this.scheduleSaveSuccessModal + ", scheduleSavingModal=" + this.scheduleSavingModal + ", scheduleSaveErrorModal=" + this.scheduleSaveErrorModal + ", currentDisplay=" + this.currentDisplay + ", scheduleFlow=" + this.scheduleFlow + ")";
    }

    public /* synthetic */ C0820j(C0814d c0814d, C0821k c0821k, C0813c c0813c, C0817g c0817g, C39479a c39479a, C39479a c39479a2, C39480b c39480b, EnumC38233b enumC38233b, InterfaceC0816f interfaceC0816f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0814d, c0821k, c0813c, c0817g, c39479a, c39479a2, c39480b, (i13 & 128) != 0 ? EnumC38233b.REPEAT_DAYS : enumC38233b, (i13 & 256) != 0 ? InterfaceC0816f.a.f2993a : interfaceC0816f);
    }
}
