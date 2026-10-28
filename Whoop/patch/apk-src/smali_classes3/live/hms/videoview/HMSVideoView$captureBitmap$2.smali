.class public final Llive/hms/videoview/HMSVideoView$captureBitmap$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/EglRenderer$FrameListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/videoview/HMSVideoView;->captureBitmap(Lkotlin/jvm/functions/Function1;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/videoview/HMSVideoView$captureBitmap$2",
        "Lhms/webrtc/EglRenderer$FrameListener;",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Ll83/a0;",
        "onFrame",
        "(Landroid/graphics/Bitmap;)V",
        "videoview_release"
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
.field final synthetic $onBitmap:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/videoview/HMSVideoView;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Llive/hms/videoview/HMSVideoView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Llive/hms/videoview/HMSVideoView;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->$onBitmap:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->this$0:Llive/hms/videoview/HMSVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Llive/hms/videoview/HMSVideoView;Llive/hms/videoview/HMSVideoView$captureBitmap$2;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->onFrame$lambda$0(Llive/hms/videoview/HMSVideoView;Llive/hms/videoview/HMSVideoView$captureBitmap$2;)V

    return-void
.end method

.method private static final onFrame$lambda$0(Llive/hms/videoview/HMSVideoView;Llive/hms/videoview/HMSVideoView$captureBitmap$2;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lhms/webrtc/SurfaceViewRenderer;->removeFrameListener(Lhms/webrtc/EglRenderer$FrameListener;)V

    return-void
.end method


# virtual methods
.method public onFrame(Landroid/graphics/Bitmap;)V
    .locals 3

    iget-object v0, p0, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->$onBitmap:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v0, p0, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->this$0:Llive/hms/videoview/HMSVideoView;

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v2, 0x11

    invoke-direct {v1, v2, v0, p0}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
