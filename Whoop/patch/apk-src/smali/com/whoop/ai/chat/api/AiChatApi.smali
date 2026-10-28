.class public interface abstract Lcom/whoop/ai/chat/api/AiChatApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J*\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J*\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J4\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J*\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u000bJ*\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0004\u0008 \u0010!J*\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00042\u0008\u0008\u0001\u0010#\u001a\u00020\"2\u0008\u0008\u0001\u0010$\u001a\u00020\"H\u00a7@\u00a2\u0006\u0004\u0008%\u0010&J \u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\'\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008(\u0010\u0007J*\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008)\u0010\u000bJ \u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008*\u0010\u0007J*\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008+\u0010\u000bJ4\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u0010-\u001a\u00020,H\u00a7@\u00a2\u0006\u0004\u0008.\u0010/J \u00101\u001a\u0008\u0012\u0004\u0012\u0002000\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u00081\u0010\u0007J4\u00103\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0001\u00102\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u00083\u00104J4\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u00105\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u000206H\u00a7@\u00a2\u0006\u0004\u00087\u00108J\u0016\u0010:\u001a\u0008\u0012\u0004\u0012\u0002090\u0004H\u00a7@\u00a2\u0006\u0004\u0008:\u0010;J \u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008<\u0010\u0007J2\u0010@\u001a\u00020?2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010=\u001a\u0004\u0018\u00010\u00022\n\u0008\u0001\u0010>\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008@\u00104\u00a8\u0006A\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "",
        "",
        "fingerprint",
        "Lpg3/v0;",
        "Lcom/whoop/ai/chat/models/AIConversation;",
        "getConversation",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "turnId",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "getConversationTurn",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;",
        "body",
        "createConversation",
        "(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;",
        "startNewConversation",
        "(Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;",
        "createConversationTurn",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;",
        "Ll83/a0;",
        "markTurnAsSeen",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;Lq83/d;)Ljava/lang/Object;",
        "markTurnEndSeen",
        "Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;",
        "markLastViewedTurn",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;",
        "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;",
        "uploadImage",
        "(Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lud3/i0;",
        "metadata",
        "files",
        "uploadFile",
        "(Lud3/i0;Lud3/i0;Lq83/d;)Ljava/lang/Object;",
        "fileId",
        "deleteFile",
        "stopConversationTurn",
        "stopAllTurns",
        "dismissConversationTurn",
        "Lcom/whoop/ai/chat/api/TurnFeedbackBody;",
        "feedback",
        "submitTurnFeedback",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/TurnFeedbackBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/api/AiSuggestionsResponse;",
        "getSuggestions",
        "actionId",
        "createMxmSupportTicket",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "recommendationId",
        "Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;",
        "commitRecommendation",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;",
        "getConversations",
        "(Lq83/d;)Ljava/lang/Object;",
        "deleteConversation",
        "sourceId",
        "sourceType",
        "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
        "getConversationMetadata",
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
.method public abstract commitRecommendation(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "recommendationId"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/recommendation/{recommendationId}"
    .end annotation
.end method

.method public abstract createConversation(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation"
    .end annotation
.end method

.method public abstract createConversationTurn(Ljava/lang/String;Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn"
    .end annotation
.end method

.method public abstract createMxmSupportTicket(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "action_id"
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
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/action/{action_id}"
    .end annotation
.end method

.method public abstract deleteConversation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
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
        value = "ai-conversation-bff/v1/conversation/{fingerprint}"
    .end annotation
.end method

.method public abstract deleteFile(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fileId"
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
        value = "ai-conversation-bff/v1/files/{fileId}"
    .end annotation
.end method

.method public abstract dismissConversationTurn(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/dismiss"
    .end annotation
.end method

.method public abstract getConversation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "fingerprint"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-bff/v1/conversation"
    .end annotation
.end method

.method public abstract getConversationMetadata(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "sourceId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "sourceType"
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
            "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/metadata"
    .end annotation
.end method

.method public abstract getConversationTurn(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turnId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turnId}"
    .end annotation
.end method

.method public abstract getConversations(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AiChatHistoryResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-bff/v1/conversations"
    .end annotation
.end method

.method public abstract getSuggestions(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/api/AiSuggestionsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/suggestions"
    .end annotation
.end method

.method public abstract markLastViewedTurn(Ljava/lang/String;Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/api/LastViewedTurnRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/last-viewed-turn"
    .end annotation
.end method

.method public abstract markTurnAsSeen(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/api/MarkTurnAsSeenRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/seen"
    .end annotation
.end method

.method public abstract markTurnEndSeen(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/end-seen"
    .end annotation
.end method

.method public abstract startNewConversation(Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/no-fingerprint"
    .end annotation
.end method

.method public abstract stopAllTurns(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
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

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/stop"
    .end annotation
.end method

.method public abstract stopConversationTurn(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/stop"
    .end annotation
.end method

.method public abstract submitTurnFeedback(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/api/TurnFeedbackBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "fingerprint"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "turn_id"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/ai/chat/api/TurnFeedbackBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/api/TurnFeedbackBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/conversation/{fingerprint}/turn/{turn_id}/feedback"
    .end annotation
.end method

.method public abstract uploadFile(Lud3/i0;Lud3/i0;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # Lud3/i0;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/i0;",
            "Lud3/i0;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v2/files"
    .end annotation
.end method

.method public abstract uploadImage(Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ai-conversation-bff/v1/files"
    .end annotation
.end method
