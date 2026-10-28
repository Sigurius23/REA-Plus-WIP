.class public final Lz1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# static fields
.field public static final E:Lz1/j;


# instance fields
.field public final w:J

.field public final x:J

.field public final y:J

.field public final z:[J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lz1/j;

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v7}, Lz1/j;-><init>(JJJ[J)V

    sput-object v0, Lz1/j;->E:Lz1/j;

    return-void
.end method

.method public constructor <init>(JJJ[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lz1/j;->w:J

    iput-wide p3, p0, Lz1/j;->x:J

    iput-wide p5, p0, Lz1/j;->y:J

    iput-object p7, p0, Lz1/j;->z:[J

    return-void
.end method


# virtual methods
.method public final a(Lz1/j;)Lz1/j;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lz1/j;->E:Lz1/j;

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    if-ne v0, v2, :cond_1

    return-object v2

    :cond_1
    iget-wide v2, v1, Lz1/j;->y:J

    iget-wide v4, v1, Lz1/j;->y:J

    iget-object v6, v1, Lz1/j;->z:[J

    iget-wide v7, v1, Lz1/j;->x:J

    iget-wide v9, v1, Lz1/j;->w:J

    iget-wide v11, v0, Lz1/j;->y:J

    cmp-long v1, v2, v11

    if-nez v1, :cond_2

    iget-object v1, v0, Lz1/j;->z:[J

    if-ne v6, v1, :cond_2

    move-wide/from16 v16, v11

    new-instance v11, Lz1/j;

    iget-wide v2, v0, Lz1/j;->w:J

    not-long v4, v9

    and-long v12, v2, v4

    iget-wide v2, v0, Lz1/j;->x:J

    not-long v4, v7

    and-long v14, v2, v4

    move-object/from16 v18, v1

    invoke-direct/range {v11 .. v18}, Lz1/j;-><init>(JJJ[J)V

    return-object v11

    :cond_2
    if-eqz v6, :cond_3

    array-length v2, v6

    move-object v11, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    aget-wide v12, v6, v3

    invoke-virtual {v11, v12, v13}, Lz1/j;->c(J)Lz1/j;

    move-result-object v11

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move-object v11, v0

    :cond_4
    const-wide/16 v2, 0x0

    cmp-long v6, v7, v2

    const-wide/16 v12, 0x1

    const/16 v14, 0x40

    if-eqz v6, :cond_6

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v14, :cond_6

    shl-long v15, v12, v6

    and-long/2addr v15, v7

    cmp-long v15, v15, v2

    if-eqz v15, :cond_5

    move-wide v15, v2

    int-to-long v1, v6

    add-long/2addr v1, v4

    invoke-virtual {v11, v1, v2}, Lz1/j;->c(J)Lz1/j;

    move-result-object v1

    move-object v11, v1

    goto :goto_2

    :cond_5
    move-wide v15, v2

    :goto_2
    add-int/lit8 v6, v6, 0x1

    move-wide v2, v15

    goto :goto_1

    :cond_6
    move-wide v15, v2

    cmp-long v1, v9, v15

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v14, :cond_8

    shl-long v2, v12, v1

    and-long/2addr v2, v9

    cmp-long v2, v2, v15

    if-eqz v2, :cond_7

    int-to-long v2, v1

    add-long/2addr v2, v4

    int-to-long v6, v14

    add-long/2addr v2, v6

    invoke-virtual {v11, v2, v3}, Lz1/j;->c(J)Lz1/j;

    move-result-object v2

    move-object v11, v2

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    return-object v11
.end method

.method public final c(J)Lz1/j;
    .locals 13

    iget-wide v0, p0, Lz1/j;->y:J

    sub-long v0, p1, v0

    const/4 v2, 0x0

    int-to-long v3, v2

    invoke-static {v0, v1, v3, v4}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x1

    const/16 v10, 0x40

    if-ltz v5, :cond_0

    int-to-long v11, v10

    invoke-static {v0, v1, v11, v12}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    if-gez v5, :cond_0

    long-to-int p1, v0

    shl-long p1, v8, p1

    iget-wide v0, p0, Lz1/j;->x:J

    and-long v2, v0, p1

    cmp-long v2, v2, v6

    if-eqz v2, :cond_5

    new-instance v3, Lz1/j;

    not-long p1, p1

    and-long v6, v0, p1

    iget-wide v8, p0, Lz1/j;->y:J

    iget-object v10, p0, Lz1/j;->z:[J

    iget-wide v4, p0, Lz1/j;->w:J

    invoke-direct/range {v3 .. v10}, Lz1/j;-><init>(JJJ[J)V

    return-object v3

    :cond_0
    int-to-long v11, v10

    invoke-static {v0, v1, v11, v12}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    if-ltz v5, :cond_1

    const/16 v5, 0x80

    int-to-long v11, v5

    invoke-static {v0, v1, v11, v12}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    if-gez v5, :cond_1

    long-to-int p1, v0

    sub-int/2addr p1, v10

    shl-long p1, v8, p1

    iget-wide v0, p0, Lz1/j;->w:J

    and-long v2, v0, p1

    cmp-long v2, v2, v6

    if-eqz v2, :cond_5

    new-instance v3, Lz1/j;

    not-long p1, p1

    and-long v4, v0, p1

    iget-wide v8, p0, Lz1/j;->y:J

    iget-object v10, p0, Lz1/j;->z:[J

    iget-wide v6, p0, Lz1/j;->x:J

    invoke-direct/range {v3 .. v10}, Lz1/j;-><init>(JJJ[J)V

    return-object v3

    :cond_1
    invoke-static {v0, v1, v3, v4}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v0

    if-gez v0, :cond_5

    iget-object v0, p0, Lz1/j;->z:[J

    if-eqz v0, :cond_5

    invoke-static {v0, p1, p2}, Lz1/q;->c([JJ)I

    move-result p1

    if-ltz p1, :cond_5

    new-instance v3, Lz1/j;

    array-length p2, v0

    add-int/lit8 v1, p2, -0x1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    move-object v10, p1

    goto :goto_0

    :cond_2
    new-array v4, v1, [J

    if-lez p1, :cond_3

    invoke-static {v0, v4, v2, v2, p1}, Lm83/n;->g0([J[JIII)V

    :cond_3
    if-ge p1, v1, :cond_4

    add-int/lit8 v1, p1, 0x1

    invoke-static {v0, v4, p1, v1, p2}, Lm83/n;->g0([J[JIII)V

    :cond_4
    move-object v10, v4

    :goto_0
    iget-wide v4, p0, Lz1/j;->w:J

    iget-wide v6, p0, Lz1/j;->x:J

    iget-wide v8, p0, Lz1/j;->y:J

    invoke-direct/range {v3 .. v10}, Lz1/j;-><init>(JJJ[J)V

    return-object v3

    :cond_5
    return-object p0
.end method

.method public final d(J)Z
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-wide v3, v0, Lz1/j;->y:J

    sub-long v3, v1, v3

    const/4 v5, 0x0

    int-to-long v6, v5

    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v8

    const-wide/16 v11, 0x1

    const/4 v13, 0x1

    const/16 v14, 0x40

    const-wide/16 v15, 0x0

    if-ltz v8, :cond_1

    int-to-long v9, v14

    invoke-static {v3, v4, v9, v10}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v8

    if-gez v8, :cond_1

    long-to-int v1, v3

    shl-long v1, v11, v1

    iget-wide v3, v0, Lz1/j;->x:J

    and-long/2addr v1, v3

    cmp-long v1, v1, v15

    if-eqz v1, :cond_0

    return v13

    :cond_0
    return v5

    :cond_1
    int-to-long v8, v14

    invoke-static {v3, v4, v8, v9}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v8

    if-ltz v8, :cond_3

    const/16 v8, 0x80

    int-to-long v8, v8

    invoke-static {v3, v4, v8, v9}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v8

    if-gez v8, :cond_3

    long-to-int v1, v3

    sub-int/2addr v1, v14

    shl-long v1, v11, v1

    iget-wide v3, v0, Lz1/j;->w:J

    and-long/2addr v1, v3

    cmp-long v1, v1, v15

    if-eqz v1, :cond_2

    return v13

    :cond_2
    return v5

    :cond_3
    invoke-static {v3, v4, v6, v7}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v3

    if-lez v3, :cond_4

    return v5

    :cond_4
    iget-object v3, v0, Lz1/j;->z:[J

    if-eqz v3, :cond_5

    invoke-static {v3, v1, v2}, Lz1/q;->c([JJ)I

    move-result v1

    if-ltz v1, :cond_5

    return v13

    :cond_5
    return v5
.end method

.method public final e(Lz1/j;)Lz1/j;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lz1/j;->E:Lz1/j;

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    if-ne v0, v2, :cond_1

    return-object v1

    :cond_1
    iget-wide v2, v1, Lz1/j;->y:J

    iget-wide v4, v1, Lz1/j;->y:J

    iget-object v6, v1, Lz1/j;->z:[J

    iget-wide v7, v1, Lz1/j;->x:J

    iget-wide v9, v1, Lz1/j;->w:J

    iget-wide v11, v0, Lz1/j;->y:J

    cmp-long v2, v2, v11

    iget-wide v13, v0, Lz1/j;->x:J

    move v3, v2

    iget-wide v1, v0, Lz1/j;->w:J

    if-nez v3, :cond_2

    iget-object v3, v0, Lz1/j;->z:[J

    if-ne v6, v3, :cond_2

    move-wide/from16 v16, v11

    new-instance v11, Lz1/j;

    move-wide v14, v13

    or-long v12, v1, v9

    or-long/2addr v14, v7

    move-object/from16 v18, v3

    invoke-direct/range {v11 .. v18}, Lz1/j;-><init>(JJJ[J)V

    return-object v11

    :cond_2
    move-wide v14, v13

    const/16 v3, 0x40

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x1

    iget-object v11, v0, Lz1/j;->z:[J

    if-nez v11, :cond_9

    if-eqz v11, :cond_3

    array-length v4, v11

    move-object/from16 v5, p1

    move v6, v13

    :goto_0
    if-ge v6, v4, :cond_4

    aget-wide v7, v11, v6

    invoke-virtual {v5, v7, v8}, Lz1/j;->g(J)Lz1/j;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    cmp-long v4, v14, v16

    iget-wide v6, v0, Lz1/j;->y:J

    if-eqz v4, :cond_6

    move v4, v13

    :goto_1
    if-ge v4, v3, :cond_6

    shl-long v8, v18, v4

    and-long/2addr v8, v14

    cmp-long v8, v8, v16

    if-eqz v8, :cond_5

    int-to-long v8, v4

    add-long/2addr v8, v6

    invoke-virtual {v5, v8, v9}, Lz1/j;->g(J)Lz1/j;

    move-result-object v5

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    cmp-long v4, v1, v16

    if-eqz v4, :cond_8

    :goto_2
    if-ge v13, v3, :cond_8

    shl-long v8, v18, v13

    and-long/2addr v8, v1

    cmp-long v4, v8, v16

    if-eqz v4, :cond_7

    int-to-long v8, v13

    add-long/2addr v8, v6

    int-to-long v10, v3

    add-long/2addr v8, v10

    invoke-virtual {v5, v8, v9}, Lz1/j;->g(J)Lz1/j;

    move-result-object v4

    move-object v5, v4

    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_8
    return-object v5

    :cond_9
    if-eqz v6, :cond_a

    array-length v1, v6

    move-object v11, v0

    move v2, v13

    :goto_3
    if-ge v2, v1, :cond_b

    aget-wide v14, v6, v2

    invoke-virtual {v11, v14, v15}, Lz1/j;->g(J)Lz1/j;

    move-result-object v11

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    move-object v11, v0

    :cond_b
    cmp-long v1, v7, v16

    if-eqz v1, :cond_d

    move v1, v13

    :goto_4
    if-ge v1, v3, :cond_d

    shl-long v14, v18, v1

    and-long/2addr v14, v7

    cmp-long v2, v14, v16

    if-eqz v2, :cond_c

    int-to-long v14, v1

    add-long/2addr v14, v4

    invoke-virtual {v11, v14, v15}, Lz1/j;->g(J)Lz1/j;

    move-result-object v2

    move-object v11, v2

    :cond_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_d
    cmp-long v1, v9, v16

    if-eqz v1, :cond_f

    :goto_5
    if-ge v13, v3, :cond_f

    shl-long v1, v18, v13

    and-long/2addr v1, v9

    cmp-long v1, v1, v16

    if-eqz v1, :cond_e

    int-to-long v1, v13

    add-long/2addr v1, v4

    int-to-long v6, v3

    add-long/2addr v1, v6

    invoke-virtual {v11, v1, v2}, Lz1/j;->g(J)Lz1/j;

    move-result-object v1

    move-object v11, v1

    :cond_e
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_f
    return-object v11
.end method

.method public final g(J)Lz1/j;
    .locals 29

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-wide v3, v0, Lz1/j;->y:J

    sub-long v5, v1, v3

    const/4 v7, 0x0

    int-to-long v8, v7

    invoke-static {v5, v6, v8, v9}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v10

    iget-wide v11, v0, Lz1/j;->x:J

    const/16 v15, 0x40

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x1

    if-ltz v10, :cond_0

    int-to-long v13, v15

    invoke-static {v5, v6, v13, v14}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v10

    if-gez v10, :cond_0

    long-to-int v1, v5

    shl-long v1, v18, v1

    and-long v3, v11, v1

    cmp-long v3, v3, v16

    if-nez v3, :cond_e

    new-instance v13, Lz1/j;

    or-long v16, v11, v1

    iget-wide v1, v0, Lz1/j;->y:J

    iget-object v3, v0, Lz1/j;->z:[J

    iget-wide v14, v0, Lz1/j;->w:J

    move-wide/from16 v18, v1

    move-object/from16 v20, v3

    invoke-direct/range {v13 .. v20}, Lz1/j;-><init>(JJJ[J)V

    return-object v13

    :cond_0
    int-to-long v13, v15

    invoke-static {v5, v6, v13, v14}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v10

    move/from16 v20, v7

    move-wide/from16 v21, v8

    iget-wide v7, v0, Lz1/j;->w:J

    const/16 v9, 0x80

    move-wide/from16 v23, v3

    if-ltz v10, :cond_1

    int-to-long v3, v9

    invoke-static {v5, v6, v3, v4}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v3

    if-gez v3, :cond_1

    long-to-int v1, v5

    sub-int/2addr v1, v15

    shl-long v1, v18, v1

    and-long v3, v7, v1

    cmp-long v3, v3, v16

    if-nez v3, :cond_e

    new-instance v9, Lz1/j;

    or-long v10, v7, v1

    iget-wide v14, v0, Lz1/j;->y:J

    iget-object v1, v0, Lz1/j;->z:[J

    iget-wide v12, v0, Lz1/j;->x:J

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v16}, Lz1/j;-><init>(JJJ[J)V

    return-object v9

    :cond_1
    int-to-long v3, v9

    invoke-static {v5, v6, v3, v4}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    iget-object v6, v0, Lz1/j;->z:[J

    const/4 v9, 0x1

    if-ltz v5, :cond_c

    invoke-virtual/range {p0 .. p2}, Lz1/j;->d(J)Z

    move-result v5

    if-nez v5, :cond_e

    int-to-long v9, v9

    add-long v25, v1, v9

    div-long v25, v25, v13

    move-wide/from16 v27, v3

    mul-long v3, v25, v13

    move-wide/from16 v25, v7

    move-wide/from16 v7, v21

    invoke-static {v3, v4, v7, v8}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v5

    if-gez v5, :cond_2

    const-wide v3, 0x7fffffffffffffffL

    sub-long v3, v3, v27

    add-long/2addr v3, v9

    :cond_2
    move-wide/from16 v7, v23

    move-wide/from16 v22, v25

    const/4 v9, 0x0

    :goto_0
    invoke-static {v7, v8, v3, v4}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v10

    if-gez v10, :cond_7

    cmp-long v10, v11, v16

    if-eqz v10, :cond_5

    if-nez v9, :cond_3

    new-instance v9, Lzk/w;

    invoke-direct {v9, v6}, Lzk/w;-><init>([J)V

    :cond_3
    move/from16 v10, v20

    :goto_1
    if-ge v10, v15, :cond_5

    shl-long v24, v18, v10

    and-long v24, v11, v24

    cmp-long v21, v24, v16

    if-eqz v21, :cond_4

    move-object/from16 v21, v6

    int-to-long v5, v10

    add-long/2addr v5, v7

    iget-object v15, v9, Lzk/w;->a:Ljava/lang/Object;

    check-cast v15, La0/j0;

    invoke-virtual {v15, v5, v6}, La0/j0;->a(J)V

    goto :goto_2

    :cond_4
    move-object/from16 v21, v6

    :goto_2
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, v21

    const/16 v15, 0x40

    goto :goto_1

    :cond_5
    move-object/from16 v21, v6

    cmp-long v5, v22, v16

    if-nez v5, :cond_6

    move-wide/from16 v26, v3

    move-object/from16 v3, v21

    goto :goto_3

    :cond_6
    add-long/2addr v7, v13

    move-object/from16 v6, v21

    move-wide/from16 v11, v22

    const/16 v15, 0x40

    move-wide/from16 v22, v16

    goto :goto_0

    :cond_7
    move-object v3, v6

    move-wide/from16 v26, v7

    move-wide/from16 v16, v11

    :goto_3
    new-instance v21, Lz1/j;

    if-eqz v9, :cond_b

    iget-object v4, v9, Lzk/w;->a:Ljava/lang/Object;

    check-cast v4, La0/j0;

    iget v5, v4, La0/j0;->b:I

    if-nez v5, :cond_8

    const/4 v5, 0x0

    goto :goto_5

    :cond_8
    new-array v6, v5, [J

    iget-object v4, v4, La0/j0;->a:[J

    move/from16 v7, v20

    :goto_4
    if-ge v7, v5, :cond_9

    aget-wide v8, v4, v7

    aput-wide v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_9
    move-object v5, v6

    :goto_5
    if-nez v5, :cond_a

    goto :goto_7

    :cond_a
    move-object/from16 v28, v5

    :goto_6
    move-wide/from16 v24, v16

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v28, v3

    goto :goto_6

    :goto_8
    invoke-direct/range {v21 .. v28}, Lz1/j;-><init>(JJJ[J)V

    move-object/from16 v3, v21

    invoke-virtual {v3, v1, v2}, Lz1/j;->g(J)Lz1/j;

    move-result-object v1

    return-object v1

    :cond_c
    move-object v3, v6

    if-nez v3, :cond_d

    new-instance v3, Lz1/j;

    new-array v9, v9, [J

    aput-wide v1, v9, v20

    move-object v2, v3

    iget-wide v3, v0, Lz1/j;->w:J

    iget-wide v5, v0, Lz1/j;->x:J

    iget-wide v7, v0, Lz1/j;->y:J

    invoke-direct/range {v2 .. v9}, Lz1/j;-><init>(JJJ[J)V

    return-object v2

    :cond_d
    invoke-static {v3, v1, v2}, Lz1/q;->c([JJ)I

    move-result v4

    if-gez v4, :cond_e

    add-int/2addr v4, v9

    neg-int v4, v4

    array-length v5, v3

    add-int/lit8 v6, v5, 0x1

    new-array v14, v6, [J

    move/from16 v6, v20

    invoke-static {v3, v14, v6, v6, v4}, Lm83/n;->g0([J[JIII)V

    add-int/lit8 v6, v4, 0x1

    invoke-static {v3, v14, v6, v4, v5}, Lm83/n;->g0([J[JIII)V

    aput-wide v1, v14, v4

    new-instance v7, Lz1/j;

    iget-wide v10, v0, Lz1/j;->x:J

    iget-wide v12, v0, Lz1/j;->y:J

    iget-wide v8, v0, Lz1/j;->w:J

    invoke-direct/range {v7 .. v14}, Lz1/j;-><init>(JJJ[J)V

    return-object v7

    :cond_e
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lz1/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz1/i;-><init>(Lz1/j;Lq83/d;)V

    invoke-static {v0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_5

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x1

    add-int/2addr v6, v8

    if-le v6, v8, :cond_1

    const-string v9, ", "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    instance-of v8, v7, Ljava/lang/CharSequence;

    :goto_2
    if-eqz v8, :cond_3

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_3

    :cond_3
    instance-of v8, v7, Ljava/lang/Character;

    if-eqz v8, :cond_4

    check-cast v7, Ljava/lang/Character;

    invoke-virtual {v7}, Ljava/lang/Character;->charValue()C

    move-result v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
