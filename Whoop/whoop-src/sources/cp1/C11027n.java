package cp1;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cp1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcp1/n;", "", "Lcp1/o;", "welcomeScreenState", "Lcp1/m;", "dueDateState", "<init>", "(Lcp1/o;Lcp1/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcp1/o;", "b", "()Lcp1/o;", "Lcp1/m;", "()Lcp1/m;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11027n {

    /* JADX INFO: renamed from: c */
    public static final int f34609c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11028o welcomeScreenState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11026m dueDateState;

    static {
        int i13 = TextResource.$stable;
        f34609c = i13 | AbstractC22403o.f87638a | i13 | i13 | i13;
    }

    public C11027n(C11028o welcomeScreenState, C11026m dueDateState) {
        AbstractC22676k.m65750j(welcomeScreenState, "welcomeScreenState");
        AbstractC22676k.m65750j(dueDateState, "dueDateState");
        this.welcomeScreenState = welcomeScreenState;
        this.dueDateState = dueDateState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C11026m getDueDateState() {
        return this.dueDateState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C11028o getWelcomeScreenState() {
        return this.welcomeScreenState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11027n)) {
            return false;
        }
        C11027n c11027n = (C11027n) other;
        return AbstractC22676k.m65745e(this.welcomeScreenState, c11027n.welcomeScreenState) && AbstractC22676k.m65745e(this.dueDateState, c11027n.dueDateState);
    }

    public int hashCode() {
        return this.dueDateState.hashCode() + (this.welcomeScreenState.hashCode() * 31);
    }

    public String toString() {
        return "MciPregnancyOnboardingState(welcomeScreenState=" + this.welcomeScreenState + ", dueDateState=" + this.dueDateState + ")";
    }
}
