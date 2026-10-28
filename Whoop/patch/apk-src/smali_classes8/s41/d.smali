.class public final Ls41/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001e\u001a\u0004\u0008\u001a\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010!\u001a\u0004\u0008\u001d\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010!\u001a\u0004\u0008\u0016\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Ls41/d;",
        "",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
        "",
        "weightInPounds",
        "Li93/j;",
        "poundsRange",
        "kilogramsRange",
        "",
        "poundsLabel",
        "kilogramsLabel",
        "<init>",
        "(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/domain/model/UnitSystem;",
        "e",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "b",
        "I",
        "f",
        "c",
        "Li93/j;",
        "d",
        "()Li93/j;",
        "Ljava/lang/String;",
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


# static fields
.field public static final g:I = 0x8


# instance fields
.field private final a:Lcom/whoop/domain/model/UnitSystem;

.field private final b:I

.field private final c:Li93/j;

.field private final d:Li93/j;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poundsRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kilogramsRange"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poundsLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kilogramsLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    iput p2, p0, Ls41/d;->b:I

    iput-object p3, p0, Ls41/d;->c:Li93/j;

    iput-object p4, p0, Ls41/d;->d:Li93/j;

    iput-object p5, p0, Ls41/d;->e:Ljava/lang/String;

    iput-object p6, p0, Ls41/d;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls41/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Li93/j;
    .locals 1

    iget-object v0, p0, Ls41/d;->d:Li93/j;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls41/d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Li93/j;
    .locals 1

    iget-object v0, p0, Ls41/d;->c:Li93/j;

    return-object v0
.end method

.method public final e()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls41/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls41/d;

    iget-object v1, p0, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    iget-object v3, p1, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ls41/d;->b:I

    iget v3, p1, Ls41/d;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ls41/d;->c:Li93/j;

    iget-object v3, p1, Ls41/d;->c:Li93/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ls41/d;->d:Li93/j;

    iget-object v3, p1, Ls41/d;->d:Li93/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ls41/d;->e:Ljava/lang/String;

    iget-object v3, p1, Ls41/d;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ls41/d;->f:Ljava/lang/String;

    iget-object p1, p1, Ls41/d;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ls41/d;->b:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ls41/d;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Ls41/d;->c:Li93/j;

    invoke-virtual {v2}, Li93/j;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ls41/d;->d:Li93/j;

    invoke-virtual {v0}, Li93/j;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ls41/d;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Ls41/d;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Ls41/d;->a:Lcom/whoop/domain/model/UnitSystem;

    iget v1, p0, Ls41/d;->b:I

    iget-object v2, p0, Ls41/d;->c:Li93/j;

    iget-object v3, p0, Ls41/d;->d:Li93/j;

    iget-object v4, p0, Ls41/d;->e:Ljava/lang/String;

    iget-object v5, p0, Ls41/d;->f:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "WhoopWeightPickerState(unitSystem="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weightInPounds="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", poundsRange="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", kilogramsRange="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", poundsLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", kilogramsLabel="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
