.class public final Lar/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lar/g;->w:I

    iput-object p1, p0, Lar/g;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 3

    iget v0, p0, Lar/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lar/g;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p(I)V

    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lar/g;->x:Ljava/lang/Object;

    check-cast v0, Lar/k;

    iget-object v1, v0, Lar/k;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    move-result v1

    iget v2, v0, Lar/k;->o:F

    cmpl-float v2, v2, v1

    if-eqz v2, :cond_0

    iput v1, v0, Lar/k;->o:F

    invoke-virtual {v0}, Lar/k;->p()V

    :cond_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
