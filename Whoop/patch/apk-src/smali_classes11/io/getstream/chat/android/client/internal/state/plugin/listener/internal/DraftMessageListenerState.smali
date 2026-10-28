.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J6\u0010\u000e\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJF\u0010\u001a\u001a\u00020\r2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0016\u001a\u0004\u0018\u00010\t2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "result",
        "",
        "channelType",
        "channelId",
        "message",
        "Ll83/a0;",
        "onCreateDraftMessageResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "onDeleteDraftMessagesResult",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "",
        "limit",
        "next",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/DraftsSort;",
        "sort",
        "onQueryDraftMessagesResult",
        "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V
    .locals 1

    const-string v0, "mutableGlobalState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-void
.end method

.method public static final synthetic access$getMutableGlobalState$p(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;)Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-object p0
.end method


# virtual methods
.method public final onCreateDraftMessageResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p5, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_0

    :cond_0
    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_4

    :goto_0
    if-nez p2, :cond_3

    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_2

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    if-eqz p4, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p1, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onDeleteDraftMessagesResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    move-object p3, p1

    check-cast p3, Ln23/g;

    iget-object p3, p3, Ln23/g;->a:Ljava/lang/Object;

    check-cast p3, Ll83/a0;

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->removeDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_0

    :cond_0
    instance-of p3, p1, Ln23/f;

    if-eqz p3, :cond_4

    :goto_0
    if-nez p2, :cond_3

    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_2

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    if-eqz p4, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p1, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->removeDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onQueryDraftMessagesResult(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/QueryDraftsResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/QueryDraftsResult;->getDrafts()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/DraftMessage;

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_2

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
