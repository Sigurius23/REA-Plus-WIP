.class public abstract Llb1/f5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "triLabelSliderModelMapper",
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

    new-instance v0, Llb1/z2;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/f5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TriLabelSliderModel;)Lq41/c;
    .locals 0

    invoke-static {p0}, Llb1/f5;->e(Lcom/whoop/design/models/items/TriLabelSliderModel;)Lq41/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/f5;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/f5;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TriLabelSliderModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/f5$a;

    invoke-direct {v2, v0}, Llb1/f5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/TriLabelSliderModel;)Lq41/c;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getLowerBound()F

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getCenterBound()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getUpperBound()F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getStartLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getCenterLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getEndLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getSliderValue()F

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarThickness()I

    move-result v9

    invoke-static {}, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBarStyle()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v10

    :goto_0
    check-cast v1, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    if-nez v1, :cond_2

    sget-object v1, Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;->STRAIN_GRADIENT:Lcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TriLabelSliderModel;->getBindings()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_3

    const-string v0, "sliderValue"

    invoke-static {p0, v0}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_3
    move-object v11, v10

    move-object v10, v1

    new-instance v1, Lq41/c;

    invoke-direct/range {v1 .. v11}, Lq41/c;-><init>(FLjava/lang/Float;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FILcom/whoop/design/atomic/molecule/trilabelslider/TriLabelSliderBarStyle;Ljava/lang/String;)V

    return-object v1
.end method
