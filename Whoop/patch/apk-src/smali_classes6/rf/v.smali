.class public final Lrf/v;
.super Ljava/net/ProxySelector;
.source "SourceFile"


# instance fields
.field public final a:Lpf/t;


# direct methods
.method public constructor <init>(Lpf/t;)V
    .locals 1

    const-string v0, "sdkSelector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/net/ProxySelector;-><init>()V

    iput-object p1, p0, Lrf/v;->a:Lpf/t;

    return-void
.end method


# virtual methods
.method public final connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V
    .locals 0

    return-void
.end method

.method public final select(Ljava/net/URI;)Ljava/util/List;
    .locals 14

    if-nez p1, :cond_0

    goto/16 :goto_7

    :cond_0
    sget-object v0, Lbg/l;->c:Lbg/l;

    new-instance v0, Lbd3/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbd3/k;-><init>(I)V

    new-instance v2, Lcg/g;

    invoke-direct {v2}, Lcg/g;-><init>()V

    sget-object v3, Ltg/b;->f:Ltg/b;

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getScheme(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ldt/b;->C(Ljava/lang/String;)Lbg/l;

    move-result-object v7

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getHost(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "["

    invoke-static {v4, v6, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    invoke-static {v6, v5}, Le93/b;->i0(II)Li93/j;

    move-result-object v5

    invoke-static {v4, v5}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lwb3/f;->V(Ljava/lang/String;)Lbg/e;

    move-result-object v8

    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    if-lez v4, :cond_2

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    invoke-virtual {p1}, Ljava/net/URI;->getRawPath()Ljava/lang/String;

    move-result-object v4

    const-string v9, "getRawPath(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lbd3/k;->e(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/net/URI;->getRawQuery()Ljava/lang/String;

    move-result-object v4

    const-string v9, "getRawQuery(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v2, Lcg/g;->z:Lhf/h;

    invoke-virtual {v2, v9, v4}, Lcg/g;->c(Lhf/h;Ljava/lang/String;)V

    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/net/URI;->getRawUserInfo()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    sget v3, Lcg/y;->c:I

    invoke-virtual {p1}, Ljava/net/URI;->getRawUserInfo()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getRawUserInfo(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lwe/o;

    invoke-direct {v4, v1}, Lwe/o;-><init>(I)V

    invoke-virtual {v4, v3}, Lwe/o;->M(Ljava/lang/String;)V

    new-instance v1, Lcg/y;

    iget-object v3, v4, Lwe/o;->w:Ljava/lang/Object;

    check-cast v3, Ltg/b;

    iget-object v4, v4, Lwe/o;->x:Ljava/lang/Object;

    check-cast v4, Ltg/b;

    invoke-direct {v1, v3, v4}, Lcg/y;-><init>(Ltg/b;Ltg/b;)V

    goto :goto_4

    :cond_6
    :goto_3
    move-object v4, v3

    :goto_4
    invoke-virtual {p1}, Ljava/net/URI;->getRawFragment()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object v1, Ltg/g;->k:Ltg/g;

    invoke-interface {v1, p1}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object v6

    :cond_7
    move-object v13, v6

    new-instance v6, Lcg/o;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_5
    move v9, p1

    goto :goto_6

    :cond_8
    iget p1, v7, Lbg/l;->b:I

    goto :goto_5

    :goto_6
    new-instance v10, Lcg/x;

    iget-object p1, v0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-boolean v0, v0, Lbd3/k;->b:Z

    invoke-direct {v10, p1, v0}, Lcg/x;-><init>(Ljava/util/List;Z)V

    invoke-virtual {v2}, Lcg/g;->b()Lcg/i;

    move-result-object v11

    new-instance v12, Lcg/y;

    invoke-direct {v12, v3, v4}, Lcg/y;-><init>(Ltg/b;Ltg/b;)V

    invoke-direct/range {v6 .. v13}, Lcg/o;-><init>(Lbg/l;Lbg/e;ILcg/x;Lcg/i;Lcg/y;Ltg/b;)V

    iget-object p1, p0, Lrf/v;->a:Lpf/t;

    invoke-interface {p1, v6}, Lpf/t;->q(Lcg/o;)Lpf/r;

    move-result-object p1

    instance-of v0, p1, Lpf/q;

    if-eqz v0, :cond_9

    new-instance v0, Ljava/net/Proxy;

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v2, Ljava/net/InetSocketAddress;

    check-cast p1, Lpf/q;

    iget-object p1, p1, Lpf/q;->a:Lcg/o;

    iget-object v3, p1, Lcg/o;->b:Lbg/e;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget p1, p1, Lcg/o;->c:I

    invoke-direct {v2, v3, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v0, v1, v2}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_7
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
