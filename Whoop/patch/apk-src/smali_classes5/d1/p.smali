.class public final Ld1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public final a:Lro/i;

.field public final b:Z

.field public final c:Lu0/s0;

.field public final d:Lf1/s1;

.field public final e:Lb3/j3;

.field public f:I

.field public g:Lq3/y;

.field public h:I

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Z


# direct methods
.method public constructor <init>(Lq3/y;Lro/i;ZLu0/s0;Lf1/s1;Lb3/j3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld1/p;->a:Lro/i;

    iput-boolean p3, p0, Ld1/p;->b:Z

    iput-object p4, p0, Ld1/p;->c:Lu0/s0;

    iput-object p5, p0, Ld1/p;->d:Lf1/s1;

    iput-object p6, p0, Ld1/p;->e:Lb3/j3;

    iput-object p1, p0, Ld1/p;->g:Lq3/y;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ld1/p;->j:Ljava/util/ArrayList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld1/p;->k:Z

    return-void
.end method


# virtual methods
.method public final a(Lq3/h;)V
    .locals 1

    iget v0, p0, Ld1/p;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ld1/p;->f:I

    :try_start_0
    iget-object v0, p0, Ld1/p;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ld1/p;->b()Z

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ld1/p;->b()Z

    throw p1
.end method

.method public final b()Z
    .locals 3

    iget v0, p0, Ld1/p;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ld1/p;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/p;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Ld1/p;->a:Lro/i;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Ld1/o;

    iget-object v2, v2, Ld1/o;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_0
    iget v0, p0, Ld1/p;->f:I

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final beginBatchEdit()Z
    .locals 2

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ld1/p;->f:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ld1/p;->f:I

    return v1

    :cond_0
    return v0
.end method

.method public final c(I)V
    .locals 2

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, Ld1/p;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {p0, v0}, Ld1/p;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    return-void
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 0

    iget-boolean p1, p0, Ld1/p;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public final closeConnection()V
    .locals 4

    iget-object v0, p0, Ld1/p;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Ld1/p;->f:I

    iput-boolean v0, p0, Ld1/p;->k:Z

    iget-object v1, p0, Ld1/p;->a:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ld1/o;

    iget-object v1, v1, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 0

    iget-boolean p1, p0, Ld1/p;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 0

    iget-boolean p1, p0, Ld1/p;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 0

    iget-boolean p1, p0, Ld1/p;->k:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ld1/p;->b:Z

    :cond_0
    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 2

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, Lq3/a;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lq3/a;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1}, Ld1/p;->a(Lq3/h;)V

    :cond_0
    return v0
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lq3/f;

    invoke-direct {v0, p1, p2}, Lq3/f;-><init>(II)V

    invoke-virtual {p0, v0}, Ld1/p;->a(Lq3/h;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lq3/g;

    invoke-direct {v0, p1, p2}, Lq3/g;-><init>(II)V

    invoke-virtual {p0, v0}, Ld1/p;->a(Lq3/h;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final endBatchEdit()Z
    .locals 1

    invoke-virtual {p0}, Ld1/p;->b()Z

    move-result v0

    return v0
.end method

.method public final finishComposingText()Z
    .locals 1

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lq3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Ld1/p;->a(Lq3/h;)V

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 4

    iget-object v0, p0, Ld1/p;->g:Lq3/y;

    iget-object v1, v0, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    iget-wide v2, v0, Lq3/y;->b:J

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v0

    invoke-static {v1, v0, p1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Ld1/p;->i:Z

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget v1, p1, Landroid/view/inputmethod/ExtractedTextRequest;->token:I

    :cond_1
    iput v1, p0, Ld1/p;->h:I

    :cond_2
    iget-object p1, p0, Ld1/p;->g:Lq3/y;

    invoke-static {p1}, Lbp/b;->e(Lq3/y;)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 2

    iget-object p1, p0, Ld1/p;->g:Lq3/y;

    iget-wide v0, p1, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Ld1/p;->g:Lq3/y;

    invoke-static {p1}, Lvp/c;->V(Lq3/y;)Ll3/g;

    move-result-object p1

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    return-object p1
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, Ld1/p;->g:Lq3/y;

    invoke-static {p2, p1}, Lvp/c;->Y(Lq3/y;I)Ll3/g;

    move-result-object p1

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    return-object p1
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 0

    iget-object p2, p0, Ld1/p;->g:Lq3/y;

    invoke-static {p2, p1}, Lvp/c;->Z(Lq3/y;I)Ll3/g;

    move-result-object p1

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    return-object p1
.end method

.method public final performContextMenuAction(I)Z
    .locals 2

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    return v0

    :pswitch_0
    const/16 p1, 0x117

    invoke-virtual {p0, p1}, Ld1/p;->c(I)V

    return v0

    :pswitch_1
    const/16 p1, 0x116

    invoke-virtual {p0, p1}, Ld1/p;->c(I)V

    return v0

    :pswitch_2
    const/16 p1, 0x115

    invoke-virtual {p0, p1}, Ld1/p;->c(I)V

    return v0

    :pswitch_3
    new-instance p1, Lq3/x;

    iget-object v1, p0, Ld1/p;->g:Lq3/y;

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lq3/x;-><init>(II)V

    invoke-virtual {p0, p1}, Ld1/p;->a(Lq3/h;)V

    :cond_0
    return v0

    :pswitch_data_0
    .packed-switch 0x102001f
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performEditorAction(I)Z
    .locals 3

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string v1, "RecordingIC"

    const-string v2, "IME sends unsupported Editor Action: "

    invoke-static {p1, v2, v1}, Lb9/y;->z(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    move p1, v0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x5

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x7

    goto :goto_0

    :pswitch_2
    const/4 p1, 0x6

    goto :goto_0

    :pswitch_3
    const/4 p1, 0x4

    goto :goto_0

    :pswitch_4
    const/4 p1, 0x3

    goto :goto_0

    :pswitch_5
    const/4 p1, 0x2

    :goto_0
    iget-object v1, p0, Ld1/p;->a:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ld1/o;

    iget-object v1, v1, Ld1/o;->d:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lq3/k;

    invoke-direct {v2, p1}, Lq3/k;-><init>(I)V

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_3

    new-instance v0, Lck1/c;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Ld1/p;->c:Lu0/s0;

    if-eqz v1, :cond_0

    iget-object v2, p0, Ld1/p;->d:Lf1/s1;

    iget-object v3, p0, Ld1/p;->e:Lb3/j3;

    invoke-static {v1, p1, v2, v3, v0}, Lb3/g1;->n(Lu0/s0;Landroid/view/inputmethod/HandwritingGesture;Lf1/s1;Lb3/j3;Lck1/c;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    new-instance v0, Lb9/g0;

    const/4 v1, 0x1

    invoke-direct {v0, p3, p1, v1}, Lb9/g0;-><init>(Ljava/lang/Object;II)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    invoke-interface {p3, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 0

    iget-boolean p1, p0, Ld1/p;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ld1/p;->c:Lu0/s0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ld1/p;->d:Lf1/s1;

    invoke-static {v0, p1, v1, p2}, Lb3/g1;->o(Lu0/s0;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lf1/s1;Landroid/os/CancellationSignal;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final reportFullscreenMode(Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final requestCursorUpdates(I)Z
    .locals 9

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_a

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v3, p1, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt v4, v5, :cond_8

    and-int/lit8 v5, p1, 0x10

    if-eqz v5, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    and-int/lit8 v6, p1, 0x8

    if-eqz v6, :cond_3

    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v1

    :goto_3
    and-int/lit8 v7, p1, 0x4

    if-eqz v7, :cond_4

    move v7, v2

    goto :goto_4

    :cond_4
    move v7, v1

    :goto_4
    const/16 v8, 0x22

    if-lt v4, v8, :cond_5

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    if-nez v5, :cond_7

    if-nez v6, :cond_7

    if-nez v7, :cond_7

    if-nez v1, :cond_7

    if-lt v4, v8, :cond_6

    move p1, v2

    move v1, p1

    :goto_5
    move v5, v1

    :goto_6
    move v6, v5

    goto :goto_7

    :cond_6
    move p1, v1

    move v1, v2

    goto :goto_5

    :cond_7
    move p1, v1

    move v1, v7

    goto :goto_7

    :cond_8
    move p1, v1

    move v5, v2

    goto :goto_6

    :goto_7
    iget-object v4, p0, Ld1/p;->a:Lro/i;

    iget-object v4, v4, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Ld1/o;

    iget-object v4, v4, Ld1/o;->m:Ld1/l;

    iget-object v7, v4, Ld1/l;->c:Ljava/lang/Object;

    monitor-enter v7

    :try_start_0
    iput-boolean v5, v4, Ld1/l;->f:Z

    iput-boolean v6, v4, Ld1/l;->g:Z

    iput-boolean v1, v4, Ld1/l;->h:Z

    iput-boolean p1, v4, Ld1/l;->i:Z

    if-eqz v0, :cond_9

    iput-boolean v2, v4, Ld1/l;->e:Z

    iget-object p1, v4, Ld1/l;->j:Lq3/y;

    if-eqz p1, :cond_9

    invoke-virtual {v4}, Ld1/l;->a()V

    goto :goto_8

    :catchall_0
    move-exception p1

    goto :goto_9

    :cond_9
    :goto_8
    iput-boolean v3, v4, Ld1/l;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v7

    return v2

    :goto_9
    monitor-exit v7

    throw p1

    :cond_a
    return v0
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld1/p;->a:Lro/i;

    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ld1/o;

    iget-object v0, v0, Ld1/o;->k:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    invoke-virtual {v0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final setComposingRegion(II)Z
    .locals 2

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, Lq3/v;

    invoke-direct {v1, p1, p2}, Lq3/v;-><init>(II)V

    invoke-virtual {p0, v1}, Ld1/p;->a(Lq3/h;)V

    :cond_0
    return v0
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 2

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v1, Lq3/w;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lq3/w;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1}, Ld1/p;->a(Lq3/h;)V

    :cond_0
    return v0
.end method

.method public final setSelection(II)Z
    .locals 1

    iget-boolean v0, p0, Ld1/p;->k:Z

    if-eqz v0, :cond_0

    new-instance v0, Lq3/x;

    invoke-direct {v0, p1, p2}, Lq3/x;-><init>(II)V

    invoke-virtual {p0, v0}, Ld1/p;->a(Lq3/h;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
