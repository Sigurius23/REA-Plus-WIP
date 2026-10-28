.class public final Lhu2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhu2/b$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhu2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lhu2/b$a;",
        "Lhu2/b$p;",
        "",
        "groupIndex",
        "exerciseIndex",
        "<init>",
        "(II)V",
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
        "w",
        "I",
        "b",
        "x",
        "a",
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
.field private final w:I

.field private final x:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lhu2/b$a;->w:I

    iput p2, p0, Lhu2/b$a;->x:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lhu2/b$a;->x:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lhu2/b$a;->w:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhu2/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhu2/b$a;

    iget v1, p0, Lhu2/b$a;->w:I

    iget v3, p1, Lhu2/b$a;->w:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lhu2/b$a;->x:I

    iget p1, p1, Lhu2/b$a;->x:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lhu2/b$a;->w:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lhu2/b$a;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lhu2/b$a;->w:I

    iget v1, p0, Lhu2/b$a;->x:I

    const-string v2, ", exerciseIndex="

    const-string v3, ")"

    const-string v4, "DeleteExerciseClicked(groupIndex="

    invoke-static {v0, v1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
