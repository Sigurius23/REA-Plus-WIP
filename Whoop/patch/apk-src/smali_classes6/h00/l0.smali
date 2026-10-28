.class public final synthetic Lh00/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh00/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lh00/l0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "it"

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lh90/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lh90/b;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lh90/b;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lh81/e;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lh71/g;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lh71/l;

    invoke-static {p1}, Lh71/g;->e(Lh71/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lf60/a;

    invoke-static {p1}, Lh60/h;->d(Lf60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lf60/a;

    invoke-static {p1}, Lh60/g;->h(Lf60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lf60/a;

    invoke-static {p1}, Lh60/e;->d(Lf60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lh51/e;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lh51/e;->b(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Lh51/d;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Lh51/d;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ly81/i;

    invoke-static {p1}, Lh41/d;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lg1/z3;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_e
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lh31/t;->b(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ll8/c;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p1, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    sget p1, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    const-string p1, "shop_pay_args"

    invoke-virtual {v0, p1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh30/j;

    if-nez p1, :cond_0

    new-instance p1, Lcom/stripe/android/shoppay/ShopPayViewModel$NoArgsException;

    invoke-direct {p1}, Lcom/stripe/android/shoppay/ShopPayViewModel$NoArgsException;-><init>()V

    throw p1

    :cond_0
    new-instance v0, Lt9/p;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    new-instance v1, Lt9/c0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Luy/a;

    invoke-direct {v2, v1, v3}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    new-instance v2, Le20/a;

    const/4 v3, 0x5

    sget-object v4, Li30/a;->a:Lcy/b;

    invoke-direct {v2, v0, v4, v3}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    invoke-static {p1}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    new-instance v0, Luy/a;

    invoke-direct {v0, v1, v5}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    iget-object p1, p1, Lh30/j;->E:Ljava/lang/String;

    invoke-static {p1}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ShopPayHandlers not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_10
    invoke-static {p1}, Lh21/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lv00/c0;

    if-eqz p1, :cond_1

    iget-boolean p1, p1, Lv00/c0;->Q:Z

    if-ne p1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lv00/c0;

    if-eqz p1, :cond_2

    iget-object v2, p1, Lv00/c0;->P:Lv00/p;

    :cond_2
    return-object v2

    :pswitch_13
    check-cast p1, Ly00/o4;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :pswitch_14
    check-cast p1, Le10/b0;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le10/a0;

    if-nez v0, :cond_7

    instance-of v0, p1, Le10/y;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    instance-of v0, p1, Le10/z;

    if-eqz v0, :cond_6

    check-cast p1, Le10/z;

    iget-object p1, p1, Le10/z;->a:Le10/l;

    instance-of v0, p1, Ll10/c;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    instance-of v0, p1, Lo10/a;

    if-eqz v0, :cond_7

    check-cast p1, Lo10/a;

    iget-object p1, p1, Lo10/a;->y:Lwz/h0;

    sget-object v0, Lwz/h0;->w:Lwz/h0;

    if-eq p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v5

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lq20/e0;

    if-eqz p1, :cond_8

    iget-object p1, p1, Lq20/e0;->a:Lq20/d0;

    if-eqz p1, :cond_8

    iget-object v2, p1, Lq20/d0;->a:Lzy/c;

    :cond_8
    return-object v2

    :pswitch_16
    check-cast p1, Lq20/y;

    return-object v1

    :pswitch_17
    check-cast p1, Lv00/c0;

    if-eqz p1, :cond_9

    iget-object p1, p1, Lv00/c0;->P:Lv00/p;

    if-eqz p1, :cond_9

    iget-object v2, p1, Lv00/p;->E:Lv00/o;

    :cond_9
    return-object v2

    :pswitch_18
    check-cast p1, Lv00/o;

    if-eqz p1, :cond_a

    iget-boolean v5, p1, Lv00/o;->z:Z

    :cond_a
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, La30/a;

    if-eqz p1, :cond_b

    iget-object p1, p1, La30/a;->w:Ljava/util/List;

    if-nez p1, :cond_c

    :cond_b
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_c
    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->a(Lbc3/k1;)Lbc3/e2;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lh02/e;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CompletedIcon"

    invoke-static {v0, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    return-object v1

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
