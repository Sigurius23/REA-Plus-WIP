.class public final Lvk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/e;
.implements Lud3/k;


# instance fields
.field public E:Lxk/d;

.field public volatile F:Lzd3/o;

.field public final w:Lud3/i;

.field public final x:Ldl/i;

.field public y:Ltl/c;

.field public z:Lud3/a1;


# direct methods
.method public constructor <init>(Lud3/i;Ldl/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvk/a;->w:Lud3/i;

    iput-object p2, p0, Lvk/a;->x:Ldl/i;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lvk/a;->y:Ltl/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    iget-object v0, p0, Lvk/a;->z:Lud3/a1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lud3/a1;->close()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lvk/a;->E:Lxk/d;

    return-void
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lvk/a;->F:Lzd3/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    :cond_0
    return-void
.end method

.method public final d()Lwk/a;
    .locals 1

    sget-object v0, Lwk/a;->x:Lwk/a;

    return-object v0
.end method

.method public final e(Lcom/bumptech/glide/d;Lxk/d;)V
    .locals 3

    new-instance p1, Lud3/n0;

    invoke-direct {p1}, Lud3/n0;-><init>()V

    iget-object v0, p0, Lvk/a;->x:Ldl/i;

    invoke-virtual {v0}, Ldl/i;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lud3/n0;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lvk/a;->x:Ldl/i;

    iget-object v0, v0, Ldl/i;->b:Ldl/j;

    invoke-interface {v0}, Ldl/j;->getHeaders()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lud3/o0;

    invoke-direct {v0, p1}, Lud3/o0;-><init>(Lud3/n0;)V

    iput-object p2, p0, Lvk/a;->E:Lxk/d;

    iget-object p1, p0, Lvk/a;->w:Lud3/i;

    check-cast p1, Lud3/l0;

    invoke-virtual {p1, v0}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    iput-object p1, p0, Lvk/a;->F:Lzd3/o;

    iget-object p1, p0, Lvk/a;->F:Lzd3/o;

    invoke-virtual {p1, p0}, Lzd3/o;->d(Lud3/k;)V

    return-void
.end method

.method public final onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 1

    const/4 p1, 0x3

    const-string v0, "OkHttpFetcher"

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OkHttp failed to obtain result"

    invoke-static {v0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lvk/a;->E:Lxk/d;

    invoke-interface {p1, p2}, Lxk/d;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public final onResponse(Lud3/j;Lud3/x0;)V
    .locals 2

    iget-object p1, p2, Lud3/x0;->G:Lud3/a1;

    iput-object p1, p0, Lvk/a;->z:Lud3/a1;

    iget-boolean v0, p2, Lud3/x0;->Q:Z

    if-eqz v0, :cond_0

    const-string p2, "Argument must not be null"

    invoke-static {p1, p2}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lud3/a1;->i()J

    move-result-wide p1

    iget-object v0, p0, Lvk/a;->z:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Ltl/c;

    invoke-direct {v1, v0, p1, p2}, Ltl/c;-><init>(Ljava/io/InputStream;J)V

    iput-object v1, p0, Lvk/a;->y:Ltl/c;

    iget-object p1, p0, Lvk/a;->E:Lxk/d;

    invoke-interface {p1, v1}, Lxk/d;->f(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lvk/a;->E:Lxk/d;

    new-instance v0, Lcom/bumptech/glide/load/HttpException;

    iget-object p2, p2, Lud3/x0;->y:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Lxk/d;->c(Ljava/lang/Exception;)V

    return-void
.end method
