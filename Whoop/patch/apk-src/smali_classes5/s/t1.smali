.class public final Ls/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic a:Ls/v1;


# direct methods
.method public constructor <init>(Ls/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/t1;->a:Ls/v1;

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 3

    iget-object p1, p0, Ls/t1;->a:Ls/v1;

    iget-object v0, p1, Ls/v1;->R:Ls/s1;

    iget-object v1, p1, Ls/v1;->Z:Ls/v;

    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p1, p1, Ls/v1;->V:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ls/s1;->run()V

    :cond_1
    return-void
.end method
