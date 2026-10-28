.class public abstract Lpl0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "message",
        "",
        "f",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z",
        "e",
        "Lcom/whoop/bot/models/conversation/AiChatConversation;",
        "conversation",
        "h",
        "(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z",
        "",
        "index",
        "g",
        "(ILcom/whoop/bot/models/conversation/AiChatConversation;)Z",
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
.method public static final synthetic a(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z
    .locals 0

    invoke-static {p0}, Lpl0/e;->e(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z
    .locals 0

    invoke-static {p0}, Lpl0/e;->f(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(ILcom/whoop/bot/models/conversation/AiChatConversation;)Z
    .locals 0

    invoke-static {p0, p1}, Lpl0/e;->g(ILcom/whoop/bot/models/conversation/AiChatConversation;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z
    .locals 0

    invoke-static {p0}, Lpl0/e;->h(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z

    move-result p0

    return p0
.end method

.method private static final e(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object p0

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final f(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v0

    sget-object v1, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getContent()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final g(ILcom/whoop/bot/models/conversation/AiChatConversation;)Z
    .locals 0

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final h(Lcom/whoop/bot/models/conversation/AiChatConversation;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getMessages()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v2}, Lcom/whoop/bot/models/conversation/AiChatMessageKt;->isAssistant(Lcom/whoop/bot/models/conversation/AiChatMessage;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v1

    :cond_2
    sget-object p0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne v1, p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
