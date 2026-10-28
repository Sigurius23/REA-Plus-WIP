.class final Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/file/StreamFileManager;->evictCacheFiles(Landroid/content/Context;Ljava/lang/String;JJLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.file.StreamFileManager$evictCacheFiles$2"
    f = "StreamFileManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $maxSizeBytes:J

.field final synthetic $prefix:Ljava/lang/String;

.field final synthetic $ttlMs:J

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;JJLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "JJ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$context:Landroid/content/Context;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$prefix:Ljava/lang/String;

    iput-wide p4, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$maxSizeBytes:J

    iput-wide p6, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$ttlMs:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$prefix:Ljava/lang/String;

    iget-wide v4, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$maxSizeBytes:J

    iget-wide v6, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$ttlMs:J

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;JJLq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->label:I

    if-nez v0, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->this$0:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$context:Landroid/content/Context;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$prefix:Ljava/lang/String;

    invoke-static {p1, v2, v3}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->access$listFilesInCache(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iget-wide v2, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$ttlMs:J

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    sub-long v7, v0, v7

    cmp-long v7, v7, v2

    if-ltz v7, :cond_0

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2$invokeSuspend$$inlined$sortBy$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3

    add-long/2addr v1, v3

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    iget-wide v3, p0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;->$maxSizeBytes:J

    cmp-long v0, v1, v3

    if-lez v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_6

    sub-long/2addr v1, v3

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
