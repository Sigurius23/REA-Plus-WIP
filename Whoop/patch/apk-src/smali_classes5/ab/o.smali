.class public final Lab/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;


# static fields
.field public static final l:[F


# instance fields
.field public final a:Lxl/a;

.field public final b:Lx8/n;

.field public final c:[Z

.field public final d:Lab/m;

.field public final e:Lab/y;

.field public f:Lab/n;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Lt9/k0;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lab/o;->l:[F

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

    iput-object p1, p0, Lab/o;->a:Lxl/a;

    const/4 p1, 0x4

    new-array p1, p1, [Z

    iput-object p1, p0, Lab/o;->c:[Z

    new-instance p1, Lab/m;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p1, Lab/m;->e:[B

    iput-object p1, p0, Lab/o;->d:Lab/m;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/o;->k:J

    new-instance p1, Lab/y;

    const/16 v0, 0xb2

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lab/y;-><init>(II)V

    iput-object p1, p0, Lab/o;->e:Lab/y;

    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lab/o;->b:Lx8/n;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lab/o;->c:[Z

    invoke-static {v0}, Ly8/n;->b([Z)V

    iget-object v0, p0, Lab/o;->d:Lab/m;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lab/m;->a:Z

    iput v1, v0, Lab/m;->c:I

    iput v1, v0, Lab/m;->b:I

    iget-object v0, p0, Lab/o;->f:Lab/n;

    if-eqz v0, :cond_0

    iput-boolean v1, v0, Lab/n;->b:Z

    iput-boolean v1, v0, Lab/n;->c:Z

    iput-boolean v1, v0, Lab/n;->d:Z

    const/4 v1, -0x1

    iput v1, v0, Lab/n;->e:I

    :cond_0
    iget-object v0, p0, Lab/o;->e:Lab/y;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lab/y;->d()V

    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lab/o;->g:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/o;->k:J

    return-void
.end method

.method public final c(Lx8/n;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lab/o;->f:Lab/n;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lab/o;->i:Lt9/k0;

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    iget v2, v1, Lx8/n;->b:I

    iget v3, v1, Lx8/n;->c:I

    iget-object v4, v1, Lx8/n;->a:[B

    iget-wide v5, v0, Lab/o;->g:J

    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v0, Lab/o;->g:J

    iget-object v5, v0, Lab/o;->i:Lt9/k0;

    invoke-virtual {v1}, Lx8/n;->a()I

    move-result v6

    const/4 v7, 0x0

    invoke-interface {v5, v1, v6, v7}, Lt9/k0;->d(Lx8/n;II)V

    :goto_0
    iget-object v5, v0, Lab/o;->c:[Z

    invoke-static {v4, v2, v3, v5}, Ly8/n;->c([BII[Z)I

    move-result v5

    iget-object v6, v0, Lab/o;->d:Lab/m;

    iget-object v8, v0, Lab/o;->e:Lab/y;

    if-ne v5, v3, :cond_2

    iget-boolean v1, v0, Lab/o;->j:Z

    if-nez v1, :cond_0

    invoke-virtual {v6, v4, v2, v3}, Lab/m;->a([BII)V

    :cond_0
    iget-object v1, v0, Lab/o;->f:Lab/n;

    invoke-virtual {v1, v4, v2, v3}, Lab/n;->a([BII)V

    if-eqz v8, :cond_1

    invoke-virtual {v8, v4, v2, v3}, Lab/y;->a([BII)V

    :cond_1
    return-void

    :cond_2
    iget-object v9, v1, Lx8/n;->a:[B

    add-int/lit8 v10, v5, 0x3

    aget-byte v9, v9, v10

    and-int/lit16 v11, v9, 0xff

    sub-int v12, v5, v2

    iget-boolean v13, v0, Lab/o;->j:Z

    if-nez v13, :cond_19

    if-lez v12, :cond_3

    invoke-virtual {v6, v4, v2, v5}, Lab/m;->a([BII)V

    :cond_3
    if-gez v12, :cond_4

    neg-int v13, v12

    goto :goto_1

    :cond_4
    move v13, v7

    :goto_1
    iget v7, v6, Lab/m;->b:I

    if-eqz v7, :cond_17

    const-string v14, "H263Reader"

    const-string v15, "Unexpected start code value"

    move/from16 v16, v3

    const/4 v3, 0x1

    if-eq v7, v3, :cond_15

    const/4 v3, 0x2

    if-eq v7, v3, :cond_13

    const/4 v3, 0x4

    move/from16 v17, v10

    const/4 v10, 0x3

    if-eq v7, v10, :cond_11

    if-ne v7, v3, :cond_10

    const/16 v7, 0xb3

    if-eq v11, v7, :cond_6

    const/16 v7, 0xb5

    if-ne v11, v7, :cond_5

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    goto/16 :goto_7

    :cond_6
    :goto_2
    iget v7, v6, Lab/m;->c:I

    sub-int/2addr v7, v13

    iput v7, v6, Lab/m;->c:I

    const/4 v7, 0x0

    iput-boolean v7, v6, Lab/m;->a:Z

    iget-object v9, v0, Lab/o;->i:Lt9/k0;

    iget v10, v6, Lab/m;->d:I

    iget-object v13, v0, Lab/o;->h:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v15, v6, Lab/m;->e:[B

    iget v6, v6, Lab/m;->c:I

    invoke-static {v15, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v6

    new-instance v15, Llo/s;

    array-length v3, v6

    const/4 v1, 0x5

    invoke-direct {v15, v6, v3, v1, v7}, Llo/s;-><init>([BIIB)V

    invoke-virtual {v15, v10}, Llo/s;->u(I)V

    const/4 v1, 0x4

    invoke-virtual {v15, v1}, Llo/s;->u(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v3, 0x8

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v15, v1}, Llo/s;->t(I)V

    const/4 v10, 0x3

    invoke-virtual {v15, v10}, Llo/s;->t(I)V

    :cond_7
    invoke-virtual {v15, v1}, Llo/s;->i(I)I

    move-result v1

    const-string v10, "Invalid aspect ratio"

    const/16 v7, 0xf

    if-ne v1, v7, :cond_9

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v1

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    if-nez v3, :cond_8

    invoke-static {v14, v10}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    int-to-float v1, v1

    int-to-float v3, v3

    div-float/2addr v1, v3

    goto :goto_4

    :cond_9
    const/4 v3, 0x7

    if-ge v1, v3, :cond_a

    sget-object v3, Lab/o;->l:[F

    aget v1, v3, v1

    goto :goto_4

    :cond_a
    invoke-static {v14, v10}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const/high16 v1, 0x3f800000    # 1.0f

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

    invoke-virtual {v15, v7}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v7}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v7}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    const/4 v10, 0x3

    invoke-virtual {v15, v10}, Llo/s;->t(I)V

    const/16 v3, 0xb

    invoke-virtual {v15, v3}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v7}, Llo/s;->t(I)V

    invoke-virtual {v15}, Llo/s;->s()V

    :cond_b
    const/4 v3, 0x2

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "Unhandled video object layer shape"

    invoke-static {v14, v3}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v3, 0x10

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15}, Llo/s;->h()Z

    move-result v7

    if-eqz v7, :cond_f

    if-nez v3, :cond_d

    const-string v3, "Invalid vop_increment_time_resolution"

    invoke-static {v14, v3}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_d
    add-int/lit8 v3, v3, -0x1

    const/4 v7, 0x0

    :goto_5
    if-lez v3, :cond_e

    add-int/lit8 v7, v7, 0x1

    shr-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_e
    invoke-virtual {v15, v7}, Llo/s;->t(I)V

    :cond_f
    :goto_6
    invoke-virtual {v15}, Llo/s;->s()V

    const/16 v3, 0xd

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v7

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15, v3}, Llo/s;->i(I)I

    move-result v3

    invoke-virtual {v15}, Llo/s;->s()V

    invoke-virtual {v15}, Llo/s;->s()V

    new-instance v10, Lu8/o;

    invoke-direct {v10}, Lu8/o;-><init>()V

    iput-object v13, v10, Lu8/o;->a:Ljava/lang/String;

    const-string v13, "video/mp2t"

    invoke-static {v13}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v10, Lu8/o;->l:Ljava/lang/String;

    const-string v13, "video/mp4v-es"

    invoke-static {v13}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    iput-object v13, v10, Lu8/o;->m:Ljava/lang/String;

    iput v7, v10, Lu8/o;->t:I

    iput v3, v10, Lu8/o;->u:I

    iput v1, v10, Lu8/o;->x:F

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v10, Lu8/o;->p:Ljava/util/List;

    invoke-static {v10, v9}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    const/4 v3, 0x1

    iput-boolean v3, v0, Lab/o;->j:Z

    goto :goto_8

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_11
    and-int/lit16 v1, v9, 0xf0

    const/16 v3, 0x20

    if-eq v1, v3, :cond_12

    invoke-static {v14, v15}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x0

    iput-boolean v7, v6, Lab/m;->a:Z

    iput v7, v6, Lab/m;->c:I

    iput v7, v6, Lab/m;->b:I

    goto :goto_7

    :cond_12
    const/4 v7, 0x0

    iget v1, v6, Lab/m;->c:I

    iput v1, v6, Lab/m;->d:I

    const/4 v1, 0x4

    iput v1, v6, Lab/m;->b:I

    goto :goto_7

    :cond_13
    move/from16 v17, v10

    const/4 v7, 0x0

    const/16 v1, 0x1f

    if-le v11, v1, :cond_14

    invoke-static {v14, v15}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v7, v6, Lab/m;->a:Z

    iput v7, v6, Lab/m;->c:I

    iput v7, v6, Lab/m;->b:I

    goto :goto_7

    :cond_14
    const/4 v10, 0x3

    iput v10, v6, Lab/m;->b:I

    goto :goto_7

    :cond_15
    move/from16 v17, v10

    const/16 v1, 0xb5

    const/4 v7, 0x0

    if-eq v11, v1, :cond_16

    invoke-static {v14, v15}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v7, v6, Lab/m;->a:Z

    iput v7, v6, Lab/m;->c:I

    iput v7, v6, Lab/m;->b:I

    goto :goto_7

    :cond_16
    const/4 v3, 0x2

    iput v3, v6, Lab/m;->b:I

    goto :goto_7

    :cond_17
    move/from16 v16, v3

    move/from16 v17, v10

    const/4 v7, 0x0

    const/16 v1, 0xb0

    if-ne v11, v1, :cond_18

    const/4 v3, 0x1

    iput v3, v6, Lab/m;->b:I

    iput-boolean v3, v6, Lab/m;->a:Z

    :cond_18
    :goto_7
    sget-object v1, Lab/m;->f:[B

    const/4 v10, 0x3

    invoke-virtual {v6, v1, v7, v10}, Lab/m;->a([BII)V

    goto :goto_8

    :cond_19
    move/from16 v16, v3

    move/from16 v17, v10

    :goto_8
    iget-object v1, v0, Lab/o;->f:Lab/n;

    invoke-virtual {v1, v4, v2, v5}, Lab/n;->a([BII)V

    if-eqz v8, :cond_1c

    if-lez v12, :cond_1a

    invoke-virtual {v8, v4, v2, v5}, Lab/y;->a([BII)V

    const/4 v1, 0x0

    goto :goto_9

    :cond_1a
    neg-int v1, v12

    :goto_9
    invoke-virtual {v8, v1}, Lab/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v1, v8, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, [B

    iget v2, v8, Lab/y;->f:I

    invoke-static {v2, v1}, Ly8/n;->n(I[B)I

    move-result v1

    sget v2, Lx8/t;->a:I

    iget-object v2, v8, Lab/y;->e:Ljava/lang/Object;

    check-cast v2, [B

    iget-object v3, v0, Lab/o;->b:Lx8/n;

    invoke-virtual {v3, v1, v2}, Lx8/n;->D(I[B)V

    iget-object v1, v0, Lab/o;->a:Lxl/a;

    iget-wide v6, v0, Lab/o;->k:J

    invoke-virtual {v1, v6, v7, v3}, Lxl/a;->l(JLx8/n;)V

    :cond_1b
    const/16 v1, 0xb2

    if-ne v11, v1, :cond_1c

    move-object/from16 v1, p1

    iget-object v2, v1, Lx8/n;->a:[B

    add-int/lit8 v3, v5, 0x2

    aget-byte v2, v2, v3

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1d

    invoke-virtual {v8, v11}, Lab/y;->e(I)V

    goto :goto_a

    :cond_1c
    move-object/from16 v1, p1

    const/4 v3, 0x1

    :cond_1d
    :goto_a
    sub-int v2, v16, v5

    iget-wide v5, v0, Lab/o;->g:J

    int-to-long v7, v2

    sub-long/2addr v5, v7

    iget-object v7, v0, Lab/o;->f:Lab/n;

    iget-boolean v8, v0, Lab/o;->j:Z

    invoke-virtual {v7, v2, v5, v6, v8}, Lab/n;->b(IJZ)V

    iget-object v2, v0, Lab/o;->f:Lab/n;

    iget-wide v5, v0, Lab/o;->k:J

    iput v11, v2, Lab/n;->e:I

    const/4 v7, 0x0

    iput-boolean v7, v2, Lab/n;->d:Z

    const/16 v7, 0xb6

    if-eq v11, v7, :cond_1f

    const/16 v8, 0xb3

    if-ne v11, v8, :cond_1e

    goto :goto_b

    :cond_1e
    const/4 v8, 0x0

    goto :goto_c

    :cond_1f
    :goto_b
    move v8, v3

    :goto_c
    iput-boolean v8, v2, Lab/n;->b:Z

    if-ne v11, v7, :cond_20

    move v15, v3

    goto :goto_d

    :cond_20
    const/4 v15, 0x0

    :goto_d
    iput-boolean v15, v2, Lab/n;->c:Z

    const/4 v7, 0x0

    iput v7, v2, Lab/n;->f:I

    iput-wide v5, v2, Lab/n;->h:J

    move/from16 v3, v16

    move/from16 v2, v17

    goto/16 :goto_0
.end method

.method public final d(IJ)V
    .locals 0

    iput-wide p2, p0, Lab/o;->k:J

    return-void
.end method

.method public final e(Z)V
    .locals 4

    iget-object v0, p0, Lab/o;->f:Lab/n;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lab/o;->f:Lab/n;

    iget-wide v0, p0, Lab/o;->g:J

    iget-boolean v2, p0, Lab/o;->j:Z

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Lab/n;->b(IJZ)V

    iget-object p1, p0, Lab/o;->f:Lab/n;

    iput-boolean v3, p1, Lab/n;->b:Z

    iput-boolean v3, p1, Lab/n;->c:Z

    iput-boolean v3, p1, Lab/n;->d:Z

    const/4 v0, -0x1

    iput v0, p1, Lab/n;->e:I

    :cond_0
    return-void
.end method

.method public final i(Lt9/q;Lab/l0;)V
    .locals 3

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/o;->h:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v0

    iput-object v0, p0, Lab/o;->i:Lt9/k0;

    new-instance v1, Lab/n;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lab/n;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lab/o;->f:Lab/n;

    iget-object v0, p0, Lab/o;->a:Lxl/a;

    invoke-virtual {v0, p1, p2}, Lxl/a;->m(Lt9/q;Lab/l0;)V

    return-void
.end method
