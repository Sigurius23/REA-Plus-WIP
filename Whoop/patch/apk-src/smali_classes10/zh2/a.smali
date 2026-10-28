.class public final Lzh2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0017\u0008\u0080\u0008\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u0014R#\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001c\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001d\u001a\u0004\u0008\u001f\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001d\u001a\u0004\u0008#\u0010\u0014R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008\"\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lzh2/a;",
        "",
        "",
        "success",
        "",
        "totalPacketCount",
        "",
        "Llt0/g;",
        "dataPacketCountsByRevision",
        "firmwareEventPacketCount",
        "consoleLogPacketCount",
        "unknownRevisionCount",
        "Lzh2/b;",
        "sequenceInfo",
        "<init>",
        "(ZILjava/util/Map;IIILzh2/b;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "e",
        "()Z",
        "b",
        "I",
        "getTotalPacketCount",
        "c",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "d",
        "f",
        "g",
        "Lzh2/b;",
        "()Lzh2/b;",
        "strap-history-sync_release"
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
.field private final a:Z

.field private final b:I

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llt0/g;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:Lzh2/b;


# direct methods
.method public constructor <init>(ZILjava/util/Map;IIILzh2/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/Map<",
            "Llt0/g;",
            "Ljava/lang/Integer;",
            ">;III",
            "Lzh2/b;",
            ")V"
        }
    .end annotation

    const-string v0, "dataPacketCountsByRevision"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sequenceInfo"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lzh2/a;->a:Z

    iput p2, p0, Lzh2/a;->b:I

    iput-object p3, p0, Lzh2/a;->c:Ljava/util/Map;

    iput p4, p0, Lzh2/a;->d:I

    iput p5, p0, Lzh2/a;->e:I

    iput p6, p0, Lzh2/a;->f:I

    iput-object p7, p0, Lzh2/a;->g:Lzh2/b;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lzh2/a;->e:I

    return v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llt0/g;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzh2/a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lzh2/a;->d:I

    return v0
.end method

.method public final d()Lzh2/b;
    .locals 1

    iget-object v0, p0, Lzh2/a;->g:Lzh2/b;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lzh2/a;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzh2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzh2/a;

    iget-boolean v1, p0, Lzh2/a;->a:Z

    iget-boolean v3, p1, Lzh2/a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lzh2/a;->b:I

    iget v3, p1, Lzh2/a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lzh2/a;->c:Ljava/util/Map;

    iget-object v3, p1, Lzh2/a;->c:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lzh2/a;->d:I

    iget v3, p1, Lzh2/a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lzh2/a;->e:I

    iget v3, p1, Lzh2/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lzh2/a;->f:I

    iget v3, p1, Lzh2/a;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lzh2/a;->g:Lzh2/b;

    iget-object p1, p1, Lzh2/a;->g:Lzh2/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lzh2/a;->f:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lzh2/a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lzh2/a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lzh2/a;->c:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget v2, p0, Lzh2/a;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lzh2/a;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lzh2/a;->f:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lzh2/a;->g:Lzh2/b;

    invoke-virtual {v1}, Lzh2/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lzh2/a;->a:Z

    iget v1, p0, Lzh2/a;->b:I

    iget-object v2, p0, Lzh2/a;->c:Ljava/util/Map;

    iget v3, p0, Lzh2/a;->d:I

    iget v4, p0, Lzh2/a;->e:I

    iget v5, p0, Lzh2/a;->f:I

    iget-object v6, p0, Lzh2/a;->g:Lzh2/b;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "BurstFlushResult(success="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", totalPacketCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dataPacketCountsByRevision="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", firmwareEventPacketCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", consoleLogPacketCount="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unknownRevisionCount="

    const-string v1, ", sequenceInfo="

    invoke-static {v7, v4, v0, v5, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
