.class public final Lio/seon/androidsdk/service/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final E:Ljava/util/regex/Pattern;

.field public static final z:Lbu/c;


# instance fields
.field public final w:Lio/seon/androidsdk/service/c0;

.field public final x:I

.field public y:Lio/seon/androidsdk/service/e0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/i0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/i0;->z:Lbu/c;

    const-string v0, "[A-Za-z0-9](?:[A-Za-z0-9\\-]{0,61}[A-Za-z0-9])?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/i0;->E:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lio/seon/androidsdk/service/c0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/seon/androidsdk/service/i0;->w:Lio/seon/androidsdk/service/c0;

    iput p2, p0, Lio/seon/androidsdk/service/i0;->x:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 2

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v0, "User-Agent"

    const-string v1, "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11"

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Accept"

    const-string v1, "*/*"

    invoke-virtual {p1, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lio/seon/androidsdk/service/i0;->x:I

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    return-object p1
.end method

.method public final call()Ljava/lang/Object;
    .locals 9

    const-string v0, "data"

    const-string v1, "Status code: "

    new-instance v2, Lio/seon/androidsdk/service/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    iput-object v3, v2, Lio/seon/androidsdk/service/e0;->a:Ljava/lang/String;

    iput-object v2, p0, Lio/seon/androidsdk/service/i0;->y:Lio/seon/androidsdk/service/e0;

    iget-object v2, p0, Lio/seon/androidsdk/service/i0;->w:Lio/seon/androidsdk/service/c0;

    iget-object v3, v2, Lio/seon/androidsdk/service/c0;->a:Ljava/lang/String;

    iget-object v2, v2, Lio/seon/androidsdk/service/c0;->b:Ljava/lang/String;

    const/4 v4, 0x3

    sget-object v5, Lio/seon/androidsdk/service/i0;->z:Lbu/c;

    if-eqz v3, :cond_0

    const-string v6, "[^a-zA-Z0-9-]"

    const-string v7, ""

    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lio/seon/androidsdk/service/i0;->E:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_0

    :try_start_0
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v5, v4, v3}, Lbu/c;->L(ILjava/lang/Exception;)V

    :cond_0
    const-string v3, "default"

    :goto_0
    const-string v6, "https://"

    const-string v7, ".seondnsresolve.com/android"

    invoke-static {v6, v3, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :try_start_1
    invoke-virtual {p0, v3}, Lio/seon/androidsdk/service/i0;->a(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v3

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v6, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    long-to-int v2, v7

    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    new-instance v2, Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v7

    invoke-direct {v2, v7}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v6

    :try_start_3
    invoke-virtual {v5, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    goto :goto_3

    :goto_2
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0

    :cond_1
    :goto_3
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    invoke-virtual {v5, v4, v1}, Lbu/c;->F(ILjava/lang/String;)V

    const/16 v1, 0xca

    if-eq v2, v1, :cond_3

    const/16 v1, 0xc8

    if-ne v2, v1, :cond_2

    goto :goto_5

    :cond_2
    :goto_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_b

    :cond_3
    :goto_5
    :try_start_5
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    const-string v5, "utf-8"

    invoke-direct {v2, v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_6
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_4
    iget-object v4, p0, Lio/seon/androidsdk/service/i0;->y:Lio/seon/androidsdk/service/e0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-nez v4, :cond_5

    :try_start_7
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lio/seon/androidsdk/service/i0;->y:Lio/seon/androidsdk/service/e0;

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lio/seon/androidsdk/service/e0;->a:Ljava/lang/String;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_7

    :catch_2
    :try_start_8
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :cond_5
    :goto_7
    :try_start_9
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_a

    :goto_8
    :try_start_a
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v1

    :try_start_b
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :goto_a
    :try_start_c
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    :catch_3
    :goto_b
    iget-object v0, p0, Lio/seon/androidsdk/service/i0;->y:Lio/seon/androidsdk/service/e0;

    return-object v0
.end method
