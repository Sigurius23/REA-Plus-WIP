.class public final Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;
.super Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u000fH\u00c6\u0003J\t\u00102\u001a\u00020\u000fH\u00c6\u0003J\t\u00103\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\u0099\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000fH\u00c6\u0001J\u0013\u00107\u001a\u0002082\u0008\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\u000fH\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0017R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "type",
        "",
        "created_at",
        "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "cid",
        "channel_type",
        "channel_id",
        "first_unread_message_id",
        "last_read_message_id",
        "last_read_at",
        "unread_messages",
        "",
        "total_unread_count",
        "unread_channels",
        "thread_id",
        "unread_threads",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreated_at",
        "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getCid",
        "getChannel_type",
        "getChannel_id",
        "getFirst_unread_message_id",
        "getLast_read_message_id",
        "getLast_read_at",
        "getUnread_messages",
        "()I",
        "getTotal_unread_count",
        "getUnread_channels",
        "getThread_id",
        "getUnread_threads",
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
        "copy",
        "equals",
        "",
        "other",
        "",
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
.field private final channel_id:Ljava/lang/String;

.field private final channel_type:Ljava/lang/String;

.field private final cid:Ljava/lang/String;

.field private final created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final first_unread_message_id:Ljava/lang/String;

.field private final last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final last_read_message_id:Ljava/lang/String;

.field private final thread_id:Ljava/lang/String;

.field private final total_unread_count:I

.field private final type:Ljava/lang/String;

.field private final unread_channels:I

.field private final unread_messages:I

.field private final unread_threads:I

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "first_unread_message_id"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last_read_at"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    .line 12
    iput p10, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    .line 13
    iput p11, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    .line 14
    iput p12, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    .line 15
    iput-object p13, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    .line 16
    iput p14, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p15

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v15, v1

    goto :goto_0

    :cond_0
    move-object/from16 v15, p13

    :goto_0
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move/from16 v16, v0

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    goto :goto_2

    :cond_1
    move/from16 v16, p14

    goto :goto_1

    .line 1
    :goto_2
    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;IILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget v10, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget v11, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget v12, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    goto :goto_b

    :cond_b
    move/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    move/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    return v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;
    .locals 16

    const-string v0, "type"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_type"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "first_unread_message_id"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last_read_at"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;IIILjava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    iget p1, p1, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getChannel_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannel_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getFirst_unread_message_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast_read_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getLast_read_message_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getThread_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotal_unread_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnread_channels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    return v0
.end method

.method public final getUnread_messages()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    return v0
.end method

.method public final getUnread_threads()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    return v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v2, v0, v1}, Lc13/a;->c(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

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

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->type:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->cid:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_type:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->channel_id:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->first_unread_message_id:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_message_id:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->last_read_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget v10, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_messages:I

    iget v11, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->total_unread_count:I

    iget v12, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_channels:I

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->thread_id:Ljava/lang/String;

    iget v14, v0, Lio/getstream/chat/android/client/api2/model/dto/NotificationMarkUnreadEventDto;->unread_threads:I

    const-string v15, ", created_at="

    const-string v0, ", user="

    move/from16 v16, v14

    const-string v14, "NotificationMarkUnreadEventDto(type="

    invoke-static {v14, v1, v15, v2, v0}, Ld13/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cid="

    const-string v2, ", channel_type="

    invoke-static {v0, v3, v1, v4, v2}, Ld13/a;->q(Ljava/lang/StringBuilder;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", channel_id="

    const-string v2, ", first_unread_message_id="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", last_read_message_id="

    const-string v2, ", last_read_at="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unread_messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", total_unread_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unread_channels="

    const-string v2, ", thread_id="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unread_threads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
