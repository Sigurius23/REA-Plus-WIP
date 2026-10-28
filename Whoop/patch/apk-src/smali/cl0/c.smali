.class public final Lcl0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcl0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcl0/c;",
        "",
        "Lcl0/b;",
        "activeResponsePollingInteractor",
        "Lxk0/a;",
        "analyticsHelper",
        "<init>",
        "(Lcl0/b;Lxk0/a;)V",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "latestResponse",
        "Lcom/whoop/bot/models/conversation/AiChatConversation;",
        "conversation",
        "Lec3/l;",
        "Lfl0/c;",
        "c",
        "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/conversation/AiChatConversation;)Lec3/l;",
        "aiConversationResult",
        "b",
        "(Lfl0/c;)Lec3/l;",
        "a",
        "Lcl0/b;",
        "Lxk0/a;",
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


# instance fields
.field private final a:Lcl0/b;

.field private final b:Lxk0/a;


# direct methods
.method public constructor <init>(Lcl0/b;Lxk0/a;)V
    .locals 1

    const-string v0, "activeResponsePollingInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcl0/c;->a:Lcl0/b;

    iput-object p2, p0, Lcl0/c;->b:Lxk0/a;

    return-void
.end method

.method public static final synthetic a(Lcl0/c;)Lxk0/a;
    .locals 0

    iget-object p0, p0, Lcl0/c;->b:Lxk0/a;

    return-object p0
.end method

.method private final c(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/conversation/AiChatConversation;)Lec3/l;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            "Lcom/whoop/bot/models/conversation/AiChatConversation;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v0

    sget-object v1, Lcl0/c$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcl0/c;->a:Lcl0/b;

    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    new-instance v0, Lcl0/c$b;

    invoke-direct {v0, p1, p2}, Lcl0/c$b;-><init>(Lec3/l;Lcom/whoop/bot/models/conversation/AiChatConversation;)V

    new-instance p1, Lcl0/c$c;

    invoke-direct {p1, v0, p0}, Lcl0/c$c;-><init>(Lec3/l;Lcl0/c;)V

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lfl0/c;

    sget-object v2, Lfl0/j;->STOPPED:Lfl0/j;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v8}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v0, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_2
    move-object v2, p2

    new-instance v1, Lfl0/c;

    sget-object v3, Lfl0/j;->FLAGGED:Lfl0/j;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_3
    move-object v2, p2

    new-instance v1, Lfl0/c;

    sget-object v3, Lfl0/j;->ERROR:Lfl0/j;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_4
    move-object v2, p2

    new-instance v1, Lfl0/c;

    sget-object v3, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final b(Lfl0/c;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/c;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "aiConversationResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lfl0/c;->d()Lfl0/j;

    move-result-object v0

    sget-object v1, Lcl0/c$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lfl0/c;->a()Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/bot/models/conversation/AiChatConversationKt;->getLatestAssistantResponse(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lfl0/c;->a()Lcom/whoop/bot/models/conversation/AiChatConversation;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcl0/c;->c(Lcom/whoop/bot/models/conversation/AiChatMessage;Lcom/whoop/bot/models/conversation/AiChatConversation;)Lec3/l;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :cond_4
    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
