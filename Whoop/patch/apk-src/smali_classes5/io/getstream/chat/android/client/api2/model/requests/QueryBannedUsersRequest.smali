.class public final Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001Bm\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0011\u0010 \u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003H\u00c6\u0003J\u001b\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0084\u0001\u0010(\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00032\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0008H\u00d6\u0001J\t\u0010.\u001a\u00020\u0006H\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001c\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;",
        "",
        "filter_conditions",
        "",
        "sort",
        "",
        "",
        "offset",
        "",
        "limit",
        "created_at_after",
        "Ljava/util/Date;",
        "created_at_after_or_equal",
        "created_at_before",
        "created_at_before_or_equal",
        "<init>",
        "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V",
        "getFilter_conditions",
        "()Ljava/util/Map;",
        "setFilter_conditions",
        "(Ljava/util/Map;)V",
        "getSort",
        "()Ljava/util/List;",
        "getOffset",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLimit",
        "getCreated_at_after",
        "()Ljava/util/Date;",
        "getCreated_at_after_or_equal",
        "getCreated_at_before",
        "getCreated_at_before_or_equal",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;",
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
.field private final created_at_after:Ljava/util/Date;

.field private final created_at_after_or_equal:Ljava/util/Date;

.field private final created_at_before:Ljava/util/Date;

.field private final created_at_before_or_equal:Ljava/util/Date;

.field private filter_conditions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end field

.field private final limit:Ljava/lang/Integer;

.field private final offset:Ljava/lang/Integer;

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


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V
    .locals 1
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
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    const-string v0, "filter_conditions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    iput-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->copy(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    return-object v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;
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
            ">;>;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;"
        }
    .end annotation

    const-string v0, "filter_conditions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCreated_at_after()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_at_after_or_equal()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_at_before()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreated_at_before_or_equal()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    return-object v0
.end method

.method public final getLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOffset()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    return-object v0
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final setFilter_conditions(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->filter_conditions:Ljava/util/Map;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->sort:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->offset:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->limit:Ljava/lang/Integer;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after:Ljava/util/Date;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_after_or_equal:Ljava/util/Date;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before:Ljava/util/Date;

    iget-object v7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;->created_at_before_or_equal:Ljava/util/Date;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "QueryBannedUsersRequest(filter_conditions="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    const-string v1, ", created_at_after="

    invoke-static {v8, v2, v0, v3, v1}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v0, ", created_at_after_or_equal="

    const-string v1, ", created_at_before="

    invoke-static {v8, v4, v0, v5, v1}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", created_at_before_or_equal="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
