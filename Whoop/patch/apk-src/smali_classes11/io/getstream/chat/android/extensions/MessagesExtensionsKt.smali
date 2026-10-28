.class public final Lio/getstream/chat/android/extensions/MessagesExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "lastMessageAt",
        "Ljava/util/Date;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "skipLastMsgUpdateForSystemMsgs",
        "",
        "stream-chat-android-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final lastMessageAt(Ljava/util/List;Z)Ljava/util/Date;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z)",
            "Ljava/util/Date;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "system"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_6

    move-object p1, v0

    goto :goto_3

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v6

    if-nez v6, :cond_9

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v6

    if-nez v6, :cond_9

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v3, v4}, Ljava/util/Date;-><init>(J)V

    :cond_9
    invoke-interface {v2, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_a

    move-object p1, v1

    move-object v2, v6

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_8

    :goto_3
    check-cast p1, Lio/getstream/chat/android/models/Message;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object p0

    if-nez p0, :cond_b

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object p0

    :cond_b
    return-object p0

    :cond_c
    return-object v0
.end method
