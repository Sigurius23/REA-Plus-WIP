.class public final Lcom/google/android/material/datepicker/h;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/datepicker/m;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/m;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/h;->b:Lcom/google/android/material/datepicker/m;

    iput p3, p0, Lcom/google/android/material/datepicker/h;->a:I

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final calculateExtraLayoutSpace(Landroidx/recyclerview/widget/k2;[I)V
    .locals 3

    iget p1, p0, Lcom/google/android/material/datepicker/h;->a:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/material/datepicker/h;->b:Lcom/google/android/material/datepicker/m;

    if-nez p1, :cond_0

    iget-object p1, v2, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v0

    return-void

    :cond_0
    iget-object p1, v2, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v0

    return-void
.end method

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;I)V
    .locals 0

    new-instance p2, Lcom/google/android/material/datepicker/w;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/material/datepicker/w;-><init>(Landroid/content/Context;)V

    iput p3, p2, Landroidx/recyclerview/widget/j2;->a:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/u1;->startSmoothScroll(Landroidx/recyclerview/widget/j2;)V

    return-void
.end method
