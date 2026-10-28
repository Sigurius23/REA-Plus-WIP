.class public final Ltz1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Ltz1/g;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;",
        "Ltz1/e;",
        "b",
        "(Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;)Ltz1/e;",
        "Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;",
        "",
        "isRefreshing",
        "Ltz1/a;",
        "c",
        "(Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Z)Ltz1/a;",
        "Lpz1/b;",
        "domainState",
        "Ltz1/f;",
        "a",
        "(Lpz1/b;)Ltz1/f;",
        "Ljb1/a;",
        "native-store_release"
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

    sput v0, Ltz1/g;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltz1/g;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Ltz1/c;->d()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ltz1/g;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;)Ltz1/e;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Ltz1/g;->a:Ljb1/a;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;->getItems()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

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

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/o;

    invoke-virtual {v3}, Lm91/o;->e()Lm91/u;

    move-result-object v4

    instance-of v5, v4, Ly71/o;

    if-eqz v5, :cond_0

    move-object v6, v4

    check-cast v6, Ly71/o;

    invoke-virtual {v3}, Lm91/o;->d()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v21

    const/16 v22, 0x3fff

    const/16 v23, 0x0

    const/4 v7, 0x0

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

    invoke-static/range {v6 .. v23}, Ly71/o;->b(Ly71/o;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLy71/l;ZLy81/e;Lf0/t;Lcom/whoop/navigation/e;ZLy71/q;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Ly71/o;

    move-result-object v4

    :cond_0
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ltz1/e;

    invoke-direct {v1, v2}, Ltz1/e;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private final c(Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Z)Ltz1/a;
    .locals 33

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;->getCardButtons()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v5

    const v31, 0x1fdffff

    const/16 v32, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move/from16 v23, p2

    invoke-static/range {v5 .. v32}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_2

    new-instance v4, Lsz0/c0;

    sget-object v6, Lb91/c;->B2:Lb91/c;

    sget-object v7, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v15, 0x3f0

    const/16 v16, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object v4, v3

    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez v4, :cond_3

    return-object v3

    :cond_3
    new-instance v0, Ltz1/a;

    invoke-direct {v0, v1, v4}, Ltz1/a;-><init>(Ljava/util/List;Lsz0/c0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lpz1/b;)Ltz1/f;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lpz1/b;->a()Lpz1/c;

    move-result-object v1

    sget-object v2, Lpz1/c$c;->a:Lpz1/c$c;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v3, Ltz1/f;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Ltz1/f;-><init>(ZZLtz1/b;Lao2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    sget-object v2, Lpz1/c$a;->a:Lpz1/c$a;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Ltz1/f;

    const/16 v9, 0x1d

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Ltz1/f;-><init>(ZZLtz1/b;Lao2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of v2, v1, Lpz1/c$b;

    if-eqz v2, :cond_6

    check-cast v1, Lpz1/c$b;

    invoke-virtual {v1}, Lpz1/c$b;->a()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getNavigationBarText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lpz1/c$b;->a()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;

    invoke-direct {v0, v3}, Ltz1/g;->b(Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;)Ltz1/e;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lpz1/c$b;->a()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getCountrySelector()Lcom/whoop/design/models/items/CountrySelectorModel;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-static {v2}, Lqz1/a;->b(Lcom/whoop/design/models/items/CountrySelectorModel;)Lr51/f;

    move-result-object v2

    move-object v6, v2

    goto :goto_1

    :cond_3
    move-object v6, v3

    :goto_1
    invoke-virtual {v1}, Lpz1/c$b;->a()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getCheckoutFooter()Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lpz1/c$b;->b()Z

    move-result v3

    invoke-direct {v0, v2, v3}, Ltz1/g;->c(Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;Z)Ltz1/a;

    move-result-object v3

    :cond_4
    move-object v7, v3

    invoke-virtual {v1}, Lpz1/c$b;->a()Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->getCart()Lcom/whoop/nativestore/home/domain/model/CartIndicator;

    move-result-object v1

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    :goto_2
    move v8, v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    new-instance v3, Ltz1/b;

    invoke-direct/range {v3 .. v8}, Ltz1/b;-><init>(Ljava/lang/String;Ljava/util/List;Lr51/f;Ltz1/a;Z)V

    new-instance v9, Ltz1/f;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x1b

    const/16 v16, 0x0

    move-object v12, v3

    invoke-direct/range {v9 .. v16}, Ltz1/f;-><init>(ZZLtz1/b;Lao2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
