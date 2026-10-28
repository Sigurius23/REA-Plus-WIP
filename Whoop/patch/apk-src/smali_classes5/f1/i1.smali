.class public final Lf1/i1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lf1/s1;


# direct methods
.method public synthetic constructor <init>(Lf1/s1;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lf1/i1;->w:I

    iput-object p1, p0, Lf1/i1;->y:Lf1/s1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lf1/i1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/i1;

    iget-object v1, p0, Lf1/i1;->y:Lf1/s1;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lf1/i1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lf1/i1;

    iget-object v1, p0, Lf1/i1;->y:Lf1/s1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lf1/i1;-><init>(Lf1/s1;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/i1;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lf1/i1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/i1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/i1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lf1/i1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/i1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf1/i1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lf1/i1;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf1/i1;->x:I

    const/4 v2, 0x2

    iget-object v3, p0, Lf1/i1;->y:Lf1/s1;

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Lf1/i1;->x:I

    invoke-virtual {v3, p0}, Lf1/s1;->r(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iput v2, p0, Lf1/i1;->x:I

    invoke-static {v3, p0}, Lf1/s1;->b(Lf1/s1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput-boolean v4, v3, Lf1/s1;->B:Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf1/i1;->x:I

    iget-object v2, p0, Lf1/i1;->y:Lf1/s1;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_7

    if-eq v1, v4, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Lf1/i1;->x:I

    invoke-virtual {v2, p0}, Lf1/s1;->r(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    iput v3, p0, Lf1/i1;->x:I

    invoke-static {v2, p0}, Lf1/s1;->b(Lf1/s1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
