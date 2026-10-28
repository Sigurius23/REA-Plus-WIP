.class public final synthetic Lrq0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lrq0/x;->w:I

    iput-object p1, p0, Lrq0/x;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lrq0/x;->w:I

    const-string v1, "$this$addCallback"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Lrq0/x;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, Ltd2/c;

    check-cast p1, Ln0/q;

    invoke-static {v3, p1}, Lud2/c;->b(Ltd2/c;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v3, Lqd0/b;

    check-cast p1, Lqd0/a;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->y(Lqd0/b;Lqd0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v3, Lio/sentry/android/replay/video/d;

    check-cast p1, Lcom/stripe/hcaptcha/HCaptchaException;

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v3, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    invoke-virtual {v3}, Lio/sentry/android/replay/video/d;->o()V

    return-object v2

    :pswitch_2
    check-cast v3, Lu10/n;

    check-cast p1, Ld30/x;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lu10/n;->w:Ld30/h;

    invoke-virtual {p1, v0}, Ld30/x;->b(Ld30/h;)Lb30/j3;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast v3, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    check-cast p1, Lg/t;

    sget v0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->G:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object p1

    iget-object p1, p1, Lu10/q;->c:Ln53/e;

    iget-object p1, p1, Ln53/e;->y:Ll83/e;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/p;

    invoke-virtual {p1}, Lu10/p;->h()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->r()Lu10/q;

    move-result-object p1

    sget-object v0, Lu10/k;->b:Lu10/k;

    invoke-virtual {p1, v0}, Lu10/q;->a(Lu10/j;)V

    :cond_0
    return-object v2

    :pswitch_4
    check-cast v3, Lcom/whoop/network/request/HttpTimeoutConfig;

    check-cast p1, La63/f0;

    invoke-static {v3, p1}, Lu02/c;->a(Lcom/whoop/network/request/HttpTimeoutConfig;La63/f0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v3, Lu0/n1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, v3, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    add-float/2addr v1, p1

    iget-object v2, v3, Lu0/n1;->b:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v3

    cmpl-float v3, v1, v3

    if-lez v3, :cond_1

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result p1

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    sub-float/2addr p1, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result p1

    neg-float p1, p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Lp1/g1;->y(F)V

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast v3, Lf1/m;

    check-cast p1, Li3/z;

    sget-object v0, Lf1/p0;->c:Li3/y;

    new-instance v4, Lf1/o0;

    sget-object v5, Lu0/f0;->w:Lu0/f0;

    invoke-interface {v3}, Lf1/m;->a()J

    move-result-wide v6

    sget-object v8, Lf1/n0;->x:Lf1/n0;

    const/4 v9, 0x1

    invoke-direct/range {v4 .. v9}, Lf1/o0;-><init>(Lu0/f0;JLf1/n0;Z)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v4}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v2

    :pswitch_7
    check-cast v3, Lcom/whoop/whooplive/live/views/WhoopGraphView;

    check-cast p1, Lsj0/a;

    invoke-static {v3, p1}, Lcom/whoop/whooplive/live/views/WhoopGraphView;->b(Lcom/whoop/whooplive/live/views/WhoopGraphView;Lsj0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v3, Lth/e;

    check-cast p1, Ljava/io/IOException;

    const/4 p1, 0x1

    iput-boolean p1, v3, Lth/e;->L:Z

    return-object v2

    :pswitch_9
    check-cast v3, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;

    check-cast p1, Lxc2/b;

    invoke-static {v3, p1}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->z(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lxc2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v3, Lcom/whoop/design/models/items/datepicker/DatePickerModel;

    check-cast p1, Ljava/time/LocalDate;

    invoke-static {v3, p1}, Ltb1/a;->b(Lcom/whoop/design/models/items/datepicker/DatePickerModel;Ljava/time/LocalDate;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_3
    const/16 p1, 0x8

    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-object v2

    :pswitch_c
    check-cast v3, Lt21/d;

    check-cast p1, Lc0/q;

    invoke-static {v3, p1}, Lt21/g;->q(Lt21/d;Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast v3, Lt20/w;

    check-cast p1, Ljava/util/List;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    if-nez p1, :cond_4

    iget-object p1, v3, Lt20/w;->O:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :cond_4
    return-object p1

    :pswitch_e
    check-cast v3, Lrv2/h$b;

    check-cast p1, Ln0/q;

    invoke-static {v3, p1}, Lsv2/e;->t(Lrv2/h$b;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v3, Lmj1/b;

    check-cast p1, Lmj1/a;

    invoke-static {v3, p1}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->z(Lmj1/b;Lmj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v3, Lcom/whoop/healthconnect/view/HealthConnectFragment;

    check-cast p1, Lnj1/a;

    invoke-static {v3, p1}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->A(Lcom/whoop/healthconnect/view/HealthConnectFragment;Lnj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v3, Lsc3/p;

    iget-object v0, v3, Lsc3/p;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsc3/o;

    iget-object v3, v1, Lsc3/o;->a:Lsc3/r;

    iget-object v1, v1, Lsc3/o;->b:Ljava/lang/Object;

    invoke-virtual {v3, p1, v1}, Lsc3/r;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    return-object v2

    :pswitch_12
    check-cast v3, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v3, p1}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->B(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v3, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    check-cast p1, Lg/t;

    sget v0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->E:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object p1

    iget-object p1, p1, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object p1

    iget-object p1, p1, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->o()V

    :goto_3
    return-object v2

    :pswitch_14
    check-cast v3, Lt10/f;

    check-cast p1, Lzy/c;

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lt10/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_15
    check-cast v3, Lt10/f;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, p1}, Lt10/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_16
    check-cast v3, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v3, p1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->z(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast v3, Lsv0/a;

    invoke-static {v3, p1}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->A(Lsv0/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast v3, Lmc1/b;

    check-cast p1, Ljb1/b;

    invoke-static {v3, p1}, Lru1/a;->a(Lmc1/b;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v3, Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v3, p1}, Lrq0/t0;->R(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v3, Leq0/x1;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v3, p1}, Lrq0/t0;->W(Leq0/x1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast v3, Lrq0/b0;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v3, p1}, Lrq0/b0;->g(Lrq0/b0;Lcom/whoop/data/remote/commons/Resource;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v3, Lrq0/y;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v3, p1}, Lrq0/y;->w(Lrq0/y;Lcom/whoop/data/remote/commons/Resource;)Ll83/a0;

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
