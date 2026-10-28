.class public final synthetic Ls40/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method public synthetic constructor <init>(ILcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    iput p1, p0, Ls40/p;->w:I

    iput-object p2, p0, Ls40/p;->x:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ls40/p;->w:I

    const-string v1, "brand"

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Ls40/p;->x:Lcom/stripe/android/view/CardMultilineWidget;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, v3, Lcom/stripe/android/view/CardMultilineWidget;->H:Lcom/stripe/android/view/CardNumberTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardNumberTextInputLayout;->setLoading$payments_core_release(Z)V

    return-object v2

    :pswitch_0
    check-cast p1, Ljava/util/List;

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    const-string v0, "brands"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardBrandView;->getBrand()Ly00/i;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setPossibleBrands(Ljava/util/List;)V

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ly00/i;->X:Ly00/i;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardBrandView;->setBrand(Ly00/i;)V

    :cond_0
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    if-nez p1, :cond_1

    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_1
    iget-object v0, v3, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    iget-object v1, v3, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    iget-object v4, v3, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    iget-object v3, v3, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1, v1, v4, v3}, Lcom/stripe/android/view/CvcEditText;->f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :pswitch_1
    check-cast p1, Ly00/i;

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lcom/stripe/android/view/CardMultilineWidget;->E:Lcom/stripe/android/view/CvcEditText;

    iget-object v1, v3, Lcom/stripe/android/view/CardMultilineWidget;->P:Ljava/lang/String;

    iget-object v4, v3, Lcom/stripe/android/view/CardMultilineWidget;->Q:Ljava/lang/String;

    iget-object v3, v3, Lcom/stripe/android/view/CardMultilineWidget;->J:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1, v1, v4, v3}, Lcom/stripe/android/view/CvcEditText;->f(Ly00/i;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v2

    :pswitch_2
    check-cast p1, Ly00/i;

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget;->f0:[Lj93/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lcom/stripe/android/view/CardMultilineWidget;->y:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setBrand(Ly00/i;)V

    invoke-virtual {v3}, Lcom/stripe/android/view/CardMultilineWidget;->b()V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
