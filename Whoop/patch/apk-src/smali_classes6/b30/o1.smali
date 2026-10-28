.class public final synthetic Lb30/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput v0, p0, Lb30/o1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb30/o1;->E:Ljava/lang/Object;

    iput p1, p0, Lb30/o1;->x:I

    iput-object p3, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput-object p4, p0, Lb30/o1;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lb30/o1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb30/o1;->x:I

    iput-object p2, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb30/o1;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/o1;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p5, p0, Lb30/o1;->w:I

    iput-object p1, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/o1;->z:Ljava/lang/Object;

    iput p3, p0, Lb30/o1;->x:I

    iput-object p4, p0, Lb30/o1;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 4
    iput p5, p0, Lb30/o1;->w:I

    iput-object p1, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/o1;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/o1;->E:Ljava/lang/Object;

    iput p4, p0, Lb30/o1;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lg40/o1;ILg2/i;)V
    .locals 1

    .line 5
    const/4 v0, 0x2

    iput v0, p0, Lb30/o1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/o1;->E:Ljava/lang/Object;

    iput-object p2, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput p3, p0, Lb30/o1;->x:I

    iput-object p4, p0, Lb30/o1;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 1

    .line 6
    const/4 v0, 0x6

    iput v0, p0, Lb30/o1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/o1;->y:Ljava/lang/Object;

    iput p2, p0, Lb30/o1;->x:I

    iput-object p3, p0, Lb30/o1;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/o1;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lb30/o1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Li3/z;

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v0, v3, v1, v2, p1}, Lwr0/u0;->k(Ljava/lang/String;ILjava/util/List;Lkotlin/jvm/functions/Function1;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lu0/i0;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Ly2/t0;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Ly2/j1;

    move-object v3, p1

    check-cast v3, Ly2/i1;

    iget v4, v0, Lu0/i0;->x:I

    iget-object p1, v0, Lu0/i0;->w:Lu0/n1;

    iget-object v5, v0, Lu0/i0;->y:Lq3/e0;

    iget-object v0, v0, Lu0/i0;->z:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/p1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-interface {v1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v0

    sget-object v1, Ly3/m;->x:Ly3/m;

    const/4 v9, 0x0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    move v7, v0

    goto :goto_2

    :cond_1
    move v7, v9

    :goto_2
    iget v8, v2, Ly2/j1;->w:I

    invoke-static/range {v3 .. v8}, Lu0/n0;->h(Ly2/i1;ILq3/e0;Ll3/r0;ZI)Lh2/c;

    move-result-object v0

    sget-object v1, Lh0/d2;->x:Lh0/d2;

    iget v4, v2, Ly2/j1;->w:I

    iget v5, p0, Lb30/o1;->x:I

    invoke-virtual {p1, v1, v0, v5, v4}, Lu0/n1;->a(Lh0/d2;Lh2/c;II)V

    iget-object p1, p1, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p1

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v2, p1, v9, v3}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v0, v3, v1, v2, p1}, Lof2/c;->b(Lp1/c1;ILkotlin/jvm/functions/Function1;Ljava/util/List;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Lky2/g$a$b;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Lky2/i;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v0, v1, v3, v2, p1}, Lky2/c;->b(Lkotlin/jvm/functions/Function1;Lky2/g$a$b;ILky2/i;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/audio/AudioPlayer;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v0, v1, v2, v3, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->i(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/client/audio/AudioPlayer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lpb0/d$a;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Lgd0/c$e;

    check-cast p1, Lpb0/c;

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v0, v1, v3, v2, p1}, Lid0/c;->i(Lpb0/d$a;Lkotlin/jvm/functions/Function1;ILgd0/c$e;Lpb0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v1, Lg40/o1;

    iget-object v2, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v2, Lg2/i;

    check-cast p1, Lq3/y;

    const-string v3, "it"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    iget-object v0, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    :goto_3
    iget-object v0, v1, Lg40/o1;->b:Lg40/m1;

    iget v1, p0, Lb30/o1;->x:I

    invoke-virtual {v0, v1, p1}, Lg40/m1;->a(ILjava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Le93/b;->i0(II)Li93/j;

    move-result-object p1

    invoke-virtual {p1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    move-object v0, p1

    check-cast v0, Li93/i;

    iget-boolean v0, v0, Li93/i;->y:Z

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lm83/e0;

    invoke-virtual {v0}, Lm83/e0;->nextInt()I

    invoke-static {v2, v3}, Luf/c0;->c0(Lg2/i;I)V

    goto :goto_4

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    iget v3, p0, Lb30/o1;->x:I

    invoke-static {v3, v0, v1, v2, p1}, Lfu2/d;->j(ILjava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb30/o1;->y:Ljava/lang/Object;

    check-cast v0, Lb30/o;

    iget-object v1, p0, Lb30/o1;->z:Ljava/lang/Object;

    check-cast v1, Lb30/p;

    iget-object v2, p0, Lb30/o1;->E:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    check-cast p1, Landroid/content/Context;

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/google/android/gms/wallet/button/PayButton;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->b()Le10/k0;

    move-result-object p1

    iget v0, v0, Lb30/o;->w:I

    iget-object p1, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput v0, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    iget v1, v1, Lb30/p;->w:I

    iput v1, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    iget v5, p0, Lb30/o1;->x:I

    iput v5, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    iput-object v2, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    iget-object p1, v3, Lcom/google/android/gms/wallet/button/PayButton;->x:Le10/k0;

    if-eqz v1, :cond_4

    iget-object v6, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput v1, v6, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    :cond_4
    if-eqz v0, :cond_5

    iget-object v1, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput v0, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    :cond_5
    iget-object v0, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput v5, v0, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    if-eqz v2, :cond_6

    iget-object v0, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput-object v2, v0, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0xdd590a0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    const-string v1, "PayButton"

    if-eqz v0, :cond_7

    invoke-virtual {v3, p1}, Lcom/google/android/gms/wallet/button/PayButton;->a(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    const-string p1, "Failed to create latest buttonView: Google Play Services version is outdated."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    :cond_7
    iget-object v0, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->z:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p1, "Failed to create buttonView: allowedPaymentMethods cannot be empty."

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_9

    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    const-string v2, "PayButtonProxy"

    const-string v5, "com.google.android.gms.wallet.button.IPayButtonCreator"

    :try_start_0
    sget-object v6, Ldp/b;->b:Lkr/e;

    const-string v7, "com.google.android.gms.wallet_dynamite"

    invoke-static {v0, v6, v7}, Ldp/b;->c(Landroid/content/Context;Lkr/e;Ljava/lang/String;)Ldp/b;

    move-result-object v6
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v6}, Ldp/b;->b()Landroid/os/IBinder;

    move-result-object v7

    if-nez v7, :cond_9

    move-object v8, v4

    goto :goto_6

    :cond_9
    invoke-interface {v7, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v8

    instance-of v9, v8, Leq/c;

    if-eqz v9, :cond_a

    check-cast v8, Leq/c;

    goto :goto_6

    :catch_0
    move-exception v0

    :goto_5
    move-object p1, v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_5

    :cond_a
    new-instance v8, Leq/c;

    const/4 v9, 0x4

    invoke-direct {v8, v7, v5, v9}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    :goto_6
    if-eqz v8, :cond_b

    iget-object v5, v6, Ldp/b;->a:Landroid/content/Context;

    filled-new-array {v5, v0}, [Landroid/content/Context;

    move-result-object v0

    new-instance v5, Lcp/b;

    invoke-direct {v5, v0}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v5, p1}, Leq/c;->m0(Lcp/b;Lcom/google/android/gms/wallet/button/ButtonOptions;)Lcp/a;

    move-result-object p1

    invoke-static {p1}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    move-object v4, p1

    goto :goto_8

    :cond_b
    const-string p1, "Failed to get the actual PayButtonCreatorChimeraImpl."

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_8

    :goto_7
    const-string v0, "Failed to create PayButton using dynamite package"

    invoke-static {v2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_8
    iput-object v4, v3, Lcom/google/android/gms/wallet/button/PayButton;->y:Landroid/view/View;

    if-nez v4, :cond_c

    const-string p1, "Failed to create buttonView"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :cond_c
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, v3, Lcom/google/android/gms/wallet/button/PayButton;->y:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_9

    :catch_2
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_d
    iget-object p1, p1, Le10/k0;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    invoke-virtual {v3, p1}, Lcom/google/android/gms/wallet/button/PayButton;->a(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    :goto_9
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
