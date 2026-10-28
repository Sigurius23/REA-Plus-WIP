.class public abstract Lkotlin/jvm/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lh20/e2;)Lq20/a;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lc30/f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    sget-object p0, Lq20/a;->H:Lq20/a;

    return-object p0

    :pswitch_2
    sget-object p0, Lq20/a;->G:Lq20/a;

    return-object p0

    :pswitch_3
    sget-object p0, Lq20/a;->E:Lq20/a;

    return-object p0

    :pswitch_4
    sget-object p0, Lq20/a;->z:Lq20/a;

    return-object p0

    :pswitch_5
    sget-object p0, Lq20/a;->y:Lq20/a;

    return-object p0

    :pswitch_6
    sget-object p0, Lq20/a;->x:Lq20/a;

    return-object p0

    :pswitch_7
    sget-object p0, Lq20/a;->w:Lq20/a;

    return-object p0

    :pswitch_8
    sget-object p0, Lq20/a;->F:Lq20/a;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
    .end packed-switch
.end method

.method public static B(Landroid/content/Context;Ls/m2;I)Landroid/content/res/ColorStateList;
    .locals 2

    iget-object v0, p1, Ls/m2;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1, p2}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static final D(Llb3/y;)Llb3/j;
    .locals 2

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Llb3/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Llb3/j;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Llb3/j;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static E(Landroid/content/Context;Landroid/content/res/TypedArray;II)I
    .locals 3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, v0, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    iget p1, v0, Landroid/util/TypedValue;->data:I

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return p1

    :cond_1
    :goto_0
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p0

    return p0
.end method

.method public static F(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(I)Lr7/b0;
    .locals 2

    int-to-double v0, p0

    sget-object p0, Lr7/b0;->y:Lr7/t;

    invoke-static {v0, v1}, Lr7/t;->a(D)Lr7/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final H(Lh20/f1;)F
    .locals 1

    instance-of v0, p0, Lh20/e1;

    if-eqz v0, :cond_0

    const/16 p0, 0xc

    int-to-float p0, p0

    return p0

    :cond_0
    instance-of v0, p0, Lh20/z0;

    if-eqz v0, :cond_1

    check-cast p0, Lh20/z0;

    iget p0, p0, Lh20/z0;->H:F

    return p0

    :cond_1
    instance-of v0, p0, Lh20/b1;

    if-eqz v0, :cond_2

    check-cast p0, Lh20/b1;

    iget p0, p0, Lh20/b1;->G:F

    return p0

    :cond_2
    instance-of v0, p0, Lh20/d1;

    if-eqz v0, :cond_3

    check-cast p0, Lh20/d1;

    iget p0, p0, Lh20/d1;->G:F

    return p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final synthetic I()Lr7/b0;
    .locals 3

    const/16 v0, 0x3e8

    int-to-double v0, v0

    sget-object v2, Lr7/b0;->y:Lr7/t;

    invoke-static {v0, v1}, Lr7/t;->b(D)Lr7/b0;

    move-result-object v0

    return-object v0
.end method

.method public static final J(La3/f2;)Landroidx/compose/ui/node/NodeCoordinator;
    .locals 1

    const/16 v0, 0x10

    invoke-static {p0, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    return-object p0
.end method

.method public static final K(Lh20/f1;)F
    .locals 1

    instance-of v0, p0, Lh20/e1;

    if-eqz v0, :cond_0

    check-cast p0, Lh20/e1;

    iget p0, p0, Lh20/e1;->x:F

    return p0

    :cond_0
    instance-of v0, p0, Lh20/z0;

    if-eqz v0, :cond_1

    check-cast p0, Lh20/z0;

    iget p0, p0, Lh20/z0;->G:F

    return p0

    :cond_1
    instance-of v0, p0, Lh20/b1;

    if-eqz v0, :cond_2

    check-cast p0, Lh20/b1;

    iget p0, p0, Lh20/b1;->E:F

    return p0

    :cond_2
    instance-of v0, p0, Lh20/d1;

    if-eqz v0, :cond_3

    check-cast p0, Lh20/d1;

    iget p0, p0, Lh20/d1;->F:F

    return p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final L(Llb3/y;)Z
    .locals 1

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Llb3/j;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/j;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Llb3/j;->E()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static M(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->fontScale:F

    const v0, 0x3fa66666    # 1.3f

    cmpl-float p0, p0, v0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static N(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/v0;)V
    .locals 1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Hint"

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s is not %s"

    invoke-interface {p2, v0, p1, p0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final O(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\\d"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$0 "

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "replaceAll(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final P(Lq83/j;La1/e;La30/v;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Ljy/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ljy/a;

    iget v1, v0, Ljy/a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljy/a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljy/a;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Ljy/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljy/a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lg20/p;

    const/4 v2, 0x0

    const/16 v4, 0x16

    invoke-direct {p3, p2, p1, v2, v4}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Ljy/a;->x:I

    invoke-static {p0, p3, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ll83/n;

    iget-object p0, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p0
.end method

.method public static Q(Le40/c;Ljava/lang/String;Z)Z
    .locals 7

    invoke-interface {p0}, Le40/c;->i()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "toLowerCase(...)"

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v6, Ls3/c;->a:Ls/m2;

    invoke-virtual {v6}, Ls/m2;->i()Ls3/b;

    move-result-object v6

    invoke-virtual {v6}, Ls3/b;->a()Ls3/a;

    move-result-object v6

    iget-object v6, v6, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Ls3/c;->a:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->i()Ls3/b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/b;->a()Ls3/a;

    move-result-object v0

    iget-object v0, v0, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-static {v3, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_2

    move p1, v1

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    if-eqz p2, :cond_4

    invoke-interface {p0}, Le40/c;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_3

    :cond_3
    move p0, v1

    goto :goto_4

    :cond_4
    :goto_3
    move p0, v2

    :goto_4
    if-eqz p1, :cond_5

    if-eqz p0, :cond_5

    return v1

    :cond_5
    return v2
.end method

.method public static final R(Ljava/time/Month;)Lpc3/m;
    .locals 1

    sget-object v0, Lpc3/m;->x:Lt83/b;

    invoke-virtual {p0}, Ljava/time/Month;->getValue()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, Lt83/b;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpc3/m;

    return-object p0
.end method

.method public static final S(F)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "NaN"

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    cmpg-float p0, p0, v0

    if-gez p0, :cond_1

    const-string p0, "-Infinity"

    return-object p0

    :cond_1
    const-string p0, "Infinity"

    return-object p0

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    float-to-double v1, v1

    int-to-double v3, v0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr p0, v1

    float-to-int v2, p0

    int-to-float v3, v2

    sub-float/2addr p0, v3

    const/high16 v3, 0x3f000000    # 0.5f

    cmpl-float p0, p0, v3

    if-ltz p0, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    int-to-float p0, v2

    div-float/2addr p0, v1

    if-lez v0, :cond_4

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    float-to-int p0, p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final T(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V
    .locals 3

    if-ltz p3, :cond_1

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lt v0, p3, :cond_1

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lt v0, p3, :cond_1

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-lt v0, p3, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "That combination of buffers, offsets and length to xor result in out-of-bond accesses."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final U(III[B[B)[B
    .locals 4

    if-ltz p2, :cond_1

    array-length v0, p3

    sub-int/2addr v0, p2

    if-lt v0, p0, :cond_1

    array-length v0, p4

    sub-int/2addr v0, p2

    if-lt v0, p1, :cond_1

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    add-int v2, v1, p0

    aget-byte v2, p3, v2

    add-int v3, v1, p1

    aget-byte v3, p4, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "That combination of buffers, offsets and length to xor result in out-of-bond accesses."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final V([B[B)[B
    .locals 2

    array-length v0, p0

    array-length v1, p1

    if-ne v0, v1, :cond_0

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {v1, v1, v0, p0, p1}, Lkotlin/jvm/internal/j;->U(III[B[B)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The lengths of x and y should match."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, 0x55eafe1e

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    or-int/lit8 p2, p2, 0x30

    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_2
    :goto_1
    const p1, 0x43f0a668    # 481.30005f

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p2, 0xe

    const/4 p2, 0x0

    const/4 v10, 0x1

    if-ne p1, v0, :cond_3

    move p1, v10

    goto :goto_2

    :cond_3
    move p1, p2

    :goto_2
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f080858

    if-nez p1, :cond_4

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v1, p1, :cond_5

    :cond_4
    invoke-static {v2, p0}, Ls40/e0;->i(ILjava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v7, p2}, Lp1/q;->q(Z)V

    if-ne p1, v2, :cond_6

    move v1, v10

    goto :goto_3

    :cond_6
    move v1, p2

    :goto_3
    const v2, 0x43f0ca08

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, -0x1a6f7841

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/b;

    invoke-virtual {v7, p2}, Lp1/q;->q(Z)V

    iget-wide v3, v3, Lg00/b;->d:J

    const/4 v5, 0x3

    int-to-float v5, v5

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v11, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v0, v0

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_4

    :cond_7
    move-object v0, v11

    :goto_4
    invoke-virtual {v7, p2}, Lp1/q;->q(Z)V

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, p2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1, v7, p2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const v3, -0x462ac6a4

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    if-eqz v1, :cond_b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v7, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v7, p2}, Lp1/q;->q(Z)V

    iget-wide v1, v1, Lg00/b;->o:J

    new-instance v3, Li2/p;

    const/4 v4, 0x5

    invoke-direct {v3, v1, v2, v4}, Li2/p;-><init>(JI)V

    :goto_6
    move-object v6, v3

    goto :goto_7

    :cond_b
    const/4 v3, 0x0

    goto :goto_6

    :goto_7
    invoke-virtual {v7, p2}, Lp1/q;->q(Z)V

    const/16 v8, 0x61b0

    const/16 v9, 0x28

    const/4 v1, 0x0

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    move-object p1, v11

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lj00/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lj00/m;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ls2/e;Ll0/i;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v7, p5

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v1, -0x7f0f42b

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    :cond_1
    move-object/from16 v3, p1

    goto :goto_2

    :cond_2
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_1

    move-object/from16 v3, p1

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_1

    :cond_3
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v1, v4

    :goto_2
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v1, v6

    :goto_4
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v8, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v1, v9

    :goto_6
    and-int/lit16 v9, v1, 0x493

    const/16 v10, 0x492

    if-ne v9, v10, :cond_b

    invoke-virtual {v13}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v5

    move-object v4, v8

    goto/16 :goto_c

    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_c
    move-object v2, v3

    :goto_8
    if-eqz v4, :cond_d

    sget-object v3, Lh00/c;->a:Lh00/c;

    move-object/from16 v16, v3

    goto :goto_9

    :cond_d
    move-object/from16 v16, v5

    :goto_9
    if-eqz v6, :cond_e

    sget-object v3, Ll0/m;->e:Ll0/h;

    goto :goto_a

    :cond_e
    move-object v3, v8

    :goto_a
    sget-object v4, Lb2/e;->K:Lb2/l;

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v5, v5, 0xe

    or-int/lit16 v5, v5, 0x180

    shr-int/lit8 v6, v1, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    or-int/lit8 v5, v5, 0x30

    invoke-static {v3, v4, v13, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_f

    invoke-virtual {v13, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5, v13, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x7f08084a

    const/4 v5, 0x0

    invoke-static {v4, v13, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Ls2/e;->C()Landroidx/compose/ui/Modifier;

    move-result-object v10

    const v4, -0x1a6f7841

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v13, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg00/b;

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    iget-wide v11, v9, Lg00/b;->z:J

    const/16 v14, 0x30

    const/4 v15, 0x0

    const/4 v9, 0x0

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move v8, v1

    invoke-virtual/range {v16 .. v16}, Ls2/e;->J()Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Lg00/b;->r:J

    move-object v6, v3

    move-wide/from16 v17, v4

    move-object v5, v2

    move-wide/from16 v2, v17

    invoke-virtual/range {v16 .. v16}, Ls2/e;->K()Ll3/v0;

    move-result-object v4

    and-int/lit8 v8, v8, 0xe

    move-object v9, v6

    move v6, v8

    move-object v8, v5

    move-object v5, v13

    invoke-static/range {v0 .. v6}, Lx30/y0;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move-object v2, v8

    move-object v4, v9

    move-object/from16 v3, v16

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lg1/m3;

    const/4 v7, 0x6

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, 0x3335543

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v11, 0x2

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v4, p1

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit8 v7, v11, 0x8

    const/4 v8, 0x0

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_b

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    :cond_b
    :goto_7
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, v11, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v7, p3

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v3, v9

    goto :goto_9

    :cond_e
    move-object/from16 v7, p3

    :goto_9
    and-int/lit8 v9, v11, 0x20

    const/high16 v12, 0x30000

    if-eqz v9, :cond_10

    or-int/2addr v3, v12

    :cond_f
    move-object/from16 v12, p4

    goto :goto_b

    :cond_10
    and-int/2addr v12, v10

    if-nez v12, :cond_f

    move-object/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v3, v13

    :goto_b
    const/high16 v13, 0x180000

    and-int/2addr v13, v10

    if-nez v13, :cond_14

    and-int/lit8 v13, v11, 0x40

    if-nez v13, :cond_12

    move-object/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_13

    const/high16 v14, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v13, p5

    :cond_13
    const/high16 v14, 0x80000

    :goto_c
    or-int/2addr v3, v14

    goto :goto_d

    :cond_14
    move-object/from16 v13, p5

    :goto_d
    and-int/lit16 v14, v11, 0x80

    const/high16 v15, 0xc00000

    if-eqz v14, :cond_16

    or-int/2addr v3, v15

    :cond_15
    move/from16 v15, p6

    goto :goto_f

    :cond_16
    and-int/2addr v15, v10

    if-nez v15, :cond_15

    move/from16 v15, p6

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v16, 0x400000

    :goto_e
    or-int v3, v3, v16

    :goto_f
    const/high16 v16, 0x6000000

    and-int v16, v10, v16

    if-nez v16, :cond_1a

    and-int/lit16 v8, v11, 0x100

    if-nez v8, :cond_18

    move-object/from16 v8, p7

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v8, p7

    :cond_19
    const/high16 v16, 0x2000000

    :goto_10
    or-int v3, v3, v16

    goto :goto_11

    :cond_1a
    move-object/from16 v8, p7

    :goto_11
    const/high16 v16, 0x30000000

    and-int v16, v10, v16

    if-nez v16, :cond_1c

    move/from16 v16, v1

    move-object/from16 v1, p8

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    const/high16 v17, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v17, 0x10000000

    :goto_12
    or-int v3, v3, v17

    goto :goto_13

    :cond_1c
    move/from16 v16, v1

    move-object/from16 v1, p8

    :goto_13
    const v17, 0x12492493

    and-int v1, v3, v17

    const v2, 0x12492492

    const/16 v17, 0x1

    if-eq v1, v2, :cond_1d

    move/from16 v1, v17

    goto :goto_14

    :cond_1d
    const/4 v1, 0x0

    :goto_14
    and-int/lit8 v2, v3, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    const v2, -0xe000001

    const v18, -0x380001

    const v19, -0xe001

    if-eqz v1, :cond_23

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_16

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, v11, 0x2

    if-eqz v1, :cond_1f

    and-int/lit8 v3, v3, -0x71

    :cond_1f
    and-int/lit8 v1, v11, 0x10

    if-eqz v1, :cond_20

    and-int v3, v3, v19

    :cond_20
    and-int/lit8 v1, v11, 0x40

    if-eqz v1, :cond_21

    and-int v3, v3, v18

    :cond_21
    and-int/lit16 v1, v11, 0x100

    if-eqz v1, :cond_22

    and-int/2addr v3, v2

    :cond_22
    move-object v14, v6

    move-object/from16 v20, v7

    move-object/from16 v18, v8

    move-object/from16 v19, v12

    move-object/from16 v16, v13

    move/from16 v17, v15

    move-object/from16 v12, p0

    :goto_15
    move-object v13, v4

    goto/16 :goto_1b

    :cond_23
    :goto_16
    if-eqz v16, :cond_24

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_17

    :cond_24
    move-object/from16 v1, p0

    :goto_17
    and-int/lit8 v16, v11, 0x2

    if-eqz v16, :cond_25

    const/4 v4, 0x3

    move/from16 v16, v2

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v4}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    and-int/lit8 v3, v3, -0x71

    goto :goto_18

    :cond_25
    move/from16 v16, v2

    const/4 v2, 0x0

    :goto_18
    if-eqz v5, :cond_26

    int-to-float v2, v2

    new-instance v5, Ll0/l1;

    invoke-direct {v5, v2, v2, v2, v2}, Ll0/l1;-><init>(FFFF)V

    goto :goto_19

    :cond_26
    move-object v5, v6

    :goto_19
    and-int/lit8 v2, v11, 0x10

    if-eqz v2, :cond_27

    sget-object v2, Ll0/m;->c:Ll0/g;

    and-int v3, v3, v19

    move-object v7, v2

    :cond_27
    if-eqz v9, :cond_28

    sget-object v2, Lb2/e;->M:Lb2/k;

    move-object v12, v2

    :cond_28
    and-int/lit8 v2, v11, 0x40

    if-eqz v2, :cond_2b

    invoke-static {v0}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v2

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_29

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v9, v6, :cond_2a

    :cond_29
    new-instance v9, Lh0/b0;

    invoke-direct {v9, v2}, Lh0/b0;-><init>(Ld0/x;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v2, v9

    check-cast v2, Lh0/b0;

    and-int v3, v3, v18

    move-object v13, v2

    :cond_2b
    if-eqz v14, :cond_2c

    move/from16 v15, v17

    :cond_2c
    and-int/lit16 v2, v11, 0x100

    if-eqz v2, :cond_2d

    invoke-static {v0}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v2

    and-int v3, v3, v16

    move-object/from16 v18, v2

    move-object v14, v5

    move-object/from16 v20, v7

    :goto_1a
    move-object/from16 v19, v12

    move-object/from16 v16, v13

    move/from16 v17, v15

    move-object v12, v1

    goto :goto_15

    :cond_2d
    move-object v14, v5

    move-object/from16 v20, v7

    move-object/from16 v18, v8

    goto :goto_1a

    :goto_1b
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v1, v3, 0xe

    or-int/lit16 v1, v1, 0x6000

    and-int/lit8 v2, v3, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x1c00

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x3

    const/high16 v4, 0x70000

    and-int/2addr v4, v2

    or-int/2addr v1, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v2

    or-int/2addr v1, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v2, v4

    or-int/2addr v1, v2

    shl-int/lit8 v2, v3, 0xc

    const/high16 v4, 0x70000000

    and-int/2addr v2, v4

    or-int v25, v1, v2

    shr-int/lit8 v1, v3, 0xc

    and-int/lit8 v1, v1, 0xe

    shr-int/lit8 v2, v3, 0x12

    and-int/lit16 v2, v2, 0x1c00

    or-int v26, v1, v2

    const/16 v27, 0x1900

    const/4 v15, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, p8

    move-object/from16 v24, v0

    invoke-static/range {v12 .. v27}, Ls2/e;->b(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;ZLh0/o1;ZLf0/k;Lb2/f;Ll0/l;Lb2/g;Ll0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v12

    move-object v2, v13

    move-object v3, v14

    move-object/from16 v6, v16

    move/from16 v7, v17

    move-object/from16 v8, v18

    move-object/from16 v5, v19

    move-object/from16 v4, v20

    goto :goto_1c

    :cond_2e
    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v6

    move-object v4, v7

    move-object v5, v12

    move-object v6, v13

    move v7, v15

    :goto_1c
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_2f

    new-instance v0, Ll1/i;

    const/4 v12, 0x2

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v12}, Ll1/i;-><init>(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ljava/lang/Object;Ljava/lang/Object;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x705086e1

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v11, 0x2

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v4, p1

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p1

    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit8 v7, v11, 0x8

    const/4 v8, 0x0

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_b

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    :cond_b
    :goto_7
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, v11, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v7, p3

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v3, v9

    goto :goto_9

    :cond_e
    move-object/from16 v7, p3

    :goto_9
    and-int/lit8 v9, v11, 0x20

    const/high16 v12, 0x30000

    if-eqz v9, :cond_10

    or-int/2addr v3, v12

    :cond_f
    move-object/from16 v12, p4

    goto :goto_b

    :cond_10
    and-int/2addr v12, v10

    if-nez v12, :cond_f

    move-object/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v13, 0x10000

    :goto_a
    or-int/2addr v3, v13

    :goto_b
    const/high16 v13, 0x180000

    and-int/2addr v13, v10

    if-nez v13, :cond_14

    and-int/lit8 v13, v11, 0x40

    if-nez v13, :cond_12

    move-object/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_13

    const/high16 v14, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v13, p5

    :cond_13
    const/high16 v14, 0x80000

    :goto_c
    or-int/2addr v3, v14

    goto :goto_d

    :cond_14
    move-object/from16 v13, p5

    :goto_d
    and-int/lit16 v14, v11, 0x80

    const/high16 v15, 0xc00000

    if-eqz v14, :cond_16

    or-int/2addr v3, v15

    :cond_15
    move/from16 v15, p6

    goto :goto_f

    :cond_16
    and-int/2addr v15, v10

    if-nez v15, :cond_15

    move/from16 v15, p6

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v16, 0x400000

    :goto_e
    or-int v3, v3, v16

    :goto_f
    const/high16 v16, 0x6000000

    and-int v16, v10, v16

    if-nez v16, :cond_1a

    and-int/lit16 v8, v11, 0x100

    if-nez v8, :cond_18

    move-object/from16 v8, p7

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_18
    move-object/from16 v8, p7

    :cond_19
    const/high16 v16, 0x2000000

    :goto_10
    or-int v3, v3, v16

    goto :goto_11

    :cond_1a
    move-object/from16 v8, p7

    :goto_11
    const/high16 v16, 0x30000000

    and-int v16, v10, v16

    if-nez v16, :cond_1c

    move/from16 v16, v1

    move-object/from16 v1, p8

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    const/high16 v17, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v17, 0x10000000

    :goto_12
    or-int v3, v3, v17

    goto :goto_13

    :cond_1c
    move/from16 v16, v1

    move-object/from16 v1, p8

    :goto_13
    const v17, 0x12492493

    and-int v1, v3, v17

    const v2, 0x12492492

    const/16 v17, 0x1

    if-eq v1, v2, :cond_1d

    move/from16 v1, v17

    goto :goto_14

    :cond_1d
    const/4 v1, 0x0

    :goto_14
    and-int/lit8 v2, v3, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    const v2, -0xe000001

    const v18, -0x380001

    const v19, -0xe001

    if-eqz v1, :cond_23

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_16

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, v11, 0x2

    if-eqz v1, :cond_1f

    and-int/lit8 v3, v3, -0x71

    :cond_1f
    and-int/lit8 v1, v11, 0x10

    if-eqz v1, :cond_20

    and-int v3, v3, v19

    :cond_20
    and-int/lit8 v1, v11, 0x40

    if-eqz v1, :cond_21

    and-int v3, v3, v18

    :cond_21
    and-int/lit16 v1, v11, 0x100

    if-eqz v1, :cond_22

    and-int/2addr v3, v2

    :cond_22
    move-object v14, v6

    move-object/from16 v22, v7

    move-object/from16 v18, v8

    move-object/from16 v21, v12

    move-object/from16 v16, v13

    move/from16 v17, v15

    move-object/from16 v12, p0

    :goto_15
    move-object v13, v4

    goto/16 :goto_1b

    :cond_23
    :goto_16
    if-eqz v16, :cond_24

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_17

    :cond_24
    move-object/from16 v1, p0

    :goto_17
    and-int/lit8 v16, v11, 0x2

    if-eqz v16, :cond_25

    const/4 v4, 0x3

    move/from16 v16, v2

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v4}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    and-int/lit8 v3, v3, -0x71

    goto :goto_18

    :cond_25
    move/from16 v16, v2

    const/4 v2, 0x0

    :goto_18
    if-eqz v5, :cond_26

    int-to-float v2, v2

    new-instance v5, Ll0/l1;

    invoke-direct {v5, v2, v2, v2, v2}, Ll0/l1;-><init>(FFFF)V

    goto :goto_19

    :cond_26
    move-object v5, v6

    :goto_19
    and-int/lit8 v2, v11, 0x10

    if-eqz v2, :cond_27

    sget-object v2, Ll0/m;->a:Ll0/e;

    and-int v3, v3, v19

    move-object v7, v2

    :cond_27
    if-eqz v9, :cond_28

    sget-object v2, Lb2/e;->J:Lb2/l;

    move-object v12, v2

    :cond_28
    and-int/lit8 v2, v11, 0x40

    if-eqz v2, :cond_2b

    invoke-static {v0}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v2

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_29

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v9, v6, :cond_2a

    :cond_29
    new-instance v9, Lh0/b0;

    invoke-direct {v9, v2}, Lh0/b0;-><init>(Ld0/x;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v2, v9

    check-cast v2, Lh0/b0;

    and-int v3, v3, v18

    move-object v13, v2

    :cond_2b
    if-eqz v14, :cond_2c

    move/from16 v15, v17

    :cond_2c
    and-int/lit16 v2, v11, 0x100

    if-eqz v2, :cond_2d

    invoke-static {v0}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v2

    and-int v3, v3, v16

    move-object/from16 v18, v2

    move-object v14, v5

    move-object/from16 v22, v7

    :goto_1a
    move-object/from16 v21, v12

    move-object/from16 v16, v13

    move/from16 v17, v15

    move-object v12, v1

    goto :goto_15

    :cond_2d
    move-object v14, v5

    move-object/from16 v22, v7

    move-object/from16 v18, v8

    goto :goto_1a

    :goto_1b
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v1, v3, 0xe

    or-int/lit16 v1, v1, 0x6000

    and-int/lit8 v2, v3, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v3, 0x1c00

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x3

    const/high16 v4, 0x70000

    and-int/2addr v4, v2

    or-int/2addr v1, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v2

    or-int/2addr v1, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v2, v4

    or-int v25, v1, v2

    shr-int/lit8 v1, v3, 0xc

    and-int/lit8 v1, v1, 0x70

    shr-int/lit8 v2, v3, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x12

    and-int/lit16 v2, v2, 0x1c00

    or-int v26, v1, v2

    const/16 v27, 0x700

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v23, p8

    move-object/from16 v24, v0

    invoke-static/range {v12 .. v27}, Ls2/e;->b(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;ZLh0/o1;ZLf0/k;Lb2/f;Ll0/l;Lb2/g;Ll0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v12

    move-object v2, v13

    move-object v3, v14

    move-object/from16 v6, v16

    move/from16 v7, v17

    move-object/from16 v8, v18

    move-object/from16 v5, v21

    move-object/from16 v4, v22

    goto :goto_1c

    :cond_2e
    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v6

    move-object v4, v7

    move-object v5, v12

    move-object v6, v13

    move v7, v15

    :goto_1c
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_2f

    new-instance v0, Ll1/i;

    const/4 v12, 0x3

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v12}, Ll1/i;-><init>(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ljava/lang/Object;Ljava/lang/Object;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22

    move/from16 v9, p9

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0x66c6b0c5

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v9, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    move-object/from16 v11, p1

    if-nez v4, :cond_4

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v9, 0x180

    move-object/from16 v12, p2

    if-nez v4, :cond_6

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_3

    :cond_5
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_6
    and-int/lit8 v4, p10, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0xc00

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_4

    :cond_8
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v3, v4

    :cond_9
    :goto_5
    and-int/lit16 v4, v9, 0x6000

    if-nez v4, :cond_c

    and-int/lit8 v4, p10, 0x10

    if-nez v4, :cond_a

    move-object/from16 v4, p3

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x4000

    goto :goto_6

    :cond_a
    move-object/from16 v4, p3

    :cond_b
    const/16 v6, 0x2000

    :goto_6
    or-int/2addr v3, v6

    goto :goto_7

    :cond_c
    move-object/from16 v4, p3

    :goto_7
    and-int/lit8 v6, p10, 0x20

    const/high16 v7, 0x30000

    if-eqz v6, :cond_e

    or-int/2addr v3, v7

    :cond_d
    move-object/from16 v7, p4

    goto :goto_9

    :cond_e
    and-int/2addr v7, v9

    if-nez v7, :cond_d

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    const/high16 v8, 0x20000

    goto :goto_8

    :cond_f
    const/high16 v8, 0x10000

    :goto_8
    or-int/2addr v3, v8

    :goto_9
    const/high16 v8, 0x180000

    and-int/2addr v8, v9

    if-nez v8, :cond_12

    and-int/lit8 v8, p10, 0x40

    if-nez v8, :cond_10

    move-object/from16 v8, p5

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    const/high16 v10, 0x100000

    goto :goto_a

    :cond_10
    move-object/from16 v8, p5

    :cond_11
    const/high16 v10, 0x80000

    :goto_a
    or-int/2addr v3, v10

    goto :goto_b

    :cond_12
    move-object/from16 v8, p5

    :goto_b
    const/high16 v10, 0xc00000

    and-int/2addr v10, v9

    if-nez v10, :cond_14

    move/from16 v10, p6

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_13

    const/high16 v13, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v13, 0x400000

    :goto_c
    or-int/2addr v3, v13

    goto :goto_d

    :cond_14
    move/from16 v10, p6

    :goto_d
    const/high16 v13, 0x6000000

    and-int/2addr v13, v9

    if-nez v13, :cond_16

    move-object/from16 v13, p7

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_15

    const/high16 v14, 0x4000000

    goto :goto_e

    :cond_15
    const/high16 v14, 0x2000000

    :goto_e
    or-int/2addr v3, v14

    goto :goto_f

    :cond_16
    move-object/from16 v13, p7

    :goto_f
    const v14, 0x2492493

    and-int/2addr v14, v3

    const v15, 0x2492492

    if-eq v14, v15, :cond_17

    const/4 v5, 0x1

    :cond_17
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v0, v14, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v5, v9, 0x1

    const v14, -0x380001

    const v15, -0xe001

    if-eqz v5, :cond_1b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_10

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p10, 0x10

    if-eqz v1, :cond_19

    and-int/2addr v3, v15

    :cond_19
    and-int/lit8 v1, p10, 0x40

    if-eqz v1, :cond_1a

    and-int/2addr v3, v14

    :cond_1a
    move-object v13, v4

    move-object v14, v7

    move-object v15, v8

    goto :goto_13

    :cond_1b
    :goto_10
    if-eqz v1, :cond_1c

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_11

    :cond_1c
    move-object v1, v2

    :goto_11
    and-int/lit8 v2, p10, 0x10

    if-eqz v2, :cond_1d

    sget-object v2, Ll0/m;->a:Ll0/e;

    and-int/2addr v3, v15

    goto :goto_12

    :cond_1d
    move-object v2, v4

    :goto_12
    if-eqz v6, :cond_1e

    sget-object v4, Lb2/e;->J:Lb2/l;

    move-object v7, v4

    :cond_1e
    and-int/lit8 v4, p10, 0x40

    if-eqz v4, :cond_21

    invoke-static {v0}, Lc0/t1;->a(Landroidx/compose/runtime/Composer;)Ld0/x;

    move-result-object v4

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1f

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_20

    :cond_1f
    new-instance v6, Lh0/b0;

    invoke-direct {v6, v4}, Lh0/b0;-><init>(Ld0/x;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v4, v6

    check-cast v4, Lh0/b0;

    and-int/2addr v3, v14

    move-object v8, v4

    :cond_21
    move-object v13, v2

    move-object v14, v7

    move-object v15, v8

    move-object v2, v1

    :goto_13
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-static {v0}, Lf0/g1;->a(Landroidx/compose/runtime/Composer;)Lf0/k;

    move-result-object v17

    const v1, 0x1fffffe

    and-int/2addr v1, v3

    const/high16 v4, 0x70000000

    shl-int/lit8 v3, v3, 0x3

    and-int/2addr v3, v4

    or-int v20, v1, v3

    const/16 v21, 0x0

    move-object/from16 v18, p7

    move-object/from16 v19, v0

    move/from16 v16, v10

    move-object v10, v2

    invoke-static/range {v10 .. v21}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v10

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    goto :goto_14

    :cond_22
    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move-object v1, v2

    move-object v5, v7

    move-object v6, v8

    :goto_14
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_23

    new-instance v0, Lb30/w1;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lb30/w1;-><init>(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method public static final f(ZZZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lh20/g1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 23

    move/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v0, p8

    move-object/from16 v13, p10

    move-object/from16 v10, p11

    move/from16 v14, p14

    move/from16 v15, p15

    const-string v1, "title"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p13

    check-cast v1, Lp1/q;

    const v3, -0x8446b1c

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v14, 0x6

    if-nez v3, :cond_1

    move/from16 v3, p0

    invoke-virtual {v1, v3}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v14

    goto :goto_1

    :cond_1
    move/from16 v3, p0

    move v8, v14

    :goto_1
    and-int/lit8 v9, v14, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v1, v2}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_3
    and-int/lit16 v9, v14, 0x180

    if-nez v9, :cond_4

    or-int/lit16 v8, v8, 0x80

    :cond_4
    and-int/lit16 v9, v14, 0xc00

    if-nez v9, :cond_6

    move/from16 v9, p3

    invoke-virtual {v1, v9}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_5

    const/16 v16, 0x800

    goto :goto_3

    :cond_5
    const/16 v16, 0x400

    :goto_3
    or-int v8, v8, v16

    goto :goto_4

    :cond_6
    move/from16 v9, p3

    :goto_4
    and-int/lit16 v5, v14, 0x6000

    if-nez v5, :cond_8

    move-object/from16 v5, p4

    invoke-virtual {v1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x4000

    goto :goto_5

    :cond_7
    const/16 v16, 0x2000

    :goto_5
    or-int v8, v8, v16

    goto :goto_6

    :cond_8
    move-object/from16 v5, p4

    :goto_6
    const/high16 v16, 0x30000

    and-int v16, v14, v16

    if-nez v16, :cond_a

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_9

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_9
    const/high16 v16, 0x10000

    :goto_7
    or-int v8, v8, v16

    :cond_a
    const/high16 v16, 0x180000

    and-int v16, v14, v16

    if-nez v16, :cond_c

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    const/high16 v16, 0x100000

    goto :goto_8

    :cond_b
    const/high16 v16, 0x80000

    :goto_8
    or-int v8, v8, v16

    :cond_c
    const/high16 v16, 0xc00000

    and-int v17, v14, v16

    move-object/from16 v11, p7

    if-nez v17, :cond_e

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    const/high16 v18, 0x800000

    goto :goto_9

    :cond_d
    const/high16 v18, 0x400000

    :goto_9
    or-int v8, v8, v18

    :cond_e
    const/high16 v18, 0x6000000

    and-int v18, v14, v18

    if-nez v18, :cond_10

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_f

    const/high16 v18, 0x4000000

    goto :goto_a

    :cond_f
    const/high16 v18, 0x2000000

    :goto_a
    or-int v8, v8, v18

    :cond_10
    move/from16 v4, p16

    and-int/lit16 v12, v4, 0x200

    const/high16 v20, 0x30000000

    if-eqz v12, :cond_11

    or-int v8, v8, v20

    move-object/from16 v3, p9

    goto :goto_c

    :cond_11
    and-int v20, v14, v20

    move-object/from16 v3, p9

    if-nez v20, :cond_13

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_12

    const/high16 v20, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v20, 0x10000000

    :goto_b
    or-int v8, v8, v20

    :cond_13
    :goto_c
    and-int/lit8 v20, v15, 0x6

    if-nez v20, :cond_15

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_14

    const/16 v20, 0x4

    goto :goto_d

    :cond_14
    const/16 v20, 0x2

    :goto_d
    or-int v20, v15, v20

    goto :goto_e

    :cond_15
    move/from16 v20, v15

    :goto_e
    and-int/lit8 v21, v15, 0x30

    if-nez v21, :cond_18

    and-int/lit8 v21, v15, 0x40

    if-nez v21, :cond_16

    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    goto :goto_f

    :cond_16
    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    :goto_f
    if-eqz v21, :cond_17

    const/16 v17, 0x20

    goto :goto_10

    :cond_17
    const/16 v17, 0x10

    :goto_10
    or-int v20, v20, v17

    :cond_18
    and-int/lit16 v3, v15, 0x180

    if-nez v3, :cond_1a

    move-object/from16 v3, p12

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/16 v17, 0x100

    goto :goto_11

    :cond_19
    const/16 v17, 0x80

    :goto_11
    or-int v20, v20, v17

    :goto_12
    move/from16 v14, v20

    goto :goto_13

    :cond_1a
    move-object/from16 v3, p12

    goto :goto_12

    :goto_13
    const v17, 0x12492493

    and-int v3, v8, v17

    const v4, 0x12492492

    if-ne v3, v4, :cond_1c

    and-int/lit16 v3, v14, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_1c

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-virtual {v1}, Lp1/q;->X()V

    move/from16 v3, p2

    move-object/from16 v10, p9

    move-object v8, v1

    goto/16 :goto_1c

    :cond_1c
    :goto_14
    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v3, p14, 0x1

    if-eqz v3, :cond_1e

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_15

    :cond_1d
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit16 v3, v8, -0x381

    move-object/from16 v9, p9

    move/from16 v17, v3

    move/from16 v3, p2

    goto :goto_17

    :cond_1e
    :goto_15
    and-int/lit16 v3, v8, -0x381

    if-eqz v12, :cond_1f

    const/4 v4, 0x0

    goto :goto_16

    :cond_1f
    move-object/from16 v4, p9

    :goto_16
    move/from16 v17, v3

    move-object v9, v4

    move/from16 v3, p0

    :goto_17
    invoke-virtual {v1}, Lp1/q;->r()V

    if-eqz v7, :cond_20

    const/16 v4, 0x8

    :goto_18
    int-to-float v4, v4

    goto :goto_19

    :cond_20
    const/16 v4, 0xc

    goto :goto_18

    :goto_19
    iget-object v8, v10, Lh20/g1;->w:Lh20/f1;

    invoke-static {v8}, Lkotlin/jvm/internal/j;->H(Lh20/f1;)F

    move-result v8

    iget-object v12, v10, Lh20/g1;->w:Lh20/f1;

    invoke-static {v12}, Lkotlin/jvm/internal/j;->K(Lh20/f1;)F

    move-result v19

    add-float v19, v19, v4

    move/from16 p2, v4

    iget-object v4, v10, Lh20/g1;->x:Lh20/j2;

    const/4 v5, 0x0

    if-eqz v4, :cond_21

    iget v6, v4, Lh20/j2;->x:F

    goto :goto_1a

    :cond_21
    int-to-float v6, v5

    :goto_1a
    add-float v6, v19, v6

    invoke-static {v12}, Lkotlin/jvm/internal/j;->H(Lh20/f1;)F

    move-result v5

    invoke-static {v12}, Lkotlin/jvm/internal/j;->K(Lh20/f1;)F

    move-result v12

    add-float v12, v12, p2

    if-eqz v4, :cond_22

    iget v4, v4, Lh20/j2;->z:F

    goto :goto_1b

    :cond_22
    const/4 v4, 0x0

    int-to-float v4, v4

    :goto_1b
    add-float/2addr v12, v4

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v8, v6, v5, v12}, Ll0/l1;-><init>(FFFF)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x34

    int-to-float v6, v6

    const/4 v8, 0x0

    const/4 v12, 0x2

    invoke-static {v5, v6, v8, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v2, v3, v0}, Landroidx/compose/foundation/selection/b;->b(Landroidx/compose/ui/Modifier;ZZLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    move v5, v3

    new-instance v3, Ld30/m0;

    move-object/from16 v6, p4

    move-object/from16 v12, p12

    move-object/from16 v20, v4

    move/from16 v19, v5

    move-object v8, v7

    move/from16 v4, p0

    move/from16 v5, p3

    move-object/from16 v7, p5

    invoke-direct/range {v3 .. v12}, Ld30/m0;-><init>(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V

    move-object v10, v9

    const v4, 0x246f328e

    invoke-static {v4, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    shr-int/lit8 v3, v14, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int v3, v3, v16

    shl-int/lit8 v4, v17, 0x3

    and-int/lit8 v5, v4, 0x70

    or-int/2addr v3, v5

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v3, v4

    shl-int/lit8 v4, v14, 0x9

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    const/high16 v4, 0x380000

    shr-int/lit8 v5, v17, 0x6

    and-int/2addr v4, v5

    or-int v9, v3, v4

    move-object/from16 v5, p12

    move-object v6, v0

    move-object v8, v1

    move-object/from16 v4, v18

    move-object/from16 v3, v20

    move/from16 v1, p0

    move-object/from16 v0, p11

    invoke-static/range {v0 .. v9}, Lkotlin/jvm/internal/j;->m(Lh20/g1;ZZLl0/l1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move/from16 v3, v19

    :goto_1c
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_23

    move-object v1, v0

    new-instance v0, Ld30/g0;

    move/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move/from16 v14, p14

    move/from16 v16, p16

    move-object/from16 v22, v1

    move-object v11, v13

    move/from16 v1, p0

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v16}, Ld30/g0;-><init>(ZZZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lh20/g1;Lkotlin/jvm/functions/Function3;III)V

    move-object/from16 v1, v22

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method public static final g(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p1, Lp1/q;

    const v0, -0x6401ddc9

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x3

    if-eq v2, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lf1/z;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lf1/z;-><init>(Lx1/b;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final h(Lzy/b;JZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v1, p4

    move-object/from16 v6, p5

    const-string v0, "onRemove"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    const v0, -0x5b1347b4

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v7, p0

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    move-wide/from16 v2, p1

    invoke-virtual {v8, v2, v3}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    move/from16 v4, p3

    invoke-virtual {v8, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x800

    goto :goto_3

    :cond_3
    const/16 v5, 0x400

    :goto_3
    or-int/2addr v0, v5

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x4000

    goto :goto_4

    :cond_4
    const/16 v5, 0x2000

    :goto_4
    or-int/2addr v0, v5

    const v5, 0x12493

    and-int/2addr v0, v5

    const v5, 0x12492

    if-ne v0, v5, :cond_6

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_6
    :goto_5
    invoke-static {v8}, Le4/a;->C(Landroidx/compose/runtime/Composer;)Lb30/h4;

    move-result-object v2

    sget-object v0, Lg1/j1;->a:Lp1/b0;

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    const v5, 0x29d2b1d6

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v11, v5, Li2/x;->a:J

    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->i()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v11, v12}, Li2/w0;->x(J)F

    goto :goto_6

    :cond_7
    invoke-static {v11, v12}, Li2/w0;->x(J)F

    :goto_6
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const v5, 0x3ec28f5c    # 0.38f

    goto :goto_9

    :cond_8
    const v5, 0x29d2b532

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v11, v5, Li2/x;->a:J

    sget-object v5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/c1;

    invoke-virtual {v5}, Lg1/c1;->i()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v5

    float-to-double v11, v5

    cmpl-double v5, v11, v9

    if-lez v5, :cond_a

    goto :goto_7

    :cond_9
    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v5

    float-to-double v11, v5

    cmpg-double v5, v11, v9

    if-gez v5, :cond_a

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_a
    const v5, 0x3f5eb852    # 0.87f

    :goto_8
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_9
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v0, v5}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    sget-object v5, Lg1/z4;->a:Lp1/b0;

    const v11, 0x6671387f

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    new-instance v11, Lg1/y4;

    sget-object v12, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg1/c1;

    invoke-virtual {v13}, Lg1/c1;->c()J

    move-result-wide v13

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg1/c1;

    invoke-virtual {v15}, Lg1/c1;->i()Z

    move-result v15

    move-wide/from16 v16, v9

    invoke-static {v13, v14}, Li2/w0;->x(J)F

    move-result v9

    if-nez v15, :cond_b

    float-to-double v9, v9

    cmpg-double v9, v9, v16

    if-gez v9, :cond_b

    sget-wide v13, Li2/x;->f:J

    :cond_b
    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/c1;

    invoke-virtual {v9}, Lg1/c1;->c()J

    move-result-wide v9

    const/high16 v15, 0x3e800000    # 0.25f

    invoke-static {v15, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/c1;

    invoke-virtual {v12}, Lg1/c1;->i()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-static {v9, v10}, Li2/w0;->x(J)F

    move-result v9

    float-to-double v9, v9

    cmpl-double v9, v9, v16

    if-lez v9, :cond_c

    sget-object v9, Lg1/z4;->d:Lk1/b;

    goto :goto_a

    :cond_c
    sget-object v9, Lg1/z4;->e:Lk1/b;

    goto :goto_a

    :cond_d
    sget-object v9, Lg1/z4;->f:Lk1/b;

    :goto_a
    invoke-direct {v11, v13, v14, v9}, Lg1/y4;-><init>(JLk1/b;)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v11}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    filled-new-array {v0, v3}, [Lp1/u1;

    move-result-object v9

    new-instance v0, Lb30/p4;

    move v5, v4

    move-wide/from16 v3, p1

    invoke-direct/range {v0 .. v7}, Lb30/p4;-><init>(ZLb30/h4;JZLc93/a;Lzy/b;)V

    const v1, -0x36e3d2f4

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v9, v0, v8, v1}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lb30/n4;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb30/n4;-><init>(Lzy/b;JZZLc93/a;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final i(ZLl0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lh20/z0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v5, p6

    check-cast v5, Lp1/q;

    const p6, -0x691203f

    invoke-virtual {v5, p6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p6, p7, 0x6

    if-nez p6, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->h(Z)Z

    move-result p6

    if-eqz p6, :cond_0

    const/4 p6, 0x4

    goto :goto_0

    :cond_0
    const/4 p6, 0x2

    :goto_0
    or-int/2addr p6, p7

    goto :goto_1

    :cond_1
    move p6, p7

    :goto_1
    and-int/lit8 v0, p7, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p6, v0

    :cond_3
    and-int/lit16 v0, p7, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p6, v0

    :cond_5
    and-int/lit16 v0, p7, 0xc00

    if-nez v0, :cond_7

    invoke-virtual {v5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x800

    goto :goto_4

    :cond_6
    const/16 v0, 0x400

    :goto_4
    or-int/2addr p6, v0

    :cond_7
    and-int/lit16 v0, p7, 0x6000

    if-nez v0, :cond_a

    const v0, 0x8000

    and-int/2addr v0, p7

    if-nez v0, :cond_8

    invoke-virtual {v5, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_5

    :cond_8
    invoke-virtual {v5, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_9

    const/16 v0, 0x4000

    goto :goto_6

    :cond_9
    const/16 v0, 0x2000

    :goto_6
    or-int/2addr p6, v0

    :cond_a
    const/high16 v0, 0x30000

    and-int/2addr v0, p7

    if-nez v0, :cond_c

    invoke-virtual {v5, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/high16 v0, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v0, 0x10000

    :goto_7
    or-int/2addr p6, v0

    :cond_c
    const v0, 0x12493

    and-int/2addr v0, p6

    const v1, 0x12492

    if-ne v0, v1, :cond_e

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, p3

    move-object p6, p5

    move-object p3, p2

    move-object p2, p1

    goto :goto_9

    :cond_e
    :goto_8
    new-instance v0, Ld30/n0;

    invoke-direct {v0, p0, p4}, Ld30/n0;-><init>(ZLh20/z0;)V

    const v1, -0x767217d7

    invoke-static {v1, v5, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shr-int/lit8 p6, p6, 0x3

    and-int/lit8 v0, p6, 0xe

    or-int/lit16 v0, v0, 0xc00

    and-int/lit8 v1, p6, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, p6, 0x380

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr p6, v1

    or-int v6, v0, p6

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v4, p5

    invoke-static/range {v0 .. v6}, Lkotlin/jvm/internal/j;->o(Ll0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object p2, v0

    move-object p3, v1

    move-object p6, v4

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    move p1, p0

    new-instance p0, Ld30/l0;

    move-object p5, p4

    move-object p4, v2

    invoke-direct/range {p0 .. p7}, Ld30/l0;-><init>(ZLl0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lh20/z0;Lx1/b;I)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final j(Ll0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lh20/b1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move-object/from16 v4, p3

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x5b576f97

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v1, v6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v12, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v6, 0x180

    move-object/from16 v9, p2

    if-nez v1, :cond_5

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v6, 0xc00

    if-nez v1, :cond_8

    and-int/lit16 v1, v6, 0x1000

    if-nez v1, :cond_6

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_7

    const/16 v1, 0x800

    goto :goto_5

    :cond_7
    const/16 v1, 0x400

    :goto_5
    or-int/2addr v0, v1

    :cond_8
    and-int/lit16 v1, v6, 0x6000

    move-object/from16 v11, p4

    if-nez v1, :cond_a

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0x4000

    goto :goto_6

    :cond_9
    const/16 v1, 0x2000

    :goto_6
    or-int/2addr v0, v1

    :cond_a
    and-int/lit16 v1, v0, 0x2493

    const/16 v2, 0x2492

    if-ne v1, v2, :cond_c

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    goto :goto_8

    :cond_c
    :goto_7
    new-instance v1, Lb30/o4;

    const/4 v2, 0x1

    invoke-direct {v1, v4, v2}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v2, 0x593006d1

    invoke-static {v2, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    and-int/lit8 v1, v0, 0xe

    or-int/lit16 v1, v1, 0xc00

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int v13, v1, v0

    move-object v7, p0

    move-object v8, p1

    invoke-static/range {v7 .. v13}, Lkotlin/jvm/internal/j;->o(Ll0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_d

    new-instance v0, Laq1/c;

    const/4 v7, 0x6

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final k(ZZLl0/l1;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v14, p5

    check-cast v14, Lp1/q;

    const v0, -0x6f837c4c

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v0, v7

    :cond_9
    and-int/lit16 v7, v0, 0x2493

    const/16 v8, 0x2492

    if-ne v7, v8, :cond_b

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v14}, Lp1/q;->X()V

    goto :goto_a

    :cond_b
    :goto_6
    invoke-static {v14}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v7

    iget-object v7, v7, Lg1/l5;->b:Lt0/i;

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v1, :cond_c

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_c
    const v8, 0x3f19999a    # 0.6f

    :goto_7
    invoke-static {v8, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v7, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v14}, Lg1/l3;->b(Landroidx/compose/runtime/Composer;)Lg1/l5;

    move-result-object v8

    iget-object v8, v8, Lg1/l5;->b:Lt0/i;

    invoke-static {v14}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v9

    iget-wide v9, v9, Ld40/n;->a:J

    and-int/lit8 v0, v0, 0x70

    invoke-static {v2, v14, v0}, Ld40/r;->d(ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v11

    if-eqz v2, :cond_d

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v12

    :goto_8
    move v12, v0

    goto :goto_9

    :cond_d
    const/4 v0, 0x0

    int-to-float v0, v0

    goto :goto_8

    :goto_9
    new-instance v0, Lb30/w2;

    const/4 v13, 0x5

    invoke-direct {v0, v13, v3, v5}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v13, -0x782305e9

    invoke-static {v13, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0x180000

    const/16 v16, 0x8

    invoke-static/range {v7 .. v16}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_a
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Ld30/k0;

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Ld30/k0;-><init>(ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final l(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move-object/from16 v0, p7

    iget-object v1, v7, Lh20/g1;->x:Lh20/j2;

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    const v4, 0x5aed8e85

    invoke-virtual {v9, v4}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v6, p0

    invoke-virtual {v9, v6}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p9, v4

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v4, v5

    move-object/from16 v5, p3

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x800

    goto :goto_3

    :cond_3
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v4, v8

    move-object/from16 v8, p4

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x4000

    goto :goto_4

    :cond_4
    const/16 v10, 0x2000

    :goto_4
    or-int/2addr v4, v10

    move-object/from16 v10, p5

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    const/high16 v12, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v12, 0x10000

    :goto_5
    or-int/2addr v4, v12

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/high16 v12, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v12, 0x80000

    :goto_6
    or-int/2addr v4, v12

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/high16 v12, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v12, 0x400000

    :goto_7
    or-int/2addr v4, v12

    const v12, 0x492493

    and-int/2addr v12, v4

    const v13, 0x492492

    if-ne v12, v13, :cond_9

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v12

    if-nez v12, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_9
    :goto_8
    sget-object v12, Lb2/e;->K:Lb2/l;

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v13, v12, v9, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-eqz v0, :cond_a

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v9, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v13, v9, v13, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz v1, :cond_d

    iget v11, v1, Lh20/j2;->w:F

    goto :goto_a

    :cond_d
    int-to-float v11, v0

    :goto_a
    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v11, v4, 0x3

    and-int/lit8 v11, v11, 0x70

    const/4 v13, 0x6

    or-int/2addr v11, v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    sget-object v14, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v3, v14, v9, v11}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v11, 0xc

    if-eqz v1, :cond_e

    iget v1, v1, Lh20/j2;->y:F

    goto :goto_b

    :cond_e
    int-to-float v1, v11

    :goto_b
    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v1, v4, 0x9

    and-int/lit8 v1, v1, 0x7e

    shl-int/lit8 v14, v4, 0x6

    and-int/lit16 v14, v14, 0x380

    or-int/2addr v1, v14

    shr-int/2addr v4, v13

    and-int/lit16 v14, v4, 0x1c00

    or-int/2addr v1, v14

    const v14, 0xe000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    move-object v4, v5

    move-object v5, v8

    move-object v8, v7

    move-object v7, v10

    move v10, v1

    invoke-static/range {v4 .. v10}, Lkotlin/jvm/internal/j;->q(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lh20/g1;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x15560e6a

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_f

    int-to-float v1, v11

    const/4 v4, 0x4

    int-to-float v4, v4

    int-to-float v5, v13

    invoke-static {v12, v1, v4, v5, v4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v9, v13}, Lup/d;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_f
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_10

    new-instance v0, Ld30/i0;

    move/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ld30/i0;-><init>(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method public static final m(Lh20/g1;ZZLl0/l1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object/from16 v15, p8

    check-cast v15, Lp1/q;

    const v0, 0x75eb3e18

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v9, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v9

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v2, v9, 0x30

    move/from16 v10, p1

    if-nez v2, :cond_4

    invoke-virtual {v15, v10}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_4
    and-int/lit16 v2, v9, 0x180

    move/from16 v11, p2

    if-nez v2, :cond_6

    invoke-virtual {v15, v11}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v0, v2

    :cond_6
    and-int/lit16 v2, v9, 0xc00

    move-object/from16 v12, p3

    if-nez v2, :cond_8

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x800

    goto :goto_5

    :cond_7
    const/16 v2, 0x400

    :goto_5
    or-int/2addr v0, v2

    :cond_8
    and-int/lit16 v2, v9, 0x6000

    move-object/from16 v13, p4

    if-nez v2, :cond_a

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0x4000

    goto :goto_6

    :cond_9
    const/16 v2, 0x2000

    :goto_6
    or-int/2addr v0, v2

    :cond_a
    const/high16 v2, 0x30000

    and-int v3, v9, v2

    move-object/from16 v6, p5

    if-nez v3, :cond_c

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const/high16 v3, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v3, 0x10000

    :goto_7
    or-int/2addr v0, v3

    :cond_c
    const/high16 v3, 0x180000

    and-int v4, v9, v3

    move-object/from16 v7, p6

    if-nez v4, :cond_e

    invoke-virtual {v15, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/high16 v4, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v4, 0x80000

    :goto_8
    or-int/2addr v0, v4

    :cond_e
    const/high16 v4, 0xc00000

    and-int/2addr v4, v9

    if-nez v4, :cond_10

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/high16 v4, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v4, 0x400000

    :goto_9
    or-int/2addr v0, v4

    :cond_10
    const v4, 0x492493

    and-int/2addr v4, v0

    const v5, 0x492492

    if-ne v4, v5, :cond_12

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_12
    :goto_a
    iget-object v4, v1, Lh20/g1;->w:Lh20/f1;

    instance-of v5, v4, Lh20/e1;

    const/4 v14, 0x0

    if-eqz v5, :cond_13

    const v2, -0x76fcd85c

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    new-instance v2, Lb30/k2;

    const/4 v3, 0x3

    invoke-direct {v2, v8, v3}, Lb30/k2;-><init>(Lx1/b;I)V

    const v3, -0x745e52f1

    invoke-static {v3, v15, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v3, v0, 0xe

    or-int/lit16 v3, v3, 0x6000

    and-int/lit8 v4, v0, 0x70

    or-int/2addr v3, v4

    and-int/lit16 v4, v0, 0x380

    or-int/2addr v3, v4

    and-int/lit16 v0, v0, 0x1c00

    or-int v16, v3, v0

    move v5, v14

    move-object v14, v2

    invoke-static/range {v10 .. v16}, Lkotlin/jvm/internal/j;->k(ZZLl0/l1;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_13
    move v5, v14

    instance-of v10, v4, Lh20/z0;

    if-eqz v10, :cond_14

    const v3, -0x76f7b7d3

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    move-object v14, v4

    check-cast v14, Lh20/z0;

    new-instance v3, Lb30/k2;

    const/4 v4, 0x4

    invoke-direct {v3, v8, v4}, Lb30/k2;-><init>(Lx1/b;I)V

    const v4, 0x58b5c4ae

    invoke-static {v4, v15, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shr-int/lit8 v4, v0, 0x6

    and-int/lit8 v10, v4, 0xe

    or-int/2addr v2, v10

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v2, v4

    shr-int/lit8 v4, v0, 0x9

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v2, v4

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int v17, v2, v0

    move/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p4

    move-object v12, v6

    move-object/from16 v16, v15

    move-object v15, v3

    invoke-static/range {v10 .. v17}, Lkotlin/jvm/internal/j;->i(ZLl0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lh20/z0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v15, v16

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :cond_14
    instance-of v2, v4, Lh20/b1;

    if-eqz v2, :cond_15

    const v2, -0x76f1c9cb

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    move-object v13, v4

    check-cast v13, Lh20/b1;

    new-instance v2, Lb30/k2;

    const/4 v3, 0x5

    invoke-direct {v2, v8, v3}, Lb30/k2;-><init>(Lx1/b;I)V

    const v3, 0x25d02cc0

    invoke-static {v3, v15, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    shr-int/lit8 v2, v0, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6000

    shr-int/lit8 v3, v0, 0xc

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int v16, v2, v0

    move-object/from16 v10, p3

    move-object/from16 v12, p4

    move-object/from16 v11, p5

    invoke-static/range {v10 .. v16}, Lkotlin/jvm/internal/j;->j(Ll0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lh20/b1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    instance-of v2, v4, Lh20/d1;

    if-eqz v2, :cond_17

    const v2, -0x76ec7e45

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v4, Lh20/d1;

    new-instance v2, Lb30/k2;

    const/4 v6, 0x6

    invoke-direct {v2, v8, v6}, Lb30/k2;-><init>(Lx1/b;I)V

    const v6, -0x42d79f57

    invoke-static {v6, v15, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v6, v2, 0xe

    or-int/2addr v3, v6

    and-int/lit8 v6, v2, 0x70

    or-int/2addr v3, v6

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v2, v3

    shr-int/lit8 v3, v0, 0x9

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int v18, v2, v0

    move/from16 v10, p1

    move/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v14, p4

    move-object v13, v7

    move-object/from16 v17, v15

    move-object v15, v4

    invoke-static/range {v10 .. v18}, Lkotlin/jvm/internal/j;->n(ZZLl0/l1;Lc93/a;Landroidx/compose/ui/Modifier;Lh20/d1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v15, v17

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_16

    new-instance v0, Ld30/h0;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Ld30/h0;-><init>(Lh20/g1;ZZLl0/l1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lc93/a;Lx1/b;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void

    :cond_17
    const v0, 0x780858e3

    invoke-static {v0, v15, v5}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0
.end method

.method public static final n(ZZLl0/l1;Lc93/a;Landroidx/compose/ui/Modifier;Lh20/d1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, 0x1d3eb669

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    move/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_3

    move/from16 v2, p1

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v8, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v0, v9

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_7

    :cond_8
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v0, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v8

    if-nez v9, :cond_c

    const/high16 v9, 0x40000

    and-int/2addr v9, v8

    if-nez v9, :cond_a

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_8

    :cond_a
    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_8
    if-eqz v9, :cond_b

    const/high16 v9, 0x20000

    goto :goto_9

    :cond_b
    const/high16 v9, 0x10000

    :goto_9
    or-int/2addr v0, v9

    :cond_c
    const/high16 v9, 0x180000

    and-int/2addr v9, v8

    if-nez v9, :cond_e

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/high16 v9, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v9, 0x80000

    :goto_a
    or-int/2addr v0, v9

    :cond_e
    const v9, 0x92493

    and-int/2addr v9, v0

    const v10, 0x92492

    if-ne v9, v10, :cond_10

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v15, v14

    goto/16 :goto_f

    :cond_10
    :goto_b
    invoke-static {v14}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v9

    if-eqz v9, :cond_11

    iget-object v9, v6, Lh20/d1;->I:Lh20/c1;

    goto :goto_c

    :cond_11
    iget-object v9, v6, Lh20/d1;->H:Lh20/c1;

    :goto_c
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x0

    invoke-static {v11, v12, v14, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 p7, v0

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-eqz v0, :cond_12

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_d
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v14, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v14, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_13
    invoke-static {v12, v14, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lb2/e;->K:Lb2/l;

    new-instance v10, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v10, v2}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    const/16 v12, 0x14

    int-to-float v12, v12

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    iget v10, v9, Lh20/c1;->x:I

    invoke-static {v10}, Li2/w0;->c(I)J

    move-result-wide v16

    iget v9, v9, Lh20/c1;->y:I

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v9

    move-wide/from16 v22, v16

    move-object/from16 v17, v11

    move-wide v11, v9

    move-wide/from16 v9, v22

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x4

    move-object/from16 v21, v13

    move-object/from16 v20, v15

    move-object v15, v14

    const-wide/16 v13, 0x0

    move-object/from16 v4, v19

    move-object/from16 v3, v20

    move-object/from16 v5, v21

    invoke-static/range {v9 .. v17}, Ls2/e;->p(JJJLandroidx/compose/runtime/Composer;II)Lg1/v1;

    move-result-object v13

    shr-int/lit8 v9, p7, 0x3

    and-int/lit8 v9, v9, 0xe

    shr-int/lit8 v10, p7, 0x6

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v9, v10

    shl-int/lit8 v10, p7, 0x9

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v9, v10

    const/16 v16, 0x10

    move/from16 v12, p0

    move-object/from16 v10, p3

    move-object v14, v15

    move-object/from16 v11, v18

    move v15, v9

    move/from16 v9, p1

    invoke-static/range {v9 .. v16}, Lg1/w4;->a(ZLc93/a;Landroidx/compose/ui/Modifier;ZLg1/v1;Landroidx/compose/runtime/Composer;II)V

    move-object v15, v14

    const/16 v9, 0xc

    int-to-float v9, v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v15, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v9, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v9, v2}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v2, v10, v15, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_15

    invoke-virtual {v15, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v15, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    invoke-static {v10, v15, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v15, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, p7, 0xf

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll0/z;->a:Ll0/z;

    invoke-virtual {v7, v1, v15, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Ld30/j0;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v8}, Ld30/j0;-><init>(ZZLl0/l1;Lc93/a;Landroidx/compose/ui/Modifier;Lh20/d1;Lx1/b;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final o(Ll0/l1;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v7, 0x163e0148

    invoke-virtual {v0, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v7, v8

    :cond_9
    and-int/lit16 v8, v7, 0x2493

    const/16 v9, 0x2492

    if-ne v8, v9, :cond_b

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_b
    :goto_6
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v9, v0, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v11, v0, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Ll0/m;->e:Ll0/h;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v8, v11, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move v11, v7

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    move/from16 p5, v15

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v16, v11

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_f

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v0, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v6, v0, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v0, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v3, v16, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int v3, p5, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v6, Ll0/z;->a:Ll0/z;

    invoke-virtual {v5, v6, v0, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x0

    invoke-static {v10, v3, v0, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_12

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_12
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v0, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v7, v0, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v0, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x7506aaa0

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/t1;->a:Ll0/t1;

    if-eqz v2, :cond_15

    sget v3, Ld30/f1;->b:F

    const/16 v7, 0xc

    int-to-float v7, v7

    add-float/2addr v3, v7

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v0, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    and-int/lit8 v3, v16, 0x70

    or-int v3, p5, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v0, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    const/4 v3, 0x1

    invoke-static {v0, v6, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {v1, v15, v3, v6}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v6, v16, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int v6, p5, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v1, v0, v6}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Laq1/c;

    const/4 v7, 0x5

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final p(ZLg40/w2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const-string v0, "element"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x19be66ab

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v1, v6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v6, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v6, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v5, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v5, v6, 0x6000

    if-nez v5, :cond_8

    move-object/from16 v5, p4

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x4000

    goto :goto_5

    :cond_a
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v0, v7

    :goto_6
    and-int/lit16 v7, v0, 0x2493

    const/16 v8, 0x2492

    if-ne v7, v8, :cond_c

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    goto :goto_9

    :cond_c
    :goto_7
    if-eqz v1, :cond_d

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v9, v1

    goto :goto_8

    :cond_d
    move-object v9, v5

    :goto_8
    iget-object v1, v2, Lg40/w2;->a:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, v2, Lg40/w2;->c:La33/d;

    iget-object v5, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v5, Ln53/e;

    const/4 v7, 0x0

    invoke-static {v5, v12, v7}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    iget-object v1, v1, La33/d;->x:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lzy/c;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lg40/h1;

    new-instance v1, Lg1/f4;

    invoke-direct {v1, v2, v3, p0, v4}, Lg1/f4;-><init>(Lg40/w2;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/IdentifierSpec;)V

    const v5, 0x74ae03a4

    invoke-static {v5, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit16 v13, v0, 0x6000

    const/16 v14, 0x8

    const/4 v10, 0x0

    invoke-static/range {v7 .. v14}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    :cond_e
    move-object v5, v9

    :goto_9
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_f

    new-instance v0, Lbf0/g;

    const/16 v8, 0xb

    move v1, p0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final q(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lh20/g1;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p6

    iget-object v5, v3, Lh20/g1;->w:Lh20/f1;

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v7, 0x5084aaea

    invoke-virtual {v6, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_1

    move-object/from16 v7, p0

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_1
    move-object/from16 v7, p0

    move v8, v4

    :goto_1
    and-int/lit8 v9, v4, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_3
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v6, v1}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v8, v9

    :cond_5
    and-int/lit16 v9, v4, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v8, v9

    :cond_7
    and-int/lit16 v9, v4, 0x6000

    if-nez v9, :cond_a

    const v9, 0x8000

    and-int/2addr v9, v4

    if-nez v9, :cond_8

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_5

    :cond_8
    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_5
    if-eqz v9, :cond_9

    const/16 v9, 0x4000

    goto :goto_6

    :cond_9
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v8, v9

    :cond_a
    and-int/lit16 v9, v8, 0x2493

    const/16 v11, 0x2492

    if-ne v9, v11, :cond_c

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_11

    :cond_c
    :goto_7
    const v9, 0x5d0a8d3c

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    instance-of v9, v5, Lh20/e1;

    const/4 v11, 0x0

    if-eqz v9, :cond_d

    const v9, -0x56169054

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    invoke-static {v6}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v9

    iget-wide v12, v9, Ld40/n;->d:J

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v9, -0x56168ab6

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v6, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/c1;

    invoke-virtual {v9}, Lg1/c1;->e()J

    move-result-wide v12

    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v6, v11}, Lp1/q;->q(Z)V

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v14, v6, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-eqz v1, :cond_e

    invoke-virtual {v6, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_9
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v6, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v6, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v14, v6, v14, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v0, v3, Lh20/g1;->y:Lh20/k3;

    if-eqz v0, :cond_11

    invoke-static {v0}, Luf/c0;->o0(Lh20/k3;)Ll3/v0;

    move-result-object v0

    goto :goto_a

    :cond_11
    const/4 v0, 0x0

    :goto_a
    const v9, 0x6417354d

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    if-nez v0, :cond_12

    sget-object v0, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v6, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/h9;

    iget-object v0, v0, Lg1/h9;->i:Ll3/v0;

    sget-object v22, Lp3/r;->G:Lp3/r;

    const/16 v30, 0x0

    const v31, 0xfffffb

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    :cond_12
    move-object/from16 v26, v0

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v0, 0x3f19999a    # 0.6f

    if-eqz p2, :cond_13

    goto :goto_b

    :cond_13
    invoke-static {v0, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    :goto_b
    const v9, 0x64175d67

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    and-int/lit16 v9, v8, 0x1c00

    const/4 v11, 0x1

    const/16 v14, 0x800

    if-ne v9, v14, :cond_14

    move v9, v11

    goto :goto_c

    :cond_14
    const/4 v9, 0x0

    :goto_c
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v9, :cond_15

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v14, v9, :cond_16

    :cond_15
    new-instance v14, Lb30/y4;

    const/16 v9, 0xc

    invoke-direct {v14, v2, v9}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v6, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    invoke-static {v10, v9, v14}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v28, v8, 0xe

    const/16 v29, 0xc30

    const v30, 0xd7f8

    move-object v7, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move/from16 v16, v9

    move-wide/from16 v33, v12

    move v13, v8

    move-wide/from16 v8, v33

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x2

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x1

    move/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v1, v27

    move-object/from16 v27, v6

    move-object/from16 v6, p0

    invoke-static/range {v6 .. v30}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v27

    const v7, 0x64177382

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_1b

    const v7, -0x412114ca

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    instance-of v5, v5, Lh20/e1;

    if-eqz v5, :cond_17

    const v5, -0x345b9816    # -2.1549012E7f

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-static {v6}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v5

    iget-wide v7, v5, Ld40/n;->g:J

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_17
    const v5, -0x345b913d    # -2.1552518E7f

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-static {v6}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v5

    iget-wide v7, v5, Ld40/n;->e:J

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    iget-object v5, v3, Lh20/g1;->z:Lh20/k3;

    if-eqz v5, :cond_18

    invoke-static {v5}, Luf/c0;->o0(Lh20/k3;)Ll3/v0;

    move-result-object v5

    goto :goto_e

    :cond_18
    const/4 v5, 0x0

    :goto_e
    const v9, 0x64178836

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    if-nez v5, :cond_19

    invoke-static {v6}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v5

    iget-object v9, v5, Lg1/h9;->l:Ll3/v0;

    sget-object v14, Lp3/r;->F:Lp3/r;

    const/16 v22, 0x0

    const v23, 0xfffffb

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v5

    :cond_19
    move-object/from16 v20, v5

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    if-eqz p2, :cond_1a

    goto :goto_f

    :cond_1a
    invoke-static {v0, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    :goto_f
    shr-int/lit8 v0, v31, 0x3

    and-int/lit8 v22, v0, 0xe

    const/16 v23, 0x0

    const v24, 0xfffa

    move/from16 v16, v1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v27, v6

    const/4 v6, 0x0

    move-wide v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v0, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p1

    move-object/from16 v21, v27

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v21

    const/4 v0, 0x0

    goto :goto_10

    :cond_1b
    move v0, v1

    :goto_10
    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/4 v14, 0x1

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lb30/j2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/j2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lh20/g1;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v0, p6

    const-string v6, "modifier"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "linkAccount"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "changeEmail"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onDismissClicked"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "dismissWithResult"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v6, -0x5f9a00e5

    invoke-virtual {v9, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_1
    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v6, v7

    :cond_9
    move v13, v6

    and-int/lit16 v6, v13, 0x2493

    const/16 v7, 0x2492

    if-ne v6, v7, :cond_b

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v12, v9

    goto/16 :goto_9

    :cond_b
    :goto_6
    const v6, 0x7a1178e8

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lwz/n1;->d(Landroidx/compose/runtime/Composer;)Lcom/stripe/android/link/LinkActivity;

    move-result-object v6

    iget-object v6, v6, Lcom/stripe/android/link/LinkActivity;->x:Lwz/y;

    if-eqz v6, :cond_1c

    iget-object v6, v6, Lwz/y;->w:Lc00/a;

    if-eqz v6, :cond_1c

    new-instance v10, Lb0/b;

    const/4 v7, 0x2

    invoke-direct {v10, v7}, Lb0/b;-><init>(I)V

    new-instance v2, Lmt2/c;

    const/4 v5, 0x1

    move-object v7, v6

    move-object v6, v3

    move-object v3, v7

    move-object/from16 v8, p4

    move-object v7, v4

    move-object/from16 v4, p1

    invoke-direct/range {v2 .. v8}, Lmt2/c;-><init>(Lc00/a;Ld00/l;ZLc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lp00/o;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v10, v5, v2}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10}, Lb0/b;->c()Ll8/d;

    move-result-object v10

    const v2, 0x671a9c9b

    invoke-virtual {v9, v2}, Lp1/q;->f0(I)V

    invoke-static {v9}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v8

    if-eqz v8, :cond_1b

    instance-of v2, v8, Landroidx/lifecycle/r;

    if-eqz v2, :cond_c

    move-object v2, v8

    check-cast v2, Landroidx/lifecycle/r;

    invoke-interface {v2}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object v2

    :goto_7
    move-object v11, v2

    goto :goto_8

    :cond_c
    sget-object v2, Ll8/a;->b:Ll8/a;

    goto :goto_7

    :goto_8
    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    move-object v12, v9

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lpf/c;->c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object v6, v2

    check-cast v6, Lp00/o;

    iget-object v2, v6, Lp00/o;->M:Lec3/h2;

    invoke-static {v2, v12, v3}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp00/q;

    iget-boolean v4, v4, Lp00/q;->L:Z

    if-eqz v4, :cond_d

    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Lp00/i;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lp00/i;-><init>(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_d
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lp00/q;

    iget-object v2, v6, Lp00/o;->N:Lg40/o1;

    const v0, 0x515b4cee

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_e

    if-ne v4, v14, :cond_f

    :cond_e
    new-instance v4, Lb30/i0;

    const/4 v10, 0x0

    const/16 v11, 0x1d

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "onBack"

    const-string v9, "onBack()V"

    invoke-direct/range {v4 .. v11}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v0, v4

    check-cast v0, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x515b5302

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_10

    if-ne v5, v14, :cond_11

    :cond_10
    new-instance v4, Lp00/j;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "onChangeEmailButtonClicked"

    const-string v9, "onChangeEmailButtonClicked()V"

    invoke-direct/range {v4 .. v11}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_11
    move-object v15, v5

    check-cast v15, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x515b5b52

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_12

    if-ne v5, v14, :cond_13

    :cond_12
    new-instance v4, Lp00/j;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "resendCode"

    const-string v9, "resendCode()V"

    invoke-direct/range {v4 .. v11}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_13
    move-object/from16 v16, v5

    check-cast v16, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x515b6198

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_14

    if-ne v5, v14, :cond_15

    :cond_14
    new-instance v4, Lp00/j;

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "onFocusRequested"

    const-string v9, "onFocusRequested()V"

    invoke-direct/range {v4 .. v11}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_15
    move-object/from16 v17, v5

    check-cast v17, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x515b6a03

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_16

    if-ne v5, v14, :cond_17

    :cond_16
    new-instance v4, Lp00/j;

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "didShowCodeSentNotification"

    const-string v9, "didShowCodeSentNotification()V"

    invoke-direct/range {v4 .. v11}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_17
    move-object/from16 v18, v5

    check-cast v18, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    const v4, 0x515b7216

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_18

    if-ne v5, v14, :cond_19

    :cond_18
    new-instance v4, Lp00/j;

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v5, 0x0

    const-class v7, Lp00/o;

    const-string v8, "onConsentShown"

    const-string v9, "onConsentShown()V"

    invoke-direct/range {v4 .. v11}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_19
    check-cast v5, Lj93/g;

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object/from16 v4, v17

    check-cast v4, Lc93/a;

    check-cast v18, Lc93/a;

    move-object v6, v15

    check-cast v6, Lc93/a;

    move-object/from16 v7, v16

    check-cast v7, Lc93/a;

    move-object v8, v5

    check-cast v8, Lc93/a;

    and-int/lit8 v0, v13, 0xe

    or-int/lit16 v10, v0, 0x200

    move-object/from16 v0, p0

    move-object v9, v12

    move-object/from16 v5, v18

    invoke-static/range {v0 .. v10}, Lkotlin/jvm/internal/j;->s(Landroidx/compose/ui/Modifier;Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Lp00/i;

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lp00/i;-><init>(Landroidx/compose/ui/Modifier;Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no viewmodel in parent activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v0, p10

    const-string v4, "state"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "otpElement"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onBack"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onFocusRequested"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "didShowCodeSentNotification"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onChangeEmailClick"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onResendCodeClick"

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onConsentShown"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p9

    check-cast v12, Lp1/q;

    const v4, 0x5270a895

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v4, v11

    :cond_3
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_6

    and-int/lit16 v11, v0, 0x200

    if-nez v11, :cond_4

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    goto :goto_3

    :cond_4
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    :goto_3
    if-eqz v11, :cond_5

    const/16 v11, 0x100

    goto :goto_4

    :cond_5
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v4, v11

    :cond_6
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_8

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x800

    goto :goto_5

    :cond_7
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v4, v11

    :cond_8
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_a

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x4000

    goto :goto_6

    :cond_9
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v4, v11

    :cond_a
    const/high16 v11, 0x30000

    and-int/2addr v11, v0

    if-nez v11, :cond_c

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v4, v11

    :cond_c
    const/high16 v11, 0x180000

    and-int/2addr v11, v0

    if-nez v11, :cond_e

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v11, 0x80000

    :goto_8
    or-int/2addr v4, v11

    :cond_e
    const/high16 v11, 0xc00000

    and-int/2addr v11, v0

    if-nez v11, :cond_10

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v11, 0x400000

    :goto_9
    or-int/2addr v4, v11

    :cond_10
    const/high16 v11, 0x6000000

    and-int/2addr v11, v0

    if-nez v11, :cond_12

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    const/high16 v11, 0x4000000

    goto :goto_a

    :cond_11
    const/high16 v11, 0x2000000

    :goto_a
    or-int/2addr v4, v11

    :cond_12
    move v13, v4

    const v4, 0x2492493

    and-int/2addr v4, v13

    const v11, 0x2492492

    if-ne v4, v11, :cond_14

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_b

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    goto :goto_d

    :cond_14
    :goto_b
    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v4, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-eqz v1, :cond_15

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v12, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v12, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :cond_16
    invoke-static {v11, v12, v11, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lc4/a0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc4/a0;-><init>(I)V

    new-instance v2, Lp00/k;

    const/4 v11, 0x2

    move-object v4, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v11}, Lp00/k;-><init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;I)V

    const v1, -0x862ed68

    invoke-static {v1, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v2, v13, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x1b0

    invoke-static {v5, v0, v1, v12, v2}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_18

    new-instance v0, Ld42/n;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object v4, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v10}, Ld42/n;-><init>(Landroidx/compose/ui/Modifier;Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final t(Ljava/lang/String;Lva3/e;)Lva3/e;
    .locals 0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-virtual {p1, p0}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object p0

    return-object p0
.end method

.method public static final u(Landroidx/lifecycle/x;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lqh/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lqh/a;

    iget v1, v0, Lqh/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqh/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqh/a;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lqh/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqh/a;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lqh/a;->x:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lqh/a;->w:Landroidx/lifecycle/x;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    sget-object v2, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_3

    return-object v3

    :cond_3
    new-instance p1, Lkotlin/jvm/internal/g0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :try_start_1
    iput-object p0, v0, Lqh/a;->w:Landroidx/lifecycle/x;

    iput-object p1, v0, Lqh/a;->x:Lkotlin/jvm/internal/g0;

    iput v4, v0, Lqh/a;->z:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    new-instance v0, Lki/f;

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4}, Lki/f;-><init>(Lbc3/m;I)V

    iput-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    move-object p0, p1

    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/f0;

    if-eqz p0, :cond_5

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_5
    return-object v3

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p0

    move-object p0, p1

    move-object p1, v5

    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Landroidx/lifecycle/f0;

    if-eqz p0, :cond_6

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_6
    throw p1
.end method

.method public static final v(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1

    const-string v0, "possiblyPrimitiveType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    check-cast p0, Loa3/l;

    instance-of p1, p0, Loa3/k;

    if-eqz p1, :cond_1

    move-object p1, p0

    check-cast p1, Loa3/k;

    iget-object p1, p1, Loa3/k;->i:Ldb3/c;

    if-eqz p1, :cond_1

    iget-object p0, p1, Ldb3/c;->z:Lva3/e;

    if-eqz p0, :cond_0

    invoke-static {p0}, Ldb3/b;->b(Lva3/e;)Ldb3/b;

    move-result-object p0

    invoke-virtual {p0}, Ldb3/b;->d()Ljava/lang/String;

    move-result-object p0

    const-string p1, "getInternalName(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Loa3/m;->b(Ljava/lang/String;)Loa3/j;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0xf

    invoke-static {p0}, Ldb3/c;->a(I)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-object p0
.end method

.method public static varargs w([[B)[B
    .locals 7

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p0, v2

    const v5, 0x7fffffff

    array-length v6, v4

    sub-int/2addr v5, v6

    if-gt v3, v5, :cond_0

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "exceeded size limit"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-array v0, v3, [B

    array-length v2, p0

    move v3, v1

    move v4, v3

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v5, p0, v3

    array-length v6, v5

    invoke-static {v5, v1, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public static final x(Landroid/content/Context;)Lbh/j;
    .locals 1

    new-instance v0, Lzt/q;

    invoke-direct {v0, p0}, Lzt/q;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lzt/q;->e()Lbh/j;

    move-result-object p0

    return-object p0
.end method

.method public static y(Ljava/lang/String;Ljava/util/Collection;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    invoke-virtual {v1}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lj93/l0;->P(Ljava/util/ArrayList;)Lub3/f;

    move-result-object p1

    iget v0, p1, Lub3/f;->w:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;

    new-array v2, v2, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-virtual {p1, v2}, Lub3/f;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-direct {v0, p0, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;-><init>(Ljava/lang/String;[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Lub3/f;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    goto :goto_1

    :cond_2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    :goto_1
    iget p0, p1, Lub3/f;->w:I

    if-gt p0, v1, :cond_3

    return-object v0

    :cond_3
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/v;

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/v;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V

    return-object p0
.end method

.method public static z(Lio/o;)Lc9/k;
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-interface {p0}, Lio/o;->length()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {p0, v3, v0, v1}, Lio/o;->s(IJ)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Lc9/k;

    const/4 v0, 0x7

    invoke-direct {p0, v2, v4, v0}, Lc9/k;-><init>(III)V

    return-object p0
.end method
