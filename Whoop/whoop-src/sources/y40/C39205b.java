package y40;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import com.whoop.android.R;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import u40.C34530f;
import u40.InterfaceC34532h;
import v40.C35649a;

/* JADX INFO: renamed from: y40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39205b implements InterfaceC34532h {

    /* JADX INFO: renamed from: E */
    public boolean f168491E;

    /* JADX INFO: renamed from: w */
    public final C34530f f168492w;

    /* JADX INFO: renamed from: x */
    public final C29938w0 f168493x;

    /* JADX INFO: renamed from: y */
    public boolean f168494y;

    /* JADX INFO: renamed from: z */
    public boolean f168495z;

    public C39205b(AbstractActivityC1340r0 activity, HCaptchaConfig config, C35649a internalConfig, C34530f c34530f) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(internalConfig, "internalConfig");
        this.f168492w = c34530f;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity);
        hCaptchaWebView.setId(R.id.webView);
        hCaptchaWebView.setVisibility(8);
        this.f168493x = new C29938w0(new Handler(Looper.getMainLooper()), activity, config, internalConfig, this, c34530f, hCaptchaWebView);
    }

    @Override // x40.InterfaceC37951a
    /* JADX INFO: renamed from: e */
    public final void mo109105e(HCaptchaException exception) {
        AbstractC22676k.m65750j(exception, "exception");
        C29938w0 c29938w0 = this.f168493x;
        if (c29938w0.m91557M(exception)) {
            ((HCaptchaWebView) c29938w0.f122262z).loadUrl("javascript:resetAndExecute();");
        } else {
            this.f168492w.f145151y.invoke(exception);
        }
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: h */
    public final void mo109106h() {
        this.f168492w.f145149w.invoke();
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: j */
    public final void mo109107j(AbstractActivityC1340r0 activity) {
        AbstractC22676k.m65750j(activity, "activity");
        if (this.f168494y) {
            ((HCaptchaWebView) this.f168493x.f122262z).loadUrl("javascript:resetAndExecute();");
        } else {
            this.f168495z = true;
        }
    }

    @Override // u40.InterfaceC34532h
    /* JADX INFO: renamed from: m */
    public final void mo109108m() {
        this.f168494y = true;
        if (this.f168491E) {
            this.f168491E = false;
            reset();
        } else if (this.f168495z) {
            this.f168495z = false;
            ((HCaptchaWebView) this.f168493x.f122262z).loadUrl("javascript:resetAndExecute();");
        }
    }

    @Override // x40.InterfaceC37952b
    public final void onSuccess(Object obj) {
        String result = (String) obj;
        AbstractC22676k.m65750j(result, "result");
        this.f168492w.f145150x.invoke(result);
    }

    @Override // u40.InterfaceC34532h
    public final void reset() {
        if (!this.f168494y) {
            this.f168491E = true;
            return;
        }
        C29938w0 c29938w0 = this.f168493x;
        ((HCaptchaWebView) c29938w0.f122262z).loadUrl("javascript:reset();");
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) c29938w0.f122262z;
        if (hCaptchaWebView.getParent() != null) {
            ViewParent parent = hCaptchaWebView.getParent();
            AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(hCaptchaWebView);
        }
    }
}
