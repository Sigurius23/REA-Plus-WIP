.class public final Lcom/stripe/android/view/CardBrandView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u001d#R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR0\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R0\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e2\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000e8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u0010\"\u0004\u0008\u0015\u0010\u0012R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0005\"\u0004\u0008\u0018\u0010\u0007R$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u0005\"\u0004\u0008\u001b\u0010\u0007R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/view/CardBrandView;",
        "Landroid/widget/FrameLayout;",
        "",
        "value",
        "isCbcEligible",
        "()Z",
        "setCbcEligible",
        "(Z)V",
        "Ly00/i;",
        "getBrand",
        "()Ly00/i;",
        "setBrand",
        "(Ly00/i;)V",
        "brand",
        "",
        "getPossibleBrands",
        "()Ljava/util/List;",
        "setPossibleBrands",
        "(Ljava/util/List;)V",
        "possibleBrands",
        "getMerchantPreferredNetworks",
        "setMerchantPreferredNetworks",
        "merchantPreferredNetworks",
        "getShouldShowCvc",
        "setShouldShowCvc",
        "shouldShowCvc",
        "getShouldShowErrorIcon",
        "setShouldShowErrorIcon",
        "shouldShowErrorIcon",
        "Ls40/k;",
        "getState",
        "()Ls40/k;",
        "setState",
        "(Ls40/k;)V",
        "state",
        "s40/j",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Landroid/widget/ImageView;

.field public final x:Landroid/widget/ImageView;

.field public final y:Landroid/widget/ListPopupWindow;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0645

    invoke-virtual {p2, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p2, 0x7f0a025f

    invoke-static {p0, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    const p2, 0x7f0a078d

    invoke-static {p0, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_0

    iput-object v2, p0, Lcom/stripe/android/view/CardBrandView;->w:Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/stripe/android/view/CardBrandView;->x:Landroid/widget/ImageView;

    new-instance p2, Landroid/widget/ListPopupWindow;

    invoke-direct {p2, p1}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView;->y:Landroid/widget/ListPopupWindow;

    new-instance p1, Ls40/k;

    invoke-direct {p1}, Ls40/k;-><init>()V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->c()V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static a(Landroid/view/ViewGroup;)V
    .locals 3

    if-eqz p0, :cond_1

    sget-object v0, Lbc/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lbc/a0;->b()La0/g;

    move-result-object v0

    invoke-virtual {v0, p0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc/w;

    invoke-virtual {v2, p0}, Lbc/w;->o(Landroid/view/ViewGroup;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lbc/a0;->a(Landroid/view/ViewGroup;Lbc/w;)V

    :cond_1
    return-void
.end method

.method private final getState()Ls40/k;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/k;

    return-object v0
.end method

.method private final setState(Ls40/k;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()Ly00/b3;
    .locals 5

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v0

    sget-object v1, Ly00/i;->X:Ly00/i;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Ly00/i;->w:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v3, Ly00/b3;

    invoke-direct {v3, v0}, Ly00/b3;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-boolean v0, v0, Ls40/k;->w:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getPossibleBrands()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x1

    if-le v0, v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_3

    return-object v3

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getMerchantPreferredNetworks()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/i;

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_5

    iget-object v0, v0, Ly00/i;->w:Ljava/lang/String;

    if-eqz v0, :cond_5

    new-instance v1, Ly00/b3;

    invoke-direct {v1, v0}, Ly00/b3;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_5
    return-object v2
.end method

.method public final c()V
    .locals 6

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->z:Ly00/i;

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v1

    iget-object v1, v1, Ls40/k;->E:Ljava/util/List;

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v2

    iget-object v2, v2, Ls40/k;->F:Ljava/util/List;

    const-string v3, "possibleBrands"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "merchantPreferredBrands"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ly00/i;->X:Ly00/i;

    const/4 v4, 0x0

    if-eq v0, v3, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :cond_1
    :goto_0
    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ly00/i;

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v4, v3

    :cond_3
    check-cast v4, Ly00/i;

    if-nez v0, :cond_6

    if-nez v4, :cond_4

    sget-object v0, Ly00/i;->X:Ly00/i;

    goto :goto_1

    :cond_4
    move-object v0, v4

    goto :goto_1

    :cond_5
    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->y:Ly00/i;

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v1

    if-eq v1, v0, :cond_7

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardBrandView;->setBrand(Ly00/i;)V

    :cond_7
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->e()V

    return-void
.end method

.method public final d()Ly00/r4;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v0

    sget-object v1, Ly00/i;->X:Ly00/i;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    :cond_0
    move-object v0, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ly00/r4;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v1

    iget-object v1, v1, Ly00/i;->w:Ljava/lang/String;

    invoke-direct {v0, v1}, Ly00/r4;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v1

    iget-boolean v1, v1, Ls40/k;->w:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getPossibleBrands()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_0

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getMerchantPreferredNetworks()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/i;

    if-eqz v0, :cond_3

    iget-object v0, v0, Ly00/i;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    new-instance v1, Ly00/r4;

    invoke-direct {v1, v0}, Ly00/r4;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_3
    return-object v2
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowErrorIcon()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->y:Ly00/i;

    iget v0, v0, Ly00/i;->E:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowCvc()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->y:Ly00/i;

    iget v0, v0, Ly00/i;->z:I

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->y:Ly00/i;

    iget v0, v0, Ly00/i;->y:I

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/CardBrandView;->w:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final f(Z)V
    .locals 12

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-boolean v0, v0, Ls40/k;->w:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getPossibleBrands()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowCvc()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getShouldShowErrorIcon()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/view/CardBrandView;->x:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    new-instance v0, Ls40/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getPossibleBrands()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v8

    invoke-direct {v0, v6, v7, v8}, Ls40/h;-><init>(Landroid/content/Context;Ljava/util/List;Ly00/i;)V

    iget-object v6, p0, Lcom/stripe/android/view/CardBrandView;->y:Landroid/widget/ListPopupWindow;

    invoke-virtual {v6, v0}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {v6, v2}, Landroid/widget/ListPopupWindow;->setModal(Z)V

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-virtual {v0}, Ls40/h;->getCount()I

    move-result v8

    move v9, v1

    move v10, v9

    :goto_2
    if-ge v9, v8, :cond_3

    invoke-virtual {v0, v9, v5, p0}, Ls40/h;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v2, v7}, Landroid/view/View;->measure(II)V

    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v11

    if-ge v10, v11, :cond_2

    move v10, v11

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v6, v10}, Landroid/widget/ListPopupWindow;->setWidth(I)V

    new-instance v0, Ls40/i;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Ls40/i;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {v6, v0}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->w:Landroid/widget/ImageView;

    invoke-virtual {v6, v0}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    new-instance v0, Ljo/j;

    const/16 v2, 0x10

    invoke-direct {v0, p0, v2}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_4

    invoke-static {v3}, Lcom/stripe/android/view/CardBrandView;->a(Landroid/view/ViewGroup;)V

    :cond_4
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_5
    invoke-virtual {p0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_6

    invoke-static {v3}, Lcom/stripe/android/view/CardBrandView;->a(Landroid/view/ViewGroup;)V

    :cond_6
    const/16 p1, 0x8

    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final getBrand()Ly00/i;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->y:Ly00/i;

    return-object v0
.end method

.method public final getMerchantPreferredNetworks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly00/i;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->F:Ljava/util/List;

    return-object v0
.end method

.method public final getPossibleBrands()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly00/i;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-object v0, v0, Ls40/k;->E:Ljava/util/List;

    return-object v0
.end method

.method public final getShouldShowCvc()Z
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-boolean v0, v0, Ls40/k;->G:Z

    return v0
.end method

.method public final getShouldShowErrorIcon()Z
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v0

    iget-boolean v0, v0, Ls40/k;->H:Z

    return v0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    instance-of v0, p1, Ls40/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls40/j;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Ls40/j;->x:Ls40/k;

    if-nez v1, :cond_2

    :cond_1
    new-instance v1, Ls40/k;

    invoke-direct {v1}, Ls40/k;-><init>()V

    :cond_2
    invoke-direct {p0, v1}, Lcom/stripe/android/view/CardBrandView;->setState(Ls40/k;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->c()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v0

    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ls40/j;

    invoke-direct {p0}, Lcom/stripe/android/view/CardBrandView;->getState()Ls40/k;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ls40/j;-><init>(Landroid/os/Parcelable;Ls40/k;)V

    return-object v1
.end method

.method public final setBrand(Ly00/i;)V
    .locals 11

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v9, 0x0

    const/16 v10, 0xfb

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->c()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    return-void

    :cond_0
    move-object p1, v4

    goto :goto_0
.end method

.method public final setCbcEligible(Z)V
    .locals 11

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v9, 0x0

    const/16 v10, 0xfe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v3, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    return-void

    :cond_0
    move p1, v3

    goto :goto_0
.end method

.method public final setMerchantPreferredNetworks(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ly00/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v9, 0x0

    const/16 v10, 0xdf

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->c()V

    return-void

    :cond_0
    move-object p1, v7

    goto :goto_0
.end method

.method public final setPossibleBrands(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ly00/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v9, 0x0

    const/16 v10, 0xef

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->c()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    return-void

    :cond_0
    move-object p1, v6

    goto :goto_0
.end method

.method public final setShouldShowCvc(Z)V
    .locals 11

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v9, 0x0

    const/16 v10, 0xbf

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v8, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->e()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardBrandView;->f(Z)V

    return-void

    :cond_0
    move p1, v8

    goto :goto_0
.end method

.method public final setShouldShowErrorIcon(Z)V
    .locals 11

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView;->z:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls40/k;

    const/4 v8, 0x0

    const/16 v10, 0x7f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, p1

    invoke-static/range {v2 .. v10}, Ls40/k;->b(Ls40/k;ZLy00/i;Ly00/i;Ljava/util/List;Ljava/util/List;ZZI)Ls40/k;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardBrandView;->e()V

    return-void

    :cond_0
    move p1, v9

    goto :goto_0
.end method
