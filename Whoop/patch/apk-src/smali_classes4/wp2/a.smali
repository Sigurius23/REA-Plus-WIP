.class public final Lwp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0010\u001a\u00020\n*\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lwp2/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lsp2/a$a;",
        "",
        "cartId",
        "source",
        "Lvp2/c;",
        "b",
        "(Lsp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lvp2/c;",
        "Lsp2/c;",
        "Lvp2/c$d;",
        "dialog",
        "d",
        "(Lsp2/c;Lvp2/c$d;)Lvp2/c;",
        "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;",
        "",
        "isSelected",
        "hasDivider",
        "Lrp2/b;",
        "c",
        "(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;ZZ)Lrp2/b;",
        "domainResult",
        "a",
        "(Lsp2/c;)Lvp2/c;",
        "Ljb1/a;",
        "universal-checkout_release"
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

    sput v0, Lwp2/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwp2/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lwp2/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lwp2/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lsp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lvp2/c;
    .locals 12

    instance-of v3, p1, Lsp2/a$b;

    if-eqz v3, :cond_0

    new-instance v4, Lvp2/c;

    new-instance v5, Lvp2/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v6

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x5

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v9}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_0
    instance-of v3, p1, Lsp2/a$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v6

    if-eqz p2, :cond_1

    new-instance v4, Lvp2/a$h;

    invoke-direct {v4, p2, p3}, Lvp2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move-object v7, v4

    sget-object v9, Lvp2/a$e;->a:Lvp2/a$e;

    new-instance v2, Lvp2/c$b;

    const/4 v8, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvp2/c;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    instance-of v3, p1, Lsp2/a$d;

    if-eqz v3, :cond_4

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v6

    if-eqz p2, :cond_3

    new-instance v4, Lvp2/a$h;

    invoke-direct {v4, p2, p3}, Lvp2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    move-object v7, v4

    sget-object v9, Lvp2/a$e;->a:Lvp2/a$e;

    new-instance v2, Lvp2/c$b;

    const/4 v8, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvp2/c;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    instance-of v1, p1, Lsp2/a$f;

    if-eqz v1, :cond_5

    new-instance v2, Lvp2/c;

    new-instance v3, Lvp2/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v4

    sget-object v5, Lvp2/a$e;->a:Lvp2/a$e;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    instance-of v0, p1, Lsp2/a$e;

    if-eqz v0, :cond_6

    new-instance v1, Lvp2/c;

    new-instance v2, Lvp2/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    sget-object v6, Lvp2/a$e;->a:Lvp2/a$e;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final c(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;ZZ)Lrp2/b;
    .locals 6

    new-instance v0, Lrp2/b;

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getSubtitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lrp2/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZ)V

    return-object v0
.end method

.method private final d(Lsp2/c;Lvp2/c$d;)Lvp2/c;
    .locals 31

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->g()Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getCtaText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v10, Lny0/p;->DEFAULT:Lny0/p;

    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {v2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v6

    sget-object v7, Ly81/f;->BRAND_BLACK:Ly81/f;

    sget-object v14, Lny0/g;->STANDARD:Lny0/g;

    new-instance v15, Lcom/whoop/navigation/e;

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lny0/h;

    const v29, 0x1ff9b32

    const/16 v30, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v3 .. v30}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getShippingMethods()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v9, v5, 0x1

    if-ltz v5, :cond_1

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;

    new-instance v10, Lvp2/c$a;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->h()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getShippingMethods()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    sub-int/2addr v12, v8

    if-ge v5, v12, :cond_0

    :goto_1
    move-object/from16 v12, p0

    goto :goto_2

    :cond_0
    move v8, v4

    goto :goto_1

    :goto_2
    invoke-direct {v12, v6, v11, v8}, Lwp2/a;->c(Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;ZZ)Lrp2/b;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v10, v5}, Lvp2/c$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v9

    goto :goto_0

    :cond_1
    move-object/from16 v12, p0

    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_2
    move-object/from16 v12, p0

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->c()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move v0, v8

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->j()Z

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->f()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lsp2/c;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    move v10, v0

    goto :goto_3

    :cond_3
    move v10, v4

    :goto_3
    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    new-instance v4, Lvp2/c$c;

    invoke-direct/range {v4 .. v11}, Lvp2/c$c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;)V

    move-object v5, v4

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cartId must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object/from16 v12, p0

    move-object v5, v1

    :goto_4
    new-instance v2, Lvp2/c;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v7}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public final a(Lsp2/c;)Lvp2/c;
    .locals 9

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsp2/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lvp2/c;

    new-instance v2, Lvp2/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lvp2/c$b;-><init>(Lsz0/q0;Lvp2/a;Lvp2/a;Lvp2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lsp2/c;->d()Lsp2/a;

    move-result-object v0

    instance-of v0, v0, Lsp2/a$a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lsp2/c;->d()Lsp2/a;

    move-result-object v0

    check-cast v0, Lsp2/a$a;

    invoke-virtual {p1}, Lsp2/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsp2/c;->i()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lwp2/a;->b(Lsp2/a$a;Ljava/lang/String;Ljava/lang/String;)Lvp2/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lsp2/c;->d()Lsp2/a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lwp2/a;->d(Lsp2/c;Lvp2/c$d;)Lvp2/c;

    move-result-object p1

    return-object p1
.end method
