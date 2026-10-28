package p474s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p290l.AbstractC22932a;
import p377or.C28131e;
import p444r.InterfaceC30806b0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: s.v1 */
/* JADX INFO: loaded from: classes5.dex */
public class C32018v1 implements InterfaceC30806b0 {

    /* JADX INFO: renamed from: a0 */
    public static final Method f132848a0;

    /* JADX INFO: renamed from: b0 */
    public static final Method f132849b0;

    /* JADX INFO: renamed from: F */
    public int f132851F;

    /* JADX INFO: renamed from: G */
    public int f132852G;

    /* JADX INFO: renamed from: I */
    public boolean f132854I;

    /* JADX INFO: renamed from: J */
    public boolean f132855J;

    /* JADX INFO: renamed from: K */
    public boolean f132856K;

    /* JADX INFO: renamed from: N */
    public C28131e f132859N;

    /* JADX INFO: renamed from: O */
    public View f132860O;

    /* JADX INFO: renamed from: P */
    public AdapterView.OnItemClickListener f132861P;

    /* JADX INFO: renamed from: Q */
    public AdapterView.OnItemSelectedListener f132862Q;

    /* JADX INFO: renamed from: V */
    public final Handler f132867V;

    /* JADX INFO: renamed from: X */
    public Rect f132869X;

    /* JADX INFO: renamed from: Y */
    public boolean f132870Y;

    /* JADX INFO: renamed from: Z */
    public final C32016v f132871Z;

    /* JADX INFO: renamed from: w */
    public final Context f132872w;

    /* JADX INFO: renamed from: x */
    public ListAdapter f132873x;

    /* JADX INFO: renamed from: y */
    public C31974k1 f132874y;

    /* JADX INFO: renamed from: z */
    public final int f132875z = -2;

    /* JADX INFO: renamed from: E */
    public int f132850E = -2;

    /* JADX INFO: renamed from: H */
    public final int f132853H = 1002;

    /* JADX INFO: renamed from: L */
    public int f132857L = 0;

    /* JADX INFO: renamed from: M */
    public final int f132858M = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: R */
    public final RunnableC32006s1 f132863R = new RunnableC32006s1(this, 1);

    /* JADX INFO: renamed from: S */
    public final ViewOnTouchListenerC32014u1 f132864S = new ViewOnTouchListenerC32014u1(this);

    /* JADX INFO: renamed from: T */
    public final C32010t1 f132865T = new C32010t1(this);

    /* JADX INFO: renamed from: U */
    public final RunnableC32006s1 f132866U = new RunnableC32006s1(this, 0);

    /* JADX INFO: renamed from: W */
    public final Rect f132868W = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f132848a0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f132849b0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C32018v1(Context context, AttributeSet attributeSet, int i13, int i14) {
        int resourceId;
        this.f132872w = context;
        this.f132867V = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90522o, i13, 0);
        this.f132851F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f132852G = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f132854I = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C32016v c32016v = new C32016v(context, attributeSet, i13, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90526s, i13, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c32016v.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c32016v.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC30060g.m92133x(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f132871Z = c32016v;
        c32016v.setInputMethodMode(1);
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: a */
    public final boolean mo94784a() {
        return this.f132871Z.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m99567b() {
        return this.f132851F;
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: c */
    public final void mo94785c() {
        int i13;
        int iMakeMeasureSpec;
        int paddingBottom;
        C31974k1 c31974k1;
        C31974k1 c31974k2 = this.f132874y;
        Context context = this.f132872w;
        C32016v c32016v = this.f132871Z;
        if (c31974k2 == null) {
            C31974k1 c31974k1Mo99417o = mo99417o(context, !this.f132870Y);
            this.f132874y = c31974k1Mo99417o;
            c31974k1Mo99417o.setAdapter(this.f132873x);
            this.f132874y.setOnItemClickListener(this.f132861P);
            this.f132874y.setFocusable(true);
            this.f132874y.setFocusableInTouchMode(true);
            this.f132874y.setOnItemSelectedListener(new C31994p1(this));
            this.f132874y.setOnScrollListener(this.f132865T);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f132862Q;
            if (onItemSelectedListener != null) {
                this.f132874y.setOnItemSelectedListener(onItemSelectedListener);
            }
            c32016v.setContentView(this.f132874y);
        }
        Drawable background = c32016v.getBackground();
        Rect rect = this.f132868W;
        if (background != null) {
            background.getPadding(rect);
            int i14 = rect.top;
            i13 = rect.bottom + i14;
            if (!this.f132854I) {
                this.f132852G = -i14;
            }
        } else {
            rect.setEmpty();
            i13 = 0;
        }
        int iM99515a = AbstractC31998q1.m99515a(c32016v, this.f132860O, this.f132852G, c32016v.getInputMethodMode() == 2);
        int i15 = this.f132875z;
        if (i15 == -1) {
            paddingBottom = iM99515a + i13;
        } else {
            int i16 = this.f132850E;
            if (i16 != -2) {
                iMakeMeasureSpec = i16 != -1 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM99464a = this.f132874y.m99464a(iMakeMeasureSpec, iM99515a);
            paddingBottom = iM99464a + (iM99464a > 0 ? this.f132874y.getPaddingBottom() + this.f132874y.getPaddingTop() + i13 : 0);
        }
        boolean z4 = c32016v.getInputMethodMode() == 2;
        c32016v.setWindowLayoutType(this.f132853H);
        if (c32016v.isShowing()) {
            if (this.f132860O.isAttachedToWindow()) {
                int width = this.f132850E;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f132860O.getWidth();
                }
                if (i15 == -1) {
                    i15 = z4 ? paddingBottom : -1;
                    if (z4) {
                        c32016v.setWidth(this.f132850E == -1 ? -1 : 0);
                        c32016v.setHeight(0);
                    } else {
                        c32016v.setWidth(this.f132850E == -1 ? -1 : 0);
                        c32016v.setHeight(-1);
                    }
                } else if (i15 == -2) {
                    i15 = paddingBottom;
                }
                c32016v.setOutsideTouchable(true);
                int i17 = width;
                View view = this.f132860O;
                int i18 = this.f132851F;
                int i19 = this.f132852G;
                int i24 = i17 < 0 ? -1 : i17;
                if (i15 < 0) {
                    i15 = -1;
                }
                c32016v.update(view, i18, i19, i24, i15);
                return;
            }
            return;
        }
        int width2 = this.f132850E;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f132860O.getWidth();
        }
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = paddingBottom;
        }
        c32016v.setWidth(width2);
        c32016v.setHeight(i15);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f132848a0;
            if (method != null) {
                try {
                    method.invoke(c32016v, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC32002r1.m99531b(c32016v, true);
        }
        c32016v.setOutsideTouchable(true);
        c32016v.setTouchInterceptor(this.f132864S);
        if (this.f132856K) {
            c32016v.setOverlapAnchor(this.f132855J);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f132849b0;
            if (method2 != null) {
                try {
                    method2.invoke(c32016v, this.f132869X);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            AbstractC32002r1.m99530a(c32016v, this.f132869X);
        }
        c32016v.showAsDropDown(this.f132860O, this.f132851F, this.f132852G, this.f132857L);
        this.f132874y.setSelection(-1);
        if ((!this.f132870Y || this.f132874y.isInTouchMode()) && (c31974k1 = this.f132874y) != null) {
            c31974k1.setListSelectionHidden(true);
            c31974k1.requestLayout();
        }
        if (this.f132870Y) {
            return;
        }
        this.f132867V.post(this.f132866U);
    }

    /* JADX INFO: renamed from: d */
    public final void m99568d(int i13) {
        this.f132851F = i13;
    }

    @Override // p444r.InterfaceC30806b0
    public final void dismiss() {
        C32016v c32016v = this.f132871Z;
        c32016v.dismiss();
        c32016v.setContentView(null);
        this.f132874y = null;
        this.f132867V.removeCallbacks(this.f132863R);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m99569f() {
        return this.f132871Z.getBackground();
    }

    /* JADX INFO: renamed from: h */
    public final void m99570h(int i13) {
        this.f132852G = i13;
        this.f132854I = true;
    }

    /* JADX INFO: renamed from: k */
    public final int m99571k() {
        if (this.f132854I) {
            return this.f132852G;
        }
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public void mo99441l(ListAdapter listAdapter) {
        C28131e c28131e = this.f132859N;
        if (c28131e == null) {
            this.f132859N = new C28131e(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f132873x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c28131e);
            }
        }
        this.f132873x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f132859N);
        }
        C31974k1 c31974k1 = this.f132874y;
        if (c31974k1 != null) {
            c31974k1.setAdapter(this.f132873x);
        }
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: m */
    public final C31974k1 mo94786m() {
        return this.f132874y;
    }

    /* JADX INFO: renamed from: n */
    public final void m99572n(Drawable drawable) {
        this.f132871Z.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: o */
    public C31974k1 mo99417o(Context context, boolean z4) {
        return new C31974k1(context, z4);
    }

    /* JADX INFO: renamed from: p */
    public final void m99573p(int i13) {
        Drawable background = this.f132871Z.getBackground();
        if (background == null) {
            this.f132850E = i13;
            return;
        }
        Rect rect = this.f132868W;
        background.getPadding(rect);
        this.f132850E = rect.left + rect.right + i13;
    }
}
