.class final Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->writeBitmapToShareableFile(Landroid/content/Context;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;
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
    c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeBitmapToShareableFile$2"
    f = "StreamShareFileManager.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $context:Landroid/content/Context;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$bitmap:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$bitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;-><init>(Landroid/graphics/Bitmap;Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayInputStream;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$1:Ljava/lang/Object;

    check-cast v0, [B

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$bitmap:Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getBitmapQuality()I

    move-result v4

    invoke-virtual {v1, v3, v4, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getFileManager$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    move-result-object p1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$context:Landroid/content/Context;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    invoke-static {v4}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getConfig$p(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->getBitmapShareFilename()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->L$2:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->label:I

    invoke-virtual {p1, v3, v4, v1, p0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->writeFileInCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->this$0:Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager$writeBitmapToShareableFile$2;->$context:Landroid/content/Context;

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_3

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;->access$getUriForFile(Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not write bitmap."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method
