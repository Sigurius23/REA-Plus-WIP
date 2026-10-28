.class public abstract Llb1/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/h3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MultiWheelPickerWheel;",
        "Lw21/b$a;",
        "g",
        "(Lcom/whoop/design/models/items/MultiWheelPickerWheel;)Lw21/b$a;",
        "Lcom/whoop/design/models/items/WheelContent;",
        "",
        "Lw21/b$b;",
        "c",
        "(Lcom/whoop/design/models/items/WheelContent;)Ljava/util/List;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "multiWheelPickerModelMapper",
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

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/h3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/h3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lw21/b;
    .locals 0

    invoke-static {p0}, Llb1/h3;->f(Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lw21/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/design/models/items/WheelContent;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/WheelContent;",
            ")",
            "Ljava/util/List<",
            "Lw21/b$b;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getType()Lcom/whoop/design/models/items/WheelContentType;

    move-result-object v0

    sget-object v1, Llb1/h3$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/16 v1, 0xa

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getOptions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/WheelOption;

    new-instance v2, Lw21/b$b;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/WheelOption;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/WheelOption;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lw21/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getLowerBound()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-int v0, v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getUpperBound()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-int v3, v3

    goto :goto_2

    :cond_4
    move v3, v0

    :goto_2
    if-ge v3, v0, :cond_5

    move v3, v0

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getStepSize()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    if-lez v4, :cond_6

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_4

    :cond_7
    move v4, v2

    :goto_4
    new-instance v5, Li93/j;

    invoke-direct {v5, v0, v3, v2}, Li93/h;-><init>(III)V

    invoke-static {v4, v5}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    move-object v1, v0

    check-cast v1, Li93/i;

    iget-boolean v1, v1, Li93/i;->y:Z

    if-eqz v1, :cond_b

    move-object v1, v0

    check-cast v1, Lm83/e0;

    invoke-virtual {v1}, Lm83/e0;->nextInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getPadTo()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3, v1}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_9

    :cond_8
    move-object v3, v1

    :cond_9
    new-instance v4, Lw21/b$b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/WheelContent;->getPrefix()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_a

    const-string v5, ""

    :cond_a
    invoke-static {v5, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3, v1}, Lw21/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_b
    return-object v2
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/h3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/MultiWheelPickerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/h3$b;

    invoke-direct {v2, v0}, Llb1/h3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/MultiWheelPickerModel;)Lw21/b;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerModel;->getWheels()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/MultiWheelPickerWheel;

    invoke-static {v2}, Llb1/h3;->g(Lcom/whoop/design/models/items/MultiWheelPickerWheel;)Lw21/b$a;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lw21/b;

    invoke-direct {p0, v0, v1}, Lw21/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/MultiWheelPickerWheel;)Lw21/b$a;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getContent()Lcom/whoop/design/models/items/WheelContent;

    move-result-object v0

    invoke-static {v0}, Llb1/h3;->c(Lcom/whoop/design/models/items/WheelContent;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw21/b$b;

    invoke-virtual {v4}, Lw21/b$b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getSelectedValue()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v4, 0x0

    if-ltz v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v4

    :goto_2
    if-eqz v0, :cond_4

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_3
    move v5, v1

    goto :goto_7

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw21/b$b;

    invoke-virtual {v6}, Lw21/b$b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getSelectedValue()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v5, v2

    goto :goto_5

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    :goto_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ltz v2, :cond_7

    goto :goto_6

    :cond_7
    move-object v0, v4

    :goto_6
    if-eqz v0, :cond_3

    goto :goto_3

    :goto_7
    new-instance v1, Lw21/b$a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getKey()Ljava/lang/String;

    move-result-object v2

    move-object v0, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getUnitLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MultiWheelPickerWheel;->getBindings()Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_8

    const-string v0, "selectedValue"

    invoke-static {p0, v0}, Lcom/whoop/design/models/binding/BindingLoggerKt;->resolveContentBindingKey(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    move-object v6, p0

    goto :goto_8

    :cond_8
    move-object v6, v0

    :goto_8
    invoke-direct/range {v1 .. v6}, Lw21/b$a;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;)V

    return-object v1
.end method
