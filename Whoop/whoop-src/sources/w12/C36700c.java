package w12;

import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: w12.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"Lw12/c;", "Lm91/u;", "", "currentStep", "totalSteps", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36700c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int currentStep;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int totalSteps;

    public C36700c(int i13, int i14) {
        this.currentStep = i13;
        this.totalSteps = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36700c)) {
            return false;
        }
        C36700c c36700c = (C36700c) other;
        return this.currentStep == c36700c.currentStep && this.totalSteps == c36700c.totalSteps;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalSteps) + (Integer.hashCode(this.currentStep) * 31);
    }

    public String toString() {
        return AbstractC25012a.m73372e(this.currentStep, this.totalSteps, "ConversationProgressBarViewState(currentStep=", ", totalSteps=", ")");
    }
}
