.class public final Llive/hms/video/media/capturers/HMSAudioCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/capturers/HMSCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/capturers/HMSAudioCapturer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0001\u001f\u0008\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0017R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/media/capturers/HMSAudioCapturer;",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "hmsPeerConnectionFactory",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "Landroid/app/Notification;",
        "screenShareNotification",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "endAudioShare",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)V",
        "start",
        "()V",
        "stop",
        "Landroid/content/Context;",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "Landroid/content/Intent;",
        "Lbc3/k1;",
        "endAudioshareJob",
        "Lbc3/k1;",
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "capturerService",
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "audioShareCaptureIntent",
        "live/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1",
        "serviceConnection",
        "Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/media/capturers/HMSAudioCapturer$Companion;

.field public static final TAG:Ljava/lang/String; = "HMSAudioCapturer"


# instance fields
.field private final audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

.field private final audioShareCaptureIntent:Landroid/content/Intent;

.field private capturerService:Llive/hms/video/services/HMSScreenCaptureService;

.field private final context:Landroid/content/Context;

.field private endAudioshareJob:Lbc3/k1;

.field private final hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

.field private final mediaProjectionPermissionResultData:Landroid/content/Intent;

.field private final serviceConnection:Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/capturers/HMSAudioCapturer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/capturers/HMSAudioCapturer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/capturers/HMSAudioCapturer;->Companion:Llive/hms/video/media/capturers/HMSAudioCapturer$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/factories/HMSPeerConnectionFactory;",
            "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
            "Landroid/content/Intent;",
            "Landroid/app/Notification;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsPeerConnectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endAudioShare"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    new-instance p2, Landroid/content/Intent;

    const-class p3, Llive/hms/video/services/HMSScreenCaptureService;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "hms_screenshare_notification_extra"

    invoke-virtual {p2, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->audioShareCaptureIntent:Landroid/content/Intent;

    new-instance p1, Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;

    invoke-direct {p1, p0, p6}, Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;-><init>(Llive/hms/video/media/capturers/HMSAudioCapturer;Lc93/a;)V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;

    return-void
.end method

.method public static final synthetic access$getAudioMixingMode$p(Llive/hms/video/media/capturers/HMSAudioCapturer;)Llive/hms/video/sdk/models/enums/AudioMixingMode;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    return-object p0
.end method

.method public static final synthetic access$getCapturerService$p(Llive/hms/video/media/capturers/HMSAudioCapturer;)Llive/hms/video/services/HMSScreenCaptureService;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    return-object p0
.end method

.method public static final synthetic access$getHmsPeerConnectionFactory$p(Llive/hms/video/media/capturers/HMSAudioCapturer;)Llive/hms/video/factories/HMSPeerConnectionFactory;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

    return-object p0
.end method

.method public static final synthetic access$getMediaProjectionPermissionResultData$p(Llive/hms/video/media/capturers/HMSAudioCapturer;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    return-object p0
.end method

.method public static final synthetic access$setCapturerService$p(Llive/hms/video/media/capturers/HMSAudioCapturer;Llive/hms/video/services/HMSScreenCaptureService;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    return-void
.end method

.method public static final synthetic access$setEndAudioshareJob$p(Llive/hms/video/media/capturers/HMSAudioCapturer;Lbc3/k1;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->endAudioshareJob:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCapturer$DefaultImpls;->dispose(Llive/hms/video/media/capturers/HMSCapturer;)V

    return-void
.end method

.method public start()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->context:Landroid/content/Context;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->audioShareCaptureIntent:Landroid/content/Intent;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method public stop()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->endAudioshareJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/services/HMSScreenCaptureService;->stopAudioCaptuer()V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->context:Landroid/content/Context;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    iput-object v1, p0, Llive/hms/video/media/capturers/HMSAudioCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v1, "HMSScreenCapturer"

    const-string v2, "destroyed from capturer"

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
