package ep0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ep0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lep0/h;", "", "", "isPrefetchEnabled", "Lep0/e;", "proactiveAnimationState", "<init>", "(ZLep0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lep0/e;", "()Lep0/e;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13402h {

    /* JADX INFO: renamed from: c */
    public static final int f46944c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isPrefetchEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13399e proactiveAnimationState;

    public C13402h(boolean z4, InterfaceC13399e proactiveAnimationState) {
        AbstractC22676k.m65750j(proactiveAnimationState, "proactiveAnimationState");
        this.isPrefetchEnabled = z4;
        this.proactiveAnimationState = proactiveAnimationState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13399e getProactiveAnimationState() {
        return this.proactiveAnimationState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13402h)) {
            return false;
        }
        C13402h c13402h = (C13402h) other;
        return this.isPrefetchEnabled == c13402h.isPrefetchEnabled && AbstractC22676k.m65745e(this.proactiveAnimationState, c13402h.proactiveAnimationState);
    }

    public int hashCode() {
        return this.proactiveAnimationState.hashCode() + (Boolean.hashCode(this.isPrefetchEnabled) * 31);
    }

    public String toString() {
        return "ProactiveState(isPrefetchEnabled=" + this.isPrefetchEnabled + ", proactiveAnimationState=" + this.proactiveAnimationState + ")";
    }

    public /* synthetic */ C13402h(boolean z4, InterfaceC13399e interfaceC13399e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? InterfaceC13399e.d.f46941a : interfaceC13399e);
    }
}
