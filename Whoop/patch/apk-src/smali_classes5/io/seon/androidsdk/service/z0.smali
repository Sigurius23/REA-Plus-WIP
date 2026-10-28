.class public final Lio/seon/androidsdk/service/z0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final h:Lio/seon/androidsdk/service/r0;

.field public static final i:[Ljava/lang/String;


# instance fields
.field public e:Landroid/content/Context;

.field public f:Lio/seon/androidsdk/service/SeonNT;

.field public g:Lio/seon/androidsdk/service/d1;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lio/seon/androidsdk/service/r0;

    const-wide/16 v1, 0xfa0

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/z0;->h:Lio/seon/androidsdk/service/r0;

    const-string v8, "package_name"

    const-string v9, "package_signatures"

    const-string v3, "first_api_level"

    const-string v4, "is_espresso_connected"

    const-string v5, "is_hiddenapi_modified"

    const-string v6, "profile_administrators"

    const-string v7, "is_app_cloned"

    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/z0;->i:[Ljava/lang/String;

    return-void
.end method

.method public static i(Ljava/io/OutputStream;[B)V
    .locals 6

    :try_start_0
    array-length v0, p1

    const/4 v1, 0x4

    new-array v1, v1, [B

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/Random;->nextBytes([B)V

    new-array v2, v0, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p1, v3

    rem-int/lit8 v5, v3, 0x4

    aget-byte v5, v1, v5

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x7d

    const/16 v3, -0x7e

    if-gt v0, p1, :cond_1

    add-int/lit8 p1, v0, 0x6

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    or-int/lit16 v0, v0, 0x80

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_1
    const p1, 0xffff

    if-gt v0, p1, :cond_2

    add-int/lit8 p1, v0, 0x8

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v3, -0x2

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-short v0, v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    goto :goto_1

    :cond_2
    add-int/lit8 p1, v0, 0xe

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/4 v3, -0x1

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    int-to-long v3, v0

    invoke-virtual {p1, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    :goto_1
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 9

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/z0;->h:Lio/seon/androidsdk/service/r0;

    iget-object v3, v2, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v2, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v5, v7

    iget-wide v7, v2, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v5, v5, v7

    if-gez v5, :cond_0

    iget-wide v5, v2, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    :cond_0
    invoke-static {}, Lio/seon/androidsdk/service/k;->d()Lio/seon/androidsdk/service/d1;

    move-result-object v5

    iput-object v5, v2, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v3, v2, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    iget-object v3, v2, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object v2, v2, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    check-cast v2, Lio/seon/androidsdk/service/d1;

    iput-object v2, p0, Lio/seon/androidsdk/service/z0;->g:Lio/seon/androidsdk/service/d1;

    const/4 v2, 0x0

    const/4 v3, 0x3

    :try_start_1
    new-instance v4, Lio/seon/androidsdk/service/w0;

    const/16 v5, 0x19

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v4}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-object v4, v2

    :goto_0
    :try_start_3
    check-cast v4, Ljava/lang/Integer;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    :goto_1
    move-object v4, v2

    goto :goto_2

    :catch_0
    move-exception v4

    invoke-virtual {v0, v3, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1

    :goto_2
    const-string v5, "first_api_level"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/seon/androidsdk/service/x0;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v4}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v4

    const-string v6, "is_espresso_connected"

    invoke-virtual {v1, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    :try_start_4
    iget-object v6, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "hidden_api_policy"

    invoke-static {v6, v7}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v6

    if-ne v6, v4, :cond_2

    move v5, v4

    :cond_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    :catch_1
    :try_start_5
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    :goto_3
    move-object v5, v2

    goto :goto_4

    :catch_2
    move-exception v5

    invoke-virtual {v0, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_3

    :goto_4
    const-string v6, "is_hiddenapi_modified"

    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->f()Ljava/util/ArrayList;

    move-result-object v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_6

    :catchall_4
    :goto_5
    move-object v5, v2

    goto :goto_6

    :catch_3
    move-exception v5

    invoke-virtual {v0, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_5

    :goto_6
    const-string v6, "profile_administrators"

    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lio/seon/androidsdk/service/x0;

    invoke-direct {v5, p0, v4}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v5}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "is_app_cloned"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    new-instance v4, Lio/seon/androidsdk/service/w0;

    const/16 v5, 0x1a

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {v4}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_7

    :catchall_5
    move-object v4, v2

    :goto_7
    :try_start_9
    check-cast v4, Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_9

    :catchall_6
    :goto_8
    move-object v4, v2

    goto :goto_9

    :catch_4
    move-exception v4

    invoke-virtual {v0, v3, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_8

    :goto_9
    const-string v5, "package_name"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_a
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->g()Ljava/util/ArrayList;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_a

    :catch_5
    move-exception v4

    invoke-virtual {v0, v3, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_7
    :goto_a
    const-string v0, "package_signatures"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/util/Map;
    .locals 10

    const-string v0, "user"

    sget-object v1, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x3

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v6, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v5, v4

    :goto_0
    :try_start_2
    check-cast v5, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    :goto_1
    move-object v5, v4

    goto :goto_2

    :catch_0
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1

    :goto_2
    const-string v6, "attest_cert_signature"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v6, 0xb

    invoke-direct {v5, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v6, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-object v5, v4

    :goto_3
    :try_start_5
    check-cast v5, Ljava/lang/Integer;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    :goto_4
    move-object v5, v4

    goto :goto_5

    :catch_1
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4

    :goto_5
    const-string v6, "attest_version"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v6, 0x14

    invoke-direct {v5, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v6, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_6

    :catchall_4
    move-object v5, v4

    :goto_6
    :try_start_8
    check-cast v5, Ljava/lang/Integer;

    invoke-static {v5}, Lio/seon/androidsdk/service/KeyDescription$SecurityLevelEnum;->get(Ljava/lang/Integer;)Lio/seon/androidsdk/service/KeyDescription$SecurityLevelEnum;

    move-result-object v5
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_8

    :catchall_5
    :goto_7
    move-object v5, v4

    goto :goto_8

    :catch_2
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_7

    :goto_8
    const-string v6, "attest_sec_level"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/4 v6, 0x7

    invoke-direct {v5, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v6, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    :try_start_a
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    goto :goto_9

    :catchall_6
    move-object v5, v4

    :goto_9
    :try_start_b
    check-cast v5, Ljava/lang/Integer;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_b

    :catchall_7
    :goto_a
    move-object v5, v4

    goto :goto_b

    :catch_3
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_a

    :goto_b
    const-string v6, "attest_km_version"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x2

    :try_start_c
    new-instance v6, Lio/seon/androidsdk/service/w0;

    invoke-direct {v6, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    :try_start_d
    invoke-virtual {v6}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    goto :goto_c

    :catchall_8
    move-object v6, v4

    :goto_c
    :try_start_e
    check-cast v6, Lio/seon/androidsdk/service/KeyDescription$SecurityLevelEnum;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    goto :goto_e

    :catchall_9
    :goto_d
    move-object v6, v4

    goto :goto_e

    :catch_4
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v7, "attest_km_level"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_f
    new-instance v6, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x13

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    :try_start_10
    invoke-virtual {v6}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v6
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    goto :goto_f

    :catchall_a
    move-object v6, v4

    :goto_f
    :try_start_11
    check-cast v6, Ljava/lang/String;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    goto :goto_11

    :catchall_b
    :goto_10
    move-object v6, v4

    goto :goto_11

    :catch_5
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_10

    :goto_11
    const-string v7, "attest_challenge"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x4

    :try_start_12
    new-instance v7, Lio/seon/androidsdk/service/w0;

    invoke-direct {v7, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    :try_start_13
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    goto :goto_12

    :catchall_c
    move-object v7, v4

    :goto_12
    :try_start_14
    check-cast v7, Ljava/math/BigInteger;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    goto :goto_14

    :catchall_d
    :goto_13
    move-object v7, v4

    goto :goto_14

    :catch_6
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_13

    :goto_14
    const-string v8, "attest_time"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_15
    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0xa

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_7
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    :try_start_16
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    goto :goto_15

    :catchall_e
    move-object v7, v4

    :goto_15
    :try_start_17
    check-cast v7, Ljava/util/ArrayList;
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    goto :goto_17

    :catchall_f
    :goto_16
    move-object v7, v4

    goto :goto_17

    :catch_7
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_16

    :goto_17
    const-string v8, "attest_packages"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_18
    new-instance v7, Lio/seon/androidsdk/service/x0;

    invoke-direct {v7, p0, v6}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v6, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_8
    .catchall {:try_start_18 .. :try_end_18} :catchall_11

    :try_start_19
    invoke-virtual {v7}, Lio/seon/androidsdk/service/x0;->a()Ljava/lang/Object;

    move-result-object v6
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    goto :goto_18

    :catchall_10
    move-object v6, v4

    :goto_18
    :try_start_1a
    check-cast v6, Ljava/util/ArrayList;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_8
    .catchall {:try_start_1a .. :try_end_1a} :catchall_11

    goto :goto_1a

    :catchall_11
    :goto_19
    move-object v6, v4

    goto :goto_1a

    :catch_8
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_19

    :goto_1a
    const-string v7, "attest_signatures"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1b
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->k()Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    move-result-object v6
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_9
    .catchall {:try_start_1b .. :try_end_1b} :catchall_12

    goto :goto_1c

    :catchall_12
    :goto_1b
    move-object v6, v4

    goto :goto_1c

    :catch_9
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1b

    :goto_1c
    const-string v7, "attest_is_device_unlocked"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1c
    new-instance v6, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x17

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_a
    .catchall {:try_start_1c .. :try_end_1c} :catchall_15

    :try_start_1d
    invoke-virtual {v6}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v6
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_13

    goto :goto_1d

    :catchall_13
    move-object v6, v4

    :goto_1d
    :try_start_1e
    check-cast v6, Ljava/math/BigInteger;

    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0x18

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_a
    .catchall {:try_start_1e .. :try_end_1e} :catchall_15

    :try_start_1f
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_14

    goto :goto_1e

    :catchall_14
    move-object v7, v4

    :goto_1e
    :try_start_20
    check-cast v7, Ljava/math/BigInteger;

    if-eqz v6, :cond_0

    invoke-static {v6}, Lio/seon/androidsdk/service/RootOfTrust$VerifiedBootStateEnum;->get(Ljava/math/BigInteger;)Lio/seon/androidsdk/service/RootOfTrust$VerifiedBootStateEnum;

    move-result-object v6

    goto :goto_20

    :cond_0
    invoke-static {v7}, Lio/seon/androidsdk/service/RootOfTrust$VerifiedBootStateEnum;->get(Ljava/math/BigInteger;)Lio/seon/androidsdk/service/RootOfTrust$VerifiedBootStateEnum;

    move-result-object v6
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_a
    .catchall {:try_start_20 .. :try_end_20} :catchall_15

    goto :goto_20

    :catchall_15
    :goto_1f
    move-object v6, v4

    goto :goto_20

    :catch_a
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1f

    :goto_20
    const-string v7, "attest_ver_boot_state"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x5

    :try_start_21
    new-instance v7, Lio/seon/androidsdk/service/w0;

    invoke-direct {v7, p0, v6}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_b
    .catchall {:try_start_21 .. :try_end_21} :catchall_18

    :try_start_22
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_16

    goto :goto_21

    :catchall_16
    move-object v7, v4

    :goto_21
    :try_start_23
    check-cast v7, Ljava/lang/String;

    new-instance v8, Lio/seon/androidsdk/service/w0;

    const/4 v9, 0x6

    invoke-direct {v8, p0, v9}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_b
    .catchall {:try_start_23 .. :try_end_23} :catchall_18

    :try_start_24
    invoke-virtual {v8}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v8
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_17

    goto :goto_22

    :catchall_17
    move-object v8, v4

    :goto_22
    :try_start_25
    check-cast v8, Ljava/lang/String;
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_b
    .catchall {:try_start_25 .. :try_end_25} :catchall_18

    if-eqz v7, :cond_1

    goto :goto_24

    :cond_1
    move-object v7, v8

    goto :goto_24

    :catchall_18
    :goto_23
    move-object v7, v4

    goto :goto_24

    :catch_b
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_23

    :goto_24
    const-string v8, "attest_ver_boot_hash"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_26
    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0xe

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_c
    .catchall {:try_start_26 .. :try_end_26} :catchall_1b

    :try_start_27
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_19

    goto :goto_25

    :catchall_19
    move-object v7, v4

    :goto_25
    :try_start_28
    check-cast v7, Ljava/lang/String;

    new-instance v8, Lio/seon/androidsdk/service/w0;

    const/16 v9, 0xf

    invoke-direct {v8, p0, v9}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_c
    .catchall {:try_start_28 .. :try_end_28} :catchall_1b

    :try_start_29
    invoke-virtual {v8}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v8
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_1a

    goto :goto_26

    :catchall_1a
    move-object v8, v4

    :goto_26
    :try_start_2a
    check-cast v8, Ljava/lang/String;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_c
    .catchall {:try_start_2a .. :try_end_2a} :catchall_1b

    if-eqz v7, :cond_2

    goto :goto_28

    :cond_2
    move-object v7, v8

    goto :goto_28

    :catchall_1b
    :goto_27
    move-object v7, v4

    goto :goto_28

    :catch_c
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_27

    :goto_28
    const-string v8, "attest_ver_boot_key"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2b
    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0xc

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_d
    .catchall {:try_start_2b .. :try_end_2b} :catchall_1e

    :try_start_2c
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_1c

    goto :goto_29

    :catchall_1c
    move-object v7, v4

    :goto_29
    :try_start_2d
    check-cast v7, Ljava/math/BigInteger;

    new-instance v8, Lio/seon/androidsdk/service/w0;

    const/16 v9, 0xd

    invoke-direct {v8, p0, v9}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_1e

    :try_start_2e
    invoke-virtual {v8}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v8
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_1d

    goto :goto_2a

    :catchall_1d
    move-object v8, v4

    :goto_2a
    :try_start_2f
    check-cast v8, Ljava/math/BigInteger;
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_d
    .catchall {:try_start_2f .. :try_end_2f} :catchall_1e

    if-eqz v7, :cond_3

    goto :goto_2c

    :cond_3
    move-object v7, v8

    goto :goto_2c

    :catchall_1e
    :goto_2b
    move-object v7, v4

    goto :goto_2c

    :catch_d
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2b

    :goto_2c
    const-string v8, "attest_os_version"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_30
    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0x10

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_e
    .catchall {:try_start_30 .. :try_end_30} :catchall_21

    :try_start_31
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_1f

    goto :goto_2d

    :catchall_1f
    move-object v7, v4

    :goto_2d
    :try_start_32
    check-cast v7, Ljava/math/BigInteger;

    new-instance v8, Lio/seon/androidsdk/service/w0;

    const/16 v9, 0x11

    invoke-direct {v8, p0, v9}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_32} :catch_e
    .catchall {:try_start_32 .. :try_end_32} :catchall_21

    :try_start_33
    invoke-virtual {v8}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v8
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_20

    goto :goto_2e

    :catchall_20
    move-object v8, v4

    :goto_2e
    :try_start_34
    check-cast v8, Ljava/math/BigInteger;
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_e
    .catchall {:try_start_34 .. :try_end_34} :catchall_21

    if-eqz v7, :cond_4

    goto :goto_30

    :cond_4
    move-object v7, v8

    goto :goto_30

    :catchall_21
    :goto_2f
    move-object v7, v4

    goto :goto_30

    :catch_e
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2f

    :goto_30
    const-string v8, "attest_os_patch_level"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_35
    new-instance v7, Lio/seon/androidsdk/service/w0;

    const/16 v8, 0x15

    invoke-direct {v7, p0, v8}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_35
    .catch Ljava/lang/Exception; {:try_start_35 .. :try_end_35} :catch_f
    .catchall {:try_start_35 .. :try_end_35} :catchall_23

    :try_start_36
    invoke-virtual {v7}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v7
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_22

    goto :goto_31

    :catchall_22
    move-object v7, v4

    :goto_31
    :try_start_37
    check-cast v7, Ljava/util/ArrayList;
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_37} :catch_f
    .catchall {:try_start_37 .. :try_end_37} :catchall_23

    goto :goto_33

    :catchall_23
    :goto_32
    move-object v7, v4

    goto :goto_33

    :catch_f
    move-exception v7

    invoke-virtual {v1, v3, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_32

    :goto_33
    const-string v8, "attest_cert_ids"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_38
    new-instance v7, Lio/seon/androidsdk/service/x0;

    invoke-direct {v7, p0, v5}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_38
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_38} :catch_10
    .catchall {:try_start_38 .. :try_end_38} :catchall_25

    :try_start_39
    invoke-virtual {v7}, Lio/seon/androidsdk/service/x0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_24

    goto :goto_34

    :catchall_24
    move-object v5, v4

    :goto_34
    :try_start_3a
    check-cast v5, Ljava/util/ArrayList;
    :try_end_3a
    .catch Ljava/lang/Exception; {:try_start_3a .. :try_end_3a} :catch_10
    .catchall {:try_start_3a .. :try_end_3a} :catchall_25

    goto :goto_36

    :catchall_25
    :goto_35
    move-object v5, v4

    goto :goto_36

    :catch_10
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_35

    :goto_36
    const-string v7, "attest_sw_tags"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3b
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x9

    invoke-direct {v5, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_3b
    .catch Ljava/lang/Exception; {:try_start_3b .. :try_end_3b} :catch_11
    .catchall {:try_start_3b .. :try_end_3b} :catchall_27

    :try_start_3c
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_26

    goto :goto_37

    :catchall_26
    move-object v5, v4

    :goto_37
    :try_start_3d
    check-cast v5, Ljava/util/ArrayList;
    :try_end_3d
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_3d} :catch_11
    .catchall {:try_start_3d .. :try_end_3d} :catchall_27

    goto :goto_39

    :catchall_27
    :goto_38
    move-object v5, v4

    goto :goto_39

    :catch_11
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_38

    :goto_39
    const-string v7, "attest_hw_tags"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3e
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x12

    invoke-direct {v5, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_3e
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_3e} :catch_12
    .catchall {:try_start_3e .. :try_end_3e} :catchall_29

    :try_start_3f
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_28

    goto :goto_3a

    :catchall_28
    move-object v5, v4

    :goto_3a
    :try_start_40
    check-cast v5, Ljava/lang/String;
    :try_end_40
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_40} :catch_12
    .catchall {:try_start_40 .. :try_end_40} :catchall_29

    goto :goto_3c

    :catchall_29
    :goto_3b
    move-object v5, v4

    goto :goto_3c

    :catch_12
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_3b

    :goto_3c
    const-string v7, "attest_ca_pub_hash"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_41
    new-instance v5, Lio/seon/androidsdk/service/x0;

    invoke-direct {v5, p0, v3}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_41
    .catch Ljava/lang/Exception; {:try_start_41 .. :try_end_41} :catch_13
    .catchall {:try_start_41 .. :try_end_41} :catchall_2b

    :try_start_42
    invoke-virtual {v5}, Lio/seon/androidsdk/service/x0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_2a

    goto :goto_3d

    :catchall_2a
    move-object v5, v4

    :goto_3d
    :try_start_43
    check-cast v5, Ljava/lang/Boolean;
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_43} :catch_13
    .catchall {:try_start_43 .. :try_end_43} :catchall_2b

    goto :goto_3f

    :catchall_2b
    :goto_3e
    move-object v5, v4

    goto :goto_3f

    :catch_13
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_3e

    :goto_3f
    const-string v7, "attest_rt_error_flag"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_44
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x8

    invoke-direct {v5, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_44 .. :try_end_44} :catch_14
    .catchall {:try_start_44 .. :try_end_44} :catchall_2d

    :try_start_45
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_2c

    goto :goto_40

    :catchall_2c
    move-object v5, v4

    :goto_40
    :try_start_46
    check-cast v5, Ljava/util/ArrayList;
    :try_end_46
    .catch Ljava/lang/Exception; {:try_start_46 .. :try_end_46} :catch_14
    .catchall {:try_start_46 .. :try_end_46} :catchall_2d

    goto :goto_42

    :catchall_2d
    :goto_41
    move-object v5, v4

    goto :goto_42

    :catch_14
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_41

    :goto_42
    const-string v7, "attest_logs"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_47
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->j()Ljava/lang/String;

    move-result-object v5
    :try_end_47
    .catch Ljava/lang/Exception; {:try_start_47 .. :try_end_47} :catch_15
    .catchall {:try_start_47 .. :try_end_47} :catchall_2e

    goto :goto_44

    :catchall_2e
    :goto_43
    move-object v5, v4

    goto :goto_44

    :catch_15
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_43

    :goto_44
    const-string v7, "attestation_capability"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_48
    new-instance v5, Lio/seon/androidsdk/service/w0;

    const/16 v7, 0x1b

    invoke-direct {v5, p0, v7}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v7, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_48
    .catch Ljava/lang/Exception; {:try_start_48 .. :try_end_48} :catch_16
    .catchall {:try_start_48 .. :try_end_48} :catchall_30

    :try_start_49
    invoke-virtual {v5}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v5
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_2f

    goto :goto_45

    :catchall_2f
    move-object v5, v4

    :goto_45
    :try_start_4a
    check-cast v5, Ljava/lang/Boolean;
    :try_end_4a
    .catch Ljava/lang/Exception; {:try_start_4a .. :try_end_4a} :catch_16
    .catchall {:try_start_4a .. :try_end_4a} :catchall_30

    goto :goto_47

    :catchall_30
    :goto_46
    move-object v5, v4

    goto :goto_47

    :catch_16
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_46

    :goto_47
    const-string v7, "is_applisto_detected"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4b
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->h()Ljava/lang/Boolean;

    move-result-object v5
    :try_end_4b
    .catch Ljava/lang/Exception; {:try_start_4b .. :try_end_4b} :catch_17
    .catchall {:try_start_4b .. :try_end_4b} :catchall_31

    goto :goto_49

    :catchall_31
    :goto_48
    move-object v5, v4

    goto :goto_49

    :catch_17
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_48

    :goto_49
    const-string v7, "is_packageinfo_inconsistent"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4c
    iget-object v5, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/UserManager;

    invoke-virtual {v5}, Landroid/os/UserManager;->isSystemUser()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5
    :try_end_4c
    .catch Ljava/lang/Exception; {:try_start_4c .. :try_end_4c} :catch_18
    .catchall {:try_start_4c .. :try_end_4c} :catchall_32

    goto :goto_4a

    :catch_18
    :catchall_32
    move-object v5, v4

    :goto_4a
    const-string v7, "is_system_user"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4d
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1e

    if-lt v5, v7, :cond_5

    iget-object v5, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/UserManager;

    invoke-virtual {v0}, Landroid/os/UserManager;->isManagedProfile()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_4d .. :try_end_4d} :catch_19
    .catchall {:try_start_4d .. :try_end_4d} :catchall_33

    goto :goto_4b

    :catch_19
    :catchall_33
    :cond_5
    move-object v0, v4

    :goto_4b
    const-string v5, "is_work_profile"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/w0;

    invoke-direct {v0, p0, v3}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "camera_apps"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/4 v5, 0x1

    invoke-direct {v0, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "is_rooted_by_prop"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/16 v5, 0x16

    invoke-direct {v0, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "instr_class"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/m;

    invoke-direct {v0, p0, v6}, Lio/seon/androidsdk/service/m;-><init>(Lio/seon/androidsdk/service/g;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "lvl_inf"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/16 v5, 0x1d

    invoke-direct {v0, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "frd_scan"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4e
    iget-object v0, p0, Lio/seon/androidsdk/service/z0;->f:Lio/seon/androidsdk/service/SeonNT;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4e
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_4e} :catch_1a
    .catchall {:try_start_4e .. :try_end_4e} :catchall_35

    :try_start_4f
    invoke-virtual {v0}, Lio/seon/androidsdk/service/SeonNT;->d()I

    move-result v0
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_34

    goto :goto_4c

    :catchall_34
    const/4 v0, -0x1

    :goto_4c
    :try_start_50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_50
    .catch Ljava/lang/Exception; {:try_start_50 .. :try_end_50} :catch_1a
    .catchall {:try_start_50 .. :try_end_50} :catchall_35

    goto :goto_4e

    :catchall_35
    :goto_4d
    move-object v0, v4

    goto :goto_4e

    :catch_1a
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4d

    :goto_4e
    const-string v5, "ptr_int"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_51
    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/16 v5, 0x1c

    invoke-direct {v0, p0, v5}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_51
    .catch Ljava/lang/Exception; {:try_start_51 .. :try_end_51} :catch_1b
    .catchall {:try_start_51 .. :try_end_51} :catchall_37

    :try_start_52
    invoke-virtual {v0}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v0
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_36

    goto :goto_4f

    :catchall_36
    move-object v0, v4

    :goto_4f
    :try_start_53
    check-cast v0, Ljava/util/Map;
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_53 .. :try_end_53} :catch_1b
    .catchall {:try_start_53 .. :try_end_53} :catchall_37

    move-object v4, v0

    goto :goto_50

    :catch_1b
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_37
    :goto_50
    const-string v0, "provision"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 2

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    new-instance p1, Lio/seon/androidsdk/service/SeonNT;

    iget-object v0, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-direct {p1, v0}, Lio/seon/androidsdk/service/SeonNT;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/seon/androidsdk/service/z0;->f:Lio/seon/androidsdk/service/SeonNT;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    const-string v0, "seonLocalPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-void
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    const-string v2, "device_policy"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/admin/DevicePolicyManager;

    invoke-virtual {v1}, Landroid/app/admin/DevicePolicyManager;->getActiveAdmins()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    iget-object v3, p0, Lio/seon/androidsdk/service/z0;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/high16 v4, 0x8000000

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/pm/SigningInfo;->getApkContentsSigners()[Landroid/content/pm/Signature;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    array-length v3, v2

    if-lez v3, :cond_2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    invoke-virtual {v6}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v6

    const-string v7, "SHA-256"

    invoke-static {v7}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v6

    invoke-static {v6, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    return-object v0

    :catch_0
    :cond_2
    return-object v1
.end method

.method public final h()Ljava/lang/Boolean;
    .locals 11

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lio/seon/androidsdk/service/w0;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v1}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    :goto_0
    :try_start_2
    check-cast v1, Ljava/util/ArrayList;

    new-instance v2, Lio/seon/androidsdk/service/x0;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lio/seon/androidsdk/service/x0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v3, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v2}, Lio/seon/androidsdk/service/x0;->a()Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v2, v0

    :goto_1
    :try_start_4
    check-cast v2, Ljava/util/ArrayList;

    new-instance v3, Lio/seon/androidsdk/service/w0;

    const/16 v4, 0x1a

    invoke-direct {v3, p0, v4}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v4, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {v3}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-object v3, v0

    :goto_2
    :try_start_6
    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->g()Ljava/util/ArrayList;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "UNKNOWN"

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "UnknownPackage"

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    move v7, v6

    goto :goto_3

    :cond_0
    move v7, v5

    :goto_3
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1

    move v8, v6

    goto :goto_4

    :cond_1
    move v8, v5

    :goto_4
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2

    move v9, v6

    goto :goto_5

    :cond_2
    move v9, v5

    :goto_5
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    move v10, v6

    goto :goto_6

    :cond_3
    move v10, v5

    :goto_6
    if-eqz v7, :cond_9

    if-eqz v8, :cond_9

    if-eqz v9, :cond_9

    if-eqz v10, :cond_9

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v7, v5

    :cond_4
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    move v7, v6

    goto :goto_7

    :cond_6
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez v7, :cond_8

    :cond_7
    move v5, v6

    :cond_8
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 4

    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    invoke-virtual {v0}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Ljava/lang/Integer;

    const/16 v1, 0x18

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v2, v1, :cond_0

    const-string v0, "SOFTWARE_ONLY"

    return-object v0

    :cond_0
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v3, "OnePlus"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt v0, v1, :cond_1

    const-string v0, "ONEPLUS_SUPPORTED"

    return-object v0

    :cond_1
    const-string v0, "SUPPORTED"

    return-object v0
.end method

.method public final k()Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->h:Lm63/d;

    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v1

    iget-object v1, v1, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->LOCKED_HW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    return-object v0

    :cond_0
    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->UNLOCKED_HW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    return-object v0

    :cond_1
    if-eqz v1, :cond_3

    iget-object v0, v1, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, La00/g;

    if-eqz v0, :cond_3

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->LOCKED_SW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    return-object v0

    :cond_2
    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->UNLOCKED_SW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->l:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ONEPLUS_SUPPORTED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "java.security.ProviderException"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->UNLOCKED_SW:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_5
    sget-object v0, Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;->ERROR:Lio/seon/androidsdk/service/RootOfTrust$DeviceLockState;

    return-object v0
.end method

.method public final l()Lio/seon/androidsdk/service/d1;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/z0;->g:Lio/seon/androidsdk/service/d1;

    if-nez v0, :cond_0

    invoke-static {}, Lio/seon/androidsdk/service/k;->d()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/z0;->g:Lio/seon/androidsdk/service/d1;

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/z0;->g:Lio/seon/androidsdk/service/d1;

    return-object v0
.end method
