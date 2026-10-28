.class public final synthetic Lq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lq;->w:I

    iput-object p1, p0, Lq;->x:Ljava/lang/Object;

    iput-object p2, p0, Lq;->y:Ljava/lang/Object;

    iput-object p3, p0, Lq;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lq;->w:I

    iput-object p1, p0, Lq;->x:Ljava/lang/Object;

    iput-object p2, p0, Lq;->z:Ljava/lang/Object;

    iput-object p3, p0, Lq;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lq;->w:I

    iput-object p1, p0, Lq;->z:Ljava/lang/Object;

    iput-object p2, p0, Lq;->x:Ljava/lang/Object;

    iput-object p3, p0, Lq;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lq;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lcp1/a;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, v2, p1}, Lep1/c;->a(Lcp1/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lbc0/c$d;

    check-cast p1, Lmf0/a;

    invoke-static {v0, v1, v2, p1}, Ldc0/e;->h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc0/c$d;Lmf0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lb62/b;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    invoke-static {v0, v1, v2, p1}, Ld62/c;->a(Lb62/b;Lkotlin/jvm/functions/Function1;Ll83/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Ld21/c;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Ld21/b;->b(Lkotlin/jvm/functions/Function1;Ld21/c;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Ldu1/a;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;

    check-cast p1, Lnt1/a$c;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;->z(Leb/a0;Ldu1/a;Lcom/whoop/labrador/fragment/LabradorEligibilityFragment;Lnt1/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lbt1/f;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lss1/a;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lct1/a;->d(Lbt1/f;Lss1/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lcq0/e;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/p0;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/p0;

    check-cast p1, Lcom/whoop/data/remote/commons/ApiResponse;

    invoke-static {v0, v1, v2, p1}, Lcq0/e;->i(Lcq0/e;Landroidx/lifecycle/p0;Landroidx/lifecycle/p0;Lcom/whoop/data/remote/commons/ApiResponse;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lp1/a1;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lp1/a1;

    check-cast p1, Ly3/l;

    invoke-static {v0, v1, v2, p1}, Lcp0/x0;->x(Lp1/a1;Lp1/t2;Lp1/a1;Ly3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->g(Lp1/t2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Ll1/g1;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->c(Ll1/g1;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lf31/a;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/settings/ConcisenessMode;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/bot/settings/CoachSettingsConcisenessContentKt;->a(Lf31/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/ConcisenessMode;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lf31/a;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/bot/settings/CoachingMode;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeKt;->d(Lf31/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/settings/CoachingMode;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Ldp0/g;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lzk1/c;

    check-cast p1, Lcom/whoop/navigation/AiAction;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->A(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Ldp0/g;Lzk1/c;Lcom/whoop/navigation/AiAction;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Li2/s0;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Li2/t;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lc51/s;

    check-cast p1, Lk2/c;

    invoke-static {v0, v1, v2, p1}, Lc51/k;->a(Li2/s0;Li2/t;Lc51/s;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lc42/r;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, La42/a;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/pregnancy/view/PregnancySettingsFragment;->g0(Lc42/r;La42/a;Lcom/whoop/pregnancy/view/PregnancySettingsFragment;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lq;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/util/List;

    iget-object v2, p0, Lq;->x:Ljava/lang/Object;

    invoke-static {v2, v0, v1, p1}, Lbs1/c0;->A(Ljava/lang/Object;Lp1/c1;Lp1/c1;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lds1/k;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lbs1/c0;->c0(Lds1/k;Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Ll83/k;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    check-cast p1, Lg1/b2;

    invoke-static {v0, v1, v2, p1}, Lbp0/s;->F(Lq2/a;Ll83/k;Lc93/m;Lg1/b2;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lyf0/a;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lyf0/c;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lzf0/a;

    invoke-static {v0, v1, v2, p1}, Lbg0/i;->d(Lyf0/a;Lyf0/c;Ll83/h;Lzf0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lb41/f;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lb41/d;->i(Lb41/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/m0;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    check-cast p1, Landroid/view/View;

    const v3, 0x7f0a01ce

    invoke-virtual {p1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lec/a;

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_5

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v0

    goto :goto_3

    :cond_2
    :goto_1
    instance-of v0, v2, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_3

    check-cast v2, Landroidx/fragment/app/r0;

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v3

    :cond_4
    :goto_3
    new-instance v0, La1/b;

    const/16 v1, 0x12

    invoke-direct {v0, v3, v1}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lb4/n;->j(Landroid/view/ViewGroup;La1/b;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Le30/c;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lv00/c0;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Ld30/a;

    check-cast p1, Ljava/lang/String;

    const-string v3, "it"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v2}, Ls7/a;->c(Le30/c;Lv00/c0;Ljava/lang/String;Ld30/a;)Lt20/n;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Lwy1/b;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Lc31/c;

    invoke-static {v0, v1, v2, p1}, Laz1/g;->k(Lkotlin/jvm/functions/Function1;Lwy1/b;Ljava/lang/String;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lay/i;

    check-cast p1, Landroid/content/Context;

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lay/c0;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebViewClient;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    const-string v0, "handler"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Android"

    invoke-virtual {p1, v2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lzt1/c$c;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, p1}, Lau1/q;->m(Lzt1/c$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lys2/e;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, v2, p1}, Lat2/m;->G(Lys2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lyp1/b$c;

    iget-object v1, p0, Lq;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Laq1/f;->j(Lyp1/b$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lq;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lq;->y:Ljava/lang/Object;

    check-cast v2, Lam2/p0;

    invoke-static {v0, v1, v2, p1}, Lam2/o0;->P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lam2/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lx70/a;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lx70/c;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Ly70/a;

    invoke-static {v0, v1, v2, p1}, La80/m;->a(Lx70/a;Lx70/c;Ll83/h;Ly70/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lq;->x:Ljava/lang/Object;

    check-cast v0, Lpv0/d;

    iget-object v1, p0, Lq;->y:Ljava/lang/Object;

    check-cast v1, Lpv0/d;

    iget-object v2, p0, Lq;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    const-string v3, "$this$LazyColumn"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpv0/d;->l()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ls;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6}, Ls;-><init>(Ljava/lang/Object;I)V

    new-instance v6, Lh00/a0;

    const/4 v7, 0x2

    invoke-direct {v6, v3, v2, v7}, Lh00/a0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    new-instance v3, Lx1/b;

    const/4 v7, 0x1

    const v8, 0x2fd4df92

    invoke-direct {v3, v6, v7, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v6, p1

    check-cast v6, Ln0/f;

    const/4 v8, 0x0

    invoke-virtual {v6, v4, v8, v5, v3}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    invoke-virtual {v0}, Lpv0/d;->d()Lnv0/d;

    move-result-object v3

    sget-object v4, Lnv0/d;->FETCHING_NEXT_PAGE:Lnv0/d;

    const/4 v5, 0x3

    if-ne v3, v4, :cond_6

    sget-object v3, Lg;->a:Lx1/b;

    invoke-static {p1, v8, v3, v5}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_6
    invoke-virtual {v0}, Lpv0/d;->d()Lnv0/d;

    move-result-object v3

    sget-object v4, Lnv0/d;->FETCH_NEXT_PAGE_ERROR:Lnv0/d;

    if-ne v3, v4, :cond_7

    new-instance v3, Ll;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, v2}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Lx1/b;

    const v6, 0x3f4d8e1

    invoke-direct {v4, v3, v7, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p1, v8, v4, v5}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_7
    invoke-virtual {v0}, Lpv0/d;->l()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v1}, Lpv0/d;->n()Z

    move-result p1

    if-nez p1, :cond_8

    new-instance v3, Llv0/a$d;

    invoke-virtual {v1}, Lpv0/d;->k()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Llv0/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
