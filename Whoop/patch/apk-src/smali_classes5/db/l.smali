.class public final Ldb/l;
.super Ldb/v;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ldb/x;


# direct methods
.method public synthetic constructor <init>(Ldb/x;I)V
    .locals 0

    iput p2, p0, Ldb/l;->d:I

    iput-object p1, p0, Ldb/l;->e:Ldb/x;

    invoke-direct {p0, p1}, Ldb/v;-><init>(Ldb/x;)V

    return-void
.end method

.method private final h(Ljava/lang/String;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Ldb/s;I)V
    .locals 1

    iget v0, p0, Ldb/l;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ldb/v;->a(Ldb/s;I)V

    return-void

    :pswitch_0
    invoke-super {p0, p1, p2}, Ldb/v;->a(Ldb/s;I)V

    if-lez p2, :cond_1

    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ldb/t;

    iget-object p1, p1, Ldb/s;->b:Landroid/view/View;

    iget-object v0, p2, Ldb/t;->a:Lu8/u0;

    iget p2, p2, Ldb/t;->b:I

    iget-object v0, v0, Lu8/u0;->e:[Z

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

.method public final c(Ldb/s;)V
    .locals 4

    iget v0, p0, Ldb/l;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Ldb/s;->a:Landroid/widget/TextView;

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

    check-cast v2, Ldb/t;

    iget-object v3, v2, Ldb/t;->a:Lu8/u0;

    iget v2, v2, Ldb/t;->b:I

    iget-object v3, v3, Lu8/u0;->e:[Z

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
    iget-object v2, p1, Ldb/s;->b:Landroid/view/View;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x4

    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Lb30/k3;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_0
    iget-object v0, p1, Ldb/s;->a:Landroid/widget/TextView;

    const v1, 0x7f1404d0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Ldb/l;->e:Ldb/x;

    iget-object v0, v0, Ldb/x;->J0:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->k0()Lo9/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/l;->f(Lo9/j;)Z

    move-result v0

    iget-object v1, p1, Ldb/s;->b:Landroid/view/View;

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Lb30/k3;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

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

    iget v0, p0, Ldb/l;->d:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Ldb/l;->e:Ldb/x;

    iget-object v0, v0, Ldb/x;->F:Ldb/r;

    const/4 v1, 0x1

    iget-object v0, v0, Ldb/r;->c:[Ljava/lang/String;

    aput-object p1, v0, v1

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lo9/j;)Z
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

    check-cast v2, Ldb/t;

    iget-object v2, v2, Ldb/t;->a:Lu8/u0;

    iget-object v2, v2, Lu8/u0;->b:Lu8/p0;

    iget-object v3, p1, Lu8/t0;->s:Lzr/b1;

    invoke-virtual {v3, v2}, Lzr/b1;->containsKey(Ljava/lang/Object;)Z

    move-result v2

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

    iget-object v0, p0, Ldb/l;->e:Ldb/x;

    iget-object v1, v0, Ldb/x;->W:Landroid/widget/ImageView;

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

    check-cast v4, Ldb/t;

    iget-object v5, v4, Ldb/t;->a:Lu8/u0;

    iget v4, v4, Ldb/t;->b:I

    iget-object v5, v5, Lu8/u0;->e:[Z

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

    iget-object v3, v0, Ldb/x;->B0:Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_2
    iget-object v3, v0, Ldb/x;->C0:Landroid/graphics/drawable/Drawable;

    :goto_2
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_3

    iget-object v0, v0, Ldb/x;->D0:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iget-object v0, v0, Ldb/x;->E0:Ljava/lang/String;

    :goto_3
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    iput-object p1, p0, Ldb/v;->b:Ljava/util/List;

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    iget v0, p0, Ldb/l;->d:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ldb/v;->onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V

    return-void

    :pswitch_0
    check-cast p1, Ldb/s;

    invoke-virtual {p0, p1, p2}, Ldb/l;->a(Ldb/s;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
