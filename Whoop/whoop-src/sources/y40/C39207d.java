package y40;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import java.io.Serializable;
import l83.C23470p;
import p002a0.C0030i1;
import p031b9.AbstractC2875y;
import p450r5.RunnableC30928b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import t83.C33617b;
import u40.EnumC34528d;
import u40.InterfaceC34532h;
import vv1.C36532c;

/* JADX INFO: renamed from: y40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C39207d implements Serializable {

    /* JADX INFO: renamed from: w */
    public final transient Handler f168498w;

    /* JADX INFO: renamed from: x */
    public final transient InterfaceC34532h f168499x;

    /* JADX INFO: renamed from: y */
    public final C23470p f168500y;

    public C39207d(Handler handler, HCaptchaConfig config, InterfaceC34532h interfaceC34532h) {
        AbstractC22676k.m65750j(config, "config");
        this.f168498w = handler;
        this.f168499x = interfaceC34532h;
        this.f168500y = AbstractC30060g.m92088H(new C36532c(config, 25));
    }

    @JavascriptInterface
    public final String getConfig() {
        return (String) this.f168500y.getValue();
    }

    @JavascriptInterface
    public final void onError(int i13) {
        EnumC34528d.f145144y.getClass();
        C33617b c33617b = EnumC34528d.f145143J;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            EnumC34528d enumC34528d = (EnumC34528d) c0030i1.next();
            if (enumC34528d.f145146w == i13) {
                this.f168498w.post(new RunnableC30928b(21, this, enumC34528d));
                return;
            }
        }
        throw new RuntimeException(AbstractC2875y.m8295h(i13, "Unsupported error id: "));
    }

    @JavascriptInterface
    public final void onLoaded() {
        this.f168498w.post(new RunnableC39206c(this, 1));
    }

    @JavascriptInterface
    public final void onOpen() {
        this.f168498w.post(new RunnableC39206c(this, 0));
    }

    @JavascriptInterface
    public final void onPass(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.f168498w.post(new RunnableC30928b(22, this, token));
    }
}
