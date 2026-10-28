.class public final synthetic Lpt2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpt2/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lpt2/k;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lq72/d;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lq72/a;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lq71/d;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lq71/d;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lo6/f;

    return-object p1

    :pswitch_4
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lq41/f;->d(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lq41/f;->a(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lq22/h;

    invoke-static {p1}, Lq22/d;->k(Lq22/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Lq21/g;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lq11/h;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lq11/d;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lq00/i0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lq00/i0;->d()Ly00/c0;

    move-result-object p1

    instance-of v0, p1, Ly00/a0;

    if-eqz v0, :cond_0

    check-cast p1, Ly00/a0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Ly00/a0;->K:Ly00/i;

    if-nez p1, :cond_2

    :cond_1
    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_2
    return-object p1

    :pswitch_b
    check-cast p1, Lc0/q;

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lr00/a;->a:Lc0/l0;

    return-object p1

    :pswitch_c
    check-cast p1, Lc0/q;

    sget-object v0, Lb2/e;->J:Lb2/l;

    const-string v1, "$this$AnimatedContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/16 v1, 0xd

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    invoke-static {v3, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p1

    invoke-static {v3, v3, v1}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    invoke-static {v3, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {v3, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p1

    invoke-static {v3, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v2

    invoke-static {v3, v0, v3, v1}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v0

    invoke-virtual {v2, v0}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_d
    check-cast p1, Ljava/util/List;

    new-instance v0, Lq0/b;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    new-instance v3, Lh02/z;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, Lh02/z;-><init>(Ljava/util/List;I)V

    invoke-direct {v0, v2, v1, v3}, Lq0/b;-><init>(FILc93/a;)V

    return-object v0

    :pswitch_e
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lpz1/e;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lj02/v;

    invoke-static {p1}, Lpx0/c;->a(Lj02/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lhu2/a$c0;

    invoke-static {p1}, Lpu2/b;->a(Lhu2/a$c0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/b0;->a(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/a0;->a(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lmt2/g;

    invoke-static {p1}, Lpt2/v;->q(Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/v;->w(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lpt2/v;->B(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lmt2/g;

    invoke-static {p1}, Lpt2/v;->j(Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/v;->v(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1}, Lpt2/v;->H(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lmt2/g;

    invoke-static {p1}, Lpt2/l;->k(Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/l;->l(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lmt2/g;

    invoke-static {p1}, Lpt2/l;->h(Lmt2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lnt2/a;

    invoke-static {p1}, Lpt2/l;->f(Lnt2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

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
