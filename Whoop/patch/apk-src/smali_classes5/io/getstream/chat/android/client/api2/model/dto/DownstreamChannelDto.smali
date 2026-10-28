.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008J\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00c7\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b\u0012\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010 \u001a\u00020\t\u0012\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u000e\u0008\u0002\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0008\u0002\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u000b\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0004\u0008*\u0010+J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\tH\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\t\u0010Y\u001a\u00020\rH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010^\u001a\u00020\tH\u00c6\u0003J\u000f\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000bH\u00c6\u0003J\u000f\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000bH\u00c6\u0003J\u000f\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000bH\u00c6\u0003J\u000f\u0010b\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000bH\u00c6\u0003J\t\u0010c\u001a\u00020\u001dH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\tH\u00c6\u0003J\u000f\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000bH\u00c6\u0003J\u000f\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000bH\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000f\u0010j\u001a\u0008\u0012\u0004\u0012\u00020%0\u000bH\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(H\u00c6\u0003J\u00ec\u0002\u0010m\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b2\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b2\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b2\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00032\u0008\u0008\u0002\u0010 \u001a\u00020\t2\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b2\u000e\u0008\u0002\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00172\u000e\u0008\u0002\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u000b2\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\t2\u0014\u0008\u0002\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(H\u00c6\u0001\u00a2\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\r2\u0008\u0010p\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010q\u001a\u00020\tH\u00d6\u0001J\t\u0010r\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010-R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010-R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00109R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00109R\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00103R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u00105R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u00105R\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u00105R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00105R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010CR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010ER\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010-R\u0011\u0010 \u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u00103R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u00105R\u0017\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u00105R\u0013\u0010#\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0017\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u00105R\u0015\u0010&\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010O\u001a\u0004\u0008M\u0010NR\u001d\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010Q\u00a8\u0006s"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "cid",
        "",
        "id",
        "type",
        "name",
        "image",
        "watcher_count",
        "",
        "filter_tags",
        "",
        "frozen",
        "",
        "last_message_at",
        "Ljava/util/Date;",
        "created_at",
        "deleted_at",
        "updated_at",
        "member_count",
        "messages",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "members",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
        "watchers",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "read",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
        "config",
        "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
        "created_by",
        "team",
        "cooldown",
        "pinned_messages",
        "own_capabilities",
        "membership",
        "active_live_locations",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
        "message_count",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V",
        "getCid",
        "()Ljava/lang/String;",
        "getId",
        "getType",
        "getName",
        "getImage",
        "getWatcher_count",
        "()I",
        "getFilter_tags",
        "()Ljava/util/List;",
        "getFrozen",
        "()Z",
        "getLast_message_at",
        "()Ljava/util/Date;",
        "getCreated_at",
        "getDeleted_at",
        "getUpdated_at",
        "getMember_count",
        "getMessages",
        "getMembers",
        "getWatchers",
        "getRead",
        "getConfig",
        "()Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
        "getCreated_by",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getTeam",
        "getCooldown",
        "getPinned_messages",
        "getOwn_capabilities",
        "getMembership",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
        "getActive_live_locations",
        "getMessage_count",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
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
        "component27",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
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
.field private final active_live_locations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;"
        }
    .end annotation
.end field

.field private final cid:Ljava/lang/String;

.field private final config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

.field private final cooldown:I

.field private final created_at:Ljava/util/Date;

.field private final created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

.field private final deleted_at:Ljava/util/Date;

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

.field private final filter_tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final frozen:Z

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final last_message_at:Ljava/util/Date;

.field private final member_count:I

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;"
        }
    .end annotation
.end field

.field private final membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

.field private final message_count:Ljava/lang/Integer;

.field private final messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final own_capabilities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pinned_messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private final team:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final updated_at:Ljava/util/Date;

.field private final watcher_count:I

.field private final watchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object v0, p3

    move-object/from16 v1, p14

    move-object/from16 v2, p15

    move-object/from16 v3, p16

    move-object/from16 v4, p17

    move-object/from16 v5, p18

    move-object/from16 v6, p20

    move-object/from16 v7, p22

    move-object/from16 v8, p23

    move-object/from16 v9, p25

    move-object/from16 v10, p27

    const-string v11, "cid"

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "id"

    invoke-static {p2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "type"

    invoke-static {p3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "messages"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "members"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "watchers"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "read"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "config"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "team"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "pinned_messages"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "own_capabilities"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "active_live_locations"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "extraData"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    move-object/from16 p1, p4

    .line 5
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    move-object/from16 p1, p5

    .line 6
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    move/from16 p1, p6

    .line 7
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    move-object/from16 p1, p7

    .line 8
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    move/from16 p1, p8

    .line 9
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    move-object/from16 p1, p9

    .line 10
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    move-object/from16 p1, p10

    .line 11
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    move-object/from16 p1, p11

    .line 12
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    move-object/from16 p1, p12

    .line 13
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    move/from16 p1, p13

    .line 14
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    .line 15
    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    .line 16
    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    .line 17
    iput-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    .line 18
    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    .line 19
    iput-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    .line 21
    iput-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    move/from16 p1, p21

    .line 22
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    .line 23
    iput-object v7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    .line 24
    iput-object v8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    .line 26
    iput-object v9, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    move-object/from16 p1, p26

    .line 27
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    .line 28
    iput-object v10, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 31

    move/from16 v0, p28

    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v9, v2

    goto :goto_0

    :cond_0
    move/from16 v9, p6

    :goto_0
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_1

    move/from16 v16, v2

    goto :goto_1

    :cond_1
    move/from16 v16, p13

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    .line 29
    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_2

    move-object/from16 v17, v3

    goto :goto_2

    :cond_2
    move-object/from16 v17, p14

    :goto_2
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_3

    move-object/from16 v18, v3

    goto :goto_3

    :cond_3
    move-object/from16 v18, p15

    :goto_3
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    move-object/from16 v19, v3

    goto :goto_4

    :cond_4
    move-object/from16 v19, p16

    :goto_4
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    move-object/from16 v20, v3

    goto :goto_5

    :cond_5
    move-object/from16 v20, p17

    :goto_5
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    .line 30
    const-string v1, ""

    move-object/from16 v23, v1

    goto :goto_6

    :cond_6
    move-object/from16 v23, p20

    :goto_6
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move/from16 v24, v2

    goto :goto_7

    :cond_7
    move/from16 v24, p21

    :goto_7
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v25, v3

    goto :goto_8

    :cond_8
    move-object/from16 v25, p22

    :goto_8
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v26, v3

    goto :goto_9

    :cond_9
    move-object/from16 v26, p23

    :goto_9
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v28, v3

    goto :goto_a

    :cond_a
    move-object/from16 v28, p25

    :goto_a
    const/high16 v1, 0x2000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    move-object/from16 v29, v0

    :goto_b
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v10, p7

    move/from16 v11, p8

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    move-object/from16 v27, p24

    move-object/from16 v30, p27

    goto :goto_c

    :cond_b
    move-object/from16 v29, p26

    goto :goto_b

    .line 31
    :goto_c
    invoke-direct/range {v3 .. v30}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p28

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p28, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p28, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p28, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p28, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p28, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p28, v16

    move/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p28, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p28, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p28, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p28, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p28, v16

    if-eqz v16, :cond_1a

    move-object/from16 p12, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    move-object/from16 p27, p12

    move-object/from16 p28, v1

    :goto_1a
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1b

    :cond_1a
    move-object/from16 p28, p27

    move-object/from16 p27, v1

    goto :goto_1a

    :goto_1b
    invoke-virtual/range {p1 .. p28}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    return v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    return-object v0
.end method

.method public final component19()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    return v0
.end method

.method public final component22()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    return-object v0
.end method

.method public final component25()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    return-object v0
.end method

.method public final component26()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component27()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    return v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;"
        }
    .end annotation

    const-string v0, "cid"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watchers"

    move-object/from16 v5, p16

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "read"

    move-object/from16 v6, p17

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    move-object/from16 v7, p18

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "team"

    move-object/from16 v8, p20

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinned_messages"

    move-object/from16 v9, p22

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "own_capabilities"

    move-object/from16 v10, p23

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "active_live_locations"

    move-object/from16 v11, p25

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v12, p27

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v20, p19

    move/from16 v22, p21

    move-object/from16 v25, p24

    move-object/from16 v27, p26

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v21, v8

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v28, v12

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v28}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    return v2

    :cond_1c
    return v0
.end method

.method public final getActive_live_locations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamLocationDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getConfig()Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    return-object v0
.end method

.method public final getCooldown()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    return v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final getDeleted_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getFilter_tags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    return-object v0
.end method

.method public final getFrozen()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast_message_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getMember_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    return v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getMembership()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    return-object v0
.end method

.method public final getMessage_count()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwn_capabilities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    return-object v0
.end method

.method public final getPinned_messages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    return-object v0
.end method

.method public final getRead()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getWatcher_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    return v0
.end method

.method public final getWatchers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

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

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cid:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->id:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->type:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->name:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->image:Ljava/lang/String;

    iget v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watcher_count:I

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->filter_tags:Ljava/util/List;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->frozen:Z

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->last_message_at:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_at:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->deleted_at:Ljava/util/Date;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->updated_at:Ljava/util/Date;

    iget v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->member_count:I

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->messages:Ljava/util/List;

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->members:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->watchers:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->read:Ljava/util/List;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->config:Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->team:Ljava/lang/String;

    move-object/from16 v21, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->cooldown:I

    move/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->pinned_messages:Ljava/util/List;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->own_capabilities:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->membership:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMemberDto;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->active_live_locations:Ljava/util/List;

    move-object/from16 v26, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->message_count:Ljava/lang/Integer;

    move-object/from16 v27, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->extraData:Ljava/util/Map;

    const-string v0, ", id="

    move-object/from16 v28, v15

    const-string v15, ", type="

    move-object/from16 v29, v14

    const-string v14, "DownstreamChannelDto(cid="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    const-string v2, ", image="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", watcher_count="

    const-string v2, ", filter_tags="

    invoke-static {v6, v5, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", frozen="

    const-string v2, ", last_message_at="

    invoke-static {v1, v2, v0, v7, v8}, Lnh3/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Z)V

    const-string v1, ", created_at="

    const-string v2, ", deleted_at="

    invoke-static {v0, v9, v1, v10, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", updated_at="

    const-string v2, ", member_count="

    invoke-static {v0, v11, v1, v12, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", watchers="

    const-string v2, ", read="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", config="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created_by="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", team="

    const-string v2, ", cooldown="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld13/a;->q(Ljava/lang/StringBuilder;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pinned_messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", own_capabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", active_live_locations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v28

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
