.class public final Lp1/x1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public E:La0/w0;

.field public F:La0/w0;

.field public G:Ljava/util/Set;

.field public H:La0/w0;

.field public I:I

.field public synthetic J:Lp1/w0;

.field public final synthetic K:Lp1/y1;

.field public w:Ljava/util/List;

.field public x:Ljava/util/List;

.field public y:Ljava/util/List;

.field public z:La0/w0;


# direct methods
.method public constructor <init>(Lp1/y1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp1/x1;->K:Lp1/y1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static final f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    iget-object v5, v0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->clear()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->clear()V

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_0

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp1/w;

    invoke-virtual {v9}, Lp1/w;->a()V

    invoke-virtual {v0, v9}, Lp1/y1;->G(Lp1/w;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v2, La0/w0;->b:[Ljava/lang/Object;

    iget-object v6, v2, La0/w0;->a:[J

    array-length v8, v6

    add-int/lit8 v8, v8, -0x2

    const/16 v7, 0x8

    const-wide/16 p2, 0x80

    if-ltz v8, :cond_4

    const/4 v9, 0x0

    const-wide/16 v16, 0xff

    :goto_1
    aget-wide v11, v6, v9

    const/4 v10, 0x7

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    not-long v13, v11

    shl-long/2addr v13, v10

    and-long/2addr v13, v11

    and-long v13, v13, v18

    cmp-long v13, v13, v18

    if-eqz v13, :cond_3

    sub-int v13, v9, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v13, :cond_2

    and-long v20, v11, v16

    cmp-long v15, v20, p2

    if-gez v15, :cond_1

    shl-int/lit8 v15, v9, 0x3

    add-int/2addr v15, v14

    aget-object v15, v1, v15

    check-cast v15, Lp1/w;

    invoke-virtual {v15}, Lp1/w;->a()V

    invoke-virtual {v0, v15}, Lp1/y1;->G(Lp1/w;)V

    :cond_1
    shr-long/2addr v11, v7

    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    :cond_2
    if-ne v13, v7, :cond_5

    :cond_3
    if-eq v9, v8, :cond_5

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v10, 0x7

    const-wide/16 v16, 0xff

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    :cond_5
    invoke-virtual {v2}, La0/w0;->b()V

    iget-object v1, v3, La0/w0;->b:[Ljava/lang/Object;

    iget-object v2, v3, La0/w0;->a:[J

    array-length v6, v2

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_9

    const/4 v8, 0x0

    :goto_3
    aget-wide v11, v2, v8

    not-long v13, v11

    shl-long/2addr v13, v10

    and-long/2addr v13, v11

    and-long v13, v13, v18

    cmp-long v9, v13, v18

    if-eqz v9, :cond_8

    sub-int v9, v8, v6

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    rsub-int/lit8 v9, v9, 0x8

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v9, :cond_7

    and-long v14, v11, v16

    cmp-long v14, v14, p2

    if-gez v14, :cond_6

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    aget-object v14, v1, v14

    check-cast v14, Lp1/w;

    invoke-virtual {v14}, Lp1/w;->g()V

    :cond_6
    shr-long/2addr v11, v7

    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_7
    if-ne v9, v7, :cond_9

    :cond_8
    if-eq v8, v6, :cond_9

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_9
    invoke-virtual {v3}, La0/w0;->b()V

    invoke-virtual/range {p6 .. p6}, La0/w0;->b()V

    iget-object v1, v4, La0/w0;->b:[Ljava/lang/Object;

    iget-object v2, v4, La0/w0;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_d

    const/4 v6, 0x0

    :goto_5
    aget-wide v8, v2, v6

    not-long v11, v8

    shl-long/2addr v11, v10

    and-long/2addr v11, v8

    and-long v11, v11, v18

    cmp-long v11, v11, v18

    if-eqz v11, :cond_c

    sub-int v11, v6, v3

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_6
    if-ge v12, v11, :cond_b

    and-long v13, v8, v16

    cmp-long v13, v13, p2

    if-gez v13, :cond_a

    shl-int/lit8 v13, v6, 0x3

    add-int/2addr v13, v12

    aget-object v13, v1, v13

    check-cast v13, Lp1/w;

    invoke-virtual {v13}, Lp1/w;->a()V

    invoke-virtual {v0, v13}, Lp1/y1;->G(Lp1/w;)V

    :cond_a
    shr-long/2addr v8, v7

    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_b
    if-ne v11, v7, :cond_d

    :cond_c
    if-eq v6, v3, :cond_d

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, La0/w0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    return-void

    :goto_7
    monitor-exit v5

    throw v0
.end method

.method public static final h(Ljava/util/List;Lp1/y1;)V
    .locals 6

    invoke-interface {p0}, Ljava/util/List;->clear()V

    iget-object v0, p1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/y0;

    move-object v5, p0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    iget-object p0, p1, Lp1/y1;->k:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lbc3/c0;

    check-cast p2, Lp1/w0;

    check-cast p3, Lq83/d;

    new-instance p1, Lp1/x1;

    iget-object v0, p0, Lp1/x1;->K:Lp1/y1;

    invoke-direct {p1, v0, p3}, Lp1/x1;-><init>(Lp1/y1;Lq83/d;)V

    iput-object p2, p1, Lp1/x1;->J:Lp1/w0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp1/x1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lp1/x1;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Lp1/x1;->H:La0/w0;

    iget-object v5, v1, Lp1/x1;->G:Ljava/util/Set;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v1, Lp1/x1;->F:La0/w0;

    iget-object v7, v1, Lp1/x1;->E:La0/w0;

    iget-object v8, v1, Lp1/x1;->z:La0/w0;

    iget-object v9, v1, Lp1/x1;->y:Ljava/util/List;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lp1/x1;->x:Ljava/util/List;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lp1/x1;->w:Ljava/util/List;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Lp1/x1;->J:Lp1/w0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v12

    move-object v12, v2

    move-object/from16 v2, v19

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lp1/x1;->H:La0/w0;

    iget-object v5, v1, Lp1/x1;->G:Ljava/util/Set;

    check-cast v5, Ljava/util/Set;

    iget-object v6, v1, Lp1/x1;->F:La0/w0;

    iget-object v7, v1, Lp1/x1;->E:La0/w0;

    iget-object v8, v1, Lp1/x1;->z:La0/w0;

    iget-object v9, v1, Lp1/x1;->y:Ljava/util/List;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lp1/x1;->x:Ljava/util/List;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lp1/x1;->w:Ljava/util/List;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Lp1/x1;->J:Lp1/w0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v8

    move-object v8, v2

    move-object v2, v12

    move-object v12, v9

    move-object v9, v11

    move-object v11, v13

    :goto_0
    move-object v14, v5

    move-object v13, v7

    move-object v7, v6

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lp1/x1;->J:Lp1/w0;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    sget-object v8, La0/e1;->a:La0/w0;

    new-instance v8, La0/w0;

    invoke-direct {v8}, La0/w0;-><init>()V

    new-instance v9, La0/w0;

    invoke-direct {v9}, La0/w0;-><init>()V

    new-instance v10, La0/w0;

    invoke-direct {v10}, La0/w0;-><init>()V

    new-instance v11, Lr1/e;

    invoke-direct {v11, v10}, Lr1/e;-><init>(La0/w0;)V

    new-instance v12, La0/w0;

    invoke-direct {v12}, La0/w0;-><init>()V

    move-object/from16 v19, v11

    move-object v11, v5

    move-object/from16 v5, v19

    move-object/from16 v19, v10

    move-object v10, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v9

    move-object v9, v7

    move-object/from16 v7, v19

    :goto_1
    iget-object v13, v1, Lp1/x1;->K:Lp1/y1;

    iget-object v13, v13, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v13

    monitor-exit v13

    iget-object v13, v1, Lp1/x1;->K:Lp1/y1;

    iput-object v2, v1, Lp1/x1;->J:Lp1/w0;

    move-object v14, v11

    check-cast v14, Ljava/util/List;

    iput-object v14, v1, Lp1/x1;->w:Ljava/util/List;

    move-object v14, v10

    check-cast v14, Ljava/util/List;

    iput-object v14, v1, Lp1/x1;->x:Ljava/util/List;

    move-object v14, v9

    check-cast v14, Ljava/util/List;

    iput-object v14, v1, Lp1/x1;->y:Ljava/util/List;

    iput-object v8, v1, Lp1/x1;->z:La0/w0;

    iput-object v7, v1, Lp1/x1;->E:La0/w0;

    iput-object v6, v1, Lp1/x1;->F:La0/w0;

    move-object v14, v5

    check-cast v14, Ljava/util/Set;

    iput-object v14, v1, Lp1/x1;->G:Ljava/util/Set;

    iput-object v12, v1, Lp1/x1;->H:La0/w0;

    iput v4, v1, Lp1/x1;->I:I

    invoke-virtual {v13}, Lp1/y1;->y()Z

    move-result v14

    if-nez v14, :cond_6

    new-instance v14, Lbc3/m;

    invoke-static {v1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v15

    invoke-direct {v14, v4, v15}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v14}, Lbc3/m;->s()V

    iget-object v15, v13, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v15

    :try_start_0
    invoke-virtual {v13}, Lp1/y1;->y()Z

    move-result v16

    if-eqz v16, :cond_3

    move-object v13, v14

    goto :goto_2

    :cond_3
    iput-object v14, v13, Lp1/y1;->r:Lbc3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, 0x0

    :goto_2
    monitor-exit v15

    if-eqz v13, :cond_4

    sget-object v15, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v13, v15}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v14}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lr83/a;->w:Lr83/a;

    if-ne v13, v14, :cond_5

    goto :goto_3

    :cond_5
    sget-object v13, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    :cond_6
    sget-object v13, Ll83/a0;->a:Ll83/a0;

    :goto_3
    if-ne v13, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v13, v11

    move-object v11, v8

    move-object v8, v12

    move-object v12, v9

    move-object v9, v13

    goto/16 :goto_0

    :goto_4
    iget-object v5, v1, Lp1/x1;->K:Lp1/y1;

    sget-object v6, Lp1/y1;->z:Lec3/h2;

    invoke-virtual {v5}, Lp1/y1;->F()Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v6, v1, Lp1/x1;->K:Lp1/y1;

    new-instance v5, Lk71/x;

    const/4 v15, 0x1

    invoke-direct/range {v5 .. v15}, Lk71/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v2, v1, Lp1/x1;->J:Lp1/w0;

    move-object v6, v9

    check-cast v6, Ljava/util/List;

    iput-object v6, v1, Lp1/x1;->w:Ljava/util/List;

    move-object v6, v10

    check-cast v6, Ljava/util/List;

    iput-object v6, v1, Lp1/x1;->x:Ljava/util/List;

    move-object v6, v12

    check-cast v6, Ljava/util/List;

    iput-object v6, v1, Lp1/x1;->y:Ljava/util/List;

    iput-object v11, v1, Lp1/x1;->z:La0/w0;

    iput-object v13, v1, Lp1/x1;->E:La0/w0;

    iput-object v7, v1, Lp1/x1;->F:La0/w0;

    move-object v6, v14

    check-cast v6, Ljava/util/Set;

    iput-object v6, v1, Lp1/x1;->G:Ljava/util/Set;

    iput-object v8, v1, Lp1/x1;->H:La0/w0;

    iput v3, v1, Lp1/x1;->I:I

    invoke-interface {v2, v5, v1}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_8

    :goto_5
    return-object v0

    :cond_8
    move-object v5, v12

    move-object v12, v8

    move-object v8, v11

    move-object v11, v9

    move-object v9, v5

    move-object v6, v7

    move-object v7, v13

    move-object v5, v14

    :goto_6
    iget-object v13, v1, Lp1/x1;->K:Lp1/y1;

    iget-object v14, v13, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v14

    :try_start_1
    iget-object v15, v13, Lp1/y1;->l:La0/v0;

    invoke-virtual {v15}, La0/v0;->j()Z

    move-result v15

    const/16 v16, 0x0

    if-eqz v15, :cond_a

    iget-object v15, v13, Lp1/y1;->l:La0/v0;

    invoke-static {v15}, Lr1/a;->c(La0/v0;)La0/q0;

    move-result-object v15

    iget-object v3, v13, Lp1/y1;->l:La0/v0;

    invoke-virtual {v3}, La0/v0;->a()V

    iget-object v3, v13, Lp1/y1;->m:Lcom/google/crypto/tink/internal/l0;

    iget-object v4, v3, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v4, La0/v0;

    invoke-virtual {v4}, La0/v0;->a()V

    iget-object v3, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, La0/v0;

    invoke-virtual {v3}, La0/v0;->a()V

    iget-object v3, v13, Lp1/y1;->o:La0/v0;

    invoke-virtual {v3}, La0/v0;->a()V

    new-instance v3, La0/q0;

    iget v4, v15, La0/q0;->b:I

    invoke-direct {v3, v4}, La0/q0;-><init>(I)V

    iget-object v4, v15, La0/q0;->a:[Ljava/lang/Object;

    iget v15, v15, La0/q0;->b:I

    move-object/from16 v17, v0

    move/from16 v0, v16

    :goto_7
    if-ge v0, v15, :cond_9

    aget-object v18, v4, v0

    move/from16 p1, v0

    move-object/from16 v0, v18

    check-cast v0, Lp1/y0;

    iget-object v1, v13, Lp1/y1;->n:La0/v0;

    invoke-virtual {v1, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, La0/q0;->a(Ljava/lang/Object;)V

    add-int/lit8 v0, p1, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_9
    move-object/from16 v18, v2

    iget-object v0, v13, Lp1/y1;->n:La0/v0;

    invoke-virtual {v0}, La0/v0;->a()V

    goto :goto_8

    :cond_a
    move-object/from16 v17, v0

    move-object/from16 v18, v2

    sget-object v3, La0/b1;->b:La0/q0;

    const-string v0, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_8
    monitor-exit v14

    iget-object v0, v3, La0/q0;->a:[Ljava/lang/Object;

    iget v1, v3, La0/q0;->b:I

    move/from16 v2, v16

    :goto_9
    if-ge v2, v1, :cond_b

    aget-object v3, v0, v2

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Lp1/y0;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lp1/x0;

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_b
    const/4 v3, 0x2

    const/4 v4, 0x1

    move-object/from16 v1, p0

    move-object/from16 v0, v17

    move-object/from16 v2, v18

    goto/16 :goto_1

    :goto_a
    monitor-exit v14

    throw v0

    :cond_c
    move-object v1, v12

    move-object v12, v8

    move-object v8, v11

    move-object v11, v9

    move-object v9, v1

    move-object/from16 v1, p0

    move-object v6, v7

    move-object v7, v13

    move-object v5, v14

    goto/16 :goto_1
.end method
