.class public final synthetic Luz1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Luz1/g;->w:I

    iput-object p2, p0, Luz1/g;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luz1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lzc1/m6;->l(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lzc1/w5;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lzc1/w5;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lzc1/z1;->q(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lzc1/z1;->s(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "Required value was null."

    invoke-static {v0}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_5
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "Required value was null."

    invoke-static {v0}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_6
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->T(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->L(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->m(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->u(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->P(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lyb0/k;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lxz0/e;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lwz0/d;->e(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lwt1/a;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lwq1/c;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lw80/b;->e(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lw71/e0;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lw71/s;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lvo1/r;->x(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lvo1/g;->g(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lvo1/g;->q(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lvo1/d;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lvo1/d;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lve0/e;->p(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lv51/b;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lv51/b;->g(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Lv11/i;->f(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Luz1/g;->x:Lp1/c1;

    invoke-static {v0}, Luz1/h;->l(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
