.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;",
        "",
        "message",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;",
        "channel_cid",
        "",
        "quoted_message",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "parent_id",
        "parent_message",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V",
        "getMessage",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;",
        "getChannel_cid",
        "()Ljava/lang/String;",
        "getQuoted_message",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;",
        "getParent_id",
        "getParent_message",
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
        "",
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
.field private final channel_cid:Ljava/lang/String;

.field private final message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

.field private final parent_id:Ljava/lang/String;

.field private final parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

.field private final quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;-><init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->copy(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel_cid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;-><init>(Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChannel_cid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessage()Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    return-object v0
.end method

.method public final getParent_id()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getParent_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public final getQuoted_message()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftMessageDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->channel_cid:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->quoted_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_id:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamDraftDto;->parent_message:Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DownstreamDraftDto(message="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel_cid="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", quoted_message="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parent_id="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", parent_message="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
