.class public abstract Llc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/heightweight/HeightWeightModel;",
        "Ljb1/a;",
        "reducer",
        "Lo71/h;",
        "f",
        "(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Ljb1/a;)Lo71/h;",
        "Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;",
        "Lo71/i;",
        "g",
        "(Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;)Lo71/i;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "heightWeightMapper",
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

    new-instance v0, Llb1/z4;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)Lo71/h;
    .locals 0

    invoke-static {p0}, Llc1/a;->e(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)Lo71/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llc1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llc1/a$a;

    invoke-direct {v2, v0}, Llc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;)Lo71/h;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-static {p0, v0}, Llc1/a;->f(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Ljb1/a;)Lo71/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/items/heightweight/HeightWeightModel;Ljb1/a;)Lo71/h;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reducer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getUnitType()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getHeightPicker()Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getWeightPicker()Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :cond_2
    :goto_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getHeightPicker()Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move-result-object v4

    if-eqz v4, :cond_5

    if-nez v1, :cond_3

    invoke-virtual {v4}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_2

    :cond_3
    move-object/from16 v17, v1

    :goto_2
    const/16 v19, 0x2fff

    const/16 v20, 0x0

    const/4 v5, 0x0

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

    const/16 v18, 0x0

    invoke-static/range {v4 .. v20}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->copy$default(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    instance-of v5, v4, Ld21/c;

    if-eqz v5, :cond_4

    check-cast v4, Ld21/c;

    goto :goto_3

    :cond_4
    move-object v4, v3

    :goto_3
    move-object v8, v4

    goto :goto_4

    :cond_5
    move-object v8, v3

    :goto_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getWeightPicker()Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-result-object v9

    if-eqz v9, :cond_8

    if-nez v1, :cond_6

    invoke-virtual {v9}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v19, v4

    goto :goto_5

    :cond_6
    move-object/from16 v19, v1

    :goto_5
    const/16 v21, 0x5ff

    const/16 v22, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v9 .. v22}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->copy$default(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v4, v0, Ls41/b;

    if-eqz v4, :cond_7

    check-cast v0, Ls41/b;

    goto :goto_6

    :cond_7
    move-object v0, v3

    :goto_6
    move-object v10, v0

    goto :goto_7

    :cond_8
    move-object v10, v3

    :goto_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getSegmentedControl()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;

    invoke-static {v4}, Llc1/a;->g(Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;)Lo71/i;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getHeightPicker()Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_9

    :cond_a
    move-object v7, v3

    :goto_9
    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getWeightPicker()Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_a

    :cond_b
    move-object v9, v3

    :goto_a
    const/4 v0, 0x2

    invoke-static {v1, v3, v0, v3}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromStringOrDefault$default(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/design/models/items/heightweight/HeightWeightModel;->getStateUpdateUnitKey()Ljava/lang/String;

    move-result-object v12

    new-instance v5, Lo71/h;

    invoke-direct/range {v5 .. v12}, Lo71/h;-><init>(Ljava/util/List;Ljava/lang/String;Ld21/c;Ljava/lang/String;Ls41/b;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/String;)V

    return-object v5
.end method

.method public static final g(Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;)Lo71/i;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo71/i;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightweight/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lo71/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
