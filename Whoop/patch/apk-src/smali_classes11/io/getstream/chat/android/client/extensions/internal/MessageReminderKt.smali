.class public final Lio/getstream/chat/android/client/extensions/internal/MessageReminderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "toMessageReminderInfo",
        "Lio/getstream/chat/android/models/MessageReminderInfo;",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "stream-chat-android-client_release"
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
.method public static final toMessageReminderInfo(Lio/getstream/chat/android/models/MessageReminder;)Lio/getstream/chat/android/models/MessageReminderInfo;
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/MessageReminderInfo;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminder;->getRemindAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminder;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminder;->getUpdatedAt()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/models/MessageReminderInfo;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method
