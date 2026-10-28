.class public final Lqf2/f$f;
.super Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf2/f;-><init>(Lrr2/c;Lin2/d;Ltd1/b;Lrf2/a;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lqf2/c;Liy1/c;Lmi1/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lci2/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource<",
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "qf2/f$f",
        "Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;",
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "data",
        "",
        "b",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;",
        "fetchFromDb",
        "(Lq83/d;)Ljava/lang/Object;",
        "fetchFromNetwork",
        "smart-alarm_release"
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
.field final synthetic a:Lqf2/f;


# direct methods
.method public constructor <init>(Lqf2/f;)V
    .locals 0

    iput-object p1, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-direct {p0}, Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lqf2/f$f$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqf2/f$f$a;

    iget v1, v0, Lqf2/f$f$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqf2/f$f$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqf2/f$f$a;

    invoke-direct {v0, p0, p2}, Lqf2/f$f$a;-><init>(Lqf2/f$f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqf2/f$f$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqf2/f$f$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lqf2/f$f$a;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    :try_start_1
    iget-object p2, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {p2}, Lqf2/f;->i(Lqf2/f;)Lrf2/a;

    move-result-object p2

    const/4 v2, 0x0

    iput-object v2, v0, Lqf2/f$f$a;->w:Ljava/lang/Object;

    iput v3, v0, Lqf2/f$f$a;->z:I

    invoke-interface {p2, p1, v0}, Lrf2/a;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_3
    const-string p1, "Contract violated: cache must only be called on non null data"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    iget-object p2, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {p2}, Lqf2/f;->f(Lqf2/f;)Ltr2/n;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to cache smart alarm info in db"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic cache(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {p0, p1, p2}, Lqf2/f$f;->a(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public fetchFromDb(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "smart alarm fetched from db: "

    instance-of v1, p1, Lqf2/f$f$b;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lqf2/f$f$b;

    iget v2, v1, Lqf2/f$f$b;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lqf2/f$f$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v1, Lqf2/f$f$b;

    invoke-direct {v1, p0, p1}, Lqf2/f$f$b;-><init>(Lqf2/f$f;Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lqf2/f$f$b;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lqf2/f$f$b;->y:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {p1}, Lqf2/f;->i(Lqf2/f;)Lrf2/a;

    move-result-object p1

    iput v5, v1, Lqf2/f$f$b;->y:I

    invoke-interface {p1, v1}, Lrf2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    iget-object v1, p0, Lqf2/f$f;->a:Lqf2/f;

    move-object v2, p1

    check-cast v2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v1}, Lqf2/f;->f(Lqf2/f;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {v0}, Lqf2/f;->f(Lqf2/f;)Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to fetch smart alarm info from db"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public fetchFromNetwork(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "smart alarm fetched from network: "

    instance-of v1, p1, Lqf2/f$f$c;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lqf2/f$f$c;

    iget v2, v1, Lqf2/f$f$c;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lqf2/f$f$c;->y:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lqf2/f$f$c;

    invoke-direct {v1, p0, p1}, Lqf2/f$f$c;-><init>(Lqf2/f$f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v7, Lqf2/f$f$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lqf2/f$f$c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {p1}, Lqf2/f;->h(Lqf2/f;)Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-result-object v2

    iget-object p1, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {p1}, Lqf2/f;->f(Lqf2/f;)Ltr2/n;

    move-result-object p1

    iget-object v4, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {v4}, Lqf2/f;->i(Lqf2/f;)Lrf2/a;

    move-result-object v4

    iget-object v5, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {v5}, Lqf2/f;->g(Lqf2/f;)Liy1/c;

    move-result-object v5

    iget-object v6, p0, Lqf2/f$f;->a:Lqf2/f;

    invoke-static {v6}, Lqf2/f;->e(Lqf2/f;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    iput v3, v7, Lqf2/f$f$c;->y:I

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lqf2/g;->a(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    iget-object v1, p0, Lqf2/f$f;->a:Lqf2/f;

    move-object v2, p1

    check-cast v2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v1}, Lqf2/f;->f(Lqf2/f;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_3
    iget-object v0, p0, Lqf2/f$f;->a:Lqf2/f;

    const-string v1, "Failed to fetch smart alarm user info"

    invoke-virtual {v0, p1, v1}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic shouldFetch(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {p0, p1}, Lqf2/f$f;->b(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z

    move-result p1

    return p1
.end method
