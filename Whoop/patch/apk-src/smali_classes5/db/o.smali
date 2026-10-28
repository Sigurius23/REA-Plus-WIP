.class public final Ldb/o;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:[Ljava/lang/String;

.field public final c:[F

.field public d:I

.field public final synthetic e:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;[Ljava/lang/String;[FI)V
    .locals 0

    iput p4, p0, Ldb/o;->a:I

    iput-object p1, p0, Ldb/o;->e:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    iput-object p2, p0, Ldb/o;->b:[Ljava/lang/String;

    iput-object p3, p0, Ldb/o;->c:[F

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    iget v0, p0, Ldb/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/o;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ldb/o;->b:[Ljava/lang/String;

    array-length v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 3

    iget v0, p0, Ldb/o;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljo/p;

    iget-object v0, p0, Ldb/o;->b:[Ljava/lang/String;

    array-length v1, v0

    if-ge p2, v1, :cond_0

    iget-object v1, p1, Ljo/p;->a:Landroid/widget/TextView;

    aget-object v0, v0, p2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p1, Ljo/p;->b:Landroid/view/View;

    iget v1, p0, Ldb/o;->d:I

    if-ne p2, v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Lcom/whoop/ui/j;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lcom/whoop/ui/j;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_0
    check-cast p1, Ldb/s;

    iget-object v0, p0, Ldb/o;->b:[Ljava/lang/String;

    array-length v1, v0

    if-ge p2, v1, :cond_2

    iget-object v1, p1, Ldb/s;->a:Landroid/widget/TextView;

    aget-object v0, v0, p2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget v0, p0, Ldb/o;->d:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_3

    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    iget-object v0, p1, Ldb/s;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_3
    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    iget-object v0, p1, Ldb/s;->b:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Lcom/whoop/ui/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lcom/whoop/ui/j;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 2

    iget p2, p0, Ldb/o;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Ldb/o;->e:Landroid/widget/FrameLayout;

    check-cast p2, Ljo/s;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0181

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Ljo/p;

    invoke-direct {p2, p1}, Ljo/p;-><init>(Landroid/view/View;)V

    return-object p2

    :pswitch_0
    iget-object p2, p0, Ldb/o;->e:Landroid/widget/FrameLayout;

    check-cast p2, Ldb/x;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0181

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Ldb/s;

    invoke-direct {p2, p1}, Ldb/s;-><init>(Landroid/view/View;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
