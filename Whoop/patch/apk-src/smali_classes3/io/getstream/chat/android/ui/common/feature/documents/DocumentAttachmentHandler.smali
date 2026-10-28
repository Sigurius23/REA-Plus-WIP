.class public final Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\r\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\nR\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "Ll83/a0;",
        "openWithExternalApp",
        "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V",
        "Landroid/net/Uri;",
        "uri",
        "openFileUri",
        "(Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V",
        "Landroidx/lifecycle/g0;",
        "findLifecycleOwner",
        "(Landroid/content/Context;)Landroidx/lifecycle/g0;",
        "Landroid/app/Activity;",
        "findActivity",
        "(Landroid/content/Context;)Landroid/app/Activity;",
        "openAttachment",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;",
        "shareFileManager",
        "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;",
        "",
        "SNACKBAR_DELAY_MS",
        "J",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;

.field private static final SNACKBAR_DELAY_MS:J = 0x1f4L

.field private static final logger$delegate:Ll83/h;

.field private static final shareFileManager:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;

    const-string v1, "Chat:DocumentAttachmentHandler"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->logger$delegate:Ll83/h;

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->shareFileManager:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    const/16 v0, 0x8

    sput v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getShareFileManager$p()Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->shareFileManager:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    return-object v0
.end method

.method public static final synthetic access$openFileUri(Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->openFileUri(Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method

.method private final findActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast p1, Landroid/app/Activity;

    return-object p1

    :cond_0
    instance-of v1, p1, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private final findLifecycleOwner(Landroid/content/Context;)Landroidx/lifecycle/g0;
    .locals 2

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    instance-of v1, p1, Landroidx/lifecycle/g0;

    if-eqz v1, :cond_0

    check-cast p1, Landroidx/lifecycle/g0;

    return-object p1

    :cond_0
    instance-of v1, p1, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/content/ContextWrapper;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final openFileUri(Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v0, p3, Lb23/k;->c:Lb23/e;

    iget-object v1, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    const-string v0, "[openFileUri] No app available to open file."

    invoke-interface {p3, v2, v1, v0, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget p2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_attachment_no_app:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private final openWithExternalApp(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V
    .locals 4

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->findLifecycleOwner(Landroid/content/Context;)Landroidx/lifecycle/g0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {p2, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[openWithExternalApp] Could not find a LifecycleOwner from Context. Cannot download file."

    invoke-interface {p1, v2, v0, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_2

    const v3, 0x1020002

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;

    invoke-direct {v3, v2, p1, p2, v1}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler$openWithExternalApp$1;-><init>(Landroid/view/View;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final openAttachment(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;->openWithExternalApp(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method
