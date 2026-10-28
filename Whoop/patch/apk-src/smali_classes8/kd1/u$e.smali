.class final Lkd1/u$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd1/u;->j(Ljava/lang/String;Lhy0/p;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd1/u$e$a;
    }
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
        "Ll83/n;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lbc3/c0;)Ll83/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.util.PdfCacheManager$getOrDownload$2"
    f = "PdfCacheManager.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lhy0/p;

.field final synthetic z:Lkd1/u;


# direct methods
.method public constructor <init>(Lhy0/p;Lkd1/u;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhy0/p;",
            "Lkd1/u;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lkd1/u$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkd1/u$e;->y:Lhy0/p;

    iput-object p2, p0, Lkd1/u$e;->z:Lkd1/u;

    iput-object p3, p0, Lkd1/u$e;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lkd1/u$e;

    iget-object v1, p0, Lkd1/u$e;->y:Lhy0/p;

    iget-object v2, p0, Lkd1/u$e;->z:Lkd1/u;

    iget-object v3, p0, Lkd1/u$e;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lkd1/u$e;-><init>(Lhy0/p;Lkd1/u;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lkd1/u$e;->x:Ljava/lang/Object;

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
            "Ll83/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkd1/u$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkd1/u$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkd1/u$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkd1/u$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-string v0, "Download failed: "

    iget-object v1, p0, Lkd1/u$e;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkd1/u$e;->w:I

    if-nez v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkd1/u$e;->y:Lhy0/p;

    sget-object v2, Lkd1/u$e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Lkd1/u$e;->E:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lkd1/u$e;->z:Lkd1/u;

    invoke-static {p1}, Lkd1/u;->f(Lkd1/u;)Lsr2/y;

    move-result-object p1

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lkd1/u$e;->E:Ljava/lang/String;

    invoke-static {p1, v2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object v2, p0, Lkd1/u$e;->z:Lkd1/u;

    invoke-static {v2, p1}, Lkd1/u;->c(Lkd1/u;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    new-instance p1, Ll83/n;

    invoke-direct {p1, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lkd1/u$e;->z:Lkd1/u;

    invoke-static {v4}, Lkd1/u;->b(Lkd1/u;)Ljava/io/File;

    move-result-object v4

    invoke-static {v2}, Lx83/j;->n(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    const-string v6, ".tmp"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v4, Lud3/n0;

    invoke-direct {v4}, Lud3/n0;-><init>()V

    invoke-virtual {v4, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v4}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v4, p0, Lkd1/u$e;->z:Lkd1/u;

    invoke-static {v4}, Lkd1/u;->e(Lkd1/u;)Lud3/l0;

    move-result-object v4

    invoke-virtual {v4, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    invoke-virtual {p1}, Lzd3/o;->e()Lud3/x0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v4, p1, Lud3/x0;->Q:Z

    if-eqz v4, :cond_4

    iget-object v0, p1, Lud3/x0;->G:Lud3/a1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v0, v4}, Ls40/e0;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {p1}, Lud3/x0;->close()V

    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to move temp file to cache"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v4

    goto :goto_1

    :catchall_2
    move-exception v5

    :try_start_7
    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v6

    :try_start_8
    invoke-static {v4, v5}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_1
    :try_start_9
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :catchall_4
    move-exception v5

    :try_start_a
    invoke-static {v0, v4}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "Empty response body"

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v4, Ljava/lang/IllegalStateException;

    iget v5, p1, Lud3/x0;->z:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_2
    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    move-exception v4

    :try_start_c
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    :goto_3
    invoke-static {v1}, Lbc3/f0;->n(Lbc3/c0;)V

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :cond_5
    new-instance p1, Ll83/n;

    invoke-direct {p1, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
