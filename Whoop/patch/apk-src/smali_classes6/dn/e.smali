.class public final Ldn/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldn/d;
.implements Lna/b;


# instance fields
.field public E:I

.field public F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Ldn/e;->w:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Ldn/e;->x:I

    const/4 v1, -0x1

    .line 34
    iput v1, p0, Ldn/e;->y:I

    .line 35
    iput v0, p0, Ldn/e;->z:I

    const/16 v0, 0x10

    .line 36
    new-array v0, v0, [I

    iput-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    .line 37
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldn/e;->E:I

    return-void
.end method

.method public constructor <init>(Ldn/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldn/e;->w:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iget-object p1, p1, Ldn/b;->y:Led3/a;

    iput-object p1, p0, Ldn/e;->F:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 40
    invoke-virtual {p1, v0}, Led3/a;->K(I)V

    .line 41
    invoke-virtual {p1}, Led3/a;->B()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ldn/e;->y:I

    .line 42
    invoke-virtual {p1}, Led3/a;->B()I

    move-result p1

    iput p1, p0, Ldn/e;->x:I

    return-void
.end method

.method public constructor <init>(Ll3/g;J)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Ldn/e;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/google/android/material/textfield/p;

    .line 3
    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    .line 4
    invoke-direct {v0}, Lcom/google/android/material/textfield/p;-><init>()V

    iput-object p1, v0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 5
    iput v1, v0, Lcom/google/android/material/textfield/p;->b:I

    .line 6
    iput v1, v0, Lcom/google/android/material/textfield/p;->c:I

    .line 7
    iput-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    .line 8
    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v0

    iput v0, p0, Ldn/e;->x:I

    .line 9
    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result v0

    iput v0, p0, Ldn/e;->y:I

    .line 10
    iput v1, p0, Ldn/e;->z:I

    .line 11
    iput v1, p0, Ldn/e;->E:I

    .line 12
    invoke-static {p2, p3}, Ll3/u0;->f(J)I

    move-result v0

    .line 13
    invoke-static {p2, p3}, Ll3/u0;->e(J)I

    move-result p2

    .line 14
    const-string p3, ") offset is outside of text region "

    if-ltz v0, :cond_2

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_2

    if-ltz p2, :cond_1

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gt p2, v1, :cond_1

    if-gt v0, p2, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Do not set reversed range: "

    const-string v1, " > "

    .line 18
    invoke-static {v0, p2, p3, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    const-string v1, "end ("

    .line 22
    invoke-static {p2, v1, p3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    const-string v1, "start ("

    .line 28
    invoke-static {v0, v1, p3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    .line 30
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Ly8/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldn/e;->w:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iget-object p1, p1, Ly8/d;->y:Lx8/n;

    iput-object p1, p0, Ldn/e;->F:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 45
    invoke-virtual {p1, v0}, Lx8/n;->F(I)V

    .line 46
    invoke-virtual {p1}, Lx8/n;->x()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ldn/e;->y:I

    .line 47
    invoke-virtual {p1}, Lx8/n;->x()I

    move-result p1

    iput p1, p0, Ldn/e;->x:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    iget v0, p0, Ldn/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    iget v1, p0, Ldn/e;->y:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lx8/n;->z()I

    move-result v0

    goto :goto_0

    :cond_1
    iget v1, p0, Ldn/e;->z:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldn/e;->z:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v0

    iput v0, p0, Ldn/e;->E:I

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_2
    iget v0, p0, Ldn/e;->E:I

    and-int/lit8 v0, v0, 0xf

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Led3/a;

    iget v1, p0, Ldn/e;->y:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_3

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v0

    goto :goto_1

    :cond_3
    const/16 v2, 0x10

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Led3/a;->D()I

    move-result v0

    goto :goto_1

    :cond_4
    iget v1, p0, Ldn/e;->z:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldn/e;->z:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_5

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v0

    iput v0, p0, Ldn/e;->E:I

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    goto :goto_1

    :cond_5
    iget v0, p0, Ldn/e;->E:I

    and-int/lit8 v0, v0, 0xf

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ldn/e;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    return v0

    :pswitch_0
    const/4 v0, -0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ldn/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ldn/e;->x:I

    return v0

    :pswitch_0
    iget v0, p0, Ldn/e;->x:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(I)V
    .locals 6

    iget v0, p0, Ldn/e;->z:I

    iget-object v1, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    if-ne v0, v2, :cond_1

    array-length v0, v1

    shl-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_0

    new-array v2, v0, [I

    array-length v3, v1

    iget v4, p0, Ldn/e;->x:I

    sub-int/2addr v3, v4

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v5, p0, Ldn/e;->x:I

    iget v1, p0, Ldn/e;->z:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ldn/e;->y:I

    iput-object v2, p0, Ldn/e;->F:Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldn/e;->E:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Ldn/e;->y:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ldn/e;->E:I

    and-int/2addr v0, v1

    iput v0, p0, Ldn/e;->y:I

    iget-object v1, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v1, [I

    aput p1, v1, v0

    iget p1, p0, Ldn/e;->z:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ldn/e;->z:I

    return-void
.end method

.method public e(II)V
    .locals 4

    invoke-static {p1, p2}, Lj93/l0;->f(II)J

    move-result-wide v0

    iget-object v2, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/material/textfield/p;

    const-string v3, ""

    invoke-virtual {v2, p1, p2, v3}, Lcom/google/android/material/textfield/p;->l(IILjava/lang/String;)V

    iget p1, p0, Ldn/e;->x:I

    iget p2, p0, Ldn/e;->y:I

    invoke-static {p1, p2}, Lj93/l0;->f(II)J

    move-result-wide p1

    invoke-static {p1, p2, v0, v1}, Lvd/e;->l0(JJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll3/u0;->f(J)I

    move-result v2

    invoke-virtual {p0, v2}, Ldn/e;->m(I)V

    invoke-static {p1, p2}, Ll3/u0;->e(J)I

    move-result p1

    invoke-virtual {p0, p1}, Ldn/e;->l(I)V

    iget p1, p0, Ldn/e;->z:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    iget v2, p0, Ldn/e;->E:I

    invoke-static {p1, v2}, Lj93/l0;->f(II)J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Lvd/e;->l0(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    iput p2, p0, Ldn/e;->z:I

    iput p2, p0, Ldn/e;->E:I

    return-void

    :cond_0
    invoke-static {v0, v1}, Ll3/u0;->f(J)I

    move-result p1

    iput p1, p0, Ldn/e;->z:I

    invoke-static {v0, v1}, Ll3/u0;->e(J)I

    move-result p1

    iput p1, p0, Ldn/e;->E:I

    :cond_1
    return-void
.end method

.method public f(I)C
    .locals 5

    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    iget-object v1, v0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v1, La0/i;

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_0
    iget v2, v0, Lcom/google/android/material/textfield/p;->b:I

    if-ge p1, v2, :cond_1

    iget-object v0, v0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_1
    iget v2, v1, La0/i;->b:I

    invoke-virtual {v1}, La0/i;->c()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v0, Lcom/google/android/material/textfield/p;->b:I

    add-int v4, v2, v3

    if-ge p1, v4, :cond_3

    sub-int/2addr p1, v3

    iget v0, v1, La0/i;->c:I

    if-ge p1, v0, :cond_2

    iget-object v0, v1, La0/i;->e:Ljava/lang/Object;

    check-cast v0, [C

    aget-char p1, v0, p1

    return p1

    :cond_2
    iget-object v2, v1, La0/i;->e:Ljava/lang/Object;

    check-cast v2, [C

    sub-int/2addr p1, v0

    iget v0, v1, La0/i;->d:I

    add-int/2addr p1, v0

    aget-char p1, v2, p1

    return p1

    :cond_3
    iget-object v1, v0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v0, v0, Lcom/google/android/material/textfield/p;->c:I

    sub-int/2addr v2, v0

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    invoke-virtual {v1, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1
.end method

.method public g()Ll3/u0;
    .locals 3

    iget v0, p0, Ldn/e;->z:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v1, p0, Ldn/e;->E:I

    invoke-static {v0, v1}, Lj93/l0;->f(II)J

    move-result-wide v0

    new-instance v2, Ll3/u0;

    invoke-direct {v2, v0, v1}, Ll3/u0;-><init>(J)V

    return-object v2

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h()I
    .locals 4

    iget v0, p0, Ldn/e;->z:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v1, [I

    iget v2, p0, Ldn/e;->x:I

    aget v1, v1, v2

    add-int/lit8 v2, v2, 0x1

    iget v3, p0, Ldn/e;->E:I

    and-int/2addr v2, v3

    iput v2, p0, Ldn/e;->x:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldn/e;->z:I

    return v1

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public i(IILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    const-string v1, ") offset is outside of text region "

    if-ltz p1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p1, v2, :cond_2

    if-ltz p2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p2, v2, :cond_1

    if-gt p1, p2, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/material/textfield/p;->l(IILjava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0, p2}, Ldn/e;->m(I)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0, p2}, Ldn/e;->l(I)V

    const/4 p1, -0x1

    iput p1, p0, Ldn/e;->z:I

    iput p1, p0, Ldn/e;->E:I

    return-void

    :cond_0
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string v0, "Do not set reversed range: "

    const-string v1, " > "

    invoke-static {p1, p2, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p3, "end ("

    invoke-static {p2, p3, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string p3, "start ("

    invoke-static {p1, p3, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public j(II)V
    .locals 3

    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    const-string v1, ") offset is outside of text region "

    if-ltz p1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p1, v2, :cond_2

    if-ltz p2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p2, v2, :cond_1

    if-ge p1, p2, :cond_0

    iput p1, p0, Ldn/e;->z:I

    iput p2, p0, Ldn/e;->E:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Do not set reversed or empty range: "

    const-string v2, " > "

    invoke-static {p1, p2, v1, v2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "end ("

    invoke-static {p2, v2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "start ("

    invoke-static {p1, v2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public k(II)V
    .locals 3

    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    const-string v1, ") offset is outside of text region "

    if-ltz p1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p1, v2, :cond_2

    if-ltz p2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v2

    if-gt p2, v2, :cond_1

    if-gt p1, p2, :cond_0

    invoke-virtual {p0, p1}, Ldn/e;->m(I)V

    invoke-virtual {p0, p2}, Ldn/e;->l(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Do not set reversed range: "

    const-string v2, " > "

    invoke-static {p1, p2, v1, v2}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "end ("

    invoke-static {p2, v2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "start ("

    invoke-static {p1, v2, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public l(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot set selectionEnd to a negative value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :cond_1
    iput p1, p0, Ldn/e;->y:I

    return-void
.end method

.method public m(I)V
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot set selectionStart to a negative value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :cond_1
    iput p1, p0, Ldn/e;->x:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ldn/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldn/e;->F:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
