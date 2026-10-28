.class public abstract Li9/o;
.super Lb9/f;
.source "SourceFile"


# static fields
.field public static final b1:[B


# instance fields
.field public A0:J

.field public B0:I

.field public C0:I

.field public D0:Ljava/nio/ByteBuffer;

.field public E0:Z

.field public F0:Z

.field public G0:Z

.field public H0:Z

.field public I0:Z

.field public J0:Z

.field public K0:I

.field public L0:I

.field public M0:I

.field public N0:Z

.field public O0:Z

.field public P0:Z

.field public Q0:J

.field public final R:Li9/j;

.field public R0:J

.field public final S:Li9/h;

.field public S0:Z

.field public final T:F

.field public T0:Z

.field public final U:La9/e;

.field public U0:Z

.field public final V:La9/e;

.field public V0:Z

.field public final W:La9/e;

.field public W0:Landroidx/media3/exoplayer/ExoPlaybackException;

.field public final X:Li9/f;

.field public X0:Lb9/g;

.field public final Y:Landroid/media/MediaCodec$BufferInfo;

.field public Y0:Li9/n;

.field public final Z:Ljava/util/ArrayDeque;

.field public Z0:J

.field public final a0:Ld9/b0;

.field public a1:Z

.field public b0:Lu8/p;

.field public c0:Lu8/p;

.field public d0:Le10/k0;

.field public e0:Le10/k0;

.field public f0:Lb9/h0;

.field public g0:Landroid/media/MediaCrypto;

.field public final h0:J

.field public i0:F

.field public j0:F

.field public k0:Li9/k;

.field public l0:Lu8/p;

.field public m0:Landroid/media/MediaFormat;

.field public n0:Z

.field public o0:F

.field public p0:Ljava/util/ArrayDeque;

.field public q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

.field public r0:Li9/m;

.field public s0:I

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public w0:Z

.field public x0:Z

.field public y0:Z

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Li9/o;->b1:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILi9/j;F)V
    .locals 3

    sget-object v0, Li9/h;->x:Li9/h;

    invoke-direct {p0, p1}, Lb9/f;-><init>(I)V

    iput-object p2, p0, Li9/o;->R:Li9/j;

    iput-object v0, p0, Li9/o;->S:Li9/h;

    iput p3, p0, Li9/o;->T:F

    new-instance p1, La9/e;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, La9/e;-><init>(I)V

    iput-object p1, p0, Li9/o;->U:La9/e;

    new-instance p1, La9/e;

    invoke-direct {p1, p2}, La9/e;-><init>(I)V

    iput-object p1, p0, Li9/o;->V:La9/e;

    new-instance p1, La9/e;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, La9/e;-><init>(I)V

    iput-object p1, p0, Li9/o;->W:La9/e;

    new-instance p1, Li9/f;

    invoke-direct {p1, p3}, La9/e;-><init>(I)V

    const/16 v0, 0x20

    iput v0, p1, Li9/f;->L:I

    iput-object p1, p0, Li9/o;->X:Li9/f;

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Li9/o;->Y:Landroid/media/MediaCodec$BufferInfo;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Li9/o;->i0:F

    iput v0, p0, Li9/o;->j0:F

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Li9/o;->h0:J

    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    sget-object v2, Li9/n;->e:Li9/n;

    iput-object v2, p0, Li9/o;->Y0:Li9/n;

    invoke-virtual {p1, p2}, La9/e;->q(I)V

    iget-object p1, p1, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    new-instance p1, Ld9/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v2, p1, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    iput p2, p1, Ld9/b0;->c:I

    iput p3, p1, Ld9/b0;->b:I

    iput-object p1, p0, Li9/o;->a0:Ld9/b0;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Li9/o;->o0:F

    iput p2, p0, Li9/o;->s0:I

    iput p2, p0, Li9/o;->K0:I

    const/4 p1, -0x1

    iput p1, p0, Li9/o;->B0:I

    iput p1, p0, Li9/o;->C0:I

    iput-wide v0, p0, Li9/o;->A0:J

    iput-wide v0, p0, Li9/o;->Q0:J

    iput-wide v0, p0, Li9/o;->R0:J

    iput-wide v0, p0, Li9/o;->Z0:J

    iput-wide v0, p0, Li9/o;->z0:J

    iput p2, p0, Li9/o;->L0:I

    iput p2, p0, Li9/o;->M0:I

    new-instance p1, Lb9/g;

    invoke-direct {p1, p2}, Lb9/g;-><init>(I)V

    iput-object p1, p0, Li9/o;->X0:Lb9/g;

    return-void
.end method


# virtual methods
.method public final A(Lu8/p;)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Li9/o;->S:Li9/h;

    invoke-virtual {p0, v0, p1}, Li9/o;->s0(Li9/h;Lu8/p;)I

    move-result p1
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/16 v1, 0xfa2

    const/4 v2, 0x0

    invoke-virtual {p0, v0, p1, v2, v1}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public final B()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final C(JJ)Z
    .locals 24

    move-object/from16 v0, p0

    iget-boolean v1, v0, Li9/o;->T0:Z

    const/4 v15, 0x1

    xor-int/2addr v1, v15

    invoke-static {v1}, Lva3/g;->i(Z)V

    iget-object v1, v0, Li9/o;->X:Li9/f;

    invoke-virtual {v1}, Li9/f;->t()Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_1

    iget-object v6, v1, La9/e;->E:Ljava/nio/ByteBuffer;

    iget v7, v0, Li9/o;->C0:I

    iget v9, v1, Li9/f;->K:I

    iget-wide v10, v1, La9/e;->G:J

    iget-wide v12, v0, Lb9/f;->L:J

    iget-wide v4, v1, Li9/f;->J:J

    invoke-virtual {v0, v12, v13, v4, v5}, Li9/o;->T(JJ)Z

    move-result v12

    invoke-virtual {v1, v3}, La9/a;->f(I)Z

    move-result v13

    iget-object v14, v0, Li9/o;->c0:Lu8/p;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-wide/from16 v3, p3

    move-object v15, v1

    move-wide/from16 v1, p1

    invoke-virtual/range {v0 .. v14}, Li9/o;->h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v1, v15, Li9/f;->J:J

    invoke-virtual {v0, v1, v2}, Li9/o;->d0(J)V

    invoke-virtual {v15}, Li9/f;->o()V

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    goto/16 :goto_14

    :cond_1
    move-object v15, v1

    :goto_0
    iget-boolean v1, v0, Li9/o;->S0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v0, Li9/o;->T0:Z

    const/4 v2, 0x0

    return v2

    :cond_2
    const/4 v2, 0x0

    iget-boolean v1, v0, Li9/o;->H0:Z

    iget-object v3, v0, Li9/o;->W:La9/e;

    if-eqz v1, :cond_3

    invoke-virtual {v15, v3}, Li9/f;->s(La9/e;)Z

    move-result v1

    invoke-static {v1}, Lva3/g;->i(Z)V

    iput-boolean v2, v0, Li9/o;->H0:Z

    :cond_3
    iget-boolean v1, v0, Li9/o;->I0:Z

    if-eqz v1, :cond_6

    invoke-virtual {v15}, Li9/f;->t()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    :goto_1
    const/16 v17, 0x1

    goto/16 :goto_15

    :cond_5
    invoke-virtual {v0}, Li9/o;->F()V

    iput-boolean v2, v0, Li9/o;->I0:Z

    invoke-virtual {v0}, Li9/o;->U()V

    iget-boolean v1, v0, Li9/o;->G0:Z

    if-nez v1, :cond_6

    move/from16 v16, v2

    goto/16 :goto_14

    :cond_6
    iget-boolean v1, v0, Li9/o;->S0:Z

    const/16 v17, 0x1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lva3/g;->i(Z)V

    iget-object v1, v0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {v1}, Lqg3/d;->k()V

    invoke-virtual {v3}, La9/e;->o()V

    :goto_2
    invoke-virtual {v3}, La9/e;->o()V

    invoke-virtual {v0, v1, v3, v2}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v4

    const/4 v5, -0x5

    if-eq v4, v5, :cond_22

    const/4 v5, -0x4

    if-eq v4, v5, :cond_8

    const/4 v1, -0x3

    if-ne v4, v1, :cond_7

    invoke-virtual {v0}, Lb9/f;->k()Z

    move-result v1

    if-eqz v1, :cond_23

    iget-wide v3, v0, Li9/o;->Q0:J

    iput-wide v3, v0, Li9/o;->R0:J

    goto/16 :goto_13

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_8
    const/4 v4, 0x4

    invoke-virtual {v3, v4}, La9/a;->f(I)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, 0x1

    iput-boolean v5, v0, Li9/o;->S0:Z

    iget-wide v3, v0, Li9/o;->Q0:J

    iput-wide v3, v0, Li9/o;->R0:J

    goto/16 :goto_13

    :cond_9
    iget-wide v5, v0, Li9/o;->Q0:J

    iget-wide v7, v3, La9/e;->G:J

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iput-wide v5, v0, Li9/o;->Q0:J

    invoke-virtual {v0}, Lb9/f;->k()Z

    move-result v5

    if-nez v5, :cond_a

    iget-object v5, v0, Li9/o;->V:La9/e;

    const/high16 v6, 0x20000000

    invoke-virtual {v5, v6}, La9/a;->f(I)Z

    move-result v5

    if-eqz v5, :cond_b

    :cond_a
    iget-wide v5, v0, Li9/o;->Q0:J

    iput-wide v5, v0, Li9/o;->R0:J

    :cond_b
    iget-boolean v5, v0, Li9/o;->U0:Z

    const/16 v6, 0x8

    const/16 v7, 0xff

    const/4 v8, 0x0

    const-string v9, "audio/opus"

    if-eqz v5, :cond_d

    iget-object v5, v0, Li9/o;->b0:Lu8/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v5, v0, Li9/o;->c0:Lu8/p;

    iget-object v5, v5, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    iget-object v5, v5, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_c

    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    iget-object v5, v5, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    const/16 v10, 0xb

    aget-byte v10, v5, v10

    and-int/2addr v10, v7

    shl-int/2addr v10, v6

    const/16 v11, 0xa

    aget-byte v5, v5, v11

    and-int/2addr v5, v7

    or-int/2addr v5, v10

    iget-object v10, v0, Li9/o;->c0:Lu8/p;

    invoke-virtual {v10}, Lu8/p;->a()Lu8/o;

    move-result-object v10

    iput v5, v10, Lu8/o;->F:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v10}, Lu8/p;-><init>(Lu8/o;)V

    iput-object v5, v0, Li9/o;->c0:Lu8/p;

    :cond_c
    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    invoke-virtual {v0, v5, v8}, Li9/o;->b0(Lu8/p;Landroid/media/MediaFormat;)V

    iput-boolean v2, v0, Li9/o;->U0:Z

    :cond_d
    invoke-virtual {v3}, La9/e;->r()V

    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    if-eqz v5, :cond_1e

    iget-object v5, v5, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v5, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    const/high16 v5, 0x10000000

    invoke-virtual {v3, v5}, La9/a;->f(I)Z

    move-result v5

    if-eqz v5, :cond_e

    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    iput-object v5, v3, La9/e;->y:Lu8/p;

    invoke-virtual {v0, v3}, Li9/o;->R(La9/e;)V

    :cond_e
    iget-wide v9, v0, Lb9/f;->L:J

    iget-wide v11, v3, La9/e;->G:J

    sub-long/2addr v9, v11

    const-wide/32 v11, 0x13880

    cmp-long v5, v9, v11

    if-gtz v5, :cond_1e

    iget-object v5, v0, Li9/o;->c0:Lu8/p;

    iget-object v5, v5, Lu8/p;->q:Ljava/util/List;

    iget-object v9, v0, Li9/o;->a0:Ld9/b0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v10}, Ljava/nio/Buffer;->limit()I

    move-result v10

    iget-object v11, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    move-result v11

    sub-int/2addr v10, v11

    if-nez v10, :cond_f

    goto/16 :goto_10

    :cond_f
    iget v10, v9, Ld9/b0;->b:I

    const/4 v11, 0x2

    if-ne v10, v11, :cond_11

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x1

    if-eq v10, v12, :cond_10

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x3

    if-ne v10, v12, :cond_11

    :cond_10
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, [B

    :cond_11
    iget-object v5, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    move-result v10

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v12

    sub-int v13, v12, v10

    add-int/lit16 v14, v13, 0xff

    div-int/2addr v14, v7

    add-int/lit8 v16, v14, 0x1b

    add-int v16, v16, v13

    iget v4, v9, Ld9/b0;->b:I

    if-ne v4, v11, :cond_13

    if-eqz v8, :cond_12

    array-length v4, v8

    add-int/lit8 v4, v4, 0x1c

    goto :goto_3

    :cond_12
    const/16 v4, 0x2f

    :goto_3
    add-int/lit8 v18, v4, 0x2c

    add-int v16, v18, v16

    :goto_4
    move/from16 p1, v6

    move/from16 v6, v16

    goto :goto_5

    :cond_13
    move v4, v2

    goto :goto_4

    :goto_5
    iget-object v7, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    move-result v7

    if-ge v7, v6, :cond_14

    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v6

    iput-object v6, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    goto :goto_6

    :cond_14
    iget-object v6, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_6
    iget-object v6, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    iget v7, v9, Ld9/b0;->b:I

    const/16 v2, 0x16

    if-ne v7, v11, :cond_18

    if-eqz v8, :cond_17

    const/16 v22, 0x1

    const/16 v23, 0x1

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v18 .. v23}, Ld9/b0;->a(Ljava/nio/ByteBuffer;JIIZ)V

    array-length v7, v8

    move/from16 p4, v12

    int-to-long v11, v7

    shr-long v18, v11, p1

    const-wide/16 v20, 0x0

    cmp-long v7, v18, v20

    if-nez v7, :cond_15

    const/4 v7, 0x1

    goto :goto_7

    :cond_15
    const/4 v7, 0x0

    :goto_7
    if-eqz v7, :cond_16

    long-to-int v7, v11

    int-to-byte v7, v7

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v11

    array-length v12, v8

    add-int/lit8 v12, v12, 0x1c

    move/from16 p1, v4

    const/4 v4, 0x0

    invoke-static {v11, v12, v4, v7}, Lx8/t;->l(III[B)I

    move-result v7

    invoke-virtual {v6, v2, v7}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    array-length v4, v8

    add-int/lit8 v4, v4, 0x1c

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_8

    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "out of range: %s"

    invoke-static {v3, v2}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_17
    move/from16 p1, v4

    move/from16 p4, v12

    sget-object v4, Ld9/b0;->d:[B

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_8
    sget-object v4, Ld9/b0;->e:[B

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_9
    const/4 v4, 0x0

    goto :goto_a

    :cond_18
    move/from16 p1, v4

    move/from16 p4, v12

    goto :goto_9

    :goto_a
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v4

    const/4 v12, 0x1

    if-le v4, v12, :cond_19

    invoke-virtual {v5, v12}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    goto :goto_b

    :cond_19
    const/4 v4, 0x0

    :goto_b
    invoke-static {v7, v4}, Lt9/a;->j(BB)J

    move-result-wide v7

    const-wide/32 v11, 0xbb80

    mul-long/2addr v7, v11

    const-wide/32 v11, 0xf4240

    div-long/2addr v7, v11

    long-to-int v4, v7

    iget v7, v9, Ld9/b0;->c:I

    add-int/2addr v7, v4

    iput v7, v9, Ld9/b0;->c:I

    int-to-long v7, v7

    iget v4, v9, Ld9/b0;->b:I

    const/16 v23, 0x0

    move/from16 v21, v4

    move-object/from16 v18, v6

    move-wide/from16 v19, v7

    move/from16 v22, v14

    invoke-static/range {v18 .. v23}, Ld9/b0;->a(Ljava/nio/ByteBuffer;JIIZ)V

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v14, :cond_1b

    const/16 v7, 0xff

    if-lt v13, v7, :cond_1a

    const/4 v8, -0x1

    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit16 v8, v13, -0xff

    move v13, v8

    goto :goto_d

    :cond_1a
    int-to-byte v8, v13

    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v13, 0x0

    :goto_d
    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_1b
    move/from16 v4, p4

    :goto_e
    if-ge v10, v4, :cond_1c

    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v7

    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    :cond_1c
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v4

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    iget v4, v9, Ld9/b0;->b:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1d

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    add-int v4, v4, p1

    add-int/lit8 v4, v4, 0x2c

    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    move-result v5

    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v7

    sub-int/2addr v5, v7

    const/4 v7, 0x0

    invoke-static {v4, v5, v7, v2}, Lx8/t;->l(III[B)I

    move-result v2

    add-int/lit8 v4, p1, 0x42

    invoke-virtual {v6, v4, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    goto :goto_f

    :cond_1d
    const/4 v7, 0x0

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v5

    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    move-result v8

    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v10

    sub-int/2addr v8, v10

    invoke-static {v5, v8, v7, v4}, Lx8/t;->l(III[B)I

    move-result v4

    invoke-virtual {v6, v2, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    :goto_f
    iget v2, v9, Ld9/b0;->b:I

    const/16 v17, 0x1

    add-int/lit8 v2, v2, 0x1

    iput v2, v9, Ld9/b0;->b:I

    iput-object v6, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, La9/e;->o()V

    iget-object v2, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-virtual {v3, v2}, La9/e;->q(I)V

    iget-object v2, v3, La9/e;->E:Ljava/nio/ByteBuffer;

    iget-object v4, v9, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, La9/e;->r()V

    :cond_1e
    :goto_10
    invoke-virtual {v15}, Li9/f;->t()Z

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_11

    :cond_1f
    iget-wide v4, v0, Lb9/f;->L:J

    iget-wide v6, v15, Li9/f;->J:J

    invoke-virtual {v0, v4, v5, v6, v7}, Li9/o;->T(JJ)Z

    move-result v2

    iget-wide v6, v3, La9/e;->G:J

    invoke-virtual {v0, v4, v5, v6, v7}, Li9/o;->T(JJ)Z

    move-result v4

    if-ne v2, v4, :cond_20

    :goto_11
    invoke-virtual {v15, v3}, Li9/f;->s(La9/e;)Z

    move-result v2

    if-nez v2, :cond_21

    :cond_20
    const/4 v12, 0x1

    goto :goto_12

    :cond_21
    const/4 v2, 0x0

    goto/16 :goto_2

    :goto_12
    iput-boolean v12, v0, Li9/o;->H0:Z

    goto :goto_13

    :cond_22
    invoke-virtual {v0, v1}, Li9/o;->a0(Lqg3/d;)Lb9/h;

    :cond_23
    :goto_13
    invoke-virtual {v15}, Li9/f;->t()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v15}, La9/e;->r()V

    :cond_24
    invoke-virtual {v15}, Li9/f;->t()Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, v0, Li9/o;->S0:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, Li9/o;->I0:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :goto_14
    return v16

    :goto_15
    return v17
.end method

.method public abstract D(Li9/m;Lu8/p;Lu8/p;)Lb9/h;
.end method

.method public E(Ljava/lang/IllegalStateException;Li9/m;)Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;
    .locals 1

    new-instance v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;-><init>(Ljava/lang/IllegalStateException;Li9/m;)V

    return-object v0
.end method

.method public final F()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Li9/o;->I0:Z

    iget-object v1, p0, Li9/o;->X:Li9/f;

    invoke-virtual {v1}, Li9/f;->o()V

    iget-object v1, p0, Li9/o;->W:La9/e;

    invoke-virtual {v1}, La9/e;->o()V

    iput-boolean v0, p0, Li9/o;->H0:Z

    iput-boolean v0, p0, Li9/o;->G0:Z

    iget-object v1, p0, Li9/o;->a0:Ld9/b0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v2, v1, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    iput v0, v1, Ld9/b0;->c:I

    const/4 v0, 0x2

    iput v0, v1, Ld9/b0;->b:I

    return-void
.end method

.method public final G()Z
    .locals 2

    iget-boolean v0, p0, Li9/o;->N0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput v1, p0, Li9/o;->L0:I

    iget-boolean v0, p0, Li9/o;->u0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Li9/o;->M0:I

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Li9/o;->M0:I

    return v1

    :cond_1
    invoke-virtual {p0}, Li9/o;->u0()V

    return v1
.end method

.method public final H(JJ)Z
    .locals 18

    move-object/from16 v0, p0

    iget-object v5, v0, Li9/o;->k0:Li9/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Li9/o;->C0:I

    const/4 v15, 0x1

    const/4 v2, 0x0

    iget-object v3, v0, Li9/o;->Y:Landroid/media/MediaCodec$BufferInfo;

    if-ltz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-boolean v1, v0, Li9/o;->v0:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Li9/o;->O0:Z

    if-eqz v1, :cond_2

    :try_start_0
    invoke-interface {v5, v3}, Li9/k;->f(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {v0}, Li9/o;->g0()V

    iget-boolean v1, v0, Li9/o;->T0:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Li9/o;->j0()V

    :cond_1
    move/from16 v16, v2

    goto/16 :goto_6

    :cond_2
    invoke-interface {v5, v3}, Li9/k;->f(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v1

    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-gez v1, :cond_7

    const/4 v3, -0x2

    if-ne v1, v3, :cond_4

    iput-boolean v15, v0, Li9/o;->P0:Z

    iget-object v1, v0, Li9/o;->k0:Li9/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Li9/k;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v1

    iget v2, v0, Li9/o;->s0:I

    if-eqz v2, :cond_3

    const-string v2, "width"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_3

    const-string v2, "height"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_3

    iput-boolean v15, v0, Li9/o;->x0:Z

    return v15

    :cond_3
    iput-object v1, v0, Li9/o;->m0:Landroid/media/MediaFormat;

    iput-boolean v15, v0, Li9/o;->n0:Z

    return v15

    :cond_4
    iget-boolean v1, v0, Li9/o;->y0:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Li9/o;->S0:Z

    if-nez v1, :cond_5

    iget v1, v0, Li9/o;->L0:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_6

    :cond_5
    invoke-virtual {v0}, Li9/o;->g0()V

    :cond_6
    iget-wide v3, v0, Li9/o;->z0:J

    cmp-long v1, v3, v6

    if-eqz v1, :cond_1

    const-wide/16 v5, 0x64

    add-long/2addr v3, v5

    iget-object v1, v0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-gez v1, :cond_1

    invoke-virtual {v0}, Li9/o;->g0()V

    return v2

    :cond_7
    iget-boolean v4, v0, Li9/o;->x0:Z

    if-eqz v4, :cond_8

    iput-boolean v2, v0, Li9/o;->x0:Z

    invoke-interface {v5, v1}, Li9/k;->i(I)V

    return v15

    :cond_8
    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v4, :cond_9

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v4, v4, 0x4

    if-eqz v4, :cond_9

    invoke-virtual {v0}, Li9/o;->g0()V

    return v2

    :cond_9
    iput v1, v0, Li9/o;->C0:I

    invoke-interface {v5, v1}, Li9/k;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_a

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, v0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    iget v4, v3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v4, v8

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_a
    iget-wide v8, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-wide v10, v0, Lb9/f;->L:J

    cmp-long v1, v8, v10

    if-gez v1, :cond_b

    move v1, v15

    goto :goto_1

    :cond_b
    move v1, v2

    :goto_1
    iput-boolean v1, v0, Li9/o;->E0:Z

    iget-wide v10, v0, Li9/o;->R0:J

    cmp-long v1, v10, v6

    if-eqz v1, :cond_c

    cmp-long v1, v10, v8

    if-gtz v1, :cond_c

    move v1, v15

    goto :goto_2

    :cond_c
    move v1, v2

    :goto_2
    iput-boolean v1, v0, Li9/o;->F0:Z

    invoke-virtual {v0, v8, v9}, Li9/o;->v0(J)V

    :goto_3
    iget-boolean v1, v0, Li9/o;->v0:Z

    if-eqz v1, :cond_d

    iget-boolean v1, v0, Li9/o;->O0:Z

    if-eqz v1, :cond_d

    :try_start_1
    iget-object v6, v0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    iget v7, v0, Li9/o;->C0:I

    iget v8, v3, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v10, v3, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v0, Li9/o;->E0:Z

    iget-boolean v13, v0, Li9/o;->F0:Z

    iget-object v14, v0, Li9/o;->c0:Lu8/p;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v9, 0x1

    move/from16 v16, v2

    move/from16 v17, v15

    move-wide/from16 v1, p1

    move-object v15, v3

    move-wide/from16 v3, p3

    :try_start_2
    invoke-virtual/range {v0 .. v14}, Li9/o;->h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_1
    move/from16 v16, v2

    :catch_2
    invoke-virtual {v0}, Li9/o;->g0()V

    iget-boolean v1, v0, Li9/o;->T0:Z

    if-eqz v1, :cond_11

    invoke-virtual {v0}, Li9/o;->j0()V

    goto :goto_6

    :cond_d
    move/from16 v16, v2

    move/from16 v17, v15

    move-object v15, v3

    iget-object v6, v0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    iget v7, v0, Li9/o;->C0:I

    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    iget-wide v10, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v0, Li9/o;->E0:Z

    iget-boolean v13, v0, Li9/o;->F0:Z

    iget-object v14, v0, Li9/o;->c0:Lu8/p;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x1

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v14}, Li9/o;->h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_11

    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v0, v1, v2}, Li9/o;->d0(J)V

    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_e

    move/from16 v2, v17

    goto :goto_5

    :cond_e
    move/from16 v2, v16

    :goto_5
    if-nez v2, :cond_f

    iget-boolean v1, v0, Li9/o;->O0:Z

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Li9/o;->F0:Z

    if-eqz v1, :cond_f

    iget-object v1, v0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v0, Li9/o;->z0:J

    :cond_f
    const/4 v1, -0x1

    iput v1, v0, Li9/o;->C0:I

    const/4 v1, 0x0

    iput-object v1, v0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    if-nez v2, :cond_10

    return v17

    :cond_10
    invoke-virtual {v0}, Li9/o;->g0()V

    :cond_11
    :goto_6
    return v16
.end method

.method public final I()Z
    .locals 14

    iget-object v0, p0, Li9/o;->k0:Li9/k;

    const/4 v6, 0x0

    if-eqz v0, :cond_1b

    iget v1, p0, Li9/o;->L0:I

    const/4 v7, 0x2

    if-eq v1, v7, :cond_1b

    iget-boolean v1, p0, Li9/o;->S0:Z

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v1, p0, Li9/o;->B0:I

    iget-object v8, p0, Li9/o;->V:La9/e;

    if-gez v1, :cond_2

    invoke-interface {v0}, Li9/k;->e()I

    move-result v1

    iput v1, p0, Li9/o;->B0:I

    if-gez v1, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-interface {v0, v1}, Li9/k;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v8}, La9/e;->o()V

    :cond_2
    iget v1, p0, Li9/o;->L0:I

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, 0x1

    if-ne v1, v11, :cond_4

    iget-boolean v1, p0, Li9/o;->y0:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    iput-boolean v11, p0, Li9/o;->O0:Z

    iget v1, p0, Li9/o;->B0:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v5}, Li9/k;->a(IIJI)V

    iput v10, p0, Li9/o;->B0:I

    iput-object v9, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    :goto_0
    iput v7, p0, Li9/o;->L0:I

    return v6

    :cond_4
    iget-boolean v1, p0, Li9/o;->w0:Z

    if-eqz v1, :cond_5

    iput-boolean v6, p0, Li9/o;->w0:Z

    iget-object v1, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Li9/o;->b1:[B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget v1, p0, Li9/o;->B0:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/16 v2, 0x26

    invoke-interface/range {v0 .. v5}, Li9/k;->a(IIJI)V

    iput v10, p0, Li9/o;->B0:I

    iput-object v9, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    iput-boolean v11, p0, Li9/o;->N0:Z

    return v11

    :cond_5
    iget v1, p0, Li9/o;->K0:I

    if-ne v1, v11, :cond_7

    move v1, v6

    :goto_1
    iget-object v2, p0, Li9/o;->l0:Lu8/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    iget-object v2, p0, Li9/o;->l0:Lu8/p;

    iget-object v2, v2, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    iput v7, p0, Li9/o;->K0:I

    :cond_7
    iget-object v1, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    iget-object v2, p0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {v2}, Lqg3/d;->k()V

    :try_start_0
    invoke-virtual {p0, v2, v8, v6}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result v3
    :try_end_0
    .catch Landroidx/media3/decoder/DecoderInputBuffer$InsufficientCapacityException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, -0x3

    if-ne v3, v4, :cond_8

    invoke-virtual {p0}, Lb9/f;->k()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-wide v0, p0, Li9/o;->Q0:J

    iput-wide v0, p0, Li9/o;->R0:J

    return v6

    :cond_8
    const/4 v4, -0x5

    if-ne v3, v4, :cond_a

    iget v0, p0, Li9/o;->K0:I

    if-ne v0, v7, :cond_9

    invoke-virtual {v8}, La9/e;->o()V

    iput v11, p0, Li9/o;->K0:I

    :cond_9
    invoke-virtual {p0, v2}, Li9/o;->a0(Lqg3/d;)Lb9/h;

    return v11

    :cond_a
    const/4 v2, 0x4

    invoke-virtual {v8, v2}, La9/a;->f(I)Z

    move-result v2

    if-eqz v2, :cond_e

    iget-wide v1, p0, Li9/o;->Q0:J

    iput-wide v1, p0, Li9/o;->R0:J

    iget v1, p0, Li9/o;->K0:I

    if-ne v1, v7, :cond_b

    invoke-virtual {v8}, La9/e;->o()V

    iput v11, p0, Li9/o;->K0:I

    :cond_b
    iput-boolean v11, p0, Li9/o;->S0:Z

    iget-boolean v1, p0, Li9/o;->N0:Z

    if-nez v1, :cond_c

    invoke-virtual {p0}, Li9/o;->g0()V

    return v6

    :cond_c
    iget-boolean v1, p0, Li9/o;->y0:Z

    if-eqz v1, :cond_d

    goto/16 :goto_5

    :cond_d
    iput-boolean v11, p0, Li9/o;->O0:Z

    iget v1, p0, Li9/o;->B0:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v5}, Li9/k;->a(IIJI)V

    iput v10, p0, Li9/o;->B0:I

    iput-object v9, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    return v6

    :cond_e
    iget-boolean v2, p0, Li9/o;->N0:Z

    if-nez v2, :cond_f

    invoke-virtual {v8, v11}, La9/a;->f(I)Z

    move-result v2

    if-nez v2, :cond_f

    invoke-virtual {v8}, La9/e;->o()V

    iget v0, p0, Li9/o;->K0:I

    if-ne v0, v7, :cond_10

    iput v11, p0, Li9/o;->K0:I

    return v11

    :cond_f
    invoke-virtual {p0, v8}, Li9/o;->p0(La9/e;)Z

    move-result v2

    if-eqz v2, :cond_11

    :cond_10
    return v11

    :cond_11
    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v8, v2}, La9/a;->f(I)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v3, v8, La9/e;->z:La9/c;

    if-nez v1, :cond_12

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_12
    iget-object v4, v3, La9/c;->d:[I

    if-nez v4, :cond_13

    new-array v4, v11, [I

    iput-object v4, v3, La9/c;->d:[I

    iget-object v5, v3, La9/c;->i:Landroid/media/MediaCodec$CryptoInfo;

    iput-object v4, v5, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    :cond_13
    iget-object v3, v3, La9/c;->d:[I

    aget v4, v3, v6

    add-int/2addr v4, v1

    aput v4, v3, v6

    :cond_14
    :goto_2
    iget-wide v3, v8, La9/e;->G:J

    iget-boolean v1, p0, Li9/o;->U0:Z

    if-eqz v1, :cond_16

    iget-object v1, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/n;

    iget-object v1, v1, Li9/n;->d:Llo/w;

    iget-object v5, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v4, v5}, Llo/w;->a(JLjava/lang/Object;)V

    goto :goto_3

    :cond_15
    iget-object v1, p0, Li9/o;->Y0:Li9/n;

    iget-object v1, v1, Li9/n;->d:Llo/w;

    iget-object v5, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v4, v5}, Llo/w;->a(JLjava/lang/Object;)V

    :goto_3
    iput-boolean v6, p0, Li9/o;->U0:Z

    :cond_16
    iget-wide v12, p0, Li9/o;->Q0:J

    invoke-static {v12, v13, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    iput-wide v12, p0, Li9/o;->Q0:J

    invoke-virtual {p0}, Lb9/f;->k()Z

    move-result v1

    if-nez v1, :cond_17

    const/high16 v1, 0x20000000

    invoke-virtual {v8, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_18

    :cond_17
    iget-wide v12, p0, Li9/o;->Q0:J

    iput-wide v12, p0, Li9/o;->R0:J

    :cond_18
    invoke-virtual {v8}, La9/e;->r()V

    const/high16 v1, 0x10000000

    invoke-virtual {v8, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {p0, v8}, Li9/o;->R(La9/e;)V

    :cond_19
    invoke-virtual {p0, v8}, Li9/o;->f0(La9/e;)V

    invoke-virtual {p0, v8}, Li9/o;->M(La9/e;)I

    move-result v5

    if-eqz v2, :cond_1a

    iget v1, p0, Li9/o;->B0:I

    iget-object v2, v8, La9/e;->z:La9/c;

    invoke-interface/range {v0 .. v5}, Li9/k;->g(ILa9/c;JI)V

    goto :goto_4

    :cond_1a
    iget v1, p0, Li9/o;->B0:I

    iget-object v2, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    invoke-interface/range {v0 .. v5}, Li9/k;->a(IIJI)V

    :goto_4
    iput v10, p0, Li9/o;->B0:I

    iput-object v9, v8, La9/e;->E:Ljava/nio/ByteBuffer;

    iput-boolean v11, p0, Li9/o;->N0:Z

    iput v6, p0, Li9/o;->K0:I

    iget-object v0, p0, Li9/o;->X0:Lb9/g;

    iget v1, v0, Lb9/g;->d:I

    add-int/2addr v1, v11

    iput v1, v0, Lb9/g;->d:I

    return v11

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Li9/o;->X(Ljava/lang/Exception;)V

    invoke-virtual {p0, v6}, Li9/o;->i0(I)Z

    invoke-virtual {p0}, Li9/o;->J()V

    return v11

    :cond_1b
    :goto_5
    return v6
.end method

.method public final J()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Li9/o;->k0:Li9/k;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v0}, Li9/k;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Li9/o;->l0()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Li9/o;->l0()V

    throw v0
.end method

.method public final K()Z
    .locals 5

    iget-object v0, p0, Li9/o;->k0:Li9/k;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Li9/o;->M0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Li9/o;->t0:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Li9/o;->P0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Li9/o;->u0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Li9/o;->O0:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lx8/t;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lva3/g;->i(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-virtual {p0}, Li9/o;->u0()V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Li9/o;->j0()V

    return v3

    :cond_4
    :goto_1
    invoke-virtual {p0}, Li9/o;->J()V

    return v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Li9/o;->j0()V

    return v3
.end method

.method public final L(Z)Ljava/util/List;
    .locals 4

    iget-object v0, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Li9/o;->S:Li9/h;

    invoke-virtual {p0, v1, v0, p1}, Li9/o;->P(Li9/h;Lu8/p;Z)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Li9/o;->P(Li9/h;Lu8/p;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Drm session requires secure decoder for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, v0}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1

    :cond_1
    return-object v2
.end method

.method public M(La9/e;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract O(F[Lu8/p;)F
.end method

.method public abstract P(Li9/h;Lu8/p;Z)Ljava/util/ArrayList;
.end method

.method public abstract Q(Li9/m;Lu8/p;Landroid/media/MediaCrypto;F)La30/w0;
.end method

.method public abstract R(La9/e;)V
.end method

.method public final S(Li9/m;Landroid/media/MediaCrypto;)V
    .locals 12

    const-string v0, "createCodec:"

    iget-object v1, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p1, Li9/m;->a:Ljava/lang/String;

    sget v2, Lx8/t;->a:I

    const/high16 v3, -0x40800000    # -1.0f

    const/16 v4, 0x17

    if-ge v2, v4, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    iget v5, p0, Li9/o;->j0:F

    iget-object v6, p0, Lb9/f;->J:[Lu8/p;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v5, v6}, Li9/o;->O(F[Lu8/p;)F

    move-result v5

    :goto_0
    iget v6, p0, Li9/o;->T:F

    cmpg-float v6, v5, v6

    if-gtz v6, :cond_1

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    iget-object v5, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {p0, p1, v1, p2, v3}, Li9/o;->Q(Li9/m;Lu8/p;Landroid/media/MediaCrypto;F)La30/w0;

    move-result-object p2

    const/16 v8, 0x1f

    if-lt v2, v8, :cond_2

    iget-object v8, p0, Lb9/f;->F:Lc9/n;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v8}, Ld2/b;->r(La30/w0;Lc9/n;)V

    :cond_2
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, p0, Li9/o;->R:Li9/j;

    invoke-interface {v0, p2}, Li9/j;->e(La30/w0;)Li9/k;

    move-result-object p2

    iput-object p2, p0, Li9/o;->k0:Li9/k;

    new-instance v0, Lhm/d;

    const/4 v8, 0x7

    invoke-direct {v0, p0, v8}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p2, v0}, Li9/k;->k(Lhm/d;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object p2, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move p2, v3

    move v0, v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual {p1, v1}, Li9/m;->e(Lu8/p;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {v1}, Lu8/p;->c(Lu8/p;)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v9, ", "

    const-string v10, "]"

    const-string v11, "Format exceeds selected codec\'s capabilities ["

    invoke-static {v11, v8, v9, v7, v10}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "MediaCodecRenderer"

    invoke-static {v9, v8}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iput-object p1, p0, Li9/o;->r0:Li9/m;

    iput p2, p0, Li9/o;->o0:F

    iput-object v1, p0, Li9/o;->l0:Lu8/p;

    const/4 p2, 0x2

    const/16 v1, 0x19

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-gt v2, v1, :cond_5

    const-string v10, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v11, "SM-T585"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4

    const-string v11, "SM-A510"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4

    const-string v11, "SM-A520"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4

    const-string v11, "SM-J700"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    move v10, p2

    goto :goto_2

    :cond_5
    const/16 v10, 0x18

    if-ge v2, v10, :cond_8

    const-string v10, "OMX.Nvidia.h264.decode"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    const-string v10, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    :cond_6
    sget-object v10, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v11, "flounder"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    const-string v11, "flounder_lte"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    const-string v11, "grouper"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    const-string v11, "tilapia"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    :cond_7
    move v10, v9

    goto :goto_2

    :cond_8
    move v10, v8

    :goto_2
    iput v10, p0, Li9/o;->s0:I

    const/16 v10, 0x1d

    if-ne v2, v10, :cond_9

    const-string v11, "c2.android.aac.decoder"

    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    move v11, v9

    goto :goto_3

    :cond_9
    move v11, v8

    :goto_3
    iput-boolean v11, p0, Li9/o;->t0:Z

    if-gt v2, v0, :cond_a

    const-string v0, "OMX.google.vorbis.decoder"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    move v0, v9

    goto :goto_4

    :cond_a
    move v0, v8

    :goto_4
    iput-boolean v0, p0, Li9/o;->u0:Z

    const/16 v0, 0x15

    if-ne v2, v0, :cond_b

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    move v0, v9

    goto :goto_5

    :cond_b
    move v0, v8

    :goto_5
    iput-boolean v0, p0, Li9/o;->v0:Z

    iget-object v0, p1, Li9/m;->a:Ljava/lang/String;

    if-gt v2, v1, :cond_c

    const-string v1, "OMX.rk.video_decoder.avc"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_c
    if-gt v2, v10, :cond_d

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_d
    const-string v0, "Amazon"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "AFTS"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean p1, p1, Li9/m;->f:Z

    if-eqz p1, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {p0}, Li9/o;->N()Z

    move-result p1

    if-eqz p1, :cond_10

    :cond_f
    :goto_6
    move v8, v9

    :cond_10
    iput-boolean v8, p0, Li9/o;->y0:Z

    iget-object p1, p0, Li9/o;->k0:Li9/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb9/f;->H:I

    if-ne p1, p2, :cond_11

    iget-object p1, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    const-wide/16 v0, 0x3e8

    add-long/2addr p1, v0

    iput-wide p1, p0, Li9/o;->A0:J

    :cond_11
    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget p2, p1, Lb9/g;->b:I

    add-int/2addr p2, v9

    iput p2, p1, Lb9/g;->b:I

    sub-long v5, v3, v5

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Li9/o;->Y(JJLjava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final T(JJ)Z
    .locals 2

    cmp-long v0, p3, p1

    if-gez v0, :cond_1

    iget-object v0, p0, Li9/o;->c0:Lu8/p;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu8/p;->n:Ljava/lang/String;

    const-string v1, "audio/opus"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sub-long/2addr p1, p3

    const-wide/32 p3, 0x13880

    cmp-long p1, p1, p3

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final U()V
    .locals 8

    iget-object v0, p0, Li9/o;->k0:Li9/k;

    if-nez v0, :cond_b

    iget-boolean v0, p0, Li9/o;->G0:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Li9/o;->b0:Lu8/p;

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v1, v0, Lu8/p;->n:Ljava/lang/String;

    iget-object v2, p0, Li9/o;->e0:Le10/k0;

    const/4 v3, 0x1

    if-nez v2, :cond_2

    invoke-virtual {p0, v0}, Li9/o;->r0(Lu8/p;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Li9/o;->F()V

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Li9/o;->X:Li9/f;

    if-nez v0, :cond_1

    const-string v0, "audio/mpeg"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "audio/opus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput v3, v2, Li9/f;->L:I

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x20

    iput v0, v2, Li9/f;->L:I

    :goto_0
    iput-boolean v3, p0, Li9/o;->G0:Z

    return-void

    :cond_2
    iget-object v2, p0, Li9/o;->e0:Le10/k0;

    invoke-virtual {p0, v2}, Li9/o;->n0(Le10/k0;)V

    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-eqz v2, :cond_7

    iget-object v2, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    move v2, v5

    :goto_1
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    invoke-virtual {v2}, Le10/k0;->z()La9/b;

    move-result-object v6

    sget-boolean v7, Lg9/i;->a:Z

    if-eqz v7, :cond_5

    instance-of v7, v6, Lg9/i;

    if-eqz v7, :cond_5

    invoke-virtual {v2}, Le10/k0;->G()I

    move-result v7

    if-eq v7, v3, :cond_4

    if-eq v7, v4, :cond_5

    goto :goto_5

    :cond_4
    invoke-virtual {v2}, Le10/k0;->C()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Li9/o;->b0:Lu8/p;

    iget v2, v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;->w:I

    invoke-virtual {p0, v0, v1, v5, v2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0

    :cond_5
    if-nez v6, :cond_6

    invoke-virtual {v2}, Le10/k0;->C()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    move-result-object v2

    if-eqz v2, :cond_a

    goto :goto_2

    :cond_6
    instance-of v2, v6, Lg9/i;

    if-eqz v2, :cond_7

    check-cast v6, Lg9/i;

    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v2, v6, v7}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    iput-object v2, p0, Li9/o;->g0:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v1, p0, Li9/o;->b0:Lu8/p;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v5, v2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0

    :cond_7
    :goto_2
    :try_start_1
    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Le10/k0;->G()I

    move-result v2

    const/4 v6, 0x3

    if-eq v2, v6, :cond_8

    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    invoke-virtual {v2}, Le10/k0;->G()I

    move-result v2

    if-ne v2, v4, :cond_9

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_6

    :cond_8
    :goto_3
    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Le10/k0;->L(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_4

    :cond_9
    move v3, v5

    :goto_4
    iget-object v1, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v1, v3}, Li9/o;->V(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_a
    :goto_5
    iget-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    if-eqz v0, :cond_b

    iget-object v1, p0, Li9/o;->k0:Li9/k;

    if-nez v1, :cond_b

    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    return-void

    :goto_6
    const/16 v2, 0xfa1

    invoke-virtual {p0, v1, v0, v5, v2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0

    :cond_b
    :goto_7
    return-void
.end method

.method public final V(Landroid/media/MediaCrypto;Z)V
    .locals 20

    move-object/from16 v1, p0

    move/from16 v6, p2

    iget-object v9, v1, Li9/o;->b0:Lu8/p;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    const/4 v10, 0x0

    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {v1, v6}, Li9/o;->L(Z)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/m;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iput-object v10, v1, Li9/o;->q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    new-instance v2, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    const v3, -0xc34e

    invoke-direct {v2, v9, v0, v6, v3}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Lu8/p;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;ZI)V

    throw v2

    :cond_1
    :goto_2
    iget-object v0, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v11, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    iget-object v0, v1, Li9/o;->k0:Li9/k;

    if-nez v0, :cond_7

    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Li9/m;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v9}, Li9/o;->W(Lu8/p;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {v1, v7}, Li9/o;->q0(Li9/m;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_4
    return-void

    :cond_3
    move-object/from16 v12, p1

    :try_start_1
    invoke-virtual {v1, v7, v12}, Li9/o;->S(Li9/m;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v4, v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to initialize decoder: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MediaCodecRenderer"

    invoke-static {v2, v0, v4}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v11}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v2, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Decoder init failed: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v7, Li9/m;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v9, Lu8/p;->n:Ljava/lang/String;

    instance-of v0, v4, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_4

    move-object v0, v4

    check-cast v0, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_5

    :cond_4
    move-object v8, v10

    :goto_5
    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLi9/m;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Li9/o;->X(Ljava/lang/Exception;)V

    iget-object v0, v1, Li9/o;->q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    if-nez v0, :cond_5

    iput-object v2, v1, Li9/o;->q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    goto :goto_6

    :cond_5
    new-instance v13, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v15

    iget-object v2, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->w:Ljava/lang/String;

    iget-boolean v3, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->x:Z

    iget-object v4, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->y:Li9/m;

    iget-object v0, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->z:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v16, v2

    move/from16 v17, v3

    move-object/from16 v18, v4

    invoke-direct/range {v13 .. v19}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLi9/m;Ljava/lang/String;)V

    iput-object v13, v1, Li9/o;->q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_3

    :cond_6
    iget-object v0, v1, Li9/o;->q0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    throw v0

    :cond_7
    iput-object v10, v1, Li9/o;->p0:Ljava/util/ArrayDeque;

    return-void

    :cond_8
    new-instance v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    const v2, -0xc34f

    invoke-direct {v0, v9, v10, v6, v2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Lu8/p;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;ZI)V

    throw v0
.end method

.method public W(Lu8/p;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public abstract X(Ljava/lang/Exception;)V
.end method

.method public abstract Y(JJLjava/lang/String;)V
.end method

.method public abstract Z(Ljava/lang/String;)V
.end method

.method public a0(Lqg3/d;)Lb9/h;
    .locals 13

    const/4 v0, 0x1

    iput-boolean v0, p0, Li9/o;->U0:Z

    iget-object v1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Lu8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lu8/p;->n:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_24

    const-string v4, "video/av01"

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Lu8/p;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lu8/p;->a()Lu8/o;

    move-result-object v1

    iput-object v4, v1, Lu8/o;->p:Ljava/util/List;

    new-instance v2, Lu8/p;

    invoke-direct {v2, v1}, Lu8/p;-><init>(Lu8/o;)V

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object v8, v1

    :goto_0
    iget-object p1, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p1, Le10/k0;

    iget-object v1, p0, Li9/o;->e0:Le10/k0;

    if-ne v1, p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1, v4}, Le10/k0;->j(Lg9/d;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1, v4}, Le10/k0;->K(Lg9/d;)V

    :cond_3
    :goto_1
    iput-object p1, p0, Li9/o;->e0:Le10/k0;

    iput-object v8, p0, Li9/o;->b0:Lu8/p;

    iget-boolean p1, p0, Li9/o;->G0:Z

    if-eqz p1, :cond_4

    iput-boolean v0, p0, Li9/o;->I0:Z

    return-object v4

    :cond_4
    iget-object p1, p0, Li9/o;->k0:Li9/k;

    if-nez p1, :cond_5

    iput-object v4, p0, Li9/o;->p0:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Li9/o;->U()V

    return-object v4

    :cond_5
    iget-object v1, p0, Li9/o;->r0:Li9/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p0, Li9/o;->l0:Lu8/p;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Li9/o;->d0:Le10/k0;

    iget-object v4, p0, Li9/o;->e0:Le10/k0;

    const/16 v5, 0x17

    const/4 v6, 0x3

    const/4 v9, 0x2

    if-ne v2, v4, :cond_6

    goto/16 :goto_2

    :cond_6
    if-eqz v4, :cond_22

    if-nez v2, :cond_7

    goto/16 :goto_a

    :cond_7
    invoke-virtual {v4}, Le10/k0;->z()La9/b;

    move-result-object v10

    if-nez v10, :cond_8

    goto/16 :goto_a

    :cond_8
    invoke-virtual {v2}, Le10/k0;->z()La9/b;

    move-result-object v11

    if-eqz v11, :cond_22

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    goto/16 :goto_a

    :cond_9
    instance-of v10, v10, Lg9/i;

    if-nez v10, :cond_a

    goto :goto_2

    :cond_a
    invoke-virtual {v4}, Le10/k0;->E()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v2}, Le10/k0;->E()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    goto/16 :goto_a

    :cond_b
    sget v10, Lx8/t;->a:I

    if-ge v10, v5, :cond_c

    goto/16 :goto_a

    :cond_c
    sget-object v10, Lu8/f;->e:Ljava/util/UUID;

    invoke-virtual {v2}, Le10/k0;->E()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    invoke-virtual {v4}, Le10/k0;->E()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto/16 :goto_a

    :cond_d
    iget-boolean v2, v1, Li9/m;->f:Z

    if-nez v2, :cond_f

    invoke-virtual {v4}, Le10/k0;->G()I

    move-result v2

    if-eq v2, v9, :cond_22

    invoke-virtual {v4}, Le10/k0;->G()I

    move-result v2

    if-eq v2, v6, :cond_e

    invoke-virtual {v4}, Le10/k0;->G()I

    move-result v2

    const/4 v10, 0x4

    if-ne v2, v10, :cond_f

    :cond_e
    iget-object v2, v8, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2}, Le10/k0;->L(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto/16 :goto_a

    :cond_f
    :goto_2
    iget-object v2, p0, Li9/o;->e0:Le10/k0;

    iget-object v4, p0, Li9/o;->d0:Le10/k0;

    if-eq v2, v4, :cond_10

    move v2, v0

    goto :goto_3

    :cond_10
    move v2, v3

    :goto_3
    if-eqz v2, :cond_12

    sget v4, Lx8/t;->a:I

    if-lt v4, v5, :cond_11

    goto :goto_4

    :cond_11
    move v4, v3

    goto :goto_5

    :cond_12
    :goto_4
    move v4, v0

    :goto_5
    invoke-static {v4}, Lva3/g;->i(Z)V

    invoke-virtual {p0, v1, v7, v8}, Li9/o;->D(Li9/m;Lu8/p;Lu8/p;)Lb9/h;

    move-result-object v4

    iget v5, v4, Lb9/h;->d:I

    if-eqz v5, :cond_1d

    const/16 v10, 0x10

    if-eq v5, v0, :cond_19

    if-eq v5, v9, :cond_15

    if-ne v5, v6, :cond_14

    invoke-virtual {p0, v8}, Li9/o;->t0(Lu8/p;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_9

    :cond_13
    iput-object v8, p0, Li9/o;->l0:Lu8/p;

    if-eqz v2, :cond_1f

    invoke-virtual {p0}, Li9/o;->G()Z

    move-result v0

    if-nez v0, :cond_1f

    :goto_6
    move v10, v9

    goto/16 :goto_9

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_15
    invoke-virtual {p0, v8}, Li9/o;->t0(Lu8/p;)Z

    move-result v11

    if-nez v11, :cond_16

    goto :goto_9

    :cond_16
    iput-boolean v0, p0, Li9/o;->J0:Z

    iput v0, p0, Li9/o;->K0:I

    iget v10, p0, Li9/o;->s0:I

    if-eq v10, v9, :cond_18

    if-ne v10, v0, :cond_17

    iget v10, v8, Lu8/p;->u:I

    iget v11, v7, Lu8/p;->u:I

    if-ne v10, v11, :cond_17

    iget v10, v8, Lu8/p;->v:I

    iget v11, v7, Lu8/p;->v:I

    if-ne v10, v11, :cond_17

    goto :goto_7

    :cond_17
    move v0, v3

    :cond_18
    :goto_7
    iput-boolean v0, p0, Li9/o;->w0:Z

    iput-object v8, p0, Li9/o;->l0:Lu8/p;

    if-eqz v2, :cond_1f

    invoke-virtual {p0}, Li9/o;->G()Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_6

    :cond_19
    invoke-virtual {p0, v8}, Li9/o;->t0(Lu8/p;)Z

    move-result v11

    if-nez v11, :cond_1a

    goto :goto_9

    :cond_1a
    iput-object v8, p0, Li9/o;->l0:Lu8/p;

    if-eqz v2, :cond_1b

    invoke-virtual {p0}, Li9/o;->G()Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_6

    :cond_1b
    iget-boolean v2, p0, Li9/o;->N0:Z

    if-eqz v2, :cond_1f

    iput v0, p0, Li9/o;->L0:I

    iget-boolean v2, p0, Li9/o;->u0:Z

    if-eqz v2, :cond_1c

    iput v6, p0, Li9/o;->M0:I

    goto :goto_6

    :cond_1c
    iput v0, p0, Li9/o;->M0:I

    goto :goto_8

    :cond_1d
    iget-boolean v2, p0, Li9/o;->N0:Z

    if-eqz v2, :cond_1e

    iput v0, p0, Li9/o;->L0:I

    iput v6, p0, Li9/o;->M0:I

    goto :goto_8

    :cond_1e
    invoke-virtual {p0}, Li9/o;->j0()V

    invoke-virtual {p0}, Li9/o;->U()V

    :cond_1f
    :goto_8
    move v10, v3

    :goto_9
    if-eqz v5, :cond_21

    iget-object v0, p0, Li9/o;->k0:Li9/k;

    if-ne v0, p1, :cond_20

    iget p1, p0, Li9/o;->M0:I

    if-ne p1, v6, :cond_21

    :cond_20
    new-instance v5, Lb9/h;

    iget-object v6, v1, Li9/m;->a:Ljava/lang/String;

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v10}, Lb9/h;-><init>(Ljava/lang/String;Lu8/p;Lu8/p;II)V

    return-object v5

    :cond_21
    return-object v4

    :cond_22
    :goto_a
    iget-boolean p1, p0, Li9/o;->N0:Z

    if-eqz p1, :cond_23

    iput v0, p0, Li9/o;->L0:I

    iput v6, p0, Li9/o;->M0:I

    goto :goto_b

    :cond_23
    invoke-virtual {p0}, Li9/o;->j0()V

    invoke-virtual {p0}, Li9/o;->U()V

    :goto_b
    new-instance v5, Lb9/h;

    iget-object v6, v1, Li9/m;->a:Ljava/lang/String;

    const/4 v9, 0x0

    const/16 v10, 0x80

    invoke-direct/range {v5 .. v10}, Lb9/h;-><init>(Ljava/lang/String;Lu8/p;Lu8/p;II)V

    return-object v5

    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Sample MIME type is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v1, v3, v0}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public abstract b0(Lu8/p;Landroid/media/MediaFormat;)V
.end method

.method public c0()V
    .locals 0

    return-void
.end method

.method public d0(J)V
    .locals 3

    iput-wide p1, p0, Li9/o;->Z0:J

    :goto_0
    iget-object v0, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li9/n;

    iget-wide v1, v1, Li9/n;->a:J

    cmp-long v1, p1, v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0}, Li9/o;->o0(Li9/n;)V

    invoke-virtual {p0}, Li9/o;->e0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract e0()V
.end method

.method public f0(La9/e;)V
    .locals 0

    return-void
.end method

.method public final g0()V
    .locals 3

    iget v0, p0, Li9/o;->M0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Li9/o;->T0:Z

    invoke-virtual {p0}, Li9/o;->k0()V

    return-void

    :cond_0
    invoke-virtual {p0}, Li9/o;->j0()V

    invoke-virtual {p0}, Li9/o;->U()V

    return-void

    :cond_1
    invoke-virtual {p0}, Li9/o;->J()V

    invoke-virtual {p0}, Li9/o;->u0()V

    return-void

    :cond_2
    invoke-virtual {p0}, Li9/o;->J()V

    return-void
.end method

.method public abstract h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z
.end method

.method public final i0(I)Z
    .locals 5

    iget-object v0, p0, Lb9/f;->y:Lqg3/d;

    invoke-virtual {v0}, Lqg3/d;->k()V

    iget-object v1, p0, Li9/o;->U:La9/e;

    invoke-virtual {v1}, La9/e;->o()V

    const/4 v2, 0x4

    or-int/2addr p1, v2

    invoke-virtual {p0, v0, v1, p1}, Lb9/f;->w(Lqg3/d;La9/e;I)I

    move-result p1

    const/4 v3, -0x5

    const/4 v4, 0x1

    if-ne p1, v3, :cond_0

    invoke-virtual {p0, v0}, Li9/o;->a0(Lqg3/d;)Lb9/h;

    return v4

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    invoke-virtual {v1, v2}, La9/a;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v4, p0, Li9/o;->S0:Z

    invoke-virtual {p0}, Li9/o;->g0()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final j0()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Li9/o;->k0:Li9/k;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Li9/k;->release()V

    iget-object v1, p0, Li9/o;->X0:Lb9/g;

    iget v2, v1, Lb9/g;->c:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lb9/g;->c:I

    iget-object v1, p0, Li9/o;->r0:Li9/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Li9/m;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Li9/o;->Z(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_0
    :goto_0
    iput-object v0, p0, Li9/o;->k0:Li9/k;

    :try_start_1
    iget-object v1, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    iput-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Li9/o;->n0(Le10/k0;)V

    invoke-virtual {p0}, Li9/o;->m0()V

    return-void

    :goto_2
    iput-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Li9/o;->n0(Le10/k0;)V

    invoke-virtual {p0}, Li9/o;->m0()V

    throw v1

    :goto_3
    iput-object v0, p0, Li9/o;->k0:Li9/k;

    :try_start_2
    iget-object v2, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v1

    goto :goto_5

    :cond_2
    :goto_4
    iput-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Li9/o;->n0(Le10/k0;)V

    invoke-virtual {p0}, Li9/o;->m0()V

    throw v1

    :goto_5
    iput-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Li9/o;->n0(Le10/k0;)V

    invoke-virtual {p0}, Li9/o;->m0()V

    throw v1
.end method

.method public abstract k0()V
.end method

.method public l0()V
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Li9/o;->B0:I

    iget-object v1, p0, Li9/o;->V:La9/e;

    const/4 v2, 0x0

    iput-object v2, v1, La9/e;->E:Ljava/nio/ByteBuffer;

    iput v0, p0, Li9/o;->C0:I

    iput-object v2, p0, Li9/o;->D0:Ljava/nio/ByteBuffer;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Li9/o;->A0:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Li9/o;->O0:Z

    iput-wide v0, p0, Li9/o;->z0:J

    iput-boolean v2, p0, Li9/o;->N0:Z

    iput-boolean v2, p0, Li9/o;->w0:Z

    iput-boolean v2, p0, Li9/o;->x0:Z

    iput-boolean v2, p0, Li9/o;->E0:Z

    iput-boolean v2, p0, Li9/o;->F0:Z

    iput-wide v0, p0, Li9/o;->Q0:J

    iput-wide v0, p0, Li9/o;->R0:J

    iput-wide v0, p0, Li9/o;->Z0:J

    iput v2, p0, Li9/o;->L0:I

    iput v2, p0, Li9/o;->M0:I

    iget-boolean v0, p0, Li9/o;->J0:Z

    iput v0, p0, Li9/o;->K0:I

    return-void
.end method

.method public final m0()V
    .locals 2

    invoke-virtual {p0}, Li9/o;->l0()V

    const/4 v0, 0x0

    iput-object v0, p0, Li9/o;->W0:Landroidx/media3/exoplayer/ExoPlaybackException;

    iput-object v0, p0, Li9/o;->p0:Ljava/util/ArrayDeque;

    iput-object v0, p0, Li9/o;->r0:Li9/m;

    iput-object v0, p0, Li9/o;->l0:Lu8/p;

    iput-object v0, p0, Li9/o;->m0:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Li9/o;->n0:Z

    iput-boolean v0, p0, Li9/o;->P0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Li9/o;->o0:F

    iput v0, p0, Li9/o;->s0:I

    iput-boolean v0, p0, Li9/o;->t0:Z

    iput-boolean v0, p0, Li9/o;->u0:Z

    iput-boolean v0, p0, Li9/o;->v0:Z

    iput-boolean v0, p0, Li9/o;->y0:Z

    iput-boolean v0, p0, Li9/o;->J0:Z

    iput v0, p0, Li9/o;->K0:I

    return-void
.end method

.method public n()Z
    .locals 7

    iget-object v0, p0, Li9/o;->b0:Lu8/p;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb9/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lb9/f;->N:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ll9/z0;->b()Z

    move-result v0

    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget v0, p0, Li9/o;->C0:I

    if-ltz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_2

    iget-wide v3, p0, Li9/o;->A0:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-wide v5, p0, Li9/o;->A0:J

    cmp-long v0, v3, v5

    if-gez v0, :cond_3

    :cond_2
    return v2

    :cond_3
    return v1
.end method

.method public final n0(Le10/k0;)V
    .locals 2

    iget-object v0, p0, Li9/o;->d0:Le10/k0;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1, v1}, Le10/k0;->j(Lg9/d;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Le10/k0;->K(Lg9/d;)V

    :cond_2
    :goto_0
    iput-object p1, p0, Li9/o;->d0:Le10/k0;

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Li9/o;->b0:Lu8/p;

    sget-object v0, Li9/n;->e:Li9/n;

    invoke-virtual {p0, v0}, Li9/o;->o0(Li9/n;)V

    iget-object v0, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Li9/o;->K()Z

    return-void
.end method

.method public final o0(Li9/n;)V
    .locals 4

    iput-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-wide v0, p1, Li9/n;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Li9/o;->a1:Z

    invoke-virtual {p0}, Li9/o;->c0()V

    :cond_0
    return-void
.end method

.method public p0(La9/e;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public q(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Li9/o;->S0:Z

    iput-boolean p1, p0, Li9/o;->T0:Z

    iput-boolean p1, p0, Li9/o;->V0:Z

    iget-boolean p2, p0, Li9/o;->G0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Li9/o;->X:Li9/f;

    invoke-virtual {p2}, Li9/f;->o()V

    iget-object p2, p0, Li9/o;->W:La9/e;

    invoke-virtual {p2}, La9/e;->o()V

    iput-boolean p1, p0, Li9/o;->H0:Z

    iget-object p2, p0, Li9/o;->a0:Ld9/b0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object p3, p2, Ld9/b0;->a:Ljava/nio/ByteBuffer;

    iput p1, p2, Ld9/b0;->c:I

    const/4 p1, 0x2

    iput p1, p2, Ld9/b0;->b:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Li9/o;->K()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Li9/o;->U()V

    :cond_1
    :goto_0
    iget-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-object p1, p1, Li9/n;->d:Llo/w;

    invoke-virtual {p1}, Llo/w;->h()I

    move-result p1

    if-lez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Li9/o;->U0:Z

    :cond_2
    iget-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-object p1, p1, Li9/n;->d:Llo/w;

    invoke-virtual {p1}, Llo/w;->b()V

    iget-object p1, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public q0(Li9/m;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public r0(Lu8/p;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract s0(Li9/h;Lu8/p;)I
.end method

.method public final t0(Lu8/p;)Z
    .locals 5

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Li9/o;->k0:Li9/k;

    if-eqz v0, :cond_6

    iget v0, p0, Li9/o;->M0:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    iget v0, p0, Lb9/f;->H:I

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Li9/o;->j0:F

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Lb9/f;->J:[Lu8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Li9/o;->O(F[Lu8/p;)F

    move-result p1

    iget v0, p0, Li9/o;->o0:F

    cmpl-float v3, v0, p1

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, p1, v3

    if-nez v4, :cond_4

    iget-boolean p1, p0, Li9/o;->N0:Z

    if-eqz p1, :cond_3

    iput v2, p0, Li9/o;->L0:I

    iput v1, p0, Li9/o;->M0:I

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Li9/o;->j0()V

    invoke-virtual {p0}, Li9/o;->U()V

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    cmpl-float v0, v0, v3

    if-nez v0, :cond_5

    iget v0, p0, Li9/o;->T:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_6

    :cond_5
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "operating-rate"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v1, p0, Li9/o;->k0:Li9/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Li9/k;->setParameters(Landroid/os/Bundle;)V

    iput p1, p0, Li9/o;->o0:F

    :cond_6
    :goto_1
    return v2
.end method

.method public final u0()V
    .locals 4

    iget-object v0, p0, Li9/o;->e0:Le10/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Le10/k0;->z()La9/b;

    move-result-object v0

    instance-of v0, v0, Lg9/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Li9/o;->g0:Landroid/media/MediaCrypto;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v2, p0, Li9/o;->b0:Lu8/p;

    const/16 v3, 0x1776

    invoke-virtual {p0, v0, v2, v1, v3}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, Li9/o;->e0:Le10/k0;

    invoke-virtual {p0, v0}, Li9/o;->n0(Le10/k0;)V

    iput v1, p0, Li9/o;->L0:I

    iput v1, p0, Li9/o;->M0:I

    return-void
.end method

.method public v([Lu8/p;JJLl9/c0;)V
    .locals 12

    iget-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-wide v0, p1, Li9/n;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    new-instance v4, Li9/n;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v7, p2

    move-wide/from16 v9, p4

    invoke-direct/range {v4 .. v10}, Li9/n;-><init>(JJJ)V

    invoke-virtual {p0, v4}, Li9/o;->o0(Li9/n;)V

    return-void

    :cond_0
    iget-object p1, p0, Li9/o;->Z:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Li9/o;->Q0:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Li9/o;->Z0:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    cmp-long v0, v4, v0

    if-ltz v0, :cond_3

    :cond_1
    new-instance v5, Li9/n;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Li9/n;-><init>(JJJ)V

    invoke-virtual {p0, v5}, Li9/o;->o0(Li9/n;)V

    iget-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-wide p1, p1, Li9/n;->c:J

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Li9/o;->e0()V

    :cond_2
    return-void

    :cond_3
    new-instance v5, Li9/n;

    iget-wide v6, p0, Li9/o;->Q0:J

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Li9/n;-><init>(JJJ)V

    invoke-virtual {p1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final v0(J)V
    .locals 1

    iget-object v0, p0, Li9/o;->Y0:Li9/n;

    iget-object v0, v0, Li9/n;->d:Llo/w;

    invoke-virtual {v0, p1, p2}, Llo/w;->f(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu8/p;

    if-nez p1, :cond_0

    iget-boolean p2, p0, Li9/o;->a1:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Li9/o;->m0:Landroid/media/MediaFormat;

    if-eqz p2, :cond_0

    iget-object p1, p0, Li9/o;->Y0:Li9/n;

    iget-object p1, p1, Li9/n;->d:Llo/w;

    invoke-virtual {p1}, Llo/w;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu8/p;

    :cond_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Li9/o;->c0:Lu8/p;

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Li9/o;->n0:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Li9/o;->c0:Lu8/p;

    if-eqz p1, :cond_2

    :goto_0
    iget-object p1, p0, Li9/o;->c0:Lu8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Li9/o;->m0:Landroid/media/MediaFormat;

    invoke-virtual {p0, p1, p2}, Li9/o;->b0(Lu8/p;Landroid/media/MediaFormat;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Li9/o;->n0:Z

    iput-boolean p1, p0, Li9/o;->a1:Z

    :cond_2
    return-void
.end method

.method public x(JJ)V
    .locals 11

    iget-boolean v0, p0, Li9/o;->V0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Li9/o;->V0:Z

    invoke-virtual {p0}, Li9/o;->g0()V

    :cond_0
    iget-object v0, p0, Li9/o;->W0:Landroidx/media3/exoplayer/ExoPlaybackException;

    if-nez v0, :cond_11

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v2, p0, Li9/o;->T0:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Li9/o;->k0()V

    return-void

    :catch_0
    move-exception p1

    goto/16 :goto_8

    :catch_1
    move-exception p1

    goto/16 :goto_b

    :cond_1
    iget-object v2, p0, Li9/o;->b0:Lu8/p;

    if-nez v2, :cond_2

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Li9/o;->i0(I)Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Li9/o;->U()V

    iget-boolean v2, p0, Li9/o;->G0:Z

    if-eqz v2, :cond_4

    const-string v2, "bypassRender"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Li9/o;->C(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_7

    :cond_4
    iget-object v2, p0, Li9/o;->k0:Li9/k;

    if-eqz v2, :cond_b

    iget-object v2, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "drainAndFeed"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Li9/o;->H(JJ)Z

    move-result v4

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v4, :cond_7

    iget-wide v7, p0, Li9/o;->h0:J

    cmp-long v4, v7, v5

    if-eqz v4, :cond_6

    iget-object v4, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v9

    sub-long/2addr v9, v2

    cmp-long v4, v9, v7

    if-gez v4, :cond_5

    goto :goto_2

    :cond_5
    move v4, v1

    goto :goto_3

    :cond_6
    :goto_2
    move v4, v0

    :goto_3
    if-eqz v4, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-virtual {p0}, Li9/o;->I()Z

    move-result p1

    if-eqz p1, :cond_a

    iget-wide p1, p0, Li9/o;->h0:J

    cmp-long p3, p1, v5

    if-eqz p3, :cond_9

    iget-object p3, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p3

    sub-long/2addr p3, v2

    cmp-long p1, p3, p1

    if-gez p1, :cond_8

    goto :goto_5

    :cond_8
    move p1, v1

    goto :goto_6

    :cond_9
    :goto_5
    move p1, v0

    :goto_6
    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_7

    :cond_b
    iget-object p3, p0, Li9/o;->X0:Lb9/g;

    iget p4, p3, Lb9/g;->e:I

    iget-object v2, p0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v3, p0, Lb9/f;->K:J

    sub-long/2addr p1, v3

    invoke-interface {v2, p1, p2}, Ll9/z0;->j(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lb9/g;->e:I

    invoke-virtual {p0, v0}, Li9/o;->i0(I)Z

    :goto_7
    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    monitor-enter p1

    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_8
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p3

    array-length p4, p3

    if-lez p4, :cond_10

    aget-object p3, p3, v1

    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p3

    const-string p4, "android.media.MediaCodec"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_10

    :goto_9
    invoke-virtual {p0, p1}, Li9/o;->X(Ljava/lang/Exception;)V

    if-eqz p2, :cond_d

    move-object p2, p1

    check-cast p2, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result p2

    if-eqz p2, :cond_d

    move v1, v0

    :cond_d
    if-eqz v1, :cond_e

    invoke-virtual {p0}, Li9/o;->j0()V

    :cond_e
    iget-object p2, p0, Li9/o;->r0:Li9/m;

    invoke-virtual {p0, p1, p2}, Li9/o;->E(Ljava/lang/IllegalStateException;Li9/m;)Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    move-result-object p1

    iget p2, p1, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;->w:I

    const/16 p3, 0x44d

    if-ne p2, p3, :cond_f

    const/16 p2, 0xfa6

    goto :goto_a

    :cond_f
    const/16 p2, 0xfa3

    :goto_a
    iget-object p3, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {p0, p1, p3, v1, p2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1

    :cond_10
    throw p1

    :goto_b
    iget-object p2, p0, Li9/o;->b0:Lu8/p;

    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result p3

    invoke-static {p3}, Lx8/t;->s(I)I

    move-result p3

    invoke-virtual {p0, p1, p2, v1, p3}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1

    :cond_11
    const/4 p1, 0x0

    iput-object p1, p0, Li9/o;->W0:Landroidx/media3/exoplayer/ExoPlaybackException;

    throw v0
.end method

.method public z(FF)V
    .locals 0

    iput p1, p0, Li9/o;->i0:F

    iput p2, p0, Li9/o;->j0:F

    iget-object p1, p0, Li9/o;->l0:Lu8/p;

    invoke-virtual {p0, p1}, Li9/o;->t0(Lu8/p;)Z

    return-void
.end method
