.class public final Lzm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/i;


# instance fields
.field public final a:Led3/a;

.field public final b:Led3/a;

.field public final c:Led3/a;

.field public final d:Led3/a;

.field public final e:Lzm/c;

.field public f:Lwm/k;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Lzm/a;

.field public p:Lzm/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Led3/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Led3/a;-><init>(I)V

    iput-object v0, p0, Lzm/b;->a:Led3/a;

    new-instance v0, Led3/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Led3/a;-><init>(I)V

    iput-object v0, p0, Lzm/b;->b:Led3/a;

    new-instance v0, Led3/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Led3/a;-><init>(I)V

    iput-object v0, p0, Lzm/b;->c:Led3/a;

    new-instance v0, Led3/a;

    invoke-direct {v0}, Led3/a;-><init>()V

    iput-object v0, p0, Lzm/b;->d:Led3/a;

    new-instance v0, Lzm/c;

    new-instance v1, Lwm/h;

    invoke-direct {v1}, Lwm/h;-><init>()V

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, La2/a;-><init>(Ljava/lang/Object;I)V

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lzm/c;->y:J

    const/4 v1, 0x0

    new-array v2, v1, [J

    iput-object v2, v0, Lzm/c;->z:[J

    new-array v1, v1, [J

    iput-object v1, v0, Lzm/c;->E:[J

    iput-object v0, p0, Lzm/b;->e:Lzm/c;

    const/4 v0, 0x1

    iput v0, p0, Lzm/b;->g:I

    return-void
.end method


# virtual methods
.method public final a(Lwm/j;)Led3/a;
    .locals 5

    iget v0, p0, Lzm/b;->l:I

    iget-object v1, p0, Lzm/b;->d:Led3/a;

    iget-object v2, v1, Led3/a;->a:[B

    array-length v3, v2

    const/4 v4, 0x0

    if-le v0, v3, :cond_0

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {v1, v4, v0}, Led3/a;->I(I[B)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v4}, Led3/a;->K(I)V

    :goto_0
    iget v0, p0, Lzm/b;->l:I

    invoke-virtual {v1, v0}, Led3/a;->J(I)V

    iget-object v0, v1, Led3/a;->a:[B

    iget v2, p0, Lzm/b;->l:I

    invoke-interface {p1, v0, v4, v2}, Lwm/j;->readFully([BII)V

    return-object v1
.end method

.method public final b(JJ)V
    .locals 0

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lzm/b;->g:I

    iput-boolean p2, p0, Lzm/b;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lzm/b;->g:I

    :goto_0
    iput p2, p0, Lzm/b;->j:I

    return-void
.end method

.method public final g(Lwm/j;)Z
    .locals 4

    iget-object v0, p0, Lzm/b;->a:Led3/a;

    iget-object v1, v0, Led3/a;->a:[B

    check-cast p1, Lwm/f;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-virtual {p1, v1, v2, v3, v2}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->A()I

    move-result v1

    const v3, 0x464c56

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Led3/a;->a:[B

    const/4 v3, 0x2

    invoke-virtual {p1, v1, v2, v3, v2}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->D()I

    move-result v1

    and-int/lit16 v1, v1, 0xfa

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Led3/a;->a:[B

    const/4 v3, 0x4

    invoke-virtual {p1, v1, v2, v3, v2}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v1

    iput v2, p1, Lwm/f;->F:I

    invoke-virtual {p1, v1, v2}, Lwm/f;->a(IZ)Z

    iget-object v1, v0, Led3/a;->a:[B

    invoke-virtual {p1, v1, v2, v3, v2}, Lwm/f;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->i()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final h(Lwm/k;)V
    .locals 0

    iput-object p1, p0, Lzm/b;->f:Lwm/k;

    return-void
.end method

.method public final i(Lwm/j;Lt9/s;)I
    .locals 31

    move-object/from16 v0, p0

    iget-object v1, v0, Lzm/b;->f:Lwm/k;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget v1, v0, Lzm/b;->g:I

    const/16 v2, 0x9

    const/16 v3, 0x8

    const/4 v4, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x1

    if-eq v1, v6, :cond_29

    const/4 v8, 0x3

    if-eq v1, v4, :cond_28

    if-eq v1, v8, :cond_26

    if-ne v1, v5, :cond_25

    iget-boolean v1, v0, Lzm/b;->h:Z

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v12, v0, Lzm/b;->e:Lzm/c;

    if-eqz v1, :cond_1

    iget-wide v13, v0, Lzm/b;->i:J

    iget-wide v10, v0, Lzm/b;->m:J

    add-long/2addr v13, v10

    :goto_1
    move-wide/from16 v18, v13

    goto :goto_2

    :cond_1
    iget-wide v10, v12, Lzm/c;->y:J

    cmp-long v1, v10, v8

    if-nez v1, :cond_2

    const-wide/16 v18, 0x0

    goto :goto_2

    :cond_2
    iget-wide v13, v0, Lzm/b;->m:J

    goto :goto_1

    :goto_2
    iget v1, v0, Lzm/b;->k:I

    if-ne v1, v3, :cond_e

    iget-object v3, v0, Lzm/b;->o:Lzm/a;

    if-eqz v3, :cond_e

    iget-boolean v1, v0, Lzm/b;->n:Z

    if-nez v1, :cond_3

    iget-object v1, v0, Lzm/b;->f:Lwm/k;

    new-instance v2, Lwm/l;

    invoke-direct {v2, v8, v9}, Lwm/l;-><init>(J)V

    invoke-interface {v1, v2}, Lwm/k;->x(Lwm/p;)V

    iput-boolean v6, v0, Lzm/b;->n:Z

    :cond_3
    iget-object v1, v0, Lzm/b;->o:Lzm/a;

    invoke-virtual/range {p0 .. p1}, Lzm/b;->a(Lwm/j;)Led3/a;

    move-result-object v2

    iget-object v3, v1, La2/a;->x:Ljava/lang/Object;

    check-cast v3, Lwm/s;

    iget-boolean v10, v1, Lzm/a;->y:Z

    const/4 v11, 0x1

    if-nez v10, :cond_9

    invoke-virtual {v2}, Led3/a;->y()I

    move-result v10

    shr-int/lit8 v13, v10, 0x4

    and-int/lit8 v13, v13, 0xf

    iput v13, v1, Lzm/a;->E:I

    const/4 v14, 0x2

    if-ne v13, v14, :cond_4

    shr-int/lit8 v10, v10, 0x2

    and-int/lit8 v10, v10, 0x3

    sget-object v13, Lzm/a;->F:[I

    aget v10, v13, v10

    new-instance v13, Lrm/b0;

    invoke-direct {v13}, Lrm/b0;-><init>()V

    const-string v14, "audio/mpeg"

    iput-object v14, v13, Lrm/b0;->k:Ljava/lang/String;

    iput v11, v13, Lrm/b0;->x:I

    iput v10, v13, Lrm/b0;->y:I

    new-instance v10, Lrm/c0;

    invoke-direct {v10, v13}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v10}, Lwm/s;->a(Lrm/c0;)V

    iput-boolean v11, v1, Lzm/a;->z:Z

    goto :goto_5

    :cond_4
    const/4 v10, 0x7

    if-eq v13, v10, :cond_7

    const/16 v14, 0x8

    if-ne v13, v14, :cond_5

    goto :goto_3

    :cond_5
    const/16 v3, 0xa

    if-ne v13, v3, :cond_6

    goto :goto_5

    :cond_6
    new-instance v2, Lcom/google/android/exoplayer2/extractor/flv/TagPayloadReader$UnsupportedFormatException;

    iget v1, v1, Lzm/a;->E:I

    const/16 v3, 0x27

    const-string v4, "Audio format not supported: "

    invoke-static {v3, v1, v4}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/google/android/exoplayer2/extractor/flv/TagPayloadReader$UnsupportedFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_7
    :goto_3
    if-ne v13, v10, :cond_8

    const-string v10, "audio/g711-alaw"

    goto :goto_4

    :cond_8
    const-string v10, "audio/g711-mlaw"

    :goto_4
    new-instance v13, Lrm/b0;

    invoke-direct {v13}, Lrm/b0;-><init>()V

    iput-object v10, v13, Lrm/b0;->k:Ljava/lang/String;

    iput v11, v13, Lrm/b0;->x:I

    const/16 v10, 0x1f40

    iput v10, v13, Lrm/b0;->y:I

    new-instance v10, Lrm/c0;

    invoke-direct {v10, v13}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v10}, Lwm/s;->a(Lrm/c0;)V

    iput-boolean v11, v1, Lzm/a;->z:Z

    :goto_5
    iput-boolean v11, v1, Lzm/a;->y:Z

    goto :goto_6

    :cond_9
    invoke-virtual {v2, v11}, Led3/a;->L(I)V

    :goto_6
    iget-object v3, v1, La2/a;->x:Ljava/lang/Object;

    check-cast v3, Lwm/s;

    iget v10, v1, Lzm/a;->E:I

    const/4 v11, 0x2

    const/4 v13, 0x1

    if-ne v10, v11, :cond_a

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v10

    invoke-interface {v3, v10, v2}, Lwm/s;->c(ILed3/a;)V

    iget-object v1, v1, La2/a;->x:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Lwm/s;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v20, 0x1

    move/from16 v21, v10

    invoke-interface/range {v17 .. v23}, Lwm/s;->d(JIIILwm/r;)V

    const/16 p2, 0x0

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Led3/a;->y()I

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_c

    iget-boolean v14, v1, Lzm/a;->z:Z

    if-nez v14, :cond_c

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v10

    new-array v14, v10, [B

    invoke-virtual {v2, v14, v11, v10}, Led3/a;->g([BII)V

    new-instance v2, Llo/s;

    const/4 v15, 0x0

    const/16 p2, 0x0

    const/4 v7, 0x0

    invoke-direct {v2, v14, v10, v15, v7}, Llo/s;-><init>([BIIB)V

    invoke-static {v2, v11}, Ltm/a;->f(Llo/s;Z)Lcom/iterable/iterableapi/q;

    move-result-object v2

    new-instance v7, Lrm/b0;

    invoke-direct {v7}, Lrm/b0;-><init>()V

    const-string v10, "audio/mp4a-latm"

    iput-object v10, v7, Lrm/b0;->k:Ljava/lang/String;

    iget-object v10, v2, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iput-object v10, v7, Lrm/b0;->h:Ljava/lang/String;

    iget v10, v2, Lcom/iterable/iterableapi/q;->c:I

    iput v10, v7, Lrm/b0;->x:I

    iget v2, v2, Lcom/iterable/iterableapi/q;->b:I

    iput v2, v7, Lrm/b0;->y:I

    invoke-static {v14}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v7, Lrm/b0;->m:Ljava/util/List;

    new-instance v2, Lrm/c0;

    invoke-direct {v2, v7}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v2}, Lwm/s;->a(Lrm/c0;)V

    iput-boolean v13, v1, Lzm/a;->z:Z

    :cond_b
    move v13, v11

    goto :goto_7

    :cond_c
    const/16 p2, 0x0

    iget v7, v1, Lzm/a;->E:I

    const/16 v14, 0xa

    if-ne v7, v14, :cond_d

    if-ne v10, v13, :cond_b

    :cond_d
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v7

    invoke-interface {v3, v7, v2}, Lwm/s;->c(ILed3/a;)V

    iget-object v1, v1, La2/a;->x:Ljava/lang/Object;

    move-object/from16 v17, v1

    check-cast v17, Lwm/s;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v20, 0x1

    move/from16 v21, v7

    invoke-interface/range {v17 .. v23}, Lwm/s;->d(JIIILwm/r;)V

    :goto_7
    move v1, v6

    move-wide/from16 v16, v8

    goto/16 :goto_10

    :cond_e
    const/16 p2, 0x0

    if-ne v1, v2, :cond_19

    iget-object v2, v0, Lzm/b;->p:Lzm/d;

    if-eqz v2, :cond_19

    iget-boolean v1, v0, Lzm/b;->n:Z

    if-nez v1, :cond_f

    iget-object v1, v0, Lzm/b;->f:Lwm/k;

    new-instance v2, Lwm/l;

    invoke-direct {v2, v8, v9}, Lwm/l;-><init>(J)V

    invoke-interface {v1, v2}, Lwm/k;->x(Lwm/p;)V

    iput-boolean v6, v0, Lzm/b;->n:Z

    :cond_f
    iget-object v1, v0, Lzm/b;->p:Lzm/d;

    invoke-virtual/range {p0 .. p1}, Lzm/b;->a(Lwm/j;)Led3/a;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Led3/a;->y()I

    move-result v3

    shr-int/lit8 v7, v3, 0x4

    and-int/lit8 v7, v7, 0xf

    and-int/lit8 v3, v3, 0xf

    const/4 v10, 0x7

    if-ne v3, v10, :cond_18

    iput v7, v1, Lzm/d;->H:I

    const/4 v3, 0x5

    if-eq v7, v3, :cond_10

    const/4 v3, 0x1

    goto :goto_8

    :cond_10
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_16

    iget-object v3, v1, Lzm/d;->y:Led3/a;

    iget-object v7, v1, La2/a;->x:Ljava/lang/Object;

    check-cast v7, Lwm/s;

    iget-object v10, v1, Lzm/d;->z:Led3/a;

    invoke-virtual {v2}, Led3/a;->y()I

    move-result v11

    iget-object v13, v2, Led3/a;->a:[B

    iget v14, v2, Led3/a;->b:I

    add-int/lit8 v15, v14, 0x1

    iput v15, v2, Led3/a;->b:I

    move-wide/from16 v16, v8

    aget-byte v8, v13, v14

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x18

    shr-int/lit8 v8, v8, 0x8

    add-int/lit8 v9, v14, 0x2

    iput v9, v2, Led3/a;->b:I

    aget-byte v15, v13, v15

    and-int/lit16 v15, v15, 0xff

    shl-int/lit8 v15, v15, 0x8

    or-int/2addr v8, v15

    add-int/lit8 v14, v14, 0x3

    iput v14, v2, Led3/a;->b:I

    aget-byte v9, v13, v9

    and-int/lit16 v9, v9, 0xff

    or-int/2addr v8, v9

    int-to-long v8, v8

    const-wide/16 v13, 0x3e8

    mul-long/2addr v8, v13

    add-long v25, v8, v18

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v11, :cond_11

    iget-boolean v13, v1, Lzm/d;->F:Z

    if-nez v13, :cond_11

    new-instance v3, Led3/a;

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v10

    new-array v10, v10, [B

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-direct {v3, v10, v11, v13}, Led3/a;-><init>([BIB)V

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v11

    invoke-virtual {v2, v10, v8, v11}, Led3/a;->g([BII)V

    invoke-static {v3}, Lmo/a;->a(Led3/a;)Lmo/a;

    move-result-object v2

    iget v3, v2, Lmo/a;->b:I

    iput v3, v1, Lzm/d;->E:I

    new-instance v3, Lrm/b0;

    invoke-direct {v3}, Lrm/b0;-><init>()V

    const-string v10, "video/avc"

    iput-object v10, v3, Lrm/b0;->k:Ljava/lang/String;

    iget-object v10, v2, Lmo/a;->f:Ljava/lang/String;

    iput-object v10, v3, Lrm/b0;->h:Ljava/lang/String;

    iget v10, v2, Lmo/a;->c:I

    iput v10, v3, Lrm/b0;->p:I

    iget v10, v2, Lmo/a;->d:I

    iput v10, v3, Lrm/b0;->q:I

    iget v10, v2, Lmo/a;->e:F

    iput v10, v3, Lrm/b0;->t:F

    iget-object v2, v2, Lmo/a;->a:Ljava/util/ArrayList;

    iput-object v2, v3, Lrm/b0;->m:Ljava/util/List;

    new-instance v2, Lrm/c0;

    invoke-direct {v2, v3}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v7, v2}, Lwm/s;->a(Lrm/c0;)V

    iput-boolean v9, v1, Lzm/d;->F:Z

    goto :goto_b

    :cond_11
    if-ne v11, v9, :cond_15

    iget-boolean v11, v1, Lzm/d;->F:Z

    if-eqz v11, :cond_15

    iget v11, v1, Lzm/d;->H:I

    if-ne v11, v9, :cond_12

    move/from16 v27, v9

    goto :goto_9

    :cond_12
    move/from16 v27, v8

    :goto_9
    iget-boolean v11, v1, Lzm/d;->G:Z

    if-nez v11, :cond_13

    if-nez v27, :cond_13

    goto :goto_b

    :cond_13
    iget-object v11, v10, Led3/a;->a:[B

    aput-byte v8, v11, v8

    aput-byte v8, v11, v9

    const/4 v13, 0x2

    aput-byte v8, v11, v13

    iget v11, v1, Lzm/d;->E:I

    const/4 v13, 0x4

    rsub-int/lit8 v11, v11, 0x4

    move/from16 v28, v8

    :goto_a
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v14

    if-lez v14, :cond_14

    iget-object v14, v10, Led3/a;->a:[B

    iget v15, v1, Lzm/d;->E:I

    invoke-virtual {v2, v14, v11, v15}, Led3/a;->g([BII)V

    invoke-virtual {v10, v8}, Led3/a;->K(I)V

    invoke-virtual {v10}, Led3/a;->B()I

    move-result v14

    invoke-virtual {v3, v8}, Led3/a;->K(I)V

    invoke-interface {v7, v13, v3}, Lwm/s;->c(ILed3/a;)V

    add-int/lit8 v28, v28, 0x4

    invoke-interface {v7, v14, v2}, Lwm/s;->c(ILed3/a;)V

    add-int v28, v28, v14

    goto :goto_a

    :cond_14
    iget-object v2, v1, La2/a;->x:Ljava/lang/Object;

    move-object/from16 v24, v2

    check-cast v24, Lwm/s;

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-interface/range {v24 .. v30}, Lwm/s;->d(JIIILwm/r;)V

    iput-boolean v9, v1, Lzm/d;->G:Z

    move v8, v9

    :cond_15
    :goto_b
    if-eqz v8, :cond_17

    move v1, v6

    goto :goto_c

    :cond_16
    move-wide/from16 v16, v8

    :cond_17
    move/from16 v1, p2

    :goto_c
    move v13, v1

    :goto_d
    move v1, v6

    goto/16 :goto_10

    :cond_18
    new-instance v1, Lcom/google/android/exoplayer2/extractor/flv/TagPayloadReader$UnsupportedFormatException;

    const/16 v2, 0x27

    const-string v4, "Video format not supported: "

    invoke-static {v2, v3, v4}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/extractor/flv/TagPayloadReader$UnsupportedFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    move-wide/from16 v16, v8

    const/16 v2, 0x12

    if-ne v1, v2, :cond_22

    iget-boolean v1, v0, Lzm/b;->n:Z

    if-nez v1, :cond_22

    invoke-virtual/range {p0 .. p1}, Lzm/b;->a(Lwm/j;)Led3/a;

    move-result-object v1

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1a

    goto/16 :goto_f

    :cond_1a
    invoke-static {v1}, Lzm/c;->S(Led3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "onMetaData"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto/16 :goto_f

    :cond_1b
    invoke-virtual {v1}, Led3/a;->a()I

    move-result v2

    if-nez v2, :cond_1c

    goto/16 :goto_f

    :cond_1c
    invoke-virtual {v1}, Led3/a;->y()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_1d

    goto/16 :goto_f

    :cond_1d
    invoke-static {v1}, Lzm/c;->R(Led3/a;)Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "duration"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Double;

    const-wide v7, 0x412e848000000000L    # 1000000.0

    if-eqz v3, :cond_1e

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    const-wide/16 v9, 0x0

    cmpl-double v9, v2, v9

    if-lez v9, :cond_1e

    mul-double/2addr v2, v7

    double-to-long v2, v2

    iput-wide v2, v12, Lzm/c;->y:J

    :cond_1e
    const-string v2, "keyframes"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_20

    check-cast v1, Ljava/util/Map;

    const-string v2, "filepositions"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "times"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v2, Ljava/util/List;

    if-eqz v3, :cond_20

    instance-of v3, v1, Ljava/util/List;

    if-eqz v3, :cond_20

    check-cast v2, Ljava/util/List;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-array v9, v3, [J

    iput-object v9, v12, Lzm/c;->z:[J

    new-array v9, v3, [J

    iput-object v9, v12, Lzm/c;->E:[J

    const/4 v9, 0x0

    move v10, v9

    :goto_e
    if-ge v10, v3, :cond_20

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Double;

    if-eqz v14, :cond_1f

    instance-of v14, v11, Ljava/lang/Double;

    if-eqz v14, :cond_1f

    iget-object v14, v12, Lzm/c;->z:[J

    check-cast v13, Ljava/lang/Double;

    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    move-wide/from16 v20, v7

    mul-double v7, v18, v20

    double-to-long v7, v7

    aput-wide v7, v14, v10

    iget-object v7, v12, Lzm/c;->E:[J

    check-cast v11, Ljava/lang/Double;

    invoke-virtual {v11}, Ljava/lang/Double;->longValue()J

    move-result-wide v13

    aput-wide v13, v7, v10

    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v7, v20

    goto :goto_e

    :cond_1f
    new-array v1, v9, [J

    iput-object v1, v12, Lzm/c;->z:[J

    new-array v1, v9, [J

    iput-object v1, v12, Lzm/c;->E:[J

    :cond_20
    :goto_f
    iget-wide v1, v12, Lzm/c;->y:J

    cmp-long v3, v1, v16

    if-eqz v3, :cond_21

    iget-object v3, v0, Lzm/b;->f:Lwm/k;

    new-instance v7, Lwm/n;

    iget-object v8, v12, Lzm/c;->E:[J

    iget-object v9, v12, Lzm/c;->z:[J

    invoke-direct {v7, v1, v2, v8, v9}, Lwm/n;-><init>(J[J[J)V

    invoke-interface {v3, v7}, Lwm/k;->x(Lwm/p;)V

    iput-boolean v6, v0, Lzm/b;->n:Z

    :cond_21
    move/from16 v13, p2

    goto/16 :goto_d

    :cond_22
    iget v1, v0, Lzm/b;->l:I

    move-object/from16 v2, p1

    check-cast v2, Lwm/f;

    invoke-virtual {v2, v1}, Lwm/f;->n(I)V

    move/from16 v1, p2

    move v13, v1

    :goto_10
    iget-boolean v2, v0, Lzm/b;->h:Z

    if-nez v2, :cond_24

    if-eqz v13, :cond_24

    iput-boolean v6, v0, Lzm/b;->h:Z

    iget-wide v2, v12, Lzm/c;->y:J

    cmp-long v2, v2, v16

    if-nez v2, :cond_23

    iget-wide v2, v0, Lzm/b;->m:J

    neg-long v10, v2

    goto :goto_11

    :cond_23
    const-wide/16 v10, 0x0

    :goto_11
    iput-wide v10, v0, Lzm/b;->i:J

    :cond_24
    iput v5, v0, Lzm/b;->j:I

    iput v4, v0, Lzm/b;->g:I

    if-eqz v1, :cond_0

    return p2

    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_26
    const/16 p2, 0x0

    iget-object v1, v0, Lzm/b;->c:Led3/a;

    iget-object v2, v1, Led3/a;->a:[B

    const/16 v3, 0xb

    move-object/from16 v4, p1

    check-cast v4, Lwm/f;

    move/from16 v7, p2

    invoke-virtual {v4, v2, v7, v3, v6}, Lwm/f;->f([BIIZ)Z

    move-result v2

    if-nez v2, :cond_27

    goto :goto_12

    :cond_27
    invoke-virtual {v1, v7}, Led3/a;->K(I)V

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v2

    iput v2, v0, Lzm/b;->k:I

    invoke-virtual {v1}, Led3/a;->A()I

    move-result v2

    iput v2, v0, Lzm/b;->l:I

    invoke-virtual {v1}, Led3/a;->A()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Lzm/b;->m:J

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    int-to-long v2, v2

    iget-wide v6, v0, Lzm/b;->m:J

    or-long/2addr v2, v6

    const-wide/16 v6, 0x3e8

    mul-long/2addr v2, v6

    iput-wide v2, v0, Lzm/b;->m:J

    invoke-virtual {v1, v8}, Led3/a;->L(I)V

    iput v5, v0, Lzm/b;->g:I

    goto/16 :goto_0

    :cond_28
    iget v1, v0, Lzm/b;->j:I

    move-object/from16 v2, p1

    check-cast v2, Lwm/f;

    invoke-virtual {v2, v1}, Lwm/f;->n(I)V

    const/4 v7, 0x0

    iput v7, v0, Lzm/b;->j:I

    iput v8, v0, Lzm/b;->g:I

    goto/16 :goto_0

    :cond_29
    const/4 v7, 0x0

    iget-object v1, v0, Lzm/b;->b:Led3/a;

    iget-object v8, v1, Led3/a;->a:[B

    move-object/from16 v9, p1

    check-cast v9, Lwm/f;

    invoke-virtual {v9, v8, v7, v2, v6}, Lwm/f;->f([BIIZ)Z

    move-result v8

    if-nez v8, :cond_2a

    :goto_12
    const/4 v1, -0x1

    return v1

    :cond_2a
    invoke-virtual {v1, v7}, Led3/a;->K(I)V

    invoke-virtual {v1, v5}, Led3/a;->L(I)V

    invoke-virtual {v1}, Led3/a;->y()I

    move-result v5

    and-int/lit8 v8, v5, 0x4

    if-eqz v8, :cond_2b

    move v8, v6

    goto :goto_13

    :cond_2b
    move v8, v7

    :goto_13
    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_2c

    move v7, v6

    :cond_2c
    if-eqz v8, :cond_2d

    iget-object v5, v0, Lzm/b;->o:Lzm/a;

    if-nez v5, :cond_2d

    new-instance v5, Lzm/a;

    iget-object v8, v0, Lzm/b;->f:Lwm/k;

    invoke-interface {v8, v3, v6}, Lwm/k;->o(II)Lwm/s;

    move-result-object v3

    const/16 v6, 0x9

    invoke-direct {v5, v3, v6}, La2/a;-><init>(Ljava/lang/Object;I)V

    iput-object v5, v0, Lzm/b;->o:Lzm/a;

    :cond_2d
    if-eqz v7, :cond_2e

    iget-object v3, v0, Lzm/b;->p:Lzm/d;

    if-nez v3, :cond_2e

    new-instance v3, Lzm/d;

    iget-object v5, v0, Lzm/b;->f:Lwm/k;

    invoke-interface {v5, v2, v4}, Lwm/k;->o(II)Lwm/s;

    move-result-object v2

    invoke-direct {v3, v2}, Lzm/d;-><init>(Lwm/s;)V

    iput-object v3, v0, Lzm/b;->p:Lzm/d;

    :cond_2e
    iget-object v2, v0, Lzm/b;->f:Lwm/k;

    invoke-interface {v2}, Lwm/k;->l()V

    invoke-virtual {v1}, Led3/a;->i()I

    move-result v1

    add-int/lit8 v1, v1, -0x5

    iput v1, v0, Lzm/b;->j:I

    iput v4, v0, Lzm/b;->g:I

    goto/16 :goto_0
.end method

.method public final release()V
    .locals 0

    return-void
.end method
