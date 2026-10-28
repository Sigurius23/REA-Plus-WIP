.class public final Lrc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrc0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000b*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lrc0/a;",
        "",
        "<init>",
        "()V",
        "Lnc0/a$a;",
        "Lqc0/c;",
        "c",
        "(Lnc0/a$a;)Lqc0/c;",
        "Lnc0/c;",
        "e",
        "(Lnc0/c;)Lqc0/c;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lqc0/c$a;",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
        "",
        "isEnabled",
        "Lp41/j;",
        "d",
        "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Z)Lp41/j;",
        "domainResult",
        "a",
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

.method private final b(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Ljava/util/List<",
            "Lqc0/c$a;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Lmd0/c;->C0()Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lqc0/c$a;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v1}, Lqc0/c$a;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private final c(Lnc0/a$a;)Lqc0/c;
    .locals 9

    instance-of v0, p1, Lnc0/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lqc0/c;

    new-instance v2, Lqc0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lqc0/c$b;-><init>(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lnc0/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lqc0/c;

    new-instance v2, Lqc0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lqc0/a$i;->a:Lqc0/a$i;

    sget-object v6, Lqc0/a$d;->a:Lqc0/a$d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lqc0/c$b;-><init>(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lnc0/a$d;

    if-eqz v0, :cond_2

    new-instance v1, Lqc0/c;

    new-instance v2, Lqc0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    sget-object v4, Lqc0/a$i;->a:Lqc0/a$i;

    sget-object v6, Lqc0/a$d;->a:Lqc0/a$d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lqc0/c$b;-><init>(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of p1, p1, Lnc0/a$e;

    if-eqz p1, :cond_3

    new-instance v0, Lqc0/c;

    new-instance v1, Lqc0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lqc0/c$b;-><init>(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    move-object v2, v1

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Z)Lp41/j;
    .locals 9

    new-instance v0, Lp41/j;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;->getLabel()Ljava/lang/String;

    move-result-object v1

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v2, p2

    invoke-direct/range {v0 .. v8}, Lp41/j;-><init>(Ljava/lang/String;ZZLp41/f;Lp41/k;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final e(Lnc0/c;)Lqc0/c;
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->i()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    move v11, v3

    goto :goto_0

    :cond_0
    move v11, v2

    :goto_0
    sget-object v5, Lkd1/o$b;->b:Lkd1/o$b;

    new-instance v15, Lqc0/c$c;

    const/16 v13, 0xbe

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v4, v15

    invoke-direct/range {v4 .. v14}, Lqc0/c$c;-><init>(Lkd1/o;Ljava/util/List;Ljava/util/List;Lp41/j;Lc31/k;Loc0/a;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->h()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v13

    new-instance v12, Lqc0/c;

    const/16 v16, 0x2

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v17}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lnc0/c;->d()Lnc0/f;

    move-result-object v4

    sget-object v5, Lrc0/a$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v3, :cond_4

    const/4 v5, 0x2

    const/4 v6, 0x0

    sget-object v7, Lm83/y;->w:Lm83/y;

    if-eq v4, v5, :cond_3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_2

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getSkippedConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Lrc0/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getSkippedConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->getCta()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    move-result-object v1

    sget-object v5, Lkd1/o$b;->b:Lkd1/o$b;

    :goto_1
    move-object v8, v6

    move-object v6, v4

    goto :goto_3

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getOptedInConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Lrc0/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getOptedInConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->getCta()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    move-result-object v1

    sget-object v5, Lkd1/o$b;->b:Lkd1/o$b;

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->getItemsAboveToggle()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v4}, Lrc0/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->getItemsBelowToggle()Ljava/util/List;

    move-result-object v5

    invoke-direct {v0, v5}, Lrc0/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->getToggle()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->j()Z

    move-result v6

    invoke-direct {v0, v5, v6}, Lrc0/a;->d(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Z)Lp41/j;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->j()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->getCtaWhenToggleOn()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    move-result-object v5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->getCtaWhenToggleOff()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    move-result-object v5

    :goto_2
    new-instance v8, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->getHeaderImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v5

    move-object v5, v8

    goto :goto_1

    :goto_3
    new-instance v4, Lqc0/c$c;

    invoke-static {v1}, Lrc0/b;->a(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lc31/k;

    move-result-object v9

    sget-object v10, Loc0/a;->Companion:Loc0/a$a;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->getClickAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Loc0/a$a;->a(Ljava/lang/String;)Loc0/a;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->g()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->e()Z

    move-result v1

    if-eqz v1, :cond_6

    move v11, v3

    goto :goto_4

    :cond_6
    move v11, v2

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lnc0/c;->d()Lnc0/f;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "step"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v12

    invoke-direct/range {v4 .. v12}, Lqc0/c$c;-><init>(Lkd1/o;Ljava/util/List;Ljava/util/List;Lp41/j;Lc31/k;Loc0/a;ZLjava/util/Map;)V

    invoke-virtual/range {p1 .. p1}, Lnc0/c;->h()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v10

    new-instance v9, Lqc0/c;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object v12, v4

    invoke-direct/range {v9 .. v14}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method


# virtual methods
.method public final a(Lnc0/c;)Lqc0/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lnc0/c;->c()Lnc0/a;

    move-result-object v0

    instance-of v0, v0, Lnc0/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnc0/c;->c()Lnc0/a;

    move-result-object p1

    check-cast p1, Lnc0/a$a;

    invoke-direct {p0, p1}, Lrc0/a;->c(Lnc0/a$a;)Lqc0/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lrc0/a;->e(Lnc0/c;)Lqc0/c;

    move-result-object p1

    return-object p1
.end method
