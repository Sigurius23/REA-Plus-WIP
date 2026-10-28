.class public final Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
        "",
        "behaviorTracker",
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "trackerInput",
        "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;",
        "<init>",
        "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)V",
        "getBehaviorTracker",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "getTrackerInput",
        "()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

.field private final trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->copy(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    return-object v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;-><init>(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBehaviorTracker()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    return-object v0
.end method

.method public final getTrackerInput()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/TrackerInput;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->behaviorTracker:Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;->trackerInput:Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TrackedBehavior(behaviorTracker="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackerInput="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
