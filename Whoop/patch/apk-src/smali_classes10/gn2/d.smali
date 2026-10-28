.class public Lgn2/d;
.super Landroid/graphics/drawable/StateListDrawable;
.source "SourceFile"


# instance fields
.field private E:F

.field private F:I

.field private G:F

.field private H:Z

.field private I:Z

.field private w:Lgn2/c;

.field private x:Lgn2/a;

.field private y:Lgn2/a;

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0}, Lgn2/d;-><init>(Landroid/content/Context;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const v0, 0x3e4ccccd    # 0.2f

    .line 3
    iput v0, p0, Lgn2/d;->G:F

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lgn2/d;->H:Z

    .line 5
    iput-boolean v0, p0, Lgn2/d;->I:Z

    .line 6
    new-instance v0, Lgn2/c;

    invoke-direct {v0}, Lgn2/c;-><init>()V

    iput-object v0, p0, Lgn2/d;->w:Lgn2/c;

    .line 7
    new-instance v0, Lgn2/a;

    invoke-direct {v0}, Lgn2/a;-><init>()V

    iput-object v0, p0, Lgn2/d;->x:Lgn2/a;

    .line 8
    new-instance v0, Lgn2/a;

    invoke-direct {v0}, Lgn2/a;-><init>()V

    iput-object v0, p0, Lgn2/d;->y:Lgn2/a;

    .line 9
    invoke-direct {p0, p2}, Lgn2/d;->e(Z)V

    .line 10
    invoke-direct {p0}, Lgn2/d;->a()V

    .line 11
    iget-object p2, p0, Lgn2/d;->y:Lgn2/a;

    sget v0, Lvu1/a;->j:I

    .line 12
    invoke-static {p1, v0}, Lin2/j;->c(Landroid/content/Context;I)I

    move-result p1

    .line 13
    invoke-virtual {p2, p1}, Lgn2/a;->b(I)V

    const/high16 p1, 0x41400000    # 12.0f

    .line 14
    invoke-virtual {p0, p1}, Lgn2/d;->h(F)V

    return-void
.end method

.method private a()V
    .locals 2

    iget-boolean v0, p0, Lgn2/d;->H:Z

    if-eqz v0, :cond_0

    const v0, 0x10100a7

    filled-new-array {v0}, [I

    move-result-object v0

    iget-object v1, p0, Lgn2/d;->x:Lgn2/a;

    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    :cond_0
    const v0, 0x101009c

    filled-new-array {v0}, [I

    move-result-object v0

    iget-object v1, p0, Lgn2/d;->x:Lgn2/a;

    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const v0, 0x101009e

    filled-new-array {v0}, [I

    move-result-object v0

    iget-object v1, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    new-array v0, v0, [I

    iget-object v1, p0, Lgn2/d;->y:Lgn2/a;

    invoke-virtual {p0, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private e(Z)V
    .locals 0

    iput-boolean p1, p0, Lgn2/d;->H:Z

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1

    iput p1, p0, Lgn2/d;->z:I

    iget-object v0, p0, Lgn2/d;->x:Lgn2/a;

    invoke-virtual {v0, p1}, Lgn2/a;->a(I)V

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {v0, p1}, Lgn2/c;->f(I)V

    iget-object v0, p0, Lgn2/d;->y:Lgn2/a;

    invoke-virtual {v0, p1}, Lgn2/a;->a(I)V

    iget-object p1, p0, Lgn2/d;->x:Lgn2/a;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/DrawableContainer;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/DrawableContainer;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lgn2/d;->y:Lgn2/a;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/DrawableContainer;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lgn2/d;->a()V

    return-void
.end method

.method public c(F)V
    .locals 0

    iput p1, p0, Lgn2/d;->G:F

    iget p1, p0, Lgn2/d;->F:I

    invoke-virtual {p0, p1}, Lgn2/d;->d(I)V

    return-void
.end method

.method public d(I)V
    .locals 5

    iput p1, p0, Lgn2/d;->F:I

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {v0, p1}, Lgn2/c;->h(I)V

    iget-boolean v0, p0, Lgn2/d;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    iget v1, p0, Lgn2/d;->G:F

    invoke-static {v1, p1}, Lin2/j;->b(FI)I

    move-result v1

    invoke-virtual {v0, v1}, Lgn2/c;->g(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    iget v1, p0, Lgn2/d;->G:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lgn2/c;->g(I)V

    :goto_0
    iget-object v0, p0, Lgn2/d;->x:Lgn2/a;

    invoke-virtual {v0, p1}, Lgn2/a;->b(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {v0, p1}, Lgn2/c;->h(I)V

    return-void
.end method

.method public g(Z)V
    .locals 2

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {v0, p1}, Lgn2/c;->i(Z)V

    iget-object v0, p0, Lgn2/d;->x:Lgn2/a;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Lgn2/d;->y:Lgn2/a;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public h(F)V
    .locals 1

    iput p1, p0, Lgn2/d;->E:F

    iget-object v0, p0, Lgn2/d;->w:Lgn2/c;

    invoke-virtual {v0, p1}, Lgn2/c;->j(F)V

    return-void
.end method

.method public i(Z)V
    .locals 0

    iput-boolean p1, p0, Lgn2/d;->I:Z

    iget p1, p0, Lgn2/d;->F:I

    invoke-virtual {p0, p1}, Lgn2/d;->d(I)V

    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {p0, v0}, Lgn2/d;->b(I)V

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method
