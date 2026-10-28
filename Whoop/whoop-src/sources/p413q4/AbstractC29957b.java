package p413q4;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p184h5.C16905q1;

/* JADX INFO: renamed from: q4.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29957b {
    /* JADX INFO: renamed from: A */
    public boolean mo15673A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public void mo15658B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    /* JADX INFO: renamed from: C */
    public Parcelable mo15659C(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    @Deprecated
    /* JADX INFO: renamed from: D */
    public boolean m91641D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public boolean mo15660E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        if (i14 == 0) {
            return m91641D(coordinatorLayout, view, view2, view3, i13);
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public void m91642F(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    /* JADX INFO: renamed from: G */
    public void mo15661G(CoordinatorLayout coordinatorLayout, View view, View view2, int i13) {
        if (i13 == 0) {
            m91642F(coordinatorLayout, view, view2);
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean mo15684H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m91643e(CoordinatorLayout coordinatorLayout, View view) {
        return m91645h(coordinatorLayout, view) > 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo15763f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public int m91644g(CoordinatorLayout coordinatorLayout, View view) {
        return -16777216;
    }

    /* JADX INFO: renamed from: h */
    public float m91645h(CoordinatorLayout coordinatorLayout, View view) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo15674i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public C16905q1 m91646j(CoordinatorLayout coordinatorLayout, View view, C16905q1 c16905q1) {
        return c16905q1;
    }

    /* JADX INFO: renamed from: k */
    public void mo15713k(C29960e c29960e) {
    }

    /* JADX INFO: renamed from: l */
    public boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void mo15676m(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    /* JADX INFO: renamed from: n */
    public void mo15714n() {
    }

    /* JADX INFO: renamed from: o */
    public boolean mo15686o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo15669q(CoordinatorLayout coordinatorLayout, View view, int i13, int i14, int i15, int i16) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public boolean m91647r(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14, boolean z4) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo15715s(CoordinatorLayout coordinatorLayout, View view, View view2, float f13, float f14) {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m91648t(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr) {
    }

    /* JADX INFO: renamed from: u */
    public void mo15670u(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            m91648t(coordinatorLayout, view, view2, i13, i14, iArr);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public void m91649v(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16) {
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public void m91650w(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17) {
        if (i17 == 0) {
            m91649v(coordinatorLayout, view, view2, i13, i14, i15, i16);
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo15671x(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        m91650w(coordinatorLayout, view, view2, i13, i14, i15, i16, i17);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public void m91651y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13) {
    }

    /* JADX INFO: renamed from: z */
    public void m91652z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        if (i14 == 0) {
            m91651y(coordinatorLayout, view, view2, view3, i13);
        }
    }
}
