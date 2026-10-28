.class final Lex2/b$s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->n(ILjava/lang/Integer;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$apiResult$1"
    f = "LabsCampaignsRepository.kt"
    l = {
        0xb0,
        0xbb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field w:I

.field final synthetic x:Ljava/lang/Integer;

.field final synthetic y:Lex2/b;

.field final synthetic z:Lcom/whoop/domain/model/WhoopStrapInfo;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lex2/b;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "I",
            "Lq83/d<",
            "-",
            "Lex2/b$s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$s;->x:Ljava/lang/Integer;

    iput-object p2, p0, Lex2/b$s;->y:Lex2/b;

    iput-object p3, p0, Lex2/b$s;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iput p4, p0, Lex2/b$s;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lex2/b$s;

    iget-object v1, p0, Lex2/b$s;->x:Ljava/lang/Integer;

    iget-object v2, p0, Lex2/b$s;->y:Lex2/b;

    iget-object v3, p0, Lex2/b$s;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iget v4, p0, Lex2/b$s;->E:I

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lex2/b$s;-><init>(Ljava/lang/Integer;Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;ILq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lex2/b$s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lex2/b$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lex2/b$s;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lex2/b$s;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lex2/b$s;->x:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lex2/b$s;->y:Lex2/b;

    invoke-static {p1}, Lex2/b;->e(Lex2/b;)Ltr2/n;

    move-result-object v5

    new-instance v8, Lex2/b$s$a;

    iget-object p1, p0, Lex2/b$s;->y:Lex2/b;

    iget-object v2, p0, Lex2/b$s;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iget-object v6, p0, Lex2/b$s;->x:Ljava/lang/Integer;

    invoke-direct {v8, p1, v2, v6, v1}, Lex2/b$s$a;-><init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;Ljava/lang/Integer;Lq83/d;)V

    iput v3, p0, Lex2/b$s;->w:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, v9

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    return-object p1

    :cond_4
    move-object v6, p0

    move-object p1, v1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v6, Lex2/b$s;->y:Lex2/b;

    invoke-static {v3}, Lex2/b;->e(Lex2/b;)Ltr2/n;

    move-result-object v3

    new-instance v5, Lex2/b$s$b;

    iget-object v4, v6, Lex2/b$s;->y:Lex2/b;

    iget-object v7, v6, Lex2/b$s;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    iget v8, v6, Lex2/b$s;->E:I

    invoke-direct {v5, v4, v7, v8, p1}, Lex2/b$s$b;-><init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;ILq83/d;)V

    iput v2, v6, Lex2/b$s;->w:I

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lu02/a;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    return-object p1
.end method
