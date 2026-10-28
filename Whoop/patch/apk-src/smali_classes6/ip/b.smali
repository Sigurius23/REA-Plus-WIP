.class public final Lip/b;
.super Lip/h;
.source "SourceFile"


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILcq/i;)V
    .locals 0

    iput p1, p0, Lip/b;->g:I

    packed-switch p1, :pswitch_data_0

    .line 1
    iput-object p2, p0, Lip/b;->h:Ljava/lang/Object;

    .line 2
    const-string p1, "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void

    .line 3
    :pswitch_0
    iput-object p2, p0, Lip/b;->h:Ljava/lang/Object;

    .line 4
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void

    .line 5
    :pswitch_1
    iput-object p2, p0, Lip/b;->h:Ljava/lang/Object;

    .line 6
    const-string p1, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lip/h;-><init>(Ljava/lang/String;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/RevocationBoundService;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lip/b;->g:I

    .line 7
    const-string v0, "com.google.android.gms.auth.api.signin.internal.IRevocationService"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lip/h;-><init>(Ljava/lang/String;I)V

    .line 8
    iput-object p1, p0, Lip/b;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final k0(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 10

    iget p3, p0, Lip/b;->g:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lip/b;->h:Ljava/lang/Object;

    packed-switch p3, :pswitch_data_0

    move-object p2, v2

    check-cast p2, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    if-eq p1, v0, :cond_1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    move v0, v1

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Lip/b;->n0()V

    invoke-static {p2}, Lro/i;->G(Landroid/content/Context;)Lro/i;

    move-result-object p1

    invoke-virtual {p1}, Lro/i;->H()V

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, Lip/b;->n0()V

    invoke-static {p2}, Lro/b;->a(Landroid/content/Context;)Lro/b;

    move-result-object p1

    invoke-virtual {p1}, Lro/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p2

    sget-object p3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->K:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    const/4 v3, 0x0

    if-eqz p2, :cond_4

    const-string p3, "defaultGoogleSignInAccount"

    invoke-virtual {p1, p3}, Lro/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    const-string v4, "googleSignInOptions"

    invoke-static {v4, p3}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lro/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p3, p1

    goto :goto_1

    :catch_0
    :cond_3
    :goto_0
    move-object p3, v3

    :cond_4
    :goto_1
    move-object v8, p3

    move-object v5, v2

    check-cast v5, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    new-instance v4, Lqo/a;

    invoke-static {v8}, Luo/w;->f(Ljava/lang/Object;)V

    new-instance p1, Ljc/b;

    const/16 p3, 0x18

    invoke-direct {p1, p3}, Ljc/b;-><init>(I)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    new-instance v9, Lcom/google/android/gms/common/api/g;

    invoke-direct {v9, p1, p3}, Lcom/google/android/gms/common/api/g;-><init>(Ljc/b;Landroid/os/Looper;)V

    const/4 v6, 0x0

    sget-object v7, Loo/a;->a:Lcom/google/android/gms/common/api/f;

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    const/4 p1, 0x6

    const/4 p3, 0x3

    if-eqz p2, :cond_9

    invoke-virtual {v4}, Lcom/google/android/gms/common/api/h;->asGoogleApiClient()Lcom/google/android/gms/common/api/k;

    move-result-object p2

    invoke-virtual {v4}, Lcom/google/android/gms/common/api/h;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v4}, Lqo/a;->d()I

    move-result v4

    if-ne v4, p3, :cond_5

    move v1, v0

    :cond_5
    sget-object v4, Lro/h;->a:Lab/h0;

    iget v5, v4, Lab/h0;->x:I

    if-gt v5, p3, :cond_6

    iget-object p3, v4, Lab/h0;->y:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object v4, v4, Lab/h0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v5, "Revoking access"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    invoke-static {v2}, Lro/b;->a(Landroid/content/Context;)Lro/b;

    move-result-object p3

    const-string v4, "refreshToken"

    invoke-virtual {p3, v4}, Lro/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v2}, Lro/h;->a(Landroid/content/Context;)V

    if-eqz v1, :cond_8

    if-nez p3, :cond_7

    sget-object p2, Lro/c;->y:Lab/h0;

    new-instance p2, Lcom/google/android/gms/common/api/Status;

    const/4 p3, 0x4

    invoke-direct {p2, p3, v3, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/a;)V

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result p3

    xor-int/2addr p3, v0

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {p3, v1}, Luo/w;->b(ZLjava/lang/String;)V

    new-instance p3, Lcom/google/android/gms/common/api/o;

    invoke-direct {p3, p2}, Lcom/google/android/gms/common/api/o;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p3, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a0(Lcom/google/android/gms/common/api/m;)V

    goto :goto_2

    :cond_7
    new-instance p2, Lro/c;

    invoke-direct {p2, p3}, Lro/c;-><init>(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/Thread;

    invoke-direct {p3, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    iget-object p3, p2, Lro/c;->x:Lto/p;

    goto :goto_2

    :cond_8
    new-instance p3, Lro/g;

    invoke-direct {p3, p2, v0}, Lro/g;-><init>(Lcom/google/android/gms/common/api/k;I)V

    check-cast p2, Lto/x;

    iget-object p2, p2, Lto/x;->b:Lcom/google/android/gms/common/api/h;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/d;)Lto/d;

    move-result-object p3

    :goto_2
    new-instance p2, Lt9/p;

    invoke-direct {p2, p1}, Lt9/p;-><init>(I)V

    new-instance p1, Lcq/i;

    invoke-direct {p1}, Lcq/i;-><init>()V

    new-instance v1, Lto/s0;

    invoke-direct {v1, p3, p1, p2}, Lto/s0;-><init>(Lkotlin/jvm/internal/j;Lcq/i;Lt9/p;)V

    invoke-virtual {p3, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->W(Lto/s0;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v4}, Lcom/google/android/gms/common/api/h;->asGoogleApiClient()Lcom/google/android/gms/common/api/k;

    move-result-object p2

    invoke-virtual {v4}, Lcom/google/android/gms/common/api/h;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v4}, Lqo/a;->d()I

    move-result v3

    if-ne v3, p3, :cond_a

    move v3, v0

    goto :goto_3

    :cond_a
    move v3, v1

    :goto_3
    sget-object v4, Lro/h;->a:Lab/h0;

    iget v5, v4, Lab/h0;->x:I

    if-gt v5, p3, :cond_b

    iget-object p3, v4, Lab/h0;->y:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object v4, v4, Lab/h0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-string v5, "Signing out"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    invoke-static {v2}, Lro/h;->a(Landroid/content/Context;)V

    if-eqz v3, :cond_c

    new-instance p3, Lto/p;

    invoke-direct {p3, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(Lcom/google/android/gms/common/api/k;)V

    sget-object p2, Lcom/google/android/gms/common/api/Status;->E:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->a0(Lcom/google/android/gms/common/api/m;)V

    goto :goto_4

    :cond_c
    new-instance p3, Lro/g;

    invoke-direct {p3, p2, v1}, Lro/g;-><init>(Lcom/google/android/gms/common/api/k;I)V

    check-cast p2, Lto/x;

    iget-object p2, p2, Lto/x;->b:Lcom/google/android/gms/common/api/h;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/d;)Lto/d;

    move-result-object p3

    :goto_4
    new-instance p2, Lt9/p;

    invoke-direct {p2, p1}, Lt9/p;-><init>(I)V

    new-instance p1, Lcq/i;

    invoke-direct {p1}, Lcq/i;-><init>()V

    new-instance v1, Lto/s0;

    invoke-direct {v1, p3, p1, p2}, Lto/s0;-><init>(Lkotlin/jvm/internal/j;Lcq/i;Lt9/p;)V

    invoke-virtual {p3, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->W(Lto/s0;)V

    :goto_5
    return v0

    :pswitch_0
    if-ne p1, v0, :cond_d

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Landroid/app/PendingIntent;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    check-cast v2, Lcq/i;

    invoke-static {p1, p3, v2}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    goto :goto_6

    :cond_d
    move v0, v1

    :goto_6
    return v0

    :pswitch_1
    if-ne p1, v0, :cond_e

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lpo/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lpo/f;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    check-cast v2, Lcq/i;

    invoke-static {p1, p3, v2}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    goto :goto_7

    :cond_e
    move v0, v1

    :goto_7
    return v0

    :pswitch_2
    if-ne p1, v0, :cond_f

    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p3, Lpo/i;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p3}, Lip/i;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lpo/i;

    invoke-static {p2}, Lip/i;->b(Landroid/os/Parcel;)V

    check-cast v2, Lcq/i;

    invoke-static {p1, p3, v2}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    goto :goto_8

    :cond_f
    move v0, v1

    :goto_8
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n0()V
    .locals 6

    iget-object v0, p0, Lip/b;->h:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/auth/api/signin/RevocationBoundService;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const-string v2, "com.google.android.gms"

    invoke-static {v0}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v3, v3, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    const-string v4, "appops"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/AppOpsManager;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v1, v2}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v3, 0x40

    :try_start_1
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {v0}, Lcom/google/android/gms/common/f;->a(Landroid/content/Context;)Lcom/google/android/gms/common/f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_6

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/google/android/gms/common/f;->c(Landroid/content/pm/PackageInfo;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_4

    :cond_0
    const/4 v4, 0x1

    invoke-static {v1, v4}, Lcom/google/android/gms/common/f;->c(Landroid/content/pm/PackageInfo;Z)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v0, Lcom/google/android/gms/common/f;->a:Landroid/content/Context;

    sget-boolean v1, Lcom/google/android/gms/common/e;->c:Z

    if-nez v1, :cond_2

    :try_start_2
    invoke-static {v0}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object v1

    iget-object v1, v1, Laj/d;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const v5, 0x8000040

    invoke-virtual {v1, v2, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/common/f;->a(Landroid/content/Context;)Lcom/google/android/gms/common/f;

    if-eqz v1, :cond_1

    invoke-static {v1, v3}, Lcom/google/android/gms/common/f;->c(Landroid/content/pm/PackageInfo;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1, v4}, Lcom/google/android/gms/common/f;->c(Landroid/content/pm/PackageInfo;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    sput-boolean v4, Lcom/google/android/gms/common/e;->b:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    sput-boolean v3, Lcom/google/android/gms/common/e;->b:Z
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    sput-boolean v4, Lcom/google/android/gms/common/e;->c:Z

    goto :goto_3

    :goto_1
    :try_start_3
    const-string v1, "GooglePlayServicesUtil"

    const-string v2, "Cannot find Google Play services package name."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sput-boolean v4, Lcom/google/android/gms/common/e;->c:Z

    goto :goto_3

    :goto_2
    sput-boolean v4, Lcom/google/android/gms/common/e;->c:Z

    throw v0

    :cond_2
    :goto_3
    sget-boolean v0, Lcom/google/android/gms/common/e;->b:Z

    if-nez v0, :cond_4

    const-string v0, "user"

    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_4

    :cond_3
    const-string v0, "GoogleSignatureVerifier"

    const-string v1, "Test-keys aren\'t accepted on this build."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_4
    :goto_4
    return-void

    :catch_1
    const/4 v0, 0x3

    const-string v1, "UidVerifier"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Package manager can\'t find google play services package, defaulting to false"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    :cond_5
    :try_start_4
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "context.getSystemService(Context.APP_OPS_SERVICE) is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    :cond_6
    :goto_5
    new-instance v0, Ljava/lang/SecurityException;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    const-string v2, "Calling UID "

    const-string v3, " is not Google Play services."

    invoke-static {v1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
