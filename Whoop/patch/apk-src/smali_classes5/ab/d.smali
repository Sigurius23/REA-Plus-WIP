.class public final Lab/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final a:Lab/c;

.field public final b:Lx8/n;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lab/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "audio/ac4"

    invoke-direct {v0, v3, v1, v4, v2}, Lab/c;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    iput-object v0, p0, Lab/d;->a:Lab/c;

    new-instance v0, Lx8/n;

    const/16 v1, 0x4000

    invoke-direct {v0, v1}, Lx8/n;-><init>(I)V

    iput-object v0, p0, Lab/d;->b:Lx8/n;

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lab/d;->c:Z

    iget-object p1, p0, Lab/d;->a:Lab/c;

    invoke-virtual {p1}, Lab/c;->a()V

    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 5

    new-instance v0, Lab/l0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lab/l0;-><init>(IIIB)V

    iget-object v1, p0, Lab/d;->a:Lab/c;

    invoke-virtual {v1, p1, v0}, Lab/c;->i(Lt9/q;Lab/l0;)V

    invoke-interface {p1}, Lt9/q;->l()V

    new-instance v0, Lt9/t;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lt9/t;-><init>(J)V

    invoke-interface {p1, v0}, Lt9/q;->v(Lt9/e0;)V

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 14

    new-instance v0, Lx8/n;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lx8/n;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v4, v0, Lx8/n;->a:[B

    move-object v5, p1

    check-cast v5, Lt9/k;

    invoke-virtual {v5, v4, v2, v1, v2}, Lt9/k;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Lx8/n;->F(I)V

    invoke-virtual {v0}, Lx8/n;->w()I

    move-result v4

    const v6, 0x494433

    const/4 v7, 0x3

    if-eq v4, v6, :cond_7

    iput v2, v5, Lt9/k;->F:I

    invoke-virtual {v5, v3, v2}, Lt9/k;->C(IZ)Z

    move p1, v2

    move v1, v3

    :goto_1
    iget-object v4, v0, Lx8/n;->a:[B

    const/4 v6, 0x7

    invoke-virtual {v5, v4, v2, v6, v2}, Lt9/k;->c([BIIZ)Z

    invoke-virtual {v0, v2}, Lx8/n;->F(I)V

    invoke-virtual {v0}, Lx8/n;->z()I

    move-result v4

    const v8, 0xac40

    const v9, 0xac41

    if-eq v4, v8, :cond_1

    if-eq v4, v9, :cond_1

    iput v2, v5, Lt9/k;->F:I

    add-int/lit8 v1, v1, 0x1

    sub-int p1, v1, v3

    const/16 v4, 0x2000

    if-lt p1, v4, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {v5, v1, v2}, Lt9/k;->C(IZ)Z

    move p1, v2

    goto :goto_1

    :cond_1
    const/4 v8, 0x1

    add-int/2addr p1, v8

    const/4 v10, 0x4

    if-lt p1, v10, :cond_2

    return v8

    :cond_2
    iget-object v8, v0, Lx8/n;->a:[B

    array-length v11, v8

    const/4 v12, -0x1

    if-ge v11, v6, :cond_3

    move v11, v12

    goto :goto_3

    :cond_3
    const/4 v11, 0x2

    aget-byte v11, v8, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    aget-byte v13, v8, v7

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v11, v13

    const v13, 0xffff

    if-ne v11, v13, :cond_4

    aget-byte v10, v8, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x10

    const/4 v11, 0x5

    aget-byte v11, v8, v11

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x8

    or-int/2addr v10, v11

    const/4 v11, 0x6

    aget-byte v8, v8, v11

    and-int/lit16 v8, v8, 0xff

    or-int v11, v10, v8

    goto :goto_2

    :cond_4
    move v6, v10

    :goto_2
    if-ne v4, v9, :cond_5

    add-int/lit8 v6, v6, 0x2

    :cond_5
    add-int/2addr v11, v6

    :goto_3
    if-ne v11, v12, :cond_6

    :goto_4
    return v2

    :cond_6
    add-int/lit8 v11, v11, -0x7

    invoke-virtual {v5, v11, v2}, Lt9/k;->C(IZ)Z

    goto :goto_1

    :cond_7
    invoke-virtual {v0, v7}, Lx8/n;->G(I)V

    invoke-virtual {v0}, Lx8/n;->s()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    invoke-virtual {v5, v4, v2}, Lt9/k;->C(IZ)Z

    goto/16 :goto_0
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 5

    iget-object p2, p0, Lab/d;->b:Lx8/n;

    iget-object v0, p2, Lx8/n;->a:[B

    const/16 v1, 0x4000

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lu8/h;->read([BII)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p2, v2}, Lx8/n;->F(I)V

    invoke-virtual {p2, p1}, Lx8/n;->E(I)V

    iget-boolean p1, p0, Lab/d;->c:Z

    iget-object v0, p0, Lab/d;->a:Lab/c;

    if-nez p1, :cond_1

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lab/c;->o:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lab/d;->c:Z

    :cond_1
    invoke-virtual {v0, p2}, Lab/c;->c(Lx8/n;)V

    return v2
.end method

.method public final release()V
    .locals 0

    return-void
.end method
