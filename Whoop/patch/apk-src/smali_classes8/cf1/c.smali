.class public final Lcf1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcf1/c;",
        "",
        "Lcf1/a;",
        "currentDialogType",
        "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "response",
        "",
        "selectedIndex",
        "<init>",
        "(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)V",
        "a",
        "(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)Lcf1/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcf1/a;",
        "c",
        "()Lcf1/a;",
        "b",
        "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "d",
        "()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;",
        "Ljava/lang/Integer;",
        "e",
        "()Ljava/lang/Integer;",
        "exercise-progress-mini-arch_release"
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
.field private final a:Lcf1/a;

.field private final b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

.field private final c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcf1/c;->a:Lcf1/a;

    .line 3
    iput-object p2, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    .line 4
    iput-object p3, p0, Lcf1/c;->c:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic b(Lcf1/c;Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILjava/lang/Object;)Lcf1/c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcf1/c;->a:Lcf1/a;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcf1/c;->c:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcf1/c;->a(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)Lcf1/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)Lcf1/c;
    .locals 1

    new-instance v0, Lcf1/c;

    invoke-direct {v0, p1, p2, p3}, Lcf1/c;-><init>(Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final c()Lcf1/a;
    .locals 1

    iget-object v0, p0, Lcf1/c;->a:Lcf1/a;

    return-object v0
.end method

.method public final d()Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;
    .locals 1

    iget-object v0, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcf1/c;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcf1/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcf1/c;

    iget-object v1, p0, Lcf1/c;->a:Lcf1/a;

    iget-object v3, p1, Lcf1/c;->a:Lcf1/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    iget-object v3, p1, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcf1/c;->c:Ljava/lang/Integer;

    iget-object p1, p1, Lcf1/c;->c:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcf1/c;->a:Lcf1/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcf1/c;->c:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcf1/c;->a:Lcf1/a;

    iget-object v1, p0, Lcf1/c;->b:Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;

    iget-object v2, p0, Lcf1/c;->c:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ExerciseProgressDomainState(currentDialogType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedIndex="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
