.class public final Lio/getstream/android/video/generated/models/ReportResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/ReportResponse;",
        "",
        "call",
        "Lio/getstream/android/video/generated/models/CallReportResponse;",
        "participants",
        "Lio/getstream/android/video/generated/models/ParticipantReportResponse;",
        "userRatings",
        "Lio/getstream/android/video/generated/models/UserRatingReportResponse;",
        "(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)V",
        "getCall",
        "()Lio/getstream/android/video/generated/models/CallReportResponse;",
        "getParticipants",
        "()Lio/getstream/android/video/generated/models/ParticipantReportResponse;",
        "getUserRatings",
        "()Lio/getstream/android/video/generated/models/UserRatingReportResponse;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final call:Lio/getstream/android/video/generated/models/CallReportResponse;

.field private final participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

.field private final userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)V
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/CallReportResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/ParticipantReportResponse;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserRatingReportResponse;
        .annotation runtime Lqx/q;
            name = "user_ratings"
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRatings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    iput-object p3, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/ReportResponse;Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/ReportResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ReportResponse;->copy(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)Lio/getstream/android/video/generated/models/ReportResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/android/video/generated/models/CallReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    return-object v0
.end method

.method public final component2()Lio/getstream/android/video/generated/models/ParticipantReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/UserRatingReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    return-object v0
.end method

.method public final copy(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)Lio/getstream/android/video/generated/models/ReportResponse;
    .locals 1
    .param p1    # Lio/getstream/android/video/generated/models/CallReportResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p2    # Lio/getstream/android/video/generated/models/ParticipantReportResponse;
        .annotation runtime Lqx/q;
            name = "participants"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/UserRatingReportResponse;
        .annotation runtime Lqx/q;
            name = "user_ratings"
        .end annotation
    .end param

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRatings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/ReportResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/android/video/generated/models/ReportResponse;-><init>(Lio/getstream/android/video/generated/models/CallReportResponse;Lio/getstream/android/video/generated/models/ParticipantReportResponse;Lio/getstream/android/video/generated/models/UserRatingReportResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/ReportResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/ReportResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    return-object v0
.end method

.method public final getParticipants()Lio/getstream/android/video/generated/models/ParticipantReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    return-object v0
.end method

.method public final getUserRatings()Lio/getstream/android/video/generated/models/UserRatingReportResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallReportResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/ParticipantReportResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserRatingReportResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/android/video/generated/models/ReportResponse;->call:Lio/getstream/android/video/generated/models/CallReportResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/ReportResponse;->participants:Lio/getstream/android/video/generated/models/ParticipantReportResponse;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/ReportResponse;->userRatings:Lio/getstream/android/video/generated/models/UserRatingReportResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ReportResponse(call="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", participants="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userRatings="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
