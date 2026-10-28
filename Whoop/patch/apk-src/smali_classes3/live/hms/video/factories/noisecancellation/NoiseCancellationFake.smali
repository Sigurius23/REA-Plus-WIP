.class public final Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/factories/noisecancellation/NoiseCancellation;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "",
        "libraryPresent",
        "enabledFromDashboard",
        "<init>",
        "(ZZ)V",
        "enabled",
        "Lhms/webrtc/AudioProcessingFactory;",
        "getAudioProcessingFactory",
        "(Z)Lhms/webrtc/AudioProcessingFactory;",
        "Ll83/a0;",
        "setNoiseCancellationEnabled",
        "(Z)V",
        "getNoiseCancellationEnabled",
        "()Z",
        "Z",
        "getLibraryPresent",
        "getEnabledFromDashboard",
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
.field private final enabledFromDashboard:Z

.field private final libraryPresent:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->libraryPresent:Z

    iput-boolean p2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->enabledFromDashboard:Z

    return-void
.end method


# virtual methods
.method public getAudioProcessingFactory(Z)Lhms/webrtc/AudioProcessingFactory;
    .locals 2

    invoke-virtual {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->getNcLogTag()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Noise Cancellation not loaded. Library added: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->libraryPresent:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", Enabled from dashboard "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->enabledFromDashboard:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getEnabledFromDashboard()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->enabledFromDashboard:Z

    return v0
.end method

.method public final getLibraryPresent()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->libraryPresent:Z

    return v0
.end method

.method public getNcLogTag()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellation$DefaultImpls;->getNcLogTag(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNoiseCancellationEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setNoiseCancellationEnabled(Z)V
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;->getNcLogTag()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Ignored because noise cancellation is disabled"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
