.class public abstract Lvw1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvw1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Ljb1/b;",
        "Ll83/a0;",
        "block",
        "Ljb1/a;",
        "g",
        "(Lkotlin/jvm/functions/Function1;)Ljb1/a;",
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
.method public static synthetic a(Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;)Luw1/a;
    .locals 0

    invoke-static {p0}, Lvw1/a;->l(Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;)Luw1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;)Luw1/h;
    .locals 0

    invoke-static {p0}, Lvw1/a;->m(Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;)Luw1/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvw1/a;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;)Lq21/i;
    .locals 0

    invoke-static {p0}, Lvw1/a;->n(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;)Lq21/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvw1/a;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvw1/a;->j(Lkotlin/jvm/functions/Function1;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;)Ljb1/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljb1/a;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv41/b0;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    new-instance p0, Lvs2/d;

    const/16 p1, 0xa

    invoke-direct {p0, p1}, Lvs2/d;-><init>(I)V

    :cond_0
    invoke-static {p0}, Lvw1/a;->g(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvs2/d;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lvs2/d;-><init>(I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvs2/d;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lvs2/d;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvw1/a$b;

    invoke-direct {v3, v0}, Lvw1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvs2/d;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Lvs2/d;-><init>(I)V

    const-class v2, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lvw1/a$c;

    invoke-direct {v3, v0}, Lvw1/a$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvs2/d;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lvs2/d;-><init>(I)V

    const-class v2, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lvw1/a$d;

    invoke-direct {v2, v0}, Lvw1/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;)Luw1/a;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luw1/a;

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;->getTopButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;->getDivider()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v4

    invoke-static {v4}, Llb1/f1;->e(Lcom/whoop/design/models/items/DividerModel;)Lhy0/e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;->getBottomButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v5

    invoke-static {v5, v2, v3, v2}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/DividedCardButtons;->getDisclaimerText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v4

    move-object v4, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Luw1/a;-><init>(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final m(Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;)Luw1/h;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Luw1/h;

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;->getTextFieldLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v4, v3}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/SendEmailInviteModel;->getDisclaimer()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Luw1/h;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLny0/h;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;)Lq21/i;
    .locals 8

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;->getRows()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;

    invoke-static {v5}, Lvw1/a;->o(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;)Lq21/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Lq21/e;->h:Lq21/e$c;

    const-string v1, "DOWNGRADE"

    invoke-virtual {v0, v1}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v1

    invoke-virtual {v1}, Lq21/e;->c()Li2/t;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonTableModel;->getHighlightedColumns()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :goto_2
    move v2, p0

    goto :goto_3

    :cond_2
    const/4 p0, 0x0

    goto :goto_2

    :goto_3
    const-string p0, "FAMILY_PLAN"

    invoke-virtual {v0, p0}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v7

    new-instance v1, Lq21/i;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v7}, Lq21/i;-><init>(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;)V

    return-object v1
.end method

.method private static final o(Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;)Lq21/d;
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;->getContent()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonRowElement;->getCellType()Lcom/whoop/membership/familyPlan/domain/model/items/ComparisonElementType;

    move-result-object p0

    sget-object v0, Lvw1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    const-string v2, "FAMILY_PLAN"

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-ne p0, v0, :cond_1

    new-instance p0, Lq21/d$c;

    invoke-static {v1}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lgz0/m0;->WHOOP_LOGO:Lgz0/m0;

    :cond_0
    sget-object v1, Lq21/e;->h:Lq21/e$c;

    invoke-virtual {v1, v2}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Lq21/d$d;

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lq21/d$d;-><init>(Lkd1/o;)V

    goto :goto_0

    :cond_3
    new-instance p0, Lq21/d$e;

    sget-object v0, Lq21/e;->h:Lq21/e$c;

    invoke-virtual {v0, v2}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    goto :goto_0

    :cond_4
    new-instance p0, Lq21/d$f;

    invoke-direct {p0, v1}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    sget-object p0, Lq21/d$a;->a:Lq21/d$a;

    :goto_0
    if-nez p0, :cond_6

    goto :goto_1

    :cond_6
    return-object p0

    :cond_7
    :goto_1
    sget-object p0, Lq21/d$a;->a:Lq21/d$a;

    return-object p0
.end method
