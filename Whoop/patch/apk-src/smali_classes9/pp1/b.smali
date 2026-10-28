.class public final synthetic Lpp1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;I)V
    .locals 0

    iput p2, p0, Lpp1/b;->w:I

    iput-object p1, p0, Lpp1/b;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpp1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp1/b;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->E(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpp1/b;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->C(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpp1/b;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->D(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpp1/b;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->A(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
