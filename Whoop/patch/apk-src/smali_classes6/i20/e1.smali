.class public final Li20/e1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Li20/j1;


# direct methods
.method public synthetic constructor <init>(Li20/j1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Li20/e1;->w:I

    iput-object p1, p0, Li20/e1;->y:Li20/j1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Li20/e1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Li20/e1;

    iget-object v0, p0, Li20/e1;->y:Li20/j1;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Li20/e1;-><init>(Li20/j1;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Li20/e1;

    iget-object v0, p0, Li20/e1;->y:Li20/j1;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Li20/e1;-><init>(Li20/j1;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li20/e1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Li20/e1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/e1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Li20/e1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/e1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Li20/e1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Li20/e1;->x:I

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

    iget-object p1, p0, Li20/e1;->y:Li20/j1;

    iget-object v1, p1, Li20/j1;->L:Lm63/d;

    iget-object v1, v1, Lm63/d;->F:Ljava/lang/Object;

    check-cast v1, Ln53/e;

    new-instance v3, Landroidx/room/e;

    const/4 v4, 0x0

    const/16 v5, 0xf

    invoke-direct {v3, p1, v4, v5}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v2, p0, Li20/e1;->x:I

    invoke-static {v1, v3, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

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

    iget v1, p0, Li20/e1;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li20/e1;->y:Li20/j1;

    iget-object v1, p1, Li20/j1;->x:Li20/k1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Li20/k1;->a:Leb/u0;

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Leb/a0;->h()Leb/q;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v1

    const-string v4, "AutocompleteEvent"

    invoke-virtual {v1, v3, v4}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object v1

    new-instance v3, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lch/i;-><init>(Lec3/l;I)V

    :cond_6
    :goto_2
    if-eqz v3, :cond_7

    new-instance v1, Lu;

    const/16 v4, 0xd

    invoke-direct {v1, p1, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Li20/e1;->x:I

    invoke-virtual {v3, v1, p0}, Lch/i;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
