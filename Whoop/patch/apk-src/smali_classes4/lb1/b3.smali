.class public abstract Llb1/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/b3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MilestoneCardModel;",
        "model",
        "Ls21/h;",
        "d",
        "(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "milestoneCardMapper",
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

    new-instance v0, Llb1/t2;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/b3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/b3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;
    .locals 0

    invoke-static {p0}, Llb1/b3;->f(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/b3;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;
    .locals 22

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v2, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, ""

    :cond_0
    move-object v7, v4

    new-instance v8, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getCta()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :cond_1
    move-object v9, v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getFilledCount()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v12, v4

    goto :goto_0

    :cond_2
    const/4 v12, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getTotalCount()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v13, v4

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getProgressStyle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {}, Ls21/j;->values()[Ls21/j;

    move-result-object v15

    array-length v0, v15

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v0, :cond_5

    aget-object v18, v15, v10

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    const/16 v18, 0x0

    :goto_3
    if-nez v18, :cond_6

    const/4 v0, -0x1

    goto :goto_4

    :cond_6
    sget-object v0, Llb1/b3$a;->a:[I

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v0, v0, v4

    :goto_4
    if-ne v0, v2, :cond_7

    sget-object v0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    move-object v14, v0

    goto :goto_6

    :cond_8
    const/4 v14, 0x0

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneCardModel;->getProgressStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {}, Ls21/j;->values()[Ls21/j;

    move-result-object v2

    array-length v4, v2

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v4, :cond_a

    aget-object v15, v2, v10

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p0

    goto :goto_7

    :cond_a
    const/4 v15, 0x0

    :goto_8
    if-nez v15, :cond_b

    const/4 v0, -0x1

    goto :goto_9

    :cond_b
    sget-object v0, Llb1/b3$a;->a:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_9
    const/4 v1, 0x2

    if-ne v0, v1, :cond_c

    sget-object v0, Ly81/f;->RECOVERY:Ly81/f;

    goto :goto_a

    :cond_c
    const/4 v0, 0x0

    :goto_a
    move-object v10, v0

    goto :goto_b

    :cond_d
    const/4 v10, 0x0

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getColor()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getColor()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ly81/f;->WHITE_10:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v2

    array-length v4, v2

    move-object/from16 v18, v1

    const/4 v1, 0x0

    :goto_c
    if-ge v1, v4, :cond_f

    aget-object v19, v2, v1

    move/from16 v20, v1

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_d

    :cond_e
    add-int/lit8 v1, v20, 0x1

    goto :goto_c

    :cond_f
    const/16 v19, 0x0

    :goto_d
    if-nez v19, :cond_10

    move-object/from16 v1, v18

    goto :goto_e

    :cond_10
    move-object/from16 v1, v19

    goto :goto_e

    :cond_11
    const/4 v1, 0x0

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_15

    sget-object v2, Ls21/i;->STEP_BAR:Ls21/i;

    invoke-static {}, Ls21/i;->values()[Ls21/i;

    move-result-object v4

    move-object/from16 v18, v1

    array-length v1, v4

    move-object/from16 v19, v2

    const/4 v2, 0x0

    :goto_f
    if-ge v2, v1, :cond_13

    aget-object v17, v4, v2

    move/from16 v20, v1

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_10

    :cond_12
    add-int/lit8 v2, v2, 0x1

    move/from16 v1, v20

    goto :goto_f

    :cond_13
    const/16 v17, 0x0

    :goto_10
    if-nez v17, :cond_14

    move-object/from16 v2, v19

    goto :goto_11

    :cond_14
    move-object/from16 v2, v17

    :goto_11
    move-object/from16 v17, v2

    goto :goto_12

    :cond_15
    move-object/from16 v18, v1

    const/16 v17, 0x0

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getDialogInfo()Lcom/whoop/design/models/items/DialogInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v1, Ls21/a;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DialogInfo;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DialogInfo;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DialogInfo;->getItems()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, v4, v0}, Ls21/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    move-object/from16 v19, v1

    goto :goto_13

    :cond_16
    const/16 v19, 0x0

    :goto_13
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getNavigationTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v3, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    goto :goto_14

    :cond_17
    const/4 v0, 0x0

    :goto_14
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getAnalytics()Lcom/whoop/design/models/items/MilestoneAnalytics;

    move-result-object v1

    if-eqz v1, :cond_18

    new-instance v2, Ls21/b;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneAnalytics;->getEventName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneAnalytics;->getCategory()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v20, v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneAnalytics;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MilestoneAnalytics;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v0, v1}, Ls21/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_15

    :cond_18
    move-object/from16 v20, v0

    const/4 v0, 0x0

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MilestoneCardModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v21

    new-instance v4, Ls21/h;

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v0

    invoke-direct/range {v4 .. v21}, Ls21/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/navigation/e;IILy81/f;ZLy81/f;Ls21/i;Lm91/u;Ls21/a;Ls21/b;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v4
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/MilestoneCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/b3$b;

    invoke-direct {v2, v0}, Llb1/b3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/b3;->d(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;

    move-result-object p0

    return-object p0
.end method
