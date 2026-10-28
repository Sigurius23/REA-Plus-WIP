.class public final Liv/d;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Liv/d;->a:I

    iput-object p2, p0, Liv/d;->b:Ljava/lang/Object;

    const v0, 0x7f0d0307

    .line 7
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lyp/f;Landroidx/fragment/app/r0;)V
    .locals 4

    const/4 v0, 0x1

    iput v0, p0, Liv/d;->a:I

    .line 1
    iput-object p1, p0, Liv/d;->b:Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lyp/f;->y:Lso/q;

    .line 3
    iget-object v0, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    iget-object v1, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "libraries_social_licenses_license"

    const-string v3, "layout"

    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 4
    iget-object p1, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/Resources;

    const-string v2, "license"

    const-string v3, "id"

    invoke-virtual {p1, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-direct {p0, p2, v0, p1, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    iget v0, p0, Liv/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liv/d;->b:Ljava/lang/Object;

    check-cast v0, Lyp/f;

    if-nez p2, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    iget-object v1, v0, Lyp/f;->y:Lso/q;

    iget-object v2, v1, Lso/q;->w:Ljava/lang/Object;

    check-cast v2, Landroid/content/res/Resources;

    iget-object v1, v1, Lso/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v3, "libraries_social_licenses_license"

    const-string v4, "layout"

    invoke-virtual {v2, v3, v4, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpp/d;

    if-eqz p1, :cond_1

    iget-object p3, v0, Lyp/f;->y:Lso/q;

    iget-object v0, p3, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    iget-object p3, p3, Lso/q;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    const-string v1, "license"

    const-string v2, "id"

    invoke-virtual {v0, v1, v2, p3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object p1, p1, Lpp/d;->w:Ljava/lang/String;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-object p2

    :pswitch_0
    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const-string p3, "super.getView(position, convertView, parent)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Liv/d;->b:Ljava/lang/Object;

    check-cast p3, Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Liv/a;

    const p3, 0x1020014

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p1, Liv/a;->b:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    const v0, -0x777778

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0602d2

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    :goto_0
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p1, Liv/a;->a:Ljava/lang/String;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
