.class public final Lzi/c;
.super Lzi/b;
.source "SourceFile"


# instance fields
.field public D:Lti/d;

.field public final E:Ljava/util/ArrayList;

.field public final F:Landroid/graphics/RectF;

.field public final G:Landroid/graphics/RectF;

.field public final H:Landroid/graphics/RectF;

.field public final I:Ldj/h;

.field public final J:Lbd3/v;

.field public K:F

.field public L:Z

.field public final M:Lti/g;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/e;Ljava/util/List;Lqi/i;)V
    .locals 10

    invoke-direct {p0, p1, p2}, Lzi/b;-><init>(Lqi/w;Lzi/e;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzi/c;->E:Ljava/util/ArrayList;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzi/c;->F:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzi/c;->G:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lzi/c;->H:Landroid/graphics/RectF;

    new-instance v0, Ldj/h;

    invoke-direct {v0}, Ldj/h;-><init>()V

    iput-object v0, p0, Lzi/c;->I:Ldj/h;

    new-instance v0, Lbd3/v;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbd3/v;-><init>(IB)V

    iput-object v0, p0, Lzi/c;->J:Lbd3/v;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzi/c;->L:Z

    iget-object p2, p2, Lzi/e;->s:Lxi/b;

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lxi/b;->H0()Lti/h;

    move-result-object p2

    iput-object p2, p0, Lzi/c;->D:Lti/d;

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    iget-object p2, p0, Lzi/c;->D:Lti/d;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lzi/c;->D:Lti/d;

    :goto_0
    new-instance p2, La0/y;

    iget-object v2, p4, Lqi/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p2, v2}, La0/y;-><init>(I)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    move-object v3, v1

    :goto_1
    const/4 v4, 0x0

    if-ltz v2, :cond_a

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzi/e;

    iget v6, v5, Lzi/e;->e:I

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v6

    const/4 v7, 0x2

    if-eqz v6, :cond_6

    if-eq v6, v0, :cond_5

    if-eq v6, v7, :cond_4

    const/4 v8, 0x3

    if-eq v6, v8, :cond_3

    const/4 v8, 0x4

    if-eq v6, v8, :cond_2

    const/4 v8, 0x5

    if-eq v6, v8, :cond_1

    iget v6, v5, Lzi/e;->e:I

    packed-switch v6, :pswitch_data_0

    const-string v6, "null"

    goto :goto_2

    :pswitch_0
    const-string v6, "UNKNOWN"

    goto :goto_2

    :pswitch_1
    const-string v6, "TEXT"

    goto :goto_2

    :pswitch_2
    const-string v6, "SHAPE"

    goto :goto_2

    :pswitch_3
    const-string v6, "NULL"

    goto :goto_2

    :pswitch_4
    const-string v6, "IMAGE"

    goto :goto_2

    :pswitch_5
    const-string v6, "SOLID"

    goto :goto_2

    :pswitch_6
    const-string v6, "PRE_COMP"

    :goto_2
    const-string v8, "Unknown layer type "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ldj/c;->b(Ljava/lang/String;)V

    move-object v6, v1

    goto :goto_3

    :cond_1
    new-instance v6, Lzi/k;

    invoke-direct {v6, p1, v5}, Lzi/k;-><init>(Lqi/w;Lzi/e;)V

    goto :goto_3

    :cond_2
    new-instance v6, Lzi/g;

    invoke-direct {v6, p1, v5, p0, p4}, Lzi/g;-><init>(Lqi/w;Lzi/e;Lzi/c;Lqi/i;)V

    goto :goto_3

    :cond_3
    new-instance v6, Lzi/f;

    invoke-direct {v6, p1, v5}, Lzi/f;-><init>(Lqi/w;Lzi/e;)V

    goto :goto_3

    :cond_4
    new-instance v6, Lzi/d;

    invoke-direct {v6, p1, v5}, Lzi/d;-><init>(Lqi/w;Lzi/e;)V

    goto :goto_3

    :cond_5
    new-instance v6, Lzi/h;

    invoke-direct {v6, p1, v5}, Lzi/h;-><init>(Lqi/w;Lzi/e;)V

    goto :goto_3

    :cond_6
    new-instance v6, Lzi/c;

    iget-object v8, v5, Lzi/e;->g:Ljava/lang/String;

    iget-object v9, p4, Lqi/i;->c:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-direct {v6, p1, v5, v8, p4}, Lzi/c;-><init>(Lqi/w;Lzi/e;Ljava/util/List;Lqi/i;)V

    :goto_3
    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    iget-object v8, v6, Lzi/b;->p:Lzi/e;

    iget-wide v8, v8, Lzi/e;->d:J

    invoke-virtual {p2, v8, v9, v6}, La0/y;->g(JLjava/lang/Object;)V

    if-eqz v3, :cond_8

    iput-object v6, v3, Lzi/b;->s:Lzi/b;

    move-object v3, v1

    goto :goto_4

    :cond_8
    iget-object v8, p0, Lzi/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v8, v4, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget v4, v5, Lzi/e;->u:I

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    if-eq v4, v0, :cond_9

    if-eq v4, v7, :cond_9

    goto :goto_4

    :cond_9
    move-object v3, v6

    :goto_4
    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_1

    :cond_a
    :goto_5
    invoke-virtual {p2}, La0/y;->i()I

    move-result p1

    if-ge v4, p1, :cond_d

    invoke-virtual {p2, v4}, La0/y;->f(I)J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzi/b;

    if-nez p1, :cond_b

    goto :goto_6

    :cond_b
    iget-object p3, p1, Lzi/b;->p:Lzi/e;

    iget-wide p3, p3, Lzi/e;->f:J

    invoke-virtual {p2, p3, p4}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lzi/b;

    if-eqz p3, :cond_c

    iput-object p3, p1, Lzi/b;->t:Lzi/b;

    :cond_c
    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_d
    iget-object p1, p0, Lzi/b;->p:Lzi/e;

    iget-object p1, p1, Lzi/e;->x:Lb30/m;

    if-eqz p1, :cond_e

    new-instance p2, Lti/g;

    invoke-direct {p2, p0, p0, p1}, Lti/g;-><init>(Lzi/b;Lzi/b;Lb30/m;)V

    iput-object p2, p0, Lzi/c;->M:Lti/g;

    :cond_e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 4

    invoke-super {p0, p1, p2, p3}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lzi/c;->E:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v0, 0x1

    sub-int/2addr p3, v0

    :goto_0
    if-ltz p3, :cond_0

    iget-object v1, p0, Lzi/c;->F:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzi/b;

    iget-object v3, p0, Lzi/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1, v3, v0}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    invoke-virtual {p1, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lzi/b;->g(Ld1/j;Ljava/lang/Object;)V

    sget-object v0, Lqi/a0;->z:Ljava/lang/Float;

    if-ne p2, v0, :cond_1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lzi/c;->D:Lti/d;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p2}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_0
    new-instance v0, Lti/r;

    invoke-direct {v0, p1, p2}, Lti/r;-><init>(Ld1/j;Ljava/lang/Object;)V

    iput-object v0, p0, Lzi/c;->D:Lti/d;

    invoke-virtual {v0, p0}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/c;->D:Lti/d;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_1
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lzi/c;->M:Lti/g;

    if-ne p2, v0, :cond_2

    if-eqz v1, :cond_2

    iget-object p2, v1, Lti/g;->c:Lti/e;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_2
    sget-object v0, Lqi/a0;->B:Ljava/lang/Float;

    if-ne p2, v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Lti/g;->c(Ld1/j;)V

    return-void

    :cond_3
    sget-object v0, Lqi/a0;->C:Ljava/lang/Float;

    if-ne p2, v0, :cond_4

    if-eqz v1, :cond_4

    iget-object p2, v1, Lti/g;->e:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_4
    sget-object v0, Lqi/a0;->D:Ljava/lang/Float;

    if-ne p2, v0, :cond_5

    if-eqz v1, :cond_5

    iget-object p2, v1, Lti/g;->f:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    return-void

    :cond_5
    sget-object v0, Lqi/a0;->E:Ljava/lang/Float;

    if-ne p2, v0, :cond_6

    if-eqz v1, :cond_6

    iget-object p2, v1, Lti/g;->g:Lti/h;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    :cond_6
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lzi/c;->M:Lti/g;

    const/4 v2, 0x1

    if-nez p4, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v3, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    iget-object v4, p0, Lzi/b;->o:Lqi/w;

    iget-boolean v5, v4, Lqi/w;->S:Z

    const/16 v6, 0xff

    iget-object v7, p0, Lzi/c;->E:Ljava/util/ArrayList;

    if-eqz v5, :cond_2

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v5, v2, :cond_2

    if-ne p3, v6, :cond_3

    :cond_2
    if-eqz v3, :cond_4

    iget-boolean v3, v4, Lqi/w;->T:Z

    if-eqz v3, :cond_4

    :cond_3
    move v0, v2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move v6, p3

    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1, p2, v6}, Lti/g;->b(Landroid/graphics/Matrix;I)Ldj/a;

    move-result-object p4

    :cond_6
    iget-boolean v1, p0, Lzi/c;->L:Z

    iget-object v3, p0, Lzi/b;->p:Lzi/e;

    iget-object v4, p0, Lzi/c;->G:Landroid/graphics/RectF;

    if-nez v1, :cond_7

    const-string v1, "__container"

    iget-object v5, v3, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v4}, Landroid/graphics/RectF;->setEmpty()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzi/b;

    iget-object v5, p0, Lzi/c;->H:Landroid/graphics/RectF;

    invoke-virtual {v3, v5, p2, v2}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    goto :goto_3

    :cond_7
    iget v1, v3, Lzi/e;->o:F

    iget v3, v3, Lzi/e;->p:F

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v5, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p2, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_8
    iget-object v1, p0, Lzi/c;->I:Ldj/h;

    if-eqz v0, :cond_b

    iget-object v3, p0, Lzi/c;->J:Lbd3/v;

    const/4 v5, 0x0

    iput-object v5, v3, Lbd3/v;->y:Ljava/lang/Object;

    iput p3, v3, Lbd3/v;->x:I

    if-eqz p4, :cond_a

    iget p3, p4, Ldj/a;->d:I

    invoke-static {p3}, Landroid/graphics/Color;->alpha(I)I

    move-result p3

    if-lez p3, :cond_9

    iput-object p4, v3, Lbd3/v;->y:Ljava/lang/Object;

    goto :goto_4

    :cond_9
    iput-object v5, v3, Lbd3/v;->y:Ljava/lang/Object;

    :goto_4
    move-object p4, v5

    :cond_a
    invoke-virtual {v1, p1, v4, v3}, Ldj/h;->e(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lbd3/v;)Landroid/graphics/Canvas;

    move-result-object p3

    goto :goto_5

    :cond_b
    move-object p3, p1

    :goto_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v2

    :goto_6
    if-ltz v3, :cond_c

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzi/b;

    invoke-virtual {v2, p3, p2, v6, p4}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    :cond_c
    if-eqz v0, :cond_d

    invoke-virtual {v1}, Ldj/h;->c()V

    :cond_d
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final n(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lzi/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzi/b;

    invoke-virtual {v1, p1, p2, p3, p4}, Lzi/b;->d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 2

    invoke-super {p0, p1}, Lzi/b;->o(Z)V

    iget-object v0, p0, Lzi/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzi/b;

    invoke-virtual {v1, p1}, Lzi/b;->o(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p(F)V
    .locals 4

    iput p1, p0, Lzi/c;->K:F

    invoke-super {p0, p1}, Lzi/b;->p(F)V

    iget-object v0, p0, Lzi/c;->D:Lti/d;

    iget-object v1, p0, Lzi/b;->p:Lzi/e;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lzi/b;->o:Lqi/w;

    iget-object p1, p1, Lqi/w;->w:Lqi/i;

    iget v2, p1, Lqi/i;->m:F

    iget p1, p1, Lqi/i;->l:F

    sub-float/2addr v2, p1

    const p1, 0x3c23d70a    # 0.01f

    add-float/2addr v2, p1

    iget-object p1, v1, Lzi/e;->b:Lqi/i;

    iget p1, p1, Lqi/i;->l:F

    invoke-virtual {v0}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v3, v1, Lzi/e;->b:Lqi/i;

    iget v3, v3, Lqi/i;->n:F

    mul-float/2addr v0, v3

    sub-float/2addr v0, p1

    div-float p1, v0, v2

    :cond_0
    iget-object v0, p0, Lzi/c;->D:Lti/d;

    if-nez v0, :cond_1

    iget v0, v1, Lzi/e;->n:F

    iget-object v2, v1, Lzi/e;->b:Lqi/i;

    iget v3, v2, Lqi/i;->m:F

    iget v2, v2, Lqi/i;->l:F

    sub-float/2addr v3, v2

    div-float/2addr v0, v3

    sub-float/2addr p1, v0

    :cond_1
    iget v0, v1, Lzi/e;->m:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_2

    const-string v0, "__container"

    iget-object v2, v1, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, v1, Lzi/e;->m:F

    div-float/2addr p1, v0

    :cond_2
    iget-object v0, p0, Lzi/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzi/b;

    invoke-virtual {v2, p1}, Lzi/b;->p(F)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    return-void
.end method
