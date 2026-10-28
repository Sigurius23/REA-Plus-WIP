package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.databinding.StreamUiActivityAttachmentBinding;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import l83.InterfaceC23462h;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;", "Lm/m;", "<init>", "()V", "Ll83/a0;", "configUIs", "setupEdgeToEdge", "", AttachmentActivity.EXTRA_TYPE, "url", "showAttachment", "(Ljava/lang/String;Ljava/lang/String;)V", "loadUrlToWeb", "(Ljava/lang/String;)V", "showGiphy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "AppWebViewClients", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String EXTRA_TYPE = "type";
    private static final String EXTRA_URL = "url";
    private StreamUiActivityAttachmentBinding binding;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "Chat:AttachmentActivity");

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;", "Landroid/webkit/WebViewClient;", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)V", "Landroid/webkit/WebView;", ProfileAnalyticsKt.VIEW, "", "url", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Ll83/a0;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class AppWebViewClients extends WebViewClient {
        public AppWebViewClients() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(url, "url");
            super.onPageFinished(view, url);
            StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding = AttachmentActivity.this.binding;
            if (streamUiActivityAttachmentBinding == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            ProgressBar progressBar = streamUiActivityAttachmentBinding.progressBar;
            AbstractC22676k.m65749i(progressBar, "progressBar");
            progressBar.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(request, "request");
            C2345k logger = AttachmentActivity.this.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            String str = logger.f9273a;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "The load failed due to an unknown error: " + error, null);
            }
            if (error == null) {
                return;
            }
            Toast.makeText(AttachmentActivity.this, error.toString(), 0).show();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView view, String url) {
            AbstractC22676k.m65750j(view, "view");
            AbstractC22676k.m65750j(url, "url");
            view.loadUrl(url);
            return true;
        }
    }

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$Companion;", "", "<init>", "()V", "EXTRA_TYPE", "", "EXTRA_URL", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", AttachmentActivity.EXTRA_TYPE, "url", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Intent createIntent(Context context, String type, String url) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(url, "url");
            Intent intent = new Intent(context, (Class<?>) AttachmentActivity.class);
            intent.putExtra(AttachmentActivity.EXTRA_TYPE, type);
            intent.putExtra("url", url);
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void configUIs() {
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding = this.binding;
        if (streamUiActivityAttachmentBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView ivImage = streamUiActivityAttachmentBinding.ivImage;
        AbstractC22676k.m65749i(ivImage, "ivImage");
        ivImage.setVisibility(8);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding2 = this.binding;
        if (streamUiActivityAttachmentBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        WebView webView = streamUiActivityAttachmentBinding2.webView;
        AbstractC22676k.m65749i(webView, "webView");
        webView.setVisibility(8);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding3 = this.binding;
        if (streamUiActivityAttachmentBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        WebView webView2 = streamUiActivityAttachmentBinding3.webView;
        WebSettings settings = webView2.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        webView2.setWebViewClient(new AppWebViewClients());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void loadUrlToWeb(String url) {
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding = this.binding;
        if (streamUiActivityAttachmentBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView ivImage = streamUiActivityAttachmentBinding.ivImage;
        AbstractC22676k.m65749i(ivImage, "ivImage");
        ivImage.setVisibility(8);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding2 = this.binding;
        if (streamUiActivityAttachmentBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        WebView webView = streamUiActivityAttachmentBinding2.webView;
        AbstractC22676k.m65749i(webView, "webView");
        webView.setVisibility(0);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding3 = this.binding;
        if (streamUiActivityAttachmentBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ProgressBar progressBar = streamUiActivityAttachmentBinding3.progressBar;
        AbstractC22676k.m65749i(progressBar, "progressBar");
        progressBar.setVisibility(0);
        if (url != null) {
            StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding4 = this.binding;
            if (streamUiActivityAttachmentBinding4 != null) {
                streamUiActivityAttachmentBinding4.webView.loadUrl(url);
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
    }

    private final void setupEdgeToEdge() {
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding = this.binding;
        if (streamUiActivityAttachmentBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ConstraintLayout root = streamUiActivityAttachmentBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    private final void showAttachment(String type, String url) {
        if (AbstractC22676k.m65745e(type, "giphy")) {
            showGiphy(url);
        } else {
            loadUrlToWeb(url);
        }
    }

    private final void showGiphy(String url) {
        if (url == null) {
            Toast.makeText(this, "Error!", 0).show();
            return;
        }
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding = this.binding;
        if (streamUiActivityAttachmentBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView ivImage = streamUiActivityAttachmentBinding.ivImage;
        AbstractC22676k.m65749i(ivImage, "ivImage");
        ivImage.setVisibility(0);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding2 = this.binding;
        if (streamUiActivityAttachmentBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        WebView webView = streamUiActivityAttachmentBinding2.webView;
        AbstractC22676k.m65749i(webView, "webView");
        webView.setVisibility(8);
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBinding3 = this.binding;
        if (streamUiActivityAttachmentBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageView ivImage2 = streamUiActivityAttachmentBinding3.ivImage;
        AbstractC22676k.m65749i(ivImage2, "ivImage");
        ImageUtilsKt.load$default(ivImage2, url, Integer.valueOf(C19469R.drawable.stream_ui_placeholder), (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 28, (Object) null);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!ChatClient.INSTANCE.isInitialized()) {
            finish();
            return;
        }
        StreamUiActivityAttachmentBinding streamUiActivityAttachmentBindingInflate = StreamUiActivityAttachmentBinding.inflate(ContextKt.getStreamThemeInflater(this), null, false);
        this.binding = streamUiActivityAttachmentBindingInflate;
        setContentView(streamUiActivityAttachmentBindingInflate.getRoot());
        setupEdgeToEdge();
        configUIs();
        String stringExtra = getIntent().getStringExtra(EXTRA_TYPE);
        String stringExtra2 = getIntent().getStringExtra("url");
        if (stringExtra != null && stringExtra.length() != 0 && stringExtra2 != null && stringExtra2.length() != 0) {
            showAttachment(stringExtra, stringExtra2);
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "This file can't be displayed. TYPE or URL is missing.", null);
        }
        Toast.makeText(this, getString(C19470R.string.stream_ui_message_list_attachment_display_error), 0).show();
    }
}
