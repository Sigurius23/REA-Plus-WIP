package n70;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n70.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ln70/a;", "", "Ln70/b;", "type", "Ln70/e;", "currentState", "", "authenticated", "<init>", "(Ln70/b;Ln70/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/b;", "c", "()Ln70/b;", "b", "Ln70/e;", "()Ln70/e;", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26414a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26415b type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26418e currentState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean authenticated;

    public C26414a(InterfaceC26415b type, C26418e currentState, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(currentState, "currentState");
        this.type = type;
        this.currentState = currentState;
        this.authenticated = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAuthenticated() {
        return this.authenticated;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C26418e getCurrentState() {
        return this.currentState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC26415b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26414a)) {
            return false;
        }
        C26414a c26414a = (C26414a) other;
        return AbstractC22676k.m65745e(this.type, c26414a.type) && AbstractC22676k.m65745e(this.currentState, c26414a.currentState) && this.authenticated == c26414a.authenticated;
    }

    public int hashCode() {
        return Boolean.hashCode(this.authenticated) + ((this.currentState.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        InterfaceC26415b interfaceC26415b = this.type;
        C26418e c26418e = this.currentState;
        boolean z4 = this.authenticated;
        StringBuilder sb4 = new StringBuilder("ActivationProgressAction(type=");
        sb4.append(interfaceC26415b);
        sb4.append(", currentState=");
        sb4.append(c26418e);
        sb4.append(", authenticated=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
