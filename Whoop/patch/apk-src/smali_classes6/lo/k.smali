.class public final Llo/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:[J


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Llo/k;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-array p1, p1, [J

    iput-object p1, p0, Llo/k;->c:[J

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    iput p1, p0, Llo/k;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x20

    .line 2
    new-array p1, p1, [J

    iput-object p1, p0, Llo/k;->c:[J

    return-void

    :pswitch_0
    const/16 p1, 0x20

    .line 3
    invoke-direct {p0, p1}, Llo/k;-><init>(I)V

    return-void

    .line 4
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x2

    .line 5
    new-array p1, p1, [J

    iput-object p1, p0, Llo/k;->c:[J

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    iget v0, p0, Llo/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Llo/k;->b:I

    iget-object v1, p0, Llo/k;->c:[J

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Llo/k;->c:[J

    :cond_0
    iget-object v0, p0, Llo/k;->c:[J

    iget v1, p0, Llo/k;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Llo/k;->b:I

    aput-wide p1, v0, v1

    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Llo/k;->d(J)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Llo/k;->b:I

    iget-object v1, p0, Llo/k;->c:[J

    array-length v2, v1

    if-lt v0, v2, :cond_1

    add-int/lit8 v2, v0, 0x1

    array-length v3, v1

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Llo/k;->c:[J

    :cond_1
    aput-wide p1, v1, v0

    iget p1, p0, Llo/k;->b:I

    if-lt v0, p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Llo/k;->b:I

    :cond_2
    return-void

    :pswitch_1
    iget v0, p0, Llo/k;->b:I

    iget-object v1, p0, Llo/k;->c:[J

    array-length v2, v1

    if-ne v0, v2, :cond_3

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Llo/k;->c:[J

    :cond_3
    iget-object v0, p0, Llo/k;->c:[J

    iget v1, p0, Llo/k;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Llo/k;->b:I

    aput-wide p1, v0, v1

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b([J)V
    .locals 5

    iget v0, p0, Llo/k;->b:I

    array-length v1, p1

    add-int/2addr v0, v1

    iget-object v1, p0, Llo/k;->c:[J

    array-length v2, v1

    if-le v0, v2, :cond_0

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iput-object v1, p0, Llo/k;->c:[J

    :cond_0
    iget-object v1, p0, Llo/k;->c:[J

    iget v2, p0, Llo/k;->b:I

    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Llo/k;->b:I

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Llo/k;->b:I

    return-void
.end method

.method public d(J)Z
    .locals 5

    iget v0, p0, Llo/k;->b:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Llo/k;->c:[J

    aget-wide v3, v3, v2

    cmp-long v3, v3, p1

    if-nez v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public e(I)J
    .locals 4

    iget v0, p0, Llo/k;->a:I

    packed-switch v0, :pswitch_data_0

    if-ltz p1, :cond_0

    iget v0, p0, Llo/k;->b:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Llo/k;->c:[J

    aget-wide v0, v0, p1

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Invalid index "

    const-string v2, ", size is "

    invoke-static {p1, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v1, p0, Llo/k;->b:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-ltz p1, :cond_1

    iget v0, p0, Llo/k;->b:I

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Llo/k;->c:[J

    aget-wide v0, v0, p1

    return-wide v0

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    iget v1, p0, Llo/k;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Invalid index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size is "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(I)J
    .locals 2

    iget-object v0, p0, Llo/k;->c:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Llo/k;->b:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget v0, p0, Llo/k;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i(J)V
    .locals 4

    iget v0, p0, Llo/k;->b:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Llo/k;->c:[J

    aget-wide v2, v2, v1

    cmp-long v2, p1, v2

    if-nez v2, :cond_1

    iget p1, p0, Llo/k;->b:I

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ge v1, p1, :cond_0

    iget-object p2, p0, Llo/k;->c:[J

    add-int/lit8 v0, v1, 0x1

    aget-wide v2, p2, v0

    aput-wide v2, p2, v1

    move v1, v0

    goto :goto_1

    :cond_0
    iget p1, p0, Llo/k;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Llo/k;->b:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public j(I)V
    .locals 5

    iget v0, p0, Llo/k;->b:I

    if-ge p1, v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ge p1, v0, :cond_0

    iget-object v1, p0, Llo/k;->c:[J

    add-int/lit8 v2, p1, 0x1

    aget-wide v3, v1, v2

    aput-wide v3, v1, p1

    move p1, v2

    goto :goto_0

    :cond_0
    iget p1, p0, Llo/k;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Llo/k;->b:I

    :cond_1
    return-void
.end method
