.class public final synthetic Leg2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/sms/setup/view/SmsSetupFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/sms/setup/view/SmsSetupFragment;I)V
    .locals 0

    iput p2, p0, Leg2/c;->w:I

    iput-object p1, p0, Leg2/c;->x:Lcom/whoop/sms/setup/view/SmsSetupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leg2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg2/c;->x:Lcom/whoop/sms/setup/view/SmsSetupFragment;

    check-cast p1, Lcg2/a;

    invoke-static {v0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->A(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leg2/c;->x:Lcom/whoop/sms/setup/view/SmsSetupFragment;

    check-cast p1, Lcg2/a;

    invoke-static {v0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->z(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
