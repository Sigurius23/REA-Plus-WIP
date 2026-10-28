.class public final Ldb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;
.implements Ldb/q0;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Landroidx/media3/ui/LegacyPlayerControlView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/LegacyPlayerControlView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    iput-boolean v0, v1, Landroidx/media3/ui/LegacyPlayerControlView;->o0:Z

    iget-object v0, v1, Landroidx/media3/ui/LegacyPlayerControlView;->M:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v2, v1, Landroidx/media3/ui/LegacyPlayerControlView;->O:Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroidx/media3/ui/LegacyPlayerControlView;->P:Ljava/util/Formatter;

    invoke-static {v2, v1, p1, p2}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final b(J)V
    .locals 3

    iget-object v0, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->M:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->O:Ljava/lang/StringBuilder;

    iget-object v0, v0, Landroidx/media3/ui/LegacyPlayerControlView;->P:Ljava/util/Formatter;

    invoke-static {v2, v0, p1, p2}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final c(JZ)V
    .locals 8

    iget-object v0, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->o0:Z

    if-nez p3, :cond_3

    iget-object p3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-eqz p3, :cond_3

    check-cast p3, Lb9/f0;

    invoke-virtual {p3}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    iget-boolean v3, v0, Landroidx/media3/ui/LegacyPlayerControlView;->n0:Z

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lu8/o0;->o()I

    move-result v3

    move v4, v1

    :goto_0
    iget-object v5, v0, Landroidx/media3/ui/LegacyPlayerControlView;->R:Lu8/n0;

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

    goto :goto_1

    :cond_1
    sub-long/2addr p1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lb9/f0;->Z()I

    move-result v4

    :goto_1
    invoke-virtual {p3, v4, p1, p2, v1}, Lb9/f0;->H(IJZ)V

    invoke-virtual {v0}, Landroidx/media3/ui/LegacyPlayerControlView;->i()V

    :cond_3
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    iget-object v1, v0, Landroidx/media3/ui/LegacyPlayerControlView;->j0:Lu8/j0;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->z:Landroid/view/View;

    if-ne v2, p1, :cond_1

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->J()V

    return-void

    :cond_1
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->y:Landroid/view/View;

    if-ne v2, p1, :cond_2

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->M()V

    return-void

    :cond_2
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->G:Landroid/view/View;

    if-ne v2, p1, :cond_3

    move-object p1, v1

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->i0()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_8

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->G()V

    return-void

    :cond_3
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->H:Landroid/view/View;

    if-ne v2, p1, :cond_4

    check-cast v1, La2/a;

    invoke-virtual {v1}, La2/a;->F()V

    return-void

    :cond_4
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->E:Landroid/view/View;

    if-ne v2, p1, :cond_5

    invoke-static {v1}, Lx8/t;->C(Lu8/j0;)Z

    return-void

    :cond_5
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->F:Landroid/view/View;

    if-ne v2, p1, :cond_6

    invoke-static {v1}, Lx8/t;->B(Lu8/j0;)Z

    return-void

    :cond_6
    iget-object v2, v0, Landroidx/media3/ui/LegacyPlayerControlView;->I:Landroid/widget/ImageView;

    if-ne v2, p1, :cond_7

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget p1, v1, Lb9/f0;->h0:I

    iget v0, v0, Landroidx/media3/ui/LegacyPlayerControlView;->r0:I

    invoke-static {p1, v0}, Lx8/a;->k(II)I

    move-result p1

    invoke-virtual {v1, p1}, Lb9/f0;->B0(I)V

    return-void

    :cond_7
    iget-object v0, v0, Landroidx/media3/ui/LegacyPlayerControlView;->J:Landroid/widget/ImageView;

    if-ne v0, p1, :cond_8

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-boolean p1, v1, Lb9/f0;->i0:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lb9/f0;->C0(Z)V

    :cond_8
    :goto_0
    return-void
.end method

.method public final onEvents(Lu8/j0;Lu8/g0;)V
    .locals 5

    iget-object p1, p2, Lu8/g0;->a:Lu8/n;

    const/4 v0, 0x4

    const/4 v1, 0x5

    filled-new-array {v0, v1}, [I

    move-result-object v2

    invoke-virtual {p2, v2}, Lu8/g0;->a([I)Z

    move-result v2

    iget-object v3, p0, Ldb/i;->w:Landroidx/media3/ui/LegacyPlayerControlView;

    if-eqz v2, :cond_0

    sget v2, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->h()V

    :cond_0
    const/4 v2, 0x7

    filled-new-array {v0, v1, v2}, [I

    move-result-object v0

    invoke-virtual {p2, v0}, Lu8/g0;->a([I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->i()V

    :cond_1
    iget-object v0, p1, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->j()V

    :cond_2
    iget-object p1, p1, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    if-eqz p1, :cond_3

    sget p1, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->k()V

    :cond_3
    const/16 p1, 0xd

    const/16 v2, 0xb

    const/4 v4, 0x0

    filled-new-array {v1, v0, v2, v4, p1}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_4

    sget p1, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->g()V

    :cond_4
    filled-new-array {v2, v4}, [I

    move-result-object p1

    invoke-virtual {p2, p1}, Lu8/g0;->a([I)Z

    move-result p1

    if-eqz p1, :cond_5

    sget p1, Landroidx/media3/ui/LegacyPlayerControlView;->E0:I

    invoke-virtual {v3}, Landroidx/media3/ui/LegacyPlayerControlView;->l()V

    :cond_5
    return-void
.end method
