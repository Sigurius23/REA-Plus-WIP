.class public final Lgu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010 \u001a\u0004\u0008!\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008\u001d\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lgu0/a;",
        "",
        "",
        "id",
        "packetTimeStampUtcMillis",
        "sequenceNo",
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "metadata",
        "",
        "subtype",
        "Ljava/nio/ByteBuffer;",
        "receivedPacketRaw",
        "<init>",
        "(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;)V",
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
        "()J",
        "b",
        "c",
        "e",
        "d",
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;",
        "I",
        "f",
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
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

.field private final e:I

.field private final f:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "metadata"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedPacketRaw"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lgu0/a;->a:J

    .line 3
    iput-wide p3, p0, Lgu0/a;->b:J

    .line 4
    iput-wide p5, p0, Lgu0/a;->c:J

    .line 5
    iput-object p7, p0, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    .line 6
    iput p8, p0, Lgu0/a;->e:I

    .line 7
    iput-object p9, p0, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public synthetic constructor <init>(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    .line 8
    invoke-direct/range {v0 .. v9}, Lgu0/a;-><init>(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lgu0/a;->a:J

    return-wide v0
.end method

.method public final b()Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;
    .locals 1

    iget-object v0, p0, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lgu0/a;->b:J

    return-wide v0
.end method

.method public final d()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, Lgu0/a;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgu0/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgu0/a;

    iget-wide v3, p0, Lgu0/a;->a:J

    iget-wide v5, p1, Lgu0/a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lgu0/a;->b:J

    iget-wide v5, p1, Lgu0/a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lgu0/a;->c:J

    iget-wide v5, p1, Lgu0/a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    iget-object v3, p1, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lgu0/a;->e:I

    iget v3, p1, Lgu0/a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    iget-object p1, p1, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lgu0/a;->e:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lgu0/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lgu0/a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lgu0/a;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    invoke-virtual {v2}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lgu0/a;->e:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lgu0/a;->a:J

    iget-wide v2, p0, Lgu0/a;->b:J

    iget-wide v4, p0, Lgu0/a;->c:J

    iget-object v6, p0, Lgu0/a;->d:Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    iget v7, p0, Lgu0/a;->e:I

    iget-object v8, p0, Lgu0/a;->f:Ljava/nio/ByteBuffer;

    const-string v9, "Rev2DataSettingsDto(id="

    const-string v10, ", packetTimeStampUtcMillis="

    invoke-static {v0, v1, v9, v10}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sequenceNo="

    const-string v2, ", metadata="

    invoke-static {v0, v1, v4, v5, v2}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtype="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receivedPacketRaw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
