.class public final Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;",
        "",
        "count",
        "",
        "sum_scores",
        "first_reaction_at",
        "Ljava/util/Date;",
        "last_reaction_at",
        "<init>",
        "(IILjava/util/Date;Ljava/util/Date;)V",
        "getCount",
        "()I",
        "getSum_scores",
        "getFirst_reaction_at",
        "()Ljava/util/Date;",
        "getLast_reaction_at",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
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

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final count:I

.field private final first_reaction_at:Ljava/util/Date;

.field private final last_reaction_at:Ljava/util/Date;

.field private final sum_scores:I


# direct methods
.method public constructor <init>(IILjava/util/Date;Ljava/util/Date;)V
    .locals 1

    const-string v0, "first_reaction_at"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last_reaction_at"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    iput p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;IILjava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->copy(IILjava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    return v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(IILjava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;
    .locals 1

    const-string v0, "first_reaction_at"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "last_reaction_at"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;-><init>(IILjava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    iget v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    return v0
.end method

.method public final getFirst_reaction_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getLast_reaction_at()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    return-object v0
.end method

.method public final getSum_scores()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->count:I

    iget v1, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->sum_scores:I

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->first_reaction_at:Ljava/util/Date;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionGroupDto;->last_reaction_at:Ljava/util/Date;

    const-string v4, ", sum_scores="

    const-string v5, ", first_reaction_at="

    const-string v6, "DownstreamReactionGroupDto(count="

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last_reaction_at="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
