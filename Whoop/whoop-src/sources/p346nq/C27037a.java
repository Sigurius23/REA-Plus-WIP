package p346nq;

import a00.C0072g;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.RunnableC1631u1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import mr.C25900f;
import mr.C25901g;
import p184h5.AbstractC16901p0;
import p479s4.AbstractC32131l;

/* JADX INFO: renamed from: nq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27037a extends AbstractC32131l {

    /* JADX INFO: renamed from: w */
    public int f107943w;

    /* JADX INFO: renamed from: x */
    public int f107944x = -1;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SwipeDismissBehavior f107945y;

    public C27037a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f107945y = swipeDismissBehavior;
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: f */
    public final int mo72284f(View view, int i13) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i14 = this.f107945y.f20769e;
        if (i14 == 0) {
            if (z4) {
                width = this.f107943w - view.getWidth();
                width2 = this.f107943w;
            } else {
                width = this.f107943w;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i14 != 1) {
            width = this.f107943w - view.getWidth();
            width2 = view.getWidth() + this.f107943w;
        } else if (z4) {
            width = this.f107943w;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f107943w - view.getWidth();
            width2 = this.f107943w;
        }
        return Math.min(Math.max(width, i13), width2);
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: g */
    public final int mo72285g(View view, int i13) {
        return view.getTop();
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: k */
    public final int mo72286k(View view) {
        return view.getWidth();
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: n */
    public final void mo81151n(View view, int i13) {
        this.f107944x = i13;
        this.f107943w = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f107945y;
            swipeDismissBehavior.f20768d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f20768d = false;
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: o */
    public final void mo72288o(int i13) {
        C25900f c25900f = this.f107945y.f20766b;
        if (c25900f != null) {
            C25901g c25901g = c25900f.f102228w.f102273w;
            if (i13 == 0) {
                C0072g.m163o().m165A(c25901g);
            } else if (i13 == 1 || i13 == 2) {
                C0072g.m163o().m207y(c25901g);
            }
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: p */
    public final void mo72289p(View view, int i13, int i14) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f107945y;
        float f13 = width * swipeDismissBehavior.f20770f;
        float width2 = view.getWidth() * swipeDismissBehavior.f20771g;
        float fAbs = Math.abs(i13 - this.f107943w);
        if (fAbs <= f13) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f13) / (width2 - f13))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: q */
    public final void mo72290q(View view, float f13, float f14) {
        int i13;
        int left;
        int i14;
        C25900f c25900f;
        this.f107944x = -1;
        int width = view.getWidth();
        boolean z4 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f107945y;
        if (f13 != 0.0f) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            boolean z13 = view.getLayoutDirection() == 1;
            int i15 = swipeDismissBehavior.f20769e;
            if (i15 != 2 && (i15 != 0 ? i15 != 1 || (!z13 ? f13 < 0.0f : f13 > 0.0f) : !z13 ? f13 > 0.0f : f13 < 0.0f)) {
                i13 = this.f107943w;
            } else {
                if (f13 >= 0.0f) {
                    left = view.getLeft();
                    i14 = this.f107943w;
                    if (left < i14) {
                        i13 = this.f107943w - width;
                    } else {
                        i13 = i14 + width;
                    }
                } else {
                    i13 = this.f107943w - width;
                }
                z4 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f107943w) >= Math.round(view.getWidth() * 0.5f)) {
                if (f13 >= 0.0f) {
                    left = view.getLeft();
                    i14 = this.f107943w;
                    if (left < i14) {
                        i13 = this.f107943w - width;
                    } else {
                        i13 = i14 + width;
                    }
                } else {
                    i13 = this.f107943w - width;
                }
                z4 = true;
            } else {
                i13 = this.f107943w;
            }
        }
        if (swipeDismissBehavior.f20765a.m118085o(i13, view.getTop())) {
            RunnableC1631u1 runnableC1631u1 = new RunnableC1631u1(swipeDismissBehavior, view, z4);
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            view.postOnAnimation(runnableC1631u1);
        } else {
            if (!z4 || (c25900f = swipeDismissBehavior.f20766b) == null) {
                return;
            }
            c25900f.m76607a(view);
        }
    }

    @Override // p479s4.AbstractC32131l
    /* JADX INFO: renamed from: t */
    public final boolean mo72291t(View view, int i13) {
        int i14 = this.f107944x;
        return (i14 == -1 || i14 == i13) && this.f107945y.mo15685I(view);
    }
}
