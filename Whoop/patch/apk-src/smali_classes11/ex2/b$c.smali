.class final Lex2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->a(ILjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$abandonCampaign$result$1"
    f = "LabsCampaignsRepository.kt"
    l = {
        0x17f,
        0x184
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lex2/b;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lex2/b;ILjava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lex2/b;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lex2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$c;->x:Ljava/lang/String;

    iput-object p2, p0, Lex2/b$c;->y:Lex2/b;

    iput p3, p0, Lex2/b$c;->z:I

    iput-object p4, p0, Lex2/b$c;->E:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lex2/b$c;

    iget-object v1, p0, Lex2/b$c;->x:Ljava/lang/String;

    iget-object v2, p0, Lex2/b$c;->y:Lex2/b;

    iget v3, p0, Lex2/b$c;->z:I

    iget-object v4, p0, Lex2/b$c;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lex2/b$c;-><init>(Ljava/lang/String;Lex2/b;ILjava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lex2/b$c;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lex2/b$c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lex2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lex2/b$c;->w:I

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

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lex2/b$c;->x:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lex2/b$c;->y:Lex2/b;

    invoke-static {p1}, Lex2/b;->f(Lex2/b;)Lcom/whoop/whooplabs/data/network/WhoopLabsApi;

    move-result-object p1

    iget v1, p0, Lex2/b$c;->z:I

    new-instance v2, Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;

    iget-object v4, p0, Lex2/b$c;->x:Ljava/lang/String;

    iget-object v5, p0, Lex2/b$c;->E:Ljava/lang/String;

    invoke-direct {v2, v4, v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput v3, p0, Lex2/b$c;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/whooplabs/data/network/WhoopLabsApi;->abandonCampaign(ILcom/whoop/whooplabs/data/remote/domain/dto/AbandonCampaignBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    iget-object p1, p0, Lex2/b$c;->y:Lex2/b;

    invoke-static {p1}, Lex2/b;->f(Lex2/b;)Lcom/whoop/whooplabs/data/network/WhoopLabsApi;

    move-result-object p1

    iget v1, p0, Lex2/b$c;->z:I

    iput v2, p0, Lex2/b$c;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/whooplabs/data/network/WhoopLabsApi;->abandonCampaign(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
