.class public Lcom/whoop/whooplive/live/views/WhoopPlaybackView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field private E:Z

.field private F:Landroid/media/AudioAttributes;

.field private w:Landroid/net/Uri;

.field private x:Landroid/media/MediaPlayer;

.field private y:Landroid/view/Surface;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->E:Z

    invoke-direct {p0}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->j()V

    return-void
.end method

.method private j()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lpz2/f;->d:I

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    sget v0, Lpz2/e;->m0:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->F:Landroid/media/AudioAttributes;

    return-void
.end method

.method private m(Landroid/net/Uri;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->y:Landroid/view/Surface;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->F:Landroid/media/AudioAttributes;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const-string v0, "WhoopPlaybackView"

    const-string v1, "prepareMediaPlayer: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method


# virtual methods
.method public f()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->w:Landroid/net/Uri;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->w:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    iput-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->w:Landroid/net/Uri;

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    iput-object v1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->z:Z

    invoke-virtual {p0, p1}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->setFilePath(Landroid/net/Uri;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->E:Z

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->z:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->E:Z

    iget-boolean v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 0

    iget-boolean p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->E:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->x:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    new-instance p2, Landroid/view/Surface;

    invoke-direct {p2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p2, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->y:Landroid/view/Surface;

    iget-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->w:Landroid/net/Uri;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->m(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->y:Landroid/view/Surface;

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public setFilePath(Landroid/net/Uri;)V
    .locals 1

    iput-object p1, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->w:Landroid/net/Uri;

    iget-object v0, p0, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->y:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/live/views/WhoopPlaybackView;->m(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method
