.class public final Ldb/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;
.implements Ldb/q0;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic w:Ldb/x;


# direct methods
.method public constructor <init>(Ldb/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/m;->w:Ldb/x;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, Ldb/m;->w:Ldb/x;

    iput-boolean v0, v1, Ldb/x;->P0:Z

    iget-object v0, v1, Ldb/x;->g0:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v2, v1, Ldb/x;->i0:Ljava/lang/StringBuilder;

    iget-object v3, v1, Ldb/x;->j0:Ljava/util/Formatter;

    invoke-static {v2, v3, p1, p2}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, v1, Ldb/x;->w:Ldb/c0;

    invoke-virtual {p1}, Ldb/c0;->h()V

    return-void
.end method

.method public final b(J)V
    .locals 3

    iget-object v0, p0, Ldb/m;->w:Ldb/x;

    iget-object v1, v0, Ldb/x;->g0:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    iget-object v2, v0, Ldb/x;->i0:Ljava/lang/StringBuilder;

    iget-object v0, v0, Ldb/x;->j0:Ljava/util/Formatter;

    invoke-static {v2, v0, p1, p2}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final c(JZ)V
    .locals 8

    iget-object v0, p0, Ldb/m;->w:Ldb/x;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ldb/x;->P0:Z

    if-nez p3, :cond_4

    iget-object p3, v0, Ldb/x;->J0:Lu8/j0;

    if-eqz p3, :cond_4

    iget-boolean v2, v0, Ldb/x;->O0:Z

    if-eqz v2, :cond_2

    check-cast p3, La2/a;

    const/16 v2, 0x11

    invoke-virtual {p3, v2}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0xa

    invoke-virtual {p3, v2}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, p3

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    invoke-virtual {v2}, Lu8/o0;->o()I

    move-result v3

    move v4, v1

    :goto_0
    iget-object v5, v0, Ldb/x;->l0:Lu8/n0;

    const-wide/16 v6, 0x0

    invoke-virtual {v2, v4, v5, v6, v7}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v5

    iget-wide v5, v5, Lu8/n0;->m:J

    invoke-static {v5, v6}, Lx8/t;->U(J)J

    move-result-wide v5

    cmp-long v7, p1, v5

    if-gez v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v3, -0x1

    if-ne v4, v7, :cond_1

    move-wide p1, v5

    :goto_1
    invoke-virtual {p3, v4, p1, p2, v1}, La2/a;->H(IJZ)V

    goto :goto_2

    :cond_1
    sub-long/2addr p1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    check-cast p3, La2/a;

    const/4 v2, 0x5

    invoke-virtual {p3, v2}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, p3

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->Z()I

    move-result v2

    invoke-virtual {p3, v2, p1, p2, v1}, La2/a;->H(IJZ)V

    :cond_3
    :goto_2
    invoke-virtual {v0}, Ldb/x;->o()V

    :cond_4
    iget-object p1, v0, Ldb/x;->w:Ldb/c0;

    invoke-virtual {p1}, Ldb/c0;->i()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 8

    iget-object v0, p0, Ldb/m;->w:Ldb/x;

    iget-object v1, v0, Ldb/x;->W:Landroid/widget/ImageView;

    iget-object v2, v0, Ldb/x;->e0:Landroid/view/View;

    iget-object v3, v0, Ldb/x;->d0:Landroid/view/View;

    iget-object v4, v0, Ldb/x;->c0:Landroid/view/View;

    iget-object v5, v0, Ldb/x;->w:Ldb/c0;

    iget-object v6, v0, Ldb/x;->J0:Lu8/j0;

    if-nez v6, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v5}, Ldb/c0;->i()V

    iget-object v7, v0, Ldb/x;->N:Landroid/widget/ImageView;

    if-ne v7, p1, :cond_1

    check-cast v6, La2/a;

    const/16 p1, 0x9

    invoke-virtual {v6, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v6}, La2/a;->J()V

    return-void

    :cond_1
    iget-object v7, v0, Ldb/x;->M:Landroid/widget/ImageView;

    if-ne v7, p1, :cond_2

    check-cast v6, La2/a;

    const/4 p1, 0x7

    invoke-virtual {v6, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v6}, La2/a;->M()V

    return-void

    :cond_2
    iget-object v7, v0, Ldb/x;->P:Landroid/view/View;

    if-ne v7, p1, :cond_3

    move-object p1, v6

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->i0()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_c

    check-cast v6, La2/a;

    const/16 p1, 0xc

    invoke-virtual {v6, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v6}, La2/a;->G()V

    return-void

    :cond_3
    iget-object v7, v0, Ldb/x;->Q:Landroid/view/View;

    if-ne v7, p1, :cond_4

    check-cast v6, La2/a;

    const/16 p1, 0xb

    invoke-virtual {v6, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v6}, La2/a;->F()V

    return-void

    :cond_4
    iget-object v7, v0, Ldb/x;->O:Landroid/widget/ImageView;

    if-ne v7, p1, :cond_6

    iget-boolean p1, v0, Ldb/x;->N0:Z

    invoke-static {v6, p1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v6}, Lx8/t;->C(Lu8/j0;)Z

    return-void

    :cond_5
    invoke-static {v6}, Lx8/t;->B(Lu8/j0;)Z

    return-void

    :cond_6
    iget-object v7, v0, Ldb/x;->T:Landroid/widget/ImageView;

    if-ne v7, p1, :cond_7

    const/16 p1, 0xf

    move-object v1, v6

    check-cast v1, La2/a;

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    check-cast v6, Lb9/f0;

    invoke-virtual {v6}, Lb9/f0;->L0()V

    iget p1, v6, Lb9/f0;->h0:I

    iget v0, v0, Ldb/x;->S0:I

    invoke-static {p1, v0}, Lx8/a;->k(II)I

    move-result p1

    invoke-virtual {v6, p1}, Lb9/f0;->B0(I)V

    return-void

    :cond_7
    iget-object v7, v0, Ldb/x;->U:Landroid/widget/ImageView;

    if-ne v7, p1, :cond_8

    const/16 p1, 0xe

    move-object v0, v6

    check-cast v0, La2/a;

    invoke-virtual {v0, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_c

    check-cast v6, Lb9/f0;

    invoke-virtual {v6}, Lb9/f0;->L0()V

    iget-boolean p1, v6, Lb9/f0;->i0:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v6, p1}, Lb9/f0;->C0(Z)V

    return-void

    :cond_8
    if-ne v4, p1, :cond_9

    invoke-virtual {v5}, Ldb/c0;->h()V

    iget-object p1, v0, Ldb/x;->F:Ldb/r;

    invoke-virtual {v0, p1, v4}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    return-void

    :cond_9
    if-ne v3, p1, :cond_a

    invoke-virtual {v5}, Ldb/c0;->h()V

    iget-object p1, v0, Ldb/x;->G:Ldb/o;

    invoke-virtual {v0, p1, v3}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    return-void

    :cond_a
    if-ne v2, p1, :cond_b

    invoke-virtual {v5}, Ldb/c0;->h()V

    iget-object p1, v0, Ldb/x;->I:Ldb/l;

    invoke-virtual {v0, p1, v2}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    return-void

    :cond_b
    if-ne v1, p1, :cond_c

    invoke-virtual {v5}, Ldb/c0;->h()V

    iget-object p1, v0, Ldb/x;->H:Ldb/l;

    invoke-virtual {v0, p1, v1}, Ldb/x;->d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V

    :cond_c
    :goto_0
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    iget-object v0, p0, Ldb/m;->w:Ldb/x;

    iget-boolean v1, v0, Ldb/x;->Y0:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Ldb/x;->w:Ldb/c0;

    invoke-virtual {v0}, Ldb/c0;->i()V

    :cond_0
    return-void
.end method

.method public final onEvents(Lu8/j0;Lu8/g0;)V
    .locals 4

    const/4 p1, 0x4

    const/4 v0, 0x5

    const/16 v1, 0xd

    filled-new-array {p1, v0, v1}, [I

    move-result-object v2

    invoke-virtual {p2, v2}, Lu8/g0;->a([I)Z

    move-result v2

    iget-object v3, p0, Ldb/m;->w:Ldb/x;

    if-eqz v2, :cond_0

    invoke-virtual {v3}, Ldb/x;->m()V

    :cond_0
    const/4 v2, 0x7

    filled-new-array {p1, v0, v2, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v3}, Ldb/x;->o()V

    :cond_1
    const/16 p1, 0x8

    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Ldb/x;->p()V

    :cond_2
    const/16 p1, 0x9

    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v3}, Ldb/x;->r()V

    :cond_3
    new-array p1, v2, [I

    fill-array-data p1, :array_0

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v3}, Ldb/x;->l()V

    :cond_4
    const/16 p1, 0xb

    const/4 v0, 0x0

    filled-new-array {p1, v0, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v3}, Ldb/x;->s()V

    :cond_5
    const/16 p1, 0xc

    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v3}, Ldb/x;->n()V

    :cond_6
    const/4 p1, 0x2

    filled-new-array {p1, v1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v3}, Ldb/x;->t()V

    :cond_7
    return-void

    nop

    :array_0
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method
