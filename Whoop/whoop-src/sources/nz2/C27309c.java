package nz2;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nz2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\t\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\t\u0010\u001eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R.\u0010\t\u001a\u001c\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, m65681d2 = {"Lnz2/c;", "Landroid/webkit/WebChromeClient;", "Lkotlin/Function1;", "", "Ll83/a0;", "logWebEvent", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "onShowFileChooser", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "title", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "webView", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "a", "Lkotlin/jvm/functions/Function1;", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27309c extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 logWebEvent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onShowFileChooser;

    /* JADX INFO: renamed from: nz2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f109371a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f109371a = iArr;
        }
    }

    public C27309c(Function1 logWebEvent, Function1 onShowFileChooser) {
        AbstractC22676k.m65750j(logWebEvent, "logWebEvent");
        AbstractC22676k.m65750j(onShowFileChooser, "onShowFileChooser");
        this.logWebEvent = logWebEvent;
        this.onShowFileChooser = onShowFileChooser;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
        if ((messageLevel == null ? -1 : a.f109371a[messageLevel.ordinal()]) == 1) {
            this.logWebEvent.invoke("Failure loading Type Form Step [WebView] - " + consoleMessage.message());
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        this.logWebEvent.invoke("Loading Page [Current Progress] - " + newProgress);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        this.logWebEvent.invoke("Change in the document title [Title] - " + title);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.onShowFileChooser.invoke(filePathCallback);
        return true;
    }
}
