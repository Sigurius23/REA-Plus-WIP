.class public final Lio/getstream/chat/android/ui/utils/PermissionChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000c0\tH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJY\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\'\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008!\u0010 J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\"\u0010 J5\u0010#\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008#\u0010$J5\u0010%\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008%\u0010$J5\u0010&\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000c0\t\u00a2\u0006\u0004\u0008&\u0010$J3\u0010\'\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0014\u00a2\u0006\u0004\u0008\'\u0010(J3\u0010)\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0014\u00a2\u0006\u0004\u0008)\u0010(J5\u0010*\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0014\u00a2\u0006\u0004\u0008*\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "",
        "<init>",
        "()V",
        "Landroid/view/View;",
        "view",
        "",
        "",
        "permissions",
        "Lkotlin/Function1;",
        "",
        "",
        "Ll83/a0;",
        "onPermissionResult",
        "checkStoragePermissions",
        "(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "dialogTitle",
        "dialogMessage",
        "snackbarMessage",
        "",
        "Lkotlin/Function0;",
        "onPermissionDenied",
        "onPermissionGranted",
        "checkPermissions",
        "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V",
        "Landroid/content/Context;",
        "context",
        "showPermissionRationaleDialog",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V",
        "showPermissionDeniedSnackbar",
        "(Landroid/view/View;Ljava/lang/String;)V",
        "isGrantedCameraPermissions",
        "(Landroid/content/Context;)Z",
        "isGrantedAudioRecordPermission",
        "isNeededToRequestForCameraPermissions",
        "checkVisualMediaPermissions",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "checkAudioPermissions",
        "checkFilesPermissions",
        "checkWriteStoragePermissions",
        "(Landroid/view/View;Lc93/a;Lc93/a;)V",
        "checkCameraPermissions",
        "checkAudioRecordPermissions",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcx/c;Ljava/util/List;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions$lambda$9(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcx/c;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/d;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions$lambda$1(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/d;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Lcx/d;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions$lambda$10(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Lcx/d;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic checkAudioRecordPermissions$default(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Lc93/a;Lc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    new-instance p2, Lou1/a;

    const/4 p5, 0x7

    invoke-direct {p2, p5}, Lou1/a;-><init>(I)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    new-instance p3, Lou1/a;

    const/4 p4, 0x7

    invoke-direct {p3, p4}, Lou1/a;-><init>(I)V

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkAudioRecordPermissions(Landroid/view/View;Lc93/a;Lc93/a;)V

    return-void
.end method

.method private static final checkAudioRecordPermissions$lambda$7()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final checkAudioRecordPermissions$lambda$8()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic checkCameraPermissions$default(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Lc93/a;Lc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    new-instance p2, Lou1/a;

    const/4 p4, 0x7

    invoke-direct {p2, p4}, Lou1/a;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkCameraPermissions(Landroid/view/View;Lc93/a;Lc93/a;)V

    return-void
.end method

.method private static final checkCameraPermissions$lambda$6()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final checkPermissions(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->getActivity(Landroid/view/View;)Landroidx/fragment/app/r0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lzd3/x;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lzd3/x;->w:Ljava/lang/Object;

    invoke-virtual {v1, p5}, Lzd3/x;->p(Ljava/util/List;)Lcx/k;

    move-result-object p5

    new-instance v0, Lio/getstream/chat/android/ui/utils/a;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p5, Lcx/k;->m:Lax/a;

    new-instance p1, Lbc/i;

    const/4 p2, 0x5

    invoke-direct {p1, p0, v2, p4, p2}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object p1, p5, Lcx/k;->n:Lax/b;

    new-instance p1, Lbs2/e;

    invoke-direct {p1, p7, p6}, Lbs2/e;-><init>(Lc93/a;Lc93/a;)V

    invoke-virtual {p5, p1}, Lcx/k;->e(Lax/c;)V

    return-void
.end method

.method private static final checkPermissions$lambda$10(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Lcx/d;Ljava/util/List;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionDeniedSnackbar(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method private static final checkPermissions$lambda$11(Lc93/a;Lc93/a;ZLjava/util/List;Ljava/util/List;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final checkPermissions$lambda$9(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcx/c;Ljava/util/List;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p4, "getContext(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionRationaleDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final checkStoragePermissions(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "[",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->getActivity(Landroid/view/View;)Landroidx/fragment/app/r0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lzd3/x;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lzd3/x;->w:Ljava/lang/Object;

    invoke-static {p2}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Lzd3/x;->p(Ljava/util/List;)Lcx/k;

    move-result-object p2

    new-instance v0, Lio/getstream/chat/android/ui/utils/d;

    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/utils/d;-><init>(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;)V

    iput-object v0, p2, Lcx/k;->m:Lax/a;

    new-instance v0, Lio/getstream/chat/android/ui/utils/d;

    invoke-direct {v0, p1, p0}, Lio/getstream/chat/android/ui/utils/d;-><init>(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;)V

    iput-object v0, p2, Lcx/k;->n:Lax/b;

    new-instance p1, Lcom/mapbox/common/location/a;

    const/4 v0, 0x7

    invoke-direct {p1, p3, v0}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p2, p1}, Lcx/k;->e(Lax/c;)V

    return-void
.end method

.method private static final checkStoragePermissions$lambda$0(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/c;Ljava/util/List;)V
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_storage_title:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_storage_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string p3, "getContext(...)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, p2, v0}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionRationaleDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final checkStoragePermissions$lambda$1(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/d;Ljava/util/List;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_setting_message:I

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "getString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionDeniedSnackbar(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method private static final checkStoragePermissions$lambda$4(Lkotlin/jvm/functions/Function1;ZLjava/util/List;Ljava/util/List;)V
    .locals 4

    const-string p1, "granted"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "denied"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/LinkedHashMap;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-direct {p1, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-static {p3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    if-ge v0, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    invoke-direct {p2, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic checkWriteStoragePermissions$default(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Lc93/a;Lc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    new-instance p2, Lou1/a;

    const/4 p4, 0x7

    invoke-direct {p2, p4}, Lou1/a;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkWriteStoragePermissions(Landroid/view/View;Lc93/a;Lc93/a;)V

    return-void
.end method

.method private static final checkWriteStoragePermissions$lambda$5()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Lc93/a;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions$lambda$11(Lc93/a;Lc93/a;ZLjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic e(Lmr/n;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->showPermissionDeniedSnackbar$lambda$14$lambda$13(Lmr/n;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/c;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions$lambda$0(Landroid/view/View;Lio/getstream/chat/android/ui/utils/PermissionChecker;Lcx/c;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions$lambda$4(Lkotlin/jvm/functions/Function1;ZLjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private final showPermissionDeniedSnackbar(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lmr/n;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lmr/n;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permissions_setting_button:I

    new-instance v0, Lio/getstream/chat/android/ui/utils/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/utils/b;-><init>(Lmr/n;I)V

    invoke-virtual {p1, p2, v0}, Lmr/n;->i(ILandroid/view/View$OnClickListener;)V

    new-instance p2, Lio/getstream/chat/android/ui/utils/PermissionChecker$showPermissionDeniedSnackbar$1$2;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lmr/l;->u:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lmr/l;->u:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p1, Lmr/l;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lmr/n;->j()V

    return-void
.end method

.method private static final showPermissionDeniedSnackbar$lambda$14$lambda$13(Lmr/n;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lmr/l;->h:Landroid/content/Context;

    const-string p1, "getContext(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/ContextUtilsKt;->openSystemSettings(Landroid/content/Context;)V

    return-void
.end method

.method private final showPermissionRationaleDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lm/i;

    invoke-direct {v0, p1}, Lm/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Lm/i;->setTitle(Ljava/lang/CharSequence;)Lm/i;

    move-result-object p1

    iget-object p2, p1, Lm/i;->a:Lm/e;

    iput-object p3, p2, Lm/e;->f:Ljava/lang/CharSequence;

    new-instance p2, Lio/getstream/chat/android/ui/utils/c;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    const p3, 0x104000a

    invoke-virtual {p1, p3, p2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    return-void
.end method

.method private static final showPermissionRationaleDialog$lambda$12(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method


# virtual methods
.method public final checkAudioPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/permissions/Permissions;->INSTANCE:Lio/getstream/chat/android/ui/common/permissions/Permissions;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/permissions/Permissions;->audioPermissions()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final checkAudioRecordPermissions(Landroid/view/View;Lc93/a;Lc93/a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionDenied"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionGranted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_audio_record_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_audio_record_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_audio_record_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V

    return-void
.end method

.method public final checkCameraPermissions(Landroid/view/View;Lc93/a;Lc93/a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionDenied"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionGranted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_camera_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_camera_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_camera_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.CAMERA"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V

    return-void
.end method

.method public final checkFilesPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/permissions/Permissions;->INSTANCE:Lio/getstream/chat/android/ui/common/permissions/Permissions;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/permissions/Permissions;->filesPermissions()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final checkVisualMediaPermissions(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/permissions/Permissions;->INSTANCE:Lio/getstream/chat/android/ui/common/permissions/Permissions;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/permissions/Permissions;->visualMediaPermissions()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkStoragePermissions(Landroid/view/View;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final checkWriteStoragePermissions(Landroid/view/View;Lc93/a;Lc93/a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionDenied"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPermissionGranted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_storage_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "getString(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_storage_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_composer_permission_setting_message:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkPermissions(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc93/a;Lc93/a;)V

    return-void
.end method

.method public final isGrantedAudioRecordPermission(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isGrantedCameraPermissions(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isNeededToRequestForCameraPermissions(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/utils/ContextUtilsKt;->isPermissionDeclared(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->isGrantedCameraPermissions(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
