.class public final Lc9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;
.implements Ll9/i0;
.implements Lg9/e;


# instance fields
.field public final E:Landroid/util/SparseArray;

.field public F:Lx8/i;

.field public G:Lu8/j0;

.field public H:Lx8/r;

.field public I:Z

.field public final w:Lx8/p;

.field public final x:Lu8/m0;

.field public final y:Lu8/n0;

.field public final z:La30/w0;


# direct methods
.method public constructor <init>(Lx8/p;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lc9/h;->w:Lx8/p;

    new-instance v0, Lx8/i;

    sget v1, Lx8/t;->a:I

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    :goto_0
    new-instance v2, Lab/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Lab/a;-><init>(I)V

    invoke-direct {v0, v1, p1, v2}, Lx8/i;-><init>(Landroid/os/Looper;Lx8/p;Lx8/g;)V

    iput-object v0, p0, Lc9/h;->F:Lx8/i;

    new-instance p1, Lu8/m0;

    invoke-direct {p1}, Lu8/m0;-><init>()V

    iput-object p1, p0, Lc9/h;->x:Lu8/m0;

    new-instance v0, Lu8/n0;

    invoke-direct {v0}, Lu8/n0;-><init>()V

    iput-object v0, p0, Lc9/h;->y:Lu8/n0;

    new-instance v0, La30/w0;

    invoke-direct {v0, p1}, La30/w0;-><init>(Lu8/m0;)V

    iput-object v0, p0, Lc9/h;->z:La30/w0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lc9/h;->E:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final a(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/d;

    const/16 p3, 0x10

    invoke-direct {p2, p3}, Lc9/d;-><init>(I)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final b(ILl9/c0;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p2

    new-instance p1, Lab/g0;

    invoke-direct/range {p1 .. p6}, Lab/g0;-><init>(Lc9/a;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p2, p3, p1}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final c(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/d;

    const/16 p3, 0xe

    invoke-direct {p2, p3}, Lc9/d;-><init>(I)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final d(ILl9/c0;Ll9/y;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/c;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p1, p3}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final e(ILl9/c0;Ll9/y;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/d;

    const/16 p3, 0x1a

    invoke-direct {p2, p3}, Lc9/d;-><init>(I)V

    const/16 p3, 0x3ed

    invoke-virtual {p0, p1, p3, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final f(ILl9/c0;Ll9/t;Ll9/y;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc9/h;->j(ILl9/c0;)Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/d;

    const/4 p3, 0x6

    invoke-direct {p2, p3}, Lc9/d;-><init>(I)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final g()Lc9/a;
    .locals 1

    iget-object v0, p0, Lc9/h;->z:La30/w0;

    iget-object v0, v0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Ll9/c0;

    invoke-virtual {p0, v0}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ll9/c0;)Lc9/a;
    .locals 3

    iget-object v0, p0, Lc9/h;->G:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc9/h;->z:La30/w0;

    iget-object v1, v1, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lzr/b1;

    invoke-virtual {v1, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu8/o0;

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v2, p0, Lc9/h;->x:Lu8/m0;

    invoke-virtual {v1, v0, v2}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object v0

    iget v0, v0, Lu8/m0;->c:I

    invoke-virtual {p0, v1, v0, p1}, Lc9/h;->i(Lu8/o0;ILl9/c0;)Lc9/a;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lc9/h;->G:Lu8/j0;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->Z()I

    move-result p1

    iget-object v1, p0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->o()I

    move-result v2

    if-ge p1, v2, :cond_3

    goto :goto_2

    :cond_3
    sget-object v1, Lu8/o0;->a:Lu8/l0;

    :goto_2
    invoke-virtual {p0, v1, p1, v0}, Lc9/h;->i(Lu8/o0;ILl9/c0;)Lc9/a;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lu8/o0;ILl9/c0;)Lc9/a;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual {v4}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    iget-object v1, v0, Lc9/h;->w:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v4, v1}, Lu8/o0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->Z()I

    move-result v1

    if-ne v5, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const-wide/16 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ll9/c0;->b()Z

    move-result v9

    if-eqz v9, :cond_2

    if-eqz v1, :cond_5

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->X()I

    move-result v1

    iget v9, v6, Ll9/c0;->b:I

    if-ne v1, v9, :cond_5

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->Y()I

    move-result v1

    iget v9, v6, Ll9/c0;->c:I

    if-ne v1, v9, :cond_5

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->a0()J

    move-result-wide v7

    goto :goto_2

    :cond_2
    if-eqz v1, :cond_3

    iget-object v1, v0, Lc9/h;->G:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-object v7, v1, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {v1, v7}, Lb9/f0;->W(Lb9/c1;)J

    move-result-wide v7

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lu8/o0;->p()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lc9/h;->y:Lu8/n0;

    invoke-virtual {v4, v5, v1, v7, v8}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v1

    iget-wide v7, v1, Lu8/n0;->l:J

    invoke-static {v7, v8}, Lx8/t;->U(J)J

    move-result-wide v7

    :cond_5
    :goto_2
    iget-object v1, v0, Lc9/h;->z:La30/w0;

    iget-object v1, v1, La30/w0;->E:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ll9/c0;

    new-instance v1, Lc9/a;

    iget-object v9, v0, Lc9/h;->G:Lu8/j0;

    check-cast v9, Lb9/f0;

    invoke-virtual {v9}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v9

    iget-object v10, v0, Lc9/h;->G:Lu8/j0;

    check-cast v10, Lb9/f0;

    invoke-virtual {v10}, Lb9/f0;->Z()I

    move-result v10

    iget-object v12, v0, Lc9/h;->G:Lu8/j0;

    check-cast v12, Lb9/f0;

    invoke-virtual {v12}, Lb9/f0;->a0()J

    move-result-wide v12

    iget-object v14, v0, Lc9/h;->G:Lu8/j0;

    check-cast v14, Lb9/f0;

    invoke-virtual {v14}, Lb9/f0;->L0()V

    iget-object v14, v14, Lb9/f0;->I0:Lb9/c1;

    iget-wide v14, v14, Lb9/c1;->r:J

    invoke-static {v14, v15}, Lx8/t;->U(J)J

    move-result-wide v14

    invoke-direct/range {v1 .. v15}, Lc9/a;-><init>(JLu8/o0;ILl9/c0;JLu8/o0;ILl9/c0;JJ)V

    return-object v1
.end method

.method public final j(ILl9/c0;)Lc9/a;
    .locals 1

    iget-object v0, p0, Lc9/h;->G:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_1

    iget-object v0, p0, Lc9/h;->z:La30/w0;

    iget-object v0, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lzr/b1;

    invoke-virtual {v0, p2}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/o0;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lu8/o0;->a:Lu8/l0;

    invoke-virtual {p0, v0, p1, p2}, Lc9/h;->i(Lu8/o0;ILl9/c0;)Lc9/a;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lc9/h;->G:Lu8/j0;

    check-cast p2, Lb9/f0;

    invoke-virtual {p2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object p2

    invoke-virtual {p2}, Lu8/o0;->o()I

    move-result v0

    if-ge p1, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p2, Lu8/o0;->a:Lu8/l0;

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lc9/h;->i(Lu8/o0;ILl9/c0;)Lc9/a;

    move-result-object p1

    return-object p1
.end method

.method public final k()Lc9/a;
    .locals 1

    iget-object v0, p0, Lc9/h;->z:La30/w0;

    iget-object v0, v0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ll9/c0;

    invoke-virtual {p0, v0}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v0

    return-object v0
.end method

.method public final l(Lc9/a;ILx8/f;)V
    .locals 1

    iget-object v0, p0, Lc9/h;->E:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lc9/h;->F:Lx8/i;

    invoke-virtual {p1, p2, p3}, Lx8/i;->e(ILx8/f;)V

    return-void
.end method

.method public final m(Lb9/f0;Landroid/os/Looper;)V
    .locals 7

    iget-object v0, p0, Lc9/h;->G:Lu8/j0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc9/h;->z:La30/w0;

    iget-object v0, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lzr/g0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lva3/g;->i(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lc9/h;->G:Lu8/j0;

    const/4 v0, 0x0

    iget-object v1, p0, Lc9/h;->w:Lx8/p;

    invoke-virtual {v1, p2, v0}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    move-result-object v0

    iput-object v0, p0, Lc9/h;->H:Lx8/r;

    iget-object v0, p0, Lc9/h;->F:Lx8/i;

    new-instance v5, Lc9/c;

    const/4 v1, 0x0

    invoke-direct {v5, v1, p0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v0, Lx8/i;->a:Lx8/p;

    new-instance v1, Lx8/i;

    iget-object v2, v0, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-boolean v6, v0, Lx8/i;->i:Z

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lx8/i;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lx8/p;Lx8/g;Z)V

    iput-object v1, p0, Lc9/h;->F:Lx8/i;

    return-void
.end method

.method public final onAudioAttributesChanged(Lu8/d;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->k()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x14

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onAudioSessionIdChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->k()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x15

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onAvailableCommandsChanged(Lu8/f0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc9/g;-><init>(I)V

    const/16 v1, 0xd

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onCues(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    .line 2
    new-instance v0, Lab/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/16 v1, 0x1b

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onCues(Lw8/c;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    .line 4
    new-instance v0, Lc9/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x1b

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onEvents(Lu8/j0;Lu8/g0;)V
    .locals 0

    return-void
.end method

.method public final onIsLoadingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/4 v1, 0x3

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onIsPlayingChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/4 v1, 0x7

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onMediaItemTransition(Lu8/x;I)V
    .locals 1

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/g;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Lc9/g;-><init>(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onMediaMetadataChanged(Lu8/a0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0xe

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onMetadata(Lu8/c0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/16 v1, 0x1c

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlayWhenReadyChanged(ZI)V
    .locals 1

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance p2, Lab/a;

    const/16 v0, 0x17

    invoke-direct {p2, v0}, Lab/a;-><init>(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlaybackParametersChanged(Lu8/e0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/16 v1, 0xc

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/4 v1, 0x4

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlaybackSuppressionReasonChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/4 v1, 0x6

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 3

    instance-of v0, p1, Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    iget-object v0, v0, Landroidx/media3/exoplayer/ExoPlaybackException;->H:Ll9/c0;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object v0

    :goto_0
    new-instance v1, Lab/g0;

    const/16 v2, 0xc

    invoke-direct {v1, v0, p1, v2}, Lab/g0;-><init>(Lc9/a;Ljava/lang/Object;I)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlayerErrorChanged(Landroidx/media3/common/PlaybackException;)V
    .locals 2

    instance-of v0, p1, Landroidx/media3/exoplayer/ExoPlaybackException;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/media3/exoplayer/ExoPlaybackException;

    iget-object p1, p1, Landroidx/media3/exoplayer/ExoPlaybackException;->H:Ll9/c0;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    :goto_0
    new-instance v0, Lab/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPlayerStateChanged(ZI)V
    .locals 1

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance p2, Lab/a;

    const/16 v0, 0x10

    invoke-direct {p2, v0}, Lab/a;-><init>(I)V

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onPositionDiscontinuity(Lu8/i0;Lu8/i0;I)V
    .locals 5

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc9/h;->I:Z

    :cond_0
    iget-object v0, p0, Lc9/h;->G:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lc9/h;->z:La30/w0;

    iget-object v2, v1, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    iget-object v3, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v3, Ll9/c0;

    iget-object v4, v1, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Lu8/m0;

    invoke-static {v0, v2, v3, v4}, La30/w0;->o(Lu8/j0;Lzr/g0;Ll9/c0;Lu8/m0;)Ll9/c0;

    move-result-object v0

    iput-object v0, v1, La30/w0;->E:Ljava/lang/Object;

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object v0

    new-instance v1, Lb9/t;

    invoke-direct {v1, v0, p3, p1, p2}, Lb9/t;-><init>(Lc9/a;ILu8/i0;Lu8/i0;)V

    const/16 p1, 0xb

    invoke-virtual {p0, v0, p1, v1}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public final onRepeatModeChanged(I)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x8

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onShuffleModeEnabledChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x9

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onSkipSilenceEnabledChanged(Z)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->k()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x17

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onSurfaceSizeChanged(II)V
    .locals 1

    invoke-virtual {p0}, Lc9/h;->k()Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/d;

    const/4 v0, 0x5

    invoke-direct {p2, v0}, Lc9/d;-><init>(I)V

    const/16 v0, 0x18

    invoke-virtual {p0, p1, v0, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onTimelineChanged(Lu8/o0;I)V
    .locals 3

    iget-object p1, p0, Lc9/h;->G:Lu8/j0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lc9/h;->z:La30/w0;

    iget-object v0, p2, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lzr/g0;

    iget-object v1, p2, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v2, p2, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lu8/m0;

    invoke-static {p1, v0, v1, v2}, La30/w0;->o(Lu8/j0;Lzr/g0;Ll9/c0;Lu8/m0;)Ll9/c0;

    move-result-object v0

    iput-object v0, p2, La30/w0;->E:Ljava/lang/Object;

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->c0()Lu8/o0;

    move-result-object p1

    invoke-virtual {p2, p1}, La30/w0;->N(Lu8/o0;)V

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance p2, Lc9/g;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lc9/g;-><init>(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onTrackSelectionParametersChanged(Lu8/t0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lc9/d;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lc9/d;-><init>(I)V

    const/16 v1, 0x13

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onTracksChanged(Lu8/v0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->g()Lc9/a;

    move-result-object p1

    new-instance v0, Lab/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lab/a;-><init>(I)V

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v1, v0}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method

.method public final onVideoSizeChanged(Lu8/y0;)V
    .locals 2

    invoke-virtual {p0}, Lc9/h;->k()Lc9/a;

    move-result-object v0

    new-instance v1, Lb9/b0;

    invoke-direct {v1, v0, p1}, Lb9/b0;-><init>(Lc9/a;Lu8/y0;)V

    const/16 p1, 0x19

    invoke-virtual {p0, v0, p1, v1}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void
.end method
