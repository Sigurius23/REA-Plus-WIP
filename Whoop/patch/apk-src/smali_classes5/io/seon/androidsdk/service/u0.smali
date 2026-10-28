.class public final Lio/seon/androidsdk/service/u0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final f:[Ljava/lang/String;


# instance fields
.field public e:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "biometric_status"

    const-string v1, "is_keyguard_secure"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/u0;->f:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 6

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/u0;->f()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v4, v3

    goto :goto_1

    :catch_0
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v5, "biometric_status"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v4, p0, Lio/seon/androidsdk/service/u0;->e:Landroid/content/Context;

    const-string v5, "keyguard"

    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/KeyguardManager;

    invoke-virtual {v4}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_1
    :goto_2
    const-string v0, "is_keyguard_secure"

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 1

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/u0;->e:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    return-void
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->HARDWARE_UNAVAILABLE:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_3

    iget-object v1, p0, Lio/seon/androidsdk/service/u0;->e:Landroid/content/Context;

    const-string v2, "biometric"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lio/seon/androidsdk/service/m;->b(Ljava/lang/Object;)Landroid/hardware/biometrics/BiometricManager;

    move-result-object v1

    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Landroid/hardware/biometrics/BiometricManager;->canAuthenticate(I)I

    move-result v1

    if-eqz v1, :cond_4

    const/16 v2, 0xf

    if-eq v1, v2, :cond_2

    const/16 v2, 0xb

    if-eq v1, v2, :cond_1

    const/16 v2, 0xc

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->NO_HARDWARE:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    goto :goto_0

    :cond_1
    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->NOT_ENROLLED:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    goto :goto_0

    :cond_2
    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->REQUIRES_SECURITY_UPDATE:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lio/seon/androidsdk/service/u0;->e:Landroid/content/Context;

    const-string v2, "fingerprint"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/fingerprint/FingerprintManager;

    invoke-virtual {v1}, Landroid/hardware/fingerprint/FingerprintManager;->isHardwareDetected()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->NOT_ENROLLED:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    invoke-virtual {v1}, Landroid/hardware/fingerprint/FingerprintManager;->hasEnrolledFingerprints()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    sget-object v0, Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;->AVAILABLE:Lio/seon/androidsdk/service/SecurityProbe$BiometricSensorStatus;

    :cond_5
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
