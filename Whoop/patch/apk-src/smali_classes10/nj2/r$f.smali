.class public final Lnj2/r$f;
.super Lnj2/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj2/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lnj2/r$f;",
        "Lnj2/r;",
        "Lcom/whoop/stress/domain/model/StressIntervention;",
        "intervention",
        "",
        "totalRounds",
        "<init>",
        "(Lcom/whoop/stress/domain/model/StressIntervention;I)V",
        "a",
        "(Lcom/whoop/stress/domain/model/StressIntervention;I)Lnj2/r$f;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/stress/domain/model/StressIntervention;",
        "b",
        "()Lcom/whoop/stress/domain/model/StressIntervention;",
        "I",
        "c",
        "stress_release"
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
.field private final a:Lcom/whoop/stress/domain/model/StressIntervention;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/whoop/stress/domain/model/StressIntervention;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnj2/r;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    iput p2, p0, Lnj2/r$f;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/stress/domain/model/StressIntervention;I)Lnj2/r$f;
    .locals 1

    new-instance v0, Lnj2/r$f;

    invoke-direct {v0, p1, p2}, Lnj2/r$f;-><init>(Lcom/whoop/stress/domain/model/StressIntervention;I)V

    return-object v0
.end method

.method public final b()Lcom/whoop/stress/domain/model/StressIntervention;
    .locals 1

    iget-object v0, p0, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lnj2/r$f;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnj2/r$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnj2/r$f;

    iget-object v1, p0, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v3, p1, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lnj2/r$f;->b:I

    iget p1, p1, Lnj2/r$f;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/StressIntervention;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnj2/r$f;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lnj2/r$f;->a:Lcom/whoop/stress/domain/model/StressIntervention;

    iget v1, p0, Lnj2/r$f;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StartNextCycle(intervention="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", totalRounds="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
