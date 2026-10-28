.class public final Lb4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final synthetic a:Lb4/l;

.field public final synthetic b:La3/n0;


# direct methods
.method public constructor <init>(Lb4/l;La3/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/f;->a:Lb4/l;

    iput-object p2, p0, Lb4/f;->b:La3/n0;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 4

    iget-object p2, p0, Lb4/f;->a:Lb4/l;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-nez v0, :cond_0

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result p3

    sget-object p4, Lb4/c;->y:Lb4/c;

    invoke-interface {p1, p2, p3, v1, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumWidth(I)V

    :cond_1
    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_2
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v2

    invoke-virtual {p2}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p2, v0, v2, v3}, Lb4/l;->k(Lb4/l;III)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result v2

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    invoke-virtual {p2}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget p4, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {p2, v2, p3, p4}, Lb4/l;->k(Lb4/l;III)I

    move-result p3

    invoke-virtual {p2, v0, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    new-instance v0, Lb4/d;

    iget-object v2, p0, Lb4/f;->b:La3/n0;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v2, v3}, Lb4/d;-><init>(Lb4/l;La3/n0;I)V

    invoke-interface {p1, p3, p4, v1, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p1, p0, Lb4/f;->a:Lb4/l;

    invoke-virtual {p1}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, p2}, Lb4/l;->k(Lb4/l;III)I

    move-result p2

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    return p1
.end method

.method public final c(Ly2/r;Ljava/util/List;I)I
    .locals 2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget-object v0, p0, Lb4/f;->a:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v0, p1, p3, v1}, Lb4/l;->k(Lb4/l;III)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    return p1
.end method

.method public final d(Ly2/r;Ljava/util/List;I)I
    .locals 1

    iget-object p1, p0, Lb4/f;->a:Lb4/l;

    invoke-virtual {p1}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, p2}, Lb4/l;->k(Lb4/l;III)I

    move-result p2

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    return p1
.end method

.method public final e(Ly2/r;Ljava/util/List;I)I
    .locals 2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget-object v0, p0, Lb4/f;->a:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v0, p1, p3, v1}, Lb4/l;->k(Lb4/l;III)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    return p1
.end method
