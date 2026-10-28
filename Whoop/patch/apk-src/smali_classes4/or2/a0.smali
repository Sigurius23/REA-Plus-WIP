.class public final Lor2/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lor2/a0;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ltr2/o;",
        "taggedLogger",
        "<init>",
        "(Landroid/content/Context;Ltr2/o;)V",
        "Ljava/io/File;",
        "directory",
        "",
        "f",
        "(Ljava/io/File;)Z",
        "Ll83/a0;",
        "d",
        "()V",
        "file",
        "e",
        "(Ljava/io/File;)V",
        "",
        "fileName",
        "",
        "bytes",
        "g",
        "(Ljava/lang/String;[B)Ljava/io/File;",
        "Lud3/a1;",
        "responseBody",
        "h",
        "(Ljava/lang/String;Lud3/a1;)Ljava/io/File;",
        "Landroid/net/Uri;",
        "uri",
        "c",
        "(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Ltr2/o;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ltr2/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/o;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taggedLogger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/a0;->a:Landroid/content/Context;

    iput-object p2, p0, Lor2/a0;->b:Ltr2/o;

    return-void
.end method

.method public static final synthetic a(Lor2/a0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lor2/a0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lor2/a0;)Ltr2/o;
    .locals 0

    iget-object p0, p0, Lor2/a0;->b:Ltr2/o;

    return-object p0
.end method

.method private final f(Ljava/io/File;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_1

    new-instance v4, Ljava/io/File;

    aget-object v5, v1, v3

    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v4}, Lor2/a0;->f(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_0

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    return p1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    return p1

    :cond_3
    return v0
.end method


# virtual methods
.method public final c(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lor2/a0$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lor2/a0$a;-><init>(Lor2/a0;Landroid/net/Uri;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lor2/a0;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0}, Lor2/a0;->f(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lor2/a0;->b:Ltr2/o;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Error deleting cache"

    invoke-virtual {v1, v3, v0, v2}, Ltr2/o;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public final e(Ljava/io/File;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/String;[B)Ljava/io/File;
    .locals 4

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lor2/a0;->a:Landroid/content/Context;

    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    :cond_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_0
    invoke-virtual {p1, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-object v0

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final h(Ljava/lang/String;Lud3/a1;)Ljava/io/File;
    .locals 5

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseBody"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lor2/a0;->a:Landroid/content/Context;

    sget-object v3, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v0

    goto :goto_3

    :cond_0
    :goto_0
    const/16 p1, 0x1000

    new-array p1, p1, [B

    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {p2}, Lud3/a1;->b()Ljava/io/InputStream;

    move-result-object v3

    const/16 v4, 0x2000

    invoke-direct {v2, v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    :goto_1
    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v4, v0}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-virtual {v2, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_2
    move-object v0, v2

    goto :goto_3

    :cond_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p2}, Lud3/a1;->close()V

    return-object v1

    :catchall_2
    move-exception p1

    move-object v3, v0

    goto :goto_2

    :goto_3
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    :cond_3
    invoke-virtual {p2}, Lud3/a1;->close()V

    throw p1
.end method
