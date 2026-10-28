.class public final Lf0/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lf0/h;

.field public final synthetic z:Lj0/l;


# direct methods
.method public synthetic constructor <init>(Lf0/h;Lj0/l;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lf0/f;->w:I

    iput-object p1, p0, Lf0/f;->y:Lf0/h;

    iput-object p2, p0, Lf0/f;->z:Lj0/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lf0/f;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lf0/f;

    iget-object v0, p0, Lf0/f;->z:Lj0/l;

    const/4 v1, 0x2

    iget-object v2, p0, Lf0/f;->y:Lf0/h;

    invoke-direct {p1, v2, v0, p2, v1}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lf0/f;

    iget-object v0, p0, Lf0/f;->z:Lj0/l;

    const/4 v1, 0x1

    iget-object v2, p0, Lf0/f;->y:Lf0/h;

    invoke-direct {p1, v2, v0, p2, v1}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Lf0/f;

    iget-object v0, p0, Lf0/f;->z:Lj0/l;

    const/4 v1, 0x0

    iget-object v2, p0, Lf0/f;->y:Lf0/h;

    invoke-direct {p1, v2, v0, p2, v1}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf0/f;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf0/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf0/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lf0/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf0/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf0/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf0/f;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/f;->y:Lf0/h;

    iget-object p1, p1, Lf0/h;->Q:Lj0/i;

    if-eqz p1, :cond_2

    new-instance v1, Lj0/m;

    iget-object v3, p0, Lf0/f;->z:Lj0/l;

    invoke-direct {v1, v3}, Lj0/m;-><init>(Lj0/l;)V

    iput v2, p0, Lf0/f;->x:I

    check-cast p1, Lj0/j;

    invoke-virtual {p1, v1, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/f;->y:Lf0/h;

    iget-object p1, p1, Lf0/h;->Q:Lj0/i;

    if-eqz p1, :cond_5

    iput v2, p0, Lf0/f;->x:I

    check-cast p1, Lj0/j;

    iget-object v1, p0, Lf0/f;->z:Lj0/l;

    invoke-virtual {p1, v1, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf0/f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf0/f;->y:Lf0/h;

    iget-object p1, p1, Lf0/h;->Q:Lj0/i;

    if-eqz p1, :cond_8

    new-instance v1, Lj0/k;

    iget-object v3, p0, Lf0/f;->z:Lj0/l;

    invoke-direct {v1, v3}, Lj0/k;-><init>(Lj0/l;)V

    iput v2, p0, Lf0/f;->x:I

    check-cast p1, Lj0/j;

    invoke-virtual {p1, v1, p0}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
