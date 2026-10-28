.class public final Lg1/p1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lj0/h;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ld0/e;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ld0/e;FZLjava/lang/Object;Lj0/h;Lq83/d;I)V
    .locals 0

    iput p7, p0, Lg1/p1;->w:I

    iput-object p1, p0, Lg1/p1;->y:Ld0/e;

    iput p2, p0, Lg1/p1;->z:F

    iput-boolean p3, p0, Lg1/p1;->E:Z

    iput-object p4, p0, Lg1/p1;->G:Ljava/lang/Object;

    iput-object p5, p0, Lg1/p1;->F:Lj0/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget p1, p0, Lg1/p1;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lg1/p1;

    iget-object p1, p0, Lg1/p1;->G:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ll1/h;

    iget-object v5, p0, Lg1/p1;->F:Lj0/h;

    const/4 v7, 0x1

    iget-object v1, p0, Lg1/p1;->y:Ld0/e;

    iget v2, p0, Lg1/p1;->z:F

    iget-boolean v3, p0, Lg1/p1;->E:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lg1/p1;-><init>(Ld0/e;FZLjava/lang/Object;Lj0/h;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v6, p2

    new-instance v1, Lg1/p1;

    iget-object p1, p0, Lg1/p1;->G:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lg1/q1;

    move-object v7, v6

    iget-object v6, p0, Lg1/p1;->F:Lj0/h;

    const/4 v8, 0x0

    iget-object v2, p0, Lg1/p1;->y:Ld0/e;

    iget v3, p0, Lg1/p1;->z:F

    iget-boolean v4, p0, Lg1/p1;->E:Z

    invoke-direct/range {v1 .. v8}, Lg1/p1;-><init>(Ld0/e;FZLjava/lang/Object;Lj0/h;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/p1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lg1/p1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/p1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/p1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lg1/p1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/p1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/p1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lg1/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/p1;->G:Ljava/lang/Object;

    check-cast v0, Ll1/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg1/p1;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_0

    if-ne v2, v4, :cond_1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v4

    iget-object v4, p0, Lg1/p1;->y:Ld0/e;

    iget-object v2, v4, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    iget v6, p0, Lg1/p1;->z:F

    invoke-static {v2, v6}, Ly3/f;->b(FF)Z

    move-result v2

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lg1/p1;->E:Z

    if-nez v2, :cond_4

    new-instance p1, Ly3/f;

    invoke-direct {p1, v6}, Ly3/f;-><init>(F)V

    iput v5, p0, Lg1/p1;->x:I

    invoke-virtual {v4, p1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    move-object v8, p0

    goto/16 :goto_7

    :cond_3
    :goto_0
    move-object v8, p0

    goto/16 :goto_6

    :cond_4
    iget-object v2, v4, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    iget v5, v0, Ll1/h;->b:F

    invoke-static {v2, v5}, Ly3/f;->b(FF)Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_5

    new-instance v0, Lj0/l;

    const-wide/16 v8, 0x0

    invoke-direct {v0, v8, v9}, Lj0/l;-><init>(J)V

    goto :goto_1

    :cond_5
    iget v5, v0, Ll1/h;->d:F

    invoke-static {v2, v5}, Ly3/f;->b(FF)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v0, Lj0/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_6
    iget v0, v0, Ll1/h;->c:F

    invoke-static {v2, v0}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lj0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_7
    move-object v0, v7

    :goto_1
    iput p1, p0, Lg1/p1;->x:I

    sget-object p1, Lm1/w;->b:Ld0/e2;

    sget-object v2, Lm1/w;->a:Ld0/e2;

    iget-object v5, p0, Lg1/p1;->F:Lj0/h;

    if-eqz v5, :cond_b

    instance-of p1, v5, Lj0/l;

    if-eqz p1, :cond_8

    :goto_2
    move-object v7, v2

    goto :goto_4

    :cond_8
    instance-of p1, v5, Lj0/b;

    if-eqz p1, :cond_9

    goto :goto_2

    :cond_9
    instance-of p1, v5, Lj0/f;

    if-eqz p1, :cond_a

    goto :goto_2

    :cond_a
    instance-of p1, v5, Lj0/d;

    if-eqz p1, :cond_f

    goto :goto_2

    :cond_b
    if-eqz v0, :cond_f

    instance-of v2, v0, Lj0/l;

    if-eqz v2, :cond_c

    :goto_3
    move-object v7, p1

    goto :goto_4

    :cond_c
    instance-of v2, v0, Lj0/b;

    if-eqz v2, :cond_d

    goto :goto_3

    :cond_d
    instance-of v2, v0, Lj0/f;

    if-eqz v2, :cond_e

    sget-object v7, Lm1/w;->c:Ld0/e2;

    goto :goto_4

    :cond_e
    instance-of v0, v0, Lj0/d;

    if-eqz v0, :cond_f

    goto :goto_3

    :cond_f
    :goto_4
    if-eqz v7, :cond_10

    new-instance v5, Ly3/f;

    invoke-direct {v5, v6}, Ly3/f;-><init>(F)V

    move-object v6, v7

    const/4 v7, 0x0

    const/16 v9, 0xc

    move-object v8, p0

    invoke-static/range {v4 .. v9}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_11

    goto :goto_5

    :cond_10
    move-object v8, p0

    new-instance p1, Ly3/f;

    invoke-direct {p1, v6}, Ly3/f;-><init>(F)V

    invoke-virtual {v4, p1, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_11

    goto :goto_5

    :cond_11
    move-object p1, v3

    :goto_5
    if-ne p1, v1, :cond_12

    goto :goto_7

    :cond_12
    :goto_6
    move-object v1, v3

    :goto_7
    return-object v1

    :pswitch_0
    move-object v8, p0

    iget-object v0, v8, Lg1/p1;->G:Ljava/lang/Object;

    check-cast v0, Lg1/q1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Lg1/p1;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_15

    if-eq v2, v4, :cond_14

    if-ne v2, v3, :cond_13

    goto :goto_8

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    :goto_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_15
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Lg1/p1;->y:Ld0/e;

    iget-object v2, p1, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    iget v5, v8, Lg1/p1;->z:F

    invoke-static {v2, v5}, Ly3/f;->b(FF)Z

    move-result v2

    if-nez v2, :cond_1a

    iget-boolean v2, v8, Lg1/p1;->E:Z

    if-nez v2, :cond_16

    new-instance v0, Ly3/f;

    invoke-direct {v0, v5}, Ly3/f;-><init>(F)V

    iput v4, v8, Lg1/p1;->x:I

    invoke-virtual {p1, v0, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1a

    goto :goto_b

    :cond_16
    iget-object v2, p1, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    iget v4, v0, Lg1/q1;->b:F

    invoke-static {v2, v4}, Ly3/f;->b(FF)Z

    move-result v4

    if-eqz v4, :cond_17

    new-instance v0, Lj0/l;

    const-wide/16 v6, 0x0

    invoke-direct {v0, v6, v7}, Lj0/l;-><init>(J)V

    goto :goto_9

    :cond_17
    iget v4, v0, Lg1/q1;->d:F

    invoke-static {v2, v4}, Ly3/f;->b(FF)Z

    move-result v4

    if-eqz v4, :cond_18

    new-instance v0, Lj0/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_9

    :cond_18
    iget v0, v0, Lg1/q1;->e:F

    invoke-static {v2, v0}, Ly3/f;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_19

    new-instance v0, Lj0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_9

    :cond_19
    const/4 v0, 0x0

    :goto_9
    iput v3, v8, Lg1/p1;->x:I

    iget-object v2, v8, Lg1/p1;->F:Lj0/h;

    invoke-static {p1, v5, v0, v2, p0}, Lg1/t2;->a(Ld0/e;FLj0/h;Lj0/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1a

    goto :goto_b

    :cond_1a
    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
