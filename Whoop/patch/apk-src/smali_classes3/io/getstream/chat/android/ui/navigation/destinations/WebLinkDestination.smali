.class public final Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;
.super Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;",
        "Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;",
        "Landroid/content/Context;",
        "context",
        "",
        "url",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Ll83/a0;",
        "navigate",
        "()V",
        "Ljava/lang/String;",
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


# instance fields
.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final navigate()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;->url:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->addSchemeToUrlIfNeeded(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;->start(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_error_cannot_open_link:I

    iget-object v3, p0, Lio/getstream/chat/android/ui/navigation/destinations/WebLinkDestination;->url:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
