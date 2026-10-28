package com.iterable.iterableapi;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.android.R;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONException;
import org.json.JSONObject;
import p047c9.C4316g;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p543v4.AbstractC35642a;
import qg3.C30352d;

/* JADX INFO: renamed from: com.iterable.iterableapi.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C5379v0 extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: N */
    public static C5379v0 f21859N;

    /* JADX INFO: renamed from: O */
    public static C30352d f21860O;

    /* JADX INFO: renamed from: P */
    public static C5388y0 f21861P;

    /* JADX INFO: renamed from: E */
    public String f21862E;

    /* JADX INFO: renamed from: G */
    public Handler f21864G;

    /* JADX INFO: renamed from: H */
    public RunnableC5373t0 f21865H;

    /* JADX INFO: renamed from: K */
    public boolean f21868K;

    /* JADX INFO: renamed from: L */
    public double f21869L;

    /* JADX INFO: renamed from: M */
    public String f21870M;

    /* JADX INFO: renamed from: w */
    public C5332h2 f21871w;

    /* JADX INFO: renamed from: y */
    public C5370s0 f21873y;

    /* JADX INFO: renamed from: z */
    public boolean f21874z = false;

    /* JADX INFO: renamed from: I */
    public float f21866I = -1.0f;

    /* JADX INFO: renamed from: x */
    public boolean f21872x = false;

    /* JADX INFO: renamed from: F */
    public String f21863F = "";

    /* JADX INFO: renamed from: J */
    public Rect f21867J = new Rect();

    public C5379v0() {
        setStyle(2, R.style.Theme_AppCompat_NoActionBar);
    }

    /* JADX INFO: renamed from: C */
    public static int m16529C(Rect rect) {
        int i13 = rect.top;
        if (i13 == 0 && rect.bottom == 0) {
            return 4;
        }
        if (i13 != 0 || rect.bottom >= 0) {
            return (i13 >= 0 || rect.bottom != 0) ? 3 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: D */
    public static int m16530D(Rect rect) {
        int i13 = rect.top;
        if (i13 != 0 || rect.bottom >= 0) {
            return (i13 >= 0 || rect.bottom != 0) ? 16 : 80;
        }
        return 48;
    }

    /* JADX INFO: renamed from: A */
    public final void m16531A(Window window, String str) {
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        int iM16530D = m16530D(this.f21867J);
        if (iM16530D == 16) {
            attributes.gravity = 17;
        } else if (iM16530D == 48) {
            attributes.gravity = 49;
        } else if (iM16530D == 80) {
            attributes.gravity = 81;
        }
        window.setAttributes(attributes);
        AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Set window gravity in " + str + ": " + attributes.gravity);
    }

    /* JADX INFO: renamed from: B */
    public final ColorDrawable m16532B() {
        String str = this.f21870M;
        if (str == null) {
            AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Background Color does not exist. In App background animation will not be performed");
            return null;
        }
        try {
            return new ColorDrawable(AbstractC35642a.m112838g(Color.parseColor(str), (int) (this.f21869L * 255.0d)));
        } catch (IllegalArgumentException unused) {
            AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "Background color could not be identified for input string \"" + this.f21870M + "\". Failed to load in-app background.");
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m16533E() {
        int i13;
        if (this.f21868K) {
            int iM35485e = AbstractC12682p.m35485e(m16529C(this.f21867J));
            if (iM35485e == 0) {
                i13 = R.anim.top_exit;
            } else if (iM35485e != 1) {
                i13 = R.anim.fade_out_custom;
                if (iM35485e != 2) {
                }
            } else {
                i13 = R.anim.bottom_exit;
            }
            try {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i13);
                animationLoadAnimation.setDuration(500L);
                this.f21871w.startAnimation(animationLoadAnimation);
            } catch (Exception unused) {
                AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "Failed to hide inapp with animation");
            }
        }
        m16536z(m16532B(), new ColorDrawable(0));
        this.f21871w.postOnAnimationDelayed(new RunnableC5373t0(this, 1), 400L);
    }

    /* JADX INFO: renamed from: F */
    public final void m16534F() {
        C5339j1 c5339j1M16421d = C5341k.f21742r.m16486e().m16421d(this.f21863F);
        if (c5339j1M16421d == null) {
            AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "Message with id " + this.f21863F + " does not exist");
            return;
        }
        if (!c5339j1M16421d.m16466n() || c5339j1M16421d.m16463k()) {
            return;
        }
        C5315d1 c5315d1M16486e = C5341k.f21742r.m16486e();
        synchronized (c5315d1M16486e) {
            c5315d1M16486e.m16424g(c5339j1M16421d, null, null);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m16535G() {
        if (this.f21864G == null) {
            this.f21864G = new Handler(Looper.getMainLooper());
        }
        RunnableC5373t0 runnableC5373t0 = this.f21865H;
        if (runnableC5373t0 != null) {
            this.f21864G.removeCallbacks(runnableC5373t0);
        }
        RunnableC5373t0 runnableC5373t1 = new RunnableC5373t0(this, 2);
        this.f21865H = runnableC5373t1;
        this.f21864G.postDelayed(runnableC5373t1, 200L);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f21862E = arguments.getString("HTML", null);
            this.f21874z = arguments.getBoolean("CallbackOnCancel", false);
            this.f21863F = arguments.getString("MessageId");
            arguments.getDouble("BackgroundAlpha");
            this.f21867J = (Rect) arguments.getParcelable("InsetPadding");
            this.f21869L = arguments.getDouble("InAppBgAlpha");
            this.f21870M = arguments.getString("InAppBgColor", null);
            this.f21868K = arguments.getBoolean("ShouldAnimate");
        }
        f21859N = this;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final Dialog onCreateDialog(Bundle bundle) {
        DialogC5364q0 dialogC5364q0 = new DialogC5364q0(this, getActivity(), getTheme());
        dialogC5364q0.setOnCancelListener(new DialogInterfaceOnCancelListenerC5367r0(this));
        dialogC5364q0.requestWindowFeature(1);
        if (m16529C(this.f21867J) != 4) {
            m16531A(dialogC5364q0.getWindow(), "onCreateDialog");
        }
        if (m16529C(this.f21867J) == 4) {
            dialogC5364q0.getWindow().setFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            return dialogC5364q0;
        }
        if (m16529C(this.f21867J) != 1) {
            dialogC5364q0.getWindow().setFlags(67108864, 67108864);
        }
        return dialogC5364q0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5332h2 c5332h2;
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (m16529C(this.f21867J) == 4) {
            getDialog().getWindow().setFlags(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        }
        if (m16529C(this.f21867J) != 4) {
            m16531A(getDialog().getWindow(), "onCreateView");
        }
        try {
            c5332h2 = new C5332h2(getContext());
        } catch (Resources.NotFoundException e5) {
            AbstractC12350b.m34596q("IterableInAppFragmentHTMLNotification", "Failed to create WebView - system WebView resource issue", e5);
            c5332h2 = null;
        } catch (RuntimeException e13) {
            AbstractC12350b.m34596q("IterableInAppFragmentHTMLNotification", "Failed to create WebView - unexpected error", e13);
            c5332h2 = null;
        }
        this.f21871w = c5332h2;
        if (c5332h2 == null) {
            dismissAllowingStateLoss();
            return null;
        }
        c5332h2.setId(R.id.webView);
        this.f21871w.m16449a(this, this.f21862E);
        if (this.f21873y == null) {
            this.f21873y = new C5370s0(this, getContext());
        }
        this.f21873y.enable();
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (m16529C(this.f21867J) == 4) {
            frameLayout.addView(this.f21871w, new FrameLayout.LayoutParams(-1, -1));
        } else {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            int iM16530D = m16530D(this.f21867J);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (iM16530D == 16) {
                layoutParams.gravity = 17;
            } else if (iM16530D == 48) {
                layoutParams.gravity = 49;
            } else if (iM16530D == 80) {
                layoutParams.gravity = 81;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            relativeLayout.addView(this.f21871w, layoutParams2);
            frameLayout.addView(relativeLayout, layoutParams);
        }
        if (bundle == null || !bundle.getBoolean("InAppOpenTracked", false)) {
            C5341k c5341k = C5341k.f21742r;
            String str = this.f21863F;
            C5388y0 c5388y0 = f21861P;
            c5341k.getClass();
            AbstractC12350b.m34557F();
            C5339j1 c5339j1M16421d = c5341k.m16486e().m16421d(str);
            if (c5339j1M16421d == null) {
                AbstractC12350b.m34579a0("IterableApi", "trackInAppOpen: could not find an in-app message with ID: " + str);
            } else if (c5341k.m16482a()) {
                C5101l0 c5101l0 = c5341k.f21752j;
                JSONObject jSONObject = new JSONObject();
                try {
                    c5101l0.m16027B(jSONObject);
                    jSONObject.put("messageId", c5339j1M16421d.m16459g());
                    jSONObject.put("messageContext", C5101l0.m16025Q(c5339j1M16421d, c5388y0));
                    jSONObject.put("deviceInfo", c5101l0.m16036O());
                    c5101l0.m16055f0("events/trackInAppOpen", jSONObject);
                } catch (JSONException e14) {
                    e14.printStackTrace();
                }
            }
        }
        try {
            this.f21871w.setAlpha(0.0f);
            this.f21871w.postDelayed(new RunnableC5373t0(this, 0), 500L);
        } catch (NullPointerException unused) {
            AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "View not present. Failed to hide before resizing inapp");
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        RunnableC5373t0 runnableC5373t0;
        super.onDestroy();
        Handler handler = this.f21864G;
        if (handler != null && (runnableC5373t0 = this.f21865H) != null) {
            handler.removeCallbacks(runnableC5373t0);
        }
        this.f21865H = null;
        this.f21864G = null;
        if (getActivity() == null || !getActivity().isChangingConfigurations()) {
            f21859N = null;
            f21860O = null;
            f21861P = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("InAppOpenTracked", true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || m16529C(this.f21867J) == 4) {
            return;
        }
        m16531A(dialog.getWindow(), "onStart");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStop() {
        C5370s0 c5370s0 = this.f21873y;
        if (c5370s0 != null) {
            c5370s0.disable();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m16529C(this.f21867J) != 4) {
            C4316g c4316g = new C4316g(10);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47517l(view, c4316g);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m16536z(ColorDrawable colorDrawable, ColorDrawable colorDrawable2) {
        if (colorDrawable == null || colorDrawable2 == null) {
            return;
        }
        if (getDialog() == null || getDialog().getWindow() == null) {
            AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "Dialog or Window not present. Skipping background animation");
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{colorDrawable, colorDrawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        getDialog().getWindow().setBackgroundDrawable(transitionDrawable);
        transitionDrawable.startTransition(300);
    }
}
