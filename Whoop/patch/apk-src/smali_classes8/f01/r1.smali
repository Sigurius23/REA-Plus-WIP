.class public final Lf01/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001b\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\"\u001a\u0004\u0008\u0017\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010$\u001a\u0004\u0008\u001f\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lf01/r1;",
        "",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "resolvedAction",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "",
        "fallsThrough",
        "<init>",
        "(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V",
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
        "Lgz0/m0;",
        "d",
        "()Lgz0/m0;",
        "b",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "e",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "c",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "Z",
        "()Z",
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
.field private final a:Lgz0/m0;

.field private final b:Lcom/whoop/whoopaction/domain/models/Action;

.field private final c:Lcom/whoop/navigation/e;

.field private final d:Lcom/whoop/analytics/AnalyticEventModel;

.field private final e:Z


# direct methods
.method public constructor <init>(Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Z)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/r1;->a:Lgz0/m0;

    iput-object p2, p0, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    iput-object p3, p0, Lf01/r1;->c:Lcom/whoop/navigation/e;

    iput-object p4, p0, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    iput-boolean p5, p0, Lf01/r1;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lf01/r1;->c:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lf01/r1;->e:Z

    return v0
.end method

.method public final d()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lf01/r1;->a:Lgz0/m0;

    return-object v0
.end method

.method public final e()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf01/r1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf01/r1;

    iget-object v1, p0, Lf01/r1;->a:Lgz0/m0;

    iget-object v3, p1, Lf01/r1;->a:Lgz0/m0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lf01/r1;->c:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lf01/r1;->c:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lf01/r1;->e:Z

    iget-boolean p1, p1, Lf01/r1;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lf01/r1;->a:Lgz0/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf01/r1;->c:Lcom/whoop/navigation/e;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lf01/r1;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lf01/r1;->a:Lgz0/m0;

    iget-object v1, p0, Lf01/r1;->b:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v2, p0, Lf01/r1;->c:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lf01/r1;->d:Lcom/whoop/analytics/AnalyticEventModel;

    iget-boolean v4, p0, Lf01/r1;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "TrailingIconState(icon="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", resolvedAction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fallsThrough="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
