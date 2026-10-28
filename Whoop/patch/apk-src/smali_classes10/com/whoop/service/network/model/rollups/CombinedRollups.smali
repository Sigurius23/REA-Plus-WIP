.class public final Lcom/whoop/service/network/model/rollups/CombinedRollups;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\tJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003JA\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0001J\u0014\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010%\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\'H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R$\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/service/network/model/rollups/CombinedRollups;",
        "",
        "recoveryRollups",
        "Lcom/whoop/service/network/model/rollups/RecoveryRollups;",
        "sleepRollups",
        "Lcom/whoop/service/network/model/rollups/SleepRollups;",
        "strainRollups",
        "Lcom/whoop/service/network/model/rollups/StrainRollups;",
        "userId",
        "",
        "workoutRollups",
        "",
        "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
        "<init>",
        "(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)V",
        "getRecoveryRollups",
        "()Lcom/whoop/service/network/model/rollups/RecoveryRollups;",
        "getSleepRollups",
        "()Lcom/whoop/service/network/model/rollups/SleepRollups;",
        "getStrainRollups",
        "()Lcom/whoop/service/network/model/rollups/StrainRollups;",
        "getUserId",
        "()I",
        "getWorkoutRollups",
        "()Ljava/util/List;",
        "setWorkoutRollups",
        "(Ljava/util/List;)V",
        "totalActivityCount",
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
.field private final recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recovery_rollups"
    .end annotation
.end field

.field private final sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_rollups"
    .end annotation
.end field

.field private final strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strain_rollups"
    .end annotation
.end field

.field private final userId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private workoutRollups:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_rollups"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/rollups/RecoveryRollups;",
            "Lcom/whoop/service/network/model/rollups/SleepRollups;",
            "Lcom/whoop/service/network/model/rollups/StrainRollups;",
            "I",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;)V"
        }
    .end annotation

    const-string v0, "recoveryRollups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepRollups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strainRollups"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutRollups"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    iput-object p2, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    iput-object p3, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    iput p4, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    iput-object p5, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    check-cast p5, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object p4, p3

    check-cast p4, Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    invoke-virtual {p4}, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->getSportId()I

    move-result p4

    const/16 p5, 0x45

    if-ne p4, p5, :cond_0

    invoke-interface {p1, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object p1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/rollups/CombinedRollups;Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;ILjava/lang/Object;)Lcom/whoop/service/network/model/rollups/CombinedRollups;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/service/network/model/rollups/CombinedRollups;->copy(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)Lcom/whoop/service/network/model/rollups/CombinedRollups;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/service/network/model/rollups/RecoveryRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    return-object v0
.end method

.method public final component2()Lcom/whoop/service/network/model/rollups/SleepRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    return-object v0
.end method

.method public final component3()Lcom/whoop/service/network/model/rollups/StrainRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)Lcom/whoop/service/network/model/rollups/CombinedRollups;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/rollups/RecoveryRollups;",
            "Lcom/whoop/service/network/model/rollups/SleepRollups;",
            "Lcom/whoop/service/network/model/rollups/StrainRollups;",
            "I",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;)",
            "Lcom/whoop/service/network/model/rollups/CombinedRollups;"
        }
    .end annotation

    const-string v0, "recoveryRollups"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepRollups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strainRollups"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutRollups"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/rollups/CombinedRollups;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/service/network/model/rollups/CombinedRollups;-><init>(Lcom/whoop/service/network/model/rollups/RecoveryRollups;Lcom/whoop/service/network/model/rollups/SleepRollups;Lcom/whoop/service/network/model/rollups/StrainRollups;ILjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;

    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    iget-object v3, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    iget-object v3, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    iget-object v3, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getRecoveryRollups()Lcom/whoop/service/network/model/rollups/RecoveryRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    return-object v0
.end method

.method public final getSleepRollups()Lcom/whoop/service/network/model/rollups/SleepRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    return-object v0
.end method

.method public final getStrainRollups()Lcom/whoop/service/network/model/rollups/StrainRollups;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    return v0
.end method

.method public final getWorkoutRollups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/rollups/RecoveryRollups;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    invoke-virtual {v2}, Lcom/whoop/service/network/model/rollups/SleepRollups;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/rollups/StrainRollups;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final setWorkoutRollups(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->recoveryRollups:Lcom/whoop/service/network/model/rollups/RecoveryRollups;

    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->sleepRollups:Lcom/whoop/service/network/model/rollups/SleepRollups;

    iget-object v2, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->strainRollups:Lcom/whoop/service/network/model/rollups/StrainRollups;

    iget v3, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->userId:I

    iget-object v4, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CombinedRollups(recoveryRollups="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepRollups="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strainRollups="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", workoutRollups="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final totalActivityCount()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/CombinedRollups;->workoutRollups:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    invoke-virtual {v2}, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->getWorkoutCount()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method
