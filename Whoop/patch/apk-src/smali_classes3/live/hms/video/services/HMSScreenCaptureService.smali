.class public final Llive/hms/video/services/HMSScreenCaptureService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/services/HMSScreenCaptureService$Companion;,
        Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u0000 :2\u00020\u0001:\u0002;:B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001a\u0010\u0003J\u0019\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J)\u0010#\u001a\u00020 2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u001c\u0010\'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010,R\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001d\u00104\u001a\u0008\u0012\u0004\u0012\u000203028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109\u00a8\u0006<"
    }
    d2 = {
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "createNotificationChannel",
        "Lhms/webrtc/VideoFrame;",
        "frame",
        "checkForOrientationChange",
        "(Lhms/webrtc/VideoFrame;)V",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "hmsVideoTrackSettings",
        "Lhms/webrtc/VideoSource;",
        "source",
        "startScreenCapture",
        "(Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Lhms/webrtc/VideoSource;)V",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "hmsPeerConnectionFactory",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "startAudioSharing$lib_release",
        "(Landroid/content/Intent;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V",
        "startAudioSharing",
        "stopScreenCapturer",
        "stopAudioCaptuer",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "onDestroy",
        "",
        "flags",
        "startId",
        "onStartCommand",
        "(Landroid/content/Intent;II)I",
        "",
        "kotlin.jvm.PlatformType",
        "TAG",
        "Ljava/lang/String;",
        "Llive/hms/video/services/ScreenCapturerAndroidCustom;",
        "screenCapturerAndroid",
        "Llive/hms/video/services/ScreenCapturerAndroidCustom;",
        "Llive/hms/video/factories/HMSPeerConnectionFactory;",
        "mBinder",
        "Landroid/os/IBinder;",
        "Landroid/app/Notification;",
        "customerNotification",
        "Landroid/app/Notification;",
        "Lec3/o1;",
        "",
        "endFlow",
        "Lec3/o1;",
        "getEndFlow",
        "()Lec3/o1;",
        "oldOrientation",
        "I",
        "Companion",
        "LocalBinder",
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
.field public static final ACTION_START:Ljava/lang/String; = "AudioCaptureService:Start"

.field public static final ACTION_STOP:Ljava/lang/String; = "AudioCaptureService:Stop"

.field public static final Companion:Llive/hms/video/services/HMSScreenCaptureService$Companion;

.field public static final LOCAL_SCREEN_CAPTURER_THREAD:Ljava/lang/String; = "local-screen-capturer-thread"

.field private static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String; = "ScreenCapture channel"

.field public static final PERMISSION_RESULT_DATA:Ljava/lang/String; = "permission_result_data"

.field public static final SCREEN_HEIGHT:Ljava/lang/String; = "screen_height"

.field public static final SCREEN_WIDTH:Ljava/lang/String; = "screen_width"

.field private static final SERVICE_ID:I = 0x7b


# instance fields
.field private final TAG:Ljava/lang/String;

.field private customerNotification:Landroid/app/Notification;

.field private final endFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

.field private final mBinder:Landroid/os/IBinder;

.field private oldOrientation:I

.field private screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/services/HMSScreenCaptureService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/services/HMSScreenCaptureService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/services/HMSScreenCaptureService;->Companion:Llive/hms/video/services/HMSScreenCaptureService$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v0, "HMSScreenCaptureService"

    iput-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->TAG:Ljava/lang/String;

    new-instance v0, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;

    invoke-direct {v0, p0}, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;-><init>(Llive/hms/video/services/HMSScreenCaptureService;)V

    iput-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->mBinder:Landroid/os/IBinder;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->endFlow:Lec3/o1;

    return-void
.end method

.method public static final synthetic access$checkForOrientationChange(Llive/hms/video/services/HMSScreenCaptureService;Lhms/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/services/HMSScreenCaptureService;->checkForOrientationChange(Lhms/webrtc/VideoFrame;)V

    return-void
.end method

.method private final checkForOrientationChange(Lhms/webrtc/VideoFrame;)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Llive/hms/video/utils/HMSUtils;->getOrientation(Landroid/content/Context;)I

    move-result v1

    iget v2, p0, Llive/hms/video/services/HMSScreenCaptureService;->oldOrientation:I

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSUtils;->hasOrientationChange(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iput v1, p0, Llive/hms/video/services/HMSScreenCaptureService;->oldOrientation:I

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v1

    invoke-interface {v1}, Lhms/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object p1

    invoke-interface {p1}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result p1

    const/16 v2, 0x1e

    invoke-virtual {v0, v1, p1, v2}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->changeCaptureFormat(III)V

    :cond_0
    return-void
.end method

.method private final createNotificationChannel()V
    .locals 4

    new-instance v0, Landroid/app/NotificationChannel;

    iget-object v1, p0, Llive/hms/video/services/HMSScreenCaptureService;->customerNotification:Landroid/app/Notification;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "ScreenCapture channel"

    :cond_1
    const-string v2, "Screen Capture Service Channel"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Landroid/app/NotificationManager;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method


# virtual methods
.method public final getEndFlow()Lec3/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/o1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->endFlow:Lec3/o1;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "hms_screenshare_notification_extra"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/app/Notification;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Llive/hms/video/services/HMSScreenCaptureService;->customerNotification:Landroid/app/Notification;

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->TAG:Ljava/lang/String;

    const-string v1, "TAG"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Is customer intent null? "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/services/HMSScreenCaptureService;->customerNotification:Landroid/app/Notification;

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/services/HMSScreenCaptureService;->createNotificationChannel()V

    iget-object p1, p0, Llive/hms/video/services/HMSScreenCaptureService;->customerNotification:Landroid/app/Notification;

    if-nez p1, :cond_2

    new-instance p1, Landroidx/core/app/NotificationCompat$Builder;

    const-string v0, "ScreenCapture channel"

    invoke-direct {p1, p0, v0}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "Service running in background"

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "Screen Capture is running in background"

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    const-string v0, "build(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    const/16 v0, 0x7b

    invoke-virtual {p0, v0, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    iget-object p1, p0, Llive/hms/video/services/HMSScreenCaptureService;->mBinder:Landroid/os/IBinder;

    return-object p1
.end method

.method public onDestroy()V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v1, p0, Llive/hms/video/services/HMSScreenCaptureService;->TAG:Ljava/lang/String;

    const-string v2, "TAG"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Being destroyed from the service"

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->stopCapture()V

    :cond_0
    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->stopAudioMixing()V

    :cond_1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p2

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p3

    :goto_0
    const-string v0, "AudioCaptureService:Stop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/services/HMSScreenCaptureService$onStartCommand$1;

    invoke-direct {v0, p0, p3}, Llive/hms/video/services/HMSScreenCaptureService$onStartCommand$1;-><init>(Llive/hms/video/services/HMSScreenCaptureService;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, p3, p3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return p2
.end method

.method public final startAudioSharing$lib_release(Landroid/content/Intent;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
    .locals 2

    const-string v0, "hmsPeerConnectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Llive/hms/video/services/HMSScreenCaptureService;->hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "media_projection"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/projection/MediaProjectionManager;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1, p1}, Landroid/media/projection/MediaProjectionManager;->getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;

    move-result-object p1

    const-string v0, "getMediaProjection(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1, p3}, Llive/hms/video/factories/HMSPeerConnectionFactory;->startAudioMixing(Landroid/media/projection/MediaProjection;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V

    return-void
.end method

.method public final startScreenCapture(Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Lhms/webrtc/VideoSource;)V
    .locals 2

    const-string v0, "hmsVideoTrackSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "source"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Llive/hms/video/services/ScreenCapturerAndroidCustom;

    new-instance v0, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$1;

    invoke-direct {v0}, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$1;-><init>()V

    invoke-direct {p2, p1, v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;-><init>(Landroid/content/Intent;Landroid/media/projection/MediaProjection$Callback;)V

    iput-object p2, p0, Llive/hms/video/services/HMSScreenCaptureService;->screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    sget-object p1, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-virtual {p1}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object p1

    const-string v0, "local-screen-capturer-thread"

    invoke-static {v0, p1}, Lhms/webrtc/SurfaceTextureHelper;->create(Ljava/lang/String;Lhms/webrtc/EglBase$Context;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;

    invoke-direct {v1, p3, p0}, Llive/hms/video/services/HMSScreenCaptureService$startScreenCapture$2;-><init>(Lhms/webrtc/VideoSource;Llive/hms/video/services/HMSScreenCaptureService;)V

    invoke-virtual {p2, p1, v0, v1}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V

    sget-object p1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "getApplicationContext(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Llive/hms/video/utils/HMSUtils;->getDeviceWidthAndHeight(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p2

    invoke-virtual {p1, p2}, Llive/hms/video/utils/HMSUtils;->applySizeConstraint(Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object p1

    iget-object p2, p0, Llive/hms/video/services/HMSScreenCaptureService;->screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    if-eqz p2, :cond_0

    iget p3, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    const/16 v0, 0x1e

    invoke-virtual {p2, p3, p1, v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->startCapture(III)V

    :cond_0
    return-void
.end method

.method public final stopAudioCaptuer()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->hmsPeerConnectionFactory:Llive/hms/video/factories/HMSPeerConnectionFactory;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/factories/HMSPeerConnectionFactory;->stopAudioMixing()V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method

.method public final stopScreenCapturer()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService;->screenCapturerAndroid:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->stopCapture()V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method
