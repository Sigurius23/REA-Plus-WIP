.class public final Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSScreenCapturer;-><init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "name",
        "Landroid/os/IBinder;",
        "service",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
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
.field final synthetic $endScreenShare:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/HMSScreenCapturer;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/capturers/HMSScreenCapturer;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->$endScreenShare:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    const-string v0, "null cannot be cast to non-null type live.hms.video.services.HMSScreenCaptureService.LocalBinder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;

    invoke-virtual {p2}, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;->getService()Llive/hms/video/services/HMSScreenCaptureService;

    move-result-object p2

    invoke-virtual {p1, p2}, Llive/hms/video/media/capturers/HMSScreenCapturer;->setCapturerService(Llive/hms/video/services/HMSScreenCaptureService;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    invoke-virtual {p1}, Llive/hms/video/media/capturers/HMSScreenCapturer;->getCapturerService()Llive/hms/video/services/HMSScreenCaptureService;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    invoke-static {p2}, Llive/hms/video/media/capturers/HMSScreenCapturer;->access$getMediaProjectionPermissionResultData$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Landroid/content/Intent;

    move-result-object p2

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    invoke-static {v0}, Llive/hms/video/media/capturers/HMSScreenCapturer;->access$getHmsVideoTrackSettings$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    invoke-static {v1}, Llive/hms/video/media/capturers/HMSScreenCapturer;->access$getSource$p(Llive/hms/video/media/capturers/HMSScreenCapturer;)Lhms/webrtc/VideoSource;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Llive/hms/video/services/HMSScreenCaptureService;->startScreenCapture(Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Lhms/webrtc/VideoSource;)V

    :cond_0
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    sget-object p2, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->$endScreenShare:Lc93/a;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1$onServiceConnected$1;-><init>(Llive/hms/video/media/capturers/HMSScreenCapturer;Lc93/a;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p2, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p2

    invoke-static {p1, p2}, Llive/hms/video/media/capturers/HMSScreenCapturer;->access$setEndScreenshareJob$p(Llive/hms/video/media/capturers/HMSScreenCapturer;Lbc3/k1;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;->this$0:Llive/hms/video/media/capturers/HMSScreenCapturer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llive/hms/video/media/capturers/HMSScreenCapturer;->setCapturerService(Llive/hms/video/services/HMSScreenCaptureService;)V

    return-void
.end method
