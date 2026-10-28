.class public final Lab/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/j;
.implements Lfn/h;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:J

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lab/i;->a:I

    packed-switch p1, :pswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Lx8/n;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lab/i;->f:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    iput-wide v0, p0, Lab/i;->c:J

    return-void

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Led3/a;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Led3/a;-><init>(I)V

    iput-object p1, p0, Lab/i;->f:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    iput-wide v0, p0, Lab/i;->c:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lab/i;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lab/i;->f:Ljava/lang/Object;

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lt9/k0;

    iput-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide p1, p0, Lab/i;->c:J

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lab/i;->f:Ljava/lang/Object;

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lwm/s;

    iput-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide p1, p0, Lab/i;->c:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/i;->c:J

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/i;->c:J

    return-void

    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/i;->c:J

    return-void

    :pswitch_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lab/i;->c:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lx8/n;)V
    .locals 9

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i;->f:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    iget-object v1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lab/i;->b:Z

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v1

    iget v2, p0, Lab/i;->e:I

    const/4 v3, 0x0

    const/16 v4, 0xa

    if-ge v2, v4, :cond_3

    rsub-int/lit8 v2, v2, 0xa

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v5, p1, Lx8/n;->a:[B

    iget v6, p1, Lx8/n;->b:I

    iget-object v7, v0, Lx8/n;->a:[B

    iget v8, p0, Lab/i;->e:I

    invoke-static {v5, v6, v7, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v5, p0, Lab/i;->e:I

    add-int/2addr v5, v2

    if-ne v5, v4, :cond_3

    invoke-virtual {v0, v3}, Lx8/n;->F(I)V

    const/16 v2, 0x49

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v5

    if-ne v2, v5, :cond_2

    const/16 v2, 0x44

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v5

    if-ne v2, v5, :cond_2

    const/16 v2, 0x33

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v5

    if-eq v2, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lx8/n;->G(I)V

    invoke-virtual {v0}, Lx8/n;->s()I

    move-result v0

    add-int/2addr v0, v4

    iput v0, p0, Lab/i;->d:I

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "Id3Reader"

    const-string v0, "Discarding invalid ID3 tag"

    invoke-static {p1, v0}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v3, p0, Lab/i;->b:Z

    goto :goto_2

    :cond_3
    :goto_1
    iget v0, p0, Lab/i;->d:I

    iget v2, p0, Lab/i;->e:I

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-interface {v1, p1, v0, v3}, Lt9/k0;->d(Lx8/n;II)V

    iget p1, p0, Lab/i;->e:I

    add-int/2addr p1, v0

    iput p1, p0, Lab/i;->e:I

    :goto_2
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lab/i;->b:Z

    if-eqz v0, :cond_b

    iget v0, p0, Lab/i;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lx8/n;->t()I

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    iput-boolean v3, p0, Lab/i;->b:Z

    :cond_5
    iget v0, p0, Lab/i;->d:I

    sub-int/2addr v0, v2

    iput v0, p0, Lab/i;->d:I

    iget-boolean v0, p0, Lab/i;->b:Z

    :goto_3
    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    iget v0, p0, Lab/i;->d:I

    if-ne v0, v2, :cond_9

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v0

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lx8/n;->t()I

    move-result v0

    if-eqz v0, :cond_8

    iput-boolean v3, p0, Lab/i;->b:Z

    :cond_8
    iget v0, p0, Lab/i;->d:I

    sub-int/2addr v0, v2

    iput v0, p0, Lab/i;->d:I

    iget-boolean v0, p0, Lab/i;->b:Z

    :goto_4
    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    iget v0, p1, Lx8/n;->b:I

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v1

    iget-object v2, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v2, [Lt9/k0;

    array-length v4, v2

    move v5, v3

    :goto_5
    if-ge v5, v4, :cond_a

    aget-object v6, v2, v5

    invoke-virtual {p1, v0}, Lx8/n;->F(I)V

    invoke-interface {v6, p1, v1, v3}, Lt9/k0;->d(Lx8/n;II)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    iget p1, p0, Lab/i;->e:I

    add-int/2addr p1, v1

    iput p1, p0, Lab/i;->e:I

    :cond_b
    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(IJ)V
    .locals 2

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_1

    iput-wide p2, p0, Lab/i;->c:J

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lab/i;->d:I

    iput p1, p0, Lab/i;->e:I

    :goto_0
    return-void

    :pswitch_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lab/i;->b:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    iput-wide p2, p0, Lab/i;->c:J

    :cond_3
    const/4 p1, 0x0

    iput p1, p0, Lab/i;->e:I

    const/4 p1, 0x2

    iput p1, p0, Lab/i;->d:I

    :goto_1
    return-void

    :pswitch_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lab/i;->b:Z

    iput-wide p2, p0, Lab/i;->c:J

    const/4 p1, 0x0

    iput p1, p0, Lab/i;->d:I

    iput p1, p0, Lab/i;->e:I

    :goto_2
    return-void

    :pswitch_2
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    const/4 p1, 0x1

    iput-boolean p1, p0, Lab/i;->b:Z

    iput-wide p2, p0, Lab/i;->c:J

    const/4 p1, 0x0

    iput p1, p0, Lab/i;->e:I

    const/4 p1, 0x2

    iput p1, p0, Lab/i;->d:I

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Z)V
    .locals 10

    iget p1, p0, Lab/i;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast p1, Lt9/k0;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lab/i;->b:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lab/i;->d:I

    if-eqz p1, :cond_2

    iget v0, p0, Lab/i;->e:I

    if-eq v0, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v0, p0, Lab/i;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    invoke-static {p1}, Lva3/g;->i(Z)V

    iget-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lt9/k0;

    iget-wide v2, p0, Lab/i;->c:J

    iget v5, p0, Lab/i;->d:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Lt9/k0;->b(JIIILt9/j0;)V

    iput-boolean v0, p0, Lab/i;->b:Z

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-boolean p1, p0, Lab/i;->b:Z

    if-eqz p1, :cond_5

    iget-wide v0, p0, Lab/i;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    move p1, v0

    :goto_2
    invoke-static {p1}, Lva3/g;->i(Z)V

    iget-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast p1, [Lt9/k0;

    array-length v1, p1

    move v2, v0

    :goto_3
    if-ge v2, v1, :cond_4

    aget-object v3, p1, v2

    iget-wide v4, p0, Lab/i;->c:J

    iget v7, p0, Lab/i;->e:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x1

    invoke-interface/range {v3 .. v9}, Lt9/k0;->b(JIIILt9/j0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    iput-boolean v0, p0, Lab/i;->b:Z

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Led3/a;)V
    .locals 8

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i;->f:Ljava/lang/Object;

    check-cast v0, Led3/a;

    iget-object v1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v1, Lwm/s;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lab/i;->b:Z

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Led3/a;->a()I

    move-result v1

    iget v2, p0, Lab/i;->e:I

    const/16 v3, 0xa

    if-ge v2, v3, :cond_3

    rsub-int/lit8 v2, v2, 0xa

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v4, p1, Led3/a;->a:[B

    iget v5, p1, Led3/a;->b:I

    iget-object v6, v0, Led3/a;->a:[B

    iget v7, p0, Lab/i;->e:I

    invoke-static {v4, v5, v6, v7, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, Lab/i;->e:I

    add-int/2addr v4, v2

    if-ne v4, v3, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Led3/a;->K(I)V

    const/16 v4, 0x49

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v5

    if-ne v4, v5, :cond_2

    const/16 v4, 0x44

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v5

    if-ne v4, v5, :cond_2

    const/16 v4, 0x33

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v5

    if-eq v4, v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Led3/a;->L(I)V

    invoke-virtual {v0}, Led3/a;->w()I

    move-result v0

    add-int/2addr v0, v3

    iput v0, p0, Lab/i;->d:I

    goto :goto_1

    :cond_2
    :goto_0
    const-string p1, "Id3Reader"

    const-string v0, "Discarding invalid ID3 tag"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lab/i;->b:Z

    goto :goto_2

    :cond_3
    :goto_1
    iget v0, p0, Lab/i;->d:I

    iget v2, p0, Lab/i;->e:I

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v1, Lwm/s;

    invoke-interface {v1, v0, p1}, Lwm/s;->c(ILed3/a;)V

    iget p1, p0, Lab/i;->e:I

    add-int/2addr p1, v0

    iput p1, p0, Lab/i;->e:I

    :goto_2
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lab/i;->b:Z

    if-eqz v0, :cond_b

    iget v0, p0, Lab/i;->d:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Led3/a;->a()I

    move-result v0

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Led3/a;->y()I

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    iput-boolean v3, p0, Lab/i;->b:Z

    :cond_5
    iget v0, p0, Lab/i;->d:I

    sub-int/2addr v0, v2

    iput v0, p0, Lab/i;->d:I

    iget-boolean v0, p0, Lab/i;->b:Z

    :goto_3
    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    iget v0, p0, Lab/i;->d:I

    if-ne v0, v2, :cond_9

    invoke-virtual {p1}, Led3/a;->a()I

    move-result v0

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Led3/a;->y()I

    move-result v0

    if-eqz v0, :cond_8

    iput-boolean v3, p0, Lab/i;->b:Z

    :cond_8
    iget v0, p0, Lab/i;->d:I

    sub-int/2addr v0, v2

    iput v0, p0, Lab/i;->d:I

    iget-boolean v0, p0, Lab/i;->b:Z

    :goto_4
    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    iget v0, p1, Led3/a;->b:I

    invoke-virtual {p1}, Led3/a;->a()I

    move-result v1

    iget-object v2, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v2, [Lwm/s;

    array-length v4, v2

    :goto_5
    if-ge v3, v4, :cond_a

    aget-object v5, v2, v3

    invoke-virtual {p1, v0}, Led3/a;->K(I)V

    invoke-interface {v5, v1, p1}, Lwm/s;->c(ILed3/a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    iget p1, p0, Lab/i;->e:I

    add-int/2addr p1, v1

    iput p1, p0, Lab/i;->e:I

    :cond_b
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lwm/k;Lab/l0;)V
    .locals 6

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lwm/k;->o(II)Lwm/s;

    move-result-object p1

    iput-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object p2, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iput-object p2, v0, Lrm/b0;->a:Ljava/lang/String;

    const-string p2, "application/id3"

    iput-object p2, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance p2, Lrm/c0;

    invoke-direct {p2, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {p1, p2}, Lwm/s;->a(Lrm/c0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v0, [Lwm/s;

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lab/i;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfn/y;

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lwm/k;->o(II)Lwm/s;

    move-result-object v3

    new-instance v4, Lrm/b0;

    invoke-direct {v4}, Lrm/b0;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v5, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iput-object v5, v4, Lrm/b0;->a:Ljava/lang/String;

    const-string v5, "application/dvbsubs"

    iput-object v5, v4, Lrm/b0;->k:Ljava/lang/String;

    iget-object v5, v2, Lfn/y;->b:[B

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iput-object v5, v4, Lrm/b0;->m:Ljava/util/List;

    iget-object v2, v2, Lfn/y;->a:Ljava/lang/String;

    iput-object v2, v4, Lrm/b0;->c:Ljava/lang/String;

    new-instance v2, Lrm/c0;

    invoke-direct {v2, v4}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v2}, Lwm/s;->a(Lrm/c0;)V

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 11

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v0, Lwm/s;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lab/i;->b:Z

    if-eqz v0, :cond_2

    iget v5, p0, Lab/i;->d:I

    if-eqz v5, :cond_2

    iget v0, p0, Lab/i;->e:I

    if-eq v0, v5, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lab/i;->c:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lab/i;->g:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwm/s;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    invoke-interface/range {v1 .. v7}, Lwm/s;->d(JIIILwm/r;)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/i;->b:Z

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lab/i;->b:Z

    if-eqz v0, :cond_4

    iget-wide v0, p0, Lab/i;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v0, [Lwm/s;

    array-length v2, v0

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    iget-wide v5, p0, Lab/i;->c:J

    iget v8, p0, Lab/i;->e:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x1

    invoke-interface/range {v4 .. v10}, Lwm/s;->d(JIIILwm/r;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iput-boolean v1, p0, Lab/i;->b:Z

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lt9/q;Lab/l0;)V
    .locals 6

    iget v0, p0, Lab/i;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v0, p2, Lab/l0;->e:I

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    iput-object p1, p0, Lab/i;->g:Ljava/lang/Object;

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object p2, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iput-object p2, v0, Lu8/o;->a:Ljava/lang/String;

    const-string p2, "video/mp2t"

    invoke-static {p2}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lu8/o;->l:Ljava/lang/String;

    const-string p2, "application/id3"

    invoke-static {p2}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, v0, Lu8/o;->m:Ljava/lang/String;

    invoke-static {v0, p1}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lab/i;->g:Ljava/lang/Object;

    check-cast v0, [Lt9/k0;

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lab/i;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab/k0;

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v3

    new-instance v4, Lu8/o;

    invoke-direct {v4}, Lu8/o;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v5, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iput-object v5, v4, Lu8/o;->a:Ljava/lang/String;

    const-string v5, "video/mp2t"

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->l:Ljava/lang/String;

    const-string v5, "application/dvbsubs"

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->m:Ljava/lang/String;

    iget-object v5, v2, Lab/k0;->b:[B

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    iput-object v5, v4, Lu8/o;->p:Ljava/util/List;

    iget-object v2, v2, Lab/k0;->a:Ljava/lang/String;

    iput-object v2, v4, Lu8/o;->d:Ljava/lang/String;

    invoke-static {v4, v3}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
