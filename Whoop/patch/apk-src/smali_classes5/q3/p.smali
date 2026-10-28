.class public final Lq3/p;
.super Lq3/o;
.source "SourceFile"


# virtual methods
.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Ld1/p;->performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V

    :cond_0
    return-void
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
