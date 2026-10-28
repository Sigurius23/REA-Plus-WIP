.class public final Lh43/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le43/h;


# static fields
.field public static final w:Lh43/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh43/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh43/a;->w:Lh43/a;

    return-void
.end method


# virtual methods
.method public final a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 0

    const-string p2, "callId"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "payload"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callDisplayName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "payload"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final c()Ld1/j;
    .locals 2

    const-string v0, "null cannot be cast to non-null type io.getstream.video.android.core.notifications.dispatchers.NotificationDispatcher"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final e(Lt23/c0;Ln43/d;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callDisplayName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "payload"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callDisplayName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "payload"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callDisplayName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "payload"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onPermissionDenied()V
    .locals 0

    return-void
.end method

.method public final onPermissionGranted()V
    .locals 0

    return-void
.end method

.method public final onPermissionRationale()V
    .locals 0

    return-void
.end method

.method public final onPermissionRequested()V
    .locals 0

    return-void
.end method
