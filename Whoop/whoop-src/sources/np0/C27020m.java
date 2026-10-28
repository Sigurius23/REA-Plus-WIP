package np0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kp0.C22744k;
import kp0.C22750q;
import kp0.C22751r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: np0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b*\u00102¨\u00063"}, m65681d2 = {"Lnp0/m;", "", "Lnp0/n;", "wizardFlow", "Lnp0/o;", "currentScreen", "Lnp0/b;", "currentAlarm", "", "stopListeningToTimePicker", "Lkp0/q;", "weeklyGoal", "Lkp0/r;", "weeklyGoalSleep", "Lkp0/k;", "optimizeSleep", "<init>", "(Lnp0/n;Lnp0/o;Lnp0/b;ZLkp0/q;Lkp0/r;Lkp0/k;)V", "a", "(Lnp0/n;Lnp0/o;Lnp0/b;ZLkp0/q;Lkp0/r;Lkp0/k;)Lnp0/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lnp0/n;", "i", "()Lnp0/n;", "b", "Lnp0/o;", "d", "()Lnp0/o;", "c", "Lnp0/b;", "()Lnp0/b;", "Z", "f", "()Z", "e", "Lkp0/q;", "g", "()Lkp0/q;", "Lkp0/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkp0/r;", "Lkp0/k;", "()Lkp0/k;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27020m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC27021n wizardFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC27022o currentScreen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27009b currentAlarm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean stopListeningToTimePicker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22750q weeklyGoal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22751r weeklyGoalSleep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C22744k optimizeSleep;

    public C27020m(AbstractC27021n wizardFlow, EnumC27022o currentScreen, C27009b currentAlarm, boolean z4, C22750q c22750q, C22751r c22751r, C22744k c22744k) {
        AbstractC22676k.m65750j(wizardFlow, "wizardFlow");
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(currentAlarm, "currentAlarm");
        this.wizardFlow = wizardFlow;
        this.currentScreen = currentScreen;
        this.currentAlarm = currentAlarm;
        this.stopListeningToTimePicker = z4;
        this.weeklyGoal = c22750q;
        this.weeklyGoalSleep = c22751r;
        this.optimizeSleep = c22744k;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27020m m81008b(C27020m c27020m, AbstractC27021n abstractC27021n, EnumC27022o enumC27022o, C27009b c27009b, boolean z4, C22750q c22750q, C22751r c22751r, C22744k c22744k, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC27021n = c27020m.wizardFlow;
        }
        if ((i13 & 2) != 0) {
            enumC27022o = c27020m.currentScreen;
        }
        if ((i13 & 4) != 0) {
            c27009b = c27020m.currentAlarm;
        }
        if ((i13 & 8) != 0) {
            z4 = c27020m.stopListeningToTimePicker;
        }
        if ((i13 & 16) != 0) {
            c22750q = c27020m.weeklyGoal;
        }
        if ((i13 & 32) != 0) {
            c22751r = c27020m.weeklyGoalSleep;
        }
        if ((i13 & 64) != 0) {
            c22744k = c27020m.optimizeSleep;
        }
        C22751r c22751r2 = c22751r;
        C22744k c22744k2 = c22744k;
        C22750q c22750q2 = c22750q;
        C27009b c27009b2 = c27009b;
        return c27020m.m81009a(abstractC27021n, enumC27022o, c27009b2, z4, c22750q2, c22751r2, c22744k2);
    }

    /* JADX INFO: renamed from: a */
    public final C27020m m81009a(AbstractC27021n wizardFlow, EnumC27022o currentScreen, C27009b currentAlarm, boolean stopListeningToTimePicker, C22750q weeklyGoal, C22751r weeklyGoalSleep, C22744k optimizeSleep) {
        AbstractC22676k.m65750j(wizardFlow, "wizardFlow");
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(currentAlarm, "currentAlarm");
        return new C27020m(wizardFlow, currentScreen, currentAlarm, stopListeningToTimePicker, weeklyGoal, weeklyGoalSleep, optimizeSleep);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27009b getCurrentAlarm() {
        return this.currentAlarm;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC27022o getCurrentScreen() {
        return this.currentScreen;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C22744k getOptimizeSleep() {
        return this.optimizeSleep;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27020m)) {
            return false;
        }
        C27020m c27020m = (C27020m) other;
        return AbstractC22676k.m65745e(this.wizardFlow, c27020m.wizardFlow) && this.currentScreen == c27020m.currentScreen && AbstractC22676k.m65745e(this.currentAlarm, c27020m.currentAlarm) && this.stopListeningToTimePicker == c27020m.stopListeningToTimePicker && AbstractC22676k.m65745e(this.weeklyGoal, c27020m.weeklyGoal) && AbstractC22676k.m65745e(this.weeklyGoalSleep, c27020m.weeklyGoalSleep) && AbstractC22676k.m65745e(this.optimizeSleep, c27020m.optimizeSleep);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getStopListeningToTimePicker() {
        return this.stopListeningToTimePicker;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C22750q getWeeklyGoal() {
        return this.weeklyGoal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C22751r getWeeklyGoalSleep() {
        return this.weeklyGoalSleep;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.currentAlarm.hashCode() + ((this.currentScreen.hashCode() + (this.wizardFlow.hashCode() * 31)) * 31)) * 31, 31, this.stopListeningToTimePicker);
        C22750q c22750q = this.weeklyGoal;
        int iHashCode = (iM8289b + (c22750q == null ? 0 : c22750q.hashCode())) * 31;
        C22751r c22751r = this.weeklyGoalSleep;
        int iHashCode2 = (iHashCode + (c22751r == null ? 0 : c22751r.hashCode())) * 31;
        C22744k c22744k = this.optimizeSleep;
        return iHashCode2 + (c22744k != null ? c22744k.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC27021n getWizardFlow() {
        return this.wizardFlow;
    }

    public String toString() {
        return "WizardConductorViewState(wizardFlow=" + this.wizardFlow + ", currentScreen=" + this.currentScreen + ", currentAlarm=" + this.currentAlarm + ", stopListeningToTimePicker=" + this.stopListeningToTimePicker + ", weeklyGoal=" + this.weeklyGoal + ", weeklyGoalSleep=" + this.weeklyGoalSleep + ", optimizeSleep=" + this.optimizeSleep + ")";
    }

    public /* synthetic */ C27020m(AbstractC27021n abstractC27021n, EnumC27022o enumC27022o, C27009b c27009b, boolean z4, C22750q c22750q, C22751r c22751r, C22744k c22744k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C27011d.f107709b : abstractC27021n, (i13 & 2) != 0 ? EnumC27022o.COLLAPSED : enumC27022o, (i13 & 4) != 0 ? new C27009b(null, null, null, false, 15, null) : c27009b, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : c22750q, (i13 & 32) != 0 ? null : c22751r, (i13 & 64) != 0 ? null : c22744k);
    }
}
