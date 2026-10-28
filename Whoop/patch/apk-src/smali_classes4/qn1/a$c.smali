.class final Lqn1/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqn1/a;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lpn1/b;",
        "currentState",
        "Lqn1/d;",
        "internalAction",
        "<anonymous>",
        "(Lpn1/b;Lqn1/d;)Lpn1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsCenterDomainCombiner$interact$1"
    f = "HomeNotificationsCenterDomainCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqn1/a;


# direct methods
.method public constructor <init>(Lqn1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqn1/a;",
            "Lq83/d<",
            "-",
            "Lqn1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lpn1/b;Lqn1/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpn1/b;",
            "Lqn1/d;",
            "Lq83/d<",
            "-",
            "Lpn1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqn1/a$c;

    iget-object v1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-direct {v0, v1, p3}, Lqn1/a$c;-><init>(Lqn1/a;Lq83/d;)V

    iput-object p1, v0, Lqn1/a$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqn1/a$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqn1/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpn1/b;

    check-cast p2, Lqn1/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqn1/a$c;->f(Lpn1/b;Lqn1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lqn1/a$c;->x:Ljava/lang/Object;

    check-cast v0, Lpn1/b;

    iget-object v1, p0, Lqn1/a$c;->y:Ljava/lang/Object;

    check-cast v1, Lqn1/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqn1/a$c;->w:I

    if-nez v2, :cond_1a

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lqn1/d$k;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/4 v3, 0x0

    if-eqz p1, :cond_9

    check-cast v1, Lqn1/d$k;

    invoke-virtual {v1}, Lqn1/d$k;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    move-object v9, p1

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->g(Lqn1/a;Lpn1/b;)Ljava/util/Set;

    move-result-object p1

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-virtual {v1}, Lqn1/d$k;->a()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->getNotificationCards()Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Lqn1/a;->e(Lqn1/a;Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-static {v4, v5}, Lqn1/a;->d(Lqn1/a;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v5, v4, p1}, Lqn1/a;->c(Lqn1/a;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v11

    instance-of v4, v0, Lpn1/b$d;

    if-eqz v4, :cond_1

    move-object v4, v0

    check-cast v4, Lpn1/b$d;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    check-cast v0, Lpn1/b$d;

    invoke-virtual {v0}, Lpn1/b$d;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0, v11}, Lqn1/a;->m(Lqn1/a;Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    move-object v4, v11

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v4}, Lqn1/a;->h(Lqn1/a;)Lnn1/a;

    move-result-object v4

    invoke-static {v11}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/NotificationCardModel;

    if-eqz v5, :cond_3

    invoke-interface {v5}, Lcom/whoop/design/models/NotificationCardModel;->getId()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    :cond_3
    const-string v5, ""

    :cond_4
    invoke-virtual {v4, v5, v11}, Lnn1/a;->h(Ljava/lang/String;Ljava/util/List;)Lnn1/a$b;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v5}, Lqn1/a;->h(Lqn1/a;)Lnn1/a;

    move-result-object v5

    move-object v6, v4

    move-object v4, v5

    invoke-virtual {v6}, Lnn1/a$b;->a()Ljava/lang/String;

    move-result-object v5

    move-object v7, v6

    invoke-virtual {v7}, Lnn1/a$b;->b()Ljava/lang/String;

    move-result-object v6

    move-object v8, v7

    invoke-virtual {v8}, Lnn1/a$b;->d()I

    move-result v7

    move-object v10, v8

    invoke-virtual {v10}, Lnn1/a$b;->e()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v10}, Lnn1/a$b;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v4 .. v10}, Lnn1/a;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    new-instance v4, Lpn1/b$c;

    new-instance v5, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-direct {v5, v2, v3}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;-><init>(Ljava/util/List;I)V

    invoke-virtual {v1}, Lqn1/d$k;->b()Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move v7, v3

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v3, 0x1

    goto :goto_2

    :goto_4
    if-eqz v0, :cond_8

    sget-object v0, Lvn1/i;->SCALE_OUT:Lvn1/i;

    goto :goto_5

    :cond_8
    sget-object v0, Lvn1/i;->FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT:Lvn1/i;

    :goto_5
    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v8, 0x0

    move-object v10, p1

    move-object v6, v11

    move-object v11, v9

    move-object v9, v0

    invoke-direct/range {v4 .. v13}, Lpn1/b$c;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_9
    instance-of p1, v1, Lqn1/d$l;

    if-eqz p1, :cond_b

    check-cast v1, Lqn1/d$l;

    invoke-virtual {v1}, Lqn1/d$l;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object p1

    :cond_a
    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v4, v0}, Lqn1/a;->g(Lqn1/a;Lpn1/b;)Ljava/util/Set;

    move-result-object v0

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-virtual {v1}, Lqn1/d$l;->a()Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->getNotificationCards()Ljava/util/List;

    move-result-object v1

    invoke-static {v4, v1}, Lqn1/a;->e(Lqn1/a;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v4, v1}, Lqn1/a;->d(Lqn1/a;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v4, v1, v0}, Lqn1/a;->c(Lqn1/a;Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v1

    new-instance v4, Lpn1/b$d;

    new-instance v5, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-direct {v5, v2, v3}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;-><init>(Ljava/util/List;I)V

    invoke-direct {v4, v5, v1, v0, p1}, Lpn1/b$d;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;)V

    return-object v4

    :cond_b
    instance-of p1, v1, Lqn1/d$e;

    if-eqz p1, :cond_c

    sget-object p1, Lpn1/b$b;->a:Lpn1/b$b;

    return-object p1

    :cond_c
    instance-of p1, v1, Lqn1/d$c;

    if-eqz p1, :cond_e

    check-cast v1, Lqn1/d$c;

    invoke-virtual {v1}, Lqn1/d$c;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object p1

    :cond_d
    iget-object v0, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v0}, Lqn1/a;->h(Lqn1/a;)Lnn1/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnn1/a;->j(Ljava/lang/String;)V

    new-instance p1, Lpn1/b$a;

    const-string v0, "placeholder message"

    invoke-direct {p1, v0}, Lpn1/b$a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_e
    instance-of p1, v1, Lqn1/d$i;

    if-eqz p1, :cond_10

    instance-of p1, v0, Lpn1/b$c;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    check-cast v1, Lqn1/d$i;

    invoke-virtual {v1}, Lqn1/d$i;->b()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Lpn1/b$c;

    invoke-virtual {v1}, Lqn1/d$i;->a()Lvn1/a;

    move-result-object v1

    invoke-static {p1, v2, v0, v1}, Lqn1/a;->k(Lqn1/a;Ljava/lang/String;Lpn1/b$c;Lvn1/a;)Lpn1/b;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of p1, v0, Lpn1/b$d;

    if-eqz p1, :cond_17

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    check-cast v1, Lqn1/d$i;

    invoke-virtual {v1}, Lqn1/d$i;->b()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Lpn1/b$d;

    invoke-virtual {v1}, Lqn1/d$i;->a()Lvn1/a;

    move-result-object v1

    invoke-static {p1, v2, v0, v1}, Lqn1/a;->l(Lqn1/a;Ljava/lang/String;Lpn1/b$d;Lvn1/a;)Lpn1/b;

    move-result-object p1

    return-object p1

    :cond_10
    sget-object p1, Lqn1/d$j;->a:Lqn1/d$j;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    instance-of p1, v0, Lpn1/b$c;

    if-eqz p1, :cond_17

    move-object v1, v0

    check-cast v1, Lpn1/b$c;

    const/16 v9, 0x7b

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lpn1/b$c;->b(Lpn1/b$c;Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lpn1/b$c;

    move-result-object p1

    return-object p1

    :cond_11
    instance-of p1, v1, Lqn1/d$a;

    if-eqz p1, :cond_12

    instance-of p1, v0, Lpn1/b$c;

    if-eqz p1, :cond_17

    move-object v2, v0

    check-cast v2, Lpn1/b$c;

    check-cast v1, Lqn1/d$a;

    invoke-virtual {v1}, Lqn1/d$a;->a()Lvn1/i;

    move-result-object v7

    const/16 v10, 0x6f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lpn1/b$c;->b(Lpn1/b$c;Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lpn1/b$c;

    move-result-object p1

    return-object p1

    :cond_12
    instance-of p1, v1, Lqn1/d$b;

    if-eqz p1, :cond_13

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1}, Lqn1/a;->h(Lqn1/a;)Lnn1/a;

    move-result-object p1

    check-cast v1, Lqn1/d$b;

    invoke-virtual {v1}, Lqn1/d$b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lqn1/d$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lqn1/d$b;->c()I

    move-result v1

    iget-object v4, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {v4, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v2, v3, v1, v4}, Lnn1/a;->f(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-object v0

    :cond_13
    instance-of p1, v1, Lqn1/d$f;

    if-eqz p1, :cond_14

    goto :goto_6

    :cond_14
    instance-of p1, v1, Lqn1/d$d;

    if-eqz p1, :cond_16

    new-instance v4, Lpn1/b$c;

    new-instance v5, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-direct {v5, v2, v3}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;-><init>(Ljava/util/List;I)V

    check-cast v1, Lqn1/d$d;

    invoke-virtual {v1}, Lqn1/d$d;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_15

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object p1

    :cond_15
    move-object v11, p1

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v13}, Lpn1/b$c;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Ljava/util/List;ZZLvn1/i;Ljava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_16
    instance-of p1, v1, Lqn1/d$g;

    if-eqz p1, :cond_18

    instance-of p1, v0, Lpn1/b$c;

    if-eqz p1, :cond_17

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    check-cast v1, Lqn1/d$g;

    invoke-virtual {v1}, Lqn1/d$g;->a()Ljava/lang/String;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lpn1/b$c;

    invoke-virtual {v2}, Lpn1/b$c;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lpn1/b$c;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v3, v2}, Lqn1/a;->i(Lqn1/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    :cond_17
    :goto_6
    return-object v0

    :cond_18
    instance-of p1, v1, Lqn1/d$h;

    if-eqz p1, :cond_19

    iget-object v2, p0, Lqn1/a$c;->z:Lqn1/a;

    check-cast v1, Lqn1/d$h;

    invoke-virtual {v1}, Lqn1/d$h;->a()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lqn1/d$h;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lqn1/d$h;->e()I

    move-result v5

    invoke-virtual {v1}, Lqn1/d$h;->c()Ljava/lang/String;

    move-result-object v6

    iget-object p1, p0, Lqn1/a$c;->z:Lqn1/a;

    invoke-static {p1, v0}, Lqn1/a;->f(Lqn1/a;Lpn1/b;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lqn1/d$h;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static/range {v2 .. v8}, Lqn1/a;->j(Lqn1/a;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
