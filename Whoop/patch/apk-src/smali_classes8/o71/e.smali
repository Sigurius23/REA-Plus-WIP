.class public final Lo71/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0013\u001a\u0004\u0008\u0012\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0013\u001a\u0004\u0008\u0017\u0010\r\u00a8\u0006\u001e"
    }
    d2 = {
        "Lo71/e;",
        "",
        "",
        "height",
        "weight",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unit",
        "<init>",
        "(IILcom/whoop/domain/model/UnitSystem;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "getHeight",
        "b",
        "getWeight",
        "c",
        "Lcom/whoop/domain/model/UnitSystem;",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "d",
        "heightInSelectedUnit",
        "e",
        "weightInSelectedUnit",
        "design_release"
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
.field private final a:I

.field private final b:I

.field private final c:Lcom/whoop/domain/model/UnitSystem;

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(IILcom/whoop/domain/model/UnitSystem;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo71/e;->a:I

    iput p2, p0, Lo71/e;->b:I

    iput-object p3, p0, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {p0}, Lo71/e;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p3

    invoke-static {p1, p3}, Lo71/g;->a(ILcom/whoop/domain/model/UnitSystem;)I

    move-result p1

    iput p1, p0, Lo71/e;->d:I

    invoke-virtual {p0}, Lo71/e;->b()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-static {p2, p1}, Lo71/g;->b(ILcom/whoop/domain/model/UnitSystem;)I

    move-result p1

    iput p1, p0, Lo71/e;->e:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lo71/e;->d:I

    return v0
.end method

.method public b()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lo71/e;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo71/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lo71/e;

    iget v1, p0, Lo71/e;->a:I

    iget v3, p1, Lo71/e;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lo71/e;->b:I

    iget v3, p1, Lo71/e;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    iget-object p1, p1, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lo71/e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lo71/e;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lo71/e;->a:I

    iget v1, p0, Lo71/e;->b:I

    iget-object v2, p0, Lo71/e;->c:Lcom/whoop/domain/model/UnitSystem;

    const-string v3, ", weight="

    const-string v4, ", unit="

    const-string v5, "UpdateHeightWeight(height="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
