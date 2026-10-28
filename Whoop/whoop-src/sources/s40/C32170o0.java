package s40;

import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.whoop.android.R;
import p314m.C24844i;
import p442qy.C30765d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s40.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32170o0 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final PaymentAuthWebViewActivity f133247a;

    /* JADX INFO: renamed from: b */
    public final C30765d f133248b;

    public C32170o0(PaymentAuthWebViewActivity paymentAuthWebViewActivity, C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f133247a = paymentAuthWebViewActivity;
        this.f133248b = logger;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage != null && (strMessage = consoleMessage.message()) != null) {
            this.f133248b.m94511a(strMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        C24844i c24844i = new C24844i(this.f133247a, R.style.StripeAlertDialogStyle);
        c24844i.f97324a.f97261f = str2;
        final int i13 = 0;
        C24844i positiveButton = c24844i.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s40.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                switch (i13) {
                    case 0:
                        JsResult jsResult2 = jsResult;
                        if (jsResult2 != null) {
                            jsResult2.confirm();
                        }
                        break;
                    default:
                        JsResult jsResult3 = jsResult;
                        if (jsResult3 != null) {
                            jsResult3.cancel();
                        }
                        break;
                }
            }
        });
        final int i14 = 1;
        positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: s40.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        JsResult jsResult2 = jsResult;
                        if (jsResult2 != null) {
                            jsResult2.confirm();
                        }
                        break;
                    default:
                        JsResult jsResult3 = jsResult;
                        if (jsResult3 != null) {
                            jsResult3.cancel();
                        }
                        break;
                }
            }
        }).create().show();
        return true;
    }
}
