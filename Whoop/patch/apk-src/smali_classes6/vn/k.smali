.class public final Lvn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/s;
.implements Lwn/q;
.implements Lsn/s0;


# instance fields
.field public final E:Lvm/h;

.field public final F:Lsn/z;

.field public final G:Lg73/d;

.field public final H:Lsn/z;

.field public final I:Lko/o;

.field public final J:Ljava/util/IdentityHashMap;

.field public final K:Lty/c;

.field public final L:Lng3/n;

.field public final M:Z

.field public final N:I

.field public final O:Lsm/f;

.field public P:Lsn/r;

.field public Q:I

.field public R:Lsn/x0;

.field public S:[Lvn/q;

.field public T:[Lvn/q;

.field public U:I

.field public V:Lq30/u0;

.field public final w:Lvn/i;

.field public final x:Lwn/c;

.field public final y:Lty/c;

.field public final z:Lko/j0;


# direct methods
.method public constructor <init>(Lvn/i;Lwn/c;Lty/c;Lko/j0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;Lko/o;Lng3/n;ZILsm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/k;->w:Lvn/i;

    iput-object p2, p0, Lvn/k;->x:Lwn/c;

    iput-object p3, p0, Lvn/k;->y:Lty/c;

    iput-object p4, p0, Lvn/k;->z:Lko/j0;

    iput-object p5, p0, Lvn/k;->E:Lvm/h;

    iput-object p6, p0, Lvn/k;->F:Lsn/z;

    iput-object p7, p0, Lvn/k;->G:Lg73/d;

    iput-object p8, p0, Lvn/k;->H:Lsn/z;

    iput-object p9, p0, Lvn/k;->I:Lko/o;

    iput-object p10, p0, Lvn/k;->L:Lng3/n;

    iput-boolean p11, p0, Lvn/k;->M:Z

    iput p12, p0, Lvn/k;->N:I

    iput-object p13, p0, Lvn/k;->O:Lsm/f;

    const/4 p1, 0x0

    new-array p2, p1, [Lsn/t0;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lq30/u0;

    const/16 p4, 0x11

    invoke-direct {p3, p2, p4}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object p3, p0, Lvn/k;->V:Lq30/u0;

    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, Lvn/k;->J:Ljava/util/IdentityHashMap;

    new-instance p2, Lty/c;

    const/16 p3, 0xf

    invoke-direct {p2, p3}, Lty/c;-><init>(I)V

    iput-object p2, p0, Lvn/k;->K:Lty/c;

    new-array p2, p1, [Lvn/q;

    iput-object p2, p0, Lvn/k;->S:[Lvn/q;

    new-array p1, p1, [Lvn/q;

    iput-object p1, p0, Lvn/k;->T:[Lvn/q;

    return-void
.end method

.method public static q(Lrm/c0;Lrm/c0;Z)Lrm/c0;
    .locals 10

    const/4 v0, -0x1

    if-eqz p1, :cond_0

    iget-object v1, p1, Lrm/c0;->I:Ljava/lang/String;

    iget-object v2, p1, Lrm/c0;->J:Lin/c;

    iget v3, p1, Lrm/c0;->Y:I

    iget v4, p1, Lrm/c0;->z:I

    iget v5, p1, Lrm/c0;->E:I

    iget-object v6, p1, Lrm/c0;->y:Ljava/lang/String;

    iget-object p1, p1, Lrm/c0;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrm/c0;->I:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v1, p1}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrm/c0;->J:Lin/c;

    if-eqz p2, :cond_1

    iget v3, p0, Lrm/c0;->Y:I

    iget v4, p0, Lrm/c0;->z:I

    iget v5, p0, Lrm/c0;->E:I

    iget-object v6, p0, Lrm/c0;->y:Ljava/lang/String;

    iget-object p1, p0, Lrm/c0;->x:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    const/4 v6, 0x0

    move v3, v0

    move v5, v4

    move-object p1, v6

    :goto_0
    invoke-static {v1}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz p2, :cond_2

    iget v8, p0, Lrm/c0;->F:I

    goto :goto_1

    :cond_2
    move v8, v0

    :goto_1
    if-eqz p2, :cond_3

    iget v0, p0, Lrm/c0;->G:I

    :cond_3
    new-instance p2, Lrm/b0;

    invoke-direct {p2}, Lrm/b0;-><init>()V

    iget-object v9, p0, Lrm/c0;->w:Ljava/lang/String;

    iput-object v9, p2, Lrm/b0;->a:Ljava/lang/String;

    iput-object p1, p2, Lrm/b0;->b:Ljava/lang/String;

    iget-object p0, p0, Lrm/c0;->K:Ljava/lang/String;

    iput-object p0, p2, Lrm/b0;->j:Ljava/lang/String;

    iput-object v7, p2, Lrm/b0;->k:Ljava/lang/String;

    iput-object v1, p2, Lrm/b0;->h:Ljava/lang/String;

    iput-object v2, p2, Lrm/b0;->i:Lin/c;

    iput v8, p2, Lrm/b0;->f:I

    iput v0, p2, Lrm/b0;->g:I

    iput v3, p2, Lrm/b0;->x:I

    iput v4, p2, Lrm/b0;->d:I

    iput v5, p2, Lrm/b0;->e:I

    iput-object v6, p2, Lrm/b0;->c:Ljava/lang/String;

    new-instance p0, Lrm/c0;

    invoke-direct {p0, p2}, Lrm/c0;-><init>(Lrm/b0;)V

    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lvn/k;->V:Lq30/u0;

    invoke-virtual {v0}, Lq30/u0;->a()Z

    move-result v0

    return v0
.end method

.method public final b(Lsn/r;J)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iput-object v1, v0, Lvn/k;->P:Lsn/r;

    iget-object v1, v0, Lvn/k;->x:Lwn/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v10, v1, Lwn/c;->J:Lwn/m;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v11, v10, Lwn/m;->g:Ljava/util/List;

    iget-object v1, v10, Lwn/m;->e:Ljava/util/List;

    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    iget-object v12, v10, Lwn/m;->h:Ljava/util/List;

    const/4 v13, 0x0

    iput v13, v0, Lvn/k;->Q:I

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v3, v0, Lvn/k;->M:Z

    if-nez v2, :cond_12

    iget-object v2, v10, Lwn/m;->j:Lrm/c0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    new-array v6, v5, [I

    move/from16 p1, v13

    move/from16 v8, p1

    move v9, v8

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move-object/from16 v17, v12

    if-ge v8, v4, :cond_3

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/l;

    iget-object v4, v4, Lwn/l;->b:Lrm/c0;

    iget v12, v4, Lrm/c0;->R:I

    iget-object v4, v4, Lrm/c0;->I:Ljava/lang/String;

    if-gtz v12, :cond_0

    const/4 v12, 0x2

    invoke-static {v12, v4}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v19

    if-eqz v19, :cond_1

    :cond_0
    const/16 v18, 0x2

    goto :goto_1

    :cond_1
    const/4 v12, 0x1

    invoke-static {v12, v4}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    aput v12, v6, v8

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, -0x1

    aput v4, v6, v8

    goto :goto_2

    :goto_1
    aput v18, v6, v8

    add-int/lit8 v9, v9, 0x1

    :goto_2
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v12, v17

    goto :goto_0

    :cond_3
    if-lez v9, :cond_4

    move/from16 v5, p1

    move v8, v3

    move v12, v9

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    if-ge v13, v5, :cond_5

    sub-int/2addr v5, v13

    move/from16 v4, p1

    move v8, v3

    move v12, v5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    move/from16 v4, p1

    move v8, v3

    move v12, v5

    move v5, v4

    :goto_3
    new-array v3, v12, [Landroid/net/Uri;

    move v9, v4

    new-array v4, v12, [Lrm/c0;

    new-array v13, v12, [I

    move/from16 v0, p1

    move/from16 v19, v0

    move-object/from16 v20, v2

    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_9

    if-eqz v9, :cond_6

    aget v2, v6, v0

    move-object/from16 v21, v3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_8

    goto :goto_5

    :cond_6
    move-object/from16 v21, v3

    :goto_5
    if-eqz v5, :cond_7

    aget v2, v6, v0

    const/4 v3, 0x1

    if-eq v2, v3, :cond_8

    :cond_7
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/l;

    iget-object v3, v2, Lwn/l;->a:Landroid/net/Uri;

    aput-object v3, v21, v19

    iget-object v2, v2, Lwn/l;->b:Lrm/c0;

    aput-object v2, v4, v19

    add-int/lit8 v2, v19, 0x1

    aput v0, v13, v19

    move/from16 v19, v2

    :cond_8
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v3, v21

    goto :goto_4

    :cond_9
    move-object/from16 v21, v3

    aget-object v0, v4, p1

    iget-object v0, v0, Lrm/c0;->I:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-static {v3, v0}, Llo/y;->m(ILjava/lang/String;)I

    move-result v1

    const/4 v3, 0x1

    invoke-static {v3, v0}, Llo/y;->m(ILjava/lang/String;)I

    move-result v0

    if-gt v0, v3, :cond_a

    if-gt v1, v3, :cond_a

    add-int v2, v0, v1

    if-lez v2, :cond_a

    move/from16 v16, v3

    goto :goto_6

    :cond_a
    move/from16 v16, p1

    :goto_6
    if-nez v9, :cond_b

    if-lez v0, :cond_b

    move v2, v3

    goto :goto_7

    :cond_b
    move/from16 v2, p1

    :goto_7
    iget-object v5, v10, Lwn/m;->j:Lrm/c0;

    iget-object v6, v10, Lwn/m;->k:Ljava/util/List;

    move v9, v1

    const-string v1, "main"

    move/from16 v22, v0

    move/from16 v23, v8

    move-object/from16 v19, v11

    move-object/from16 v11, v20

    move-object/from16 v3, v21

    move-object/from16 v0, p0

    move/from16 v21, v9

    move-wide/from16 v8, p2

    invoke-virtual/range {v0 .. v9}, Lvn/k;->p(Ljava/lang/String;I[Landroid/net/Uri;[Lrm/c0;Lrm/c0;Ljava/util/List;Ljava/util/Map;J)Lvn/q;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v23, :cond_13

    if-eqz v16, :cond_13

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-lez v21, :cond_f

    new-array v3, v12, [Lrm/c0;

    move/from16 v5, p1

    :goto_8
    if-ge v5, v12, :cond_c

    aget-object v6, v4, v5

    iget-object v8, v6, Lrm/c0;->I:Ljava/lang/String;

    const/4 v9, 0x2

    invoke-static {v9, v8}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v9, Lrm/b0;

    invoke-direct {v9}, Lrm/b0;-><init>()V

    move-object/from16 v16, v4

    iget-object v4, v6, Lrm/c0;->w:Ljava/lang/String;

    iput-object v4, v9, Lrm/b0;->a:Ljava/lang/String;

    iget-object v4, v6, Lrm/c0;->x:Ljava/lang/String;

    iput-object v4, v9, Lrm/b0;->b:Ljava/lang/String;

    iget-object v4, v6, Lrm/c0;->K:Ljava/lang/String;

    iput-object v4, v9, Lrm/b0;->j:Ljava/lang/String;

    iput-object v13, v9, Lrm/b0;->k:Ljava/lang/String;

    iput-object v8, v9, Lrm/b0;->h:Ljava/lang/String;

    iget-object v4, v6, Lrm/c0;->J:Lin/c;

    iput-object v4, v9, Lrm/b0;->i:Lin/c;

    iget v4, v6, Lrm/c0;->F:I

    iput v4, v9, Lrm/b0;->f:I

    iget v4, v6, Lrm/c0;->G:I

    iput v4, v9, Lrm/b0;->g:I

    iget v4, v6, Lrm/c0;->Q:I

    iput v4, v9, Lrm/b0;->p:I

    iget v4, v6, Lrm/c0;->R:I

    iput v4, v9, Lrm/b0;->q:I

    iget v4, v6, Lrm/c0;->S:F

    iput v4, v9, Lrm/b0;->r:F

    iget v4, v6, Lrm/c0;->z:I

    iput v4, v9, Lrm/b0;->d:I

    iget v4, v6, Lrm/c0;->E:I

    iput v4, v9, Lrm/b0;->e:I

    new-instance v4, Lrm/c0;

    invoke-direct {v4, v9}, Lrm/c0;-><init>(Lrm/b0;)V

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v4, v16

    goto :goto_8

    :cond_c
    move-object/from16 v16, v4

    new-instance v4, Lsn/w0;

    invoke-direct {v4, v1, v3}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-lez v22, :cond_e

    if-nez v11, :cond_d

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_e

    :cond_d
    new-instance v3, Lsn/w0;

    const-string v4, ":audio"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aget-object v5, v16, p1

    move/from16 v6, p1

    invoke-static {v5, v11, v6}, Lvn/k;->q(Lrm/c0;Lrm/c0;Z)Lrm/c0;

    move-result-object v5

    filled-new-array {v5}, [Lrm/c0;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v3, v10, Lwn/m;->k:Ljava/util/List;

    if-eqz v3, :cond_11

    const/4 v4, 0x0

    :goto_9
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_11

    const/16 v5, 0x13

    const-string v6, "main:cc:"

    invoke-static {v5, v4, v6}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lsn/w0;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lrm/c0;

    filled-new-array {v8}, [Lrm/c0;

    move-result-object v8

    invoke-direct {v6, v5, v8}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_f
    move-object/from16 v16, v4

    new-array v3, v12, [Lrm/c0;

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v12, :cond_10

    aget-object v5, v16, v4

    const/4 v6, 0x1

    invoke-static {v5, v11, v6}, Lvn/k;->q(Lrm/c0;Lrm/c0;Z)Lrm/c0;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_10
    new-instance v4, Lsn/w0;

    invoke-direct {v4, v1, v3}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    new-instance v3, Lsn/w0;

    const-string v4, ":id3"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrm/b0;

    invoke-direct {v4}, Lrm/b0;-><init>()V

    const-string v5, "ID3"

    iput-object v5, v4, Lrm/b0;->a:Ljava/lang/String;

    const-string v5, "application/id3"

    iput-object v5, v4, Lrm/b0;->k:Ljava/lang/String;

    new-instance v5, Lrm/c0;

    invoke-direct {v5, v4}, Lrm/c0;-><init>(Lrm/b0;)V

    filled-new-array {v5}, [Lrm/c0;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x0

    new-array v1, v6, [Lsn/w0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lsn/w0;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lvn/q;->F([Lsn/w0;[I)V

    goto :goto_b

    :cond_12
    move/from16 v23, v3

    move-object/from16 v19, v11

    move-object/from16 v17, v12

    :cond_13
    :goto_b
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    :goto_c
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1a

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/k;

    iget-object v2, v2, Lwn/k;->c:Ljava/lang/String;

    invoke-virtual {v13, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    move/from16 v18, v0

    move-object/from16 v19, v1

    move-object/from16 v0, p0

    goto/16 :goto_11

    :cond_14
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    const/4 v3, 0x0

    const/16 v16, 0x1

    :goto_d
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_17

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/k;

    iget-object v4, v4, Lwn/k;->c:Ljava/lang/String;

    sget v5, Llo/y;->a:I

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/k;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v4, Lwn/k;->a:Landroid/net/Uri;

    iget-object v4, v4, Lwn/k;->b:Lrm/c0;

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v4, Lrm/c0;->I:Ljava/lang/String;

    const/4 v6, 0x1

    invoke-static {v6, v4}, Llo/y;->m(ILjava/lang/String;)I

    move-result v4

    if-ne v4, v6, :cond_15

    const/4 v4, 0x1

    goto :goto_e

    :cond_15
    const/4 v4, 0x0

    :goto_e
    and-int v4, v16, v4

    move/from16 v16, v4

    :cond_16
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "audio:"

    if-eqz v3, :cond_18

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_f
    const/4 v6, 0x0

    goto :goto_10

    :cond_18
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_f

    :goto_10
    new-array v3, v6, [Landroid/net/Uri;

    sget v4, Llo/y;->a:I

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Landroid/net/Uri;

    new-array v4, v6, [Lrm/c0;

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lrm/c0;

    const/4 v5, 0x0

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object/from16 v19, v1

    move-object v1, v2

    const/4 v2, 0x1

    move-wide/from16 v8, p2

    move/from16 v18, v0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v9}, Lvn/k;->p(Ljava/lang/String;I[Landroid/net/Uri;[Lrm/c0;Lrm/c0;Ljava/util/List;Ljava/util/Map;J)Lvn/q;

    move-result-object v2

    invoke-static {v12}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object v3

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v23, :cond_19

    if-eqz v16, :cond_19

    const/4 v6, 0x0

    new-array v3, v6, [Lrm/c0;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lrm/c0;

    new-instance v4, Lsn/w0;

    invoke-direct {v4, v1, v3}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    filled-new-array {v4}, [Lsn/w0;

    move-result-object v1

    new-array v3, v6, [I

    invoke-virtual {v2, v1, v3}, Lvn/q;->F([Lsn/w0;[I)V

    :cond_19
    :goto_11
    add-int/lit8 v1, v18, 0x1

    move v0, v1

    goto/16 :goto_c

    :cond_1a
    move-object/from16 v0, p0

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, v0, Lvn/k;->U:I

    const/4 v10, 0x0

    :goto_12
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v1

    if-ge v10, v1, :cond_1b

    move-object/from16 v11, v17

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/k;

    iget-object v2, v1, Lwn/k;->c:Ljava/lang/String;

    iget-object v12, v1, Lwn/k;->b:Lrm/c0;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x15

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "subtitle:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lwn/k;->a:Landroid/net/Uri;

    filled-new-array {v1}, [Landroid/net/Uri;

    move-result-object v3

    filled-new-array {v12}, [Lrm/c0;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object v1, v2

    const/4 v2, 0x3

    move-wide/from16 v8, p2

    invoke-virtual/range {v0 .. v9}, Lvn/k;->p(Ljava/lang/String;I[Landroid/net/Uri;[Lrm/c0;Lrm/c0;Ljava/util/List;Ljava/util/Map;J)Lvn/q;

    move-result-object v2

    filled-new-array {v10}, [I

    move-result-object v3

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lsn/w0;

    filled-new-array {v12}, [Lrm/c0;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    filled-new-array {v3}, [Lsn/w0;

    move-result-object v1

    const/4 v6, 0x0

    new-array v3, v6, [I

    invoke-virtual {v2, v1, v3}, Lvn/q;->F([Lsn/w0;[I)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    :cond_1b
    const/4 v6, 0x0

    new-array v1, v6, [Lvn/q;

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lvn/q;

    iput-object v1, v0, Lvn/k;->S:[Lvn/q;

    new-array v1, v6, [[I

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    iget-object v1, v0, Lvn/k;->S:[Lvn/q;

    array-length v2, v1

    iput v2, v0, Lvn/k;->Q:I

    aget-object v2, v1, v6

    iget-object v2, v2, Lvn/q;->z:Lvn/h;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lvn/h;->l:Z

    array-length v2, v1

    move v13, v6

    :goto_13
    if-ge v13, v2, :cond_1d

    aget-object v3, v1, v13

    iget-boolean v4, v3, Lvn/q;->d0:Z

    if-nez v4, :cond_1c

    iget-wide v4, v3, Lvn/q;->p0:J

    invoke-virtual {v3, v4, v5}, Lvn/q;->u(J)Z

    :cond_1c
    add-int/lit8 v13, v13, 0x1

    goto :goto_13

    :cond_1d
    iget-object v1, v0, Lvn/k;->S:[Lvn/q;

    iput-object v1, v0, Lvn/k;->T:[Lvn/q;

    return-void
.end method

.method public final c(Lsn/t0;)V
    .locals 0

    iget-object p1, p0, Lvn/k;->P:Lsn/r;

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    return-void
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lvn/k;->V:Lq30/u0;

    invoke-virtual {v0}, Lq30/u0;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(J)J
    .locals 4

    iget-object v0, p0, Lvn/k;->T:[Lvn/q;

    array-length v1, v0

    if-lez v1, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v1}, Lvn/q;->H(JZ)Z

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lvn/k;->T:[Lvn/q;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2, v0}, Lvn/q;->H(JZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lvn/k;->K:Lty/c;

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    :cond_1
    return-wide p1
.end method

.method public final f()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lvn/k;->S:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lvn/q;->E()V

    iget-boolean v4, v3, Lvn/q;->t0:Z

    if-eqz v4, :cond_1

    iget-boolean v3, v3, Lvn/q;->d0:Z

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "Loading finished before preparation is complete."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final i(J)V
    .locals 9

    iget-object v0, p0, Lvn/k;->T:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    iget-boolean v5, v4, Lvn/q;->c0:Z

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lvn/q;->C()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    iget-object v5, v4, Lvn/q;->V:[Lvn/p;

    array-length v5, v5

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_1

    iget-object v7, v4, Lvn/q;->V:[Lvn/p;

    aget-object v7, v7, v6

    iget-object v8, v4, Lvn/q;->n0:[Z

    aget-boolean v8, v8, v6

    invoke-virtual {v7, p1, p2, v8}, Lsn/q0;->f(JZ)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final j([Lio/o;[Z[Lsn/r0;[ZJ)J
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v4, p5

    array-length v3, v1

    new-array v12, v3, [I

    array-length v3, v1

    new-array v13, v3, [I

    const/4 v3, 0x0

    :goto_0
    array-length v6, v1

    iget-object v15, v0, Lvn/k;->J:Ljava/util/IdentityHashMap;

    const/4 v7, -0x1

    if-ge v3, v6, :cond_4

    aget-object v6, v2, v3

    if-nez v6, :cond_0

    move v6, v7

    goto :goto_1

    :cond_0
    invoke-virtual {v15, v6}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_1
    aput v6, v12, v3

    aput v7, v13, v3

    aget-object v6, v1, v3

    if-eqz v6, :cond_3

    invoke-interface {v6}, Lio/o;->j()Lsn/w0;

    move-result-object v6

    const/4 v8, 0x0

    :goto_2
    iget-object v9, v0, Lvn/k;->S:[Lvn/q;

    array-length v10, v9

    if-ge v8, v10, :cond_3

    aget-object v9, v9, v8

    invoke-virtual {v9}, Lvn/q;->s()V

    iget-object v9, v9, Lvn/q;->i0:Lsn/x0;

    iget-object v9, v9, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v9, v6}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v9

    if-ltz v9, :cond_1

    goto :goto_3

    :cond_1
    move v9, v7

    :goto_3
    if-eq v9, v7, :cond_2

    aput v8, v13, v3

    goto :goto_4

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v15}, Ljava/util/IdentityHashMap;->clear()V

    array-length v3, v1

    new-array v6, v3, [Lsn/r0;

    array-length v8, v1

    new-array v9, v8, [Lsn/r0;

    array-length v10, v1

    new-array v11, v10, [Lio/o;

    const/16 v16, 0x0

    iget-object v14, v0, Lvn/k;->S:[Lvn/q;

    array-length v14, v14

    new-array v14, v14, [Lvn/q;

    move/from16 v17, v8

    move/from16 v8, v16

    move/from16 v18, v8

    move/from16 v19, v18

    :goto_5
    iget-object v7, v0, Lvn/k;->S:[Lvn/q;

    array-length v7, v7

    if-ge v8, v7, :cond_2a

    move/from16 v21, v3

    move/from16 v7, v16

    :goto_6
    array-length v3, v1

    move-object/from16 v22, v6

    if-ge v7, v3, :cond_7

    aget v3, v12, v7

    if-ne v3, v8, :cond_5

    aget-object v3, v2, v7

    goto :goto_7

    :cond_5
    const/4 v3, 0x0

    :goto_7
    aput-object v3, v9, v7

    aget v3, v13, v7

    if-ne v3, v8, :cond_6

    aget-object v6, v1, v7

    goto :goto_8

    :cond_6
    const/4 v6, 0x0

    :goto_8
    aput-object v6, v11, v7

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v6, v22

    goto :goto_6

    :cond_7
    iget-object v3, v0, Lvn/k;->S:[Lvn/q;

    aget-object v3, v3, v8

    iget-object v7, v3, Lvn/q;->J:Lko/c0;

    move/from16 v23, v8

    iget-object v8, v3, Lvn/q;->z:Lvn/h;

    const/16 v24, 0x0

    iget-object v6, v3, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lvn/q;->s()V

    move-object/from16 v25, v6

    iget v6, v3, Lvn/q;->e0:I

    move/from16 v26, v6

    move-object/from16 v27, v9

    move/from16 v6, v16

    :goto_9
    if-ge v6, v10, :cond_b

    aget-object v28, v27, v6

    const/16 v29, 0x1

    move-object/from16 v9, v28

    check-cast v9, Lvn/m;

    if-eqz v9, :cond_9

    aget-object v28, v11, v6

    if-eqz v28, :cond_8

    aget-boolean v28, p2, v6

    if-nez v28, :cond_9

    :cond_8
    move/from16 v28, v6

    goto :goto_a

    :cond_9
    move/from16 v28, v6

    move-object/from16 v30, v7

    const/4 v7, -0x1

    goto :goto_b

    :goto_a
    iget v6, v3, Lvn/q;->e0:I

    add-int/lit8 v6, v6, -0x1

    iput v6, v3, Lvn/q;->e0:I

    iget v6, v9, Lvn/m;->y:I

    move-object/from16 v30, v7

    const/4 v7, -0x1

    if-eq v6, v7, :cond_a

    iget-object v6, v9, Lvn/m;->x:Lvn/q;

    iget v7, v9, Lvn/m;->w:I

    invoke-virtual {v6}, Lvn/q;->s()V

    move/from16 v29, v7

    iget-object v7, v6, Lvn/q;->k0:[I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v6, Lvn/q;->k0:[I

    aget v7, v7, v29

    move/from16 v29, v7

    iget-object v7, v6, Lvn/q;->n0:[Z

    aget-boolean v7, v7, v29

    invoke-static {v7}, Llo/a;->i(Z)V

    iget-object v6, v6, Lvn/q;->n0:[Z

    aput-boolean v16, v6, v29

    const/4 v7, -0x1

    iput v7, v9, Lvn/m;->y:I

    :cond_a
    aput-object v24, v27, v28

    :goto_b
    add-int/lit8 v6, v28, 0x1

    move-object/from16 v7, v30

    goto :goto_9

    :cond_b
    move-object/from16 v30, v7

    const/4 v7, -0x1

    const/16 v29, 0x1

    if-nez v19, :cond_c

    iget-boolean v6, v3, Lvn/q;->s0:Z

    if-eqz v6, :cond_e

    if-nez v26, :cond_d

    :cond_c
    move-object v6, v8

    goto :goto_d

    :cond_d
    move-object v6, v8

    goto :goto_c

    :cond_e
    move-object v6, v8

    iget-wide v7, v3, Lvn/q;->p0:J

    cmp-long v7, v4, v7

    if-eqz v7, :cond_f

    goto :goto_d

    :cond_f
    :goto_c
    move-object v7, v6

    move/from16 v6, v16

    goto :goto_e

    :goto_d
    move-object v7, v6

    move/from16 v6, v29

    :goto_e
    iget-object v8, v7, Lvn/h;->q:Lio/o;

    move/from16 v26, v6

    move-object v9, v8

    move/from16 v6, v16

    :goto_f
    if-ge v6, v10, :cond_15

    move/from16 v28, v6

    aget-object v6, v11, v28

    if-nez v6, :cond_10

    move/from16 v31, v10

    move-object/from16 v32, v11

    goto :goto_12

    :cond_10
    move/from16 v31, v10

    iget-object v10, v3, Lvn/q;->i0:Lsn/x0;

    move-object/from16 v32, v11

    invoke-interface {v6}, Lio/o;->j()Lsn/w0;

    move-result-object v11

    iget-object v10, v10, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v10, v11}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v10

    if-ltz v10, :cond_11

    goto :goto_10

    :cond_11
    const/4 v10, -0x1

    :goto_10
    iget v11, v3, Lvn/q;->l0:I

    if-ne v10, v11, :cond_12

    iput-object v6, v7, Lvn/h;->q:Lio/o;

    move-object v9, v6

    :cond_12
    aget-object v6, v27, v28

    if-nez v6, :cond_14

    iget v6, v3, Lvn/q;->e0:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v3, Lvn/q;->e0:I

    new-instance v6, Lvn/m;

    invoke-direct {v6, v3, v10}, Lvn/m;-><init>(Lvn/q;I)V

    aput-object v6, v27, v28

    aput-boolean v29, p4, v28

    iget-object v11, v3, Lvn/q;->k0:[I

    if-eqz v11, :cond_14

    invoke-virtual {v6}, Lvn/m;->a()V

    if-nez v26, :cond_14

    iget-object v6, v3, Lvn/q;->V:[Lvn/p;

    iget-object v11, v3, Lvn/q;->k0:[I

    aget v10, v11, v10

    aget-object v6, v6, v10

    move/from16 v10, v29

    invoke-virtual {v6, v4, v5, v10}, Lsn/q0;->v(JZ)Z

    move-result v11

    if-nez v11, :cond_13

    invoke-virtual {v6}, Lsn/q0;->l()I

    move-result v6

    if-eqz v6, :cond_13

    const/4 v10, 0x1

    goto :goto_11

    :cond_13
    move/from16 v10, v16

    :goto_11
    move/from16 v26, v10

    :cond_14
    :goto_12
    add-int/lit8 v6, v28, 0x1

    move/from16 v10, v31

    move-object/from16 v11, v32

    const/16 v29, 0x1

    goto :goto_f

    :cond_15
    move/from16 v31, v10

    move-object/from16 v32, v11

    iget v6, v3, Lvn/q;->e0:I

    if-nez v6, :cond_18

    move-object/from16 v6, v24

    iput-object v6, v7, Lvn/h;->n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    iput-object v6, v3, Lvn/q;->g0:Lrm/c0;

    const/4 v10, 0x1

    iput-boolean v10, v3, Lvn/q;->r0:Z

    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v30 .. v30}, Lko/c0;->b()Z

    move-result v6

    if-eqz v6, :cond_17

    iget-boolean v6, v3, Lvn/q;->c0:Z

    if-eqz v6, :cond_16

    iget-object v6, v3, Lvn/q;->V:[Lvn/p;

    array-length v8, v6

    move/from16 v9, v16

    :goto_13
    if-ge v9, v8, :cond_16

    aget-object v11, v6, v9

    invoke-virtual {v11}, Lsn/q0;->g()V

    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_16
    invoke-virtual/range {v30 .. v30}, Lko/c0;->a()V

    goto :goto_14

    :cond_17
    invoke-virtual {v3}, Lvn/q;->G()V

    :goto_14
    move-object/from16 v20, v13

    move-object v13, v3

    move/from16 v3, v17

    move-object/from16 v17, v20

    move-object/from16 v30, v12

    move-object/from16 v20, v14

    move/from16 v33, v21

    move-object/from16 v34, v22

    move/from16 v36, v23

    const/16 v21, -0x1

    move-object v12, v7

    goto/16 :goto_19

    :cond_18
    const/4 v10, 0x1

    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-static {v9, v8}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    iget-boolean v6, v3, Lvn/q;->s0:Z

    if-nez v6, :cond_1b

    const-wide/16 v24, 0x0

    cmp-long v6, v4, v24

    if-gez v6, :cond_19

    neg-long v10, v4

    move-wide/from16 v24, v10

    :cond_19
    invoke-virtual {v3}, Lvn/q;->A()Lvn/j;

    move-result-object v6

    invoke-virtual {v7, v6, v4, v5}, Lvn/h;->a(Lvn/j;J)[Lun/c;

    move-result-object v11

    move-object v10, v9

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v28, v10

    iget-object v10, v3, Lvn/q;->O:Ljava/util/List;

    move-object/from16 v30, v12

    move-object/from16 v20, v14

    move/from16 v35, v17

    move/from16 v33, v21

    move-object/from16 v34, v22

    move/from16 v36, v23

    const/16 v21, -0x1

    move-object v14, v6

    move-object v12, v7

    move-object/from16 v17, v13

    move-wide/from16 v6, v24

    move-object v13, v3

    move-object/from16 v3, v28

    invoke-interface/range {v3 .. v11}, Lio/o;->q(JJJLjava/util/List;[Lun/c;)V

    move-object v10, v3

    iget-object v3, v12, Lvn/h;->h:Lsn/w0;

    iget-object v6, v14, Lun/a;->d:Lrm/c0;

    invoke-virtual {v3, v6}, Lsn/w0;->a(Lrm/c0;)I

    move-result v3

    invoke-interface {v10}, Lio/o;->m()I

    move-result v6

    if-eq v6, v3, :cond_1a

    const/4 v10, 0x1

    goto :goto_15

    :cond_1a
    const/4 v10, 0x1

    goto :goto_16

    :cond_1b
    move-object/from16 v30, v12

    move-object/from16 v20, v14

    move/from16 v35, v17

    move/from16 v33, v21

    move-object/from16 v34, v22

    move/from16 v36, v23

    const/16 v21, -0x1

    move-object v12, v7

    move-object/from16 v17, v13

    move-object v13, v3

    :goto_15
    iput-boolean v10, v13, Lvn/q;->r0:Z

    move v3, v10

    move v9, v3

    goto :goto_17

    :cond_1c
    move-object/from16 v30, v12

    move-object/from16 v20, v14

    move/from16 v35, v17

    move/from16 v33, v21

    move-object/from16 v34, v22

    move/from16 v36, v23

    const/16 v21, -0x1

    move-object v12, v7

    move-object/from16 v17, v13

    move-object v13, v3

    :goto_16
    move/from16 v3, v19

    move/from16 v9, v26

    :goto_17
    if-eqz v9, :cond_1e

    invoke-virtual {v13, v4, v5, v3}, Lvn/q;->H(JZ)Z

    move/from16 v6, v16

    move/from16 v3, v35

    :goto_18
    if-ge v6, v3, :cond_1f

    aget-object v7, v27, v6

    if-eqz v7, :cond_1d

    aput-boolean v10, p4, v6

    :cond_1d
    add-int/lit8 v6, v6, 0x1

    const/4 v10, 0x1

    goto :goto_18

    :cond_1e
    move/from16 v3, v35

    :cond_1f
    move/from16 v26, v9

    :goto_19
    iget-object v6, v13, Lvn/q;->S:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    move/from16 v7, v16

    :goto_1a
    if-ge v7, v3, :cond_21

    aget-object v8, v27, v7

    if-eqz v8, :cond_20

    check-cast v8, Lvn/m;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    add-int/lit8 v7, v7, 0x1

    goto :goto_1a

    :cond_21
    const/4 v10, 0x1

    iput-boolean v10, v13, Lvn/q;->s0:Z

    move/from16 v6, v16

    move v9, v6

    :goto_1b
    array-length v7, v1

    if-ge v6, v7, :cond_25

    aget-object v7, v27, v6

    aget v8, v17, v6

    move/from16 v10, v36

    if-ne v8, v10, :cond_22

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v8, v34

    aput-object v7, v8, v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v15, v7, v9}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x1

    goto :goto_1d

    :cond_22
    move-object/from16 v8, v34

    aget v11, v30, v6

    if-ne v11, v10, :cond_24

    if-nez v7, :cond_23

    const/4 v7, 0x1

    goto :goto_1c

    :cond_23
    move/from16 v7, v16

    :goto_1c
    invoke-static {v7}, Llo/a;->i(Z)V

    :cond_24
    :goto_1d
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v34, v8

    move/from16 v36, v10

    goto :goto_1b

    :cond_25
    move-object/from16 v8, v34

    move/from16 v10, v36

    move/from16 v6, v18

    if-eqz v9, :cond_29

    aput-object v13, v20, v6

    add-int/lit8 v18, v6, 0x1

    if-nez v6, :cond_27

    const/4 v6, 0x1

    iput-boolean v6, v12, Lvn/h;->l:Z

    if-nez v26, :cond_26

    iget-object v7, v0, Lvn/k;->T:[Lvn/q;

    array-length v9, v7

    if-eqz v9, :cond_26

    aget-object v7, v7, v16

    if-eq v13, v7, :cond_29

    :cond_26
    iget-object v7, v0, Lvn/k;->K:Lty/c;

    iget-object v7, v7, Lty/c;->x:Ljava/lang/Object;

    check-cast v7, Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    move/from16 v19, v6

    goto :goto_1f

    :cond_27
    const/4 v6, 0x1

    iget v7, v0, Lvn/k;->U:I

    if-ge v10, v7, :cond_28

    move v9, v6

    goto :goto_1e

    :cond_28
    move/from16 v9, v16

    :goto_1e
    iput-boolean v9, v12, Lvn/h;->l:Z

    :cond_29
    :goto_1f
    add-int/lit8 v6, v10, 0x1

    move-object v9, v8

    move v8, v6

    move-object v6, v9

    move-object/from16 v13, v17

    move-object/from16 v14, v20

    move-object/from16 v9, v27

    move-object/from16 v12, v30

    move/from16 v10, v31

    move-object/from16 v11, v32

    move/from16 v17, v3

    move/from16 v3, v33

    goto/16 :goto_5

    :cond_2a
    move v7, v3

    move-object v8, v6

    move-object/from16 v20, v14

    move/from16 v9, v16

    move/from16 v6, v18

    invoke-static {v8, v9, v2, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v1, v20

    invoke-static {v6, v1}, Llo/y;->B(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lvn/q;

    iput-object v1, v0, Lvn/k;->T:[Lvn/q;

    iget-object v2, v0, Lvn/k;->L:Lng3/n;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lq30/u0;

    const/16 v3, 0x11

    invoke-direct {v2, v1, v3}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lvn/k;->V:Lq30/u0;

    return-wide v4
.end method

.method public final k()Lsn/x0;
    .locals 1

    iget-object v0, p0, Lvn/k;->R:Lsn/x0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final l(Landroid/net/Uri;Lai/j;Z)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lvn/k;->S:[Lvn/q;

    array-length v3, v2

    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_0
    if-ge v6, v3, :cond_b

    aget-object v8, v2, v6

    iget-object v9, v8, Lvn/q;->z:Lvn/h;

    iget-object v10, v9, Lvn/h;->e:[Landroid/net/Uri;

    invoke-static {v10, v1}, Llo/y;->j([Ljava/lang/Object;Ljava/lang/Comparable;)Z

    move-result v11

    if-nez v11, :cond_0

    move-object/from16 v8, p2

    const/4 v4, 0x1

    const/16 v16, 0x1

    goto/16 :goto_7

    :cond_0
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p3, :cond_1

    iget-object v8, v8, Lvn/q;->I:Lg73/d;

    iget-object v13, v9, Lvn/h;->q:Lio/o;

    invoke-static {v13}, Lkotlin/jvm/internal/j;->z(Lio/o;)Lc9/k;

    move-result-object v13

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v8, p2

    invoke-static {v13, v8}, Lg73/d;->g(Lc9/k;Lai/j;)Lbb/f;

    move-result-object v13

    if-eqz v13, :cond_2

    iget v14, v13, Lbb/f;->a:I

    const/4 v15, 0x2

    if-ne v14, v15, :cond_2

    iget-wide v13, v13, Lbb/f;->b:J

    goto :goto_1

    :cond_1
    move-object/from16 v8, p2

    :cond_2
    move-wide v13, v11

    :goto_1
    const/4 v15, 0x0

    const/16 v16, 0x1

    :goto_2
    array-length v4, v10

    const/4 v5, -0x1

    if-ge v15, v4, :cond_4

    aget-object v4, v10, v15

    invoke-virtual {v4, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_4
    move v15, v5

    :goto_3
    if-ne v15, v5, :cond_6

    :cond_5
    :goto_4
    move/from16 v4, v16

    goto :goto_6

    :cond_6
    iget-object v4, v9, Lvn/h;->q:Lio/o;

    invoke-interface {v4, v15}, Lio/o;->i(I)I

    move-result v4

    if-ne v4, v5, :cond_7

    goto :goto_4

    :cond_7
    iget-boolean v5, v9, Lvn/h;->s:Z

    iget-object v10, v9, Lvn/h;->o:Landroid/net/Uri;

    invoke-virtual {v1, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    iput-boolean v5, v9, Lvn/h;->s:Z

    cmp-long v5, v13, v11

    if-eqz v5, :cond_5

    iget-object v5, v9, Lvn/h;->q:Lio/o;

    invoke-interface {v5, v4, v13, v14}, Lio/o;->r(IJ)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v9, Lvn/h;->g:Lwn/c;

    iget-object v4, v4, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/b;

    if-eqz v4, :cond_8

    invoke-static {v4, v13, v14}, Lwn/b;->a(Lwn/b;J)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_a

    cmp-long v4, v13, v11

    if-eqz v4, :cond_a

    move/from16 v4, v16

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :goto_7
    and-int/2addr v7, v4

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_b
    iget-object v1, v0, Lvn/k;->P:Lsn/r;

    invoke-interface {v1, v0}, Lsn/s0;->c(Lsn/t0;)V

    return v7
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Lvn/k;->V:Lq30/u0;

    invoke-virtual {v0}, Lq30/u0;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(J)V
    .locals 1

    iget-object v0, p0, Lvn/k;->V:Lq30/u0;

    invoke-virtual {v0, p1, p2}, Lq30/u0;->n(J)V

    return-void
.end method

.method public final o()V
    .locals 8

    iget-object v0, p0, Lvn/k;->S:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    iget-object v4, v3, Lvn/q;->J:Lko/c0;

    iget-object v5, v3, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v5}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvn/j;

    iget-object v6, v3, Lvn/q;->z:Lvn/h;

    invoke-virtual {v6, v5}, Lvn/h;->b(Lvn/j;)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    iput-boolean v7, v5, Lvn/j;->K:Z

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    if-ne v6, v5, :cond_2

    iget-boolean v3, v3, Lvn/q;->t0:Z

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lko/c0;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v4}, Lko/c0;->a()V

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lvn/k;->P:Lsn/r;

    invoke-interface {v0, p0}, Lsn/s0;->c(Lsn/t0;)V

    return-void
.end method

.method public final p(Ljava/lang/String;I[Landroid/net/Uri;[Lrm/c0;Lrm/c0;Ljava/util/List;Ljava/util/Map;J)Lvn/q;
    .locals 15

    new-instance v0, Lvn/h;

    iget-object v7, p0, Lvn/k;->K:Lty/c;

    iget-object v9, p0, Lvn/k;->O:Lsm/f;

    iget-object v1, p0, Lvn/k;->w:Lvn/i;

    iget-object v2, p0, Lvn/k;->x:Lwn/c;

    iget-object v5, p0, Lvn/k;->y:Lty/c;

    iget-object v6, p0, Lvn/k;->z:Lko/j0;

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v9}, Lvn/h;-><init>(Lvn/i;Lwn/c;[Landroid/net/Uri;[Lrm/c0;Lty/c;Lko/j0;Lty/c;Ljava/util/List;Lsm/f;)V

    new-instance v1, Lvn/q;

    iget-object v13, p0, Lvn/k;->H:Lsn/z;

    iget v14, p0, Lvn/k;->N:I

    iget-object v6, p0, Lvn/k;->I:Lko/o;

    iget-object v10, p0, Lvn/k;->E:Lvm/h;

    iget-object v11, p0, Lvn/k;->F:Lsn/z;

    iget-object v12, p0, Lvn/k;->G:Lg73/d;

    move-object v3, p0

    move/from16 v2, p2

    move-object/from16 v9, p5

    move-object/from16 v5, p7

    move-wide/from16 v7, p8

    move-object v4, v0

    move-object v0, v1

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v14}, Lvn/q;-><init>(Ljava/lang/String;ILvn/k;Lvn/h;Ljava/util/Map;Lko/o;JLrm/c0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;I)V

    return-object v0
.end method

.method public final r()V
    .locals 11

    iget v0, p0, Lvn/k;->Q:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lvn/k;->Q:I

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lvn/k;->S:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, Lvn/q;->s()V

    iget-object v5, v5, Lvn/q;->i0:Lsn/x0;

    iget v5, v5, Lsn/x0;->w:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lsn/w0;

    iget-object v1, p0, Lvn/k;->S:[Lvn/q;

    array-length v3, v1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lvn/q;->s()V

    iget-object v7, v6, Lvn/q;->i0:Lsn/x0;

    iget v7, v7, Lsn/x0;->w:I

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, Lvn/q;->s()V

    iget-object v10, v6, Lvn/q;->i0:Lsn/x0;

    invoke-virtual {v10, v8}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance v1, Lsn/x0;

    invoke-direct {v1, v0}, Lsn/x0;-><init>([Lsn/w0;)V

    iput-object v1, p0, Lvn/k;->R:Lsn/x0;

    iget-object v0, p0, Lvn/k;->P:Lsn/r;

    invoke-interface {v0, p0}, Lsn/r;->g(Lsn/s;)V

    return-void
.end method

.method public final u(J)Z
    .locals 5

    iget-object v0, p0, Lvn/k;->R:Lsn/x0;

    if-nez v0, :cond_2

    iget-object p1, p0, Lvn/k;->S:[Lvn/q;

    array-length p2, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, p1, v1

    iget-boolean v3, v2, Lvn/q;->d0:Z

    if-nez v3, :cond_0

    iget-wide v3, v2, Lvn/q;->p0:J

    invoke-virtual {v2, v3, v4}, Lvn/q;->u(J)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    iget-object v0, p0, Lvn/k;->V:Lq30/u0;

    invoke-virtual {v0, p1, p2}, Lq30/u0;->u(J)Z

    move-result p1

    return p1
.end method

.method public final v(JLrm/h1;)J
    .locals 13

    iget-object v0, p0, Lvn/k;->T:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    iget v4, v3, Lvn/q;->a0:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    iget-object v0, v3, Lvn/q;->z:Lvn/h;

    iget-object v1, v0, Lvn/h;->g:Lwn/c;

    iget-object v2, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v2}, Lio/o;->c()I

    move-result v2

    iget-object v3, v0, Lvn/h;->e:[Landroid/net/Uri;

    array-length v4, v3

    const/4 v5, 0x1

    if-ge v2, v4, :cond_0

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    iget-object v0, v0, Lvn/h;->q:Lio/o;

    invoke-interface {v0}, Lio/o;->m()I

    move-result v0

    aget-object v0, v3, v0

    invoke-virtual {v1, v5, v0}, Lwn/c;->a(ZLandroid/net/Uri;)Lwn/j;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    iget-object v2, v0, Lwn/j;->r:Lzr/g0;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    iget-boolean v3, v0, Lwn/n;->c:Z

    if-nez v3, :cond_1

    goto :goto_4

    :cond_1
    iget-wide v3, v0, Lwn/j;->h:J

    iget-wide v0, v1, Lwn/c;->N:J

    sub-long/2addr v3, v0

    sub-long v7, p1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v2, p1, v5}, Llo/y;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result p1

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwn/g;

    iget-wide v9, p2, Lwn/h;->E:J

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v5

    if-eq p1, p2, :cond_2

    add-int/2addr p1, v5

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwn/g;

    iget-wide p1, p1, Lwn/h;->E:J

    move-wide v11, p1

    :goto_2
    move-object/from16 v6, p3

    goto :goto_3

    :cond_2
    move-wide v11, v9

    goto :goto_2

    :goto_3
    invoke-virtual/range {v6 .. v12}, Lrm/h1;->a(JJJ)J

    move-result-wide p1

    add-long/2addr p1, v3

    return-wide p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_4
    return-wide p1
.end method
