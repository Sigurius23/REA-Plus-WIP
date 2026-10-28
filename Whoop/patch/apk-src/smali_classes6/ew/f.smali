.class public final Lew/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final E:Ldw/f;

.field public final F:Lz7/a;

.field public final w:Ldb/j0;

.field public final x:Lc5/l;

.field public final y:Ljava/lang/String;

.field public final z:Le10/k0;


# direct methods
.method public constructor <init>(Ldb/j0;Lc5/l;Ljava/lang/String;Le10/k0;Ldw/f;Lz7/a;)V
    .locals 1

    const-string v0, "deviceSerial"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lew/f;->w:Ldb/j0;

    iput-object p2, p0, Lew/f;->x:Lc5/l;

    iput-object p3, p0, Lew/f;->y:Ljava/lang/String;

    iput-object p4, p0, Lew/f;->z:Le10/k0;

    iput-object p5, p0, Lew/f;->E:Ldw/f;

    iput-object p6, p0, Lew/f;->F:Lz7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 23

    move-object/from16 v1, p0

    iget-object v0, v1, Lew/f;->z:Le10/k0;

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v3, Lkotlin/jvm/internal/e0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/16 v8, 0x64

    if-eqz v7, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [B

    if-ge v6, v8, :cond_0

    const-string v8, "chunk"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    iget-object v6, v1, Lew/f;->x:Lc5/l;

    if-nez v0, :cond_11

    iget-object v7, v1, Lew/f;->F:Lz7/a;

    invoke-virtual {v7}, Lz7/a;->f()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    new-instance v4, Ljava/lang/Exception;

    const-string v0, "Detected send() before retry delay has passed!"

    invoke-direct {v4, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v0, "Incorrect API usage"

    const/4 v5, 0x3

    invoke-static {v4, v0, v5}, Lbp/b;->C(Ljava/lang/Exception;Ljava/lang/String;I)V

    new-instance v0, Lcom/mapbox/common/module/c;

    const/4 v5, 0x2

    invoke-direct/range {v0 .. v5}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    invoke-virtual {v6, v0}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-string v0, "deviceSerial"

    iget-object v9, v1, Lew/f;->y:Ljava/lang/String;

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https://chunks.memfault.com"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v10, "api"

    invoke-virtual {v0, v10}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v10, "v0"

    invoke-virtual {v0, v10}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v10, "chunks"

    invoke-virtual {v0, v10}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v9, "sdkPlatform"

    const-string v10, "android-cloud"

    invoke-virtual {v0, v9, v10}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v9, "sdkVersion"

    const-string v10, "2.1.0"

    invoke-virtual {v0, v9, v10}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    iget-object v9, v1, Lew/f;->w:Ldb/j0;

    iget-object v9, v9, Ldb/j0;->x:Ljava/lang/String;

    new-instance v10, Ll83/k;

    const-string v11, "Memfault-Project-Key"

    invoke-direct {v10, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ll83/k;

    const-string v12, "X-Request-ID"

    invoke-direct {v11, v12, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v10, v11}, [Ll83/k;

    move-result-object v9

    invoke-static {v9}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v9

    move-object v10, v4

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v10, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v11, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, [B

    new-instance v15, Lew/e;

    new-instance v8, Lew/a;

    invoke-direct {v8, v14}, Lew/a;-><init>([B)V

    invoke-direct {v15, v8}, Lew/e;-><init>(Lew/a;)V

    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0x64

    goto :goto_2

    :cond_2
    new-instance v8, Lew/d;

    invoke-direct {v8, v11}, Lew/d;-><init>(Ljava/util/ArrayList;)V

    const-string v10, "POST"

    const-string v11, "uri"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "POST "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " "

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "message"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x6

    const/4 v13, 0x1

    invoke-static {v14, v13}, Le4/p;->b(II)I

    move-result v16

    const-string v5, "MFLT-SDK"

    if-lez v16, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v5, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v0, "uri.toString()"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14, v13}, Le4/p;->b(II)I

    move-result v14

    if-lez v14, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {v5, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v15, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v10}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v10, 0x2710

    invoke-virtual {v0, v10}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const v10, 0xea60

    invoke-virtual {v0, v10}, Ljava/net/URLConnection;->setReadTimeout(I)V

    iput-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of v10, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v10, :cond_5

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Ljavax/net/ssl/SSLSocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v10

    const-string v15, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v10}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    goto :goto_5

    :catch_0
    move-exception v0

    move/from16 v16, v13

    goto/16 :goto_9

    :cond_5
    :goto_5
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    iget-object v10, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Ljava/net/HttpURLConnection;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v10, v15, v9}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    iget-object v0, v8, Lew/d;->b:Ljava/lang/String;

    const-string v9, "multipart/mixed; boundary="

    invoke-static {v9, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v9, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Ljava/net/HttpURLConnection;

    const-string v10, "Content-Type"

    invoke-virtual {v9, v10, v0}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/net/HttpURLConnection;

    iget-object v9, v8, Lew/d;->c:Ll83/p;

    invoke-virtual {v9}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v0, v9}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v13}, Ljava/net/URLConnection;->setDoOutput(Z)V

    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v0, "outputStream"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lew/d;->a(Ljava/io/OutputStream;)V

    invoke-virtual {v9}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v9}, Ljava/io/Closeable;->close()V

    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    iget-object v8, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v8, Ljava/net/HttpURLConnection;

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Ljava/net/HttpURLConnection;

    invoke-virtual {v9}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v9

    const-string v10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.collections.List<kotlin.String>>"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x12b

    if-le v0, v10, :cond_8

    iget-object v10, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Ljava/net/HttpURLConnection;

    invoke-virtual {v10}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v10

    goto :goto_7

    :cond_8
    iget-object v10, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Ljava/net/HttpURLConnection;

    invoke-virtual {v10}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v10

    :goto_7
    new-instance v15, Ljava/util/ArrayList;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move/from16 v16, v13

    :try_start_3
    invoke-interface {v9}, Ljava/util/Map;->size()I

    move-result v13

    invoke-direct {v15, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v17, v13

    check-cast v17, Ljava/lang/Iterable;

    const/16 v21, 0x0

    const/16 v22, 0x3f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v13

    move/from16 v18, v0

    new-instance v0, Ll83/k;

    invoke-direct {v0, v14, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v0, v18

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_9

    :cond_9
    move/from16 v18, v0

    invoke-static {v15}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    new-instance v17, Lew/c;

    const-string v9, "responseMessage"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "responseBodyStream"

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lew/b;

    invoke-direct {v9, v0}, Lew/b;-><init>(Ljava/util/Map;)V

    new-instance v0, Le10/k0;

    const/16 v13, 0xa

    invoke-direct {v0, v5, v13}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v22, v0

    move-object/from16 v19, v8

    move-object/from16 v21, v9

    move-object/from16 v20, v10

    invoke-direct/range {v17 .. v22}, Lew/c;-><init>(ILjava/lang/String;Ljava/io/InputStream;Lew/b;Le10/k0;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-object/from16 v5, v17

    goto :goto_a

    :catchall_0
    move-exception v0

    move/from16 v16, v13

    move-object v8, v0

    :try_start_4
    throw v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {v9, v8}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :goto_9
    const-string v8, "POST failed "

    invoke-virtual {v8, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x2

    invoke-static {v0, v8, v9}, Lbp/b;->C(Ljava/lang/Exception;Ljava/lang/String;I)V

    iget-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_a
    const/4 v5, 0x0

    :goto_a
    if-nez v5, :cond_b

    goto :goto_d

    :cond_b
    :try_start_6
    iget v0, v5, Lew/c;->w:I

    const/16 v8, 0x12c

    if-ge v0, v8, :cond_d

    iget v0, v3, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v0, v6

    iput v0, v3, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    :goto_b
    if-lez v0, :cond_c

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_b

    :goto_c
    move-object v2, v0

    goto/16 :goto_11

    :cond_c
    iget-object v0, v7, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, Ldw/d;

    const/4 v4, -0x1

    iput v4, v0, Ldw/d;->b:I

    const/4 v4, 0x0

    iput-object v4, v7, Lz7/a;->d:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v7, Lz7/a;->a:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-static {v5, v4}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    goto :goto_c

    :cond_d
    :goto_d
    if-eqz v5, :cond_e

    :try_start_7
    iget-object v0, v5, Lew/c;->z:Lew/b;

    const-string v8, "Retry-After"

    invoke-virtual {v0, v8}, Lew/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_e

    :cond_e
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_f

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    goto :goto_f

    :cond_f
    const-wide/16 v8, 0xa

    :goto_f
    iget-object v0, v7, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, Ldw/d;

    long-to-double v8, v8

    new-instance v10, Ldw/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Ldw/d;->b:I

    invoke-direct {v10, v8, v9, v0}, Ldw/d;-><init>(DI)V

    iput-object v10, v7, Lz7/a;->b:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    const/16 v8, 0xa

    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v10, Ldw/d;->b:I

    iget-object v0, v7, Lz7/a;->c:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, v7, Lz7/a;->d:Ljava/lang/Object;

    iget v0, v7, Lz7/a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v7, Lz7/a;->a:I

    const/16 v7, 0x64

    if-le v0, v7, :cond_10

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    :goto_10
    if-lez v0, :cond_10

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_10

    :cond_10
    new-instance v0, Landroidx/fragment/app/d;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v5, v2}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v0}, Lc5/l;->execute(Ljava/lang/Runnable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/4 v4, 0x0

    invoke-static {v5, v4}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :goto_11
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v5, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_11
    new-instance v0, La8/c;

    const/16 v2, 0x15

    invoke-direct {v0, v2, v1, v3}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v0}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
