.class public final Llive/hms/video/utils/HMSPermissionsChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llive/hms/video/utils/HMSPermissionsChecker;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "permission",
        "Ll83/a0;",
        "checkPermissionAndThrowError",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "",
        "Llive/hms/video/utils/CheckedPermissions;",
        "checkedPermissions",
        "Ljava/util/List;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final checkedPermissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/utils/CheckedPermissions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llive/hms/video/utils/CheckedPermissions;

    sget-object v1, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const-string v3, "microphone"

    const-string v4, "RECORD_AUDIO permission not received."

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantAccessCaptureDevice$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v3

    const-string v4, "android.permission.RECORD_AUDIO"

    invoke-direct {v0, v4, v3}, Llive/hms/video/utils/CheckedPermissions;-><init>(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    new-instance v10, Llive/hms/video/utils/CheckedPermissions;

    const-string v3, "camera"

    const-string v4, "CAMERA permission not received."

    invoke-static/range {v1 .. v9}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantAccessCaptureDevice$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v1

    const-string v2, "android.permission.CAMERA"

    invoke-direct {v10, v2, v1}, Llive/hms/video/utils/CheckedPermissions;-><init>(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    filled-new-array {v0, v10}, [Llive/hms/video/utils/CheckedPermissions;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/utils/HMSPermissionsChecker;->checkedPermissions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final checkPermissionAndThrowError(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permission"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/utils/HMSPermissionsChecker;->checkedPermissions:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Llive/hms/video/utils/CheckedPermissions;

    invoke-virtual {v2}, Llive/hms/video/utils/CheckedPermissions;->getPermission()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Llive/hms/video/utils/CheckedPermissions;

    invoke-virtual {v1}, Llive/hms/video/utils/CheckedPermissions;->getPermission()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ls4/l;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v1}, Llive/hms/video/utils/CheckedPermissions;->getErrorToThrow()Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1
.end method
