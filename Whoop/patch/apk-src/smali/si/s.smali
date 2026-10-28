.class public final Lsi/s;
.super Lsi/b;
.source "SourceFile"


# instance fields
.field public final q:Lzi/b;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:Lti/e;

.field public u:Lti/r;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/p;)V
    .locals 11

    iget v0, p3, Lyi/p;->g:I

    invoke-static {v0}, Ly00/t7;->a(I)Landroid/graphics/Paint$Cap;

    move-result-object v4

    iget v0, p3, Lyi/p;->h:I

    invoke-static {v0}, Ly00/t7;->b(I)Landroid/graphics/Paint$Join;

    move-result-object v5

    iget v6, p3, Lyi/p;->i:F

    iget-object v7, p3, Lyi/p;->e:Lxi/a;

    iget-object v8, p3, Lyi/p;->f:Lxi/b;

    iget-object v9, p3, Lyi/p;->c:Ljava/util/ArrayList;

    iget-object v10, p3, Lyi/p;->b:Lxi/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lsi/b;-><init>(Lqi/w;Lzi/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLxi/a;Lxi/b;Ljava/util/ArrayList;Lxi/b;)V

    iput-object v3, v1, Lsi/s;->q:Lzi/b;

    iget-object p1, p3, Lyi/p;->a:Ljava/lang/String;

    iput-object p1, v1, Lsi/s;->r:Ljava/lang/String;

    iget-boolean p1, p3, Lyi/p;->j:Z

    iput-boolean p1, v1, Lsi/s;->s:Z

    iget-object p1, p3, Lyi/p;->d:Lxi/a;

    invoke-virtual {p1}, Lxi/a;->k0()Lti/d;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lti/e;

    iput-object p2, v1, Lsi/s;->t:Lti/e;

    invoke-virtual {p1, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {v3, p1}, Lzi/b;->f(Lti/d;)V

    return-void
.end method


# virtual methods
.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 3

    iget-boolean v0, p0, Lsi/s;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsi/s;->t:Lti/e;

    iget-object v1, v0, Lti/d;->c:Lti/b;

    invoke-interface {v1}, Lti/b;->b()Lej/a;

    move-result-object v1

    invoke-virtual {v0}, Lti/d;->c()F

    move-result v2

    invoke-virtual {v0, v1, v2}, Lti/e;->l(Lej/a;F)I

    move-result v0

    iget-object v1, p0, Lsi/b;->i:Lri/a;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lsi/s;->u:Lti/r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lti/r;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lsi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 3

    invoke-super {p0, p1, p2}, Lsi/b;->g(Ld1/j;Ljava/lang/Object;)V

    sget-object v0, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lsi/s;->t:Lti/e;

    if-ne p2, v0, :cond_0

    invoke-virtual {v1, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    sget-object v0, Lqi/a0;->F:Landroid/graphics/ColorFilter;

    if-ne p2, v0, :cond_3

    iget-object p2, p0, Lsi/s;->u:Lti/r;

    iget-object v0, p0, Lsi/s;->q:Lzi/b;

    if-eqz p2, :cond_1

    invoke-virtual {v0, p2}, Lzi/b;->m(Lti/d;)V

    :cond_1
    const/4 p2, 0x0

    if-nez p1, :cond_2

    iput-object p2, p0, Lsi/s;->u:Lti/r;

    return-void

    :cond_2
    new-instance v2, Lti/r;

    invoke-direct {v2, p1, p2}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object v2, p0, Lsi/s;->u:Lti/r;

    invoke-virtual {v2, p0}, Lti/d;->a(Lti/a;)V

    invoke-virtual {v0, v1}, Lzi/b;->f(Lti/d;)V

    :cond_3
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/s;->r:Ljava/lang/String;

    return-object v0
.end method
