.class public final Lfh/a;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public final E:I

.field public final F:I

.field public G:J

.field public H:I

.field public I:I

.field public J:Landroid/graphics/drawable/Drawable;

.field public final K:Landroid/graphics/drawable/Drawable;

.field public final L:Ljava/lang/Enum;

.field public final synthetic w:I

.field public final x:I

.field public final y:Z

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lgi/g;IZ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lfh/a;->w:I

    .line 14
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 15
    iput-object p3, p0, Lfh/a;->L:Ljava/lang/Enum;

    .line 16
    iput p4, p0, Lfh/a;->x:I

    .line 17
    iput-boolean p5, p0, Lfh/a;->y:Z

    .line 18
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lfh/a;->z:Ljava/util/ArrayList;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    .line 19
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p5

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    goto :goto_0

    :cond_0
    move-object p5, p3

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p3

    :goto_1
    invoke-virtual {p0, p5, v0}, Lfh/a;->a(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p5

    iput p5, p0, Lfh/a;->E:I

    if-eqz p1, :cond_2

    .line 20
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p5

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    goto :goto_2

    :cond_2
    move-object p5, p3

    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, p3

    :goto_3
    invoke-virtual {p0, p5, v0}, Lfh/a;->a(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p5

    iput p5, p0, Lfh/a;->F:I

    const/16 p5, 0xff

    .line 21
    iput p5, p0, Lfh/a;->H:I

    if-eqz p1, :cond_4

    .line 22
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_4

    :cond_4
    move-object p1, p3

    :goto_4
    iput-object p1, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz p2, :cond_5

    .line 23
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    :cond_5
    iput-object p3, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-lez p4, :cond_8

    .line 24
    iget-object p1, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_6
    if-eqz p3, :cond_7

    .line 25
    invoke-virtual {p3, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_7
    return-void

    .line 26
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lnh/g;IZ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfh/a;->w:I

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    iput-object p2, p0, Lfh/a;->L:Ljava/lang/Enum;

    .line 3
    iput p3, p0, Lfh/a;->x:I

    .line 4
    iput-boolean p4, p0, Lfh/a;->y:Z

    .line 5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lfh/a;->z:Ljava/util/ArrayList;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, p2

    :goto_0
    invoke-virtual {p0, p2, p4}, Lfh/a;->a(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p4

    iput p4, p0, Lfh/a;->E:I

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    goto :goto_1

    :cond_1
    move-object p4, p2

    :goto_1
    invoke-virtual {p0, p2, p4}, Lfh/a;->a(Ljava/lang/Integer;Ljava/lang/Integer;)I

    move-result p4

    iput p4, p0, Lfh/a;->F:I

    const/16 p4, 0xff

    .line 8
    iput p4, p0, Lfh/a;->H:I

    .line 9
    iput-object p2, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :cond_2
    iput-object p2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-lez p3, :cond_5

    .line 11
    iget-object p1, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_3
    if-eqz p2, :cond_4

    .line 12
    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_4
    return-void

    .line 13
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 2

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v0, :cond_5

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_3
    move p1, v0

    :goto_2
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_4
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_5
    :goto_3
    return v0

    :pswitch_0
    const/4 v0, -0x1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v0, :cond_b

    :goto_4
    if-nez p2, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_8

    goto :goto_7

    :cond_8
    :goto_5
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_6

    :cond_9
    move p1, v0

    :goto_6
    if-eqz p2, :cond_a

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_a
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_b
    :goto_7
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 4

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x2

    iput v0, p0, Lfh/a;->I:I

    const/4 v0, 0x0

    iput-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lfh/a;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, p0}, Lfr/c;->a(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    const/4 v0, 0x2

    iput v0, p0, Lfh/a;->I:I

    const/4 v0, 0x0

    iput-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lfh/a;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, p0}, Lfr/c;->a(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V
    .locals 10

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-lez v0, :cond_1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v3

    iget-object v4, p0, Lfh/a;->L:Ljava/lang/Enum;

    check-cast v4, Lnh/g;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/room/c1;->k(IIIILnh/g;)D

    move-result-wide v4

    int-to-double v6, v2

    int-to-double v8, v0

    mul-double/2addr v8, v4

    sub-double/2addr v6, v8

    const/4 v0, 0x2

    int-to-double v8, v0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Le93/b;->W(D)I

    move-result v0

    int-to-double v2, v3

    int-to-double v6, v1

    mul-double/2addr v4, v6

    sub-double/2addr v2, v4

    div-double/2addr v2, v8

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result v1

    iget v2, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v0

    iget v3, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iget v4, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v4, v0

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p2, v1

    invoke-virtual {p1, v2, v3, v4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public d(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V
    .locals 10

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-lez v0, :cond_1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v3

    iget-object v4, p0, Lfh/a;->L:Ljava/lang/Enum;

    check-cast v4, Lgi/g;

    invoke-static {v0, v1, v2, v3, v4}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v4

    int-to-double v6, v2

    int-to-double v8, v0

    mul-double/2addr v8, v4

    sub-double/2addr v6, v8

    const/4 v0, 0x2

    int-to-double v8, v0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Le93/b;->W(D)I

    move-result v0

    int-to-double v2, v3

    int-to-double v6, v1

    mul-double/2addr v4, v6

    sub-double/2addr v2, v4

    div-double/2addr v2, v8

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result v1

    iget v2, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v0

    iget v3, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iget v4, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v4, v0

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p2, v1

    invoke-virtual {p1, v2, v3, v4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->I:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_7

    iget v1, p0, Lfh/a;->H:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    :try_start_0
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_0
    const/4 v1, 0x2

    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-ne v0, v1, :cond_1

    if-eqz v2, :cond_7

    iget v0, p0, Lfh/a;->H:I

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    :try_start_1
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v3, p0, Lfh/a;->G:J

    sub-long/2addr v0, v3

    long-to-double v0, v0

    iget v3, p0, Lfh/a;->x:I

    int-to-double v3, v3

    div-double v5, v0, v3

    const-wide/16 v7, 0x0

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v5 .. v10}, Le93/b;->l(DDD)D

    move-result-wide v0

    iget v3, p0, Lfh/a;->H:I

    int-to-double v7, v3

    mul-double/2addr v0, v7

    double-to-int v0, v0

    iget-boolean v1, p0, Lfh/a;->y:Z

    if-eqz v1, :cond_2

    sub-int/2addr v3, v0

    :cond_2
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v5, v7

    if-ltz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_4

    iget-object v4, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_4

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    :try_start_2
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_1

    :catchall_2
    move-exception v0

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    :try_start_3
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lfh/a;->b()V

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_7
    :goto_3
    return-void

    :pswitch_0
    iget v0, p0, Lfh/a;->I:I

    if-nez v0, :cond_8

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_f

    iget v1, p0, Lfh/a;->H:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    :try_start_4
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto/16 :goto_7

    :catchall_4
    move-exception v0

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_8
    const/4 v1, 0x2

    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-ne v0, v1, :cond_9

    if-eqz v2, :cond_f

    iget v0, p0, Lfh/a;->H:I

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    :try_start_5
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_7

    :catchall_5
    move-exception v0

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v3, p0, Lfh/a;->G:J

    sub-long/2addr v0, v3

    long-to-double v0, v0

    iget v3, p0, Lfh/a;->x:I

    int-to-double v3, v3

    div-double v5, v0, v3

    const-wide/16 v7, 0x0

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v5 .. v10}, Le93/b;->l(DDD)D

    move-result-wide v0

    iget v3, p0, Lfh/a;->H:I

    int-to-double v7, v3

    mul-double/2addr v0, v7

    double-to-int v0, v0

    iget-boolean v1, p0, Lfh/a;->y:Z

    if-eqz v1, :cond_a

    sub-int/2addr v3, v0

    :cond_a
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    cmpl-double v1, v5, v7

    if-ltz v1, :cond_b

    const/4 v1, 0x1

    goto :goto_4

    :cond_b
    const/4 v1, 0x0

    :goto_4
    if-nez v1, :cond_c

    iget-object v4, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_c

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    :try_start_6
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_5

    :catchall_6
    move-exception v0

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_c
    :goto_5
    if-eqz v2, :cond_d

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    :try_start_7
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_6

    :catchall_7
    move-exception v0

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_d
    :goto_6
    if-eqz v1, :cond_e

    invoke-virtual {p0}, Lfh/a;->b()V

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_f
    :goto_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getAlpha()I
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->H:I

    return v0

    :pswitch_0
    iget v0, p0, Lfh/a;->H:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 3

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->I:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_2
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x0

    :cond_5
    :goto_1
    return-object v0

    :pswitch_0
    iget v0, p0, Lfh/a;->I:I

    if-eqz v0, :cond_9

    const/4 v1, 0x1

    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    goto :goto_2

    :cond_6
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_3

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    if-nez v0, :cond_b

    :cond_8
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_3

    :cond_9
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v0, 0x0

    :cond_b
    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->F:I

    return v0

    :pswitch_0
    iget v0, p0, Lfh/a;->F:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->E:I

    return v0

    :pswitch_0
    iget v0, p0, Lfh/a;->E:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getOpacity()I
    .locals 4

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lfh/a;->I:I

    if-nez v1, :cond_0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    iget-object v3, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-ne v1, v2, :cond_1

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v1

    invoke-static {v0, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v0

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, -0x2

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lfh/a;->I:I

    if-nez v1, :cond_5

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_1

    :cond_5
    const/4 v2, 0x2

    iget-object v3, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-ne v1, v2, :cond_6

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_1

    :cond_6
    if-eqz v0, :cond_7

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v1

    invoke-static {v0, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v0

    goto :goto_1

    :cond_7
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_1

    :cond_8
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    goto :goto_1

    :cond_9
    const/4 v0, -0x2

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget p1, p0, Lfh/a;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isRunning()Z
    .locals 2

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lfh/a;->I:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :pswitch_0
    iget v0, p0, Lfh/a;->I:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public isStateful()Z
    .locals 2

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Lfh/a;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, p1}, Lfh/a;->d(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0, p1}, Lfh/a;->c(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0, p1}, Lfh/a;->c(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onLevelChange(I)Z
    .locals 3

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result v0

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    goto :goto_3

    :cond_5
    move p1, v1

    :goto_3
    if-nez v0, :cond_6

    if-eqz p1, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStateChange([I)Z
    .locals 3

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    iget-object v2, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    goto :goto_3

    :cond_5
    move p1, v1

    :goto_3
    if-nez v0, :cond_6

    if-eqz p1, :cond_7

    :cond_6
    const/4 v1, 0x1

    :cond_7
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    iget p1, p0, Lfh/a;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setAlpha(I)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    if-ltz p1, :cond_0

    const/16 v0, 0x100

    if-ge p1, v0, :cond_0

    iput p1, p0, Lfh/a;->H:I

    return-void

    :cond_0
    const-string v0, "Invalid alpha: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-ltz p1, :cond_1

    const/16 v0, 0x100

    if-ge p1, v0, :cond_1

    iput p1, p0, Lfh/a;->H:I

    return-void

    :cond_1
    const-string v0, "Invalid alpha: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setTint(I)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setTintBlendMode(Landroid/graphics/BlendMode;)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintBlendMode(Landroid/graphics/BlendMode;)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintBlendMode(Landroid/graphics/BlendMode;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintBlendMode(Landroid/graphics/BlendMode;)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintBlendMode(Landroid/graphics/BlendMode;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final start()V
    .locals 4

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/Animatable;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_1
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Landroid/graphics/drawable/Animatable;

    :cond_2
    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_3
    iget v0, p0, Lfh/a;->I:I

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    iput v0, p0, Lfh/a;->I:I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lfh/a;->G:J

    iget-object v0, p0, Lfh/a;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_5

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, p0}, Lfr/c;->b(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :goto_2
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Landroid/graphics/drawable/Animatable;

    goto :goto_3

    :cond_6
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_7

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_7
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_8

    move-object v2, v0

    check-cast v2, Landroid/graphics/drawable/Animatable;

    :cond_8
    if-eqz v2, :cond_9

    invoke-interface {v2}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_9
    iget v0, p0, Lfh/a;->I:I

    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    const/4 v0, 0x1

    iput v0, p0, Lfh/a;->I:I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lfh/a;->G:J

    iget-object v0, p0, Lfh/a;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_b

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfr/c;

    invoke-virtual {v3, p0}, Lfr/c;->b(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Lfh/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/Animatable;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_1
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Landroid/graphics/drawable/Animatable;

    :cond_2
    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_3
    iget v0, p0, Lfh/a;->I:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    invoke-virtual {p0}, Lfh/a;->b()V

    :cond_4
    return-void

    :pswitch_0
    iget-object v0, p0, Lfh/a;->J:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast v0, Landroid/graphics/drawable/Animatable;

    goto :goto_1

    :cond_5
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_6

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_6
    iget-object v0, p0, Lfh/a;->K:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v1, :cond_7

    move-object v2, v0

    check-cast v2, Landroid/graphics/drawable/Animatable;

    :cond_7
    if-eqz v2, :cond_8

    invoke-interface {v2}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_8
    iget v0, p0, Lfh/a;->I:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    invoke-virtual {p0}, Lfh/a;->b()V

    :cond_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    iget p1, p0, Lfh/a;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
