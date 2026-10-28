.class public abstract Lio/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/o;


# instance fields
.field public final a:Lsn/w0;

.field public final b:I

.field public final c:[I

.field public final d:[Lrm/c0;

.field public final e:[J

.field public f:I


# direct methods
.method public constructor <init>(Lsn/w0;[I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lio/c;->a:Lsn/w0;

    array-length v0, p2

    iput v0, p0, Lio/c;->b:I

    new-array v0, v0, [Lrm/c0;

    iput-object v0, p0, Lio/c;->d:[Lrm/c0;

    move v0, v1

    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lio/c;->d:[Lrm/c0;

    aget v3, p2, v0

    iget-object v4, p1, Lsn/w0;->y:[Lrm/c0;

    aget-object v3, v4, v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lio/c;->d:[Lrm/c0;

    new-instance v0, Ldb/k0;

    const/4 v2, 0x7

    invoke-direct {v0, v2}, Ldb/k0;-><init>(I)V

    invoke-static {p2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    iget p2, p0, Lio/c;->b:I

    new-array p2, p2, [I

    iput-object p2, p0, Lio/c;->c:[I

    :goto_2
    iget p2, p0, Lio/c;->b:I

    if-ge v1, p2, :cond_2

    iget-object p2, p0, Lio/c;->c:[I

    iget-object v0, p0, Lio/c;->d:[Lrm/c0;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lsn/w0;->a(Lrm/c0;)I

    move-result v0

    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    new-array p1, p2, [J

    iput-object p1, p0, Lio/c;->e:[J

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public final d(I)Lrm/c0;
    .locals 1

    iget-object v0, p0, Lio/c;->d:[Lrm/c0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e(I)I
    .locals 1

    iget-object v0, p0, Lio/c;->c:[I

    aget p1, v0, p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lio/c;

    iget-object v2, p0, Lio/c;->a:Lsn/w0;

    iget-object v3, p1, Lio/c;->a:Lsn/w0;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/c;->c:[I

    iget-object p1, p1, Lio/c;->c:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public f(F)V
    .locals 0

    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lio/c;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/c;->a:Lsn/w0;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/c;->c:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lio/c;->f:I

    :cond_0
    iget v0, p0, Lio/c;->f:I

    return v0
.end method

.method public final i(I)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lio/c;->b:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lio/c;->c:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final j()Lsn/w0;
    .locals 1

    iget-object v0, p0, Lio/c;->a:Lsn/w0;

    return-object v0
.end method

.method public l(JLjava/util/List;)I
    .locals 0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 1

    iget-object v0, p0, Lio/c;->c:[I

    array-length v0, v0

    return v0
.end method

.method public final m()I
    .locals 2

    iget-object v0, p0, Lio/c;->c:[I

    invoke-interface {p0}, Lio/o;->c()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public final n()Lrm/c0;
    .locals 2

    iget-object v0, p0, Lio/c;->d:[Lrm/c0;

    invoke-interface {p0}, Lio/o;->c()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final r(IJ)Z
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lio/c;->s(IJ)Z

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget v5, p0, Lio/c;->b:I

    const/4 v6, 0x1

    if-ge v4, v5, :cond_1

    if-nez v2, :cond_1

    if-eq v4, p1, :cond_0

    invoke-virtual {p0, v4, v0, v1}, Lio/c;->s(IJ)Z

    move-result v2

    if-nez v2, :cond_0

    move v2, v6

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return v3

    :cond_2
    iget-object v2, p0, Lio/c;->e:[J

    aget-wide v3, v2, p1

    sget v5, Llo/y;->a:I

    add-long v7, v0, p2

    xor-long/2addr v0, v7

    xor-long/2addr p2, v7

    and-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-gez p2, :cond_3

    const-wide v7, 0x7fffffffffffffffL

    :cond_3
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    aput-wide p2, v2, p1

    return v6
.end method

.method public final s(IJ)Z
    .locals 2

    iget-object v0, p0, Lio/c;->e:[J

    aget-wide v0, v0, p1

    cmp-long p1, v0, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
