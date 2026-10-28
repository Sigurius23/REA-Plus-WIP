.class public final Ly2/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/i;


# instance fields
.field public E:I

.field public final F:La0/v0;

.field public final G:La0/v0;

.field public final H:Ly2/h0;

.field public final I:Ly2/e0;

.field public final J:La0/v0;

.field public final K:Ly2/w1;

.field public final L:La0/v0;

.field public final M:Lr1/c;

.field public N:I

.field public O:I

.field public final P:Ljava/lang/String;

.field public final w:La3/n0;

.field public x:Lp1/t;

.field public y:Ly2/x1;

.field public z:I


# direct methods
.method public constructor <init>(La3/n0;Ly2/x1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/n0;->w:La3/n0;

    iput-object p2, p0, Ly2/n0;->y:Ly2/x1;

    sget-object p1, La0/d1;->a:[J

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Ly2/n0;->F:La0/v0;

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Ly2/n0;->G:La0/v0;

    new-instance p1, Ly2/h0;

    invoke-direct {p1, p0}, Ly2/h0;-><init>(Ly2/n0;)V

    iput-object p1, p0, Ly2/n0;->H:Ly2/h0;

    new-instance p1, Ly2/e0;

    invoke-direct {p1, p0}, Ly2/e0;-><init>(Ly2/n0;)V

    iput-object p1, p0, Ly2/n0;->I:Ly2/e0;

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Ly2/n0;->J:La0/v0;

    new-instance p1, Ly2/w1;

    invoke-direct {p1}, Ly2/w1;-><init>()V

    iput-object p1, p0, Ly2/n0;->K:Ly2/w1;

    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    iput-object p1, p0, Ly2/n0;->L:La0/v0;

    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [Ljava/lang/Object;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Ly2/n0;->M:Lr1/c;

    const-string p1, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    iput-object p1, p0, Ly2/n0;->P:Ljava/lang/String;

    return-void
.end method

.method public static b(Ly2/f0;)V
    .locals 5

    iget-object v0, p0, Ly2/f0;->f:Lp1/m1;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lp1/m1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lp1/n1;->x:Lp1/n1;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, v0, Lp1/m1;->j:Lx1/h;

    iget-object v2, v1, Lx1/h;->d:La0/w0;

    invoke-virtual {v2}, La0/w0;->h()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Lx1/h;->d:La0/w0;

    sget-object v4, La0/e1;->a:La0/w0;

    new-instance v4, La0/w0;

    invoke-direct {v4}, La0/w0;-><init>()V

    iput-object v4, v1, Lx1/h;->d:La0/w0;

    iget-object v4, v1, Lx1/h;->c:Lr1/c;

    invoke-virtual {v4}, Lr1/c;->g()V

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {v1}, Lx1/h;->b()V

    iget-object v0, v0, Lp1/m1;->a:Lp1/w;

    iput-object v3, v0, Lp1/w;->Q:Lp1/m1;

    if-eqz v2, :cond_1

    iget-object v1, v0, Lp1/w;->U:Lx1/h;

    iput-object v2, v1, Lx1/h;->k:La0/w0;

    const/4 v1, 0x2

    iput v1, v0, Lp1/w;->W:I

    :cond_1
    iput-object v3, p0, Ly2/f0;->f:Lp1/m1;

    iget-object v0, p0, Ly2/f0;->c:Lp1/w;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lp1/w;->dispose()V

    :cond_2
    iput-object v3, p0, Ly2/f0;->c:Lp1/w;

    :cond_3
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ly2/n0;->g(Z)V

    return-void
.end method

.method public final c(I)V
    .locals 13

    const/4 v0, 0x0

    iput v0, p0, Ly2/n0;->N:I

    iget-object v1, p0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr1/b;

    iget-object v3, v2, Lr1/b;->w:Lr1/c;

    iget v3, v3, Lr1/c;->y:I

    iget v4, p0, Ly2/n0;->O:I

    sub-int/2addr v3, v4

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-gt p1, v3, :cond_7

    iget-object v5, p0, Ly2/n0;->K:Ly2/w1;

    invoke-virtual {v5}, Ly2/w1;->clear()V

    if-gt p1, v3, :cond_0

    move v5, p1

    :goto_0
    invoke-virtual {v2, v5}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/n0;

    iget-object v7, p0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v7, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v6, Ly2/f0;

    iget-object v6, v6, Ly2/f0;->a:Ljava/lang/Object;

    iget-object v7, p0, Ly2/n0;->K:Ly2/w1;

    iget-object v7, v7, Ly2/w1;->w:La0/r0;

    invoke-virtual {v7, v6}, La0/r0;->a(Ljava/lang/Object;)Z

    if-eq v5, v3, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ly2/n0;->y:Ly2/x1;

    iget-object v5, p0, Ly2/n0;->K:Ly2/w1;

    invoke-interface {v2, v5}, Ly2/x1;->b(Ly2/w1;)V

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-static {v2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v6

    move v7, v0

    :goto_2
    if-lt v3, p1, :cond_6

    :try_start_0
    move-object v8, v1

    check-cast v8, Lr1/b;

    invoke-virtual {v8, v3}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La3/n0;

    iget-object v9, p0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v9, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v9, Ly2/f0;

    iget-object v10, v9, Ly2/f0;->a:Ljava/lang/Object;

    iget-object v11, p0, Ly2/n0;->K:Ly2/w1;

    iget-object v11, v11, Ly2/w1;->w:La0/r0;

    invoke-virtual {v11, v10}, La0/r0;->c(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    iget v11, p0, Ly2/n0;->N:I

    add-int/2addr v11, v4

    iput v11, p0, Ly2/n0;->N:I

    iget-object v11, v9, Ly2/f0;->g:Lp1/k1;

    invoke-virtual {v11}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v8}, La3/n0;->z()La3/g1;

    move-result-object v11

    sget-object v12, La3/j0;->y:La3/j0;

    iput-object v12, v11, La3/g1;->L:La3/j0;

    invoke-virtual {v8}, La3/n0;->y()La3/c1;

    move-result-object v8

    if-eqz v8, :cond_2

    iput-object v12, v8, La3/c1;->J:La3/j0;

    :cond_2
    invoke-virtual {p0, v9, v0}, Ly2/n0;->h(Ly2/f0;Z)V

    iget-boolean v8, v9, Ly2/f0;->h:Z

    if-eqz v8, :cond_5

    move v7, v4

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_3
    iget-object v11, p0, Ly2/n0;->w:La3/n0;

    iput-boolean v4, v11, La3/n0;->P:Z

    iget-object v12, p0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v12, v8}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v9, Ly2/f0;->c:Lp1/w;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lp1/w;->dispose()V

    :cond_4
    iget-object v8, p0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v8, v3, v4}, La3/n0;->q0(II)V

    iput-boolean v0, v11, La3/n0;->P:Z

    :cond_5
    :goto_3
    iget-object v8, p0, Ly2/n0;->G:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :goto_4
    invoke-static {v2, v6, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1

    :cond_6
    invoke-static {v2, v6, v5}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    :cond_7
    move v7, v0

    :goto_5
    if-eqz v7, :cond_9

    sget-object p1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    sget-object v1, Lz1/l;->j:Lz1/a;

    iget-object v1, v1, Lz1/b;->h:La0/w0;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, La0/w0;->h()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v4, :cond_8

    move v0, v4

    :cond_8
    monitor-exit p1

    if-eqz v0, :cond_9

    invoke-static {}, Lz1/l;->a()V

    goto :goto_6

    :catchall_1
    move-exception v0

    monitor-exit p1

    throw v0

    :cond_9
    :goto_6
    invoke-virtual {p0}, Ly2/n0;->d()V

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v0}, La3/n0;->r()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lr1/b;

    iget-object v0, v0, Lr1/b;->w:Lr1/c;

    iget v0, v0, Lr1/c;->y:I

    iget-object v1, p0, Ly2/n0;->F:La0/v0;

    iget v2, v1, La0/v0;->e:I

    if-ne v2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inconsistency between the count of nodes tracked by the state ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, La0/v0;->e:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") and the children count on the SubcomposeLayout ("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_0
    iget v1, p0, Ly2/n0;->N:I

    sub-int v1, v0, v1

    iget v2, p0, Ly2/n0;->O:I

    sub-int/2addr v1, v2

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "Incorrect state. Total children "

    const-string v2, ". Reusable children "

    invoke-static {v0, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ly2/n0;->N:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Precomposed children "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ly2/n0;->O:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Ly2/n0;->J:La0/v0;

    iget v1, v0, La0/v0;->e:I

    iget v2, p0, Ly2/n0;->O:I

    if-ne v1, v2, :cond_2

    return-void

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect state. Precomposed children "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ly2/n0;->O:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". Map size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, La0/v0;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly2/n0;->g(Z)V

    return-void
.end method

.method public final f()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x1

    iget-object v2, v0, Ly2/n0;->w:La3/n0;

    iput-boolean v1, v2, La3/n0;->P:Z

    iget-object v1, v0, Ly2/n0;->F:La0/v0;

    iget-object v3, v1, La0/v0;->c:[Ljava/lang/Object;

    iget-object v4, v1, La0/v0;->a:[J

    array-length v5, v4

    add-int/lit8 v5, v5, -0x2

    const/4 v6, 0x0

    if-ltz v5, :cond_3

    move v7, v6

    :goto_0
    aget-wide v8, v4, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v6

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget-object v13, v3, v13

    check-cast v13, Ly2/f0;

    iget-object v13, v13, Ly2/f0;->c:Lp1/w;

    if-eqz v13, :cond_0

    invoke-virtual {v13}, Lp1/w;->dispose()V

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, La3/n0;->p0()V

    iput-boolean v6, v2, La3/n0;->P:Z

    invoke-virtual {v1}, La0/v0;->a()V

    iget-object v1, v0, Ly2/n0;->G:La0/v0;

    invoke-virtual {v1}, La0/v0;->a()V

    iput v6, v0, Ly2/n0;->O:I

    iput v6, v0, Ly2/n0;->N:I

    iget-object v1, v0, Ly2/n0;->J:La0/v0;

    invoke-virtual {v1}, La0/v0;->a()V

    invoke-virtual {v0}, Ly2/n0;->d()V

    return-void
.end method

.method public final g(Z)V
    .locals 10

    const/4 v0, 0x0

    iput v0, p0, Ly2/n0;->O:I

    iget-object v1, p0, Ly2/n0;->J:La0/v0;

    invoke-virtual {v1}, La0/v0;->a()V

    iget-object v1, p0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr1/b;

    iget-object v2, v2, Lr1/b;->w:Lr1/c;

    iget v2, v2, Lr1/c;->y:I

    iget v3, p0, Ly2/n0;->N:I

    if-eq v3, v2, :cond_4

    iput v2, p0, Ly2/n0;->N:I

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v3}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v5

    :goto_1
    if-ge v0, v2, :cond_3

    :try_start_0
    move-object v6, v1

    check-cast v6, Lr1/b;

    invoke-virtual {v6, v0}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La3/n0;

    iget-object v7, p0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v7, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly2/f0;

    if-eqz v7, :cond_2

    iget-object v8, v7, Ly2/f0;->g:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6}, La3/n0;->z()La3/g1;

    move-result-object v8

    sget-object v9, La3/j0;->y:La3/j0;

    iput-object v9, v8, La3/g1;->L:La3/j0;

    invoke-virtual {v6}, La3/n0;->y()La3/c1;

    move-result-object v6

    if-eqz v6, :cond_1

    iput-object v9, v6, La3/c1;->J:La3/j0;

    :cond_1
    invoke-virtual {p0, v7, p1}, Ly2/n0;->h(Ly2/f0;Z)V

    sget-object v6, Ly2/q1;->a:Ly2/b1;

    iput-object v6, v7, Ly2/f0;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :goto_3
    invoke-static {v3, v5, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1

    :cond_3
    invoke-static {v3, v5, v4}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Ly2/n0;->G:La0/v0;

    invoke-virtual {p1}, La0/v0;->a()V

    :cond_4
    invoke-virtual {p0}, Ly2/n0;->d()V

    return-void
.end method

.method public final h(Ly2/f0;Z)V
    .locals 2

    if-nez p2, :cond_0

    iget-boolean v0, p1, Ly2/f0;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ly2/f0;->g:Lp1/k1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p1, Ly2/f0;->g:Lp1/k1;

    :goto_0
    iget-object v0, p1, Ly2/f0;->f:Lp1/m1;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ly2/n0;->b(Ly2/f0;)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p1, Ly2/f0;->c:Lp1/w;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lp1/w;->l()V

    return-void

    :cond_2
    iget-object p2, p0, Ly2/n0;->w:La3/n0;

    invoke-static {p2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object p2

    invoke-interface {p2}, Landroidx/compose/ui/node/Owner;->getOutOfFrameExecutor()La3/z1;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v0, Lm5/k;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    check-cast p2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Landroidx/fragment/app/m;

    const/4 v1, 0x5

    invoke-direct {p2, v0, v1}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "schedule is called when outOfFrameExecutor is not available (view is detached)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-boolean p2, p1, Ly2/f0;->h:Z

    if-nez p2, :cond_5

    iget-object p1, p1, Ly2/f0;->c:Lp1/w;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lp1/w;->l()V

    :cond_5
    return-void
.end method

.method public final i(La3/n0;Ljava/lang/Object;ZLc93/m;)V
    .locals 11

    iget-object v0, p0, Ly2/n0;->F:La0/v0;

    invoke-virtual {v0, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    new-instance v1, Ly2/f0;

    sget-object v3, Ly2/i;->a:Lx1/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object p2, v1, Ly2/f0;->a:Ljava/lang/Object;

    iput-object v3, v1, Ly2/f0;->b:Lc93/m;

    iput-object v2, v1, Ly2/f0;->c:Lp1/w;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, v1, Ly2/f0;->g:Lp1/k1;

    invoke-virtual {v0, p1, v1}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Ly2/f0;

    iget-object p2, v1, Ly2/f0;->b:Lc93/m;

    const/4 v0, 0x0

    const/4 v3, 0x1

    if-eq p2, p4, :cond_1

    move p2, v3

    goto :goto_0

    :cond_1
    move p2, v0

    :goto_0
    iget-object v4, v1, Ly2/f0;->f:Lp1/m1;

    const/16 v5, 0xa

    if-eqz v4, :cond_6

    if-eqz p2, :cond_2

    invoke-static {v1}, Ly2/n0;->b(Ly2/f0;)V

    goto :goto_4

    :cond_2
    if-eqz p3, :cond_3

    goto :goto_7

    :cond_3
    iget-object v4, v1, Ly2/f0;->f:Lp1/m1;

    if-eqz v4, :cond_6

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v7

    goto :goto_1

    :cond_4
    move-object v7, v2

    :goto_1
    invoke-static {v6}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v8

    :try_start_0
    iget-object v9, p0, Ly2/n0;->w:La3/n0;

    iput-boolean v3, v9, La3/n0;->P:Z

    :goto_2
    invoke-virtual {v4}, Lp1/m1;->c()Z

    move-result v10

    if-nez v10, :cond_5

    new-instance v10, Lux/f0;

    invoke-direct {v10, v5}, Lux/f0;-><init>(I)V

    invoke-virtual {v4, v10}, Lp1/m1;->f(Lux/f0;)Z

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_5
    invoke-virtual {v4}, Lp1/m1;->a()V

    iput-object v2, v1, Ly2/f0;->f:Lp1/m1;

    iput-boolean v0, v9, La3/n0;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v6, v8, v7}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    goto :goto_4

    :goto_3
    invoke-static {v6, v8, v7}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1

    :cond_6
    :goto_4
    iget-object v4, v1, Ly2/f0;->c:Lp1/w;

    if-eqz v4, :cond_8

    iget-object v6, v4, Lp1/w;->z:Ljava/lang/Object;

    monitor-enter v6

    :try_start_1
    iget-object v4, v4, Lp1/w;->N:La0/v0;

    iget v4, v4, La0/v0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez v4, :cond_7

    move v4, v3

    goto :goto_5

    :cond_7
    move v4, v0

    :goto_5
    monitor-exit v6

    goto :goto_6

    :catchall_1
    move-exception p1

    monitor-exit v6

    throw p1

    :cond_8
    move v4, v3

    :goto_6
    if-nez p2, :cond_a

    if-nez v4, :cond_a

    iget-boolean p2, v1, Ly2/f0;->d:Z

    if-eqz p2, :cond_9

    goto :goto_8

    :cond_9
    :goto_7
    return-void

    :cond_a
    :goto_8
    iput-object p4, v1, Ly2/f0;->b:Lc93/m;

    iget-object p2, v1, Ly2/f0;->f:Lp1/m1;

    if-nez p2, :cond_b

    goto :goto_9

    :cond_b
    const-string p2, "new subcompose call while paused composition is still active"

    invoke-static {p2}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_9
    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    :cond_c
    invoke-static {p2}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object p4

    :try_start_2
    iget-object v4, p0, Ly2/n0;->w:La3/n0;

    iput-boolean v3, v4, La3/n0;->P:Z

    iget-object v6, v1, Ly2/f0;->c:Lp1/w;

    iget-object v7, p0, Ly2/n0;->x:Lp1/t;

    if-eqz v7, :cond_15

    if-eqz v6, :cond_e

    iget v8, v6, Lp1/w;->W:I

    const/4 v9, 0x3

    if-ne v8, v9, :cond_d

    move v8, v3

    goto :goto_a

    :cond_d
    move v8, v0

    :goto_a
    if-eqz v8, :cond_10

    goto :goto_b

    :catchall_2
    move-exception p1

    goto/16 :goto_f

    :cond_e
    :goto_b
    if-eqz p3, :cond_f

    sget-object v6, Lb3/x3;->a:Landroid/view/ViewGroup$LayoutParams;

    new-instance v6, La3/q2;

    invoke-direct {v6, p1}, Lhb3/a0;-><init>(Ljava/lang/Object;)V

    invoke-static {v6, v7}, Lse/a;->i(La3/q2;Lp1/t;)Lp1/w;

    move-result-object v6

    goto :goto_c

    :cond_f
    sget-object v6, Lb3/x3;->a:Landroid/view/ViewGroup$LayoutParams;

    new-instance v6, La3/q2;

    invoke-direct {v6, p1}, Lhb3/a0;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lp1/w;

    invoke-direct {p1, v7, v6}, Lp1/w;-><init>(Lp1/t;Lhb3/a0;)V

    move-object v6, p1

    :cond_10
    :goto_c
    iput-object v6, v1, Ly2/f0;->c:Lp1/w;

    iget-object p1, v1, Ly2/f0;->b:Lc93/m;

    iget-object v7, p0, Ly2/n0;->w:La3/n0;

    invoke-static {v7}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/ui/node/Owner;->getOutOfFrameExecutor()La3/z1;

    move-result-object v7

    if-eqz v7, :cond_11

    iput-boolean v0, v1, Ly2/f0;->h:Z

    goto :goto_d

    :cond_11
    iput-boolean v3, v1, Ly2/f0;->h:Z

    new-instance v7, Lc4/q;

    invoke-direct {v7, v5, v1, p1}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const v5, 0x5ad8c84e

    invoke-direct {p1, v7, v3, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    :goto_d
    if-eqz p3, :cond_13

    iget-boolean p3, v1, Ly2/f0;->e:Z

    if-eqz p3, :cond_12

    invoke-virtual {v6}, Lp1/w;->i()Z

    invoke-virtual {v6}, Lp1/w;->p()V

    invoke-virtual {v6, v3, p1}, Lp1/w;->k(ZLc93/m;)Lp1/m1;

    move-result-object p1

    iput-object p1, v1, Ly2/f0;->f:Lp1/m1;

    goto :goto_e

    :cond_12
    invoke-virtual {v6}, Lp1/w;->i()Z

    move-result p3

    invoke-virtual {v6, p3, p1}, Lp1/w;->k(ZLc93/m;)Lp1/m1;

    move-result-object p1

    iput-object p1, v1, Ly2/f0;->f:Lp1/m1;

    goto :goto_e

    :cond_13
    iget-boolean p3, v1, Ly2/f0;->e:Z

    if-eqz p3, :cond_14

    invoke-virtual {v6}, Lp1/w;->i()Z

    invoke-virtual {v6}, Lp1/w;->p()V

    iget-object p3, v6, Lp1/w;->V:Lp1/q;

    const/16 v5, 0x64

    iput v5, p3, Lp1/q;->z:I

    iput-boolean v3, p3, Lp1/q;->y:Z

    iput-object p1, v6, Lp1/w;->X:Lc93/m;

    iget-object v3, v6, Lp1/w;->w:Lp1/t;

    invoke-virtual {v3, v6, p1}, Lp1/t;->a(Lp1/w;Lc93/m;)V

    invoke-virtual {p3}, Lp1/q;->v()V

    goto :goto_e

    :cond_14
    invoke-virtual {v6, p1}, Lp1/w;->A(Lc93/m;)V

    :goto_e
    iput-boolean v0, v1, Ly2/f0;->e:Z

    iput-boolean v0, v4, La3/n0;->P:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {p2, p4, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iput-boolean v0, v1, Ly2/f0;->d:Z

    return-void

    :cond_15
    :try_start_3
    const-string p1, "parent composition reference not set"

    invoke-static {p1}, Lx2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_f
    invoke-static {p2, p4, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p1
.end method

.method public final j(Ljava/lang/Object;)La3/n0;
    .locals 11

    iget v0, p0, Ly2/n0;->N:I

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v0}, La3/n0;->r()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lr1/b;

    iget-object v2, v1, Lr1/b;->w:Lr1/c;

    iget v2, v2, Lr1/c;->y:I

    iget v3, p0, Ly2/n0;->O:I

    sub-int/2addr v2, v3

    iget v3, p0, Ly2/n0;->N:I

    sub-int v3, v2, v3

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    move v5, v2

    :goto_0
    iget-object v6, p0, Ly2/n0;->F:La0/v0;

    const/4 v7, -0x1

    if-lt v5, v3, :cond_2

    invoke-virtual {v1, v5}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La3/n0;

    invoke-virtual {v6, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v8, Ly2/f0;

    iget-object v8, v8, Ly2/f0;->a:Ljava/lang/Object;

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_2
    move v8, v7

    :goto_1
    if-ne v8, v7, :cond_6

    :goto_2
    if-lt v2, v3, :cond_5

    invoke-virtual {v1, v2}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/n0;

    invoke-virtual {v6, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v5, Ly2/f0;

    iget-object v9, v5, Ly2/f0;->a:Ljava/lang/Object;

    sget-object v10, Ly2/q1;->a:Ly2/b1;

    if-eq v9, v10, :cond_4

    iget-object v10, p0, Ly2/n0;->y:Ly2/x1;

    invoke-interface {v10, p1, v9}, Ly2/x1;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_4
    :goto_3
    iput-object p1, v5, Ly2/f0;->a:Ljava/lang/Object;

    move v5, v2

    move v8, v5

    goto :goto_4

    :cond_5
    move v5, v2

    :cond_6
    :goto_4
    if-ne v8, v7, :cond_7

    :goto_5
    const/4 p1, 0x0

    return-object p1

    :cond_7
    if-eq v5, v3, :cond_8

    iput-boolean v4, v0, La3/n0;->P:Z

    invoke-virtual {v0, v5, v3, v4}, La3/n0;->i0(III)V

    const/4 p1, 0x0

    iput-boolean p1, v0, La3/n0;->P:Z

    :cond_8
    iget p1, p0, Ly2/n0;->N:I

    add-int/2addr p1, v7

    iput p1, p0, Ly2/n0;->N:I

    invoke-virtual {v1, v3}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La3/n0;

    invoke-virtual {v6, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ly2/f0;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    iput-object v1, v0, Ly2/f0;->g:Lp1/k1;

    iput-boolean v4, v0, Ly2/f0;->e:Z

    iput-boolean v4, v0, Ly2/f0;->d:Z

    return-object p1
.end method
