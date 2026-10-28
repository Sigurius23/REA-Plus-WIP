.class public abstract Lqx1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltv1/c$b;",
        "Lqx1/e$c;",
        "b",
        "(Ltv1/c$b;)Lqx1/e$c;",
        "membership_release"
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
.method public static final synthetic a(Ltv1/c$b;)Lqx1/e$c;
    .locals 0

    invoke-static {p0}, Lqx1/g;->b(Ltv1/c$b;)Lqx1/e$c;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ltv1/c$b;)Lqx1/e$c;
    .locals 12

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;

    invoke-virtual {v5}, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;->getCta()Lcom/whoop/membership/domain/upcycle/models/Cta;

    move-result-object v7

    if-eqz v7, :cond_0

    new-instance v8, Lqx1/a;

    invoke-virtual {v7}, Lcom/whoop/membership/domain/upcycle/models/Cta;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/membership/domain/upcycle/models/Cta;->getIcon()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v10

    invoke-virtual {v7}, Lcom/whoop/membership/domain/upcycle/models/Cta;->getAnalyticsLabel()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/whoop/membership/domain/upcycle/models/Cta;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-direct {v8, v9, v10, v11, v7}, Lqx1/a;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    goto :goto_1

    :cond_0
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v5}, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;->getLineItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/membership/domain/upcycle/models/LineItem;

    new-instance v10, Lqx1/b;

    invoke-virtual {v9}, Lcom/whoop/membership/domain/upcycle/models/LineItem;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v9}, Lcom/whoop/membership/domain/upcycle/models/LineItem;->getIcon()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Lqx1/b;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    new-instance v5, Lqx1/c;

    invoke-direct {v5, v6, v7, v8}, Lqx1/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lqx1/a;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v2, Lqx1/d;

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getAnalyticsCategory()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getReceivedKit()Z

    move-result v5

    invoke-virtual {p0}, Ltv1/c$b;->a()Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->getUpcycleOffer()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v4, v5, p0}, Lqx1/d;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    new-instance p0, Lqx1/e$c;

    invoke-direct {p0, v0, v1, v3, v2}, Lqx1/e$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lqx1/d;)V

    return-object p0
.end method
