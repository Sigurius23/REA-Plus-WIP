.class public final synthetic Lcp0/k0;
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

    iput p1, p0, Lcp0/k0;->w:I

    iput-object p2, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lnl0/m;

    invoke-static {v0, p1}, Lcp0/x0;->J(Lp1/c1;Lnl0/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lch0/b;

    invoke-static {v0, p1}, Lcp0/x0;->o(Lp1/c1;Lch0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Lcp0/x0;->e(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lcom/whoop/design/util/TextResource;

    invoke-static {v0, p1}, Lcp0/x0;->D(Lp1/c1;Lcom/whoop/design/util/TextResource;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcp0/x0;->s(Lp1/c1;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lcp0/x0;->f(Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lcp0/x0;->u(Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcp0/j0;->f(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcp0/j0;->e(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcp0/j0;->B(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcp0/j0;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lcp0/u1;

    invoke-static {v0, p1}, Lcp0/j0;->p(Lp1/c1;Lcp0/u1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcp0/j0;->E(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Lcp0/j0;->t(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Lcp0/j0;->k(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lc93/a;

    invoke-static {p1, v0}, Lcp0/j0;->H(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    invoke-static {v0, p1}, Lcp0/j0;->n(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lql0/b;

    invoke-static {v0, p1}, Lcp0/a0;->g(Lp1/c1;Lql0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lcp0/k0;->x:Lp1/c1;

    check-cast p1, Lcp0/u1;

    invoke-static {v0, p1}, Lcp0/j0$c;->h(Lp1/c1;Lcp0/u1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
