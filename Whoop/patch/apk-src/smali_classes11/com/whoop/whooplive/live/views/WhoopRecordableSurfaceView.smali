.class public Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;
.super Landroid/view/SurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;,
        Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;
    }
.end annotation


# static fields
.field public static O:I = 0x0

.field public static P:I = 0x1


# instance fields
.field private E:Z

.field protected F:Landroid/media/MediaRecorder;

.field private G:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

.field private H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private J:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;",
            ">;"
        }
    .end annotation
.end field

.field private K:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private L:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private M:Ltr2/o;

.field private N:Z

.field protected w:Landroid/view/Surface;

.field private x:Ljava/util/concurrent/atomic/AtomicInteger;

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    sget p2, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->P:I

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p1, 0x0

    iput p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->y:I

    iput p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->z:I

    iput-boolean p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->z:I

    return p0
.end method

.method public static bridge synthetic c(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    return p0
.end method

.method public static bridge synthetic e(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->J:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)I
    .locals 0

    iget p0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->y:I

    return p0
.end method

.method public static bridge synthetic j(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->z:I

    return-void
.end method

.method public static bridge synthetic k(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;I)V
    .locals 0

    iput p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->y:I

    return-void
.end method


# virtual methods
.method public getRenderMode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public getRendererCallbacks()Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->J:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/media/MediaCodec;->createPersistentInputSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->w:Landroid/view/Surface;

    new-instance v0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

    invoke-direct {v0, p0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;-><init>(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;)V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->G:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

    :cond_0
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->G:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->G:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    return-void
.end method

.method public m(Ljava/io/File;IIILandroid/media/MediaRecorder$OnErrorListener;Landroid/media/MediaRecorder$OnInfoListener;)V
    .locals 3

    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    invoke-virtual {v0, p6}, Landroid/media/MediaRecorder;->setOnInfoListener(Landroid/media/MediaRecorder$OnInfoListener;)V

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setOnErrorListener(Landroid/media/MediaRecorder$OnErrorListener;)V

    const/4 p5, 0x2

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setVideoSource(I)V

    iget-object p6, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->w:Landroid/view/Surface;

    invoke-virtual {v0, p6}, Landroid/media/MediaRecorder;->setInputSurface(Landroid/view/Surface;)V

    const/4 p6, 0x1

    invoke-virtual {v0, p6}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    const/4 p5, 0x3

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    const p5, 0xac44

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    const p5, 0x17700

    invoke-virtual {v0, p5}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    if-le p2, p3, :cond_0

    const/16 p2, 0x780

    const/16 p3, 0x438

    :cond_0
    invoke-virtual {v0, p2, p3}, Landroid/media/MediaRecorder;->setVideoSize(II)V

    iget-object p5, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->M:Ltr2/o;

    const-string p6, " and diplayHeight: "

    const-string v1, " to media recorder"

    const-string v2, "Setting up displayWidth: "

    invoke-static {p2, p3, v2, p6, v1}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    new-array p6, p3, [Lqr2/a$a;

    invoke-virtual {p5, p2, p6}, Ltr2/o;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v0, p3}, Landroid/media/MediaRecorder;->setVideoEncoder(I)V

    const p2, 0x7270e0

    invoke-virtual {v0, p2}, Landroid/media/MediaRecorder;->setVideoEncodingBitRate(I)V

    const/16 p2, 0x1e

    invoke-virtual {v0, p2}, Landroid/media/MediaRecorder;->setVideoFrameRate(I)V

    invoke-virtual {v0, p4}, Landroid/media/MediaRecorder;->setOrientationHint(I)V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->w:Landroid/view/Surface;

    invoke-virtual {v0, p1}, Landroid/media/MediaRecorder;->setPreviewDisplay(Landroid/view/Surface;)V

    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->M:Ltr2/o;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "IO Exception on Media Recorder init method: "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, p3, [Lqr2/a$a;

    invoke-virtual {p2, p1, p3}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    return-void
.end method

.method public n(Ljava/io/File;IILandroid/media/MediaRecorder$OnErrorListener;Landroid/media/MediaRecorder$OnInfoListener;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "WhoopRecordableSurfaceView"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->M:Ltr2/o;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move v6, p3

    move-object v8, p4

    move-object v9, p5

    invoke-virtual/range {v3 .. v9}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->m(Ljava/io/File;IIILandroid/media/MediaRecorder$OnErrorListener;Landroid/media/MediaRecorder$OnInfoListener;)V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->N:Z

    return v0
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    return-void
.end method

.method public q()V
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->l()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    return-void
.end method

.method public r()Z
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iput-boolean v2, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->N:Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->reset()V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    return v1
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->E:Z

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->G:Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    :cond_2
    return-void
.end method

.method public setRenderMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->x:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public setRendererCallbacks(Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView$b;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->J:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public t()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->N:Z

    :try_start_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v1}, Landroid/media/MediaRecorder;->release()V

    throw v0

    :catch_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->F:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    return v1

    :cond_0
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopRecordableSurfaceView;->M:Ltr2/o;

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Cannot stop. Is not recording."

    invoke-virtual {v0, v2, v1}, Ltr2/o;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
