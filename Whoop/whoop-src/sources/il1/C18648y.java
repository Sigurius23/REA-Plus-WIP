package il1;

import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: il1.y */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lil1/y;", "", "", "pendingStreakAnimationReload", "", "pendingJournalIdentifier", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18648y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean pendingStreakAnimationReload;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String pendingJournalIdentifier;

    public C18648y(boolean z4, String str) {
        this.pendingStreakAnimationReload = z4;
        this.pendingJournalIdentifier = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPendingJournalIdentifier() {
        return this.pendingJournalIdentifier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPendingStreakAnimationReload() {
        return this.pendingStreakAnimationReload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18648y)) {
            return false;
        }
        C18648y c18648y = (C18648y) other;
        return this.pendingStreakAnimationReload == c18648y.pendingStreakAnimationReload && AbstractC22676k.m65745e(this.pendingJournalIdentifier, c18648y.pendingJournalIdentifier);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.pendingStreakAnimationReload) * 31;
        String str = this.pendingJournalIdentifier;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC3855a.m11825i("JournalPendingState(pendingStreakAnimationReload=", ", pendingJournalIdentifier=", this.pendingJournalIdentifier, ")", this.pendingStreakAnimationReload);
    }

    public /* synthetic */ C18648y(boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : str);
    }
}
