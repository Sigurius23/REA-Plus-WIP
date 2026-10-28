.class public final Ld/o0;
.super Ld/g;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>([BI)V
    .locals 0

    iput p2, p0, Ld/o0;->d:I

    invoke-direct {p0, p1}, Ld/g;-><init>([B)V

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget v0, p0, Ld/o0;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld/g;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ld/g;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lro/i;Z)V
    .locals 7

    iget v0, p0, Ld/o0;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld/g;->a:[B

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    const/16 v3, 0xff

    and-int/2addr v2, v3

    array-length v4, v0

    add-int/lit8 v5, v4, -0x1

    aget-byte v6, v0, v5

    shl-int v2, v3, v2

    and-int/2addr v2, v6

    int-to-byte v2, v2

    const/4 v3, 0x3

    if-ne v6, v2, :cond_0

    invoke-virtual {p1, v3, p2, v0}, Lro/i;->f(IZ[B)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v3, p2}, Lro/i;->n(IZ)V

    iget-object p2, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v4}, Lro/i;->d(I)V

    invoke-virtual {p2, v0, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write(I)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Ld/g;->a:[B

    const/4 v1, 0x3

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Z
    .locals 1

    iget v0, p0, Ld/o0;->d:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ld/b1;
    .locals 1

    iget v0, p0, Ld/o0;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ld/g;->j()Ld/b1;

    move-result-object v0

    return-object v0

    :pswitch_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Ld/b1;
    .locals 1

    iget v0, p0, Ld/o0;->d:I

    return-object p0
.end method
