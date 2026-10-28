.class public final Lg1/l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:F

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh3/c;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg1/l;->w:I

    .line 1
    iput-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, Lg1/l;->w:I

    iput-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    iput p2, p0, Lg1/l;->y:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lg1/l;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lg1/l;

    iget-object v0, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget v1, p0, Lg1/l;->y:F

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lg1/l;

    iget-object v0, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v0, Lj1/l;

    iget v1, p0, Lg1/l;->y:F

    const/4 v2, 0x3

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance v0, Lg1/l;

    iget-object v1, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v1, Lh3/c;

    invoke-direct {v0, v1, p2}, Lg1/l;-><init>(Lh3/c;Lq83/d;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, Lg1/l;->y:F

    return-object v0

    :pswitch_2
    new-instance p1, Lg1/l;

    iget-object v0, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v0, Lg1/n7;

    iget v1, p0, Lg1/l;->y:F

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Lg1/l;

    iget-object v0, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    iget v1, p0, Lg1/l;->y:F

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Lg1/l;-><init>(Ljava/lang/Object;FLq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Lq83/d;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lg1/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lg1/l;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/l;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast p1, Ll1/w3;

    iget v1, p0, Lg1/l;->y:F

    iput v3, p0, Lg1/l;->x:I

    iget-object p1, p1, Ll1/w3;->e:Lm1/g;

    iget-object v3, p1, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Lm1/g;->f()F

    move-result v4

    invoke-virtual {p1, v4, v1, v3}, Lm1/g;->c(FFLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p1, Lm1/g;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    new-instance v3, Lg1/n;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v1, v6, v5}, Lg1/n;-><init>(Ljava/lang/Object;FLq83/d;I)V

    sget-object v1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p1, v4, v1, v3, p0}, Lm1/g;->b(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v2

    goto :goto_2

    :cond_5
    new-instance v4, Lg1/n;

    const/4 v5, 0x1

    invoke-direct {v4, p1, v1, v6, v5}, Lg1/n;-><init>(Ljava/lang/Object;FLq83/d;I)V

    sget-object v1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p1, v3, v1, v4, p0}, Lm1/g;->b(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_1

    :cond_6
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    :goto_2
    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, v2

    :goto_3
    if-ne p1, v0, :cond_0

    :goto_4
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/l;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_9

    if-ne v1, v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast p1, Lj1/l;

    iget-object v1, p1, Lj1/l;->i:Lf0/c1;

    new-instance v3, Lj1/k;

    iget v4, p0, Lg1/l;->y:F

    const/4 v5, 0x0

    invoke-direct {v3, p1, v4, v5}, Lj1/k;-><init>(Lj1/l;FLq83/d;)V

    iput v2, p0, Lg1/l;->x:I

    invoke-static {v1, v3, p0}, Lf0/c1;->b(Lf0/c1;Lkotlin/jvm/functions/Function1;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast v0, Lh3/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg1/l;->x:I

    const/4 v3, 0x1

    const-wide v4, 0xffffffffL

    if-eqz v2, :cond_c

    if-ne v2, v3, :cond_b

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget p1, p0, Lg1/l;->y:F

    iget-object v2, v0, Lh3/c;->a:Li3/p;

    iget-object v2, v2, Li3/p;->d:Li3/l;

    sget-object v6, Li3/k;->e:Li3/y;

    invoke-static {v2, v6}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/m;

    if-eqz v2, :cond_e

    iget-object v0, v0, Lh3/c;->a:Li3/p;

    iget-object v0, v0, Li3/p;->d:Li3/l;

    sget-object v6, Li3/u;->u:Li3/y;

    invoke-virtual {v0, v6}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/j;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v8, p1

    const/16 p1, 0x20

    shl-long/2addr v6, p1

    and-long/2addr v8, v4

    or-long/2addr v6, v8

    new-instance p1, Lh2/b;

    invoke-direct {p1, v6, v7}, Lh2/b;-><init>(J)V

    iput v3, p0, Lg1/l;->x:I

    invoke-interface {v2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    and-long/2addr v0, v4

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, p1}, Ljava/lang/Float;-><init>(F)V

    :goto_8
    return-object v1

    :cond_e
    const-string p1, "Required value was null."

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/l;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_11

    if-ne v1, v3, :cond_10

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_f
    move-object v0, v2

    goto :goto_a

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast p1, Lg1/n7;

    iget v1, p0, Lg1/l;->y:F

    iput v3, p0, Lg1/l;->x:I

    iget-object v3, p1, Lg1/n7;->j:Lch/i;

    new-instance v4, Lg1/j7;

    invoke-direct {v4, p1, v1}, Lg1/j7;-><init>(Lg1/n7;F)V

    invoke-virtual {v3, v4, p0}, Lch/i;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_12

    goto :goto_9

    :cond_12
    move-object p1, v2

    :goto_9
    if-ne p1, v0, :cond_f

    :goto_a
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/l;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_14

    if-ne v1, v2, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/l;->z:Ljava/lang/Object;

    check-cast p1, Lg1/a0;

    iget v1, p0, Lg1/l;->y:F

    iput v2, p0, Lg1/l;->x:I

    invoke-virtual {p1, v1, p0}, Lg1/a0;->i(FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    goto :goto_c

    :cond_15
    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_c
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
