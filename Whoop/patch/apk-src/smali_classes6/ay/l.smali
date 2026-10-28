.class public final synthetic Lay/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;
.implements Lkotlin/jvm/internal/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lay/l;->w:I

    iput-object p1, p0, Lay/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    iget p2, p0, Lay/l;->w:I

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, Lay/l;->x:Ljava/lang/Object;

    packed-switch p2, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Lx20/o;

    check-cast v1, Lx20/w;

    iget-object p2, v1, Lx20/w;->y:Lec3/h2;

    :cond_0
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lx20/p;

    iget-boolean v1, v2, Lx20/p;->d:Z

    if-eqz v1, :cond_1

    sget-object v1, Lx20/o;->w:Lx20/o;

    if-ne v5, v1, :cond_1

    const/4 v1, 0x1

    :goto_0
    move v6, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v0

    :pswitch_0
    check-cast p1, Lay/s;

    check-cast v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    sget p2, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->y:I

    new-instance p2, Ll83/k;

    const-string v2, "com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result"

    invoke-direct {p2, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0x121f

    invoke-virtual {v1, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    iget v0, p0, Lay/l;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Lec3/m;

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
    instance-of v0, p1, Lec3/m;

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 9

    iget v0, p0, Lay/l;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lkotlin/jvm/internal/a;

    iget-object v0, p0, Lay/l;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lx20/w;

    const-string v7, "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V"

    const/4 v3, 0x4

    const/4 v2, 0x2

    const-class v4, Lx20/w;

    const-string v6, "updatePollingState"

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    new-instance v2, Lkotlin/jvm/internal/a;

    iget-object v0, p0, Lay/l;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    const-string v8, "dismissWithResult(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityResult;)V"

    const/4 v4, 0x4

    const/4 v3, 0x2

    const-class v5, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    const-string v7, "dismissWithResult"

    invoke-direct/range {v2 .. v8}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lay/l;->w:I

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
