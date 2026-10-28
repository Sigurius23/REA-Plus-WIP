package p465rm;

import android.net.Uri;
import java.util.List;
import p309lo.AbstractC24567y;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;

/* JADX INFO: renamed from: rm.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31539i0 {

    /* JADX INFO: renamed from: a */
    public final Uri f130173a;

    /* JADX INFO: renamed from: b */
    public final List f130174b;

    /* JADX INFO: renamed from: c */
    public final AbstractC41023g0 f130175c;

    public C31539i0(Uri uri, AbstractC31531f1 abstractC31531f1, List list, AbstractC41023g0 abstractC41023g0) {
        this.f130173a = uri;
        this.f130174b = list;
        this.f130175c = abstractC41023g0;
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
            ((C31542j0) abstractC41023g0.get(i13)).getClass();
            c41014d0M133251l.m133222a(new C31542j0());
        }
        c41014d0M133251l.m133239f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31539i0)) {
            return false;
        }
        C31539i0 c31539i0 = (C31539i0) obj;
        if (!this.f130173a.equals(c31539i0.f130173a)) {
            return false;
        }
        int i13 = AbstractC24567y.f95875a;
        return AbstractC24567y.m71670a(null, null) && this.f130174b.equals(c31539i0.f130174b) && this.f130175c.equals(c31539i0.f130175c);
    }

    public final int hashCode() {
        return (this.f130175c.hashCode() + ((this.f130174b.hashCode() + (this.f130173a.hashCode() * 923521)) * 961)) * 31;
    }
}
