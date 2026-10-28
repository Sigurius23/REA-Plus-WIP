.class public final Lud3/p0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lud3/h0;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Lud3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lud3/p0;->a:Lud3/h0;

    iput-object p1, p0, Lud3/p0;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lud3/p0;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/p0;->a:Lud3/h0;

    return-object v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 3

    const-string v0, "<this>"

    iget-object v1, p0, Lud3/p0;->b:Ljava/io/File;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne3/y;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object v1, Lne3/r0;->d:Lne3/q0;

    invoke-direct {v0, v2, v1}, Lne3/y;-><init>(Ljava/io/InputStream;Lne3/r0;)V

    :try_start_0
    invoke-interface {p1, v0}, Lne3/i;->N0(Lne3/p0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lne3/y;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
