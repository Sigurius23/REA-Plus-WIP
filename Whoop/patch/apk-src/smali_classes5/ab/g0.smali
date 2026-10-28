.class public final synthetic Lab/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/r;
.implements Lh5/u;
.implements Lk83/a;
.implements Lx8/f;
.implements Lcq/e;
.implements Lcom/mapbox/common/OfflineSwitchObserver;
.implements Lcom/mapbox/maps/CameraChangedCoalescedCallback;
.implements Lcom/mapbox/maps/MapLoadingErrorDelegate;
.implements Lcom/mapbox/maps/RenderFrameFinishedCallback;
.implements Lbh3/g;
.implements Lcom/mapbox/bindgen/Expected$Transformer;
.implements Lyr/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc9/a;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lab/g0;->w:I

    iput-object p2, p0, Lab/g0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc9/a;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V
    .locals 0

    .line 2
    const/16 p1, 0xe

    iput p1, p0, Lab/g0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lab/g0;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Lab/g0;->w:I

    iput-object p1, p0, Lab/g0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLx8/n;)V
    .locals 1

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v0, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [Lt9/k0;

    invoke-static {p1, p2, p3, v0}, Lt9/a;->d(JLx8/n;[Lt9/k0;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Ldn/j;

    check-cast p1, Ldn/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lab/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/e;

    invoke-static {v0, p1}, Lcq0/g;->g(Lcom/whoop/data/local/room/dao/persistent/e;Ljava/lang/Object;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/e;

    invoke-static {v0, p1}, Lcq0/g;->d(Lcom/whoop/data/local/room/dao/persistent/e;Ljava/lang/Object;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/view/edit/form/c;

    invoke-static {v0, p1}, Lcq0/g;->j(Lcom/whoop/profile/view/edit/form/c;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(La33/d;)Lem/b;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lab/g0;->x:Ljava/lang/Object;

    check-cast v2, Lem/c;

    iget-object v3, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v3, Ljava/net/URL;

    const-string v4, "TRuntime."

    const-string v5, "CctTransportBackend"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_0

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Making request to: %s"

    invoke-static {v9, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;

    const/16 v6, 0x7530

    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    iget v6, v2, Lem/c;->g:I

    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v6, "POST"

    invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v6, "User-Agent"

    const-string v8, "datatransport/3.1.9 android/"

    invoke-virtual {v3, v6, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "Content-Encoding"

    const-string v8, "gzip"

    invoke-virtual {v3, v6, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "application/json"

    const-string v10, "Content-Type"

    invoke-virtual {v3, v10, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Accept-Encoding"

    invoke-virtual {v3, v9, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v9, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1

    const-string v11, "X-Goog-Api-Key"

    invoke-virtual {v3, v11, v9}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v13
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v14, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v14, v13}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    iget-object v2, v2, Lem/c;->a:Lla/b;

    iget-object v0, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lfm/i;

    new-instance v15, Ljava/io/BufferedWriter;

    new-instance v9, Ljava/io/OutputStreamWriter;

    invoke-direct {v9, v14}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v15, v9}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    move-object/from16 v16, v15

    new-instance v15, Lnt/e;

    iget-object v2, v2, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Lnt/d;

    iget-object v9, v2, Lnt/d;->a:Ljava/util/HashMap;

    iget-object v11, v2, Lnt/d;->b:Ljava/util/HashMap;

    iget-object v12, v2, Lnt/d;->c:Lnt/a;

    iget-boolean v2, v2, Lnt/d;->d:Z

    move/from16 v20, v2

    move-object/from16 v17, v9

    move-object/from16 v18, v11

    move-object/from16 v19, v12

    invoke-direct/range {v15 .. v20}, Lnt/e;-><init>(Ljava/io/BufferedWriter;Ljava/util/HashMap;Ljava/util/HashMap;Lnt/a;Z)V

    invoke-virtual {v15, v0}, Lnt/e;->f(Ljava/lang/Object;)Lnt/e;

    invoke-virtual {v15}, Lnt/e;->h()V

    iget-object v0, v15, Lnt/e;->b:Landroid/util/JsonWriter;

    invoke-virtual {v0}, Landroid/util/JsonWriter;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v13, :cond_2

    :try_start_4
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_d

    :catch_1
    move-exception v0

    goto/16 :goto_d

    :catch_2
    move-exception v0

    :goto_0
    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    goto/16 :goto_e

    :catch_3
    move-exception v0

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_3

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v7, "Status Code: %d"

    invoke-static {v7, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    const-string v2, "Content-Type: %s"

    invoke-virtual {v3, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5, v2}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Content-Encoding: %s"

    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5, v2}, Ldp/d;->y(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x12e

    if-eq v0, v2, :cond_b

    const/16 v2, 0x12d

    if-eq v0, v2, :cond_b

    const/16 v2, 0x133

    if-ne v0, v2, :cond_4

    goto :goto_7

    :cond_4
    const/16 v2, 0xc8

    if-eq v0, v2, :cond_5

    new-instance v2, Lem/b;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v0, v5, v3, v4}, Lem/b;-><init>(ILjava/net/URL;J)V

    return-object v2

    :cond_5
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    :try_start_5
    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :cond_6
    move-object v3, v2

    :goto_2
    :try_start_6
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-static {v4}, Lfm/m;->a(Ljava/io/BufferedReader;)Lfm/m;

    move-result-object v4

    iget-wide v4, v4, Lfm/m;->a:J

    new-instance v6, Lem/b;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v7, v4, v5}, Lem/b;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v3, :cond_7

    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_5

    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_8
    return-object v6

    :catchall_1
    move-exception v0

    move-object v4, v0

    if-eqz v3, :cond_9

    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    :try_start_9
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_4
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_5
    if-eqz v2, :cond_a

    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_6
    throw v3

    :cond_b
    :goto_7
    const-string v2, "Location"

    invoke-virtual {v3, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lem/b;

    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const-wide/16 v5, 0x0

    invoke-direct {v3, v0, v4, v5, v6}, Lem/b;-><init>(ILjava/net/URL;J)V

    return-object v3

    :catchall_4
    move-exception v0

    move-object v2, v0

    goto :goto_b

    :goto_8
    move-object v2, v0

    goto :goto_9

    :catchall_5
    move-exception v0

    goto :goto_8

    :goto_9
    :try_start_b
    invoke-virtual {v14}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_a

    :catchall_6
    move-exception v0

    :try_start_c
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :goto_b
    if-eqz v13, :cond_c

    :try_start_d
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_c

    :catchall_7
    move-exception v0

    :try_start_e
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_c
    throw v2
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    :goto_d
    const-string v2, "Couldn\'t encode request, returning with 400"

    invoke-static {v5, v2, v0}, Ldp/d;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v0, Lem/b;

    const/16 v2, 0x190

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    invoke-direct {v0, v2, v7, v3, v4}, Lem/b;-><init>(ILjava/net/URL;J)V

    goto :goto_f

    :goto_e
    const-string v2, "Couldn\'t open connection, returning with 500"

    invoke-static {v5, v2, v0}, Ldp/d;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    new-instance v0, Lem/b;

    const/16 v2, 0x1f4

    invoke-direct {v0, v2, v7, v3, v4}, Lem/b;-><init>(ILjava/net/URL;J)V

    :goto_f
    return-object v0
.end method

.method public d(Lay/a;)V
    .locals 5

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    iget-object v0, v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lay/b0;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Le;

    const/16 v3, 0xc

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lyy/i0;

    iget-object v0, v0, Lyy/i0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    if-eq v1, v0, :cond_1

    sget-object v0, Lyy/v;->G:Lyy/v;

    goto :goto_0

    :cond_1
    sget-object v0, Lyy/v;->x:Lyy/v;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lyy/v;->G:Lyy/v;

    goto :goto_0

    :pswitch_0
    sget-object v0, Lyy/v;->F:Lyy/v;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lyy/v;->E:Lyy/v;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lyy/v;->z:Lyy/v;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lyy/v;->y:Lyy/v;

    :goto_0
    iget-object v0, v0, Lyy/v;->w:Ljava/lang/String;

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/extension/style/types/PromoteId;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/mapbox/maps/extension/style/types/PromoteId;->a(Lcom/mapbox/maps/extension/style/types/PromoteId;Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lab/g0;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Ll9/y;

    check-cast p1, Lc9/b;

    .line 2
    check-cast p1, Lc9/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget v0, v0, Ll9/y;->a:I

    iput v0, p1, Lc9/l;->w:I

    return-void

    .line 4
    :pswitch_1
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lb9/g;

    check-cast p1, Lc9/b;

    .line 5
    check-cast p1, Lc9/l;

    .line 6
    iget v1, p1, Lc9/l;->y:I

    .line 7
    iget v2, v0, Lb9/g;->h:I

    add-int/2addr v1, v2

    iput v1, p1, Lc9/l;->y:I

    .line 8
    iget v1, p1, Lc9/l;->z:I

    iget v0, v0, Lb9/g;->f:I

    add-int/2addr v1, v0

    iput v1, p1, Lc9/l;->z:I

    return-void

    .line 9
    :pswitch_2
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/common/PlaybackException;

    check-cast p1, Lc9/b;

    .line 10
    check-cast p1, Lc9/l;

    .line 11
    iput-object v0, p1, Lc9/l;->o:Landroidx/media3/common/PlaybackException;

    return-void

    .line 12
    :pswitch_3
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lu8/c0;

    check-cast p1, Lu8/h0;

    .line 13
    invoke-interface {p1, v0}, Lu8/h0;->onMetadata(Lu8/c0;)V

    return-void

    .line 14
    :pswitch_4
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    check-cast p1, Lu8/h0;

    .line 15
    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    .line 16
    iget-object v0, v0, Lb9/f0;->q0:Lu8/a0;

    .line 17
    invoke-interface {p1, v0}, Lu8/h0;->onMediaMetadataChanged(Lu8/a0;)V

    return-void

    .line 18
    :pswitch_5
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lw8/c;

    check-cast p1, Lu8/h0;

    .line 19
    invoke-interface {p1, v0}, Lu8/h0;->onCues(Lw8/c;)V

    return-void

    .line 20
    :pswitch_6
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lu8/d;

    check-cast p1, Lu8/h0;

    .line 21
    invoke-interface {p1, v0}, Lu8/h0;->onAudioAttributesChanged(Lu8/d;)V

    return-void

    .line 22
    :pswitch_7
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lu8/t0;

    check-cast p1, Lu8/h0;

    .line 23
    invoke-interface {p1, v0}, Lu8/h0;->onTrackSelectionParametersChanged(Lu8/t0;)V

    return-void

    .line 24
    :pswitch_8
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lu8/a0;

    check-cast p1, Lu8/h0;

    .line 25
    invoke-interface {p1, v0}, Lu8/h0;->onMediaMetadataChanged(Lu8/a0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;

    invoke-static {v0, p1}, Lcom/mapbox/common/location/GoogleDeviceLocationProvider;->i(Lcom/mapbox/common/location/GoogleDeviceLocationProvider;Ljava/lang/Exception;)V

    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    iget v0, p0, Lab/g0;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->h0(Lcom/whoop/settings/myaccount/MyAccountFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_0
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;->z(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_1
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Laq0/q;

    invoke-static {v0, p1, p2}, Laq0/q;->v0(Laq0/q;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public run(Lcom/mapbox/maps/CameraChangedCoalesced;)V
    .locals 1

    .line 1
    iget v0, p0, Lab/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    invoke-static {v0, p1}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->a(Lcom/mapbox/maps/debugoptions/DebugOptionsController;Lcom/mapbox/maps/CameraChangedCoalesced;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lev/k;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapController;->a(Lev/k;Lcom/mapbox/maps/CameraChangedCoalesced;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public run(Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/renderer/MapboxRenderer;

    invoke-static {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->c(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/RenderFrameFinished;)V

    return-void
.end method

.method public sendMapLoadingError(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 1

    iget v0, p0, Lab/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->v(Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/MapLoadingError;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/NativeObserver;

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxMap;->s(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingError;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public statusChanged(Z)V
    .locals 1

    iget-object v0, p0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/module/MapboxHttpClient;

    invoke-static {v0, p1}, Lcom/mapbox/common/module/MapboxHttpClient;->a(Lcom/mapbox/common/module/MapboxHttpClient;Z)V

    return-void
.end method
