package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1697j2 {

    /* JADX INFO: renamed from: a */
    public int f6707a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f6708b;

    /* JADX INFO: renamed from: c */
    public AbstractC1740u1 f6709c;

    /* JADX INFO: renamed from: d */
    public boolean f6710d;

    /* JADX INFO: renamed from: e */
    public boolean f6711e;

    /* JADX INFO: renamed from: f */
    public View f6712f;

    /* JADX INFO: renamed from: g */
    public final C1689h2 f6713g;

    /* JADX INFO: renamed from: h */
    public boolean f6714h;

    public AbstractC1697j2() {
        C1689h2 c1689h2 = new C1689h2();
        c1689h2.f6676d = -1;
        c1689h2.f6678f = false;
        c1689h2.f6679g = 0;
        c1689h2.f6673a = 0;
        c1689h2.f6674b = 0;
        c1689h2.f6675c = Integer.MIN_VALUE;
        c1689h2.f6677e = null;
        this.f6713g = c1689h2;
    }

    /* JADX INFO: renamed from: a */
    public PointF mo5272a(int i13) {
        Object obj = this.f6709c;
        if (obj instanceof InterfaceC1693i2) {
            return ((InterfaceC1693i2) obj).computeScrollVectorForPosition(i13);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1693i2.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX INFO: renamed from: b */
    public final void m5273b(int i13, int i14) {
        PointF pointFMo5272a;
        RecyclerView recyclerView = this.f6708b;
        if (this.f6707a == -1 || recyclerView == null) {
            m5274d();
        }
        if (this.f6710d && this.f6712f == null && this.f6709c != null && (pointFMo5272a = mo5272a(this.f6707a)) != null) {
            float f13 = pointFMo5272a.x;
            if (f13 != 0.0f || pointFMo5272a.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f13), (int) Math.signum(pointFMo5272a.y), null);
            }
        }
        this.f6710d = false;
        View view = this.f6712f;
        C1689h2 c1689h2 = this.f6713g;
        if (view != null) {
            if (this.f6708b.getChildLayoutPosition(view) == this.f6707a) {
                View view2 = this.f6712f;
                C1701k2 c1701k2 = recyclerView.mState;
                mo5228c(view2, c1689h2);
                c1689h2.m5250a(recyclerView);
                m5274d();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f6712f = null;
            }
        }
        if (this.f6711e) {
            C1701k2 c1701k3 = recyclerView.mState;
            C1751x0 c1751x0 = (C1751x0) this;
            if (c1751x0.f6708b.mLayout.getChildCount() == 0) {
                c1751x0.m5274d();
            } else {
                int i15 = c1751x0.f6929o;
                int i16 = i15 - i13;
                if (i15 * i16 <= 0) {
                    i16 = 0;
                }
                c1751x0.f6929o = i16;
                int i17 = c1751x0.f6930p;
                int i18 = i17 - i14;
                if (i17 * i18 <= 0) {
                    i18 = 0;
                }
                c1751x0.f6930p = i18;
                if (i16 == 0 && i18 == 0) {
                    PointF pointFMo5272a2 = c1751x0.mo5272a(c1751x0.f6707a);
                    if (pointFMo5272a2 != null) {
                        float f14 = pointFMo5272a2.x;
                        if (f14 == 0.0f && pointFMo5272a2.y == 0.0f) {
                            c1689h2.f6676d = c1751x0.f6707a;
                            c1751x0.m5274d();
                        } else {
                            float f15 = pointFMo5272a2.y;
                            float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            float f16 = pointFMo5272a2.x / fSqrt;
                            pointFMo5272a2.x = f16;
                            float f17 = pointFMo5272a2.y / fSqrt;
                            pointFMo5272a2.y = f17;
                            c1751x0.f6925k = pointFMo5272a2;
                            c1751x0.f6929o = (int) (f16 * 10000.0f);
                            c1751x0.f6930p = (int) (f17 * 10000.0f);
                            int iMo5230i = c1751x0.mo5230i(InterfaceC33561b.INVALID_OWNERSHIP);
                            int i19 = (int) (c1751x0.f6929o * 1.2f);
                            int i24 = (int) (c1751x0.f6930p * 1.2f);
                            c1689h2.f6673a = i19;
                            c1689h2.f6674b = i24;
                            c1689h2.f6675c = (int) (iMo5230i * 1.2f);
                            c1689h2.f6677e = c1751x0.f6923i;
                            c1689h2.f6678f = true;
                        }
                    } else {
                        c1689h2.f6676d = c1751x0.f6707a;
                        c1751x0.m5274d();
                    }
                }
            }
            boolean z4 = c1689h2.f6676d >= 0;
            c1689h2.m5250a(recyclerView);
            if (z4 && this.f6711e) {
                this.f6710d = true;
                recyclerView.mViewFlinger.m5278b();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo5228c(View view, C1689h2 c1689h2);

    /* JADX INFO: renamed from: d */
    public final void m5274d() {
        if (this.f6711e) {
            this.f6711e = false;
            C1751x0 c1751x0 = (C1751x0) this;
            c1751x0.f6930p = 0;
            c1751x0.f6929o = 0;
            c1751x0.f6925k = null;
            this.f6708b.mState.f6721a = -1;
            this.f6712f = null;
            this.f6707a = -1;
            this.f6710d = false;
            this.f6709c.onSmoothScrollerStopped(this);
            this.f6709c = null;
            this.f6708b = null;
        }
    }
}
