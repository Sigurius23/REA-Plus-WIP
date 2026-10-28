.class public final Lhs0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lhs0/c;",
        "",
        "<init>",
        "()V",
        "Lds0/f;",
        "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;",
        "response",
        "Lis0/s0;",
        "d",
        "(Lds0/f;Lcom/whoop/communityreactions/domain/model/ReactionsResponse;)Lis0/s0;",
        "Lds0/a;",
        "Lis0/f;",
        "c",
        "(Lds0/a;)Lis0/f;",
        "Lds0/c;",
        "Lis0/e;",
        "b",
        "(Lds0/c;)Lis0/e;",
        "domainState",
        "a",
        "(Lds0/f;)Lis0/s0;",
        "community-reactions-arch-mini_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lds0/c;)Lis0/e;
    .locals 11

    new-instance v0, Lis0/e;

    invoke-virtual {p1}, Lds0/c;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lhs0/d;->a(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkd1/o$b;->b:Lkd1/o$b;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lds0/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lds0/c;->a()Les0/a;

    move-result-object v6

    const/16 v9, 0x50

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v0 .. v10}, Lis0/e;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final c(Lds0/a;)Lis0/f;
    .locals 1

    sget-object v0, Lds0/a$b;->a:Lds0/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lis0/f$b;->a:Lis0/f$b;

    return-object p1

    :cond_0
    sget-object v0, Lds0/a$c;->a:Lds0/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lis0/f$c;->a:Lis0/f$c;

    return-object p1

    :cond_1
    instance-of v0, p1, Lds0/a$a;

    if-eqz v0, :cond_2

    new-instance v0, Lis0/f$a;

    check-cast p1, Lds0/a$a;

    invoke-virtual {p1}, Lds0/a$a;->a()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object p1

    invoke-direct {v0, p1}, Lis0/f$a;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lds0/f;Lcom/whoop/communityreactions/domain/model/ReactionsResponse;)Lis0/s0;
    .locals 14

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getInput()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getInput()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;->getSubmitAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getQuickReactions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/communityreactions/domain/model/QuickReactionModel;

    invoke-virtual {v2}, Lcom/whoop/communityreactions/domain/model/QuickReactionModel;->getEmoji()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/communityreactions/domain/model/QuickReactionModel;->getAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    invoke-virtual {p1}, Lds0/f;->i()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/communityreactions/domain/model/QuickReactionModel;->getEmoji()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    new-instance v8, Lis0/c;

    invoke-direct {v8, v3, v2, v7}, Lis0/c;-><init>(Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lhs0/a;->e()Ljb1/a;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getItems()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v7, 0x2

    invoke-static {v0, v2, v3, v7, v3}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lds0/f;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lds0/c;

    new-instance v9, Lm91/o;

    invoke-direct {p0, v2}, Lhs0/c;->b(Lds0/c;)Lis0/e;

    move-result-object v2

    invoke-direct {v9, v2, v3, v7, v3}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, v8}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getPreviewSummaryLabel()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object v8, v3

    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->getPreviewRotationSeconds()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    move-object v9, v0

    goto :goto_3

    :cond_3
    move-object v9, v3

    :goto_3
    invoke-virtual {p1}, Lds0/f;->g()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v10

    invoke-virtual {p1}, Lds0/f;->c()Lds0/a;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p1}, Lhs0/c;->c(Lds0/a;)Lis0/f;

    move-result-object v3

    :cond_4
    move-object v11, v3

    new-instance v1, Lis0/s0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v13}, Lis0/s0;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lkotlin/time/Duration;Lcom/whoop/design/models/modal/AnyModal;Lis0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lds0/f;)Lis0/s0;
    .locals 14

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lds0/f;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lis0/s0;

    const/16 v12, 0x3fc

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lis0/s0;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lkotlin/time/Duration;Lcom/whoop/design/models/modal/AnyModal;Lis0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lds0/f;->d()Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v1, Lis0/s0;

    invoke-virtual {p1}, Lds0/f;->k()Z

    move-result v2

    const/16 v12, 0x3fe

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lis0/s0;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lkotlin/time/Duration;Lcom/whoop/design/models/modal/AnyModal;Lis0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lds0/f;->d()Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lhs0/c;->d(Lds0/f;Lcom/whoop/communityreactions/domain/model/ReactionsResponse;)Lis0/s0;

    move-result-object p1

    return-object p1
.end method
