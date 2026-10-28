.class public final Ldm1/a$q;
.super Ldm1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010%\u001a\u0004\u0008\u001c\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Ldm1/a$q;",
        "Ldm1/a;",
        "Lcom/whoop/util/TrendKey;",
        "trendKey",
        "Ljava/time/LocalDate;",
        "date",
        "Lil1/a0;",
        "sourceComponent",
        "Lfm1/g;",
        "sourcePillar",
        "",
        "sendTileProperties",
        "<init>",
        "(Lcom/whoop/util/TrendKey;Ljava/time/LocalDate;Lil1/a0;Lfm1/g;Z)V",
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
        "Lcom/whoop/util/TrendKey;",
        "e",
        "()Lcom/whoop/util/TrendKey;",
        "b",
        "Ljava/time/LocalDate;",
        "()Ljava/time/LocalDate;",
        "c",
        "Lil1/a0;",
        "()Lil1/a0;",
        "d",
        "Lfm1/g;",
        "()Lfm1/g;",
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
.field private final a:Lcom/whoop/util/TrendKey;

.field private final b:Ljava/time/LocalDate;

.field private final c:Lil1/a0;

.field private final d:Lfm1/g;

.field private final e:Z


# direct methods
.method public constructor <init>(Lcom/whoop/util/TrendKey;Ljava/time/LocalDate;Lil1/a0;Lfm1/g;Z)V
    .locals 1

    const-string v0, "trendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceComponent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldm1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    iput-object p2, p0, Ldm1/a$q;->b:Ljava/time/LocalDate;

    iput-object p3, p0, Ldm1/a$q;->c:Lil1/a0;

    iput-object p4, p0, Ldm1/a$q;->d:Lfm1/g;

    iput-boolean p5, p0, Ldm1/a$q;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/time/LocalDate;
    .locals 1

    iget-object v0, p0, Ldm1/a$q;->b:Ljava/time/LocalDate;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Ldm1/a$q;->e:Z

    return v0
.end method

.method public final c()Lil1/a0;
    .locals 1

    iget-object v0, p0, Ldm1/a$q;->c:Lil1/a0;

    return-object v0
.end method

.method public final d()Lfm1/g;
    .locals 1

    iget-object v0, p0, Ldm1/a$q;->d:Lfm1/g;

    return-object v0
.end method

.method public final e()Lcom/whoop/util/TrendKey;
    .locals 1

    iget-object v0, p0, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldm1/a$q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldm1/a$q;

    iget-object v1, p0, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    iget-object v3, p1, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ldm1/a$q;->b:Ljava/time/LocalDate;

    iget-object v3, p1, Ldm1/a$q;->b:Ljava/time/LocalDate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ldm1/a$q;->c:Lil1/a0;

    iget-object v3, p1, Ldm1/a$q;->c:Lil1/a0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ldm1/a$q;->d:Lfm1/g;

    iget-object v3, p1, Ldm1/a$q;->d:Lfm1/g;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Ldm1/a$q;->e:Z

    iget-boolean p1, p1, Ldm1/a$q;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldm1/a$q;->b:Ljava/time/LocalDate;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/time/LocalDate;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldm1/a$q;->c:Lil1/a0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ldm1/a$q;->d:Lfm1/g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ldm1/a$q;->e:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Ldm1/a$q;->a:Lcom/whoop/util/TrendKey;

    iget-object v1, p0, Ldm1/a$q;->b:Ljava/time/LocalDate;

    iget-object v2, p0, Ldm1/a$q;->c:Lil1/a0;

    iget-object v3, p0, Ldm1/a$q;->d:Lfm1/g;

    iget-boolean v4, p0, Ldm1/a$q;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HistoricalTrendsEvent(trendKey="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", date="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceComponent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourcePillar="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sendTileProperties="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
