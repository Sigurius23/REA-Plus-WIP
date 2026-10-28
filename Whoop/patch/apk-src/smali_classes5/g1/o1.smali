.class public final Lg1/o1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lj0/i;

.field public final synthetic z:Lz1/p;


# direct methods
.method public synthetic constructor <init>(Lj0/i;Lz1/p;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lg1/o1;->w:I

    iput-object p1, p0, Lg1/o1;->y:Lj0/i;

    iput-object p2, p0, Lg1/o1;->z:Lz1/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lg1/o1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lg1/o1;

    iget-object v0, p0, Lg1/o1;->z:Lz1/p;

    const/4 v1, 0x3

    iget-object v2, p0, Lg1/o1;->y:Lj0/i;

    invoke-direct {p1, v2, v0, p2, v1}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lg1/o1;

    iget-object v0, p0, Lg1/o1;->z:Lz1/p;

    const/4 v1, 0x2

    iget-object v2, p0, Lg1/o1;->y:Lj0/i;

    invoke-direct {p1, v2, v0, p2, v1}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lg1/o1;

    iget-object v0, p0, Lg1/o1;->z:Lz1/p;

    const/4 v1, 0x1

    iget-object v2, p0, Lg1/o1;->y:Lj0/i;

    invoke-direct {p1, v2, v0, p2, v1}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Lg1/o1;

    iget-object v0, p0, Lg1/o1;->z:Lz1/p;

    const/4 v1, 0x0

    iget-object v2, p0, Lg1/o1;->y:Lj0/i;

    invoke-direct {p1, v2, v0, p2, v1}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/o1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lg1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lg1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lg1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lg1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lg1/o1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/o1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/o1;->y:Lj0/i;

    check-cast p1, Lj0/j;

    iget-object p1, p1, Lj0/j;->a:Lec3/w1;

    new-instance v1, Lg1/n1;

    iget-object v3, p0, Lg1/o1;->z:Lz1/p;

    const/4 v4, 0x3

    invoke-direct {v1, v3, v4}, Lg1/n1;-><init>(Lz1/p;I)V

    iput v2, p0, Lg1/o1;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/o1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/o1;->y:Lj0/i;

    check-cast p1, Lj0/j;

    iget-object p1, p1, Lj0/j;->a:Lec3/w1;

    new-instance v1, Lg1/n1;

    iget-object v3, p0, Lg1/o1;->z:Lz1/p;

    const/4 v4, 0x2

    invoke-direct {v1, v3, v4}, Lg1/n1;-><init>(Lz1/p;I)V

    iput v2, p0, Lg1/o1;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_1
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/o1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/o1;->y:Lj0/i;

    check-cast p1, Lj0/j;

    iget-object p1, p1, Lj0/j;->a:Lec3/w1;

    new-instance v1, Lg1/n1;

    iget-object v3, p0, Lg1/o1;->z:Lz1/p;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg1/n1;-><init>(Lz1/p;I)V

    iput v2, p0, Lg1/o1;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_2
    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/o1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/o1;->y:Lj0/i;

    check-cast p1, Lj0/j;

    iget-object p1, p1, Lj0/j;->a:Lec3/w1;

    new-instance v1, Lg1/n1;

    iget-object v3, p0, Lg1/o1;->z:Lz1/p;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lg1/n1;-><init>(Lz1/p;I)V

    iput v2, p0, Lg1/o1;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
