.class public final Lj53/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lj53/m;


# direct methods
.method public synthetic constructor <init>(Lj53/m;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lj53/j;->w:I

    iput-object p1, p0, Lj53/j;->y:Lj53/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lj53/j;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lj53/j;

    iget-object v0, p0, Lj53/j;->y:Lj53/m;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lj53/j;-><init>(Lj53/m;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lj53/j;

    iget-object v0, p0, Lj53/j;->y:Lj53/m;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lj53/j;-><init>(Lj53/m;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj53/j;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lj53/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj53/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj53/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lj53/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj53/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj53/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lj53/j;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj53/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj53/j;->y:Lj53/m;

    iget-object v1, p1, Lj53/m;->a:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->o:Lec3/w1;

    new-instance v3, Lj53/i;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Lj53/i;-><init>(Lj53/m;I)V

    iput v2, p0, Lj53/j;->x:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3, p0}, Lec3/w1;->k(Lec3/w1;Lec3/m;Lq83/d;)V

    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj53/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj53/j;->y:Lj53/m;

    iget-object v1, p1, Lj53/m;->b:Lec3/h2;

    iget-object v3, p1, Lj53/m;->c:Lec3/r1;

    iget-object v4, p1, Lj53/m;->e:Lec3/h2;

    iget-object v5, p1, Lj53/m;->f:Lec3/h2;

    new-instance v6, Lj53/h;

    const/4 v7, 0x0

    const/4 v8, 0x5

    invoke-direct {v6, v8, v7}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v1, v3, v4, v5, v6}, Lec3/v;->o(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lc93/o;)Landroidx/room/y;

    move-result-object v1

    new-instance v3, Lj53/i;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lj53/i;-><init>(Lj53/m;I)V

    iput v2, p0, Lj53/j;->x:I

    invoke-virtual {v1, v3, p0}, Landroidx/room/y;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
