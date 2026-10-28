.class public abstract Llb1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/CardContainerModel;",
        "model",
        "Lf01/u;",
        "d",
        "(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;",
        "Lcom/whoop/design/models/cards/HeaderContentModel;",
        "Lf01/q0;",
        "i",
        "(Lcom/whoop/design/models/cards/HeaderContentModel;)Lf01/q0;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "h",
        "()Llb1/y0;",
        "cardContainerMapper",
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

    new-instance v0, Llb1/v;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/y;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;
    .locals 0

    invoke-static {p0}, Llb1/y;->f(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/y;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/y;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v11, v2

    :goto_0
    instance-of v2, v0, Le81/n;

    if-eqz v2, :cond_2

    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    move-object v12, v0

    check-cast v12, Le81/n;

    invoke-virtual {v12}, Le81/n;->i()Le81/a;

    move-result-object v2

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Le81/a;->b(Le81/a;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Le81/a;

    move-result-object v16

    const/16 v22, 0x1f7

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v12 .. v23}, Le81/n;->c(Le81/n;Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;FILjava/lang/Object;)Le81/n;

    move-result-object v0

    goto :goto_1

    :cond_1
    check-cast v0, Le81/n;

    :cond_2
    :goto_1
    move-object v9, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    if-lez v2, :cond_3

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, v3

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v4, v2

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v4, :cond_5

    aget-object v8, v2, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_5
    move-object v8, v3

    :goto_4
    if-nez v8, :cond_6

    goto :goto_6

    :cond_6
    :goto_5
    move-object v7, v8

    goto :goto_7

    :cond_7
    :goto_6
    sget-object v8, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    goto :goto_5

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getHeaderContent()Lcom/whoop/design/models/cards/HeaderContentModel;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Llb1/y;->i(Lcom/whoop/design/models/cards/HeaderContentModel;)Lf01/q0;

    move-result-object v0

    move-object v8, v0

    goto :goto_8

    :cond_8
    move-object v8, v3

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getCardName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/CardContainerModel;->getBackgroundColor()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Llb1/f0;->a(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;

    move-result-object v3

    :cond_9
    move-object v12, v3

    new-instance v4, Lf01/u;

    invoke-direct/range {v4 .. v12}, Lf01/u;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;)V

    return-object v4
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/CardContainerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/y$a;

    invoke-direct {v2, v0}, Llb1/y$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/y;->d(Lcom/whoop/design/models/cards/CardContainerModel;)Lf01/u;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/y;->a:Llb1/y0;

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/cards/HeaderContentModel;)Lf01/q0;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/HeaderContentModel;->getLeadingIcon()Lgz0/m0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/HeaderContentModel;->getLeadingImage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v1, Lkd1/o$c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/cards/HeaderContentModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/HeaderContentModel;->getTrailingIcon()Lgz0/m0;

    move-result-object p0

    new-instance v3, Lf01/q0;

    invoke-direct {v3, v0, v1, v2, p0}, Lf01/q0;-><init>(Lgz0/m0;Lkd1/o;Ljava/lang/String;Lgz0/m0;)V

    return-object v3
.end method
