.class public final Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001c\u001a\u0004\u0008\u001d\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u001c\u001a\u0004\u0008\u001f\u0010\r\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;",
        "",
        "",
        "maxPoints",
        "Ljg3/i;",
        "since",
        "stepSeconds",
        "until",
        "<init>",
        "(ILjg3/i;ILjg3/i;)V",
        "component1",
        "()I",
        "component2",
        "()Ljg3/i;",
        "component3",
        "component4",
        "copy",
        "(ILjg3/i;ILjg3/i;)Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getMaxPoints",
        "Ljg3/i;",
        "getSince",
        "getStepSeconds",
        "getUntil",
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
.field private final maxPoints:I

.field private final since:Ljg3/i;

.field private final stepSeconds:I

.field private final until:Ljg3/i;


# direct methods
.method public constructor <init>(ILjg3/i;ILjg3/i;)V
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "max_points"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "since"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "step_seconds"
        .end annotation
    .end param
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "until"
        .end annotation
    .end param

    const-string v0, "since"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "until"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    iput-object p2, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    iput p3, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    iput-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;ILjg3/i;ILjg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->copy(ILjg3/i;ILjg3/i;)Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    return v0
.end method

.method public final component2()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    return v0
.end method

.method public final component4()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    return-object v0
.end method

.method public final copy(ILjg3/i;ILjg3/i;)Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;
    .locals 1
    .param p1    # I
        .annotation runtime Lqx/q;
            name = "max_points"
        .end annotation
    .end param
    .param p2    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "since"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "step_seconds"
        .end annotation
    .end param
    .param p4    # Ljg3/i;
        .annotation runtime Lqx/q;
            name = "until"
        .end annotation
    .end param

    const-string v0, "since"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "until"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;-><init>(ILjg3/i;ILjg3/i;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;

    iget v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    iget v3, p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    iget v3, p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMaxPoints()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    return v0
.end method

.method public final getSince()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    return-object v0
.end method

.method public final getStepSeconds()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    return v0
.end method

.method public final getUntil()Ljg3/i;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    invoke-virtual {v1}, Ljg3/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->maxPoints:I

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->since:Ljg3/i;

    iget v2, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->stepSeconds:I

    iget-object v3, p0, Lio/getstream/android/video/generated/models/ParticipantSeriesTimeframe;->until:Ljg3/i;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ParticipantSeriesTimeframe(maxPoints="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", since="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stepSeconds="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", until="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
