.class public final Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008 \u0010!J\u001b\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\"\u0010!J)\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0008\u00a2\u0006\u0004\u0008$\u0010%J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\u00a8\u00064"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "selection",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "getFilteredAttachments",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;",
        "Landroid/database/Cursor;",
        "cursor",
        "getAttachmentFromCursor",
        "(Landroid/database/Cursor;)Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "mimeType",
        "",
        "id",
        "Landroid/net/Uri;",
        "getContentUri",
        "(Ljava/lang/String;J)Landroid/net/Uri;",
        "getModelType",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "isImage",
        "(Ljava/lang/String;)Z",
        "isVideo",
        "attachmentMetaData",
        "Ljava/io/File;",
        "getCachedFileFromUri",
        "(Landroid/content/Context;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/io/File;",
        "getFileAttachments",
        "(Landroid/content/Context;)Ljava/util/List;",
        "getMediaAttachments",
        "uriList",
        "getAttachmentsFromUriList",
        "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;",
        "uri",
        "isUriResolvable$stream_chat_android_ui_common_release",
        "(Landroid/content/Context;Landroid/net/Uri;)Z",
        "isUriResolvable",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "fileManager",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Companion",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper$Companion;

.field public static final FILE_NAME_PREFIX:Ljava/lang/String; = "STREAM_"

.field private static final MILISECOND_IN_A_SECOND:I = 0x3e8

.field public static final TIME_FORMAT:Ljava/lang/String; = "HHmmssSSS"


# instance fields
.field private final fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->Companion:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    const-string v0, "Chat:StorageHelper"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getAttachmentFromCursor(Landroid/database/Cursor;)Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "_display_name"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    const-string v3, "_size"

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    const-string v4, "mime_type"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    const-string v5, "duration"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    const-string v6, "_id"

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    if-eq v2, v9, :cond_0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v8

    :goto_0
    const-wide/16 v10, 0x0

    if-eq v3, v9, :cond_1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    goto :goto_1

    :cond_1
    move-wide v12, v10

    :goto_1
    if-eq v4, v9, :cond_2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :cond_2
    if-eq v5, v9, :cond_3

    invoke-interface {v1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    :cond_3
    new-instance v14, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-direct {v0, v8, v6, v7}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v15

    const/16 v21, 0x3a

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v8

    invoke-direct/range {v14 .. v22}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v8}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getModelType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setType(Ljava/lang/String;)V

    invoke-virtual {v14, v12, v13}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSize(J)V

    invoke-virtual {v14, v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setTitle(Ljava/lang/String;)V

    const/16 v1, 0x3e8

    int-to-long v1, v1

    div-long/2addr v10, v1

    invoke-virtual {v14, v10, v11}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setVideoLength(J)V

    return-object v14
.end method

.method private final getContentUri(Ljava/lang/String;J)Landroid/net/Uri;
    .locals 2

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->isImage(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "EXTERNAL_CONTENT_URI"

    if-eqz v0, :cond_0

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->isVideo(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "external"

    invoke-static {p1}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "getContentUri(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-static {p1, p2, p3}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "withAppendedId(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getFilteredAttachments(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    const-string v0, "_size"

    const-string v1, "duration"

    const-string v2, "_id"

    const-string v3, "_display_name"

    const-string v4, "mime_type"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const-string p1, "external"

    invoke-static {p1}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    const/4 v9, 0x0

    const-string v10, "date_added DESC"

    move-object v8, p2

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    :try_start_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getAttachmentFromCursor(Landroid/database/Cursor;)Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-object p2

    :goto_1
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getModelType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->isImage(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "image"

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->isVideo(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "video"

    return-object p1

    :cond_1
    const-string p1, "file"

    return-object p1
.end method

.method private final isImage(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "image"

    invoke-static {p1, v1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method private final isVideo(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "video"

    invoke-static {p1, v1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    return v0
.end method


# virtual methods
.method public final getAttachmentsFromUriList(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "uriList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/net/Uri;

    const-string v3, "_display_name"

    const-string v10, "mime_type"

    const-string v11, "_size"

    const-string v12, "duration"

    filled-new-array {v3, v10, v11, v12}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13

    const/4 v4, 0x0

    if-eqz v13, :cond_6

    :try_start_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v13, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v13, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v3, v9, :cond_1

    invoke-interface {v13, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_1

    invoke-interface {v13, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 v3, p0

    :goto_1
    move-object v1, v0

    goto :goto_7

    :cond_1
    :goto_2
    const-wide/16 v10, 0x0

    if-eq v6, v9, :cond_2

    invoke-interface {v13, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v13, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    goto :goto_3

    :cond_2
    move-wide v14, v10

    :goto_3
    if-eq v7, v9, :cond_3

    invoke-interface {v13, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v13, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_4
    move-object v7, v3

    goto :goto_5

    :cond_3
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :goto_5
    if-eq v8, v9, :cond_4

    invoke-interface {v13, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {v13, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    :cond_4
    move-object v8, v4

    move-wide/from16 v16, v10

    new-instance v4, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, p0

    :try_start_1
    invoke-direct {v3, v7}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getModelType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v14, v15}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setSize(J)V

    const/16 v5, 0x3e8

    int-to-long v5, v5

    div-long v5, v16, v5

    invoke-virtual {v4, v5, v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->setVideoLength(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_5
    move-object/from16 v3, p0

    :goto_6
    invoke-interface {v13}, Ljava/io/Closeable;->close()V

    goto :goto_8

    :goto_7
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v13, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    move-object/from16 v3, p0

    :goto_8
    if-eqz v4, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    move-object/from16 v3, p0

    return-object v1
.end method

.method public final getCachedFileFromUri(Landroid/content/Context;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/io/File;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentMetaData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelperKt;->access$getTitleWithExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/lang/String;

    move-result-object p2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "[getCachedFileFromUri] Failed to open input stream for URI: "

    invoke-static {v0, v4}, Lr80/c;->m(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v6, v5, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    :goto_1
    return-object v1

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-virtual {v1, p1, p2, v0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->writeFileInTimestampedCache(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    return-object p1
.end method

.method public final getFileAttachments(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mime_type IS NOT NULL AND mime_type != \'\'"

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getFilteredAttachments(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getMediaAttachments(Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "media_type=1 OR media_type=3"

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getFilteredAttachments(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final isUriResolvable$stream_chat_android_ui_common_release(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :catch_0
    :cond_0
    return v0
.end method
