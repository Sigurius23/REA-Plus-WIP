.class public abstract Ldb/v;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/util/List;

.field public final synthetic c:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Ldb/x;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldb/v;->a:I

    .line 3
    iput-object p1, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldb/v;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljo/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldb/v;->a:I

    .line 1
    iput-object p1, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldb/v;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ldb/s;I)V
    .locals 7

    iget-object v0, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    iget-object v3, v0, Ldb/x;->J0:Lu8/j0;

    if-nez v3, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Ldb/v;->c(Ldb/s;)V

    return-void

    :cond_1
    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    const/4 v1, 0x1

    sub-int/2addr p2, v1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ldb/t;

    iget-object p2, v5, Ldb/t;->a:Lu8/u0;

    iget-object v4, p2, Lu8/u0;->b:Lu8/p0;

    move-object p2, v3

    check-cast p2, Lb9/f0;

    invoke-virtual {p2}, Lb9/f0;->k0()Lo9/j;

    move-result-object p2

    iget-object p2, p2, Lu8/t0;->s:Lzr/b1;

    invoke-virtual {p2, v4}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, v5, Ldb/t;->a:Lu8/u0;

    iget v2, v5, Ldb/t;->b:I

    iget-object p2, p2, Lu8/u0;->e:[Z

    aget-boolean p2, p2, v2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    iget-object p2, p1, Ldb/s;->a:Landroid/widget/TextView;

    iget-object v2, v5, Ldb/t;->c:Ljava/lang/String;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p1, Ldb/s;->b:Landroid/view/View;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v1, Ldb/u;

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ldb/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public b(Ljo/p;I)V
    .locals 5

    iget-object v0, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    iget-object v1, v0, Ljo/s;->r0:Lrm/b1;

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Ldb/v;->d(Ljo/p;)V

    return-void

    :cond_1
    iget-object v1, p0, Ldb/v;->b:Ljava/util/List;

    const/4 v2, 0x1

    sub-int/2addr p2, v2

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljo/q;

    iget-object v1, p2, Ljo/q;->a:Lrm/p1;

    iget-object v1, v1, Lrm/p1;->w:Lsn/w0;

    iget-object v0, v0, Ljo/s;->r0:Lrm/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lrm/u;

    invoke-virtual {v0}, Lrm/u;->g0()Lio/f;

    move-result-object v0

    iget-object v0, v0, Lio/w;->X:Lio/u;

    iget-object v0, v0, Lio/u;->w:Lzr/b1;

    invoke-virtual {v0, v1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/t;

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p2, Ljo/q;->a:Lrm/p1;

    iget v4, p2, Ljo/q;->b:I

    iget-object v0, v0, Lrm/p1;->z:[Z

    aget-boolean v0, v0, v4

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    iget-object v0, p1, Ljo/p;->a:Landroid/widget/TextView;

    iget-object v4, p2, Ljo/q;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Ljo/p;->b:Landroid/view/View;

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x4

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public abstract c(Ldb/s;)V
.end method

.method public abstract d(Ljo/p;)V
.end method

.method public abstract e(Ljava/lang/String;)V
.end method

.method public final getItemCount()I
    .locals 1

    iget v0, p0, Ldb/v;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    :pswitch_0
    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ldb/v;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    iget v0, p0, Ldb/v;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljo/p;

    invoke-virtual {p0, p1, p2}, Ldb/v;->b(Ljo/p;I)V

    return-void

    :pswitch_0
    check-cast p1, Ldb/s;

    invoke-virtual {p0, p1, p2}, Ldb/v;->a(Ldb/s;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 2

    iget p2, p0, Ldb/v;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

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
    iget-object p2, p0, Ldb/v;->c:Landroid/widget/FrameLayout;

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
