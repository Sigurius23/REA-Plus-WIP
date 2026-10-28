.class public final Lnu0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llu0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0016\u0010\u001fR\u001a\u0010\u0008\u001a\u00020\u00028\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0017\u001a\u0004\u0008\u001d\u0010\u0010\u00a8\u0006!"
    }
    d2 = {
        "Lnu0/a;",
        "Llu0/a;",
        "",
        "packetRevision",
        "",
        "timestamp",
        "Ljava/nio/ByteBuffer;",
        "packetData",
        "versionId",
        "frameRevision",
        "<init>",
        "(IJLjava/nio/ByteBuffer;II)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "d",
        "b",
        "J",
        "getTimestamp",
        "()J",
        "c",
        "Ljava/nio/ByteBuffer;",
        "()Ljava/nio/ByteBuffer;",
        "e",
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
.field private final a:I

.field private final b:J

.field private final c:Ljava/nio/ByteBuffer;

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(IJLjava/nio/ByteBuffer;II)V
    .locals 1

    const-string v0, "packetData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnu0/a;->a:I

    iput-wide p2, p0, Lnu0/a;->b:J

    iput-object p4, p0, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    iput p5, p0, Lnu0/a;->d:I

    iput p6, p0, Lnu0/a;->e:I

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lnu0/a;->d:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lnu0/a;->e:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lnu0/a;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnu0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnu0/a;

    iget v1, p0, Lnu0/a;->a:I

    iget v3, p1, Lnu0/a;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lnu0/a;->b:J

    iget-wide v5, p1, Lnu0/a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    iget-object v3, p1, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lnu0/a;->d:I

    iget v3, p1, Lnu0/a;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lnu0/a;->e:I

    iget p1, p1, Lnu0/a;->e:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lnu0/a;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lnu0/a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lnu0/a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lnu0/a;->d:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lnu0/a;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lnu0/a;->a:I

    iget-wide v1, p0, Lnu0/a;->b:J

    iget-object v3, p0, Lnu0/a;->c:Ljava/nio/ByteBuffer;

    iget v4, p0, Lnu0/a;->d:I

    iget v5, p0, Lnu0/a;->e:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "MetricsDataDto(packetRevision="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", packetData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", versionId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", frameRevision="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
