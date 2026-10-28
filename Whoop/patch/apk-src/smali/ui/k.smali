.class public final Lui/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Lui/z;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Lqi/i;

.field public final synthetic x:Ly2/k;

.field public final synthetic y:Landroid/graphics/Matrix;

.field public final synthetic z:Lqi/w;


# direct methods
.method public constructor <init>(Lqi/i;Ly2/k;Landroid/graphics/Matrix;Lqi/w;Ljava/util/Map;Lui/z;Lc93/a;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lui/k;->w:Lqi/i;

    iput-object p2, p0, Lui/k;->x:Ly2/k;

    iput-object p3, p0, Lui/k;->y:Landroid/graphics/Matrix;

    iput-object p4, p0, Lui/k;->z:Lqi/w;

    iput-object p5, p0, Lui/k;->E:Ljava/util/Map;

    iput-object p6, p0, Lui/k;->F:Lui/z;

    iput-object p7, p0, Lui/k;->G:Lc93/a;

    iput-object p8, p0, Lui/k;->H:Lp1/c1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v0, p1

    check-cast v0, Lk2/e;

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v1

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v1

    iget-object v2, p0, Lui/k;->w:Lqi/i;

    iget-object v3, v2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, v2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Ljc/x;->b(FF)J

    move-result-wide v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->e(J)F

    move-result v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v6

    invoke-static {v6, v7}, Lh2/e;->c(J)F

    move-result v6

    invoke-static {v6}, Le93/b;->X(F)I

    move-result v6

    invoke-static {v5, v6}, Lv63/b;->a(II)J

    move-result-wide v5

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v7

    iget-object v9, p0, Lui/k;->x:Ly2/k;

    invoke-interface {v9, v3, v4, v7, v8}, Ly2/k;->a(JJ)J

    move-result-wide v7

    invoke-static {v3, v4}, Lh2/e;->e(J)F

    move-result v9

    sget v10, Ly2/p1;->a:I

    const/16 v10, 0x20

    shr-long v11, v7, v10

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    mul-float/2addr v12, v9

    float-to-int v9, v12

    invoke-static {v3, v4}, Lh2/e;->c(J)F

    move-result v3

    const-wide v12, 0xffffffffL

    and-long/2addr v7, v12

    long-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    mul-float/2addr v7, v3

    float-to-int v3, v7

    invoke-static {v9, v3}, Lv63/b;->a(II)J

    move-result-wide v7

    invoke-interface {v0}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object v0

    move p1, v10

    move v3, v11

    shr-long v10, v5, p1

    long-to-int v9, v10

    shr-long v10, v7, p1

    long-to-int v10, v10

    sub-int/2addr v9, v10

    int-to-float v9, v9

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    and-long/2addr v5, v12

    long-to-int v5, v5

    and-long v6, v7, v12

    long-to-int v6, v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    div-float/2addr v5, v10

    sget-object v6, Ly3/m;->w:Ly3/m;

    const/4 v7, 0x0

    if-ne v0, v6, :cond_0

    move v0, v7

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr v0, v7

    :goto_0
    const/4 v6, 0x1

    int-to-float v8, v6

    add-float/2addr v0, v8

    mul-float/2addr v0, v9

    add-float/2addr v8, v7

    mul-float/2addr v8, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v5

    int-to-long v7, v0

    shl-long/2addr v7, p1

    int-to-long v9, v5

    and-long/2addr v9, v12

    or-long/2addr v7, v9

    iget-object v0, p0, Lui/k;->y:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    shr-long v9, v7, p1

    long-to-int v5, v9

    int-to-float v5, v5

    and-long/2addr v7, v12

    long-to-int v7, v7

    int-to-float v7, v7

    invoke-virtual {v0, v5, v7}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v3, p0, Lui/k;->z:Lqi/w;

    iget-object v4, v3, Lqi/w;->L:Lad3/z;

    iget-object v4, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashSet;

    sget-object v5, Lqi/x;->w:Lqi/x;

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v3, Lqi/w;->w:Lqi/i;

    if-eqz v5, :cond_1

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lqi/w;->c()V

    :cond_1
    sget-object v4, Lqi/g0;->w:Lqi/g0;

    iput-object v4, v3, Lqi/w;->V:Lqi/g0;

    invoke-virtual {v3}, Lqi/w;->e()V

    sget-object v4, Lqi/a;->w:Lqi/a;

    iput-object v4, v3, Lqi/w;->l0:Lqi/a;

    invoke-virtual {v3, v2}, Lqi/w;->p(Lqi/i;)Z

    iget-object v4, v3, Lqi/w;->J:Ljava/util/Map;

    iget-object v5, p0, Lui/k;->E:Ljava/util/Map;

    if-ne v5, v4, :cond_2

    goto :goto_1

    :cond_2
    iput-object v5, v3, Lqi/w;->J:Ljava/util/Map;

    invoke-virtual {v3}, Lqi/w;->invalidateSelf()V

    :goto_1
    iget-object v4, p0, Lui/k;->H:Lp1/c1;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lui/z;

    iget-object v7, p0, Lui/k;->F:Lui/z;

    if-eq v7, v5, :cond_15

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lui/z;

    if-eqz v5, :cond_b

    iget-object v8, v5, Lui/z;->a:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_2

    :cond_3
    iget-object v8, v5, Lui/z;->b:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_3

    :cond_4
    iget-object v8, v5, Lui/z;->c:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_4

    :cond_5
    iget-object v8, v5, Lui/z;->d:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_5

    :cond_6
    iget-object v8, v5, Lui/z;->e:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_6

    :cond_7
    iget-object v8, v5, Lui/z;->f:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_7

    :cond_8
    iget-object v8, v5, Lui/z;->g:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_8

    :cond_9
    iget-object v8, v5, Lui/z;->h:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lui/a0;

    invoke-virtual {v9}, Lui/a0;->b()Lwi/e;

    move-result-object v11

    invoke-virtual {v9}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v11, v9, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_9

    :cond_a
    iget-object v5, v5, Lui/z;->i:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v9, v8, v10}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_a

    :cond_b
    if-eqz v7, :cond_14

    iget-object v5, v7, Lui/z;->a:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_b

    :cond_c
    iget-object v5, v7, Lui/z;->b:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_c

    :cond_d
    iget-object v5, v7, Lui/z;->c:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_d

    :cond_e
    iget-object v5, v7, Lui/z;->d:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_e

    :cond_f
    iget-object v5, v7, Lui/z;->e:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_f

    :cond_10
    iget-object v5, v7, Lui/z;->f:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_10

    :cond_11
    iget-object v5, v7, Lui/z;->g:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_11

    :cond_12
    iget-object v5, v7, Lui/z;->h:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_12

    :cond_13
    iget-object v5, v7, Lui/z;->i:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lui/a0;

    invoke-virtual {v8}, Lui/a0;->b()Lwi/e;

    move-result-object v9

    invoke-virtual {v8}, Lui/a0;->c()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8}, Lui/a0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v8

    invoke-static {v8}, Ls2/h;->f(Lkotlin/jvm/functions/Function1;)Lti/f;

    move-result-object v8

    invoke-virtual {v3, v9, v10, v8}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    goto :goto_13

    :cond_14
    invoke-interface {v4, v7}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_15
    iget-boolean v4, v3, Lqi/w;->R:Z

    const/4 v5, 0x0

    if-nez v4, :cond_16

    goto :goto_14

    :cond_16
    iput-boolean v5, v3, Lqi/w;->R:Z

    iget-object v4, v3, Lqi/w;->O:Lzi/c;

    if-eqz v4, :cond_17

    invoke-virtual {v4, v5}, Lzi/c;->o(Z)V

    :cond_17
    :goto_14
    iput-boolean v5, v3, Lqi/w;->S:Z

    iput-boolean v5, v3, Lqi/w;->M:Z

    iget-boolean v4, v3, Lqi/w;->N:Z

    if-eq v6, v4, :cond_19

    iput-boolean v6, v3, Lqi/w;->N:Z

    iget-object v4, v3, Lqi/w;->O:Lzi/c;

    if-eqz v4, :cond_18

    iput-boolean v6, v4, Lzi/c;->L:Z

    :cond_18
    invoke-virtual {v3}, Lqi/w;->invalidateSelf()V

    :cond_19
    iget-object v4, p0, Lui/k;->G:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-virtual {v3, v4}, Lqi/w;->w(F)V

    iget-object v4, v2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget-object v2, v2, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v3, v5, v5, v4, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-static {v1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v1

    invoke-virtual {v3, v1, v0}, Lqi/w;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
