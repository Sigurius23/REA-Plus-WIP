.class final Lyw2/h$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/h;->t(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.WhoopLabsServiceModel$checkAndCreateProtocolStepResults$2$remoteCampaign$1"
    f = "WhoopLabsServiceModel.kt"
    l = {
        0xe7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lyw2/h;

.field final synthetic y:Lcom/whoop/whooplabs/data/domain/LabsCampaign;


# direct methods
.method public constructor <init>(Lyw2/h;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/h;",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            "Lq83/d<",
            "-",
            "Lyw2/h$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyw2/h$d;->x:Lyw2/h;

    iput-object p2, p0, Lyw2/h$d;->y:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lyw2/h$d;

    iget-object v0, p0, Lyw2/h$d;->x:Lyw2/h;

    iget-object v1, p0, Lyw2/h$d;->y:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-direct {p1, v0, v1, p2}, Lyw2/h$d;-><init>(Lyw2/h;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lyw2/h$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyw2/h$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyw2/h$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyw2/h$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyw2/h$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyw2/h$d;->x:Lyw2/h;

    invoke-static {p1}, Lyw2/h;->f(Lyw2/h;)Lex2/c;

    move-result-object p1

    iget-object v1, p0, Lyw2/h$d;->y:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getCampaignId()I

    move-result v1

    iput v2, p0, Lyw2/h$d;->w:I

    invoke-virtual {p1, v1, p0}, Lex2/c;->o(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
