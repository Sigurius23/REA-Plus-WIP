.class public final Lvw1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lvw1/b;",
        "",
        "<init>",
        "()V",
        "Lpw1/c$b;",
        "Luw1/c;",
        "d",
        "(Lpw1/c$b;)Luw1/c;",
        "Lpw1/c$e;",
        "Luw1/c$a;",
        "c",
        "(Lpw1/c$e;)Luw1/c$a;",
        "Lpw1/b;",
        "dialog",
        "e",
        "(Lpw1/b;Luw1/c$a;)Luw1/c;",
        "domainResult",
        "b",
        "(Lpw1/b;)Luw1/c;",
        "membership_release"
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

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvw1/b;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lpw1/c$e;)Luw1/c$a;
    .locals 39

    move-object/from16 v0, p1

    instance-of v1, v0, Lpw1/c$a;

    if-eqz v1, :cond_1

    check-cast v0, Lpw1/c$a;

    invoke-virtual {v0}, Lpw1/c$a;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lpw1/c$a;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lpw1/c$a;->b()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lpw1/c$a;->b()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;->getPrimaryCta()Lcom/whoop/membership/familyPlan/domain/model/Cta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/Cta;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lpw1/c$a;->b()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;->getCallouts()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-static {v7, v5, v7}, Lvw1/a;->h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v4

    check-cast v16, Lc41/p2;

    sget-object v4, Lvw1/b$a;->w:Lvw1/b$a;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v23

    const v37, 0xfffbf

    const/16 v38, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v16 .. v38}, Lc41/p2;->b(Lc41/p2;Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILjava/lang/Object;)Lc41/p2;

    move-result-object v4

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpw1/c$a;->b()Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;->getSecondaryCta()Lcom/whoop/membership/familyPlan/domain/model/Cta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/Cta;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v11, Lww1/d$c;

    invoke-virtual {v0}, Lpw1/c$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lpw1/c$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v1, v0}, Lww1/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v12, Lww1/d$a;->a:Lww1/d$a;

    new-instance v1, Luw1/c$a;

    const/16 v16, 0x104

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v17}, Luw1/c$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZZLj11/p;Lww1/c;Lww1/c;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final d(Lpw1/c$b;)Luw1/c;
    .locals 9

    instance-of v0, p1, Lpw1/c$c;

    if-eqz v0, :cond_0

    new-instance v1, Luw1/c;

    new-instance v2, Luw1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Luw1/c$b;-><init>(Lsz0/q0;Lww1/d;Lww1/d;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Luw1/c;-><init>(Luw1/c$a;Luw1/c$b;Luw1/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lpw1/c$d;

    if-eqz v0, :cond_1

    new-instance v1, Luw1/c;

    new-instance v2, Luw1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lww1/d$b;->a:Lww1/d$b;

    sget-object v6, Lww1/e$d;->a:Lww1/e$d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Luw1/c$b;-><init>(Lsz0/q0;Lww1/d;Lww1/d;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Luw1/c;-><init>(Luw1/c$a;Luw1/c$b;Luw1/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lpw1/c$f;

    if-eqz p1, :cond_2

    new-instance v0, Luw1/c;

    new-instance v1, Luw1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    sget-object v3, Lww1/d$b;->a:Lww1/d$b;

    sget-object v5, Lww1/e$d;->a:Lww1/e$d;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Luw1/c$b;-><init>(Lsz0/q0;Lww1/d;Lww1/d;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Luw1/c;-><init>(Luw1/c$a;Luw1/c$b;Luw1/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lpw1/b;Luw1/c$a;)Luw1/c;
    .locals 7

    new-instance v0, Lvs2/d;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lvs2/d;-><init>(I)V

    invoke-static {v0}, Lvw1/a;->g(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p1}, Lpw1/b;->d()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lpw1/b;->d()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpw1/b;->d()Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v4}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v4, Ljx1/f0;

    invoke-direct {v4, v5}, Ljx1/f0;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Luw1/c$c;

    invoke-direct {p1, v1, v2}, Luw1/c$c;-><init>(Ljava/lang/String;Ljava/util/List;)V

    :goto_2
    move-object v3, p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    new-instance v0, Luw1/c;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Luw1/c;-><init>(Luw1/c$a;Luw1/c$b;Luw1/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$familyPlanDesignItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Lpw1/b;)Luw1/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpw1/b;->c()Lpw1/c;

    move-result-object v0

    instance-of v1, v0, Lpw1/c$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lpw1/b;->c()Lpw1/c;

    move-result-object p1

    check-cast p1, Lpw1/c$b;

    invoke-direct {p0, p1}, Lvw1/b;->d(Lpw1/c$b;)Luw1/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lpw1/c$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lpw1/b;->c()Lpw1/c;

    move-result-object v0

    check-cast v0, Lpw1/c$e;

    invoke-direct {p0, v0}, Lvw1/b;->c(Lpw1/c$e;)Luw1/c$a;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvw1/b;->e(Lpw1/b;Luw1/c$a;)Luw1/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lvw1/b;->e(Lpw1/b;Luw1/c$a;)Luw1/c;

    move-result-object p1

    return-object p1
.end method
