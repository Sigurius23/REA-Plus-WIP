.class public final Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008$\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0012\u0008\u0002\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u0012\u001c\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010 \u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003H\u00c6\u0003J\u001d\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0008H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u0085\u0001\u0010)\u001a\u00020\u00002\u0012\u0008\u0002\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00032\u001c\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00082\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\nH\u00d6\u0001J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001R\u001b\u0010\u0002\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R%\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;",
        "",
        "filter",
        "",
        "sort",
        "",
        "",
        "watch",
        "",
        "limit",
        "",
        "member_limit",
        "next",
        "participant_limit",
        "prev",
        "reply_limit",
        "<init>",
        "(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)V",
        "getFilter",
        "()Ljava/util/Map;",
        "getSort",
        "()Ljava/util/List;",
        "getWatch",
        "()Z",
        "getLimit",
        "()I",
        "getMember_limit",
        "getNext",
        "()Ljava/lang/String;",
        "getParticipant_limit",
        "getPrev",
        "getReply_limit",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
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
.field private final filter:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end field

.field private final limit:I

.field private final member_limit:I

.field private final next:Ljava/lang/String;

.field private final participant_limit:I

.field private final prev:Ljava/lang/String;

.field private final reply_limit:I

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

.field private final watch:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;-><init>(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)V
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
            ">;>;ZII",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    .line 6
    iput p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    .line 7
    iput p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    .line 9
    iput p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    .line 10
    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    .line 11
    iput p9, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    const/4 p3, 0x1

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    const/16 p4, 0xa

    :cond_3
    and-int/lit8 p11, p10, 0x10

    const/16 v1, 0x64

    if-eqz p11, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    const/4 p9, 0x2

    :cond_8
    move p10, p9

    move-object p9, p8

    move p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p10}, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;-><init>(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;IILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    :cond_8
    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->copy(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    return v0
.end method

.method public final copy(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;
    .locals 10
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
            ">;>;ZII",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "I)",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;-><init>(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    iget p1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFilter()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    return v0
.end method

.method public final getMember_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    return v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getParticipant_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    return v0
.end method

.method public final getPrev()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final getReply_limit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getWatch()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

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

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->filter:Ljava/util/Map;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->sort:Ljava/util/List;

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->watch:Z

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->limit:I

    iget v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->member_limit:I

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->next:Ljava/lang/String;

    iget v6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->participant_limit:I

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->prev:Ljava/lang/String;

    iget v8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;->reply_limit:I

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "QueryThreadsRequest(filter="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", watch="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    const-string v1, ", member_limit="

    invoke-static {v3, v0, v1, v9, v2}, Lr;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v0, ", next="

    const-string v1, ", participant_limit="

    invoke-static {v4, v0, v5, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ", prev="

    const-string v1, ", reply_limit="

    invoke-static {v6, v0, v7, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
