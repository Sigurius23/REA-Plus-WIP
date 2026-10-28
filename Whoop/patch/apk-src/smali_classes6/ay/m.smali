.class public final Lay/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lay/m;->w:I

    iput-object p2, p0, Lay/m;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Lay/m;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lq20/e0;

    iget-object p2, p0, Lay/m;->x:Lp1/c1;

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    if-eqz p2, :cond_4

    if-eqz p1, :cond_3

    instance-of v0, p1, Lq20/b0;

    if-eqz v0, :cond_0

    sget-object p1, Lb30/m3;->a:Lb30/m3;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lq20/c0;

    if-eqz v0, :cond_1

    sget-object p1, Lb30/n3;->a:Lb30/n3;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lq20/a0;

    if-eqz v0, :cond_2

    new-instance v0, Lb30/l3;

    check-cast p1, Lq20/a0;

    iget-object p1, p1, Lq20/a0;->b:Lh02/n0;

    invoke-direct {v0, p1}, Lb30/l3;-><init>(Lh02/n0;)V

    move-object p1, v0

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->c(Lb30/o3;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ll83/a0;

    iget-object p1, p0, Lay/m;->x:Lp1/c1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
