.class public final Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;
.super Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\tH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0008\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;",
        "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;",
        "type",
        "",
        "created_at",
        "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "user",
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "rawData",
        "",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)V",
        "getType",
        "()Ljava/lang/String;",
        "getCreated_at",
        "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
        "getUser",
        "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
        "getRawData",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
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
.field private final created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

.field private final rawData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/String;

.field private final user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;",
            "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;",
            "Ljava/util/Map<",
            "**>;)",
            "Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "created_at"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCreated_at()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    return-object v0
.end method

.method public final getRawData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    invoke-static {v2, v0, v1}, Lc13/a;->d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->created_at:Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->user:Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;->rawData:Ljava/util/Map;

    const-string v4, ", created_at="

    const-string v5, ", user="

    const-string v6, "UnknownEventDto(type="

    invoke-static {v6, v0, v4, v1, v5}, Ld13/a;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
