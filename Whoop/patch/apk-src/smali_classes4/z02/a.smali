.class public interface abstract Lz02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00028\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\t\u00a8\u0006\"\u00c0\u0006\u0003"
    }
    d2 = {
        "Lz02/a;",
        "T",
        "",
        "Lsr2/y;",
        "baseProvider",
        "",
        "url",
        "(Lsr2/y;)Ljava/lang/String;",
        "getPath",
        "()Ljava/lang/String;",
        "path",
        "Li63/t;",
        "getMethod",
        "()Li63/t;",
        "method",
        "",
        "getParameters",
        "()Ljava/util/Map;",
        "parameters",
        "getBody",
        "()Ljava/lang/Object;",
        "body",
        "",
        "getHasBody",
        "()Z",
        "hasBody",
        "getHeaders",
        "headers",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "getHttpTimeoutConfig",
        "()Lcom/whoop/network/request/HttpTimeoutConfig;",
        "httpTimeoutConfig",
        "getTag",
        "tag",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getBody()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract getHasBody()Z
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method

.method public getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getMethod()Li63/t;
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public getTag()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public url(Lsr2/y;)Ljava/lang/String;
    .locals 7

    const-string v0, "baseProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "urlString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li63/z;

    invoke-direct {v0}, Li63/z;-><init>()V

    invoke-static {v0, p1}, Li63/a0;->b(Li63/z;Ljava/lang/String;)V

    invoke-interface {p0}, Lz02/a;->getPath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    aget-object p1, p1, v3

    sget-object v4, Li63/a;->a:Ljava/util/Set;

    const-string v4, "<this>"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3}, Li63/a;->g(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v1, v0, Li63/z;->h:Ljava/util/List;

    invoke-interface {p0}, Lz02/a;->getParameters()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v5, v0, Li63/z;->j:Laj/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "name"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "value"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v5, Laj/c;->x:Ljava/lang/Object;

    check-cast v5, Li63/x;

    invoke-static {v4, v3}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v2}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v4, v1}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li63/z;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
