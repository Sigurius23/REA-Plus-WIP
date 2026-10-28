.class public final Lhu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0080\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001e\u001a\u0004\u0008\"\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010$\u001a\u0004\u0008\'\u0010\u0012\u00a8\u0006("
    }
    d2 = {
        "Lhu1/a;",
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
        "packetRevision",
        "<init>",
        "(Loh2/a;Ljava/io/File;JJII)V",
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
        "getOldestTimestamp",
        "()J",
        "d",
        "getNewestTimestamp",
        "e",
        "I",
        "getNoOfEvents",
        "f",
        "getPacketRevision",
        "labrador-service_release"
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

.field private final f:I


# direct methods
.method public constructor <init>(Loh2/a;Ljava/io/File;JJII)V
    .locals 1

    const-string v0, "fileToBeUploaded"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhu1/a;->a:Loh2/a;

    iput-object p2, p0, Lhu1/a;->b:Ljava/io/File;

    iput-wide p3, p0, Lhu1/a;->c:J

    iput-wide p5, p0, Lhu1/a;->d:J

    iput p7, p0, Lhu1/a;->e:I

    iput p8, p0, Lhu1/a;->f:I

    return-void
.end method


# virtual methods
.method public final a()Loh2/a;
    .locals 1

    iget-object v0, p0, Lhu1/a;->a:Loh2/a;

    return-object v0
.end method

.method public final b()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lhu1/a;->b:Ljava/io/File;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhu1/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhu1/a;

    iget-object v1, p0, Lhu1/a;->a:Loh2/a;

    iget-object v3, p1, Lhu1/a;->a:Loh2/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhu1/a;->b:Ljava/io/File;

    iget-object v3, p1, Lhu1/a;->b:Ljava/io/File;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lhu1/a;->c:J

    iget-wide v5, p1, Lhu1/a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lhu1/a;->d:J

    iget-wide v5, p1, Lhu1/a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lhu1/a;->e:I

    iget v3, p1, Lhu1/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lhu1/a;->f:I

    iget p1, p1, Lhu1/a;->f:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lhu1/a;->a:Loh2/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Loh2/a;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lhu1/a;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lhu1/a;->c:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lhu1/a;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lhu1/a;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lhu1/a;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lhu1/a;->a:Loh2/a;

    iget-object v1, p0, Lhu1/a;->b:Ljava/io/File;

    iget-wide v2, p0, Lhu1/a;->c:J

    iget-wide v4, p0, Lhu1/a;->d:J

    iget v6, p0, Lhu1/a;->e:I

    iget v7, p0, Lhu1/a;->f:I

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "ExportedLabradorPacketsMetaData(dataAcquisitionInfo="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fileToBeUploaded="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", oldestTimestamp="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", newestTimestamp="

    const-string v1, ", noOfEvents="

    invoke-static {v8, v0, v4, v5, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v0, ", packetRevision="

    const-string v1, ")"

    invoke-static {v8, v6, v0, v7, v1}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
