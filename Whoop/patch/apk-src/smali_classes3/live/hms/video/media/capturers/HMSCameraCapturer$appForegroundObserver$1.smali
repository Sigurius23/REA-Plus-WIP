.class public final Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSCameraCapturer;-><init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onStart",
        "(Landroidx/lifecycle/g0;)V",
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
.field final synthetic this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
