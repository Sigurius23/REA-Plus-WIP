.class public final Ld/u0;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:Ld/s0;

.field public final b:Ld/j0;

.field public final c:Ld/b1;

.field public final d:I

.field public final e:Ld/b1;

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Ld/s0;Ld/j0;Ld/b1;ILd/b1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld/u0;->f:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Ld/u0;->a:Ld/s0;

    iput-object p2, p0, Ld/u0;->b:Ld/j0;

    iput-object p3, p0, Ld/u0;->c:Ld/b1;

    if-ltz p4, :cond_4

    const/4 p1, 0x2

    if-gt p4, p1, :cond_4

    iput p4, p0, Ld/u0;->d:I

    const/4 p2, 0x1

    .line 22
    const-string p3, "unexpected object: "

    if-eq p4, p2, :cond_2

    if-eq p4, p1, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    const-class p1, Ld/g;

    invoke-virtual {p1, p5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_2
    const-class p1, Ld/x0;

    invoke-virtual {p1, p5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 25
    :goto_0
    iput-object p5, p0, Ld/u0;->e:Ld/b1;

    return-void

    .line 26
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid encoding value: "

    .line 28
    invoke-static {p4, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ld/x;)V
    .locals 5

    const/4 v0, 0x0

    iput v0, p0, Ld/u0;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1, v0}, Ld/u0;->l(Ld/x;I)Ld/b1;

    move-result-object v1

    instance-of v2, v1, Ld/s0;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    check-cast v1, Ld/s0;

    iput-object v1, p0, Ld/u0;->a:Ld/s0;

    invoke-static {p1, v3}, Ld/u0;->l(Ld/x;I)Ld/b1;

    move-result-object v1

    move v0, v3

    :cond_0
    instance-of v2, v1, Ld/j0;

    if-eqz v2, :cond_1

    check-cast v1, Ld/j0;

    iput-object v1, p0, Ld/u0;->b:Ld/j0;

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ld/u0;->l(Ld/x;I)Ld/b1;

    move-result-object v1

    :cond_1
    instance-of v2, v1, Ld/d0;

    if-nez v2, :cond_2

    iput-object v1, p0, Ld/u0;->c:Ld/b1;

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ld/u0;->l(Ld/x;I)Ld/b1;

    move-result-object v1

    .line 3
    :cond_2
    iget-object p1, p1, Ld/h1;->a:[Ld/q;

    array-length p1, p1

    add-int/2addr v0, v3

    if-ne p1, v0, :cond_e

    .line 4
    instance-of p1, v1, Ld/d0;

    if-eqz p1, :cond_d

    check-cast v1, Ld/d0;

    iget p1, v1, Ld/d0;->b:I

    iget v0, v1, Ld/d0;->c:I

    if-ltz v0, :cond_c

    const/4 v2, 0x2

    if-gt v0, v2, :cond_c

    iput v0, p0, Ld/u0;->d:I

    const/16 v4, 0x80

    if-ne p1, v4, :cond_8

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    if-ne v0, v2, :cond_3

    .line 5
    sget-object p1, Ld/g;->b:Ld/d;

    invoke-virtual {p1, v1}, La2/a;->d(Ld/d0;)Ld/b1;

    move-result-object p1

    check-cast p1, Ld/g;

    goto :goto_1

    .line 6
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid tag: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-static {p1, v0}, Lx30/s0;->h(II)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_4
    sget-object p1, Ld/x0;->b:Ld/d;

    invoke-virtual {p1, v1}, La2/a;->d(Ld/d0;)Ld/b1;

    move-result-object p1

    check-cast p1, Ld/x0;

    goto :goto_1

    .line 10
    :cond_5
    invoke-virtual {v1}, Ld/d0;->l()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, v1, Ld/d0;->d:Ld/q;

    instance-of v0, p1, Ld/b1;

    if-eqz v0, :cond_6

    check-cast p1, Ld/b1;

    goto :goto_0

    :cond_6
    invoke-interface {p1}, Ld/q;->d()Ld/b1;

    move-result-object p1

    .line 11
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    :goto_1
    iput-object p1, p0, Ld/u0;->e:Ld/b1;

    return-void

    .line 13
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "object implicit - explicit expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const/16 v0, 0x40

    if-eq p1, v0, :cond_b

    if-eq p1, v4, :cond_a

    const/16 v0, 0xc0

    if-eq p1, v0, :cond_9

    .line 14
    const-string p1, "UNIVERSAL"

    goto :goto_2

    :cond_9
    const-string p1, "PRIVATE"

    goto :goto_2

    :cond_a
    const-string p1, "CONTEXT"

    goto :goto_2

    :cond_b
    const-string p1, "APPLICATION"

    .line 15
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected CONTEXT tag but found "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 16
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid encoding value: "

    .line 17
    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No tagged object found in sequence. Structure doesn\'t seem to be of type External"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "input sequence too large"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Ld/x;I)Ld/b1;
    .locals 1

    iget-object p0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, p0

    if-le v0, p1, :cond_0

    aget-object p0, p0, p1

    invoke-interface {p0}, Ld/q;->d()Ld/b1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "too few objects in input sequence"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    invoke-virtual {p0}, Ld/u0;->m()Ld/h1;

    move-result-object v0

    invoke-virtual {v0, p1}, Ld/b1;->c(Z)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 1

    const/16 v0, 0x28

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    invoke-virtual {p0}, Ld/u0;->m()Ld/h1;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Ld/b1;->f(Lro/i;Z)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld/u0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld/u0;

    iget-object v1, p1, Ld/u0;->a:Ld/s0;

    iget-object v3, p0, Ld/u0;->a:Ld/s0;

    if-eq v3, v1, :cond_2

    if-eqz v3, :cond_6

    if-eqz v1, :cond_6

    invoke-virtual {v3, v1}, Ld/b1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_2
    iget-object v1, p1, Ld/u0;->b:Ld/j0;

    iget-object v3, p0, Ld/u0;->b:Ld/j0;

    if-eq v3, v1, :cond_3

    if-eqz v3, :cond_6

    if-eqz v1, :cond_6

    invoke-virtual {v3, v1}, Ld/b1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_3
    iget-object v1, p1, Ld/u0;->c:Ld/b1;

    iget-object v3, p0, Ld/u0;->c:Ld/b1;

    if-eq v3, v1, :cond_4

    if-eqz v3, :cond_6

    if-eqz v1, :cond_6

    invoke-virtual {v3, v1}, Ld/b1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_4
    iget v1, p0, Ld/u0;->d:I

    iget v3, p1, Ld/u0;->d:I

    if-ne v1, v3, :cond_6

    iget-object p1, p1, Ld/u0;->e:Ld/b1;

    iget-object v1, p0, Ld/u0;->e:Ld/b1;

    if-eq v1, p1, :cond_5

    invoke-virtual {v1, p1}, Ld/b1;->g(Ld/b1;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return v0

    :cond_6
    return v2
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Ld/u0;->a:Ld/s0;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Ld/s0;->a:[B

    invoke-static {v1}, Ls30/e;->e([B)I

    move-result v1

    :goto_0
    iget-object v2, p0, Ld/u0;->b:Ld/j0;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    iget-object v2, v2, Ld/j0;->a:[B

    invoke-static {v2}, Ls30/e;->e([B)I

    move-result v2

    :goto_1
    xor-int/2addr v1, v2

    iget-object v2, p0, Ld/u0;->c:Ld/b1;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ld/b1;->hashCode()I

    move-result v0

    :goto_2
    xor-int/2addr v0, v1

    iget v1, p0, Ld/u0;->d:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Ld/u0;->e:Ld/b1;

    invoke-virtual {v1}, Ld/b1;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public j()Ld/b1;
    .locals 7

    iget v0, p0, Ld/u0;->f:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld/u0;

    iget v5, p0, Ld/u0;->d:I

    iget-object v6, p0, Ld/u0;->e:Ld/b1;

    iget-object v2, p0, Ld/u0;->a:Ld/s0;

    iget-object v3, p0, Ld/u0;->b:Ld/j0;

    iget-object v4, p0, Ld/u0;->c:Ld/b1;

    invoke-direct/range {v1 .. v6}, Ld/u0;-><init>(Ld/s0;Ld/j0;Ld/b1;ILd/b1;)V

    return-object v1

    :pswitch_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Ld/b1;
    .locals 1

    iget v0, p0, Ld/u0;->f:I

    return-object p0
.end method

.method public final m()Ld/h1;
    .locals 6

    iget v0, p0, Ld/u0;->f:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld/s;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ld/s;-><init>(I)V

    iget-object v1, p0, Ld/u0;->a:Ld/s0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_0
    iget-object v1, p0, Ld/u0;->b:Ld/j0;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_1
    iget-object v1, p0, Ld/u0;->c:Ld/b1;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ld/b1;->j()Ld/b1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_2
    new-instance v1, Ld/d0;

    iget v2, p0, Ld/u0;->d:I

    if-nez v2, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Ld/u0;->e:Ld/b1;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v2, v4, v5}, Ld/d0;-><init>(ZILd/b1;I)V

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    new-instance v1, Ld/x;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ld/x;-><init>(Ld/s;I)V

    const/4 v0, -0x1

    iput v0, v1, Ld/x;->c:I

    return-object v1

    :pswitch_0
    new-instance v0, Ld/s;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ld/s;-><init>(I)V

    iget-object v1, p0, Ld/u0;->a:Ld/s0;

    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_4
    iget-object v1, p0, Ld/u0;->b:Ld/j0;

    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_5
    iget-object v1, p0, Ld/u0;->c:Ld/b1;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ld/b1;->k()Ld/b1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    :cond_6
    new-instance v1, Ld/d0;

    iget v2, p0, Ld/u0;->d:I

    if-nez v2, :cond_7

    const/4 v3, 0x1

    goto :goto_1

    :cond_7
    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Ld/u0;->e:Ld/b1;

    const/4 v5, 0x2

    invoke-direct {v1, v3, v2, v4, v5}, Ld/d0;-><init>(ZILd/b1;I)V

    invoke-virtual {v0, v1}, Ld/s;->e(Ld/b1;)V

    new-instance v1, Ld/x;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ld/x;-><init>(Ld/s;I)V

    const/4 v0, -0x1

    iput v0, v1, Ld/x;->c:I

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
