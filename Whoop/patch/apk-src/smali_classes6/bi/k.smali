.class public final Lbi/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ls83/i;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lbi/k;->w:I

    packed-switch p3, :pswitch_data_0

    check-cast p1, Ls83/i;

    iput-object p1, p0, Lbi/k;->z:Ls83/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    :pswitch_0
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lbi/k;->z:Ls83/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    :pswitch_1
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lbi/k;->z:Ls83/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lbi/k;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lbi/k;

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lbi/k;-><init>(Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Lbi/k;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lbi/k;

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lbi/k;-><init>(Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Lbi/k;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lbi/k;

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lbi/k;-><init>(Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Lbi/k;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbi/k;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lf6/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbi/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbi/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbi/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbi/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbi/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbi/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbi/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbi/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbi/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbi/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lbi/k;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbi/k;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lbi/k;->y:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbi/k;->y:Ljava/lang/Object;

    check-cast p1, Lf6/f;

    invoke-virtual {p1}, Lf6/f;->c()Lf6/a;

    move-result-object p1

    iput-object p1, p0, Lbi/k;->y:Ljava/lang/Object;

    iput v2, p0, Lbi/k;->x:I

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbi/k;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbi/k;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iput v2, p0, Lbi/k;->x:I

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbi/k;->x:I

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

    iget-object p1, p0, Lbi/k;->y:Ljava/lang/Object;

    check-cast p1, Lbi/s;

    iget v1, p1, Lbi/s;->a:I

    const/16 v3, 0xc8

    if-gt v3, v1, :cond_8

    const/16 v3, 0x12c

    if-ge v1, v3, :cond_8

    goto :goto_3

    :cond_8
    const/16 v3, 0x130

    if-ne v1, v3, :cond_a

    :goto_3
    iput v2, p0, Lbi/k;->x:I

    iget-object v1, p0, Lbi/k;->z:Ls83/i;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    move-object p1, v0

    :cond_9
    :goto_4
    return-object p1

    :cond_a
    new-instance v0, Lcoil3/network/HttpException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HTTP "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Lbi/s;->a:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
