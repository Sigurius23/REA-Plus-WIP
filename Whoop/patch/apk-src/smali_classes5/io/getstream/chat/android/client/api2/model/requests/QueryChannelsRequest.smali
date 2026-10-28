.class public final Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008*\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\u0012\u0008\u0002\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u0012\u001c\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0013\u0010(\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003H\u00c6\u0003J\u001d\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u00101\u001a\u00020\u0010H\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\t\u00103\u001a\u00020\u0010H\u00c6\u0003J\u00c6\u0001\u00104\u001a\u00020\u00002\u0012\u0008\u0002\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00032\u001c\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00102\u0008\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u000bH\u00d6\u0001J\t\u00109\u001a\u00020\u0006H\u00d6\u0001R\u001b\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R%\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u001f\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008 \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008#\u0010!R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010%\u00a8\u0006:"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
        "",
        "filter_conditions",
        "",
        "sort",
        "",
        "",
        "predefined_filter",
        "filter_values",
        "sort_values",
        "offset",
        "",
        "limit",
        "message_limit",
        "member_limit",
        "state",
        "",
        "watch",
        "presence",
        "<init>",
        "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V",
        "getFilter_conditions",
        "()Ljava/util/Map;",
        "getSort",
        "()Ljava/util/List;",
        "getPredefined_filter",
        "()Ljava/lang/String;",
        "getFilter_values",
        "getSort_values",
        "getOffset",
        "()I",
        "getLimit",
        "getMessage_limit",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getMember_limit",
        "getState",
        "()Z",
        "getWatch",
        "getPresence",
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
        "copy",
        "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;",
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
.field private final filter_conditions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end field

.field private final filter_values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final limit:I

.field private final member_limit:Ljava/lang/Integer;

.field private final message_limit:Ljava/lang/Integer;

.field private final offset:I

.field private final predefined_filter:Ljava/lang/String;

.field private final presence:Z

.field private final sort:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sort_values:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Z

.field private final watch:Z


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;II",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    .line 7
    iput p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    .line 8
    iput p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    .line 11
    iput-boolean p10, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    .line 12
    iput-boolean p11, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    .line 13
    iput-boolean p12, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x1

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p13, 0x10

    if-eqz p13, :cond_4

    move p13, p12

    move p12, p11

    move p11, p10

    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move p7, p6

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p13, p12

    move p12, p11

    move p11, p10

    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move p7, p6

    move-object p6, p5

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p13}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p10, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-boolean p11, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-boolean p12, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    :cond_b
    move p13, p11

    move p14, p12

    move-object p11, p9

    move p12, p10

    move p9, p7

    move-object p10, p8

    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->copy(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    return v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;II",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "ZZZ)",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getFilter_conditions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    return-object v0
.end method

.method public final getFilter_values()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    return v0
.end method

.method public final getMember_limit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMessage_limit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    return v0
.end method

.method public final getPredefined_filter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    return-object v0
.end method

.method public final getPresence()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    return v0
.end method

.method public final getSort()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getSort_values()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    return-object v0
.end method

.method public final getState()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    return v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

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

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    if-nez v3, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_conditions:Ljava/util/Map;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->predefined_filter:Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->filter_values:Ljava/util/Map;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->sort_values:Ljava/util/Map;

    iget v5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->offset:I

    iget v6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->limit:I

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->message_limit:Ljava/lang/Integer;

    iget-object v8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->member_limit:Ljava/lang/Integer;

    iget-boolean v9, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->state:Z

    iget-boolean v10, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->watch:Z

    iget-boolean v11, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;->presence:Z

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "QueryChannelsRequest(filter_conditions="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", predefined_filter="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", filter_values="

    const-string v1, ", sort_values="

    invoke-static {v12, v2, v0, v3, v1}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", message_limit="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", member_limit="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", watch="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", presence="

    const-string v1, ")"

    invoke-static {v12, v10, v0, v11, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
