.class public final Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "resolveFilesAccessState",
        "Lio/getstream/chat/android/ui/common/permissions/FilesAccess;",
        "context",
        "Landroid/content/Context;",
        "isAudioAccessGranted",
        "",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;->isAudioAccessGranted$lambda$0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final isAudioAccessGranted(Landroid/content/Context;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.READ_MEDIA_AUDIO"

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final isAudioAccessGranted$lambda$0(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final resolveFilesAccessState(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/permissions/FilesAccess;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->resolveVisualMediaAccessState(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;

    move-result-object v0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt;->isAudioAccessGranted(Landroid/content/Context;)Z

    move-result p0

    sget-object v1, Lio/getstream/chat/android/ui/common/permissions/FilesAccessKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    if-eqz p0, :cond_0

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0

    :cond_0
    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->DENIED:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    if-eqz p0, :cond_3

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO_AND_PARTIAL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0

    :cond_3
    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->PARTIAL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0

    :cond_4
    if-eqz p0, :cond_5

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->AUDIO_AND_FULL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0

    :cond_5
    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/FilesAccess;->FULL_VISUAL:Lio/getstream/chat/android/ui/common/permissions/FilesAccess;

    return-object p0
.end method
