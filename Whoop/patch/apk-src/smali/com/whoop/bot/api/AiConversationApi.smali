.class public interface abstract Lcom/whoop/bot/api/AiConversationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ.\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0001\u0010\n\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\n\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/bot/api/AiConversationApi;",
        "",
        "",
        "messageId",
        "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
        "aiMessageFeedback",
        "Lpg3/v0;",
        "Ll83/a0;",
        "postFeedback",
        "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lq83/d;)Ljava/lang/Object;",
        "conversationId",
        "actionId",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "postMxmCreateTicket",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/bot/models/history/ConversationHistory;",
        "getHistory",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/bot/models/conversation/AiChatConversation;",
        "getPastConversation",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deletePastConversation",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract deletePastConversation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "conversationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "ai-conversation-service/v1/conversations/{conversationId}"
    .end annotation
.end method

.method public abstract getHistory(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/models/history/ConversationHistory;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-service/v1/conversations"
    .end annotation
.end method

.method public abstract getPastConversation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "conversationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/models/conversation/AiChatConversation;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-service/v2/conversation/{conversationId}"
    .end annotation
.end method

.method public abstract postFeedback(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "messageId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/bot/models/feedback/AiMessageFeedback;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-service/v1/messages/{messageId}/feedback"
    .end annotation
.end method

.method public abstract postMxmCreateTicket(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "conversationId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "messageId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "actionId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-service/v1/conversation/{conversationId}/message/{messageId}/action/{actionId}"
    .end annotation
.end method
