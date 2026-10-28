.class public final synthetic Ld30/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld30/k;->w:I

    iput-object p1, p0, Ld30/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ld30/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld30/k;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/r;

    move-object v2, p1

    check-cast v2, Lm91/u;

    move-object v3, p2

    check-cast v3, Lc31/k;

    move-object v4, p3

    check-cast v4, Lg80/g;

    move-object v5, p4

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p5

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v7, p6

    check-cast v7, Lcom/whoop/activation/iajf/domain/SignUpSource;

    invoke-static/range {v1 .. v7}, Ll80/n;->j(Lc93/r;Lm91/u;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ld30/k;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf1/w0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ly2/y;

    check-cast p3, Lh2/b;

    check-cast p4, Lh2/b;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object v7, p6

    check-cast v7, Lf1/v;

    iget-wide p5, p3, Lh2/b;->a:J

    invoke-virtual {v1, p2, p5, p6}, Lf1/w0;->b(Ly2/y;J)J

    move-result-wide v2

    iget-wide p3, p4, Lh2/b;->a:J

    invoke-virtual {v1, p2, p3, p4}, Lf1/w0;->b(Ly2/y;J)J

    move-result-wide v4

    invoke-virtual {v1, p1}, Lf1/w0;->l(Z)V

    invoke-virtual/range {v1 .. v7}, Lf1/w0;->o(JJZLf1/v;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ld30/k;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, La33/d;

    move-object v3, p1

    check-cast v3, Lr20/s;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v6, p3

    check-cast v6, Lv00/c0;

    move-object v7, p4

    check-cast v7, Lq20/y;

    move-object v5, p5

    check-cast v5, Lb30/p3;

    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string p1, "screen"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Lr20/s;->b()Lec3/r1;

    move-result-object p1

    new-instance v1, Le30/e;

    invoke-direct/range {v1 .. v8}, Le30/e;-><init>(La33/d;Lr20/s;ZLb30/p3;Lv00/c0;Lq20/y;Z)V

    invoke-static {p1, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ld30/k;->x:Ljava/lang/Object;

    check-cast v0, Ld30/u;

    iget-object v1, v0, Ld30/u;->b:Ld30/q;

    move-object v3, p1

    check-cast v3, Ljava/util/List;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    check-cast p3, Lq20/y;

    move-object v6, p4

    check-cast v6, Lh20/l;

    move-object v7, p5

    check-cast v7, Ld30/o0;

    check-cast p6, Ljava/lang/String;

    const-string p1, "displayablePaymentMethods"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "action"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p6, :cond_5

    if-eqz p3, :cond_0

    invoke-static {p3}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    invoke-virtual {p6, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    instance-of p2, p3, Lq20/t;

    if-eqz p2, :cond_1

    move-object p2, p3

    check-cast p2, Lq20/t;

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    if-eqz p2, :cond_2

    invoke-static {p2}, Ld30/u;->a(Lq20/t;)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, p1

    :goto_2
    new-instance p4, Ld30/p0;

    instance-of p5, p3, Lq20/t;

    if-eqz p5, :cond_3

    move-object p5, p3

    check-cast p5, Lq20/t;

    goto :goto_3

    :cond_3
    move-object p5, p1

    :goto_3
    if-eqz p5, :cond_4

    invoke-static {p5}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object p5

    goto :goto_4

    :cond_4
    move-object p5, p1

    :goto_4
    invoke-virtual {p6, p5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p5

    invoke-direct {p4, p6, p2, p5}, Ld30/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_5

    :cond_5
    move-object p4, p1

    :goto_5
    new-instance v2, Ld30/s0;

    if-eqz p4, :cond_6

    :goto_6
    move-object v5, p4

    goto/16 :goto_8

    :cond_6
    if-eqz p3, :cond_e

    instance-of p2, p3, Lq20/w;

    if-eqz p2, :cond_7

    sget-object p2, Ld30/q0;->a:Ld30/q0;

    :goto_7
    move-object p4, p2

    goto :goto_6

    :cond_7
    instance-of p2, p3, Lq20/j;

    const/4 p4, 0x0

    if-eqz p2, :cond_8

    new-instance p2, Ld30/p0;

    const-string p5, "google_pay"

    invoke-direct {p2, p5, p1, p4}, Ld30/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_8
    instance-of p2, p3, Lq20/m;

    if-eqz p2, :cond_9

    new-instance p2, Ld30/p0;

    const-string p5, "link"

    invoke-direct {p2, p5, p1, p4}, Ld30/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_9
    instance-of p2, p3, Lq20/x;

    if-eqz p2, :cond_a

    new-instance p2, Ld30/p0;

    const-string p5, "shop_pay"

    invoke-direct {p2, p5, p1, p4}, Ld30/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_a
    instance-of p2, p3, Lq20/t;

    if-eqz p2, :cond_b

    new-instance p2, Ld30/p0;

    move-object p4, p3

    check-cast p4, Lq20/t;

    invoke-virtual {p4}, Lq20/t;->i()Ly00/d5;

    move-result-object p5

    iget-object p5, p5, Ly00/d5;->w:Ljava/lang/String;

    invoke-static {p4}, Ld30/u;->a(Lq20/t;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p4}, Lq20/t;->i()Ly00/d5;

    move-result-object p4

    iget-object p4, p4, Ly00/d5;->w:Ljava/lang/String;

    invoke-virtual {v1, p4}, Ld30/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    sget-object v8, Lh20/t;->b:Lh20/t;

    invoke-virtual {p4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    invoke-direct {p2, p5, v5, p4}, Ld30/p0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_b
    instance-of p2, p3, Lq20/i;

    if-eqz p2, :cond_c

    new-instance p2, Ld30/p0;

    move-object p4, p3

    check-cast p4, Lq20/i;

    iget-object p4, p4, Lq20/i;->x:Ljava/lang/String;

    invoke-direct {p2, p4}, Ld30/p0;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_c
    instance-of p2, p3, Lq20/g;

    if-eqz p2, :cond_d

    new-instance p2, Ld30/p0;

    move-object p4, p3

    check-cast p4, Lq20/g;

    iget-object p4, p4, Lq20/g;->x:Ljava/lang/String;

    invoke-direct {p2, p4}, Ld30/p0;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_e
    move-object v5, p1

    :goto_8
    if-nez p6, :cond_11

    instance-of p2, p3, Lq20/t;

    if-eqz p2, :cond_f

    move-object p2, p3

    check-cast p2, Lq20/t;

    goto :goto_9

    :cond_f
    move-object p2, p1

    :goto_9
    if-eqz p2, :cond_10

    invoke-static {p2}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object p6

    goto :goto_a

    :cond_10
    move-object p6, p1

    :cond_11
    :goto_a
    if-eqz p6, :cond_14

    invoke-virtual {v1, p6}, Ld30/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, Lh20/u;

    if-eqz p3, :cond_12

    check-cast p2, Lh20/u;

    goto :goto_b

    :cond_12
    move-object p2, p1

    :goto_b
    if-eqz p2, :cond_13

    iget-object p1, p2, Lh20/u;->a:Lzy/c;

    :cond_13
    move-object v8, p1

    goto :goto_d

    :cond_14
    instance-of p2, p3, Lq20/w;

    if-eqz p2, :cond_15

    check-cast p3, Lq20/w;

    goto :goto_c

    :cond_15
    move-object p3, p1

    :goto_c
    if-eqz p3, :cond_13

    iget-object p2, v0, Ld30/u;->a:Lv00/c0;

    const-string p4, "metadata"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p2, Lv00/c0;->I:Ljava/lang/String;

    iget-object p5, p3, Lq20/w;->x:Ly00/o4;

    iget-object p6, p5, Ly00/o4;->E:Ly00/f4;

    if-eqz p6, :cond_16

    iget-object p6, p6, Ly00/f4;->w:Ljava/lang/String;

    if-nez p6, :cond_17

    :cond_16
    const-string p6, ""

    :cond_17
    invoke-virtual {p2, p6}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result p6

    invoke-virtual {p3, p4, p6}, Lq20/w;->f(Ljava/lang/String;Z)Lzy/c;

    move-result-object p3

    iget-object p4, p5, Ly00/o4;->E:Ly00/f4;

    invoke-virtual {p2, p4}, Lv00/c0;->H(Ly00/f4;)Z

    move-result p2

    if-eqz p2, :cond_13

    move-object v8, p3

    :goto_d
    invoke-direct/range {v2 .. v8}, Ld30/s0;-><init>(Ljava/util/List;ZLd30/r0;Lh20/l;Ld30/o0;Lzy/c;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
