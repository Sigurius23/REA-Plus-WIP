.class public final Li20/o0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Li20/v0;


# direct methods
.method public synthetic constructor <init>(Li20/v0;Lq83/d;I)V
    .locals 0

    iput p3, p0, Li20/o0;->w:I

    iput-object p1, p0, Li20/o0;->y:Li20/v0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Li20/o0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Li20/o0;

    iget-object v0, p0, Li20/o0;->y:Li20/v0;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Li20/o0;

    iget-object v0, p0, Li20/o0;->y:Li20/v0;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Li20/o0;

    iget-object v0, p0, Li20/o0;->y:Li20/v0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li20/o0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Li20/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Li20/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Li20/o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Li20/o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Li20/o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Li20/o0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li20/o0;->y:Li20/v0;

    iget-object v1, v0, Li20/v0;->J:Lec3/r1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Li20/o0;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Li20/v0;->F:Lec3/w1;

    new-instance v0, Li20/r0;

    iget-object v3, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v5, Lh20/x0;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    invoke-direct {v0, v5}, Li20/r0;-><init>(Lh20/x0;)V

    iput v4, p0, Li20/o0;->x:I

    invoke-virtual {p1, v0, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v2

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Li20/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li20/o0;->y:Li20/v0;

    iget-object p1, p1, Li20/v0;->F:Lec3/w1;

    new-instance v1, Li20/s0;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Li20/s0;-><init>(Lh20/x0;)V

    iput v2, p0, Li20/o0;->x:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Li20/o0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_8

    if-eq v1, v2, :cond_7

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li20/o0;->y:Li20/v0;

    iget-object v1, p1, Li20/v0;->J:Lec3/r1;

    new-instance v3, Lu;

    const/16 v4, 0xc

    invoke-direct {v3, p1, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Li20/o0;->x:I

    iget-object p1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_5
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
