.class public final Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/factories/noisecancellation/NoiseCancellationFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationFactory;",
        "noiseCancellationStatusChecker",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;",
        "<init>",
        "(Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V",
        "jniLoad",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "context",
        "Landroid/content/Context;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;


# direct methods
.method public constructor <init>(Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V
    .locals 1

    const-string v0, "noiseCancellationStatusChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    return-void
.end method


# virtual methods
.method public jniLoad(Landroid/content/Context;)Llive/hms/video/factories/noisecancellation/NoiseCancellation;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-virtual {v0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->getLibraryPresent()Z

    move-result v0

    iget-object v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-virtual {v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->enabledFromDashboard()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Present: Library "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", Dashboard "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "KrispLoading"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-virtual {v1, p1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;->getModelStream(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Ls40/e0;->g(Ljava/io/InputStream;)[B

    move-result-object p1

    const-string v1, "libkrisp-audio-sdk.so"

    new-instance v2, Lhms/webrtc/KrispAudioProcessingImpl;

    invoke-direct {v2}, Lhms/webrtc/KrispAudioProcessingImpl;-><init>()V

    invoke-virtual {v2, p1, v1}, Lhms/webrtc/KrispAudioProcessingImpl;->InitWithData([BLjava/lang/String;)Z

    new-instance p1, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl$jniLoad$2;

    iget-object v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl;->noiseCancellationStatusChecker:Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;

    invoke-direct {p1, v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFactoryImpl$jniLoad$2;-><init>(Ljava/lang/Object;)V

    new-instance v1, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;

    invoke-direct {v1, v2, p1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;-><init>(Lhms/webrtc/KrispAudioProcessingImpl;Lc93/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :try_start_1
    new-instance v1, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;

    const/4 p1, 0x1

    invoke-direct {v1, p1, p1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;-><init>(ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :goto_1
    return-object v1

    :goto_2
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_1
    throw p1

    :cond_2
    new-instance p1, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;

    invoke-direct {p1, v0, v1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;-><init>(ZZ)V

    return-object p1
.end method
