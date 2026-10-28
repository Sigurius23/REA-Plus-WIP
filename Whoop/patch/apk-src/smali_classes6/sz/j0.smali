.class public final Lsz/j0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lsz/j0;->w:I

    iput-object p1, p0, Lsz/j0;->y:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Lsz/j0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lsz/j0;

    iget-object v0, p0, Lsz/j0;->y:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Lsz/j0;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lsz/j0;

    iget-object v0, p0, Lsz/j0;->y:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Lsz/j0;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsz/j0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lsz/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsz/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsz/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lsz/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsz/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsz/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lsz/j0;->w:I

    iget-object v1, p0, Lsz/j0;->y:Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lsz/j0;->x:I

    if-eqz v4, :cond_1

    if-ne v4, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->z:I

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->p()Lsz/p0;

    move-result-object p1

    iput v3, p0, Lsz/j0;->x:I

    invoke-virtual {p1, p0}, Lsz/p0;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lsz/j0;->x:I

    if-eqz v4, :cond_4

    if-eq v4, v3, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget p1, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->z:I

    invoke-virtual {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;->p()Lsz/p0;

    move-result-object p1

    iget-object p1, p1, Lsz/p0;->I:Lec3/r1;

    new-instance v2, Lu;

    const/16 v4, 0x18

    invoke-direct {v2, v1, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    iput v3, p0, Lsz/j0;->x:I

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1, v2, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
