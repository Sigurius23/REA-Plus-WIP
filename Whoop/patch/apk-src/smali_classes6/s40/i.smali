.class public final synthetic Ls40/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Ls40/i;->w:I

    iput-object p1, p0, Ls40/i;->x:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9

    iget p1, p0, Ls40/i;->w:I

    iget-object p2, p0, Ls40/i;->x:Landroid/view/ViewGroup;

    packed-switch p1, :pswitch_data_0

    check-cast p2, Lcom/stripe/android/view/CountryTextInputLayout;

    iget-object p1, p2, Lcom/stripe/android/view/CountryTextInputLayout;->j1:Ls40/h;

    invoke-virtual {p1, p3}, Ls40/h;->a(I)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/CountryTextInputLayout;->R(Lcom/stripe/android/core/model/CountryCode;)V

    return-void

    :pswitch_0
    check-cast p2, Lcom/stripe/android/view/CardBrandView;

    sget p1, Lcom/stripe/android/view/CardBrandView;->E:I

    invoke-virtual {p2}, Lcom/stripe/android/view/CardBrandView;->getPossibleBrands()Ljava/util/List;

    move-result-object p1

    add-int/lit8 p3, p3, -0x1

    invoke-static {p3, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ly00/i;

    if-eqz v3, :cond_1

    iget-object p1, p2, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    :cond_0
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ls40/k;

    const/4 v7, 0x0

    const/16 v8, 0xf7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p4

    invoke-virtual {p1, p3, p4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/view/CardBrandView;->c()V

    :cond_1
    iget-object p1, p2, Lcom/stripe/android/view/CardBrandView;->y:Landroid/widget/ListPopupWindow;

    invoke-virtual {p1}, Landroid/widget/ListPopupWindow;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
