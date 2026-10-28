.class public final synthetic Llive/hms/video/media/capturers/camera/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Llive/hms/video/media/capturers/camera/CameraControl;

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/a;->w:Llive/hms/video/media/capturers/camera/CameraControl;

    iput p2, p0, Llive/hms/video/media/capturers/camera/a;->x:F

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/a;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Llive/hms/video/media/capturers/camera/a;->x:F

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/a;->y:Ljava/lang/String;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/a;->w:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-static {v2, v0, v1}, Llive/hms/video/media/capturers/camera/CameraControl;->c(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V

    return-void
.end method
