.class public final Lio/getstream/android/video/generated/models/CallReportResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000cJ2\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001a\u001a\u0004\u0008\u001b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001c\u001a\u0004\u0008\u001e\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallReportResponse;",
        "",
        "",
        "score",
        "Ljg3/i;",
        "endedAt",
        "startedAt",
        "<init>",
        "(FLjg3/i;Ljg3/i;)V",
        "component1",
        "()F",
        "component2",
        "()Ljg3/i;",
        "component3",
        "copy",
        "(FLjg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallReportResponse;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "getScore",
        "Ljg3/i;",
        "getEndedAt",
        "getStartedAt",
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
.field private final endedAt:Ljg3/i;

.field private final score:F

.field private final startedAt:Ljg3/i;


# direct methods
.method public constructor <init>(FLjg3/i;Ljg3/i;)V
    .locals 0
    .param p1    # F
        .annotation runtime Lqx/q;
            name = "score"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    return-void
.end method

.method public synthetic constructor <init>(FLjg3/i;Ljg3/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/CallReportResponse;-><init>(FLjg3/i;Ljg3/i;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallReportResponse;FLjg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallReportResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/CallReportResponse;->copy(FLjg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallReportResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    return v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final component3()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public final copy(FLjg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallReportResponse;
    .locals 1
    .param p1    # F
        .annotation runtime Lqx/q;
            name = "score"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "ended_at"
        .end annotation
    .end param
    .param p3    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "started_at"
        .end annotation
    .end param

    new-instance v0, Lio/getstream/android/video/generated/models/CallReportResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/CallReportResponse;-><init>(FLjg3/i;Ljg3/i;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallReportResponse;

    iget v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    iget v3, p1, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEndedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    return-object v0
.end method

.method public final getScore()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    return v0
.end method

.method public final getStartedAt()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->score:F

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->endedAt:Ljg3/i;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallReportResponse;->startedAt:Ljg3/i;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CallReportResponse(score="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", endedAt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startedAt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
