.class public final Lb30/a4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb30/a4;->w:I

    iput-object p1, p0, Lb30/a4;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/a4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p4, p2, 0x6

    if-nez p4, :cond_1

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p2, p4

    :cond_1
    and-int/lit16 p4, p2, 0x83

    const/16 v0, 0x82

    if-eq p4, v0, :cond_2

    const/4 p4, 0x1

    goto :goto_1

    :cond_2
    const/4 p4, 0x0

    :goto_1
    and-int/lit8 v0, p2, 0x1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, v0, p4}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    iget-object p4, p0, Lb30/a4;->x:Ljava/lang/Object;

    check-cast p4, Lkotlin/jvm/functions/Function3;

    and-int/lit8 p2, p2, 0xe

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p4, p1, p3, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lc93/a;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "onBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_5

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x4

    goto :goto_3

    :cond_4
    const/4 v0, 0x2

    :goto_3
    or-int/2addr v0, p4

    goto :goto_4

    :cond_5
    move v0, p4

    :goto_4
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_7

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_6

    const/16 p4, 0x20

    goto :goto_5

    :cond_6
    const/16 p4, 0x10

    :goto_5
    or-int/2addr v0, p4

    :cond_7
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_9

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p4}, Lp1/q;->X()V

    goto :goto_7

    :cond_9
    :goto_6
    iget-object p4, p0, Lb30/a4;->x:Ljava/lang/Object;

    check-cast p4, Li20/b0;

    and-int/lit8 v0, v0, 0x7e

    invoke-interface {p4, p1, p2, p3, v0}, Li20/b0;->B(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    iget-object p4, p0, Lb30/a4;->x:Ljava/lang/Object;

    check-cast p4, Lkotlin/jvm/functions/Function1;

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "backStackEntry"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_c

    const-string v0, "payment_details"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p2}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_a

    goto :goto_8

    :cond_a
    const-string v1, "is_billing_update_flow"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    const-string v0, "billing_update_cvc"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lwz/a1;

    invoke-direct {v0, p2}, Lwz/a1;-><init>(Ljava/lang/String;)V

    :goto_8
    const/4 p2, 0x0

    invoke-static {p1, v0, p4, p3, p2}, Ltx/f;->m(Ljava/lang/String;Lwz/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_c
    new-instance p1, Lwz/o;

    new-instance p2, Lcom/stripe/android/link/NoPaymentDetailsFoundException;

    invoke-direct {p2}, Lcom/stripe/android/link/NoPaymentDetailsFoundException;-><init>()V

    sget-object p3, Lwz/b;->w:Lwz/b;

    invoke-direct {p1, p2, p3}, Lwz/o;-><init>(Ljava/lang/Throwable;Lwz/e;)V

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lc0/o;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb30/a4;->x:Ljava/lang/Object;

    check-cast p1, Lx1/b;

    shr-int/lit8 p4, p4, 0x3

    and-int/lit8 p4, p4, 0xe

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p2, p3, p4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
