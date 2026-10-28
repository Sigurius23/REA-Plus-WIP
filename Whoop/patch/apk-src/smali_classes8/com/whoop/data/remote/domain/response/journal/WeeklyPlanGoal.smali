.class public final Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;",
        "",
        "circularProgressIndicator",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "isAvoided",
        "",
        "<init>",
        "(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)V",
        "getCircularProgressIndicator",
        "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
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
.field private final circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

.field private final isAvoided:Z


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;ZILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->copy(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    return v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;-><init>(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    iget-boolean p1, p1, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isAvoided()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WeeklyPlanGoal(circularProgressIndicator="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAvoided="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
