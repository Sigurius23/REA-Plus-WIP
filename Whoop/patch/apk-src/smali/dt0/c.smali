.class public final Ldt0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJL\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008 \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008!\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\"\u001a\u0004\u0008#\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001c\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "Ldt0/c;",
        "",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "triggerSource",
        "",
        "triggerTimestamp",
        "resultTimestamp",
        "totalPacketUploadCount",
        "",
        "uploadRetryCount",
        "highWaterMark",
        "<init>",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)V",
        "a",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)Ldt0/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "e",
        "()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "b",
        "J",
        "f",
        "()J",
        "c",
        "getResultTimestamp",
        "d",
        "I",
        "getUploadRetryCount",
        "connectivity-core_release"
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
.field private final a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:I

.field private final f:J


# direct methods
.method public constructor <init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)V
    .locals 1

    const-string v0, "triggerSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    .line 3
    iput-wide p2, p0, Ldt0/c;->b:J

    .line 4
    iput-wide p4, p0, Ldt0/c;->c:J

    .line 5
    iput-wide p6, p0, Ldt0/c;->d:J

    .line 6
    iput p8, p0, Ldt0/c;->e:I

    .line 7
    iput-wide p9, p0, Ldt0/c;->f:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    .line 8
    sget-object p1, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const-wide/16 v0, -0x1

    if-eqz p12, :cond_1

    move-wide p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move-wide p4, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-wide p6, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    const/4 p8, 0x0

    :cond_4
    and-int/lit8 p11, p11, 0x20

    if-eqz p11, :cond_5

    move-wide p11, v0

    :goto_0
    move p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    goto :goto_1

    :cond_5
    move-wide p11, p9

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p2 .. p12}, Ldt0/c;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)V

    return-void
.end method

.method public static synthetic b(Ldt0/c;Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJILjava/lang/Object;)Ldt0/c;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-wide p2, p0, Ldt0/c;->b:J

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-wide p4, p0, Ldt0/c;->c:J

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-wide p6, p0, Ldt0/c;->d:J

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p8, p0, Ldt0/c;->e:I

    :cond_4
    and-int/lit8 p11, p11, 0x20

    if-eqz p11, :cond_5

    iget-wide p9, p0, Ldt0/c;->f:J

    :cond_5
    move-wide p11, p9

    move p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p12}, Ldt0/c;->a(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)Ldt0/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)Ldt0/c;
    .locals 12

    const-string v0, "triggerSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldt0/c;

    move-object v2, p1

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Ldt0/c;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJ)V

    return-object v1
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ldt0/c;->f:J

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Ldt0/c;->d:J

    return-wide v0
.end method

.method public final e()Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
    .locals 1

    iget-object v0, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldt0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldt0/c;

    iget-object v1, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-object v3, p1, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Ldt0/c;->b:J

    iget-wide v5, p1, Ldt0/c;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Ldt0/c;->c:J

    iget-wide v5, p1, Ldt0/c;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ldt0/c;->d:J

    iget-wide v5, p1, Ldt0/c;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Ldt0/c;->e:I

    iget v3, p1, Ldt0/c;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Ldt0/c;->f:J

    iget-wide v5, p1, Ldt0/c;->f:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Ldt0/c;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Ldt0/c;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ldt0/c;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Ldt0/c;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Ldt0/c;->e:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v1, p0, Ldt0/c;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Ldt0/c;->a:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-wide v1, p0, Ldt0/c;->b:J

    iget-wide v3, p0, Ldt0/c;->c:J

    iget-wide v5, p0, Ldt0/c;->d:J

    iget v7, p0, Ldt0/c;->e:I

    iget-wide v8, p0, Ldt0/c;->f:J

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "DataSyncEventMetaData(triggerSource="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", triggerTimestamp="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", resultTimestamp="

    const-string v1, ", totalPacketUploadCount="

    invoke-static {v10, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", uploadRetryCount="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", highWaterMark="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
