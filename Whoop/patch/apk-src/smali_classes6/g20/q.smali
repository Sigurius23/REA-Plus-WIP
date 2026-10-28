.class public final synthetic Lg20/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lg20/q;->w:I

    iput-object p1, p0, Lg20/q;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Lg20/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    check-cast v0, Lq00/h0;

    invoke-virtual {v0, p1}, Lq00/h0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    check-cast p1, Lkz/n;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    check-cast v0, La1/e;

    invoke-virtual {v0, p1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast p1, Lv10/b;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Ld30/o;

    const/16 v3, 0x14

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lg20/q;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1

    :pswitch_0
    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_1
    return v1

    :pswitch_1
    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 9

    iget v0, p0, Lg20/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    check-cast v0, Lq00/h0;

    return-object v0

    :pswitch_0
    new-instance v1, Lkotlin/jvm/internal/i;

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, La1/e;

    const-string v7, "invoke(Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v3, 0x0

    const/4 v2, 0x1

    const-class v4, Lkotlin/jvm/functions/Function1;

    const-string v6, "invoke"

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_1
    new-instance v2, Lkotlin/jvm/internal/i;

    iget-object v0, p0, Lg20/q;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lg20/r;

    const-string v8, "onPaymentFlowResult$payments_core_release(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V"

    const/4 v4, 0x0

    const/4 v3, 0x1

    const-class v5, Lg20/r;

    const-string v7, "onPaymentFlowResult"

    invoke-direct/range {v2 .. v8}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lg20/q;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_0
    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_1
    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
