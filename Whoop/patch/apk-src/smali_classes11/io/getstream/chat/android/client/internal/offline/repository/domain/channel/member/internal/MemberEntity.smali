.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u00089\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00c5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\tH\u00c6\u0003J\t\u0010B\u001a\u00020\tH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0015\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015H\u00c6\u0003J\u00ce\u0001\u0010J\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\t2\u0008\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020OH\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019\"\u0004\u0008\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u001f\"\u0004\u0008#\u0010!R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010$\"\u0004\u0008%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u001f\"\u0004\u0008(\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u001f\"\u0004\u0008*\u0010!R\u001a\u0010\u000c\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010$\"\u0004\u0008,\u0010&R\u001a\u0010\r\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008-\u0010$\"\u0004\u0008.\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00080\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u0010\u001f\"\u0004\u00085\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010\u001fR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109\u00a8\u0006Q"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "",
        "userId",
        "",
        "role",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "isInvited",
        "",
        "inviteAcceptedAt",
        "inviteRejectedAt",
        "shadowBanned",
        "banned",
        "channelRole",
        "notificationsMuted",
        "status",
        "banExpires",
        "pinnedAt",
        "archivedAt",
        "extraData",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V",
        "getUserId",
        "()Ljava/lang/String;",
        "setUserId",
        "(Ljava/lang/String;)V",
        "getRole",
        "setRole",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "setCreatedAt",
        "(Ljava/util/Date;)V",
        "getUpdatedAt",
        "setUpdatedAt",
        "()Z",
        "setInvited",
        "(Z)V",
        "getInviteAcceptedAt",
        "setInviteAcceptedAt",
        "getInviteRejectedAt",
        "setInviteRejectedAt",
        "getShadowBanned",
        "setShadowBanned",
        "getBanned",
        "setBanned",
        "getChannelRole",
        "getNotificationsMuted",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getStatus",
        "getBanExpires",
        "setBanExpires",
        "getPinnedAt",
        "getArchivedAt",
        "getExtraData",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final archivedAt:Ljava/util/Date;

.field private banExpires:Ljava/util/Date;

.field private banned:Z

.field private final channelRole:Ljava/lang/String;

.field private createdAt:Ljava/util/Date;

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private inviteAcceptedAt:Ljava/util/Date;

.field private inviteRejectedAt:Ljava/util/Date;

.field private isInvited:Z

.field private final notificationsMuted:Ljava/lang/Boolean;

.field private final pinnedAt:Ljava/util/Date;

.field private role:Ljava/lang/String;

.field private shadowBanned:Z

.field private final status:Ljava/lang/String;

.field private updatedAt:Ljava/util/Date;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p16

    const-string v1, "userId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "role"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extraData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    .line 9
    iput-boolean p8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    .line 13
    iput-object p12, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    .line 17
    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 18
    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_4

    move-object v7, v3

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    move-object v8, v3

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_6

    move v9, v6

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v6, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_8

    move-object v10, v3

    goto :goto_8

    :cond_8
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_9

    move-object v11, v3

    goto :goto_9

    :cond_9
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_a

    move-object v12, v3

    goto :goto_a

    :cond_a
    move-object/from16 v12, p12

    :goto_a
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_b

    move-object v13, v3

    goto :goto_b

    :cond_b
    move-object/from16 v13, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    move-object v14, v3

    goto :goto_c

    :cond_c
    move-object/from16 v14, p14

    :goto_c
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_d

    goto :goto_d

    :cond_d
    move-object/from16 v3, p15

    :goto_d
    const v15, 0x8000

    and-int/2addr v0, v15

    if-eqz v0, :cond_e

    .line 19
    sget-object v0, Lm83/z;->w:Lm83/z;

    move-object/from16 p18, v0

    :goto_e
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p17, v3

    move-object/from16 p6, v4

    move/from16 p7, v5

    move/from16 p11, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move/from16 p10, v9

    move-object/from16 p12, v10

    move-object/from16 p13, v11

    move-object/from16 p14, v12

    move-object/from16 p15, v13

    move-object/from16 p16, v14

    goto :goto_f

    :cond_e
    move-object/from16 p18, p16

    goto :goto_e

    .line 20
    :goto_f
    invoke-direct/range {p2 .. p18}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component16()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    return v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;"
        }
    .end annotation

    const-string v0, "userId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getArchivedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getBanExpires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    return-object v0
.end method

.method public final getBanned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    return v0
.end method

.method public final getChannelRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getInviteAcceptedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getInviteRejectedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getNotificationsMuted()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getPinnedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getShadowBanned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isInvited()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    return v0
.end method

.method public final setBanExpires(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    return-void
.end method

.method public final setBanned(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    return-void
.end method

.method public final setCreatedAt(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    return-void
.end method

.method public final setInviteAcceptedAt(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    return-void
.end method

.method public final setInviteRejectedAt(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    return-void
.end method

.method public final setInvited(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    return-void
.end method

.method public final setRole(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    return-void
.end method

.method public final setShadowBanned(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    return-void
.end method

.method public final setUpdatedAt(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->userId:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->role:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->createdAt:Ljava/util/Date;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->updatedAt:Ljava/util/Date;

    iget-boolean v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited:Z

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteAcceptedAt:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->inviteRejectedAt:Ljava/util/Date;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->shadowBanned:Z

    iget-boolean v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banned:Z

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->channelRole:Ljava/lang/String;

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->notificationsMuted:Ljava/lang/Boolean;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->status:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->banExpires:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->pinnedAt:Ljava/util/Date;

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->archivedAt:Ljava/util/Date;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->extraData:Ljava/util/Map;

    const-string v0, ", role="

    move-object/from16 v17, v15

    const-string v15, ", createdAt="

    move-object/from16 v18, v13

    const-string v13, "MemberEntity(userId="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updatedAt="

    const-string v2, ", isInvited="

    invoke-static {v0, v3, v1, v4, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", inviteAcceptedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inviteRejectedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shadowBanned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", banned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", channelRole="

    const-string v2, ", notificationsMuted="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", status="

    const-string v2, ", banExpires="

    invoke-static {v11, v1, v12, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", pinnedAt="

    const-string v2, ", archivedAt="

    move-object/from16 v3, v18

    invoke-static {v0, v3, v1, v14, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
