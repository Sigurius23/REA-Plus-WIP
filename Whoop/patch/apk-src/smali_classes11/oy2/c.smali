.class public final synthetic Loy2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Loy2/e;


# direct methods
.method public synthetic constructor <init>(Loy2/e;I)V
    .locals 0

    iput p2, p0, Loy2/c;->w:I

    iput-object p1, p0, Loy2/c;->x:Loy2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loy2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loy2/c;->x:Loy2/e;

    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-static {v0, p1}, Loy2/e;->e(Loy2/e;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loy2/c;->x:Loy2/e;

    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-static {v0, p1}, Loy2/e;->h(Loy2/e;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Loy2/c;->x:Loy2/e;

    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-static {v0, p1}, Loy2/e;->c(Loy2/e;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Loy2/c;->x:Loy2/e;

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {v0, p1}, Loy2/e;->o(Loy2/e;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
