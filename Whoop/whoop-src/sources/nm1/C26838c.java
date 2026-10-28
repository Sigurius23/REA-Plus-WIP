package nm1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: nm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lnm1/c;", "Lm91/u;", "Lnm1/e;", "coachPill", "Lnm1/i;", "dailyOutlookTile", "<init>", "(Lnm1/e;Lnm1/i;)V", "a", "(Lnm1/e;Lnm1/i;)Lnm1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnm1/e;", "c", "()Lnm1/e;", "b", "Lnm1/i;", "e", "()Lnm1/i;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26838c implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f107109c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26840e coachPill;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26844i dailyOutlookTile;

    static {
        int i13 = C9598e.f28134d;
        f107109c = i13 | TextResource.$stable | i13;
    }

    public C26838c(C26840e c26840e, C26844i dailyOutlookTile) {
        AbstractC22676k.m65750j(dailyOutlookTile, "dailyOutlookTile");
        this.coachPill = c26840e;
        this.dailyOutlookTile = dailyOutlookTile;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26838c m80090b(C26838c c26838c, C26840e c26840e, C26844i c26844i, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c26840e = c26838c.coachPill;
        }
        if ((i13 & 2) != 0) {
            c26844i = c26838c.dailyOutlookTile;
        }
        return c26838c.m80091a(c26840e, c26844i);
    }

    /* JADX INFO: renamed from: a */
    public final C26838c m80091a(C26840e coachPill, C26844i dailyOutlookTile) {
        AbstractC22676k.m65750j(dailyOutlookTile, "dailyOutlookTile");
        return new C26838c(coachPill, dailyOutlookTile);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C26840e getCoachPill() {
        return this.coachPill;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C26844i getDailyOutlookTile() {
        return this.dailyOutlookTile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26838c)) {
            return false;
        }
        C26838c c26838c = (C26838c) other;
        return AbstractC22676k.m65745e(this.coachPill, c26838c.coachPill) && AbstractC22676k.m65745e(this.dailyOutlookTile, c26838c.dailyOutlookTile);
    }

    public int hashCode() {
        C26840e c26840e = this.coachPill;
        return this.dailyOutlookTile.hashCode() + ((c26840e == null ? 0 : c26840e.hashCode()) * 31);
    }

    public String toString() {
        return "CoachEntrypointViewState(coachPill=" + this.coachPill + ", dailyOutlookTile=" + this.dailyOutlookTile + ")";
    }
}
