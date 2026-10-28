.class public final Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008G\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0008\u0012\u0006\u0010\u0013\u001a\u00020\u0008\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0015\u001a\u00020\u0008\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010!\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\"\u0010#J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0008H\u00c6\u0003J\t\u0010I\u001a\u00020\u0008H\u00c6\u0003J\t\u0010J\u001a\u00020\u0008H\u00c6\u0003J\t\u0010K\u001a\u00020\u0008H\u00c6\u0003J\t\u0010L\u001a\u00020\u0008H\u00c6\u0003J\t\u0010M\u001a\u00020\u0008H\u00c6\u0003J\t\u0010N\u001a\u00020\u0008H\u00c6\u0003J\t\u0010O\u001a\u00020\u0008H\u00c6\u0003J\t\u0010P\u001a\u00020\u0008H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0008H\u00c6\u0003J\t\u0010R\u001a\u00020\u0008H\u00c6\u0003J\t\u0010S\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u00107J\t\u0010U\u001a\u00020\u0008H\u00c6\u0003J\t\u0010V\u001a\u00020\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020\u0018H\u00c6\u0003J\t\u0010X\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u00107J\u0010\u0010]\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u00107J\t\u0010^\u001a\u00020\u0008H\u00c6\u0003J\u00a6\u0002\u0010_\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00082\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00062\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010!\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010`J\u0013\u0010a\u001a\u00020\u00082\u0008\u0010b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010d\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010*R\u0011\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010*R\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010*R\u0011\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010*R\u0011\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010*R\u0011\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010*R\u0011\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010*R\u0011\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010*R\u0011\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010*R\u0011\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010*R\u0011\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\u00086\u00107R\u0011\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010*R\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010(R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010(R\u0011\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010(R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010AR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\u0008B\u00107R\u0015\u0010 \u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\u0008C\u00107R\u0011\u0010!\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010*\u00a8\u0006e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
        "",
        "created_at",
        "Ljava/util/Date;",
        "updated_at",
        "name",
        "",
        "typing_events",
        "",
        "read_events",
        "delivery_events",
        "connect_events",
        "search",
        "reactions",
        "replies",
        "mutes",
        "uploads",
        "url_enrichment",
        "custom_events",
        "push_notifications",
        "skip_last_msg_update_for_system_msgs",
        "polls",
        "message_retention",
        "max_message_length",
        "",
        "automod",
        "automod_behavior",
        "blocklist_behavior",
        "commands",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
        "user_message_reminders",
        "shared_locations",
        "mark_messages_pending",
        "<init>",
        "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getUpdated_at",
        "getName",
        "()Ljava/lang/String;",
        "getTyping_events",
        "()Z",
        "getRead_events",
        "getDelivery_events",
        "getConnect_events",
        "getSearch",
        "getReactions",
        "getReplies",
        "getMutes",
        "getUploads",
        "getUrl_enrichment",
        "getCustom_events",
        "getPush_notifications",
        "getSkip_last_msg_update_for_system_msgs",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getPolls",
        "getMessage_retention",
        "getMax_message_length",
        "()I",
        "getAutomod",
        "getAutomod_behavior",
        "getBlocklist_behavior",
        "getCommands",
        "()Ljava/util/List;",
        "getUser_message_reminders",
        "getShared_locations",
        "getMark_messages_pending",
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
        "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;",
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
.field private final automod:Ljava/lang/String;

.field private final automod_behavior:Ljava/lang/String;

.field private final blocklist_behavior:Ljava/lang/String;

.field private final commands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
            ">;"
        }
    .end annotation
.end field

.field private final connect_events:Z

.field private final created_at:Ljava/util/Date;

.field private final custom_events:Z

.field private final delivery_events:Z

.field private final mark_messages_pending:Z

.field private final max_message_length:I

.field private final message_retention:Ljava/lang/String;

.field private final mutes:Z

.field private final name:Ljava/lang/String;

.field private final polls:Z

.field private final push_notifications:Z

.field private final reactions:Z

.field private final read_events:Z

.field private final replies:Z

.field private final search:Z

.field private final shared_locations:Ljava/lang/Boolean;

.field private final skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

.field private final typing_events:Z

.field private final updated_at:Ljava/util/Date;

.field private final uploads:Z

.field private final url_enrichment:Z

.field private final user_message_reminders:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "ZZZZZZZZZZZZ",
            "Ljava/lang/Boolean;",
            "Z",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p18

    move-object/from16 v1, p20

    move-object/from16 v2, p21

    move-object/from16 v3, p23

    const-string v4, "message_retention"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "automod"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "automod_behavior"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "commands"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    .line 6
    iput-boolean p5, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    .line 7
    iput-boolean p6, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    .line 8
    iput-boolean p7, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    .line 9
    iput-boolean p8, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    .line 10
    iput-boolean p9, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    .line 11
    iput-boolean p10, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    move/from16 p1, p11

    .line 12
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    move/from16 p1, p12

    .line 13
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    move/from16 p1, p13

    .line 14
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    move/from16 p1, p14

    .line 15
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    move/from16 p1, p15

    .line 16
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    move/from16 p1, p17

    .line 18
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    .line 19
    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    move/from16 p1, p19

    .line 20
    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    .line 21
    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    .line 22
    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    .line 24
    iput-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    move-object/from16 p1, p24

    .line 25
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    move-object/from16 p1, p25

    .line 26
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    move/from16 p1, p26

    .line 27
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 28

    and-int/lit8 v0, p27, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v7, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v27, p26

    goto :goto_1

    :cond_0
    move/from16 v7, p6

    goto :goto_0

    .line 28
    :goto_1
    invoke-direct/range {v1 .. v27}, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ZILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p27

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p27, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p27, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p27, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p27, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p27, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p27, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p27, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p27, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p27, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p27, v16

    if-eqz v16, :cond_19

    move-object/from16 p11, v1

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    move-object/from16 p26, p11

    move/from16 p27, v1

    :goto_19
    move-object/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1a

    :cond_19
    move/from16 p27, p26

    move-object/from16 p26, v1

    goto :goto_19

    :goto_1a
    invoke-virtual/range {p1 .. p27}, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->copy(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    return v0
.end method

.method public final component16()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    return v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component25()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    return v0
.end method

.method public final copy(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "ZZZZZZZZZZZZ",
            "Ljava/lang/Boolean;",
            "Z",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Z)",
            "Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;"
        }
    .end annotation

    const-string v0, "message_retention"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "automod"

    move-object/from16 v2, p20

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "automod_behavior"

    move-object/from16 v3, p21

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commands"

    move-object/from16 v4, p23

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v23, p22

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v27, p26

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    move-object/from16 v24, v4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v27}, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZLjava/lang/Boolean;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    if-eq v1, p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final getAutomod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomod_behavior()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    return-object v0
.end method

.method public final getBlocklist_behavior()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    return-object v0
.end method

.method public final getCommands()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/CommandDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    return-object v0
.end method

.method public final getConnect_events()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    return v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getCustom_events()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    return v0
.end method

.method public final getDelivery_events()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    return v0
.end method

.method public final getMark_messages_pending()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    return v0
.end method

.method public final getMax_message_length()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    return v0
.end method

.method public final getMessage_retention()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    return-object v0
.end method

.method public final getMutes()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPolls()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    return v0
.end method

.method public final getPush_notifications()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    return v0
.end method

.method public final getReactions()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    return v0
.end method

.method public final getRead_events()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    return v0
.end method

.method public final getReplies()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    return v0
.end method

.method public final getSearch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    return v0
.end method

.method public final getShared_locations()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSkip_last_msg_update_for_system_msgs()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTyping_events()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    return v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getUploads()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    return v0
.end method

.method public final getUrl_enrichment()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    return v0
.end method

.method public final getUser_message_reminders()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    if-nez v3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->created_at:Ljava/util/Date;

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->updated_at:Ljava/util/Date;

    iget-object v3, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->name:Ljava/lang/String;

    iget-boolean v4, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->typing_events:Z

    iget-boolean v5, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->read_events:Z

    iget-boolean v6, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->delivery_events:Z

    iget-boolean v7, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->connect_events:Z

    iget-boolean v8, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->search:Z

    iget-boolean v9, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->reactions:Z

    iget-boolean v10, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->replies:Z

    iget-boolean v11, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mutes:Z

    iget-boolean v12, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->uploads:Z

    iget-boolean v13, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->url_enrichment:Z

    iget-boolean v14, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->custom_events:Z

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->push_notifications:Z

    move/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->skip_last_msg_update_for_system_msgs:Ljava/lang/Boolean;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->polls:Z

    move/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->message_retention:Ljava/lang/String;

    move-object/from16 v19, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->max_message_length:I

    move/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->automod_behavior:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->blocklist_behavior:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->commands:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->user_message_reminders:Ljava/lang/Boolean;

    move-object/from16 v25, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->shared_locations:Ljava/lang/Boolean;

    move-object/from16 v26, v15

    iget-boolean v15, v0, Lio/getstream/chat/android/client/api2/model/dto/ConfigDto;->mark_messages_pending:Z

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v27, v15

    const-string v15, "ConfigDto(created_at="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updated_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typing_events="

    const-string v2, ", read_events="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", delivery_events="

    const-string v2, ", connect_events="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", search="

    const-string v2, ", reactions="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", replies="

    const-string v2, ", mutes="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", uploads="

    const-string v2, ", url_enrichment="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", custom_events="

    const-string v2, ", push_notifications="

    invoke-static {v0, v13, v1, v14, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", skip_last_msg_update_for_system_msgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", polls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", message_retention="

    const-string v2, ", max_message_length="

    move/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", automod="

    const-string v2, ", automod_behavior="

    move/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v3, v1, v4, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", blocklist_behavior="

    const-string v2, ", commands="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", user_message_reminders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shared_locations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mark_messages_pending="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
