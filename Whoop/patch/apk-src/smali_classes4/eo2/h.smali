.class public final Leo2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000c\u001a\u00020\u000b*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Leo2/h;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;",
        "",
        "fallbackCartId",
        "",
        "isUpdating",
        "Leo2/a;",
        "b",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Ljava/lang/String;Z)Leo2/a;",
        "Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;",
        "Leo2/e;",
        "c",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Z)Leo2/e;",
        "Lcom/whoop/universalcheckout/features/cart/domain/c;",
        "domainState",
        "Leo2/g;",
        "a",
        "(Lcom/whoop/universalcheckout/features/cart/domain/c;)Leo2/g;",
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

    sput v0, Leo2/h;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Leo2/h;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Leo2/b;->o()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Leo2/h;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Ljava/lang/String;Z)Leo2/a;
    .locals 6

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;

    invoke-direct {p0, v3, p3}, Leo2/h;->c(Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Z)Leo2/e;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getCheckoutFooter()Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;->getItems()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_2

    iget-object v0, p0, Leo2/h;->a:Ljb1/a;

    invoke-virtual {v0, p3}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v3, p3

    goto :goto_3

    :cond_2
    :goto_2
    sget-object p3, Lm83/y;->w:Lm83/y;

    goto :goto_1

    :goto_3
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getCartId()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_3

    move-object v4, p2

    goto :goto_4

    :cond_3
    move-object v4, p3

    :goto_4
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;->getAnalyticsSubtotalValue()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Leo2/a;

    invoke-direct/range {v0 .. v5}, Leo2/a;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;Z)Leo2/e;
    .locals 24

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;->getSectionType()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v3, v2, Leo2/h;->a:Ljb1/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartSection;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    instance-of v6, v5, Lfo2/d;

    if-eqz v6, :cond_0

    move-object v7, v5

    check-cast v7, Lfo2/d;

    const/16 v22, 0x1fff

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v21, p2

    invoke-static/range {v7 .. v23}, Lfo2/d;->b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;

    move-result-object v5

    :cond_0
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v3, Leo2/e;

    invoke-direct {v3, v0, v1, v4}, Leo2/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v3
.end method


# virtual methods
.method public final a(Lcom/whoop/universalcheckout/features/cart/domain/c;)Leo2/g;
    .locals 12

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->d()Lcom/whoop/universalcheckout/features/cart/domain/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/universalcheckout/features/cart/domain/b$c;->a:Lcom/whoop/universalcheckout/features/cart/domain/b$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Leo2/g;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Leo2/g;-><init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/b$a;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/b$a;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;->b()Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->f()Z

    move-result v4

    invoke-direct {p0, v1, v3, v4}, Leo2/h;->b(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Ljava/lang/String;Z)Leo2/a;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_1
    move-object v6, v2

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->f()Z

    move-result v7

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;->a()Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->f()Z

    move-result p1

    if-nez p1, :cond_2

    move-object v8, v1

    goto :goto_1

    :cond_2
    move-object v8, v2

    :goto_1
    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/b$a;->c()Ljava/lang/String;

    move-result-object v9

    new-instance v3, Leo2/g;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v11}, Leo2/g;-><init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    instance-of v1, v0, Lcom/whoop/universalcheckout/features/cart/domain/b$b;

    if-eqz v1, :cond_4

    new-instance v2, Leo2/g;

    check-cast v0, Lcom/whoop/universalcheckout/features/cart/domain/b$b;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/cart/domain/b$b;->a()Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->f()Z

    move-result v3

    invoke-direct {p0, v0, v1, v3}, Leo2/h;->b(Lcom/whoop/universalcheckout/features/cart/domain/models/CartResponse;Ljava/lang/String;Z)Leo2/a;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/universalcheckout/features/cart/domain/c;->f()Z

    move-result v6

    const/16 v9, 0x33

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Leo2/g;-><init>(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
