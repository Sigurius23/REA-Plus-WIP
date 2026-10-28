package p474s;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.whoop.android.R;
import p444r.ViewTreeObserverOnGlobalLayoutListenerC30809d;

/* JADX INFO: renamed from: s.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31965i0 extends C32018v1 implements InterfaceC31973k0 {

    /* JADX INFO: renamed from: c0 */
    public CharSequence f132708c0;

    /* JADX INFO: renamed from: d0 */
    public C31953f0 f132709d0;

    /* JADX INFO: renamed from: e0 */
    public final Rect f132710e0;

    /* JADX INFO: renamed from: f0 */
    public int f132711f0;

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ C31977l0 f132712g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31965i0(C31977l0 c31977l0, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f132712g0 = c31977l0;
        this.f132710e0 = new Rect();
        this.f132860O = c31977l0;
        this.f132870Y = true;
        this.f132871Z.setFocusable(true);
        this.f132861P = new C31957g0(this, 0);
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: e */
    public final CharSequence mo99434e() {
        return this.f132708c0;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: g */
    public final void mo99436g(CharSequence charSequence) {
        this.f132708c0 = charSequence;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: i */
    public final void mo99438i(int i13) {
        this.f132711f0 = i13;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: j */
    public final void mo99439j(int i13, int i14) {
        ViewTreeObserver viewTreeObserver;
        C32016v c32016v = this.f132871Z;
        boolean zIsShowing = c32016v.isShowing();
        m99454q();
        c32016v.setInputMethodMode(2);
        mo94785c();
        C31974k1 c31974k1 = this.f132874y;
        c31974k1.setChoiceMode(1);
        c31974k1.setTextDirection(i13);
        c31974k1.setTextAlignment(i14);
        C31977l0 c31977l0 = this.f132712g0;
        int selectedItemPosition = c31977l0.getSelectedItemPosition();
        C31974k1 c31974k2 = this.f132874y;
        if (c32016v.isShowing() && c31974k2 != null) {
            c31974k2.setListSelectionHidden(false);
            c31974k2.setSelection(selectedItemPosition);
            if (c31974k2.getChoiceMode() != 0) {
                c31974k2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c31977l0.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC30809d viewTreeObserverOnGlobalLayoutListenerC30809d = new ViewTreeObserverOnGlobalLayoutListenerC30809d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC30809d);
        c32016v.setOnDismissListener(new C31961h0(this, viewTreeObserverOnGlobalLayoutListenerC30809d));
    }

    @Override // p474s.C32018v1, p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: l */
    public final void mo99441l(ListAdapter listAdapter) {
        super.mo99441l(listAdapter);
        this.f132709d0 = (C31953f0) listAdapter;
    }

    /* JADX INFO: renamed from: q */
    public final void m99454q() {
        int i13;
        C31977l0 c31977l0 = this.f132712g0;
        Rect rect = c31977l0.f132755H;
        C32016v c32016v = this.f132871Z;
        Drawable background = c32016v.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i13 = c31977l0.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i13 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c31977l0.getPaddingLeft();
        int paddingRight = c31977l0.getPaddingRight();
        int width = c31977l0.getWidth();
        int i14 = c31977l0.f132754G;
        if (i14 == -2) {
            int iM99467a = c31977l0.m99467a(this.f132709d0, c32016v.getBackground());
            int i15 = (c31977l0.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM99467a > i15) {
                iM99467a = i15;
            }
            m99573p(Math.max(iM99467a, (width - paddingLeft) - paddingRight));
        } else if (i14 == -1) {
            m99573p((width - paddingLeft) - paddingRight);
        } else {
            m99573p(i14);
        }
        this.f132851F = c31977l0.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f132850E) - this.f132711f0) + i13 : paddingLeft + this.f132711f0 + i13;
    }
}
