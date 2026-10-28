.class public final Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "resolveVisualMediaAccessState",
        "Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;",
        "context",
        "Landroid/content/Context;",
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

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->resolveVisualMediaAccessState$lambda$0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final resolveVisualMediaAccessState(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const-string v1, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {p0, v1}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.READ_MEDIA_VIDEO"

    invoke-static {p0, v1}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;->FULL:Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;

    return-object p0

    :cond_0
    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    const-string v0, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;->PARTIAL:Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;

    return-object p0

    :cond_1
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccessKt;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;->FULL:Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;

    return-object p0

    :cond_2
    sget-object p0, Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;->DENIED:Lio/getstream/chat/android/ui/common/permissions/VisualMediaAccess;

    return-object p0
.end method

.method private static final resolveVisualMediaAccessState$lambda$0(Landroid/content/Context;Ljava/lang/String;)Z
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
