.class public final synthetic Ljt1/b;
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

    iput p1, p0, Ljt1/b;->w:I

    iput-object p2, p0, Ljt1/b;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljt1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lno0/l0;->E(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lno0/l0;->f(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ln0/f;

    iget-object v1, p0, Ljt1/b;->x:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1}, Ln0/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lmf0/e;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lmf0/e;->o(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lm80/f;->e(Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llw1/f;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llq2/r;->e(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llq2/r;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llq2/r;->r(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llq2/l;->j(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llh0/a;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/f2;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/f2;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/z1;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/o1;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/l1;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/h1;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/i0;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Llf0/l;->e(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    return-object v0

    :pswitch_14
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_15
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkf0/h;->f(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkf0/f;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkf0/f;->q(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkd1/d;->q(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkd1/d;->p(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkd1/d;->f(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Lkd1/d;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Ljt1/b;->x:Lp1/c1;

    invoke-static {v0}, Ljt1/c;->f(Lp1/c1;)Ll83/a0;

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
