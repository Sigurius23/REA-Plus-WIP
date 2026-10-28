.class public final Lcom/whoop/domain/model/teams/share/TeamResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/share/TeamResponse;",
        "",
        "offset",
        "",
        "limit",
        "records",
        "",
        "Lcom/whoop/domain/model/teams/share/SelectTeam;",
        "<init>",
        "(IILjava/util/List;)V",
        "getOffset",
        "()I",
        "getLimit",
        "getRecords",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final limit:I

.field private final offset:I

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            ">;)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    iput p2, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    iput-object p3, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/teams/share/TeamResponse;IILjava/util/List;ILjava/lang/Object;)Lcom/whoop/domain/model/teams/share/TeamResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/domain/model/teams/share/TeamResponse;->copy(IILjava/util/List;)Lcom/whoop/domain/model/teams/share/TeamResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/List;)Lcom/whoop/domain/model/teams/share/TeamResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            ">;)",
            "Lcom/whoop/domain/model/teams/share/TeamResponse;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/teams/share/TeamResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/domain/model/teams/share/TeamResponse;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/teams/share/TeamResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/teams/share/TeamResponse;

    iget v1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    iget v3, p1, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    iget v3, p1, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    return v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/share/SelectTeam;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->offset:I

    iget v1, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->limit:I

    iget-object v2, p0, Lcom/whoop/domain/model/teams/share/TeamResponse;->records:Ljava/util/List;

    const-string v3, ", limit="

    const-string v4, ", records="

    const-string v5, "TeamResponse(offset="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
