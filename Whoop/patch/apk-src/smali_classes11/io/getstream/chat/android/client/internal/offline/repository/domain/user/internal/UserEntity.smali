.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u00082\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00d7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010@\u001a\u00020\rH\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010B\u001a\u00020\rH\u00c6\u0003J\u000f\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u000f\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016H\u00c6\u0003J\u0015\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u00e8\u0001\u0010I\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00162\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00162\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\r2\u0008\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020NH\u00d6\u0001J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001fR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010%R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010)R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010.R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00101R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\u00083\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107\u00a8\u0006P"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "",
        "id",
        "",
        "originalId",
        "name",
        "image",
        "role",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "lastActive",
        "invisible",
        "",
        "privacySettings",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
        "banned",
        "mutes",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
        "teams",
        "teamsRole",
        "",
        "extraData",
        "avgResponseTime",
        "",
        "pushPreference",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V",
        "getId",
        "()Ljava/lang/String;",
        "getOriginalId",
        "getName",
        "getImage",
        "getRole",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getLastActive",
        "getInvisible",
        "()Z",
        "getPrivacySettings",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
        "getBanned",
        "getMutes",
        "()Ljava/util/List;",
        "getTeams",
        "getTeamsRole",
        "()Ljava/util/Map;",
        "getExtraData",
        "getAvgResponseTime",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getPushPreference",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;",
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
        "component17",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
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


# instance fields
.field private final avgResponseTime:Ljava/lang/Long;

.field private final banned:Z

.field private final createdAt:Ljava/util/Date;

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

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final invisible:Z

.field private final lastActive:Ljava/util/Date;

.field private final mutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final originalId:Ljava/lang/String;

.field private final privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

.field private final pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

.field private final role:Ljava/lang/String;

.field private final teams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final teamsRole:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    move-object/from16 v2, p14

    move-object/from16 v3, p15

    const-string v4, "id"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "originalId"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "name"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "image"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "role"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "mutes"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "teams"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "teamsRole"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "extraData"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    move/from16 p1, p11

    .line 12
    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    .line 13
    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    .line 14
    iput-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    .line 15
    iput-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    .line 16
    iput-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x2

    .line 19
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    move v12, v3

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move v14, v3

    goto :goto_6

    :cond_6
    move/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    .line 20
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object/from16 v16, v1

    goto :goto_7

    :cond_7
    move-object/from16 v16, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    .line 21
    sget-object v3, Lm83/z;->w:Lm83/z;

    if-eqz v1, :cond_8

    move-object/from16 v17, v3

    goto :goto_8

    :cond_8
    move-object/from16 v17, p14

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_9

    move-object/from16 v18, v3

    goto :goto_9

    :cond_9
    move-object/from16 v18, p15

    :goto_9
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v19, v2

    goto :goto_a

    :cond_a
    move-object/from16 v19, p16

    :goto_a
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_b

    move-object/from16 v20, v2

    :goto_b
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v13, p10

    move-object/from16 v15, p12

    goto :goto_c

    :cond_b
    move-object/from16 v20, p17

    goto :goto_b

    :goto_c
    invoke-direct/range {v3 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    move-object/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component16()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final component17()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;",
            ")",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutes"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamsRole"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZLio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAvgResponseTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final getBanned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getInvisible()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    return v0
.end method

.method public final getLastActive()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    return-object v0
.end method

.method public final getMutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacySettings()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    return-object v0
.end method

.method public final getPushPreference()Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeams()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final getTeamsRole()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

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

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->originalId:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->name:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->image:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->role:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->createdAt:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->updatedAt:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->lastActive:Ljava/util/Date;

    iget-boolean v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->invisible:Z

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->privacySettings:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    iget-boolean v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->banned:Z

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->mutes:Ljava/util/List;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teams:Ljava/util/List;

    iget-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->teamsRole:Ljava/util/Map;

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->extraData:Ljava/util/Map;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->avgResponseTime:Ljava/lang/Long;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;->pushPreference:Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    const-string v0, ", originalId="

    move-object/from16 v18, v15

    const-string v15, ", name="

    move-object/from16 v19, v14

    const-string v14, "UserEntity(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v2, ", role="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", createdAt="

    const-string v2, ", updatedAt="

    invoke-static {v0, v5, v1, v6, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", lastActive="

    const-string v2, ", invisible="

    invoke-static {v0, v7, v1, v8, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", privacySettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", banned="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mutes="

    const-string v2, ", teams="

    invoke-static {v1, v2, v0, v12, v11}, Lm4/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", teamsRole="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avgResponseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pushPreference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
