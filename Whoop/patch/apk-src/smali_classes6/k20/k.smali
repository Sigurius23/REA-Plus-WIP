.class public final Lk20/k;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lk20/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/k;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "mc_open_edit_screen"

    return-object v0

    :pswitch_0
    const-string v0, "mc_cancel_edit_screen"

    return-object v0

    :pswitch_1
    const-string v0, "mc_dismiss"

    return-object v0

    :pswitch_2
    const-string v0, "mc_card_number_completed"

    return-object v0

    :pswitch_3
    const-string v0, "stripe_android.bankaccountcollector.started"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
