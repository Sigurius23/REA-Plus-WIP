package g80;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g80.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lg80/f;", "", "Lg80/d;", "activationState", "<init>", "(Lg80/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg80/d;", "()Lg80/d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15565f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15563d activationState;

    public C15565f(C15563d activationState) {
        AbstractC22676k.m65750j(activationState, "activationState");
        this.activationState = activationState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C15563d getActivationState() {
        return this.activationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C15565f) && AbstractC22676k.m65745e(this.activationState, ((C15565f) other).activationState);
    }

    public int hashCode() {
        return this.activationState.hashCode();
    }

    public String toString() {
        return "ActivationViewState(activationState=" + this.activationState + ")";
    }

    public /* synthetic */ C15565f(C15563d c15563d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            c15563d = new C15563d(null, null, null, null, false, false, 63, null);
        }
        this(c15563d);
    }
}
