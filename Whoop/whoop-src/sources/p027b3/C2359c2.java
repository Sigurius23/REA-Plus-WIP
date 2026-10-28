package p027b3;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import p002a0.AbstractC0015d1;
import p002a0.AbstractC0018e1;
import p002a0.AbstractC0065z0;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p012ab.C0667a;
import p095dp.AbstractC12240d;

/* JADX INFO: renamed from: b3.c2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2359c2 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final C0057v0 f9316w;

    /* JADX INFO: renamed from: x */
    public final C0059w0 f9317x;

    /* JADX INFO: renamed from: y */
    public final C0057v0 f9318y;

    /* JADX INFO: renamed from: z */
    public final C0039m0 f9319z;

    public C2359c2(C0667a c0667a) {
        long[] jArr = AbstractC0015d1.f36a;
        this.f9316w = new C0057v0();
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        this.f9317x = new C0059w0();
        this.f9318y = new C0057v0();
        C0039m0 c0039m0 = AbstractC0065z0.f204a;
        this.f9319z = new C0039m0();
    }

    /* JADX INFO: renamed from: a */
    public final void m7283a(ArrayList arrayList, ViewGroup viewGroup) {
        C0039m0 c0039m0;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            c0039m0 = this.f9319z;
            if (i13 >= size) {
                break;
            }
            c0039m0.m95h((View) arrayList.get(i13), i13);
            i13++;
        }
        int size2 = arrayList.size() - 1;
        C0059w0 c0059w0 = this.f9317x;
        C0057v0 c0057v0 = this.f9316w;
        if (size2 >= 0) {
            while (true) {
                int i14 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewM34074k = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : AbstractC12240d.m34074k(view, viewGroup, 2);
                if (viewM34074k != null && c0039m0.m91d(viewM34074k) >= 0) {
                    c0057v0.m135m(view, viewM34074k);
                    c0059w0.m136a(viewM34074k);
                }
                if (i14 < 0) {
                    break;
                } else {
                    size2 = i14;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i15 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) c0057v0.m129g(view2)) != null && !c0059w0.m138c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    C0057v0 c0057v1 = this.f9318y;
                    View view4 = (View) c0057v1.m129g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    c0057v1.m135m(view2, view3);
                    view2 = (View) c0057v0.m129g(view2);
                }
            }
            if (i15 < 0) {
                return;
            } else {
                size3 = i15;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        C0057v0 c0057v0 = this.f9318y;
        View view3 = (View) c0057v0.m129g(view);
        View view4 = (View) c0057v0.m129g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.f9316w.m129g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        C0039m0 c0039m0 = this.f9319z;
        return c0039m0.m92e(view) < c0039m0.m92e(view2) ? -1 : 1;
    }
}
