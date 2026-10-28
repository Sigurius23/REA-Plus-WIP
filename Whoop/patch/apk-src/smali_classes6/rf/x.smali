.class public final Lrf/x;
.super Lud3/v0;
.source "SourceFile"


# static fields
.field public static final synthetic c:I


# instance fields
.field public final a:Lmf/l;

.field public final b:Lq83/j;


# direct methods
.method public constructor <init>(Lmf/l;Lq83/j;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/x;->a:Lmf/l;

    iput-object p2, p0, Lrf/x;->b:Lq83/j;

    instance-of p2, p1, Lmf/n;

    if-nez p2, :cond_1

    instance-of p2, p1, Lmf/k;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid streaming body "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public static final a(Lrf/x;Lne3/i;Ls83/i;)Ljava/lang/Object;
    .locals 2

    iget-object p0, p0, Lrf/x;->a:Lmf/l;

    instance-of v0, p0, Lmf/n;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_2

    check-cast p0, Lmf/n;

    iget-object p0, p0, Lmf/n;->b:Lt9/u;

    instance-of v0, p1, Lzf/g;

    if-eqz v0, :cond_0

    check-cast p1, Lzf/g;

    iget-object p1, p1, Lzf/g;->w:Lyf/t;

    goto :goto_0

    :cond_0
    new-instance v0, Lzf/e;

    invoke-direct {v0, p1}, Lzf/e;-><init>(Lne3/n0;)V

    move-object p1, v0

    :goto_0
    invoke-static {p0, p1, p2}, Lyf/j;->c(Lyf/o;Lyf/t;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    instance-of p2, p0, Lmf/k;

    if-eqz p2, :cond_3

    check-cast p0, Lmf/k;

    invoke-virtual {p0}, Lmf/k;->d()Lyf/u;

    move-result-object p0

    invoke-static {p0}, Ls30/b;->x(Lyf/u;)Lne3/p0;

    move-result-object p0

    :try_start_0
    invoke-interface {p1, p0}, Lne3/i;->N0(Lne3/p0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {p0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "unexpected HttpBody type "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Lne3/i;)V
    .locals 4

    const-string v0, "<this>"

    iget-object v1, p0, Lrf/x;->b:Lq83/j;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/b0;->x:Lbc3/j1;

    invoke-interface {v1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/b0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lbc3/b0;->w:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lbc3/b0;

    const-string v3, ":send-request-body"

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Lbc3/b0;

    const-string v0, "send-request-body"

    invoke-direct {v2, v0}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-interface {v1, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    iget-object v1, p0, Lrf/x;->a:Lmf/l;

    invoke-virtual {v1}, Lmf/l;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lkc3/d;->w:Lkc3/d;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v1, Ln43/a;

    const/16 v3, 0x10

    invoke-direct {v1, p1, p0, v2, v3}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    sget-object v3, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v3, v0, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    sget-object v1, Lbc3/z;->Key:Lbc3/y;

    invoke-interface {v0, v1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object v0

    new-instance v1, Ln20/j;

    const/16 v3, 0x19

    invoke-direct {v1, p0, p1, v2, v3}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    return-void
.end method

.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lrf/x;->a:Lmf/l;

    invoke-virtual {v0}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isDuplex()Z
    .locals 1

    iget-object v0, p0, Lrf/x;->a:Lmf/l;

    invoke-virtual {v0}, Lmf/l;->b()Z

    move-result v0

    return v0
.end method

.method public final isOneShot()Z
    .locals 1

    iget-object v0, p0, Lrf/x;->a:Lmf/l;

    invoke-virtual {v0}, Lmf/l;->c()Z

    move-result v0

    return v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1}, Lrf/x;->b(Lne3/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    new-instance p1, Lr70/b;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, Lr70/b;-><init>(I)V

    sget-object v0, Log/b;->E:Log/b;

    const-class v1, Lrf/x;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lrf/x;->b:Lq83/j;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3, p1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_2

    throw p1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
