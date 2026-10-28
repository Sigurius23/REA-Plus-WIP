.class public abstract Lkc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;",
        "Ld21/c;",
        "g",
        "(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "heightPickerMapper",
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

    new-instance v0, Lji0/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lkc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;
    .locals 0

    invoke-static {p0}, Lkc1/a;->f(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 0

    invoke-static {p0, p1, p2}, Lkc1/a;->h(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkc1/a;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Lkc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lji0/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lji0/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lkc1/a$a;

    invoke-direct {v2, v0}, Lkc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkc1/a;->g(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;)Ld21/c;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getUnitType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getDefaultIn()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, Ld21/a;->a:Ld21/a;

    invoke-virtual {v1, v0}, Ld21/a;->j(I)I

    move-result v0

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_1
    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getDefaultFeet()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getDefaultInches()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ld21/a;->b(II)I

    move-result v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getDefaultCm()I

    move-result v0

    goto :goto_2

    :goto_3
    new-instance v1, Ld21/c;

    new-instance v4, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getFeetMin()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getFeetMax()I

    move-result v5

    const/4 v6, 0x1

    invoke-direct {v4, v0, v5, v6}, Li93/h;-><init>(III)V

    new-instance v5, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getCmMin()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getCmMax()I

    move-result v7

    invoke-direct {v5, v0, v7, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getFeetLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getInchesLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getCmLabel()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lhb2/f;

    const/16 v0, 0x1b

    invoke-direct {v10, p0, v0}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    invoke-direct/range {v1 .. v10}, Ld21/c;-><init>(ZILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V

    return-object v1
.end method

.method private static final h(Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 2

    const-string v0, "unitSystem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/heightpicker/HeightPickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "$height"

    :cond_0
    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->a(I)I

    move-result p1

    :cond_1
    new-instance p2, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p2, p0, v1, p1, v0}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
