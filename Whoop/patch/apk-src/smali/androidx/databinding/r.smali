.class public final Landroidx/databinding/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    invoke-static {p1}, Landroidx/databinding/a0;->getBinding(Landroid/view/View;)Landroidx/databinding/a0;

    move-result-object v0

    invoke-static {v0}, Landroidx/databinding/a0;->access$100(Landroidx/databinding/a0;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
