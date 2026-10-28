.class public final Lio/getstream/chat/android/models/Channel$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/Channel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0008J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0008J\u000e\u0010?\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010@\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010A\u001a\u00020\u00002\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010B\u001a\u00020\u00002\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010C\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\rJ\u0014\u0010F\u001a\u00020\u00002\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010G\u001a\u00020\u00002\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0018J\u0014\u0010H\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0018J\u0014\u0010I\u001a\u00020\u00002\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0018J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\rJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0008J\u0015\u0010N\u001a\u00020\u00002\u0008\u0010%\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u00020\u00002\u0008\u0010\'\u001a\u0004\u0018\u00010\u0011J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\rJ\u0014\u0010R\u001a\u00020\u00002\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018J\u0014\u0010S\u001a\u00020\u00002\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080+J\u0010\u0010T\u001a\u00020\u00002\u0008\u0010,\u001a\u0004\u0018\u00010\u001bJ\u0014\u0010U\u001a\u00020\u00002\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010V\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010W\u001a\u00020\u00002\u0008\u0010X\u001a\u0004\u0018\u000100J\u0014\u0010Y\u001a\u00020\u00002\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u0002020\u0018J\u0015\u0010Z\u001a\u00020\u00002\u0008\u00103\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010[J\u0010\u0010\\\u001a\u00020\u00002\u0008\u00105\u001a\u0004\u0018\u000106J\u0014\u0010]\u001a\u00020\u00002\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0018J\u0010\u0010^\u001a\u00020\u00002\u0008\u00108\u001a\u0004\u0018\u00010\u0011J\u001a\u0010_\u001a\u00020\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010:J\u0006\u0010`\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010&R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0008\u0012\u0004\u0012\u0002020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Channel$Builder;",
        "",
        "<init>",
        "()V",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "id",
        "",
        "type",
        "name",
        "image",
        "watcherCount",
        "",
        "frozen",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "deletedAt",
        "updatedAt",
        "syncStatus",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "memberCount",
        "messages",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "members",
        "Lio/getstream/chat/android/models/Member;",
        "watchers",
        "Lio/getstream/chat/android/models/User;",
        "read",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "config",
        "Lio/getstream/chat/android/models/Config;",
        "createdBy",
        "unreadCount",
        "team",
        "hidden",
        "Ljava/lang/Boolean;",
        "hiddenMessagesBefore",
        "cooldown",
        "pinnedMessages",
        "ownCapabilities",
        "",
        "membership",
        "cachedLatestMessages",
        "isInsideSearch",
        "draft",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "activeLiveLocations",
        "Lio/getstream/chat/android/models/Location;",
        "messageCount",
        "Ljava/lang/Integer;",
        "pushPreference",
        "Lio/getstream/chat/android/models/PushPreference;",
        "filterTags",
        "lastMessageAt",
        "extraData",
        "",
        "withId",
        "withType",
        "withName",
        "withImage",
        "withWatcherCount",
        "withFrozen",
        "withCreatedAt",
        "withDeletedAt",
        "withUpdatedAt",
        "withSyncStatus",
        "withMemberCount",
        "withMessages",
        "withMembers",
        "withWatchers",
        "withRead",
        "withConfig",
        "withCreatedBy",
        "withUnreadCount",
        "withTeam",
        "withHidden",
        "(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/Channel$Builder;",
        "withHiddenMessagesBefore",
        "withCooldown",
        "withPinnedMessages",
        "withOwnCapabilities",
        "withMembership",
        "withCachedLatestMessages",
        "withIsInsideSearch",
        "withDraftMessage",
        "draftMessage",
        "withActiveLiveLocations",
        "withMessageCount",
        "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Channel$Builder;",
        "withPushPreference",
        "withFilterTags",
        "withLastMessageAt",
        "withExtraData",
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
.field private activeLiveLocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;"
        }
    .end annotation
.end field

.field private cachedLatestMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private config:Lio/getstream/chat/android/models/Config;

.field private cooldown:I

.field private createdAt:Ljava/util/Date;

.field private createdBy:Lio/getstream/chat/android/models/User;

.field private deletedAt:Ljava/util/Date;

.field private draft:Lio/getstream/chat/android/models/DraftMessage;

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

.field private filterTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private frozen:Z

.field private hidden:Ljava/lang/Boolean;

.field private hiddenMessagesBefore:Ljava/util/Date;

.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private isInsideSearch:Z

.field private lastMessageAt:Ljava/util/Date;

.field private memberCount:I

.field private members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field private membership:Lio/getstream/chat/android/models/Member;

.field private messageCount:Ljava/lang/Integer;

.field private messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private pinnedMessages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field

.field private pushPreference:Lio/getstream/chat/android/models/PushPreference;

.field private read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private syncStatus:Lio/getstream/chat/android/models/SyncStatus;

.field private team:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private unreadCount:I

.field private updatedAt:Ljava/util/Date;

.field private watcherCount:I

.field private watchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v1, ""

    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->id:Ljava/lang/String;

    .line 3
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->type:Ljava/lang/String;

    .line 4
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->name:Ljava/lang/String;

    .line 5
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->image:Ljava/lang/String;

    .line 6
    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 7
    sget-object v2, Lm83/y;->w:Lm83/y;

    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->messages:Ljava/util/List;

    .line 8
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->members:Ljava/util/List;

    .line 9
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->watchers:Ljava/util/List;

    .line 10
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->read:Ljava/util/List;

    .line 11
    new-instance v3, Lio/getstream/chat/android/models/Config;

    const v30, 0x3ffffff

    const/16 v31, 0x0

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

    invoke-direct/range {v3 .. v31}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lio/getstream/chat/android/models/Channel$Builder;->config:Lio/getstream/chat/android/models/Config;

    .line 12
    new-instance v4, Lio/getstream/chat/android/models/User;

    const v30, 0x1ffffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v22, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v4 .. v31}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lio/getstream/chat/android/models/Channel$Builder;->createdBy:Lio/getstream/chat/android/models/User;

    .line 13
    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->team:Ljava/lang/String;

    .line 14
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->pinnedMessages:Ljava/util/List;

    .line 15
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->ownCapabilities:Ljava/util/Set;

    .line 16
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->cachedLatestMessages:Ljava/util/List;

    .line 17
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->activeLiveLocations:Ljava/util/List;

    .line 18
    iput-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->filterTags:Ljava/util/List;

    .line 19
    sget-object v1, Lm83/z;->w:Lm83/z;

    iput-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->extraData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Channel;)V
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Lio/getstream/chat/android/models/Channel$Builder;-><init>()V

    .line 21
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->id:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->type:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->name:Ljava/lang/String;

    .line 24
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->image:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->watcherCount:I

    .line 26
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getFrozen()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->frozen:Z

    .line 27
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->createdAt:Ljava/util/Date;

    .line 28
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getDeletedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->deletedAt:Ljava/util/Date;

    .line 29
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getUpdatedAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->updatedAt:Ljava/util/Date;

    .line 30
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    .line 31
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->memberCount:I

    .line 32
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->messages:Ljava/util/List;

    .line 33
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->members:Ljava/util/List;

    .line 34
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->watchers:Ljava/util/List;

    .line 35
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->read:Ljava/util/List;

    .line 36
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->config:Lio/getstream/chat/android/models/Config;

    .line 37
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->createdBy:Lio/getstream/chat/android/models/User;

    .line 38
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getUnreadCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->unreadCount:I

    .line 39
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getTeam()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->team:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->hidden:Ljava/lang/Boolean;

    .line 41
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->hiddenMessagesBefore:Ljava/util/Date;

    .line 42
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCooldown()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->cooldown:I

    .line 43
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->pinnedMessages:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->ownCapabilities:Ljava/util/Set;

    .line 45
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->membership:Lio/getstream/chat/android/models/Member;

    .line 46
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCachedLatestMessages()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->cachedLatestMessages:Ljava/util/List;

    .line 47
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->isInsideSearch()Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->isInsideSearch:Z

    .line 48
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->draft:Lio/getstream/chat/android/models/DraftMessage;

    .line 49
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getActiveLiveLocations()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->activeLiveLocations:Ljava/util/List;

    .line 50
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->messageCount:Ljava/lang/Integer;

    .line 51
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPushPreference()Lio/getstream/chat/android/models/PushPreference;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    .line 52
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getFilterTags()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->filterTags:Ljava/util/List;

    .line 53
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Channel$Builder;->lastMessageAt:Ljava/util/Date;

    .line 54
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->extraData:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/Channel;
    .locals 40

    move-object/from16 v0, p0

    new-instance v1, Lio/getstream/chat/android/models/Channel;

    iget-object v2, v0, Lio/getstream/chat/android/models/Channel$Builder;->id:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Channel$Builder;->type:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/Channel$Builder;->name:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/Channel$Builder;->image:Ljava/lang/String;

    iget v6, v0, Lio/getstream/chat/android/models/Channel$Builder;->watcherCount:I

    iget-boolean v7, v0, Lio/getstream/chat/android/models/Channel$Builder;->frozen:Z

    iget-object v8, v0, Lio/getstream/chat/android/models/Channel$Builder;->createdAt:Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/models/Channel$Builder;->deletedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/models/Channel$Builder;->updatedAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/models/Channel$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    iget v12, v0, Lio/getstream/chat/android/models/Channel$Builder;->memberCount:I

    iget-object v13, v0, Lio/getstream/chat/android/models/Channel$Builder;->messages:Ljava/util/List;

    iget-object v14, v0, Lio/getstream/chat/android/models/Channel$Builder;->members:Ljava/util/List;

    iget-object v15, v0, Lio/getstream/chat/android/models/Channel$Builder;->watchers:Ljava/util/List;

    move-object/from16 v16, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->read:Ljava/util/List;

    move-object/from16 v17, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->config:Lio/getstream/chat/android/models/Config;

    move-object/from16 v18, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->createdBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v19, v1

    iget v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->unreadCount:I

    move/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->team:Ljava/lang/String;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->hidden:Ljava/lang/Boolean;

    move-object/from16 v22, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->hiddenMessagesBefore:Ljava/util/Date;

    move-object/from16 v23, v1

    iget v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->cooldown:I

    move/from16 v24, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->pinnedMessages:Ljava/util/List;

    move-object/from16 v25, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v26, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 v27, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->cachedLatestMessages:Ljava/util/List;

    move-object/from16 v28, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->isInsideSearch:Z

    move/from16 v29, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->draft:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v30, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->activeLiveLocations:Ljava/util/List;

    move-object/from16 v31, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->messageCount:Ljava/lang/Integer;

    move-object/from16 v32, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v33, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->filterTags:Ljava/util/List;

    move-object/from16 v34, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->lastMessageAt:Ljava/util/Date;

    move-object/from16 v35, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Channel$Builder;->extraData:Ljava/util/Map;

    const/16 v38, 0x0

    const/16 v39, 0x0

    move-object/from16 v36, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move/from16 v23, v24

    const/16 v24, 0x0

    const/high16 v37, 0x400000

    invoke-direct/range {v1 .. v39}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final withActiveLiveLocations(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Location;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "activeLiveLocations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->activeLiveLocations:Ljava/util/List;

    return-object p0
.end method

.method public final withCachedLatestMessages(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "cachedLatestMessages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->cachedLatestMessages:Ljava/util/List;

    return-object p0
.end method

.method public final withConfig(Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->config:Lio/getstream/chat/android/models/Config;

    return-object p0
.end method

.method public final withCooldown(I)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->cooldown:I

    return-object p0
.end method

.method public final withCreatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->createdAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withCreatedBy(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "createdBy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->createdBy:Lio/getstream/chat/android/models/User;

    return-object p0
.end method

.method public final withDeletedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->deletedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->draft:Lio/getstream/chat/android/models/DraftMessage;

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withFilterTags(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "filterTags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->filterTags:Ljava/util/List;

    return-object p0
.end method

.method public final withFrozen(Z)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->frozen:Z

    return-object p0
.end method

.method public final withHidden(Ljava/lang/Boolean;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->hidden:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final withHiddenMessagesBefore(Ljava/util/Date;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->hiddenMessagesBefore:Ljava/util/Date;

    return-object p0
.end method

.method public final withId(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->id:Ljava/lang/String;

    return-object p0
.end method

.method public final withImage(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->image:Ljava/lang/String;

    return-object p0
.end method

.method public final withIsInsideSearch(Z)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->isInsideSearch:Z

    return-object p0
.end method

.method public final withLastMessageAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->lastMessageAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withMemberCount(I)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->memberCount:I

    return-object p0
.end method

.method public final withMembers(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->members:Ljava/util/List;

    return-object p0
.end method

.method public final withMembership(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->membership:Lio/getstream/chat/android/models/Member;

    return-object p0
.end method

.method public final withMessageCount(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->messageCount:Ljava/lang/Integer;

    return-object p0
.end method

.method public final withMessages(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->messages:Ljava/util/List;

    return-object p0
.end method

.method public final withName(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final withOwnCapabilities(Ljava/util/Set;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "ownCapabilities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->ownCapabilities:Ljava/util/Set;

    return-object p0
.end method

.method public final withPinnedMessages(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "pinnedMessages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->pinnedMessages:Ljava/util/List;

    return-object p0
.end method

.method public final withPushPreference(Lio/getstream/chat/android/models/PushPreference;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object p0
.end method

.method public final withRead(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "read"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->read:Ljava/util/List;

    return-object p0
.end method

.method public final withSyncStatus(Lio/getstream/chat/android/models/SyncStatus;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "syncStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->syncStatus:Lio/getstream/chat/android/models/SyncStatus;

    return-object p0
.end method

.method public final withTeam(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "team"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->team:Ljava/lang/String;

    return-object p0
.end method

.method public final withType(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->type:Ljava/lang/String;

    return-object p0
.end method

.method public final withUnreadCount(I)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->unreadCount:I

    return-object p0
.end method

.method public final withUpdatedAt(Ljava/util/Date;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->updatedAt:Ljava/util/Date;

    return-object p0
.end method

.method public final withWatcherCount(I)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->watcherCount:I

    return-object p0
.end method

.method public final withWatchers(Ljava/util/List;)Lio/getstream/chat/android/models/Channel$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Lio/getstream/chat/android/models/Channel$Builder;"
        }
    .end annotation

    const-string v0, "watchers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Channel$Builder;->watchers:Ljava/util/List;

    return-object p0
.end method
