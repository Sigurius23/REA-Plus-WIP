.class public final La30/p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:La30/a0;


# direct methods
.method public synthetic constructor <init>(La30/a0;Lq83/d;I)V
    .locals 0

    iput p3, p0, La30/p;->w:I

    iput-object p1, p0, La30/p;->y:La30/a0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, La30/p;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, La30/p;

    iget-object v0, p0, La30/p;->y:La30/a0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, La30/p;-><init>(La30/a0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, La30/p;

    iget-object v0, p0, La30/p;->y:La30/a0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, La30/p;-><init>(La30/a0;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La30/p;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, La30/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, La30/p;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/p;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La30/p;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La30/p;->x:I

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

    iput v2, p0, La30/p;->x:I

    sget-object p1, Lsz/g;->x:Lsz/g;

    iget-object v1, p0, La30/p;->y:La30/a0;

    iget-object v1, v1, La30/a0;->b:Ltz/a;

    sget-object v2, Lux/f;->w:Lux/f;

    sget-object v3, Lux/h;->w:Lux/h;

    invoke-virtual {v1, p1, v3, v2}, Ltz/a;->a(Lsz/g;Lux/b;Lux/a;)Lsz/d;

    move-result-object p1

    new-instance v1, Ls40/c0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, p1, v2, v3}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v1}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La30/p;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La30/p;->y:La30/a0;

    iget-object p1, p1, La30/a0;->n:Lt40/f;

    iput v2, p0, La30/p;->x:I

    invoke-virtual {p1, p0}, Lt40/f;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
