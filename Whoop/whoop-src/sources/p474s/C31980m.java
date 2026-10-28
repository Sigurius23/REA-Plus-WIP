package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;

/* JADX INFO: renamed from: s.m */
/* JADX INFO: loaded from: classes.dex */
public final class C31980m {

    /* JADX INFO: renamed from: a */
    public final View f132760a;

    /* JADX INFO: renamed from: d */
    public C31975k2 f132763d;

    /* JADX INFO: renamed from: e */
    public C31975k2 f132764e;

    /* JADX INFO: renamed from: f */
    public C31975k2 f132765f;

    /* JADX INFO: renamed from: c */
    public int f132762c = -1;

    /* JADX INFO: renamed from: b */
    public final C31992p f132761b = C31992p.m99505a();

    public C31980m(View view) {
        this.f132760a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m99468a() {
        View view = this.f132760a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f132763d != null) {
                if (this.f132765f == null) {
                    this.f132765f = new C31975k2();
                }
                C31975k2 c31975k2 = this.f132765f;
                c31975k2.m99466a();
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                ColorStateList colorStateListM47508c = AbstractC16877h0.m47508c(view);
                if (colorStateListM47508c != null) {
                    c31975k2.f132746d = true;
                    c31975k2.f132743a = colorStateListM47508c;
                }
                PorterDuff.Mode modeM47509d = AbstractC16877h0.m47509d(view);
                if (modeM47509d != null) {
                    c31975k2.f132745c = true;
                    c31975k2.f132744b = modeM47509d;
                }
                if (c31975k2.f132746d || c31975k2.f132745c) {
                    C31992p.m99508e(background, c31975k2, view.getDrawableState());
                    return;
                }
            }
            C31975k2 c31975k3 = this.f132764e;
            if (c31975k3 != null) {
                C31992p.m99508e(background, c31975k3, view.getDrawableState());
                return;
            }
            C31975k2 c31975k4 = this.f132763d;
            if (c31975k4 != null) {
                C31992p.m99508e(background, c31975k4, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m99469b() {
        C31975k2 c31975k2 = this.f132764e;
        if (c31975k2 != null) {
            return c31975k2.f132743a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m99470c() {
        C31975k2 c31975k2 = this.f132764e;
        if (c31975k2 != null) {
            return c31975k2.f132744b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m99471d(AttributeSet attributeSet, int i13) {
        ColorStateList colorStateListM99427f;
        View view = this.f132760a;
        Context context = view.getContext();
        int[] iArr = AbstractC22932a.f90533z;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, i13);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        View view2 = this.f132760a;
        AbstractC16901p0.m47582m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, i13);
        try {
            if (typedArray.hasValue(0)) {
                this.f132762c = typedArray.getResourceId(0, -1);
                C31992p c31992p = this.f132761b;
                Context context2 = view.getContext();
                int i14 = this.f132762c;
                synchronized (c31992p) {
                    colorStateListM99427f = c31992p.f132798a.m99427f(context2, i14);
                }
                if (colorStateListM99427f != null) {
                    m99474g(colorStateListM99427f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC16877h0.m47514i(view, c31983m2M99479q.m99484h(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC16877h0.m47515j(view, AbstractC31950e1.m99445c(typedArray.getInt(2, -1), null));
            }
            c31983m2M99479q.m99491r();
        } catch (Throwable th3) {
            c31983m2M99479q.m99491r();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m99472e() {
        this.f132762c = -1;
        m99474g(null);
        m99468a();
    }

    /* JADX INFO: renamed from: f */
    public final void m99473f(int i13) {
        ColorStateList colorStateListM99427f;
        this.f132762c = i13;
        C31992p c31992p = this.f132761b;
        if (c31992p != null) {
            Context context = this.f132760a.getContext();
            synchronized (c31992p) {
                colorStateListM99427f = c31992p.f132798a.m99427f(context, i13);
            }
        } else {
            colorStateListM99427f = null;
        }
        m99474g(colorStateListM99427f);
        m99468a();
    }

    /* JADX INFO: renamed from: g */
    public final void m99474g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f132763d == null) {
                this.f132763d = new C31975k2();
            }
            C31975k2 c31975k2 = this.f132763d;
            c31975k2.f132743a = colorStateList;
            c31975k2.f132746d = true;
        } else {
            this.f132763d = null;
        }
        m99468a();
    }

    /* JADX INFO: renamed from: h */
    public final void m99475h(ColorStateList colorStateList) {
        if (this.f132764e == null) {
            this.f132764e = new C31975k2();
        }
        C31975k2 c31975k2 = this.f132764e;
        c31975k2.f132743a = colorStateList;
        c31975k2.f132746d = true;
        m99468a();
    }

    /* JADX INFO: renamed from: i */
    public final void m99476i(PorterDuff.Mode mode) {
        if (this.f132764e == null) {
            this.f132764e = new C31975k2();
        }
        C31975k2 c31975k2 = this.f132764e;
        c31975k2.f132744b = mode;
        c31975k2.f132745c = true;
        m99468a();
    }
}
