.class public final synthetic Lat2/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lat2/b1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lat2/b1;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lb01/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/n;->d(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Laz1/n;->l(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/n;->j(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Laz1/n;->v(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/h;->c(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/h;->h(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1}, Laz1/g;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/g;->m(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lwy1/a;

    invoke-static {p1}, Laz1/g;->f(Lwy1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lyy1/c;

    invoke-static {p1}, Laz1/g;->a(Lyy1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lyx1/d;

    invoke-static {p1}, Lay1/b;->c(Lyx1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ll8/c;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v0

    sget-object v3, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p1, v3}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    sget v3, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->y:I

    const-string v3, "intent_confirmation_challenge_args"

    invoke-virtual {v0, v3}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lay/t;

    if-eqz v6, :cond_0

    new-instance v0, Lt9/p;

    const/4 v3, 0x7

    invoke-direct {v0, v3}, Lt9/p;-><init>(I)V

    new-instance v3, Lt9/c0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Le20/a;

    const/4 v5, 0x5

    sget-object v7, Lcy/a;->a:Lcy/b;

    invoke-direct {v4, v0, v7, v5}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    invoke-static {v4}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    new-instance v4, Luy/a;

    invoke-direct {v4, v3, v2}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v4}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v2

    new-instance v4, Luy/a;

    invoke-direct {v4, v3, v1}, Luy/a;-><init>(Lt9/c0;I)V

    invoke-static {v4}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v1

    new-instance v9, Lay/b0;

    new-instance v3, Lay/j;

    new-instance v4, Lkr/e;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    new-instance v5, Lu00/e;

    const/16 v7, 0xa

    invoke-direct {v5, v7}, Lu00/e;-><init>(I)V

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqy/d;

    new-instance v8, Lb20/f;

    new-instance v10, Lyy/j;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq83/j;

    invoke-direct {v10, v0, v2}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v0, Lb10/b;

    new-instance v2, La1/j;

    const/16 v11, 0x1b

    invoke-direct {v2, v6, v11}, La1/j;-><init>(Ljava/lang/Object;I)V

    iget-object v11, v6, Lay/t;->x:Ljava/util/List;

    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v11}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v11

    check-cast v11, Ljava/util/Set;

    invoke-direct {v0, p1, v11, v2}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v8, v10, v0}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    invoke-direct/range {v3 .. v8}, Lay/j;-><init>(Lkr/e;Lu00/e;Lay/t;Lqy/d;Lb20/f;)V

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq83/j;

    invoke-direct {v9, v3, p1}, Lay/b0;-><init>(Lay/j;Lq83/j;)V

    return-object v9

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No IntentConfirmationChallengeArgs found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_c
    check-cast p1, Lay/c0;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lay/c0;

    invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    return-object v0

    :pswitch_e
    check-cast p1, Lm91/q;

    invoke-static {p1}, Law0/l;->c(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p1}, Law0/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1}, Law0/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1}, Lau2/h;->f(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lau2/c;->f(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lyt1/a;

    invoke-static {p1}, Lau1/q;->d(Lyt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lzt1/d;

    invoke-static {p1}, Lau1/q;->e(Lzt1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lyt1/a;

    invoke-static {p1}, Lau1/q;->s(Lyt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lzt1/d;

    invoke-static {p1}, Lau1/q;->g(Lzt1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lzt1/d;

    invoke-static {p1}, Lau1/l;->a(Lzt1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lyt1/a;

    invoke-static {p1}, Lau1/h;->c(Lyt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lau0/f;->j(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lws2/i;

    invoke-static {p1}, Lat2/f1;->f(Lws2/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Li3/z;

    invoke-static {p1}, Lat2/d1;->h(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lws2/i;

    invoke-static {p1}, Lat2/d1;->c(Lws2/i;)Ll83/a0;

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
