.class public abstract Lv63/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(J)V
    .locals 2

    sget-object v0, Ly3/o;->b:[Ly3/p;

    const-wide v0, 0xff00000000L

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    const-string p0, "Cannot perform operation for Unspecified type."

    invoke-static {p0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static final b(JJ)V
    .locals 6

    sget-object v0, Ly3/o;->b:[Ly3/p;

    const-wide v0, 0xff00000000L

    and-long v2, p0, v0

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    and-long/2addr v0, p2

    cmp-long v0, v0, v4

    if-nez v0, :cond_1

    :goto_0
    const-string v0, "Cannot perform operation for Unspecified type."

    invoke-static {v0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_1
    invoke-static {p0, p1}, Ly3/o;->b(J)J

    move-result-wide v0

    invoke-static {p2, p3}, Ly3/o;->b(J)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot perform operation for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ly3/o;->b(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Ly3/p;->b(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " and "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Ly3/o;->b(J)J

    move-result-wide p0

    invoke-static {p0, p1}, Ly3/p;->b(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static final f(D)J
    .locals 2

    const-wide v0, 0x200000000L

    double-to-float p0, p0

    invoke-static {p0, v0, v1}, Lv63/c;->j(FJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final g(D)J
    .locals 2

    const-wide v0, 0x100000000L

    double-to-float p0, p0

    invoke-static {p0, v0, v1}, Lv63/c;->j(FJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final h(I)J
    .locals 2

    const-wide v0, 0x100000000L

    int-to-float p0, p0

    invoke-static {p0, v0, v1}, Lv63/c;->j(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static i(Lc93/m;)Lxb3/j;
    .locals 1

    new-instance v0, Lxb3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v0, v0}, Lge3/g;->p(Lc93/m;Lq83/d;Lq83/d;)Lq83/d;

    move-result-object p0

    iput-object p0, v0, Lxb3/j;->z:Lq83/d;

    return-object v0
.end method

.method public static final j(FJ)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long p0, p1, v0

    sget-object p2, Ly3/o;->b:[Ly3/p;

    return-wide p0
.end method

.method public static final l(Lw63/a;[BII)V
    .locals 3

    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, Lio/seon/androidsdk/service/e1;->b:I

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v2, v1

    if-lt v2, p3, :cond_1

    const-string v2, "$this$copyTo"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/nio/Buffer;->isReadOnly()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {v2, v0, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    :goto_0
    invoke-virtual {p0, p3}, Lio/seon/androidsdk/service/e1;->d(I)V

    return-void

    :cond_1
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Not enough bytes to read a byte array of size "

    const/16 p2, 0x2e

    invoke-static {p1, p3, p2}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "Clip"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "Ellipsis"

    return-object p0

    :cond_1
    const/4 v0, 0x5

    if-ne p0, v0, :cond_2

    const-string p0, "MiddleEllipsis"

    return-object p0

    :cond_2
    const/4 v0, 0x3

    if-ne p0, v0, :cond_3

    const-string p0, "Visible"

    return-object p0

    :cond_3
    const/4 v0, 0x4

    if-ne p0, v0, :cond_4

    const-string p0, "StartEllipsis"

    return-object p0

    :cond_4
    const-string p0, "Invalid"

    return-object p0
.end method


# virtual methods
.method public abstract c(Lz2/h;)Z
.end method

.method public abstract d(Lj93/d;)Ljava/lang/Object;
.end method

.method public abstract e(Lz2/h;)Ljava/lang/Object;
.end method

.method public abstract k(Lj93/d;Ljava/lang/Object;)Lv63/c;
.end method
