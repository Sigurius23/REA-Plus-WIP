.class public final Lzd3/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lud3/a;

.field public final b:Lzd3/t;

.field public final c:Lzd3/o;

.field public final d:Z

.field public final e:Ljava/util/List;

.field public f:I

.field public g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lud3/a;Lzd3/t;Lzd3/o;Z)V
    .locals 2

    const-string v0, "routeDatabase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd3/w;->a:Lud3/a;

    iput-object p2, p0, Lzd3/w;->b:Lzd3/t;

    iput-object p3, p0, Lzd3/w;->c:Lzd3/o;

    iput-boolean p4, p0, Lzd3/w;->d:Z

    sget-object p2, Lm83/y;->w:Lm83/y;

    iput-object p2, p0, Lzd3/w;->e:Ljava/util/List;

    iput-object p2, p0, Lzd3/w;->g:Ljava/lang/Object;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lzd3/w;->h:Ljava/util/ArrayList;

    iget-object p2, p1, Lud3/a;->h:Lud3/e0;

    iget-object p4, p3, Lzd3/o;->E:Lud3/a0;

    invoke-virtual {p4, p3, p2}, Lud3/a0;->proxySelectStart(Lud3/j;Lud3/e0;)V

    invoke-virtual {p2}, Lud3/e0;->k()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lud3/a;->g:Ljava/net/ProxySelector;

    invoke-virtual {p1, v0}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lwd3/h;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lzd3/w;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lzd3/w;->f:I

    invoke-virtual {p4, p3, p2, p1}, Lud3/a0;->proxySelectEnd(Lud3/j;Lud3/e0;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget v0, p0, Lzd3/w;->f:I

    iget-object v1, p0, Lzd3/w;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzd3/w;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
