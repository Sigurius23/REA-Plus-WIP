.class public final Lcom/mapbox/common/module/cronet/LazyEngine$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/module/cronet/LazyEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/mapbox/common/module/cronet/LazyEngine$Companion;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onCronetNotAvailable",
        "Lorg/chromium/net/CronetProvider;",
        "provider",
        "onCronetAvailable",
        "(Lorg/chromium/net/CronetProvider;)V",
        "Landroid/content/Context;",
        "context",
        "Lcom/google/android/gms/tasks/Task;",
        "Ljava/lang/Void;",
        "installCronetFromPlayServices",
        "(Landroid/content/Context;)Lcom/google/android/gms/tasks/Task;",
        "",
        "canInstallFromGooglePlay",
        "()Z",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/common/module/cronet/LazyEngine$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final canInstallFromGooglePlay()Z
    .locals 2

    invoke-static {}, Lcom/mapbox/common/module/cronet/LazyEngineKt;->access$getCanInstallFromGooglePlay$p()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    return v0
.end method

.method public final installCronetFromPlayServices(Landroid/content/Context;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/net/CronetProviderInstaller;->installProvider(Landroid/content/Context;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "installProvider(context)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final onCronetAvailable(Lorg/chromium/net/CronetProvider;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/chromium/net/CronetProvider;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "App-Packaged-Cronet-Provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Embedded"

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/mapbox/common/module/cronet/LazyEngineKt;->access$isPlayServicesCronetProviderInstallerAvailable$p()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Google-Play-Services-Cronet-Provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "PlayServices"

    goto :goto_0

    :cond_1
    const-string p1, "UnknownSource"

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "common/network/http3/Cronet"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Available"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    return-void
.end method

.method public final onCronetNotAvailable()V
    .locals 3

    const-string v0, "common/network/http3/CronetNotAvailable"

    invoke-static {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    sget-object v0, Lcom/mapbox/common/MapboxCommonLogger;->INSTANCE:Lcom/mapbox/common/MapboxCommonLogger;

    const-string v1, "HTTP"

    const-string v2, "HTTP/3 will not be available: Cannot find a valid Cronet provider. In order to\nenable HTTP/3 in the Mapbox SDKs, it\'s necessary that the application depends on\na valid Cronet provider. Valid providers include the Google Play Services\nprovider (from \"com.google.android.gms:play-services-cronet\"), in which case\nCronet will be used from Play Services, or you may choose to embed Cronet with\nyour application by depending on \"org.chromium.net:cronet-embedded\"."

    invoke-virtual {v0, v1, v2}, Lcom/mapbox/common/MapboxCommonLogger;->logW$common_release(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
