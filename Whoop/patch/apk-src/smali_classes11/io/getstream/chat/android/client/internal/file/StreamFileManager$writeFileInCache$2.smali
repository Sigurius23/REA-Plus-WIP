.class final Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/file/StreamFileManager;->writeFileInCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;
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
        "Ljava/io/File;",
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
    c = "io.getstream.chat.android.client.internal.file.StreamFileManager$writeFileInCache$2"
    f = "StreamFileManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $source:Ljava/io/InputStream;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$fileName:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$source:Ljava/io/InputStream;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$fileName:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$source:Ljava/io/InputStream;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$context:Landroid/content/Context;

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->access$getOrCreateCacheDir(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;)Ln23/h;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$fileName:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;->$source:Ljava/io/InputStream;

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_0

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v1, p1}, Ls40/e0;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    new-instance p1, Ln23/g;

    invoke-direct {p1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_6
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_0
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :goto_1
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Failed to write file to cache."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
