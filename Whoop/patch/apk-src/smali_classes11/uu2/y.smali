.class public final Luu2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Luu2/y;",
        "",
        "Luu2/j0;",
        "fullScreenModal",
        "Luu2/o;",
        "content",
        "",
        "navigateBackAfterSuccessfulDelete",
        "deleteCustomExerciseFailed",
        "dismissPresentedModal",
        "<init>",
        "(Luu2/j0;Luu2/o;ZZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Luu2/j0;",
        "d",
        "()Luu2/j0;",
        "b",
        "Luu2/o;",
        "()Luu2/o;",
        "c",
        "Z",
        "e",
        "()Z",
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
.field private final a:Luu2/j0;

.field private final b:Luu2/o;

.field private final c:Z

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(Luu2/j0;Luu2/o;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luu2/y;->a:Luu2/j0;

    .line 3
    iput-object p2, p0, Luu2/y;->b:Luu2/o;

    .line 4
    iput-boolean p3, p0, Luu2/y;->c:Z

    .line 5
    iput-boolean p4, p0, Luu2/y;->d:Z

    .line 6
    iput-boolean p5, p0, Luu2/y;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Luu2/j0;Luu2/o;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    sget-object p1, Luu2/j0;->i:Luu2/j0$a;

    invoke-virtual {p1}, Luu2/j0$a;->c()Luu2/j0;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p7, v0

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move p7, p5

    move p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 8
    :goto_0
    invoke-direct/range {p2 .. p7}, Luu2/y;-><init>(Luu2/j0;Luu2/o;ZZZ)V

    return-void
.end method


# virtual methods
.method public final a()Luu2/o;
    .locals 1

    iget-object v0, p0, Luu2/y;->b:Luu2/o;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Luu2/y;->d:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Luu2/y;->e:Z

    return v0
.end method

.method public final d()Luu2/j0;
    .locals 1

    iget-object v0, p0, Luu2/y;->a:Luu2/j0;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Luu2/y;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Luu2/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Luu2/y;

    iget-object v1, p0, Luu2/y;->a:Luu2/j0;

    iget-object v3, p1, Luu2/y;->a:Luu2/j0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Luu2/y;->b:Luu2/o;

    iget-object v3, p1, Luu2/y;->b:Luu2/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Luu2/y;->c:Z

    iget-boolean v3, p1, Luu2/y;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Luu2/y;->d:Z

    iget-boolean v3, p1, Luu2/y;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Luu2/y;->e:Z

    iget-boolean p1, p1, Luu2/y;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Luu2/y;->a:Luu2/j0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Luu2/j0;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Luu2/y;->b:Luu2/o;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Luu2/o;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Luu2/y;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Luu2/y;->d:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Luu2/y;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Luu2/y;->a:Luu2/j0;

    iget-object v1, p0, Luu2/y;->b:Luu2/o;

    iget-boolean v2, p0, Luu2/y;->c:Z

    iget-boolean v3, p0, Luu2/y;->d:Z

    iget-boolean v4, p0, Luu2/y;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ExerciseDetailsV2ViewState(fullScreenModal="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigateBackAfterSuccessfulDelete="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deleteCustomExerciseFailed="

    const-string v1, ", dismissPresentedModal="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
