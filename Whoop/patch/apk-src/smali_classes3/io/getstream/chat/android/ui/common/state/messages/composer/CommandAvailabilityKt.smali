.class public final Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\"\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006*\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "isAvailableFor",
        "",
        "Lio/getstream/chat/android/models/Command;",
        "action",
        "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
        "sortedByAvailability",
        "",
        "MODERATION_COMMAND_SET",
        "",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final MODERATION_COMMAND_SET:Ljava/lang/String; = "moderation_set"


# direct methods
.method public static final isAvailableFor(Lio/getstream/chat/android/models/Command;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Z
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Command;->getSet()Ljava/lang/String;

    move-result-object p0

    const-string p1, "moderation_set"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    return v1

    :cond_2
    return v0
.end method

.method public static final sortedByAvailability(Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;",
            "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$compareByDescending$1;-><init>(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V

    new-instance p1, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$thenByDescending$1;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/common/state/messages/composer/CommandAvailabilityKt$sortedByAvailability$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    invoke-static {p0, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
