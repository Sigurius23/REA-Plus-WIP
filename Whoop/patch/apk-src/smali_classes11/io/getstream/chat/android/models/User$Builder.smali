.class public final Lio/getstream/chat/android/models/User$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/User;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0008J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0008J\u0015\u00102\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0008J\u0015\u00106\u001a\u00020\u00002\u0008\u0010\u0012\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u00103J\u0014\u00107\u001a\u00020\u00002\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0010\u00109\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010:\u001a\u00020\u00002\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010;\u001a\u00020\u00002\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0018J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001cJ\u0014\u0010?\u001a\u00020\u00002\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u0014J\u0014\u0010@\u001a\u00020\u00002\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014J\u001a\u0010A\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080#J\u0014\u0010B\u001a\u00020\u00002\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u0014J\u0014\u0010C\u001a\u00020\u00002\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020(J\u0010\u0010E\u001a\u00020\u00002\u0008\u0010*\u001a\u0004\u0018\u00010+J\u001a\u0010F\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010#J\u0010\u0010G\u001a\u00020\u00002\u0008\u0010-\u001a\u0004\u0018\u00010\u0018J\u0006\u0010H\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"
    }
    d2 = {
        "Lio/getstream/chat/android/models/User$Builder;",
        "",
        "<init>",
        "()V",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "(Lio/getstream/chat/android/models/User;)V",
        "id",
        "",
        "role",
        "name",
        "image",
        "invisible",
        "",
        "Ljava/lang/Boolean;",
        "privacySettings",
        "Lio/getstream/chat/android/PrivacySettings;",
        "language",
        "banned",
        "devices",
        "",
        "Lio/getstream/chat/android/models/Device;",
        "online",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "lastActive",
        "totalUnreadCount",
        "",
        "unreadChannels",
        "unreadThreads",
        "mutes",
        "Lio/getstream/chat/android/models/Mute;",
        "teams",
        "teamsRole",
        "",
        "channelMutes",
        "Lio/getstream/chat/android/models/ChannelMute;",
        "blockedUserIds",
        "avgResponseTime",
        "",
        "Ljava/lang/Long;",
        "pushPreference",
        "Lio/getstream/chat/android/models/PushPreference;",
        "extraData",
        "deactivatedAt",
        "withId",
        "withRole",
        "withName",
        "withImage",
        "withInvisible",
        "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/User$Builder;",
        "withPrivacySettings",
        "withLanguage",
        "withBanned",
        "withDevices",
        "withOnline",
        "withCreatedAt",
        "withUpdatedAt",
        "withLastActive",
        "withTotalUnreadCount",
        "withUnreadChannels",
        "withUnreadThreads",
        "withMutes",
        "withTeams",
        "withTeamsRole",
        "withChannelMutes",
        "withBlockedUserIds",
        "withAvgResponseTime",
        "withPushPreference",
        "withExtraData",
        "withDeactivatedAt",
        "build",
        "stream-chat-android-core"
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
.field private avgResponseTime:Ljava/lang/Long;

.field private banned:Ljava/lang/Boolean;

.field private blockedUserIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private channelMutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;"
        }
    .end annotation
.end field

.field private createdAt:Ljava/util/Date;

.field private deactivatedAt:Ljava/util/Date;

.field private devices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;"
        }
    .end annotation
.end field

.field private extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private invisible:Ljava/lang/Boolean;

.field private language:Ljava/lang/String;

.field private lastActive:Ljava/util/Date;

.field private mutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private online:Z

.field private privacySettings:Lio/getstream/chat/android/PrivacySettings;

.field private pushPreference:Lio/getstream/chat/android/models/PushPreference;

.field private role:Ljava/lang/String;

.field private teams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private teamsRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private totalUnreadCount:I

.field private unreadChannels:I

.field private unreadThreads:I

.field private updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->id:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->role:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->name:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->image:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->language:Ljava/lang/String;

    .line 7
    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->devices:Ljava/util/List;

    .line 8
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->mutes:Ljava/util/List;

    .line 9
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->teams:Ljava/util/List;

    .line 10
    sget-object v1, Lm83/z;->w:Lm83/z;

    iput-object v1, p0, Lio/getstream/chat/android/models/User$Builder;->teamsRole:Ljava/util/Map;

    .line 11
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->channelMutes:Ljava/util/List;

    .line 12
    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->blockedUserIds:Ljava/util/List;

    .line 13
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->extraData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Lio/getstream/chat/android/models/User$Builder;-><init>()V

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->id:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getRole()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->role:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->name:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->image:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getInvisible()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->invisible:Ljava/lang/Boolean;

    .line 20
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getPrivacySettings()Lio/getstream/chat/android/PrivacySettings;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    .line 21
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->language:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getBanned()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->banned:Ljava/lang/Boolean;

    .line 23
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getDevices()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->devices:Ljava/util/List;

    .line 24
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getOnline()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/User$Builder;->online:Z

    .line 25
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->createdAt:Ljava/util/Date;

    .line 26
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->updatedAt:Ljava/util/Date;

    .line 27
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getLastActive()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->lastActive:Ljava/util/Date;

    .line 28
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getTotalUnreadCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/User$Builder;->totalUnreadCount:I

    .line 29
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUnreadChannels()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/User$Builder;->unreadChannels:I

    .line 30
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUnreadThreads()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/User$Builder;->unreadThreads:I

    .line 31
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->mutes:Ljava/util/List;

    .line 32
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getTeams()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->teams:Ljava/util/List;

    .line 33
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getTeamsRole()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->teamsRole:Ljava/util/Map;

    .line 34
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->channelMutes:Ljava/util/List;

    .line 35
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->blockedUserIds:Ljava/util/List;

    .line 36
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getAvgResponseTime()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->avgResponseTime:Ljava/lang/Long;

    .line 37
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getPushPreference()Lio/getstream/chat/android/models/PushPreference;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    .line 38
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/User$Builder;->extraData:Ljava/util/Map;

    .line 39
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getDeactivatedAt()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->deactivatedAt:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/User;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Lio/getstream/chat/android/models/User;

    iget-object v2, v0, Lio/getstream/chat/android/models/User$Builder;->id:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/User$Builder;->role:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/User$Builder;->name:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/User$Builder;->image:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/models/User$Builder;->invisible:Ljava/lang/Boolean;

    iget-object v7, v0, Lio/getstream/chat/android/models/User$Builder;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    iget-object v8, v0, Lio/getstream/chat/android/models/User$Builder;->language:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/chat/android/models/User$Builder;->banned:Ljava/lang/Boolean;

    iget-object v10, v0, Lio/getstream/chat/android/models/User$Builder;->devices:Ljava/util/List;

    iget-boolean v11, v0, Lio/getstream/chat/android/models/User$Builder;->online:Z

    iget-object v12, v0, Lio/getstream/chat/android/models/User$Builder;->createdAt:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/models/User$Builder;->updatedAt:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/models/User$Builder;->lastActive:Ljava/util/Date;

    iget v15, v0, Lio/getstream/chat/android/models/User$Builder;->totalUnreadCount:I

    move-object/from16 v16, v1

    iget v1, v0, Lio/getstream/chat/android/models/User$Builder;->unreadChannels:I

    move/from16 v17, v1

    iget v1, v0, Lio/getstream/chat/android/models/User$Builder;->unreadThreads:I

    move/from16 v18, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->mutes:Ljava/util/List;

    move-object/from16 v19, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->teams:Ljava/util/List;

    move-object/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->teamsRole:Ljava/util/Map;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->channelMutes:Ljava/util/List;

    move-object/from16 v22, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->blockedUserIds:Ljava/util/List;

    move-object/from16 v23, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->avgResponseTime:Ljava/lang/Long;

    move-object/from16 v24, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v25, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->extraData:Ljava/util/Map;

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    move-object/from16 v26, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/User$Builder;->deactivatedAt:Ljava/util/Date;

    move-object/from16 v27, v26

    move-object/from16 v26, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v27

    invoke-direct/range {v1 .. v26}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final withAvgResponseTime(J)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->avgResponseTime:Ljava/lang/Long;

    return-object p0
.end method

.method public final withBanned(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->banned:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final withBlockedUserIds(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "blockedUserIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->blockedUserIds:Ljava/util/List;

    return-object p0
.end method

.method public final withChannelMutes(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelMute;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "channelMutes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->channelMutes:Ljava/util/List;

    return-object p0
.end method

.method public final withCreatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->createdAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDeactivatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->deactivatedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDevices(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Device;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->devices:Ljava/util/List;

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withId(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final withImage(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->image:Ljava/lang/String;

    return-object p0
.end method

.method public final withInvisible(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->invisible:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final withLanguage(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    const-string v0, "language"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->language:Ljava/lang/String;

    return-object p0
.end method

.method public final withLastActive(Ljava/util/Date;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->lastActive:Ljava/util/Date;

    return-object p0
.end method

.method public final withMutes(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "mutes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->mutes:Ljava/util/List;

    return-object p0
.end method

.method public final withName(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final withOnline(Z)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/User$Builder;->online:Z

    return-object p0
.end method

.method public final withPrivacySettings(Lio/getstream/chat/android/PrivacySettings;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->privacySettings:Lio/getstream/chat/android/PrivacySettings;

    return-object p0
.end method

.method public final withPushPreference(Lio/getstream/chat/android/models/PushPreference;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object p0
.end method

.method public final withRole(Ljava/lang/String;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1

    const-string v0, "role"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->role:Ljava/lang/String;

    return-object p0
.end method

.method public final withTeams(Ljava/util/List;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "teams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->teams:Ljava/util/List;

    return-object p0
.end method

.method public final withTeamsRole(Ljava/util/Map;)Lio/getstream/chat/android/models/User$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/User$Builder;"
        }
    .end annotation

    const-string v0, "teamsRole"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->teamsRole:Ljava/util/Map;

    return-object p0
.end method

.method public final withTotalUnreadCount(I)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/User$Builder;->totalUnreadCount:I

    return-object p0
.end method

.method public final withUnreadChannels(I)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/User$Builder;->unreadChannels:I

    return-object p0
.end method

.method public final withUnreadThreads(I)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/User$Builder;->unreadThreads:I

    return-object p0
.end method

.method public final withUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/User$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/User$Builder;->updatedAt:Ljava/util/Date;

    return-object p0
.end method
