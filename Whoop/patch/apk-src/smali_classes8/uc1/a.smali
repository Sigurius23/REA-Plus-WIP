.class public abstract Luc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luc1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001b\u0010\r\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AxisSize;",
        "Ls81/e;",
        "f",
        "(Lcom/whoop/design/models/items/AxisSize;)Ls81/e;",
        "Lcom/whoop/design/models/items/SpacingInsets;",
        "Ll0/k1;",
        "g",
        "(Lcom/whoop/design/models/items/SpacingInsets;)Ll0/k1;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "e",
        "()Ljb1/a;",
        "whoopRowNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "whoopRowMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu91/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lu91/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Luc1/a;->a:Ll83/h;

    new-instance v0, Lu71/c;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Luc1/a;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luc1/a;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Luc1/a;->j()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;)Ls81/h;
    .locals 0

    invoke-static {p0}, Luc1/a;->i(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;)Ls81/h;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Luc1/a;->b:Llb1/y0;

    return-object v0
.end method

.method private static final e()Ljb1/a;
    .locals 1

    sget-object v0, Luc1/a;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/AxisSize;)Ls81/e;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AxisSize;->getType()Lcom/whoop/design/models/items/AxisSizeType;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/4 v2, -0x1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    sget-object v3, Luc1/a$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    :goto_1
    if-eq v1, v2, :cond_4

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    sget-object p0, Ls81/e$b;->a:Ls81/e$b;

    return-object p0

    :cond_4
    :goto_2
    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AxisSize;->getWeight()Ljava/lang/Double;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-float p0, v1

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_5

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_5

    move-object v0, p0

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_3

    :cond_6
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_3
    new-instance v0, Ls81/e$a;

    invoke-direct {v0, p0}, Ls81/e$a;-><init>(F)V

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/SpacingInsets;)Ll0/k1;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SpacingInsets;->getLeading()Lcom/whoop/design/models/items/Spacing;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result v1

    goto :goto_0

    :cond_0
    int-to-float v1, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SpacingInsets;->getTop()Lcom/whoop/design/models/items/Spacing;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result v2

    goto :goto_1

    :cond_1
    int-to-float v2, v0

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SpacingInsets;->getTrailing()Lcom/whoop/design/models/items/Spacing;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result v3

    goto :goto_2

    :cond_2
    int-to-float v3, v0

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SpacingInsets;->getBottom()Lcom/whoop/design/models/items/Spacing;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result p0

    goto :goto_3

    :cond_3
    int-to-float p0, v0

    :goto_3
    new-instance v0, Ll0/l1;

    invoke-direct {v0, v1, v2, v3, p0}, Ll0/l1;-><init>(FFFF)V

    return-object v0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu71/c;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Luc1/a$b;

    invoke-direct {v2, v0}, Luc1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;)Ls81/h;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;->getItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {}, Luc1/a;->e()Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, Ls81/d;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;->getWidth()Lcom/whoop/design/models/items/AxisSize;

    move-result-object v1

    invoke-static {v1}, Luc1/a;->f(Lcom/whoop/design/models/items/AxisSize;)Ls81/e;

    move-result-object v1

    invoke-direct {v5, v4, v1}, Ls81/d;-><init>(Lm91/u;Ls81/e;)V

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getSpacing()Lcom/whoop/design/models/items/Spacing;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result v0

    :goto_2
    move v4, v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    int-to-float v0, v0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getMainAxisSize()Lcom/whoop/design/models/items/AxisSizeType;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    sget-object v5, Luc1/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    :goto_4
    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v0, v1, :cond_7

    if-eq v0, v6, :cond_6

    if-ne v0, v5, :cond_5

    goto :goto_5

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    sget-object v0, Ls81/a;->HUG:Ls81/a;

    goto :goto_6

    :cond_7
    :goto_5
    sget-object v0, Ls81/a;->FILL:Ls81/a;

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getMainAxisAlignment()Lcom/whoop/design/models/items/MainAxisAlignment;

    move-result-object v7

    if-nez v7, :cond_8

    move v7, v1

    goto :goto_7

    :cond_8
    sget-object v8, Luc1/a$a;->b:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    :goto_7
    const/4 v8, 0x3

    if-eq v7, v1, :cond_c

    if-eq v7, v6, :cond_b

    if-eq v7, v5, :cond_a

    if-ne v7, v8, :cond_9

    goto :goto_8

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_a
    sget-object v7, Lb2/e;->O:Lb2/k;

    goto :goto_9

    :cond_b
    sget-object v7, Lb2/e;->N:Lb2/k;

    goto :goto_9

    :cond_c
    :goto_8
    sget-object v7, Lb2/e;->M:Lb2/k;

    :goto_9
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getCrossAxisSize()Lcom/whoop/design/models/items/AxisSizeType;

    move-result-object v9

    if-nez v9, :cond_d

    move v9, v1

    goto :goto_a

    :cond_d
    sget-object v10, Luc1/a$a;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v10, v9

    :goto_a
    if-eq v9, v1, :cond_f

    if-eq v9, v6, :cond_f

    if-ne v9, v5, :cond_e

    sget-object v9, Ls81/a;->FILL:Ls81/a;

    goto :goto_b

    :cond_e
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_f
    sget-object v9, Ls81/a;->HUG:Ls81/a;

    :goto_b
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getCrossAxisAlignment()Lcom/whoop/design/models/items/CrossAxisAlignment;

    move-result-object v10

    if-nez v10, :cond_10

    move v10, v1

    goto :goto_c

    :cond_10
    sget-object v11, Luc1/a$a;->c:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v11, v10

    :goto_c
    if-eq v10, v1, :cond_15

    if-eq v10, v6, :cond_14

    if-eq v10, v5, :cond_13

    if-eq v10, v8, :cond_12

    const/4 v1, 0x4

    if-ne v10, v1, :cond_11

    goto :goto_e

    :cond_11
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_12
    sget-object v1, Ls81/b;->STRETCH:Ls81/b;

    :goto_d
    move-object v8, v1

    goto :goto_f

    :cond_13
    sget-object v1, Ls81/b;->END:Ls81/b;

    goto :goto_d

    :cond_14
    sget-object v1, Ls81/b;->START:Ls81/b;

    goto :goto_d

    :cond_15
    :goto_e
    sget-object v1, Ls81/b;->CENTER:Ls81/b;

    goto :goto_d

    :goto_f
    invoke-virtual {p0}, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;->getPadding()Lcom/whoop/design/models/items/SpacingInsets;

    move-result-object p0

    invoke-static {p0}, Luc1/a;->g(Lcom/whoop/design/models/items/SpacingInsets;)Ll0/k1;

    move-result-object p0

    new-instance v1, Ls81/h;

    const/4 v10, 0x0

    move-object v5, v0

    move-object v6, v7

    move-object v7, v9

    move-object v9, p0

    invoke-direct/range {v1 .. v10}, Ls81/h;-><init>(Ljava/lang/String;Ljava/util/List;FLs81/a;Lb2/f;Ls81/a;Ls81/b;Ll0/k1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final j()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method
