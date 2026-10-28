.class public final synthetic Ljr1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/integrations/view/IntegrationsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/integrations/view/IntegrationsFragment;I)V
    .locals 0

    iput p2, p0, Ljr1/i;->w:I

    iput-object p1, p0, Ljr1/i;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljr1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljr1/i;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    check-cast p1, Lgr1/n;

    invoke-static {v0, p1}, Lcom/whoop/integrations/view/IntegrationsFragment;->E(Lcom/whoop/integrations/view/IntegrationsFragment;Lgr1/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljr1/i;->x:Lcom/whoop/integrations/view/IntegrationsFragment;

    check-cast p1, Lgr1/n;

    invoke-static {v0, p1}, Lcom/whoop/integrations/view/IntegrationsFragment;->B(Lcom/whoop/integrations/view/IntegrationsFragment;Lgr1/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
