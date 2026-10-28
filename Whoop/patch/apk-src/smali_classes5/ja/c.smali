.class public final Lja/c;
.super Lvd/f;
.source "SourceFile"


# instance fields
.field public final a:Lx8/n;

.field public final b:Llo/s;

.field public c:Lx8/s;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx8/n;

    invoke-direct {v0}, Lx8/n;-><init>()V

    iput-object v0, p0, Lja/c;->a:Lx8/n;

    new-instance v0, Llo/s;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Llo/s;-><init>(I)V

    iput-object v0, p0, Lja/c;->b:Llo/s;

    return-void
.end method


# virtual methods
.method public final n(Lca/a;Ljava/nio/ByteBuffer;)Lu8/c0;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lja/c;->a:Lx8/n;

    iget-object v3, v1, Lja/c;->b:Llo/s;

    iget-object v4, v1, Lja/c;->c:Lx8/s;

    if-eqz v4, :cond_0

    iget-wide v5, v0, Lca/a;->J:J

    monitor-enter v4

    :try_start_0
    iget-wide v7, v4, Lx8/s;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    cmp-long v4, v5, v7

    if-eqz v4, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    :goto_0
    new-instance v4, Lx8/s;

    iget-wide v5, v0, La9/e;->G:J

    invoke-direct {v4, v5, v6}, Lx8/s;-><init>(J)V

    iput-object v4, v1, Lja/c;->c:Lx8/s;

    iget-wide v5, v0, La9/e;->G:J

    iget-wide v7, v0, Lca/a;->J:J

    sub-long/2addr v5, v7

    invoke-virtual {v4, v5, v6}, Lx8/s;->a(J)J

    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-virtual {v2, v4, v0}, Lx8/n;->D(I[B)V

    invoke-virtual {v3, v4, v0}, Llo/s;->o(I[B)V

    const/16 v0, 0x27

    invoke-virtual {v3, v0}, Llo/s;->t(I)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Llo/s;->i(I)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    invoke-virtual {v3, v6}, Llo/s;->i(I)I

    move-result v6

    int-to-long v6, v6

    or-long v11, v4, v6

    const/16 v4, 0x14

    invoke-virtual {v3, v4}, Llo/s;->t(I)V

    const/16 v4, 0xc

    invoke-virtual {v3, v4}, Llo/s;->i(I)I

    move-result v5

    const/16 v6, 0x8

    invoke-virtual {v3, v6}, Llo/s;->i(I)I

    move-result v3

    const/16 v6, 0xe

    invoke-virtual {v2, v6}, Lx8/n;->G(I)V

    const/4 v6, 0x0

    if-eqz v3, :cond_19

    const/16 v7, 0xff

    const/4 v8, 0x4

    if-eq v3, v7, :cond_18

    if-eq v3, v8, :cond_e

    const/4 v5, 0x5

    if-eq v3, v5, :cond_3

    const/4 v4, 0x6

    if-eq v3, v4, :cond_2

    const/4 v2, 0x0

    goto/16 :goto_f

    :cond_2
    iget-object v3, v1, Lja/c;->c:Lx8/s;

    invoke-static {v11, v12, v2}, Lja/a;->b(JLx8/n;)J

    move-result-wide v14

    invoke-virtual {v3, v14, v15}, Lx8/s;->b(J)J

    move-result-wide v16

    new-instance v13, Lja/a;

    const/16 v18, 0x2

    invoke-direct/range {v13 .. v18}, Lja/a;-><init>(JJI)V

    move-object v2, v13

    goto/16 :goto_f

    :cond_3
    iget-object v3, v1, Lja/c;->c:Lx8/s;

    invoke-virtual {v2}, Lx8/n;->v()J

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v5

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_4

    move v5, v0

    goto :goto_1

    :cond_4
    move v5, v6

    :goto_1
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-nez v5, :cond_d

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v5

    and-int/lit8 v10, v5, 0x40

    if-eqz v10, :cond_5

    move v10, v0

    goto :goto_2

    :cond_5
    move v10, v6

    :goto_2
    and-int/lit8 v13, v5, 0x20

    if-eqz v13, :cond_6

    move v13, v0

    goto :goto_3

    :cond_6
    move v13, v6

    :goto_3
    and-int/lit8 v5, v5, 0x10

    if-eqz v5, :cond_7

    move v5, v0

    goto :goto_4

    :cond_7
    move v5, v6

    :goto_4
    if-eqz v10, :cond_8

    if-nez v5, :cond_8

    invoke-static {v11, v12, v2}, Lja/a;->b(JLx8/n;)J

    move-result-wide v14

    goto :goto_5

    :cond_8
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    :goto_5
    if-nez v10, :cond_b

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v7

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v6

    :goto_6
    if-ge v8, v7, :cond_a

    invoke-virtual {v2}, Lx8/n;->t()I

    if-nez v5, :cond_9

    invoke-static {v11, v12, v2}, Lja/a;->b(JLx8/n;)J

    move-result-wide v16

    move-wide/from16 v0, v16

    goto :goto_7

    :cond_9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_7
    new-instance v9, Lg73/d;

    invoke-virtual {v3, v0, v1}, Lx8/s;->b(J)J

    invoke-direct {v9, v4}, Lg73/d;-><init>(I)V

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v1, p0

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    move-object v7, v10

    :cond_b
    if-eqz v13, :cond_c

    invoke-virtual {v2}, Lx8/n;->t()I

    invoke-virtual {v2}, Lx8/n;->v()J

    :cond_c
    invoke-virtual {v2}, Lx8/n;->z()I

    invoke-virtual {v2}, Lx8/n;->t()I

    invoke-virtual {v2}, Lx8/n;->t()I

    move-wide v8, v14

    :goto_8
    move-object/from16 v18, v7

    goto :goto_9

    :cond_d
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_8

    :goto_9
    new-instance v17, Lja/a;

    invoke-virtual {v3, v8, v9}, Lx8/s;->b(J)J

    move-result-wide v21

    move-wide/from16 v19, v8

    invoke-direct/range {v17 .. v22}, Lja/a;-><init>(Ljava/util/List;JJ)V

    move-object/from16 v2, v17

    goto/16 :goto_f

    :cond_e
    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v3, v6

    :goto_a
    if-ge v3, v0, :cond_17

    invoke-virtual {v2}, Lx8/n;->v()J

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v4

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_b

    :cond_f
    move v4, v6

    :goto_b
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/16 v7, 0xd

    if-nez v4, :cond_16

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v4

    and-int/lit8 v8, v4, 0x40

    if-eqz v8, :cond_10

    const/4 v8, 0x1

    goto :goto_c

    :cond_10
    move v8, v6

    :goto_c
    and-int/lit8 v4, v4, 0x20

    if-eqz v4, :cond_11

    const/4 v4, 0x1

    goto :goto_d

    :cond_11
    move v4, v6

    :goto_d
    if-eqz v8, :cond_12

    invoke-virtual {v2}, Lx8/n;->v()J

    :cond_12
    if-nez v8, :cond_14

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v5

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    move v9, v6

    :goto_e
    if-ge v9, v5, :cond_13

    invoke-virtual {v2}, Lx8/n;->t()I

    invoke-virtual {v2}, Lx8/n;->v()J

    new-instance v10, Lg73/a;

    invoke-direct {v10, v7}, Lg73/a;-><init>(I)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_e

    :cond_13
    move-object v5, v8

    :cond_14
    if-eqz v4, :cond_15

    invoke-virtual {v2}, Lx8/n;->t()I

    invoke-virtual {v2}, Lx8/n;->v()J

    :cond_15
    invoke-virtual {v2}, Lx8/n;->z()I

    invoke-virtual {v2}, Lx8/n;->t()I

    invoke-virtual {v2}, Lx8/n;->t()I

    :cond_16
    new-instance v4, Lg73/d;

    invoke-direct {v4, v7}, Lg73/d;-><init>(I)V

    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_17
    new-instance v2, Lja/d;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    goto :goto_f

    :cond_18
    invoke-virtual {v2}, Lx8/n;->v()J

    move-result-wide v9

    sub-int/2addr v5, v8

    new-array v0, v5, [B

    invoke-virtual {v2, v0, v6, v5}, Lx8/n;->e([BII)V

    new-instance v8, Lja/a;

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v13}, Lja/a;-><init>(JJI)V

    move-object v2, v8

    goto :goto_f

    :cond_19
    new-instance v2, Lja/d;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :goto_f
    new-instance v0, Lu8/c0;

    if-nez v2, :cond_1a

    new-array v1, v6, [Lu8/b0;

    invoke-direct {v0, v1}, Lu8/c0;-><init>([Lu8/b0;)V

    return-object v0

    :cond_1a
    const/4 v1, 0x1

    new-array v1, v1, [Lu8/b0;

    aput-object v2, v1, v6

    invoke-direct {v0, v1}, Lu8/c0;-><init>([Lu8/b0;)V

    return-object v0
.end method
