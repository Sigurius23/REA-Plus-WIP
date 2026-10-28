.class public final synthetic Llq0/d;
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

    .line 1
    iput p1, p0, Llq0/d;->w:I

    iput-object p2, p0, Llq0/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Llq0/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Llz/i;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Llq0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq0/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Llq0/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ln40/e;Leb/u0;Ljava/lang/String;)V
    .locals 0

    .line 3
    const/16 p3, 0x16

    iput p3, p0, Llq0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq0/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Llq0/d;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Llq0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/Team;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lnq0/g;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/Team;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/FeatureTeam;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lnq0/c;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/FeatureTeam;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lnm2/c;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lnm2/d;

    invoke-static {v0, v1, p1}, Lnm2/c;->j(Lnm2/c;Ljava/lang/String;Lnm2/d;)Lnm2/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lnm2/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->A(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->z(Lp1/t2;Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lnk1/d;

    invoke-static {v0, v1, p1}, Lnk1/c;->c(Lkotlin/jvm/functions/Function1;Lnk1/d;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;

    check-cast p1, Lj42/a;

    invoke-static {v0, v1, p1}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->y(Lp1/c1;Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Lj42/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Ln40/e;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    check-cast p1, Leb/y0;

    iget-boolean v2, v0, Ln40/e;->c:Z

    iput-boolean v2, p1, Leb/y0;->b:Z

    iget-object v0, v0, Ln40/e;->b:Ln40/i;

    if-eqz v0, :cond_1

    sget-object v2, Ln40/i;->a:Ln40/i;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Leb/a0;->k()Leb/r0;

    move-result-object v0

    iget v0, v0, Leb/n0;->H:I

    iput v0, p1, Leb/y0;->d:I

    const/4 v0, 0x0

    iput-boolean v0, p1, Leb/y0;->f:Z

    new-instance v0, Leb/k1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Leb/k1;->a:Z

    iget-boolean v1, v0, Leb/k1;->a:Z

    iput-boolean v1, p1, Leb/y0;->f:Z

    iget-boolean v0, v0, Leb/k1;->b:Z

    iput-boolean v0, p1, Leb/y0;->g:Z

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Lp1/i0;

    const-string v2, "$this$DisposableEffect"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ln40/a;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1}, Ln40/a;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance v1, Ld0/b2;

    const/4 v2, 0x2

    invoke-direct {v1, v2, v0, p1}, Ld0/b2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_8
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Le10/t0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ln10/m0;

    check-cast p1, Lux/e;

    const-string v2, "$this$createConfirmAction"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Le10/t0;->w:Ly00/d5;

    iget-object v3, v0, Le10/t0;->x:Ly00/u5;

    iget-object v0, v0, Le10/t0;->y:Ly00/j5;

    iget-object v1, v1, Ln10/m0;->b:Ly00/n;

    invoke-virtual {p1, v2, v3, v0, v1}, Lux/e;->c(Ly00/d5;Ly00/u5;Ly00/j5;Ly00/n;)Ly00/s;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Le10/u0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ln10/m0;

    move-object v2, p1

    check-cast v2, Lux/e;

    const-string p1, "$this$createConfirmAction"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Le10/u0;->w:Ly00/o4;

    iget-object v5, v0, Le10/u0;->x:Ly00/u5;

    new-instance v8, Ly00/a6;

    iget-object v3, v0, Le10/u0;->z:Ljava/lang/String;

    new-instance v4, Ly00/d;

    iget-object v0, v0, Le10/u0;->E:Ljava/lang/String;

    invoke-direct {v4, v0}, Ly00/d;-><init>(Ljava/lang/String;)V

    invoke-direct {v8, v3, v4}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    iget-object v9, v1, Ln10/m0;->b:Ly00/n;

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Ly00/o4;->w:Ljava/lang/String;

    iget-object v4, p1, Ly00/o4;->E:Ly00/f4;

    if-eqz v4, :cond_2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v9}, Lux/e;->a(Ljava/lang/String;Ly00/f4;Ly00/u5;Ly00/j5;Ly00/o;Ly00/a6;Ly00/n;)Ly00/s;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_a
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Ljx1/u;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ljx1/t;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lmx1/m;->f(Ljx1/u;Ljx1/t;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast p1, Lww1/c;

    invoke-static {v0, v1, p1}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->A(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Ll83/h;Lww1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/s0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lgf2/o;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lmp0/s0;->J(Lmp0/s0;Lgf2/o;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/b0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lgf2/h;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lmp0/b0;->I(Lmp0/b0;Lgf2/h;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lmp0/b0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/appcompat/widget/SwitchCompat;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lmp0/b0;->O(Lmp0/b0;Landroidx/appcompat/widget/SwitchCompat;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lmm1/c;

    invoke-static {v0, v1, p1}, Lmm1/b;->d(Lkotlin/jvm/functions/Function1;Lmm1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lji2/e;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lmi2/c;->c(Lkotlin/jvm/functions/Function1;Lji2/e;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lji2/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lmi2/c;->f(Lkotlin/jvm/functions/Function1;Lji2/c;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    check-cast p1, Lmc/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    check-cast v1, Ldc3/t;

    invoke-virtual {v1, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/service/push/PushService;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lzt/p;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/whoop/service/push/PushService;->l(Lcom/whoop/service/push/PushService;Lzt/p;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lm92/j;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lpg3/v0;

    invoke-static {v0, v1, p1}, Lm92/j;->a(Lm92/j;Ljava/lang/String;Lpg3/v0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Li2/a1;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ll1/g4;

    check-cast p1, Lf2/d;

    iget-object v2, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v2}, Lf2/b;->d()J

    move-result-wide v2

    iget-object v4, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, p1}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v0

    new-instance v2, Llq0/d;

    const/4 v3, 0x6

    invoke-direct {v2, v3, v0, v1}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, La0/a1;

    const/16 v1, 0x15

    invoke-direct {v0, v2, v1}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Li2/p0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ll1/g4;

    check-cast p1, Lk2/e;

    invoke-virtual {v1}, Ll1/g4;->a()J

    move-result-wide v1

    invoke-static {p1, v0, v1, v2}, Li2/w0;->q(Lk2/e;Li2/p0;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ll1/x4;

    check-cast p1, Lg2/v;

    new-instance v2, Lh20/i0;

    const/16 v3, 0x18

    const/4 v4, 0x0

    invoke-direct {v2, p1, v1, v4, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Ljz1/c;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Llz1/b;->h(Ljz1/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v1, Llz/i;

    iget-object v2, v1, Llz/i;->z:Lkz/d;

    iget-object v3, v1, Llz/i;->y:Lbc3/z;

    check-cast p1, Llz/c;

    const-string v4, "state"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p1, Llz/c;->a:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v0, v4, v5}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v4, :cond_6

    invoke-static {v2}, Ltx/f;->N(Lkz/d;)Lkz/i;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    if-eq p1, v7, :cond_4

    if-ne p1, v8, :cond_3

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Llz/h;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v5, v9, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    invoke-static {p1, v3, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v2, Llz/a;

    invoke-direct {v2, v0, v1, v9}, Llz/a;-><init>(Ljava/lang/String;Llz/i;Lq83/d;)V

    invoke-static {p1, v9, v9, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_5
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Llz/h;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v5, v9, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    invoke-static {p1, v3, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_6
    iget-object p1, p1, Llz/c;->b:Ljava/lang/String;

    invoke-static {v0, p1, v5}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {v2}, Ltx/f;->N(Lkz/d;)Lkz/i;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_9

    if-eq p1, v7, :cond_8

    if-ne p1, v8, :cond_7

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Llz/h;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v7, v9, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    invoke-static {p1, v3, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lkd/f;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v9, v2}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v9, v9, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_9
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Llz/h;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v7, v9, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    invoke-static {p1, v3, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_a
    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v2, Lh20/i0;

    const/16 v3, 0x17

    invoke-direct {v2, v1, v0, v9, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v9, v9, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Li2/k0;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Li2/k0;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Llq2/p;->c(Li2/k0;Li2/k0;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Llq0/g;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Llq0/g;->k(Llq0/g;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Llq0/d;->x:Ljava/lang/Object;

    check-cast v0, Llq0/g;

    iget-object v1, p0, Llq0/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Llq0/g;->b(Llq0/g;Ljava/lang/String;Landroid/view/View;)Ll83/a0;

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
