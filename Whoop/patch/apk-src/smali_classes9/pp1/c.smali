.class public final synthetic Lpp1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;I)V
    .locals 0

    iput p2, p0, Lpp1/c;->w:I

    iput-object p1, p0, Lpp1/c;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpp1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp1/c;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->B(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpp1/c;->x:Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;

    check-cast p1, Lnp1/h;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;->y(Lcom/whoop/hormonalinsights/pregnancyinsights/view/PregnancyInsightsFragment;Lnp1/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
