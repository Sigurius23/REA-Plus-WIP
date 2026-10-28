.class public final Lag0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n*\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0015*\u00020\u00112\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0011\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lag0/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lwf0/a$b;",
        "",
        "source",
        "testCount",
        "Lzf0/c;",
        "e",
        "(Lwf0/a$b;Ljava/lang/String;Ljava/lang/String;)Lzf0/c;",
        "Lwf0/a$e;",
        "Lzf0/c$c;",
        "d",
        "(Lwf0/a$e;)Lzf0/c$c;",
        "Lwf0/c;",
        "dialog",
        "f",
        "(Lwf0/c;Lzf0/c$c;)Lzf0/c;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "models",
        "Lm91/u;",
        "a",
        "(Lwf0/c;Ljava/util/List;)Ljava/util/List;",
        "spacing",
        "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;",
        "domainResult",
        "c",
        "(Lwf0/c;)Lzf0/c;",
        "Ljb1/a;",
        "advanced-labs-join_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lag0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lag0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lag0/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lag0/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Lwf0/c;Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwf0/c;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lag0/a;->a:Ljb1/a;

    invoke-virtual {v0, p2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v2, v1, Lq31/f;

    if-eqz v2, :cond_3

    move-object v3, v1

    check-cast v3, Lq31/f;

    invoke-virtual {v3}, Lq31/f;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq31/a;

    invoke-virtual {v4}, Lq31/a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lwf0/c;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    :goto_2
    if-ltz v2, :cond_2

    :goto_3
    move v6, v2

    goto :goto_4

    :cond_2
    invoke-virtual {v3}, Lq31/f;->c()I

    move-result v2

    goto :goto_3

    :goto_4
    const/16 v9, 0x1b

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lq31/f;->b(Lq31/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;ZILjava/lang/Object;)Lq31/f;

    move-result-object v1

    :cond_3
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private final b(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;->NORMAL:Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;

    return-object p1
.end method

.method private final d(Lwf0/a$e;)Lzf0/c$c;
    .locals 13

    instance-of p1, p1, Lwf0/a$a;

    if-eqz p1, :cond_0

    const-string p1, "title"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string p1, "description"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string p1, "Confirm"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string p1, "Cancel"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v8, Lj11/p;->LOTTIE:Lj11/p;

    new-instance v0, Lzf0/c$c;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lzf0/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lzf0/a;Lzf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lwf0/a$b;Ljava/lang/String;Ljava/lang/String;)Lzf0/c;
    .locals 9

    instance-of v0, p1, Lwf0/a$c;

    if-eqz v0, :cond_0

    new-instance v1, Lzf0/c;

    new-instance v2, Lzf0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lzf0/c$b;-><init>(Lsz0/q0;Lzf0/a;Lzf0/a;Lzf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lzf0/c;-><init>(Lzf0/c$c;Lzf0/c$b;Lzf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lwf0/a$d;

    if-eqz v0, :cond_1

    new-instance v1, Lzf0/c;

    new-instance v2, Lzf0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lzf0/a$h;

    invoke-direct {v4, p2, p3}, Lzf0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lzf0/a$d;->a:Lzf0/a$d;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lzf0/c$b;-><init>(Lsz0/q0;Lzf0/a;Lzf0/a;Lzf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lzf0/c;-><init>(Lzf0/c$c;Lzf0/c$b;Lzf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lwf0/a$f;

    if-eqz p1, :cond_2

    new-instance v0, Lzf0/c;

    new-instance v1, Lzf0/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lzf0/a$h;

    invoke-direct {v3, p2, p3}, Lzf0/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lzf0/a$d;->a:Lzf0/a$d;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lzf0/c$b;-><init>(Lsz0/q0;Lzf0/a;Lzf0/a;Lzf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lzf0/c;-><init>(Lzf0/c$c;Lzf0/c$b;Lzf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final f(Lwf0/c;Lzf0/c$c;)Lzf0/c;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Lwf0/c;->f()Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getBottomStickyItems()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lwf0/c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/AdvanceLabsPurchaseAddOnsStickyModel;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_1

    new-instance v3, Lzf0/c$e;

    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/AdvanceLabsPurchaseAddOnsStickyModel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/AdvanceLabsPurchaseAddOnsStickyModel;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lag0/a;->a(Lwf0/c;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lzf0/c$e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    :cond_1
    move-object v9, v3

    invoke-virtual {v1}, Lwf0/c;->f()Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v6, v2

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_1

    :goto_3
    invoke-virtual {v1}, Lwf0/c;->f()Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getSections()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionModel;

    invoke-virtual {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-direct {v0, v5}, Lag0/a;->b(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;

    move-result-object v5

    if-nez v5, :cond_5

    :cond_4
    sget-object v5, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;->COMPACT:Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;

    :cond_5
    new-instance v7, Lzf0/c$a;

    invoke-virtual {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lag0/a;->a(Lwf0/c;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v7, v4, v5}, Lzf0/c$a;-><init>(Ljava/util/List;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsSectionSpacingType;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    :goto_5
    move-object v7, v3

    goto :goto_6

    :cond_7
    sget-object v3, Lm83/y;->w:Lm83/y;

    goto :goto_5

    :goto_6
    invoke-virtual {v1}, Lwf0/c;->e()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v1}, Lwf0/c;->d()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    :goto_7
    move v8, v2

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v1}, Lwf0/c;->g()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lwf0/c;->h()Ljava/lang/String;

    move-result-object v11

    new-instance v15, Lzf0/c$d;

    move-object v5, v15

    invoke-direct/range {v5 .. v11}, Lzf0/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLzf0/c$e;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Lzf0/c;

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v14, 0x0

    move-object/from16 v13, p2

    invoke-direct/range {v12 .. v17}, Lzf0/c;-><init>(Lzf0/c$c;Lzf0/c$b;Lzf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method


# virtual methods
.method public final c(Lwf0/c;)Lzf0/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwf0/c;->c()Lwf0/a;

    move-result-object v0

    instance-of v1, v0, Lwf0/a$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lwf0/c;->c()Lwf0/a;

    move-result-object v0

    check-cast v0, Lwf0/a$b;

    invoke-virtual {p1}, Lwf0/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lwf0/c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lag0/a;->e(Lwf0/a$b;Ljava/lang/String;Ljava/lang/String;)Lzf0/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lwf0/a$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lwf0/c;->c()Lwf0/a;

    move-result-object v0

    check-cast v0, Lwf0/a$e;

    invoke-direct {p0, v0}, Lag0/a;->d(Lwf0/a$e;)Lzf0/c$c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lag0/a;->f(Lwf0/c;Lzf0/c$c;)Lzf0/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lag0/a;->f(Lwf0/c;Lzf0/c$c;)Lzf0/c;

    move-result-object p1

    return-object p1
.end method
