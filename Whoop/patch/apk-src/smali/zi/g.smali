.class public final Lzi/g;
.super Lzi/b;
.source "SourceFile"


# instance fields
.field public final D:Lsi/d;

.field public final E:Lzi/c;

.field public final F:Lti/g;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/e;Lzi/c;Lqi/i;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lzi/b;-><init>(Lqi/w;Lzi/e;)V

    iput-object p3, p0, Lzi/g;->E:Lzi/c;

    new-instance p3, Lyi/n;

    iget-object p2, p2, Lzi/e;->a:Ljava/util/List;

    const/4 v0, 0x0

    const-string v1, "__container"

    invoke-direct {p3, v1, p2, v0}, Lyi/n;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    new-instance p2, Lsi/d;

    invoke-direct {p2, p1, p0, p3, p4}, Lsi/d;-><init>(Lqi/w;Lzi/b;Lyi/n;Lqi/i;)V

    iput-object p2, p0, Lzi/g;->D:Lsi/d;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p2, p1, p1}, Lsi/d;->b(Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, Lzi/b;->p:Lzi/e;

    iget-object p1, p1, Lzi/e;->x:Lb30/m;

    if-eqz p1, :cond_0

    new-instance p2, Lti/g;

    invoke-direct {p2, p0, p0, p1}, Lti/g;-><init>(Lzi/b;Lzi/b;Lb30/m;)V

    iput-object p2, p0, Lzi/g;->F:Lti/g;

    :cond_0
    return-void
.end method


# virtual methods
.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lzi/g;->D:Lsi/d;

    iget-object v0, p0, Lzi/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1, v0, p3}, Lsi/d;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lzi/b;->g(Ld1/j;Ljava/lang/Object;)V

    sget-object v0, Lqi/a0;->a:Landroid/graphics/PointF;

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lzi/g;->F:Lti/g;

    if-ne p2, v0, :cond_0

    if-eqz v1, :cond_0

    iget-object p2, v1, Lti/g;->c:Lti/e;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    sget-object v0, Lqi/a0;->B:Ljava/lang/Float;

    if-ne p2, v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lti/g;->c(Ld1/j;)V

    return-void

    :cond_1
    sget-object v0, Lqi/a0;->C:Ljava/lang/Float;

    if-ne p2, v0, :cond_2

    if-eqz v1, :cond_2

    iget-object p2, v1, Lti/g;->e:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_2
    sget-object v0, Lqi/a0;->D:Ljava/lang/Float;

    if-ne p2, v0, :cond_3

    if-eqz v1, :cond_3

    iget-object p2, v1, Lti/g;->f:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_3
    sget-object v0, Lqi/a0;->E:Ljava/lang/Float;

    if-ne p2, v0, :cond_4

    if-eqz v1, :cond_4

    iget-object p2, v1, Lti/g;->g:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    :cond_4
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 1

    iget-object v0, p0, Lzi/g;->F:Lti/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Lti/g;->b(Landroid/graphics/Matrix;I)Ldj/a;

    move-result-object p4

    :cond_0
    iget-object v0, p0, Lzi/g;->D:Lsi/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsi/d;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    return-void
.end method

.method public final j()Lty/c;
    .locals 1

    iget-object v0, p0, Lzi/b;->p:Lzi/e;

    iget-object v0, v0, Lzi/e;->w:Lty/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzi/g;->E:Lzi/c;

    iget-object v0, v0, Lzi/b;->p:Lzi/e;

    iget-object v0, v0, Lzi/e;->w:Lty/c;

    return-object v0
.end method

.method public final n(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 1

    iget-object v0, p0, Lzi/g;->D:Lsi/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsi/d;->d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    return-void
.end method
