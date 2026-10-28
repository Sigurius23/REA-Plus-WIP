.class public final Lvg0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvg0/r;",
        "Lvg0/t;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lvg0/s;",
        "Lod1/g;",
        "Lvg0/r;",
        "Lvg0/t;",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V",
        "action",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "f",
        "(Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "b",
        "Ltr2/n;",
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
.field private final a:Lcom/whoop/ai/chat/api/AiChatApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvg0/s;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    .line 3
    iput-object p2, p0, Lvg0/s;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "CreateTurnInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvg0/s;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lvg0/s;)Lcom/whoop/ai/chat/api/AiChatApi;
    .locals 0

    iget-object p0, p0, Lvg0/s;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    return-object p0
.end method

.method public static final synthetic d(Lvg0/s;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvg0/s;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lvg0/s;Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;
    .locals 0

    invoke-direct {p0, p1}, Lvg0/s;->f(Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;
    .locals 13

    const-string v0, "toString(...)"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {v2}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v3

    invoke-virtual {p1}, Lvg0/r;->a()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_1

    new-instance v6, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;

    invoke-direct {v6, v4}, Lcom/whoop/ai/chat/models/ChatAttachmentCarouselModel;-><init>(Ljava/util/List;)V

    invoke-virtual {v3, v6}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Lvg0/r;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    move-object v7, p1

    goto :goto_1

    :cond_2
    move-object v7, v5

    :goto_1
    if-eqz v7, :cond_3

    new-instance v6, Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;-><init>(Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-instance v3, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-direct {v3, v1, v2, p1}, Lcom/whoop/ai/chat/models/AIMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    new-instance v4, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v12}, Lcom/whoop/ai/chat/models/AITurn;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvg0/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvg0/s$a;-><init>(Lq83/d;Lvg0/s;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
