.class public final synthetic Loy2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Loy2/e;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Loy2/e;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Loy2/d;->w:I

    iput-object p1, p0, Loy2/d;->x:Loy2/e;

    iput-object p2, p0, Loy2/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Loy2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loy2/d;->y:Ljava/lang/Object;

    check-cast v0, Loy2/l$j;

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iget-object v1, p0, Loy2/d;->x:Loy2/e;

    invoke-static {v1, v0, p1}, Loy2/e;->l(Loy2/e;Loy2/l$j;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loy2/d;->y:Ljava/lang/Object;

    check-cast v0, Loy2/e$a;

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iget-object v1, p0, Loy2/d;->x:Loy2/e;

    invoke-static {v1, v0, p1}, Loy2/e;->d(Loy2/e;Loy2/e$a;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
