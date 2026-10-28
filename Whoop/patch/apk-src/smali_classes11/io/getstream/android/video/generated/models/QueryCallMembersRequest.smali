.class public final Lio/getstream/android/video/generated/models/QueryCallMembersRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0018\u0008\u0003\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH\u00c6\u0003Jr\u0010\"\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0018\u0008\u0003\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R!\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0012\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/QueryCallMembersRequest;",
        "",
        "id",
        "",
        "type",
        "limit",
        "",
        "next",
        "prev",
        "sort",
        "",
        "Lio/getstream/android/video/generated/models/SortParamRequest;",
        "filterConditions",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V",
        "getFilterConditions",
        "()Ljava/util/Map;",
        "getId",
        "()Ljava/lang/String;",
        "getLimit",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getNext",
        "getPrev",
        "getSort",
        "()Ljava/util/List;",
        "getType",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/android/video/generated/models/QueryCallMembersRequest;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final filterConditions:Ljava/util/Map;
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

.field private final limit:Ljava/lang/Integer;

.field private final next:Ljava/lang/String;

.field private final prev:Ljava/lang/String;

.field private final sort:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SortParamRequest;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "limit"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "sort"
        .end annotation
    .end param
    .param p7    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "filter_conditions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SortParamRequest;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    .line 8
    iput-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_3

    .line 9
    sget-object p6, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    .line 10
    sget-object p7, Lm83/z;->w:Lm83/z;

    :cond_4
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 11
    invoke-direct/range {p1 .. p8}, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/QueryCallMembersRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/QueryCallMembersRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/android/video/generated/models/QueryCallMembersRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SortParamRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/android/video/generated/models/QueryCallMembersRequest;
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "limit"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "next"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "prev"
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "sort"
        .end annotation
    .end param
    .param p7    # Ljava/util/Map;
        .annotation runtime Lqx/q;
            name = "filter_conditions"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SortParamRequest;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/android/video/generated/models/QueryCallMembersRequest;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getFilterConditions()Ljava/util/Map;
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

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrev()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    return-object v0
.end method

.method public final getSort()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/SortParamRequest;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

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

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->id:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->type:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->limit:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->next:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->prev:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->sort:Ljava/util/List;

    iget-object v6, p0, Lio/getstream/android/video/generated/models/QueryCallMembersRequest;->filterConditions:Ljava/util/Map;

    const-string v7, ", type="

    const-string v8, ", limit="

    const-string v9, "QueryCallMembersRequest(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", next="

    const-string v7, ", prev="

    invoke-static {v2, v1, v3, v7, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", sort="

    const-string v2, ", filterConditions="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
