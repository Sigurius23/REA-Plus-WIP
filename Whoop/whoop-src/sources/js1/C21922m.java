package js1;

import hs1.AbstractC17606c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: js1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Ljs1/m;", "Lm91/u;", "Lhs1/c;", "journalHomeTileViewState", "", "path", "<init>", "(Lhs1/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhs1/c;", "()Lhs1/c;", "b", "Ljava/lang/String;", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21922m implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f84675c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC17606c journalHomeTileViewState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String path;

    public C21922m(AbstractC17606c journalHomeTileViewState, String path) {
        AbstractC22676k.m65750j(journalHomeTileViewState, "journalHomeTileViewState");
        AbstractC22676k.m65750j(path, "path");
        this.journalHomeTileViewState = journalHomeTileViewState;
        this.path = path;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17606c getJournalHomeTileViewState() {
        return this.journalHomeTileViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21922m)) {
            return false;
        }
        C21922m c21922m = (C21922m) other;
        return AbstractC22676k.m65745e(this.journalHomeTileViewState, c21922m.journalHomeTileViewState) && AbstractC22676k.m65745e(this.path, c21922m.path);
    }

    public int hashCode() {
        return this.path.hashCode() + (this.journalHomeTileViewState.hashCode() * 31);
    }

    public String toString() {
        return "JournalHomeTileWrapperState(journalHomeTileViewState=" + this.journalHomeTileViewState + ", path=" + this.path + ")";
    }
}
