.class public final Lcom/whoop/bot/models/conversation/ConversationRequestsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u000c\u0010\u0006\u001a\u00020\u0007*\u00020\u0008H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "SERVICE",
        "",
        "VERSION_1",
        "PATH",
        "VERSION_2",
        "PATH_V2",
        "toChatMessage",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
        "TIMEOUT_CONVERSATION_REQUEST",
        "",
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


# static fields
.field public static final PATH:Ljava/lang/String; = "ai-conversation-service/v1"

.field public static final PATH_V2:Ljava/lang/String; = "ai-conversation-service/v2"

.field public static final SERVICE:Ljava/lang/String; = "ai-conversation-service"

.field private static final TIMEOUT_CONVERSATION_REQUEST:J = 0x1d4c0L

.field public static final VERSION_1:Ljava/lang/String; = "v1"

.field public static final VERSION_2:Ljava/lang/String; = "v2"


# direct methods
.method public static final toChatMessage(Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->getRole()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;->isSuggestion()Z

    move-result v0

    new-instance v1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/16 v14, 0xf72

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/whoop/bot/models/conversation/AiChatMessage;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
