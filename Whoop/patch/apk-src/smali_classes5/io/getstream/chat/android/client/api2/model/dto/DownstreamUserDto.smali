.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/StreamHandsOff;
    reason = "Field names can\'t be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008I\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00b9\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0017\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0008\u0010#\u001a\u0004\u0018\u00010$\u0012\u0008\u0010%\u001a\u0004\u0018\u00010&\u0012\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f\u00a2\u0006\u0004\u0008)\u0010*J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010V\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0008H\u00c6\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010_\u001a\u00020\u0017H\u00c6\u0003J\t\u0010`\u001a\u00020\u0017H\u00c6\u0003J\t\u0010a\u001a\u00020\u0017H\u00c6\u0003J\t\u0010b\u001a\u00020\u0017H\u00c6\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eH\u00c6\u0003J\u000f\u0010d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u0017\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001fH\u00c6\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010$H\u00c6\u0003\u00a2\u0006\u0002\u0010LJ\u000b\u0010i\u001a\u0004\u0018\u00010&H\u00c6\u0003J\u0015\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fH\u00c6\u0003J\u00e8\u0002\u0010k\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00172\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0016\u0008\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f2\u0010\u0008\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&2\u0014\u0008\u0002\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001fH\u00c6\u0001\u00a2\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00082\u0008\u0010n\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010o\u001a\u00020\u0017H\u00d6\u0001J\t\u0010p\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010,R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010,R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010,R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00080\u00101R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010,R\u0011\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0011\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010<R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010AR\u0011\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010AR\u0011\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010AR\u0011\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010AR\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u00109R\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u00109R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u00109R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u00109R\u0015\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\n\n\u0002\u0010M\u001a\u0004\u0008K\u0010LR\u0013\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010OR\u001d\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010H\u00a8\u0006q"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "id",
        "",
        "name",
        "image",
        "role",
        "invisible",
        "",
        "privacy_settings",
        "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
        "language",
        "banned",
        "devices",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
        "online",
        "created_at",
        "Ljava/util/Date;",
        "deactivated_at",
        "updated_at",
        "last_active",
        "total_unread_count",
        "",
        "unread_channels",
        "unread_count",
        "unread_threads",
        "mutes",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
        "teams",
        "teams_role",
        "",
        "channel_mutes",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
        "blocked_user_ids",
        "avg_response_time",
        "",
        "push_preferences",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
        "extraData",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V",
        "getId",
        "()Ljava/lang/String;",
        "getName",
        "getImage",
        "getRole",
        "getInvisible",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getPrivacy_settings",
        "()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
        "getLanguage",
        "getBanned",
        "()Z",
        "getDevices",
        "()Ljava/util/List;",
        "getOnline",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getDeactivated_at",
        "getUpdated_at",
        "getLast_active",
        "getTotal_unread_count",
        "()I",
        "getUnread_channels",
        "getUnread_count",
        "getUnread_threads",
        "getMutes",
        "getTeams",
        "getTeams_role",
        "()Ljava/util/Map;",
        "getChannel_mutes",
        "getBlocked_user_ids",
        "getAvg_response_time",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getPush_preferences",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
        "getExtraData",
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
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "equals",
        "other",
        "hashCode",
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
.field private final avg_response_time:Ljava/lang/Long;

.field private final banned:Z

.field private final blocked_user_ids:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final channel_mutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;"
        }
    .end annotation
.end field

.field private final created_at:Ljava/util/Date;

.field private final deactivated_at:Ljava/util/Date;

.field private final devices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation
.end field

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

.field private final invisible:Ljava/lang/Boolean;

.field private final language:Ljava/lang/String;

.field private final last_active:Ljava/util/Date;

.field private final mutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final online:Z

.field private final privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

.field private final push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

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

.field private final teams_role:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final total_unread_count:I

.field private final unread_channels:I

.field private final unread_count:I

.field private final unread_threads:I

.field private final updated_at:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "IIII",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p20

    move-object/from16 v1, p26

    const-string v2, "id"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "role"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "teams"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extraData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    .line 9
    iput-boolean p8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    .line 11
    iput-boolean p10, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    .line 12
    iput-object p11, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    .line 13
    iput-object p12, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    move-object/from16 p1, p13

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    move/from16 p1, p15

    .line 16
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    move/from16 p1, p16

    .line 17
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    move/from16 p1, p17

    .line 18
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    move/from16 p1, p18

    .line 19
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    .line 21
    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    .line 27
    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 29

    move/from16 v0, p27

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 28
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit16 v1, v0, 0x4000

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move/from16 v17, v2

    goto :goto_1

    :cond_1
    move/from16 v17, p15

    :goto_1
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_2

    move/from16 v18, v2

    goto :goto_2

    :cond_2
    move/from16 v18, p16

    :goto_2
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_3

    move/from16 v19, v2

    goto :goto_3

    :cond_3
    move/from16 v19, p17

    :goto_3
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    move/from16 v20, v2

    goto :goto_4

    :cond_4
    move/from16 v20, p18

    :goto_4
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    .line 29
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v22, v0

    :goto_5
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v21, p19

    move-object/from16 v23, p21

    move-object/from16 v24, p22

    move-object/from16 v25, p23

    move-object/from16 v26, p24

    move-object/from16 v27, p25

    move-object/from16 v28, p26

    goto :goto_6

    :cond_5
    move-object/from16 v22, p20

    goto :goto_5

    .line 30
    :goto_6
    invoke-direct/range {v2 .. v28}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p27

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p27, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p27, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p27, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p27, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p27, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p27, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p27, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p27, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p27, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p27, v16

    if-eqz v16, :cond_19

    move-object/from16 p11, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    move-object/from16 p26, p11

    move-object/from16 p27, v1

    :goto_19
    move/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1a

    :cond_19
    move-object/from16 p27, p26

    move-object/from16 p26, v1

    goto :goto_19

    :goto_1a
    invoke-virtual/range {p1 .. p27}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    return v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    return v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    return v0
.end method

.method public final component19()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    return-object v0
.end method

.method public final component22()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    return-object v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    return-object v0
.end method

.method public final component25()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    return-object v0
.end method

.method public final component26()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    return v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "IIII",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Long;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teams"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v3, p26

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, v3

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v27}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;IIIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final getAvg_response_time()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    return-object v0
.end method

.method public final getBanned()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    return v0
.end method

.method public final getBlocked_user_ids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    return-object v0
.end method

.method public final getChannel_mutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    return-object v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getDeactivated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getDevices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DeviceDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getInvisible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast_active()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    return-object v0
.end method

.method public final getMutes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMuteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnline()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    return v0
.end method

.method public final getPrivacy_settings()Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    return-object v0
.end method

.method public final getPush_preferences()Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    return-object v0
.end method

.method public final getTeams_role()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    return-object v0
.end method

.method public final getTotal_unread_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    return v0
.end method

.method public final getUnread_channels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    return v0
.end method

.method public final getUnread_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    return v0
.end method

.method public final getUnread_threads()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    return v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    if-nez v2, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 29

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->name:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->image:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->role:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->invisible:Ljava/lang/Boolean;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->privacy_settings:Lio/getstream/chat/android/client/api2/model/dto/PrivacySettingsDto;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->language:Ljava/lang/String;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->banned:Z

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->devices:Ljava/util/List;

    iget-boolean v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->online:Z

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->created_at:Ljava/util/Date;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->deactivated_at:Ljava/util/Date;

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->updated_at:Ljava/util/Date;

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->last_active:Ljava/util/Date;

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->total_unread_count:I

    move/from16 v16, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_channels:I

    move/from16 v17, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_count:I

    move/from16 v18, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->unread_threads:I

    move/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->mutes:Ljava/util/List;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams:Ljava/util/List;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->teams_role:Ljava/util/Map;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->channel_mutes:Ljava/util/List;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->blocked_user_ids:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->avg_response_time:Ljava/lang/Long;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->push_preferences:Lio/getstream/chat/android/client/api2/model/dto/DownstreamPushPreferenceDto;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->extraData:Ljava/util/Map;

    const-string v0, ", name="

    move-object/from16 v27, v15

    const-string v15, ", image="

    move-object/from16 v28, v13

    const-string v13, "DownstreamUserDto(id="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", role="

    const-string v2, ", invisible="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", privacy_settings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", banned="

    const-string v2, ", devices="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", online="

    const-string v2, ", created_at="

    invoke-static {v1, v2, v0, v9, v10}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", deactivated_at="

    const-string v2, ", updated_at="

    invoke-static {v0, v11, v1, v12, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", last_active="

    const-string v2, ", total_unread_count="

    move-object/from16 v3, v28

    invoke-static {v0, v3, v1, v14, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", unread_channels="

    const-string v2, ", unread_count="

    move/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", unread_threads="

    const-string v2, ", mutes="

    move/from16 v3, v18

    move/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", teams="

    const-string v2, ", teams_role="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel_mutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blocked_user_ids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avg_response_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", push_preferences="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
