.class public final synthetic Lev1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;I)V
    .locals 0

    iput p2, p0, Lev1/c;->w:I

    iput-object p1, p0, Lev1/c;->x:Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lev1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev1/c;->x:Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;

    invoke-static {v0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->A(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lev1/c;->x:Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;

    invoke-static {v0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->B(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lev1/c;->x:Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;

    invoke-static {v0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->y(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
