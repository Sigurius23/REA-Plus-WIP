.class public final Lcp0/q1$a;
.super Lcp0/q1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcp0/q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcp0/q1$a;",
        "Lcp0/q1;",
        "Lcp0/u1;",
        "newSheetState",
        "",
        "newTargetHeight",
        "newHeroProgress",
        "",
        "shouldDismiss",
        "<init>",
        "(Lcp0/u1;FFZ)V",
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
        "Lcp0/u1;",
        "b",
        "()Lcp0/u1;",
        "F",
        "c",
        "()F",
        "d",
        "Z",
        "()Z",
        "coach-everywhere_release"
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
.field private final a:Lcp0/u1;

.field private final b:F

.field private final c:F

.field private final d:Z


# direct methods
.method public constructor <init>(Lcp0/u1;FFZ)V
    .locals 1

    const-string v0, "newSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcp0/q1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lcp0/q1$a;->a:Lcp0/u1;

    .line 3
    iput p2, p0, Lcp0/q1$a;->b:F

    .line 4
    iput p3, p0, Lcp0/q1$a;->c:F

    .line 5
    iput-boolean p4, p0, Lcp0/q1$a;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcp0/u1;FFZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcp0/q1$a;-><init>(Lcp0/u1;FFZ)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lcp0/q1$a;->c:F

    return v0
.end method

.method public final b()Lcp0/u1;
    .locals 1

    iget-object v0, p0, Lcp0/q1$a;->a:Lcp0/u1;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lcp0/q1$a;->b:F

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcp0/q1$a;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcp0/q1$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcp0/q1$a;

    iget-object v1, p0, Lcp0/q1$a;->a:Lcp0/u1;

    iget-object v3, p1, Lcp0/q1$a;->a:Lcp0/u1;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcp0/q1$a;->b:F

    iget v3, p1, Lcp0/q1$a;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcp0/q1$a;->c:F

    iget v3, p1, Lcp0/q1$a;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcp0/q1$a;->d:Z

    iget-boolean p1, p1, Lcp0/q1$a;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcp0/q1$a;->a:Lcp0/u1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcp0/q1$a;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcp0/q1$a;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v1, p0, Lcp0/q1$a;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcp0/q1$a;->a:Lcp0/u1;

    iget v1, p0, Lcp0/q1$a;->b:F

    iget v2, p0, Lcp0/q1$a;->c:F

    iget-boolean v3, p0, Lcp0/q1$a;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ChangeState(newSheetState="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", newTargetHeight="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", newHeroProgress="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", shouldDismiss="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
