.class public abstract Llb1/h4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SelectableCellModel;",
        "Lry0/d;",
        "d",
        "(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "selectableCellItemMapper",
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

    new-instance v0, Llb1/x3;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/h4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;
    .locals 0

    invoke-static {p0}, Llb1/h4;->f(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/h4;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/h4;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;
    .locals 26

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelectionStyle()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lry0/c;->values()[Lry0/c;

    move-result-object v4

    array-length v5, v4

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v3

    :goto_1
    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v15, v7

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v7, Lry0/c;->DEFAULT:Lry0/c;

    goto :goto_2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getSubtitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    :goto_5
    if-ge v2, v5, :cond_5

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_6

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    move-object v6, v3

    :goto_6
    move-object v12, v6

    goto :goto_7

    :cond_6
    move-object v12, v3

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getLeftImageUrl()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_7

    new-instance v16, Lkd1/o$c;

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v13, v16

    goto :goto_8

    :cond_7
    move-object v13, v3

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getShouldTintLeftImage()Z

    move-result v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v16

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getShowCheckbox()Z

    move-result v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled()Z

    move-result v21

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    :cond_8
    move-object/from16 v18, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getDeselectAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getFixedHeightSize()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v0, v2

    new-instance v3, Ly3/f;

    invoke-direct {v3, v0}, Ly3/f;-><init>(F)V

    :cond_9
    move-object/from16 v22, v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/SelectableCellModel;->getSectionTitle()Ljava/lang/String;

    move-result-object v23

    new-instance v8, Lry0/d;

    const/16 v24, 0x800

    const/16 v25, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v25}, Lry0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lkd1/o;ZLry0/c;ZZLjava/lang/Object;Ljava/lang/Object;ZZLy3/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/x3;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SelectableCellModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/h4$a;

    invoke-direct {v2, v0}, Llb1/h4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/h4;->d(Lcom/whoop/design/models/items/SelectableCellModel;)Lry0/d;

    move-result-object p0

    return-object p0
.end method
