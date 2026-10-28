.class public final Lvu2/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvu2/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvu2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008\u001b\u0010\u000cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0015\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lvu2/f$f;",
        "Lvu2/f;",
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "exerciseDetails",
        "",
        "openEntryPoint",
        "requestedExerciseId",
        "Luu2/m;",
        "analyticsContext",
        "<init>",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "b",
        "()Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "Ljava/lang/String;",
        "c",
        "d",
        "Luu2/m;",
        "()Luu2/m;",
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
.field private final a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Luu2/m;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;)V
    .locals 1

    const-string v0, "exerciseDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestedExerciseId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iput-object p2, p0, Lvu2/f$f;->b:Ljava/lang/String;

    iput-object p3, p0, Lvu2/f$f;->c:Ljava/lang/String;

    iput-object p4, p0, Lvu2/f$f;->d:Luu2/m;

    return-void
.end method


# virtual methods
.method public final a()Luu2/m;
    .locals 1

    iget-object v0, p0, Lvu2/f$f;->d:Luu2/m;

    return-object v0
.end method

.method public final b()Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;
    .locals 1

    iget-object v0, p0, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvu2/f$f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvu2/f$f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvu2/f$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvu2/f$f;

    iget-object v1, p0, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iget-object v3, p1, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvu2/f$f;->b:Ljava/lang/String;

    iget-object v3, p1, Lvu2/f$f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvu2/f$f;->c:Ljava/lang/String;

    iget-object v3, p1, Lvu2/f$f;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lvu2/f$f;->d:Luu2/m;

    iget-object p1, p1, Lvu2/f$f;->d:Luu2/m;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lvu2/f$f;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lvu2/f$f;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lvu2/f$f;->d:Luu2/m;

    invoke-virtual {v1}, Luu2/m;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lvu2/f$f;->a:Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iget-object v1, p0, Lvu2/f$f;->b:Ljava/lang/String;

    iget-object v2, p0, Lvu2/f$f;->c:Ljava/lang/String;

    iget-object v3, p0, Lvu2/f$f;->d:Luu2/m;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LoadSucceeded(exerciseDetails="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", openEntryPoint="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", requestedExerciseId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticsContext="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
