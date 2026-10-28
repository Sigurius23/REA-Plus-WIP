.class public final synthetic Ljr1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/integrations/view/IntegrationsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/integrations/view/IntegrationsFragment;I)V
    .locals 0

    iput p2, p0, Ljr1/h;->w:I

    iput-object p1, p0, Ljr1/h;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljr1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljr1/h;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v0}, Lcom/whoop/integrations/view/IntegrationsFragment;->A(Lcom/whoop/integrations/view/IntegrationsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljr1/h;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v0}, Lcom/whoop/integrations/view/IntegrationsFragment;->z(Lcom/whoop/integrations/view/IntegrationsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ljr1/h;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v0}, Lcom/whoop/integrations/view/IntegrationsFragment;->C(Lcom/whoop/integrations/view/IntegrationsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ljr1/h;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-static {v0}, Lcom/whoop/integrations/view/IntegrationsFragment;->y(Lcom/whoop/integrations/view/IntegrationsFragment;)Ljava/lang/String;

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
