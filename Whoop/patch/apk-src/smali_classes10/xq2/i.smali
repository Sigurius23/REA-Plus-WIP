.class public final Lxq2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010&\u001a\u0004\u0008\u001a\u0010\'R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010(\u001a\u0004\u0008\"\u0010)R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008\u001e\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lxq2/i;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "metric",
        "Ly81/e;",
        "textColor",
        "Lb91/a;",
        "metricTextStyle",
        "Lxq2/f;",
        "alignment",
        "Lxq2/g;",
        "layout",
        "Lxq2/h;",
        "bar",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lxq2/f;Lxq2/g;Lxq2/h;)V",
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
        "Ly81/e;",
        "e",
        "()Ly81/e;",
        "c",
        "Lb91/a;",
        "getMetricTextStyle",
        "()Lb91/a;",
        "Lxq2/f;",
        "()Lxq2/f;",
        "Lxq2/g;",
        "()Lxq2/g;",
        "f",
        "Lxq2/h;",
        "()Lxq2/h;",
        "user-journey_release"
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

.field private final b:Ly81/e;

.field private final c:Lb91/a;

.field private final d:Lxq2/f;

.field private final e:Lxq2/g;

.field private final f:Lxq2/h;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lxq2/f;Lxq2/g;Lxq2/h;)V
    .locals 1

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layout"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bar"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lxq2/i;->b:Ly81/e;

    iput-object p3, p0, Lxq2/i;->c:Lb91/a;

    iput-object p4, p0, Lxq2/i;->d:Lxq2/f;

    iput-object p5, p0, Lxq2/i;->e:Lxq2/g;

    iput-object p6, p0, Lxq2/i;->f:Lxq2/h;

    return-void
.end method


# virtual methods
.method public final a()Lxq2/f;
    .locals 1

    iget-object v0, p0, Lxq2/i;->d:Lxq2/f;

    return-object v0
.end method

.method public final b()Lxq2/h;
    .locals 1

    iget-object v0, p0, Lxq2/i;->f:Lxq2/h;

    return-object v0
.end method

.method public final c()Lxq2/g;
    .locals 1

    iget-object v0, p0, Lxq2/i;->e:Lxq2/g;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Ly81/e;
    .locals 1

    iget-object v0, p0, Lxq2/i;->b:Ly81/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lxq2/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lxq2/i;

    iget-object v1, p0, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lxq2/i;->b:Ly81/e;

    iget-object v3, p1, Lxq2/i;->b:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lxq2/i;->c:Lb91/a;

    iget-object v3, p1, Lxq2/i;->c:Lb91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lxq2/i;->d:Lxq2/f;

    iget-object v3, p1, Lxq2/i;->d:Lxq2/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lxq2/i;->e:Lxq2/g;

    iget-object v3, p1, Lxq2/i;->e:Lxq2/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lxq2/i;->f:Lxq2/h;

    iget-object p1, p1, Lxq2/i;->f:Lxq2/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lxq2/i;->b:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lxq2/i;->c:Lb91/a;

    invoke-static {v2, v0, v1}, Ldc/b;->c(Lb91/a;II)I

    move-result v0

    iget-object v2, p0, Lxq2/i;->d:Lxq2/f;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lxq2/i;->e:Lxq2/g;

    invoke-virtual {v0}, Lxq2/g;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lxq2/i;->f:Lxq2/h;

    invoke-virtual {v1}, Lxq2/h;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lxq2/i;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lxq2/i;->b:Ly81/e;

    iget-object v2, p0, Lxq2/i;->c:Lb91/a;

    iget-object v3, p0, Lxq2/i;->d:Lxq2/f;

    iget-object v4, p0, Lxq2/i;->e:Lxq2/g;

    iget-object v5, p0, Lxq2/i;->f:Lxq2/h;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ComparisonBarViewState(metric="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", textColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricTextStyle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alignment="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", layout="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bar="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
