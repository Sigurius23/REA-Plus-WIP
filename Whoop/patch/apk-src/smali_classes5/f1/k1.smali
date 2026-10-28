.class public final Lf1/k1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf1/s1;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/k1;->w:I

    .line 1
    iput-object p1, p0, Lf1/k1;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lf1/k1;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZLg1/a0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1/k1;->w:I

    .line 2
    iput-boolean p1, p0, Lf1/k1;->y:Z

    iput-object p2, p0, Lf1/k1;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lf1/k1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lf1/k1;

    iget-object v0, p0, Lf1/k1;->z:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    iget-boolean v1, p0, Lf1/k1;->y:Z

    invoke-direct {p1, v1, v0, p2}, Lf1/k1;-><init>(ZLg1/a0;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lf1/k1;

    iget-object v0, p0, Lf1/k1;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-boolean v1, p0, Lf1/k1;->y:Z

    invoke-direct {p1, v0, v1, p2}, Lf1/k1;-><init>(Lf1/s1;ZLq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/k1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf1/k1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/k1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf1/k1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/k1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/k1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lf1/k1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1/k1;->z:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf1/k1;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-boolean v2, p0, Lf1/k1;->y:Z

    if-eq v2, p1, :cond_2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput v3, p0, Lf1/k1;->x:I

    invoke-static {v0, p1, p0}, Lcom/squareup/wire/n;->n(Lg1/a0;Ljava/lang/Object;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lf1/k1;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lf1/k1;->x:I

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_4

    if-ne v2, v3, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object p1

    iget-wide v5, p1, Lq3/y;->b:J

    invoke-static {v5, v6}, Ll3/u0;->c(J)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p1, v0, Lf1/s1;->h:Lb3/r1;

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    invoke-static {v2}, Lvp/c;->V(Lq3/y;)Ll3/g;

    move-result-object v2

    invoke-static {v2}, Lse/a;->f0(Ll3/g;)Lb3/q1;

    move-result-object v2

    iput v3, p0, Lf1/k1;->x:I

    check-cast p1, Lb3/i;

    invoke-virtual {p1, v2}, Lb3/i;->a(Lb3/q1;)V

    if-ne v4, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    iget-boolean p1, p0, Lf1/k1;->y:Z

    if-nez p1, :cond_7

    :goto_3
    move-object v1, v4

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object p1

    iget-wide v1, p1, Lq3/y;->b:J

    invoke-static {v1, v2}, Ll3/u0;->e(J)I

    move-result p1

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    invoke-static {p1, p1}, Lj93/l0;->f(II)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object p1

    iget-object v1, v0, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p1, Lq3/y;->b:J

    new-instance p1, Ll3/u0;

    invoke-direct {p1, v1, v2}, Ll3/u0;-><init>(J)V

    iput-object p1, v0, Lf1/s1;->w:Ll3/u0;

    sget-object p1, Lu0/g0;->w:Lu0/g0;

    invoke-virtual {v0, p1}, Lf1/s1;->p(Lu0/g0;)V

    goto :goto_3

    :goto_4
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
