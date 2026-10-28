.class public final Lzt0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0017\u001a\u0004\u0008\u001e\u0010\u0019R\u001a\u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0016\u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\"\u001a\u0004\u0008\u001f\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lzt0/b;",
        "",
        "",
        "id",
        "",
        "sequenceNo",
        "packetTimeStampUtcMillis",
        "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "consolePacketsMetadata",
        "Ljava/nio/ByteBuffer;",
        "receivedPacketRaw",
        "<init>",
        "(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V",
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
        "J",
        "b",
        "()J",
        "setId",
        "(J)V",
        "I",
        "e",
        "c",
        "d",
        "Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "()Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;",
        "Ljava/nio/ByteBuffer;",
        "()Ljava/nio/ByteBuffer;",
        "connectivity-data-packets-model_release"
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
.field private a:J

.field private final b:I

.field private final c:J

.field private final d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

.field private final e:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "consolePacketsMetadata"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedPacketRaw"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lzt0/b;->a:J

    .line 3
    iput p3, p0, Lzt0/b;->b:I

    .line 4
    iput-wide p4, p0, Lzt0/b;->c:J

    .line 5
    iput-object p6, p0, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    .line 6
    iput-object p7, p0, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public synthetic constructor <init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-wide v4, p4

    move-object v6, p6

    move-object v7, p7

    .line 7
    invoke-direct/range {v0 .. v7}, Lzt0/b;-><init>(JIJLcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;
    .locals 1

    iget-object v0, p0, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lzt0/b;->a:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lzt0/b;->c:J

    return-wide v0
.end method

.method public final d()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lzt0/b;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzt0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzt0/b;

    iget-wide v3, p0, Lzt0/b;->a:J

    iget-wide v5, p1, Lzt0/b;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lzt0/b;->b:I

    iget v3, p1, Lzt0/b;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lzt0/b;->c:J

    iget-wide v5, p1, Lzt0/b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    iget-object v3, p1, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    iget-object p1, p1, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lzt0/b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lzt0/b;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lzt0/b;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    invoke-virtual {v2}, Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lzt0/b;->a:J

    iget v2, p0, Lzt0/b;->b:I

    iget-wide v3, p0, Lzt0/b;->c:J

    iget-object v5, p0, Lzt0/b;->d:Lcom/whoop/connectivityDataPacketsModels/console/dto/ConsolePacketsMetadata;

    iget-object v6, p0, Lzt0/b;->e:Ljava/nio/ByteBuffer;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ConsolePacketsDtoNew(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", sequenceNo="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", packetTimeStampUtcMillis="

    const-string v1, ", consolePacketsMetadata="

    invoke-static {v7, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", receivedPacketRaw="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
