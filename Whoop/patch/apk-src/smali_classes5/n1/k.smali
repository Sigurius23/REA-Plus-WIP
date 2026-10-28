.class public final Ln1/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ln1/n;


# direct methods
.method public synthetic constructor <init>(Ln1/n;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ln1/k;->w:I

    iput-object p1, p0, Ln1/k;->y:Ln1/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ln1/k;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ln1/k;

    iget-object v0, p0, Ln1/k;->y:Ln1/n;

    const/4 v1, 0x2

    invoke-direct {p1, v0, p2, v1}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ln1/k;

    iget-object v0, p0, Ln1/k;->y:Ln1/n;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ln1/k;

    iget-object v0, p0, Ln1/k;->y:Ln1/n;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ln1/k;-><init>(Ln1/n;Lq83/d;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln1/k;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ln1/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln1/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln1/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ln1/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln1/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln1/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ln1/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln1/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln1/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ln1/k;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln1/k;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln1/k;->y:Ln1/n;

    iget-boolean v1, p1, Ln1/n;->Q:Z

    if-nez v1, :cond_3

    iput v3, p0, Ln1/k;->x:I

    invoke-virtual {p1, p0}, Ln1/n;->b1(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_3
    iput v2, p0, Ln1/k;->x:I

    invoke-static {p1, p0}, Ln1/n;->a1(Ln1/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln1/k;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

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

    iget-object p1, p0, Ln1/k;->y:Ln1/n;

    iget-object v1, p1, Ln1/n;->T:Ln1/o;

    iget-object v1, v1, Ln1/o;->a:Ld0/e;

    invoke-virtual {v1}, Ld0/e;->f()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p1, Ln1/n;->T:Ln1/o;

    iget-object v4, p1, Ln1/n;->W:Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    invoke-virtual {p1}, Ln1/n;->d1()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v4, p1

    iput v3, p0, Ln1/k;->x:I

    iget-object p1, v1, Ln1/o;->a:Ld0/e;

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {p1, v1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v2

    :goto_3
    if-ne p1, v0, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move-object v0, v2

    :goto_5
    return-object v0

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln1/k;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_a

    if-ne v1, v3, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln1/k;->y:Ln1/n;

    iget-object v1, p1, Ln1/n;->T:Ln1/o;

    iget-boolean p1, p1, Ln1/n;->Q:Z

    if-eqz p1, :cond_b

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_b
    const/4 p1, 0x0

    :goto_6
    iput v3, p0, Ln1/k;->x:I

    iget-object v1, v1, Ln1/o;->a:Ld0/e;

    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, p1}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {v1, v3, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_7

    :cond_c
    move-object p1, v2

    :goto_7
    if-ne p1, v0, :cond_d

    goto :goto_9

    :cond_d
    :goto_8
    move-object v0, v2

    :goto_9
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
