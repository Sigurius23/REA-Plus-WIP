.class public final Lfm2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lfm2/c;",
        "",
        "Lfm2/a;",
        "currentDialogType",
        "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;",
        "response",
        "<init>",
        "(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)V",
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
        "Lfm2/a;",
        "()Lfm2/a;",
        "b",
        "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;",
        "()Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;",
        "trends-mini-arch_release"
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
.field private final a:Lfm2/a;

.field private final b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;


# direct methods
.method public constructor <init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfm2/c;->a:Lfm2/a;

    .line 3
    iput-object p2, p0, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    return-void
.end method

.method public synthetic constructor <init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)V

    return-void
.end method


# virtual methods
.method public final a()Lfm2/a;
    .locals 1

    iget-object v0, p0, Lfm2/c;->a:Lfm2/a;

    return-object v0
.end method

.method public final b()Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;
    .locals 1

    iget-object v0, p0, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfm2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfm2/c;

    iget-object v1, p0, Lfm2/c;->a:Lfm2/a;

    iget-object v3, p1, Lfm2/c;->a:Lfm2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    iget-object p1, p1, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lfm2/c;->a:Lfm2/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfm2/c;->a:Lfm2/a;

    iget-object v1, p0, Lfm2/c;->b:Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TrendsMiniArchDomainState(currentDialogType="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
