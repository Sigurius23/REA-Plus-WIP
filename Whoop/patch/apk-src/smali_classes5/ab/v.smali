.class public final Lab/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;


# instance fields
.field public final a:Lx8/n;

.field public final b:Lt9/b0;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:Lt9/k0;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:J

.field public m:I

.field public n:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lab/v;->h:I

    new-instance v1, Lx8/n;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lx8/n;-><init>(I)V

    iput-object v1, p0, Lab/v;->a:Lx8/n;

    iget-object v1, v1, Lx8/n;->a:[B

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    new-instance v0, Lt9/b0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt9/b0;-><init>(I)V

    iput-object v0, p0, Lab/v;->b:Lt9/b0;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/v;->n:J

    iput-object p1, p0, Lab/v;->c:Ljava/lang/String;

    iput p2, p0, Lab/v;->d:I

    iput-object p3, p0, Lab/v;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lab/v;->h:I

    iput v0, p0, Lab/v;->i:I

    iput-boolean v0, p0, Lab/v;->k:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/v;->n:J

    return-void
.end method

.method public final c(Lx8/n;)V
    .locals 12

    iget-object v0, p0, Lab/v;->f:Lt9/k0;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    if-lez v0, :cond_c

    iget v0, p0, Lab/v;->h:I

    iget-object v1, p0, Lab/v;->a:Lx8/n;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_7

    if-eq v0, v4, :cond_3

    if-ne v0, v3, :cond_2

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    iget v1, p0, Lab/v;->m:I

    iget v3, p0, Lab/v;->i:I

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lab/v;->f:Lt9/k0;

    invoke-interface {v1, p1, v0, v2}, Lt9/k0;->d(Lx8/n;II)V

    iget v1, p0, Lab/v;->i:I

    add-int/2addr v1, v0

    iput v1, p0, Lab/v;->i:I

    iget v0, p0, Lab/v;->m:I

    if-ge v1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lab/v;->n:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v5

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    invoke-static {v4}, Lva3/g;->i(Z)V

    iget-object v5, p0, Lab/v;->f:Lt9/k0;

    iget-wide v6, p0, Lab/v;->n:J

    iget v9, p0, Lab/v;->m:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x1

    invoke-interface/range {v5 .. v11}, Lt9/k0;->b(JIIILt9/j0;)V

    iget-wide v0, p0, Lab/v;->n:J

    iget-wide v3, p0, Lab/v;->l:J

    add-long/2addr v0, v3

    iput-wide v0, p0, Lab/v;->n:J

    iput v2, p0, Lab/v;->i:I

    iput v2, p0, Lab/v;->h:I

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    iget v5, p0, Lab/v;->i:I

    const/4 v6, 0x4

    rsub-int/lit8 v5, v5, 0x4

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v5, v1, Lx8/n;->a:[B

    iget v7, p0, Lab/v;->i:I

    invoke-virtual {p1, v5, v7, v0}, Lx8/n;->e([BII)V

    iget v5, p0, Lab/v;->i:I

    add-int/2addr v5, v0

    iput v5, p0, Lab/v;->i:I

    if-ge v5, v6, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v1, v2}, Lx8/n;->F(I)V

    invoke-virtual {v1}, Lx8/n;->g()I

    move-result v0

    iget-object v5, p0, Lab/v;->b:Lt9/b0;

    invoke-virtual {v5, v0}, Lt9/b0;->a(I)Z

    move-result v0

    if-nez v0, :cond_5

    iput v2, p0, Lab/v;->i:I

    iput v4, p0, Lab/v;->h:I

    goto/16 :goto_0

    :cond_5
    iget v0, v5, Lt9/b0;->d:I

    iput v0, p0, Lab/v;->m:I

    iget-boolean v0, p0, Lab/v;->j:Z

    if-nez v0, :cond_6

    iget v0, v5, Lt9/b0;->h:I

    int-to-long v7, v0

    const-wide/32 v9, 0xf4240

    mul-long/2addr v7, v9

    iget v0, v5, Lt9/b0;->e:I

    int-to-long v9, v0

    div-long/2addr v7, v9

    iput-wide v7, p0, Lab/v;->l:J

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    iget-object v7, p0, Lab/v;->g:Ljava/lang/String;

    iput-object v7, v0, Lu8/o;->a:Ljava/lang/String;

    iget-object v7, p0, Lab/v;->e:Ljava/lang/String;

    invoke-static {v7}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lu8/o;->l:Ljava/lang/String;

    iget-object v7, v5, Lt9/b0;->c:Ljava/lang/String;

    invoke-static {v7}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Lu8/o;->m:Ljava/lang/String;

    const/16 v7, 0x1000

    iput v7, v0, Lu8/o;->n:I

    iget v7, v5, Lt9/b0;->f:I

    iput v7, v0, Lu8/o;->C:I

    iget v5, v5, Lt9/b0;->e:I

    iput v5, v0, Lu8/o;->D:I

    iget-object v5, p0, Lab/v;->c:Ljava/lang/String;

    iput-object v5, v0, Lu8/o;->d:Ljava/lang/String;

    iget v5, p0, Lab/v;->d:I

    iput v5, v0, Lu8/o;->f:I

    new-instance v5, Lu8/p;

    invoke-direct {v5, v0}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v0, p0, Lab/v;->f:Lt9/k0;

    invoke-interface {v0, v5}, Lt9/k0;->a(Lu8/p;)V

    iput-boolean v4, p0, Lab/v;->j:Z

    :cond_6
    invoke-virtual {v1, v2}, Lx8/n;->F(I)V

    iget-object v0, p0, Lab/v;->f:Lt9/k0;

    invoke-interface {v0, v1, v6, v2}, Lt9/k0;->d(Lx8/n;II)V

    iput v3, p0, Lab/v;->h:I

    goto/16 :goto_0

    :cond_7
    iget-object v0, p1, Lx8/n;->a:[B

    iget v5, p1, Lx8/n;->b:I

    iget v6, p1, Lx8/n;->c:I

    :goto_2
    if-ge v5, v6, :cond_b

    aget-byte v7, v0, v5

    and-int/lit16 v8, v7, 0xff

    const/16 v9, 0xff

    if-ne v8, v9, :cond_8

    move v8, v4

    goto :goto_3

    :cond_8
    move v8, v2

    :goto_3
    iget-boolean v9, p0, Lab/v;->k:Z

    if-eqz v9, :cond_9

    and-int/lit16 v7, v7, 0xe0

    const/16 v9, 0xe0

    if-ne v7, v9, :cond_9

    move v7, v4

    goto :goto_4

    :cond_9
    move v7, v2

    :goto_4
    iput-boolean v8, p0, Lab/v;->k:Z

    if-eqz v7, :cond_a

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {p1, v6}, Lx8/n;->F(I)V

    iput-boolean v2, p0, Lab/v;->k:Z

    iget-object v1, v1, Lx8/n;->a:[B

    aget-byte v0, v0, v5

    aput-byte v0, v1, v4

    iput v3, p0, Lab/v;->i:I

    iput v4, p0, Lab/v;->h:I

    goto/16 :goto_0

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_b
    invoke-virtual {p1, v6}, Lx8/n;->F(I)V

    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    iput-wide p2, p0, Lab/v;->n:J

    return-void
.end method

.method public final e(Z)V
    .locals 0

    return-void
.end method

.method public final i(Lt9/q;Lab/l0;)V
    .locals 1

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v0, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lab/v;->g:Ljava/lang/String;

    invoke-virtual {p2}, Lab/l0;->h()V

    iget p2, p2, Lab/l0;->e:I

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    iput-object p1, p0, Lab/v;->f:Lt9/k0;

    return-void
.end method
