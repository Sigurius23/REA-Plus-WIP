.class public final Ls40/h;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/util/List;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;ILq11/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls40/h;->a:I

    const-string v0, "unfilteredCountries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 2
    iput-object p2, p0, Ls40/h;->b:Ljava/util/List;

    .line 3
    iput-object p4, p0, Ls40/h;->c:Ljava/lang/Object;

    .line 4
    new-instance p2, Ls40/f0;

    .line 5
    iget-object p3, p0, Ls40/h;->b:Ljava/util/List;

    .line 6
    instance-of p4, p1, Landroid/app/Activity;

    if-eqz p4, :cond_0

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    invoke-direct {p2, p3, p0, p1}, Ls40/f0;-><init>(Ljava/util/List;Ls40/h;Landroid/app/Activity;)V

    iput-object p2, p0, Ls40/h;->d:Ljava/lang/Object;

    .line 8
    iget-object p1, p0, Ls40/h;->b:Ljava/util/List;

    iput-object p1, p0, Ls40/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ly00/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls40/h;->a:I

    const-string v0, "brands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 10
    iput-object p2, p0, Ls40/h;->b:Ljava/util/List;

    .line 11
    iput-object p3, p0, Ls40/h;->c:Ljava/lang/Object;

    .line 12
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iput-object p2, p0, Ls40/h;->d:Ljava/lang/Object;

    .line 13
    new-instance p2, Ls40/b1;

    invoke-direct {p2, p1}, Ls40/b1;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ls40/h;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/stripe/android/core/model/Country;
    .locals 1

    iget-object v0, p0, Ls40/h;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/Country;

    return-object p1
.end method

.method public areAllItemsEnabled()Z
    .locals 1

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/widget/BaseAdapter;->areAllItemsEnabled()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getCount()I
    .locals 2

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls40/h;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ls40/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Landroid/widget/ArrayAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ls40/h;->d:Ljava/lang/Object;

    check-cast v0, Ls40/f0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Ls40/h;->a(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    return-object p1

    :pswitch_0
    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getItemId(I)J
    .locals 2

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0

    :pswitch_0
    invoke-virtual {p0, p1}, Ls40/h;->a(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->hashCode()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public getPosition(Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/widget/ArrayAdapter;->getPosition(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lcom/stripe/android/core/model/Country;

    iget-object v0, p0, Ls40/h;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "viewGroup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ls40/h;->c:Ljava/lang/Object;

    check-cast p2, Lq11/c;

    invoke-virtual {p2, p3}, Lq11/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    :goto_0
    invoke-virtual {p0, p1}, Ls40/h;->a(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    :pswitch_0
    iget-object p2, p0, Ls40/h;->d:Ljava/lang/Object;

    check-cast p2, Landroid/view/LayoutInflater;

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const v1, 0x7f0d065f

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    goto :goto_1

    :cond_1
    const v1, 0x7f0d0642

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :goto_1
    if-lez p1, :cond_6

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p3, p0, Ls40/h;->e:Ljava/lang/Object;

    check-cast p3, Ls40/b1;

    iget-object v1, p0, Ls40/h;->b:Ljava/util/List;

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-static {p1, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    if-eqz p1, :cond_6

    iget-object v1, p0, Ls40/h;->c:Ljava/lang/Object;

    check-cast v1, Ly00/i;

    if-ne p1, v1, :cond_2

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    const v1, 0x7f0a01e9

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_3

    iget v3, p1, Ly00/i;->y:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    const v1, 0x7f0a01e8

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v2, :cond_4

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget v0, p3, Ls40/b1;->f:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_3

    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_3
    const v0, 0x7f0a01eb

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_6

    iget-object p1, p1, Ly00/i;->x:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v2, :cond_5

    iget p1, p3, Ls40/b1;->f:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_4

    :cond_5
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_6
    :goto_4
    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public isEnabled(I)Z
    .locals 1

    iget v0, p0, Ls40/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result p1

    return p1

    :pswitch_0
    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
