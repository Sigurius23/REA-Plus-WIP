.class public final synthetic Lio/getstream/chat/android/ui/viewmodel/typing/a;
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

    iput p2, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/items/TextInputModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Llb1/t4;->b(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Li72/b;

    check-cast p1, Li72/a;

    invoke-static {v0, p1}, Lcom/whoop/sage/onboarding/view/SageOnboardingFragment;->E(Li72/b;Li72/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    check-cast p1, Lcom/whoop/achievements/celebration/b;

    invoke-static {v0, p1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->z(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;Lcom/whoop/achievements/celebration/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    const-string p1, "this$0"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lb9/b;->y:Ljava/lang/Object;

    check-cast p1, Llo/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Ll1/e2;

    check-cast p1, Lp1/i0;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    new-instance p1, Lb1/e;

    const/4 v1, 0x6

    invoke-direct {p1, v0, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    check-cast p1, Li2/g0;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0, p1}, Ll1/n2;->e(FLi2/g0;)F

    move-result v1

    invoke-static {v0, p1}, Ll1/n2;->f(FLi2/g0;)F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-nez v2, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    div-float v0, v1, v0

    :goto_0
    check-cast p1, Li2/x0;

    invoke-virtual {p1, v0}, Li2/x0;->r(F)V

    sget-wide v0, Ll1/n2;->c:J

    invoke-virtual {p1, v0, v1}, Li2/x0;->y(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Ll1/t1;

    check-cast p1, Lf2/d;

    iget-object v1, v0, Ll1/t1;->Z:Ld0/e;

    invoke-virtual {v1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/f;

    iget v1, v1, Ly3/f;->w:F

    invoke-virtual {p1}, Lf2/d;->getDensity()F

    move-result v2

    mul-float/2addr v2, v1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    iget-object v3, v0, Ll1/t1;->Y:Li2/a1;

    if-nez v3, :cond_1

    sget-object v3, Ll1/q3;->a:Lp1/u2;

    invoke-static {v0, v3}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/p3;

    sget-object v4, Lo1/m;->d:Lo1/t;

    invoke-static {v3, v4}, Ll1/q3;->a(Ll1/p3;Lo1/t;)Li2/a1;

    move-result-object v3

    :cond_1
    iget-object v4, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->d()J

    move-result-wide v4

    iget-object v6, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v6}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, p1}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v3

    invoke-static {v1, v3}, Li2/w0;->n(Li2/j;Li2/p0;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v3

    new-instance v4, Lh2/c;

    iget-object v5, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v5}, Lf2/b;->d()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    sub-float/2addr v5, v2

    iget-object v2, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v2}, Lf2/b;->d()J

    move-result-wide v9

    const/16 v2, 0x20

    shr-long/2addr v9, v2

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    iget-object v6, p1, Lf2/d;->w:Lf2/b;

    invoke-interface {v6}, Lf2/b;->d()J

    move-result-wide v9

    and-long v6, v9, v7

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    const/4 v7, 0x0

    invoke-direct {v4, v7, v5, v2, v6}, Lh2/c;-><init>(FFFF)V

    invoke-static {v3, v4}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    new-instance v1, Ljp1/c;

    const/16 v3, 0x12

    invoke-direct {v1, v3, v2, v0}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Ll83/k;

    check-cast p1, Li3/z;

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    check-cast p1, Ly2/i1;

    iget-object p1, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    check-cast v2, Ly2/s0;

    invoke-interface {v2}, Ly2/s0;->b()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lkr2/f;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lkr2/b;->c(Lkr2/f;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lkr2/g;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lkr2/b;->h(Lkr2/g;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lyc3/g;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt;->a(Lyc3/g;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/n0;

    check-cast p1, Lj93/d0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lj93/d0;->a:Lj93/e0;

    iget-object p1, p1, Lj93/d0;->b:Lj93/a0;

    if-nez v0, :cond_3

    const-string p1, "*"

    goto :goto_5

    :cond_3
    instance-of v1, p1, Lkotlin/jvm/internal/n0;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Lkotlin/jvm/internal/n0;

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    const/4 v2, 0x1

    if-eqz v1, :cond_6

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/n0;->a(Z)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    move-object p1, v1

    goto :goto_4

    :cond_6
    :goto_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_9

    if-eq v0, v2, :cond_8

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    const-string v0, "out "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    const-string v0, "in "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_9
    :goto_5
    return-object p1

    :pswitch_c
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lik1/g;

    check-cast p1, Lik1/f;

    invoke-static {v0, p1}, Lkk1/d;->e(Lik1/g;Lik1/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthspan/view/HealthspanFragment;

    check-cast p1, Ldk1/a;

    invoke-static {v0, p1}, Lcom/whoop/healthspan/view/HealthspanFragment;->B(Lcom/whoop/healthspan/view/HealthspanFragment;Ldk1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lhk1/c;

    check-cast p1, Lhk1/a;

    invoke-static {v0, p1}, Lcom/whoop/healthspan/view/HealthspanFragment;->y(Lhk1/c;Lhk1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lkc2/f;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {v0, p1}, Lkc2/f;->y(Lkc2/f;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lkb1/f;

    check-cast p1, Lkb1/e;

    invoke-static {v0, p1}, Lkb1/h;->a(Lkb1/f;Lkb1/e;)Lqy0/a;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lvx2/a;

    check-cast p1, Lrx2/a;

    invoke-static {v0, p1}, Ljx2/f;->d(Lvx2/a;Lrx2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Laz2/a;

    check-cast p1, Lwy2/a;

    invoke-static {v0, p1}, Ljx2/f;->q(Laz2/a;Lwy2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Luy2/a;

    check-cast p1, Lny2/a;

    invoke-static {v0, p1}, Ljx2/f;->z(Luy2/a;Lny2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lby2/a;

    check-cast p1, Lwx2/a;

    invoke-static {v0, p1}, Ljx2/f;->a(Lby2/a;Lwx2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Liz2/a;

    check-cast p1, Lcz2/a;

    invoke-static {v0, p1}, Ljx2/f;->e(Liz2/a;Lcz2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lly2/a;

    check-cast p1, Lhy2/a;

    invoke-static {v0, p1}, Ljx2/f;->D(Lly2/a;Lhy2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lqx2/a;

    check-cast p1, Llx2/a;

    invoke-static {v0, p1}, Ljx2/f;->v(Lqx2/a;Llx2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/models/HMSNotifications$PeerList;

    check-cast p1, Llive/hms/video/sdk/models/HMSRemotePeer;

    invoke-static {v0, p1}, Llive/hms/video/sdk/managers/ReconnectPeerListManager;->a(Llive/hms/video/sdk/models/HMSNotifications$PeerList;Llive/hms/video/sdk/models/HMSRemotePeer;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lj00/h;

    move-object v5, p1

    check-cast v5, Ln00/d;

    const-string p1, "signUpState"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lj00/h;->S:Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v7, v0, Lj00/h;->H:Lec3/h2;

    :cond_a
    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lj00/k;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x1

    if-eq v2, v3, :cond_c

    const/4 v3, 0x2

    if-ne v2, v3, :cond_b

    iget-object v2, v0, Lj00/h;->P:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lj00/h;->Q:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lj00/h;->R:Ln53/e;

    iget-object v4, v4, Ln53/e;->y:Ll83/e;

    check-cast v4, Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-boolean v6, v1, Lj00/k;->l:Z

    invoke-virtual {v0, v2, v3, v4, v6}, Lj00/h;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lj00/h0;

    move-result-object v2

    goto :goto_6

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_c
    iget-object v2, v1, Lj00/k;->a:Lj00/i0;

    :goto_6
    const/4 v4, 0x0

    const/16 v6, 0xbfe

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lj00/k;->a(Lj00/k;Lj00/i0;ZZLn00/d;I)Lj00/k;

    move-result-object v1

    invoke-virtual {v7, p1, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Liz0/g;->a(Lf0/r1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    invoke-static {v0, p1}, Liu2/b;->a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/typing/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelBinding;->a(Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Ljava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
