.class public abstract Ltc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;",
        "Ls41/b;",
        "e",
        "(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "weightPickerMapper",
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

    new-instance v0, Lqc1/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Ltc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;
    .locals 0

    invoke-static {p0}, Ltc1/a;->h(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltc1/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 0

    invoke-static {p0, p1, p2}, Ltc1/a;->f(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Ltc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getUnitType()Ljava/lang/String;

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
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getDefaultLbs()I

    move-result v0

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_1
    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getDefaultKg()I

    move-result v1

    invoke-virtual {v0, v1}, Ld21/a;->n(I)I

    move-result v0

    goto :goto_2

    :goto_3
    new-instance v1, Ls41/b;

    new-instance v4, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getLbsMin()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getLbsMax()I

    move-result v5

    const/4 v6, 0x1

    invoke-direct {v4, v0, v5, v6}, Li93/h;-><init>(III)V

    new-instance v5, Li93/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getKgMin()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getKgMax()I

    move-result v7

    invoke-direct {v5, v0, v7, v6}, Li93/h;-><init>(III)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getLbsLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getKgLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lr12/a;

    const/16 v0, 0x1c

    invoke-direct {v9, p0, v0}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct/range {v1 .. v9}, Ls41/b;-><init>(ZILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/m;)V

    return-object v1
.end method

.method private static final f(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;ILcom/whoop/domain/model/UnitSystem;)Lcom/whoop/whoopaction/domain/models/StateUpdateAction;
    .locals 2

    const-string v0, "unitSystem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "$weight"

    :cond_0
    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, p1}, Ld21/a;->p(I)I

    move-result p1

    :goto_0
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

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lqc1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ltc1/a$a;

    invoke-direct {v2, v0}, Ltc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ltc1/a;->e(Lcom/whoop/design/models/items/weightpicker/WeightPickerModel;)Ls41/b;

    move-result-object p0

    return-object p0
.end method
