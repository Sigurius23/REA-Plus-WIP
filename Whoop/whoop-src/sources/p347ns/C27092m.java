package p347ns;

import java.util.Objects;
import p692zt.C41113q;

/* JADX INFO: renamed from: ns.m */
/* JADX INFO: loaded from: classes.dex */
public final class C27092m extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final C27090k f108291a;

    /* JADX INFO: renamed from: b */
    public final C27089j f108292b;

    /* JADX INFO: renamed from: c */
    public final C27088i f108293c;

    /* JADX INFO: renamed from: d */
    public final C27091l f108294d;

    public C27092m(C27090k c27090k, C27089j c27089j, C27088i c27088i, C27091l c27091l) {
        this.f108291a = c27090k;
        this.f108292b = c27089j;
        this.f108293c = c27088i;
        this.f108294d = c27091l;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m81460b() {
        C41113q c41113q = new C41113q(15, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = C27091l.f108289d;
        return c41113q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27092m)) {
            return false;
        }
        C27092m c27092m = (C27092m) obj;
        return this.f108291a == c27092m.f108291a && this.f108292b == c27092m.f108292b && this.f108293c == c27092m.f108293c && this.f108294d == c27092m.f108294d;
    }

    public final int hashCode() {
        return Objects.hash(C27092m.class, this.f108291a, this.f108292b, this.f108293c, this.f108294d);
    }
}
