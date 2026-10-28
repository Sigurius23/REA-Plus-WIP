package xm2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xm2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lxm2/d;", "", "Lxm2/c;", "authParams", "", "errorResource", "<init>", "(Lxm2/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxm2/c;", "()Lxm2/c;", "b", "I", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38463d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38462c authParams;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int errorResource;

    public C38463d(C38462c c38462c, int i13) {
        this.authParams = c38462c;
        this.errorResource = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C38462c getAuthParams() {
        return this.authParams;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getErrorResource() {
        return this.errorResource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38463d)) {
            return false;
        }
        C38463d c38463d = (C38463d) other;
        return AbstractC22676k.m65745e(this.authParams, c38463d.authParams) && this.errorResource == c38463d.errorResource;
    }

    public int hashCode() {
        C38462c c38462c = this.authParams;
        return Integer.hashCode(this.errorResource) + ((c38462c == null ? 0 : c38462c.hashCode()) * 31);
    }

    public String toString() {
        return "StravaAuthResult(authParams=" + this.authParams + ", errorResource=" + this.errorResource + ")";
    }

    public /* synthetic */ C38463d(C38462c c38462c, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : c38462c, (i14 & 2) != 0 ? -1 : i13);
    }
}
