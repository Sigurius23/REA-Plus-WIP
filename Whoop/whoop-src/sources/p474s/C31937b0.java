package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whoop.android.R;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;

/* JADX INFO: renamed from: s.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31937b0 extends C32020w {

    /* JADX INFO: renamed from: e */
    public final C31933a0 f132631e;

    /* JADX INFO: renamed from: f */
    public Drawable f132632f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f132633g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f132634h;

    /* JADX INFO: renamed from: i */
    public boolean f132635i;

    /* JADX INFO: renamed from: j */
    public boolean f132636j;

    public C31937b0(C31933a0 c31933a0) {
        super(c31933a0);
        this.f132633g = null;
        this.f132634h = null;
        this.f132635i = false;
        this.f132636j = false;
        this.f132631e = c31933a0;
    }

    @Override // p474s.C32020w
    /* JADX INFO: renamed from: e */
    public final void mo99418e(AttributeSet attributeSet, int i13) {
        super.mo99418e(attributeSet, R.attr.seekBarStyle);
        C31933a0 c31933a0 = this.f132631e;
        Context context = c31933a0.getContext();
        int[] iArr = AbstractC22932a.f90514g;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        AbstractC16901p0.m47582m(c31933a0, c31933a0.getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, R.attr.seekBarStyle);
        Drawable drawableM99487k = c31983m2M99479q.m99487k(0);
        if (drawableM99487k != null) {
            c31933a0.setThumb(drawableM99487k);
        }
        Drawable drawableM99486j = c31983m2M99479q.m99486j(1);
        Drawable drawable = this.f132632f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f132632f = drawableM99486j;
        if (drawableM99486j != null) {
            drawableM99486j.setCallback(c31933a0);
            drawableM99486j.setLayoutDirection(c31933a0.getLayoutDirection());
            if (drawableM99486j.isStateful()) {
                drawableM99486j.setState(c31933a0.getDrawableState());
            }
            m99419i();
        }
        c31933a0.invalidate();
        if (typedArray.hasValue(3)) {
            this.f132634h = AbstractC31950e1.m99445c(typedArray.getInt(3, -1), this.f132634h);
            this.f132636j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f132633g = c31983m2M99479q.m99484h(2);
            this.f132635i = true;
        }
        c31983m2M99479q.m99491r();
        m99419i();
    }

    /* JADX INFO: renamed from: i */
    public final void m99419i() {
        Drawable drawable = this.f132632f;
        if (drawable != null) {
            if (this.f132635i || this.f132636j) {
                Drawable drawableMutate = drawable.mutate();
                this.f132632f = drawableMutate;
                if (this.f132635i) {
                    drawableMutate.setTintList(this.f132633g);
                }
                if (this.f132636j) {
                    this.f132632f.setTintMode(this.f132634h);
                }
                if (this.f132632f.isStateful()) {
                    this.f132632f.setState(this.f132631e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m99420j(Canvas canvas) {
        if (this.f132632f != null) {
            C31933a0 c31933a0 = this.f132631e;
            int max = c31933a0.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f132632f.getIntrinsicWidth();
                int intrinsicHeight = this.f132632f.getIntrinsicHeight();
                int i13 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i14 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f132632f.setBounds(-i13, -i14, i13, i14);
                float width = ((c31933a0.getWidth() - c31933a0.getPaddingLeft()) - c31933a0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c31933a0.getPaddingLeft(), c31933a0.getHeight() / 2);
                for (int i15 = 0; i15 <= max; i15++) {
                    this.f132632f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
