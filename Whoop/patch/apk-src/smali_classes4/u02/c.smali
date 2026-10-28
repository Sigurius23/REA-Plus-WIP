.class public final Lu02/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ,\u0010\u0014\u001a\u00020\u0013\"\u0004\u0008\u0000\u0010\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lu02/c;",
        "",
        "Lsr2/y;",
        "baseUrlProvider",
        "Lv53/c;",
        "httpClient",
        "<init>",
        "(Lsr2/y;Lv53/c;)V",
        "Le63/d;",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "config",
        "Ll83/a0;",
        "b",
        "(Le63/d;Lcom/whoop/network/request/HttpTimeoutConfig;)V",
        "RequestBodyT",
        "Lz02/a;",
        "request",
        "Ls63/a;",
        "requestBodyTypeInfo",
        "Lf63/c;",
        "d",
        "(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lsr2/y;",
        "Lv53/c;",
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


# instance fields
.field private final a:Lsr2/y;

.field private final b:Lv53/c;


# direct methods
.method public constructor <init>(Lsr2/y;Lv53/c;)V
    .locals 1

    const-string v0, "baseUrlProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "httpClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu02/c;->a:Lsr2/y;

    iput-object p2, p0, Lu02/c;->b:Lv53/c;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/network/request/HttpTimeoutConfig;La63/f0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lu02/c;->c(Lcom/whoop/network/request/HttpTimeoutConfig;La63/f0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Le63/d;Lcom/whoop/network/request/HttpTimeoutConfig;)V
    .locals 3

    new-instance v0, Lrq0/x;

    const/16 v1, 0x18

    invoke-direct {v0, p2, v1}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, La63/h0;->d:La63/g0;

    new-instance p2, La63/f0;

    invoke-direct {p2}, La63/f0;-><init>()V

    invoke-virtual {v0, p2}, Lrq0/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, La63/h0;->d:La63/g0;

    iget-object p1, p1, Le63/d;->f:Lo63/f;

    sget-object v1, Ly53/e;->a:Lo63/a;

    sget-object v2, Le63/c;->w:Le63/c;

    invoke-virtual {p1, v1, v2}, Lo63/f;->a(Lo63/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final c(Lcom/whoop/network/request/HttpTimeoutConfig;La63/f0;)Ll83/a0;
    .locals 6

    const-string v0, "$this$timeout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getConnectTimeoutMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getConnectTimeoutMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v0, p1, La63/f0;->b:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getSocketTimeoutMillis()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getSocketTimeoutMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    invoke-static {v0}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v0, p1, La63/f0;->c:Ljava/lang/Long;

    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getRequestTimeoutMillis()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/network/request/HttpTimeoutConfig;->getRequestTimeoutMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_2
    invoke-static {v1}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v1, p1, La63/f0;->a:Ljava/lang/Long;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestBodyT:",
            "Ljava/lang/Object;",
            ">(",
            "Lz02/a<",
            "TRequestBodyT;>;",
            "Ls63/a;",
            "Lq83/d<",
            "-",
            "Lf63/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lu02/c;->a:Lsr2/y;

    invoke-interface {p1, v0}, Lz02/a;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lu02/c;->b:Lv53/c;

    new-instance v2, Le63/d;

    invoke-direct {v2}, Le63/d;-><init>()V

    const-string v3, "urlString"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Le63/d;->a:Li63/z;

    invoke-static {v3, v0}, Li63/a0;->b(Li63/z;Ljava/lang/String;)V

    invoke-interface {p1}, Lz02/a;->getMethod()Li63/t;

    move-result-object v0

    const-string v3, "<set-?>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v2, Le63/d;->b:Li63/t;

    invoke-interface {p1}, Lz02/a;->getHasBody()Z

    move-result v0

    iget-object v3, v2, Le63/d;->c:Li63/n;

    if-eqz v0, :cond_1

    sget-object v0, Li63/b;->a:Li63/d;

    const-string v4, "type"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Li63/r;->a:Ljava/util/List;

    invoke-virtual {v0}, Li63/j;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "value"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Li63/n;->F0(Ljava/lang/String;)V

    const-string v4, "Content-Type"

    invoke-virtual {v3, v4}, Lal/a;->v0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->clear()V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lz02/a;->getBody()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Le63/h;->a:Lo63/a;

    const-string v4, "bodyType"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_0

    sget-object v0, Lj63/a;->a:Lj63/a;

    :cond_0
    iput-object v0, v2, Le63/d;->d:Ljava/lang/Object;

    invoke-virtual {v2, p2}, Le63/d;->a(Ls63/a;)V

    :cond_1
    invoke-interface {p1}, Lz02/a;->getHeaders()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v4, v0}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lz02/a;->getTag()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    const-string v0, "X-Request-Tag"

    invoke-virtual {v3, v0, p2}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-interface {p1}, Lz02/a;->getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, v2, p1}, Lu02/c;->b(Le63/d;Lcom/whoop/network/request/HttpTimeoutConfig;)V

    :cond_4
    new-instance p1, Lf63/j;

    invoke-direct {p1, v2, v1}, Lf63/j;-><init>(Le63/d;Lv53/c;)V

    new-instance p2, Landroidx/room/z1;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p2, v1, v0}, Landroidx/room/z1;-><init>(ILq83/d;)V

    invoke-virtual {p1, p2, p3}, Lf63/j;->b(Landroidx/room/z1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
