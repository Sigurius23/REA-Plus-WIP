.class public final Lio/sentry/android/core/g1;
.super Li63/j;
.source "SourceFile"


# virtual methods
.method public final c(Z)V
    .locals 6

    invoke-super {p0, p1}, Li63/j;->c(Z)V

    const-string v0, "com.google.android.exoplayer2.ui.StyledPlayerView"

    const-string v1, "com.google.android.exoplayer2.ui.PlayerView"

    const-string v2, "androidx.media3.ui.PlayerView"

    const-string v3, "androidx.camera.view.PreviewView"

    const-string v4, "android.widget.VideoView"

    const-string v5, "android.webkit.WebView"

    if-eqz p1, :cond_0

    invoke-virtual {p0, v5}, Li63/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Li63/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Li63/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Li63/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Li63/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Li63/j;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Li63/j;->b:Ljava/io/Serializable;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method
