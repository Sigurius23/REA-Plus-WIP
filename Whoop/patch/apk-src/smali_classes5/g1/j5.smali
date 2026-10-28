.class public final Lg1/j5;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILq83/d;I)V
    .locals 0

    iput p4, p0, Lg1/j5;->w:I

    iput-object p1, p0, Lg1/j5;->z:Ljava/lang/Object;

    iput p2, p0, Lg1/j5;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lg1/j5;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lg1/j5;

    iget-object v0, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast v0, Lq0/y;

    iget v1, p0, Lg1/j5;->y:I

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lg1/j5;

    iget-object v0, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast v0, Lp0/v0;

    iget v1, p0, Lg1/j5;->y:I

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lg1/j5;

    iget-object v0, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast v0, Lg1/k5;

    iget v1, p0, Lg1/j5;->y:I

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/j5;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/j5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/j5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/j5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/j5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/j5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/j5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/j5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/j5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/j5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/j5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast v0, Lq0/y;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg1/j5;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Lg1/j5;->x:I

    iget-object p1, v0, Lq0/y;->y:Lp0/d;

    invoke-virtual {p1, p0}, Lp0/d;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v3

    :goto_0
    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_1
    const/4 p1, 0x0

    float-to-double v1, p1

    const-wide/high16 v5, -0x4020000000000000L    # -0.5

    cmpg-double v5, v5, v1

    if-gtz v5, :cond_4

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    cmpg-double v1, v1, v5

    if-gtz v1, :cond_4

    goto :goto_2

    :cond_4
    const-string v1, "pageOffsetFraction 0.0 is not within the range -0.5 to 0.5"

    invoke-static {v1}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_2
    iget v1, p0, Lg1/j5;->y:I

    invoke-virtual {v0, v1}, Lq0/y;->j(I)I

    move-result v1

    invoke-virtual {v0, p1, v1, v4}, Lq0/y;->w(FIZ)V

    move-object v1, v3

    :goto_3
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/j5;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast p1, Lp0/v0;

    iget-object p1, p1, Lp0/v0;->P:Lp0/s0;

    iput v2, p0, Lg1/j5;->x:I

    iget v1, p0, Lg1/j5;->y:I

    invoke-interface {p1, v1, p0}, Lp0/s0;->a(ILg1/j5;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/j5;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/j5;->z:Ljava/lang/Object;

    check-cast p1, Lg1/k5;

    iget-object p1, p1, Lg1/k5;->a:Lf0/r1;

    sget-object v1, Lg1/c8;->b:Ld0/e2;

    iput v2, p0, Lg1/j5;->x:I

    iget v2, p0, Lg1/j5;->y:I

    invoke-virtual {p1, v2, v1, p0}, Lf0/r1;->f(ILd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
