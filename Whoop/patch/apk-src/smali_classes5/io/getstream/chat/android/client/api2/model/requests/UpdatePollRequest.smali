.class public final Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008%\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0015\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u009e\u0001\u00102\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00032\u0008\u00105\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u00106\u001a\u00020\u000bH\u00d6\u0001J\t\u00107\u001a\u00020\u0006H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u0017R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\t\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&\u00a8\u00068"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;",
        "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;",
        "allow_answers",
        "",
        "allow_user_suggested_options",
        "description",
        "",
        "enforce_unique_vote",
        "id",
        "is_closed",
        "max_votes_allowed",
        "",
        "name",
        "options",
        "",
        "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
        "voting_visibility",
        "extraData",
        "",
        "",
        "<init>",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V",
        "getAllow_answers",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getAllow_user_suggested_options",
        "getDescription",
        "()Ljava/lang/String;",
        "getEnforce_unique_vote",
        "getId",
        "getMax_votes_allowed",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getName",
        "getOptions",
        "()Ljava/util/List;",
        "getVoting_visibility",
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
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;",
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
.field private final allow_answers:Ljava/lang/Boolean;

.field private final allow_user_suggested_options:Ljava/lang/Boolean;

.field private final description:Ljava/lang/String;

.field private final enforce_unique_vote:Ljava/lang/Boolean;

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

.field private final max_votes_allowed:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final voting_visibility:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    iput-object p10, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    iput-object p11, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAllow_answers()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAllow_user_suggested_options()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnforce_unique_vote()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMax_votes_allowed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/requests/UpstreamOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    return-object v0
.end method

.method public final getVoting_visibility()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

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

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    if-nez v3, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final is_closed()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_answers:Ljava/lang/Boolean;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->allow_user_suggested_options:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->description:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->enforce_unique_vote:Ljava/lang/Boolean;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->id:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->is_closed:Ljava/lang/Boolean;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->max_votes_allowed:Ljava/lang/Integer;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->name:Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->options:Ljava/util/List;

    iget-object v9, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->voting_visibility:Ljava/lang/String;

    iget-object v10, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdatePollRequest;->extraData:Ljava/util/Map;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "UpdatePollRequest(allow_answers="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allow_user_suggested_options="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", enforce_unique_vote="

    const-string v1, ", id="

    invoke-static {v3, v2, v0, v1, v11}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", is_closed="

    const-string v1, ", max_votes_allowed="

    invoke-static {v5, v4, v0, v1, v11}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", name="

    const-string v1, ", options="

    invoke-static {v6, v0, v7, v1, v11}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", voting_visibility="

    const-string v1, ", extraData="

    invoke-static {v0, v9, v1, v11, v8}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
