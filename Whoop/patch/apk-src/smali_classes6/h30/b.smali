.class public final synthetic Lh30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/shoppay/ShopPayActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/ShopPayActivity;II)V
    .locals 0

    iput p3, p0, Lh30/b;->w:I

    iput-object p1, p0, Lh30/b;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lh30/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    iget-object v3, p0, Lh30/b;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p2, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    packed-switch v0, :pswitch_data_0

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v3, p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivity;->o(Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_0
    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-virtual {v3, p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivity;->m(Landroidx/compose/runtime/Composer;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
