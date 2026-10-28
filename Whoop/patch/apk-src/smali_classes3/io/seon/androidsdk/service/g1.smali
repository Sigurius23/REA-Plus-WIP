.class public final synthetic Lio/seon/androidsdk/service/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/util/concurrent/ExecutorService;

.field public final synthetic w:Lio/seon/androidsdk/service/i1;

.field public final synthetic x:Ljava/lang/Boolean;

.field public final synthetic y:Lio/seon/androidsdk/service/d;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/i1;Ljava/lang/Boolean;Lio/seon/androidsdk/service/d;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/seon/androidsdk/service/g1;->w:Lio/seon/androidsdk/service/i1;

    iput-object p2, p0, Lio/seon/androidsdk/service/g1;->x:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/seon/androidsdk/service/g1;->y:Lio/seon/androidsdk/service/d;

    iput-object p4, p0, Lio/seon/androidsdk/service/g1;->z:Ljava/lang/String;

    iput-object p5, p0, Lio/seon/androidsdk/service/g1;->E:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/seon/androidsdk/service/g1;->w:Lio/seon/androidsdk/service/i1;

    iget-object v0, v1, Lio/seon/androidsdk/service/g1;->x:Ljava/lang/Boolean;

    iget-object v3, v1, Lio/seon/androidsdk/service/g1;->y:Lio/seon/androidsdk/service/d;

    iget-object v4, v1, Lio/seon/androidsdk/service/g1;->z:Ljava/lang/String;

    iget-object v5, v1, Lio/seon/androidsdk/service/g1;->E:Ljava/util/concurrent/ExecutorService;

    const-string v6, ";"

    sget-object v7, Lio/seon/androidsdk/service/i1;->k:Lbu/c;

    const-string v8, "Android;"

    :try_start_0
    invoke-virtual {v2, v0}, Lio/seon/androidsdk/service/i1;->d(Ljava/lang/Boolean;)V
    :try_end_0
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v2, Lio/seon/androidsdk/service/i1;->c:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    const/4 v9, 0x6

    :try_start_2
    invoke-virtual {v7, v9, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_1

    const/16 v9, 0x10

    new-array v14, v9, [B

    new-instance v9, Ljava/security/SecureRandom;

    invoke-direct {v9}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v9, v14}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v9, 0x2

    invoke-static {v14, v9}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v0}, Lio/seon/androidsdk/service/i1;->g(Ljava/lang/String;)[B

    move-result-object v12

    new-instance v0, Ljava/lang/String;

    iget-object v2, v2, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    iget-object v2, v2, Lio/seon/androidsdk/service/f;->c:Lio/seon/androidsdk/service/f1;

    iget-object v11, v2, Lio/seon/androidsdk/service/f1;->b:Ljava/lang/Object;

    check-cast v11, Lio/seon/androidsdk/service/JNIHandler;

    iget-object v2, v2, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    array-length v13, v12

    const/4 v15, 0x1

    move-object/from16 v16, v11

    move-object v11, v2

    move-object v2, v10

    move-object/from16 v10, v16

    invoke-virtual/range {v10 .. v15}, Lio/seon/androidsdk/service/JNIHandler;->encrypt(Ljava/lang/Object;[BI[BI)[B

    move-result-object v10

    invoke-static {v10, v9}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v9

    invoke-direct {v0, v9}, Ljava/lang/String;-><init>([B)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lio/seon/androidsdk/service/d;->a(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_2
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-interface {v5, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    invoke-interface {v5, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Pool didn\'t terminate"

    const/4 v2, 0x5

    invoke-virtual {v7, v2, v0}, Lbu/c;->F(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_2
    :try_start_4
    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_3

    :cond_1
    new-instance v0, Lio/seon/androidsdk/exception/SeonException;

    const-string v2, "Fingerprint could not be generated"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Lio/seon/androidsdk/exception/SeonException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_2
    const/4 v2, 0x3

    invoke-virtual {v7, v2, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :cond_2
    :goto_3
    return-void
.end method
