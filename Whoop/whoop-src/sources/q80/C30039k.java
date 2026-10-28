package q80;

import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import d13.AbstractC11478a;
import j80.InterfaceC21413a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r90.C31100g;
import v90.C35815g;
import v90.C35826r;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: q80.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lq80/k;", "", "", "currentStepIndex", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Lm91/u;", "currentScreen", "previousScreen", "", "isUpcycleFFEnabled", "shouldHandleEmailFirstBackNav", "Lkotlin/Function1;", "Lj80/a;", "Ll83/a0;", "onViewEvent", "<init>", "(ILcom/whoop/activation/view/navigation/ActivationFlowDestination;Lm91/u;Lm91/u;ZZLkotlin/jvm/functions/Function1;)V", "c", "()Z", "a", "()V", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Lm91/u;", "d", "e", "Z", "f", "g", "Lkotlin/jvm/functions/Function1;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30039k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationFlowDestination currentDestination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u currentScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u previousScreen;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isUpcycleFFEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean shouldHandleEmailFirstBackNav;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 onViewEvent;

    public C30039k(int i13, ActivationFlowDestination activationFlowDestination, InterfaceC25312u currentScreen, InterfaceC25312u interfaceC25312u, boolean z4, boolean z13, Function1 onViewEvent) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        this.currentStepIndex = i13;
        this.currentDestination = activationFlowDestination;
        this.currentScreen = currentScreen;
        this.previousScreen = interfaceC25312u;
        this.isUpcycleFFEnabled = z4;
        this.shouldHandleEmailFirstBackNav = z13;
        this.onViewEvent = onViewEvent;
    }

    /* JADX INFO: renamed from: a */
    public final void m91972a() {
        ActivationFlowDestination activationFlowDestination;
        if (!m91973b() || (activationFlowDestination = this.currentDestination) == null) {
            return;
        }
        this.onViewEvent.invoke(new InterfaceC21413a.m0(activationFlowDestination));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m91973b() {
        if (this.currentDestination == ActivationFlowDestination.AFTER_ACTIVATION_FINAL_SCREENS) {
            return false;
        }
        InterfaceC25312u interfaceC25312u = this.previousScreen;
        if (interfaceC25312u instanceof C31100g) {
            return false;
        }
        if (this.isUpcycleFFEnabled && (interfaceC25312u instanceof C35826r) && (((C35826r) interfaceC25312u).getCommitmentType() != CommitmentType.TRIAL || !((C35826r) this.previousScreen).getOrderDetailsReplaced())) {
            return false;
        }
        InterfaceC25312u interfaceC25312u2 = this.previousScreen;
        if ((interfaceC25312u2 instanceof C35815g) && (((C35815g) interfaceC25312u2).getCommitmentType() != CommitmentType.TRIAL || !((C35815g) this.previousScreen).getOrderDetailsReplaced())) {
            return false;
        }
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        if (activationFlowDestination == ActivationFlowDestination.DEVICE_EDUCATION || activationFlowDestination == ActivationFlowDestination.ENTER_YOUR_EMAIL || activationFlowDestination == ActivationFlowDestination.ENTER_YOUR_PASSWORD) {
            return true;
        }
        return this.currentStepIndex > 0 && this.previousScreen != null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91974c() {
        return this.shouldHandleEmailFirstBackNav || this.currentDestination != ActivationFlowDestination.DEVICE_EDUCATION;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30039k)) {
            return false;
        }
        C30039k c30039k = (C30039k) other;
        return this.currentStepIndex == c30039k.currentStepIndex && this.currentDestination == c30039k.currentDestination && AbstractC22676k.m65745e(this.currentScreen, c30039k.currentScreen) && AbstractC22676k.m65745e(this.previousScreen, c30039k.previousScreen) && this.isUpcycleFFEnabled == c30039k.isUpcycleFFEnabled && this.shouldHandleEmailFirstBackNav == c30039k.shouldHandleEmailFirstBackNav && AbstractC22676k.m65745e(this.onViewEvent, c30039k.onViewEvent);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currentStepIndex) * 31;
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        int iM30851c = AbstractC11478a.m30851c(this.currentScreen, (iHashCode + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31, 31);
        InterfaceC25312u interfaceC25312u = this.previousScreen;
        return this.onViewEvent.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30851c + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0)) * 31, 31, this.isUpcycleFFEnabled), 31, this.shouldHandleEmailFirstBackNav);
    }

    public String toString() {
        int i13 = this.currentStepIndex;
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        InterfaceC25312u interfaceC25312u = this.currentScreen;
        InterfaceC25312u interfaceC25312u2 = this.previousScreen;
        boolean z4 = this.isUpcycleFFEnabled;
        boolean z13 = this.shouldHandleEmailFirstBackNav;
        Function1 function1 = this.onViewEvent;
        StringBuilder sb4 = new StringBuilder("ActivationFlowBackHandler(currentStepIndex=");
        sb4.append(i13);
        sb4.append(", currentDestination=");
        sb4.append(activationFlowDestination);
        sb4.append(", currentScreen=");
        sb4.append(interfaceC25312u);
        sb4.append(", previousScreen=");
        sb4.append(interfaceC25312u2);
        sb4.append(", isUpcycleFFEnabled=");
        AbstractC38963t7.m124392v(sb4, z4, ", shouldHandleEmailFirstBackNav=", z13, ", onViewEvent=");
        sb4.append(function1);
        sb4.append(")");
        return sb4.toString();
    }
}
