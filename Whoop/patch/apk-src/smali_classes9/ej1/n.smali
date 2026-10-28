.class public final synthetic Lej1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lej1/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lej1/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbp1/b;

    invoke-static {p1}, Lep1/b;->f(Lbp1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcp1/i;

    invoke-static {p1}, Lep1/b;->g(Lcp1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lm91/q;

    invoke-static {p1}, Leo2/d;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;

    invoke-static {p1}, Leo2/b;->b(Lcom/whoop/design/models/items/ShippingProgressBarModel;)Lsz0/b1;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {p1}, Leo2/b;->a(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;

    invoke-static {p1}, Leo2/b;->e(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;

    invoke-static {p1}, Leo2/b;->f(Lcom/whoop/universalcheckout/features/cart/domain/models/items/EmptyCartContentModel;)Lfo2/h;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    invoke-static {p1}, Leo2/b;->c(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;)Lfo2/d;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Leo2/b;->g(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Leo2/b;->d(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ltn0/a;

    invoke-static {p1}, Leo0/g;->q(Ltn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Leo0/g;->o(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Leo0/g;->t(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ltn0/a;

    invoke-static {p1}, Leo0/g;->a(Ltn0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lbo0/a;

    invoke-static {p1}, Leo0/g;->v(Lbo0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lbk2/b;

    invoke-static {p1}, Lek2/c;->c(Lbk2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lek2/c;->d(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lek2/b;->e(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/time/LocalDate;

    invoke-static {p1}, Lek2/a;->a(Ljava/time/LocalDate;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lek2/a;->f(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lej1/i0;->c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1}, Lej1/b0;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1}, Lej1/x;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1}, Lej1/x;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lej1/v;->a(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1}, Lej1/v;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lej1/t;->d(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lej1/r;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lej1/q;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lej1/o;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
