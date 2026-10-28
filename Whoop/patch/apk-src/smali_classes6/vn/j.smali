.class public final Lvn/j;
.super Lun/b;
.source "SourceFile"


# static fields
.field public static final L:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public C:Lvn/b;

.field public D:Lvn/q;

.field public E:I

.field public F:Z

.field public volatile G:Z

.field public H:Z

.field public I:Lzr/g0;

.field public J:Z

.field public K:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:Lko/l;

.field public final q:Lko/n;

.field public final r:Lvn/b;

.field public final s:Z

.field public final t:Z

.field public final u:Llo/x;

.field public final v:Lvn/i;

.field public final w:Ljava/util/List;

.field public final x:Lvm/c;

.field public final y:Lnn/h;

.field public final z:Led3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lvn/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lvn/i;Lko/l;Lko/n;Lrm/c0;ZLko/l;Lko/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLlo/x;Lvm/c;Lvn/b;Lnn/h;Led3/a;ZLsm/f;)V
    .locals 13

    move-object/from16 v0, p7

    move-object v1, p0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p11

    move-object/from16 v6, p12

    move-wide/from16 v7, p13

    move-wide/from16 v9, p15

    move-wide/from16 v11, p17

    invoke-direct/range {v1 .. v12}, Lun/b;-><init>(Lko/l;Lko/n;Lrm/c0;ILjava/lang/Object;JJJ)V

    move/from16 p2, p5

    iput-boolean p2, p0, Lvn/j;->A:Z

    move/from16 p2, p19

    iput p2, p0, Lvn/j;->o:I

    move/from16 p2, p20

    iput-boolean p2, p0, Lvn/j;->K:Z

    move/from16 p2, p21

    iput p2, p0, Lvn/j;->l:I

    iput-object v0, p0, Lvn/j;->q:Lko/n;

    move-object/from16 p2, p6

    iput-object p2, p0, Lvn/j;->p:Lko/l;

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lvn/j;->F:Z

    move/from16 p2, p8

    iput-boolean p2, p0, Lvn/j;->B:Z

    move-object/from16 p2, p9

    iput-object p2, p0, Lvn/j;->m:Landroid/net/Uri;

    move/from16 p2, p23

    iput-boolean p2, p0, Lvn/j;->s:Z

    move-object/from16 p2, p24

    iput-object p2, p0, Lvn/j;->u:Llo/x;

    move/from16 p2, p22

    iput-boolean p2, p0, Lvn/j;->t:Z

    iput-object p1, p0, Lvn/j;->v:Lvn/i;

    move-object/from16 p1, p10

    iput-object p1, p0, Lvn/j;->w:Ljava/util/List;

    move-object/from16 p1, p25

    iput-object p1, p0, Lvn/j;->x:Lvm/c;

    move-object/from16 p1, p26

    iput-object p1, p0, Lvn/j;->r:Lvn/b;

    move-object/from16 p1, p27

    iput-object p1, p0, Lvn/j;->y:Lnn/h;

    move-object/from16 p1, p28

    iput-object p1, p0, Lvn/j;->z:Led3/a;

    move/from16 p1, p29

    iput-boolean p1, p0, Lvn/j;->n:Z

    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    iput-object p1, p0, Lvn/j;->I:Lzr/g0;

    sget-object p1, Lvn/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    iput p1, p0, Lvn/j;->k:I

    return-void
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 4

    invoke-static {p0}, Lrg/j;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    new-array v0, v1, [B

    array-length v2, p0

    if-le v2, v1, :cond_1

    array-length v2, p0

    sub-int/2addr v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    array-length v3, p0

    sub-int/2addr v3, v2

    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public final a(Lko/l;Lko/n;ZZ)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const-wide/16 v3, 0x0

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget v5, v1, Lvn/j;->E:I

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    :cond_0
    :goto_0
    move-object v11, v2

    :goto_1
    move-object/from16 v5, p1

    move/from16 v6, p4

    goto :goto_4

    :cond_1
    iget v5, v1, Lvn/j;->E:I

    int-to-long v5, v5

    iget-wide v7, v2, Lko/n;->f:J

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-nez v11, :cond_2

    :goto_2
    move-wide/from16 v18, v9

    goto :goto_3

    :cond_2
    sub-long v9, v7, v5

    goto :goto_2

    :goto_3
    cmp-long v9, v5, v3

    if-nez v9, :cond_3

    cmp-long v7, v7, v18

    if-nez v7, :cond_3

    goto :goto_0

    :cond_3
    new-instance v11, Lko/n;

    iget-object v12, v2, Lko/n;->a:Landroid/net/Uri;

    iget v13, v2, Lko/n;->b:I

    iget-object v14, v2, Lko/n;->c:[B

    iget-object v15, v2, Lko/n;->d:Ljava/util/Map;

    iget-wide v7, v2, Lko/n;->e:J

    add-long v16, v7, v5

    iget v5, v2, Lko/n;->g:I

    move/from16 v20, v5

    invoke-direct/range {v11 .. v20}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    goto :goto_1

    :goto_4
    :try_start_0
    invoke-virtual {v1, v5, v11, v6}, Lvn/j;->f(Lko/l;Lko/n;Z)Lwm/f;

    move-result-object v6

    if-eqz v0, :cond_4

    iget v0, v1, Lvn/j;->E:I

    invoke-virtual {v6, v0}, Lwm/f;->n(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_4
    :goto_5
    :try_start_1
    iget-boolean v0, v1, Lvn/j;->G:Z

    if-nez v0, :cond_5

    iget-object v0, v1, Lvn/j;->C:Lvn/b;

    iget-object v0, v0, Lvn/b;->a:Lwm/i;

    sget-object v7, Lvn/b;->d:Lt9/s;

    invoke-interface {v0, v6, v7}, Lwm/i;->i(Lwm/j;Lt9/s;)I

    move-result v0
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v0, :cond_5

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_9

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_5
    :try_start_2
    iget-wide v3, v6, Lwm/f;->z:J

    :goto_6
    iget-wide v6, v2, Lko/n;->e:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_8

    :goto_7
    :try_start_3
    iget-object v7, v1, Lun/a;->d:Lrm/c0;

    iget v7, v7, Lrm/c0;->E:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_6

    iget-object v0, v1, Lvn/j;->C:Lvn/b;

    iget-object v0, v0, Lvn/b;->a:Lwm/i;

    invoke-interface {v0, v3, v4, v3, v4}, Lwm/i;->b(JJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-wide v3, v6, Lwm/f;->z:J

    goto :goto_6

    :goto_8
    sub-long/2addr v3, v6

    long-to-int v0, v3

    iput v0, v1, Lvn/j;->E:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v5}, Lds/p;->w(Lko/l;)V

    return-void

    :cond_6
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_9
    :try_start_6
    iget-wide v3, v6, Lwm/f;->z:J

    iget-wide v6, v2, Lko/n;->e:J

    sub-long/2addr v3, v6

    long-to-int v2, v3

    iput v2, v1, Lvn/j;->E:I

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_a
    invoke-static {v5}, Lds/p;->w(Lko/l;)V

    throw v0
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lvn/j;->D:Lvn/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lvn/j;->C:Lvn/b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lvn/j;->r:Lvn/b;

    if-eqz v0, :cond_1

    iget-object v2, v0, Lvn/b;->a:Lwm/i;

    instance-of v3, v2, Lfn/x;

    if-nez v3, :cond_0

    instance-of v2, v2, Ldn/j;

    if-eqz v2, :cond_1

    :cond_0
    iput-object v0, p0, Lvn/j;->C:Lvn/b;

    iput-boolean v1, p0, Lvn/j;->F:Z

    :cond_1
    iget-object v0, p0, Lvn/j;->q:Lko/n;

    iget-object v2, p0, Lvn/j;->p:Lko/l;

    iget-boolean v3, p0, Lvn/j;->F:Z

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, p0, Lvn/j;->B:Z

    invoke-virtual {p0, v2, v0, v3, v1}, Lvn/j;->a(Lko/l;Lko/n;ZZ)V

    iput v1, p0, Lvn/j;->E:I

    iput-boolean v1, p0, Lvn/j;->F:Z

    :goto_0
    iget-boolean v0, p0, Lvn/j;->G:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lvn/j;->t:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lun/a;->i:Lko/i0;

    iget-object v2, p0, Lun/a;->b:Lko/n;

    iget-boolean v3, p0, Lvn/j;->A:Z

    invoke-virtual {p0, v0, v2, v3, v1}, Lvn/j;->a(Lko/l;Lko/n;ZZ)V

    :cond_3
    iget-boolean v0, p0, Lvn/j;->G:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lvn/j;->H:Z

    :cond_4
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvn/j;->G:Z

    return-void
.end method

.method public final e(I)I
    .locals 1

    iget-boolean v0, p0, Lvn/j;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Lvn/j;->I:Lzr/g0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lvn/j;->I:Lzr/g0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final f(Lko/l;Lko/n;Z)Lwm/f;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-interface/range {p1 .. p2}, Lko/l;->z(Lko/n;)J

    move-result-wide v6

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz p3, :cond_4

    :try_start_0
    iget-object v2, v1, Lvn/j;->u:Llo/x;

    iget-boolean v3, v1, Lvn/j;->s:Z

    iget-wide v4, v1, Lun/a;->g:J

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-wide v12, v2, Llo/x;->a:J

    const-wide v14, 0x7ffffffffffffffeL

    cmp-long v12, v12, v14

    if-nez v12, :cond_0

    move v12, v10

    goto :goto_0

    :cond_0
    move v12, v11

    :goto_0
    invoke-static {v12}, Llo/a;->i(Z)V

    iget-wide v12, v2, Llo/x;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v12, v12, v8

    if-eqz v12, :cond_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :cond_1
    if-eqz v3, :cond_2

    :try_start_3
    iget-object v3, v2, Llo/x;->d:Ljava/lang/ThreadLocal;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_1
    iget-wide v3, v2, Llo/x;->b:J

    cmp-long v3, v3, v8

    if-nez v3, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_3
    :goto_2
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_4

    :goto_3
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0

    :cond_4
    :goto_4
    new-instance v2, Lwm/f;

    iget-wide v4, v0, Lko/n;->e:J

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lwm/f;-><init>(Lko/i;JJ)V

    iget-object v3, v1, Lvn/j;->C:Lvn/b;

    if-nez v3, :cond_31

    iget-object v3, v1, Lvn/j;->z:Led3/a;

    iput v11, v2, Lwm/f;->F:I

    const/16 v4, 0x8

    const/16 v5, 0xa

    :try_start_7
    invoke-virtual {v3, v5}, Led3/a;->H(I)V

    iget-object v6, v3, Led3/a;->a:[B

    invoke-virtual {v2, v6, v11, v5, v11}, Lwm/f;->c([BIIZ)Z
    :try_end_7
    .catch Ljava/io/EOFException; {:try_start_7 .. :try_end_7} :catch_1

    invoke-virtual {v3}, Led3/a;->A()I

    move-result v6

    const v7, 0x494433

    if-eq v6, v7, :cond_6

    :catch_1
    :cond_5
    :goto_5
    move-wide v5, v8

    goto :goto_7

    :cond_6
    const/4 v6, 0x3

    invoke-virtual {v3, v6}, Led3/a;->L(I)V

    invoke-virtual {v3}, Led3/a;->w()I

    move-result v6

    add-int/lit8 v7, v6, 0xa

    iget-object v12, v3, Led3/a;->a:[B

    array-length v13, v12

    if-le v7, v13, :cond_7

    invoke-virtual {v3, v7}, Led3/a;->H(I)V

    iget-object v7, v3, Led3/a;->a:[B

    invoke-static {v12, v11, v7, v11, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    iget-object v7, v3, Led3/a;->a:[B

    invoke-virtual {v2, v7, v5, v6, v11}, Lwm/f;->c([BIIZ)Z

    iget-object v5, v1, Lvn/j;->y:Lnn/h;

    iget-object v7, v3, Led3/a;->a:[B

    invoke-virtual {v5, v6, v7}, Lnn/h;->f0(I[B)Lin/c;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    iget-object v5, v5, Lin/c;->w:[Lin/b;

    array-length v6, v5

    move v7, v11

    :goto_6
    if-ge v7, v6, :cond_5

    aget-object v12, v5, v7

    instance-of v13, v12, Lnn/l;

    if-eqz v13, :cond_9

    check-cast v12, Lnn/l;

    const-string v13, "com.apple.streaming.transportStreamTimestamp"

    iget-object v14, v12, Lnn/l;->x:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    iget-object v5, v12, Lnn/l;->y:[B

    iget-object v6, v3, Led3/a;->a:[B

    invoke-static {v5, v11, v6, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v3, v11}, Led3/a;->K(I)V

    invoke-virtual {v3, v4}, Led3/a;->J(I)V

    invoke-virtual {v3}, Led3/a;->p()J

    move-result-wide v5

    const-wide v12, 0x1ffffffffL

    and-long/2addr v5, v12

    goto :goto_7

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :goto_7
    iput v11, v2, Lwm/f;->F:I

    iget-object v3, v1, Lvn/j;->r:Lvn/b;

    if-eqz v3, :cond_12

    iget-object v0, v3, Lvn/b;->c:Llo/x;

    iget-object v4, v3, Lvn/b;->b:Lrm/c0;

    iget-object v7, v3, Lvn/b;->a:Lwm/i;

    instance-of v14, v7, Lfn/x;

    if-nez v14, :cond_b

    instance-of v7, v7, Ldn/j;

    if-eqz v7, :cond_a

    goto :goto_8

    :cond_a
    move v7, v11

    goto :goto_9

    :cond_b
    :goto_8
    move v7, v10

    :goto_9
    xor-int/2addr v7, v10

    invoke-static {v7}, Llo/a;->i(Z)V

    iget-object v3, v3, Lvn/b;->a:Lwm/i;

    instance-of v7, v3, Lvn/u;

    if-eqz v7, :cond_c

    new-instance v3, Lvn/u;

    iget-object v7, v4, Lrm/c0;->y:Ljava/lang/String;

    invoke-direct {v3, v7, v0}, Lvn/u;-><init>(Ljava/lang/String;Llo/x;)V

    goto :goto_a

    :cond_c
    instance-of v7, v3, Lfn/d;

    if-eqz v7, :cond_d

    new-instance v3, Lfn/d;

    invoke-direct {v3, v11}, Lfn/d;-><init>(I)V

    goto :goto_a

    :cond_d
    instance-of v7, v3, Lfn/a;

    if-eqz v7, :cond_e

    new-instance v3, Lfn/a;

    invoke-direct {v3}, Lfn/a;-><init>()V

    goto :goto_a

    :cond_e
    instance-of v7, v3, Lfn/c;

    if-eqz v7, :cond_f

    new-instance v3, Lfn/c;

    invoke-direct {v3}, Lfn/c;-><init>()V

    goto :goto_a

    :cond_f
    instance-of v7, v3, Lcn/d;

    if-eqz v7, :cond_10

    new-instance v3, Lcn/d;

    invoke-direct {v3, v11}, Lcn/d;-><init>(I)V

    :goto_a
    new-instance v7, Lvn/b;

    invoke-direct {v7, v3, v4, v0}, Lvn/b;-><init>(Lwm/i;Lrm/c0;Llo/x;)V

    move-wide/from16 v23, v5

    move-wide/from16 v16, v8

    move/from16 v19, v10

    move v5, v11

    goto/16 :goto_1c

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unexpected extractor type for recreation: "

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_b

    :cond_11
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_b
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    iget-object v3, v1, Lvn/j;->v:Lvn/i;

    iget-object v0, v0, Lko/n;->a:Landroid/net/Uri;

    iget-object v7, v1, Lun/a;->d:Lrm/c0;

    iget-object v14, v1, Lvn/j;->w:Ljava/util/List;

    iget-object v15, v1, Lvn/j;->u:Llo/x;

    move-wide/from16 v16, v8

    invoke-interface/range {p1 .. p1}, Lko/l;->getResponseHeaders()Ljava/util/Map;

    move-result-object v8

    check-cast v3, Lvn/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v7, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v3}, Llo/a;->t(Ljava/lang/String;)I

    move-result v3

    const-string v9, "Content-Type"

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_14

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v18

    if-eqz v18, :cond_13

    goto :goto_c

    :cond_13
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_d

    :cond_14
    :goto_c
    const/4 v8, 0x0

    :goto_d
    invoke-static {v8}, Llo/a;->t(Ljava/lang/String;)I

    move-result v8

    invoke-static {v0}, Llo/a;->u(Landroid/net/Uri;)I

    move-result v0

    new-instance v9, Ljava/util/ArrayList;

    sget-object v18, Lvn/c;->b:[I

    const/4 v12, 0x7

    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v9, v3}, Lvn/c;->a(Ljava/util/ArrayList;I)V

    invoke-static {v9, v8}, Lvn/c;->a(Ljava/util/ArrayList;I)V

    invoke-static {v9, v0}, Lvn/c;->a(Ljava/util/ArrayList;I)V

    move v13, v11

    :goto_e
    if-ge v13, v12, :cond_15

    aget v4, v18, v13

    invoke-static {v9, v4}, Lvn/c;->a(Ljava/util/ArrayList;I)V

    add-int/lit8 v13, v13, 0x1

    const/16 v4, 0x8

    goto :goto_e

    :cond_15
    iput v11, v2, Lwm/f;->F:I

    move v4, v11

    const/4 v13, 0x0

    :goto_f
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v4, v11, :cond_29

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    const/16 v12, 0xb

    if-eqz v11, :cond_25

    if-eq v11, v10, :cond_24

    move/from16 v19, v10

    const/4 v10, 0x2

    if-eq v11, v10, :cond_23

    const/4 v10, 0x7

    if-eq v11, v10, :cond_22

    const/16 v10, 0x8

    if-eq v11, v10, :cond_1c

    if-eq v11, v12, :cond_17

    const/16 v10, 0xd

    if-eq v11, v10, :cond_16

    move/from16 v21, v4

    move-wide/from16 v23, v5

    move-object/from16 v22, v9

    const/4 v10, 0x0

    goto/16 :goto_19

    :cond_16
    new-instance v10, Lvn/u;

    iget-object v12, v7, Lrm/c0;->y:Ljava/lang/String;

    invoke-direct {v10, v12, v15}, Lvn/u;-><init>(Ljava/lang/String;Llo/x;)V

    move/from16 v21, v4

    move-wide/from16 v23, v5

    move-object/from16 v22, v9

    goto/16 :goto_19

    :cond_17
    if-eqz v14, :cond_18

    const/16 v10, 0x30

    move-object v12, v14

    :goto_10
    move/from16 v21, v4

    goto :goto_11

    :cond_18
    new-instance v10, Lrm/b0;

    invoke-direct {v10}, Lrm/b0;-><init>()V

    const-string v12, "application/cea-608"

    iput-object v12, v10, Lrm/b0;->k:Ljava/lang/String;

    new-instance v12, Lrm/c0;

    invoke-direct {v12, v10}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/16 v12, 0x10

    move/from16 v21, v12

    move-object v12, v10

    move/from16 v10, v21

    goto :goto_10

    :goto_11
    iget-object v4, v7, Lrm/c0;->I:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v22

    if-nez v22, :cond_1b

    move-object/from16 v22, v9

    const-string v9, "audio/mp4a-latm"

    invoke-static {v4, v9}, Llo/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_19

    goto :goto_12

    :cond_19
    or-int/lit8 v10, v10, 0x2

    :goto_12
    const-string v9, "video/avc"

    invoke-static {v4, v9}, Llo/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1a

    goto :goto_13

    :cond_1a
    or-int/lit8 v10, v10, 0x4

    goto :goto_13

    :cond_1b
    move-object/from16 v22, v9

    :goto_13
    new-instance v4, Lfn/x;

    new-instance v9, Lfn/f;

    invoke-direct {v9, v10, v12}, Lfn/f;-><init>(ILjava/util/List;)V

    const/4 v10, 0x2

    invoke-direct {v4, v10, v15, v9}, Lfn/x;-><init>(ILlo/x;Lfn/f;)V

    move-object v10, v4

    :goto_14
    move-wide/from16 v23, v5

    goto/16 :goto_19

    :cond_1c
    move/from16 v21, v4

    move-object/from16 v22, v9

    new-instance v10, Ldn/j;

    iget-object v4, v7, Lrm/c0;->J:Lin/c;

    if-nez v4, :cond_1e

    :cond_1d
    const/4 v4, 0x0

    goto :goto_16

    :cond_1e
    const/4 v9, 0x0

    :goto_15
    iget-object v12, v4, Lin/c;->w:[Lin/b;

    move-object/from16 v20, v4

    array-length v4, v12

    if-ge v9, v4, :cond_1d

    aget-object v4, v12, v9

    instance-of v12, v4, Lvn/t;

    if-eqz v12, :cond_1f

    check-cast v4, Lvn/t;

    iget-object v4, v4, Lvn/t;->y:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_1f
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v4, v20

    goto :goto_15

    :goto_16
    if-eqz v4, :cond_20

    const/4 v4, 0x4

    goto :goto_17

    :cond_20
    const/4 v4, 0x0

    :goto_17
    if-eqz v14, :cond_21

    move-object v9, v14

    goto :goto_18

    :cond_21
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_18
    invoke-direct {v10, v4, v15, v9}, Ldn/j;-><init>(ILlo/x;Ljava/util/List;)V

    goto :goto_14

    :cond_22
    move/from16 v21, v4

    move-object/from16 v22, v9

    new-instance v10, Lcn/d;

    move-wide/from16 v23, v5

    const-wide/16 v4, 0x0

    invoke-direct {v10, v4, v5}, Lcn/d;-><init>(J)V

    goto :goto_19

    :cond_23
    move/from16 v21, v4

    move-wide/from16 v23, v5

    move-object/from16 v22, v9

    new-instance v10, Lfn/d;

    const/4 v4, 0x0

    invoke-direct {v10, v4}, Lfn/d;-><init>(I)V

    goto :goto_19

    :cond_24
    move/from16 v21, v4

    move-wide/from16 v23, v5

    move-object/from16 v22, v9

    move/from16 v19, v10

    new-instance v10, Lfn/c;

    invoke-direct {v10}, Lfn/c;-><init>()V

    goto :goto_19

    :cond_25
    move/from16 v21, v4

    move-wide/from16 v23, v5

    move-object/from16 v22, v9

    move/from16 v19, v10

    new-instance v10, Lfn/a;

    invoke-direct {v10}, Lfn/a;-><init>()V

    :goto_19
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_8
    invoke-interface {v10, v2}, Lwm/i;->g(Lwm/j;)Z

    move-result v4
    :try_end_8
    .catch Ljava/io/EOFException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    const/4 v5, 0x0

    iput v5, v2, Lwm/f;->F:I

    goto :goto_1a

    :catchall_1
    move-exception v0

    const/4 v5, 0x0

    iput v5, v2, Lwm/f;->F:I

    throw v0

    :catch_2
    const/4 v5, 0x0

    iput v5, v2, Lwm/f;->F:I

    move v4, v5

    :goto_1a
    if-eqz v4, :cond_26

    new-instance v0, Lvn/b;

    invoke-direct {v0, v10, v7, v15}, Lvn/b;-><init>(Lwm/i;Lrm/c0;Llo/x;)V

    :goto_1b
    move-object v7, v0

    goto :goto_1c

    :cond_26
    if-nez v13, :cond_28

    if-eq v11, v3, :cond_27

    if-eq v11, v8, :cond_27

    if-eq v11, v0, :cond_27

    const/16 v4, 0xb

    if-ne v11, v4, :cond_28

    :cond_27
    move-object v13, v10

    :cond_28
    add-int/lit8 v4, v21, 0x1

    move/from16 v10, v19

    move-object/from16 v9, v22

    move-wide/from16 v5, v23

    const/4 v12, 0x7

    goto/16 :goto_f

    :cond_29
    move-wide/from16 v23, v5

    move/from16 v19, v10

    const/4 v5, 0x0

    new-instance v0, Lvn/b;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v13, v7, v15}, Lvn/b;-><init>(Lwm/i;Lrm/c0;Llo/x;)V

    goto :goto_1b

    :goto_1c
    iput-object v7, v1, Lvn/j;->C:Lvn/b;

    iget-object v0, v7, Lvn/b;->a:Lwm/i;

    instance-of v3, v0, Lfn/d;

    if-nez v3, :cond_2b

    instance-of v3, v0, Lfn/a;

    if-nez v3, :cond_2b

    instance-of v3, v0, Lfn/c;

    if-nez v3, :cond_2b

    instance-of v0, v0, Lcn/d;

    if-eqz v0, :cond_2a

    goto :goto_1d

    :cond_2a
    move v0, v5

    goto :goto_1e

    :cond_2b
    :goto_1d
    move/from16 v0, v19

    :goto_1e
    if-eqz v0, :cond_2e

    iget-object v0, v1, Lvn/j;->D:Lvn/q;

    cmp-long v3, v23, v16

    if-eqz v3, :cond_2c

    iget-object v3, v1, Lvn/j;->u:Llo/x;

    move-wide/from16 v8, v23

    invoke-virtual {v3, v8, v9}, Llo/x;->b(J)J

    move-result-wide v3

    goto :goto_1f

    :cond_2c
    iget-wide v3, v1, Lun/a;->g:J

    :goto_1f
    iget-wide v6, v0, Lvn/q;->v0:J

    cmp-long v6, v6, v3

    if-eqz v6, :cond_30

    iput-wide v3, v0, Lvn/q;->v0:J

    iget-object v0, v0, Lvn/q;->V:[Lvn/p;

    array-length v6, v0

    move v7, v5

    :goto_20
    if-ge v7, v6, :cond_30

    aget-object v8, v0, v7

    iget-wide v9, v8, Lsn/q0;->F:J

    cmp-long v9, v9, v3

    if-eqz v9, :cond_2d

    iput-wide v3, v8, Lsn/q0;->F:J

    move/from16 v9, v19

    iput-boolean v9, v8, Lsn/q0;->z:Z

    :cond_2d
    add-int/lit8 v7, v7, 0x1

    const/16 v19, 0x1

    goto :goto_20

    :cond_2e
    iget-object v0, v1, Lvn/j;->D:Lvn/q;

    iget-wide v3, v0, Lvn/q;->v0:J

    const-wide/16 v6, 0x0

    cmp-long v3, v3, v6

    if-eqz v3, :cond_30

    iput-wide v6, v0, Lvn/q;->v0:J

    iget-object v0, v0, Lvn/q;->V:[Lvn/p;

    array-length v3, v0

    move v4, v5

    :goto_21
    if-ge v4, v3, :cond_30

    aget-object v8, v0, v4

    iget-wide v9, v8, Lsn/q0;->F:J

    cmp-long v9, v9, v6

    if-eqz v9, :cond_2f

    iput-wide v6, v8, Lsn/q0;->F:J

    const/4 v9, 0x1

    iput-boolean v9, v8, Lsn/q0;->z:Z

    :cond_2f
    add-int/lit8 v4, v4, 0x1

    goto :goto_21

    :cond_30
    iget-object v0, v1, Lvn/j;->D:Lvn/q;

    iget-object v0, v0, Lvn/q;->X:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iget-object v0, v1, Lvn/j;->C:Lvn/b;

    iget-object v3, v1, Lvn/j;->D:Lvn/q;

    iget-object v0, v0, Lvn/b;->a:Lwm/i;

    invoke-interface {v0, v3}, Lwm/i;->h(Lwm/k;)V

    goto :goto_22

    :cond_31
    move v5, v11

    :goto_22
    iget-object v0, v1, Lvn/j;->D:Lvn/q;

    iget-object v3, v1, Lvn/j;->x:Lvm/c;

    iget-object v4, v0, Lvn/q;->w0:Lvm/c;

    invoke-static {v4, v3}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_33

    iput-object v3, v0, Lvn/q;->w0:Lvm/c;

    move v11, v5

    :goto_23
    iget-object v4, v0, Lvn/q;->V:[Lvn/p;

    array-length v5, v4

    if-ge v11, v5, :cond_33

    iget-object v5, v0, Lvn/q;->o0:[Z

    aget-boolean v5, v5, v11

    if-eqz v5, :cond_32

    aget-object v4, v4, v11

    iput-object v3, v4, Lvn/p;->I:Lvm/c;

    const/4 v9, 0x1

    iput-boolean v9, v4, Lsn/q0;->z:Z

    goto :goto_24

    :cond_32
    const/4 v9, 0x1

    :goto_24
    add-int/lit8 v11, v11, 0x1

    goto :goto_23

    :cond_33
    return-object v2
.end method
