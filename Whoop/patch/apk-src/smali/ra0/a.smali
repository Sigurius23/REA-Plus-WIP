.class public final Lra0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lra0/a;",
        "",
        "<init>",
        "()V",
        "Lna0/c;",
        "domainResult",
        "Lqa0/c;",
        "a",
        "(Lna0/c;)Lqa0/c;",
        "advanced-labs_release"
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


# virtual methods
.method public final a(Lna0/c;)Lqa0/c;
    .locals 14

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lna0/c$b;

    if-eqz v0, :cond_0

    new-instance v1, Lqa0/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lqa0/c$a;-><init>(Lsz0/q0;Lqa0/a;Lqa0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lna0/c$a;

    if-eqz v0, :cond_1

    new-instance p1, Lqa0/c$a;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v1

    sget v0, Luv0/c;->E:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    const/16 v12, 0x35f

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v0

    sget-object v1, Lqa0/a$f;->a:Lqa0/a$f;

    sget-object v2, Lqa0/a$a;->a:Lqa0/a$a;

    invoke-direct {p1, v0, v1, v2}, Lqa0/c$a;-><init>(Lsz0/q0;Lqa0/a;Lqa0/a;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lna0/c$c;

    if-eqz v0, :cond_3

    check-cast p1, Lna0/c$c;

    invoke-virtual {p1}, Lna0/c$c;->d()Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lna0/c$c;->d()Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;->getSections()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lna0/c$c;->d()Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    invoke-virtual {p1}, Lna0/c$c;->c()Z

    move-result p1

    new-instance v3, Lqa0/c$b;

    invoke-direct {v3, v0, v2, v1, p1}, Lqa0/c$b;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Z)V

    return-object v3

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
