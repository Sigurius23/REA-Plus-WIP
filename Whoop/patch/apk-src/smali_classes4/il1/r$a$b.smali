.class public final Lil1/r$a$b;
.super Lil1/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lil1/r$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lil1/r$a$b;",
        "Lil1/r$a;",
        "Lcom/whoop/home/domain/models/HomeBffFeedResponse;",
        "cacheResponse",
        "Ljava/time/LocalDate;",
        "requestDate",
        "Lem1/r;",
        "refreshType",
        "<init>",
        "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
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
        "()Lem1/r;",
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


# direct methods
.method public constructor <init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;Lem1/r;)V
    .locals 1

    const-string v0, "requestDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lil1/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iput-object p2, p0, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    iput-object p3, p0, Lil1/r$a$b;->c:Lem1/r;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;
    .locals 1

    iget-object v0, p0, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    return-object v0
.end method

.method public final b()Lem1/r;
    .locals 1

    iget-object v0, p0, Lil1/r$a$b;->c:Lem1/r;

    return-object v0
.end method

.method public final c()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lil1/r$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lil1/r$a$b;

    iget-object v1, p0, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v3, p1, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    iget-object v3, p1, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lil1/r$a$b;->c:Lem1/r;

    iget-object p1, p1, Lil1/r$a$b;->c:Lem1/r;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    invoke-static {v2, v0, v1}, Lev/n;->e(Ljava/time/LocalDate;II)I

    move-result v0

    iget-object v1, p0, Lil1/r$a$b;->c:Lem1/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lil1/r$a$b;->a:Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    iget-object v1, p0, Lil1/r$a$b;->b:Ljava/time/LocalDate;

    iget-object v2, p0, Lil1/r$a$b;->c:Lem1/r;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "FetchFeed(cacheResponse="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requestDate="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", refreshType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
