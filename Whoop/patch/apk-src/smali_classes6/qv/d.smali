.class public final Lqv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lqv/d;->w:I

    iput-object p1, p0, Lqv/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lqv/d;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqv/d;->x:Ljava/lang/Object;

    check-cast v0, Lqv/e;

    invoke-virtual {v0, p1}, Lqv/e;->a(Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lqv/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqv/d;->x:Ljava/lang/Object;

    check-cast v0, Lr/c0;

    iget-object v1, v0, Lr/c0;->O:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, v0, Lr/c0;->O:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v1, v0, Lr/c0;->O:Landroid/view/ViewTreeObserver;

    iget-object v0, v0, Lr/c0;->I:Lr/d;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqv/d;->x:Ljava/lang/Object;

    check-cast v0, Lr/f;

    iget-object v1, v0, Lr/f;->X:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, v0, Lr/f;->X:Landroid/view/ViewTreeObserver;

    :cond_2
    iget-object v1, v0, Lr/f;->X:Landroid/view/ViewTreeObserver;

    iget-object v0, v0, Lr/f;->I:Lr/d;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :pswitch_1
    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lqv/d;->x:Ljava/lang/Object;

    check-cast p1, Lqv/e;

    iget-boolean v0, p1, Lqv/e;->y:Z

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p1, Lqv/e;->y:Z

    iget-object v0, p1, Lqv/e;->z:Landroidx/lifecycle/g0;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_5

    iget-object p1, p1, Lqv/e;->x:Landroidx/lifecycle/i0;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
