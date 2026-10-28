.class public final Lcom/squareup/wire/e;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lcom/squareup/wire/q;


# direct methods
.method public constructor <init>(Lcom/squareup/wire/q;I)V
    .locals 13

    iput p2, p0, Lcom/squareup/wire/e;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    const-class p2, [I

    .line 2
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v5

    const/4 p2, 0x0

    .line 4
    new-array v6, p2, [I

    .line 5
    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    .line 6
    iput-object p1, v1, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    return-void

    :pswitch_0
    move-object v1, p0

    .line 7
    const-class p2, [J

    .line 8
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    .line 9
    invoke-virtual {p1}, Lcom/squareup/wire/q;->getSyntax()Lcom/squareup/wire/x;

    move-result-object v11

    const/4 p2, 0x0

    .line 10
    new-array v12, p2, [J

    .line 11
    sget-object v8, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    const/4 v10, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    .line 12
    iput-object p1, v1, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/squareup/wire/q;Lj93/d;Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x2

    iput v0, p0, Lcom/squareup/wire/e;->a:I

    iput-object p2, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    .line 13
    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v5, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    move-object v1, p0

    move-object v4, p1

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    const-string v3, "reader"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v3

    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    if-ne v5, v1, :cond_0

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v3, v4}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    return-object v0

    :pswitch_0
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    new-array p1, v1, [J

    const/4 v0, 0x0

    aput-wide v2, p1, v0

    return-object p1

    :pswitch_1
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    filled-new-array {p1}, [I

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v1

    .line 2
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    :cond_0
    return-void

    .line 4
    :pswitch_0
    check-cast p2, [J

    .line 5
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    aget-wide v2, p2, v1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1, v2}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 8
    :pswitch_1
    check-cast p2, [I

    .line 9
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    .line 11
    aget v2, p2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1, v2}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    if-eqz p2, :cond_0

    .line 12
    iget-object v0, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v1

    .line 13
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_0
    return-void

    .line 15
    :pswitch_0
    check-cast p2, [J

    .line 16
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_1

    .line 18
    aget-wide v1, p2, v0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1, v1}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void

    .line 19
    :pswitch_1
    check-cast p2, [I

    .line 20
    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_1
    const/4 v1, -0x1

    if-ge v1, v0, :cond_2

    .line 22
    aget v1, p2, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1, v1}, Lcom/squareup/wire/q;->encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    return-void

    .line 1
    :pswitch_0
    check-cast p3, [J

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
    :pswitch_1
    check-cast p3, [I

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    return-void

    .line 9
    :pswitch_0
    check-cast p3, [J

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
    :pswitch_1
    check-cast p3, [I

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final encodedSize(Ljava/lang/Object;)I
    .locals 5

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v0}, Lcom/squareup/wire/q;->getIdentity()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_0
    check-cast p1, [J

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    if-ge v1, v0, :cond_2

    aget-wide v3, p1, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v4, v3}, Lcom/squareup/wire/q;->encodedSize(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return v2

    :pswitch_1
    check-cast p1, [I

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    if-ge v1, v0, :cond_3

    aget v3, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v4, v3}, Lcom/squareup/wire/q;->encodedSize(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public encodedSizeWithTag(ILjava/lang/Object;)I
    .locals 1

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p2, [J

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

    :pswitch_1
    check-cast p2, [I

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

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/squareup/wire/e;->a:I

    packed-switch v0, :pswitch_data_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/squareup/wire/e;->b:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, [J

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [J

    return-object p1

    :pswitch_1
    check-cast p1, [I

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    new-array p1, p1, [I

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
