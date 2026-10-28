.class public final Lcom/whoop/domain/model/teams/WidgetCollectionResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;",
        "",
        "hasData",
        "",
        "offset",
        "",
        "limit",
        "records",
        "",
        "Lcom/whoop/domain/model/teams/Widget;",
        "<init>",
        "(ZIILjava/util/List;)V",
        "getHasData",
        "()Z",
        "getOffset",
        "()I",
        "getLimit",
        "getRecords",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "core_release"
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
.field private final hasData:Z

.field private final limit:I

.field private final offset:I

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZIILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    iput p2, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    iput p3, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    iput-object p4, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/WidgetCollectionResponse;ZIILjava/util/List;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/WidgetCollectionResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->copy(ZIILjava/util/List;)Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ZIILjava/util/List;)Lcom/whoop/domain/model/teams/WidgetCollectionResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;)",
            "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;-><init>(ZIILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    iget-boolean v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    iget-boolean v3, p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    iget v3, p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    iget v3, p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHasData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    return v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/Widget;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->hasData:Z

    iget v1, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->offset:I

    iget v2, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->limit:I

    iget-object v3, p0, Lcom/whoop/domain/model/teams/WidgetCollectionResponse;->records:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WidgetCollectionResponse(hasData="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", offset="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", limit="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", records="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
