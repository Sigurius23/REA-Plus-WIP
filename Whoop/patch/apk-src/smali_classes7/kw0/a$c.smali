.class public final Lkw0/a$c;
.super Lkw0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkw0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u000cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkw0/a$c;",
        "Lkw0/a;",
        "Lorg/joda/time/LocalDateTime;",
        "lowerBound",
        "upperBound",
        "",
        "sleepIdV2",
        "",
        "isNap",
        "<init>",
        "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Z)V",
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
        "Lorg/joda/time/LocalDateTime;",
        "()Lorg/joda/time/LocalDateTime;",
        "b",
        "c",
        "Ljava/lang/String;",
        "d",
        "Z",
        "()Z",
        "core-details_release"
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
.field private final a:Lorg/joda/time/LocalDateTime;

.field private final b:Lorg/joda/time/LocalDateTime;

.field private final c:Ljava/lang/String;

.field private final d:Z


# direct methods
.method public constructor <init>(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkw0/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    iput-object p2, p0, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    iput-object p3, p0, Lkw0/a$c;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lkw0/a$c;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Lorg/joda/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkw0/a$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lorg/joda/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lkw0/a$c;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkw0/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkw0/a$c;

    iget-object v1, p0, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    iget-object v3, p1, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    iget-object v3, p1, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lkw0/a$c;->c:Ljava/lang/String;

    iget-object v3, p1, Lkw0/a$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lkw0/a$c;->d:Z

    iget-boolean p1, p1, Lkw0/a$c;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    invoke-virtual {v0}, Lorg/joda/time/LocalDateTime;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lkw0/a$c;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lkw0/a$c;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lkw0/a$c;->a:Lorg/joda/time/LocalDateTime;

    iget-object v1, p0, Lkw0/a$c;->b:Lorg/joda/time/LocalDateTime;

    iget-object v2, p0, Lkw0/a$c;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lkw0/a$c;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NavigateToEditActivity(lowerBound="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepIdV2="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isNap="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
