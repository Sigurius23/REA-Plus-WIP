.class public final Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u000c\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;",
        "",
        "completedCount",
        "",
        "lockedCount",
        "totalCount",
        "<init>",
        "(III)V",
        "getCompletedCount",
        "()I",
        "getLockedCount",
        "getTotalCount",
        "toTasklistProgressDomainModel",
        "Lcom/whoop/data/remote/domain/dto/gamification/TasklistProgress;",
        "component1",
        "component2",
        "component3",
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
.field private final completedCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tasks_completed_count"
    .end annotation
.end field

.field private final lockedCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tasks_locked_count"
    .end annotation
.end field

.field private final totalCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_tasks_count"
    .end annotation
.end field


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    iput p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;IIIILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->copy(III)Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    return v0
.end method

.method public final copy(III)Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;-><init>(III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    iget p1, p1, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCompletedCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    return v0
.end method

.method public final getLockedCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    return v0
.end method

.method public final getTotalCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    const-string v3, ", lockedCount="

    const-string v4, ", totalCount="

    const-string v5, "ProgressDto(completedCount="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toTasklistProgressDomainModel()Lcom/whoop/data/remote/domain/dto/gamification/TasklistProgress;
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/dto/gamification/TasklistProgress;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->completedCount:I

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->lockedCount:I

    iget v3, p0, Lcom/whoop/data/remote/domain/dto/gamification/ProgressDto;->totalCount:I

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/data/remote/domain/dto/gamification/TasklistProgress;-><init>(III)V

    return-object v0
.end method
