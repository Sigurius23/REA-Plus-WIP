.class public final Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0004\u0008 \u0010!JT\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u001c\u0008\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0008\u0002\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%H\u0086@\u00a2\u0006\u0004\u0008(\u0010)J&\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008*\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;",
        "",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "fileManager",
        "Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;",
        "uriProvider",
        "Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;",
        "config",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;)V",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "Ln23/h;",
        "Ljava/io/File;",
        "getCachedFileForAttachment",
        "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;",
        "file",
        "",
        "expectedSize",
        "",
        "isCachedFileValid",
        "(Ljava/io/File;J)Z",
        "",
        "getCacheFileName",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;",
        "Landroid/net/Uri;",
        "getUriForFile",
        "(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "writeBitmapToShareableFile",
        "(Landroid/content/Context;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/Function2;",
        "Ll83/a0;",
        "onProgress",
        "Lkotlin/Function0;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "writeAttachmentToShareableFile",
        "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;)Ljava/lang/Object;",
        "getShareableUriForAttachment",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;",
        "Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final config:Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

.field private final fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

.field private final uriProvider:Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;)V
    .locals 1

    const-string v0, "fileManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->uriProvider:Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->config:Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    new-instance p1, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    .line 9
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 10
    new-instance v0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;-><init>(Ljava/lang/String;Ljava/lang/String;IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 11
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;)V

    return-void
.end method

.method public static final synthetic access$getCacheFileName(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->getCacheFileName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCachedFileForAttachment(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->getCachedFileForAttachment(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->config:Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    return-object p0
.end method

.method public static final synthetic access$getFileManager$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/client/internal/file/StreamFileManager;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    return-object p0
.end method

.method public static final access$getUriForFile(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->uriProvider:Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;->getUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method private final getCacheFileName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->config:Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getCacheFilePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getCachedFileForAttachment(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;

    iget v1, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;-><init>(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    iget-object p1, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$0:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->getCacheFileName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p3

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    const/4 v4, 0x0

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getCachedFileForAttachment$1;->label:I

    invoke-virtual {v2, p1, p3, v0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getFileFromCache(Landroid/content/Context;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ln23/h;

    instance-of p1, p3, Ln23/g;

    if-eqz p1, :cond_5

    check-cast p3, Ln23/g;

    iget-object p1, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result p2

    int-to-long p2, p2

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->isCachedFileValid(Ljava/io/File;J)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_4
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Cached file is invalid, incomplete, or expired."

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_5
    instance-of p1, p3, Ln23/f;

    if-eqz p1, :cond_6

    return-object p3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->uriProvider:Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;->getUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method private final isCachedFileValid(Ljava/io/File;J)Z
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    sub-long/2addr p2, v0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->config:Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getCacheTtlMs()J

    move-result-wide v0

    cmp-long p1, p2, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic writeAttachmentToShareableFile$default(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    new-instance p4, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x14

    invoke-direct {p4, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeAttachmentToShareableFile(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final writeAttachmentToShareableFile$lambda$0()Lio/getstream/chat/android/client/ChatClient;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getShareableUriForAttachment(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getShareableUriForAttachment$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$getShareableUriForAttachment$2;-><init>(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final writeAttachmentToShareableFile(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lc93/m;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;-><init>(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/a;Lc93/m;Lq83/d;)V

    invoke-static {v0, v1, p5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final writeBitmapToShareableFile(Landroid/content/Context;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/graphics/Bitmap;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;-><init>(Landroid/graphics/Bitmap;Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
