.class public final Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003J\u001b\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000bH\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000bH\u00c6\u0003Jo\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u001a\u0008\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000bH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;",
        "",
        "type",
        "",
        "id",
        "filter_conditions",
        "",
        "offset",
        "",
        "limit",
        "sort",
        "",
        "members",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)V",
        "getType",
        "()Ljava/lang/String;",
        "getId",
        "getFilter_conditions",
        "()Ljava/util/Map;",
        "getOffset",
        "()I",
        "getLimit",
        "getSort",
        "()Ljava/util/List;",
        "getMembers",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
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
.field private final filter_conditions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final limit:I

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
            ">;"
        }
    .end annotation
.end field

.field private final offset:I

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

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;II",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter_conditions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    iput p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    iput p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    return v0
.end method

.method public final component6()Ljava/util/List;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;II",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter_conditions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    return v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

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

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->filter_conditions:Ljava/util/Map;

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->offset:I

    iget v4, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->limit:I

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->sort:Ljava/util/List;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;->members:Ljava/util/List;

    const-string v7, ", id="

    const-string v8, ", filter_conditions="

    const-string v9, "QueryMembersRequest(type="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
