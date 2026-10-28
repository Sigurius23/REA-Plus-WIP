.class public final Lcom/google/android/material/textfield/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic w:Lcom/google/android/material/textfield/x;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/v;->w:Lcom/google/android/material/textfield/x;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9

    iget-object p1, p0, Lcom/google/android/material/textfield/v;->w:Lcom/google/android/material/textfield/x;

    iget-object v0, p1, Lcom/google/android/material/textfield/x;->E:Ls/v1;

    const/4 v1, 0x0

    if-gez p3, :cond_1

    iget-object v2, v0, Ls/v1;->Z:Ls/v;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    if-nez v2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ls/v1;->y:Ls/k1;

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    invoke-interface {v2, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-static {p1, v2}, Lcom/google/android/material/textfield/x;->a(Lcom/google/android/material/textfield/x;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v3

    if-eqz v3, :cond_7

    if-eqz p2, :cond_3

    if-gez p3, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, p2

    move v6, p3

    move-wide v7, p4

    goto :goto_6

    :cond_3
    :goto_2
    iget-object p1, v0, Ls/v1;->Z:Ls/v;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-nez p1, :cond_4

    move-object p2, v1

    goto :goto_3

    :cond_4
    iget-object p1, v0, Ls/v1;->y:Ls/k1;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object p1

    move-object p2, p1

    :goto_3
    iget-object p1, v0, Ls/v1;->Z:Ls/v;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-nez p1, :cond_5

    const/4 p1, -0x1

    :goto_4
    move p3, p1

    goto :goto_5

    :cond_5
    iget-object p1, v0, Ls/v1;->y:Ls/k1;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    goto :goto_4

    :goto_5
    iget-object p1, v0, Ls/v1;->Z:Ls/v;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-nez p1, :cond_6

    const-wide/high16 p4, -0x8000000000000000L

    goto :goto_1

    :cond_6
    iget-object p1, v0, Ls/v1;->y:Ls/k1;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide p4

    goto :goto_1

    :goto_6
    iget-object v4, v0, Ls/v1;->y:Ls/k1;

    invoke-interface/range {v3 .. v8}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_7
    invoke-virtual {v0}, Ls/v1;->dismiss()V

    return-void
.end method
