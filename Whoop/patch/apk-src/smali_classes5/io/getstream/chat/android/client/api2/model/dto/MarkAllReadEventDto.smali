.class public final Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;
.super Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J;\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\tH\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "type",
        "",
        "created_at",
        "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "total_unread_count",
        "",
        "unread_channels",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreated_at",
        "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getTotal_unread_count",
        "()I",
        "getUnread_channels",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "",
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
.field private final created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final total_unread_count:I

.field private final type:Ljava/lang/String;

.field private final unread_channels:I

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    .line 6
    iput p4, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    .line 7
    iput p5, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move p6, v0

    :goto_0
    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move p6, p5

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;IIILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;
    .locals 7

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    iget p1, p1, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCreated_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getTotal_unread_count()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    return v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnread_channels()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    return v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v2, v0, v1}, Lc13/a;->c(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget v3, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->total_unread_count:I

    iget v4, p0, Lio/getstream/chat/android/client/api2/model/dto/MarkAllReadEventDto;->unread_channels:I

    const-string v5, ", created_at="

    const-string v6, ", user="

    const-string v7, "MarkAllReadEventDto(type="

    invoke-static {v7, v0, v5, v1, v6}, Ld13/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total_unread_count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", unread_channels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
