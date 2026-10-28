.class public final synthetic Lh30/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/shoppay/ShopPayActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V
    .locals 0

    iput p2, p0, Lh30/a;->w:I

    iput-object p1, p0, Lh30/a;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lh30/a;->w:I

    iget-object v1, p0, Lh30/a;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    iget-object v0, v1, Lcom/stripe/android/shoppay/ShopPayActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/stripe/android/shoppay/ShopPayActivity;->w:Ll8/d;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
