.class public final synthetic Lx20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V
    .locals 0

    iput p2, p0, Lx20/g;->w:I

    iput-object p1, p0, Lx20/g;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lx20/g;->w:I

    iget-object v1, p0, Lx20/g;->x:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->x:La20/h;

    return-object v0

    :pswitch_0
    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->z:I

    new-instance v2, Lx20/s;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v0

    iget-object v3, v0, Lx20/k;->w:Ljava/lang/String;

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v0

    iget v0, v0, Lx20/k;->y:I

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v0

    iget v0, v0, Lx20/k;->z:I

    invoke-static {v0, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v0

    iget v0, v0, Lx20/k;->E:I

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v4

    iget-object v9, v4, Lx20/k;->F:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->o()Lx20/k;

    move-result-object v1

    iget-object v10, v1, Lx20/k;->G:Ljava/lang/String;

    move-wide v4, v5

    move-wide v6, v7

    move v8, v0

    invoke-direct/range {v2 .. v10}, Lx20/s;-><init>(Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;)V

    return-object v2

    :pswitch_1
    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->z:I

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extra_args"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lx20/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
