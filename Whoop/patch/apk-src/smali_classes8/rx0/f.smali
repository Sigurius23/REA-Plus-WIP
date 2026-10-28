.class public final synthetic Lrx0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrx0/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrx0/f;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/profile/domain/models/ProfileSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/profile/domain/models/ProfileResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/profile/domain/models/Gender;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget v0, Lcom/stripe/android/view/PaymentAuthWebView;->x:I

    return-object v1

    :pswitch_4
    sget-object v0, Lcom/stripe/android/view/ExpiryDateEditText;->d0:[Lj93/z;

    return-object v1

    :pswitch_5
    sget v0, Lcom/stripe/android/view/CvcEditText;->a0:I

    return-object v1

    :pswitch_6
    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    return-object v1

    :pswitch_7
    sget v0, Lcom/stripe/android/view/BecsDebitBsbEditText;->b0:I

    return-object v1

    :pswitch_8
    invoke-static {}, Lcom/whoop/payments/domain/models/PaymentsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopSectionHeaderModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopProductCarouselModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopCategoryModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopBannerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/ShopBannerCarouselModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/NativeStoreSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/CheckoutFooter;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/nativestore/home/domain/model/CartIndicator;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lry2/e;->p()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lry2/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lry2/a;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lry0/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lrx0/g;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lrx0/g;->a()Ll83/a0;

    move-result-object v0

    return-object v0

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
