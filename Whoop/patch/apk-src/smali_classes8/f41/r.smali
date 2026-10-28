.class public final Lf41/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lf41/r;",
        "",
        "",
        "id",
        "",
        "selectedNumber",
        "",
        "isAvoid",
        "isToggled",
        "<init>",
        "(Ljava/lang/String;IZZ)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "b",
        "I",
        "c",
        "Z",
        "()Z",
        "d",
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
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Z

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf41/r;->a:Ljava/lang/String;

    iput p2, p0, Lf41/r;->b:I

    iput-boolean p3, p0, Lf41/r;->c:Z

    iput-boolean p4, p0, Lf41/r;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf41/r;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lf41/r;->b:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lf41/r;->c:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lf41/r;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf41/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf41/r;

    iget-object v1, p0, Lf41/r;->a:Ljava/lang/String;

    iget-object v3, p1, Lf41/r;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lf41/r;->b:I

    iget v3, p1, Lf41/r;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lf41/r;->c:Z

    iget-boolean v3, p1, Lf41/r;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lf41/r;->d:Z

    iget-boolean p1, p1, Lf41/r;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lf41/r;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lf41/r;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lf41/r;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lf41/r;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lf41/r;->a:Ljava/lang/String;

    iget v1, p0, Lf41/r;->b:I

    iget-boolean v2, p0, Lf41/r;->c:Z

    iget-boolean v3, p0, Lf41/r;->d:Z

    const-string v4, ", selectedNumber="

    const-string v5, ", isAvoid="

    const-string v6, "SelectedBehaviorCallback(id="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isToggled="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
