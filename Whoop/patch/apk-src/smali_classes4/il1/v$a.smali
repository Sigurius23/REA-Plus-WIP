.class public final Lil1/v$a;
.super Lil1/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil1/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lil1/v$a;",
        "Lil1/v;",
        "Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "bffFeed",
        "Ljava/time/LocalDate;",
        "currentDateTime",
        "",
        "currentPillarIndex",
        "Lxl1/c;",
        "journalDomainResult",
        "",
        "networkError",
        "<init>",
        "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "b",
        "Ljava/time/LocalDate;",
        "()Ljava/time/LocalDate;",
        "c",
        "I",
        "d",
        "Lxl1/c;",
        "()Lxl1/c;",
        "e",
        "Z",
        "()Z",
        "home_release"
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
.field private final a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

.field private final b:Ljava/time/LocalDate;

.field private final c:I

.field private final d:Lxl1/c;

.field private final e:Z


# direct methods
.method public constructor <init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;Z)V
    .locals 1

    const-string v0, "journalDomainResult"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lil1/v;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    .line 3
    iput-object p2, p0, Lil1/v$a;->b:Ljava/time/LocalDate;

    .line 4
    iput p3, p0, Lil1/v$a;->c:I

    .line 5
    iput-object p4, p0, Lil1/v$a;->d:Lxl1/c;

    .line 6
    iput-boolean p5, p0, Lil1/v$a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v1, 0x0

    if-eqz p7, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 7
    new-instance p4, Lxl1/c;

    const/4 p7, 0x3

    invoke-direct {p4, v1, v1, p7, v0}, Lxl1/c;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v1

    :goto_0
    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lil1/v$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;Z)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;
    .locals 1

    iget-object v0, p0, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    return-object v0
.end method

.method public final b()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lil1/v$a;->b:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lil1/v$a;->c:I

    return v0
.end method

.method public final d()Lxl1/c;
    .locals 1

    iget-object v0, p0, Lil1/v$a;->d:Lxl1/c;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lil1/v$a;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lil1/v$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lil1/v$a;

    iget-object v1, p0, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v3, p1, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lil1/v$a;->b:Ljava/time/LocalDate;

    iget-object v3, p1, Lil1/v$a;->b:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lil1/v$a;->c:I

    iget v3, p1, Lil1/v$a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lil1/v$a;->d:Lxl1/c;

    iget-object v3, p1, Lil1/v$a;->d:Lxl1/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lil1/v$a;->e:Z

    iget-boolean p1, p1, Lil1/v$a;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lil1/v$a;->b:Ljava/time/LocalDate;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/time/LocalDate;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget v1, p0, Lil1/v$a;->c:I

    invoke-static {v1, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lil1/v$a;->d:Lxl1/c;

    invoke-virtual {v1}, Lxl1/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-boolean v0, p0, Lil1/v$a;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lil1/v$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v1, p0, Lil1/v$a;->b:Ljava/time/LocalDate;

    iget v2, p0, Lil1/v$a;->c:I

    iget-object v3, p0, Lil1/v$a;->d:Lxl1/c;

    iget-boolean v4, p0, Lil1/v$a;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Error(bffFeed="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentDateTime="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentPillarIndex="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", journalDomainResult="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkError="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
