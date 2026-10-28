.class public final Lmp/s0;
.super Lmp/t0;
.source "SourceFile"


# instance fields
.field public final E:I

.field public final z:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lmp/t0;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lmp/t0;->j(III)I

    iput p2, p0, Lmp/s0;->z:I

    iput p3, p0, Lmp/s0;->E:I

    return-void
.end method


# virtual methods
.method public final a(I)B
    .locals 4

    add-int/lit8 v0, p1, 0x1

    iget v1, p0, Lmp/s0;->E:I

    sub-int v0, v1, v0

    or-int/2addr v0, p1

    if-gez v0, :cond_1

    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    if-gez p1, :cond_0

    const-string v1, "Index < 0: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v2, "Index > length: "

    const-string v3, ", "

    invoke-static {p1, v1, v2, v3}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lmp/s0;->z:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lmp/t0;->x:[B

    aget-byte p1, p1, v0

    return p1
.end method

.method public final c(I)B
    .locals 2

    iget-object v0, p0, Lmp/t0;->x:[B

    iget v1, p0, Lmp/s0;->z:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lmp/s0;->z:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lmp/s0;->E:I

    return v0
.end method

.method public final f(I[B)V
    .locals 3

    iget v0, p0, Lmp/s0;->z:I

    const/4 v1, 0x0

    iget-object v2, p0, Lmp/t0;->x:[B

    invoke-static {v2, v0, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method
