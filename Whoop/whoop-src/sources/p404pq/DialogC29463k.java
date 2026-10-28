package p404pq;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.android.R;
import er.C13570c;
import er.C13573f;
import java.util.WeakHashMap;
import mr.ViewOnTouchListenerC25904j;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p314m.DialogC24833c0;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: pq.k */
/* JADX INFO: loaded from: classes6.dex */
public class DialogC29463k extends DialogC24833c0 {

    /* JADX INFO: renamed from: F */
    private BottomSheetBehavior<FrameLayout> f119634F;

    /* JADX INFO: renamed from: G */
    private FrameLayout f119635G;

    /* JADX INFO: renamed from: H */
    private CoordinatorLayout f119636H;

    /* JADX INFO: renamed from: I */
    private FrameLayout f119637I;

    /* JADX INFO: renamed from: J */
    boolean f119638J;

    /* JADX INFO: renamed from: K */
    boolean f119639K;

    /* JADX INFO: renamed from: L */
    private boolean f119640L;

    /* JADX INFO: renamed from: M */
    private boolean f119641M;

    /* JADX INFO: renamed from: N */
    private C29462j f119642N;

    /* JADX INFO: renamed from: O */
    private boolean f119643O;

    /* JADX INFO: renamed from: P */
    private C13573f f119644P;

    /* JADX INFO: renamed from: Q */
    private AbstractC29455c f119645Q;

    public DialogC29463k(Context context, int i13) {
        if (i13 == 0) {
            TypedValue typedValue = new TypedValue();
            i13 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i13);
        this.f119639K = true;
        this.f119640L = true;
        this.f119645Q = new C29461i(this, 0);
        m72840f(1);
        this.f119643O = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM89936l = m89936l();
        if (!this.f119638J || bottomSheetBehaviorM89936l.f20784L == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM89936l.m15701W(5);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m89935k() {
        if (this.f119635G == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f119635G = frameLayout;
            this.f119636H = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f119635G.findViewById(R.id.design_bottom_sheet);
            this.f119637I = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(frameLayout2);
            this.f119634F = bottomSheetBehaviorM15688O;
            bottomSheetBehaviorM15688O.m15690I(this.f119645Q);
            this.f119634F.m15699U(this.f119639K);
            this.f119644P = new C13573f(this.f119634F, this.f119637I);
        }
    }

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior<FrameLayout> m89936l() {
        if (this.f119634F == null) {
            m89935k();
        }
        return this.f119634F;
    }

    /* JADX INFO: renamed from: m */
    public boolean m89937m() {
        return this.f119638J;
    }

    /* JADX INFO: renamed from: n */
    public void m89938n() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f119634F;
        bottomSheetBehavior.f20795W.remove(this.f119645Q);
    }

    /* JADX INFO: renamed from: o */
    public boolean m89939o() {
        if (!this.f119641M) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f119640L = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f119641M = true;
        }
        return this.f119640L;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z4 = this.f119643O && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f119635G;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z4);
            }
            CoordinatorLayout coordinatorLayout = this.f119636H;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z4);
            }
            AbstractC29125c.m88513V(window, !z4);
            C29462j c29462j = this.f119642N;
            if (c29462j != null) {
                c29462j.m89930e(window);
            }
        }
        C13573f c13573f = this.f119644P;
        if (c13573f == null) {
            return;
        }
        View view = c13573f.f47924c;
        C13570c c13570c = c13573f.f47922a;
        if (this.f119639K) {
            if (c13570c != null) {
                c13570c.m38314b(c13573f.f47923b, view, false);
            }
        } else if (c13570c != null) {
            c13570c.m38315c(view);
        }
    }

    @Override // p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        C13570c c13570c;
        C29462j c29462j = this.f119642N;
        if (c29462j != null) {
            c29462j.m89930e(null);
        }
        C13573f c13573f = this.f119644P;
        if (c13573f == null || (c13570c = c13573f.f47922a) == null) {
            return;
        }
        c13570c.m38315c(c13573f.f47924c);
    }

    @Override // p161g.DialogC14910m, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f119634F;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f20784L != 5) {
            return;
        }
        bottomSheetBehavior.m15701W(4);
    }

    /* JADX INFO: renamed from: p */
    public final FrameLayout m89940p(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        m89935k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f119635G.findViewById(R.id.coordinator);
        if (i13 != 0 && view == null) {
            view = getLayoutInflater().inflate(i13, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f119643O) {
            FrameLayout frameLayout = this.f119637I;
            C29458f c29458f = new C29458f(this);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47517l(frameLayout, c29458f);
        }
        this.f119637I.removeAllViews();
        if (layoutParams == null) {
            this.f119637I.addView(view);
        } else {
            this.f119637I.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC29459g(this));
        AbstractC16901p0.m47583n(this.f119637I, new C29460h(this));
        this.f119637I.setOnTouchListener(new ViewOnTouchListenerC25904j(1));
        return this.f119635G;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z4) {
        C13573f c13573f;
        super.setCancelable(z4);
        if (this.f119639K != z4) {
            this.f119639K = z4;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f119634F;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m15699U(z4);
            }
            if (getWindow() == null || (c13573f = this.f119644P) == null) {
                return;
            }
            View view = c13573f.f47924c;
            C13570c c13570c = c13573f.f47922a;
            if (this.f119639K) {
                if (c13570c != null) {
                    c13570c.m38314b(c13573f.f47923b, view, false);
                }
            } else if (c13570c != null) {
                c13570c.m38315c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z4) {
        super.setCanceledOnTouchOutside(z4);
        if (z4 && !this.f119639K) {
            this.f119639K = true;
        }
        this.f119640L = z4;
        this.f119641M = true;
    }

    @Override // p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
    public void setContentView(int i13) {
        super.setContentView(m89940p(null, i13, null));
    }

    @Override // p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m89940p(view, 0, null));
    }

    @Override // p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m89940p(view, 0, layoutParams));
    }
}
