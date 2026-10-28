.class public abstract Lvm0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a7\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0008\"\u00020\u00012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a)\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0001*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lvm0/a;",
        "",
        "screen",
        "",
        "Ljy1/a;",
        "g",
        "(Lvm0/a;Ljava/lang/String;)Ljava/util/List;",
        "name",
        "",
        "tags",
        "b",
        "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;",
        "",
        "value",
        "d",
        "(Ljava/lang/String;DLjava/lang/String;)Ljy1/a;",
        "h",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "",
        "f",
        "(I)Ljava/lang/String;",
        "cache_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lvm0/a;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lvm0/e;->g(Lvm0/a;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;
    .locals 8

    new-instance v0, Ljy1/a;

    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lvm0/e;->h(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljy1/a;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/String;DLjava/lang/String;)Ljy1/a;
    .locals 8

    new-instance v0, Ljy1/a;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1, p3}, Lvm0/e;->h(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic e(Ljava/lang/String;DLjava/lang/String;ILjava/lang/Object;)Ljy1/a;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lvm0/e;->d(Ljava/lang/String;DLjava/lang/String;)Ljy1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f(I)Ljava/lang/String;
    .locals 0

    if-lez p0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "io"

    return-object p0
.end method

.method private static final g(Lvm0/a;Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvm0/a;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljy1/a;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lvm0/a$b;

    const-string v1, "bff_cache.result"

    if-eqz v0, :cond_0

    check-cast p0, Lvm0/a$b;

    invoke-virtual {p0}, Lvm0/a$b;->b()Lvm0/c;

    move-result-object v0

    invoke-virtual {v0}, Lvm0/c;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v2, "source:"

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "result:hit"

    filled-new-array {v2, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object v0

    invoke-virtual {p0}, Lvm0/a$b;->a()J

    move-result-wide v1

    long-to-double v1, v1

    const-string p0, "bff_cache.staleness_ms"

    invoke-static {p0, v1, v2, p1}, Lvm0/e;->d(Ljava/lang/String;DLjava/lang/String;)Ljy1/a;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lvm0/a$d;->a:Lvm0/a$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "result:miss"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lvm0/a$g;

    if-eqz v0, :cond_3

    check-cast p0, Lvm0/a$g;

    invoke-virtual {p0}, Lvm0/a$g;->a()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "network:success"

    goto :goto_0

    :cond_2
    const-string p0, "network:failure"

    :goto_0
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    const-string v0, "bff_cache.network"

    invoke-static {v0, p0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lvm0/a$f;

    if-eqz v0, :cond_4

    check-cast p0, Lvm0/a$f;

    invoke-virtual {p0}, Lvm0/a$f;->a()I

    move-result p0

    invoke-static {p0}, Lvm0/e;->f(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "status:"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    const-string v0, "bff_cache.miss_and_network_failure"

    invoke-static {v0, p0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_4
    sget-object v0, Lvm0/a$e;->a:Lvm0/a$e;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const-string p0, "bff_cache.miss_and_decode_failure"

    new-array v0, v1, [Ljava/lang/String;

    invoke-static {p0, v0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of v0, p0, Lvm0/a$a;

    if-eqz v0, :cond_6

    const-string p0, "bff_cache.decode_failure"

    new-array v0, v1, [Ljava/lang/String;

    invoke-static {p0, v0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of v0, p0, Lvm0/a$h;

    if-eqz v0, :cond_7

    check-cast p0, Lvm0/a$h;

    invoke-virtual {p0}, Lvm0/a$h;->a()Ljava/lang/String;

    move-result-object p0

    const-string v0, "http_endpoint:"

    invoke-static {v0, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "decode_error:true"

    filled-new-array {v0, p0}, [Ljava/lang/String;

    move-result-object p0

    const-string v0, "whoop.api.status_code"

    invoke-static {v0, p0, p1}, Lvm0/e;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of p1, p0, Lvm0/a$c;

    if-eqz p1, :cond_8

    new-array p1, v1, [Ljava/lang/String;

    const/4 v0, 0x4

    const-string v1, "bff_cache.maintenance"

    const/4 v2, 0x0

    invoke-static {v1, p1, v2, v0, v2}, Lvm0/e;->c(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljy1/a;

    move-result-object p1

    check-cast p0, Lvm0/a$c;

    invoke-virtual {p0}, Lvm0/a$c;->a()J

    move-result-wide v0

    long-to-double v3, v0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v2, "bff_cache.maintenance.duration_ms"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lvm0/e;->e(Ljava/lang/String;DLjava/lang/String;ILjava/lang/Object;)Ljy1/a;

    move-result-object v0

    invoke-virtual {p0}, Lvm0/a$c;->b()I

    move-result p0

    int-to-double v2, p0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "bff_cache.maintenance.rows_deleted"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lvm0/e;->e(Ljava/lang/String;DLjava/lang/String;ILjava/lang/Object;)Ljy1/a;

    move-result-object p0

    filled-new-array {p1, v0, p0}, [Ljy1/a;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final h(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p0, Ljava/util/Collection;

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method
