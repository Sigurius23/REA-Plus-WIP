.class public final Lh30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/shoppay/ShopPayActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V
    .locals 0

    iput p2, p0, Lh30/c;->w:I

    iput-object p1, p0, Lh30/c;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lh30/c;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x0

    iget-object v3, p0, Lh30/c;->x:Lcom/stripe/android/shoppay/ShopPayActivity;

    const/4 v4, 0x2

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v4, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget p2, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    invoke-virtual {v3, p1, v2}, Lcom/stripe/android/shoppay/ShopPayActivity;->m(Landroidx/compose/runtime/Composer;I)V

    :goto_1
    return-object v1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    if-ne p2, v4, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget p2, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    invoke-virtual {v3, p1, v2}, Lcom/stripe/android/shoppay/ShopPayActivity;->o(Landroidx/compose/runtime/Composer;I)V

    :goto_3
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
