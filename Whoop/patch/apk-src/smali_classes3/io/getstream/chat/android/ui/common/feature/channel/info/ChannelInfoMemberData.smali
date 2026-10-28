.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u00c6\u0003JI\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\tH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u000cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;",
        "",
        "channelData",
        "Lio/getstream/chat/android/models/ChannelData;",
        "member",
        "Lio/getstream/chat/android/models/Member;",
        "distinctChannel",
        "Lio/getstream/chat/android/models/Channel;",
        "mutedUsers",
        "",
        "Lio/getstream/chat/android/models/Mute;",
        "blockedUserIds",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V",
        "getChannelData",
        "()Lio/getstream/chat/android/models/ChannelData;",
        "getMember",
        "()Lio/getstream/chat/android/models/Member;",
        "getDistinctChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getMutedUsers",
        "()Ljava/util/List;",
        "getBlockedUserIds",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "stream-chat-android-ui-common_release"
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
.field private final blockedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final channelData:Lio/getstream/chat/android/models/ChannelData;

.field private final distinctChannel:Lio/getstream/chat/android/models/Channel;

.field private final member:Lio/getstream/chat/android/models/Member;

.field private final mutedUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Lio/getstream/chat/android/models/Member;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "member"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutedUsers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->copy(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/ChannelData;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Lio/getstream/chat/android/models/Member;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;"
        }
    .end annotation

    const-string v0, "channelData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "member"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutedUsers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockedUserIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBlockedUserIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    return-object v0
.end method

.method public final getChannelData()Lio/getstream/chat/android/models/ChannelData;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    return-object v0
.end method

.method public final getDistinctChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getMember()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final getMutedUsers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelData;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->channelData:Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->member:Lio/getstream/chat/android/models/Member;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->distinctChannel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->mutedUsers:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;->blockedUserIds:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ChannelInfoMemberData(channelData="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", member="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", distinctChannel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mutedUsers="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", blockedUserIds="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
