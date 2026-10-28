.class public final Ljo/k;
.super Ldb/v;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljo/s;


# direct methods
.method public synthetic constructor <init>(Ljo/s;I)V
    .locals 0

    iput p2, p0, Ljo/k;->d:I

    iput-object p1, p0, Ljo/k;->e:Ljo/s;

    invoke-direct {p0, p1}, Ldb/v;-><init>(Ljo/s;)V

    return-void
.end method

.method private final h(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public b(Ljo/p;I)V
    .locals 1

    iget v0, p0, Ljo/k;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ldb/v;->b(Ljo/p;I)V

    return-void

    :pswitch_0
    invoke-super {p0, p1, p2}, Ldb/v;->b(Ljo/p;I)V

    if-lez p2, :cond_1

    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljo/q;

    iget-object p1, p1, Ljo/p;->b:Landroid/view/View;

    iget-object v0, p2, Ljo/q;->a:Lrm/p1;

    iget p2, p2, Ljo/q;->b:I

    iget-object v0, v0, Lrm/p1;->z:[Z

    aget-boolean p2, v0, p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/4 p2, 0x4

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljo/p;)V
    .locals 4

    iget v0, p0, Ljo/k;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Ljo/p;->a:Landroid/widget/TextView;

    const v1, 0x7f1404d1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljo/q;

    iget-object v3, v2, Ljo/q;->a:Lrm/p1;

    iget v2, v2, Ljo/q;->b:I

    iget-object v3, v3, Lrm/p1;->z:[Z

    aget-boolean v2, v3, v2

    if-eqz v2, :cond_0

    move v1, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_1
    iget-object v2, p1, Ljo/p;->b:Landroid/view/View;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x4

    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Ljo/j;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_0
    iget-object v0, p1, Ljo/p;->a:Landroid/widget/TextView;

    const v1, 0x7f1404d0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Ljo/k;->e:Ljo/s;

    iget-object v0, v0, Ljo/s;->r0:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->g0()Lio/f;

    move-result-object v0

    iget-object v0, v0, Lio/w;->X:Lio/u;

    invoke-virtual {p0, v0}, Ljo/k;->f(Lio/u;)Z

    move-result v0

    iget-object v1, p1, Ljo/p;->b:Landroid/view/View;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Ljo/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Ljo/k;->d:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Ljo/k;->e:Ljo/s;

    iget-object v0, v0, Ljo/s;->J0:Ldb/r;

    const/4 v1, 0x1

    iget-object v0, v0, Ldb/r;->c:[Ljava/lang/String;

    aput-object p1, v0, v1

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lio/u;)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljo/q;

    iget-object v2, v2, Ljo/q;->a:Lrm/p1;

    iget-object v2, v2, Lrm/p1;->w:Lsn/w0;

    iget-object v3, p1, Lio/u;->w:Lzr/b1;

    invoke-virtual {v3, v2}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/t;

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public g(Ljava/util/List;)V
    .locals 6

    iget-object v0, p0, Ljo/k;->e:Ljo/s;

    iget-object v1, v0, Ljo/s;->R0:Landroid/widget/ImageView;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    move-object v4, p1

    check-cast v4, Lzr/w0;

    iget v4, v4, Lzr/w0;->z:I

    if-ge v3, v4, :cond_1

    move-object v4, p1

    check-cast v4, Lzr/w0;

    invoke-virtual {v4, v3}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljo/q;

    iget-object v5, v4, Ljo/q;->a:Lrm/p1;

    iget v4, v4, Ljo/q;->b:I

    iget-object v5, v5, Lrm/p1;->z:[Z

    aget-boolean v4, v5, v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_4

    if-eqz v2, :cond_2

    iget-object v3, v0, Ljo/s;->j0:Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_2
    iget-object v3, v0, Ljo/s;->k0:Landroid/graphics/drawable/Drawable;

    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_3

    iget-object v0, v0, Ljo/s;->l0:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iget-object v0, v0, Ljo/s;->m0:Ljava/lang/String;

    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    iput-object p1, p0, Ldb/v;->b:Ljava/util/List;

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    iget v0, p0, Ljo/k;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ldb/v;->onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V

    return-void

    :pswitch_0
    check-cast p1, Ljo/p;

    invoke-virtual {p0, p1, p2}, Ljo/k;->b(Ljo/p;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
