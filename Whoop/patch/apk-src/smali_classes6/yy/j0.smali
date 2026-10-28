.class public final Lyy/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final x:Ljava/lang/String;


# instance fields
.field public final w:Ljavax/net/ssl/HttpsURLConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lyy/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy/j0;->w:Ljavax/net/ssl/HttpsURLConnection;

    return-void
.end method


# virtual methods
.method public final b()Lyy/n0;
    .locals 7

    iget-object v0, p0, Lyy/j0;->w:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    new-instance v2, Lyy/n0;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    const/16 v4, 0xc8

    if-gt v4, v3, :cond_0

    const/16 v4, 0x12c

    if-ge v3, v4, :cond_0

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    new-instance v5, Ljava/util/Scanner;

    sget-object v6, Lyy/j0;->x:Ljava/lang/String;

    invoke-direct {v5, v3, v6}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    const-string v6, "\\A"

    invoke-virtual {v5, v6}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Scanner;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    :goto_2
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    const-string v3, "getHeaderFields(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, v4, v0}, Lyy/n0;-><init>(ILjava/lang/String;Ljava/util/Map;)V

    return-object v2

    :goto_3
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v3, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lyy/j0;->w:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const/16 v2, 0xc8

    if-gt v2, v1, :cond_0

    const/16 v2, 0x12c

    if-ge v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method
