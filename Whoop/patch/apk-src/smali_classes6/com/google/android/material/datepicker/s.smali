.class public final Lcom/google/android/material/datepicker/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic w:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

.field public final synthetic x:Lcom/google/android/material/datepicker/u;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/u;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/s;->x:Lcom/google/android/material/datepicker/u;

    iput-object p2, p0, Lcom/google/android/material/datepicker/s;->w:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/datepicker/s;->w:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Lcom/google/android/material/datepicker/r;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/r;->a()I

    move-result p4

    if-lt p3, p4, :cond_1

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/r;->c()I

    move-result p2

    if-gt p3, p2, :cond_1

    iget-object p2, p0, Lcom/google/android/material/datepicker/s;->x:Lcom/google/android/material/datepicker/u;

    iget-object p2, p2, Lcom/google/android/material/datepicker/u;->b:Lro/i;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Lcom/google/android/material/datepicker/r;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/material/datepicker/r;->b(I)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    iget-object p1, p2, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/datepicker/m;

    iget-object p1, p1, Lcom/google/android/material/datepicker/m;->y:Lcom/google/android/material/datepicker/b;

    iget-object p1, p1, Lcom/google/android/material/datepicker/b;->y:Lcom/google/android/material/datepicker/d;

    iget-wide p1, p1, Lcom/google/android/material/datepicker/d;->w:J

    cmp-long p1, p3, p1

    if-gez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method
