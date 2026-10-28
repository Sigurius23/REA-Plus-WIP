.class final Lex2/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->j(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignListScreen$2"
    f = "LabsCampaignsRepository.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lex2/b;

.field final synthetic y:Lcom/whoop/domain/model/WhoopStrapInfo;


# direct methods
.method public constructor <init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/b;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "Lq83/d<",
            "-",
            "Lex2/b$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$i;->x:Lex2/b;

    iput-object p2, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lex2/b$i;

    iget-object v1, p0, Lex2/b$i;->x:Lex2/b;

    iget-object v2, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-direct {v0, v1, v2, p1}, Lex2/b$i;-><init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lex2/b$i;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lex2/b$i;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$i;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lex2/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lex2/b$i;->w:I

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

    iget-object p1, p0, Lex2/b$i;->x:Lex2/b;

    invoke-static {p1}, Lex2/b;->b(Lex2/b;)Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;

    move-result-object v3

    iget-object p1, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object p1

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object v4, v1

    :goto_0
    iget-object p1, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object v5, v1

    :goto_1
    iget-object p1, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    goto :goto_2

    :cond_4
    move-object v6, v1

    :goto_2
    iget-object p1, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSigProcVersion()Loh2/e;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Loh2/e;->f()Ljava/lang/String;

    move-result-object p1

    move-object v7, p1

    goto :goto_3

    :cond_5
    move-object v7, v1

    :goto_3
    iget-object p1, p0, Lex2/b$i;->y:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getRawSerialNumber()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v8, v1

    iput v2, p0, Lex2/b$i;->w:I

    move-object v9, p0

    invoke-interface/range {v3 .. v9}, Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;->fetchCampaignListScreen(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    return-object p1
.end method
