.class public final synthetic Lrn2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrn2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrn2/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;

    invoke-static {p1}, Lrn2/b;->c(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;

    invoke-static {p1}, Lrn2/b;->b(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
