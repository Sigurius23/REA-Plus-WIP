.class public final Lug0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u001d0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lug0/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "",
        "b",
        "(Lcom/whoop/ai/chat/models/AITurn;)Z",
        "",
        "turnId",
        "isVisible",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Z)V",
        "c",
        "(Z)V",
        "fingerprint",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "Ltg0/b;",
        "result",
        "",
        "e",
        "(Ltg0/b;)Ljava/util/List;",
        "",
        "Ljava/util/Set;",
        "visibleTurnIds",
        "Z",
        "isReadingVisible",
        "Ll83/k;",
        "reported",
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
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ll83/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lug0/e;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lug0/e;->c:Ljava/util/Set;

    return-void
.end method

.method private final b(Lcom/whoop/ai/chat/models/AITurn;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/models/AIMessage;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lxg0/a;->b(Lcom/whoop/ai/chat/models/AIMessage;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v0

    sget-object v2, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-eq v0, v2, :cond_0

    invoke-virtual {p1}, Lcom/whoop/ai/chat/models/AITurn;->getTurnStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object p1

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne p1, v0, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "fingerprint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lug0/e;->c:Ljava/util/Set;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lug0/e;->b:Z

    return-void
.end method

.method public final d(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "turnId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Lug0/e;->a:Ljava/util/Set;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object p2, p0, Lug0/e;->a:Ljava/util/Set;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e(Ltg0/b;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg0/b;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lug0/e;->b:Z

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ltg0/b;->e()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/AIConversation;->getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->getFingerprint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/AIConversation;->getTurns()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/AIConversation;->getTurns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/ai/chat/models/AITurn;

    iget-object v6, p0, Lug0/e;->a:Ljava/util/Set;

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-direct {p0, v5}, Lug0/e;->b(Lcom/whoop/ai/chat/models/AITurn;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Ltg0/b;->q()Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_4
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v1, v3}, Lug0/e;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    return-object v0
.end method
