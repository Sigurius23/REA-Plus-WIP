.class public final Ljo/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/z0;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic w:Ljo/s;


# direct methods
.method public constructor <init>(Ljo/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/l;->w:Ljo/s;

    return-void
.end method


# virtual methods
.method public final k(Lrm/y0;)V
    .locals 5

    iget-object v0, p1, Lrm/y0;->a:Llo/f;

    const/4 v1, 0x4

    const/4 v2, 0x5

    filled-new-array {v1, v2}, [I

    move-result-object v3

    invoke-virtual {p1, v3}, Lrm/y0;->a([I)Z

    move-result v3

    iget-object v4, p0, Ljo/l;->w:Ljo/s;

    if-eqz v3, :cond_0

    invoke-virtual {v4}, Ljo/s;->l()V

    :cond_0
    const/4 v3, 0x7

    filled-new-array {v1, v2, v3}, [I

    move-result-object v1

    invoke-virtual {p1, v1}, Lrm/y0;->a([I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Ljo/s;->n()V

    :cond_1
    iget-object v1, v0, Llo/f;->a:Landroid/util/SparseBooleanArray;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v4}, Ljo/s;->o()V

    :cond_2
    iget-object v1, v0, Llo/f;->a:Landroid/util/SparseBooleanArray;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v4}, Ljo/s;->q()V

    :cond_3
    new-array v1, v3, [I

    fill-array-data v1, :array_0

    invoke-virtual {p1, v1}, Lrm/y0;->a([I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v4}, Ljo/s;->k()V

    :cond_4
    const/16 v1, 0xb

    const/4 v2, 0x0

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-virtual {p1, v1}, Lrm/y0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v4}, Ljo/s;->r()V

    :cond_5
    const/16 p1, 0xc

    iget-object v1, v0, Llo/f;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v4}, Ljo/s;->m()V

    :cond_6
    const/4 p1, 0x2

    iget-object v0, v0, Llo/f;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v4}, Ljo/s;->s()V

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

.method public final onClick(Landroid/view/View;)V
    .locals 7

    iget-object v0, p0, Ljo/l;->w:Ljo/s;

    iget-object v1, v0, Ljo/s;->G0:Ldb/c0;

    iget-object v2, v0, Ljo/s;->r0:Lrm/b1;

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v1}, Ldb/c0;->i()V

    iget-object v3, v0, Ljo/s;->z:Landroid/view/View;

    if-ne v3, p1, :cond_1

    check-cast v2, La2/a;

    invoke-virtual {v2}, La2/a;->J()V

    return-void

    :cond_1
    iget-object v3, v0, Ljo/s;->y:Landroid/view/View;

    if-ne v3, p1, :cond_2

    check-cast v2, La2/a;

    invoke-virtual {v2}, La2/a;->M()V

    return-void

    :cond_2
    iget-object v3, v0, Ljo/s;->F:Landroid/view/View;

    const/4 v4, 0x4

    if-ne v3, p1, :cond_3

    move-object p1, v2

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->e0()I

    move-result p1

    if-eq p1, v4, :cond_14

    check-cast v2, La2/a;

    move-object p1, v2

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->B0()V

    iget-wide v0, p1, Lrm/u;->W:J

    invoke-virtual {v2, v0, v1}, La2/a;->L(J)V

    return-void

    :cond_3
    iget-object v3, v0, Ljo/s;->G:Landroid/view/View;

    if-ne v3, p1, :cond_4

    check-cast v2, La2/a;

    move-object p1, v2

    check-cast p1, Lrm/u;

    invoke-virtual {p1}, Lrm/u;->B0()V

    iget-wide v0, p1, Lrm/u;->V:J

    neg-long v0, v0

    invoke-virtual {v2, v0, v1}, La2/a;->L(J)V

    return-void

    :cond_4
    iget-object v3, v0, Ljo/s;->E:Landroid/view/View;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, p1, :cond_9

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->e0()I

    move-result p1

    if-eq p1, v6, :cond_6

    if-eq p1, v4, :cond_6

    invoke-virtual {v2}, Lrm/u;->d0()Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v2, v5}, Lrm/u;->t0(Z)V

    return-void

    :cond_6
    :goto_0
    invoke-virtual {v2}, Lrm/u;->e0()I

    move-result p1

    if-ne p1, v6, :cond_7

    invoke-virtual {v2}, Lrm/u;->m0()V

    goto :goto_1

    :cond_7
    if-ne p1, v4, :cond_8

    invoke-virtual {v2}, Lrm/u;->Y()I

    move-result p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v2, p1, v0, v1}, Lrm/u;->q0(IJ)V

    :cond_8
    :goto_1
    invoke-virtual {v2, v6}, Lrm/u;->t0(Z)V

    return-void

    :cond_9
    iget-object v3, v0, Ljo/s;->J:Landroid/widget/ImageView;

    if-ne v3, p1, :cond_f

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->B0()V

    iget p1, v2, Lrm/u;->g0:I

    iget v0, v0, Ljo/s;->A0:I

    move v1, v6

    :goto_2
    const/4 v3, 0x2

    if-gt v1, v3, :cond_e

    add-int v4, p1, v1

    rem-int/lit8 v4, v4, 0x3

    if-eqz v4, :cond_d

    if-eq v4, v6, :cond_b

    if-eq v4, v3, :cond_a

    goto :goto_3

    :cond_a
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_c

    goto :goto_4

    :cond_b
    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_d
    :goto_4
    move p1, v4

    :cond_e
    invoke-virtual {v2, p1}, Lrm/u;->u0(I)V

    return-void

    :cond_f
    iget-object v3, v0, Ljo/s;->K:Landroid/widget/ImageView;

    if-ne v3, p1, :cond_10

    check-cast v2, Lrm/u;

    invoke-virtual {v2}, Lrm/u;->B0()V

    iget-boolean p1, v2, Lrm/u;->h0:Z

    xor-int/2addr p1, v6

    iget-object v0, v2, Lrm/u;->M:Ld9/p;

    invoke-virtual {v2}, Lrm/u;->B0()V

    iget-boolean v1, v2, Lrm/u;->h0:Z

    if-eq v1, p1, :cond_14

    iput-boolean p1, v2, Lrm/u;->h0:Z

    iget-object v1, v2, Lrm/u;->L:Lrm/z;

    iget-object v1, v1, Lrm/z;->H:Llo/v;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v3

    iget-object v1, v1, Llo/v;->a:Landroid/os/Handler;

    const/16 v4, 0xc

    invoke-virtual {v1, v4, p1, v5}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    iput-object v1, v3, Llo/u;->a:Landroid/os/Message;

    invoke-virtual {v3}, Llo/u;->b()V

    new-instance v1, Lb9/w;

    const/4 v3, 0x2

    invoke-direct {v1, p1, v3}, Lb9/w;-><init>(ZI)V

    const/16 p1, 0x9

    invoke-virtual {v0, p1, v1}, Ld9/p;->g(ILlo/h;)V

    invoke-virtual {v2}, Lrm/u;->x0()V

    invoke-virtual {v0}, Ld9/p;->b()V

    return-void

    :cond_10
    iget-object v2, v0, Ljo/s;->U0:Landroid/view/View;

    if-ne v2, p1, :cond_11

    invoke-virtual {v1}, Ldb/c0;->h()V

    iget-object p1, v0, Ljo/s;->J0:Ldb/r;

    invoke-virtual {v0, p1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_11
    iget-object v2, v0, Ljo/s;->V0:Landroid/view/View;

    if-ne v2, p1, :cond_12

    invoke-virtual {v1}, Ldb/c0;->h()V

    iget-object p1, v0, Ljo/s;->K0:Ldb/o;

    invoke-virtual {v0, p1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_12
    iget-object v2, v0, Ljo/s;->W0:Landroid/view/View;

    if-ne v2, p1, :cond_13

    invoke-virtual {v1}, Ldb/c0;->h()V

    iget-object p1, v0, Ljo/s;->P0:Ljo/k;

    invoke-virtual {v0, p1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    return-void

    :cond_13
    iget-object v2, v0, Ljo/s;->R0:Landroid/widget/ImageView;

    if-ne v2, p1, :cond_14

    invoke-virtual {v1}, Ldb/c0;->h()V

    iget-object p1, v0, Ljo/s;->O0:Ljo/k;

    invoke-virtual {v0, p1}, Ljo/s;->d(Landroidx/recyclerview/widget/i1;)V

    :cond_14
    :goto_5
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    iget-object v0, p0, Ljo/l;->w:Ljo/s;

    iget-boolean v1, v0, Ljo/s;->M0:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Ljo/s;->G0:Ldb/c0;

    invoke-virtual {v0}, Ldb/c0;->i()V

    :cond_0
    return-void
.end method
