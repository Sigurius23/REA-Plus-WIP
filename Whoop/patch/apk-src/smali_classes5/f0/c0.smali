.class public final Lf0/c0;
.super Lf0/h;
.source "SourceFile"


# instance fields
.field public k0:Lc93/a;

.field public l0:Z

.field public final m0:La0/k0;

.field public final n0:La0/k0;


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;Lj0/i;)V
    .locals 8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, p0

    move-object v7, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v7}, Lf0/h;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    iput-object p2, v0, Lf0/c0;->k0:Lc93/a;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lf0/c0;->l0:Z

    sget-object p1, La0/w;->a:La0/k0;

    new-instance p1, La0/k0;

    invoke-direct {p1}, La0/k0;-><init>()V

    iput-object p1, v0, Lf0/c0;->m0:La0/k0;

    new-instance p1, La0/k0;

    invoke-direct {p1}, La0/k0;-><init>()V

    iput-object p1, v0, Lf0/c0;->n0:La0/k0;

    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 0

    invoke-virtual {p0}, Lf0/c0;->k1()V

    return-void
.end method

.method public final a1(Li3/z;)V
    .locals 4

    iget-object v0, p0, Lf0/c0;->k0:Lc93/a;

    if-eqz v0, :cond_0

    new-instance v0, Ld1/i;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/k;->c:Li3/y;

    new-instance v2, Li3/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final b1()Lu2/h0;
    .locals 2

    new-instance v0, La1/f;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lu2/c0;->a(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lu2/h0;

    move-result-object v0

    return-object v0
.end method

.method public final g1()V
    .locals 0

    invoke-virtual {p0}, Lf0/c0;->k1()V

    return-void
.end method

.method public final h1(Landroid/view/KeyEvent;)Z
    .locals 6

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v0

    iget-object p1, p0, Lf0/c0;->k0:Lc93/a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf0/c0;->m0:La0/k0;

    invoke-virtual {p1, v0, v1}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v2

    new-instance v3, La20/b;

    const/16 v4, 0xf

    const/4 v5, 0x0

    invoke-direct {v3, p0, v5, v4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v2, v5, v5, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, La0/k0;->h(JLjava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v2, p0, Lf0/c0;->n0:La0/k0;

    invoke-virtual {v2, v0, v1}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/z;

    return p1
.end method

.method public final i1(Landroid/view/KeyEvent;)V
    .locals 5

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v0

    iget-object p1, p0, Lf0/c0;->m0:La0/k0;

    invoke-virtual {p1, v0, v1}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0, v1}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/k1;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lbc3/k1;->isActive()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    :cond_1
    :goto_0
    invoke-virtual {p1, v0, v1}, La0/k0;->g(J)Ljava/lang/Object;

    :cond_2
    if-nez v3, :cond_3

    iget-object p1, p0, Lf0/h;->W:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final k1()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lf0/c0;->m0:La0/k0;

    iget-object v2, v1, La0/k0;->c:[Ljava/lang/Object;

    iget-object v3, v1, La0/k0;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    const/4 v9, 0x7

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v12, 0x8

    const/4 v13, 0x0

    if-ltz v4, :cond_3

    move v14, v13

    const-wide/16 v15, 0x80

    :goto_0
    aget-wide v5, v3, v14

    const-wide/16 v17, 0xff

    not-long v7, v5

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    and-long/2addr v7, v10

    cmp-long v7, v7, v10

    if-eqz v7, :cond_2

    sub-int v7, v14, v4

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    rsub-int/lit8 v7, v7, 0x8

    move v8, v13

    :goto_1
    if-ge v8, v7, :cond_1

    and-long v19, v5, v17

    cmp-long v19, v19, v15

    if-gez v19, :cond_0

    shl-int/lit8 v19, v14, 0x3

    add-int v19, v19, v8

    aget-object v19, v2, v19

    move/from16 v20, v9

    move-object/from16 v9, v19

    check-cast v9, Lbc3/k1;

    move-wide/from16 v21, v10

    const/4 v10, 0x0

    invoke-interface {v9, v10}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_2

    :cond_0
    move/from16 v20, v9

    move-wide/from16 v21, v10

    :goto_2
    shr-long/2addr v5, v12

    add-int/lit8 v8, v8, 0x1

    move/from16 v9, v20

    move-wide/from16 v10, v21

    goto :goto_1

    :cond_1
    move/from16 v20, v9

    move-wide/from16 v21, v10

    if-ne v7, v12, :cond_4

    goto :goto_3

    :cond_2
    move/from16 v20, v9

    move-wide/from16 v21, v10

    :goto_3
    if-eq v14, v4, :cond_4

    add-int/lit8 v14, v14, 0x1

    move/from16 v9, v20

    move-wide/from16 v10, v21

    goto :goto_0

    :cond_3
    move/from16 v20, v9

    move-wide/from16 v21, v10

    const-wide/16 v15, 0x80

    const-wide/16 v17, 0xff

    :cond_4
    invoke-virtual {v1}, La0/k0;->a()V

    iget-object v1, v0, Lf0/c0;->n0:La0/k0;

    iget-object v2, v1, La0/k0;->c:[Ljava/lang/Object;

    iget-object v3, v1, La0/k0;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_8

    move v5, v13

    :goto_4
    aget-wide v6, v3, v5

    not-long v8, v6

    shl-long v8, v8, v20

    and-long/2addr v8, v6

    and-long v8, v8, v21

    cmp-long v8, v8, v21

    if-eqz v8, :cond_7

    sub-int v8, v5, v4

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    rsub-int/lit8 v8, v8, 0x8

    move v9, v13

    :goto_5
    if-ge v9, v8, :cond_6

    and-long v10, v6, v17

    cmp-long v10, v10, v15

    if-ltz v10, :cond_5

    shr-long/2addr v6, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_5
    shl-int/lit8 v1, v5, 0x3

    add-int/2addr v1, v9

    aget-object v1, v2, v1

    check-cast v1, Lf0/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    throw v1

    :cond_6
    if-ne v8, v12, :cond_8

    :cond_7
    if-eq v5, v4, :cond_8

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {v1}, La0/k0;->a()V

    return-void
.end method
