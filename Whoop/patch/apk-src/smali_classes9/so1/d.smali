.class public final Lso1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010 \u001a\u0004\u0008\u0016\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lso1/d;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "buttonTitle",
        "Lgz0/m0;",
        "buttonIcon",
        "Lcom/whoop/navigation/e;",
        "buttonDestination",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Lgz0/m0;",
        "c",
        "()Lgz0/m0;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "hormonal-insights_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lgz0/m0;

.field private final c:Lcom/whoop/navigation/e;

.field private final d:Lcom/whoop/analytics/AnalyticEventModel;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "buttonTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonDestination"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lso1/d;->b:Lgz0/m0;

    iput-object p3, p0, Lso1/d;->c:Lcom/whoop/navigation/e;

    iput-object p4, p0, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lso1/d;->c:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final c()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lso1/d;->b:Lgz0/m0;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lso1/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lso1/d;

    iget-object v1, p0, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lso1/d;->b:Lgz0/m0;

    iget-object v3, p1, Lso1/d;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lso1/d;->c:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lso1/d;->c:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lso1/d;->b:Lgz0/m0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lso1/d;->c:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v1, p0, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lso1/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lso1/d;->b:Lgz0/m0;

    iget-object v2, p0, Lso1/d;->c:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lso1/d;->d:Lcom/whoop/analytics/AnalyticEventModel;

    const-string v4, ", buttonIcon="

    const-string v5, ", buttonDestination="

    const-string v6, "CyclePatternButton(buttonTitle="

    invoke-static {v6, v0, v4, v1, v5}, Ljh3/c;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
