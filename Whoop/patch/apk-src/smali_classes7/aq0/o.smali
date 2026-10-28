.class public final synthetic Laq0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Laq0/o;->w:I

    iput-object p1, p0, Laq0/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, Laq0/o;->w:I

    const-string v2, "result"

    const-string v4, ": "

    const-string v5, "Google Pay failed with error "

    const-string v6, "status_code"

    const-string v7, "status_message"

    const/16 v8, 0x10

    const-string v9, ""

    const/4 v11, 0x2

    const-string v12, "it"

    iget-object v13, v0, Laq0/o;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v13, Lza2/j;

    move-object/from16 v1, p1

    check-cast v1, Lj/a;

    invoke-static {v13, v1}, Lza2/j;->B(Lza2/j;Lj/a;)V

    return-void

    :pswitch_0
    check-cast v13, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;

    move-object/from16 v1, p1

    check-cast v1, Landroid/net/Uri;

    invoke-static {v13, v1}, Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;->y(Lcom/whoop/whoopaction/view/DownloadedFileExportFragment;Landroid/net/Uri;)V

    return-void

    :pswitch_1
    check-cast v13, Lcom/whoop/community/CommunityManageTeamFragment;

    move-object/from16 v1, p1

    check-cast v1, Landroid/net/Uri;

    invoke-static {v13, v1}, Lcom/whoop/community/CommunityManageTeamFragment;->P(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/net/Uri;)V

    return-void

    :pswitch_2
    check-cast v13, Lcom/whoop/community/CommunityLandingHostFragment;

    move-object/from16 v1, p1

    check-cast v1, Lj/a;

    invoke-static {v13, v1}, Lcom/whoop/community/CommunityLandingHostFragment;->W(Lcom/whoop/community/CommunityLandingHostFragment;Lj/a;)V

    return-void

    :pswitch_3
    check-cast v13, Lq00/h0;

    move-object/from16 v1, p1

    check-cast v1, Lz10/r;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lz10/o;

    if-eqz v2, :cond_0

    sget-object v1, Lz10/g;->w:Lz10/g;

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lz10/p;

    if-eqz v2, :cond_2

    check-cast v1, Lz10/p;

    iget-object v1, v1, Lz10/p;->w:Lz10/n;

    iget-object v2, v1, Lz10/n;->y:Lz10/l;

    if-nez v2, :cond_1

    new-instance v1, Lz10/i;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "instant debits data cannot be null"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lz10/i;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    new-instance v4, Lz10/h;

    iget-object v5, v1, Lz10/n;->w:Ly00/c8;

    iget-object v6, v2, Lz10/l;->w:Ly00/o4;

    iget-object v7, v2, Lz10/l;->x:Ljava/lang/String;

    iget-object v8, v2, Lz10/l;->y:Ljava/lang/String;

    iget-boolean v9, v2, Lz10/l;->z:Z

    invoke-direct/range {v4 .. v9}, Lz10/h;-><init>(Ly00/c8;Ly00/o4;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v1, v4

    goto :goto_0

    :cond_2
    instance-of v2, v1, Lz10/q;

    if-eqz v2, :cond_3

    new-instance v2, Lz10/i;

    check-cast v1, Lz10/q;

    iget-object v1, v1, Lz10/q;->w:Ljava/lang/Throwable;

    invoke-direct {v2, v1}, Lz10/i;-><init>(Ljava/lang/Throwable;)V

    move-object v1, v2

    :goto_0
    invoke-virtual {v13, v1}, Lq00/h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_4
    check-cast v13, Lcom/whoop/archv2/feature/view/GenericFragment;

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/Set;

    invoke-static {v13, v1}, Lcom/whoop/archv2/feature/view/GenericFragment;->y(Lcom/whoop/archv2/feature/view/GenericFragment;Ljava/util/Set;)V

    return-void

    :pswitch_5
    check-cast v13, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    iget-object v1, v13, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->x:Ll83/p;

    move-object/from16 v2, p1

    check-cast v2, Lfq/a;

    sget v12, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->z:I

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v12, v2, Lfq/a;->b:Lcom/google/android/gms/common/api/Status;

    iget v14, v12, Lcom/google/android/gms/common/api/Status;->w:I

    if-eqz v14, :cond_a

    if-eq v14, v8, :cond_9

    iget-object v2, v12, Lcom/google/android/gms/common/api/Status;->x:Ljava/lang/String;

    if-nez v2, :cond_4

    move-object v8, v9

    goto :goto_1

    :cond_4
    move-object v8, v2

    :goto_1
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Lb20/f;

    sget-object v15, Lb20/c;->U:Lb20/c;

    new-instance v10, Ll83/k;

    invoke-direct {v10, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v7}, [Ll83/k;

    move-result-object v7

    invoke-static {v7}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v3, v15, v8, v7, v11}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v7, 0x11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v7, 0x14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    const/16 v7, 0x195

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v7, 0x199

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    const/16 v7, 0x19c

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    filled-new-array/range {v19 .. v25}, [Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    sget-object v7, Lb20/e;->H:Lb20/e;

    invoke-static {v6, v12}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v1, v7, v8, v6, v11}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :cond_5
    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->p()Lsz/p0;

    move-result-object v1

    new-instance v6, Lsz/f0;

    new-instance v7, Ljava/lang/RuntimeException;

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    move-object v9, v2

    :goto_2
    invoke-static {v14, v5, v4, v9}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x7

    if-eq v14, v2, :cond_7

    if-eq v14, v3, :cond_8

    const/4 v11, 0x1

    goto :goto_3

    :cond_7
    const/4 v11, 0x3

    :cond_8
    :goto_3
    invoke-direct {v6, v11, v7}, Lsz/f0;-><init>(ILjava/lang/Throwable;)V

    iget-object v1, v1, Lsz/p0;->H:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    invoke-virtual {v1, v8, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    const/4 v8, 0x0

    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->p()Lsz/p0;

    move-result-object v1

    iget-object v1, v1, Lsz/p0;->H:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lsz/d0;->w:Lsz/d0;

    invoke-virtual {v1, v8, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    iget-object v2, v2, Lfq/a;->a:Ljava/lang/Object;

    check-cast v2, Ldq/l;

    if-eqz v2, :cond_b

    invoke-static {v13}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v3, Ln43/a;

    const/16 v4, 0x16

    invoke-direct {v3, v13, v2, v8, v4}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v1, v8, v8, v3, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_4

    :cond_b
    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    sget-object v2, Lb20/e;->I:Lb20/e;

    const/4 v3, 0x6

    invoke-static {v1, v2, v8, v8, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v1, Lsz/f0;

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Google Pay failed with missing data."

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2}, Lsz/f0;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->p()Lsz/p0;

    move-result-object v2

    iget-object v2, v2, Lsz/p0;->H:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v8, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_4
    return-void

    :pswitch_6
    check-cast v13, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    iget-object v1, v13, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->x:Ll83/p;

    move-object/from16 v2, p1

    check-cast v2, Lfq/a;

    sget v3, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->z:I

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v2, Lfq/a;->b:Lcom/google/android/gms/common/api/Status;

    iget v10, v3, Lcom/google/android/gms/common/api/Status;->w:I

    const/4 v12, 0x0

    if-eqz v10, :cond_f

    if-eq v10, v8, :cond_e

    iget-object v2, v3, Lcom/google/android/gms/common/api/Status;->x:Ljava/lang/String;

    if-nez v2, :cond_c

    move-object v3, v9

    goto :goto_5

    :cond_c
    move-object v3, v2

    :goto_5
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    sget-object v14, Lb20/c;->U:Lb20/c;

    new-instance v15, Ll83/k;

    invoke-direct {v15, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v15, v3}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v1, v14, v12, v3, v11}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    new-instance v3, Lsz/n;

    new-instance v6, Ljava/lang/RuntimeException;

    if-nez v2, :cond_d

    goto :goto_6

    :cond_d
    move-object v9, v2

    :goto_6
    invoke-static {v10, v5, v4, v9}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v6}, Lsz/n;-><init>(Ljava/lang/Throwable;)V

    iget-object v1, v1, Lsz/z;->K:Lec3/w1;

    invoke-virtual {v1, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_e
    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    sget-object v2, Lsz/l;->w:Lsz/l;

    iget-object v1, v1, Lsz/z;->K:Lec3/w1;

    invoke-virtual {v1, v2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_f
    iget-object v2, v2, Lfq/a;->a:Ljava/lang/Object;

    check-cast v2, Ldq/l;

    if-eqz v2, :cond_12

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, v2, Ldq/l;->G:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v12}, Lt9/p;->i(Lorg/json/JSONObject;Ly00/n;)Ly00/d5;

    move-result-object v19

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-le v1, v2, :cond_11

    :cond_10
    move-object v1, v12

    goto :goto_7

    :cond_11
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Landroid/view/Window;->getStatusBarColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_7
    new-instance v2, Ls40/a;

    invoke-direct {v2, v13, v1}, Ls40/a;-><init>(Lg/l;Ljava/lang/Integer;)V

    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v3

    iget-object v4, v1, Lsz/z;->J:Lq83/j;

    new-instance v17, Ln43/a;

    const/16 v22, 0x14

    move-object/from16 v18, v1

    move-object/from16 v20, v2

    move-object/from16 v21, v12

    invoke-direct/range {v17 .. v22}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v1, v17

    move-object/from16 v2, v21

    invoke-static {v3, v4, v2, v1, v11}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_8

    :cond_12
    move-object v2, v12

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb20/f;

    sget-object v3, Lb20/e;->I:Lb20/e;

    const/4 v4, 0x6

    invoke-static {v1, v3, v2, v2, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-virtual {v13}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    new-instance v2, Lsz/n;

    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Google Pay missing result data."

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lsz/n;-><init>(Ljava/lang/Throwable;)V

    iget-object v1, v1, Lsz/z;->K:Lec3/w1;

    invoke-virtual {v1, v2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :goto_8
    return-void

    :pswitch_7
    check-cast v13, Lcom/whoop/community/presentation/teams/b;

    move-object/from16 v1, p1

    check-cast v1, Landroid/net/Uri;

    invoke-static {v13, v1}, Lcom/whoop/community/presentation/teams/b;->S(Lcom/whoop/community/presentation/teams/b;Landroid/net/Uri;)V

    return-void

    :pswitch_8
    check-cast v13, Lcom/whoop/education/view/EducationFragment;

    move-object/from16 v1, p1

    check-cast v1, Lj/a;

    invoke-static {v13, v1}, Lcom/whoop/education/view/EducationFragment;->E(Lcom/whoop/education/view/EducationFragment;Lj/a;)V

    return-void

    :pswitch_9
    check-cast v13, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    move-object/from16 v1, p1

    check-cast v1, Lj/a;

    invoke-static {v13, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->T(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Lj/a;)V

    return-void

    :pswitch_a
    check-cast v13, Lcom/whoop/stress/view/StressSessionFragment;

    move-object/from16 v1, p1

    check-cast v1, Lj/a;

    invoke-static {v13, v1}, Lcom/whoop/stress/view/StressSessionFragment;->B(Lcom/whoop/stress/view/StressSessionFragment;Lj/a;)V

    return-void

    :pswitch_b
    check-cast v13, Ly10/d;

    move-object/from16 v1, p1

    check-cast v1, Ljz/o;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v13, Ly10/d;->w:La1/e;

    invoke-virtual {v2, v1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_c
    check-cast v13, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v13, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;->F(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/FileAttachmentFragment;Ljava/util/List;)V

    return-void

    :pswitch_d
    check-cast v13, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;

    move-object/from16 v1, p1

    check-cast v1, Ljava/io/File;

    invoke-static {v13, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;->y(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/camera/internal/CameraAttachmentFragment;Ljava/io/File;)V

    return-void

    :pswitch_e
    check-cast v13, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;

    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;

    invoke-static {v13, v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;->a(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryDestination;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult;)V

    return-void

    :pswitch_f
    check-cast v13, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    move-object/from16 v1, p1

    check-cast v1, Landroid/net/Uri;

    invoke-static {v13, v1}, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;->D(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;Landroid/net/Uri;)V

    return-void

    :pswitch_10
    const/4 v8, 0x0

    check-cast v13, Li20/y0;

    move-object/from16 v1, p1

    check-cast v1, Li20/f0;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v13, Li20/y0;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Li20/f0;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_19

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li20/n1;

    if-eqz v3, :cond_19

    instance-of v4, v1, Li20/e0;

    if-eqz v4, :cond_13

    new-instance v4, Li20/g0;

    move-object v5, v1

    check-cast v5, Li20/e0;

    iget-object v5, v5, Li20/e0;->x:Lh20/x0;

    invoke-direct {v4, v5}, Li20/g0;-><init>(Lh20/x0;)V

    goto :goto_9

    :cond_13
    instance-of v4, v1, Li20/d0;

    if-eqz v4, :cond_18

    new-instance v4, Li20/h0;

    move-object v5, v1

    check-cast v5, Li20/d0;

    iget-object v5, v5, Li20/d0;->x:Lh20/x0;

    invoke-direct {v4, v5}, Li20/h0;-><init>(Lh20/x0;)V

    :goto_9
    invoke-interface {v4}, Li20/i0;->a()Lh20/x0;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-static {v5}, Li20/l1;->o(Lh20/x0;)Ljava/util/Map;

    move-result-object v5

    goto :goto_a

    :cond_14
    move-object v5, v8

    :goto_a
    instance-of v6, v4, Li20/g0;

    if-eqz v6, :cond_15

    new-instance v4, Lg40/w;

    invoke-direct {v4, v5}, Lg40/w;-><init>(Ljava/util/Map;)V

    goto :goto_c

    :cond_15
    instance-of v4, v4, Li20/h0;

    if-eqz v4, :cond_17

    if-eqz v5, :cond_16

    new-instance v10, Lg40/x;

    invoke-direct {v10, v5}, Lg40/x;-><init>(Ljava/util/Map;)V

    goto :goto_b

    :cond_16
    move-object v10, v8

    :goto_b
    move-object v4, v10

    :goto_c
    if-eqz v4, :cond_19

    iget-object v3, v3, Li20/n1;->y:Leg/j;

    if-eqz v3, :cond_19

    invoke-virtual {v3, v4}, Leg/j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_17
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_18
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_19
    :goto_d
    invoke-virtual {v1}, Li20/f0;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_11
    check-cast v13, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    move-object/from16 v1, p1

    check-cast v1, Lv10/b;

    sget v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v1}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->o(Lv10/b;)V

    return-void

    :pswitch_12
    check-cast v13, Lcom/whoop/profile/view/edit/n;

    move-object/from16 v1, p1

    check-cast v1, Lq30/a0;

    sget v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;->z:I

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v1}, Lcom/whoop/profile/view/edit/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_13
    check-cast v13, Lg20/q;

    move-object/from16 v1, p1

    check-cast v1, Lay/s;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lay/q;

    if-eqz v2, :cond_1a

    new-instance v3, Lv10/b;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    check-cast v1, Lay/q;

    iget-object v1, v1, Lay/q;->w:Ljava/lang/Throwable;

    invoke-static {v1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v6

    const/4 v9, 0x0

    const/16 v10, 0x79

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    goto :goto_e

    :cond_1a
    instance-of v2, v1, Lay/r;

    if-eqz v2, :cond_1b

    new-instance v3, Lv10/b;

    check-cast v1, Lay/r;

    iget-object v4, v1, Lay/r;->w:Ljava/lang/String;

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    :goto_e
    invoke-virtual {v13, v3}, Lg20/q;->a(Ljava/lang/Object;)V

    return-void

    :cond_1b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_14
    check-cast v13, Laq0/q;

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v13, v1}, Laq0/q;->p0(Laq0/q;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
