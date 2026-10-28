.class public final Lio/seon/androidsdk/service/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Lbu/c;

.field public static l:Ljava/lang/String;

.field public static m:Lio/seon/androidsdk/service/SeonNT;


# instance fields
.field public final a:Lio/seon/androidsdk/service/f;

.field public volatile b:Lio/seon/androidsdk/service/k0;

.field public c:Lorg/json/JSONObject;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/lang/String;

.field public f:Z

.field public final g:Lio/seon/androidsdk/service/c1;

.field public final h:Ljava/util/concurrent/locks/ReentrantLock;

.field public final i:Ljava/util/concurrent/locks/Condition;

.field public j:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/i1;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/i1;->k:Lbu/c;

    const/4 v0, 0x0

    sput-object v0, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;

    sput-object v0, Lio/seon/androidsdk/service/i1;->m:Lio/seon/androidsdk/service/SeonNT;

    return-void
.end method

.method public constructor <init>(Lio/seon/androidsdk/service/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/seon/androidsdk/service/i1;->c:Lorg/json/JSONObject;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/i1;->i:Ljava/util/concurrent/locks/Condition;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/seon/androidsdk/service/i1;->j:Z

    iput-object p1, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    new-instance v0, Lio/seon/androidsdk/service/k0;

    invoke-direct {v0, p1}, Lio/seon/androidsdk/service/k0;-><init>(Lio/seon/androidsdk/service/f;)V

    iput-object v0, p0, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    new-instance v0, Lio/seon/androidsdk/service/c1;

    iget-object v1, p1, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lio/seon/androidsdk/service/c1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lio/seon/androidsdk/service/i1;->g:Lio/seon/androidsdk/service/c1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    new-instance v0, Lio/seon/androidsdk/service/SeonNT;

    iget-object p1, p1, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    invoke-direct {v0, p1}, Lio/seon/androidsdk/service/SeonNT;-><init>(Landroid/content/Context;)V

    sput-object v0, Lio/seon/androidsdk/service/i1;->m:Lio/seon/androidsdk/service/SeonNT;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-void
.end method

.method public static varargs c([Lio/seon/androidsdk/service/i;)Lorg/json/JSONObject;
    .locals 10

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, p0, v3

    check-cast v4, Lio/seon/androidsdk/service/g;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-interface {v4}, Lio/seon/androidsdk/service/i;->b()Ljava/util/Map;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v5

    :try_start_0
    iget-object v5, v4, Lio/seon/androidsdk/service/g;->a:Ljava/util/HashMap;

    iget-object v4, v4, Lio/seon/androidsdk/service/g;->c:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    const-string v5, "experimental"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    if-nez v7, :cond_0

    goto :goto_3

    :cond_0
    check-cast v7, Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :catch_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    :try_start_1
    instance-of v7, v5, Ljava/util/Collection;

    if-eqz v7, :cond_1

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v5

    :goto_2
    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_1
    instance-of v7, v5, Ljava/util/Map;

    if-eqz v7, :cond_2

    check-cast v5, Ljava/util/Map;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/util/Map;

    aput-object v5, v7, v2

    invoke-static {v7}, Lio/seon/androidsdk/service/o;->d([Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v5

    goto :goto_2

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->isArray()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/String;

    if-ne v7, v8, :cond_3

    new-instance v7, Lorg/json/JSONArray;

    check-cast v5, [Ljava/lang/String;

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v7, v5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_3
    invoke-static {v0, v6, v5}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    return-object v0
.end method

.method public static f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    if-nez p2, :cond_0

    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public static g(Ljava/lang/String;)[B
    .locals 7

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->finish()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    sget-object v3, Lio/seon/androidsdk/service/i1;->m:Lio/seon/androidsdk/service/SeonNT;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    :try_start_4
    invoke-virtual {v3}, Lio/seon/androidsdk/service/SeonNT;->a()I

    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catchall_0
    const/16 v3, 0x40

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    add-int/lit8 v3, v3, 0x60

    :try_start_5
    array-length v5, v2

    const/16 v6, 0xa

    if-lt v5, v6, :cond_1

    aget-byte v4, v2, v4

    const/16 v5, 0x1f

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    aget-byte v4, v2, v4

    const/16 v5, -0x75

    if-ne v4, v5, :cond_1

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    const/16 v4, 0x9

    aput-byte v3, v2, v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    :cond_1
    :try_start_6
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    return-object v2

    :catchall_2
    move-exception v1

    goto :goto_2

    :catchall_3
    move-exception v2

    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_1

    :catchall_4
    move-exception v1

    :try_start_9
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :goto_2
    :try_start_a
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    return-object p0
.end method

.method public static j()Ljava/lang/String;
    .locals 6

    const-string v0, "6.8.4"

    :try_start_0
    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "\\."

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    if-lez v2, :cond_0

    aget-object v2, v0, v1

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    array-length v3, v0

    const/4 v4, 0x1

    if-le v3, v4, :cond_1

    aget-object v3, v0, v4

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    array-length v4, v0

    const/4 v5, 0x2

    if-le v4, v5, :cond_2

    aget-object v0, v0, v5

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :cond_2
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%s%02d%02d%02d"

    const-string v5, "02"

    rem-int/lit8 v2, v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    rem-int/lit8 v3, v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    rem-int/lit8 v1, v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v5, v2, v3, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    iget-object v0, v0, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    const-string v1, "PREF_UNIQUE_ID"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "PREF_UNIQUE_ID"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sget-object v1, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;

    const-string v2, "PREF_UNIQUE_ID"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lio/seon/androidsdk/service/i1;->l:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 9

    const-string v0, "Android;"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "source"

    iget-object v3, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "android-6.8.4"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "request_id"

    invoke-static {v1, v2, p1}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "battery_total_capacity"

    const-string v2, "battery_total_capacity"

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p1, p2}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "emulator_trigger_cause"

    const-string p2, ""

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 p1, 0x10

    new-array v6, p1, [B

    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {p1, v6}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 p1, 0x2

    invoke-static {v6, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/seon/androidsdk/service/i1;->g(Ljava/lang/String;)[B

    move-result-object v4

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    iget-object v2, v2, Lio/seon/androidsdk/service/f;->c:Lio/seon/androidsdk/service/f1;

    iget-object v3, v2, Lio/seon/androidsdk/service/f1;->b:Ljava/lang/Object;

    check-cast v3, Lio/seon/androidsdk/service/JNIHandler;

    iget-object v2, v2, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    array-length v5, v4

    const/4 v7, 0x1

    move-object v8, v3

    move-object v3, v2

    move-object v2, v8

    invoke-virtual/range {v2 .. v7}, Lio/seon/androidsdk/service/JNIHandler;->encrypt(Ljava/lang/Object;[BI[BI)[B

    move-result-object v2

    invoke-static {v2, p1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v2, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v2

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ";"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v2

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    const-string p2, "DCReq"

    invoke-static {p2, p1}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljava/lang/Boolean;)V
    .locals 28

    move-object/from16 v1, p0

    const-string v2, "behaviour_results"

    const-string v3, "true_device_id_source"

    const-string v4, "media_drm_id"

    sget-object v5, Lio/seon/androidsdk/service/i1;->k:Lbu/c;

    const-string v6, "device_id"

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :goto_0
    :try_start_0
    iget-boolean v0, v1, Lio/seon/androidsdk/service/i1;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->i:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_21

    :cond_0
    iget-object v7, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    invoke-virtual {v1}, Lio/seon/androidsdk/service/i1;->h()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {}, Lio/seon/androidsdk/service/o;->n()V

    invoke-static {}, Lio/seon/androidsdk/service/o;->o()V

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/f;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v10, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iget-object v10, v10, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    iget-object v10, v10, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    if-eqz v10, :cond_1

    iget-object v10, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iget-object v10, v10, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    iget-object v10, v10, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :try_start_1
    iget-object v12, v7, Lio/seon/androidsdk/service/k0;->a:Lio/seon/androidsdk/service/b0;

    invoke-virtual {v12}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v12

    iget-object v13, v7, Lio/seon/androidsdk/service/k0;->d:Lio/seon/androidsdk/service/n;

    invoke-virtual {v13}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v13

    iget-object v14, v7, Lio/seon/androidsdk/service/k0;->e:Lio/seon/androidsdk/service/w;

    invoke-virtual {v14}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v14

    iget-object v15, v7, Lio/seon/androidsdk/service/k0;->b:Lio/seon/androidsdk/service/s0;

    invoke-virtual {v15}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v15

    iget-object v11, v7, Lio/seon/androidsdk/service/k0;->c:Lio/seon/androidsdk/service/j1;

    invoke-virtual {v11}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v11

    iget-object v10, v7, Lio/seon/androidsdk/service/k0;->f:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v10}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v10

    move-wide/from16 v17, v8

    iget-object v8, v7, Lio/seon/androidsdk/service/k0;->g:Lio/seon/androidsdk/service/r;

    invoke-virtual {v8}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v8

    iget-object v9, v7, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    invoke-virtual {v9}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v7}, Lio/seon/androidsdk/service/k0;->b()Lio/seon/androidsdk/service/u0;

    move-result-object v19

    move-object/from16 v20, v2

    invoke-virtual/range {v19 .. v19}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v2

    move-object/from16 v19, v3

    iget-object v3, v7, Lio/seon/androidsdk/service/k0;->j:Lio/seon/androidsdk/service/z0;

    invoke-virtual {v3}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v7}, Lio/seon/androidsdk/service/k0;->c()Lio/seon/androidsdk/service/u;

    move-result-object v21

    move-object/from16 v22, v6

    invoke-virtual/range {v21 .. v21}, Lio/seon/androidsdk/service/g;->e()Ljava/util/Map;

    move-result-object v6

    move-object/from16 v21, v4

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    sget-object v23, Lio/seon/androidsdk/service/b0;->m:[Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v24, v5

    move-object/from16 v26, v7

    const/4 v5, 0x0

    :goto_1
    const/16 v7, 0x11

    if-ge v5, v7, :cond_2

    :try_start_2
    aget-object v7, v23, v5

    move/from16 v27, v5

    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v7, v5}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v5, v27, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    move-object/from16 v5, v24

    :goto_2
    const/4 v10, 0x6

    goto/16 :goto_1d

    :catch_1
    move-exception v0

    goto/16 :goto_1e

    :catch_2
    move-exception v0

    move-object/from16 v5, v24

    :goto_3
    const/4 v3, 0x0

    const/4 v10, 0x6

    goto/16 :goto_1f

    :cond_2
    sget-object v5, Lio/seon/androidsdk/service/n;->i:[Ljava/lang/String;

    const/4 v12, 0x0

    :goto_4
    const/16 v7, 0x9

    if-ge v12, v7, :cond_5

    aget-object v7, v5, v12

    move-object/from16 v27, v5

    const-string v5, "enabled_accessibility_apps"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    const-string v5, "interfering_apps"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_5

    :cond_3
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_6

    :cond_4
    :goto_5
    invoke-interface {v13, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v5

    :goto_6
    invoke-static {v4, v7, v5}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v5, v27

    goto :goto_4

    :cond_5
    sget-object v5, Lio/seon/androidsdk/service/w;->h:[Ljava/lang/String;

    const/4 v7, 0x0

    :goto_7
    const/4 v12, 0x6

    if-ge v7, v12, :cond_6

    aget-object v12, v5, v7

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v12, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_6
    sget-object v5, Lio/seon/androidsdk/service/s0;->j:[Ljava/lang/String;

    const/4 v7, 0x0

    const/16 v12, 0x11

    :goto_8
    if-ge v7, v12, :cond_7

    aget-object v13, v5, v7

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4, v13, v14}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_7
    sget-object v5, Lio/seon/androidsdk/service/j1;->f:[Ljava/lang/String;

    const/4 v7, 0x0

    :goto_9
    const/4 v12, 0x4

    if-ge v7, v12, :cond_8

    aget-object v12, v5, v7

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v12, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_8
    sget-object v5, Lio/seon/androidsdk/service/h0;->j:[Ljava/lang/String;

    const/4 v7, 0x0

    :goto_a
    const/16 v11, 0xa

    if-ge v7, v11, :cond_9

    aget-object v11, v5, v7

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v11, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_9
    sget-object v5, Lio/seon/androidsdk/service/r;->k:[Ljava/lang/String;

    const/4 v7, 0x0

    :goto_b
    const/4 v10, 0x6

    if-ge v7, v10, :cond_a

    aget-object v10, v5, v7

    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4, v10, v11}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_a
    const/16 v5, 0x8

    if-eqz v9, :cond_b

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    sget-object v8, Lio/seon/androidsdk/service/p0;->p:[Ljava/lang/String;

    const/4 v10, 0x0

    :goto_c
    if-ge v10, v5, :cond_c

    aget-object v11, v8, v10

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7, v11, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    :cond_b
    const/4 v7, 0x0

    :cond_c
    const-string v8, "device_location"

    invoke-static {v4, v8, v7}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v8, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iget-object v8, v8, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    iget-object v8, v8, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    const-string v10, "enabled"

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    invoke-virtual {v9, v10, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v8, "timeout_ms"

    const/16 v10, 0xbb8

    invoke-virtual {v9, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v8, "prefetch"

    const/4 v11, 0x1

    invoke-virtual {v9, v8, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v8, "max_cache_age"

    const/16 v13, 0x258

    invoke-virtual {v9, v8, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v8, "geolocation_config"

    invoke-static {v4, v8, v9}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v7, :cond_d

    sget-object v8, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    if-eq v7, v8, :cond_d

    const-string v8, "timestamp"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_d

    :cond_d
    const-wide/16 v7, -0x1

    :goto_d
    const-string v9, "location_timestamp"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v4, v9, v7}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v7, Lio/seon/androidsdk/service/u0;->f:[Ljava/lang/String;

    const/4 v8, 0x0

    :goto_e
    const/4 v9, 0x2

    if-ge v8, v9, :cond_e

    aget-object v9, v7, v8

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4, v9, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_e

    :cond_e
    sget-object v2, Lio/seon/androidsdk/service/z0;->i:[Ljava/lang/String;

    array-length v7, v2

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v7, :cond_10

    aget-object v13, v2, v8

    invoke-interface {v3, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/util/Collection;

    if-eqz v15, :cond_f

    check-cast v14, Ljava/util/Collection;

    invoke-static {v14}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v14

    :cond_f
    invoke-static {v4, v13, v14}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_f

    :cond_10
    sget-object v2, Lio/seon/androidsdk/service/u;->j:[Ljava/lang/String;

    if-nez v2, :cond_11

    sget-object v2, Lio/seon/androidsdk/service/u;->i:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/u;->g([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lio/seon/androidsdk/service/u;->j:[Ljava/lang/String;

    :cond_11
    sget-object v2, Lio/seon/androidsdk/service/u;->j:[Ljava/lang/String;

    array-length v3, v2

    const/4 v7, 0x0

    :goto_10
    if-ge v7, v3, :cond_13

    aget-object v8, v2, v7

    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/util/Collection;

    if-eqz v14, :cond_12

    check-cast v13, Ljava/util/Collection;

    invoke-static {v13}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v13

    :cond_12
    invoke-static {v4, v8, v13}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_13
    const-string v2, "app_guid"

    invoke-virtual {v1}, Lio/seon/androidsdk/service/i1;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "build_id"

    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "build_manufacturer"

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "build_number"

    sget-object v3, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "build_time"

    sget-wide v6, Landroid/os/Build;->TIME:J

    const-wide/16 v13, 0x3e8

    div-long/2addr v6, v13

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "session_id"

    invoke-static {v4, v2, v0}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "source"

    iget-object v3, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "android-6.8.4"

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v2, v26

    iget-object v3, v2, Lio/seon/androidsdk/service/k0;->a:Lio/seon/androidsdk/service/b0;

    iget-object v6, v2, Lio/seon/androidsdk/service/k0;->b:Lio/seon/androidsdk/service/s0;

    iget-object v7, v2, Lio/seon/androidsdk/service/k0;->f:Lio/seon/androidsdk/service/h0;

    iget-object v8, v2, Lio/seon/androidsdk/service/k0;->c:Lio/seon/androidsdk/service/j1;

    iget-object v13, v2, Lio/seon/androidsdk/service/k0;->d:Lio/seon/androidsdk/service/n;

    iget-object v14, v2, Lio/seon/androidsdk/service/k0;->e:Lio/seon/androidsdk/service/w;

    iget-object v15, v2, Lio/seon/androidsdk/service/k0;->g:Lio/seon/androidsdk/service/r;

    move/from16 v23, v9

    iget-object v9, v2, Lio/seon/androidsdk/service/k0;->j:Lio/seon/androidsdk/service/z0;

    new-array v5, v5, [Lio/seon/androidsdk/service/i;

    const/16 v25, 0x0

    aput-object v3, v5, v25

    aput-object v6, v5, v11

    aput-object v7, v5, v23

    const/4 v3, 0x3

    aput-object v8, v5, v3

    aput-object v13, v5, v12

    const/4 v3, 0x5

    aput-object v14, v5, v3

    const/16 v16, 0x6

    aput-object v15, v5, v16

    const/4 v3, 0x7

    aput-object v9, v5, v3

    invoke-static {v5}, Lio/seon/androidsdk/service/i1;->c([Lio/seon/androidsdk/service/i;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v5, "experimental_device_location"

    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "experimental_fields"

    invoke-static {v4, v5, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v2}, Lio/seon/androidsdk/service/k0;->a()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/seon/androidsdk/service/g;

    iget-object v7, v6, Lio/seon/androidsdk/service/g;->a:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v9, v6, Lio/seon/androidsdk/service/g;->a:Ljava/util/HashMap;

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :cond_15
    const-string v5, "performance_probes"

    new-array v6, v11, [Ljava/util/Map;

    const/16 v25, 0x0

    aput-object v3, v6, v25

    invoke-static {v6}, Lio/seon/androidsdk/service/o;->d([Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v4, v5, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v3, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v3}, Lio/seon/androidsdk/service/f;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v4}, Lio/seon/androidsdk/service/l0;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lio/seon/androidsdk/service/l0;

    move-result-object v3

    new-instance v7, Lio/seon/androidsdk/service/h1;

    invoke-direct {v7, v1, v5, v6, v4}, Lio/seon/androidsdk/service/h1;-><init>(Lio/seon/androidsdk/service/i1;JLorg/json/JSONObject;)V

    invoke-virtual {v3, v7}, Lio/seon/androidsdk/service/l0;->b(Lio/seon/androidsdk/service/h1;)V

    iget-object v3, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v3

    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v3
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "request_id"

    invoke-static {v4, v8, v7}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v8, Lio/seon/androidsdk/service/c0;

    invoke-virtual {v1, v7, v4}, Lio/seon/androidsdk/service/i1;->b(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v0, v7}, Lio/seon/androidsdk/service/c0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lio/seon/androidsdk/service/i0;

    iget-object v7, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, v8, v10}, Lio/seon/androidsdk/service/i0;-><init>(Lio/seon/androidsdk/service/c0;I)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iget-object v7, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-long v7, v10

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v7, v8, v9}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/seon/androidsdk/service/e0;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v7, "dynamic_evaluator_results"

    if-eqz v0, :cond_16

    :try_start_4
    iget-object v8, v0, Lio/seon/androidsdk/service/e0;->a:Ljava/lang/String;

    if-eqz v8, :cond_16

    invoke-static {v4, v7, v8}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    const-string v5, "performance_network_call"

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v0, Lio/seon/androidsdk/service/e0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "DCEmptyResult"

    const/4 v5, 0x0

    goto :goto_12

    :catchall_1
    move-exception v0

    move-object/from16 v5, v24

    goto/16 :goto_1c

    :catch_3
    move-exception v0

    move-object/from16 v5, v24

    goto :goto_13

    :cond_16
    const/4 v5, 0x0

    invoke-static {v4, v7, v5}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "DCFailure"

    :goto_12
    invoke-static {v0, v5}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_17
    :try_start_5
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object/from16 v5, v24

    goto :goto_14

    :goto_13
    :try_start_6
    invoke-virtual {v5, v0}, Lbu/c;->M(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :goto_14
    const-string v0, "is_emulator"

    iget-boolean v3, v1, Lio/seon/androidsdk/service/i1;->f:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "emulator_trigger_causes"

    iget-object v3, v1, Lio/seon/androidsdk/service/i1;->d:Ljava/util/ArrayList;

    invoke-static {v3}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "predicted_emulator_engine"

    iget-object v3, v1, Lio/seon/androidsdk/service/i1;->e:Ljava/lang/String;

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "version_code"

    invoke-static {}, Lio/seon/androidsdk/service/i1;->j()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v6, v6, v17

    const-string v0, "performance_exec_time"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v3, v21

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_18

    const/4 v6, 0x0

    invoke-static {v4, v3, v6}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    :cond_18
    move-object/from16 v6, v22

    goto :goto_15

    :catch_4
    move-exception v0

    goto/16 :goto_2

    :catch_5
    move-exception v0

    goto/16 :goto_3

    :goto_15
    :try_start_8
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_16

    :catchall_2
    const/4 v0, 0x0

    :goto_16
    :try_start_9
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_17

    :catchall_3
    const/4 v3, 0x0

    :goto_17
    const-string v7, "null"

    if-eqz v0, :cond_19

    :try_start_a
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    :cond_19
    if-eqz v3, :cond_1a

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    invoke-static {v4, v6, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1a
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1b

    const/4 v3, 0x0

    invoke-static {v4, v6, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_5
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    :cond_1b
    move-object/from16 v3, v19

    :try_start_b
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_18

    :catchall_4
    const/4 v0, 0x0

    :goto_18
    :try_start_c
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1c

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1c

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    :cond_1c
    const-string v0, "l0f60b08-156b-4szd-9ca0-756a7af17ba7"

    invoke-static {v4, v3, v0}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1d
    const-string v0, "core_int"

    invoke-static {v4}, Lio/seon/androidsdk/service/k;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v0, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v2, Lio/seon/androidsdk/service/k0;->b:Lio/seon/androidsdk/service/s0;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/s0;->g()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sget-object v3, Lio/seon/androidsdk/service/x;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    iget-object v0, v2, Lio/seon/androidsdk/service/k0;->b:Lio/seon/androidsdk/service/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/seon/androidsdk/service/s0;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    const-string v0, "device_hash"

    invoke-static {v4}, Lio/seon/androidsdk/service/x;->a(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lio/seon/androidsdk/service/j0;->a()Ljava/util/List;

    move-result-object v0

    const-string v2, "port_scan_result"

    invoke-static {v0}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v4, v2, v0}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_5
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4

    :try_start_d
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {v1}, Lio/seon/androidsdk/service/i1;->i()V

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->g:Lio/seon/androidsdk/service/c1;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/c1;->a()Ljava/util/HashMap;

    move-result-object v0

    new-array v2, v11, [Ljava/util/Map;

    const/16 v25, 0x0

    aput-object v0, v2, v25

    invoke-static {v2}, Lio/seon/androidsdk/service/o;->d([Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_d
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8

    move-object/from16 v2, v20

    :try_start_e
    invoke-static {v4, v2, v0}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_e
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_e .. :try_end_e} :catch_7
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    goto :goto_1a

    :catch_6
    move-exception v0

    goto :goto_19

    :catch_7
    move-exception v0

    goto :goto_1b

    :catch_8
    move-exception v0

    move-object/from16 v2, v20

    goto :goto_19

    :cond_20
    move-object/from16 v2, v20

    goto :goto_1a

    :goto_19
    :try_start_f
    const-string v3, "bhvrfp"

    invoke-static {v3, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1a
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_21

    const/4 v3, 0x0

    invoke-static {v4, v2, v3}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_21
    const-string v0, "stored_errors"

    invoke-static {}, Lio/seon/androidsdk/service/o;->m()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lio/seon/androidsdk/service/o;->p()V

    const-string v0, "comm_errors"

    invoke-static {}, Lio/seon/androidsdk/service/o;->j()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2}, Lio/seon/androidsdk/service/o;->c(Ljava/util/Collection;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lio/seon/androidsdk/service/i1;->f(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v4, v1, Lio/seon/androidsdk/service/i1;->c:Lorg/json/JSONObject;

    goto :goto_20

    :goto_1b
    throw v0

    :catchall_5
    move-exception v0

    :goto_1c
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    throw v0
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_5
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    :goto_1d
    invoke-virtual {v5, v10, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    const/4 v3, 0x0

    iput-object v3, v1, Lio/seon/androidsdk/service/i1;->c:Lorg/json/JSONObject;

    invoke-virtual {v5, v10, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_20

    :goto_1e
    throw v0

    :goto_1f
    invoke-virtual {v5, v10, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    iput-object v3, v1, Lio/seon/androidsdk/service/i1;->c:Lorg/json/JSONObject;

    :goto_20
    invoke-static {}, Lio/seon/androidsdk/service/o;->e()V

    return-void

    :catch_9
    :try_start_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    iget-object v0, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_21
    iget-object v2, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final e(Ljava/lang/String;Lio/seon/androidsdk/service/d;Ljava/lang/Boolean;)V
    .locals 7

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    iget-object v0, v0, Lio/seon/androidsdk/service/f;->b:Landroid/content/Context;

    if-eqz v0, :cond_1

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    new-instance v1, Lio/seon/androidsdk/service/g1;

    move-object v2, p0

    move-object v5, p1

    move-object v4, p2

    move-object v3, p3

    invoke-direct/range {v1 .. v6}, Lio/seon/androidsdk/service/g1;-><init>(Lio/seon/androidsdk/service/i1;Ljava/lang/Boolean;Lio/seon/androidsdk/service/d;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V

    invoke-interface {v6, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    new-instance p1, Lio/seon/androidsdk/exception/InternetAccessException;

    invoke-direct {p1}, Lio/seon/androidsdk/exception/InternetAccessException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Lio/seon/androidsdk/exception/ContextIsMissingException;

    invoke-direct {p1}, Lio/seon/androidsdk/exception/ContextIsMissingException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Lio/seon/androidsdk/exception/SessionIsMissingException;

    invoke-direct {p1}, Lio/seon/androidsdk/exception/SessionIsMissingException;-><init>()V

    throw p1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-boolean v1, p0, Lio/seon/androidsdk/service/i1;->j:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/seon/androidsdk/service/i1;->j:Z

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/r0;

    const/16 v3, 0x8

    invoke-direct {v2, v3, p0, v1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public final i()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/i1;->g:Lio/seon/androidsdk/service/c1;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/c1;->d()V
    :try_end_0
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    return-void

    :goto_0
    throw v0
.end method
