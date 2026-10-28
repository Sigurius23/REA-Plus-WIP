package c42;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c42.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lc42/h;", "", "Lc42/f;", "onboardingWelcome", "Lc42/d;", "onboardingDueDate", "<init>", "(Lc42/f;Lc42/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc42/f;", "b", "()Lc42/f;", "Lc42/d;", "()Lc42/d;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4171h {

    /* JADX INFO: renamed from: c */
    public static final int f16973c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4169f onboardingWelcome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4167d onboardingDueDate;

    public C4171h(C4169f onboardingWelcome, C4167d onboardingDueDate) {
        AbstractC22676k.m65750j(onboardingWelcome, "onboardingWelcome");
        AbstractC22676k.m65750j(onboardingDueDate, "onboardingDueDate");
        this.onboardingWelcome = onboardingWelcome;
        this.onboardingDueDate = onboardingDueDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4167d getOnboardingDueDate() {
        return this.onboardingDueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4169f getOnboardingWelcome() {
        return this.onboardingWelcome;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4171h)) {
            return false;
        }
        C4171h c4171h = (C4171h) other;
        return AbstractC22676k.m65745e(this.onboardingWelcome, c4171h.onboardingWelcome) && AbstractC22676k.m65745e(this.onboardingDueDate, c4171h.onboardingDueDate);
    }

    public int hashCode() {
        return this.onboardingDueDate.hashCode() + (this.onboardingWelcome.hashCode() * 31);
    }

    public String toString() {
        return "PregnancyOnboardingScreenViewState(onboardingWelcome=" + this.onboardingWelcome + ", onboardingDueDate=" + this.onboardingDueDate + ")";
    }
}
