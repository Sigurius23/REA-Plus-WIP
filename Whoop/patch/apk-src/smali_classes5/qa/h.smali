.class public final Lqa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final a:Lqa/l;

.field public final b:Lu8/p;

.field public final c:Ljava/util/ArrayList;

.field public final d:Lx8/n;

.field public e:[B

.field public f:Lt9/k0;

.field public g:I

.field public h:I

.field public i:[J

.field public j:J


# direct methods
.method public constructor <init>(Lqa/l;Lu8/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqa/h;->a:Lqa/l;

    sget-object v0, Lx8/t;->c:[B

    iput-object v0, p0, Lqa/h;->e:[B

    new-instance v0, Lx8/n;

    invoke-direct {v0}, Lx8/n;-><init>()V

    iput-object v0, p0, Lqa/h;->d:Lx8/n;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lu8/p;->a()Lu8/o;

    move-result-object v0

    const-string v1, "application/x-media3-cues"

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lu8/o;->m:Ljava/lang/String;

    iget-object p2, p2, Lu8/p;->n:Ljava/lang/String;

    iput-object p2, v0, Lu8/o;->j:Ljava/lang/String;

    invoke-interface {p1}, Lqa/l;->c0()I

    move-result p1

    iput p1, v0, Lu8/o;->I:I

    new-instance p1, Lu8/p;

    invoke-direct {p1, v0}, Lu8/p;-><init>(Lu8/o;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lqa/h;->b:Lu8/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lqa/h;->c:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput p1, p0, Lqa/h;->h:I

    sget-object p1, Lx8/t;->d:[J

    iput-object p1, p0, Lqa/h;->i:[J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lqa/h;->j:J

    return-void
.end method


# virtual methods
.method public final a(Lqa/g;)V
    .locals 8

    iget-object v0, p0, Lqa/h;->f:Lt9/k0;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v0, p1, Lqa/g;->x:[B

    array-length v5, v0

    iget-object v1, p0, Lqa/h;->d:Lx8/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Lx8/n;->D(I[B)V

    iget-object v0, p0, Lqa/h;->f:Lt9/k0;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v5, v2}, Lt9/k0;->d(Lx8/n;II)V

    iget-object v1, p0, Lqa/h;->f:Lt9/k0;

    iget-wide v2, p1, Lqa/g;->w:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Lt9/k0;->b(JIIILt9/j0;)V

    return-void
.end method

.method public final b(JJ)V
    .locals 1

    iget p1, p0, Lqa/h;->h:I

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lva3/g;->i(Z)V

    iput-wide p3, p0, Lqa/h;->j:J

    iget p1, p0, Lqa/h;->h:I

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    iput p2, p0, Lqa/h;->h:I

    :cond_1
    iget p1, p0, Lqa/h;->h:I

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    const/4 p1, 0x3

    iput p1, p0, Lqa/h;->h:I

    :cond_2
    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 7

    iget v0, p0, Lqa/h;->h:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    const/4 v0, 0x3

    invoke-interface {p1, v1, v0}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v0

    iput-object v0, p0, Lqa/h;->f:Lt9/k0;

    iget-object v3, p0, Lqa/h;->b:Lu8/p;

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Lt9/k0;->a(Lu8/p;)V

    invoke-interface {p1}, Lt9/q;->l()V

    new-instance v0, Lt9/a0;

    new-array v3, v2, [J

    const-wide/16 v4, 0x0

    aput-wide v4, v3, v1

    new-array v6, v2, [J

    aput-wide v4, v6, v1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v4, v5, v3, v6}, Lt9/a0;-><init>(J[J[J)V

    invoke-interface {p1, v0}, Lt9/q;->v(Lt9/e0;)V

    :cond_1
    iput v2, p0, Lqa/h;->h:I

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lqa/h;->h:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/4 v5, 0x5

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget v2, v1, Lqa/h;->h:I

    const/4 v5, 0x2

    const/16 v6, 0x400

    const-wide/16 v7, -0x1

    if-ne v2, v3, :cond_3

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v9

    cmp-long v2, v9, v7

    if-eqz v2, :cond_1

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v9

    invoke-static {v9, v10}, Lvd/f;->k(J)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    iget-object v9, v1, Lqa/h;->e:[B

    array-length v9, v9

    if-le v2, v9, :cond_2

    new-array v2, v2, [B

    iput-object v2, v1, Lqa/h;->e:[B

    :cond_2
    iput v4, v1, Lqa/h;->g:I

    iput v5, v1, Lqa/h;->h:I

    :cond_3
    iget v2, v1, Lqa/h;->h:I

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v11, v1, Lqa/h;->c:Ljava/util/ArrayList;

    const/4 v12, 0x4

    const/4 v13, -0x1

    if-ne v2, v5, :cond_a

    iget-object v2, v1, Lqa/h;->e:[B

    array-length v5, v2

    iget v14, v1, Lqa/h;->g:I

    if-ne v5, v14, :cond_4

    array-length v5, v2

    add-int/2addr v5, v6

    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    iput-object v2, v1, Lqa/h;->e:[B

    :cond_4
    iget-object v2, v1, Lqa/h;->e:[B

    iget v5, v1, Lqa/h;->g:I

    array-length v14, v2

    sub-int/2addr v14, v5

    invoke-interface {v0, v2, v5, v14}, Lu8/h;->read([BII)I

    move-result v2

    if-eq v2, v13, :cond_5

    iget v5, v1, Lqa/h;->g:I

    add-int/2addr v5, v2

    iput v5, v1, Lqa/h;->g:I

    :cond_5
    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v14

    cmp-long v5, v14, v7

    if-eqz v5, :cond_6

    iget v5, v1, Lqa/h;->g:I

    move/from16 p2, v4

    int-to-long v4, v5

    cmp-long v4, v4, v14

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_6
    move/from16 p2, v4

    :goto_2
    if-ne v2, v13, :cond_b

    :cond_7
    :try_start_0
    iget-wide v4, v1, Lqa/h;->j:J

    cmp-long v2, v4, v9

    if-eqz v2, :cond_8

    new-instance v2, Lqa/k;

    invoke-direct {v2, v4, v5, v3}, Lqa/k;-><init>(JZ)V

    :goto_3
    move-object/from16 v18, v2

    goto :goto_4

    :cond_8
    sget-object v2, Lqa/k;->c:Lqa/k;

    goto :goto_3

    :goto_4
    iget-object v14, v1, Lqa/h;->a:Lqa/l;

    iget-object v15, v1, Lqa/h;->e:[B

    iget v2, v1, Lqa/h;->g:I

    new-instance v4, Lmm/d;

    const/16 v5, 0x13

    invoke-direct {v4, v1, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    const/16 v16, 0x0

    move/from16 v17, v2

    move-object/from16 v19, v4

    invoke-interface/range {v14 .. v19}, Lqa/l;->k([BIILqa/k;Lx8/d;)V

    invoke-static {v11}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [J

    iput-object v2, v1, Lqa/h;->i:[J

    move/from16 v2, p2

    :goto_5
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_9

    iget-object v4, v1, Lqa/h;->i:[J

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa/g;

    iget-wide v14, v5, Lqa/g;->w:J

    aput-wide v14, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_6

    :cond_9
    sget-object v2, Lx8/t;->c:[B

    iput-object v2, v1, Lqa/h;->e:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iput v12, v1, Lqa/h;->h:I

    goto :goto_7

    :goto_6
    const-string v2, "SubtitleParser failed."

    invoke-static {v0, v2}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v0

    throw v0

    :cond_a
    move/from16 p2, v4

    :cond_b
    :goto_7
    iget v2, v1, Lqa/h;->h:I

    const/4 v4, 0x3

    if-ne v2, v4, :cond_f

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v4

    cmp-long v2, v4, v7

    if-eqz v2, :cond_c

    invoke-interface {v0}, Lt9/o;->getLength()J

    move-result-wide v4

    invoke-static {v4, v5}, Lvd/f;->k(J)I

    move-result v6

    :cond_c
    invoke-interface {v0, v6}, Lt9/o;->k(I)I

    move-result v0

    if-ne v0, v13, :cond_f

    iget-wide v4, v1, Lqa/h;->j:J

    cmp-long v0, v4, v9

    if-nez v0, :cond_d

    move/from16 v0, p2

    goto :goto_8

    :cond_d
    iget-object v0, v1, Lqa/h;->i:[J

    invoke-static {v0, v4, v5, v3}, Lx8/t;->d([JJZ)I

    move-result v0

    :goto_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_e

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa/g;

    invoke-virtual {v1, v2}, Lqa/h;->a(Lqa/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_e
    iput v12, v1, Lqa/h;->h:I

    :cond_f
    iget v0, v1, Lqa/h;->h:I

    if-ne v0, v12, :cond_10

    return v13

    :cond_10
    return p2
.end method

.method public final release()V
    .locals 2

    iget v0, p0, Lqa/h;->h:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqa/h;->a:Lqa/l;

    invoke-interface {v0}, Lqa/l;->reset()V

    iput v1, p0, Lqa/h;->h:I

    return-void
.end method
