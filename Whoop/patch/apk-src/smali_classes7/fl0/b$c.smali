.class final Lfl0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->D(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lfl0/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lfl0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$commitRecommendation$1$1"
    f = "AiConversationInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lpm0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpm0/a<",
            "Lcom/whoop/bot/models/conversation/CommitRecommendationResponse;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic y:Lfl0/b;


# direct methods
.method public constructor <init>(Lpm0/a;Lfl0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/bot/models/conversation/CommitRecommendationResponse;",
            ">;",
            "Lfl0/b;",
            "Lq83/d<",
            "-",
            "Lfl0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$c;->x:Lpm0/a;

    iput-object p2, p0, Lfl0/b$c;->y:Lfl0/b;

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

    new-instance p1, Lfl0/b$c;

    iget-object v0, p0, Lfl0/b$c;->x:Lpm0/a;

    iget-object v1, p0, Lfl0/b$c;->y:Lfl0/b;

    invoke-direct {p1, v0, v1, p2}, Lfl0/b$c;-><init>(Lpm0/a;Lfl0/b;Lq83/d;)V

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
            "Lfl0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfl0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lfl0/b$c;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfl0/b$c;->x:Lpm0/a;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/models/conversation/CommitRecommendationResponse;

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/CommitRecommendationResponse;->getMessage()Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lfl0/b$c;->y:Lfl0/b;

    invoke-static {v0, p1}, Lfl0/b;->e(Lfl0/b;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v1, p1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object p1, p0, Lfl0/b$c;->y:Lfl0/b;

    invoke-static {p1}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    goto :goto_0

    :goto_2
    sget-object v2, Lfl0/j;->SUCCESS:Lfl0/j;

    new-instance v0, Lfl0/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3c

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
