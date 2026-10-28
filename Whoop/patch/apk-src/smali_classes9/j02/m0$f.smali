.class public final Lj02/m0$f;
.super Lj02/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj02/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0017\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001f\u001a\u0004\u0008\u001e\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0018\u001a\u0004\u0008\"\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010#\u001a\u0004\u0008\u001b\u0010\u000f\u00a8\u0006$"
    }
    d2 = {
        "Lj02/m0$f;",
        "Lj02/m0;",
        "",
        "isSleepActivity",
        "Ljava/time/LocalDate;",
        "activityDate",
        "Ljava/time/LocalDateTime;",
        "startTime",
        "endTime",
        "isGdcFlow",
        "",
        "activityInternalName",
        "<init>",
        "(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Z",
        "g",
        "()Z",
        "c",
        "Ljava/time/LocalDate;",
        "()Ljava/time/LocalDate;",
        "d",
        "Ljava/time/LocalDateTime;",
        "e",
        "()Ljava/time/LocalDateTime;",
        "f",
        "Ljava/lang/String;",
        "navigation_release"
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
.field private final b:Z

.field private final c:Ljava/time/LocalDate;

.field private final d:Ljava/time/LocalDateTime;

.field private final e:Ljava/time/LocalDateTime;

.field private final f:Z

.field private final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "activityDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityInternalName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lj02/m0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-boolean p1, p0, Lj02/m0$f;->b:Z

    .line 3
    iput-object p2, p0, Lj02/m0$f;->c:Ljava/time/LocalDate;

    .line 4
    iput-object p3, p0, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    .line 5
    iput-object p4, p0, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    .line 6
    iput-boolean p5, p0, Lj02/m0$f;->f:Z

    .line 7
    iput-object p6, p0, Lj02/m0$f;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 8
    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p2

    const-string p8, "now(...)"

    invoke-static {p2, p8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v1, 0x0

    if-eqz p8, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 9
    const-string p6, ""

    :cond_5
    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p7}, Lj02/m0$f;-><init>(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lj02/m0$f;->c:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj02/m0$f;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    return-object v0
.end method

.method public final e()Ljava/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj02/m0$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj02/m0$f;

    iget-boolean v1, p0, Lj02/m0$f;->b:Z

    iget-boolean v3, p1, Lj02/m0$f;->b:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj02/m0$f;->c:Ljava/time/LocalDate;

    iget-object v3, p1, Lj02/m0$f;->c:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    iget-object v3, p1, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    iget-object v3, p1, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lj02/m0$f;->f:Z

    iget-boolean v3, p1, Lj02/m0$f;->f:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lj02/m0$f;->g:Ljava/lang/String;

    iget-object p1, p1, Lj02/m0$f;->g:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lj02/m0$f;->f:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lj02/m0$f;->b:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lj02/m0$f;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj02/m0$f;->c:Ljava/time/LocalDate;

    invoke-static {v2, v0, v1}, Lev/n;->e(Ljava/time/LocalDate;II)I

    move-result v0

    iget-object v2, p0, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lj02/m0$f;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lj02/m0$f;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lj02/m0$f;->b:Z

    iget-object v1, p0, Lj02/m0$f;->c:Ljava/time/LocalDate;

    iget-object v2, p0, Lj02/m0$f;->d:Ljava/time/LocalDateTime;

    iget-object v3, p0, Lj02/m0$f;->e:Ljava/time/LocalDateTime;

    iget-boolean v4, p0, Lj02/m0$f;->f:Z

    iget-object v5, p0, Lj02/m0$f;->g:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AddActivityNavigationScreen(isSleepActivity="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", activityDate="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endTime="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isGdcFlow="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", activityInternalName="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
