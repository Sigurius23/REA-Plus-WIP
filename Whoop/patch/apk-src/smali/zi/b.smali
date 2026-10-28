.class public abstract Lzi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/e;
.implements Lti/a;
.implements Lwi/f;


# instance fields
.field public A:F

.field public B:Landroid/graphics/BlurMaskFilter;

.field public C:Lri/a;

.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Lri/a;

.field public final e:Lri/a;

.field public final f:Lri/a;

.field public final g:Lri/a;

.field public final h:Lri/a;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/RectF;

.field public final m:Landroid/graphics/RectF;

.field public final n:Landroid/graphics/Matrix;

.field public final o:Lqi/w;

.field public final p:Lzi/e;

.field public final q:Ls/m2;

.field public final r:Lti/h;

.field public s:Lzi/b;

.field public t:Lzi/b;

.field public u:Ljava/util/List;

.field public final v:Ljava/util/ArrayList;

.field public final w:Lti/q;

.field public x:Z

.field public y:Z

.field public z:Lri/a;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/e;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lzi/b;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lzi/b;->b:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lzi/b;->c:Landroid/graphics/Matrix;

    new-instance v0, Lri/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lzi/b;->d:Lri/a;

    new-instance v0, Lri/a;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v2}, Lri/a;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lzi/b;->e:Lri/a;

    new-instance v0, Lri/a;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v3}, Lri/a;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lzi/b;->f:Lri/a;

    new-instance v0, Lri/a;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lzi/b;->g:Lri/a;

    new-instance v4, Lri/a;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    new-instance v6, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v6, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iput-object v4, p0, Lzi/b;->h:Lri/a;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lzi/b;->i:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lzi/b;->j:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lzi/b;->k:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lzi/b;->l:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lzi/b;->m:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    iput-object v4, p0, Lzi/b;->n:Landroid/graphics/Matrix;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lzi/b;->v:Ljava/util/ArrayList;

    iput-boolean v1, p0, Lzi/b;->x:Z

    const/4 v4, 0x0

    iput v4, p0, Lzi/b;->A:F

    iput-object p1, p0, Lzi/b;->o:Lqi/w;

    iput-object p2, p0, Lzi/b;->p:Lzi/e;

    iget-object p1, p2, Lzi/e;->h:Ljava/util/List;

    iget v4, p2, Lzi/e;->u:I

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_0

    :cond_0
    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v3, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :goto_0
    iget-object p2, p2, Lzi/e;->i:Lxi/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lti/q;

    invoke-direct {v0, p2}, Lti/q;-><init>(Lxi/e;)V

    iput-object v0, p0, Lzi/b;->w:Lti/q;

    invoke-virtual {v0, p0}, Lti/q;->b(Lti/a;)V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Ls/m2;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p1, p2, Ls/m2;->y:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Ls/m2;->w:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p2, Ls/m2;->x:Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p2, Ls/m2;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyi/f;

    iget-object v3, v3, Lyi/f;->b:Lxi/a;

    new-instance v4, Lti/m;

    iget-object v3, v3, Lal/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-direct {v4, v3}, Lti/m;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyi/f;

    iget-object v2, v2, Lyi/f;->c:Lxi/a;

    iget-object v3, p2, Ls/m2;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lxi/a;->k0()Lti/d;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput-object p2, p0, Lzi/b;->q:Ls/m2;

    iget-object p1, p2, Ls/m2;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lti/d;

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lzi/b;->q:Ls/m2;

    iget-object p1, p1, Ls/m2;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lti/d;

    invoke-virtual {p0, p2}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p2, p0}, Lti/d;->a(Lti/a;)V

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lzi/b;->p:Lzi/e;

    iget-object p2, p1, Lzi/e;->t:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_6

    new-instance p2, Lti/h;

    iget-object p1, p1, Lzi/e;->t:Ljava/util/List;

    invoke-direct {p2, p1}, Lti/d;-><init>(Ljava/util/List;)V

    iput-object p2, p0, Lzi/b;->r:Lti/h;

    iput-boolean v1, p2, Lti/d;->b:Z

    new-instance p1, Lzi/a;

    invoke-direct {p1, p0}, Lzi/a;-><init>(Lzi/b;)V

    invoke-virtual {p2, p1}, Lti/d;->a(Lti/a;)V

    iget-object p1, p0, Lzi/b;->r:Lti/h;

    invoke-virtual {p1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p1, p1, p2

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    iget-boolean p1, p0, Lzi/b;->x:Z

    if-eq v1, p1, :cond_5

    iput-boolean v1, p0, Lzi/b;->x:Z

    iget-object p1, p0, Lzi/b;->o:Lqi/w;

    invoke-virtual {p1}, Lqi/w;->invalidateSelf()V

    :cond_5
    iget-object p1, p0, Lzi/b;->r:Lti/h;

    invoke-virtual {p0, p1}, Lzi/b;->f(Lti/d;)V

    return-void

    :cond_6
    iget-boolean p1, p0, Lzi/b;->x:Z

    if-eq v1, p1, :cond_7

    iput-boolean v1, p0, Lzi/b;->x:Z

    iget-object p1, p0, Lzi/b;->o:Lqi/w;

    invoke-virtual {p1}, Lqi/w;->invalidateSelf()V

    :cond_7
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lzi/b;->o:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    iget-boolean v2, v0, Lzi/b;->x:Z

    if-eqz v2, :cond_29

    iget-object v2, v0, Lzi/b;->p:Lzi/e;

    iget-boolean v3, v2, Lzi/e;->v:Z

    iget v4, v2, Lzi/e;->y:I

    if-eqz v3, :cond_0

    goto/16 :goto_13

    :cond_0
    invoke-virtual {v0}, Lzi/b;->h()V

    iget-object v10, v0, Lzi/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {v10}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {v10, v7}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v3, v0, Lzi/b;->u:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v11, 0x1

    sub-int/2addr v3, v11

    :goto_0
    if-ltz v3, :cond_1

    iget-object v5, v0, Lzi/b;->u:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzi/b;

    iget-object v5, v5, Lzi/b;->w:Lti/q;

    invoke-virtual {v5}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lzi/b;->w:Lti/q;

    iget-object v5, v3, Lti/q;->j:Lti/d;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_2
    const/16 v5, 0x64

    :goto_1
    int-to-float v6, v8

    const/high16 v12, 0x437f0000    # 255.0f

    div-float/2addr v6, v12

    int-to-float v5, v5

    mul-float/2addr v6, v5

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v6, v5

    mul-float/2addr v6, v12

    float-to-int v12, v6

    iget-object v5, v0, Lzi/b;->s:Lzi/b;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lzi/b;->k()Z

    move-result v5

    if-nez v5, :cond_4

    if-ne v4, v11, :cond_4

    invoke-virtual {v3}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual {v0, v1, v10, v12, v9}, Lzi/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    invoke-virtual {v0}, Lzi/b;->l()V

    return-void

    :cond_4
    :goto_2
    iget-object v13, v0, Lzi/b;->i:Landroid/graphics/RectF;

    const/4 v14, 0x0

    invoke-virtual {v0, v13, v10, v14}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v5, v0, Lzi/b;->s:Lzi/b;

    const/4 v15, 0x3

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    iget v2, v2, Lzi/e;->u:I

    if-ne v2, v15, :cond_5

    goto :goto_3

    :cond_5
    iget-object v2, v0, Lzi/b;->l:Landroid/graphics/RectF;

    invoke-virtual {v2, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v5, v0, Lzi/b;->s:Lzi/b;

    invoke-virtual {v5, v2, v7, v11}, Lzi/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    invoke-virtual {v13, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v13, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_6
    :goto_3
    invoke-virtual {v3}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v2, v0, Lzi/b;->k:Landroid/graphics/RectF;

    invoke-virtual {v2, v6, v6, v6, v6}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v0}, Lzi/b;->k()Z

    move-result v3

    iget-object v5, v0, Lzi/b;->q:Ls/m2;

    iget-object v6, v0, Lzi/b;->a:Landroid/graphics/Path;

    if-nez v3, :cond_9

    :cond_7
    :goto_4
    move-object/from16 v18, v5

    move-object/from16 v19, v6

    :cond_8
    const/4 v2, 0x0

    goto/16 :goto_9

    :cond_9
    iget-object v3, v5, Ls/m2;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v15, 0x0

    :goto_5
    if-ge v15, v3, :cond_e

    iget-object v14, v5, Ls/m2;->y:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lyi/f;

    iget-object v11, v5, Ls/m2;->w:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lti/d;

    invoke-virtual {v11}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/graphics/Path;

    if-nez v11, :cond_a

    move/from16 v17, v3

    :goto_6
    move-object/from16 v18, v5

    move-object/from16 v19, v6

    goto :goto_8

    :cond_a
    invoke-virtual {v6, v11}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget v11, v14, Lyi/f;->a:I

    invoke-static {v11}, Le4/p;->e(I)I

    move-result v11

    move/from16 v17, v3

    if-eqz v11, :cond_b

    const/4 v3, 0x1

    if-eq v11, v3, :cond_7

    const/4 v3, 0x2

    if-eq v11, v3, :cond_b

    const/4 v3, 0x3

    if-eq v11, v3, :cond_7

    goto :goto_7

    :cond_b
    iget-boolean v3, v14, Lyi/f;->d:Z

    if-eqz v3, :cond_c

    goto :goto_4

    :cond_c
    :goto_7
    iget-object v3, v0, Lzi/b;->m:Landroid/graphics/RectF;

    const/4 v11, 0x0

    invoke-virtual {v6, v3, v11}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    if-nez v15, :cond_d

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    goto :goto_6

    :cond_d
    iget v14, v2, Landroid/graphics/RectF;->left:F

    iget v11, v3, Landroid/graphics/RectF;->left:F

    invoke-static {v14, v11}, Ljava/lang/Math;->min(FF)F

    move-result v11

    iget v14, v2, Landroid/graphics/RectF;->top:F

    move-object/from16 v18, v5

    iget v5, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v14, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iget v14, v2, Landroid/graphics/RectF;->right:F

    move-object/from16 v19, v6

    iget v6, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v14, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v14, v2, Landroid/graphics/RectF;->bottom:F

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-static {v14, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v2, v11, v5, v6, v3}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_8
    add-int/lit8 v15, v15, 0x1

    move/from16 v3, v17

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    const/4 v11, 0x1

    goto/16 :goto_5

    :cond_e
    move-object/from16 v18, v5

    move-object/from16 v19, v6

    invoke-virtual {v13, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v2

    if-nez v2, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v13, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_9
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget-object v6, v0, Lzi/b;->j:Landroid/graphics/RectF;

    invoke-virtual {v6, v2, v2, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v3, v0, Lzi/b;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v3}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v3, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    invoke-virtual {v3, v6}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_f
    invoke-virtual {v13, v6}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v3

    if-nez v3, :cond_10

    invoke-virtual {v13, v2, v2, v2, v2}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_10
    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v11

    if-ltz v2, :cond_27

    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpl-float v2, v2, v11

    if-ltz v2, :cond_27

    iget-object v14, v0, Lzi/b;->d:Lri/a;

    const/16 v15, 0xff

    invoke-virtual {v14, v15}, Lri/a;->setAlpha(I)V

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v2

    const/4 v3, 0x4

    const/4 v5, 0x1

    if-eq v2, v5, :cond_15

    const/4 v5, 0x2

    if-eq v2, v5, :cond_14

    const/16 v5, 0x10

    const/4 v6, 0x3

    if-eq v2, v6, :cond_16

    if-eq v2, v3, :cond_13

    const/4 v6, 0x5

    if-eq v2, v6, :cond_12

    if-eq v2, v5, :cond_11

    const/4 v5, 0x0

    goto :goto_a

    :cond_11
    const/16 v5, 0xd

    goto :goto_a

    :cond_12
    const/16 v5, 0x12

    goto :goto_a

    :cond_13
    const/16 v5, 0x11

    goto :goto_a

    :cond_14
    const/16 v5, 0xf

    goto :goto_a

    :cond_15
    const/16 v5, 0xe

    :cond_16
    :goto_a
    invoke-static {v5, v14}, Lv4/c;->a(ILri/a;)V

    sget-object v2, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_17

    iget v2, v13, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v11

    iget v4, v13, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v11

    iget v5, v13, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v11

    iget v6, v13, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v6, v11

    move/from16 v16, v3

    move v3, v4

    move v4, v5

    move v5, v6

    iget-object v6, v0, Lzi/b;->h:Lri/a;

    move/from16 v17, v11

    move/from16 v11, v16

    move-object/from16 v15, v18

    move-object/from16 v20, v19

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move-object/from16 v1, p1

    goto :goto_b

    :cond_17
    move/from16 v17, v11

    move-object/from16 v15, v18

    move-object/from16 v20, v19

    move v11, v3

    iget-object v1, v0, Lzi/b;->C:Lri/a;

    if-nez v1, :cond_18

    new-instance v1, Lri/a;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, v0, Lzi/b;->C:Lri/a;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    :cond_18
    iget v1, v13, Landroid/graphics/RectF;->left:F

    sub-float v2, v1, v17

    iget v1, v13, Landroid/graphics/RectF;->top:F

    sub-float v3, v1, v17

    iget v1, v13, Landroid/graphics/RectF;->right:F

    add-float v4, v1, v17

    iget v1, v13, Landroid/graphics/RectF;->bottom:F

    add-float v5, v1, v17

    iget-object v6, v0, Lzi/b;->C:Lri/a;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_b
    invoke-virtual {v0, v1, v10, v12, v9}, Lzi/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    invoke-virtual {v0}, Lzi/b;->k()Z

    move-result v2

    if-eqz v2, :cond_25

    iget-object v2, v0, Lzi/b;->e:Lri/a;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    const/4 v3, 0x0

    :goto_c
    iget-object v4, v15, Ls/m2;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v15, Ls/m2;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_24

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lyi/f;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lti/d;

    iget-object v12, v15, Ls/m2;->x:Ljava/lang/Object;

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lti/d;

    iget v11, v6, Lyi/f;->a:I

    iget-boolean v6, v6, Lyi/f;->d:Z

    invoke-static {v11}, Le4/p;->e(I)I

    move-result v11

    move/from16 v19, v3

    iget-object v3, v0, Lzi/b;->f:Lri/a;

    const v21, 0x40233333    # 2.55f

    if-eqz v11, :cond_22

    move-object/from16 p4, v5

    const/4 v5, 0x1

    if-eq v11, v5, :cond_1f

    const/4 v5, 0x2

    if-eq v11, v5, :cond_1d

    const/4 v5, 0x3

    if-eq v11, v5, :cond_19

    move-object/from16 v4, v20

    const/16 v5, 0xff

    const/4 v11, 0x4

    goto/16 :goto_12

    :cond_19
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1a

    const/4 v11, 0x4

    goto :goto_e

    :cond_1a
    const/4 v3, 0x0

    :goto_d
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_1c

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lyi/f;

    iget v6, v6, Lyi/f;->a:I

    const/4 v11, 0x4

    if-eq v6, v11, :cond_1b

    :goto_e
    move-object/from16 v4, v20

    :goto_f
    const/16 v5, 0xff

    goto/16 :goto_12

    :cond_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_1c
    const/16 v3, 0xff

    const/4 v11, 0x4

    invoke-virtual {v14, v3}, Lri/a;->setAlpha(I)V

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_e

    :cond_1d
    const/4 v5, 0x3

    const/4 v11, 0x4

    if-eqz v6, :cond_1e

    sget-object v4, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {v12}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-float v4, v4

    mul-float v4, v4, v21

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Lri/a;->setAlpha(I)V

    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Path;

    move-object/from16 v6, v20

    invoke-virtual {v6, v4}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v6, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    :goto_10
    move-object v4, v6

    goto :goto_f

    :cond_1e
    move-object/from16 v6, v20

    sget-object v3, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    invoke-virtual {v6, v3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v12}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v21

    float-to-int v3, v3

    invoke-virtual {v14, v3}, Lri/a;->setAlpha(I)V

    invoke-virtual {v1, v6, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_10

    :cond_1f
    move-object/from16 v4, v20

    const/4 v5, 0x3

    const/4 v11, 0x4

    if-nez v19, :cond_20

    const/high16 v5, -0x1000000

    invoke-virtual {v14, v5}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v5, 0xff

    invoke-virtual {v14, v5}, Lri/a;->setAlpha(I)V

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_11

    :cond_20
    const/16 v5, 0xff

    :goto_11
    if-eqz v6, :cond_21

    sget-object v6, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v13, v3}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {v12}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v21

    float-to-int v6, v6

    invoke-virtual {v3, v6}, Lri/a;->setAlpha(I)V

    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Path;

    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_12

    :cond_21
    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Path;

    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_12

    :cond_22
    move-object/from16 v4, v20

    const/16 v5, 0xff

    const/4 v11, 0x4

    if-eqz v6, :cond_23

    sget-object v6, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    invoke-virtual {v1, v13, v14}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Path;

    invoke-virtual {v4, v6}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v12}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, v21

    float-to-int v6, v6

    invoke-virtual {v14, v6}, Lri/a;->setAlpha(I)V

    invoke-virtual {v1, v4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_12

    :cond_23
    invoke-virtual {v9}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Path;

    invoke-virtual {v4, v3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    invoke-virtual {v4, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    invoke-virtual {v12}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    mul-float v3, v3, v21

    float-to-int v3, v3

    invoke-virtual {v14, v3}, Lri/a;->setAlpha(I)V

    invoke-virtual {v1, v4, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_12
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v20, v4

    goto/16 :goto_c

    :cond_24
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    :cond_25
    iget-object v2, v0, Lzi/b;->s:Lzi/b;

    if-eqz v2, :cond_26

    iget-object v2, v0, Lzi/b;->g:Lri/a;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    iget v2, v13, Landroid/graphics/RectF;->left:F

    sub-float v2, v2, v17

    iget v3, v13, Landroid/graphics/RectF;->top:F

    sub-float v3, v3, v17

    iget v4, v13, Landroid/graphics/RectF;->right:F

    add-float v4, v4, v17

    iget v5, v13, Landroid/graphics/RectF;->bottom:F

    add-float v5, v5, v17

    iget-object v6, v0, Lzi/b;->h:Lri/a;

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v2, v0, Lzi/b;->s:Lzi/b;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v7, v8, v3}, Lzi/b;->c(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    :cond_26
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    :cond_27
    iget-boolean v2, v0, Lzi/b;->y:Z

    if-eqz v2, :cond_28

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    if-eqz v2, :cond_28

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    const v3, -0x3d7fd

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    const v3, 0x50ebebeb

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v0, Lzi/b;->z:Lri/a;

    invoke-virtual {v1, v13, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_28
    invoke-virtual {v0}, Lzi/b;->l()V

    :cond_29
    :goto_13
    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 4

    iget-object v0, p0, Lzi/b;->s:Lzi/b;

    iget-object v1, p0, Lzi/b;->p:Lzi/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lzi/b;->p:Lzi/e;

    iget-object v0, v0, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p4, v0}, Lwi/e;->a(Ljava/lang/String;)Lwi/e;

    move-result-object v0

    iget-object v2, p0, Lzi/b;->s:Lzi/b;

    iget-object v2, v2, Lzi/b;->p:Lzi/e;

    iget-object v2, v2, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2, v2}, Lwi/e;->b(ILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lzi/b;->s:Lzi/b;

    invoke-virtual {v0, v2}, Lwi/e;->g(Lwi/f;)Lwi/e;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v2, p0, Lzi/b;->s:Lzi/b;

    iget-object v2, v2, Lzi/b;->p:Lzi/e;

    iget-object v2, v2, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2, v2}, Lwi/e;->e(ILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2, v2}, Lwi/e;->f(ILjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lzi/b;->s:Lzi/b;

    iget-object v2, v2, Lzi/b;->p:Lzi/e;

    iget-object v2, v2, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2, v2}, Lwi/e;->d(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v2, p2

    iget-object v3, p0, Lzi/b;->s:Lzi/b;

    invoke-virtual {v3, p1, v2, p3, v0}, Lzi/b;->n(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    :cond_1
    iget-object v0, v1, Lzi/e;->c:Ljava/lang/String;

    iget-object v1, v1, Lzi/e;->c:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwi/e;->e(ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "__container"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p4, v1}, Lwi/e;->a(Ljava/lang/String;)Lwi/e;

    move-result-object p4

    invoke-virtual {p1, p2, v1}, Lwi/e;->b(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p4, p0}, Lwi/e;->g(Lwi/f;)Lwi/e;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1, p2, v1}, Lwi/e;->f(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, p2, v1}, Lwi/e;->d(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p0, p1, v0, p3, p4}, Lzi/b;->n(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    iget-object p1, p0, Lzi/b;->i:Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lzi/b;->h()V

    iget-object p1, p0, Lzi/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    if-eqz p3, :cond_1

    iget-object p2, p0, Lzi/b;->u:Ljava/util/List;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_0
    if-ltz p2, :cond_1

    iget-object p3, p0, Lzi/b;->u:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lzi/b;

    iget-object p3, p3, Lzi/b;->w:Lti/q;

    invoke-virtual {p3}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lzi/b;->t:Lzi/b;

    if-eqz p2, :cond_1

    iget-object p2, p2, Lzi/b;->w:Lti/q;

    invoke-virtual {p2}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_1
    iget-object p2, p0, Lzi/b;->w:Lti/q;

    invoke-virtual {p2}, Lti/q;->e()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    return-void
.end method

.method public final f(Lti/d;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lzi/b;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ld1/j;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzi/b;->w:Lti/q;

    invoke-virtual {v0, p1, p2}, Lti/q;->c(Ld1/j;Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lzi/b;->u:Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lzi/b;->t:Lzi/b;

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lzi/b;->u:Ljava/util/List;

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzi/b;->u:Ljava/util/List;

    iget-object v0, p0, Lzi/b;->t:Lzi/b;

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Lzi/b;->u:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lzi/b;->t:Lzi/b;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public abstract i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILdj/a;)V
.end method

.method public j()Lty/c;
    .locals 1

    iget-object v0, p0, Lzi/b;->p:Lzi/e;

    iget-object v0, v0, Lzi/e;->w:Lty/c;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lzi/b;->q:Ls/m2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lzi/b;->o:Lqi/w;

    iget-object v0, v0, Lqi/w;->w:Lqi/i;

    iget-object v0, v0, Lqi/i;->a:Lqi/e0;

    iget-object v1, p0, Lzi/b;->p:Lzi/e;

    iget-object v1, v1, Lzi/e;->c:Ljava/lang/String;

    iget-object v2, v0, Lqi/e0;->c:Ljava/util/HashMap;

    iget-boolean v3, v0, Lqi/e0;->a:Z

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldj/f;

    if-nez v3, :cond_1

    new-instance v3, Ldj/f;

    invoke-direct {v3}, Ldj/f;-><init>()V

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v3}, Ldj/f;->a()V

    const-string v2, "__container"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lqi/e0;->b:La0/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/b;

    invoke-direct {v1, v0}, La0/b;-><init>(La0/h;)V

    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    return-void
.end method

.method public final m(Lti/d;)V
    .locals 1

    iget-object v0, p0, Lzi/b;->v:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 0

    return-void
.end method

.method public o(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lzi/b;->z:Lri/a;

    if-nez v0, :cond_0

    new-instance v0, Lri/a;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lzi/b;->z:Lri/a;

    :cond_0
    iput-boolean p1, p0, Lzi/b;->y:Z

    return-void
.end method

.method public p(F)V
    .locals 4

    iget-object v0, p0, Lzi/b;->w:Lti/q;

    iget-object v1, v0, Lti/q;->j:Lti/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_0
    iget-object v1, v0, Lti/q;->m:Lti/d;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_1
    iget-object v1, v0, Lti/q;->n:Lti/d;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_2
    iget-object v1, v0, Lti/q;->f:Lti/d;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_3
    iget-object v1, v0, Lti/q;->g:Lti/d;

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_4
    iget-object v1, v0, Lti/q;->h:Lti/d;

    if-eqz v1, :cond_5

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_5
    iget-object v1, v0, Lti/q;->i:Lti/d;

    if-eqz v1, :cond_6

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_6
    iget-object v1, v0, Lti/q;->k:Lti/h;

    if-eqz v1, :cond_7

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_7
    iget-object v0, v0, Lti/q;->l:Lti/h;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p1}, Lti/d;->i(F)V

    :cond_8
    const/4 v0, 0x0

    iget-object v1, p0, Lzi/b;->q:Ls/m2;

    if-eqz v1, :cond_9

    iget-object v1, v1, Ls/m2;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    move v2, v0

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lti/d;

    invoke-virtual {v3, p1}, Lti/d;->i(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_9
    iget-object v1, p0, Lzi/b;->r:Lti/h;

    if-eqz v1, :cond_a

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    :cond_a
    iget-object v1, p0, Lzi/b;->s:Lzi/b;

    if-eqz v1, :cond_b

    invoke-virtual {v1, p1}, Lzi/b;->p(F)V

    :cond_b
    :goto_1
    iget-object v1, p0, Lzi/b;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_c

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lti/d;

    invoke-virtual {v1, p1}, Lti/d;->i(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_c
    return-void
.end method
