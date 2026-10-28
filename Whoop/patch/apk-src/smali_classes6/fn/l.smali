.class public final Lfn/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/h;


# static fields
.field public static final l:[F


# instance fields
.field public final a:Lxl/a;

.field public final b:Led3/a;

.field public final c:[Z

.field public final d:Lfn/k;

.field public final e:Lab/y;

.field public f:Lab/n;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Lwm/s;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lfn/l;->l:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lxl/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/l;->a:Lxl/a;

    const/4 p1, 0x4

    new-array p1, p1, [Z

    iput-object p1, p0, Lfn/l;->c:[Z

    new-instance p1, Lfn/k;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p1, Lfn/k;->e:[B

    iput-object p1, p0, Lfn/l;->d:Lfn/k;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lfn/l;->k:J

    new-instance p1, Lab/y;

    const/16 v0, 0xb2

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lfn/l;->e:Lab/y;

    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Lfn/l;->b:Led3/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lfn/l;->c:[Z

    invoke-static {v0}, Llo/a;->l([Z)V

    iget-object v0, p0, Lfn/l;->d:Lfn/k;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lfn/k;->a:Z

    iput v1, v0, Lfn/k;->c:I

    iput v1, v0, Lfn/k;->b:I

    iget-object v0, p0, Lfn/l;->f:Lab/n;

    if-eqz v0, :cond_0

    iput-boolean v1, v0, Lab/n;->b:Z

    iput-boolean v1, v0, Lab/n;->c:Z

    iput-boolean v1, v0, Lab/n;->d:Z

    const/4 v1, -0x1

    iput v1, v0, Lab/n;->e:I

    :cond_0
    iget-object v0, p0, Lfn/l;->e:Lab/y;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lab/y;->d()V

    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lfn/l;->g:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lfn/l;->k:J

    return-void
.end method

.method public final d(IJ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_0

    iput-wide p2, p0, Lfn/l;->k:J

    :cond_0
    return-void
.end method

.method public final f(Led3/a;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lfn/l;->f:Lab/n;

    invoke-static {v2}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lfn/l;->i:Lwm/s;

    invoke-static {v2}, Llo/a;->j(Ljava/lang/Object;)V

    iget v2, v1, Led3/a;->b:I

    iget v3, v1, Led3/a;->c:I

    iget-object v4, v1, Led3/a;->a:[B

    iget-wide v5, v0, Lfn/l;->g:J

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v0, Lfn/l;->g:J

    iget-object v5, v0, Lfn/l;->i:Lwm/s;

    invoke-virtual {v1}, Led3/a;->a()I

    move-result v6

    invoke-interface {v5, v6, v1}, Lwm/s;->c(ILed3/a;)V

    :goto_0
    iget-object v5, v0, Lfn/l;->c:[Z

    invoke-static {v4, v2, v3, v5}, Llo/a;->p([BII[Z)I

    move-result v5

    iget-object v6, v0, Lfn/l;->d:Lfn/k;

    iget-object v7, v0, Lfn/l;->e:Lab/y;

    if-ne v5, v3, :cond_2

    iget-boolean v1, v0, Lfn/l;->j:Z

    if-nez v1, :cond_0

    invoke-virtual {v6, v4, v2, v3}, Lfn/k;->a([BII)V

    :cond_0
    iget-object v1, v0, Lfn/l;->f:Lab/n;

    invoke-virtual {v1, v4, v2, v3}, Lab/n;->a([BII)V

    if-eqz v7, :cond_1

    invoke-virtual {v7, v4, v2, v3}, Lab/y;->a([BII)V

    :cond_1
    return-void

    :cond_2
    iget-object v8, v1, Led3/a;->a:[B

    add-int/lit8 v9, v5, 0x3

    aget-byte v8, v8, v9

    and-int/lit16 v10, v8, 0xff

    sub-int v11, v5, v2

    iget-boolean v12, v0, Lfn/l;->j:Z

    if-nez v12, :cond_19

    if-lez v11, :cond_3

    invoke-virtual {v6, v4, v2, v5}, Lfn/k;->a([BII)V

    :cond_3
    if-gez v11, :cond_4

    neg-int v12, v11

    goto :goto_1

    :cond_4
    const/4 v12, 0x0

    :goto_1
    iget v15, v6, Lfn/k;->b:I

    if-eqz v15, :cond_17

    const-string v13, "H263Reader"

    const-string v14, "Unexpected start code value"

    move/from16 v16, v3

    const/4 v3, 0x1

    if-eq v15, v3, :cond_15

    const/4 v3, 0x2

    if-eq v15, v3, :cond_13

    const/4 v3, 0x4

    move/from16 v17, v9

    const/4 v9, 0x3

    if-eq v15, v9, :cond_11

    if-ne v15, v3, :cond_10

    const/16 v8, 0xb3

    if-eq v10, v8, :cond_6

    const/16 v8, 0xb5

    if-ne v10, v8, :cond_5

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    goto/16 :goto_7

    :cond_6
    :goto_2
    iget v8, v6, Lfn/k;->c:I

    sub-int/2addr v8, v12

    iput v8, v6, Lfn/k;->c:I

    const/4 v8, 0x0

    iput-boolean v8, v6, Lfn/k;->a:Z

    iget-object v9, v0, Lfn/l;->i:Lwm/s;

    iget v12, v6, Lfn/k;->d:I

    iget-object v14, v0, Lfn/l;->h:Ljava/lang/String;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v15, v6, Lfn/k;->e:[B

    iget v6, v6, Lfn/k;->c:I

    invoke-static {v15, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    new-instance v15, Llo/s;

    array-length v3, v6

    invoke-direct {v15, v6, v3, v8, v8}, Llo/s;-><init>([BIIB)V

    invoke-virtual {v15, v12}, Llo/s;->u(I)V

    const/4 v3, 0x4

    invoke-virtual {v15, v3}, Llo/s;->u(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v8, 0x8

    invoke-virtual {v15, v8}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    const/4 v12, 0x3

    invoke-virtual {v15, v12}, Llo/s;->t(I)V

    :cond_7
    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    const-string v12, "Invalid aspect ratio"

    move-object/from16 v18, v6

    const/16 v6, 0xf

    if-ne v3, v6, :cond_9

    invoke-virtual {v15, v8}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v15, v8}, Llo/s;->i(I)I

    move-result v8

    if-nez v8, :cond_8

    invoke-static {v13, v12}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_8
    int-to-float v3, v3

    int-to-float v8, v8

    div-float v12, v3, v8

    goto :goto_4

    :cond_9
    const/4 v8, 0x7

    if-ge v3, v8, :cond_a

    sget-object v8, Lfn/l;->l:[F

    aget v12, v8, v3

    goto :goto_4

    :cond_a
    invoke-static {v13, v12}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    const/high16 v12, 0x3f800000    # 1.0f

    :goto_4
    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_b

    const/4 v3, 0x2

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    const/4 v3, 0x1

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v15, v6}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v6}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v6}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    const/4 v3, 0x3

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    const/16 v3, 0xb

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v6}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    :cond_b
    const/4 v3, 0x2

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "Unhandled video object layer shape"

    invoke-static {v13, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v3, 0x10

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v6

    if-eqz v6, :cond_f

    if-nez v3, :cond_d

    const-string v3, "Invalid vop_increment_time_resolution"

    invoke-static {v13, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_d
    add-int/lit8 v3, v3, -0x1

    const/4 v6, 0x0

    :goto_5
    if-lez v3, :cond_e

    add-int/lit8 v6, v6, 0x1

    shr-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_e
    invoke-virtual {v15, v6}, Llo/s;->t(I)V

    :cond_f
    :goto_6
    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v3, 0xd

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v6

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15}, Llo/s;->s()V

    new-instance v8, Lrm/b0;

    invoke-direct {v8}, Lrm/b0;-><init>()V

    iput-object v14, v8, Lrm/b0;->a:Ljava/lang/String;

    const-string v13, "video/mp4v-es"

    iput-object v13, v8, Lrm/b0;->k:Ljava/lang/String;

    iput v6, v8, Lrm/b0;->p:I

    iput v3, v8, Lrm/b0;->q:I

    iput v12, v8, Lrm/b0;->t:F

    invoke-static/range {v18 .. v18}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v8, Lrm/b0;->m:Ljava/util/List;

    new-instance v3, Lrm/c0;

    invoke-direct {v3, v8}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v9, v3}, Lwm/s;->a(Lrm/c0;)V

    const/4 v3, 0x1

    iput-boolean v3, v0, Lfn/l;->j:Z

    goto :goto_8

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_11
    and-int/lit16 v3, v8, 0xf0

    const/16 v8, 0x20

    if-eq v3, v8, :cond_12

    invoke-static {v13, v14}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v8, 0x0

    iput-boolean v8, v6, Lfn/k;->a:Z

    iput v8, v6, Lfn/k;->c:I

    iput v8, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_12
    const/4 v8, 0x0

    iget v3, v6, Lfn/k;->c:I

    iput v3, v6, Lfn/k;->d:I

    const/4 v3, 0x4

    iput v3, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_13
    move/from16 v17, v9

    const/4 v8, 0x0

    const/16 v3, 0x1f

    if-le v10, v3, :cond_14

    invoke-static {v13, v14}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v8, v6, Lfn/k;->a:Z

    iput v8, v6, Lfn/k;->c:I

    iput v8, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_14
    const/4 v3, 0x3

    iput v3, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_15
    move/from16 v17, v9

    const/16 v3, 0xb5

    const/4 v8, 0x0

    if-eq v10, v3, :cond_16

    invoke-static {v13, v14}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v8, v6, Lfn/k;->a:Z

    iput v8, v6, Lfn/k;->c:I

    iput v8, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_16
    const/4 v3, 0x2

    iput v3, v6, Lfn/k;->b:I

    goto :goto_7

    :cond_17
    move/from16 v16, v3

    move/from16 v17, v9

    const/4 v8, 0x0

    const/16 v3, 0xb0

    if-ne v10, v3, :cond_18

    const/4 v3, 0x1

    iput v3, v6, Lfn/k;->b:I

    iput-boolean v3, v6, Lfn/k;->a:Z

    :cond_18
    :goto_7
    sget-object v3, Lfn/k;->f:[B

    const/4 v9, 0x3

    invoke-virtual {v6, v3, v8, v9}, Lfn/k;->a([BII)V

    goto :goto_8

    :cond_19
    move/from16 v16, v3

    move/from16 v17, v9

    :goto_8
    iget-object v3, v0, Lfn/l;->f:Lab/n;

    invoke-virtual {v3, v4, v2, v5}, Lab/n;->a([BII)V

    if-eqz v7, :cond_1c

    if-lez v11, :cond_1a

    invoke-virtual {v7, v4, v2, v5}, Lab/y;->a([BII)V

    const/4 v2, 0x0

    goto :goto_9

    :cond_1a
    neg-int v2, v11

    :goto_9
    invoke-virtual {v7, v2}, Lab/y;->b(I)Z

    move-result v2

    if-eqz v2, :cond_1b

    iget-object v2, v7, Lab/y;->e:Ljava/lang/Object;

    check-cast v2, [B

    iget v3, v7, Lab/y;->f:I

    invoke-static {v3, v2}, Llo/a;->E(I[B)I

    move-result v2

    sget v3, Llo/y;->a:I

    iget-object v3, v7, Lab/y;->e:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v6, v0, Lfn/l;->b:Led3/a;

    invoke-virtual {v6, v2, v3}, Led3/a;->I(I[B)V

    iget-object v2, v0, Lfn/l;->a:Lxl/a;

    iget-wide v8, v0, Lfn/l;->k:J

    invoke-virtual {v2, v8, v9, v6}, Lxl/a;->k(JLed3/a;)V

    :cond_1b
    const/16 v2, 0xb2

    if-ne v10, v2, :cond_1c

    iget-object v2, v1, Led3/a;->a:[B

    add-int/lit8 v3, v5, 0x2

    aget-byte v2, v2, v3

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1d

    invoke-virtual {v7, v10}, Lab/y;->e(I)V

    goto :goto_a

    :cond_1c
    const/4 v3, 0x1

    :cond_1d
    :goto_a
    sub-int v2, v16, v5

    iget-wide v5, v0, Lfn/l;->g:J

    int-to-long v7, v2

    sub-long/2addr v5, v7

    iget-object v7, v0, Lfn/l;->f:Lab/n;

    iget-boolean v8, v0, Lfn/l;->j:Z

    iget v9, v7, Lab/n;->e:I

    const/16 v11, 0xb6

    if-ne v9, v11, :cond_1e

    if-eqz v8, :cond_1e

    iget-boolean v8, v7, Lab/n;->b:Z

    if-eqz v8, :cond_1e

    iget-wide v8, v7, Lab/n;->h:J

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v12, v8, v12

    if-eqz v12, :cond_1e

    iget-wide v12, v7, Lab/n;->g:J

    sub-long v12, v5, v12

    long-to-int v12, v12

    iget-boolean v13, v7, Lab/n;->d:Z

    iget-object v14, v7, Lab/n;->i:Ljava/lang/Object;

    move-object/from16 v18, v14

    check-cast v18, Lwm/s;

    const/16 v24, 0x0

    move/from16 v23, v2

    move-wide/from16 v19, v8

    move/from16 v22, v12

    move/from16 v21, v13

    invoke-interface/range {v18 .. v24}, Lwm/s;->d(JIIILwm/r;)V

    :cond_1e
    iget v2, v7, Lab/n;->e:I

    const/16 v8, 0xb3

    if-eq v2, v8, :cond_1f

    iput-wide v5, v7, Lab/n;->g:J

    :cond_1f
    iget-object v2, v0, Lfn/l;->f:Lab/n;

    iget-wide v5, v0, Lfn/l;->k:J

    iput v10, v2, Lab/n;->e:I

    const/4 v7, 0x0

    iput-boolean v7, v2, Lab/n;->d:Z

    if-eq v10, v11, :cond_21

    if-ne v10, v8, :cond_20

    goto :goto_b

    :cond_20
    const/4 v7, 0x0

    goto :goto_c

    :cond_21
    :goto_b
    move v7, v3

    :goto_c
    iput-boolean v7, v2, Lab/n;->b:Z

    if-ne v10, v11, :cond_22

    move v14, v3

    goto :goto_d

    :cond_22
    const/4 v14, 0x0

    :goto_d
    iput-boolean v14, v2, Lab/n;->c:Z

    const/4 v8, 0x0

    iput v8, v2, Lab/n;->f:I

    iput-wide v5, v2, Lab/n;->h:J

    move/from16 v3, v16

    move/from16 v2, v17

    goto/16 :goto_0
.end method

.method public final g(Lwm/k;Lab/l0;)V
    .locals 3

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lfn/l;->h:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object v0

    iput-object v0, p0, Lfn/l;->i:Lwm/s;

    new-instance v1, Lab/n;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lab/n;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lfn/l;->f:Lab/n;

    iget-object v0, p0, Lfn/l;->a:Lxl/a;

    invoke-virtual {v0, p1, p2}, Lxl/a;->n(Lwm/k;Lab/l0;)V

    return-void
.end method

.method public final h()V
    .locals 0

    return-void
.end method
