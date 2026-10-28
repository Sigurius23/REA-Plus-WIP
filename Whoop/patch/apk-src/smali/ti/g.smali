.class public final Lti/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lti/a;


# instance fields
.field public final a:Lzi/b;

.field public final b:Lzi/b;

.field public final c:Lti/e;

.field public final d:Lti/h;

.field public final e:Lti/h;

.field public final f:Lti/h;

.field public final g:Lti/h;

.field public h:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lzi/b;Lzi/b;Lb30/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lti/g;->b:Lzi/b;

    iput-object p2, p0, Lti/g;->a:Lzi/b;

    invoke-virtual {p3}, Lb30/m;->u()Lxi/a;

    move-result-object p1

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lti/e;

    iput-object v0, p0, Lti/g;->c:Lti/e;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3}, Lb30/m;->A()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lti/g;->d:Lti/h;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3}, Lb30/m;->v()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lti/g;->e:Lti/h;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3}, Lb30/m;->w()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lti/g;->f:Lti/h;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3}, Lb30/m;->D()Lxi/b;

    move-result-object p1

    invoke-virtual {p1}, Lxi/b;->H0()Lti/h;

    move-result-object p1

    iput-object p1, p0, Lti/g;->g:Lti/h;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {p2, p1}, Lzi/b;->f(Lti/d;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lti/g;->b:Lzi/b;

    invoke-virtual {v0}, Lzi/b;->a()V

    return-void
.end method

.method public final b(Landroid/graphics/Matrix;I)Ldj/a;
    .locals 6

    iget-object v0, p0, Lti/g;->e:Lti/h;

    invoke-virtual {v0}, Lti/h;->l()F

    move-result v0

    const v1, 0x3c8efa35

    mul-float/2addr v0, v1

    iget-object v1, p0, Lti/g;->f:Lti/h;

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v0, v4

    mul-float/2addr v0, v1

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v1

    iget-object v1, p0, Lti/g;->g:Lti/h;

    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v3, p0, Lti/g;->c:Lti/e;

    invoke-virtual {v3}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lti/g;->d:Lti/h;

    invoke-virtual {v4}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    int-to-float p2, p2

    mul-float/2addr v4, p2

    const/high16 p2, 0x437f0000    # 255.0f

    div-float/2addr v4, p2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {p2, v4, v5, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    new-instance v3, Ldj/a;

    const v4, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v1, v4

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput v1, v3, Ldj/a;->a:F

    iput v0, v3, Ldj/a;->b:F

    iput v2, v3, Ldj/a;->c:F

    iput p2, v3, Ldj/a;->d:I

    const/4 p2, 0x0

    iput-object p2, v3, Ldj/a;->e:[F

    invoke-virtual {v3, p1}, Ldj/a;->c(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lti/g;->h:Landroid/graphics/Matrix;

    if-nez p1, :cond_0

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lti/g;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object p1, p0, Lti/g;->a:Lzi/b;

    iget-object p1, p1, Lzi/b;->w:Lti/q;

    invoke-virtual {p1}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object p1

    iget-object p2, p0, Lti/g;->h:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object p1, p0, Lti/g;->h:Landroid/graphics/Matrix;

    invoke-virtual {v3, p1}, Ldj/a;->c(Landroid/graphics/Matrix;)V

    return-object v3
.end method

.method public final c(Ld1/j;)V
    .locals 3

    iget-object v0, p0, Lti/g;->d:Lti/h;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    new-instance v1, Lti/f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lti/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lti/d;->j(Ld1/j;)V

    return-void
.end method
