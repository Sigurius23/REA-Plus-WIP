package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1689h2 {

    /* JADX INFO: renamed from: a */
    public int f6673a;

    /* JADX INFO: renamed from: b */
    public int f6674b;

    /* JADX INFO: renamed from: c */
    public int f6675c;

    /* JADX INFO: renamed from: d */
    public int f6676d;

    /* JADX INFO: renamed from: e */
    public Interpolator f6677e;

    /* JADX INFO: renamed from: f */
    public boolean f6678f;

    /* JADX INFO: renamed from: g */
    public int f6679g;

    /* JADX INFO: renamed from: a */
    public final void m5250a(RecyclerView recyclerView) {
        int i13 = this.f6676d;
        if (i13 >= 0) {
            this.f6676d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i13);
            this.f6678f = false;
            return;
        }
        if (!this.f6678f) {
            this.f6679g = 0;
            return;
        }
        Interpolator interpolator = this.f6677e;
        if (interpolator != null && this.f6675c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i14 = this.f6675c;
        if (i14 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.mViewFlinger.m5279c(this.f6673a, this.f6674b, interpolator, i14);
        int i15 = this.f6679g + 1;
        this.f6679g = i15;
        if (i15 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f6678f = false;
    }
}
