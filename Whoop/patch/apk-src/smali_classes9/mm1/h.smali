.class public final synthetic Lmm1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmm1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmm1/h;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lmx1/p;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmw2/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmw0/j;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lmu2/f;->Z(Ljava/util/List;)Lwc3/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lmu2/f;->b(Ljava/util/List;)Lwc3/c;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lmu0/e;->r(Ltb/a;)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lms1/a;->d(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmq1/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Leq0/z0;

    invoke-static {p1}, Lmq0/e;->J(Leq0/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmo1/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;

    invoke-static {p1}, Lmn2/a;->k(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReceiptHeaderModel;)Lhp2/c;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;

    invoke-static {p1}, Lmn2/a;->f(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutFooterModel;)Lio2/h;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;

    invoke-static {p1}, Lmn2/a;->b(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodTileModel;)Lio2/b0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;

    invoke-static {p1}, Lmn2/a;->e(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Lio2/d0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;

    invoke-static {p1}, Lmn2/a;->c(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/CheckoutInfoModel;)Lio2/k;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;

    invoke-static {p1}, Lmn2/a;->d(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/OrderDetailsModel;)Lio2/u;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmn2/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lmn2/a;->h(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmn2/a;->i(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;

    invoke-static {p1}, Lmn2/a;->l(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PreviewTileModel;)Ly71/o;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    invoke-static {p1}, Lmn2/a;->j(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;)Ly71/o;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    invoke-static {p1}, Lmn2/a;->g(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;)Lio2/o0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;

    invoke-static {p1}, Lmn2/a;->m(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;)Lhp2/g;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lmn2/a;->n(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lhn1/d;

    invoke-static {p1}, Lmn1/h;->h(Lhn1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lhn1/d;

    invoke-static {p1}, Lmn1/h;->e(Lhn1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lhn1/d;

    invoke-static {p1}, Lmn1/h;->l(Lhn1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljn1/b;

    invoke-static {p1}, Lmn1/h;->b(Ljn1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lmm1/i;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lmm1/i;->b(Ljava/lang/Object;)Ll83/a0;

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
