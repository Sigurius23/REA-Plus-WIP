package d80;

import com.whoop.activation.view.navigation.ActivationFlowDestination;
import d13.AbstractC11478a;
import j80.InterfaceC21413a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: d80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Ld80/a;", "", "", "currentStepIndex", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Lm91/u;", "currentScreen", "previousScreen", "Lkotlin/Function1;", "Lj80/a;", "Ll83/a0;", "onViewEvent", "<init>", "(ILcom/whoop/activation/view/navigation/ActivationFlowDestination;Lm91/u;Lm91/u;Lkotlin/jvm/functions/Function1;)V", "", "c", "()Z", "a", "()V", "b", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Lm91/u;", "d", "e", "Lkotlin/jvm/functions/Function1;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11765a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStepIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationFlowDestination currentDestination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u currentScreen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u previousScreen;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1 onViewEvent;

    public C11765a(int i13, ActivationFlowDestination activationFlowDestination, InterfaceC25312u currentScreen, InterfaceC25312u interfaceC25312u, Function1 onViewEvent) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        this.currentStepIndex = i13;
        this.currentDestination = activationFlowDestination;
        this.currentScreen = currentScreen;
        this.previousScreen = interfaceC25312u;
        this.onViewEvent = onViewEvent;
    }

    /* JADX INFO: renamed from: a */
    public final void m31502a() {
        ActivationFlowDestination activationFlowDestination;
        if (!m31503b() || (activationFlowDestination = this.currentDestination) == null) {
            return;
        }
        this.onViewEvent.invoke(new InterfaceC21413a.m0(activationFlowDestination));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31503b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31504c() {
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11765a)) {
            return false;
        }
        C11765a c11765a = (C11765a) other;
        return this.currentStepIndex == c11765a.currentStepIndex && this.currentDestination == c11765a.currentDestination && AbstractC22676k.m65745e(this.currentScreen, c11765a.currentScreen) && AbstractC22676k.m65745e(this.previousScreen, c11765a.previousScreen) && AbstractC22676k.m65745e(this.onViewEvent, c11765a.onViewEvent);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currentStepIndex) * 31;
        ActivationFlowDestination activationFlowDestination = this.currentDestination;
        int iM30851c = AbstractC11478a.m30851c(this.currentScreen, (iHashCode + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31, 31);
        InterfaceC25312u interfaceC25312u = this.previousScreen;
        return this.onViewEvent.hashCode() + ((iM30851c + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "IAJFBackHandler(currentStepIndex=" + this.currentStepIndex + ", currentDestination=" + this.currentDestination + ", currentScreen=" + this.currentScreen + ", previousScreen=" + this.previousScreen + ", onViewEvent=" + this.onViewEvent + ")";
    }
}
