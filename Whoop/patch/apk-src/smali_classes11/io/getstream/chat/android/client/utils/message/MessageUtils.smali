.class public final Lio/getstream/chat/android/client/utils/message/MessageUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\u0008\u001a\u00020\u0005*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\n\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\t\u001a\'\u0010\u000f\u001a\u00020\u0005*\u00020\u00012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u0005*\u00020\u00012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0010\u001a\u0011\u0010\u0012\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\t\u001a\u0011\u0010\u0013\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\t\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\t\u001a\u0011\u0010\u0015\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\t\u001a\u0011\u0010\u0016\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\t\u001a\u0011\u0010\u0017\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\t\u001a\u0011\u0010\u0018\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\t\u001a\u0011\u0010\u0019\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\t\u001a\u0011\u0010\u001a\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\t\u001a\u0011\u0010\u001b\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\t\u001a\u0011\u0010\u001c\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\t\u001a\u0011\u0010\u001d\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\t\u001a\u0011\u0010\u001e\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\t\u001a\u0011\u0010\u001f\u001a\u00020\u0005*\u00020\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\t\u001a\u001d\u0010\"\u001a\u00020\u0005*\u00020\u00012\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0007\u00a2\u0006\u0004\u0008\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008$\u0010\t\u001a\u0013\u0010%\u001a\u00020\u0005*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008%\u0010\t\u001a\u0013\u0010&\u001a\u00020\u0005*\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008&\u0010\t\u001a\u001b\u0010\'\u001a\u00020\u0005*\u00020\u00012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\'\u0010#\u001a#\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(*\u00020\u00012\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0007\u00a2\u0006\u0004\u0008*\u0010+\u001a\u0013\u0010,\u001a\u00020\u0001*\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008,\u0010-\u001a\u0013\u0010,\u001a\u00020.*\u00020.H\u0000\u00a2\u0006\u0004\u0008,\u0010/\u001a\u000f\u00100\u001a\u00020 H\u0000\u00a2\u0006\u0004\u00080\u00101\u001a\u0013\u00102\u001a\u00020\u0005*\u00020\u0001H\u0000\u00a2\u0006\u0004\u00082\u0010\t\"\u0014\u00104\u001a\u0002038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00084\u00105\" \u00108\u001a\u0008\u0012\u0004\u0012\u000207068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\" \u0010<\u001a\u0008\u0012\u0004\u0012\u00020 068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u00109\u001a\u0004\u0008=\u0010;\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006>"
    }
    d2 = {
        "",
        "Lio/getstream/chat/android/models/Message;",
        "latestOrNull",
        "(Ljava/util/List;)Lio/getstream/chat/android/models/Message;",
        "that",
        "",
        "createdAfter",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z",
        "isFailed",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "isErrorOrFailed",
        "isDeleted",
        "Lkotlin/Function0;",
        "",
        "now",
        "isPinned",
        "(Lio/getstream/chat/android/models/Message;Lc93/a;)Z",
        "isPinExpired",
        "isRegular",
        "isEphemeral",
        "isSystem",
        "isError",
        "isGiphy",
        "hasAudioRecording",
        "isPoll",
        "isPollClosed",
        "isGiphyEphemeral",
        "isThreadStart",
        "isThreadReply",
        "belongsToThread",
        "isReply",
        "hasSharedLocation",
        "",
        "currentUserId",
        "isMine",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z",
        "isModerationBounce",
        "isModerationBlock",
        "isModerationFlag",
        "isModerationError",
        "Ln23/h;",
        "Ll83/a0;",
        "shouldDeleteRemote",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ln23/h;",
        "ensureId",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/models/DraftMessage;",
        "fallbackMessageId",
        "()Ljava/lang/String;",
        "isLocalOnly",
        "",
        "ITEM_COUNT_OF_TWO",
        "I",
        "",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "LocalOnlySyncStatuses",
        "Ljava/util/Set;",
        "getLocalOnlySyncStatuses",
        "()Ljava/util/Set;",
        "LocalOnlyMessageTypes",
        "getLocalOnlyMessageTypes",
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


# static fields
.field private static final ITEM_COUNT_OF_TWO:I = 0x2

.field private static final LocalOnlyMessageTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final LocalOnlySyncStatuses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/models/SyncStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v3, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    filled-new-array {v0, v1, v2, v3}, [Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlySyncStatuses:Ljava/util/Set;

    const-string v0, "ephemeral"

    const-string v1, "error"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlyMessageTypes:Ljava/util/Set;

    return-void
.end method

.method public static final belongsToThread(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isThreadStart(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isThreadReply(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final createdAfter(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object p0

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->after(Ljava/util/Date;Ljava/util/Date;)Z

    move-result p0

    return p0
.end method

.method public static final ensureId(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/models/DraftMessage;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/DraftMessage;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->fallbackMessageId()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v2, v0

    const/16 v14, 0xffe

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Lio/getstream/chat/android/models/DraftMessage;->copy$default(Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v0

    return-object v0
.end method

.method public static final ensureId(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 53

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->fallbackMessageId()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v2, v0

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x2

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method public static final fallbackMessageId()Ljava/lang/String;
    .locals 2

    const-string v0, "toString(...)"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final getLocalOnlyMessageTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlyMessageTypes:Ljava/util/Set;

    return-object v0
.end method

.method public static final getLocalOnlySyncStatuses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/models/SyncStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlySyncStatuses:Ljava/util/Set;

    return-object v0
.end method

.method public static final hasAudioRecording(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v2, "voiceRecording"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static final hasSharedLocation(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSharedLocation()Lio/getstream/chat/android/models/Location;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isDeleted(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getDeletedForMe()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isEphemeral(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ephemeral"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isError(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isErrorOrFailed(Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isFailed(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isFailed(Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isGiphy(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object p0

    const-string v0, "giphy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isGiphyEphemeral(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isGiphy(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isLocalOnly(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlySyncStatuses:Ljava/util/Set;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/client/utils/message/MessageUtils;->LocalOnlyMessageTypes:Ljava/util/Set;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isMine(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isModerationBlock(Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getAction()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget-object v0, Lio/getstream/chat/android/models/MessageModerationAction;->Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;->getBlock()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isModerationBounce(Lio/getstream/chat/android/models/Message;)Z
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getAction()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lio/getstream/chat/android/models/MessageModerationAction;->Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;->getBounce()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getModeration()Lio/getstream/chat/android/models/Moderation;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getAction()Lio/getstream/chat/android/models/ModerationAction;

    move-result-object v1

    :cond_1
    sget-object p0, Lio/getstream/chat/android/models/ModerationAction;->Companion:Lio/getstream/chat/android/models/ModerationAction$Companion;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ModerationAction$Companion;->getBounce()Lio/getstream/chat/android/models/ModerationAction;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isMine(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationBounce(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isModerationFlag(Lio/getstream/chat/android/models/Message;)Z
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getAction()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lio/getstream/chat/android/models/MessageModerationAction;->Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;->getFlag()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getModeration()Lio/getstream/chat/android/models/Moderation;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getAction()Lio/getstream/chat/android/models/ModerationAction;

    move-result-object v1

    :cond_1
    sget-object p0, Lio/getstream/chat/android/models/ModerationAction;->Companion:Lio/getstream/chat/android/models/ModerationAction$Companion;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ModerationAction$Companion;->getFlag()Lio/getstream/chat/android/models/ModerationAction;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final isPinExpired(Lio/getstream/chat/android/models/Message;Lc93/a;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    cmp-long p0, v1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0
.end method

.method public static final isPinned(Lio/getstream/chat/android/models/Message;Lc93/a;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic isPinned$default(Lio/getstream/chat/android/models/Message;Lc93/a;ILjava/lang/Object;)Z
    .locals 2

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/utils/message/MessageUtils$isPinned$1;->INSTANCE:Lio/getstream/chat/android/client/utils/message/MessageUtils$isPinned$1;

    :cond_0
    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "now"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-gez p0, :cond_1

    goto :goto_0

    :cond_1
    return p3

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isPoll(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isPollClosed(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method public static final isRegular(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "regular"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isReply(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isSystem(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "system"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isThreadReply(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p0, v0

    :goto_1
    xor-int/2addr p0, v0

    return p0
.end method

.method public static final isThreadStart(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getThreadParticipants()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final latestOrNull(Ljava/util/List;)Lio/getstream/chat/android/models/Message;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/models/Message;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/Message;

    invoke-static {p0, v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->createdAfter(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    invoke-static {p0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/Message;

    return-object p0
.end method

.method public static final shouldDeleteRemote(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isModerationError(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ln23/d;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Message with failed moderation has been deleted locally: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lio/getstream/chat/android/client/errors/cause/MessageModerationDeletedException;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Ln23/f;

    invoke-direct {p0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p0

    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isError(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p0

    sget-object p1, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ln23/g;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_2
    :goto_0
    new-instance p0, Ln23/a;

    const-string p1, "Message is local-only, don\'t call DeleteMessage API"

    invoke-direct {p0, p1}, Ln23/a;-><init>(Ljava/lang/String;)V

    new-instance p1, Ln23/f;

    invoke-direct {p1, p0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method
