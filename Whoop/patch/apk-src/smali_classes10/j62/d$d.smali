.class final Lj62/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj62/d;->interact(Lec3/l;)Lec3/l;
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
        "Lj62/b;",
        "internalState",
        "Lj62/e;",
        "action",
        "<anonymous>",
        "(Lj62/b;Lj62/e;)Lj62/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.referafriend.domain.ReferAFriendInteractor$interact$2"
    f = "ReferAFriendInteractor.kt"
    l = {
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj62/d;


# direct methods
.method public constructor <init>(Lj62/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj62/d;",
            "Lq83/d<",
            "-",
            "Lj62/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj62/d$d;->z:Lj62/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lj62/b;Lj62/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj62/b;",
            "Lj62/e;",
            "Lq83/d<",
            "-",
            "Lj62/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lj62/d$d;

    iget-object v1, p0, Lj62/d$d;->z:Lj62/d;

    invoke-direct {v0, v1, p3}, Lj62/d$d;-><init>(Lj62/d;Lq83/d;)V

    iput-object p1, v0, Lj62/d$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj62/d$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj62/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj62/b;

    check-cast p2, Lj62/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lj62/d$d;->f(Lj62/b;Lj62/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lj62/d$d;->x:Ljava/lang/Object;

    check-cast v0, Lj62/b;

    iget-object v1, p0, Lj62/d$d;->y:Ljava/lang/Object;

    check-cast v1, Lj62/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lj62/d$d;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lj62/e$d;->a:Lj62/e$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lj62/c$c;->a:Lj62/c$c;

    invoke-virtual {v0, p1}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lj62/e$c;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lj62/d$d;->z:Lj62/d;

    move-object v3, v1

    check-cast v3, Lj62/e$c;

    invoke-virtual {v3}, Lj62/e$c;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v0, p0, Lj62/d$d;->x:Ljava/lang/Object;

    iput-object v1, p0, Lj62/d$d;->y:Ljava/lang/Object;

    iput v4, p0, Lj62/d$d;->w:I

    invoke-static {p1, v3, p0}, Lj62/d;->c(Lj62/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/referafriend/domain/models/RafHubResponse;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lj62/d$d;->z:Lj62/d;

    check-cast v1, Lj62/e$c;

    invoke-virtual {v1}, Lj62/e$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, p1, v3}, Lj62/d;->f(Lj62/d;Lcom/whoop/referafriend/domain/models/RafHubResponse;Ljava/lang/String;)V

    new-instance v4, Lj62/c$b;

    invoke-static {p1}, Lcom/whoop/referafriend/domain/models/RafHubResponseKt;->toRafHubDomainState(Lcom/whoop/referafriend/domain/models/RafHubResponse;)Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    move-result-object v5

    invoke-virtual {v1}, Lj62/e$c;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj62/c$b;-><init>(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v4}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, p0, Lj62/d$d;->z:Lj62/d;

    invoke-static {p1}, Lj62/d;->d(Lj62/d;)Lh62/b;

    move-result-object p1

    new-instance v2, Lh62/a$b;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lh62/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lj62/e$c;

    invoke-virtual {v1}, Lj62/e$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    new-instance p1, Lj62/c$a;

    invoke-virtual {v1}, Lj62/e$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lj62/c$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Lj62/e$e;->a:Lj62/e$e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string v2, "null cannot be cast to non-null type com.whoop.referafriend.domain.ReferAFriendHubDomainResult.Loaded"

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj62/c$b;

    invoke-virtual {p1}, Lj62/c$b;->d()Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->getPromotion()Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj62/c$b;

    new-instance v5, Lj62/f$a;

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/Promotion;->getReward()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    move-result-object p1

    invoke-direct {v5, p1}, Lj62/f$a;-><init>(Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lj62/c$b;->b(Lj62/c$b;Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILjava/lang/Object;)Lj62/c$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    return-object p1

    :cond_7
    :goto_1
    return-object v0

    :cond_8
    sget-object p1, Lj62/e$f;->a:Lj62/e$f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj62/c$b;

    invoke-virtual {p1}, Lj62/c$b;->d()Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;->getFull()Lcom/whoop/referafriend/domain/models/RafHubType$Full;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/RafHubType$Full;->getPromotion()Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj62/c$b;

    new-instance v5, Lj62/f$b;

    invoke-virtual {p1}, Lcom/whoop/referafriend/domain/models/Promotion;->getTerms()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    move-result-object p1

    invoke-direct {v5, p1}, Lj62/f$b;-><init>(Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lj62/c$b;->b(Lj62/c$b;Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILjava/lang/Object;)Lj62/c$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    return-object p1

    :cond_a
    :goto_2
    return-object v0

    :cond_b
    sget-object p1, Lj62/e$a;->a:Lj62/e$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p1

    check-cast v3, Lj62/c$b;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lj62/c$b;->b(Lj62/c$b;Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILjava/lang/Object;)Lj62/c$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj62/b;->a(Lj62/c;)Lj62/b;

    move-result-object p1

    return-object p1

    :cond_c
    sget-object p1, Lj62/e$b;->a:Lj62/e$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_d

    iget-object p1, p0, Lj62/d$d;->z:Lj62/d;

    invoke-static {p1}, Lj62/d;->d(Lj62/d;)Lh62/b;

    move-result-object p1

    new-instance v1, Lh62/a$h;

    const/4 v4, 0x3

    invoke-direct {v1, v3, v3, v4, v3}, Lh62/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lj62/c$b;

    invoke-virtual {v3}, Lj62/c$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    return-object v0

    :cond_d
    sget-object p1, Lj62/e$g;->a:Lj62/e$g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj62/c$b;

    invoke-virtual {p1}, Lj62/c$b;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object v1

    check-cast v1, Lj62/c$b;

    invoke-virtual {v1}, Lj62/c$b;->d()Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;->getTrials()Lj62/h;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lj62/h;->d()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lj62/g;

    invoke-virtual {v5}, Lj62/g;->f()Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_3

    :cond_f
    move-object v2, v3

    :goto_3
    check-cast v2, Lj62/g;

    goto :goto_4

    :cond_10
    move-object v2, v3

    :goto_4
    invoke-virtual {v0}, Lj62/b;->b()Lj62/c;

    move-result-object v1

    check-cast v1, Lj62/c$b;

    invoke-virtual {v1}, Lj62/c$b;->d()Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;->getTrials()Lj62/h;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lj62/h;->d()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    :cond_11
    if-nez v3, :cond_12

    goto :goto_6

    :cond_12
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_13

    sget-object v1, Lh62/b$a$b;->SHARE_FIRST_CODE:Lh62/b$a$b;

    :goto_5
    move-object v7, v1

    goto :goto_9

    :cond_13
    :goto_6
    if-nez v3, :cond_14

    goto :goto_7

    :cond_14
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v4, :cond_15

    sget-object v1, Lh62/b$a$b;->SHARE_SECOND_CODE:Lh62/b$a$b;

    goto :goto_5

    :cond_15
    :goto_7
    if-nez v3, :cond_16

    goto :goto_8

    :cond_16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_17

    sget-object v1, Lh62/b$a$b;->SHARE_THIRD_CODE:Lh62/b$a$b;

    goto :goto_5

    :cond_17
    :goto_8
    sget-object v1, Lh62/b$a$b;->ALL_CODES_SHARED:Lh62/b$a$b;

    goto :goto_5

    :goto_9
    iget-object v1, p0, Lj62/d$d;->z:Lj62/d;

    invoke-static {v1}, Lj62/d;->d(Lj62/d;)Lh62/b;

    move-result-object v1

    new-instance v2, Lh62/a$i;

    const/16 v9, 0x2b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lh62/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lh62/b$a$b;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2, p1}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    return-object v0

    :cond_18
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
