.class public final Lql/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lql/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lql/d;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/d;->x:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>(Lql/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lql/d;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/d;->x:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    iget v0, p0, Lql/d;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x2

    const-string v1, "ViewTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "OnGlobalLayoutListener called attachStateListener="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lql/d;->x:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lql/j;

    if-eqz v0, :cond_8

    iget-object v1, v0, Lql/j;->b:Ljava/util/ArrayList;

    iget-object v2, v0, Lql/j;->a:Landroid/view/View;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual {v0, v6, v3, v4}, Lql/j;->a(III)I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_3

    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0, v4, v5, v6}, Lql/j;->a(III)I

    move-result v4

    const/high16 v5, -0x80000000

    if-gtz v3, :cond_4

    if-ne v3, v5, :cond_8

    :cond_4
    if-gtz v4, :cond_5

    if-ne v4, v5, :cond_8

    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lql/h;

    check-cast v6, Lpl/e;

    invoke-virtual {v6, v3, v4}, Lpl/e;->l(II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v0, Lql/j;->c:Lql/d;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_7
    const/4 v2, 0x0

    iput-object v2, v0, Lql/j;->c:Lql/d;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_8
    :goto_2
    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x2

    const-string v1, "CustomViewTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "OnGlobalLayoutListener called attachStateListener="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v0, p0, Lql/d;->x:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lql/e;

    if-eqz v0, :cond_11

    iget-object v1, v0, Lql/e;->b:Ljava/util/ArrayList;

    iget-object v2, v0, Lql/e;->a:Landroid/view/View;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_5

    :cond_a
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_b

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_3

    :cond_b
    move v3, v5

    :goto_3
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual {v0, v6, v3, v4}, Lql/e;->a(III)I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v4

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    if-eqz v4, :cond_c

    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_c
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0, v4, v5, v6}, Lql/e;->a(III)I

    move-result v4

    const/high16 v5, -0x80000000

    if-gtz v3, :cond_d

    if-ne v3, v5, :cond_11

    :cond_d
    if-gtz v4, :cond_e

    if-ne v4, v5, :cond_11

    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lql/h;

    check-cast v6, Lpl/e;

    invoke-virtual {v6, v3, v4}, Lpl/e;->l(II)V

    goto :goto_4

    :cond_f
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, v0, Lql/e;->c:Lql/d;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_10
    const/4 v2, 0x0

    iput-object v2, v0, Lql/e;->c:Lql/d;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_11
    :goto_5
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
