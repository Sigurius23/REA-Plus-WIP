.class public final Lpq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;


# instance fields
.field public final synthetic w:Lpq/k;


# direct methods
.method public constructor <init>(Lpq/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/f;->w:Lpq/k;

    return-void
.end method


# virtual methods
.method public final o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    iget-object p1, p0, Lpq/f;->w:Lpq/k;

    invoke-static {p1}, Lpq/k;->g(Lpq/k;)Lpq/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lpq/k;->i(Lpq/k;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    invoke-static {p1}, Lpq/k;->g(Lpq/k;)Lpq/j;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    new-instance v0, Lpq/j;

    invoke-static {p1}, Lpq/k;->j(Lpq/k;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lpq/j;-><init>(Landroid/widget/FrameLayout;Lh5/q1;)V

    invoke-static {p1, v0}, Lpq/k;->h(Lpq/k;Lpq/j;)Lpq/j;

    invoke-static {p1}, Lpq/k;->g(Lpq/k;)Lpq/j;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpq/j;->e(Landroid/view/Window;)V

    invoke-static {p1}, Lpq/k;->i(Lpq/k;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    invoke-static {p1}, Lpq/k;->g(Lpq/k;)Lpq/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    return-object p2
.end method
