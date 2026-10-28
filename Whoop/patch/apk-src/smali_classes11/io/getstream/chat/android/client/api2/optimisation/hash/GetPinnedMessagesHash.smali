.class public final Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;",
        "",
        "channelType",
        "",
        "channelId",
        "limit",
        "",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Message;",
        "pagination",
        "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)V",
        "getChannelType",
        "()Ljava/lang/String;",
        "getChannelId",
        "getLimit",
        "()I",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getPagination",
        "()Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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

.field private final limit:I

.field private final pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
            ")V"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iput-object p5, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->copy(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    return v0
.end method

.method public final component4()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
            ")",
            "Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;-><init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    return v0
.end method

.method public final getPagination()Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    return-object v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelType:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->channelId:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->limit:I

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/optimisation/hash/GetPinnedMessagesHash;->pagination:Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;

    const-string v5, ", channelId="

    const-string v6, ", limit="

    const-string v7, "GetPinnedMessagesHash(channelType="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pagination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
