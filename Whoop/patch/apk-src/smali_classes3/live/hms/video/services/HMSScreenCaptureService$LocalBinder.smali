.class public final Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/services/HMSScreenCaptureService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "LocalBinder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;",
        "Landroid/os/Binder;",
        "<init>",
        "(Llive/hms/video/services/HMSScreenCaptureService;)V",
        "service",
        "Llive/hms/video/services/HMSScreenCaptureService;",
        "getService",
        "()Llive/hms/video/services/HMSScreenCaptureService;",
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
.field final synthetic this$0:Llive/hms/video/services/HMSScreenCaptureService;


# direct methods
.method public constructor <init>(Llive/hms/video/services/HMSScreenCaptureService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;->this$0:Llive/hms/video/services/HMSScreenCaptureService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public final getService()Llive/hms/video/services/HMSScreenCaptureService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;->this$0:Llive/hms/video/services/HMSScreenCaptureService;

    return-object v0
.end method
