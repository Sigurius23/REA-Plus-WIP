.class public final synthetic Lo0/i;
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

    iput p1, p0, Lo0/i;->w:I

    iput-object p2, p0, Lo0/i;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Luz1/h;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/e;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_3
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lte1/b;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lte1/b;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lsg2/v;->i(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Ls80/c;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lrm1/i;->c(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lr90/f;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lqm1/e;->l(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpp1/i;->K(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpp1/i;->w(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpp1/i;->k(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpp1/i;->R(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/t;->b(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/t;->j(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/t;->p(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/i;->q(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/i;->S(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/i;->g(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/i;->C(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lpj2/i;->x(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp0/b0;

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lox0/c;->a(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lo0/i;->x:Lp1/c1;

    invoke-static {v0}, Lo72/h;->j(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    new-instance v0, Lo0/g;

    iget-object v1, p0, Lo0/i;->x:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1}, Lo0/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0

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
