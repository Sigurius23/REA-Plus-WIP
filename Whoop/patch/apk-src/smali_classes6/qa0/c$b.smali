.class public final Lqa0/c$b;
.super Lqa0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001d\u001a\u0004\u0008\u0016\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001f\u001a\u0004\u0008\u0019\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lqa0/c$b;",
        "Lqa0/c;",
        "",
        "navigationTitle",
        "",
        "Lm91/u;",
        "sections",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "analyticsData",
        "",
        "displayRefreshingSpinner",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Z)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Ljava/lang/String;",
        "d",
        "c",
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "Z",
        "()Z",
        "advanced-labs_release"
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
.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
            "Z)V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lqa0/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lqa0/c$b;->b:Ljava/lang/String;

    iput-object p2, p0, Lqa0/c$b;->c:Ljava/util/List;

    iput-object p3, p0, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iput-boolean p4, p0, Lqa0/c$b;->e:Z

    return-void
.end method


# virtual methods
.method public final b()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;
    .locals 1

    iget-object v0, p0, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lqa0/c$b;->e:Z

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqa0/c$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqa0/c$b;->c:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqa0/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqa0/c$b;

    iget-object v1, p0, Lqa0/c$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lqa0/c$b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqa0/c$b;->c:Ljava/util/List;

    iget-object v3, p1, Lqa0/c$b;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iget-object v3, p1, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lqa0/c$b;->e:Z

    iget-boolean p1, p1, Lqa0/c$b;->e:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqa0/c$b;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lqa0/c$b;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lqa0/c$b;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lqa0/c$b;->b:Ljava/lang/String;

    iget-object v1, p0, Lqa0/c$b;->c:Ljava/util/List;

    iget-object v2, p0, Lqa0/c$b;->d:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iget-boolean v3, p0, Lqa0/c$b;->e:Z

    const-string v4, ", sections="

    const-string v5, ", analyticsData="

    const-string v6, "Success(navigationTitle="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", displayRefreshingSpinner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
