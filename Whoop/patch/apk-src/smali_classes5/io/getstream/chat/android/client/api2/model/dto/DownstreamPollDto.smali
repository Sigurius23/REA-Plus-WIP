.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008=\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00fb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u000c\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0012\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0008\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000c\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020 \u0018\u00010\u0015\u00a2\u0006\u0004\u0008!\u0010\"J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010G\u001a\u00020\u000cH\u00c6\u0003J\t\u0010H\u001a\u00020\u000cH\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u000cH\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u001d\u0010M\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u00108J\t\u0010O\u001a\u00020\u000cH\u00c6\u0003J\u000f\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0012H\u00c6\u0003J\u000f\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010R\u001a\u00020\u0008H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020 \u0018\u00010\u0015H\u00c6\u0003J\u00ac\u0002\u0010W\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u001c\u0008\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00122\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00062\u0016\u0008\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000c2\u0016\u0008\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020 \u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00032\u0008\u0010Z\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010[\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\\\u001a\u00020\u000cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010$R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010-R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u0008\u0010\u00101R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R%\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\u00087\u00108R\u0011\u0010\u0017\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010-R\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00104R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00104R\u0011\u0010\u001b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010)R\u0011\u0010\u001c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\'R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010-R\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020 \u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00106\u00a8\u0006]"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "allow_answers",
        "",
        "allow_user_suggested_options",
        "answers_count",
        "",
        "created_at",
        "Ljava/util/Date;",
        "created_by",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "created_by_id",
        "",
        "description",
        "enforce_unique_vote",
        "id",
        "is_closed",
        "latest_answers",
        "",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
        "latest_votes_by_option",
        "",
        "max_votes_allowed",
        "name",
        "options",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
        "own_votes",
        "updated_at",
        "vote_count",
        "vote_counts_by_option",
        "voting_visibility",
        "extraData",
        "",
        "<init>",
        "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V",
        "getAllow_answers",
        "()Z",
        "getAllow_user_suggested_options",
        "getAnswers_count",
        "()I",
        "getCreated_at",
        "()Ljava/util/Date;",
        "getCreated_by",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getCreated_by_id",
        "()Ljava/lang/String;",
        "getDescription",
        "getEnforce_unique_vote",
        "getId",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getLatest_answers",
        "()Ljava/util/List;",
        "getLatest_votes_by_option",
        "()Ljava/util/Map;",
        "getMax_votes_allowed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getName",
        "getOptions",
        "getOwn_votes",
        "getUpdated_at",
        "getVote_count",
        "getVote_counts_by_option",
        "getVoting_visibility",
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
        "copy",
        "(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;",
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
.field private final allow_answers:Z

.field private final allow_user_suggested_options:Z

.field private final answers_count:I

.field private final created_at:Ljava/util/Date;

.field private final created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

.field private final created_by_id:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final enforce_unique_vote:Z

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

.field private final is_closed:Ljava/lang/Boolean;

.field private final latest_answers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation
.end field

.field private final latest_votes_by_option:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;"
        }
    .end annotation
.end field

.field private final max_votes_allowed:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final own_votes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation
.end field

.field private final updated_at:Ljava/util/Date;

.field private final vote_count:I

.field private final vote_counts_by_option:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final voting_visibility:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZI",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object v0, p9

    move-object/from16 v1, p14

    move-object/from16 v2, p15

    move-object/from16 v3, p16

    move-object/from16 v4, p17

    const-string v5, "created_at"

    invoke-static {p4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "created_by_id"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "description"

    invoke-static {p7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "id"

    invoke-static {p9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "options"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "own_votes"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "updated_at"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    iput-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    iput p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    iput-boolean p8, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    iput-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    move-object/from16 p1, p10

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    move-object/from16 p1, p11

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    move-object/from16 p1, p12

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    move-object/from16 p1, p13

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    iput-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    iput-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    iput-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    iput-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    move/from16 p1, p18

    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    move-object/from16 p1, p19

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    move-object/from16 p1, p20

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p22, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p22, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p22, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p22, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p22, v16

    if-eqz v16, :cond_14

    move-object/from16 p6, v1

    iget-object v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    move-object/from16 p21, p6

    move-object/from16 p22, v1

    :goto_14
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_15

    :cond_14
    move-object/from16 p22, p21

    move-object/from16 p21, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p22}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->copy(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    return v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    return v0
.end method

.method public final component19()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    return v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZI",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;"
        }
    .end annotation

    const-string v0, "created_at"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_by_id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "own_votes"

    move-object/from16 v2, p16

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updated_at"

    move-object/from16 v3, p17

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    move/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-direct/range {v1 .. v22}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;-><init>(ZZILjava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;ILjava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getAllow_answers()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    return v0
.end method

.method public final getAllow_user_suggested_options()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    return v0
.end method

.method public final getAnswers_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    return v0
.end method

.method public final getCreated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_by()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final getCreated_by_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforce_unique_vote()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    return v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatest_answers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    return-object v0
.end method

.method public final getLatest_votes_by_option()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    return-object v0
.end method

.method public final getMax_votes_allowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getOwn_votes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamVoteDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    return-object v0
.end method

.method public final getUpdated_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getVote_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    return v0
.end method

.method public final getVote_counts_by_option()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    return-object v0
.end method

.method public final getVoting_visibility()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public final is_closed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_answers:Z

    iget-boolean v2, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->allow_user_suggested_options:Z

    iget v3, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->answers_count:I

    iget-object v4, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_at:Ljava/util/Date;

    iget-object v5, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v6, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->created_by_id:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->description:Ljava/lang/String;

    iget-boolean v8, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->enforce_unique_vote:Z

    iget-object v9, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->id:Ljava/lang/String;

    iget-object v10, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->is_closed:Ljava/lang/Boolean;

    iget-object v11, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_answers:Ljava/util/List;

    iget-object v12, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->latest_votes_by_option:Ljava/util/Map;

    iget-object v13, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v14, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->name:Ljava/lang/String;

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->options:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->own_votes:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->updated_at:Ljava/util/Date;

    move-object/from16 v18, v15

    iget v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_count:I

    move/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->vote_counts_by_option:Ljava/util/Map;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->voting_visibility:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamPollDto;->extraData:Ljava/util/Map;

    const-string v0, ", allow_user_suggested_options="

    move-object/from16 v22, v15

    const-string v15, ", answers_count="

    move-object/from16 v23, v13

    const-string v13, "DownstreamPollDto(allow_answers="

    invoke-static {v13, v0, v15, v1, v2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", created_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created_by="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", created_by_id="

    const-string v2, ", description="

    invoke-static {v0, v5, v1, v6, v2}, Ld13/a;->q(Ljava/lang/StringBuilder;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", enforce_unique_vote="

    const-string v2, ", id="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", is_closed="

    const-string v2, ", latest_answers="

    invoke-static {v10, v9, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latest_votes_by_option="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", max_votes_allowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    const-string v2, ", options="

    move-object/from16 v3, v23

    invoke-static {v3, v1, v14, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", own_votes="

    const-string v2, ", updated_at="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vote_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", vote_counts_by_option="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", voting_visibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", extraData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v22

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
