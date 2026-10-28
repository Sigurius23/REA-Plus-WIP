.class public abstract Llb1/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/m3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001d\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u00082\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;",
        "Ly21/b$c;",
        "m",
        "(Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;)Ly21/b$c;",
        "Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;",
        "Ly21/b$a;",
        "l",
        "(Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;)Ly21/b$a;",
        "Lcom/whoop/design/models/items/MultiWheelPickerModel;",
        "",
        "driveSliderClientSide",
        "Lw21/b;",
        "k",
        "(Lcom/whoop/design/models/items/MultiWheelPickerModel;Z)Lw21/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "numericInputSliderModelMapper",
        "Ljb1/a;",
        "b",
        "Ll83/h;",
        "f",
        "()Ljb1/a;",
        "pickerReducer",
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

.field private static final b:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/z2;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/m3;->a:Llb1/y0;

    new-instance v0, Ll72/f;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ll72/f;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/m3;->b:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/NumericInputSliderModel;)Ly21/b;
    .locals 0

    invoke-static {p0}, Llb1/m3;->h(Lcom/whoop/design/models/items/NumericInputSliderModel;)Ly21/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/m3;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/m3;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/m3;->i()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/m3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/m3;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/NumericInputSliderModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/m3$b;

    invoke-direct {v2, v0}, Llb1/m3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/NumericInputSliderModel;)Ly21/b;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "sliderValue"

    invoke-static {v0, v2}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    goto :goto_0

    :cond_0
    move-object v11, v1

    :goto_0
    new-instance v2, Ly21/b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getUpperBound()F

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getLowerBound()F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getStepSize()I

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarThickness()I

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getBarColor()Ly81/f;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getSliderValue()F

    move-result v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getStartLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/m3;->m(Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;)Ly21/b$c;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object v9, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getEndLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Llb1/m3;->l(Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;)Ly21/b$a;

    move-result-object v0

    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object v10, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getPicker()Lcom/whoop/design/models/items/MultiWheelPickerModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel;->getEndLabel()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->getFormat()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;

    move-result-object v1

    :cond_3
    sget-object p0, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;->TIME:Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;

    if-ne v1, p0, :cond_4

    if-eqz v11, :cond_4

    const/4 p0, 0x1

    goto :goto_3

    :cond_4
    const/4 p0, 0x0

    :goto_3
    invoke-static {v0, p0}, Llb1/m3;->k(Lcom/whoop/design/models/items/MultiWheelPickerModel;Z)Lw21/b;

    move-result-object v1

    :cond_5
    move-object v12, v1

    invoke-direct/range {v2 .. v12}, Ly21/b;-><init>(FFIILy81/f;FLy21/b$c;Ly21/b$a;Ljava/lang/String;Lm91/u;)V

    return-object v2
.end method

.method private static final i()Ljb1/a;
    .locals 2

    new-instance v0, Llb1/z2;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/MultiWheelPickerModel;Z)Lw21/b;
    .locals 11

    invoke-static {}, Llb1/m3;->f()Ljb1/a;

    move-result-object v0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lw21/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lw21/b;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p1, :cond_2

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lw21/b;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lw21/b$a;

    invoke-virtual {v3}, Lw21/b$a;->c()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lw21/b$a;->b(Lw21/b$a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lw21/b$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p0, v1, v0, p1, v1}, Lw21/b;->b(Lw21/b;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lw21/b;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;)Ly21/b$a;
    .locals 3

    new-instance v0, Ly21/b$a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->getUnit()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabel;->getFormat()Lcom/whoop/design/models/items/NumericInputSliderModel$EndLabelFormat;

    move-result-object p0

    sget-object v2, Llb1/m3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    const/4 v2, 0x1

    if-eq p0, v2, :cond_1

    const/4 v2, 0x2

    if-ne p0, v2, :cond_0

    sget-object p0, Ly21/b$b;->DISTANCE:Ly21/b$b;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly21/b$b;->TIME:Ly21/b$b;

    :goto_0
    invoke-direct {v0, v1, p0}, Ly21/b$a;-><init>(Ljava/lang/String;Ly21/b$b;)V

    return-object v0
.end method

.method private static final m(Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;)Ly21/b$c;
    .locals 3

    new-instance v0, Ly21/b$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NumericInputSliderModel$StartLabel;->getBannerColor()Ly81/f;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Ly21/b$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ly81/f;)V

    return-object v0
.end method
