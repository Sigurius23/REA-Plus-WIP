.class public final synthetic Lox0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lox0/b;->w:I

    iput-object p2, p0, Lox0/b;->x:Ljava/lang/Object;

    iput-object p3, p0, Lox0/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lox0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lnj2/u;

    invoke-static {v0, v1}, Lqj2/a;->b(Lkotlin/jvm/functions/Function1;Lnj2/u;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Loe0/e$c;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lqe0/c;->d(Loe0/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lm72/k;

    invoke-static {v0, v1}, Lq72/d;->b(Lkotlin/jvm/functions/Function1;Lm72/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lq71/c;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lq71/d;->h(Lq71/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lp1/f0;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lq0/y;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/n;

    new-instance v2, Lab/h0;

    iget-object v3, v1, Lq0/y;->d:Ll9/o;

    iget-object v3, v3, Ll9/o;->f:Ljava/lang/Object;

    check-cast v3, Lp0/f0;

    invoke-virtual {v3}, Lp0/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li93/j;

    invoke-direct {v2, v3, v0}, Lab/h0;-><init>(Li93/j;Lp0/y;)V

    new-instance v3, Lq0/o;

    invoke-direct {v3, v1, v0, v2}, Lq0/o;-><init>(Lq0/y;Lq0/n;Lab/h0;)V

    return-object v3

    :pswitch_4
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lj02/v;

    invoke-static {v0, v1}, Lpx0/c;->m(Lkotlin/jvm/functions/Function1;Lj02/v;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lpu2/i;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v0, v1}, Lpu2/i;->a(Lpu2/i;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lot2/t;

    invoke-static {v0, v1}, Lpt2/a0;->g(Lkotlin/jvm/functions/Function1;Lot2/t;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lnp1/b;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lpp1/i;->c(Lnp1/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lnp1/j$g;

    invoke-static {v0, v1}, Lpp1/i;->l(Lkotlin/jvm/functions/Function1;Lnp1/j$g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/stress/view/StressMonitorFragment;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    invoke-static {v0, v1}, Lcom/whoop/stress/view/StressMonitorFragment;->I(Lcom/whoop/stress/view/StressMonitorFragment;Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lnh1/c$d;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lph1/i;->h(Lnh1/c$d;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Loa2/b;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-static {v0, v1}, Lpa2/a;->c(Loa2/b;Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Loa2/a;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-static {v0, v1}, Lpa2/a;->f(Loa2/a;Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp92/h;

    invoke-static {v0, v1}, Lp92/h;->d(Lkotlin/jvm/functions/Function1;Lp92/h;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lm72/d;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lp72/b;->a(Lm72/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lm62/g;

    invoke-static {v0, v1}, Lp62/f;->a(Lkotlin/jvm/functions/Function1;Lm62/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lm62/f;

    invoke-static {v0, v1}, Lp62/c;->e(Lkotlin/jvm/functions/Function1;Lm62/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lm62/g$c;

    invoke-static {v0, v1}, Lp62/c;->c(Lkotlin/jvm/functions/Function1;Lm62/g$c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp51/e;

    invoke-static {v0, v1}, Lp51/b;->a(Lkotlin/jvm/functions/Function1;Lp51/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lp21/g;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-static {v0, v1}, Lp21/e;->c(Lp21/g;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp21/g;

    invoke-static {v0, v1}, Lp21/a;->a(Lkotlin/jvm/functions/Function1;Lp21/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp12/e;

    invoke-static {v0, v1}, Lp12/x;->i(Lkotlin/jvm/functions/Function1;Lp12/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Ly1/f;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Ly1/c;

    new-instance v2, Lp0/x0;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-direct {v2, v0, v3, v1}, Lp0/x0;-><init>(Ly1/f;Ljava/util/Map;Ly1/c;)V

    return-object v2

    :pswitch_17
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/j;

    invoke-static {v0, v1}, Lox2/i;->a(Lkotlin/jvm/functions/Function1;Lpx2/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/g$b;

    invoke-static {v0, v1}, Lox2/h;->m(Lkotlin/jvm/functions/Function1;Lpx2/g$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/c;

    invoke-static {v0, v1}, Lox2/e;->j(Lkotlin/jvm/functions/Function1;Lpx2/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/b$a;

    invoke-static {v0, v1}, Lox2/e;->l(Lkotlin/jvm/functions/Function1;Lpx2/b$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lpx2/h;

    invoke-static {v0, v1}, Lox2/e;->m(Lkotlin/jvm/functions/Function1;Lpx2/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lox0/b;->x:Ljava/lang/Object;

    check-cast v0, Lox0/e;

    iget-object v1, p0, Lox0/b;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lox0/c;->d(Lox0/e;Lp1/c1;)Ll83/a0;

    move-result-object v0

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
