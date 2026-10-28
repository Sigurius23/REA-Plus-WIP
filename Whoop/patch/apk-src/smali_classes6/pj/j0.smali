.class public final Lpj/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpj/b0;


# virtual methods
.method public final a(Ljava/lang/String;Lpj/a;Lpj/b;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Lpj/i0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lpj/i0;

    iget v1, v0, Lpj/i0;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpj/i0;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpj/i0;

    check-cast p4, Ls83/c;

    invoke-direct {v0, p0, p4}, Lpj/i0;-><init>(Lpj/j0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lpj/i0;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpj/i0;->H:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lpj/i0;->E:I

    iget-object p2, v0, Lpj/i0;->z:Lkotlin/jvm/functions/Function1;

    iget-object p3, v0, Lpj/i0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lpj/i0;->x:Ljava/lang/String;

    iget-object v8, v0, Lpj/i0;->w:Lpj/j0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p2

    move-object p2, v2

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-nez p4, :cond_5

    invoke-virtual {p2, p1}, Lpj/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput v7, v0, Lpj/i0;->H:I

    invoke-virtual {p3, v0}, Lpj/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_5
    move-object v8, p0

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move p1, v4

    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-gt p1, v2, :cond_7

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p2, v4, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v9, "substring(...)"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p1, v2, :cond_7

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v8, v0, Lpj/i0;->w:Lpj/j0;

    iput-object p2, v0, Lpj/i0;->x:Ljava/lang/String;

    iput-object p3, v0, Lpj/i0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, v0, Lpj/i0;->z:Lkotlin/jvm/functions/Function1;

    iput p1, v0, Lpj/i0;->E:I

    iput v6, v0, Lpj/i0;->H:I

    const-wide/16 v9, 0x50

    invoke-static {v9, v10, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    add-int/2addr p1, v7

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    iput-object p1, v0, Lpj/i0;->w:Lpj/j0;

    iput-object p1, v0, Lpj/i0;->x:Ljava/lang/String;

    iput-object p1, v0, Lpj/i0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lpj/i0;->z:Lkotlin/jvm/functions/Function1;

    iput v5, v0, Lpj/i0;->H:I

    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    return-object v3
.end method
