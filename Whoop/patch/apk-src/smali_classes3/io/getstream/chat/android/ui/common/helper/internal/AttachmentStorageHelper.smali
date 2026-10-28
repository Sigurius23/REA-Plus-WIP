.class public final Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ/\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J!\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00122\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J$\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00122\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0012H\u0086@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0012H\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J5\u0010!\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000e2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;",
        "storageHelper",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;",
        "attachmentFilter",
        "<init>",
        "(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;)V",
        "Ljava/io/File;",
        "file",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "Ll83/k;",
        "",
        "resolveLocalDimensions",
        "(Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "getFileMetadata",
        "()Ljava/util/List;",
        "getMediaMetadata",
        "metaData",
        "toAttachments",
        "(Ljava/util/List;)Ljava/util/List;",
        "attachments",
        "resolveAttachmentFiles",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "uris",
        "resolveMetadata",
        "metadata",
        "partitionResolvable",
        "(Ljava/util/List;)Ll83/k;",
        "Landroid/content/Context;",
        "Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;",
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;",
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

.field public static final Companion:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$Companion;

.field public static final EXTRA_SOURCE_URI:Ljava/lang/String; = "io.getstream.sourceUri"


# instance fields
.field private final attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

.field private final context:Landroid/content/Context;

.field private final logger$delegate:Ll83/h;

.field private final storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->Companion:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    .line 5
    const-string p1, "AttachmentStorageHelper"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    invoke-direct {p2}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 7
    new-instance p3, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;-><init>(Landroid/content/Context;Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;)V

    return-void
.end method

.method public static final synthetic access$getContext$p(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStorageHelper$p(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;)Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    return-object p0
.end method

.method public static final synthetic access$resolveLocalDimensions(Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->resolveLocalDimensions(Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final resolveLocalDimensions(Ljava/io/File;Lio/getstream/chat/android/models/Attachment;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/models/Attachment;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget p1, p2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iget p2, p2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    move-object v1, p2

    :cond_1
    new-instance p2, Ll83/k;

    invoke-direct {p2, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_2
    invoke-static {p2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p2

    if-eqz p2, :cond_7

    new-instance p2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    const/16 p1, 0x12

    invoke-virtual {p2, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_6

    :goto_1
    const/16 v0, 0x13

    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lez v2, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    const/16 v2, 0x18

    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    const/16 v3, 0x5a

    if-eq v2, v3, :cond_6

    const/16 v3, 0x10e

    if-eq v2, v3, :cond_6

    new-instance v2, Ll83/k;

    invoke-direct {v2, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_5

    :catch_0
    :try_start_1
    new-instance v2, Ll83/k;

    invoke-direct {v2, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_5
    return-object v2

    :goto_6
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V

    throw p1

    :cond_7
    new-instance p1, Ll83/k;

    invoke-direct {p1, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final getFileMetadata()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getFileAttachments(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->filterAttachments(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getMediaMetadata()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getMediaAttachments(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->filterAttachments(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final partitionResolvable(Ljava/util/List;)Ll83/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    invoke-virtual {v4, v5, v3}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->isUriResolvable$stream_chat_android_ui_common_release(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final resolveAttachmentFiles(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper$resolveAttachmentFiles$2;-><init>(Ljava/util/List;Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final resolveMetadata(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->storageHelper:Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->context:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelper;->getAttachmentsFromUriList(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentStorageHelper;->attachmentFilter:Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->filterAttachments(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final toAttachments(Ljava/util/List;)Ljava/util/List;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "metaData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    new-instance v3, Ln83/f;

    invoke-direct {v3}, Ln83/f;-><init>()V

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getExtraData()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "io.getstream.sourceUri"

    invoke-virtual {v3, v5, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getVideoLength()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getVideoLength()J

    move-result-wide v4

    long-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-string v5, "duration"

    invoke-virtual {v3, v5, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v26

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, ""

    :cond_2
    move-object/from16 v20, v3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getSize()J

    move-result-wide v3

    long-to-int v15, v3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object v14

    new-instance v6, Lio/getstream/chat/android/models/Attachment;

    const v27, 0x7d67f

    const/16 v28, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v6 .. v28}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    return-object v1
.end method
