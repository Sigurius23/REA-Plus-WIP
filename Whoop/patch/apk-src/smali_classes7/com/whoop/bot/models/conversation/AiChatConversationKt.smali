.class public final Lcom/whoop/bot/models/conversation/AiChatConversationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "latestAssistantResponse",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "Lcom/whoop/bot/models/conversation/AiChatConversation;",
        "getLatestAssistantResponse",
        "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "replaceLatestResponse",
        "response",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getLatestAssistantResponse(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageKt;->isAssistant(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    return-object v0
.end method

.method public static final replaceLatestResponse(Lcom/whoop/bot/models/conversation/AiChatConversation;Lcom/whoop/bot/models/conversation/AiChatMessage;)Lcom/whoop/bot/models/conversation/AiChatConversation;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageKt;->isAssistant(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-ne v0, v2, :cond_2

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/16 v10, 0x7d

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v11}, Lcom/whoop/bot/models/conversation/AiChatConversation;->copy$default(Lcom/whoop/bot/models/conversation/AiChatConversation;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object p0

    return-object p0
.end method
