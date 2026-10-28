.class public final Lb4/b;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"


# instance fields
.field public final synthetic E:Landroid/view/ViewGroup;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Lb4/b;->z:I

    iput-object p1, p0, Lb4/b;->E:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Lh5/q1;Ljava/util/List;)Lh5/q1;
    .locals 6

    iget p2, p0, Lb4/b;->z:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Lb4/b;->E:Landroid/view/ViewGroup;

    check-cast p2, Lc4/z;

    iget-boolean v0, p2, Lc4/z;->M:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    if-nez v4, :cond_1

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p1, v2, v3, v4, p2}, Lh5/o1;->n(IIII)Lh5/q1;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    iget-object p2, p0, Lb4/b;->E:Landroid/view/ViewGroup;

    check-cast p2, Lb4/l;

    invoke-virtual {p2, p1}, Lb4/l;->m(Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 13

    iget p1, p0, Lb4/b;->z:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lb4/b;->E:Landroid/view/ViewGroup;

    check-cast p1, Lc4/z;

    iget-boolean v0, p1, Lc4/z;->M:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    if-nez v4, :cond_1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2, v3, v4, p1}, Lv4/b;->b(IIII)Lv4/b;

    move-result-object p1

    iget v0, p1, Lv4/b;->a:I

    new-instance v1, Lio/sentry/internal/debugmeta/c;

    iget-object v2, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v2, Lv4/b;

    iget v3, p1, Lv4/b;->b:I

    iget v4, p1, Lv4/b;->c:I

    iget p1, p1, Lv4/b;->d:I

    invoke-static {v2, v0, v3, v4, p1}, Lh5/q1;->e(Lv4/b;IIII)Lv4/b;

    move-result-object v2

    iget-object p2, p2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p2, Lv4/b;

    invoke-static {p2, v0, v3, v4, p1}, Lh5/q1;->e(Lv4/b;IIII)Lv4/b;

    move-result-object p1

    const/16 p2, 0x11

    invoke-direct {v1, p2, v2, p1}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, v1

    :goto_0
    return-object p2

    :pswitch_0
    iget-object p1, p0, Lb4/b;->E:Landroid/view/ViewGroup;

    check-cast p1, Lb4/l;

    iget-object p1, p1, Lb4/l;->b0:La3/n0;

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->d:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/node/a;

    iget-object v0, p1, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lvo/b;->C(J)J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long v3, v0, v2

    long-to-int v3, v3

    const/4 v4, 0x0

    if-gez v3, :cond_3

    move v3, v4

    :cond_3
    const-wide v5, 0xffffffffL

    and-long/2addr v0, v5

    long-to-int v0, v0

    if-gez v0, :cond_4

    move v0, v4

    :cond_4
    invoke-static {p1}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v1

    invoke-interface {v1}, Ly2/y;->n()J

    move-result-wide v7

    shr-long v9, v7, v2

    long-to-int v1, v9

    and-long/2addr v7, v5

    long-to-int v7, v7

    iget-wide v8, p1, Ly2/j1;->y:J

    shr-long v10, v8, v2

    long-to-int v10, v10

    and-long/2addr v8, v5

    long-to-int v8, v8

    int-to-float v9, v10

    int-to-float v8, v8

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v11, v8

    shl-long v8, v9, v2

    and-long v10, v11, v5

    or-long/2addr v8, v10

    invoke-virtual {p1, v8, v9}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Lvo/b;->C(J)J

    move-result-wide v8

    shr-long v10, v8, v2

    long-to-int p1, v10

    sub-int/2addr v1, p1

    if-gez v1, :cond_5

    move v1, v4

    :cond_5
    and-long/2addr v5, v8

    long-to-int p1, v5

    sub-int/2addr v7, p1

    if-gez v7, :cond_6

    goto :goto_1

    :cond_6
    move v4, v7

    :goto_1
    if-nez v3, :cond_7

    if-nez v0, :cond_7

    if-nez v1, :cond_7

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Lio/sentry/internal/debugmeta/c;

    iget-object v2, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v2, Lv4/b;

    invoke-static {v2, v3, v0, v1, v4}, Lb4/l;->l(Lv4/b;IIII)Lv4/b;

    move-result-object v2

    iget-object p2, p2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p2, Lv4/b;

    invoke-static {p2, v3, v0, v1, v4}, Lb4/l;->l(Lv4/b;IIII)Lv4/b;

    move-result-object p2

    const/16 v0, 0x11

    invoke-direct {p1, v0, v2, p2}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, p1

    :goto_2
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
