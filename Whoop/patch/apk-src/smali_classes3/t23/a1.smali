.class public final Lt23/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;


# instance fields
.field public final synthetic a:Lbc3/m;


# direct methods
.method public constructor <init>(Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/a1;->a:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final onCameraSwitchDone(Z)V
    .locals 2

    iget-object v0, p0, Lt23/a1;->a:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onCameraSwitchError(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lt23/a1;->a:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    if-nez p1, :cond_0

    const-string p1, "Unknown"

    :cond_0
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
