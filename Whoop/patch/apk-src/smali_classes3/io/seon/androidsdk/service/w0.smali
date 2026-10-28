.class public final synthetic Lio/seon/androidsdk/service/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/z0;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/z0;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/w0;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/w0;->b:Lio/seon/androidsdk/service/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    iget v0, v1, Lio/seon/androidsdk/service/w0;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, v1, Lio/seon/androidsdk/service/w0;->b:Lio/seon/androidsdk/service/z0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const v0, 0x4f723

    :try_start_0
    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    const/16 v0, 0x69a2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v6, 0xfde8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v0, v6}, [Ljava/lang/Integer;

    move-result-object v6

    const-string v0, "bAEBAQQAAAABAAAAVQAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcAAXUAAAMBcwAEAAAAUGluZwAAAAAeAAAA"

    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v7

    const-string v0, "bAEAAQgAAAACAAAAawAAAAEBbwAVAAAAL3JlL2ZyaWRhL0hvc3RTZXNzaW9uAAAAAgFzABYAAAByZS5mcmlkYS5Ib3N0U2Vzc2lvbjE2AAAIAWcABWF7c3Z9AAAAAAAAAwFzABIAAABFbnVtZXJhdGVQcm9jZXNzZXMAAAAAAAAAAAAAAAAAAA=="

    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v8

    move v9, v3

    :goto_0
    const/4 v0, 0x2

    if-ge v9, v0, :cond_2

    aget-object v0, v6, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v11, Ljava/net/Socket;

    invoke-direct {v11}, Ljava/net/Socket;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance v12, Ljava/net/InetSocketAddress;

    const-string v13, "127.0.0.1"

    invoke-direct {v12, v13, v10}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/16 v10, 0x64

    invoke-virtual {v11, v12, v10}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual {v11, v10}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v11}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v10

    invoke-virtual {v11}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v12

    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "GET /ws HTTP/1.1\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: HdKNfOsC40gRHC1BvpQR0Q==\r\nSec-WebSocket-Version: 13\r\nHost: 127.0.0.1:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v14, "\r\nUser-Agent: Frida/16.6.0\r\n\r\n"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v13, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V

    const/16 v13, 0x400

    new-array v13, v13, [B

    invoke-virtual {v12, v13}, Ljava/io/InputStream;->read([B)I

    move-result v15

    if-lez v15, :cond_1

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v13, v3, v15, v14}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string v13, "mChJsQDTW0vQTC9txP6Lk/0lK5s="

    invoke-virtual {v1, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x2800

    new-array v1, v1, [B

    invoke-static {v10, v7}, Lio/seon/androidsdk/service/z0;->i(Ljava/io/OutputStream;[B)V

    invoke-static {v10, v8}, Lio/seon/androidsdk/service/z0;->i(Ljava/io/OutputStream;[B)V

    invoke-virtual {v12, v1}, Ljava/io/InputStream;->read([B)I

    move-result v10

    if-lez v10, :cond_1

    invoke-static {v1, v3, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    new-instance v10, Ljava/lang/String;

    sget-object v12, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v10, v1, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v1, Ljava/lang/String;

    const-string v12, "YW5kcm9pZA=="

    invoke-static {v12, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v12

    invoke-direct {v1, v12}, Ljava/lang/String;-><init>([B)V

    new-instance v12, Ljava/lang/String;

    const-string v13, "ZnJpZGE="

    invoke-static {v13, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/String;-><init>([B)V

    invoke-static {v10, v1}, Lio/seon/androidsdk/service/o;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v10, v12}, Lio/seon/androidsdk/service/o;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_2

    :cond_0
    :goto_1
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :try_start_3
    invoke-virtual {v11}, Ljava/net/Socket;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :goto_2
    :try_start_4
    invoke-virtual {v11}, Ljava/net/Socket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    :goto_4
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p0

    goto/16 :goto_0

    :catch_0
    :cond_2
    const-string v0, "ws"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "f"

    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :pswitch_0
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->m:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "crt_iss"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "mfr"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "ent"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    const-string v2, "add"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :pswitch_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_6
    iget-object v1, v4, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v4, v4, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;

    array-length v2, v1

    :goto_5
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catch_1
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "applisto.appcloner"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_6

    :cond_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_6
    return-object v0

    :pswitch_2
    iget-object v0, v4, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, v4, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    const-string v1, "ro.product.first_api_level"

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_5
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    :try_start_7
    const-string v0, "android.app.ActivityThread"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "sCurrentActivityThread"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "mInstrumentation"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Instrumentation;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    goto :goto_7

    :catch_2
    move-exception v0

    :try_start_8
    const-string v2, "Instr"

    invoke-static {v2, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    :goto_7
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :catch_3
    :cond_6
    return-object v1

    :pswitch_7
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->i:Ljava/util/ArrayList;

    return-object v0

    :pswitch_8
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->c:Ljava/lang/Integer;

    return-object v0

    :pswitch_9
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->f:Ljava/lang/String;

    return-object v0

    :pswitch_a
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->j:Ljava/lang/String;

    return-object v0

    :pswitch_b
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_c
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_d
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_e
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_f
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_10
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_11
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->b:Ljava/lang/Integer;

    return-object v0

    :pswitch_12
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0

    :pswitch_13
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0

    :pswitch_14
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->k:Ljava/util/ArrayList;

    return-object v0

    :pswitch_15
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->d:Ljava/lang/Integer;

    return-object v0

    :pswitch_16
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_17
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_18
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v0, Ljava/math/BigInteger;

    return-object v0

    :pswitch_19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_9
    iget-object v1, v4, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catchall_3
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    :try_start_a
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_8

    :cond_7
    :try_start_b
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catchall_4
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    sget-object v3, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    :try_start_c
    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto :goto_9

    :catch_4
    :cond_8
    return-object v0

    :pswitch_1a
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->e:Ljava/lang/Integer;

    invoke-static {v0}, Lio/seon/androidsdk/service/KeyDescription$SecurityLevelEnum;->get(Ljava/lang/Integer;)Lio/seon/androidsdk/service/KeyDescription$SecurityLevelEnum;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_d
    iget-object v0, v4, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    iget-object v0, v0, Lio/seon/androidsdk/service/f1;->b:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/k0;

    iget-object v0, v0, Lio/seon/androidsdk/service/k0;->f:Lio/seon/androidsdk/service/h0;

    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->k()Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    move-result-object v1

    sget-object v4, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->UNLOCKED_HW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    sget-object v4, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->UNLOCKED_SW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :cond_9
    invoke-virtual {v0}, Lio/seon/androidsdk/service/h0;->j()Lio/seon/androidsdk/service/OSProbe$OSEnum;

    move-result-object v0

    sget-object v1, Lio/seon/androidsdk/service/OSProbe$OSEnum;->BOOTLOADER_STATE_LOCKED:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_a

    :cond_a
    move v2, v3

    :goto_a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    goto :goto_b

    :catch_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_b
    return-object v0

    :pswitch_1c
    invoke-virtual {v4}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->a:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
