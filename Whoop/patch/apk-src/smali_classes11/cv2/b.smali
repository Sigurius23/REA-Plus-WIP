.class public final Lcv2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwr2/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000cR \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010!\u001a\u0004\u0008\u0018\u0010\"R \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\n0 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010!\u001a\u0004\u0008$\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "Lcv2/b;",
        "Lwr2/d;",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "exercise",
        "",
        "isSelected",
        "<init>",
        "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)V",
        "d",
        "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)Lcv2/b;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "g",
        "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;",
        "b",
        "Z",
        "i",
        "()Z",
        "c",
        "Ljava/lang/String;",
        "e",
        "userFacingText",
        "",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "userFacingKeywords",
        "h",
        "metadataKeywords",
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
.field private final a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

.field private final b:Z

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)V
    .locals 1

    const-string v0, "exercise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iput-boolean p2, p0, Lcv2/b;->b:Z

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getName()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcv2/b;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getNameKeywords()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcv2/b;->d:Ljava/util/List;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getMetadataKeywords()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcv2/b;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic f(Lcv2/b;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;ZILjava/lang/Object;)Lcv2/b;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcv2/b;->b:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcv2/b;->d(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)Lcv2/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge a()Lyb3/p;
    .locals 1

    invoke-super {p0}, Lwr2/d;->a()Lyb3/p;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcv2/b;->d:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic c()Ljava/lang/Iterable;
    .locals 1

    invoke-virtual {p0}, Lcv2/b;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0
.end method

.method public final d(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)Lcv2/b;
    .locals 1

    const-string v0, "exercise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcv2/b;

    invoke-direct {v0, p1, p2}, Lcv2/b;-><init>(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)V

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcv2/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcv2/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcv2/b;

    iget-object v1, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-object v3, p1, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcv2/b;->b:Z

    iget-boolean p1, p1, Lcv2/b;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final g()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;
    .locals 1

    iget-object v0, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcv2/b;->e:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcv2/b;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcv2/b;->b:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcv2/b;->a:Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    iget-boolean v1, p0, Lcv2/b;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ExerciseListItem(exercise="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
