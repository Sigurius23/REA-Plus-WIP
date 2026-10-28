.class public final Lvw1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lvw1/c;",
        "",
        "<init>",
        "()V",
        "Lqw1/a$a;",
        "",
        "isNewMember",
        "Luw1/d;",
        "f",
        "(Lqw1/a$a;Z)Luw1/d;",
        "Lqw1/a$e;",
        "Luw1/d$a;",
        "e",
        "(Lqw1/a$e;Z)Luw1/d$a;",
        "Lqw1/c;",
        "dialog",
        "g",
        "(Lqw1/c;Luw1/d$a;)Luw1/d;",
        "",
        "currentEmailText",
        "Lcom/whoop/design/util/TextResource;",
        "validationError",
        "Ljb1/a;",
        "b",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljb1/a;",
        "domainResult",
        "d",
        "(Lqw1/c;)Luw1/d;",
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

.method public static synthetic a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvw1/c;->c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljb1/a;
    .locals 2

    new-instance v0, Lcom/whoop/profile/view/edit/form/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/whoop/profile/view/edit/form/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;I)V

    invoke-static {v0}, Lvw1/a;->g(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    return-object p1
.end method

.method private static final c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$familyPlanDesignItemReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Luw1/h;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lvw1/c$a;

    invoke-direct {v1, p0, p1}, Lvw1/c$a;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {p2, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e(Lqw1/a$e;Z)Luw1/d$a;
    .locals 16

    move-object/from16 v0, p1

    instance-of v1, v0, Lqw1/a$b;

    if-eqz v1, :cond_3

    check-cast v0, Lqw1/a$b;

    invoke-virtual {v0}, Lqw1/a$b;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lqw1/a$b;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v7, v1

    invoke-virtual {v0}, Lqw1/a$b;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getPrimaryCta()Lcom/whoop/membership/extensions/domain/models/Cta;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/Cta;->getTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lqw1/a$b;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lqw1/a$b;->a()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/ProgressContent;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget v1, Lgy0/a;->O4:I

    new-instance v2, Lkd1/o$c;

    invoke-direct {v2, v0, v1, v1, v1}, Lkd1/o$c;-><init>(Ljava/lang/Object;III)V

    :cond_2
    move-object v8, v2

    sget-object v11, Lj11/p;->CENTER_ICON:Lj11/p;

    sget-object v12, Lww1/e$c;->a:Lww1/e$c;

    new-instance v2, Luw1/d$a;

    const/16 v14, 0x40c

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Luw1/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;ZZLj11/p;Lww1/c;Lww1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final f(Lqw1/a$a;Z)Luw1/d;
    .locals 9

    instance-of v0, p1, Lqw1/a$c;

    if-eqz v0, :cond_0

    new-instance v1, Luw1/d;

    new-instance v2, Luw1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Luw1/d$b;-><init>(Lsz0/q0;Lww1/g;Lww1/g;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Luw1/d;-><init>(Luw1/d$a;Luw1/d$b;Luw1/d$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lqw1/a$d;

    if-eqz v0, :cond_1

    new-instance v1, Luw1/d;

    new-instance v2, Luw1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lww1/g$c;

    invoke-direct {v4, p2}, Lww1/g$c;-><init>(Z)V

    sget-object v6, Lww1/e$d;->a:Lww1/e$d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Luw1/d$b;-><init>(Lsz0/q0;Lww1/g;Lww1/g;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Luw1/d;-><init>(Luw1/d$a;Luw1/d$b;Luw1/d$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lqw1/a$f;

    if-eqz p1, :cond_2

    new-instance v0, Luw1/d;

    new-instance v1, Luw1/d$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lww1/g$c;

    invoke-direct {v3, p2}, Lww1/g$c;-><init>(Z)V

    sget-object v5, Lww1/e$d;->a:Lww1/e$d;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Luw1/d$b;-><init>(Lsz0/q0;Lww1/g;Lww1/g;Lww1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Luw1/d;-><init>(Luw1/d$a;Luw1/d$b;Luw1/d$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lqw1/c;Luw1/d$a;)Luw1/d;
    .locals 8

    invoke-virtual {p1}, Lqw1/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lqw1/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lvw1/c;->b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p1}, Lqw1/c;->e()Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lqw1/c;->g()Z

    move-result v1

    invoke-virtual {p1}, Lqw1/c;->e()Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lqw1/c;->e()Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/membership/familyPlan/domain/model/InviteFamilyMemberResponse;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/membership/management/domain/models/ScreenSection;

    invoke-virtual {v5}, Lcom/whoop/membership/management/domain/models/ScreenSection;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v0, v7}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v5, Ljx1/f0;

    invoke-direct {v5, v6}, Ljx1/f0;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Luw1/d$c;

    invoke-direct {p1, v1, v2, v3}, Luw1/d$c;-><init>(ZLjava/lang/String;Ljava/util/List;)V

    :goto_2
    move-object v3, p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    new-instance v0, Luw1/d;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Luw1/d;-><init>(Luw1/d$a;Luw1/d$b;Luw1/d$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final d(Lqw1/c;)Luw1/d;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqw1/c;->c()Lqw1/a;

    move-result-object v0

    instance-of v1, v0, Lqw1/a$a;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lqw1/c;->c()Lqw1/a;

    move-result-object v0

    check-cast v0, Lqw1/a$a;

    invoke-virtual {p1}, Lqw1/c;->g()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lvw1/c;->f(Lqw1/a$a;Z)Luw1/d;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lqw1/a$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lqw1/c;->c()Lqw1/a;

    move-result-object v0

    check-cast v0, Lqw1/a$e;

    invoke-virtual {p1}, Lqw1/c;->g()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lvw1/c;->e(Lqw1/a$e;Z)Luw1/d$a;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvw1/c;->g(Lqw1/c;Luw1/d$a;)Luw1/d;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lvw1/c;->g(Lqw1/c;Luw1/d$a;)Luw1/d;

    move-result-object p1

    return-object p1
.end method
