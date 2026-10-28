.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008#\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0003J\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003Jc\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000f\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;",
        "",
        "nameChanged",
        "",
        "avatarViewChanged",
        "usersChanged",
        "lastMessageChanged",
        "readStateChanged",
        "unreadCountChanged",
        "extraDataChanged",
        "typingUsersChanged",
        "draftMessageChanged",
        "<init>",
        "(ZZZZZZZZZ)V",
        "getNameChanged",
        "()Z",
        "getAvatarViewChanged",
        "getUsersChanged",
        "getLastMessageChanged",
        "getReadStateChanged",
        "getUnreadCountChanged",
        "getExtraDataChanged",
        "getTypingUsersChanged",
        "getDraftMessageChanged",
        "hasDifference",
        "plus",
        "other",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-ui-components_release"
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
.field private final avatarViewChanged:Z

.field private final draftMessageChanged:Z

.field private final extraDataChanged:Z

.field private final lastMessageChanged:Z

.field private final nameChanged:Z

.field private final readStateChanged:Z

.field private final typingUsersChanged:Z

.field private final unreadCountChanged:Z

.field private final usersChanged:Z


# direct methods
.method public constructor <init>(ZZZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    iput-boolean p5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    iput-boolean p6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    iput-boolean p7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    iput-boolean p8, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    iput-boolean p9, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    return-void
.end method

.method public static copy$default(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;ZZZZZZZZZILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-boolean p5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-boolean p7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    :cond_8
    move p11, p9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move p10, p8

    move p8, p6

    move p6, p4

    move p4, p2

    new-instance p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move p9, p7

    move p7, p5

    move p5, p3

    move p3, p1

    invoke-direct/range {p2 .. p11}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    return-object p2
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    return v0
.end method

.method public final copy(ZZZZZZZZZ)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
    .locals 10

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAvatarViewChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    return v0
.end method

.method public final getDraftMessageChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    return v0
.end method

.method public final getExtraDataChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    return v0
.end method

.method public final getLastMessageChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    return v0
.end method

.method public final getNameChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    return v0
.end method

.method public final getReadStateChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    return v0
.end method

.method public final getTypingUsersChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    return v0
.end method

.method public final getUnreadCountChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    return v0
.end method

.method public final getUsersChanged()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    return v0
.end method

.method public final hasDifference()Z
    .locals 2

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    or-int/2addr v0, v1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    or-int/2addr v0, v1

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final plus(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
    .locals 13

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v1

    :goto_1
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v5, v2

    goto :goto_3

    :cond_3
    :goto_2
    move v5, v1

    :goto_3
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    if-nez v0, :cond_5

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move v6, v2

    goto :goto_5

    :cond_5
    :goto_4
    move v6, v1

    :goto_5
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    if-nez v0, :cond_7

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    if-eqz v0, :cond_6

    goto :goto_6

    :cond_6
    move v7, v2

    goto :goto_7

    :cond_7
    :goto_6
    move v7, v1

    :goto_7
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    if-nez v0, :cond_9

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move v8, v2

    goto :goto_9

    :cond_9
    :goto_8
    move v8, v1

    :goto_9
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    if-nez v0, :cond_b

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    if-eqz v0, :cond_a

    goto :goto_a

    :cond_a
    move v9, v2

    goto :goto_b

    :cond_b
    :goto_a
    move v9, v1

    :goto_b
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    if-nez v0, :cond_d

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    if-eqz v0, :cond_c

    goto :goto_c

    :cond_c
    move v10, v2

    goto :goto_d

    :cond_d
    :goto_c
    move v10, v1

    :goto_d
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    if-nez v0, :cond_f

    iget-boolean v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    if-eqz v0, :cond_e

    goto :goto_e

    :cond_e
    move v11, v2

    goto :goto_f

    :cond_f
    :goto_e
    move v11, v1

    :goto_f
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    if-nez v0, :cond_11

    iget-boolean p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    if-eqz p1, :cond_10

    goto :goto_10

    :cond_10
    move v12, v2

    goto :goto_11

    :cond_11
    :goto_10
    move v12, v1

    :goto_11
    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    invoke-direct/range {v3 .. v12}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->nameChanged:Z

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->avatarViewChanged:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->usersChanged:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->lastMessageChanged:Z

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->readStateChanged:Z

    iget-boolean v5, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->unreadCountChanged:Z

    iget-boolean v6, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->extraDataChanged:Z

    iget-boolean v7, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->typingUsersChanged:Z

    iget-boolean v8, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->draftMessageChanged:Z

    const-string v9, ", avatarViewChanged="

    const-string v10, ", usersChanged="

    const-string v11, "ChannelListPayloadDiff(nameChanged="

    invoke-static {v11, v9, v10, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastMessageChanged="

    const-string v9, ", readStateChanged="

    invoke-static {v0, v2, v1, v3, v9}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", unreadCountChanged="

    const-string v2, ", extraDataChanged="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", typingUsersChanged="

    const-string v2, ", draftMessageChanged="

    invoke-static {v0, v6, v1, v7, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
