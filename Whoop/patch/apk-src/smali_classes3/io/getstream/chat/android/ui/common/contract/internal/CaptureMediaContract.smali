.class public final Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;,
        Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001.B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J-\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\u0008\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010%R.\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\'\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008(\u0010)R.\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\'\u0012\u0004\u0008-\u0010+\u001a\u0004\u0008,\u0010)\u00a8\u0006/"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;",
        "Lk/b;",
        "Ll83/a0;",
        "Ljava/io/File;",
        "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;",
        "mode",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "fileManager",
        "pictureFile",
        "videoFile",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;)V",
        "Landroid/content/Context;",
        "context",
        "",
        "Landroid/content/Intent;",
        "getRecordVideoIntents",
        "(Landroid/content/Context;)Ljava/util/List;",
        "getTakePictureIntents",
        "",
        "action",
        "destinationFile",
        "createIntentList",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;",
        "intents",
        "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/util/List;",
        "label",
        "(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/lang/String;",
        "input",
        "createIntent",
        "(Landroid/content/Context;Ll83/a0;)Landroid/content/Intent;",
        "",
        "resultCode",
        "intent",
        "parseResult",
        "(ILandroid/content/Intent;)Ljava/io/File;",
        "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "value",
        "Ljava/io/File;",
        "getPictureFile",
        "()Ljava/io/File;",
        "getPictureFile$annotations",
        "()V",
        "getVideoFile",
        "getVideoFile$annotations",
        "Mode",
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
.field private final fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

.field private final mode:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

.field private pictureFile:Ljava/io/File;

.field private videoFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->mode:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->pictureFile:Ljava/io/File;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->videoFile:Ljava/io/File;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    .line 7
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;-><init>(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Lio/getstream/chat/android/client/internal/file/StreamFileManager;Ljava/io/File;Ljava/io/File;)V

    return-void
.end method

.method private final createIntentList(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p1, p3}, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;->getUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/high16 p2, 0x10000

    invoke-virtual {p1, v0, p2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    const-string p2, "queryIntentActivities(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const-string v3, "output"

    invoke-virtual {v2, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v3, v5, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public static synthetic getPictureFile$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method private final getRecordVideoIntents(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createVideoInExternalDir(Landroid/content/Context;)Ln23/h;

    move-result-object v0

    invoke-virtual {v0}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->videoFile:Ljava/io/File;

    if-eqz v0, :cond_0

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {p0, p1, v1, v0}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->createIntentList(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method private final getTakePictureIntents(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createPhotoInExternalDir(Landroid/content/Context;)Ln23/h;

    move-result-object v0

    invoke-virtual {v0}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->pictureFile:Ljava/io/File;

    if-eqz v0, :cond_0

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p0, p1, v1, v0}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->createIntentList(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public static synthetic getVideoFile$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method private final intents(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->getTakePictureIntents(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->getRecordVideoIntents(Landroid/content/Context;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->getRecordVideoIntents(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->getTakePictureIntents(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final label(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget p1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_capture_media:I

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget p1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_capture_media_video:I

    goto :goto_0

    :cond_2
    sget p1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_capture_media_take_photo:I

    :goto_0
    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 1
    check-cast p2, Ll83/a0;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->createIntent(Landroid/content/Context;Ll83/a0;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public final createIntent(Landroid/content/Context;Ll83/a0;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->mode:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->intents(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/util/List;

    move-result-object p2

    .line 3
    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Intent;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->mode:Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;

    invoke-direct {p0, v1, p1}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->label(Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract$Mode;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    .line 5
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, v0}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Landroid/content/Intent;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/os/Parcelable;

    .line 7
    const-string v0, "android.intent.extra.INITIAL_INTENTS"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object p1
.end method

.method public final getPictureFile()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->pictureFile:Ljava/io/File;

    return-object v0
.end method

.method public final getVideoFile()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->videoFile:Ljava/io/File;

    return-object v0
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/io/File;
    .locals 1

    .line 2
    iget-object p2, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->pictureFile:Ljava/io/File;

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContractKt;->access$takeIfCaptured(Ljava/io/File;)Ljava/io/File;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->videoFile:Ljava/io/File;

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContractKt;->access$takeIfCaptured(Ljava/io/File;)Ljava/io/File;

    move-result-object p2

    :cond_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/contract/internal/CaptureMediaContract;->parseResult(ILandroid/content/Intent;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
