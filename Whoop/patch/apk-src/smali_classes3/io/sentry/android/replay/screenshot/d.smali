.class public final synthetic Lio/sentry/android/replay/screenshot/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/screenshot/h;

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:[Lcom/google/android/material/datepicker/n;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic h:Landroid/view/View;

.field public final synthetic i:Lio/sentry/android/replay/viewhierarchy/g;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/screenshot/h;Landroid/graphics/Bitmap;[Lcom/google/android/material/datepicker/n;IIILjava/util/concurrent/atomic/AtomicInteger;Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/d;->a:Lio/sentry/android/replay/screenshot/h;

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/d;->b:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lio/sentry/android/replay/screenshot/d;->c:[Lcom/google/android/material/datepicker/n;

    iput p4, p0, Lio/sentry/android/replay/screenshot/d;->d:I

    iput p5, p0, Lio/sentry/android/replay/screenshot/d;->e:I

    iput p6, p0, Lio/sentry/android/replay/screenshot/d;->f:I

    iput-object p7, p0, Lio/sentry/android/replay/screenshot/d;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p8, p0, Lio/sentry/android/replay/screenshot/d;->h:Landroid/view/View;

    iput-object p9, p0, Lio/sentry/android/replay/screenshot/d;->i:Lio/sentry/android/replay/viewhierarchy/g;

    iput p10, p0, Lio/sentry/android/replay/screenshot/d;->j:I

    iput p11, p0, Lio/sentry/android/replay/screenshot/d;->k:I

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 10

    iget-object v1, p0, Lio/sentry/android/replay/screenshot/d;->a:Lio/sentry/android/replay/screenshot/h;

    iget-object v0, v1, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    iget-object v2, p0, Lio/sentry/android/replay/screenshot/d;->b:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lio/sentry/android/replay/screenshot/d;->c:[Lcom/google/android/material/datepicker/n;

    move v4, v0

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/d;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v5, v2

    iget-object v2, p0, Lio/sentry/android/replay/screenshot/d;->h:Landroid/view/View;

    move v6, v4

    iget-object v4, p0, Lio/sentry/android/replay/screenshot/d;->i:Lio/sentry/android/replay/viewhierarchy/g;

    move-object v7, v5

    iget v5, p0, Lio/sentry/android/replay/screenshot/d;->j:I

    move v8, v6

    iget v6, p0, Lio/sentry/android/replay/screenshot/d;->k:I

    if-eqz v8, :cond_0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    invoke-static/range {v0 .. v6}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcom/google/android/material/datepicker/n;Lio/sentry/android/replay/viewhierarchy/g;II)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Lcom/google/android/material/datepicker/n;

    iget v8, p0, Lio/sentry/android/replay/screenshot/d;->e:I

    iget v9, p0, Lio/sentry/android/replay/screenshot/d;->f:I

    invoke-direct {p1, v7, v8, v9}, Lcom/google/android/material/datepicker/n;-><init>(Landroid/graphics/Bitmap;II)V

    iget v7, p0, Lio/sentry/android/replay/screenshot/d;->d:I

    aput-object p1, v3, v7

    goto :goto_0

    :cond_1
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    iget-object v7, v1, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    invoke-virtual {v7}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v9, "Failed to capture SurfaceView: %d"

    invoke-interface {v7, v8, v9, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-static/range {v0 .. v6}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcom/google/android/material/datepicker/n;Lio/sentry/android/replay/viewhierarchy/g;II)V

    return-void
.end method
