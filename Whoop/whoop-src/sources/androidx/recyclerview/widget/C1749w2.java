package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1749w2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6912a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f6913b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f6914c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f6915d = 0;

    /* JADX INFO: renamed from: e */
    public final int f6916e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f6917f;

    public C1749w2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i13) {
        this.f6917f = staggeredGridLayoutManager;
        this.f6916e = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m5335a() {
        View view = (View) AbstractC25012a.m73371d(this.f6912a, 1);
        C1737t2 c1737t2 = (C1737t2) view.getLayoutParams();
        this.f6914c = this.f6917f.f6539c.mo5178b(view);
        c1737t2.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m5336b() {
        this.f6912a.clear();
        this.f6913b = Integer.MIN_VALUE;
        this.f6914c = Integer.MIN_VALUE;
        this.f6915d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m5337c() {
        boolean z4 = this.f6917f.f6544h;
        ArrayList arrayList = this.f6912a;
        return z4 ? m5339e(arrayList.size() - 1, -1) : m5339e(0, arrayList.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m5338d() {
        boolean z4 = this.f6917f.f6544h;
        ArrayList arrayList = this.f6912a;
        return z4 ? m5339e(0, arrayList.size()) : m5339e(arrayList.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m5339e(int i13, int i14) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f6917f;
        int iMo5187k = staggeredGridLayoutManager.f6539c.mo5187k();
        int iMo5183g = staggeredGridLayoutManager.f6539c.mo5183g();
        int i15 = i14 > i13 ? 1 : -1;
        while (i13 != i14) {
            View view = (View) this.f6912a.get(i13);
            int iMo5181e = staggeredGridLayoutManager.f6539c.mo5181e(view);
            int iMo5178b = staggeredGridLayoutManager.f6539c.mo5178b(view);
            boolean z4 = iMo5181e <= iMo5183g;
            boolean z13 = iMo5178b >= iMo5187k;
            if (z4 && z13 && (iMo5181e < iMo5187k || iMo5178b > iMo5183g)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i13 += i15;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m5340f(int i13) {
        int i14 = this.f6914c;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        if (this.f6912a.size() == 0) {
            return i13;
        }
        m5335a();
        return this.f6914c;
    }

    /* JADX INFO: renamed from: g */
    public final View m5341g(int i13, int i14) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f6917f;
        ArrayList arrayList = this.f6912a;
        View view = null;
        if (i14 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f6544h && staggeredGridLayoutManager.getPosition(view2) >= i13) || ((!staggeredGridLayoutManager.f6544h && staggeredGridLayoutManager.getPosition(view2) <= i13) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            View view3 = (View) arrayList.get(i15);
            if ((staggeredGridLayoutManager.f6544h && staggeredGridLayoutManager.getPosition(view3) <= i13) || ((!staggeredGridLayoutManager.f6544h && staggeredGridLayoutManager.getPosition(view3) >= i13) || !view3.hasFocusable())) {
                break;
            }
            i15++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m5342h(int i13) {
        int i14 = this.f6913b;
        if (i14 != Integer.MIN_VALUE) {
            return i14;
        }
        ArrayList arrayList = this.f6912a;
        if (arrayList.size() == 0) {
            return i13;
        }
        View view = (View) arrayList.get(0);
        C1737t2 c1737t2 = (C1737t2) view.getLayoutParams();
        this.f6913b = this.f6917f.f6539c.mo5181e(view);
        c1737t2.getClass();
        return this.f6913b;
    }
}
