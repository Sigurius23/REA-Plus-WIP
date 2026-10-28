.class public final Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "sets",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "exercise",
        "Ljava/util/UUID;",
        "exerciseId",
        "groupId",
        "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "withSingleExercise",
        "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;-><init>()V

    return-void
.end method

.method public static synthetic withSingleExercise$default(Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const-string v0, "randomUUID(...)"

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$Companion;->withSingleExercise(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutGroup$$serializer;

    return-object v0
.end method

.method public final withSingleExercise(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
            ">;",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
            "Ljava/util/UUID;",
            "Ljava/util/UUID;",
            ")",
            "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;"
        }
    .end annotation

    const-string v0, "sets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exercise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    new-instance v1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-direct {v1, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;-><init>(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Ljava/util/UUID;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;-><init>(Ljava/util/List;Ljava/util/UUID;)V

    return-object v0
.end method
