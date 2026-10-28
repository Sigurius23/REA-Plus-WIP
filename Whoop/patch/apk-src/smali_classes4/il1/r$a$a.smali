.class public final Lil1/r$a$a;
.super Lil1/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil1/r$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00082\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0019\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lil1/r$a$a;",
        "Lil1/r$a;",
        "Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "cacheResponse",
        "Ljava/time/LocalDate;",
        "requestDate",
        "Lem1/r;",
        "refreshType",
        "",
        "networkError",
        "<init>",
        "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;Z)V",
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
        "Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "()Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "b",
        "Ljava/time/LocalDate;",
        "c",
        "()Ljava/time/LocalDate;",
        "Lem1/r;",
        "getRefreshType",
        "()Lem1/r;",
        "d",
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

.field private final c:Lem1/r;

.field private final d:Z


# direct methods
.method public constructor <init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;Z)V
    .locals 1

    const-string v0, "refreshType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lil1/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    .line 3
    iput-object p2, p0, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    .line 4
    iput-object p3, p0, Lil1/r$a$a;->c:Lem1/r;

    .line 5
    iput-boolean p4, p0, Lil1/r$a$a;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 6
    sget-object p3, Lem1/r;->ERROR:Lem1/r;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lil1/r$a$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;Z)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;
    .locals 1

    iget-object v0, p0, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lil1/r$a$a;->d:Z

    return v0
.end method

.method public final c()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lil1/r$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lil1/r$a$a;

    iget-object v1, p0, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v3, p1, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    iget-object v3, p1, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lil1/r$a$a;->c:Lem1/r;

    iget-object v3, p1, Lil1/r$a$a;->c:Lem1/r;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lil1/r$a$a;->d:Z

    iget-boolean p1, p1, Lil1/r$a$a;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/time/LocalDate;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lil1/r$a$a;->c:Lem1/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lil1/r$a$a;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lil1/r$a$a;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v1, p0, Lil1/r$a$a;->b:Ljava/time/LocalDate;

    iget-object v2, p0, Lil1/r$a$a;->c:Lem1/r;

    iget-boolean v3, p0, Lil1/r$a$a;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error(cacheResponse="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requestDate="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkError="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
