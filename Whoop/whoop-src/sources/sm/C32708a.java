package sm;

import java.util.Arrays;
import p463rj.AbstractC31479j;
import p465rm.AbstractC31558o1;
import sn.C32763v;

/* JADX INFO: renamed from: sm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32708a {

    /* JADX INFO: renamed from: a */
    public final long f135974a;

    /* JADX INFO: renamed from: b */
    public final AbstractC31558o1 f135975b;

    /* JADX INFO: renamed from: c */
    public final int f135976c;

    /* JADX INFO: renamed from: d */
    public final C32763v f135977d;

    /* JADX INFO: renamed from: e */
    public final long f135978e;

    /* JADX INFO: renamed from: f */
    public final AbstractC31558o1 f135979f;

    /* JADX INFO: renamed from: g */
    public final int f135980g;

    /* JADX INFO: renamed from: h */
    public final C32763v f135981h;

    /* JADX INFO: renamed from: i */
    public final long f135982i;

    /* JADX INFO: renamed from: j */
    public final long f135983j;

    public C32708a(long j7, AbstractC31558o1 abstractC31558o1, int i13, C32763v c32763v, long j13, AbstractC31558o1 abstractC31558o2, int i14, C32763v c32763v2, long j14, long j15) {
        this.f135974a = j7;
        this.f135975b = abstractC31558o1;
        this.f135976c = i13;
        this.f135977d = c32763v;
        this.f135978e = j13;
        this.f135979f = abstractC31558o2;
        this.f135980g = i14;
        this.f135981h = c32763v2;
        this.f135982i = j14;
        this.f135983j = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C32708a.class == obj.getClass()) {
            C32708a c32708a = (C32708a) obj;
            if (this.f135974a == c32708a.f135974a && this.f135976c == c32708a.f135976c && this.f135978e == c32708a.f135978e && this.f135980g == c32708a.f135980g && this.f135982i == c32708a.f135982i && this.f135983j == c32708a.f135983j && AbstractC31479j.m96940s(this.f135975b, c32708a.f135975b) && AbstractC31479j.m96940s(this.f135977d, c32708a.f135977d) && AbstractC31479j.m96940s(this.f135979f, c32708a.f135979f) && AbstractC31479j.m96940s(this.f135981h, c32708a.f135981h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f135974a), this.f135975b, Integer.valueOf(this.f135976c), this.f135977d, Long.valueOf(this.f135978e), this.f135979f, Integer.valueOf(this.f135980g), this.f135981h, Long.valueOf(this.f135982i), Long.valueOf(this.f135983j)});
    }
}
