.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;",
        "",
        "sets",
        "",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "exerciseDetails",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V",
        "getSets",
        "()Ljava/util/List;",
        "getExerciseDetails",
        "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

.field private final sets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ")V"
        }
    .end annotation

    const-string v0, "sets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->copy(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            ")",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;"
        }
    .end annotation

    const-string v0, "sets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    invoke-direct {v0, p1, p2}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getExerciseDetails()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object v0
.end method

.method public final getSets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->sets:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;->exerciseDetails:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WeightliftingWorkoutExercise(sets="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exerciseDetails="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
