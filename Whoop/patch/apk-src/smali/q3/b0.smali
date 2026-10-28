.class public final Lq3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/t;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:La3/p;

.field public final c:Lq3/c0;

.field public d:Z

.field public e:Lkotlin/jvm/functions/Function1;

.field public f:Lkotlin/jvm/functions/Function1;

.field public g:Lq3/y;

.field public h:Lq3/l;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/lang/Object;

.field public k:Landroid/graphics/Rect;

.field public final l:Lq3/d;

.field public final m:Lr1/c;

.field public n:Llr/e;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 5

    new-instance v0, La3/p;

    invoke-direct {v0, p1}, La3/p;-><init>(Landroid/view/View;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v1

    new-instance v2, Lq3/c0;

    invoke-direct {v2, v1}, Lq3/c0;-><init>(Landroid/view/Choreographer;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/b0;->a:Landroid/view/View;

    iput-object v0, p0, Lq3/b0;->b:La3/p;

    iput-object v2, p0, Lq3/b0;->c:Lq3/c0;

    sget-object p1, Lq3/c;->y:Lq3/c;

    iput-object p1, p0, Lq3/b0;->e:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lq3/c;->z:Lq3/c;

    iput-object p1, p0, Lq3/b0;->f:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lq3/y;

    sget-wide v1, Ll3/u0;->b:J

    const/4 v3, 0x4

    const-string v4, ""

    invoke-direct {p1, v3, v4, v1, v2}, Lq3/y;-><init>(ILjava/lang/String;J)V

    iput-object p1, p0, Lq3/b0;->g:Lq3/y;

    sget-object p1, Lq3/l;->g:Lq3/l;

    iput-object p1, p0, Lq3/b0;->h:Lq3/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    sget-object p1, Ll83/i;->y:Ll83/i;

    new-instance v1, La3/l0;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lq3/b0;->j:Ljava/lang/Object;

    new-instance p1, Lq3/d;

    invoke-direct {p1, p2, v0}, Lq3/d;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;La3/p;)V

    iput-object p1, p0, Lq3/b0;->l:Lq3/d;

    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [Lq3/a0;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lq3/b0;->m:Lr1/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    sget-object v0, Lq3/a0;->w:Lq3/a0;

    invoke-virtual {p0, v0}, Lq3/b0;->i(Lq3/a0;)V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq3/b0;->d:Z

    sget-object v0, Lq3/b;->y:Lq3/b;

    iput-object v0, p0, Lq3/b0;->e:Lkotlin/jvm/functions/Function1;

    sget-object v0, Lq3/b;->z:Lq3/b;

    iput-object v0, p0, Lq3/b0;->f:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    iput-object v0, p0, Lq3/b0;->k:Landroid/graphics/Rect;

    sget-object v0, Lq3/a0;->x:Lq3/a0;

    invoke-virtual {p0, v0}, Lq3/b0;->i(Lq3/a0;)V

    return-void
.end method

.method public final c(Lq3/y;Lq3/y;)V
    .locals 8

    iget-object v0, p0, Lq3/b0;->g:Lq3/y;

    iget-wide v0, v0, Lq3/y;->b:J

    iget-wide v2, p2, Lq3/y;->b:J

    invoke-static {v0, v1, v2, v3}, Ll3/u0;->b(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq3/b0;->g:Lq3/y;

    iget-object v0, v0, Lq3/y;->c:Ll3/u0;

    iget-object v2, p2, Lq3/y;->c:Ll3/u0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object p2, p0, Lq3/b0;->g:Lq3/y;

    iget-object v2, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    iget-object v4, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq3/u;

    if-eqz v4, :cond_2

    invoke-virtual {v4, p2}, Lq3/u;->d(Lq3/y;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lq3/b0;->l:Lq3/d;

    iget-object v3, v2, Lq3/d;->c:Ljava/lang/Object;

    monitor-enter v3

    const/4 v4, 0x0

    :try_start_0
    iput-object v4, v2, Lq3/d;->j:Lq3/y;

    iput-object v4, v2, Lq3/d;->l:Lq3/r;

    iput-object v4, v2, Lq3/d;->k:Ll3/r0;

    sget-object v5, Lq3/b;->x:Lq3/b;

    iput-object v5, v2, Lq3/d;->m:Lkotlin/jvm/functions/Function1;

    iput-object v4, v2, Lq3/d;->n:Lh2/c;

    iput-object v4, v2, Lq3/d;->o:Lh2/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v0, :cond_a

    iget-object p1, p0, Lq3/b0;->b:La3/p;

    iget-wide v0, p2, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->f(J)I

    move-result v4

    iget-wide v0, p2, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->e(J)I

    move-result v5

    iget-object p2, p0, Lq3/b0;->g:Lq3/y;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    const/4 v0, -0x1

    if-eqz p2, :cond_4

    iget-wide v1, p2, Ll3/u0;->a:J

    invoke-static {v1, v2}, Ll3/u0;->f(J)I

    move-result p2

    move v6, p2

    goto :goto_3

    :cond_4
    move v6, v0

    :goto_3
    iget-object p2, p0, Lq3/b0;->g:Lq3/y;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    if-eqz p2, :cond_5

    iget-wide v0, p2, Ll3/u0;->a:J

    invoke-static {v0, v1}, Ll3/u0;->e(J)I

    move-result v0

    :cond_5
    move v7, v0

    iget-object p2, p1, La3/p;->y:Ljava/lang/Object;

    invoke-interface {p2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroid/view/View;

    invoke-virtual/range {v2 .. v7}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    return-void

    :cond_6
    if-eqz p1, :cond_8

    iget-object v0, p1, Lq3/y;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    iget-object v2, p2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-wide v2, p1, Lq3/y;->b:J

    iget-wide v4, p2, Lq3/y;->b:J

    invoke-static {v2, v3, v4, v5}, Ll3/u0;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p1, Lq3/y;->c:Ll3/u0;

    iget-object p2, p2, Lq3/y;->c:Ll3/u0;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    iget-object p1, p0, Lq3/b0;->b:La3/p;

    iget-object p2, p1, La3/p;->y:Ljava/lang/Object;

    invoke-interface {p2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    iget-object p1, p1, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    return-void

    :cond_8
    iget-object p1, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_4
    if-ge v1, p1, :cond_a

    iget-object p2, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lq3/u;

    if-eqz p2, :cond_9

    iget-object v0, p0, Lq3/b0;->g:Lq3/y;

    iget-object v2, p0, Lq3/b0;->b:La3/p;

    invoke-virtual {p2, v0, v2}, Lq3/u;->e(Lq3/y;La3/p;)V

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v3

    throw p1
.end method

.method public final d()V
    .locals 1

    sget-object v0, Lq3/a0;->z:Lq3/a0;

    invoke-virtual {p0, v0}, Lq3/b0;->i(Lq3/a0;)V

    return-void
.end method

.method public final e(Lh2/c;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Lh2/c;->a:F

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    iget v2, p1, Lh2/c;->b:F

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v2

    iget v3, p1, Lh2/c;->c:F

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    iget p1, p1, Lh2/c;->d:F

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lq3/b0;->k:Landroid/graphics/Rect;

    iget-object p1, p0, Lq3/b0;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq3/b0;->k:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lq3/b0;->a:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public final f(Lq3/y;Lq3/l;Ls90/f;Lu0/v;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq3/b0;->d:Z

    iput-object p1, p0, Lq3/b0;->g:Lq3/y;

    iput-object p2, p0, Lq3/b0;->h:Lq3/l;

    iput-object p3, p0, Lq3/b0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lq3/b0;->f:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lq3/a0;->w:Lq3/a0;

    invoke-virtual {p0, p1}, Lq3/b0;->i(Lq3/a0;)V

    return-void
.end method

.method public final g(Lq3/y;Lq3/r;Ll3/r0;Ls;Lh2/c;Lh2/c;)V
    .locals 2

    iget-object v0, p0, Lq3/b0;->l:Lq3/d;

    iget-object v1, v0, Lq3/d;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, v0, Lq3/d;->j:Lq3/y;

    iput-object p2, v0, Lq3/d;->l:Lq3/r;

    iput-object p3, v0, Lq3/d;->k:Ll3/r0;

    iput-object p4, v0, Lq3/d;->m:Lkotlin/jvm/functions/Function1;

    iput-object p5, v0, Lq3/d;->n:Lh2/c;

    iput-object p6, v0, Lq3/d;->o:Lh2/c;

    iget-boolean p1, v0, Lq3/d;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, v0, Lq3/d;->d:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lq3/d;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final h()V
    .locals 1

    sget-object v0, Lq3/a0;->y:Lq3/a0;

    invoke-virtual {p0, v0}, Lq3/b0;->i(Lq3/a0;)V

    return-void
.end method

.method public final i(Lq3/a0;)V
    .locals 1

    iget-object v0, p0, Lq3/b0;->m:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lq3/b0;->n:Llr/e;

    if-nez p1, :cond_0

    new-instance p1, Llr/e;

    const/16 v0, 0x8

    invoke-direct {p1, p0, v0}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lq3/b0;->c:Lq3/c0;

    invoke-virtual {v0, p1}, Lq3/c0;->execute(Ljava/lang/Runnable;)V

    iput-object p1, p0, Lq3/b0;->n:Llr/e;

    :cond_0
    return-void
.end method
