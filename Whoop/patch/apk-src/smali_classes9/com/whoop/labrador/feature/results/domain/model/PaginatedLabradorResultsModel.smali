.class public final Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u00002\u00020\u0001B/\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000cR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001f\u001a\u0004\u0008 \u0010\u0010\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;",
        "",
        "Lcom/whoop/navigation/e;",
        "learnMoreDestination",
        "",
        "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
        "records",
        "",
        "nextToken",
        "<init>",
        "(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)V",
        "component1",
        "()Lcom/whoop/navigation/e;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/navigation/e;",
        "getLearnMoreDestination",
        "Ljava/util/List;",
        "getRecords",
        "Ljava/lang/String;",
        "getNextToken",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final learnMoreDestination:Lcom/whoop/navigation/e;

.field private final nextToken:Ljava/lang/String;

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;-><init>(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    .line 4
    iput-object p2, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;-><init>(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->copy(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/e;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;-><init>(Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLearnMoreDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getNextToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->learnMoreDestination:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->records:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->nextToken:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PaginatedLabradorResultsModel(learnMoreDestination="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", records="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nextToken="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
