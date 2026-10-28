.class public abstract Llb1/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/CompactButtonCardModel;",
        "model",
        "Lf01/a0;",
        "g",
        "(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "Lny0/h;",
        "f",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "compactButtonCardMapper",
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

    new-instance v0, Llb1/i0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/l0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;
    .locals 0

    invoke-static {p0}, Llb1/l0;->d(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/CompactButtonCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/l0$a;

    invoke-direct {v2, v0}, Llb1/l0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/l0;->g(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/l0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
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

    sget-object v2, Lny0/p;->DEFAULT:Lny0/p;

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
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getSize()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v3, Lny0/g;->COMPACT:Lny0/g;

    invoke-static {}, Lny0/g;->values()[Lny0/g;

    move-result-object v4

    array-length v6, v4

    :goto_4
    if-ge v5, v6, :cond_5

    aget-object v9, v4, v5

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_5
    move-object v9, v7

    :goto_5
    if-nez v9, :cond_6

    goto :goto_6

    :cond_6
    move-object v3, v9

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
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_a
    move/from16 v17, v0

    goto :goto_b

    :cond_9
    const/4 v0, 0x1

    goto :goto_a

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v7

    :cond_a
    move-object/from16 v21, v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v23

    new-instance v0, Lny0/h;

    const v26, 0x1ae1b3e

    const/16 v27, 0x0

    move-object v7, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final g(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf01/a0;

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/CompactButtonCardModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/CompactButtonCardModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/CompactButtonCardModel;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/CompactButtonCardModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    invoke-static {p0}, Llb1/l0;->f(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lf01/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/h;)V

    return-object v0
.end method
