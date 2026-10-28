.class public final Lcom/squareup/wire/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[B


# instance fields
.field public a:Lne3/h;

.field public b:Lne3/h;

.field public final c:Lne3/f;

.field public d:[B

.field public e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/squareup/wire/v;->g:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/squareup/wire/v;->a:Lne3/h;

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    new-instance v0, Lne3/f;

    invoke-direct {v0}, Lne3/f;-><init>()V

    iput-object v0, p0, Lcom/squareup/wire/v;->c:Lne3/f;

    sget-object v0, Lcom/squareup/wire/v;->g:[B

    iput-object v0, p0, Lcom/squareup/wire/v;->d:[B

    sget-object v0, Ll83/i;->y:Ll83/i;

    sget-object v1, Lcom/squareup/wire/u;->w:Lcom/squareup/wire/u;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/squareup/wire/v;->f:Ljava/lang/Object;

    new-instance v1, Lav/b;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/squareup/wire/v;->d:[B

    sget-object v1, Lcom/squareup/wire/v;->g:[B

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/squareup/wire/v;->c:Lne3/f;

    invoke-virtual {v0}, Lne3/f;->close()V

    iget-object v0, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    iget v2, p0, Lcom/squareup/wire/v;->e:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Lne3/h;->skip(J)V

    iget-object v0, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    iget-object v2, p0, Lcom/squareup/wire/v;->a:Lne3/h;

    invoke-virtual {v0, v2}, Lne3/h;->N0(Lne3/p0;)J

    iget-object v0, p0, Lcom/squareup/wire/v;->a:Lne3/h;

    iget-object v2, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    iput-object v2, p0, Lcom/squareup/wire/v;->a:Lne3/h;

    iput-object v0, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    iput-object v1, p0, Lcom/squareup/wire/v;->d:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/wire/v;->e:I

    return-void
.end method

.method public final b()I
    .locals 3

    iget-object v0, p0, Lcom/squareup/wire/v;->a:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    long-to-int v0, v0

    iget-object v1, p0, Lcom/squareup/wire/v;->d:[B

    array-length v1, v1

    iget v2, p0, Lcom/squareup/wire/v;->e:I

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final c(I)V
    .locals 8

    iget v0, p0, Lcom/squareup/wire/v;->e:I

    if-lt v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/squareup/wire/v;->a()V

    iget-object v0, p0, Lcom/squareup/wire/v;->b:Lne3/h;

    iget-object v1, p0, Lcom/squareup/wire/v;->c:Lne3/f;

    invoke-virtual {v0, v1}, Lne3/h;->a0(Lne3/f;)Lne3/f;

    if-lez p1, :cond_5

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_4

    iget-object v2, v1, Lne3/f;->w:Lne3/h;

    if-eqz v2, :cond_3

    iget-boolean v3, v1, Lne3/f;->x:Z

    if-eqz v3, :cond_2

    iget-wide v3, v2, Lne3/h;->x:J

    invoke-virtual {v2, p1}, Lne3/h;->k1(I)Lne3/k0;

    move-result-object p1

    iget v5, p1, Lne3/k0;->c:I

    rsub-int v5, v5, 0x2000

    iput v0, p1, Lne3/k0;->c:I

    int-to-long v6, v5

    add-long/2addr v6, v3

    iput-wide v6, v2, Lne3/h;->x:J

    iput-object p1, v1, Lne3/f;->y:Lne3/k0;

    iput-wide v3, v1, Lne3/f;->z:J

    iget-object p1, p1, Lne3/k0;->a:[B

    iput-object p1, v1, Lne3/f;->E:[B

    rsub-int v2, v5, 0x2000

    iput v2, v1, Lne3/f;->F:I

    iput v0, v1, Lne3/f;->G:I

    const-wide/16 v5, 0x0

    cmp-long v2, v3, v5

    if-nez v2, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length p1, p1

    if-ne v0, p1, :cond_1

    iget-object p1, v1, Lne3/f;->E:[B

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/squareup/wire/v;->d:[B

    iget p1, v1, Lne3/f;->G:I

    iput p1, p0, Lcom/squareup/wire/v;->e:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "expandBuffer() only permitted for read/write buffers"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "not attached to a buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string v0, "minByteCount > Segment.SIZE: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const-string v0, "minByteCount <= 0: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Lne3/l;)V
    .locals 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result v0

    :goto_0
    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/squareup/wire/v;->c(I)V

    iget v1, p0, Lcom/squareup/wire/v;->e:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, Lcom/squareup/wire/v;->e:I

    sub-int/2addr v2, v1

    iput v2, p0, Lcom/squareup/wire/v;->e:I

    sub-int/2addr v0, v1

    iget-object v3, p0, Lcom/squareup/wire/v;->d:[B

    invoke-virtual {p1, v0, v2, v1, v3}, Lne3/l;->b(III[B)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(I)V
    .locals 5

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/squareup/wire/v;->c(I)V

    iget v0, p0, Lcom/squareup/wire/v;->e:I

    add-int/lit8 v1, v0, -0x4

    iput v1, p0, Lcom/squareup/wire/v;->e:I

    iget-object v2, p0, Lcom/squareup/wire/v;->d:[B

    add-int/lit8 v3, v0, -0x3

    and-int/lit16 v4, p1, 0xff

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    add-int/lit8 v1, v0, -0x2

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v0, v0, -0x1

    ushr-int/lit8 v3, p1, 0x10

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v2, v1

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v2, v0

    return-void
.end method

.method public final f(J)V
    .locals 9

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/squareup/wire/v;->c(I)V

    iget v1, p0, Lcom/squareup/wire/v;->e:I

    add-int/lit8 v2, v1, -0x8

    iput v2, p0, Lcom/squareup/wire/v;->e:I

    iget-object v3, p0, Lcom/squareup/wire/v;->d:[B

    add-int/lit8 v4, v1, -0x7

    const-wide/16 v5, 0xff

    and-long v7, p1, v5

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v3, v2

    add-int/lit8 v2, v1, -0x6

    ushr-long v7, p1, v0

    and-long/2addr v7, v5

    long-to-int v0, v7

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    add-int/lit8 v0, v1, -0x5

    const/16 v4, 0x10

    ushr-long v7, p1, v4

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    add-int/lit8 v2, v1, -0x4

    const/16 v4, 0x18

    ushr-long v7, p1, v4

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    add-int/lit8 v0, v1, -0x3

    const/16 v4, 0x20

    ushr-long v7, p1, v4

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    add-int/lit8 v2, v1, -0x2

    const/16 v4, 0x28

    ushr-long v7, p1, v4

    and-long/2addr v7, v5

    long-to-int v4, v7

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    add-int/lit8 v1, v1, -0x1

    const/16 v0, 0x30

    ushr-long v7, p1, v0

    and-long/2addr v7, v5

    long-to-int v0, v7

    int-to-byte v0, v0

    aput-byte v0, v3, v2

    const/16 v0, 0x38

    ushr-long/2addr p1, v0

    and-long/2addr p1, v5

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v3, v1

    return-void
.end method

.method public final g(ILcom/squareup/wire/d;)V
    .locals 1

    const-string v0, "fieldEncoding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    shl-int/lit8 p1, p1, 0x3

    iget p2, p2, Lcom/squareup/wire/d;->w:I

    or-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lcom/squareup/wire/v;->h(I)V

    return-void
.end method

.method public final h(I)V
    .locals 4

    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p1

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p1

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    :goto_0
    invoke-virtual {p0, v0}, Lcom/squareup/wire/v;->c(I)V

    iget v1, p0, Lcom/squareup/wire/v;->e:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/v;->e:I

    :goto_1
    and-int/lit8 v0, p1, -0x80

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/squareup/wire/v;->d:[B

    add-int/lit8 v2, v1, 0x1

    and-int/lit8 v3, p1, 0x7f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    ushr-int/lit8 p1, p1, 0x7

    move v1, v2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/squareup/wire/v;->d:[B

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public final i(J)V
    .locals 7

    invoke-static {p1, p2}, Lvd/e;->n0(J)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/squareup/wire/v;->c(I)V

    iget v1, p0, Lcom/squareup/wire/v;->e:I

    sub-int/2addr v1, v0

    iput v1, p0, Lcom/squareup/wire/v;->e:I

    :goto_0
    const-wide/16 v2, -0x80

    and-long/2addr v2, p1

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/squareup/wire/v;->d:[B

    add-int/lit8 v2, v1, 0x1

    const-wide/16 v3, 0x7f

    and-long/2addr v3, p1

    const-wide/16 v5, 0x80

    or-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/squareup/wire/v;->d:[B

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method
