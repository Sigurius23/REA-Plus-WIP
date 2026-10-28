.class public final Llu2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Llu2/e;",
        "",
        "Llu2/d;",
        "jsonFormat",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Llu2/d;Lrr2/c;)V",
        "",
        "serializedWorkout",
        "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
        "serializedWorkoutTemplate",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "workout",
        "c",
        "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)Ljava/lang/String;",
        "workoutTemplate",
        "d",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Ljava/lang/String;",
        "Llu2/d;",
        "Lrr2/c;",
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


# instance fields
.field private final a:Llu2/d;

.field private final b:Lrr2/c;


# direct methods
.method public constructor <init>(Llu2/d;Lrr2/c;)V
    .locals 1

    const-string v0, "jsonFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llu2/e;->a:Llu2/d;

    iput-object p2, p0, Llu2/e;->b:Lrr2/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    .locals 2

    const-string v0, "serializedWorkout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llu2/e;->a:Llu2/d;

    invoke-virtual {v0}, Llu2/d;->b()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Llu2/e;->b:Lrr2/c;

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
    .locals 2

    const-string v0, "serializedWorkoutTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llu2/e;->a:Llu2/d;

    invoke-virtual {v0}, Llu2/d;->b()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Llu2/e;->b:Lrr2/c;

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)Ljava/lang/String;
    .locals 2

    const-string v0, "workout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llu2/e;->a:Llu2/d;

    invoke-virtual {v0}, Llu2/d;->b()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->Companion:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Llu2/e;->b:Lrr2/c;

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Ljava/lang/String;
    .locals 2

    const-string v0, "workoutTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llu2/e;->a:Llu2/d;

    invoke-virtual {v0}, Llu2/d;->b()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Llu2/e;->b:Lrr2/c;

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method
