.class public final synthetic Lv20/g;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lv20/g;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lxa3/i;)V
    .locals 8

    const/16 v0, 0xc

    iput v0, p0, Lv20/g;->w:I

    const-string v7, "escape(Ljava/lang/String;)Ljava/lang/String;"

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 2
    const-class v4, Lxa3/i;

    const-string v6, "escape"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lv20/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-virtual {v0, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh0/k2;

    invoke-interface {v0, p1}, Lh0/k2;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh0/k2;

    invoke-interface {v0, p1}, Lh0/k2;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p1, Lwz/y;

    iget-object v1, p1, Lwz/y;->P:Lec3/h2;

    :cond_0
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lh00/j;

    iget-boolean v3, v2, Lh00/j;->a:Z

    iget-boolean v4, v2, Lh00/j;->b:Z

    iget-object v2, v2, Lh00/j;->c:Lzy/c;

    new-instance v5, Lh00/j;

    invoke-direct {v5, v3, v4, v2, v0}, Lh00/j;-><init>(ZZLzy/c;Z)V

    invoke-virtual {v1, p1, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-virtual {v0, p1}, Lwz/y;->p(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Lwz/h;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lwz/f;->a:Lwz/f;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Lwz/m;

    iget-object v1, v0, Lwz/y;->x:Lxz/x;

    invoke-static {v1}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v1

    invoke-direct {p1, v1}, Lwz/m;-><init>(Lwz/e;)V

    invoke-virtual {v0, p1}, Lwz/y;->l(Lwz/q;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lwz/g;->a:Lwz/g;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lwz/v;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1}, Lwz/v;-><init>(Lwz/y;Lq83/d;I)V

    const/4 v1, 0x3

    sget-object v3, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v3, v2, v2, p1, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lwz/m;

    sget-object v1, Lwz/l;->x:Lwz/l;

    new-instance v3, Lwz/d;

    sget-object v4, Lwz/c;->w:Lwz/c;

    invoke-direct {v3, v2, v4}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-direct {p1, v1, v3}, Lwz/m;-><init>(Lwz/l;Lwz/e;)V

    invoke-virtual {v0, p1}, Lwz/y;->l(Lwz/q;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_5
    check-cast p1, Lwz/q;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1}, Lwz/y;->l(Lwz/q;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ln40/b;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Ln40/b;->b:Leb/q;

    if-nez v1, :cond_3

    goto/16 :goto_8

    :cond_3
    iget-object p1, p1, Ln40/b;->a:Leb/q;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p1, Leb/q;->x:Leb/n0;

    if-eqz p1, :cond_4

    iget-object p1, p1, Leb/n0;->I:Ljava/lang/String;

    move-object v3, p1

    goto :goto_1

    :cond_4
    move-object v3, v2

    :goto_1
    iget-object v4, v0, Lwz/y;->P:Lec3/h2;

    :cond_5
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lh00/j;

    invoke-virtual {v0}, Lwz/y;->n()Ld00/l;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_6

    iget-boolean v5, v5, Ld00/l;->K:Z

    if-ne v5, v7, :cond_6

    move v5, v7

    goto :goto_2

    :cond_6
    move v5, v6

    :goto_2
    iget-object v8, v1, Leb/q;->x:Leb/n0;

    if-eqz v8, :cond_7

    iget-object v8, v8, Leb/n0;->I:Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v8, v2

    :goto_3
    sget-object v9, Lwz/w0;->d:Lwz/w0;

    invoke-virtual {v9}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lwz/z0;->d:Lwz/z0;

    invoke-virtual {v10}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lwz/d1;->d:Lwz/d1;

    invoke-virtual {v11}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lwz/c1;->d:Lwz/c1;

    invoke-virtual {v12}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lwz/x0;->d:Lwz/x0;

    invoke-virtual {v13}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v13

    filled-new-array {v9, v10, v11, v12, v13}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ldt/b;->A([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    if-eqz v5, :cond_8

    sget-object v10, Lwz/y0;->d:Lwz/y0;

    invoke-virtual {v10}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v10, Lwz/y0;->d:Lwz/y0;

    invoke-virtual {v10}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    if-eqz v5, :cond_a

    :cond_9
    move-object v5, v2

    goto :goto_6

    :cond_a
    const v5, 0x7f140f68

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_6

    :cond_b
    sget-object v5, Lwz/b1;->d:Lwz/b1;

    invoke-virtual {v5}, Lwz/e1;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v1}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_c

    :goto_4
    move-object v10, v2

    goto :goto_5

    :cond_c
    const-string v10, "is_billing_update_flow"

    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_4

    :cond_d
    const-string v10, "billing_update_cvc"

    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v10, Lwz/a1;

    invoke-direct {v10, v5}, Lwz/a1;-><init>(Ljava/lang/String;)V

    :goto_5
    if-eqz v10, :cond_e

    const v5, 0x7f141031

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_6

    :cond_e
    const v5, 0x7f141044

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    :goto_6
    new-instance v10, Lh00/j;

    invoke-static {v9, v8}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v3, :cond_f

    goto :goto_7

    :cond_f
    move v7, v6

    :goto_7
    invoke-direct {v10, v8, v7, v5, v6}, Lh00/j;-><init>(ZZLzy/c;Z)V

    invoke-virtual {v4, p1, v10}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    move-object v5, p1

    check-cast v5, Lx23/f;

    const-string p1, "p0"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p1, Lw23/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p1, Lw23/r;->a:Lec3/h2;

    :cond_10
    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lw23/q;

    const/4 v4, 0x0

    const/16 v6, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v0

    invoke-virtual {v7, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_10

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    move-object v4, p1

    check-cast v4, Lx23/f;

    const-string p1, "p0"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p1, Lw23/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, p1, Lw23/r;->a:Lec3/h2;

    :cond_11
    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lw23/q;

    const/4 v5, 0x0

    const/16 v6, 0x17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v0

    invoke-virtual {v7, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    const-string p1, "p0"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p1, Lw20/b0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Lw20/b0;->b:Lec3/h2;

    :cond_12
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lw20/y;

    iget-object v3, v2, Lw20/y;->c:Lw20/z;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, v3, Lw20/z;->b:Ly00/i;

    invoke-virtual {v5}, Ly00/i;->b()I

    move-result v6

    if-le v4, v6, :cond_13

    goto :goto_9

    :cond_13
    new-instance v3, Lw20/z;

    invoke-direct {v3, v0, v5}, Lw20/z;-><init>(Ljava/lang/String;Ly00/i;)V

    :goto_9
    const/4 v4, 0x0

    const/16 v5, 0xb

    invoke-static {v2, v3, v4, v5}, Lw20/y;->a(Lw20/y;Lw20/z;ZI)Lw20/y;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    check-cast p1, Lw20/w;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lw20/x;

    invoke-virtual {v0, p1}, Lw20/x;->g(Lw20/w;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Lv20/o;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lv20/r;

    invoke-virtual {v0, p1}, Lv20/r;->g(Lv20/o;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
