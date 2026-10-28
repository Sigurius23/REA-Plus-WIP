.class public final Lfu2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000b\u00a8\u0006\u0019"
    }
    d2 = {
        "Lfu2/h;",
        "",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "workoutTemplate",
        "",
        "linkedActivityId",
        "<init>",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)V",
        "a",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)Lfu2/h;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "d",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
        "b",
        "Ljava/lang/String;",
        "c",
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
.field private final a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)V
    .locals 1

    const-string v0, "workoutTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    iput-object p2, p0, Lfu2/h;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Lfu2/h;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;ILjava/lang/Object;)Lfu2/h;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lfu2/h;->b:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lfu2/h;->a(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)Lfu2/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)Lfu2/h;
    .locals 1

    const-string v0, "workoutTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfu2/h;

    invoke-direct {v0, p1, p2}, Lfu2/h;-><init>(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfu2/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;
    .locals 1

    iget-object v0, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfu2/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfu2/h;

    iget-object v1, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    iget-object v3, p1, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfu2/h;->b:Ljava/lang/String;

    iget-object p1, p1, Lfu2/h;->b:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lfu2/h;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfu2/h;->a:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    iget-object v1, p0, Lfu2/h;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StrengthTrainerDomainState(workoutTemplate="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", linkedActivityId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
