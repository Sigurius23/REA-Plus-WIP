.class public final Li9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashSet;

.field public final b:Li9/h;

.field public c:Landroid/media/LoudnessCodecController;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Li9/h;->w:Li9/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Li9/i;->a:Ljava/util/HashSet;

    iput-object v0, p0, Li9/i;->b:Li9/h;

    return-void
.end method


# virtual methods
.method public final a(Landroid/media/MediaCodec;)V
    .locals 1

    iget-object v0, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/LoudnessCodecController;->addMediaCodec(Landroid/media/MediaCodec;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li9/i;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lva3/g;->i(Z)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Li9/i;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iget-object v0, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/LoudnessCodecController;->close()V

    :cond_0
    return-void
.end method

.method public final c(Landroid/media/MediaCodec;)V
    .locals 1

    iget-object v0, p0, Li9/i;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/LoudnessCodecController;->removeMediaCodec(Landroid/media/MediaCodec;)V

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 2

    iget-object v0, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/LoudnessCodecController;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    :cond_0
    new-instance v0, Li9/g;

    invoke-direct {v0, p0}, Li9/g;-><init>(Li9/i;)V

    sget-object v1, Lds/r;->w:Lds/r;

    invoke-static {p1, v1, v0}, Landroid/media/LoudnessCodecController;->create(ILjava/util/concurrent/Executor;Landroid/media/LoudnessCodecController$OnLoudnessCodecUpdateListener;)Landroid/media/LoudnessCodecController;

    move-result-object p1

    iput-object p1, p0, Li9/i;->c:Landroid/media/LoudnessCodecController;

    iget-object v0, p0, Li9/i;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/MediaCodec;

    invoke-virtual {p1, v1}, Landroid/media/LoudnessCodecController;->addMediaCodec(Landroid/media/MediaCodec;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method
