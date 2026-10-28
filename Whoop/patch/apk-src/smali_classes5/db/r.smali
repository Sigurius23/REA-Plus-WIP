.class public final Ldb/r;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:[Ljava/lang/String;

.field public final c:[Ljava/lang/String;

.field public final d:[Landroid/graphics/drawable/Drawable;

.field public final synthetic e:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Ldb/x;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldb/r;->a:I

    .line 5
    iput-object p1, p0, Ldb/r;->e:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    .line 6
    iput-object p2, p0, Ldb/r;->b:[Ljava/lang/String;

    .line 7
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Ldb/r;->c:[Ljava/lang/String;

    .line 8
    iput-object p3, p0, Ldb/r;->d:[Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Ljo/s;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldb/r;->a:I

    .line 1
    iput-object p1, p0, Ldb/r;->e:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    .line 2
    iput-object p2, p0, Ldb/r;->b:[Ljava/lang/String;

    .line 3
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Ldb/r;->c:[Ljava/lang/String;

    .line 4
    iput-object p3, p0, Ldb/r;->d:[Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 4

    iget-object v0, p0, Ldb/r;->e:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    iget-object v1, v0, Ldb/x;->J0:Lu8/j0;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    if-eqz p1, :cond_3

    const/4 v3, 0x1

    if-eq p1, v3, :cond_1

    return v3

    :cond_1
    const/16 p1, 0x1e

    check-cast v1, La2/a;

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v0, Ldb/x;->J0:Lu8/j0;

    const/16 v0, 0x1d

    check-cast p1, La2/a;

    invoke-virtual {p1, v0}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v3

    :cond_2
    return v2

    :cond_3
    const/16 p1, 0xd

    check-cast v1, La2/a;

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    return p1
.end method

.method public final getItemCount()I
    .locals 1

    iget v0, p0, Ldb/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/r;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ldb/r;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getItemId(I)J
    .locals 2

    iget v0, p0, Ldb/r;->a:I

    packed-switch v0, :pswitch_data_0

    int-to-long v0, p1

    return-wide v0

    :pswitch_0
    int-to-long v0, p1

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 4

    iget v0, p0, Ldb/r;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljo/o;

    iget-object v0, p1, Ljo/o;->a:Landroid/widget/TextView;

    iget-object v1, p1, Ljo/o;->c:Landroid/widget/ImageView;

    iget-object p1, p1, Ljo/o;->b:Landroid/widget/TextView;

    iget-object v2, p0, Ldb/r;->b:[Ljava/lang/String;

    aget-object v2, v2, p2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ldb/r;->c:[Ljava/lang/String;

    aget-object v0, v0, p2

    const/16 v2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object p1, p0, Ldb/r;->d:[Landroid/graphics/drawable/Drawable;

    aget-object p1, p1, p2

    if-nez p1, :cond_1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void

    :pswitch_0
    check-cast p1, Ldb/q;

    invoke-virtual {p0, p2}, Ldb/r;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v1, Landroidx/recyclerview/widget/v1;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/v1;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2

    :cond_2
    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v1, Landroidx/recyclerview/widget/v1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Landroidx/recyclerview/widget/v1;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_2
    iget-object v0, p1, Ldb/q;->a:Landroid/widget/TextView;

    iget-object v1, p1, Ldb/q;->c:Landroid/widget/ImageView;

    iget-object p1, p1, Ldb/q;->b:Landroid/widget/TextView;

    iget-object v2, p0, Ldb/r;->b:[Ljava/lang/String;

    aget-object v2, v2, p2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ldb/r;->c:[Ljava/lang/String;

    aget-object v0, v0, p2

    const/16 v2, 0x8

    if-nez v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    iget-object p1, p0, Ldb/r;->d:[Landroid/graphics/drawable/Drawable;

    aget-object p1, p1, p2

    if-nez p1, :cond_4

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 3

    iget p2, p0, Ldb/r;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Ldb/r;->e:Landroid/widget/FrameLayout;

    check-cast p2, Ljo/s;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0180

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance v0, Ljo/o;

    invoke-direct {v0, p2, p1}, Ljo/o;-><init>(Ljo/s;Landroid/view/View;)V

    return-object v0

    :pswitch_0
    iget-object p2, p0, Ldb/r;->e:Landroid/widget/FrameLayout;

    check-cast p2, Ldb/x;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0180

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance v0, Ldb/q;

    invoke-direct {v0, p2, p1}, Ldb/q;-><init>(Ldb/x;Landroid/view/View;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
