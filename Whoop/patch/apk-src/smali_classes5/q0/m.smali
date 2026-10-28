.class public final Lq0/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lq0/y;


# direct methods
.method public synthetic constructor <init>(Lq0/y;ILq83/d;)V
    .locals 0

    iput p2, p0, Lq0/m;->w:I

    iput-object p1, p0, Lq0/m;->y:Lq0/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lq0/m;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lq0/m;

    iget-object v0, p0, Lq0/m;->y:Lq0/y;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1, p2}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lq0/m;

    iget-object v0, p0, Lq0/m;->y:Lq0/y;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, p2}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lq0/m;

    iget-object v0, p0, Lq0/m;->y:Lq0/y;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p2}, Lq0/m;-><init>(Lq0/y;ILq83/d;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq0/m;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq0/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq0/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq0/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq0/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq0/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq0/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lq0/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq0/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq0/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lq0/m;->w:I

    const/4 v1, 0x6

    const/4 v2, 0x0

    iget-object v3, p0, Lq0/m;->y:Lq0/y;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq0/m;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, p0, Lq0/m;->x:I

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    new-instance v1, Lb3/z0;

    const/4 v4, 0x2

    const/4 v5, 0x3

    invoke-direct {v1, v4, v5, v2}, Lb3/z0;-><init>(IILq83/d;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, p1, v1, p0}, Lq0/y;->u(Lq0/y;Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v6

    :goto_0
    if-ne p1, v0, :cond_3

    move-object v6, v0

    :cond_3
    :goto_1
    return-object v6

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, p0, Lq0/m;->x:I

    if-eqz v7, :cond_5

    if-ne v7, v5, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, p0, Lq0/m;->x:I

    sget p1, Lq0/c0;->a:F

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result p1

    add-int/2addr p1, v5

    invoke-virtual {v3}, Lq0/y;->m()I

    move-result v4

    if-ge p1, v4, :cond_6

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result p1

    add-int/2addr p1, v5

    invoke-static {v3, p1, v2, p0, v1}, Lq0/y;->g(Lq0/y;ILd0/e2;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    move-object p1, v6

    :goto_2
    if-ne p1, v0, :cond_7

    move-object v6, v0

    :cond_7
    :goto_3
    return-object v6

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v7, p0, Lq0/m;->x:I

    if-eqz v7, :cond_9

    if-ne v7, v5, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, p0, Lq0/m;->x:I

    sget p1, Lq0/c0;->a:F

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result p1

    sub-int/2addr p1, v5

    if-ltz p1, :cond_a

    invoke-virtual {v3}, Lq0/y;->k()I

    move-result p1

    sub-int/2addr p1, v5

    invoke-static {v3, p1, v2, p0, v1}, Lq0/y;->g(Lq0/y;ILd0/e2;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_4

    :cond_a
    move-object p1, v6

    :goto_4
    if-ne p1, v0, :cond_b

    move-object v6, v0

    :cond_b
    :goto_5
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
