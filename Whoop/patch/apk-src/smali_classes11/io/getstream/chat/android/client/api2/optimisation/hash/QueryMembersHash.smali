.class public final Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000eH\u00c6\u0003J[\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000eH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006*"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;",
        "",
        "channelType",
        "",
        "channelId",
        "offset",
        "",
        "limit",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "getOffset",
        "()I",
        "getLimit",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getMembers",
        "()Ljava/util/List;",
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


# instance fields
.field private final channelId:Ljava/lang/String;

.field private final channelType:Ljava/lang/String;

.field private final filter:Lio/getstream/chat/android/models/FilterObject;

.field private final limit:I

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field

.field private final offset:I

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    iput p4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    iput-object p6, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p7, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->copy(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    return v0
.end method

.method public final component5()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component6()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;-><init>(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    return v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    return v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelType:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->channelId:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->offset:I

    iget v3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->limit:I

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v5, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v6, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;->members:Ljava/util/List;

    const-string v7, ", channelId="

    const-string v8, ", offset="

    const-string v9, "QueryMembersHash(channelType="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", limit="

    const-string v7, ", filter="

    invoke-static {v0, v2, v1, v3, v7}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
