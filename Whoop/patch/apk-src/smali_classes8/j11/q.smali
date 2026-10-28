.class public final synthetic Lj11/q;
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

    .line 1
    iput p1, p0, Lj11/q;->w:I

    iput-object p2, p0, Lj11/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lj11/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lj11/q;->w:I

    iput-object p1, p0, Lj11/q;->y:Ljava/lang/Object;

    iput-object p2, p0, Lj11/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj11/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Ll01/h;

    invoke-static {v0, v1}, Ll01/g;->b(Lkotlin/jvm/functions/Function1;Ll01/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lky2/g$f;

    invoke-static {v0, v1}, Lky2/j;->c(Lkotlin/jvm/functions/Function1;Lky2/g$f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lky2/g;

    invoke-static {v0, v1}, Lky2/e;->f(Lkotlin/jvm/functions/Function1;Lky2/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Liw1/b;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkw1/d;->g(Liw1/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Ljv2/c$a;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkv2/b;->e(Ljv2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lgr1/a;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkr1/c;->e(Lgr1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lkm1/e;

    invoke-static {v0, v1}, Lkm1/b;->e(Lkotlin/jvm/functions/Function1;Lkm1/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lnl2/c$f;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkl2/k;->f(Lnl2/c$f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthspan/domain/models/LockedContentViewState;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkk1/h;->c(Lcom/whoop/healthspan/domain/models/LockedContentViewState;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lik1/h$c;

    invoke-static {v0, v1}, Lkk1/g;->G(Lkotlin/jvm/functions/Function1;Lik1/h$c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Li93/e;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lkk1/g;->u(Li93/e;Lp1/c1;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lkd1/o;

    invoke-static {v0, v1}, Lkh0/f;->b(Lkotlin/jvm/functions/Function1;Lkd1/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lkd0/c$g;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lkf0/f;->i(Lkd0/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lk00/a;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lit1/c$b;

    invoke-static {v0, v1}, Ljt1/c;->e(Lkotlin/jvm/functions/Function1;Lit1/c$b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lhs2/e$c;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ljs2/f;->c(Lhs2/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Ljs2/f;->i(Landroid/content/Context;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lgr1/j;

    invoke-static {v0, v1}, Ljr1/g;->j(Lkotlin/jvm/functions/Function1;Lgr1/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lgr1/b;

    invoke-static {v0, v1}, Ljr1/d;->p(Lkotlin/jvm/functions/Function1;Lgr1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lm91/u;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Ljr1/d;->s(Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lgr1/i;

    invoke-static {v0, v1}, Ljr1/a;->b(Lkotlin/jvm/functions/Function1;Lgr1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Ljp2/o;

    invoke-static {v0, v1}, Ljp2/n;->l(Lkotlin/jvm/functions/Function1;Ljp2/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lhp1/h;

    invoke-static {v0, v1}, Ljp1/o;->g(Lkotlin/jvm/functions/Function1;Lhp1/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Ljm1/d;

    invoke-static {v0, v1}, Ljm1/c;->c(Lkotlin/jvm/functions/Function1;Ljm1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-static {v0, v1}, Ljm0/d;->b(Lkotlin/jvm/functions/Function1;Lcom/whoop/appconfiguration/TabConfiguration;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Ljh0/c;

    invoke-static {v0, v1}, Ljh0/a;->b(Lkotlin/jvm/functions/Function1;Ljh0/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lj81/i;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lj81/f;->a(Lj81/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lj50/d;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lj50/c;->a(Lj50/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v0, Lj21/i;

    iget-object v1, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lj21/e;->b(Lj21/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lj11/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lj11/q;->y:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/LocalDate;

    invoke-static {v0, v1}, Lj11/r;->a(Lkotlin/jvm/functions/Function1;Lorg/joda/time/LocalDate;)Ll83/a0;

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
