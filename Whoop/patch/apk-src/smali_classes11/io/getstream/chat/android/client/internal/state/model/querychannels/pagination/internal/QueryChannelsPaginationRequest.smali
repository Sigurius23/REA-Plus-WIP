.class public final Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B;\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JA\u0010\u001b\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015\u00a8\u0006!"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;",
        "",
        "sort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "channelOffset",
        "",
        "channelLimit",
        "messageLimit",
        "memberLimit",
        "<init>",
        "(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getChannelOffset",
        "()I",
        "getChannelLimit",
        "getMessageLimit",
        "getMemberLimit",
        "isFirstPage",
        "",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final channelLimit:I

.field private final channelOffset:I

.field private final memberLimit:I

.field private final messageLimit:I

.field private final sort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;IIII)V"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 3
    iput p2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    .line 4
    iput p3, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    .line 5
    iput p4, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    .line 6
    iput p5, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/querysort/QuerySorter;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/16 p3, 0x1e

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/16 p4, 0xa

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v4, p4

    move v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;-><init>(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;Lio/getstream/chat/android/models/querysort/QuerySorter;IIIIILjava/lang/Object;)Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->copy(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;IIII)",
            "Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;-><init>(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    iget v3, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    iget p1, p1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChannelLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    return v0
.end method

.method public final getChannelOffset()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    return v0
.end method

.method public final getMemberLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    return v0
.end method

.method public final getMessageLimit()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    return v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isFirstPage()Z
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->sort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget v1, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelOffset:I

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->channelLimit:I

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->messageLimit:I

    iget v4, p0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;->memberLimit:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "QueryChannelsPaginationRequest(sort="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channelOffset="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", channelLimit="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", messageLimit="

    const-string v1, ", memberLimit="

    invoke-static {v5, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
