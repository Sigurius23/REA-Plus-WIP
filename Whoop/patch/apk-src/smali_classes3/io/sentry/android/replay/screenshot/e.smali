.class public final synthetic Lio/sentry/android/replay/screenshot/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Landroid/view/View;

.field public final synthetic F:Lio/sentry/android/replay/viewhierarchy/g;

.field public final synthetic w:Lio/sentry/android/replay/screenshot/h;

.field public final synthetic x:[Lcom/google/android/material/datepicker/n;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/screenshot/h;[Lcom/google/android/material/datepicker/n;IILandroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/e;->w:Lio/sentry/android/replay/screenshot/h;

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/e;->x:[Lcom/google/android/material/datepicker/n;

    iput p3, p0, Lio/sentry/android/replay/screenshot/e;->y:I

    iput p4, p0, Lio/sentry/android/replay/screenshot/e;->z:I

    iput-object p5, p0, Lio/sentry/android/replay/screenshot/e;->E:Landroid/view/View;

    iput-object p6, p0, Lio/sentry/android/replay/screenshot/e;->F:Lio/sentry/android/replay/viewhierarchy/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/replay/screenshot/e;->w:Lio/sentry/android/replay/screenshot/h;

    iget-object v2, v1, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    iget-object v3, v0, Lio/sentry/android/replay/screenshot/e;->x:[Lcom/google/android/material/datepicker/n;

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, v1, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    :cond_0
    array-length v2, v3

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_2

    aget-object v6, v3, v5

    if-eqz v6, :cond_1

    iget-object v7, v6, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-nez v8, :cond_1

    iget-object v8, v1, Lio/sentry/android/replay/screenshot/h;->n:Ljava/lang/Object;

    invoke-interface {v8}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Canvas;

    iget-object v9, v1, Lio/sentry/android/replay/screenshot/h;->m:Ljava/lang/Object;

    invoke-interface {v9}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/Paint;

    iget-object v10, v1, Lio/sentry/android/replay/screenshot/h;->o:Landroid/graphics/Rect;

    iget-object v11, v1, Lio/sentry/android/replay/screenshot/h;->p:Landroid/graphics/RectF;

    iget v12, v6, Lcom/google/android/material/datepicker/n;->x:I

    iget v6, v6, Lcom/google/android/material/datepicker/n;->y:I

    iget-object v13, v1, Lio/sentry/android/replay/screenshot/h;->c:Lio/sentry/android/replay/w;

    iget v14, v13, Lio/sentry/android/replay/w;->c:F

    iget v13, v13, Lio/sentry/android/replay/w;->d:F

    const-string v15, "destCanvas"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "destPaint"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "tmpSrc"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "tmpDst"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v15, v0, Lio/sentry/android/replay/screenshot/e;->y:I

    sub-int/2addr v12, v15

    int-to-float v12, v12

    mul-float/2addr v12, v14

    iget v15, v0, Lio/sentry/android/replay/screenshot/e;->z:I

    sub-int/2addr v6, v15

    int-to-float v6, v6

    mul-float/2addr v6, v13

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v15

    move/from16 v16, v2

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v10, v4, v4, v15, v2}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v14

    add-float/2addr v2, v12

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v14

    int-to-float v14, v14

    mul-float/2addr v14, v13

    add-float/2addr v14, v6

    invoke-virtual {v11, v12, v6, v2, v14}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v8, v7, v10, v11, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    :cond_1
    move/from16 v16, v2

    :goto_1
    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v16

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lio/sentry/android/replay/screenshot/e;->E:Landroid/view/View;

    iget-object v3, v0, Lio/sentry/android/replay/screenshot/e;->F:Lio/sentry/android/replay/viewhierarchy/g;

    invoke-virtual {v1, v2, v3}, Lio/sentry/android/replay/screenshot/h;->d(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;)V

    return-void

    :cond_3
    :goto_2
    iget-object v1, v1, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "PixelCopyStrategy is closed, skipping compositing"

    new-array v6, v4, [Ljava/lang/Object;

    invoke-interface {v1, v2, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    array-length v1, v3

    :goto_3
    if-ge v4, v1, :cond_5

    aget-object v2, v3, v4

    if-eqz v2, :cond_4

    iget-object v2, v2, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    return-void
.end method
