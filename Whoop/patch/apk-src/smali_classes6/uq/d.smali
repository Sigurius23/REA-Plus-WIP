.class public final Luq/d;
.super Lkr/g;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Lcr/j;


# static fields
.field public static final g1:[I

.field public static final h1:Landroid/graphics/drawable/ShapeDrawable;


# instance fields
.field public A0:F

.field public B0:F

.field public C0:F

.field public D0:F

.field public E0:F

.field public final F0:Landroid/content/Context;

.field public final G0:Landroid/graphics/Paint;

.field public final H0:Landroid/graphics/Paint$FontMetrics;

.field public final I0:Landroid/graphics/RectF;

.field public final J0:Landroid/graphics/PointF;

.field public final K0:Landroid/graphics/Path;

.field public final L0:Lcr/k;

.field public M0:I

.field public N0:I

.field public O0:I

.field public P0:I

.field public Q0:I

.field public R0:I

.field public S0:Z

.field public T0:I

.field public U0:I

.field public V0:Landroid/graphics/ColorFilter;

.field public W0:Landroid/graphics/PorterDuffColorFilter;

.field public X0:Landroid/content/res/ColorStateList;

.field public Y:Landroid/content/res/ColorStateList;

.field public Y0:Landroid/graphics/PorterDuff$Mode;

.field public Z:Landroid/content/res/ColorStateList;

.field public Z0:[I

.field public a0:F

.field public a1:Landroid/content/res/ColorStateList;

.field public b0:F

.field public b1:Ljava/lang/ref/WeakReference;

.field public c0:Landroid/content/res/ColorStateList;

.field public c1:Landroid/text/TextUtils$TruncateAt;

.field public d0:F

.field public d1:Z

.field public e0:Landroid/content/res/ColorStateList;

.field public e1:I

.field public f0:Ljava/lang/CharSequence;

.field public f1:Z

.field public g0:Z

.field public h0:Landroid/graphics/drawable/Drawable;

.field public i0:Landroid/content/res/ColorStateList;

.field public j0:F

.field public k0:Z

.field public l0:Z

.field public m0:Landroid/graphics/drawable/Drawable;

.field public n0:Landroid/graphics/drawable/RippleDrawable;

.field public o0:Landroid/content/res/ColorStateList;

.field public p0:F

.field public q0:Landroid/text/SpannableStringBuilder;

.field public r0:Z

.field public s0:Z

.field public t0:Landroid/graphics/drawable/Drawable;

.field public u0:Landroid/content/res/ColorStateList;

.field public v0:Lkq/e;

.field public w0:Lkq/e;

.field public x0:F

.field public y0:F

.field public z0:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x101009e

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Luq/d;->g1:[I

    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    sput-object v0, Luq/d;->h1:Landroid/graphics/drawable/ShapeDrawable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f040110

    const v1, 0x7f1505d3

    invoke-direct {p0, p1, p2, v0, v1}, Lkr/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/high16 p2, -0x40800000    # -1.0f

    iput p2, p0, Luq/d;->b0:F

    new-instance p2, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p2, p0, Luq/d;->G0:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/Paint$FontMetrics;

    invoke-direct {p2}, Landroid/graphics/Paint$FontMetrics;-><init>()V

    iput-object p2, p0, Luq/d;->H0:Landroid/graphics/Paint$FontMetrics;

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Luq/d;->I0:Landroid/graphics/RectF;

    new-instance p2, Landroid/graphics/PointF;

    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    iput-object p2, p0, Luq/d;->J0:Landroid/graphics/PointF;

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Luq/d;->K0:Landroid/graphics/Path;

    const/16 p2, 0xff

    iput p2, p0, Luq/d;->U0:I

    sget-object p2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Luq/d;->Y0:Landroid/graphics/PorterDuff$Mode;

    new-instance p2, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {p2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Luq/d;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, p1}, Lkr/g;->k(Landroid/content/Context;)V

    iput-object p1, p0, Luq/d;->F0:Landroid/content/Context;

    new-instance p2, Lcr/k;

    invoke-direct {p2, p0}, Lcr/k;-><init>(Lcr/j;)V

    iput-object p2, p0, Luq/d;->L0:Lcr/k;

    const-string v1, ""

    iput-object v1, p0, Luq/d;->f0:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    iget-object p2, p2, Lcr/k;->a:Landroid/text/TextPaint;

    iput p1, p2, Landroid/text/TextPaint;->density:F

    sget-object p1, Luq/d;->g1:[I

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    iget-object p2, p0, Luq/d;->Z0:[I

    invoke-static {p2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p2

    if-nez p2, :cond_0

    iput-object p1, p0, Luq/d;->Z0:[I

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Luq/d;->E([I[I)Z

    :cond_0
    iput-boolean v0, p0, Luq/d;->d1:Z

    sget-object p1, Luq/d;->h1:Landroid/graphics/drawable/ShapeDrawable;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    return-void
.end method

.method public static B(Landroid/content/res/ColorStateList;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static C(Landroid/graphics/drawable/Drawable;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c0(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final A()F
    .locals 1

    iget-boolean v0, p0, Luq/d;->f1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkr/g;->i()F

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Luq/d;->b0:F

    return v0
.end method

.method public final D()V
    .locals 2

    iget-object v0, p0, Luq/d;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luq/c;

    if-eqz v0, :cond_0

    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget v1, v0, Lcom/google/android/material/chip/Chip;->P:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/chip/Chip;->b(I)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    :cond_0
    return-void
.end method

.method public final E([I[I)Z
    .locals 11

    invoke-super {p0, p1}, Lkr/g;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, Luq/d;->Y:Landroid/content/res/ColorStateList;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget v3, p0, Luq/d;->M0:I

    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {p0, v1}, Lkr/g;->d(I)I

    move-result v1

    iget v3, p0, Luq/d;->M0:I

    const/4 v4, 0x1

    if-eq v3, v1, :cond_1

    iput v1, p0, Luq/d;->M0:I

    move v0, v4

    :cond_1
    iget-object v3, p0, Luq/d;->Z:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_2

    iget v5, p0, Luq/d;->N0:I

    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    invoke-virtual {p0, v3}, Lkr/g;->d(I)I

    move-result v3

    iget v5, p0, Luq/d;->N0:I

    if-eq v5, v3, :cond_3

    iput v3, p0, Luq/d;->N0:I

    move v0, v4

    :cond_3
    invoke-static {v3, v1}, Lv4/a;->e(II)I

    move-result v1

    iget v3, p0, Luq/d;->O0:I

    if-eq v3, v1, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_2
    iget-object v5, p0, Lkr/g;->w:Lkr/f;

    iget-object v5, v5, Lkr/f;->c:Landroid/content/res/ColorStateList;

    if-nez v5, :cond_5

    move v5, v4

    goto :goto_3

    :cond_5
    move v5, v2

    :goto_3
    or-int/2addr v3, v5

    if-eqz v3, :cond_6

    iput v1, p0, Luq/d;->O0:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    move v0, v4

    :cond_6
    iget-object v1, p0, Luq/d;->c0:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_7

    iget v3, p0, Luq/d;->P0:I

    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    iget v3, p0, Luq/d;->P0:I

    if-eq v3, v1, :cond_8

    iput v1, p0, Luq/d;->P0:I

    move v0, v4

    :cond_8
    iget-object v1, p0, Luq/d;->a1:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_f

    array-length v1, p1

    const/4 v3, 0x0

    move v5, v3

    move v6, v5

    move v7, v6

    :goto_5
    const/4 v8, 0x1

    if-ge v5, v1, :cond_d

    aget v9, p1, v5

    const v10, 0x101009e

    if-ne v9, v10, :cond_9

    move v6, v8

    goto :goto_7

    :cond_9
    const v10, 0x101009c

    if-ne v9, v10, :cond_a

    :goto_6
    move v7, v8

    goto :goto_7

    :cond_a
    const v10, 0x10100a7

    if-ne v9, v10, :cond_b

    goto :goto_6

    :cond_b
    const v10, 0x1010367

    if-ne v9, v10, :cond_c

    goto :goto_6

    :cond_c
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_d
    if-eqz v6, :cond_e

    if-eqz v7, :cond_e

    move v3, v8

    :cond_e
    if-eqz v3, :cond_f

    iget-object v1, p0, Luq/d;->a1:Landroid/content/res/ColorStateList;

    iget v3, p0, Luq/d;->Q0:I

    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_8

    :cond_f
    move v1, v2

    :goto_8
    iget v3, p0, Luq/d;->Q0:I

    if-eq v3, v1, :cond_10

    iput v1, p0, Luq/d;->Q0:I

    :cond_10
    iget-object v1, p0, Luq/d;->L0:Lcr/k;

    iget-object v1, v1, Lcr/k;->g:Lhr/d;

    if-eqz v1, :cond_11

    iget-object v1, v1, Lhr/d;->j:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_11

    iget v3, p0, Luq/d;->R0:I

    invoke-virtual {v1, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    goto :goto_9

    :cond_11
    move v1, v2

    :goto_9
    iget v3, p0, Luq/d;->R0:I

    if-eq v3, v1, :cond_12

    iput v1, p0, Luq/d;->R0:I

    move v0, v4

    :cond_12
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    if-nez v1, :cond_13

    goto :goto_b

    :cond_13
    array-length v3, v1

    move v5, v2

    :goto_a
    if-ge v5, v3, :cond_15

    aget v6, v1, v5

    const v7, 0x10100a0

    if-ne v6, v7, :cond_14

    iget-boolean v1, p0, Luq/d;->r0:Z

    if-eqz v1, :cond_15

    move v1, v4

    goto :goto_c

    :cond_14
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_15
    :goto_b
    move v1, v2

    :goto_c
    iget-boolean v3, p0, Luq/d;->S0:Z

    if-eq v3, v1, :cond_17

    iget-object v3, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_17

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    iput-boolean v1, p0, Luq/d;->S0:Z

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_16

    move v0, v4

    move v1, v0

    goto :goto_d

    :cond_16
    move v1, v2

    move v0, v4

    goto :goto_d

    :cond_17
    move v1, v2

    :goto_d
    iget-object v3, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_18

    iget v5, p0, Luq/d;->T0:I

    invoke-virtual {v3, p1, v5}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    goto :goto_e

    :cond_18
    move v3, v2

    :goto_e
    iget v5, p0, Luq/d;->T0:I

    if-eq v5, v3, :cond_1b

    iput v3, p0, Luq/d;->T0:I

    iget-object v0, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    iget-object v3, p0, Luq/d;->Y0:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_1a

    if-nez v3, :cond_19

    goto :goto_f

    :cond_19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v5

    invoke-virtual {v0, v5, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v5, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_10

    :cond_1a
    :goto_f
    const/4 v5, 0x0

    :goto_10
    iput-object v5, p0, Luq/d;->W0:Landroid/graphics/PorterDuffColorFilter;

    goto :goto_11

    :cond_1b
    move v4, v0

    :goto_11
    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v4, v0

    :cond_1c
    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    or-int/2addr v4, v0

    :cond_1d
    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-eqz v0, :cond_1e

    array-length v0, p1

    array-length v3, p2

    add-int/2addr v0, v3

    new-array v0, v0, [I

    array-length v3, p1

    invoke-static {p1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p1

    array-length v3, p2

    invoke-static {p2, v2, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v4, p1

    :cond_1e
    iget-object p1, p0, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p1}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_1f

    iget-object p1, p0, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v4, p1

    :cond_1f
    if-eqz v4, :cond_20

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_20
    if-eqz v1, :cond_21

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_21
    return v4
.end method

.method public final F(Z)V
    .locals 1

    iget-boolean v0, p0, Luq/d;->r0:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Luq/d;->r0:Z

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    if-nez p1, :cond_0

    iget-boolean p1, p0, Luq/d;->S0:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Luq/d;->S0:Z

    :cond_0
    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_1
    return-void
.end method

.method public final G(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    iput-object p1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-static {v1}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final H(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Luq/d;->u0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Luq/d;->u0:Landroid/content/res/ColorStateList;

    iget-boolean v0, p0, Luq/d;->s0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Luq/d;->r0:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final I(Z)V
    .locals 1

    iget-boolean v0, p0, Luq/d;->s0:Z

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v0

    iput-boolean p1, p0, Luq/d;->s0:Z

    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result p1

    if-eq v0, p1, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_1
    return-void
.end method

.method public final J(F)V
    .locals 1

    iget v0, p0, Luq/d;->b0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Luq/d;->b0:F

    iget-object v0, p0, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->a:Lkr/k;

    invoke-virtual {v0}, Lkr/k;->e()Lkr/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkr/j;->b(F)V

    invoke-virtual {v0}, Lkr/j;->a()Lkr/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkr/g;->setShapeAppearanceModel(Lkr/k;)V

    :cond_0
    return-void
.end method

.method public final K(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->H(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eq v0, p1, :cond_3

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    invoke-static {v0}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v2, p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_3
    return-void
.end method

.method public final L(F)V
    .locals 1

    iget v0, p0, Luq/d;->j0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    iput p1, p0, Luq/d;->j0:F

    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final M(Landroid/content/res/ColorStateList;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Luq/d;->k0:Z

    iget-object v0, p0, Luq/d;->i0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Luq/d;->i0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final N(Z)V
    .locals 1

    iget-boolean v0, p0, Luq/d;->g0:Z

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v0

    iput-boolean p1, p0, Luq/d;->g0:Z

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result p1

    if-eq v0, p1, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_1
    return-void
.end method

.method public final O(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Luq/d;->c0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Luq/d;->c0:Landroid/content/res/ColorStateList;

    iget-boolean v0, p0, Luq/d;->f1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final P(F)V
    .locals 1

    iget v0, p0, Luq/d;->d0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_1

    iput p1, p0, Luq/d;->d0:F

    iget-object v0, p0, Luq/d;->G0:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-boolean v0, p0, Luq/d;->f1:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lkr/g;->s(F)V

    :cond_0
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final Q(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->H(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eq v0, p1, :cond_3

    invoke-virtual {p0}, Luq/d;->z()F

    move-result v2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    new-instance p1, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, Luq/d;->e0:Landroid/content/res/ColorStateList;

    invoke-static {v1}, Lir/a;->b(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v1

    iget-object v3, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    sget-object v4, Luq/d;->h1:Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {p1, v1, v3, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {p0}, Luq/d;->z()F

    move-result p1

    invoke-static {v0}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v2, p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_3
    return-void
.end method

.method public final R(F)V
    .locals 1

    iget v0, p0, Luq/d;->D0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Luq/d;->D0:F

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final S(F)V
    .locals 1

    iget v0, p0, Luq/d;->p0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Luq/d;->p0:F

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final T(F)V
    .locals 1

    iget v0, p0, Luq/d;->C0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Luq/d;->C0:F

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final U(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Luq/d;->o0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Luq/d;->o0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_1
    return-void
.end method

.method public final V(Z)V
    .locals 1

    iget-boolean v0, p0, Luq/d;->l0:Z

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v0

    iput-boolean p1, p0, Luq/d;->l0:Z

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result p1

    if-eq v0, p1, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Luq/d;->w(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Luq/d;->c0(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_1
    return-void
.end method

.method public final W(F)V
    .locals 1

    iget v0, p0, Luq/d;->z0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    iput p1, p0, Luq/d;->z0:F

    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final X(F)V
    .locals 1

    iget v0, p0, Luq/d;->y0:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v0

    iput p1, p0, Luq/d;->y0:F

    invoke-virtual {p0}, Luq/d;->y()F

    move-result p1

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Luq/d;->D()V

    :cond_0
    return-void
.end method

.method public final Y(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Luq/d;->e0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Luq/d;->e0:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    iput-object p1, p0, Luq/d;->a1:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final Z()Z
    .locals 1

    iget-boolean v0, p0, Luq/d;->s0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Luq/d;->S0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a()V
    .locals 0

    invoke-virtual {p0}, Luq/d;->D()V

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    return-void
.end method

.method public final a0()Z
    .locals 1

    iget-boolean v0, p0, Luq/d;->g0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b0()Z
    .locals 1

    iget-boolean v0, p0, Luq/d;->l0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget v6, v0, Luq/d;->U0:I

    if-nez v6, :cond_1

    :cond_0
    move-object v13, v0

    goto/16 :goto_b

    :cond_1
    const/16 v8, 0xff

    const/4 v9, 0x0

    if-ge v6, v8, :cond_2

    iget v1, v7, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget v1, v7, Landroid/graphics/Rect;->top:I

    int-to-float v3, v1

    iget v1, v7, Landroid/graphics/Rect;->right:I

    int-to-float v4, v1

    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v5, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayerAlpha(FFFFI)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_2
    move-object/from16 v1, p1

    move v10, v9

    :goto_0
    iget-boolean v2, v0, Luq/d;->f1:Z

    move v3, v2

    iget-object v2, v0, Luq/d;->G0:Landroid/graphics/Paint;

    iget-object v11, v0, Luq/d;->I0:Landroid/graphics/RectF;

    if-nez v3, :cond_3

    iget v3, v0, Luq/d;->M0:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v3

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v4

    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_3
    iget-boolean v3, v0, Luq/d;->f1:Z

    if-nez v3, :cond_5

    iget v3, v0, Luq/d;->N0:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v3, v0, Luq/d;->V0:Landroid/graphics/ColorFilter;

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    iget-object v3, v0, Luq/d;->W0:Landroid/graphics/PorterDuffColorFilter;

    :goto_1
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v3

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v4

    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_5
    iget-boolean v3, v0, Luq/d;->f1:Z

    if-eqz v3, :cond_6

    invoke-super/range {p0 .. p1}, Lkr/g;->draw(Landroid/graphics/Canvas;)V

    :cond_6
    iget v3, v0, Luq/d;->d0:F

    const/4 v6, 0x0

    cmpl-float v3, v3, v6

    const/high16 v12, 0x40000000    # 2.0f

    if-lez v3, :cond_9

    iget-boolean v3, v0, Luq/d;->f1:Z

    if-nez v3, :cond_9

    iget v3, v0, Luq/d;->P0:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-boolean v3, v0, Luq/d;->f1:Z

    if-nez v3, :cond_8

    iget-object v3, v0, Luq/d;->V0:Landroid/graphics/ColorFilter;

    if-eqz v3, :cond_7

    goto :goto_2

    :cond_7
    iget-object v3, v0, Luq/d;->W0:Landroid/graphics/PorterDuffColorFilter;

    :goto_2
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_8
    iget v3, v7, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v4, v0, Luq/d;->d0:F

    div-float/2addr v4, v12

    add-float/2addr v3, v4

    iget v5, v7, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    add-float/2addr v5, v4

    iget v13, v7, Landroid/graphics/Rect;->right:I

    int-to-float v13, v13

    sub-float/2addr v13, v4

    iget v14, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v14, v14

    sub-float/2addr v14, v4

    invoke-virtual {v11, v3, v5, v13, v14}, Landroid/graphics/RectF;->set(FFFF)V

    iget v3, v0, Luq/d;->b0:F

    iget v4, v0, Luq/d;->d0:F

    div-float/2addr v4, v12

    sub-float/2addr v3, v4

    invoke-virtual {v1, v11, v3, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_9
    iget v3, v0, Luq/d;->Q0:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v11, v7}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-boolean v3, v0, Luq/d;->f1:Z

    if-nez v3, :cond_a

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v3

    invoke-virtual {v0}, Luq/d;->A()F

    move-result v4

    invoke-virtual {v1, v11, v3, v4, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :goto_3
    move-object v13, v0

    goto :goto_4

    :cond_a
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v7}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    iget-object v4, v0, Lkr/g;->w:Lkr/f;

    iget-object v14, v4, Lkr/f;->a:Lkr/k;

    iget v15, v4, Lkr/f;->j:F

    iget-object v4, v0, Lkr/g;->Q:Lhm/d;

    iget-object v13, v0, Lkr/g;->R:Lkr/m;

    iget-object v5, v0, Luq/d;->K0:Landroid/graphics/Path;

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-virtual/range {v13 .. v18}, Lkr/m;->a(Lkr/k;FLandroid/graphics/RectF;Lhm/d;Landroid/graphics/Path;)V

    invoke-virtual {v0}, Lkr/g;->h()Landroid/graphics/RectF;

    move-result-object v5

    iget-object v3, v0, Lkr/g;->w:Lkr/f;

    iget-object v4, v3, Lkr/f;->a:Lkr/k;

    move-object/from16 v3, v18

    invoke-virtual/range {v0 .. v5}, Lkr/g;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lkr/k;Landroid/graphics/RectF;)V

    goto :goto_3

    :goto_4
    invoke-virtual {v13}, Luq/d;->a0()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v13, v7, v11}, Luq/d;->x(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    iget v0, v11, Landroid/graphics/RectF;->left:F

    iget v2, v11, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, v13, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v3, v13, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v0

    neg-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_b
    invoke-virtual {v13}, Luq/d;->Z()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v13, v7, v11}, Luq/d;->x(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    iget v0, v11, Landroid/graphics/RectF;->left:F

    iget v2, v11, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, v13, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v3, v13, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v0

    neg-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_c
    iget-boolean v0, v13, Luq/d;->d1:Z

    if-eqz v0, :cond_16

    iget-object v0, v13, Luq/d;->f0:Ljava/lang/CharSequence;

    if-eqz v0, :cond_16

    iget-object v0, v13, Luq/d;->J0:Landroid/graphics/PointF;

    invoke-virtual {v0, v6, v6}, Landroid/graphics/PointF;->set(FF)V

    sget-object v2, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    iget-object v3, v13, Luq/d;->f0:Ljava/lang/CharSequence;

    iget-object v4, v13, Luq/d;->L0:Lcr/k;

    if-eqz v3, :cond_e

    iget v3, v13, Luq/d;->x0:F

    invoke-virtual {v13}, Luq/d;->y()F

    move-result v5

    add-float/2addr v5, v3

    iget v3, v13, Luq/d;->A0:F

    add-float/2addr v5, v3

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v3

    if-nez v3, :cond_d

    iget v3, v7, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    add-float/2addr v3, v5

    iput v3, v0, Landroid/graphics/PointF;->x:F

    goto :goto_5

    :cond_d
    iget v2, v7, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    sub-float/2addr v2, v5

    iput v2, v0, Landroid/graphics/PointF;->x:F

    sget-object v2, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    :goto_5
    invoke-virtual {v7}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    int-to-float v3, v3

    iget-object v5, v4, Lcr/k;->a:Landroid/text/TextPaint;

    iget-object v6, v13, Luq/d;->H0:Landroid/graphics/Paint$FontMetrics;

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    iget v5, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    add-float/2addr v5, v6

    div-float/2addr v5, v12

    sub-float/2addr v3, v5

    iput v3, v0, Landroid/graphics/PointF;->y:F

    :cond_e
    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    iget-object v3, v13, Luq/d;->f0:Ljava/lang/CharSequence;

    if-eqz v3, :cond_10

    iget v3, v13, Luq/d;->x0:F

    invoke-virtual {v13}, Luq/d;->y()F

    move-result v5

    add-float/2addr v5, v3

    iget v3, v13, Luq/d;->A0:F

    add-float/2addr v5, v3

    iget v3, v13, Luq/d;->E0:F

    invoke-virtual {v13}, Luq/d;->z()F

    move-result v6

    add-float/2addr v6, v3

    iget v3, v13, Luq/d;->B0:F

    add-float/2addr v6, v3

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v3

    if-nez v3, :cond_f

    iget v3, v7, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    add-float/2addr v3, v5

    iput v3, v11, Landroid/graphics/RectF;->left:F

    iget v3, v7, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    sub-float/2addr v3, v6

    iput v3, v11, Landroid/graphics/RectF;->right:F

    goto :goto_6

    :cond_f
    iget v3, v7, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    add-float/2addr v3, v6

    iput v3, v11, Landroid/graphics/RectF;->left:F

    iget v3, v7, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    sub-float/2addr v3, v5

    iput v3, v11, Landroid/graphics/RectF;->right:F

    :goto_6
    iget v3, v7, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    iput v3, v11, Landroid/graphics/RectF;->top:F

    iget v3, v7, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    iput v3, v11, Landroid/graphics/RectF;->bottom:F

    :cond_10
    iget-object v3, v4, Lcr/k;->g:Lhr/d;

    iget-object v6, v4, Lcr/k;->a:Landroid/text/TextPaint;

    if-eqz v3, :cond_11

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v3

    iput-object v3, v6, Landroid/text/TextPaint;->drawableState:[I

    iget-object v3, v4, Lcr/k;->g:Lhr/d;

    iget-object v5, v4, Lcr/k;->b:Lcr/i;

    iget-object v14, v13, Luq/d;->F0:Landroid/content/Context;

    invoke-virtual {v3, v14, v6, v5}, Lhr/d;->e(Landroid/content/Context;Landroid/text/TextPaint;Ls2/e;)V

    :cond_11
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object v2, v13, Luq/d;->f0:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iget-boolean v3, v4, Lcr/k;->e:Z

    if-nez v3, :cond_12

    iget v2, v4, Lcr/k;->c:F

    goto :goto_7

    :cond_12
    invoke-virtual {v4, v2}, Lcr/k;->a(Ljava/lang/String;)V

    iget v2, v4, Lcr/k;->c:F

    :goto_7
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-le v2, v3, :cond_13

    const/4 v2, 0x1

    move v14, v2

    goto :goto_8

    :cond_13
    move v14, v9

    :goto_8
    if-eqz v14, :cond_14

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    invoke-virtual {v1, v11}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    move v15, v2

    goto :goto_9

    :cond_14
    move v15, v9

    :goto_9
    iget-object v2, v13, Luq/d;->f0:Ljava/lang/CharSequence;

    if-eqz v14, :cond_15

    iget-object v3, v13, Luq/d;->c1:Landroid/text/TextUtils$TruncateAt;

    if-eqz v3, :cond_15

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v3

    iget-object v4, v13, Luq/d;->c1:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v2, v6, v3, v4}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v2

    :cond_15
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v5, v0, Landroid/graphics/PointF;->y:F

    move-object v1, v2

    const/4 v2, 0x0

    move-object/from16 v0, p1

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    move-object v1, v0

    if-eqz v14, :cond_16

    invoke-virtual {v1, v15}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_16
    invoke-virtual {v13}, Luq/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {v11}, Landroid/graphics/RectF;->setEmpty()V

    invoke-virtual {v13}, Luq/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_18

    iget v0, v13, Luq/d;->E0:F

    iget v2, v13, Luq/d;->D0:F

    add-float/2addr v0, v2

    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v2

    if-nez v2, :cond_17

    iget v2, v7, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    sub-float/2addr v2, v0

    iput v2, v11, Landroid/graphics/RectF;->right:F

    iget v0, v13, Luq/d;->p0:F

    sub-float/2addr v2, v0

    iput v2, v11, Landroid/graphics/RectF;->left:F

    goto :goto_a

    :cond_17
    iget v2, v7, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    add-float/2addr v2, v0

    iput v2, v11, Landroid/graphics/RectF;->left:F

    iget v0, v13, Luq/d;->p0:F

    add-float/2addr v2, v0

    iput v2, v11, Landroid/graphics/RectF;->right:F

    :goto_a
    invoke-virtual {v7}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v0

    iget v2, v13, Luq/d;->p0:F

    div-float v3, v2, v12

    sub-float/2addr v0, v3

    iput v0, v11, Landroid/graphics/RectF;->top:F

    add-float/2addr v0, v2

    iput v0, v11, Landroid/graphics/RectF;->bottom:F

    :cond_18
    iget v0, v11, Landroid/graphics/RectF;->left:F

    iget v2, v11, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v3, v13, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v11}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v11}, Landroid/graphics/RectF;->height()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {v3, v9, v9, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v3, v13, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    iget-object v4, v13, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v3, v13, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    iget-object v3, v13, Luq/d;->n0:Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    neg-float v0, v0

    neg-float v2, v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_19
    iget v0, v13, Luq/d;->U0:I

    if-ge v0, v8, :cond_1a

    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_1a
    :goto_b
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget v0, p0, Luq/d;->U0:I

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, Luq/d;->V0:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Luq/d;->a0:F

    float-to-int v0, v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 4

    iget v0, p0, Luq/d;->x0:F

    invoke-virtual {p0}, Luq/d;->y()F

    move-result v1

    add-float/2addr v1, v0

    iget v0, p0, Luq/d;->A0:F

    add-float/2addr v1, v0

    iget-object v0, p0, Luq/d;->f0:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Luq/d;->L0:Lcr/k;

    iget-boolean v3, v2, Lcr/k;->e:Z

    if-nez v3, :cond_0

    iget v0, v2, Lcr/k;->c:F

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lcr/k;->a(Ljava/lang/String;)V

    iget v0, v2, Lcr/k;->c:F

    :goto_0
    add-float/2addr v0, v1

    iget v1, p0, Luq/d;->B0:F

    add-float/2addr v0, v1

    invoke-virtual {p0}, Luq/d;->z()F

    move-result v1

    add-float/2addr v1, v0

    iget v0, p0, Luq/d;->E0:F

    add-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Luq/d;->e1:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 8

    iget-boolean v0, p0, Luq/d;->f1:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lkr/g;->getOutline(Landroid/graphics/Outline;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Luq/d;->b0:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    move-object v2, p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Luq/d;->getIntrinsicWidth()I

    move-result v5

    iget v0, p0, Luq/d;->a0:F

    float-to-int v6, v0

    iget v7, p0, Luq/d;->b0:F

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    :goto_0
    iget p1, p0, Luq/d;->U0:I

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    invoke-virtual {v2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public final isStateful()Z
    .locals 1

    iget-object v0, p0, Luq/d;->Y:Landroid/content/res/ColorStateList;

    invoke-static {v0}, Luq/d;->B(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Luq/d;->Z:Landroid/content/res/ColorStateList;

    invoke-static {v0}, Luq/d;->B(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Luq/d;->c0:Landroid/content/res/ColorStateList;

    invoke-static {v0}, Luq/d;->B(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Luq/d;->L0:Lcr/k;

    iget-object v0, v0, Lcr/k;->g:Lhr/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lhr/d;->j:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Luq/d;->s0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Luq/d;->r0:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Luq/d;->C(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    invoke-static {v0}, Luq/d;->B(Landroid/content/res/ColorStateList;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final onLayoutDirectionChanged(I)Z
    .locals 2

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLayoutDirectionChanged(I)Z

    move-result v0

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_0
    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final onLevelChange(I)Z
    .locals 2

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onLevelChange(I)Z

    move-result v0

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_0
    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_3
    return v0
.end method

.method public final onStateChange([I)Z
    .locals 1

    iget-boolean v0, p0, Luq/d;->f1:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lkr/g;->onStateChange([I)Z

    :cond_0
    iget-object v0, p0, Luq/d;->Z0:[I

    invoke-virtual {p0, p1, v0}, Luq/d;->E([I[I)Z

    move-result p1

    return p1
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    iget v0, p0, Luq/d;->U0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Luq/d;->U0:I

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Luq/d;->V0:Landroid/graphics/ColorFilter;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Luq/d;->V0:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Luq/d;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    iget-object v0, p0, Luq/d;->Y0:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_2

    iput-object p1, p0, Luq/d;->Y0:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Luq/d;->X0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v1, v0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, Luq/d;->W0:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_2
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_0
    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lkr/g;->invalidateSelf()V

    :cond_3
    return v0
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final w(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v0, p0, Luq/d;->m0:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Luq/d;->Z0:[I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_1
    iget-object v0, p0, Luq/d;->o0:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_2
    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_3

    iget-boolean v1, p0, Luq/d;->k0:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Luq/d;->i0:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_4
    :goto_0
    return-void
.end method

.method public final x(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 5

    invoke-virtual {p2}, Landroid/graphics/RectF;->setEmpty()V

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget v0, p0, Luq/d;->x0:F

    iget v1, p0, Luq/d;->y0:F

    add-float/2addr v0, v1

    iget-boolean v1, p0, Luq/d;->S0:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    :goto_1
    iget v2, p0, Luq/d;->j0:F

    const/4 v3, 0x0

    cmpg-float v4, v2, v3

    if-gtz v4, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v2, v1

    :cond_3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    move-result v1

    if-nez v1, :cond_4

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    add-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->left:F

    add-float/2addr v1, v2

    iput v1, p2, Landroid/graphics/RectF;->right:F

    goto :goto_2

    :cond_4
    iget v1, p1, Landroid/graphics/Rect;->right:I

    int-to-float v1, v1

    sub-float/2addr v1, v0

    iput v1, p2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v1, v2

    iput v1, p2, Landroid/graphics/RectF;->left:F

    :goto_2
    iget-boolean v0, p0, Luq/d;->S0:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    goto :goto_3

    :cond_5
    iget-object v0, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    :goto_3
    iget v1, p0, Luq/d;->j0:F

    cmpg-float v2, v1, v3

    if-gtz v2, :cond_6

    if-eqz v0, :cond_6

    iget-object v1, p0, Luq/d;->F0:Landroid/content/Context;

    const/16 v2, 0x18

    invoke-static {v1, v2}, Lcr/m;->d(Landroid/content/Context;I)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, v2, v1

    if-gtz v2, :cond_6

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v1, v0

    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Rect;->exactCenterY()F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float v0, v1, v0

    sub-float/2addr p1, v0

    iput p1, p2, Landroid/graphics/RectF;->top:F

    add-float/2addr p1, v1

    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method public final y()F
    .locals 4

    invoke-virtual {p0}, Luq/d;->a0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Luq/d;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget v0, p0, Luq/d;->y0:F

    iget-boolean v2, p0, Luq/d;->S0:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Luq/d;->t0:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_2
    iget-object v2, p0, Luq/d;->h0:Landroid/graphics/drawable/Drawable;

    :goto_1
    iget v3, p0, Luq/d;->j0:F

    cmpg-float v1, v3, v1

    if-gtz v1, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v3, v1

    :cond_3
    add-float/2addr v3, v0

    iget v0, p0, Luq/d;->z0:F

    add-float/2addr v3, v0

    return v3
.end method

.method public final z()F
    .locals 2

    invoke-virtual {p0}, Luq/d;->b0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Luq/d;->C0:F

    iget v1, p0, Luq/d;->p0:F

    add-float/2addr v0, v1

    iget v1, p0, Luq/d;->D0:F

    add-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
