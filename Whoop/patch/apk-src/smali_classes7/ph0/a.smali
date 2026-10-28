.class public final synthetic Lph0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/aiinsights/AiInsightsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/aiinsights/AiInsightsFragment;I)V
    .locals 0

    iput p2, p0, Lph0/a;->w:I

    iput-object p1, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lph0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-static {v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->G(Lcom/whoop/aiinsights/AiInsightsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-static {v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->z(Lcom/whoop/aiinsights/AiInsightsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-static {v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->C(Lcom/whoop/aiinsights/AiInsightsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-static {v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->D(Lcom/whoop/aiinsights/AiInsightsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lph0/a;->x:Lcom/whoop/aiinsights/AiInsightsFragment;

    invoke-static {v0}, Lcom/whoop/aiinsights/AiInsightsFragment;->E(Lcom/whoop/aiinsights/AiInsightsFragment;)Lph0/b;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
