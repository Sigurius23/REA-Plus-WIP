.class public final Log3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public a:Ljava/util/List;

.field public final b:Ljava/util/concurrent/ConcurrentSkipListMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Log3/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x2

    const/16 v3, 0x200

    invoke-direct {v0, v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    sput-object v0, Log3/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v0, Log3/j;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Log3/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Log3/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log3/j;

    invoke-virtual {v0}, Log3/j;->a()V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;-><init>()V

    iput-object v0, p0, Log3/d;->b:Ljava/util/concurrent/ConcurrentSkipListMap;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1}, Log3/d;->b(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lorg/threeten/bp/zone/ZoneRulesException;

    const-string v1, "Unable to load TZDB time-zone rules"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static a(Ljava/lang/String;)Log3/h;
    .locals 7

    const-string v0, "zoneId"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Log3/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Log3/d;

    const-string v2, "Unknown time-zone ID: "

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Lorg/threeten/bp/zone/ZoneRulesException;

    const-string v0, "No time-zone data files registered"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance v0, Lorg/threeten/bp/zone/ZoneRulesException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Log3/d;->b:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->lastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log3/c;

    iget-object v1, v0, Log3/c;->b:[Ljava/lang/String;

    invoke-static {v1, p0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    :try_start_0
    iget-object v3, v0, Log3/c;->c:[S

    aget-short v1, v3, v1

    iget-object v3, v0, Log3/c;->d:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, [B

    if-eqz v5, :cond_3

    check-cast v4, [B

    new-instance v5, Ljava/io/DataInputStream;

    new-instance v6, Ljava/io/ByteArrayInputStream;

    invoke-direct {v6, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v5}, Ljava/io/DataInputStream;->readByte()B

    move-result v4

    invoke-static {v4, v5}, Log3/a;->b(BLjava/io/DataInput;)Ljava/io/Serializable;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    :cond_3
    move-object v1, v4

    check-cast v1, Log3/h;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance v0, Lorg/threeten/bp/zone/ZoneRulesException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v1

    new-instance v2, Lorg/threeten/bp/zone/ZoneRulesException;

    const-string v3, "Invalid binary time-zone data: TZDB:"

    const-string v4, ", version: "

    invoke-static {v3, p0, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget-object v0, v0, Log3/c;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static c(Log3/d;)V
    .locals 4

    const-string v0, "provider"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Log3/d;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "zoneId"

    invoke-static {v1, v2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Log3/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Log3/d;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/threeten/bp/zone/ZoneRulesException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to register zone as one already registered with that ID: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", currently loading from provider: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Log3/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/InputStream;)V
    .locals 12

    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    move-result p1

    const/4 v1, 0x1

    const-string v2, "File format not recognised"

    if-ne p1, v1, :cond_9

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TZDB"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result p1

    new-array v1, p1, [Ljava/lang/String;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p1, :cond_0

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v3

    new-array v4, v3, [Ljava/lang/String;

    move v5, v2

    :goto_1
    if-ge v5, v3, :cond_1

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Log3/d;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v3

    new-array v5, v3, [Ljava/lang/Object;

    move v6, v2

    :goto_2
    if-ge v6, v3, :cond_2

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v7

    new-array v7, v7, [B

    invoke-virtual {v0, v7}, Ljava/io/DataInputStream;->readFully([B)V

    aput-object v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v3, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>([Ljava/lang/Object;)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, p1}, Ljava/util/HashSet;-><init>(I)V

    move v6, v2

    :goto_3
    if-ge v6, p1, :cond_4

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v7

    new-array v8, v7, [Ljava/lang/String;

    new-array v9, v7, [S

    move v10, v2

    :goto_4
    if-ge v10, v7, :cond_3

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v11

    aget-object v11, v4, v11

    aput-object v11, v8, v10

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v11

    aput-short v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_3
    new-instance v7, Log3/c;

    aget-object v10, v1, v6

    invoke-direct {v7, v10, v8, v9, v3}, Log3/c;-><init>(Ljava/lang/String;[Ljava/lang/String;[SLjava/util/concurrent/atomic/AtomicReferenceArray;)V

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log3/c;

    iget-object v1, v0, Log3/c;->a:Ljava/lang/String;

    iget-object v2, p0, Log3/d;->b:Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/ConcurrentSkipListMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log3/c;

    if-eqz v0, :cond_5

    iget-object v0, v0, Log3/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    new-instance p1, Lorg/threeten/bp/zone/ZoneRulesException;

    const-string v0, "Data already loaded for TZDB time-zone rules version: "

    invoke-static {v0, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void

    :cond_8
    new-instance p1, Ljava/io/StreamCorruptedException;

    invoke-direct {p1, v2}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/io/StreamCorruptedException;

    invoke-direct {p1, v2}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "TZDB"

    return-object v0
.end method
