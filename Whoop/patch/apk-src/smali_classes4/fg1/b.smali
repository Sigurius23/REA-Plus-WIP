.class public final Lfg1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010!\u001a\u0004\u0008 \u0010\u0011\u00a8\u0006\""
    }
    d2 = {
        "Lfg1/b;",
        "",
        "Loh2/a;",
        "dataAcquisitionInfo",
        "Ljava/io/File;",
        "fileToBeUploaded",
        "",
        "oldestTimestamp",
        "newestTimestamp",
        "",
        "noOfEvents",
        "<init>",
        "(Loh2/a;Ljava/io/File;JJI)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Loh2/a;",
        "()Loh2/a;",
        "b",
        "Ljava/io/File;",
        "()Ljava/io/File;",
        "c",
        "J",
        "e",
        "()J",
        "d",
        "I",
        "firmware-events_release"
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
.field private final a:Loh2/a;

.field private final b:Ljava/io/File;

.field private final c:J

.field private final d:J

.field private final e:I


# direct methods
.method public constructor <init>(Loh2/a;Ljava/io/File;JJI)V
    .locals 1

    const-string v0, "fileToBeUploaded"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg1/b;->a:Loh2/a;

    iput-object p2, p0, Lfg1/b;->b:Ljava/io/File;

    iput-wide p3, p0, Lfg1/b;->c:J

    iput-wide p5, p0, Lfg1/b;->d:J

    iput p7, p0, Lfg1/b;->e:I

    return-void
.end method


# virtual methods
.method public final a()Loh2/a;
    .locals 1

    iget-object v0, p0, Lfg1/b;->a:Loh2/a;

    return-object v0
.end method

.method public final b()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lfg1/b;->b:Ljava/io/File;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lfg1/b;->d:J

    return-wide v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lfg1/b;->e:I

    return v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lfg1/b;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfg1/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfg1/b;

    iget-object v1, p0, Lfg1/b;->a:Loh2/a;

    iget-object v3, p1, Lfg1/b;->a:Loh2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfg1/b;->b:Ljava/io/File;

    iget-object v3, p1, Lfg1/b;->b:Ljava/io/File;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lfg1/b;->c:J

    iget-wide v5, p1, Lfg1/b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lfg1/b;->d:J

    iget-wide v5, p1, Lfg1/b;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lfg1/b;->e:I

    iget p1, p1, Lfg1/b;->e:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lfg1/b;->a:Loh2/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Loh2/a;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfg1/b;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lfg1/b;->c:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lfg1/b;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Lfg1/b;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lfg1/b;->a:Loh2/a;

    iget-object v1, p0, Lfg1/b;->b:Ljava/io/File;

    iget-wide v2, p0, Lfg1/b;->c:J

    iget-wide v4, p0, Lfg1/b;->d:J

    iget v6, p0, Lfg1/b;->e:I

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ExportedStrapEventsMetaData(dataAcquisitionInfo="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fileToBeUploaded="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", oldestTimestamp="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", newestTimestamp="

    const-string v1, ", noOfEvents="

    invoke-static {v7, v0, v4, v5, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
