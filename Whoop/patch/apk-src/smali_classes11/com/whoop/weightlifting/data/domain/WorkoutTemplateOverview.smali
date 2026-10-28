.class public final Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003JB\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u00d6\u0081\u0004J\n\u0010 \u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;",
        "",
        "workoutTemplateKey",
        "",
        "name",
        "",
        "userId",
        "createdAt",
        "updatedAt",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V",
        "getWorkoutTemplateKey",
        "()J",
        "getName",
        "()Ljava/lang/String;",
        "getUserId",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getCreatedAt",
        "getUpdatedAt",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final createdAt:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final updatedAt:Ljava/lang/String;

.field private final userId:Ljava/lang/Long;

.field private final workoutTemplateKey:J


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->copy(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;
    .locals 8

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;

    iget-wide v3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getWorkoutTemplateKey()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->workoutTemplateKey:J

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->userId:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->createdAt:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateOverview;->updatedAt:Ljava/lang/String;

    const-string v6, "WorkoutTemplateOverview(workoutTemplateKey="

    const-string v7, ", name="

    invoke-static {v6, v7, v0, v1, v2}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ")"

    invoke-static {v0, v1, v5, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
