package y72;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w72.AbstractC36914g;

/* JADX INFO: renamed from: y72.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ly72/c;", "", "Lw72/g;", "currentViewState", "<init>", "(Lw72/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw72/g;", "()Lw72/g;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C39287c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC36914g currentViewState;

    public C39287c(AbstractC36914g currentViewState) {
        AbstractC22676k.m65750j(currentViewState, "currentViewState");
        this.currentViewState = currentViewState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC36914g getCurrentViewState() {
        return this.currentViewState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C39287c) && AbstractC22676k.m65745e(this.currentViewState, ((C39287c) other).currentViewState);
    }

    public int hashCode() {
        return this.currentViewState.hashCode();
    }

    public String toString() {
        return "SanguineWaitlistScanState(currentViewState=" + this.currentViewState + ")";
    }
}
