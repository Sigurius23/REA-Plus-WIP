.class public final Lio/getstream/chat/android/ui/common/permissions/Permissions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0002\u0010\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u000fH\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/permissions/Permissions;",
        "",
        "<init>",
        "()V",
        "visualMediaPermissions",
        "",
        "",
        "()[Ljava/lang/String;",
        "audioPermissions",
        "filesPermissions",
        "isPermanentlyDenied",
        "",
        "context",
        "Landroid/content/Context;",
        "grantResults",
        "",
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
.field public static final $stable:I

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/permissions/Permissions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/permissions/Permissions;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/permissions/Permissions;->INSTANCE:Lio/getstream/chat/android/ui/common/permissions/Permissions;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final audioPermissions()[Ljava/lang/String;
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v0, v1, :cond_0

    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "android.permission.READ_MEDIA_AUDIO"

    aput-object v1, v0, v2

    return-object v0

    :cond_0
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final filesPermissions()[Ljava/lang/String;
    .locals 9
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const-string v2, "android.permission.READ_MEDIA_AUDIO"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, "android.permission.READ_MEDIA_VIDEO"

    const-string v6, "android.permission.READ_MEDIA_IMAGES"

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    aput-object v6, v0, v8

    aput-object v5, v0, v7

    const-string v1, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    aput-object v1, v0, v4

    aput-object v2, v0, v3

    return-object v0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-array v0, v3, [Ljava/lang/String;

    aput-object v6, v0, v8

    aput-object v5, v0, v7

    aput-object v2, v0, v4

    return-object v0

    :cond_1
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    aput-object v1, v0, v8

    return-object v0
.end method

.method public final isPermanentlyDenied(Landroid/content/Context;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1, v3}, Landroidx/core/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    return v0

    :cond_4
    return v2
.end method

.method public final visualMediaPermissions()[Ljava/lang/String;
    .locals 7
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x2

    const-string v3, "android.permission.READ_MEDIA_VIDEO"

    const-string v4, "android.permission.READ_MEDIA_IMAGES"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    aput-object v4, v0, v6

    aput-object v3, v0, v5

    const-string v1, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"

    aput-object v1, v0, v2

    return-object v0

    :cond_0
    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    new-array v0, v2, [Ljava/lang/String;

    aput-object v4, v0, v6

    aput-object v3, v0, v5

    return-object v0

    :cond_1
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    aput-object v1, v0, v6

    return-object v0
.end method
