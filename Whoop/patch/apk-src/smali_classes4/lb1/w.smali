.class public abstract Llb1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/w$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/ButtonCardModel;",
        "Lf01/q;",
        "i",
        "(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;",
        "Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;",
        "Lf01/p;",
        "k",
        "(Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;)Lf01/p;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "Lny0/h;",
        "h",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Lcom/whoop/design/models/items/ToggleCardButtonModel;",
        "Lp41/d;",
        "j",
        "(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "buttonCardMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/w;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;
    .locals 0

    invoke-static {p0}, Llb1/w;->e(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;
    .locals 0

    invoke-static {p0}, Llb1/w;->f(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/w;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/cards/ButtonCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/w$b;

    invoke-direct {v3, v0}, Llb1/w$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/v;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Llb1/v;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ToggleCardButtonModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/w$c;

    invoke-direct {v2, v0}, Llb1/w$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/w;->i(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/w;->j(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/w;->a:Llb1/y0;

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v2, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v8, v0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lny0/p;->HIGHLIGHT:Lny0/p;

    invoke-static {}, Lny0/p;->values()[Lny0/p;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    const/4 v7, 0x0

    if-ge v6, v4, :cond_2

    aget-object v9, v3, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    move-object v9, v7

    :goto_2
    if-nez v9, :cond_3

    goto :goto_3

    :cond_3
    move-object v2, v9

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getSize()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v3, Lny0/g;->COMPACT:Lny0/g;

    invoke-static {}, Lny0/g;->values()[Lny0/g;

    move-result-object v4

    array-length v6, v4

    move v10, v5

    :goto_4
    if-ge v10, v6, :cond_5

    aget-object v11, v4, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_5
    move-object v11, v7

    :goto_5
    if-nez v11, :cond_6

    goto :goto_6

    :cond_6
    move-object v3, v11

    :goto_6
    if-nez v3, :cond_7

    goto :goto_8

    :cond_7
    :goto_7
    move-object v11, v3

    goto :goto_9

    :cond_8
    :goto_8
    sget-object v3, Lny0/g;->COMPACT:Lny0/g;

    goto :goto_7

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getTextStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v3

    array-length v4, v3

    move v6, v5

    :goto_a
    if-ge v6, v4, :cond_a

    aget-object v10, v3, v6

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_b

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_a
    move-object v10, v7

    :goto_b
    move-object v12, v10

    goto :goto_c

    :cond_b
    move-object v12, v7

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getCornerRadius()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    sget-object v3, Lny0/b;->MEDIUM:Lny0/b;

    invoke-static {}, Lny0/b;->values()[Lny0/b;

    move-result-object v4

    array-length v6, v4

    :goto_d
    if-ge v5, v6, :cond_d

    aget-object v10, v4, v5

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_e

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_d
    move-object v10, v7

    :goto_e
    if-nez v10, :cond_e

    goto :goto_f

    :cond_e
    move-object v3, v10

    :goto_f
    invoke-static {v3}, Lny0/e;->l(Lny0/b;)F

    move-result v0

    new-instance v3, Ly3/f;

    invoke-direct {v3, v0}, Ly3/f;-><init>(F)V

    move-object v13, v3

    goto :goto_10

    :cond_f
    move-object v13, v7

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_11
    move/from16 v17, v0

    goto :goto_12

    :cond_10
    const/4 v0, 0x1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v7

    :cond_11
    move-object/from16 v21, v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v23

    new-instance v0, Lny0/h;

    const v26, 0x1a6023e

    const/16 v27, 0x0

    move-object v7, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final i(Lcom/whoop/design/models/cards/ButtonCardModel;)Lf01/q;
    .locals 44

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Llb1/w;->h(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v3

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v11, v2

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getItems()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    move-object v13, v3

    goto :goto_1

    :cond_1
    move-object v13, v2

    :goto_1
    if-eqz v13, :cond_4

    move-object v3, v13

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lny0/h;

    if-eqz v6, :cond_2

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v4}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lny0/h;

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v4

    if-eqz v4, :cond_6

    if-nez v3, :cond_6

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    if-eqz v3, :cond_5

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v4}, Lcom/whoop/navigation/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :goto_4
    move-object/from16 v18, v3

    goto :goto_5

    :cond_5
    move-object/from16 v18, v2

    goto :goto_5

    :cond_6
    if-nez v11, :cond_5

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v3

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getBody()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v20

    if-eqz v20, :cond_7

    new-instance v19, Lkd1/o$c;

    const/16 v24, 0xe

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v19

    goto :goto_6

    :cond_7
    move-object v8, v2

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageUrlAlignment()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    sget-object v3, Lhy0/c0;->TRAILING:Lhy0/c0;

    :goto_7
    move-object v9, v3

    goto :goto_a

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageUrlAlignment()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageUrlAlignment()Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lhy0/c0;->TRAILING:Lhy0/c0;

    invoke-static {}, Lhy0/c0;->values()[Lhy0/c0;

    move-result-object v10

    array-length v12, v10

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v12, :cond_a

    aget-object v15, v10, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_9

    :cond_9
    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    goto :goto_8

    :cond_a
    const/4 v15, 0x0

    :goto_9
    if-nez v15, :cond_b

    move-object v3, v9

    goto :goto_7

    :cond_b
    move-object v3, v15

    goto :goto_7

    :cond_c
    const/4 v9, 0x0

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getImageSize()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    instance-of v3, v2, Lhy0/h1;

    if-eqz v3, :cond_d

    check-cast v2, Lhy0/h1;

    move-object/from16 v19, v2

    goto :goto_b

    :cond_d
    const/16 v19, 0x0

    :goto_b
    if-eqz v19, :cond_e

    invoke-virtual/range {v19 .. v19}, Lhy0/h1;->s()Lhy0/o1;

    move-result-object v2

    goto :goto_c

    :cond_e
    const/4 v2, 0x0

    :goto_c
    sget-object v3, Lhy0/o1;->COACH_RECOMMENDED:Lhy0/o1;

    if-ne v2, v3, :cond_f

    goto/16 :goto_13

    :cond_f
    if-eqz v19, :cond_15

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->getTextColor()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    sget-object v3, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v12

    array-length v14, v12

    const/4 v15, 0x0

    :goto_d
    if-ge v15, v14, :cond_11

    aget-object v17, v12, v15

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_e

    :cond_10
    add-int/lit8 v15, v15, 0x1

    goto :goto_d

    :cond_11
    const/16 v17, 0x0

    :goto_e
    if-nez v17, :cond_12

    goto :goto_f

    :cond_12
    move-object/from16 v3, v17

    :goto_f
    if-nez v3, :cond_13

    goto :goto_11

    :cond_13
    :goto_10
    move-object/from16 v24, v3

    goto :goto_12

    :cond_14
    :goto_11
    sget-object v3, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    goto :goto_10

    :goto_12
    sget-object v22, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    const v42, 0x3fffeb

    const/16 v43, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

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

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-static/range {v19 .. v43}, Lhy0/h1;->b(Lhy0/h1;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lhy0/h1;

    move-result-object v19

    goto :goto_13

    :cond_15
    const/16 v19, 0x0

    :goto_13
    move-object/from16 v12, v19

    goto :goto_14

    :cond_16
    const/4 v12, 0x0

    :goto_14
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ButtonCardModel;->getDismissIcon()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1a

    sget-object v3, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v14, v4

    const/4 v15, 0x0

    :goto_15
    if-ge v15, v14, :cond_18

    aget-object v17, v4, v15

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_16

    :cond_17
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p0

    goto :goto_15

    :cond_18
    const/16 v17, 0x0

    :goto_16
    if-nez v17, :cond_19

    goto :goto_17

    :cond_19
    move-object/from16 v3, v17

    goto :goto_17

    :cond_1a
    const/4 v3, 0x0

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->getExpandedItems()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v14, v0

    goto :goto_18

    :cond_1b
    const/4 v14, 0x0

    :goto_18
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->isExpanded()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move v15, v4

    goto :goto_19

    :cond_1c
    const/4 v15, 0x0

    :goto_19
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->getDismissAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->getStyle()Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;

    move-result-object v0

    invoke-static {v0}, Llb1/w;->k(Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;)Lf01/p;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->getPrice()Lcom/whoop/design/models/cards/ButtonCardPriceModel;

    move-result-object v0

    if-eqz v0, :cond_1d

    new-instance v2, Lf01/o;

    invoke-virtual {v0}, Lcom/whoop/design/models/cards/ButtonCardPriceModel;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/cards/ButtonCardPriceModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Lf01/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v20, v2

    goto :goto_1a

    :cond_1d
    const/16 v20, 0x0

    :goto_1a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/cards/ButtonCardModel;->getTitleColor()Ly81/f;

    move-result-object v21

    new-instance v4, Lf01/q;

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v21}, Lf01/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/c0;Ljava/lang/Integer;Lny0/h;Lhy0/h1;Ljava/util/List;Ljava/util/List;ZLgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lf01/p;Lf01/o;Ly81/f;)V

    return-object v4
.end method

.method public static final j(Lcom/whoop/design/models/items/ToggleCardButtonModel;)Lp41/d;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleCardButtonModel;->getCollapsedTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleCardButtonModel;->getExpandedTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleCardButtonModel;->getCollapsedIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CARET_DOWN:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v9

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleCardButtonModel;->getExpandedIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->CARET_UP:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    :goto_3
    if-ge v6, v7, :cond_4

    aget-object v9, v5, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    move-object v8, v9

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v8, :cond_5

    move-object v5, v1

    goto :goto_5

    :cond_5
    move-object v5, v8

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ToggleCardButtonModel;->getStyle()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lp41/d;

    const/4 v7, 0x0

    const/16 v8, 0x20

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lp41/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final k(Lcom/whoop/design/models/cards/ButtonCardStyleDtoEnum;)Lf01/p;
    .locals 1

    sget-object v0, Llb1/w$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lf01/p;->RAF:Lf01/p;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lf01/p;->DEFAULT:Lf01/p;

    return-object p0

    :cond_2
    sget-object p0, Lf01/p;->TRANSPARENT:Lf01/p;

    return-object p0

    :cond_3
    sget-object p0, Lf01/p;->HIGHLIGHTED:Lf01/p;

    return-object p0
.end method
