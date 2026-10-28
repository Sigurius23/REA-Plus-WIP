.class public Lq3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/inputmethod/InputConnection;


# instance fields
.field public final a:La0/a1;

.field public b:Ld1/p;


# direct methods
.method public constructor <init>(Ld1/p;La0/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq3/o;->a:La0/a1;

    iput-object p1, p0, Lq3/o;->b:Ld1/p;

    return-void
.end method


# virtual methods
.method public final a(Ld1/p;)V
    .locals 0

    invoke-virtual {p1}, Ld1/p;->closeConnection()V

    return-void
.end method

.method public final beginBatchEdit()Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld1/p;->beginBatchEdit()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final clearMetaKeyStates(I)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->clearMetaKeyStates(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final closeConnection()V
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lq3/o;->a(Ld1/p;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lq3/o;->b:Ld1/p;

    :cond_0
    iget-object v0, p0, Lq3/o;->a:La0/a1;

    invoke-virtual {v0, p0}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Ld1/p;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->commitCorrection(Landroid/view/inputmethod/CorrectionInfo;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final commitText(Ljava/lang/CharSequence;I)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->commitText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final deleteSurroundingText(II)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->deleteSurroundingText(II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final endBatchEdit()Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld1/p;->b()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final finishComposingText()Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld1/p;->finishComposingText()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getCursorCapsMode(I)I
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->getCursorCapsMode(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectedText(I)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->getSelectedText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getTextAfterCursor(II)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->getTextAfterCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getTextBeforeCursor(II)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final performContextMenuAction(I)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->performContextMenuAction(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final performEditorAction(I)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->performEditorAction(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z

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
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->requestCursorUpdates(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld1/p;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setComposingRegion(II)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->setComposingRegion(II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setComposingText(Ljava/lang/CharSequence;I)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->setComposingText(Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final setSelection(II)Z
    .locals 1

    iget-object v0, p0, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ld1/p;->setSelection(II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
