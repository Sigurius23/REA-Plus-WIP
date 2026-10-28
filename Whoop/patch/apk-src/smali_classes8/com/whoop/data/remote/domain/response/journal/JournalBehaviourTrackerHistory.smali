.class public final Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;",
        "",
        "behaviorTrackerId",
        "",
        "userId",
        "yesCount",
        "noCount",
        "trackerValue",
        "Lcom/whoop/data/remote/domain/response/journal/TrackerValue;",
        "<init>",
        "(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)V",
        "getBehaviorTrackerId",
        "()I",
        "getUserId",
        "getYesCount",
        "getNoCount",
        "getTrackerValue",
        "()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;",
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
        "",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final behaviorTrackerId:I

.field private final noCount:I

.field private final trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

.field private final userId:I

.field private final yesCount:I


# direct methods
.method public constructor <init>(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    iput p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    iput p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    iput p4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    iput-object p5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->copy(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    return v0
.end method

.method public final component5()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    return-object v0
.end method

.method public final copy(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;
    .locals 6

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;-><init>(IIIILcom/whoop/data/remote/domain/response/journal/TrackerValue;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;

    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    iget v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    iget v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    iget v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    iget v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBehaviorTrackerId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    return v0
.end method

.method public final getNoCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    return v0
.end method

.method public final getTrackerValue()Lcom/whoop/data/remote/domain/response/journal/TrackerValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    return v0
.end method

.method public final getYesCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/journal/TrackerValue;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->behaviorTrackerId:I

    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->userId:I

    iget v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->yesCount:I

    iget v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->noCount:I

    iget-object v4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;->trackerValue:Lcom/whoop/data/remote/domain/response/journal/TrackerValue;

    const-string v5, ", userId="

    const-string v6, ", yesCount="

    const-string v7, "JournalBehaviourTrackerHistory(behaviorTrackerId="

    invoke-static {v0, v1, v7, v5, v6}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", noCount="

    const-string v5, ", trackerValue="

    invoke-static {v0, v2, v1, v3, v5}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
