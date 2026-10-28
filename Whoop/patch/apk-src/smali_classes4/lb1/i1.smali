.class public abstract Llb1/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "model",
        "Lk11/f;",
        "c",
        "(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "Lny0/h;",
        "g",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "emptyTileMapper",
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

    new-instance v0, Llb1/e1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/i1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/i1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 0

    invoke-static {p0}, Llb1/i1;->e(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 19

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getBody()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_0

    move-object v9, v3

    goto :goto_0

    :cond_0
    move-object v9, v2

    :goto_0
    if-eqz v9, :cond_1

    new-instance v8, Lkd1/o$c;

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v8

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v0, v3}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v3, v0, Lhy0/h1;

    if-eqz v3, :cond_2

    check-cast v0, Lhy0/h1;

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_3
    move-object v8, v2

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getPrimaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Llb1/i1;->g(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v0

    move-object v9, v0

    goto :goto_4

    :cond_4
    move-object v9, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getSecondaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Llb1/i1;->g(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v2

    :cond_5
    move-object v10, v2

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getButtonConfiguration()Lk11/a;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Lk11/a;->VERTICAL:Lk11/a;

    :cond_6
    move-object v12, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/tiles/EmptyTileModel;->getViewedAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v15

    new-instance v3, Lk11/f;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1680

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v18}, Lk11/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/i1$a;

    invoke-direct {v2, v0}, Llb1/i1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/i1;->c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/i1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
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
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v3, Lgz0/m0;->ADD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

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

    goto :goto_6

    :cond_7
    move-object v3, v7

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_7
    move/from16 v17, v0

    goto :goto_8

    :cond_8
    const/4 v0, 0x1

    goto :goto_7

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v7

    :cond_9
    move-object/from16 v21, v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v10

    new-instance v0, Lny0/h;

    const v26, 0x1e61c3c

    const/16 v27, 0x0

    move-object v7, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
