package fm1;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fm1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lfm1/e;", "", "", "shouldShowJournalTutorial", "isAutoPop", "journalCompleted", "Lfm1/b;", "previousCycleDuring", "<init>", "(ZZZLfm1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "getJournalCompleted", "d", "Lfm1/b;", "()Lfm1/b;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14601e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean shouldShowJournalTutorial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isAutoPop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean journalCompleted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14598b previousCycleDuring;

    public C14601e(boolean z4, boolean z13, boolean z14, C14598b c14598b) {
        this.shouldShowJournalTutorial = z4;
        this.isAutoPop = z13;
        this.journalCompleted = z14;
        this.previousCycleDuring = c14598b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C14598b getPreviousCycleDuring() {
        return this.previousCycleDuring;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldShowJournalTutorial() {
        return this.shouldShowJournalTutorial;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAutoPop() {
        return this.isAutoPop;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14601e)) {
            return false;
        }
        C14601e c14601e = (C14601e) other;
        return this.shouldShowJournalTutorial == c14601e.shouldShowJournalTutorial && this.isAutoPop == c14601e.isAutoPop && this.journalCompleted == c14601e.journalCompleted && AbstractC22676k.m65745e(this.previousCycleDuring, c14601e.previousCycleDuring);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.shouldShowJournalTutorial) * 31, 31, this.isAutoPop), 31, this.journalCompleted);
        C14598b c14598b = this.previousCycleDuring;
        return iM8289b + (c14598b == null ? 0 : c14598b.hashCode());
    }

    public String toString() {
        boolean z4 = this.shouldShowJournalTutorial;
        boolean z13 = this.isAutoPop;
        boolean z14 = this.journalCompleted;
        C14598b c14598b = this.previousCycleDuring;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("JournalMeta(shouldShowJournalTutorial=", ", isAutoPop=", ", journalCompleted=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", previousCycleDuring=");
        sbM32002u.append(c14598b);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
