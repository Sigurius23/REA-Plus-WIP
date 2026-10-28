.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;,
        Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "configUIs",
        "setupEdgeToEdge",
        "",
        "type",
        "url",
        "showAttachment",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "loadUrlToWeb",
        "(Ljava/lang/String;)V",
        "showGiphy",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "AppWebViewClients",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$Companion;

.field private static final EXTRA_TYPE:Ljava/lang/String; = "type"

.field private static final EXTRA_URL:Ljava/lang/String; = "url"


# instance fields
.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->Companion:Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm/m;-><init>()V

    const-string v0, "Chat:AttachmentActivity"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final configUIs()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->ivImage:Landroid/widget/ImageView;

    const-string v3, "ivImage"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->webView:Landroid/webkit/WebView;

    const-string v4, "webView"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    sget-object v2, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity$AppWebViewClients;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final loadUrlToWeb(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->ivImage:Landroid/widget/ImageView;

    const-string v3, "ivImage"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->webView:Landroid/webkit/WebView;

    const-string v3, "webView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v4, "progressBar"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final setupEdgeToEdge()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding(Landroid/view/View;I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final showAttachment(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "giphy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->showGiphy(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->loadUrlToWeb(Ljava/lang/String;)V

    return-void
.end method

.method private final showGiphy(Ljava/lang/String;)V
    .locals 13

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Error!"

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    const/4 v2, 0x0

    const-string v3, "binding"

    if-eqz v1, :cond_3

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->ivImage:Landroid/widget/ImageView;

    const-string v4, "ivImage"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->webView:Landroid/webkit/WebView;

    const-string v1, "webView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    if-eqz v0, :cond_1

    iget-object v5, v0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->ivImage:Landroid/widget/ImageView;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_placeholder:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, p1

    invoke-static/range {v5 .. v12}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getStreamThemeInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->setupEdgeToEdge()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->configUIs()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "type"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "url"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1, v2}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->showAttachment(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentActivity;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v2, "This file can\'t be displayed. TYPE or URL is missing."

    invoke-interface {p1, v4, v3, v2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    sget p1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_attachment_display_error:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
