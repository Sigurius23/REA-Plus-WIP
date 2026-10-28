.class public Lcom/mapbox/common/DeferredDeliveryServiceOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final batchFlushTimeout:J

.field private final batchLengthToFlush:J

.field private final dataStoragePath:Ljava/lang/String;

.field private final maxStorageUsage:Ljava/lang/Long;

.field private final memoryQueueFlushTimeout:J

.field private final memoryQueueLengthToFlush:J

.field private final memoryQueueMaxLength:Ljava/lang/Long;

.field private final memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

.field private final persistentQueueFlushTimeout:J

.field private final persistentQueueLengthToFlush:J

.field private final persistentQueueMaxLength:Ljava/lang/Long;

.field private final persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

.field private final storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;

    invoke-static {v0}, Lcom/mapbox/common/BaseMapboxInitializer;->init(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(JJLjava/lang/Long;JJLcom/mapbox/common/DeferredDeliveryOverflowPolicy;Ljava/lang/Long;JJLcom/mapbox/common/DeferredDeliveryOverflowPolicy;Ljava/lang/String;Ljava/lang/Long;Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    .line 3
    iput-wide p3, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    .line 4
    iput-object p5, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    .line 5
    iput-wide p6, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    .line 6
    iput-wide p8, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    .line 7
    iput-object p10, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    .line 8
    iput-object p11, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    .line 9
    iput-wide p12, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    .line 10
    iput-wide p14, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    move-object/from16 p1, p16

    .line 11
    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    move-object/from16 p1, p17

    .line 12
    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 13
    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    move-object/from16 p1, p19

    .line 14
    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    .line 17
    iput-object p2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    .line 18
    iput-object p3, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    .line 19
    iput-object p4, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    const-wide/16 p1, 0xb4

    .line 20
    iput-wide p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    const-wide/32 p3, 0x2bf20

    .line 21
    iput-wide p3, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    .line 22
    iput-wide p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    .line 23
    iput-wide p3, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    .line 24
    sget-object v0, Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;->RETIRE_OLDEST:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iput-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    .line 25
    iput-wide p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    .line 26
    iput-wide p3, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    .line 27
    iput-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    .line 28
    sget-object p1, Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;->DISCARD_INCOMING:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iput-object p1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;

    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    iget-wide v4, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    iget-object v3, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    :cond_d
    iget-object v2, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iget-object p1, p1, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v1

    :cond_e
    return v0

    :cond_f
    :goto_0
    return v1
.end method

.method public getBatchFlushTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    return-wide v0
.end method

.method public getBatchLengthToFlush()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    return-wide v0
.end method

.method public getDataStoragePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxStorageUsage()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    return-object v0
.end method

.method public getMemoryQueueFlushTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    return-wide v0
.end method

.method public getMemoryQueueLengthToFlush()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    return-wide v0
.end method

.method public getMemoryQueueMaxLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    return-object v0
.end method

.method public getMemoryQueueOverflowPolicy()Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    return-object v0
.end method

.method public getPersistentQueueFlushTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    return-wide v0
.end method

.method public getPersistentQueueLengthToFlush()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    return-wide v0
.end method

.method public getPersistentQueueMaxLength()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    return-object v0
.end method

.method public getPersistentQueueOverflowPolicy()Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    return-object v0
.end method

.method public getStorageOverflowPolicy()Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    return-object v0
.end method

.method public hashCode()I
    .locals 15

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-object v7, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iget-object v8, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    iget-wide v0, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    iget-object v11, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    iget-object v12, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    iget-object v13, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    iget-object v14, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    filled-new-array/range {v2 .. v14}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[batchLengthToFlush: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchLengthToFlush:J

    const-string v3, ", batchFlushTimeout: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->batchFlushTimeout:J

    const-string v3, ", memoryQueueMaxLength: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueMaxLength:Ljava/lang/Long;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", memoryQueueLengthToFlush: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueLengthToFlush:J

    const-string v3, ", memoryQueueFlushTimeout: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueFlushTimeout:J

    const-string v3, ", memoryQueueOverflowPolicy: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->memoryQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", persistentQueueMaxLength: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueMaxLength:Ljava/lang/Long;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", persistentQueueLengthToFlush: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueLengthToFlush:J

    const-string v3, ", persistentQueueFlushTimeout: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-wide v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueFlushTimeout:J

    const-string v3, ", persistentQueueOverflowPolicy: "

    invoke-static {v1, v2, v3, v0}, Lc13/a;->t(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->persistentQueueOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dataStoragePath: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->dataStoragePath:Ljava/lang/String;

    const-string v2, ", maxStorageUsage: "

    invoke-static {v1, v2, v0}, Lc13/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->maxStorageUsage:Ljava/lang/Long;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", storageOverflowPolicy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/DeferredDeliveryServiceOptions;->storageOverflowPolicy:Lcom/mapbox/common/DeferredDeliveryOverflowPolicy;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
