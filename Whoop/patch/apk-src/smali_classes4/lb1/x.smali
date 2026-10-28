.class public abstract Llb1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ButtonCellModel;",
        "model",
        "Ld01/f;",
        "e",
        "(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "buttonCellMapper",
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

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/x;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/x;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;
    .locals 0

    invoke-static {p0}, Llb1/x;->d(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ButtonCellModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/x$a;

    invoke-direct {v2, v0}, Llb1/x$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/x;->e(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/models/items/ButtonCellModel;)Ld01/f;
    .locals 23

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getTrailingIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

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
    move-object v15, v7

    goto :goto_2

    :cond_2
    move-object v15, v3

    :goto_2
    if-eqz v15, :cond_3

    sget-object v0, Ld01/a;->ICON:Ld01/a;

    :goto_3
    move-object v12, v0

    goto :goto_5

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    sget-object v0, Ld01/a;->MESSAGE:Ld01/a;

    goto :goto_3

    :cond_5
    :goto_4
    sget-object v0, Ld01/a;->NONE:Ld01/a;

    goto :goto_3

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getAvatars()Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x3

    invoke-static {v0, v4}, Llb1/p;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v10, v0

    goto :goto_6

    :cond_6
    move-object v10, v3

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getTitleType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    sget-object v4, Ld01/h;->UPPERCASE:Ld01/h;

    invoke-static {}, Ld01/h;->values()[Ld01/h;

    move-result-object v5

    array-length v6, v5

    move v7, v2

    :goto_7
    if-ge v7, v6, :cond_8

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_8
    move-object v8, v3

    :goto_8
    if-nez v8, :cond_9

    goto :goto_9

    :cond_9
    move-object v4, v8

    :goto_9
    if-nez v4, :cond_a

    goto :goto_b

    :cond_a
    :goto_a
    move-object v11, v4

    goto :goto_c

    :cond_b
    :goto_b
    sget-object v4, Ld01/h;->UPPERCASE:Ld01/h;

    goto :goto_a

    :goto_c
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getLeadingIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    move v6, v2

    :goto_d
    if-ge v6, v5, :cond_d

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_e

    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_d
    move-object v7, v3

    :goto_e
    move-object v13, v7

    goto :goto_f

    :cond_e
    move-object v13, v3

    :goto_f
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getLeadingImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    move-object v14, v0

    goto :goto_10

    :cond_f
    move-object v14, v3

    :goto_10
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_11

    :cond_10
    move-object/from16 v16, v3

    :goto_11
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getTintColor()Ly81/f;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getEnabled()Z

    move-result v19

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    sget-object v4, Ld01/g;->DEFAULT:Ld01/g;

    invoke-static {}, Ld01/g;->values()[Ld01/g;

    move-result-object v5

    array-length v6, v5

    :goto_12
    if-ge v2, v6, :cond_12

    aget-object v7, v5, v2

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    move-object v3, v7

    goto :goto_13

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    :cond_12
    :goto_13
    if-nez v3, :cond_13

    goto :goto_14

    :cond_13
    move-object v4, v3

    :goto_14
    if-nez v4, :cond_14

    goto :goto_16

    :cond_14
    :goto_15
    move-object/from16 v21, v4

    goto :goto_17

    :cond_15
    :goto_16
    sget-object v4, Ld01/g;->DEFAULT:Ld01/g;

    goto :goto_15

    :goto_17
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ButtonCellModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v22

    new-instance v8, Ld01/f;

    invoke-direct/range {v8 .. v22}, Ld01/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld01/h;Ld01/a;Lgz0/m0;Lkd1/o;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Ld01/g;Ljava/lang/Object;)V

    return-object v8
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/x;->a:Llb1/y0;

    return-object v0
.end method
