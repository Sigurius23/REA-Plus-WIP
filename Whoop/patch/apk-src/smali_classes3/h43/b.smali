.class public final Lh43/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le43/h;


# static fields
.field public static final E:Lg73/d;

.field public static final F:Ll83/p;

.field public static G:Lh43/b;


# instance fields
.field public w:Lbc3/c0;

.field public final x:Le43/g;

.field public y:Lio/getstream/android/video/generated/apis/ProductvideoApi;

.field public final synthetic z:Le43/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg73/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    sput-object v0, Lh43/b;->E:Lg73/d;

    const-string v1, "StreamVideo:Notifications"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lh43/b;->F:Ll83/p;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Le43/g;Lio/getstream/android/video/generated/apis/ProductvideoApi;Lp43/b;La13/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh43/b;->w:Lbc3/c0;

    iput-object p2, p0, Lh43/b;->x:Le43/g;

    iput-object p3, p0, Lh43/b;->y:Lio/getstream/android/video/generated/apis/ProductvideoApi;

    iget-object p1, p2, Le43/g;->c:Le43/h;

    iput-object p1, p0, Lh43/b;->z:Le43/h;

    return-void
.end method


# virtual methods
.method public final a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2, p3, p4}, Lg43/p;->a(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2, p3}, Lg43/o;->b(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final c()Ld1/j;
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, Le43/h;->c()Ld1/j;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lt23/c0;Ln43/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2}, Lg43/r;->e(Lt23/c0;Ln43/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2, p3}, Lg43/o;->f(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;
    .locals 6

    sget-object v5, Lm83/z;->w:Lm83/z;

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lg43/p;->g(Lt23/d3;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;ZLjava/util/Map;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2, p3}, Lg43/o;->h(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callDisplayName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2, p3}, Lg43/o;->i(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0, p1, p2}, Lg43/p;->j(Ljava/lang/String;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public final onPermissionDenied()V
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, La13/c;->onPermissionDenied()V

    return-void
.end method

.method public final onPermissionGranted()V
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, La13/c;->onPermissionGranted()V

    return-void
.end method

.method public final onPermissionRationale()V
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, La13/c;->onPermissionRationale()V

    return-void
.end method

.method public final onPermissionRequested()V
    .locals 1

    iget-object v0, p0, Lh43/b;->z:Le43/h;

    invoke-interface {v0}, La13/c;->onPermissionRequested()V

    return-void
.end method
