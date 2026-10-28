.class public final Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J!\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;",
        "",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "attachment",
        "",
        "",
        "allowedFileExtensions",
        "",
        "allowedMimeTypes",
        "blockedFileExtensions",
        "blockedMimeTypes",
        "",
        "matchesUploadConfig",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;)Z",
        "fileExtensions",
        "mimeTypes",
        "matchesFileExtensionOrMimeType",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;)Z",
        "matchesMimeType",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;[Ljava/lang/String;)Z",
        "matchesFileExtension",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;)Z",
        "attachments",
        "filterAttachments",
        "(Ljava/util/List;)Ljava/util/List;",
        "getSupportedMimeTypes",
        "()Ljava/util/List;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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


# instance fields
.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;-><init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;)V
    .locals 1

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    const-string p1, "AttachmentFilter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 5
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;-><init>(Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final matchesFileExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-static {v2, v0, v3}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    return v3

    :cond_3
    return v1
.end method

.method private final matchesFileExtensionOrMimeType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->matchesFileExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->matchesMimeType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final matchesMimeType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;[Ljava/lang/String;)Z
    .locals 0

    :try_start_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ls4/i;->n(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final matchesUploadConfig(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    array-length v0, p3

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v2

    :goto_2
    move-object v3, p4

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    array-length v3, p5

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    move v3, v1

    goto :goto_5

    :cond_5
    :goto_4
    move v3, v2

    :goto_5
    if-eqz v0, :cond_6

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->matchesFileExtensionOrMimeType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_6
    if-eqz v3, :cond_8

    invoke-direct {p0, p1, p4, p5}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->matchesFileExtensionOrMimeType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v1

    :cond_8
    return v2
.end method


# virtual methods
.method public final filterAttachments(Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "attachments"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/App;->getFileUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedFileExtensions()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedMimeTypes()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/String;

    invoke-interface {v3, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, [Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedFileExtensions()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedMimeTypes()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    new-array v3, v4, [Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, [Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/App;->getImageUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedFileExtensions()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedMimeTypes()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    new-array v5, v4, [Ljava/lang/String;

    invoke-interface {v3, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, [Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedFileExtensions()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedMimeTypes()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    new-array v3, v4, [Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, [Ljava/lang/String;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    move-object v1, v2

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "image"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    move-object v4, v2

    if-eqz v3, :cond_0

    move-object v2, v10

    goto :goto_1

    :cond_0
    move-object v2, v6

    :goto_1
    move v5, v3

    if-eqz v3, :cond_1

    move-object v3, v11

    goto :goto_2

    :cond_1
    move-object v3, v7

    :goto_2
    move-object/from16 v16, v4

    if-eqz v5, :cond_2

    move-object v4, v12

    goto :goto_3

    :cond_2
    move-object v4, v8

    :goto_3
    if-eqz v5, :cond_3

    move-object v5, v13

    :goto_4
    move-object/from16 v17, v6

    move-object/from16 v6, v16

    goto :goto_5

    :cond_3
    move-object v5, v9

    goto :goto_4

    :goto_5
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->matchesUploadConfig(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Ljava/util/List;[Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v14, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v6, v17

    goto :goto_0

    :cond_5
    return-object v14
.end method

.method public final getSupportedMimeTypes()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "*/*"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/App;->getFileUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient;->getAppSettings()Lio/getstream/chat/android/models/AppSettings;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/AppSettings;->getApp()Lio/getstream/chat/android/models/App;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/App;->getImageUploadConfig()Lio/getstream/chat/android/models/FileUploadConfig;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedMimeTypes()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/String;

    invoke-interface {v3, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getAllowedMimeTypes()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    new-array v6, v4, [Ljava/lang/String;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/String;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedMimeTypes()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-array v6, v4, [Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/FileUploadConfig;->getBlockedMimeTypes()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    new-array v6, v4, [Ljava/lang/String;

    invoke-interface {v2, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    invoke-static {v3, v5}, Lm83/n;->H0([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-static {v1, v2}, Lm83/n;->H0([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v3

    :goto_0
    if-ge v4, v5, :cond_1

    aget-object v6, v3, v4

    invoke-static {v1, v6}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/helper/internal/AttachmentFilter;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Supported MIME types: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v1, v5, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
