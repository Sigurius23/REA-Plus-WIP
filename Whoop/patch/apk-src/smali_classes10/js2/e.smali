.class public final synthetic Ljs2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Ljs2/e;->w:I

    iput-object p2, p0, Ljs2/e;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ljs2/e;->w:I

    const-string v1, "it"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Ljs2/e;->x:Lp1/c1;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lox0/c;->b(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v3, p1}, Lor1/a;->b(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lor1/a;->a(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lb72/e;

    invoke-static {v3, p1}, Lo72/h;->e(Lp1/c1;Lb72/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lb72/e;

    invoke-static {v3, p1}, Lo72/h;->q(Lp1/c1;Lb72/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lo72/h;->n(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lo72/h;->s(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v3, p1}, Lnw0/g;->g(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {v3, p1}, Lno0/n0;->i(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ly3/l;

    invoke-static {v3, p1}, Lno0/l0;->p(Lp1/c1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {v3, p1}, Lno0/l0;->m(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {v3, p1}, Lno0/i;->g(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lg2/v;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v3, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v2

    :pswitch_c
    check-cast p1, Lg2/v;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v3, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v2

    :pswitch_d
    check-cast p1, Lg2/v;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v3, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v2

    :pswitch_e
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lmf0/e;->i(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lm80/f;->f(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lh2/b;

    invoke-static {v3, p1}, Lm01/d;->g(Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Llw1/f;->c(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->E(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lld0/h;

    invoke-static {v3, p1}, Llf0/f2;->e(Lp1/c1;Lld0/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, La01/m;

    invoke-static {v3, p1}, Llf0/f2;->d(Lp1/c1;La01/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {v3, p1}, Llf0/f2;->b(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v3, p1}, Llf0/t;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Ll72/i;->a(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Ll72/i;->d(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ly2/y;

    invoke-interface {v3, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v2

    :pswitch_1a
    check-cast p1, Li3/z;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->K:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v1, v0}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_0
    return-object v2

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v3, p1}, Lkk1/g;->j(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {v3, p1}, Ljs2/f;->h(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

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
