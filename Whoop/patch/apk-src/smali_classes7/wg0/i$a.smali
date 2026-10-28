.class public final Lwg0/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0019\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lwg0/i$a;",
        "",
        "<init>",
        "()V",
        "",
        "messageId",
        "",
        "itemIndex",
        "e",
        "(Ljava/lang/String;I)Ljava/lang/String;",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "",
        "Lwg0/a;",
        "c",
        "(Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;",
        "turn",
        "Lwg0/c;",
        "granularity",
        "charsPerStep",
        "Lwg0/i;",
        "d",
        "(Lcom/whoop/ai/chat/models/AITurn;Lwg0/c;I)Lwg0/i;",
        "WORD_BY_WORD_LIMIT",
        "I",
        "CHAR_BACKLOG_DIVISOR",
        "CHAR_MAX_PER_STEP",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwg0/i$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lwg0/i$a;Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lwg0/i$a;->c(Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lwg0/i$a;Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwg0/i$a;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ")",
            "Ljava/util/List<",
            "Lwg0/a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/ai/chat/models/AITurn;->getMessages()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-static {v2}, Lxg0/a;->b(Lcom/whoop/ai/chat/models/AIMessage;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/ai/chat/models/AIMessage;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIMessage;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    move-object v4, v2

    check-cast v4, Lm83/d0;

    iget-object v5, v4, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lm83/c0;

    iget-object v5, v5, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v5, v5, Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    if-eqz v5, :cond_2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm83/c0;

    iget v5, v4, Lm83/c0;->a:I

    iget-object v4, v4, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    new-instance v6, Lwg0/a;

    sget-object v7, Lwg0/i;->f:Lwg0/i$a;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIMessage;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v5}, Lwg0/i$a;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/AIMessage;->getId()Ljava/lang/String;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type com.whoop.ai.chat.models.MarkdownTextWidget"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-direct {v6, v7, v8, v5, v4}, Lwg0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/ai/chat/models/MarkdownTextWidget;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {p1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_5
    return-object p1
.end method

.method private final e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    const-string v0, "-"

    invoke-static {p2, p1, v0}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final d(Lcom/whoop/ai/chat/models/AITurn;Lwg0/c;I)Lwg0/i;
    .locals 9

    const-string v0, "turn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "granularity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwg0/i;

    const/4 v7, 0x4

    const/4 v8, 0x0

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v8}, Lwg0/i;-><init>(Lcom/whoop/ai/chat/models/AITurn;Ljava/util/List;ILwg0/c;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lwg0/i;->e(Lcom/whoop/ai/chat/models/AITurn;)Lwg0/i;

    move-result-object p1

    return-object p1
.end method
