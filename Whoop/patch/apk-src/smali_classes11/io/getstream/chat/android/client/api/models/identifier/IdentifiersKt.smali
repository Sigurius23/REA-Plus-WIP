.class public final Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0008H\u0000\u001aN\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0012H\u0000\u001a\"\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\"\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a$\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0000\u001a \u0010 \u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020#H\u0000\u001a\u0010\u0010$\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020#H\u0000\u001a\u0018\u0010%\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001bH\u0000\u001a\u0010\u0010\'\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a*\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0010\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,H\u0000\u001a \u0010-\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001bH\u0000\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a\u0008\u00100\u001a\u00020\u0001H\u0000\u001a\u0018\u00101\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a \u00102\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0000\u001a\u0008\u00103\u001a\u00020\u0001H\u0000\u001a\u0010\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u000206H\u0000\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00105\u001a\u000206H\u0000\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020:H\u0000\u00a8\u0006;"
    }
    d2 = {
        "QueryChannelIdentifier",
        "",
        "channelType",
        "",
        "channelId",
        "request",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "QueryChannelsIdentifier",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "QueryMembersIdentifier",
        "offset",
        "limit",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "",
        "DeleteReactionIdentifier",
        "messageId",
        "reactionType",
        "cid",
        "SendReactionIdentifier",
        "reaction",
        "Lio/getstream/chat/android/models/Reaction;",
        "enforceUnique",
        "",
        "GetRepliesIdentifier",
        "getNewerRepliesIdentifier",
        "parentId",
        "lastId",
        "GetRepliesMoreIdentifier",
        "firstId",
        "SendGiphyIdentifier",
        "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
        "ShuffleGiphyIdentifier",
        "DeleteMessageIdentifier",
        "hard",
        "DeleteMessageForMeIdentifier",
        "SendEventIdentifier",
        "eventType",
        "UpdateMessageIdentifier",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "HideChannelIdentifier",
        "clearHistory",
        "GetMessageIdentifier",
        "MarkAllReadIdentifier",
        "MarkReadIdentifier",
        "SendMessageIdentifier",
        "GetDevicesIdentifier",
        "AddDeviceIdentifier",
        "device",
        "Lio/getstream/chat/android/models/Device;",
        "DeleteDeviceIdentifier",
        "ConnectUserIdentifier",
        "user",
        "Lio/getstream/chat/android/models/User;",
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
.method public static final AddDeviceIdentifier(Lio/getstream/chat/android/models/Device;)I
    .locals 1

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4587e0a9

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Device;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final ConnectUserIdentifier(Lio/getstream/chat/android/models/User;)I
    .locals 1

    const-string v0, "user"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    const v0, 0x7b537aeb

    add-int/2addr p0, v0

    return p0
.end method

.method public static final DeleteDeviceIdentifier(Lio/getstream/chat/android/models/Device;)I
    .locals 1

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7f9cb7e1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Device;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final DeleteMessageForMeIdentifier(Ljava/lang/String;)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3ab2b545

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final DeleteMessageIdentifier(Ljava/lang/String;Z)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2e5ddbc4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x1f

    invoke-static {p1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final DeleteReactionIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4fbd1294

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p0, p1

    return p0
.end method

.method public static final GetDevicesIdentifier()I
    .locals 1

    const v0, 0x1197c4c7

    return v0
.end method

.method public static final GetMessageIdentifier(Ljava/lang/String;)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3c4719d1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final GetRepliesIdentifier(Ljava/lang/String;I)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3a5ecab2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x1f

    invoke-static {p1}, Ljava/lang/Integer;->hashCode(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final GetRepliesMoreIdentifier(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    const-string v0, "messageId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xbb1d79

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-static {p2}, Ljava/lang/Integer;->hashCode(I)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final HideChannelIdentifier(Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 1

    const-string v0, "channelType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7f4da921

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-static {p2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final MarkAllReadIdentifier()I
    .locals 1

    const v0, -0x8f208d6

    return v0
.end method

.method public static final MarkReadIdentifier(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "channelType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3eb73a3d

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x1f

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final QueryChannelIdentifier(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)I
    .locals 1

    const-string v0, "channelType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xfd477db

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final QueryChannelsIdentifier(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)I
    .locals 1

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x15458a68

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final QueryMembersIdentifier(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)I"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7411becf

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-static {p2, p0, v0}, Ld;->b(III)I

    move-result p0

    invoke-static {p3, p0, v0}, Ld;->b(III)I

    move-result p0

    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    mul-int/2addr p1, v0

    invoke-virtual {p5}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, v0

    invoke-virtual {p6}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static synthetic QueryMembersIdentifier$default(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;ILjava/lang/Object;)I
    .locals 7

    and-int/lit8 p7, p7, 0x40

    if-eqz p7, :cond_0

    sget-object p6, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->QueryMembersIdentifier(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)I

    move-result p0

    return p0
.end method

.method public static final SendEventIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "eventType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7becb26e

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-static {p0, v0, p2}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p0, p1

    return p0
.end method

.method public static final SendGiphyIdentifier(Lio/getstream/chat/android/client/api/models/SendActionRequest;)I
    .locals 1

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7ea41c49

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/SendActionRequest;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final SendMessageIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const-string v0, "channelType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x76c80a1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Ld;->d(IILjava/lang/String;)I

    move-result p0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final SendReactionIdentifier(Lio/getstream/chat/android/models/Reaction;ZLjava/lang/String;)I
    .locals 1

    const-string v0, "reaction"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6f71bd1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p0, v0, p1}, Lb9/y;->b(IIZ)I

    move-result p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p0, p1

    return p0
.end method

.method public static final ShuffleGiphyIdentifier(Lio/getstream/chat/android/client/api/models/SendActionRequest;)I
    .locals 1

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1aabceba

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/SendActionRequest;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final UpdateMessageIdentifier(Lio/getstream/chat/android/models/Message;)I
    .locals 1

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x23666f1e

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static final getNewerRepliesIdentifier(Ljava/lang/String;ILjava/lang/String;)I
    .locals 1

    const-string v0, "parentId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5019d26a

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    const/16 v0, 0x1f

    mul-int/2addr p0, v0

    invoke-static {p1, p0, v0}, Ld;->b(III)I

    move-result p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p0, p1

    return p0
.end method

.method public static synthetic getNewerRepliesIdentifier$default(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->getNewerRepliesIdentifier(Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0
.end method
