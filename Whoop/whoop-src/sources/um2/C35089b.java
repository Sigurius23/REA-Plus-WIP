package um2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xm2.C38463d;

/* JADX INFO: renamed from: um2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lum2/b;", "", "Lxm2/d;", "stravaAuthResult", "<init>", "(Lxm2/d;)V", "a", "(Lxm2/d;)Lum2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxm2/d;", "b", "()Lxm2/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35089b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38463d stravaAuthResult;

    public C35089b(C38463d c38463d) {
        this.stravaAuthResult = c38463d;
    }

    /* JADX INFO: renamed from: a */
    public final C35089b m110973a(C38463d stravaAuthResult) {
        return new C35089b(stravaAuthResult);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C38463d getStravaAuthResult() {
        return this.stravaAuthResult;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C35089b) && AbstractC22676k.m65745e(this.stravaAuthResult, ((C35089b) other).stravaAuthResult);
    }

    public int hashCode() {
        C38463d c38463d = this.stravaAuthResult;
        if (c38463d == null) {
            return 0;
        }
        return c38463d.hashCode();
    }

    public String toString() {
        return "MainDomainState(stravaAuthResult=" + this.stravaAuthResult + ")";
    }

    public /* synthetic */ C35089b(C38463d c38463d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c38463d);
    }
}
