.class public final Ld1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/t;


# instance fields
.field public a:Ld1/k;

.field public b:Lbc3/c2;

.field public c:Ld1/o;

.field public d:Lec3/w1;


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ld1/b;->j(Lam2/r;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Ld1/b;->b:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Ld1/b;->b:Lbc3/c2;

    invoke-virtual {p0}, Ld1/b;->i()Lec3/o1;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Lec3/w1;

    invoke-virtual {v0}, Lec3/w1;->d()V

    :cond_1
    return-void
.end method

.method public final c(Lq3/y;Lq3/y;)V
    .locals 13

    iget-object v0, p0, Ld1/b;->c:Ld1/o;

    if-eqz v0, :cond_e

    iget-object v1, v0, Ld1/o;->h:Lq3/y;

    iget-wide v1, v1, Lq3/y;->b:J

    iget-wide v3, p2, Lq3/y;->b:J

    invoke-static {v1, v2, v3, v4}, Ll3/u0;->b(JJ)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Ld1/o;->h:Lq3/y;

    iget-object v1, v1, Lq3/y;->c:Ll3/u0;

    iget-object v3, p2, Lq3/y;->c:Ll3/u0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-object p2, v0, Ld1/o;->h:Lq3/y;

    iget-object v3, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_2
    if-ge v4, v3, :cond_3

    iget-object v5, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld1/p;

    if-eqz v5, :cond_2

    iput-object p2, v5, Ld1/p;->g:Lq3/y;

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    iget-object v3, v0, Ld1/o;->m:Ld1/l;

    iget-object v4, v3, Ld1/l;->c:Ljava/lang/Object;

    monitor-enter v4

    const/4 v5, 0x0

    :try_start_0
    iput-object v5, v3, Ld1/l;->j:Lq3/y;

    iput-object v5, v3, Ld1/l;->l:Lq3/r;

    iput-object v5, v3, Ld1/l;->k:Ll3/r0;

    iput-object v5, v3, Ld1/l;->m:Lh2/c;

    iput-object v5, v3, Ld1/l;->n:Lh2/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_6

    if-eqz v1, :cond_e

    iget-object p1, v0, Ld1/o;->b:Ld1/j;

    iget-wide v1, p2, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result v7

    iget-wide v1, p2, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result v8

    iget-object p2, v0, Ld1/o;->h:Lq3/y;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    if-eqz p2, :cond_4

    iget-wide v1, p2, Ll3/u0;->a:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result p2

    move v9, p2

    goto :goto_3

    :cond_4
    move v9, v4

    :goto_3
    iget-object p2, v0, Ld1/o;->h:Lq3/y;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    if-eqz p2, :cond_5

    iget-wide v0, p2, Ll3/u0;->a:J

    invoke-static {v0, v1}, Ll3/u0;->e(J)I

    move-result v4

    :cond_5
    move v10, v4

    invoke-virtual {p1}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v5

    iget-object p1, p1, Ld1/j;->x:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Landroid/view/View;

    invoke-virtual/range {v5 .. v10}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void

    :cond_6
    if-eqz p1, :cond_8

    iget-object v1, p1, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    iget-object v3, p2, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-wide v5, p1, Lq3/y;->b:J

    iget-wide v7, p2, Lq3/y;->b:J

    invoke-static {v5, v6, v7, v8}, Ll3/u0;->b(JJ)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object p1, p1, Lq3/y;->c:Ll3/u0;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    iget-object p1, v0, Ld1/o;->b:Ld1/j;

    invoke-virtual {p1}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object p2

    iget-object p1, p1, Ld1/j;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void

    :cond_8
    iget-object p1, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_4
    if-ge v2, p1, :cond_e

    iget-object p2, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld1/p;

    if-eqz p2, :cond_d

    iget-object v1, v0, Ld1/o;->h:Lq3/y;

    iget-object v3, v0, Ld1/o;->b:Ld1/j;

    iget-boolean v5, p2, Ld1/p;->k:Z

    if-nez v5, :cond_9

    goto :goto_7

    :cond_9
    iput-object v1, p2, Ld1/p;->g:Lq3/y;

    iget-boolean v5, p2, Ld1/p;->i:Z

    if-eqz v5, :cond_a

    iget p2, p2, Ld1/p;->h:I

    invoke-static {v1}, Lbp/b;->e(Lq3/y;)Landroid/view/inputmethod/ExtractedText;

    move-result-object v5

    invoke-virtual {v3}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v6

    iget-object v7, v3, Ld1/j;->x:Ljava/lang/Object;

    check-cast v7, Landroid/view/View;

    invoke-virtual {v6, v7, p2, v5}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    :cond_a
    iget-object p2, v1, Lq3/y;->c:Ll3/u0;

    iget-wide v5, v1, Lq3/y;->b:J

    if-eqz p2, :cond_b

    iget-wide v7, p2, Ll3/u0;->a:J

    invoke-static {v7, v8}, Ll3/u0;->f(J)I

    move-result p2

    move v11, p2

    goto :goto_5

    :cond_b
    move v11, v4

    :goto_5
    iget-object p2, v1, Lq3/y;->c:Ll3/u0;

    if-eqz p2, :cond_c

    iget-wide v7, p2, Ll3/u0;->a:J

    invoke-static {v7, v8}, Ll3/u0;->e(J)I

    move-result p2

    move v12, p2

    goto :goto_6

    :cond_c
    move v12, v4

    :goto_6
    invoke-static {v5, v6}, Ll3/u0;->f(J)I

    move-result v9

    invoke-static {v5, v6}, Ll3/u0;->e(J)I

    move-result v10

    invoke-virtual {v3}, Ld1/j;->y()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v7

    iget-object p2, v3, Ld1/j;->x:Ljava/lang/Object;

    move-object v8, p2

    check-cast v8, Landroid/view/View;

    invoke-virtual/range {v7 .. v12}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    :cond_d
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v4

    throw p1

    :cond_e
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Ld1/b;->a:Ld1/k;

    if-eqz v0, :cond_0

    sget-object v1, Lb3/v1;->p:Lp1/u2;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x2;

    if-eqz v0, :cond_0

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->a()V

    :cond_0
    return-void
.end method

.method public final e(Lh2/c;)V
    .locals 5

    iget-object v0, p0, Ld1/b;->c:Ld1/o;

    if-eqz v0, :cond_0

    new-instance v1, Landroid/graphics/Rect;

    iget v2, p1, Lh2/c;->a:F

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    iget v3, p1, Lh2/c;->b:F

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    iget v4, p1, Lh2/c;->c:F

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    iget p1, p1, Lh2/c;->d:F

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-direct {v1, v2, v3, v4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, v0, Ld1/o;->l:Landroid/graphics/Rect;

    iget-object p1, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, v0, Ld1/o;->l:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    iget-object v0, v0, Ld1/o;->a:Landroid/view/View;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public final f(Lq3/y;Lq3/l;Ls90/f;Lu0/v;)V
    .locals 7

    new-instance v0, Lam2/r;

    const/4 v6, 0x6

    move-object v2, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p0, v0}, Ld1/b;->j(Lam2/r;)V

    return-void
.end method

.method public final g(Lq3/y;Lq3/r;Ll3/r0;Ls;Lh2/c;Lh2/c;)V
    .locals 1

    iget-object p4, p0, Ld1/b;->c:Ld1/o;

    if-eqz p4, :cond_2

    iget-object p4, p4, Ld1/o;->m:Ld1/l;

    iget-object v0, p4, Ld1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p4, Ld1/l;->j:Lq3/y;

    iput-object p2, p4, Ld1/l;->l:Lq3/r;

    iput-object p3, p4, Ld1/l;->k:Ll3/r0;

    iput-object p5, p4, Ld1/l;->m:Lh2/c;

    iput-object p6, p4, Ld1/l;->n:Lh2/c;

    iget-boolean p1, p4, Ld1/l;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, p4, Ld1/l;->d:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p4}, Ld1/l;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_2
    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Ld1/b;->a:Ld1/k;

    if-eqz v0, :cond_0

    sget-object v1, Lb3/v1;->p:Lp1/u2;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x2;

    if-eqz v0, :cond_0

    check-cast v0, Lb3/x1;

    invoke-virtual {v0}, Lb3/x1;->b()V

    :cond_0
    return-void
.end method

.method public final i()Lec3/o1;
    .locals 4

    iget-object v0, p0, Ld1/b;->d:Lec3/w1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-boolean v0, Lc1/b;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    sget-object v0, Ldc3/a;->y:Ldc3/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Ld1/b;->d:Lec3/w1;

    return-object v0
.end method

.method public final j(Lam2/r;)V
    .locals 7

    iget-object v3, p0, Ld1/b;->a:Ld1/k;

    if-nez v3, :cond_0

    return-void

    :cond_0
    new-instance v0, Lb2/y;

    const/4 v5, 0x1

    const/4 v4, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-boolean p1, v3, Lb2/v;->N:Z

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p1

    sget-object v1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, Le;

    const/16 v6, 0x1d

    invoke-direct {v5, v3, v0, v4, v6}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x1

    invoke-static {p1, v4, v1, v5, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v4

    :goto_0
    iput-object v4, v2, Ld1/b;->b:Lbc3/c2;

    return-void
.end method

.method public final k(Ld1/k;)V
    .locals 2

    iget-object v0, p0, Ld1/b;->a:Ld1/k;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected textInputModifierNode to be "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ld1/b;->a:Ld1/k;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Ld1/b;->a:Ld1/k;

    return-void
.end method
