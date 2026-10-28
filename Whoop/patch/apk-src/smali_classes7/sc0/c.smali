.class public final synthetic Lsc0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lsc0/c;->w:I

    iput-object p1, p0, Lsc0/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    iget v0, v1, Lsc0/c;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lvt2/h;

    invoke-static {v0}, Lvt2/f;->i(Lvt2/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ljc/b0;

    iget-object v2, v0, Ljc/b0;->c:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Ljc/b0;->e:Ljava/lang/Object;

    check-cast v0, Lvg/g;

    new-instance v3, Lvb1/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lvb1/a;-><init>(I)V

    invoke-interface {v0, v3}, Lvg/g;->g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;

    invoke-static {v0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->z(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lm91/u;

    invoke-static {v0}, Lv41/g0;->b(Lm91/u;)Lm91/u;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lv3/d;

    iget-object v2, v0, Lv3/d;->y:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/e;

    iget-wide v5, v3, Lh2/e;->a:J

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v3, v5, v7

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/e;

    iget-wide v5, v3, Lh2/e;->a:J

    invoke-static {v5, v6}, Lh2/e;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lv3/d;->w:Li2/y0;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/e;

    iget-wide v2, v2, Lh2/e;->a:J

    invoke-virtual {v0, v2, v3}, Li2/y0;->b(J)Landroid/graphics/Shader;

    move-result-object v4

    :goto_0
    return-object v4

    :pswitch_4
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lv01/m;

    invoke-static {v0}, Lv01/l;->n(Lv01/m;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Luz1/o;

    invoke-static {v0}, Luz1/n;->c(Luz1/o;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/share/ShareDebugFragment;

    invoke-static {v0}, Lcom/whoop/debug/share/ShareDebugFragment;->y(Lcom/whoop/debug/share/ShareDebugFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;

    invoke-static {v0}, Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;->c(Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;)Lcom/whoop/cache/persistence/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;->z(Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "resolved endpoint: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;->B(Lcom/whoop/advancedlabs/rafReceiver/view/RafReceiverFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Luc3/m;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected end of input: yet to parse \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Luc3/m;->a:Ljava/lang/String;

    const/16 v3, 0x27

    invoke-static {v2, v0, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Luc3/f;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected end of input: yet to parse "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Luc3/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu40/h;

    invoke-interface {v2}, Lu40/h;->h()V

    goto :goto_1

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_e
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lu10/d;

    iget-object v0, v0, Lu10/d;->f:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu10/q;

    sget-object v2, Lu10/k;->b:Lu10/k;

    invoke-virtual {v0, v2}, Lu10/q;->a(Lu10/j;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_f
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ly3/k;

    invoke-virtual {v0}, Ly3/k;->b()J

    move-result-wide v2

    new-instance v0, Ly3/j;

    invoke-direct {v0, v2, v3}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_10
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lh0/d2;

    new-instance v3, Lu0/n1;

    invoke-direct {v3, v0, v2}, Lu0/n1;-><init>(Lh0/d2;F)V

    return-object v3

    :pswitch_12
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ll3/g;

    return-object v0

    :pswitch_13
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/lottietester/LottieTesterFragment;

    invoke-static {v0}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->y(Lcom/whoop/debug/lottietester/LottieTesterFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;

    invoke-static {v0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->C(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lt40/f;

    iget-object v0, v0, Lt40/f;->c:Lq30/u0;

    iget-object v0, v0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/Application;

    const-class v2, Lsr/a;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lsr/a;->a:Lsr/m;

    if-nez v3, :cond_4

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_3

    move-object v0, v3

    :cond_3
    new-instance v3, Lsr/m;

    invoke-direct {v3, v0}, Lsr/m;-><init>(Landroid/content/Context;)V

    sput-object v3, Lsr/a;->a:Lsr/m;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v0, Lsr/a;->a:Lsr/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v0, v0, Lsr/m;->w:Lxr/k;

    invoke-virtual {v0}, Lxr/k;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr/b;

    const-string v2, "createStandard(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :goto_3
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_16
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lt30/q;

    invoke-virtual {v0}, Landroid/app/Dialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0d064c

    invoke-virtual {v0, v2, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a0a20

    invoke-static {v0, v2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v3, :cond_5

    new-instance v2, Lk30/c;

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-direct {v2, v0, v3}, Lk30/c;-><init>(Landroid/widget/FrameLayout;Lcom/google/android/material/progressindicator/CircularProgressIndicator;)V

    return-object v2

    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/NullPointerException;

    const-string v3, "Missing required view with ID: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_17
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Ld30/f0;

    iget-object v0, v0, Ld30/f0;->b:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    sget-object v2, Ly00/f4;->G:Lt9/c0;

    const-string v2, "us_bank_account"

    invoke-virtual {v0, v2}, Lk20/a;->n(Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_18
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lsz/d;

    iget-object v2, v0, Lsz/d;->e:Lsz/e;

    iget-object v0, v0, Lsz/d;->a:Lsz/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "environment"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ld0/o2;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ld0/o2;-><init>(I)V

    iget v0, v0, Lsz/g;->w:I

    invoke-virtual {v3, v0}, Ld0/o2;->o(I)V

    new-instance v8, Ldq/t;

    invoke-direct {v8, v3}, Ldq/t;-><init>(Ld0/o2;)V

    iget-object v5, v2, Lsz/e;->a:Landroid/content/Context;

    new-instance v4, Ldq/p;

    sget-object v7, Ldq/u;->a:Lcom/google/android/gms/common/api/f;

    sget-object v9, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    new-instance v0, Lsz/b;

    invoke-direct {v0, v4}, Lsz/b;-><init>(Ldq/p;)V

    return-object v0

    :pswitch_19
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/debug/localservice/DebugLocalServiceFragment;

    invoke-static {v0}, Lcom/whoop/debug/localservice/DebugLocalServiceFragment;->z(Lcom/whoop/debug/localservice/DebugLocalServiceFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lrt1/g;

    invoke-static {v0}, Lst1/l;->b(Lrt1/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lsh/e;

    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iget-object v6, v0, Lsh/e;->b:Lfi/o;

    new-instance v7, Lsh/b;

    iget-object v8, v0, Lsh/e;->a:Lsh/q;

    invoke-interface {v8}, Lsh/q;->d1()Lne3/j;

    move-result-object v8

    invoke-direct {v7, v8}, Lsh/b;-><init>(Lne3/p0;)V

    invoke-static {v7}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v8

    const/4 v9, 0x1

    iput-boolean v9, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {v8}, Lne3/j0;->peek()Lne3/j0;

    move-result-object v10

    new-instance v11, Lne3/i0;

    invoke-direct {v11, v10}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-static {v11, v4, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget-object v10, v7, Lsh/b;->y:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Exception;

    if-nez v10, :cond_2c

    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    sget-object v10, Lsh/o;->a:Landroid/graphics/Paint;

    iget-object v10, v5, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    iget-object v0, v0, Lsh/e;->d:Lsh/n;

    iget v0, v0, Lsh/n;->a:I

    packed-switch v0, :pswitch_data_1

    :cond_6
    :goto_4
    move v0, v9

    goto :goto_5

    :pswitch_1c
    if-eqz v10, :cond_7

    const-string v0, "image/jpeg"

    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "image/webp"

    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "image/heic"

    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "image/heif"

    invoke-virtual {v10, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    move v0, v3

    :goto_5
    if-eqz v0, :cond_8

    new-instance v0, Lk6/g;

    new-instance v10, Lsh/m;

    invoke-virtual {v8}, Lne3/j0;->peek()Lne3/j0;

    move-result-object v11

    new-instance v12, Lne3/i0;

    invoke-direct {v12, v11}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {v10, v12}, Lsh/m;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v10}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    new-instance v10, Lsh/l;

    invoke-virtual {v0}, Lk6/g;->p()Z

    move-result v11

    invoke-virtual {v0}, Lk6/g;->l()I

    move-result v0

    invoke-direct {v10, v11, v0}, Lsh/l;-><init>(ZI)V

    goto :goto_6

    :cond_8
    sget-object v10, Lsh/l;->c:Lsh/l;

    :goto_6
    iget v0, v10, Lsh/l;->b:I

    iget-boolean v10, v10, Lsh/l;->a:Z

    iget-object v11, v7, Lsh/b;->y:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Exception;

    if-nez v11, :cond_2b

    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    invoke-static {v6}, Lfi/k;->b(Lfi/o;)Landroid/graphics/ColorSpace;

    move-result-object v11

    iget-object v12, v6, Lfi/o;->a:Landroid/content/Context;

    if-eqz v11, :cond_9

    sget-object v11, Lfi/k;->c:Lf93/a;

    invoke-static {v6, v11}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/graphics/ColorSpace;

    iput-object v11, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_9
    sget-object v11, Lfi/k;->d:Lf93/a;

    invoke-static {v6, v11}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iput-boolean v11, v5, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    sget-object v11, Lfi/k;->b:Lf93/a;

    invoke-static {v6, v11}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/graphics/Bitmap$Config;

    if-nez v10, :cond_a

    if-lez v0, :cond_c

    :cond_a
    if-eqz v11, :cond_b

    invoke-static {v11}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    move-result v13

    if-eqz v13, :cond_c

    :cond_b
    sget-object v11, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_c
    sget-object v13, Lfi/k;->g:Lf93/a;

    invoke-static {v6, v13}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v13, :cond_d

    sget-object v13, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v11, v13, :cond_d

    iget-object v13, v5, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v14, "image/jpeg"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    sget-object v11, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :cond_d
    iget-object v13, v5, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    sget-object v14, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    if-ne v13, v14, :cond_e

    sget-object v13, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-eq v11, v13, :cond_e

    move-object v11, v14

    :cond_e
    iput-object v11, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iget v11, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/16 v13, 0x10e

    const/16 v14, 0x5a

    if-lez v11, :cond_1d

    iget v15, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v15, :cond_f

    move v2, v9

    move/from16 v16, v10

    move-object/from16 v17, v12

    goto/16 :goto_e

    :cond_f
    if-eq v0, v14, :cond_11

    if-ne v0, v13, :cond_10

    goto :goto_7

    :cond_10
    move v2, v11

    goto :goto_8

    :cond_11
    :goto_7
    move v2, v15

    :goto_8
    if-eq v0, v14, :cond_13

    if-ne v0, v13, :cond_12

    goto :goto_9

    :cond_12
    move v11, v15

    :cond_13
    :goto_9
    iget-object v15, v6, Lfi/o;->b:Lgi/i;

    iget-object v13, v6, Lfi/o;->c:Lgi/g;

    sget-object v14, Lfi/j;->b:Lf93/a;

    invoke-static {v6, v14}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lgi/i;

    invoke-static {v2, v11, v15, v13, v14}, Ls/s;->f(IILgi/i;Lgi/g;Lgi/i;)J

    move-result-wide v14

    const/16 v16, 0x20

    shr-long v3, v14, v16

    long-to-int v3, v3

    const-wide v17, 0xffffffffL

    and-long v14, v14, v17

    long-to-int v4, v14

    div-int v14, v2, v3

    invoke-static {v14}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v14

    div-int v15, v11, v4

    invoke-static {v15}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v15

    move/from16 v16, v10

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    if-eqz v10, :cond_15

    if-ne v10, v9, :cond_14

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_a

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_15
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v10

    :goto_a
    if-ge v10, v9, :cond_16

    move v10, v9

    :cond_16
    iput v10, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-double v14, v2

    int-to-double v9, v10

    div-double/2addr v14, v9

    move-wide/from16 v17, v9

    int-to-double v9, v11

    div-double v9, v9, v17

    int-to-double v2, v3

    move-object/from16 v17, v12

    int-to-double v11, v4

    div-double v3, v2, v14

    div-double/2addr v11, v9

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_18

    const/4 v9, 0x1

    if-ne v2, v9, :cond_17

    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    goto :goto_b

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_18
    invoke-static {v3, v4, v11, v12}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    :goto_b
    iget-object v6, v6, Lfi/o;->d:Lgi/d;

    sget-object v9, Lgi/d;->x:Lgi/d;

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    if-ne v6, v9, :cond_19

    cmpl-double v6, v3, v10

    if-lez v6, :cond_19

    move-wide v3, v10

    :cond_19
    cmpg-double v6, v3, v10

    if-nez v6, :cond_1a

    const/4 v6, 0x1

    goto :goto_c

    :cond_1a
    const/4 v6, 0x0

    :goto_c
    xor-int/lit8 v9, v6, 0x1

    iput-boolean v9, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-nez v6, :cond_1b

    cmpl-double v6, v3, v10

    const v9, 0x7fffffff

    if-lez v6, :cond_1c

    int-to-double v10, v9

    div-double/2addr v10, v3

    invoke-static {v10, v11}, Le93/b;->W(D)I

    move-result v3

    iput v3, v5, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    :cond_1b
    :goto_d
    const/4 v3, 0x0

    goto :goto_f

    :cond_1c
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-double v9, v9

    mul-double/2addr v9, v3

    invoke-static {v9, v10}, Le93/b;->W(D)I

    move-result v3

    iput v3, v5, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    goto :goto_d

    :cond_1d
    move/from16 v16, v10

    move-object/from16 v17, v12

    move v2, v9

    :goto_e
    iput v2, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v3, 0x0

    iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    :goto_f
    :try_start_2
    new-instance v4, Lne3/i0;

    invoke-direct {v4, v8}, Lne3/i0;-><init>(Lne3/j0;)V

    const/4 v6, 0x0

    invoke-static {v4, v6, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v8}, Lne3/j0;->close()V

    iget-object v6, v7, Lsh/b;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Exception;

    if-nez v6, :cond_2a

    if-eqz v4, :cond_29

    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v4, v6}, Landroid/graphics/Bitmap;->setDensity(I)V

    if-nez v16, :cond_1e

    if-lez v0, :cond_26

    :cond_1e
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v9, v8

    if-eqz v16, :cond_1f

    const/high16 v8, -0x40800000    # -1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-virtual {v6, v8, v10, v7, v9}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    :cond_1f
    if-lez v0, :cond_20

    int-to-float v8, v0

    invoke-virtual {v6, v8, v7, v9}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    :cond_20
    new-instance v7, Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    const/4 v10, 0x0

    invoke-direct {v7, v10, v10, v8, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v8, v7, Landroid/graphics/RectF;->left:F

    cmpg-float v9, v8, v10

    if-nez v9, :cond_21

    iget v9, v7, Landroid/graphics/RectF;->top:F

    cmpg-float v9, v9, v10

    if-nez v9, :cond_21

    :goto_10
    const/16 v7, 0x5a

    goto :goto_11

    :cond_21
    neg-float v8, v8

    iget v7, v7, Landroid/graphics/RectF;->top:F

    neg-float v7, v7

    invoke-virtual {v6, v8, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_10

    :goto_11
    if-eq v0, v7, :cond_24

    const/16 v7, 0x10e

    if-ne v0, v7, :cond_22

    goto :goto_12

    :cond_22
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v8

    if-nez v8, :cond_23

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_23
    invoke-static {v0, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_13

    :cond_24
    :goto_12
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v8

    if-nez v8, :cond_25

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_25
    invoke-static {v0, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_13
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v8, Lsh/o;->a:Landroid/graphics/Paint;

    invoke-virtual {v7, v4, v6, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    move-object v4, v0

    :cond_26
    new-instance v0, Lsh/i;

    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    new-instance v7, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v7, v6, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-static {v7}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v4

    iget v6, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v2, 0x1

    if-gt v6, v2, :cond_27

    iget-boolean v5, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    if-eqz v5, :cond_28

    :cond_27
    move v3, v2

    :cond_28
    invoke-direct {v0, v4, v3}, Lsh/i;-><init>(Lrh/j;Z)V

    return-object v0

    :cond_29
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2a
    throw v6

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v8, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2b
    throw v11

    :cond_2c
    throw v10

    :pswitch_1d
    iget-object v0, v1, Lsc0/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;->A(Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1d
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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1c
    .end packed-switch
.end method
