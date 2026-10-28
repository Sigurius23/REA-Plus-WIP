.class public final Ld/d0;
.super Ld/b1;
.source "SourceFile"

# interfaces
.implements Ld/f;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Ld/q;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(IIILd/q;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p4, :cond_1

    if-eqz p2, :cond_0

    and-int/lit16 v0, p2, 0xc0

    if-ne v0, p2, :cond_0

    .line 3
    iput p1, p0, Ld/d0;->a:I

    iput p2, p0, Ld/d0;->b:I

    iput p3, p0, Ld/d0;->c:I

    iput-object p4, p0, Ld/d0;->d:Ld/q;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "invalid tag class: "

    .line 4
    invoke-static {p2, p3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "\'obj\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IIILd/q;I)V
    .locals 0

    .line 1
    iput p5, p0, Ld/d0;->e:I

    invoke-direct {p0, p1, p2, p3, p4}, Ld/d0;-><init>(IIILd/q;)V

    return-void
.end method

.method public constructor <init>(ZILd/b1;I)V
    .locals 0

    iput p4, p0, Ld/d0;->e:I

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    const/16 p4, 0x80

    .line 10
    invoke-direct {p0, p1, p4, p2, p3}, Ld/d0;-><init>(IIILd/q;)V

    return-void
.end method


# virtual methods
.method public final b()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final c(Z)I
    .locals 5

    iget v0, p0, Ld/d0;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->k()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Ld/b1;->c(Z)I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    move v1, v0

    move v4, v2

    :goto_0
    ushr-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/2addr v0, v4

    :cond_2
    if-eqz p1, :cond_5

    const/16 p1, 0x1f

    iget v1, p0, Ld/d0;->c:I

    if-ge v1, p1, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    ushr-int/lit8 v1, v1, 0x7

    if-eqz v1, :cond_4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    add-int/2addr v0, v3

    return v0

    :pswitch_0
    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Ld/b1;->c(Z)I

    move-result v0

    if-eqz v1, :cond_6

    add-int/lit8 v0, v0, 0x3

    :cond_6
    if-eqz p1, :cond_8

    const/16 p1, 0x1f

    iget v1, p0, Ld/d0;->c:I

    if-ge v1, p1, :cond_7

    const/4 p1, 0x1

    goto :goto_5

    :cond_7
    const/4 p1, 0x2

    :goto_4
    ushr-int/lit8 v1, v1, 0x7

    if-eqz v1, :cond_9

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_8
    const/4 p1, 0x0

    :cond_9
    :goto_5
    add-int/2addr v0, p1

    return v0

    :pswitch_1
    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->j()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    invoke-virtual {v0, v1}, Ld/b1;->c(Z)I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_c

    const/16 v1, 0x80

    if-ge v0, v1, :cond_a

    move v4, v3

    goto :goto_7

    :cond_a
    move v1, v0

    move v4, v2

    :goto_6
    ushr-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_b

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_b
    :goto_7
    add-int/2addr v0, v4

    :cond_c
    if-eqz p1, :cond_f

    const/16 p1, 0x1f

    iget v1, p0, Ld/d0;->c:I

    if-ge v1, p1, :cond_d

    goto :goto_9

    :cond_d
    :goto_8
    ushr-int/lit8 v1, v1, 0x7

    if-eqz v1, :cond_e

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_e
    move v3, v2

    goto :goto_9

    :cond_f
    const/4 v3, 0x0

    :goto_9
    add-int/2addr v0, v3

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lro/i;Z)V
    .locals 3

    iget v0, p0, Ld/d0;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->k()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    if-eqz p2, :cond_2

    iget p2, p0, Ld/d0;->b:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    or-int/lit8 p2, p2, 0x20

    :cond_1
    iget v2, p0, Ld/d0;->c:I

    invoke-virtual {p1, p2, v2}, Lro/i;->e(II)V

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Ld/b1;->c(Z)I

    move-result p2

    invoke-virtual {p1, p2}, Lro/i;->d(I)V

    :cond_3
    invoke-virtual {p1}, Lro/i;->l()Ld/z0;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Ld/b1;->f(Lro/i;Z)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    if-eqz p2, :cond_6

    iget p2, p0, Ld/d0;->b:I

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    or-int/lit8 p2, p2, 0x20

    :cond_5
    iget v2, p0, Ld/d0;->c:I

    invoke-virtual {p1, p2, v2}, Lro/i;->e(II)V

    :cond_6
    const/4 p2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x80

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Ld/b1;->f(Lro/i;Z)V

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    :cond_7
    invoke-virtual {v0, p1, p2}, Ld/b1;->f(Lro/i;Z)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->j()Ld/b1;

    move-result-object v0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    if-eqz p2, :cond_a

    iget p2, p0, Ld/d0;->b:I

    if-nez v1, :cond_8

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    or-int/lit8 p2, p2, 0x20

    :cond_9
    iget v2, p0, Ld/d0;->c:I

    invoke-virtual {p1, p2, v2}, Lro/i;->e(II)V

    :cond_a
    if-eqz v1, :cond_b

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Ld/b1;->c(Z)I

    move-result p2

    invoke-virtual {p1, p2}, Lro/i;->d(I)V

    :cond_b
    invoke-virtual {p1}, Lro/i;->c()Ld/r;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Ld/b1;->f(Lro/i;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ld/b1;)Z
    .locals 5

    instance-of v0, p1, Ld/d0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ld/d0;

    iget v0, p0, Ld/d0;->c:I

    iget v1, p1, Ld/d0;->c:I

    if-ne v0, v1, :cond_5

    iget v0, p0, Ld/d0;->b:I

    iget v1, p1, Ld/d0;->b:I

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Ld/d0;->a:I

    iget v1, p1, Ld/d0;->a:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v0

    invoke-virtual {p1}, Ld/d0;->l()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    iget-object v1, p1, Ld/d0;->d:Ld/q;

    invoke-interface {v1}, Ld/q;->d()Ld/b1;

    move-result-object v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v3

    if-nez v3, :cond_4

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Lro/i;

    const/16 v3, 0x13

    invoke-direct {v1, v0, v3}, Lro/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v1, v2}, Ld/b1;->f(Lro/i;Z)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v3, Lro/i;

    const/16 v4, 0x13

    invoke-direct {v3, v1, v4}, Lro/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v3, v2}, Ld/b1;->f(Lro/i;Z)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :cond_4
    invoke-virtual {v0, v1}, Ld/b1;->g(Ld/b1;)Z

    move-result p1

    return p1

    :catch_0
    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h()Z
    .locals 1

    iget v0, p0, Ld/d0;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->k()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :pswitch_0
    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v0, 0x1

    :goto_3
    return v0

    :pswitch_1
    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->j()Ld/b1;

    move-result-object v0

    invoke-virtual {v0}, Ld/b1;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v0, 0x1

    :goto_5
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ld/d0;->b:I

    mul-int/lit16 v0, v0, 0x1eef

    iget v1, p0, Ld/d0;->c:I

    xor-int/2addr v0, v1

    invoke-virtual {p0}, Ld/d0;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xf

    goto :goto_0

    :cond_0
    const/16 v1, 0xf0

    :goto_0
    xor-int/2addr v0, v1

    iget-object v1, p0, Ld/d0;->d:Ld/q;

    invoke-interface {v1}, Ld/q;->d()Ld/b1;

    move-result-object v1

    invoke-virtual {v1}, Ld/b1;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public j()Ld/b1;
    .locals 7

    iget v0, p0, Ld/d0;->e:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld/d0;

    iget-object v5, p0, Ld/d0;->d:Ld/q;

    const/4 v6, 0x0

    iget v2, p0, Ld/d0;->a:I

    iget v3, p0, Ld/d0;->b:I

    iget v4, p0, Ld/d0;->c:I

    invoke-direct/range {v1 .. v6}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v1

    :pswitch_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public k()Ld/b1;
    .locals 7

    iget v0, p0, Ld/d0;->e:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v1, Ld/d0;

    iget-object v5, p0, Ld/d0;->d:Ld/q;

    const/4 v6, 0x2

    iget v2, p0, Ld/d0;->a:I

    iget v3, p0, Ld/d0;->b:I

    iget v4, p0, Ld/d0;->c:I

    invoke-direct/range {v1 .. v6}, Ld/d0;-><init>(IIILd/q;I)V

    return-object v1

    :pswitch_1
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final l()Z
    .locals 3

    iget v0, p0, Ld/d0;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ld/d0;->b:I

    iget v2, p0, Ld/d0;->c:I

    invoke-static {v1, v2}, Lx30/s0;->h(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld/d0;->d:Ld/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
