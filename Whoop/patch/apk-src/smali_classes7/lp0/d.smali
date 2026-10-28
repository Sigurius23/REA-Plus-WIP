.class public final Llp0/d;
.super Llp0/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001e\u001a\u0004\u0008\u0017\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u000c\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008 \u0010\u0012\u00a8\u0006$"
    }
    d2 = {
        "Llp0/d;",
        "Llp0/f;",
        "",
        "optimalSleepText",
        "optimalSleepTimeText",
        "Llp0/h;",
        "optimalSleepDirection",
        "",
        "startPixels",
        "endTimePixels",
        "",
        "isOptimalTextCentered",
        "totalTimePixels",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Llp0/h;IIZI)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "c",
        "b",
        "d",
        "Llp0/h;",
        "()Llp0/h;",
        "I",
        "e",
        "f",
        "Z",
        "g",
        "()Z",
        "sleep-coach_release"
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

.field private final b:Ljava/lang/String;

.field private final c:Llp0/h;

.field private final d:I

.field private final e:I

.field private final f:Z

.field private final g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Llp0/h;IIZI)V
    .locals 1

    const-string v0, "optimalSleepText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optimalSleepTimeText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optimalSleepDirection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llp0/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llp0/d;->a:Ljava/lang/String;

    iput-object p2, p0, Llp0/d;->b:Ljava/lang/String;

    iput-object p3, p0, Llp0/d;->c:Llp0/h;

    iput p4, p0, Llp0/d;->d:I

    iput p5, p0, Llp0/d;->e:I

    iput-boolean p6, p0, Llp0/d;->f:Z

    iput p7, p0, Llp0/d;->g:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Llp0/d;->e:I

    return v0
.end method

.method public final b()Llp0/h;
    .locals 1

    iget-object v0, p0, Llp0/d;->c:Llp0/h;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llp0/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llp0/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Llp0/d;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llp0/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llp0/d;

    iget-object v1, p0, Llp0/d;->a:Ljava/lang/String;

    iget-object v3, p1, Llp0/d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llp0/d;->b:Ljava/lang/String;

    iget-object v3, p1, Llp0/d;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llp0/d;->c:Llp0/h;

    iget-object v3, p1, Llp0/d;->c:Llp0/h;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llp0/d;->d:I

    iget v3, p1, Llp0/d;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Llp0/d;->e:I

    iget v3, p1, Llp0/d;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Llp0/d;->f:Z

    iget-boolean v3, p1, Llp0/d;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Llp0/d;->g:I

    iget p1, p1, Llp0/d;->g:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Llp0/d;->g:I

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Llp0/d;->f:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llp0/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llp0/d;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llp0/d;->c:Llp0/h;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Llp0/d;->d:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llp0/d;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Llp0/d;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v1, p0, Llp0/d;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Llp0/d;->a:Ljava/lang/String;

    iget-object v1, p0, Llp0/d;->b:Ljava/lang/String;

    iget-object v2, p0, Llp0/d;->c:Llp0/h;

    iget v3, p0, Llp0/d;->d:I

    iget v4, p0, Llp0/d;->e:I

    iget-boolean v5, p0, Llp0/d;->f:Z

    iget v6, p0, Llp0/d;->g:I

    const-string v7, ", optimalSleepTimeText="

    const-string v8, ", optimalSleepDirection="

    const-string v9, "FitsPartiallyInWindow(optimalSleepText="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startPixels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endTimePixels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isOptimalTextCentered="

    const-string v2, ", totalTimePixels="

    invoke-static {v4, v1, v2, v0, v5}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
