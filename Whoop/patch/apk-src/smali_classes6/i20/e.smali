.class public final Li20/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V
    .locals 0

    iput p2, p0, Li20/e;->w:I

    iput-object p1, p0, Li20/e;->x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li20/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "backStackEntry"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "country"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Li20/e;->x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->n(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Li20/p;

    move-result-object p4

    iget-object p4, p4, Li20/p;->y:Lk83/a;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->n(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Li20/p;

    move-result-object p2

    iget-object p2, p2, Li20/p;->w:Li20/k1;

    const/4 v0, 0x0

    invoke-static {p4, p2, p1, p3, v0}, Li20/l1;->a(Lk83/a;Li20/k1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li20/e;->x:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->n(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Li20/p;

    move-result-object p1

    iget-object p1, p1, Li20/p;->x:Lk83/a;

    const/4 p2, 0x0

    invoke-static {p1, p3, p2}, Li20/l1;->h(Lk83/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
