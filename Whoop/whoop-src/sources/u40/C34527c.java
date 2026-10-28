package u40;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import ar.C1916d;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.whoop.android.R;
import kn2.ViewOnTouchListenerC22603e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import v40.C35649a;

/* JADX INFO: renamed from: u40.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lu40/c;", "Landroidx/fragment/app/y;", "Lu40/h;", "<init>", "()V", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class C34527c extends DialogInterfaceOnCancelListenerC1361y implements InterfaceC34532h {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f145133E = 0;

    /* JADX INFO: renamed from: w */
    public C29938w0 f145134w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f145135x;

    /* JADX INFO: renamed from: y */
    public float f145136y = 0.6f;

    /* JADX INFO: renamed from: z */
    public boolean f145137z;

    /* JADX INFO: renamed from: A */
    public final View m109103A(LayoutInflater layoutInflater, ViewGroup viewGroup, final HCaptchaConfig hCaptchaConfig) {
        View viewInflate = layoutInflater.inflate(R.layout.stripe_hcaptcha_fragment, viewGroup, false);
        AbstractC22676k.m65749i(viewInflate, "inflate(...)");
        viewInflate.setFocusableInTouchMode(true);
        viewInflate.requestFocus();
        viewInflate.setOnKeyListener(new View.OnKeyListener() { // from class: u40.b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
                if (i13 != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                C34527c c34527c = this.f145131w;
                if (!c34527c.f145137z && !hCaptchaConfig.getLoading()) {
                    return true;
                }
                C29938w0 c29938w0 = c34527c.f145134w;
                if (c29938w0 != null) {
                    return c29938w0.m91557M(new HCaptchaException(EnumC34528d.CHALLENGE_CLOSED));
                }
                return false;
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: B */
    public final HCaptchaWebView m109104B(View view, HCaptchaConfig hCaptchaConfig) {
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) view.findViewById(R.id.webView);
        if (!hCaptchaConfig.getLoading()) {
            hCaptchaWebView.setOnTouchListener(new ViewOnTouchListenerC22603e(this, 1));
        }
        AbstractC22676k.m65747g(hCaptchaWebView);
        return hCaptchaWebView;
    }

    @Override // x40.InterfaceC37951a
    /* JADX INFO: renamed from: e */
    public final void mo109105e(HCaptchaException exception) {
        AbstractC22676k.m65750j(exception, "exception");
        C29938w0 c29938w0 = this.f145134w;
        boolean z4 = false;
        if (c29938w0 != null && c29938w0.m91557M(exception)) {
            z4 = true;
        }
        if (isAdded() && !z4) {
            dismissAllowingStateLoss();
        }
        C29938w0 c29938w1 = this.f145134w;
        if (c29938w1 != null) {
            if (z4) {
                ((HCaptchaWebView) c29938w1.f122262z).loadUrl("javascript:resetAndExecute();");
            } else {
                ((C34530f) c29938w1.f122261y).f145151y.invoke(exception);
            }
        }
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: h */
    public final void mo109106h() {
        HCaptchaConfig hCaptchaConfig;
        C29938w0 c29938w0 = this.f145134w;
        if (((c29938w0 == null || (hCaptchaConfig = (HCaptchaConfig) c29938w0.f122260x) == null) ? null : hCaptchaConfig.getSize()) == HCaptchaSize.INVISIBLE) {
            m109109z();
        }
        this.f145137z = true;
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: j */
    public final void mo109107j(AbstractActivityC1340r0 activity) {
        Function1 function1;
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC1329o1 supportFragmentManager = activity.getSupportFragmentManager();
        AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = supportFragmentManager.m4140E("c");
        if (abstractComponentCallbacksC1320m0M4140E == null || !abstractComponentCallbacksC1320m0M4140E.isAdded()) {
            try {
                show(supportFragmentManager, "c");
            } catch (IllegalStateException unused) {
                C29938w0 c29938w0 = this.f145134w;
                if (c29938w0 == null || (function1 = ((C34530f) c29938w0.f122261y).f145151y) == null) {
                    return;
                }
                function1.invoke(new HCaptchaException(EnumC34528d.ERROR));
            }
        }
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: m */
    public final void mo109108m() {
        HCaptchaConfig hCaptchaConfig;
        C29938w0 c29938w0 = this.f145134w;
        if (((c29938w0 == null || (hCaptchaConfig = (HCaptchaConfig) c29938w0.f122260x) == null) ? null : hCaptchaConfig.getSize()) != HCaptchaSize.INVISIBLE) {
            this.f145137z = true;
            m109109z();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        AbstractC22676k.m65750j(dialogInterface, "dialogInterface");
        super.onCancel(dialogInterface);
        mo109105e(new HCaptchaException(EnumC34528d.CHALLENGE_CLOSED));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.StripeHCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C34530f c34530fM109102c;
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        AbstractC22676k.m65750j(inflater, "inflater");
        try {
            Bundle arguments = getArguments();
            if (arguments == null) {
                dismiss();
                return null;
            }
            c34530fM109102c = AbstractC34525a.m109102c(arguments);
            try {
                if (c34530fM109102c == null) {
                    dismiss();
                    return null;
                }
                Function1 function5 = c34530fM109102c.f145151y;
                HCaptchaConfig hCaptchaConfigM109100a = AbstractC34525a.m109100a(arguments);
                if (hCaptchaConfigM109100a == null) {
                    dismiss();
                    function5.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    return null;
                }
                C35649a c35649aM109101b = AbstractC34525a.m109101b(arguments);
                if (c35649aM109101b == null) {
                    dismiss();
                    function5.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    return null;
                }
                View viewM109103A = m109103A(inflater, viewGroup, hCaptchaConfigM109100a);
                HCaptchaWebView hCaptchaWebViewM109104B = m109104B(viewM109103A, hCaptchaConfigM109100a);
                View viewFindViewById = viewM109103A.findViewById(R.id.loadingContainer);
                ((LinearLayout) viewFindViewById).setVisibility(hCaptchaConfigM109100a.getLoading() ? 0 : 8);
                this.f145135x = (LinearLayout) viewFindViewById;
                Handler handler = new Handler(Looper.getMainLooper());
                Context contextRequireContext = requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                try {
                    this.f145134w = new C29938w0(handler, contextRequireContext, hCaptchaConfigM109100a, c35649aM109101b, this, c34530fM109102c, hCaptchaWebViewM109104B);
                    this.f145137z = false;
                    return viewM109103A;
                } catch (BadParcelableException unused) {
                    dismiss();
                    if (c34530fM109102c != null && (function4 = c34530fM109102c.f145151y) != null) {
                        function4.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    }
                    return null;
                } catch (InflateException unused2) {
                    dismiss();
                    if (c34530fM109102c != null && (function3 = c34530fM109102c.f145151y) != null) {
                        function3.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    }
                    return null;
                } catch (AssertionError unused3) {
                    dismiss();
                    if (c34530fM109102c != null && (function2 = c34530fM109102c.f145151y) != null) {
                        function2.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    }
                    return null;
                } catch (ClassCastException unused4) {
                    dismiss();
                    if (c34530fM109102c != null && (function1 = c34530fM109102c.f145151y) != null) {
                        function1.invoke(new HCaptchaException(EnumC34528d.ERROR));
                    }
                    return null;
                }
            } catch (BadParcelableException unused5) {
            } catch (InflateException unused6) {
            } catch (AssertionError unused7) {
            } catch (ClassCastException unused8) {
            }
        } catch (BadParcelableException unused9) {
            c34530fM109102c = null;
        } catch (InflateException unused10) {
            c34530fM109102c = null;
        } catch (AssertionError unused11) {
            c34530fM109102c = null;
        } catch (ClassCastException unused12) {
            c34530fM109102c = null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        C29938w0 c29938w0 = this.f145134w;
        if (c29938w0 != null) {
            HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) c29938w0.f122262z;
            hCaptchaWebView.removeJavascriptInterface("JSInterface");
            hCaptchaWebView.removeJavascriptInterface("JSDI");
            ViewParent parent = hCaptchaWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(hCaptchaWebView);
            }
            hCaptchaWebView.destroy();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        C29938w0 c29938w0 = this.f145134w;
        if (dialog == null || window == null || c29938w0 == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.f145136y = window.getAttributes().dimAmount;
        if (((HCaptchaConfig) c29938w0.f122260x).getLoading()) {
            return;
        }
        window.clearFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // x40.InterfaceC37952b
    public final void onSuccess(Object obj) {
        C34530f c34530f;
        Function1 function1;
        String result = (String) obj;
        AbstractC22676k.m65750j(result, "result");
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        C29938w0 c29938w0 = this.f145134w;
        if (c29938w0 == null || (c34530f = (C34530f) c29938w0.f122261y) == null || (function1 = c34530f.f145150x) == null) {
            return;
        }
        function1.invoke(result);
    }

    @Override // u40.InterfaceC34532h
    public final void reset() {
        C29938w0 c29938w0 = this.f145134w;
        if (c29938w0 != null) {
            ((HCaptchaWebView) c29938w0.f122262z).loadUrl("javascript:reset();");
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m109109z() {
        Window window;
        HCaptchaConfig hCaptchaConfig;
        C29938w0 c29938w0 = this.f145134w;
        if (c29938w0 != null && (hCaptchaConfig = (HCaptchaConfig) c29938w0.f122260x) != null && hCaptchaConfig.getLoading()) {
            LinearLayout linearLayout = this.f145135x;
            if (linearLayout != null) {
                linearLayout.animate().alpha(0.0f).setDuration(200L).setListener(new C1916d(linearLayout, 17));
                return;
            }
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.addFlags(2);
        window.setDimAmount(this.f145136y);
    }
}
