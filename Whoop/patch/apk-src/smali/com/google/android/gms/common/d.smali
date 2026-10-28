.class public Lcom/google/android/gms/common/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final GOOGLE_PLAY_SERVICES_PACKAGE:Ljava/lang/String; = "com.google.android.gms"

.field public static final GOOGLE_PLAY_SERVICES_VERSION_CODE:I

.field public static final GOOGLE_PLAY_STORE_PACKAGE:Ljava/lang/String; = "com.android.vending"

.field static final TRACKING_SOURCE_DIALOG:Ljava/lang/String; = "d"

.field static final TRACKING_SOURCE_NOTIFICATION:Ljava/lang/String; = "n"

.field private static final zza:Lcom/google/android/gms/common/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const v0, 0xbdfcb8

    sput v0, Lcom/google/android/gms/common/d;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    new-instance v0, Lcom/google/android/gms/common/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/common/d;->zza:Lcom/google/android/gms/common/d;

    return-void
.end method

.method public static getInstance()Lcom/google/android/gms/common/d;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/d;->zza:Lcom/google/android/gms/common/d;

    return-object v0
.end method


# virtual methods
.method public cancelAvailabilityErrorNotifications(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_1

    const/16 v0, 0x28c4

    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->cancel(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :goto_1
    const-string v0, "GooglePlayServicesUtil"

    const-string v1, "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public getApkVersion(Landroid/content/Context;)I
    .locals 2

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v1, "com.google.android.gms"

    invoke-virtual {p1, v1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    return p1

    :catch_0
    const-string p1, "GooglePlayServicesUtil"

    const-string v1, "Google Play services is missing."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public getErrorResolutionIntent(I)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, v0}, Lcom/google/android/gms/common/d;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;
    .locals 3

    const/4 v0, 0x1

    .line 2
    const-string v1, "com.google.android.gms"

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p1, 0x3

    const/4 p3, 0x0

    if-eq p2, p1, :cond_0

    return-object p3

    :cond_0
    const-string p1, "package"

    invoke-static {p1, v1, p3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 3
    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-object p2

    :cond_1
    if-eqz p1, :cond_3

    .line 5
    invoke-static {p1}, Lzo/b;->c(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    new-instance p1, Landroid/content/Intent;

    const-string p2, "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"

    .line 7
    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "com.google.android.wearable.app"

    .line 8
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object p1

    .line 9
    :cond_3
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "gcore_"

    .line 10
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    sget v0, Lcom/google/android/gms/common/d;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    const-string v0, "-"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 15
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    :cond_4
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_5

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    :cond_5
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_6

    .line 19
    :try_start_0
    invoke-static {p1}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object p3

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 21
    iget-object p3, p3, Laj/d;->w:Ljava/lang/Object;

    check-cast p3, Landroid/content/Context;

    .line 22
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    .line 23
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    .line 24
    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p3, "market://details"

    .line 25
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    .line 26
    invoke-virtual {p3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p3

    const-string v0, "id"

    .line 27
    invoke-virtual {p3, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p3

    .line 28
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "pcampaignid"

    .line 29
    invoke-virtual {p3, v0, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 30
    :cond_7
    invoke-virtual {p3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    .line 31
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p1, "com.android.vending"

    .line 32
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x80000

    .line 33
    invoke-virtual {p2, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    return-object p2
.end method

.method public getErrorResolutionPendingIntent(Landroid/content/Context;IILjava/lang/String;)Landroid/app/PendingIntent;
    .locals 1

    invoke-virtual {p0, p1, p2, p4}, Lcom/google/android/gms/common/d;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/high16 p4, 0x8000000

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, p4, v0}, Landroidx/core/app/PendingIntentCompat;->getActivity(Landroid/content/Context;ILandroid/content/Intent;IZ)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public isGooglePlayServicesAvailable(Landroid/content/Context;I)I
    .locals 2

    invoke-static {p1, p2}, Lcom/google/android/gms/common/e;->a(Landroid/content/Context;I)I

    move-result p2

    const/4 v0, 0x1

    const/16 v1, 0x12

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    if-ne p2, v0, :cond_1

    const-string v0, "com.google.android.gms"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    return v1

    :cond_2
    return p2
.end method

.method public isPlayServicesPossiblyUpdating(Landroid/content/Context;I)Z
    .locals 2

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x12

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    return v1

    :cond_0
    if-ne p2, v1, :cond_1

    const-string p2, "com.google.android.gms"

    invoke-static {p1, p2}, Lcom/google/android/gms/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public isPlayStorePossiblyUpdating(Landroid/content/Context;I)Z
    .locals 1

    const/16 v0, 0x9

    if-ne p2, v0, :cond_0

    const-string p2, "com.android.vending"

    invoke-static {p1, p2}, Lcom/google/android/gms/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    sget-object p1, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    return p1
.end method

.method public isUninstalledAppPossiblyUpdating(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public verifyGooglePlayServicesIsAvailable(Landroid/content/Context;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/common/GooglePlayServicesRepairableException;,
            Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lcom/google/android/gms/common/d;->getInstance()Lcom/google/android/gms/common/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/d;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result p2

    if-eqz p2, :cond_1

    const-string v0, "e"

    invoke-static {}, Lcom/google/android/gms/common/d;->getInstance()Lcom/google/android/gms/common/d;

    move-result-object v1

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/android/gms/common/d;->getErrorResolutionIntent(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x2e

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "GooglePlayServices not available due to error "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GooglePlayServicesUtil"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V

    throw p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;

    invoke-direct {p1}, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method
