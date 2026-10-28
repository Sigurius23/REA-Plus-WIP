.class public final Lio/getstream/chat/android/client/internal/file/StreamFileManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/file/StreamFileManager$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J%\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J#\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ.\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0086@\u00a2\u0006\u0004\u0008\"\u0010#J+\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008$\u0010%J&\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008&\u0010\'J0\u0010+\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0086@\u00a2\u0006\u0004\u0008+\u0010,J\u001b\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008-\u0010\u0012J\u001b\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008.\u0010\u0012J\u001b\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008/\u0010\u0012J\u001b\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u00080\u0010\u0012J\u001b\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u00081\u0010\u0012\u00a8\u00063"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "",
        "<init>",
        "()V",
        "",
        "prefix",
        "extension",
        "createMediaFilename",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "filename",
        "",
        "matchesMediaFilenamePattern",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z",
        "Landroid/content/Context;",
        "context",
        "Ln23/h;",
        "Ljava/io/File;",
        "getOrCreateCacheDir",
        "(Landroid/content/Context;)Ln23/h;",
        "getStreamCacheDir",
        "(Landroid/content/Context;)Ljava/io/File;",
        "createTimestampedCacheDir",
        "",
        "listFilesInCache",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;",
        "Ll83/a0;",
        "clearImageCache",
        "clearTimestampedCacheFolders",
        "getImageCache",
        "fileName",
        "createFileInCache",
        "(Landroid/content/Context;Ljava/lang/String;)Ln23/h;",
        "Ljava/io/InputStream;",
        "source",
        "writeFileInCache",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;",
        "writeFileInTimestampedCache",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Ln23/h;",
        "getFileFromCache",
        "(Landroid/content/Context;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "ttlMs",
        "maxSizeBytes",
        "evictCacheFiles",
        "(Landroid/content/Context;Ljava/lang/String;JJLq83/d;)Ljava/lang/Object;",
        "clearCache",
        "clearAllCache",
        "createPhotoInExternalDir",
        "createVideoInExternalDir",
        "clearExternalStorage",
        "Companion",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CACHE_DIR:Ljava/lang/String; = "stream_cache"

.field private static final Companion:Lio/getstream/chat/android/client/internal/file/StreamFileManager$Companion;

.field private static final EXTERNAL_DIR_TIMESTAMP_FORMAT:Ljava/lang/String; = "yyyyMMdd_HHmmss"

.field private static final IMAGE_CACHE_DIR:Ljava/lang/String; = "stream_image_cache"

.field private static final PHOTO_EXTENSION:Ljava/lang/String; = "jpg"

.field private static final PHOTO_PREFIX:Ljava/lang/String; = "STREAM_IMG"

.field private static final TIMESTAMPED_DIR_PREFIX:Ljava/lang/String; = "STREAM_"

.field private static final TIMESTAMPED_DIR_TIMESTAMP_FORMAT:Ljava/lang/String; = "HHmmssSSS"

.field private static final VIDEO_EXTENSION:Ljava/lang/String; = "mp4"

.field private static final VIDEO_PREFIX:Ljava/lang/String; = "STREAM_VID"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->Companion:Lio/getstream/chat/android/client/internal/file/StreamFileManager$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearTimestampedCacheFolders$lambda$15(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getOrCreateCacheDir(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;)Ln23/h;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getOrCreateCacheDir(Landroid/content/Context;)Ln23/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$listFilesInCache(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->listFilesInCache(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->listFilesInCache$lambda$14(Ljava/lang/String;Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearExternalStorage$lambda$12(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method private static final clearExternalStorage$lambda$10(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "STREAM_IMG"

    const-string v1, "jpg"

    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->matchesMediaFilenamePattern(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final clearExternalStorage$lambda$12(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "STREAM_VID"

    const-string v1, "mp4"

    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->matchesMediaFilenamePattern(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final clearImageCache(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "Could not clear image cache directory."

    :try_start_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getImageCache(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_0

    :try_start_1
    new-instance p1, Ln23/g;

    invoke-direct {p1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lx83/j;->l(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ln23/g;

    invoke-direct {p1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ln23/f;

    new-instance v1, Ln23/a;

    invoke-direct {v1, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ln23/f;-><init>(Ln23/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_0
    new-instance v1, Ln23/f;

    new-instance v2, Ln23/d;

    invoke-direct {v2, v0, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1
.end method

.method private final clearTimestampedCacheFolders(Landroid/content/Context;)Ln23/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/client/internal/file/a;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/file/a;-><init>()V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-array p1, v0, [Ljava/io/File;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lx83/j;->l(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Could not clear all timestamped cache folders."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_3
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not clear timestamped cache folders."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private static final clearTimestampedCacheFolders$lambda$15(Ljava/io/File;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "STREAM_"

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method private final createMediaFilename(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd_HHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final createTimestampedCacheDir(Landroid/content/Context;)Ln23/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "STREAM_"

    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "HHmmssSSS"

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    new-instance p1, Ln23/g;

    invoke-direct {p1, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not get or create cache directory."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearExternalStorage$lambda$10(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method private final getOrCreateCacheDir(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getStreamCacheDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not get or create cache directory."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method private final getStreamCacheDir(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v1, "stream_cache"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final listFilesInCache(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getStreamCacheDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/client/internal/file/c;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lio/getstream/chat/android/client/internal/file/c;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method private static final listFilesInCache$lambda$14(Ljava/lang/String;Ljava/io/File;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1
.end method

.method private final matchesMediaFilenamePattern(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "literal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "quote(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_\\d{8}_\\d{6}\\."

    const-string v1, "$"

    const-string v2, "^"

    invoke-static {v2, p2, v0, p3, v1}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "pattern"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p2

    const-string p3, "compile(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "input"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final clearAllCache(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearCache(Landroid/content/Context;)Ln23/h;

    move-result-object v0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearImageCache(Landroid/content/Context;)Ln23/h;

    move-result-object v1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->clearTimestampedCacheFolders(Landroid/content/Context;)Ln23/h;

    move-result-object p1

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_0

    check-cast v0, Ln23/g;

    invoke-virtual {v0}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/a0;

    move-object v0, v1

    goto :goto_0

    :cond_0
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_3

    :goto_0
    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_1

    check-cast v0, Ln23/g;

    invoke-virtual {v0}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/a0;

    return-object p1

    :cond_1
    instance-of p1, v0, Ln23/f;

    if-eqz p1, :cond_2

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final clearCache(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "Could not clear Stream cache directory."

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getStreamCacheDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_0

    :try_start_1
    new-instance p1, Ln23/g;

    invoke-direct {p1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lx83/j;->l(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ln23/g;

    invoke-direct {p1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ln23/f;

    new-instance v1, Ln23/a;

    invoke-direct {v1, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ln23/f;-><init>(Ln23/e;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_0
    new-instance v1, Ln23/f;

    new-instance v2, Ln23/d;

    invoke-direct {v2, v0, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1
.end method

.method public final clearExternalStorage(Landroid/content/Context;)Ln23/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sget-object v1, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance v3, Lio/getstream/chat/android/client/internal/file/b;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lio/getstream/chat/android/client/internal/file/b;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;I)V

    invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v0, v4

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v5

    if-nez v5, :cond_0

    move v1, v2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_3

    new-instance v0, Lio/getstream/chat/android/client/internal/file/b;

    const/4 v3, 0x1

    invoke-direct {v0, p0, v3}, Lio/getstream/chat/android/client/internal/file/b;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;I)V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_3

    array-length v0, p1

    move v3, v2

    :goto_1
    if-ge v3, v0, :cond_3

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_2

    move v1, v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    const-string v1, "Could not delete all external storage files."

    invoke-direct {v0, v1}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_2
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not clear external storage."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public final createFileInCache(Landroid/content/Context;Ljava/lang/String;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getOrCreateCacheDir(Landroid/content/Context;)Ln23/h;

    move-result-object p1

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ln23/g;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final createPhotoInExternalDir(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ln23/g;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getOrCreateCacheDir(Landroid/content/Context;)Ln23/h;

    move-result-object p1

    :goto_0
    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_1

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    const-string v0, "STREAM_IMG"

    const-string v1, "jpg"

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createMediaFilename(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ln23/g;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not create photo file."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public final createVideoInExternalDir(Landroid/content/Context;)Ln23/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ln23/g;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getOrCreateCacheDir(Landroid/content/Context;)Ln23/h;

    move-result-object p1

    :goto_0
    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_1

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    const-string v0, "STREAM_VID"

    const-string v1, "mp4"

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createMediaFilename(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ln23/g;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not create video file."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public final evictCacheFiles(Landroid/content/Context;Ljava/lang/String;JJLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "JJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-wide v7, p3

    move-wide v5, p5

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$evictCacheFiles$2;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;JJLq83/d;)V

    move-object/from16 p1, p7

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final getFileFromCache(Landroid/content/Context;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/internal/file/StreamFileManager$getFileFromCache$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$getFileFromCache$2;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getImageCache(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v0, "getCacheDir(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stream_image_cache"

    invoke-static {p1, v0}, Lx83/j;->o(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public final writeFileInCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/file/StreamFileManager$writeFileInCache$2;-><init>(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)V

    invoke-static {v0, v1, p4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final writeFileInTimestampedCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/InputStream;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createTimestampedCacheDir(Landroid/content/Context;)Ln23/h;

    move-result-object p1

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p3, p1}, Ls40/e0;->c(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {p3}, Ljava/io/Closeable;->close()V

    new-instance p1, Ln23/g;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_0
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p2

    :try_start_8
    invoke-static {p3, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    :goto_1
    new-instance p2, Ln23/f;

    new-instance p3, Ln23/d;

    const-string v0, "Failed to write file to timestamped cache."

    invoke-direct {p3, v0, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p2, p3}, Ln23/f;-><init>(Ln23/e;)V

    return-object p2
.end method
