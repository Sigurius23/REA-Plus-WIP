.class public final Le3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/a;->a:Ljava/lang/Object;

    iput-object p2, p0, Le3/a;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    invoke-static {v0}, Lb23/h;->b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    iget-object v1, p0, Le3/a;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [J

    const-wide/high16 v3, -0x8000000000000000L

    const/4 v5, 0x0

    aput-wide v3, v2, v5

    invoke-virtual {v0, v1, v2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewsDisappeared(Landroid/view/autofill/AutofillId;[J)V

    :cond_0
    return-void
.end method

.method public final b(J)Landroid/view/autofill/AutofillId;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    invoke-static {v0}, Lb23/h;->b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    iget-object v1, p0, Le3/a;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/contentcapture/ContentCaptureSession;->newAutofillId(Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Landroid/view/autofill/AutofillId;J)Lbu/c;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    invoke-static {v0}, Lb23/h;->b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/contentcapture/ContentCaptureSession;->newVirtualViewStructure(Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    move-result-object p1

    new-instance p2, Lbu/c;

    invoke-direct {p2, p1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Landroid/view/ViewStructure;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    invoke-static {v0}, Lb23/h;->b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewAppeared(Landroid/view/ViewStructure;)V

    :cond_0
    return-void
.end method

.method public final e(Landroid/view/autofill/AutofillId;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    invoke-static {v0}, Lb23/h;->b(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewDisappeared(Landroid/view/autofill/AutofillId;)V

    :cond_0
    return-void
.end method

.method public final f(Landroid/view/autofill/AutofillId;Ljava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le3/a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/contentcapture/ContentCaptureSession;

    invoke-virtual {v0, p1, p2}, Landroid/view/contentcapture/ContentCaptureSession;->notifyViewTextChanged(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
