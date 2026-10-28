.class public final Lc41/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0016\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lc41/o1;",
        "",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "view",
        "cta",
        "dismiss",
        "<init>",
        "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "c",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "b",
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
.field private final a:Lcom/whoop/analytics/AnalyticEventModel;

.field private final b:Lcom/whoop/analytics/AnalyticEventModel;

.field private final c:Lcom/whoop/analytics/AnalyticEventModel;


# direct methods
.method public constructor <init>(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    iput-object p2, p0, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    iput-object p3, p0, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final b()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final c()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc41/o1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc41/o1;

    iget-object v1, p0, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lc41/o1;->a:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v1, p0, Lc41/o1;->b:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v2, p0, Lc41/o1;->c:Lcom/whoop/analytics/AnalyticEventModel;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EntryPointTileAnalyticEvents(view="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismiss="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Ly00/t7;->h(Ljava/lang/StringBuilder;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
