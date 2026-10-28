.class public final Lcom/whoop/weightlifting/data/domain/FilterOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/FilterOptions;",
        "",
        "equipment",
        "",
        "Lcom/whoop/weightlifting/data/domain/FilterItem;",
        "muscleGroups",
        "movementPatterns",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "getEquipment",
        "()Ljava/util/List;",
        "getMuscleGroups",
        "getMovementPatterns",
        "component1",
        "component2",
        "component3",
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
.field private final equipment:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation
.end field

.field private final movementPatterns:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation
.end field

.field private final muscleGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "equipment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPatterns"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/FilterOptions;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/FilterOptions;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/FilterOptions;->copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weightlifting/data/domain/FilterOptions;

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
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/weightlifting/data/domain/FilterOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;)",
            "Lcom/whoop/weightlifting/data/domain/FilterOptions;"
        }
    .end annotation

    const-string v0, "equipment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "muscleGroups"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "movementPatterns"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/FilterOptions;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/FilterOptions;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/FilterOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/FilterOptions;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEquipment()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    return-object v0
.end method

.method public final getMovementPatterns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    return-object v0
.end method

.method public final getMuscleGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/FilterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->equipment:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->muscleGroups:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/FilterOptions;->movementPatterns:Ljava/util/List;

    const-string v3, ", muscleGroups="

    const-string v4, ", movementPatterns="

    const-string v5, "FilterOptions(equipment="

    invoke-static {v5, v3, v0, v4, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
