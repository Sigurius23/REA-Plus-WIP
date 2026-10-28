.class public final synthetic La20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, La20/g;->w:I

    iput-object p2, p0, La20/g;->x:Ljava/lang/Object;

    iput-object p3, p0, La20/g;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, La20/g;->w:I

    const-string v1, "productUsageTokens"

    const/4 v2, 0x0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, p0, La20/g;->y:Ljava/lang/Object;

    iget-object v5, p0, La20/g;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Leb2/a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, La81/t;

    invoke-static {v5, v4, p1}, Lbb2/i;->b(Leb2/a;Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v5, Landroidx/fragment/app/m0;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroid/content/Context;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroidx/fragment/app/m0;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    :cond_1
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v0, v1, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec/a;

    invoke-interface {p1}, Lec/a;->getRoot()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a01ce

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object v0

    :pswitch_1
    check-cast v5, Lb30/j0;

    check-cast v4, Lp1/c1;

    check-cast p1, Lo20/b;

    new-instance v0, Lb30/c;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb30/b;

    iget-object v1, v1, Lb30/b;->a:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lb30/c;-><init>(Lo20/b;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lb30/j0;->a(Ls2/e;)V

    return-object v3

    :pswitch_2
    check-cast v5, Lb10/z0;

    check-cast v4, Ly00/m;

    check-cast p1, Ll83/n;

    iget-object v6, v5, Lb10/z0;->j:Lb10/b;

    iget-object v8, v4, Ly00/m;->w:Ljava/util/Set;

    sget-object p1, Ly00/f8;->x:Lt9/p;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v11, 0x0

    const/16 v12, 0x34

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v5, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_3
    check-cast v5, Ly00/q;

    check-cast v4, Lb10/z0;

    check-cast p1, Ll83/n;

    iget-object v0, v5, Ly00/q;->w:Ly00/d5;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ly00/d5;->w:Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v8, v0

    goto :goto_2

    :cond_3
    :goto_0
    iget-object v0, v5, Ly00/q;->y:Ly00/x6;

    if-eqz v0, :cond_5

    iget-object v0, v0, Ly00/x6;->w:Ljava/lang/String;

    const-string v1, "card"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v2, v1

    goto :goto_1

    :cond_4
    const-string v0, "unknown"

    move-object v2, v0

    :cond_5
    :goto_1
    move-object v8, v2

    :goto_2
    iget-object v5, v4, Lb10/z0;->j:Lb10/b;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    invoke-virtual {v4, p1}, Lb10/z0;->A(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->I:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v9, 0x0

    const/16 v11, 0x1a

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v4, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_4
    check-cast v5, Lb10/z0;

    check-cast v4, Ly00/d5;

    check-cast p1, Ll83/n;

    iget-object v6, v5, Lb10/z0;->j:Lb10/b;

    iget-object v9, v4, Ly00/d5;->w:Ljava/lang/String;

    invoke-virtual {v4}, Ly00/d5;->h()Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "paymentMethodCode"

    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->z:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v11, 0x0

    const/16 v12, 0x38

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v5, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_5
    check-cast v5, Lb10/z0;

    check-cast v4, Ly00/r;

    check-cast p1, Ll83/n;

    iget-object v6, v5, Lb10/z0;->j:Lb10/b;

    iget-object v0, v4, Ly00/r;->y:Ly00/d5;

    if-eqz v0, :cond_6

    iget-object v2, v0, Ly00/d5;->w:Ljava/lang/String;

    :cond_6
    move-object v9, v2

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    invoke-virtual {v5, p1}, Lb10/z0;->A(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->M:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v10, 0x0

    const/16 v12, 0x1a

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v5, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_6
    check-cast v5, Lb10/z0;

    check-cast v4, Ly00/y5;

    check-cast p1, Ll83/n;

    iget-object v6, v5, Lb10/z0;->j:Lb10/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ly00/f4;->G:Lt9/c0;

    check-cast v4, Ly00/x5;

    iget-object v8, v4, Ly00/x5;->E:Ljava/util/Set;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->E:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v11, 0x0

    const/16 v12, 0x38

    const-string v9, "card"

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v5, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_7
    check-cast v5, Lb10/z0;

    check-cast v4, Ly00/w;

    check-cast p1, Ll83/n;

    iget-object v6, v5, Lb10/z0;->j:Lb10/b;

    sget-object v7, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->y:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    iget-object p1, v4, Ly00/w;->x:Ly00/d5;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ly00/d5;->h()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    move-object v8, p1

    goto :goto_5

    :cond_8
    :goto_4
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    goto :goto_3

    :goto_5
    const/4 v11, 0x0

    const/16 v12, 0x3c

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v0, v5, Lb10/z0;->h:Lyy/j;

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-object v3

    :pswitch_8
    check-cast v5, Lp1/t2;

    check-cast v4, Lc93/n;

    check-cast p1, Ln0/q;

    invoke-static {v5, v4, p1}, Lb01/p;->b(Lp1/t2;Lc93/n;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Leb/u0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v5, v4, p1}, Laz1/n;->n(Lkotlin/jvm/functions/Function1;Leb/u0;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v5, Lwy1/b;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v5, v4, p1}, Laz1/g;->g(Lwy1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lwt2/a;

    invoke-static {v5, v4, p1}, Lau2/h;->g(Lkotlin/jvm/functions/Function1;Lwt2/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lzt1/c$c;

    invoke-static {v5, v4, p1}, Lau1/q;->k(Lkotlin/jvm/functions/Function1;Lzt1/c$c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lys2/e$j;

    invoke-static {v5, v4, p1}, Lat2/c0;->o(Lkotlin/jvm/functions/Function1;Lys2/e$j;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lys2/e$i;

    invoke-static {v5, v4, p1}, Lat2/w;->i(Lkotlin/jvm/functions/Function1;Lys2/e$i;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lar2/c;

    invoke-static {v5, v4, p1}, Lar2/g;->b(Lkotlin/jvm/functions/Function1;Lar2/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v5, Leq0/x;

    check-cast v4, Laq0/q;

    check-cast p1, Landroid/view/View;

    invoke-static {v5, v4, p1}, Laq0/q;->f0(Leq0/x;Laq0/q;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v5, Laq0/q;

    check-cast v4, Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;

    check-cast p1, Landroid/view/View;

    invoke-static {v5, v4, p1}, Laq0/q;->g0(Laq0/q;Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v5, Leq0/t;

    check-cast v4, Laq0/q;

    check-cast p1, Landroid/view/View;

    invoke-static {v5, v4, p1}, Laq0/q;->t0(Leq0/t;Laq0/q;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v5, Landroidx/lifecycle/t0;

    check-cast v4, Lkotlin/jvm/internal/b0;

    invoke-virtual {v5}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v1, v4, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v1, :cond_a

    if-nez v0, :cond_9

    if-nez p1, :cond_a

    :cond_9
    if-eqz v0, :cond_b

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, v4, Lkotlin/jvm/internal/b0;->w:Z

    invoke-virtual {v5, p1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    :cond_b
    return-object v3

    :pswitch_14
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, Lk21/a;

    invoke-static {v5, v4, p1}, Lam2/o0;->a(Lkotlin/jvm/functions/Function1;Lk21/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast v5, Lc93/m;

    check-cast v4, Lam2/p0;

    invoke-static {v5, v4, p1}, Lam2/o0;->M(Lc93/m;Lam2/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast v5, Lcom/whoop/trends/view/TrendsFragment;

    check-cast v4, Lyl2/k;

    check-cast p1, Lyl2/g;

    invoke-static {v5, v4, p1}, Lcom/whoop/trends/view/TrendsFragment;->I(Lcom/whoop/trends/view/TrendsFragment;Lyl2/k;Lyl2/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast v5, Lai1/d;

    check-cast v4, Lbi1/a;

    check-cast p1, Ltb/a;

    invoke-static {v5, v4, p1}, Lai1/d;->e(Lai1/d;Lbi1/a;Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast v5, Laa2/f;

    check-cast v4, Laa2/i;

    check-cast p1, Ltb/a;

    invoke-static {v5, v4, p1}, Laa2/f;->l(Laa2/f;Laa2/i;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v5, Laa2/f;

    check-cast v4, Laa2/g;

    check-cast p1, Ltb/a;

    invoke-static {v5, v4, p1}, Laa2/f;->m(Laa2/f;Laa2/g;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v5, Ly70/c$d;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v5, v4, p1}, La80/l;->h(Ly70/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v4, La61/e;

    invoke-static {v5, v4, p1}, La61/c;->c(Lkotlin/jvm/functions/Function1;La61/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v5, La20/j;

    check-cast v4, Lkz/l;

    check-cast p1, Ly00/c8;

    iget-object v0, v4, Lkz/l;->w:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v0, Lz00/a;

    const/16 v3, 0x1d

    invoke-direct {v0, v3}, Lz00/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    iget-object v1, v5, La20/j;->G:Lqy/d;

    const-string v3, "Failed to parse PaymentMethod"

    invoke-virtual {v1, v3, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_c

    new-instance v1, Lz10/l;

    iget-object v3, v4, Lkz/l;->x:Ljava/lang/String;

    iget-object v5, v4, Lkz/l;->y:Ljava/lang/String;

    iget-boolean v4, v4, Lkz/l;->z:Z

    invoke-direct {v1, v0, v3, v5, v4}, Lz10/l;-><init>(Ly00/o4;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_7

    :cond_c
    move-object v1, v2

    :goto_7
    new-instance v0, Lz10/n;

    invoke-direct {v0, p1, v2, v1}, Lz10/n;-><init>(Ly00/c8;Lz10/m;Lz10/l;)V

    return-object v0

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
