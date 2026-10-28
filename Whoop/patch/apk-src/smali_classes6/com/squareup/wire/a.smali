.class public final Lcom/squareup/wire/a;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lcom/squareup/wire/q;


# direct methods
.method public constructor <init>(Lcom/squareup/wire/b;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/wire/a;->a:I

    .line 1
    const-class v0, [J

    .line 2
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    .line 3
    invoke-virtual {p1}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v6

    const/4 v0, 0x0

    .line 4
    new-array v7, v0, [D

    .line 5
    sget-object v3, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    .line 6
    iput-object p1, v2, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/wire/b;B)V
    .locals 7

    const/4 p2, 0x1

    iput p2, p0, Lcom/squareup/wire/a;->a:I

    .line 7
    const-class p2, [J

    .line 8
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    .line 9
    invoke-virtual {p1}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v5

    const/4 p2, 0x0

    .line 10
    new-array v6, p2, [F

    .line 11
    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    .line 12
    iput-object p1, v1, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    return-void
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "reader"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    new-array v0, v2, [F

    aput p1, v0, v1

    return-object v0

    :pswitch_0
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/squareup/wire/r;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    new-array p1, v2, [D

    aput-wide v3, p1, v1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    check-cast p2, [F

    .line 2
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    iget-object v2, p0, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    check-cast v2, Lcom/squareup/wire/b;

    aget v3, p2, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/squareup/wire/b;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 5
    :pswitch_0
    check-cast p2, [D

    .line 6
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    array-length v0, p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    .line 8
    iget-object v2, p0, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    check-cast v2, Lcom/squareup/wire/b;

    aget-wide v3, p2, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/squareup/wire/b;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast p2, [F

    .line 10
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    .line 12
    aget v1, p2, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/squareup/wire/v;->e(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void

    .line 13
    :pswitch_0
    check-cast p2, [D

    .line 14
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_1
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    .line 16
    aget-wide v1, p2, v0

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/v;->f(J)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    check-cast p3, [F

    .line 2
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    .line 3
    array-length v0, p3

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    .line 5
    :pswitch_0
    check-cast p3, [D

    .line 6
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_3

    .line 7
    array-length v0, p3

    if-nez v0, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast p3, [F

    .line 10
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    .line 11
    array-length v0, p3

    if-nez v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void

    .line 13
    :pswitch_0
    check-cast p3, [D

    .line 14
    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_3

    .line 15
    array-length v0, p3

    if-nez v0, :cond_2

    goto :goto_1

    .line 16
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 6

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [F

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    check-cast v3, Lcom/squareup/wire/b;

    aget v4, p1, v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2

    :pswitch_0
    check-cast p1, [D

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_1

    iget-object v3, p0, Lcom/squareup/wire/a;->b:Lcom/squareup/wire/q;

    check-cast v3, Lcom/squareup/wire/b;

    aget-wide v4, p1, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/squareup/wire/b;->encodedSize(Ljava/lang/Object;)I

    const/16 v3, 0x8

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final encodedSizeWithTag(ILjava/lang/Object;)I
    .locals 1

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, [F

    if-eqz p2, :cond_1

    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_0
    check-cast p2, [D

    if-eqz p2, :cond_3

    array-length v0, p2

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p1, 0x0

    :goto_3
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/squareup/wire/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [F

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [F

    return-object p1

    :pswitch_0
    check-cast p1, [D

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [D

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
