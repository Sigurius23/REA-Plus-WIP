.class public final Lcom/iterable/iterableapi/a2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# static fields
.field public static final c:Landroid/os/Handler;


# instance fields
.field public a:I

.field public b:Lcom/iterable/iterableapi/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/iterable/iterableapi/a2;->c:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/a2;->a:I

    return-void
.end method

.method public static a(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\nHeaders { \n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "Api-Key"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "Authorization"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/iterable/iterableapi/o;)Lcom/iterable/iterableapi/p;
    .locals 28

    move-object/from16 v1, p0

    const-string v2, "msg"

    const-string v3, "======================================"

    const-string v0, "application/json"

    const-string v4, "POST Request \nURI : https://api.iterable.com/api/"

    if-eqz v1, :cond_13

    iget-object v6, v1, Lcom/iterable/iterableapi/o;->a:Ljava/lang/String;

    iget-object v7, v1, Lcom/iterable/iterableapi/o;->d:Ljava/lang/String;

    iget-object v8, v1, Lcom/iterable/iterableapi/o;->e:Ljava/lang/String;

    iget-object v9, v1, Lcom/iterable/iterableapi/o;->c:Lorg/json/JSONObject;

    iget-object v10, v1, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    const-string v11, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n"

    const-string v12, "IterableRequest"

    invoke-static {v12, v11}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/iterable/iterableapi/a2;->c()V

    :try_start_0
    const-string v13, "GET"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_32
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_31
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_30
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2f
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v14, "Bearer "

    const-string v15, "https://api.iterable.com/api/"

    const-string v5, "\n body : \n"

    const-string v11, "Authorization"

    move-object/from16 v17, v2

    const-string v2, "SDK-Request-Processor"

    const-wide/16 v18, 0x3e8

    move-object/from16 v20, v3

    const-string v3, "Sent-At"

    move-object/from16 v21, v4

    const-string v4, "3.6.6"

    move-object/from16 v22, v12

    const-string v12, "SDK-Version"

    move-object/from16 v23, v5

    const-string v5, "Android"

    move-object/from16 v24, v11

    const-string v11, "SDK-Platform"

    move-object/from16 v25, v8

    const-string v8, "Api-Key"

    move-object/from16 v26, v14

    if-ne v7, v13, :cond_2

    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v9}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_13
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_12
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_11
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v13, :cond_0

    :try_start_2
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v9, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v13, v14}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v5, 0x0

    goto/16 :goto_22

    :catch_0
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    goto/16 :goto_1d

    :catch_1
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_2
    const/4 v6, 0x0

    const/4 v7, 0x0

    goto/16 :goto_1e

    :catch_2
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_3
    const/4 v6, 0x0

    const/4 v7, 0x0

    goto/16 :goto_1f

    :catch_3
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_4
    const/4 v6, 0x0

    const/4 v7, 0x0

    goto/16 :goto_20

    :cond_0
    :try_start_3
    new-instance v7, Ljava/net/URL;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_13
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_12
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_11
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_10
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v0, 0x2710

    :try_start_4
    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v7, v8, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v12, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long v4, v4, v18

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v3, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_f
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_e
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_d
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_c
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v25, :cond_1

    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v26

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v25

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v24

    invoke-virtual {v7, v2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object v5, v7

    goto/16 :goto_22

    :catch_4
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_5
    const/4 v6, 0x0

    goto/16 :goto_1d

    :catch_5
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_6
    const/4 v6, 0x0

    goto/16 :goto_1e

    :catch_6
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_7
    const/4 v6, 0x0

    goto/16 :goto_1f

    :catch_7
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v22

    :goto_8
    const/4 v6, 0x0

    goto/16 :goto_20

    :cond_1
    :goto_9
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GET Request \nURI : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Lcom/iterable/iterableapi/a2;->a(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x2

    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_f
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_e
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_d
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_c
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v2, v22

    :try_start_7
    invoke-static {v2, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-object v3, v2

    :goto_a
    move-object/from16 v2, v20

    goto/16 :goto_10

    :catch_8
    move-exception v0

    :goto_b
    move-object v3, v2

    move-object/from16 v2, v20

    goto :goto_5

    :catch_9
    move-exception v0

    :goto_c
    move-object v3, v2

    move-object/from16 v2, v20

    goto :goto_6

    :catch_a
    move-exception v0

    :goto_d
    move-object v3, v2

    move-object/from16 v2, v20

    goto :goto_7

    :catch_b
    move-exception v0

    :goto_e
    move-object v3, v2

    move-object/from16 v2, v20

    goto :goto_8

    :catch_c
    move-exception v0

    move-object/from16 v2, v22

    goto :goto_b

    :catch_d
    move-exception v0

    move-object/from16 v2, v22

    goto :goto_c

    :catch_e
    move-exception v0

    move-object/from16 v2, v22

    goto :goto_d

    :catch_f
    move-exception v0

    move-object/from16 v2, v22

    goto :goto_e

    :catch_10
    move-exception v0

    move-object/from16 v2, v22

    move-object v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_1

    :catch_11
    move-exception v0

    move-object/from16 v2, v22

    move-object v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_2

    :catch_12
    move-exception v0

    move-object/from16 v2, v22

    move-object v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_3

    :catch_13
    move-exception v0

    move-object/from16 v2, v22

    move-object v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_4

    :cond_2
    move-object/from16 v27, v22

    move-object/from16 v14, v25

    move-object/from16 v13, v26

    move-object/from16 v22, v9

    :try_start_8
    new-instance v9, Ljava/net/URL;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v9, v13}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v9

    check-cast v9, Ljava/net/HttpURLConnection;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_2e
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2d
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_2c
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2b
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const/4 v13, 0x1

    :try_start_9
    invoke-virtual {v9, v13}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {v9, v7}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v7, 0xbb8

    invoke-virtual {v9, v7}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v9, v7}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const-string v7, "Accept"

    invoke-virtual {v9, v7, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "Content-Type"

    invoke-virtual {v9, v7, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v8, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v11, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v12, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    div-long v4, v4, v18

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v3, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/iterable/iterableapi/o;->f:Lcom/iterable/iterableapi/n;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_2a
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_29
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_28
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_27
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-eqz v14, :cond_3

    move-object/from16 v13, v26

    :try_start_a
    invoke-virtual {v13, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v24

    invoke-virtual {v9, v2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_17
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_16
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_a .. :try_end_a} :catch_15
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_14
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_f

    :catchall_2
    move-exception v0

    move-object v5, v9

    goto/16 :goto_22

    :catch_14
    move-exception v0

    move-object v7, v9

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_5

    :catch_15
    move-exception v0

    move-object v7, v9

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_6

    :catch_16
    move-exception v0

    move-object v7, v9

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_7

    :catch_17
    move-exception v0

    move-object v7, v9

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_8

    :cond_3
    :goto_f
    :try_start_b
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v2, v21

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lcom/iterable/iterableapi/a2;->a(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v22

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_2a
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_29
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_b .. :try_end_b} :catch_28
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_27
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v3, v27

    :try_start_c
    invoke-static {v3, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    new-instance v4, Ljava/io/BufferedWriter;

    new-instance v5, Ljava/io/OutputStreamWriter;

    const-string v6, "UTF-8"

    invoke-direct {v5, v0, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_26
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_25
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_c .. :try_end_c} :catch_24
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_23
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object v7, v9

    goto/16 :goto_a

    :goto_10
    :try_start_d
    invoke-static {v3, v2}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_1a
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_d .. :try_end_d} :catch_19
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_18
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    const/16 v5, 0x190

    if-ge v4, v5, :cond_4

    :try_start_e
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v6, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    goto :goto_11

    :catch_18
    move-exception v0

    goto/16 :goto_5

    :catch_19
    move-exception v0

    goto/16 :goto_6

    :catch_1a
    move-exception v0

    goto/16 :goto_8

    :catch_1b
    move-exception v0

    goto :goto_13

    :cond_4
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v8

    invoke-direct {v6, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_11
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    :goto_12
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v6, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_12

    :cond_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_1b
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_1a
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_e .. :try_end_e} :catch_19
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_18
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    move-object v6, v0

    const/4 v8, 0x0

    goto :goto_14

    :goto_13
    :try_start_f
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_1a
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_22
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_f .. :try_end_f} :catch_19
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_18
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    move-object v8, v0

    const/4 v6, 0x0

    :goto_14
    :try_start_10
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1d
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    :try_start_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nResponse from : "

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x2

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1c
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    const/4 v0, 0x0

    goto :goto_16

    :catch_1c
    move-exception v0

    goto :goto_15

    :catch_1d
    move-exception v0

    const/4 v9, 0x0

    :goto_15
    :try_start_12
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_16
    const/16 v10, 0x191

    if-ne v4, v10, :cond_7

    invoke-static {v9}, Lcom/iterable/iterableapi/a2;->g(Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "JWT Authorization header error"

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v0

    invoke-static {}, Lcom/iterable/iterableapi/k;->f()Lcom/iterable/iterableapi/k;

    move-result-object v4

    invoke-virtual {v4}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v4

    invoke-static {v9}, Lcom/iterable/iterableapi/a2;->d(Lorg/json/JSONObject;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lcom/iterable/iterableapi/a2;->h(Lcom/iterable/iterableapi/o;)V

    move-object v5, v0

    goto/16 :goto_18

    :catch_1e
    move-exception v0

    goto/16 :goto_1d

    :catch_1f
    move-exception v0

    goto/16 :goto_1e

    :catch_20
    move-exception v0

    goto/16 :goto_1f

    :catch_21
    move-exception v0

    goto/16 :goto_20

    :cond_6
    const-string v0, "Invalid API Key"

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto/16 :goto_18

    :cond_7
    if-lt v4, v5, :cond_a

    const-string v0, "Invalid Request"

    if-eqz v9, :cond_8

    move-object/from16 v5, v17

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_8
    const/16 v5, 0x1f4

    if-lt v4, v5, :cond_9

    const-string v0, "Internal Server Error"

    :cond_9
    :goto_17
    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_a
    const/16 v5, 0xc8

    if-ne v4, v5, :cond_10

    if-nez v8, :cond_d

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_d

    if-eqz v0, :cond_b

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Could not parse json: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_b
    if-eqz v9, :cond_c

    invoke-static {v4, v6, v9}, Lcom/iterable/iterableapi/p;->b(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_c
    const-string v0, "Response is not a JSON object"

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_d
    if-nez v8, :cond_e

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "No data received"

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_e
    if-eqz v8, :cond_f

    invoke-static {v4, v6, v9, v8}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    goto :goto_18

    :cond_f
    const/4 v5, 0x0

    goto :goto_18

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Received non-200 response: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v6, v9, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_21
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_20
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_12 .. :try_end_12} :catch_1f
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1e
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    :goto_18
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    goto/16 :goto_21

    :catch_22
    move-exception v0

    goto/16 :goto_7

    :catch_23
    move-exception v0

    move-object/from16 v2, v20

    :goto_19
    move-object v7, v9

    goto/16 :goto_5

    :catch_24
    move-exception v0

    move-object/from16 v2, v20

    :goto_1a
    move-object v7, v9

    goto/16 :goto_6

    :catch_25
    move-exception v0

    move-object/from16 v2, v20

    :goto_1b
    move-object v7, v9

    goto/16 :goto_7

    :catch_26
    move-exception v0

    move-object/from16 v2, v20

    :goto_1c
    move-object v7, v9

    goto/16 :goto_8

    :catch_27
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto :goto_19

    :catch_28
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto :goto_1a

    :catch_29
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto :goto_1b

    :catch_2a
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto :goto_1c

    :catch_2b
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_1

    :catch_2c
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_2

    :catch_2d
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_3

    :catch_2e
    move-exception v0

    move-object/from16 v2, v20

    move-object/from16 v3, v27

    goto/16 :goto_4

    :catch_2f
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_1

    :goto_1d
    :try_start_13
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v6, v4, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    if-eqz v7, :cond_11

    goto :goto_18

    :catch_30
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_2

    :goto_1e
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v6, v4, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    if-eqz v7, :cond_11

    goto :goto_18

    :catch_31
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_3

    :goto_1f
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v6, v4, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5

    if-eqz v7, :cond_11

    goto/16 :goto_18

    :catch_32
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_4

    :goto_20
    invoke-static {v1, v0}, Lcom/iterable/iterableapi/a2;->e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v6, v4, v0}, Lcom/iterable/iterableapi/p;->a(ILjava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/iterable/iterableapi/p;

    move-result-object v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    if-eqz v7, :cond_11

    goto/16 :goto_18

    :cond_11
    :goto_21
    invoke-static {v3, v2}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    return-object v5

    :goto_22
    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_12
    throw v0

    :cond_13
    const/16 v16, 0x0

    return-object v16
.end method

.method public static c()V
    .locals 1

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static d(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "msg"

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "jwt payload requires a value for userid or email"

    goto :goto_0

    :sswitch_1
    const-string v0, "jwt format is invalid"

    goto :goto_0

    :sswitch_2
    const-string v0, "invalid payload"

    goto :goto_0

    :sswitch_3
    const-string v0, "jwt token has been invalidated"

    goto :goto_0

    :sswitch_4
    const-string v0, "jwt authorization header is not set"

    goto :goto_0

    :sswitch_5
    const-string v0, "jwt token is expired"

    goto :goto_0

    :sswitch_6
    const-string v0, "jwt is invalid"

    goto :goto_0

    :sswitch_7
    const-string v0, "exp must be less than 1 year from iat"

    goto :goto_0

    :sswitch_8
    const-string v0, "email could not be found"

    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b2fe3eb -> :sswitch_8
        -0x619854c7 -> :sswitch_7
        -0x445a6606 -> :sswitch_6
        -0x41ee3711 -> :sswitch_5
        -0x1cb76f2e -> :sswitch_4
        0x74661c1b -> :sswitch_3
        0x7d978865 -> :sswitch_2
        0x7ea03db1 -> :sswitch_1
        0x7fb5beed -> :sswitch_0
    .end sparse-switch
.end method

.method public static e(Lcom/iterable/iterableapi/o;Ljava/lang/Exception;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nException occurred for : https://api.iterable.com/api/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "IterableRequest"

    invoke-static {v0, p0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static f(Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 2

    const-string v0, "code"

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Lorg/json/JSONObject;)Z
    .locals 1

    const-string v0, "InvalidJwtPayload"

    invoke-static {v0, p0}, Lcom/iterable/iterableapi/a2;->f(Ljava/lang/String;Lorg/json/JSONObject;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "BadAuthorizationHeader"

    invoke-static {v0, p0}, Lcom/iterable/iterableapi/a2;->f(Ljava/lang/String;Lorg/json/JSONObject;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "JwtUserIdentifiersMismatched"

    invoke-static {v0, p0}, Lcom/iterable/iterableapi/a2;->f(Ljava/lang/String;Lorg/json/JSONObject;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static h(Lcom/iterable/iterableapi/o;)V
    .locals 4

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    iget-object v0, v0, Lcom/iterable/iterableapi/s;->z:Lcom/iterable/iterableapi/m2;

    iget-wide v0, v0, Lcom/iterable/iterableapi/m2;->a:J

    sget-object v2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v2}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v2

    new-instance v3, Lcom/iterable/iterableapi/z1;

    invoke-direct {v3, p0}, Lcom/iterable/iterableapi/z1;-><init>(Lcom/iterable/iterableapi/o;)V

    const/4 p0, 0x0

    invoke-virtual {v2, v0, v1, p0, v3}, Lcom/iterable/iterableapi/s;->e(JZLcom/iterable/iterableapi/z1;)V

    return-void
.end method


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Lcom/iterable/iterableapi/o;

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    :cond_0
    iget-object p1, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    invoke-static {p1}, Lcom/iterable/iterableapi/a2;->b(Lcom/iterable/iterableapi/o;)Lcom/iterable/iterableapi/p;

    move-result-object p1

    return-object p1
.end method

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/iterable/iterableapi/p;

    iget-boolean v0, p1, Lcom/iterable/iterableapi/p;->a:Z

    if-nez v0, :cond_1

    iget v1, p1, Lcom/iterable/iterableapi/p;->b:I

    const/16 v2, 0x1f4

    if-lt v1, v2, :cond_1

    iget v1, p0, Lcom/iterable/iterableapi/a2;->a:I

    const/4 v2, 0x5

    if-gt v1, v2, :cond_1

    new-instance p1, Lcom/iterable/iterableapi/a2;

    invoke-direct {p1}, Lcom/iterable/iterableapi/a2;-><init>()V

    iget v0, p0, Lcom/iterable/iterableapi/a2;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lcom/iterable/iterableapi/a2;->a:I

    iget v0, p0, Lcom/iterable/iterableapi/a2;->a:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    const-wide/16 v1, 0x7d0

    int-to-long v3, v0

    mul-long/2addr v3, v1

    goto :goto_0

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    sget-object v0, Lcom/iterable/iterableapi/a2;->c:Landroid/os/Handler;

    new-instance v1, Lds/s;

    const/4 v2, 0x5

    const/4 v5, 0x0

    invoke-direct {v1, p0, p1, v5, v2}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    iget-object v0, v0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    const-string v1, "mobile/getRemoteConfiguration"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    iget-object v0, v0, Lcom/iterable/iterableapi/o;->b:Ljava/lang/String;

    const-string v1, "users/disableDevice"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    iget-object v0, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    iget-object v0, v0, Lcom/iterable/iterableapi/o;->h:Lcom/iterable/iterableapi/z1;

    if-eqz v0, :cond_4

    iget-object v1, p1, Lcom/iterable/iterableapi/p;->d:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/z1;->a(Lorg/json/JSONObject;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/iterable/iterableapi/a2;->b:Lcom/iterable/iterableapi/o;

    iget-object v0, v0, Lcom/iterable/iterableapi/o;->g:Lcom/iterable/iterableapi/f0;

    if-eqz v0, :cond_5

    iget-object v1, p1, Lcom/iterable/iterableapi/p;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/iterable/iterableapi/f0;->i(Ljava/lang/String;)V

    :cond_5
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    return-void
.end method
