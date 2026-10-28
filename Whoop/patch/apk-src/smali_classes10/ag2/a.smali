.class public final synthetic Lag2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/analytics/ScreenAnalyticEventModel;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/analytics/ScreenAnalyticEventModel;I)V
    .locals 0

    iput p2, p0, Lag2/a;->w:I

    iput-object p1, p0, Lag2/a;->x:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lag2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lag2/a;->x:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/GenericFragment;->F(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lag2/a;->x:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-static {v0}, Lni0/c;->G(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lag2/a;->x:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-static {v0}, Lcom/whoop/sms/settings/view/SmsSettingsFragment;->A(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
