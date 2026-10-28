.class public final Lna/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;
.implements Lt9/e0;


# instance fields
.field public A:[Lna/j;

.field public B:[[J

.field public C:I

.field public D:J

.field public E:I

.field public F:Lia/a;

.field public final a:Lqa/j;

.field public final b:I

.field public final c:Lx8/n;

.field public final d:Lx8/n;

.field public final e:Lx8/n;

.field public final f:Lx8/n;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:Lna/m;

.field public final i:Ljava/util/ArrayList;

.field public j:Lzr/w0;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public o:Lx8/n;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:J

.field public x:Z

.field public y:J

.field public z:Lt9/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lqa/j;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna/k;->a:Lqa/j;

    iput p2, p0, Lna/k;->b:I

    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    iput-object p1, p0, Lna/k;->j:Lzr/w0;

    and-int/lit8 p1, p2, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput p1, p0, Lna/k;->k:I

    new-instance p1, Lna/m;

    invoke-direct {p1}, Lna/m;-><init>()V

    iput-object p1, p0, Lna/k;->h:Lna/m;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lna/k;->i:Ljava/util/ArrayList;

    new-instance p1, Lx8/n;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lna/k;->f:Lx8/n;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lna/k;->g:Ljava/util/ArrayDeque;

    new-instance p1, Lx8/n;

    sget-object v0, Ly8/n;->a:[B

    invoke-direct {p1, v0}, Lx8/n;-><init>([B)V

    iput-object p1, p0, Lna/k;->c:Lx8/n;

    new-instance p1, Lx8/n;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lna/k;->d:Lx8/n;

    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lna/k;->e:Lx8/n;

    const/4 p1, -0x1

    iput p1, p0, Lna/k;->p:I

    sget-object p1, Lt9/q;->u:Lt9/p;

    iput-object p1, p0, Lna/k;->z:Lt9/q;

    new-array p1, p2, [Lna/j;

    iput-object p1, p0, Lna/k;->A:[Lna/j;

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 7

    iget-object v0, p0, Lna/k;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lna/k;->n:I

    const/4 v1, -0x1

    iput v1, p0, Lna/k;->p:I

    iput v0, p0, Lna/k;->q:I

    iput v0, p0, Lna/k;->r:I

    iput v0, p0, Lna/k;->s:I

    iput-boolean v0, p0, Lna/k;->t:Z

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-nez p1, :cond_1

    iget p1, p0, Lna/k;->k:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    iput v0, p0, Lna/k;->k:I

    iput v0, p0, Lna/k;->n:I

    return-void

    :cond_0
    iget-object p1, p0, Lna/k;->h:Lna/m;

    iget-object p2, p1, Lna/m;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iput v0, p1, Lna/m;->b:I

    iget-object p1, p0, Lna/k;->i:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void

    :cond_1
    iget-object p1, p0, Lna/k;->A:[Lna/j;

    array-length p2, p1

    move v2, v0

    :goto_0
    if-ge v2, p2, :cond_6

    aget-object v3, p1, v2

    iget-object v4, v3, Lna/j;->b:Lna/q;

    iget-object v5, v4, Lna/q;->f:[J

    invoke-static {v5, p3, p4, v0}, Lx8/t;->d([JJZ)I

    move-result v5

    :goto_1
    if-ltz v5, :cond_3

    iget-object v6, v4, Lna/q;->g:[I

    aget v6, v6, v5

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_3
    move v5, v1

    :goto_2
    if-ne v5, v1, :cond_4

    invoke-virtual {v4, p3, p4}, Lna/q;->a(J)I

    move-result v5

    :cond_4
    iput v5, v3, Lna/j;->e:I

    iget-object v3, v3, Lna/j;->d:Lt9/l0;

    if-eqz v3, :cond_5

    iput-boolean v0, v3, Lt9/l0;->b:Z

    iput v0, v3, Lt9/l0;->c:I

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final c(J)Lt9/d0;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, Lna/k;->A:[Lna/j;

    array-length v4, v3

    sget-object v5, Lt9/f0;->c:Lt9/f0;

    if-nez v4, :cond_0

    new-instance v1, Lt9/d0;

    invoke-direct {v1, v5, v5}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v1

    :cond_0
    iget v4, v0, Lna/k;->C:I

    const/4 v6, 0x0

    const/4 v9, -0x1

    const-wide/16 v10, -0x1

    if-eq v4, v9, :cond_5

    aget-object v3, v3, v4

    iget-object v3, v3, Lna/j;->b:Lna/q;

    iget-object v4, v3, Lna/q;->f:[J

    invoke-static {v4, v1, v2, v6}, Lx8/t;->d([JJZ)I

    move-result v12

    :goto_0
    if-ltz v12, :cond_2

    iget-object v13, v3, Lna/q;->g:[I

    aget v13, v13, v12

    and-int/lit8 v13, v13, 0x1

    if-eqz v13, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v12, v12, -0x1

    goto :goto_0

    :cond_2
    move v12, v9

    :goto_1
    if-ne v12, v9, :cond_3

    invoke-virtual {v3, v1, v2}, Lna/q;->a(J)I

    move-result v12

    :cond_3
    iget-object v13, v3, Lna/q;->c:[J

    if-ne v12, v9, :cond_4

    new-instance v1, Lt9/d0;

    invoke-direct {v1, v5, v5}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v1

    :cond_4
    aget-wide v14, v4, v12

    aget-wide v16, v13, v12

    cmp-long v5, v14, v1

    if-gez v5, :cond_6

    iget v5, v3, Lna/q;->b:I

    add-int/lit8 v5, v5, -0x1

    if-ge v12, v5, :cond_6

    invoke-virtual {v3, v1, v2}, Lna/q;->a(J)I

    move-result v1

    if-eq v1, v9, :cond_6

    if-eq v1, v12, :cond_6

    aget-wide v2, v4, v1

    aget-wide v10, v13, v1

    goto :goto_2

    :cond_5
    const-wide v16, 0x7fffffffffffffffL

    move-wide v14, v1

    :cond_6
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    :goto_2
    move v1, v6

    move-wide/from16 v4, v16

    :goto_3
    iget-object v12, v0, Lna/k;->A:[Lna/j;

    array-length v13, v12

    if-ge v1, v13, :cond_11

    iget v13, v0, Lna/k;->C:I

    if-eq v1, v13, :cond_10

    aget-object v12, v12, v1

    iget-object v12, v12, Lna/j;->b:Lna/q;

    iget-object v13, v12, Lna/q;->c:[J

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v7, v12, Lna/q;->g:[I

    iget-object v8, v12, Lna/q;->f:[J

    invoke-static {v8, v14, v15, v6}, Lx8/t;->d([JJZ)I

    move-result v18

    :goto_4
    if-ltz v18, :cond_8

    aget v19, v7, v18

    and-int/lit8 v19, v19, 0x1

    if-eqz v19, :cond_7

    move/from16 v6, v18

    goto :goto_5

    :cond_7
    add-int/lit8 v18, v18, -0x1

    goto :goto_4

    :cond_8
    move v6, v9

    :goto_5
    if-ne v6, v9, :cond_9

    invoke-virtual {v12, v14, v15}, Lna/q;->a(J)I

    move-result v6

    :cond_9
    if-ne v6, v9, :cond_a

    move-wide/from16 p1, v10

    goto :goto_6

    :cond_a
    move-wide/from16 p1, v10

    aget-wide v9, v13, v6

    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :goto_6
    cmp-long v6, v2, v16

    if-eqz v6, :cond_f

    const/4 v6, 0x0

    invoke-static {v8, v2, v3, v6}, Lx8/t;->d([JJZ)I

    move-result v8

    :goto_7
    if-ltz v8, :cond_c

    aget v9, v7, v8

    and-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_b

    :goto_8
    const/4 v7, -0x1

    goto :goto_9

    :cond_b
    add-int/lit8 v8, v8, -0x1

    goto :goto_7

    :cond_c
    const/4 v8, -0x1

    goto :goto_8

    :goto_9
    if-ne v8, v7, :cond_d

    invoke-virtual {v12, v2, v3}, Lna/q;->a(J)I

    move-result v8

    :cond_d
    if-ne v8, v7, :cond_e

    move-wide/from16 v10, p1

    goto :goto_a

    :cond_e
    aget-wide v8, v13, v8

    move-wide/from16 v10, p1

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    goto :goto_a

    :cond_f
    move-wide/from16 v10, p1

    const/4 v6, 0x0

    const/4 v7, -0x1

    goto :goto_a

    :cond_10
    move v7, v9

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    :goto_a
    add-int/lit8 v1, v1, 0x1

    move v9, v7

    goto :goto_3

    :cond_11
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    new-instance v1, Lt9/f0;

    invoke-direct {v1, v14, v15, v4, v5}, Lt9/f0;-><init>(JJ)V

    cmp-long v4, v2, v16

    if-nez v4, :cond_12

    new-instance v2, Lt9/d0;

    invoke-direct {v2, v1, v1}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v2

    :cond_12
    new-instance v4, Lt9/f0;

    invoke-direct {v4, v2, v3, v10, v11}, Lt9/f0;-><init>(JJ)V

    new-instance v2, Lt9/d0;

    invoke-direct {v2, v1, v4}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v2
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lna/k;->D:J

    return-wide v0
.end method

.method public final g(Lt9/q;)V
    .locals 2

    iget v0, p0, Lna/k;->b:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    new-instance v0, Lb9/b;

    iget-object v1, p0, Lna/k;->a:Lqa/j;

    invoke-direct {v0, p1, v1}, Lb9/b;-><init>(Lt9/q;Lqa/j;)V

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lna/k;->z:Lt9/q;

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 3

    iget v0, p0, Lna/k;->b:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {p1, v2, v0}, Lna/n;->l(Lt9/o;ZZ)Lt9/i0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v0, Lzr/g0;->x:Lzr/e0;

    sget-object v0, Lzr/w0;->E:Lzr/w0;

    :goto_1
    iput-object v0, p0, Lna/k;->j:Lzr/w0;

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    :cond_0
    iget v3, v1, Lna/k;->k:I

    iget-object v5, v1, Lna/k;->g:Ljava/util/ArrayDeque;

    iget v6, v1, Lna/k;->b:I

    iget-object v8, v1, Lna/k;->e:Lx8/n;

    const/4 v11, 0x0

    const/4 v15, 0x4

    const-wide/16 v16, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v4, 0x1

    if-eqz v3, :cond_45

    const-wide/32 v19, 0x40000

    if-eq v3, v4, :cond_36

    const-wide/16 v21, 0x8

    if-eq v3, v10, :cond_19

    const/4 v5, 0x3

    if-ne v3, v5, :cond_18

    iget-object v3, v1, Lna/k;->h:Lna/m;

    iget-object v6, v3, Lna/m;->a:Ljava/util/ArrayList;

    iget v8, v3, Lna/m;->b:I

    if-eqz v8, :cond_14

    if-eq v8, v4, :cond_12

    const/16 v7, 0xb01

    const/16 v24, 0x8

    const/16 v12, 0xb00

    const/16 v4, 0x890

    if-eq v8, v10, :cond_d

    if-ne v8, v5, :cond_c

    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v16

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v18

    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v20

    sub-long v18, v18, v20

    iget v3, v3, Lna/m;->c:I

    int-to-long v13, v3

    sub-long v13, v18, v13

    long-to-int v3, v13

    new-instance v13, Lx8/n;

    invoke-direct {v13, v3}, Lx8/n;-><init>(I)V

    iget-object v14, v13, Lx8/n;->a:[B

    invoke-interface {v0, v14, v9, v3}, Lt9/o;->readFully([BII)V

    move v0, v9

    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_b

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lna/l;

    iget-wide v8, v3, Lna/l;->a:J

    sub-long v8, v8, v16

    long-to-int v8, v8

    invoke-virtual {v13, v8}, Lx8/n;->F(I)V

    invoke-virtual {v13, v15}, Lx8/n;->G(I)V

    invoke-virtual {v13}, Lx8/n;->i()I

    move-result v8

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v13, v8, v9}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v19

    sparse-switch v19, :sswitch_data_0

    :goto_1
    const/4 v14, -0x1

    goto :goto_2

    :sswitch_0
    const-string v15, "Super_SlowMotion_BGM"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1

    goto :goto_1

    :cond_1
    const/4 v14, 0x4

    goto :goto_2

    :sswitch_1
    const-string v15, "Super_SlowMotion_Deflickering_On"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_1

    :cond_2
    move v14, v5

    goto :goto_2

    :sswitch_2
    const-string v15, "Super_SlowMotion_Data"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    goto :goto_1

    :cond_3
    move v14, v10

    goto :goto_2

    :sswitch_3
    const-string v15, "Super_SlowMotion_Edit_Data"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    goto :goto_1

    :cond_4
    const/4 v14, 0x1

    goto :goto_2

    :sswitch_4
    const-string v15, "SlowMotion_Data"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    goto :goto_1

    :cond_5
    const/4 v14, 0x0

    :goto_2
    packed-switch v14, :pswitch_data_0

    const-string v0, "Invalid SEF name"

    invoke-static {v11, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :pswitch_0
    move v14, v7

    goto :goto_3

    :pswitch_1
    const/16 v14, 0xb04

    goto :goto_3

    :pswitch_2
    move v14, v12

    goto :goto_3

    :pswitch_3
    const/16 v14, 0xb03

    goto :goto_3

    :pswitch_4
    move v14, v4

    :goto_3
    iget v3, v3, Lna/l;->b:I

    add-int/lit8 v8, v8, 0x8

    sub-int/2addr v3, v8

    if-eq v14, v4, :cond_7

    if-eq v14, v12, :cond_a

    if-eq v14, v7, :cond_a

    const/16 v3, 0xb03

    if-eq v14, v3, :cond_a

    const/16 v8, 0xb04

    if-ne v14, v8, :cond_6

    goto/16 :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_7
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v13, v3, v9}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lna/m;->e:Lab/h0;

    invoke-virtual {v9, v3}, Lab/h0;->w(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v3

    const/4 v9, 0x0

    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v14

    if-ge v9, v14, :cond_9

    sget-object v14, Lna/m;->d:Lab/h0;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v8, v18

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v14, v8}, Lab/h0;->w(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v14

    if-ne v14, v5, :cond_8

    const/4 v14, 0x0

    :try_start_0
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    invoke-static/range {v18 .. v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v29

    const/4 v14, 0x1

    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Ljava/lang/String;

    invoke-static/range {v21 .. v21}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v31

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/16 v27, 0x1

    add-int/lit8 v8, v8, -0x1

    shl-int v33, v27, v8

    new-instance v28, Lia/b;

    invoke-direct/range {v28 .. v33}, Lia/b;-><init>(JJI)V

    move-object/from16 v8, v28

    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-static {v0, v11}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_8
    invoke-static {v11, v11}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_9
    new-instance v3, Lia/c;

    invoke-direct {v3, v15}, Lia/c;-><init>(Ljava/util/ArrayList;)V

    iget-object v8, v1, Lna/k;->i:Ljava/util/ArrayList;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    add-int/lit8 v0, v0, 0x1

    const/4 v9, 0x0

    const/4 v15, 0x4

    goto/16 :goto_0

    :cond_b
    const-wide/16 v8, 0x0

    iput-wide v8, v2, Lt9/s;->a:J

    :goto_6
    const/4 v0, 0x1

    goto/16 :goto_b

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_d
    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v8

    iget v11, v3, Lna/m;->c:I

    add-int/lit8 v11, v11, -0x14

    new-instance v13, Lx8/n;

    invoke-direct {v13, v11}, Lx8/n;-><init>(I)V

    iget-object v14, v13, Lx8/n;->a:[B

    const/4 v15, 0x0

    invoke-interface {v0, v14, v15, v11}, Lt9/o;->readFully([BII)V

    const/4 v0, 0x0

    :goto_7
    div-int/lit8 v15, v11, 0xc

    if-ge v0, v15, :cond_10

    invoke-virtual {v13, v10}, Lx8/n;->G(I)V

    iget-object v15, v13, Lx8/n;->a:[B

    iget v14, v13, Lx8/n;->b:I

    move/from16 v28, v10

    add-int/lit8 v10, v14, 0x1

    iput v10, v13, Lx8/n;->b:I

    aget-byte v5, v15, v14

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v14, v14, 0x2

    iput v14, v13, Lx8/n;->b:I

    aget-byte v10, v15, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v5, v10

    int-to-short v5, v5

    if-eq v5, v4, :cond_e

    if-eq v5, v12, :cond_e

    if-eq v5, v7, :cond_e

    const/16 v10, 0xb03

    const/16 v14, 0xb04

    if-eq v5, v10, :cond_f

    if-eq v5, v14, :cond_f

    move/from16 v5, v24

    invoke-virtual {v13, v5}, Lx8/n;->G(I)V

    move/from16 v17, v11

    goto :goto_8

    :cond_e
    const/16 v10, 0xb03

    const/16 v14, 0xb04

    :cond_f
    iget v5, v3, Lna/m;->c:I

    int-to-long v4, v5

    sub-long v4, v8, v4

    invoke-virtual {v13}, Lx8/n;->i()I

    move-result v7

    move/from16 v17, v11

    int-to-long v10, v7

    sub-long/2addr v4, v10

    invoke-virtual {v13}, Lx8/n;->i()I

    move-result v7

    new-instance v10, Lna/l;

    invoke-direct {v10, v4, v5, v7}, Lna/l;-><init>(JI)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/lit8 v0, v0, 0x1

    move/from16 v11, v17

    move/from16 v10, v28

    const/16 v4, 0x890

    const/4 v5, 0x3

    const/16 v7, 0xb01

    const/16 v24, 0x8

    goto :goto_7

    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    const-wide/16 v8, 0x0

    iput-wide v8, v2, Lt9/s;->a:J

    const/4 v14, 0x0

    goto/16 :goto_6

    :cond_11
    const/4 v0, 0x3

    iput v0, v3, Lna/m;->b:I

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lna/l;

    iget-wide v3, v0, Lna/l;->a:J

    iput-wide v3, v2, Lt9/s;->a:J

    goto/16 :goto_6

    :cond_12
    move v14, v9

    move/from16 v28, v10

    new-instance v4, Lx8/n;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lx8/n;-><init>(I)V

    iget-object v6, v4, Lx8/n;->a:[B

    invoke-interface {v0, v6, v14, v5}, Lt9/o;->readFully([BII)V

    invoke-virtual {v4}, Lx8/n;->i()I

    move-result v6

    add-int/2addr v6, v5

    iput v6, v3, Lna/m;->c:I

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v4

    const v5, 0x53454654

    if-eq v4, v5, :cond_13

    const-wide/16 v8, 0x0

    iput-wide v8, v2, Lt9/s;->a:J

    goto/16 :goto_6

    :cond_13
    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v4

    iget v0, v3, Lna/m;->c:I

    add-int/lit8 v0, v0, -0xc

    int-to-long v6, v0

    sub-long/2addr v4, v6

    iput-wide v4, v2, Lt9/s;->a:J

    move/from16 v0, v28

    iput v0, v3, Lna/m;->b:I

    goto/16 :goto_6

    :cond_14
    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v4

    cmp-long v0, v4, v16

    if-eqz v0, :cond_16

    cmp-long v0, v4, v21

    if-gez v0, :cond_15

    goto :goto_9

    :cond_15
    sub-long v4, v4, v21

    goto :goto_a

    :cond_16
    :goto_9
    const-wide/16 v4, 0x0

    :goto_a
    iput-wide v4, v2, Lt9/s;->a:J

    const/4 v0, 0x1

    iput v0, v3, Lna/m;->b:I

    :goto_b
    iget-wide v2, v2, Lt9/s;->a:J

    const-wide/16 v25, 0x0

    cmp-long v2, v2, v25

    if-nez v2, :cond_17

    const/4 v14, 0x0

    iput v14, v1, Lna/k;->k:I

    iput v14, v1, Lna/k;->n:I

    return v0

    :cond_17
    move v4, v0

    goto/16 :goto_20

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_19
    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v3

    iget v5, v1, Lna/k;->p:I

    const/4 v7, -0x1

    if-ne v5, v7, :cond_24

    const/4 v5, 0x0

    const/4 v7, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x1

    const/4 v15, 0x1

    const-wide v16, 0x7fffffffffffffffL

    const-wide v29, 0x7fffffffffffffffL

    const-wide v31, 0x7fffffffffffffffL

    const-wide v33, 0x7fffffffffffffffL

    :goto_c
    iget-object v9, v1, Lna/k;->A:[Lna/j;

    array-length v10, v9

    if-ge v5, v10, :cond_21

    aget-object v9, v9, v5

    iget v10, v9, Lna/j;->e:I

    iget-object v9, v9, Lna/j;->b:Lna/q;

    iget v14, v9, Lna/q;->b:I

    if-ne v10, v14, :cond_1a

    goto :goto_f

    :cond_1a
    iget-object v9, v9, Lna/q;->c:[J

    aget-wide v35, v9, v10

    iget-object v9, v1, Lna/k;->B:[[J

    sget v14, Lx8/t;->a:I

    aget-object v9, v9, v5

    aget-wide v9, v9, v10

    sub-long v35, v35, v3

    const-wide/16 v25, 0x0

    cmp-long v14, v35, v25

    if-ltz v14, :cond_1c

    cmp-long v14, v35, v19

    if-ltz v14, :cond_1b

    goto :goto_d

    :cond_1b
    const/4 v14, 0x0

    goto :goto_e

    :cond_1c
    :goto_d
    const/4 v14, 0x1

    :goto_e
    if-nez v14, :cond_1d

    if-nez v15, :cond_1e

    :cond_1d
    if-ne v14, v15, :cond_1f

    cmp-long v24, v35, v31

    if-gez v24, :cond_1f

    :cond_1e
    move v12, v5

    move-wide/from16 v29, v9

    move v15, v14

    move-wide/from16 v31, v35

    :cond_1f
    cmp-long v24, v9, v16

    if-gez v24, :cond_20

    move v7, v5

    move-wide/from16 v16, v9

    move v13, v14

    :cond_20
    :goto_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_c

    :cond_21
    cmp-long v5, v16, v33

    if-eqz v5, :cond_22

    if-eqz v13, :cond_22

    const-wide/32 v9, 0xa00000

    add-long v16, v16, v9

    cmp-long v5, v29, v16

    if-gez v5, :cond_23

    :cond_22
    move v7, v12

    :cond_23
    iput v7, v1, Lna/k;->p:I

    const/4 v5, -0x1

    if-ne v7, v5, :cond_24

    move/from16 v23, v5

    goto/16 :goto_29

    :cond_24
    iget-object v5, v1, Lna/k;->A:[Lna/j;

    iget v7, v1, Lna/k;->p:I

    aget-object v5, v5, v7

    iget-object v7, v5, Lna/j;->c:Lt9/k0;

    iget-object v9, v5, Lna/j;->b:Lna/q;

    iget-object v10, v5, Lna/j;->a:Lna/o;

    iget v12, v5, Lna/j;->e:I

    iget-object v13, v9, Lna/q;->c:[J

    iget-object v15, v9, Lna/q;->d:[I

    aget-wide v13, v13, v12

    move/from16 v16, v12

    iget-wide v11, v1, Lna/k;->y:J

    add-long/2addr v13, v11

    aget v11, v15, v16

    iget-object v12, v5, Lna/j;->d:Lt9/l0;

    sub-long v3, v13, v3

    move-wide/from16 v29, v3

    iget v3, v1, Lna/k;->q:I

    int-to-long v3, v3

    add-long v3, v29, v3

    const-wide/16 v25, 0x0

    cmp-long v17, v3, v25

    if-ltz v17, :cond_25

    cmp-long v17, v3, v19

    if-ltz v17, :cond_26

    :cond_25
    const/16 v27, 0x1

    goto/16 :goto_19

    :cond_26
    iget v2, v10, Lna/o;->h:I

    iget v13, v10, Lna/o;->k:I

    iget-object v10, v10, Lna/o;->g:Lu8/p;

    const/4 v14, 0x1

    if-ne v2, v14, :cond_27

    add-long v3, v3, v21

    add-int/lit8 v11, v11, -0x8

    :cond_27
    long-to-int v2, v3

    invoke-interface {v0, v2}, Lt9/o;->n(I)V

    iget-object v2, v10, Lu8/p;->n:Ljava/lang/String;

    iget-object v3, v10, Lu8/p;->n:Ljava/lang/String;

    const-string v4, "video/avc"

    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    and-int/lit8 v2, v6, 0x20

    if-eqz v2, :cond_28

    goto :goto_10

    :cond_28
    const/4 v14, 0x1

    goto :goto_11

    :cond_29
    const-string v2, "video/hevc"

    invoke-static {v3, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    and-int/lit16 v2, v6, 0x80

    if-eqz v2, :cond_28

    :goto_10
    const/4 v14, 0x1

    goto :goto_12

    :goto_11
    iput-boolean v14, v1, Lna/k;->t:Z

    :goto_12
    if-eqz v13, :cond_2f

    iget-object v2, v1, Lna/k;->d:Lx8/n;

    iget-object v3, v2, Lx8/n;->a:[B

    const/16 v18, 0x0

    aput-byte v18, v3, v18

    aput-byte v18, v3, v14

    const/16 v28, 0x2

    aput-byte v18, v3, v28

    rsub-int/lit8 v4, v13, 0x4

    add-int/2addr v11, v4

    :goto_13
    iget v6, v1, Lna/k;->r:I

    if-ge v6, v11, :cond_2e

    iget v6, v1, Lna/k;->s:I

    if-nez v6, :cond_2d

    iget-boolean v6, v1, Lna/k;->t:Z

    if-nez v6, :cond_2a

    invoke-static {v10}, Ly8/n;->e(Lu8/p;)I

    move-result v6

    add-int/2addr v6, v13

    aget v8, v15, v16

    iget v14, v1, Lna/k;->q:I

    sub-int/2addr v8, v14

    if-gt v6, v8, :cond_2a

    invoke-static {v10}, Ly8/n;->e(Lu8/p;)I

    move-result v14

    add-int v6, v13, v14

    move v8, v14

    goto :goto_14

    :cond_2a
    move v6, v13

    const/4 v8, 0x0

    :goto_14
    invoke-interface {v0, v3, v4, v6}, Lt9/o;->readFully([BII)V

    iget v14, v1, Lna/k;->q:I

    add-int/2addr v14, v6

    iput v14, v1, Lna/k;->q:I

    const/4 v14, 0x0

    invoke-virtual {v2, v14}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->g()I

    move-result v6

    if-ltz v6, :cond_2c

    sub-int/2addr v6, v8

    iput v6, v1, Lna/k;->s:I

    iget-object v6, v1, Lna/k;->c:Lx8/n;

    invoke-virtual {v6, v14}, Lx8/n;->F(I)V

    move/from16 p2, v4

    const/4 v4, 0x4

    invoke-interface {v7, v6, v4, v14}, Lt9/k0;->d(Lx8/n;II)V

    iget v6, v1, Lna/k;->r:I

    add-int/2addr v6, v4

    iput v6, v1, Lna/k;->r:I

    if-lez v8, :cond_2b

    invoke-interface {v7, v2, v8, v14}, Lt9/k0;->d(Lx8/n;II)V

    iget v4, v1, Lna/k;->r:I

    add-int/2addr v4, v8

    iput v4, v1, Lna/k;->r:I

    invoke-static {v3, v8, v10}, Ly8/n;->d([BILu8/p;)Z

    move-result v4

    if-eqz v4, :cond_2b

    const/4 v4, 0x1

    iput-boolean v4, v1, Lna/k;->t:Z

    :cond_2b
    :goto_15
    move/from16 v4, p2

    goto :goto_13

    :cond_2c
    const-string v0, "Invalid NAL length"

    const/4 v2, 0x0

    invoke-static {v2, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_2d
    move/from16 p2, v4

    const/4 v14, 0x0

    invoke-interface {v7, v0, v6, v14}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v4

    iget v6, v1, Lna/k;->q:I

    add-int/2addr v6, v4

    iput v6, v1, Lna/k;->q:I

    iget v6, v1, Lna/k;->r:I

    add-int/2addr v6, v4

    iput v6, v1, Lna/k;->r:I

    iget v6, v1, Lna/k;->s:I

    sub-int/2addr v6, v4

    iput v6, v1, Lna/k;->s:I

    goto :goto_15

    :cond_2e
    move/from16 v33, v11

    goto :goto_17

    :cond_2f
    const-string v2, "audio/ac4"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    iget v2, v1, Lna/k;->r:I

    if-nez v2, :cond_30

    invoke-static {v11, v8}, Lt9/a;->g(ILx8/n;)V

    const/4 v2, 0x7

    const/4 v14, 0x0

    invoke-interface {v7, v8, v2, v14}, Lt9/k0;->d(Lx8/n;II)V

    iget v3, v1, Lna/k;->r:I

    add-int/2addr v3, v2

    iput v3, v1, Lna/k;->r:I

    :cond_30
    add-int/lit8 v11, v11, 0x7

    goto :goto_16

    :cond_31
    if-eqz v12, :cond_32

    invoke-virtual {v12, v0}, Lt9/l0;->e(Lt9/o;)V

    :cond_32
    :goto_16
    iget v2, v1, Lna/k;->r:I

    if-ge v2, v11, :cond_2e

    sub-int v2, v11, v2

    const/4 v14, 0x0

    invoke-interface {v7, v0, v2, v14}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v2

    iget v3, v1, Lna/k;->q:I

    add-int/2addr v3, v2

    iput v3, v1, Lna/k;->q:I

    iget v3, v1, Lna/k;->r:I

    add-int/2addr v3, v2

    iput v3, v1, Lna/k;->r:I

    iget v3, v1, Lna/k;->s:I

    sub-int/2addr v3, v2

    iput v3, v1, Lna/k;->s:I

    goto :goto_16

    :goto_17
    iget-object v0, v9, Lna/q;->f:[J

    aget-wide v30, v0, v16

    iget-object v0, v9, Lna/q;->g:[I

    aget v0, v0, v16

    iget-boolean v2, v1, Lna/k;->t:Z

    if-nez v2, :cond_33

    const/high16 v2, 0x4000000

    or-int/2addr v0, v2

    :cond_33
    move/from16 v32, v0

    if-eqz v12, :cond_34

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v29, v12

    move/from16 v34, v33

    move/from16 v33, v32

    move-wide/from16 v31, v30

    move-object/from16 v30, v7

    invoke-virtual/range {v29 .. v36}, Lt9/l0;->c(Lt9/k0;JIIILt9/j0;)V

    move-object/from16 v2, v29

    move-object/from16 v0, v30

    const/16 v27, 0x1

    add-int/lit8 v12, v16, 0x1

    iget v3, v9, Lna/q;->b:I

    if-ne v12, v3, :cond_35

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Lt9/l0;->a(Lt9/k0;Lt9/j0;)V

    goto :goto_18

    :cond_34
    move-object v0, v7

    const/16 v27, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v29, v0

    invoke-interface/range {v29 .. v35}, Lt9/k0;->b(JIIILt9/j0;)V

    :cond_35
    :goto_18
    iget v0, v5, Lna/j;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Lna/j;->e:I

    const/4 v5, -0x1

    iput v5, v1, Lna/k;->p:I

    const/4 v14, 0x0

    iput v14, v1, Lna/k;->q:I

    iput v14, v1, Lna/k;->r:I

    iput v14, v1, Lna/k;->s:I

    iput-boolean v14, v1, Lna/k;->t:Z

    return v14

    :goto_19
    iput-wide v13, v2, Lt9/s;->a:J

    return v27

    :cond_36
    iget-wide v3, v1, Lna/k;->m:J

    iget v6, v1, Lna/k;->n:I

    int-to-long v6, v6

    sub-long/2addr v3, v6

    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v6

    add-long/2addr v6, v3

    iget-object v8, v1, Lna/k;->o:Lx8/n;

    if-eqz v8, :cond_3f

    iget-object v9, v8, Lx8/n;->a:[B

    iget v10, v1, Lna/k;->n:I

    long-to-int v3, v3

    invoke-interface {v0, v9, v10, v3}, Lt9/o;->readFully([BII)V

    iget v3, v1, Lna/k;->l:I

    const v4, 0x66747970

    if-ne v3, v4, :cond_3e

    const/4 v4, 0x1

    iput-boolean v4, v1, Lna/k;->u:Z

    const/16 v5, 0x8

    invoke-virtual {v8, v5}, Lx8/n;->F(I)V

    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v3

    const v4, 0x71742020

    const v5, 0x68656963

    if-eq v3, v5, :cond_38

    if-eq v3, v4, :cond_37

    const/4 v3, 0x0

    goto :goto_1a

    :cond_37
    const/4 v3, 0x1

    goto :goto_1a

    :cond_38
    const/4 v3, 0x2

    :goto_1a
    if-eqz v3, :cond_39

    goto :goto_1c

    :cond_39
    const/4 v3, 0x4

    invoke-virtual {v8, v3}, Lx8/n;->G(I)V

    :cond_3a
    invoke-virtual {v8}, Lx8/n;->a()I

    move-result v3

    if-lez v3, :cond_3d

    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v3

    if-eq v3, v5, :cond_3c

    if-eq v3, v4, :cond_3b

    const/4 v3, 0x0

    goto :goto_1b

    :cond_3b
    const/4 v3, 0x1

    goto :goto_1b

    :cond_3c
    const/4 v3, 0x2

    :goto_1b
    if-eqz v3, :cond_3a

    goto :goto_1c

    :cond_3d
    const/4 v3, 0x0

    :goto_1c
    iput v3, v1, Lna/k;->E:I

    goto :goto_1d

    :cond_3e
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_41

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly8/c;

    new-instance v4, Ly8/d;

    iget v5, v1, Lna/k;->l:I

    invoke-direct {v4, v5, v8}, Ly8/d;-><init>(ILx8/n;)V

    iget-object v3, v3, Ly8/c;->z:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_3f
    iget-boolean v5, v1, Lna/k;->u:Z

    if-nez v5, :cond_40

    iget v5, v1, Lna/k;->l:I

    const v8, 0x6d646174

    if-ne v5, v8, :cond_40

    const/4 v5, 0x1

    iput v5, v1, Lna/k;->E:I

    :cond_40
    cmp-long v5, v3, v19

    if-gez v5, :cond_42

    long-to-int v3, v3

    invoke-interface {v0, v3}, Lt9/o;->n(I)V

    :cond_41
    :goto_1d
    const/4 v3, 0x0

    goto :goto_1e

    :cond_42
    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v8

    add-long/2addr v8, v3

    iput-wide v8, v2, Lt9/s;->a:J

    const/4 v3, 0x1

    :goto_1e
    invoke-virtual {v1, v6, v7}, Lna/k;->l(J)V

    iget-boolean v4, v1, Lna/k;->v:Z

    if-eqz v4, :cond_43

    const/4 v4, 0x1

    iput-boolean v4, v1, Lna/k;->x:Z

    iget-wide v3, v1, Lna/k;->w:J

    iput-wide v3, v2, Lt9/s;->a:J

    const/4 v14, 0x0

    iput-boolean v14, v1, Lna/k;->v:Z

    const/4 v3, 0x1

    :cond_43
    if-eqz v3, :cond_44

    iget v3, v1, Lna/k;->k:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_44

    const/4 v9, 0x1

    goto :goto_1f

    :cond_44
    const/4 v9, 0x0

    :goto_1f
    if-eqz v9, :cond_0

    const/4 v4, 0x1

    :goto_20
    return v4

    :cond_45
    iget v3, v1, Lna/k;->n:I

    iget-object v7, v1, Lna/k;->f:Lx8/n;

    if-nez v3, :cond_49

    iget-object v3, v7, Lx8/n;->a:[B

    const/16 v9, 0x8

    const/4 v14, 0x0

    invoke-interface {v0, v3, v14, v9, v4}, Lt9/o;->f([BIIZ)Z

    move-result v3

    if-nez v3, :cond_48

    iget v3, v1, Lna/k;->E:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_47

    and-int/lit8 v3, v6, 0x2

    if-eqz v3, :cond_47

    iget-object v3, v1, Lna/k;->z:Lt9/q;

    const/4 v4, 0x4

    invoke-interface {v3, v14, v4}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v3

    iget-object v4, v1, Lna/k;->F:Lia/a;

    if-nez v4, :cond_46

    const/4 v11, 0x0

    goto :goto_21

    :cond_46
    new-instance v11, Lu8/c0;

    const/4 v5, 0x1

    new-array v5, v5, [Lu8/b0;

    aput-object v4, v5, v14

    invoke-direct {v11, v5}, Lu8/c0;-><init>([Lu8/b0;)V

    :goto_21
    new-instance v4, Lu8/o;

    invoke-direct {v4}, Lu8/o;-><init>()V

    iput-object v11, v4, Lu8/o;->k:Lu8/c0;

    invoke-static {v4, v3}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    iget-object v3, v1, Lna/k;->z:Lt9/q;

    invoke-interface {v3}, Lt9/q;->l()V

    iget-object v3, v1, Lna/k;->z:Lt9/q;

    new-instance v4, Lt9/t;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v4, v5, v6}, Lt9/t;-><init>(J)V

    invoke-interface {v3, v4}, Lt9/q;->v(Lt9/e0;)V

    :cond_47
    const/4 v9, 0x0

    goto/16 :goto_28

    :cond_48
    const/16 v9, 0x8

    iput v9, v1, Lna/k;->n:I

    const/4 v14, 0x0

    invoke-virtual {v7, v14}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->v()J

    move-result-wide v3

    iput-wide v3, v1, Lna/k;->m:J

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v3

    iput v3, v1, Lna/k;->l:I

    :cond_49
    iget-wide v3, v1, Lna/k;->m:J

    const-wide/16 v9, 0x1

    cmp-long v6, v3, v9

    if-nez v6, :cond_4a

    iget-object v3, v7, Lx8/n;->a:[B

    const/16 v9, 0x8

    invoke-interface {v0, v3, v9, v9}, Lt9/o;->readFully([BII)V

    iget v3, v1, Lna/k;->n:I

    add-int/2addr v3, v9

    iput v3, v1, Lna/k;->n:I

    invoke-virtual {v7}, Lx8/n;->y()J

    move-result-wide v3

    iput-wide v3, v1, Lna/k;->m:J

    goto :goto_22

    :cond_4a
    const-wide/16 v25, 0x0

    cmp-long v3, v3, v25

    if-nez v3, :cond_4c

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v3

    cmp-long v6, v3, v16

    if-nez v6, :cond_4b

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly8/c;

    if-eqz v6, :cond_4b

    iget-wide v3, v6, Ly8/c;->y:J

    :cond_4b
    cmp-long v6, v3, v16

    if-eqz v6, :cond_4c

    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v9

    sub-long/2addr v3, v9

    iget v6, v1, Lna/k;->n:I

    int-to-long v9, v6

    add-long/2addr v3, v9

    iput-wide v3, v1, Lna/k;->m:J

    :cond_4c
    :goto_22
    iget-wide v3, v1, Lna/k;->m:J

    iget v6, v1, Lna/k;->n:I

    int-to-long v9, v6

    cmp-long v3, v3, v9

    if-ltz v3, :cond_57

    iget v3, v1, Lna/k;->l:I

    const v4, 0x6d6f6f76

    const v9, 0x68646c72    # 4.3148E24f

    const v10, 0x6d657461

    if-eq v3, v4, :cond_4d

    const v4, 0x7472616b

    if-eq v3, v4, :cond_4d

    const v4, 0x6d646961

    if-eq v3, v4, :cond_4d

    const v4, 0x6d696e66

    if-eq v3, v4, :cond_4d

    const v4, 0x7374626c

    if-eq v3, v4, :cond_4d

    const v4, 0x65647473

    if-eq v3, v4, :cond_4d

    if-eq v3, v10, :cond_4d

    const v4, 0x61787465

    if-ne v3, v4, :cond_4e

    :cond_4d
    const/4 v4, 0x1

    goto/16 :goto_26

    :cond_4e
    const v4, 0x6d646864

    if-eq v3, v4, :cond_4f

    const v4, 0x6d766864

    if-eq v3, v4, :cond_4f

    if-eq v3, v9, :cond_4f

    const v4, 0x73747364

    if-eq v3, v4, :cond_4f

    const v4, 0x73747473

    if-eq v3, v4, :cond_4f

    const v4, 0x73747373

    if-eq v3, v4, :cond_4f

    const v4, 0x63747473

    if-eq v3, v4, :cond_4f

    const v4, 0x656c7374

    if-eq v3, v4, :cond_4f

    const v4, 0x73747363

    if-eq v3, v4, :cond_4f

    const v4, 0x7374737a

    if-eq v3, v4, :cond_4f

    const v4, 0x73747a32

    if-eq v3, v4, :cond_4f

    const v4, 0x7374636f

    if-eq v3, v4, :cond_4f

    const v4, 0x636f3634

    if-eq v3, v4, :cond_4f

    const v4, 0x746b6864

    if-eq v3, v4, :cond_4f

    const v4, 0x66747970

    if-eq v3, v4, :cond_4f

    const v4, 0x75647461

    if-eq v3, v4, :cond_4f

    const v4, 0x6b657973

    if-eq v3, v4, :cond_4f

    const v4, 0x696c7374

    if-ne v3, v4, :cond_50

    :cond_4f
    const/16 v5, 0x8

    goto :goto_23

    :cond_50
    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v3

    iget v5, v1, Lna/k;->n:I

    int-to-long v5, v5

    sub-long v10, v3, v5

    iget v3, v1, Lna/k;->l:I

    const v4, 0x6d707664

    if-ne v3, v4, :cond_51

    new-instance v7, Lia/a;

    add-long v14, v10, v5

    iget-wide v3, v1, Lna/k;->m:J

    sub-long v16, v3, v5

    const-wide/16 v8, 0x0

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v17}, Lia/a;-><init>(JJJJJ)V

    iput-object v7, v1, Lna/k;->F:Lia/a;

    :cond_51
    const/4 v3, 0x0

    iput-object v3, v1, Lna/k;->o:Lx8/n;

    const/4 v4, 0x1

    iput v4, v1, Lna/k;->k:I

    goto/16 :goto_27

    :goto_23
    if-ne v6, v5, :cond_52

    const/4 v3, 0x1

    goto :goto_24

    :cond_52
    const/4 v3, 0x0

    :goto_24
    invoke-static {v3}, Lva3/g;->i(Z)V

    iget-wide v3, v1, Lna/k;->m:J

    const-wide/32 v5, 0x7fffffff

    cmp-long v3, v3, v5

    if-gtz v3, :cond_53

    const/4 v3, 0x1

    goto :goto_25

    :cond_53
    const/4 v3, 0x0

    :goto_25
    invoke-static {v3}, Lva3/g;->i(Z)V

    new-instance v3, Lx8/n;

    iget-wide v4, v1, Lna/k;->m:J

    long-to-int v4, v4

    invoke-direct {v3, v4}, Lx8/n;-><init>(I)V

    iget-object v4, v7, Lx8/n;->a:[B

    iget-object v5, v3, Lx8/n;->a:[B

    const/16 v9, 0x8

    const/4 v14, 0x0

    invoke-static {v4, v14, v5, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v3, v1, Lna/k;->o:Lx8/n;

    const/4 v4, 0x1

    iput v4, v1, Lna/k;->k:I

    goto :goto_27

    :goto_26
    invoke-interface {v0}, Lt9/o;->getPosition()J

    move-result-wide v6

    iget-wide v11, v1, Lna/k;->m:J

    add-long/2addr v6, v11

    iget v3, v1, Lna/k;->n:I

    int-to-long v14, v3

    sub-long/2addr v6, v14

    cmp-long v3, v11, v14

    if-eqz v3, :cond_55

    iget v3, v1, Lna/k;->l:I

    if-ne v3, v10, :cond_55

    const/16 v3, 0x8

    invoke-virtual {v8, v3}, Lx8/n;->C(I)V

    iget-object v10, v8, Lx8/n;->a:[B

    const/4 v14, 0x0

    invoke-interface {v0, v10, v14, v3}, Lt9/o;->p([BII)V

    sget-object v3, Lna/c;->a:[B

    iget v3, v8, Lx8/n;->b:I

    const/4 v10, 0x4

    invoke-virtual {v8, v10}, Lx8/n;->G(I)V

    invoke-virtual {v8}, Lx8/n;->g()I

    move-result v10

    if-eq v10, v9, :cond_54

    add-int/lit8 v3, v3, 0x4

    :cond_54
    invoke-virtual {v8, v3}, Lx8/n;->F(I)V

    iget v3, v8, Lx8/n;->b:I

    invoke-interface {v0, v3}, Lt9/o;->n(I)V

    invoke-interface {v0}, Lt9/o;->e()V

    :cond_55
    new-instance v3, Ly8/c;

    iget v8, v1, Lna/k;->l:I

    invoke-direct {v3, v8, v6, v7}, Ly8/c;-><init>(IJ)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v8, v1, Lna/k;->m:J

    iget v3, v1, Lna/k;->n:I

    int-to-long v10, v3

    cmp-long v3, v8, v10

    if-nez v3, :cond_56

    invoke-virtual {v1, v6, v7}, Lna/k;->l(J)V

    goto :goto_27

    :cond_56
    const/4 v14, 0x0

    iput v14, v1, Lna/k;->k:I

    iput v14, v1, Lna/k;->n:I

    :goto_27
    move v9, v4

    :goto_28
    if-nez v9, :cond_0

    const/16 v23, -0x1

    :goto_29
    return v23

    :cond_57
    const-string v0, "Atom size less than header length (unsupported)."

    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lna/k;->j:Lzr/w0;

    return-object v0
.end method

.method public final l(J)V
    .locals 38

    move-object/from16 v1, p0

    :cond_0
    :goto_0
    iget-object v0, v1, Lna/k;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_70

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly8/c;

    iget-wide v5, v2, Ly8/c;->y:J

    cmp-long v2, v5, p1

    if-nez v2, :cond_70

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ly8/c;

    iget v2, v5, La9/a;->x:I

    const v6, 0x6d6f6f76

    if-ne v2, v6, :cond_6f

    const v2, 0x6d657461

    invoke-virtual {v5, v2}, Ly8/c;->o(I)Ly8/c;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x1

    const v8, 0x68646c72    # 4.3148E24f

    const/4 v9, 0x4

    const/16 v10, 0x10

    const v12, 0x64617461

    const-wide/16 v16, 0x0

    const/16 v14, 0xc

    const v15, 0x696c7374

    move-object/from16 v18, v7

    iget v7, v1, Lna/k;->b:I

    const/16 v2, 0x8

    move/from16 v20, v7

    if-eqz v6, :cond_13

    sget-object v21, Lna/c;->a:[B

    invoke-virtual {v6, v8}, Ly8/c;->p(I)Ly8/d;

    move-result-object v7

    const v8, 0x6b657973

    invoke-virtual {v6, v8}, Ly8/c;->p(I)Ly8/d;

    move-result-object v8

    invoke-virtual {v6, v15}, Ly8/c;->p(I)Ly8/d;

    move-result-object v6

    if-eqz v7, :cond_8

    if-eqz v8, :cond_8

    if-eqz v6, :cond_8

    iget-object v7, v7, Ly8/d;->y:Lx8/n;

    invoke-virtual {v7, v10}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v7

    const v10, 0x6d647461

    if-eq v7, v10, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object v7, v8, Ly8/d;->y:Lx8/n;

    invoke-virtual {v7, v14}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v8

    new-array v10, v8, [Ljava/lang/String;

    move v14, v3

    :goto_1
    if-ge v14, v8, :cond_2

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v25

    invoke-virtual {v7, v9}, Lx8/n;->G(I)V

    add-int/lit8 v15, v25, -0x8

    sget-object v9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v15, v9}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v14

    add-int/lit8 v14, v14, 0x1

    const/4 v9, 0x4

    const v15, 0x696c7374

    goto :goto_1

    :cond_2
    iget-object v6, v6, Ly8/d;->y:Lx8/n;

    invoke-virtual {v6, v2}, Lx8/n;->F(I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-virtual {v6}, Lx8/n;->a()I

    move-result v9

    if-le v9, v2, :cond_7

    iget v9, v6, Lx8/n;->b:I

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v14

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v15

    sub-int/2addr v15, v13

    if-ltz v15, :cond_5

    if-ge v15, v8, :cond_5

    aget-object v15, v10, v15

    add-int v2, v9, v14

    :goto_3
    iget v11, v6, Lx8/n;->b:I

    if-ge v11, v2, :cond_4

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v28

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v4

    if-ne v4, v12, :cond_3

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v2

    invoke-virtual {v6}, Lx8/n;->g()I

    move-result v4

    add-int/lit8 v11, v28, -0x10

    new-array v12, v11, [B

    invoke-virtual {v6, v12, v3, v11}, Lx8/n;->e([BII)V

    new-instance v11, Ly8/a;

    invoke-direct {v11, v15, v12, v4, v2}, Ly8/a;-><init>(Ljava/lang/String;[BII)V

    goto :goto_4

    :cond_3
    add-int v11, v11, v28

    invoke-virtual {v6, v11}, Lx8/n;->F(I)V

    const v12, 0x64617461

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_4
    if-eqz v11, :cond_6

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    const-string v2, "BoxParsers"

    const-string v4, "Skipped metadata with unknown key index: "

    invoke-static {v15, v4, v2}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_5
    add-int/2addr v9, v14

    invoke-virtual {v6, v9}, Lx8/n;->F(I)V

    const/16 v2, 0x8

    const v12, 0x64617461

    goto :goto_2

    :cond_7
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    :goto_6
    const/4 v2, 0x0

    goto :goto_7

    :cond_9
    new-instance v2, Lu8/c0;

    invoke-direct {v2, v7}, Lu8/c0;-><init>(Ljava/util/List;)V

    :goto_7
    iget-boolean v4, v1, Lna/k;->x:Z

    if-eqz v4, :cond_10

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    const-string v4, "auxiliary.tracks.interleaved"

    invoke-static {v2, v4}, Lna/n;->b(Lu8/c0;Ljava/lang/String;)Ly8/a;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v4, v4, Ly8/a;->b:[B

    aget-byte v4, v4, v3

    if-nez v4, :cond_a

    iget-wide v6, v1, Lna/k;->w:J

    const-wide/16 v8, 0x10

    add-long/2addr v6, v8

    iput-wide v6, v1, Lna/k;->y:J

    :cond_a
    const-string v4, "auxiliary.tracks.map"

    invoke-static {v2, v4}, Lna/n;->b(Lu8/c0;Ljava/lang/String;)Ly8/a;

    move-result-object v4

    invoke-static {v4}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ly8/a;->b()Ljava/util/ArrayList;

    move-result-object v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v3

    :goto_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v6, v8, :cond_f

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eqz v8, :cond_e

    if-eq v8, v13, :cond_d

    const/4 v9, 0x2

    if-eq v8, v9, :cond_c

    const/4 v9, 0x3

    if-eq v8, v9, :cond_b

    move v8, v3

    goto :goto_9

    :cond_b
    const/4 v8, 0x4

    goto :goto_9

    :cond_c
    const/4 v9, 0x3

    move v8, v9

    goto :goto_9

    :cond_d
    const/4 v9, 0x3

    const/4 v8, 0x2

    goto :goto_9

    :cond_e
    const/4 v9, 0x3

    move v8, v13

    :goto_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_f
    const/4 v9, 0x3

    move-object v4, v7

    goto :goto_b

    :cond_10
    const/4 v9, 0x3

    if-nez v2, :cond_11

    goto :goto_a

    :cond_11
    and-int/lit8 v4, v20, 0x40

    if-eqz v4, :cond_12

    const-string v4, "auxiliary.tracks.offset"

    invoke-static {v2, v4}, Lna/n;->b(Lu8/c0;Ljava/lang/String;)Ly8/a;

    move-result-object v4

    if-eqz v4, :cond_12

    new-instance v6, Lx8/n;

    iget-object v4, v4, Ly8/a;->b:[B

    invoke-direct {v6, v4}, Lx8/n;-><init>([B)V

    invoke-virtual {v6}, Lx8/n;->y()J

    move-result-wide v6

    cmp-long v4, v6, v16

    if-lez v4, :cond_12

    iput-wide v6, v1, Lna/k;->w:J

    iput-boolean v13, v1, Lna/k;->v:Z

    move-object/from16 v32, v0

    goto/16 :goto_3b

    :cond_12
    :goto_a
    move-object/from16 v4, v18

    goto :goto_b

    :cond_13
    const/4 v9, 0x3

    move-object/from16 v4, v18

    const/4 v2, 0x0

    :goto_b
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget v6, v1, Lna/k;->E:I

    if-ne v6, v13, :cond_14

    move v11, v13

    goto :goto_c

    :cond_14
    move v11, v3

    :goto_c
    new-instance v6, Lt9/x;

    invoke-direct {v6}, Lt9/x;-><init>()V

    const v7, 0x75647461

    invoke-virtual {v5, v7}, Ly8/c;->p(I)Ly8/d;

    move-result-object v7

    if-eqz v7, :cond_53

    sget-object v8, Lna/c;->a:[B

    iget-object v7, v7, Ly8/d;->y:Lx8/n;

    const/16 v8, 0x8

    invoke-virtual {v7, v8}, Lx8/n;->F(I)V

    new-instance v10, Lu8/c0;

    new-array v12, v3, [Lu8/b0;

    invoke-direct {v10, v12}, Lu8/c0;-><init>([Lu8/b0;)V

    :goto_d
    invoke-virtual {v7}, Lx8/n;->a()I

    move-result v12

    if-lt v12, v8, :cond_52

    iget v12, v7, Lx8/n;->b:I

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v18

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v9

    const v15, 0x6d657461

    if-ne v9, v15, :cond_41

    invoke-virtual {v7, v12}, Lx8/n;->F(I)V

    add-int v9, v12, v18

    invoke-virtual {v7, v8}, Lx8/n;->G(I)V

    iget v8, v7, Lx8/n;->b:I

    const/4 v15, 0x4

    invoke-virtual {v7, v15}, Lx8/n;->G(I)V

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v15

    const v3, 0x68646c72    # 4.3148E24f

    if-eq v15, v3, :cond_15

    add-int/lit8 v8, v8, 0x4

    :cond_15
    invoke-virtual {v7, v8}, Lx8/n;->F(I)V

    :goto_e
    iget v8, v7, Lx8/n;->b:I

    if-ge v8, v9, :cond_40

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v15

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v3

    move/from16 v31, v13

    const v13, 0x696c7374

    if-ne v3, v13, :cond_3f

    invoke-virtual {v7, v8}, Lx8/n;->F(I)V

    add-int/2addr v8, v15

    const/16 v3, 0x8

    invoke-virtual {v7, v3}, Lx8/n;->G(I)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_f
    iget v9, v7, Lx8/n;->b:I

    if-ge v9, v8, :cond_3d

    const-string v15, "Skipped unknown metadata entry: "

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v26

    add-int v9, v26, v9

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v13

    move-object/from16 v32, v0

    shr-int/lit8 v0, v13, 0x18

    and-int/lit16 v0, v0, 0xff

    move/from16 v33, v8

    const/16 v8, 0xa9

    move/from16 v34, v11

    const-string v11, "MetadataUtil"

    move-object/from16 v35, v14

    const-string v14, "TCON"

    if-eq v0, v8, :cond_16

    const/16 v8, 0xfd

    if-ne v0, v8, :cond_17

    :cond_16
    const/16 v21, 0x0

    const v29, 0x64617461

    goto/16 :goto_17

    :cond_17
    const v0, 0x676e7265

    if-ne v13, v0, :cond_19

    :try_start_0
    invoke-static {v7}, Lna/n;->h(Lx8/n;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Lha/k;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v8, Lha/o;

    invoke-static {v0}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    const/4 v13, 0x0

    invoke-direct {v8, v14, v13, v0}, Lha/o;-><init>(Ljava/lang/String;Ljava/lang/String;Lzr/w0;)V

    goto :goto_10

    :cond_18
    const/4 v13, 0x0

    const-string v0, "Failed to parse standard genre code"

    invoke-static {v11, v0}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v8, v13

    :goto_10
    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    move-object/from16 v21, v13

    const v29, 0x64617461

    move-object v13, v8

    goto/16 :goto_1c

    :cond_19
    const/16 v21, 0x0

    const v0, 0x6469736b

    if-ne v13, v0, :cond_1a

    :try_start_1
    const-string v0, "TPOS"

    invoke-static {v13, v0, v7}, Lna/n;->g(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_11
    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    const v29, 0x64617461

    goto/16 :goto_1c

    :catchall_0
    move-exception v0

    goto/16 :goto_1d

    :cond_1a
    const v0, 0x74726b6e

    if-ne v13, v0, :cond_1b

    :try_start_2
    const-string v0, "TRCK"

    invoke-static {v13, v0, v7}, Lna/n;->g(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_1b
    const v0, 0x746d706f

    if-ne v13, v0, :cond_1c

    const-string v0, "TBPM"

    move/from16 v8, v31

    const/4 v11, 0x0

    invoke-static {v13, v0, v7, v8, v11}, Lna/n;->i(ILjava/lang/String;Lx8/n;ZZ)Lha/j;

    move-result-object v13

    goto :goto_11

    :cond_1c
    const v0, 0x6370696c

    if-ne v13, v0, :cond_1d

    const-string v0, "TCMP"

    const/4 v8, 0x1

    invoke-static {v13, v0, v7, v8, v8}, Lna/n;->i(ILjava/lang/String;Lx8/n;ZZ)Lha/j;

    move-result-object v13

    goto :goto_11

    :cond_1d
    const v0, 0x636f7672

    if-ne v13, v0, :cond_1e

    invoke-static {v7}, Lna/n;->f(Lx8/n;)Lha/a;

    move-result-object v13

    goto :goto_11

    :cond_1e
    const v0, 0x61415254

    if-ne v13, v0, :cond_1f

    const-string v0, "TPE2"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_1f
    const v0, 0x736f6e6d

    if-ne v13, v0, :cond_20

    const-string v0, "TSOT"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_20
    const v0, 0x736f616c

    if-ne v13, v0, :cond_21

    const-string v0, "TSOA"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_21
    const v0, 0x736f6172

    if-ne v13, v0, :cond_22

    const-string v0, "TSOP"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_22
    const v0, 0x736f6161

    if-ne v13, v0, :cond_23

    const-string v0, "TSO2"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_11

    :cond_23
    const v0, 0x736f636f

    if-ne v13, v0, :cond_24

    const-string v0, "TSOC"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto/16 :goto_11

    :cond_24
    const v0, 0x72746e67

    if-ne v13, v0, :cond_25

    const-string v0, "ITUNESADVISORY"

    const/4 v11, 0x0

    invoke-static {v13, v0, v7, v11, v11}, Lna/n;->i(ILjava/lang/String;Lx8/n;ZZ)Lha/j;

    move-result-object v13

    goto/16 :goto_11

    :cond_25
    const v0, 0x70676170

    if-ne v13, v0, :cond_26

    const-string v0, "ITUNESGAPLESS"

    const/4 v8, 0x1

    const/4 v11, 0x0

    invoke-static {v13, v0, v7, v11, v8}, Lna/n;->i(ILjava/lang/String;Lx8/n;ZZ)Lha/j;

    move-result-object v13

    goto/16 :goto_11

    :cond_26
    const v0, 0x736f736e

    if-ne v13, v0, :cond_27

    const-string v0, "TVSHOWSORT"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto/16 :goto_11

    :cond_27
    const v0, 0x74767368

    if-ne v13, v0, :cond_28

    const-string v0, "TVSHOW"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto/16 :goto_11

    :cond_28
    const v0, 0x2d2d2d2d

    if-ne v13, v0, :cond_2f

    move-object/from16 v0, v21

    move-object v13, v0

    const/4 v8, -0x1

    const/4 v11, -0x1

    :goto_12
    iget v14, v7, Lx8/n;->b:I

    if-ge v14, v9, :cond_2c

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v15

    move/from16 v36, v11

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v11

    move/from16 v37, v14

    const/4 v14, 0x4

    invoke-virtual {v7, v14}, Lx8/n;->G(I)V

    const v14, 0x6d65616e

    if-ne v11, v14, :cond_29

    add-int/lit8 v15, v15, -0xc

    invoke-virtual {v7, v15}, Lx8/n;->p(I)Ljava/lang/String;

    move-result-object v11

    move-object v13, v11

    :goto_13
    move/from16 v11, v36

    const v14, 0x64617461

    goto :goto_12

    :cond_29
    const v14, 0x6e616d65

    if-ne v11, v14, :cond_2a

    add-int/lit8 v15, v15, -0xc

    invoke-virtual {v7, v15}, Lx8/n;->p(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_2a
    const v14, 0x64617461

    if-ne v11, v14, :cond_2b

    move v11, v15

    move/from16 v8, v37

    goto :goto_14

    :cond_2b
    move/from16 v11, v36

    :goto_14
    add-int/lit8 v15, v15, -0xc

    invoke-virtual {v7, v15}, Lx8/n;->G(I)V

    goto :goto_12

    :cond_2c
    move/from16 v36, v11

    const v14, 0x64617461

    if-eqz v13, :cond_2e

    if-eqz v0, :cond_2e

    const/4 v11, -0x1

    if-ne v8, v11, :cond_2d

    goto :goto_15

    :cond_2d
    invoke-virtual {v7, v8}, Lx8/n;->F(I)V

    const/16 v8, 0x10

    invoke-virtual {v7, v8}, Lx8/n;->G(I)V

    add-int/lit8 v11, v36, -0x10

    invoke-virtual {v7, v11}, Lx8/n;->p(I)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Lha/l;

    invoke-direct {v11, v13, v0, v8}, Lha/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v13, v11

    goto :goto_16

    :cond_2e
    :goto_15
    move-object/from16 v13, v21

    :goto_16
    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    move/from16 v29, v14

    goto/16 :goto_1c

    :cond_2f
    const v29, 0x64617461

    goto/16 :goto_19

    :goto_17
    const v0, 0xffffff

    and-int/2addr v0, v13

    const v8, 0x636d74

    if-ne v0, v8, :cond_30

    :try_start_3
    invoke-static {v13, v7}, Lna/n;->e(ILx8/n;)Lha/e;

    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_18
    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    goto/16 :goto_1c

    :cond_30
    const v8, 0x6e616d

    if-eq v0, v8, :cond_3b

    const v8, 0x74726b

    if-ne v0, v8, :cond_31

    goto/16 :goto_1b

    :cond_31
    const v8, 0x636f6d

    if-eq v0, v8, :cond_3a

    const v8, 0x777274

    if-ne v0, v8, :cond_32

    goto/16 :goto_1a

    :cond_32
    const v8, 0x646179

    if-ne v0, v8, :cond_33

    :try_start_4
    const-string v0, "TDRC"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_33
    const v8, 0x415254

    if-ne v0, v8, :cond_34

    const-string v0, "TPE1"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_34
    const v8, 0x746f6f

    if-ne v0, v8, :cond_35

    const-string v0, "TSSE"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_35
    const v8, 0x616c62

    if-ne v0, v8, :cond_36

    const-string v0, "TALB"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_36
    const v8, 0x6c7972

    if-ne v0, v8, :cond_37

    const-string v0, "USLT"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_37
    const v8, 0x67656e

    if-ne v0, v8, :cond_38

    invoke-static {v13, v14, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_38
    const v8, 0x677270

    if-ne v0, v8, :cond_39

    const-string v0, "TIT1"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto :goto_18

    :cond_39
    :goto_19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, La9/a;->e(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lx8/a;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    move-object/from16 v13, v21

    goto :goto_1c

    :cond_3a
    :goto_1a
    :try_start_5
    const-string v0, "TCOM"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13

    goto/16 :goto_18

    :cond_3b
    :goto_1b
    const-string v0, "TIT2"

    invoke-static {v13, v0, v7}, Lna/n;->k(ILjava/lang/String;Lx8/n;)Lha/o;

    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_18

    :goto_1c
    if-eqz v13, :cond_3c

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    move-object/from16 v0, v32

    move/from16 v8, v33

    move/from16 v11, v34

    move-object/from16 v14, v35

    const v13, 0x696c7374

    const/16 v31, 0x1

    goto/16 :goto_f

    :goto_1d
    invoke-virtual {v7, v9}, Lx8/n;->F(I)V

    throw v0

    :cond_3d
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    const v29, 0x64617461

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3e

    :goto_1e
    move-object/from16 v13, v21

    goto :goto_1f

    :cond_3e
    new-instance v13, Lu8/c0;

    invoke-direct {v13, v3}, Lu8/c0;-><init>(Ljava/util/List;)V

    goto :goto_1f

    :cond_3f
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    const v29, 0x64617461

    add-int/2addr v8, v15

    invoke-virtual {v7, v8}, Lx8/n;->F(I)V

    const v3, 0x68646c72    # 4.3148E24f

    const/4 v13, 0x1

    goto/16 :goto_e

    :cond_40
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    const v29, 0x64617461

    goto :goto_1e

    :goto_1f
    invoke-virtual {v10, v13}, Lu8/c0;->b(Lu8/c0;)Lu8/c0;

    move-result-object v0

    move-object v10, v0

    const/16 v11, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x4

    goto/16 :goto_2a

    :cond_41
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    const v29, 0x64617461

    const v0, 0x736d7461

    if-ne v9, v0, :cond_50

    invoke-virtual {v7, v12}, Lx8/n;->F(I)V

    add-int v0, v12, v18

    const/16 v3, 0xc

    invoke-virtual {v7, v3}, Lx8/n;->G(I)V

    :goto_20
    iget v3, v7, Lx8/n;->b:I

    if-ge v3, v0, :cond_4f

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v8

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v9

    const v11, 0x73617574

    if-ne v9, v11, :cond_4e

    const/16 v9, 0x10

    if-ge v8, v9, :cond_42

    move-object/from16 v3, v21

    const/16 v11, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x4

    goto/16 :goto_27

    :cond_42
    const/4 v14, 0x4

    invoke-virtual {v7, v14}, Lx8/n;->G(I)V

    const/4 v3, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_21
    const/4 v11, 0x2

    if-ge v8, v11, :cond_45

    invoke-virtual {v7}, Lx8/n;->t()I

    move-result v11

    invoke-virtual {v7}, Lx8/n;->t()I

    move-result v13

    if-nez v11, :cond_43

    move v3, v13

    goto :goto_22

    :cond_43
    const/4 v15, 0x1

    if-ne v11, v15, :cond_44

    move v9, v13

    :cond_44
    :goto_22
    add-int/lit8 v8, v8, 0x1

    goto :goto_21

    :cond_45
    const v8, -0x7fffffff

    const/16 v11, 0xc

    if-ne v3, v11, :cond_46

    const/16 v0, 0xf0

    :goto_23
    const/16 v11, 0x8

    const/16 v13, 0xc

    goto :goto_25

    :cond_46
    const/16 v11, 0xd

    if-ne v3, v11, :cond_47

    const/16 v0, 0x78

    goto :goto_23

    :cond_47
    const/16 v11, 0x15

    if-eq v3, v11, :cond_48

    move v0, v8

    goto :goto_23

    :cond_48
    invoke-virtual {v7}, Lx8/n;->a()I

    move-result v3

    const/16 v11, 0x8

    if-lt v3, v11, :cond_49

    iget v3, v7, Lx8/n;->b:I

    add-int/2addr v3, v11

    if-le v3, v0, :cond_4a

    :cond_49
    const/16 v13, 0xc

    goto :goto_24

    :cond_4a
    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v0

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v3

    const/16 v13, 0xc

    if-lt v0, v13, :cond_4c

    const v0, 0x73726672

    if-eq v3, v0, :cond_4b

    goto :goto_24

    :cond_4b
    invoke-virtual {v7}, Lx8/n;->u()I

    move-result v0

    goto :goto_25

    :cond_4c
    :goto_24
    move v0, v8

    :goto_25
    if-ne v0, v8, :cond_4d

    :goto_26
    move-object/from16 v3, v21

    goto :goto_27

    :cond_4d
    new-instance v3, Lu8/c0;

    new-instance v8, Lia/d;

    int-to-float v0, v0

    invoke-direct {v8, v0, v9}, Lia/d;-><init>(FI)V

    const/4 v15, 0x1

    new-array v0, v15, [Lu8/b0;

    const/16 v30, 0x0

    aput-object v8, v0, v30

    invoke-direct {v3, v0}, Lu8/c0;-><init>([Lu8/b0;)V

    goto :goto_27

    :cond_4e
    const/16 v11, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x4

    add-int/2addr v3, v8

    invoke-virtual {v7, v3}, Lx8/n;->F(I)V

    goto/16 :goto_20

    :cond_4f
    const/16 v11, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x4

    goto :goto_26

    :goto_27
    invoke-virtual {v10, v3}, Lu8/c0;->b(Lu8/c0;)Lu8/c0;

    move-result-object v0

    :goto_28
    move-object v10, v0

    goto :goto_2a

    :cond_50
    const/16 v11, 0x8

    const/16 v13, 0xc

    const/4 v14, 0x4

    const v0, -0x56878686

    if-ne v9, v0, :cond_51

    invoke-virtual {v7}, Lx8/n;->q()S

    move-result v0

    const/4 v9, 0x2

    invoke-virtual {v7, v9}, Lx8/n;->G(I)V

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v7, v0, v3}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x2b

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    const/16 v8, 0x2d

    invoke-virtual {v0, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v8, 0x0

    :try_start_6
    invoke-virtual {v0, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    const/4 v15, 0x1

    sub-int/2addr v9, v15

    invoke-virtual {v0, v3, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    new-instance v3, Lu8/c0;

    new-instance v9, Ly8/e;

    invoke-direct {v9, v8, v0}, Ly8/e;-><init>(FF)V

    new-array v0, v15, [Lu8/b0;

    const/16 v30, 0x0

    aput-object v9, v0, v30

    invoke-direct {v3, v0}, Lu8/c0;-><init>([Lu8/b0;)V
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_29

    :catch_0
    move-object/from16 v3, v21

    :goto_29
    invoke-virtual {v10, v3}, Lu8/c0;->b(Lu8/c0;)Lu8/c0;

    move-result-object v0

    goto :goto_28

    :cond_51
    :goto_2a
    add-int v12, v12, v18

    invoke-virtual {v7, v12}, Lx8/n;->F(I)V

    move v8, v11

    move-object/from16 v0, v32

    move/from16 v11, v34

    move-object/from16 v14, v35

    const/4 v3, 0x0

    const/4 v9, 0x3

    const/4 v13, 0x1

    goto/16 :goto_d

    :cond_52
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    invoke-virtual {v6, v10}, Lt9/x;->b(Lu8/c0;)V

    move-object v0, v10

    goto :goto_2b

    :cond_53
    move-object/from16 v32, v0

    move/from16 v34, v11

    move-object/from16 v35, v14

    const/16 v21, 0x0

    move-object/from16 v0, v21

    :goto_2b
    new-instance v3, Lu8/c0;

    const v7, 0x6d766864

    invoke-virtual {v5, v7}, Ly8/c;->p(I)Ly8/d;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v7, Ly8/d;->y:Lx8/n;

    invoke-static {v7}, Lna/c;->d(Lx8/n;)Ly8/f;

    move-result-object v7

    const/4 v15, 0x1

    new-array v8, v15, [Lu8/b0;

    const/16 v30, 0x0

    aput-object v7, v8, v30

    invoke-direct {v3, v8}, Lu8/c0;-><init>([Lu8/b0;)V

    and-int/lit8 v7, v20, 0x1

    if-eqz v7, :cond_54

    const/4 v10, 0x1

    goto :goto_2c

    :cond_54
    const/4 v10, 0x0

    :goto_2c
    new-instance v12, Llive/hms/video/factories/c;

    const/16 v8, 0x10

    invoke-direct {v12, v8}, Llive/hms/video/factories/c;-><init>(I)V

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    move/from16 v11, v34

    const/4 v13, 0x3

    invoke-static/range {v5 .. v12}, Lna/c;->g(Ly8/c;Lt9/x;JLu8/l;ZZLyr/e;)Ljava/util/ArrayList;

    move-result-object v5

    iget-boolean v7, v1, Lna/k;->x:Z

    if-eqz v7, :cond_56

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ne v7, v8, :cond_55

    const/4 v7, 0x1

    goto :goto_2d

    :cond_55
    const/4 v7, 0x0

    :goto_2d
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    const-string v10, ") is not same as the number of auxiliary tracks ("

    const-string v11, ")"

    const-string v12, "The number of auxiliary track types from metadata ("

    invoke-static {v8, v9, v12, v10, v11}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v7}, Lva3/g;->h(Ljava/lang/String;Z)V

    :cond_56
    invoke-static {v5}, Lna/n;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    :goto_2e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v10, v8, :cond_69

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lna/q;

    iget v9, v8, Lna/q;->b:I

    iget v13, v8, Lna/q;->e:I

    if-nez v9, :cond_57

    move-object/from16 v25, v0

    move-object v8, v2

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move/from16 v24, v12

    move-object/from16 v2, v35

    const/4 v7, -0x1

    const/4 v9, 0x3

    move-object v12, v6

    goto/16 :goto_37

    :cond_57
    iget-object v9, v8, Lna/q;->a:Lna/o;

    move-object/from16 v22, v5

    new-instance v5, Lna/j;

    move-object/from16 v23, v7

    iget-object v7, v1, Lna/k;->z:Lt9/q;

    add-int/lit8 v24, v12, 0x1

    move/from16 v25, v13

    iget v13, v9, Lna/o;->b:I

    move-object/from16 v26, v2

    iget-object v2, v9, Lna/o;->g:Lu8/p;

    invoke-interface {v7, v12, v13}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v7

    invoke-direct {v5, v9, v8, v7}, Lna/j;-><init>(Lna/o;Lna/q;Lt9/k0;)V

    move-object/from16 v27, v5

    move-object v12, v6

    iget-wide v5, v9, Lna/o;->e:J

    cmp-long v9, v5, v18

    if-eqz v9, :cond_58

    goto :goto_2f

    :cond_58
    iget-wide v5, v8, Lna/q;->h:J

    :goto_2f
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    const-string v5, "audio/true-hd"

    iget-object v6, v2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_59

    mul-int/lit8 v5, v25, 0x10

    goto :goto_30

    :cond_59
    add-int/lit8 v5, v25, 0x1e

    :goto_30
    invoke-virtual {v2}, Lu8/p;->a()Lu8/o;

    move-result-object v6

    iput v5, v6, Lu8/o;->n:I

    const/4 v9, 0x2

    if-ne v13, v9, :cond_5d

    iget v5, v2, Lu8/p;->f:I

    and-int/lit8 v7, v20, 0x8

    if-eqz v7, :cond_5b

    const/4 v7, -0x1

    if-ne v11, v7, :cond_5a

    const/4 v7, 0x1

    goto :goto_31

    :cond_5a
    const/4 v7, 0x2

    :goto_31
    or-int/2addr v5, v7

    :cond_5b
    iget-boolean v7, v1, Lna/k;->x:Z

    if-eqz v7, :cond_5c

    const v7, 0x8000

    or-int/2addr v5, v7

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iput v7, v6, Lu8/o;->g:I

    :cond_5c
    iput v5, v6, Lu8/o;->f:I

    :cond_5d
    const/4 v8, 0x1

    if-ne v13, v8, :cond_5e

    iget v5, v12, Lt9/x;->a:I

    const/4 v7, -0x1

    if-eq v5, v7, :cond_5e

    iget v8, v12, Lt9/x;->b:I

    if-eq v8, v7, :cond_5e

    iput v5, v6, Lu8/o;->F:I

    iput v8, v6, Lu8/o;->G:I

    :cond_5e
    iget-object v2, v2, Lu8/p;->l:Lu8/c0;

    iget-object v5, v1, Lna/k;->i:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5f

    move-object/from16 v7, v21

    goto :goto_32

    :cond_5f
    new-instance v7, Lu8/c0;

    invoke-direct {v7, v5}, Lu8/c0;-><init>(Ljava/util/List;)V

    :goto_32
    filled-new-array {v7, v0, v3}, [Lu8/c0;

    move-result-object v5

    if-eqz v2, :cond_60

    goto :goto_33

    :cond_60
    new-instance v2, Lu8/c0;

    const/4 v8, 0x0

    new-array v7, v8, [Lu8/b0;

    invoke-direct {v2, v7}, Lu8/c0;-><init>([Lu8/b0;)V

    :goto_33
    if-eqz v26, :cond_64

    move-object/from16 v8, v26

    const/4 v7, 0x0

    :goto_34
    iget-object v9, v8, Lu8/c0;->a:[Lu8/b0;

    move-object/from16 v25, v0

    array-length v0, v9

    if-ge v7, v0, :cond_65

    aget-object v0, v9, v7

    instance-of v9, v0, Ly8/a;

    if-eqz v9, :cond_63

    check-cast v0, Ly8/a;

    iget-object v9, v0, Ly8/a;->a:Ljava/lang/String;

    move-object/from16 v26, v0

    const-string v0, "com.android.capture.fps"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_62

    const/4 v9, 0x2

    if-ne v13, v9, :cond_61

    const/4 v0, 0x1

    new-array v9, v0, [Lu8/b0;

    const/16 v30, 0x0

    aput-object v26, v9, v30

    invoke-virtual {v2, v9}, Lu8/c0;->a([Lu8/b0;)Lu8/c0;

    move-result-object v2

    goto :goto_35

    :cond_61
    const/16 v30, 0x0

    goto :goto_35

    :cond_62
    const/4 v0, 0x1

    const/16 v30, 0x0

    new-array v9, v0, [Lu8/b0;

    aput-object v26, v9, v30

    invoke-virtual {v2, v9}, Lu8/c0;->a([Lu8/b0;)Lu8/c0;

    move-result-object v0

    move-object v2, v0

    :cond_63
    :goto_35
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, v25

    goto :goto_34

    :cond_64
    move-object/from16 v25, v0

    move-object/from16 v8, v26

    :cond_65
    const/4 v0, 0x0

    const/4 v9, 0x3

    :goto_36
    if-ge v0, v9, :cond_66

    aget-object v7, v5, v0

    invoke-virtual {v2, v7}, Lu8/c0;->b(Lu8/c0;)Lu8/c0;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_36

    :cond_66
    iget-object v0, v2, Lu8/c0;->a:[Lu8/b0;

    array-length v0, v0

    if-lez v0, :cond_67

    iput-object v2, v6, Lu8/o;->k:Lu8/c0;

    :cond_67
    invoke-static/range {v23 .. v23}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lu8/o;->l:Ljava/lang/String;

    move-object/from16 v0, v27

    iget-object v2, v0, Lna/j;->c:Lt9/k0;

    invoke-static {v6, v2}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    const/4 v2, 0x2

    const/4 v7, -0x1

    if-ne v13, v2, :cond_68

    if-ne v11, v7, :cond_68

    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    move-result v11

    :cond_68
    move-object/from16 v2, v35

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_37
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v35, v2

    move-object v2, v8

    move v13, v9

    move-object v6, v12

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    move/from16 v12, v24

    move-object/from16 v0, v25

    goto/16 :goto_2e

    :cond_69
    move-object/from16 v2, v35

    const/4 v7, -0x1

    iput v11, v1, Lna/k;->C:I

    iput-wide v14, v1, Lna/k;->D:J

    const/4 v11, 0x0

    new-array v0, v11, [Lna/j;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lna/j;

    iput-object v0, v1, Lna/k;->A:[Lna/j;

    array-length v2, v0

    new-array v2, v2, [[J

    array-length v3, v0

    new-array v3, v3, [I

    array-length v4, v0

    new-array v4, v4, [J

    array-length v5, v0

    new-array v5, v5, [Z

    const/4 v11, 0x0

    :goto_38
    array-length v6, v0

    if-ge v11, v6, :cond_6a

    aget-object v6, v0, v11

    iget-object v6, v6, Lna/j;->b:Lna/q;

    iget v6, v6, Lna/q;->b:I

    new-array v6, v6, [J

    aput-object v6, v2, v11

    aget-object v6, v0, v11

    iget-object v6, v6, Lna/j;->b:Lna/q;

    iget-object v6, v6, Lna/q;->f:[J

    const/16 v30, 0x0

    aget-wide v8, v6, v30

    aput-wide v8, v4, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_38

    :cond_6a
    move-wide/from16 v14, v16

    const/4 v11, 0x0

    :goto_39
    array-length v6, v0

    if-ge v11, v6, :cond_6e

    const-wide v8, 0x7fffffffffffffffL

    move v10, v7

    const/4 v6, 0x0

    :goto_3a
    array-length v12, v0

    if-ge v6, v12, :cond_6c

    aget-boolean v12, v5, v6

    if-nez v12, :cond_6b

    aget-wide v12, v4, v6

    cmp-long v16, v12, v8

    if-gtz v16, :cond_6b

    move v10, v6

    move-wide v8, v12

    :cond_6b
    add-int/lit8 v6, v6, 0x1

    goto :goto_3a

    :cond_6c
    aget v6, v3, v10

    aget-object v8, v2, v10

    aput-wide v14, v8, v6

    aget-object v9, v0, v10

    iget-object v9, v9, Lna/j;->b:Lna/q;

    iget-object v12, v9, Lna/q;->d:[I

    aget v12, v12, v6

    int-to-long v12, v12

    add-long/2addr v14, v12

    const/16 v31, 0x1

    add-int/lit8 v6, v6, 0x1

    aput v6, v3, v10

    array-length v8, v8

    if-ge v6, v8, :cond_6d

    iget-object v8, v9, Lna/q;->f:[J

    aget-wide v8, v8, v6

    aput-wide v8, v4, v10

    goto :goto_39

    :cond_6d
    aput-boolean v31, v5, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_39

    :cond_6e
    iput-object v2, v1, Lna/k;->B:[[J

    iget-object v0, v1, Lna/k;->z:Lt9/q;

    invoke-interface {v0}, Lt9/q;->l()V

    iget-object v0, v1, Lna/k;->z:Lt9/q;

    invoke-interface {v0, v1}, Lt9/q;->v(Lt9/e0;)V

    :goto_3b
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->clear()V

    iget-boolean v0, v1, Lna/k;->v:Z

    if-nez v0, :cond_0

    const/4 v9, 0x2

    iput v9, v1, Lna/k;->k:I

    goto/16 :goto_0

    :cond_6f
    move-object/from16 v32, v0

    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly8/c;

    iget-object v0, v0, Ly8/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_70
    iget v0, v1, Lna/k;->k:I

    const/4 v9, 0x2

    if-eq v0, v9, :cond_71

    const/4 v11, 0x0

    iput v11, v1, Lna/k;->k:I

    iput v11, v1, Lna/k;->n:I

    :cond_71
    return-void
.end method

.method public final release()V
    .locals 0

    return-void
.end method
