.class final Lcom/whoop/whoopaction/view/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whoopaction/view/a;->c(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
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
        "Ll83/n;",
        "Ll83/a0;",
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
    c = "com.whoop.whoopaction.view.FileExportUtil$copyFileToUri$2"
    f = "FileExportUtil.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/whoopaction/view/a;

.field final synthetic F:Ljava/io/File;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Landroid/content/Context;

.field final synthetic z:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/whoop/whoopaction/view/a;Ljava/io/File;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lcom/whoop/whoopaction/view/a;",
            "Ljava/io/File;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whoopaction/view/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whoopaction/view/a$d;->y:Landroid/content/Context;

    iput-object p2, p0, Lcom/whoop/whoopaction/view/a$d;->z:Landroid/net/Uri;

    iput-object p3, p0, Lcom/whoop/whoopaction/view/a$d;->E:Lcom/whoop/whoopaction/view/a;

    iput-object p4, p0, Lcom/whoop/whoopaction/view/a$d;->F:Ljava/io/File;

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

    new-instance v0, Lcom/whoop/whoopaction/view/a$d;

    iget-object v1, p0, Lcom/whoop/whoopaction/view/a$d;->y:Landroid/content/Context;

    iget-object v2, p0, Lcom/whoop/whoopaction/view/a$d;->z:Landroid/net/Uri;

    iget-object v3, p0, Lcom/whoop/whoopaction/view/a$d;->E:Lcom/whoop/whoopaction/view/a;

    iget-object v4, p0, Lcom/whoop/whoopaction/view/a$d;->F:Ljava/io/File;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/whoopaction/view/a$d;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/whoop/whoopaction/view/a;Ljava/io/File;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/whoopaction/view/a$d;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/view/a$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/view/a$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whoopaction/view/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/view/a$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const-string v0, "Failed to open output stream for "

    iget-object v1, p0, Lcom/whoop/whoopaction/view/a$d;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/whoopaction/view/a$d;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whoopaction/view/a$d;->y:Landroid/content/Context;

    iget-object v1, p0, Lcom/whoop/whoopaction/view/a$d;->z:Landroid/net/Uri;

    iget-object v2, p0, Lcom/whoop/whoopaction/view/a$d;->E:Lcom/whoop/whoopaction/view/a;

    iget-object v3, p0, Lcom/whoop/whoopaction/view/a$d;->F:Ljava/io/File;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    :try_start_1
    invoke-static {v2, v3, p1}, Lcom/whoop/whoopaction/view/a;->a(Lcom/whoop/whoopaction/view/a;Ljava/io/File;Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    iget-object v0, p0, Lcom/whoop/whoopaction/view/a$d;->F:Ljava/io/File;

    iget-object v1, p0, Lcom/whoop/whoopaction/view/a$d;->z:Landroid/net/Uri;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to copy file: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FileExportUtil"

    invoke-static {v1, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
