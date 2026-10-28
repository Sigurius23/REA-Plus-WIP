.class final Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeAttachmentToShareableFile(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Landroid/net/Uri;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeAttachmentToShareableFile$3"
    f = "StreamShareFileManager.kt"
    l = {
        0x5b,
        0x5f,
        0x65,
        0x6d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attachment:Lio/getstream/chat/android/models/Attachment;

.field final synthetic $chatClient:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $onProgress:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/a;Lc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/Attachment;",
            "Lc93/a;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$chatClient:Lc93/a;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$onProgress:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$chatClient:Lc93/a;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$onProgress:Lc93/m;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;-><init>(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/a;Lc93/m;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->label:I

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v10, :cond_1

    if-ne v0, v9, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$3:Ljava/lang/Object;

    check-cast v0, Lud3/a1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$2:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_2

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iput v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->label:I

    invoke-static {v0, v3, v4, p0}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getCachedFileForAttachment(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    check-cast v0, Ln23/h;

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_6

    new-instance v1, Ln23/g;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static {v2, v3, v0}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getUriForFile(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getFileManager$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getCacheFilePrefix()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getCacheTtlMs()J

    move-result-wide v4

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v6}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getMaxCacheSizeBytes()J

    move-result-wide v12

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    iput v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->label:I

    move-object v7, p0

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move-wide v5, v12

    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->evictCacheFiles(Landroid/content/Context;Ljava/lang/String;JJLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_7

    goto/16 :goto_4

    :cond_7
    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v0, Ln23/f;

    new-instance v1, Ln23/a;

    const-string v2, "File URL cannot be null."

    invoke-direct {v1, v2}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$chatClient:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->downloadFile(Ljava/lang/String;)Lo23/d;

    move-result-object v0

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$1:Ljava/lang/Object;

    iput v10, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->label:I

    invoke-interface {v0, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    check-cast v0, Ln23/h;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$onProgress:Lc93/m;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    instance-of v5, v0, Ln23/g;

    if-eqz v5, :cond_c

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lud3/a1;

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getCacheFileName(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_a

    new-instance v6, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;

    invoke-virtual {v0}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v2

    int-to-long v12, v2

    invoke-direct {v6, v0, v12, v13, v3}, Lio/getstream/chat/android/ui/common/internal/file/ProgressInputStream;-><init>(Ljava/io/InputStream;JLc93/m;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v0}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v6

    :goto_3
    invoke-static {v1}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getFileManager$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    move-result-object v0

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$0:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$1:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$2:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$3:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$4:Ljava/lang/Object;

    iput-object v11, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->L$5:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->I$0:I

    iput v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->I$1:I

    iput v9, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->label:I

    invoke-virtual {v0, v4, v5, v6, p0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->writeFileInCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_b

    :goto_4
    return-object v8

    :cond_b
    :goto_5
    check-cast v0, Ln23/h;

    goto :goto_6

    :cond_c
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_f

    :goto_6
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeAttachmentToShareableFile$3;->$context:Landroid/content/Context;

    instance-of v3, v0, Ln23/g;

    if-eqz v3, :cond_d

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static {v1, v2, v0}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getUriForFile(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ln23/g;

    invoke-direct {v1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_d
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_e

    return-object v0

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
