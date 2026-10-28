.class public final Lcom/google/android/material/datepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/google/android/material/datepicker/u;

.field public final synthetic y:Lcom/google/android/material/datepicker/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/m;Lcom/google/android/material/datepicker/u;I)V
    .locals 0

    iput p3, p0, Lcom/google/android/material/datepicker/f;->w:I

    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->y:Lcom/google/android/material/datepicker/m;

    iput-object p2, p0, Lcom/google/android/material/datepicker/f;->x:Lcom/google/android/material/datepicker/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, Lcom/google/android/material/datepicker/f;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->y:Lcom/google/android/material/datepicker/m;

    iget-object v0, p1, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->x:Lcom/google/android/material/datepicker/u;

    iget-object v1, v1, Lcom/google/android/material/datepicker/u;->a:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->w:Lcom/google/android/material/datepicker/q;

    iget-object v1, v1, Lcom/google/android/material/datepicker/q;->w:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/y;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lcom/google/android/material/datepicker/q;

    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/q;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/m;->y(Lcom/google/android/material/datepicker/q;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->y:Lcom/google/android/material/datepicker/m;

    iget-object v0, p1, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->x:Lcom/google/android/material/datepicker/u;

    iget-object v1, v1, Lcom/google/android/material/datepicker/u;->a:Lcom/google/android/material/datepicker/b;

    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->w:Lcom/google/android/material/datepicker/q;

    iget-object v1, v1, Lcom/google/android/material/datepicker/q;->w:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/google/android/material/datepicker/y;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lcom/google/android/material/datepicker/q;

    invoke-direct {v0, v1}, Lcom/google/android/material/datepicker/q;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/m;->y(Lcom/google/android/material/datepicker/q;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
