.class public final Ls/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic w:Lr/d;

.field public final synthetic x:Ls/i0;


# direct methods
.method public constructor <init>(Ls/i0;Lr/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/h0;->x:Ls/i0;

    iput-object p2, p0, Ls/h0;->w:Lr/d;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    iget-object v0, p0, Ls/h0;->x:Ls/i0;

    iget-object v0, v0, Ls/i0;->g0:Ls/l0;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls/h0;->w:Lr/d;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
