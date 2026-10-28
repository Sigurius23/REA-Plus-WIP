package p043c4;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.WeakHashMap;
import p027b3.AbstractC2346a;
import p028b4.C2691b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28677v1;

/* JADX INFO: renamed from: c4.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C3983z extends AbstractC2346a implements InterfaceC3950b0, InterfaceC16915u {

    /* JADX INFO: renamed from: J */
    public final Window f16206J;

    /* JADX INFO: renamed from: K */
    public final C28633k1 f16207K;

    /* JADX INFO: renamed from: L */
    public boolean f16208L;

    /* JADX INFO: renamed from: M */
    public boolean f16209M;

    /* JADX INFO: renamed from: N */
    public boolean f16210N;

    /* JADX INFO: renamed from: O */
    public boolean f16211O;

    public C3983z(Context context, Window window) {
        super(context);
        this.f16206J = window;
        this.f16207K = AbstractC28683x.m87272z(AbstractC3981x.f16204a);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(this, this);
        AbstractC16901p0.m47586q(this, new C2691b(this, 1));
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: a */
    public final void mo3598a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1735448596);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            ((InterfaceC4351m) this.f16207K.getValue()).invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3955e(this, i13, 1);
        }
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: f */
    public final void mo7237f(boolean z4, int i13, int i14, int i15, int i16) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i17 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i18 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: g */
    public final void mo7238g(int i13, int i14) {
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo7238g(i13, i14);
            return;
        }
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i14);
        Window window = this.f16206J;
        int i15 = (mode != Integer.MIN_VALUE || this.f16208L || this.f16209M || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i16 = size - paddingRight;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = i15 - paddingBottom;
        int i18 = i17 >= 0 ? i17 : 0;
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 != 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE);
        }
        childAt.measure(i13, i14);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.f16209M || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f16208L) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // p027b3.AbstractC2346a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f16211O;
    }

    @Override // p043c4.InterfaceC3950b0
    public final Window getWindow() {
        return this.f16206J;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        if (!this.f16209M) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c16905q1.f64864a.mo47533n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c16905q1;
    }
}
