.class public abstract Lfr/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:[I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, Lfr/e;->c:[I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07038a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    new-array v7, v0, [I

    invoke-static {p1, p2, p3, p4}, Lcr/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v4, Ljq/a;->d:[I

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v2 .. v7}, Lcr/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0x9

    invoke-static {v2, p1, p2, v1}, Lkotlin/jvm/internal/j;->E(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, p0, Lfr/e;->a:I

    const/16 p2, 0x8

    invoke-static {v2, p1, p2, v0}, Lkotlin/jvm/internal/j;->E(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    move-result p2

    iget p3, p0, Lfr/e;->a:I

    const/4 p4, 0x2

    div-int/2addr p3, p4

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, p0, Lfr/e;->b:I

    const/4 p2, 0x5

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lfr/e;->e:I

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lfr/e;->f:I

    const/4 p3, 0x3

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lfr/e;->g:I

    invoke-virtual {p1, p4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    const/4 v1, -0x1

    if-nez p3, :cond_0

    const p2, 0x7f04015a

    invoke-static {v2, p2, v1}, Lrj/o;->t(Landroid/content/Context;II)I

    move-result p2

    filled-new-array {p2}, [I

    move-result-object p2

    iput-object p2, p0, Lfr/e;->c:[I

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p3

    iget p3, p3, Landroid/util/TypedValue;->type:I

    if-eq p3, p2, :cond_1

    invoke-virtual {p1, p4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    filled-new-array {p2}, [I

    move-result-object p2

    iput-object p2, p0, Lfr/e;->c:[I

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p1, p4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object p2

    iput-object p2, p0, Lfr/e;->c:[I

    array-length p2, p2

    if-eqz p2, :cond_3

    :goto_0
    const/4 p2, 0x7

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lfr/e;->d:I

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lfr/e;->c:[I

    aget p2, p2, v0

    iput p2, p0, Lfr/e;->d:I

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    const p3, 0x1010033

    filled-new-array {p3}, [I

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p2

    const p3, 0x3e4ccccd    # 0.2f

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p3

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    const/high16 p2, 0x437f0000    # 255.0f

    mul-float/2addr p3, p2

    float-to-int p2, p3

    iget p3, p0, Lfr/e;->d:I

    invoke-static {p3, p2}, Lrj/o;->m(II)I

    move-result p2

    iput p2, p0, Lfr/e;->d:I

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "indicatorColors cannot be empty when indicatorColor is not used."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Lfr/e;->g:I

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "indicatorTrackGapSize must be >= 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
