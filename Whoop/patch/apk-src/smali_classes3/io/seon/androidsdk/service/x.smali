.class public abstract Lio/seon/androidsdk/service/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbu/c;

.field public static final b:[Ljava/lang/String;

.field public static final c:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/x;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/x;->a:Lbu/c;

    const-string v15, "region_language"

    const-string v16, "physical_memory"

    const-string v2, "build_manufacturer"

    const-string v3, "build_id"

    const-string v4, "build_device"

    const-string v5, "build_number"

    const-string v6, "kernel_version"

    const-string v7, "kernel_arch"

    const-string v8, "cpu_count"

    const-string v9, "cpu_speed"

    const-string v10, "total_storage"

    const-string v11, "sensor_hash"

    const-string v12, "build_device"

    const-string v13, "build_model"

    const-string v14, "device_id"

    filled-new-array/range {v2 .. v16}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/x;->b:[Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/seon/androidsdk/service/x;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 8

    const-string v0, "PField"

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v3, "media_drm_id"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_0

    :try_start_2
    const-string v4, "null"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_3

    :catch_0
    move-exception p0

    goto/16 :goto_9

    :cond_0
    const-string v3, "gsf_id"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :try_start_4
    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    move-object v3, v1

    :goto_1
    const-string v4, "android_id"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_2

    :catch_2
    move-exception v4

    :try_start_6
    invoke-static {v0, v4}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    move-object v4, v1

    :goto_2
    if-eqz v3, :cond_3

    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    :goto_4
    sget-object v0, Lio/seon/androidsdk/service/x;->b:[Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    const/4 v3, 0x0

    :goto_5
    const/4 v4, 0x6

    sget-object v5, Lio/seon/androidsdk/service/x;->a:Lbu/c;

    const/16 v6, 0xf

    if-ge v3, v6, :cond_6

    :try_start_7
    aget-object v6, v0, v3

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-eqz v7, :cond_5

    :try_start_8
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto :goto_6

    :catch_3
    move-exception v6

    :try_start_9
    invoke-virtual {v5, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    :cond_5
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_6
    sget-object p0, Lio/seon/androidsdk/service/x;->c:Ljava/util/ArrayList;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    goto :goto_7

    :cond_7
    :try_start_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object p0
    :try_end_a
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    return-object p0

    :catch_4
    move-exception p0

    goto :goto_8

    :catch_5
    move-exception p0

    :goto_8
    :try_start_b
    invoke-virtual {v5, v4, p0}, Lbu/c;->L(ILjava/lang/Exception;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    goto :goto_a

    :goto_9
    const-string v0, "DHash"

    invoke-static {v0, p0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_a
    return-object v1
.end method
