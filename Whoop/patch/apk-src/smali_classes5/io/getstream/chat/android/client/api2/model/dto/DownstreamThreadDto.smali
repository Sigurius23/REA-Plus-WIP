.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u00086\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00cd\u0001\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\tH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010I\u001a\u00020\tH\u00c6\u0003J\u000f\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010K\u001a\u00020\u0013H\u00c6\u0003J\t\u0010L\u001a\u00020\u0007H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\t\u0010R\u001a\u00020\tH\u00c6\u0003J\u0015\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0003J\u00fa\u0001\u0010T\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\t2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00122\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001d\u001a\u00020\t2\u0014\u0008\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fH\u00c6\u0001\u00a2\u0006\u0002\u0010UJ\u0013\u0010V\u001a\u00020W2\u0008\u0010X\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00d6\u0001J\t\u0010Z\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\u0008#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010+R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0011\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00104R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\u0008;\u0010$R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00104R\u0011\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010)R\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010+R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@\u00a8\u0006["
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "active_participant_count",
        "",
        "channel",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "channel_cid",
        "",
        "created_at",
        "Ljava/util/Date;",
        "created_by",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "created_by_user_id",
        "deleted_at",
        "draft",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "last_message_at",
        "latest_replies",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "parent_message",
        "parent_message_id",
        "participant_count",
        "read",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
        "reply_count",
        "thread_participants",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
        "title",
        "updated_at",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V",
        "getActive_participant_count",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getChannel",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
        "getChannel_cid",
        "()Ljava/lang/String;",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getCreated_by",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getCreated_by_user_id",
        "getDeleted_at",
        "getDraft",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "getLast_message_at",
        "getLatest_replies",
        "()Ljava/util/List;",
        "getParent_message",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "getParent_message_id",
        "getParticipant_count",
        "()I",
        "getRead",
        "getReply_count",
        "getThread_participants",
        "getTitle",
        "getUpdated_at",
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
        "copy",
        "(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;",
        "equals",
        "",
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
.field private final active_participant_count:Ljava/lang/Integer;

.field private final channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

.field private final channel_cid:Ljava/lang/String;

.field private final created_at:Ljava/util/Date;

.field private final created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

.field private final created_by_user_id:Ljava/lang/String;

.field private final deleted_at:Ljava/util/Date;

.field private final draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

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

.field private final last_message_at:Ljava/util/Date;

.field private final latest_replies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

.field private final parent_message_id:Ljava/lang/String;

.field private final participant_count:I

.field private final read:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;"
        }
    .end annotation
.end field

.field private final reply_count:Ljava/lang/Integer;

.field private final thread_participants:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final updated_at:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p9

    move-object/from16 v1, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p17

    move-object/from16 v5, p18

    move-object/from16 v6, p19

    const-string v7, "channel_cid"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "created_at"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "created_by_user_id"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "last_message_at"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "latest_replies"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "parent_message"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "parent_message_id"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "title"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "updated_at"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "extraData"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    move-object p1, p7

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    move-object/from16 p1, p8

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iput-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    move/from16 p1, p13

    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    move-object/from16 p1, p14

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    move-object/from16 p1, p15

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    move-object/from16 p1, p16

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    iput-object v5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    iput-object v6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->copy(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    return v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component19()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelUserRead;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;"
        }
    .end annotation

    const-string v0, "channel_cid"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_by_user_id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last_message_at"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest_replies"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent_message"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent_message_id"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    move-object/from16 v2, p18

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v3, p19

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v20}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;-><init>(Ljava/lang/Integer;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Ljava/util/Date;Ljava/util/List;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getActive_participant_count()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getChannel()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    return-object v0
.end method

.method public final getChannel_cid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final getCreated_by_user_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleted_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getDraft()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getLast_message_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getLatest_replies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    return-object v0
.end method

.method public final getParent_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final getParent_message_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipant_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    return v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    return-object v0
.end method

.method public final getReply_count()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getThread_participants()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadParticipantDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    invoke-static {v3, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    invoke-static {v3, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    invoke-static {v3, v2, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    if-nez v3, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v0, v2}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->active_participant_count:Ljava/lang/Integer;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel:Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->channel_cid:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_at:Ljava/util/Date;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->created_by_user_id:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->deleted_at:Ljava/util/Date;

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->draft:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->last_message_at:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->latest_replies:Ljava/util/List;

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->parent_message_id:Ljava/lang/String;

    iget v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->participant_count:I

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->read:Ljava/util/List;

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->reply_count:Ljava/lang/Integer;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->thread_participants:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->title:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->updated_at:Ljava/util/Date;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadDto;->extraData:Ljava/util/Map;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v20, v15

    const-string v15, "DownstreamThreadDto(active_participant_count="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channel_cid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", created_at="

    const-string v2, ", created_by="

    invoke-static {v0, v3, v1, v4, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", created_by_user_id="

    const-string v2, ", deleted_at="

    invoke-static {v0, v5, v1, v6, v2}, Ld13/a;->q(Ljava/lang/StringBuilder;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", draft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last_message_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latest_replies="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", parent_message_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", participant_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reply_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", thread_participants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updated_at="

    const-string v2, ", extraData="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lev/n;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ")"

    move-object/from16 v2, v20

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
