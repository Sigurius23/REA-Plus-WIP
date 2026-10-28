.class public final synthetic Lno0/j0;
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
.method public synthetic constructor <init>(Lc93/a;Ll83/e;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lno0/j0;->w:I

    iput-object p1, p0, Lno0/j0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lno0/j0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lno0/j0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lno0/j0;->w:I

    iput-object p1, p0, Lno0/j0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lno0/j0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lno0/j0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 3
    iput p4, p0, Lno0/j0;->w:I

    iput-object p1, p0, Lno0/j0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lno0/j0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lno0/j0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, Lno0/j0;->w:I

    iput-object p1, p0, Lno0/j0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lno0/j0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lno0/j0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lno0/j0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lno0/j0;->z:Ljava/lang/Object;

    iget-object v3, p0, Lno0/j0;->y:Ljava/lang/Object;

    iget-object v4, p0, Lno0/j0;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Ls41/b;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v4, v3, v2, p1}, Ls41/a;->b(Lkotlin/jvm/functions/Function1;Ls41/b;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v3, Lty2/a$a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v3, v4, v2, p1}, Lry2/f;->f(Lty2/a$a;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v4, Lld1/c;

    check-cast v3, Lp1/c1;

    check-cast v2, Lp1/c1;

    invoke-static {v4, v3, v2, p1}, Lrm1/i;->l(Lld1/c;Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast v4, Landroid/content/Context;

    check-cast v3, Lrm/k;

    check-cast v2, Lp1/c1;

    check-cast p1, Landroid/content/Context;

    invoke-static {v4, v3, v2, p1}, Lre1/j;->u(Landroid/content/Context;Lrm/k;Lp1/c1;Landroid/content/Context;)Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast v4, Lne1/b;

    check-cast v3, Lcom/whoop/education/view/EducationFragment;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Lne1/a;

    invoke-static {v4, v3, v2, p1}, Lcom/whoop/education/view/EducationFragment;->F(Lne1/b;Lcom/whoop/education/view/EducationFragment;Ljava/lang/String;Lne1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast v3, Lr80/e;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lr80/f;

    check-cast p1, Lr80/a;

    invoke-static {v3, v4, v2, p1}, Lr80/d;->a(Lr80/e;Lkotlin/jvm/functions/Function1;Lr80/f;Lr80/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v4, Lng0/a;

    check-cast v3, Lng0/c;

    check-cast v2, Ll83/h;

    check-cast p1, Log0/a;

    invoke-static {v4, v3, v2, p1}, Lqg0/e;->d(Lng0/a;Lng0/c;Ll83/h;Log0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast v3, Lpd2/f;

    check-cast v2, Lld2/a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2, v4, p1}, Lqd2/a;->h(Lpd2/f;Lld2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast v4, Landroidx/lifecycle/g0;

    check-cast v3, Lq81/b;

    check-cast v2, Lp1/c1;

    check-cast p1, Lp1/i0;

    invoke-static {v4, v3, v2, p1}, Lq81/a;->c(Landroidx/lifecycle/g0;Lq81/b;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast v3, Lm62/e;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4, v2, p1}, Lq62/a;->b(Lm62/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast v4, Ljava/lang/String;

    check-cast v3, Lp6/b;

    check-cast v2, Lo6/f;

    check-cast p1, Lr6/a;

    sget v0, Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;->a:I

    invoke-static {}, Lr6/k;->t()Lr6/j;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v5, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v5, Lr6/k;

    invoke-static {v5, v4}, Lr6/k;->n(Lr6/k;Ljava/lang/String;)V

    iget v3, v3, Lp6/b;->a:I

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v4, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v4, Lr6/k;

    invoke-static {v4, v3}, Lr6/k;->o(Lr6/k;I)V

    iget-object v2, v2, Lo6/f;->a:Ljava/util/LinkedHashMap;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo6/c;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v5, Lo6/c;->a:Ljava/lang/String;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    new-array v4, v2, [Ll83/k;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll83/k;

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ll83/k;

    invoke-static {v3}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v5, "ActionCallbackBroadcastReceiver:parameters"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v3

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v4}, Landroid/os/Parcel;->marshall()[B

    move-result-object v3

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    array-length v4, v3

    invoke-static {v3, v2, v4}, Landroidx/glance/appwidget/protobuf/i;->d([BII)Landroidx/glance/appwidget/protobuf/h;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v0, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/k;

    invoke-static {v3, v2}, Lr6/k;->p(Lr6/k;Landroidx/glance/appwidget/protobuf/h;)V

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/k;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->r(Lr6/n;Lr6/k;)V

    return-object v1

    :pswitch_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lq31/f;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v4, v3, v2, p1}, Lq31/d;->e(Lkotlin/jvm/functions/Function1;Lq31/f;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v4, Lch0/v0;

    check-cast v3, Lbc3/c0;

    check-cast v2, Ldp0/g;

    check-cast p1, Lp1/i0;

    invoke-static {v4, v3, v2, p1}, Lq12/d;->g(Lch0/v0;Lbc3/c0;Ldp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lbc3/c0;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lq00/f;

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lh00/v;

    const/4 v0, 0x3

    const/4 v4, 0x0

    invoke-direct {p1, v0, v2, v4}, Lh00/v;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v3, v4, v4, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v1

    :pswitch_d
    check-cast v2, Lc93/a;

    check-cast v4, Lc93/a;

    check-cast v3, Lc93/a;

    check-cast p1, Lq00/v;

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq00/t;

    if-eqz v0, :cond_1

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lq00/s;

    if-eqz v0, :cond_2

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_2
    instance-of p1, p1, Lq00/u;

    if-eqz p1, :cond_3

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_1
    return-object v1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_e
    check-cast v3, Lot2/r;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v3, v4, v2, p1}, Lpt2/y;->j(Lot2/r;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast v4, Lmp2/a;

    check-cast v3, Lmp2/b;

    check-cast v2, Ll83/h;

    check-cast p1, Lnp2/a;

    invoke-static {v4, v3, v2, p1}, Lpp2/p;->f(Lmp2/a;Lmp2/b;Ll83/h;Lnp2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast v4, Lcom/whoop/stress/view/StressSessionFragment;

    check-cast v3, Llj2/g;

    check-cast v2, Lp1/t2;

    check-cast p1, Leb/s0;

    invoke-static {v4, v3, v2, p1}, Lcom/whoop/stress/view/StressSessionFragment;->D(Lcom/whoop/stress/view/StressSessionFragment;Llj2/g;Lp1/t2;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast v4, Lmh1/a;

    check-cast v3, Lmh1/c;

    check-cast v2, Ll83/h;

    check-cast p1, Lnh1/a;

    invoke-static {v4, v3, v2, p1}, Lph1/k;->b(Lmh1/a;Lmh1/c;Ll83/h;Lnh1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast v2, Lc93/a;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lr51/f;

    invoke-static {v2, v4, v3, p1}, Lph1/i;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Lr51/f;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lp41/j;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v4, v3, v2, p1}, Lp41/i;->c(Lkotlin/jvm/functions/Function1;Lp41/j;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast v4, Loy2/e;

    check-cast v3, Loy2/l$b;

    check-cast v2, Loy2/p;

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {v4, v3, v2, p1}, Loy2/e;->n(Loy2/e;Loy2/l$b;Loy2/p;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast v4, Leb/a0;

    check-cast v3, Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;

    check-cast v2, Lpe2/b;

    check-cast p1, Lge2/d$c;

    invoke-static {v4, v3, v2, p1}, Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;->y(Leb/a0;Lcom/whoop/shepherd/fragment/ShepherdTermsOfUseFragment;Lpe2/b;Lge2/d$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast v4, Leb/a0;

    check-cast v3, Lpe2/b;

    check-cast v2, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;

    check-cast p1, Lme2/a$c;

    invoke-static {v4, v3, v2, p1}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->A(Leb/a0;Lpe2/b;Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Lme2/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast v4, Leb/a0;

    check-cast v3, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;

    check-cast v2, Lpe2/b;

    check-cast p1, Lxd2/h$l;

    invoke-static {v4, v3, v2, p1}, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;->A(Leb/a0;Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;Lpe2/b;Lxd2/h$l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast v3, Landroid/webkit/ValueCallback;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lc93/a;

    check-cast p1, Landroid/webkit/ValueCallback;

    invoke-static {v3, v4, v2, p1}, Lnz2/d;->a(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/webkit/ValueCallback;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast v3, Lk71/n;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4, v2, p1}, Lnw0/o;->s(Lk71/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast v4, Lko1/a;

    check-cast v3, Lko1/c;

    check-cast v2, Ll83/h;

    check-cast p1, Llo1/a;

    invoke-static {v4, v3, v2, p1}, Lno1/h;->b(Lko1/a;Lko1/c;Ll83/h;Llo1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast v3, Llo0/b0$b$e;

    check-cast v2, Lp1/c1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v3, v2, v4, p1}, Lno0/n0;->f(Llo0/b0$b$e;Lp1/c1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lio0/v;

    check-cast v2, Lc93/a;

    check-cast p1, Ljava/lang/String;

    invoke-static {v4, v3, v2, p1}, Lno0/l0;->r(Lkotlin/jvm/functions/Function1;Lio0/v;Lc93/a;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

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
