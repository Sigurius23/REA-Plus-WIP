.class public final Lt23/q3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lt23/b4;


# direct methods
.method public synthetic constructor <init>(Lt23/b4;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lt23/q3;->w:I

    iput-object p1, p0, Lt23/q3;->y:Lt23/b4;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lt23/q3;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lt23/q3;

    iget-object v1, p0, Lt23/q3;->y:Lt23/b4;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lt23/q3;-><init>(Lt23/b4;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lt23/q3;

    iget-object v1, p0, Lt23/q3;->y:Lt23/b4;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lt23/q3;-><init>(Lt23/b4;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt23/q3;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lt23/q3;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/q3;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lt23/q3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Lt23/q3;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/q3;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lt23/q3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lt23/q3;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/q3;->x:I

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

    iget-object p1, p0, Lt23/q3;->y:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    iget-object v1, v1, Ly33/c;->j:Lf53/k;

    iget-object p1, p1, Lt23/b4;->I:Ld33/c;

    invoke-virtual {p1}, Ld33/c;->a()Lio/getstream/video/android/model/User;

    move-result-object p1

    iput v2, p0, Lt23/q3;->x:I

    invoke-virtual {v1, p1, p0}, Lf53/k;->i(Lio/getstream/video/android/model/User;Ls83/i;)Ljava/lang/Object;

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

    iget v1, p0, Lt23/q3;->x:I

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

    new-instance p1, Lud3/n0;

    invoke-direct {p1}, Lud3/n0;-><init>()V

    const-string v1, "https://hint.stream-io-video.com/"

    invoke-virtual {p1, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    const-string v1, "HEAD"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance v1, Lud3/o0;

    invoke-direct {v1, p1}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object p1, p0, Lt23/q3;->y:Lt23/b4;

    iget-object p1, p1, Lt23/b4;->E:Ly33/c;

    iget-object p1, p1, Ly33/c;->g:Lud3/l0;

    invoke-virtual {p1, v1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    iput v2, p0, Lt23/q3;->x:I

    new-instance v1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v1}, Lbc3/m;->s()V

    new-instance v2, Leu/f;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Leu/f;-><init>(Lbc3/m;I)V

    invoke-virtual {p1, v2}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {v1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast p1, Lud3/x0;

    iget-boolean v0, p1, Lud3/x0;->Q:Z

    if-eqz v0, :cond_7

    iget-object p1, p1, Lud3/x0;->F:Lud3/d0;

    const-string v0, "X-Amz-Cf-Pop"

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    const/4 v0, 0x3

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    const-string v0, "missing-location"

    :goto_3
    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/Error;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected code "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
