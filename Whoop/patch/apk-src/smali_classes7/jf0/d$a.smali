.class final Ljf0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf0/d;->c(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.util.TextFileUtil$writeTextToUri$2"
    f = "TextFileUtil.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljf0/d;

.field final synthetic z:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljf0/d;Landroid/net/Uri;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljf0/d;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljf0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljf0/d$a;->y:Ljf0/d;

    iput-object p2, p0, Ljf0/d$a;->z:Landroid/net/Uri;

    iput-object p3, p0, Ljf0/d$a;->E:Ljava/lang/String;

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

    new-instance v0, Ljf0/d$a;

    iget-object v1, p0, Ljf0/d$a;->y:Ljf0/d;

    iget-object v2, p0, Ljf0/d$a;->z:Landroid/net/Uri;

    iget-object v3, p0, Ljf0/d$a;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Ljf0/d$a;-><init>(Ljf0/d;Landroid/net/Uri;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ljf0/d$a;->x:Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ljf0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljf0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljf0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljf0/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string v0, "Failed to open output stream for URI: "

    const-string v1, "Successfully wrote text to URI: "

    iget-object v2, p0, Ljf0/d$a;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ljf0/d$a;->w:I

    if-nez v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v2, p0, Ljf0/d$a;->y:Ljf0/d;

    invoke-static {v2}, Ljf0/d;->a(Ljf0/d;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v3, p0, Ljf0/d$a;->z:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Ljf0/d$a;->E:Ljava/lang/String;

    iget-object v3, p0, Ljf0/d$a;->y:Ljf0/d;

    iget-object v4, p0, Ljf0/d$a;->z:Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v5, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v5, "getBytes(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    invoke-static {v3}, Ljf0/d;->b(Ljf0/d;)Ltr2/n;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, p1, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    const/4 p1, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {v2, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    iget-object v1, p0, Ljf0/d$a;->y:Ljf0/d;

    iget-object v2, p0, Ljf0/d$a;->z:Landroid/net/Uri;

    invoke-static {v1}, Ljf0/d;->b(Ljf0/d;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, p1, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Ljf0/d$a;->y:Ljf0/d;

    invoke-static {v1}, Ljf0/d;->b(Ljf0/d;)Ltr2/n;

    move-result-object v1

    iget-object v2, p0, Ljf0/d$a;->z:Landroid/net/Uri;

    const-string v3, "IOException writing text to URI: "

    invoke-static {v2, v3}, Lr80/c;->m(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, p1, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
