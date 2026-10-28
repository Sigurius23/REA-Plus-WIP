.class public final synthetic Ldc1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldc1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ldc1/c;->w:I

    const-string v1, "$this$DslBuilderProperty"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li3/z;

    sget-object v0, Li3/h;->d:Li3/h;

    invoke-static {p1, v0}, Li3/w;->h(Li3/z;Li3/h;)V

    return-object v2

    :pswitch_0
    check-cast p1, Lp1/p1;

    sget v0, Lf0/m;->a:I

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ly3/c;

    sget-object v0, Lf0/f1;->a:Lp1/b0;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/e1;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lf0/l;

    iget-wide v4, p1, Lf0/e1;->a:J

    iget-object v6, p1, Lf0/e1;->b:Ll0/l1;

    invoke-direct/range {v1 .. v6}, Lf0/l;-><init>(Landroid/content/Context;Ly3/c;JLl0/k1;)V

    move-object p1, v1

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Ly2/i1;

    return-object v2

    :pswitch_2
    check-cast p1, Lsl1/a;

    invoke-static {p1}, Lem1/u;->g(Lsl1/a;)Lca2/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Leg/k;

    invoke-static {p1}, Lej0/a;->c(Leg/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lfg/n;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lfg/u;

    iget-object p1, p1, Lfg/u;->a:Lqt/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leg/j;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lfg/k;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lfg/k;->a:Lfg/j;

    new-instance v0, Leg/j;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_6
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lec1/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ld61/a;

    invoke-static {p1}, Le61/h;->a(Ld61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Li3/z;

    invoke-static {p1}, Le61/h;->n(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Li3/z;

    invoke-static {p1}, Le61/h;->i(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :pswitch_b
    check-cast p1, Ltb/a;

    invoke-static {p1}, Ldq1/d;->f(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/g;->c(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/g;->b(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->p(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->d(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->w(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->u(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->t(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->h(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->q(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->e(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->j(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->o(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->i(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->c(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->g(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ldc1/d;->n(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

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
