.class public final Llive/hms/video/media/capturers/HMSScreenCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/capturers/HMSCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/capturers/HMSScreenCapturer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0008\u0005*\u0001$\u0008\u0000\u0018\u0000 \'2\u00020\u0001:\u0001\'BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\u0017R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Llive/hms/video/media/capturers/HMSScreenCapturer;",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "Landroid/content/Context;",
        "context",
        "Lhms/webrtc/VideoSource;",
        "source",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "hmsVideoTrackSettings",
        "Landroid/app/Notification;",
        "screenShareNotification",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "endScreenShare",
        "<init>",
        "(Landroid/content/Context;Lhms/webrtc/VideoSource;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)V",
        "startCapturer",
        "()V",
        "start",
        "stop",
        "Landroid/content/Context;",
        "Lhms/webrtc/VideoSource;",
        "Landroid/content/Intent;",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "Lbc3/k1;",
        "endScreenshareJob",
        "Lbc3/k1;",
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "capturerService",
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "getCapturerService",
        "()Llive/hms/video/services/HMSScreenCaptureService;",
        "setCapturerService",
        "(Llive/hms/video/services/HMSScreenCaptureService;)V",
        "screenShareCaptureIntent",
        "live/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1",
        "serviceConnection",
        "Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;",
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
.field public static final Companion:Llive/hms/video/media/capturers/HMSScreenCapturer$Companion;

.field public static final TAG:Ljava/lang/String; = "HMSScreenCapturer"


# instance fields
.field private capturerService:Llive/hms/video/services/HMSScreenCaptureService;

.field private final context:Landroid/content/Context;

.field private endScreenshareJob:Lbc3/k1;

.field private final hmsVideoTrackSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private final mediaProjectionPermissionResultData:Landroid/content/Intent;

.field private final screenShareCaptureIntent:Landroid/content/Intent;

.field private final serviceConnection:Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;

.field private final source:Lhms/webrtc/VideoSource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/capturers/HMSScreenCapturer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/capturers/HMSScreenCapturer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/capturers/HMSScreenCapturer;->Companion:Llive/hms/video/media/capturers/HMSScreenCapturer$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lhms/webrtc/VideoSource;",
            "Landroid/content/Intent;",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
            "Landroid/app/Notification;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsVideoTrackSettings"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endScreenShare"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->source:Lhms/webrtc/VideoSource;

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->hmsVideoTrackSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    new-instance p2, Landroid/content/Intent;

    const-class p3, Llive/hms/video/services/HMSScreenCaptureService;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "hms_screenshare_notification_extra"

    invoke-virtual {p2, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->screenShareCaptureIntent:Landroid/content/Intent;

    new-instance p1, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;

    invoke-direct {p1, p0, p6}, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;-><init>(Llive/hms/video/media/capturers/HMSScreenCapturer;Lc93/a;)V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;

    return-void
.end method

.method public static final synthetic access$getHmsVideoTrackSettings$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->hmsVideoTrackSettings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object p0
.end method

.method public static final synthetic access$getMediaProjectionPermissionResultData$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    return-object p0
.end method

.method public static final synthetic access$getSource$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Lhms/webrtc/VideoSource;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->source:Lhms/webrtc/VideoSource;

    return-object p0
.end method

.method public static final synthetic access$setEndScreenshareJob$p(Llive/hms/video/media/capturers/HMSScreenCapturer;Lbc3/k1;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->endScreenshareJob:Lbc3/k1;

    return-void
.end method

.method private final startCapturer()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->context:Landroid/content/Context;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->screenShareCaptureIntent:Landroid/content/Intent;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCapturer$DefaultImpls;->dispose(Llive/hms/video/media/capturers/HMSCapturer;)V

    return-void
.end method

.method public final getCapturerService()Llive/hms/video/services/HMSScreenCaptureService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    return-object v0
.end method

.method public final setCapturerService(Llive/hms/video/services/HMSScreenCaptureService;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    return-void
.end method

.method public start()V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSScreenCapturer;->startCapturer()V

    return-void
.end method

.method public stop()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->endScreenshareJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/services/HMSScreenCaptureService;->stopScreenCapturer()V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->context:Landroid/content/Context;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->serviceConnection:Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    iput-object v1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer;->capturerService:Llive/hms/video/services/HMSScreenCaptureService;

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v1, "HMSScreenCapturer"

    const-string v2, "destroyed from capturer"

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
