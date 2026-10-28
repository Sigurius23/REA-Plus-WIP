.class final Lfl0/b$s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lfl0/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$postNewConversationV2$3"
    f = "AiConversationInteractor.kt"
    l = {
        0x271
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lcom/whoop/bot/models/conversation/StartConversationV2Request;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfl0/b;


# direct methods
.method public constructor <init>(Lfl0/b;ZZLcom/whoop/bot/models/conversation/StartConversationV2Request;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "ZZ",
            "Lcom/whoop/bot/models/conversation/StartConversationV2Request;",
            "Lq83/d<",
            "-",
            "Lfl0/b$s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$s;->z:Lfl0/b;

    iput-boolean p2, p0, Lfl0/b$s;->E:Z

    iput-boolean p3, p0, Lfl0/b$s;->F:Z

    iput-object p4, p0, Lfl0/b$s;->G:Lcom/whoop/bot/models/conversation/StartConversationV2Request;

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

    new-instance v0, Lfl0/b$s;

    iget-object v1, p0, Lfl0/b$s;->z:Lfl0/b;

    iget-boolean v2, p0, Lfl0/b$s;->E:Z

    iget-boolean v3, p0, Lfl0/b$s;->F:Z

    iget-object v4, p0, Lfl0/b$s;->G:Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lfl0/b$s;-><init>(Lfl0/b;ZZLcom/whoop/bot/models/conversation/StartConversationV2Request;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$s;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfl0/b$s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$s;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lfl0/b$s;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfl0/b$s;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lfl0/b$s;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lfl0/b$s;->z:Lfl0/b;

    invoke-static {v3}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v3

    iget-boolean v5, v0, Lfl0/b$s;->F:Z

    iget-object v6, v0, Lfl0/b$s;->G:Lcom/whoop/bot/models/conversation/StartConversationV2Request;

    :cond_2
    move-object v7, v3

    check-cast v7, Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/bot/models/conversation/AiChatConversation;

    if-eqz v5, :cond_3

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getBody()Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;->getMessage()Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    :goto_0
    move-object v12, v9

    goto :goto_1

    :cond_3
    sget-object v9, Lm83/y;->w:Lm83/y;

    goto :goto_0

    :goto_1
    new-instance v14, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-virtual {v6}, Lcom/whoop/bot/models/conversation/StartConversationV2Request;->getConversationId()Ljava/lang/String;

    move-result-object v11

    const/16 v18, 0x7c

    const/16 v19, 0x0

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/whoop/bot/models/conversation/AiChatConversation;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v8, v10}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v13, Lfl0/c;

    sget-object v15, Lfl0/j;->LOADING:Lfl0/j;

    iget-boolean v3, v0, Lfl0/b$s;->E:Z

    const/16 v20, 0x2c

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v3

    move-object v14, v10

    invoke-direct/range {v13 .. v21}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    iput-object v3, v0, Lfl0/b$s;->y:Ljava/lang/Object;

    iput-object v3, v0, Lfl0/b$s;->w:Ljava/lang/Object;

    iput v4, v0, Lfl0/b$s;->x:I

    invoke-interface {v1, v13, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
