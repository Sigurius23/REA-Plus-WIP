.class public final Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000B\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;",
        "<init>",
        "()V",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:Ll83/p;

.field public final b:Lhc3/d;

.field public final c:Ll83/p;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-string v0, "Call:ActionableReceiver"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a:Ll83/p;

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->b:Lhc3/d;

    const-string v0, "Call:LeaveReceiver"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->c:Ll83/p;

    const-string v0, "io.getstream.video.android.action.LEAVE_CALL"

    iput-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final b(Lt23/c0;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v2, p1, Lt23/c0;->c:Ljava/lang/String;

    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    const-string v6, "[onReceive] #ringing; callId: "

    const-string v7, ", action: "

    invoke-static {v6, v2, v7, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v1, v3, v4, p3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p3, p1, Lt23/c0;->p:Lt23/s0;

    iget-object p3, p3, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {p3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    sget-object v1, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    iget-object v2, p1, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/video/android/model/StreamCallId;->hashCode()I

    move-result v1

    new-instance v2, Lt23/h0;

    sget-object v4, Lt23/d4;->y:Lt23/d4;

    const-string v6, "User left from notification action"

    invoke-direct {v2, v4, v6}, Lt23/h0;-><init>(Lt23/d4;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lt23/c0;->p(Lt23/i0;)V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[onReceive], notificationId: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", legacyNotificationId: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v3, v2, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-static {p2}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p1

    const-string p2, "from(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    :cond_2
    invoke-virtual {p1, v1}, Landroidx/core/app/NotificationManagerCompat;->cancel(I)V

    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v7, "[onReceive] #ringing; context: "

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", intent: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v6, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->d:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "io.getstream.video.android.intent-extra.call_cid"

    const-class v3, Lio/getstream/video/android/model/StreamCallId;

    invoke-static {p2, v0, v3}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    move-result-object v6

    if-eqz v3, :cond_2

    new-instance v0, La30/s;

    const/4 v7, 0x0

    const/4 v8, 0x4

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v8}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    iget-object v3, p0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->b:Lhc3/d;

    invoke-static {v3, v9, v9, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a()Lb23/k;

    move-result-object v0

    new-instance v3, La3/z0;

    const/16 v4, 0xd

    const-string v5, "Stream call ID is not provided."

    invoke-direct {v3, v4, v2, v5}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v3}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v5, v4, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onReceive] #ringing; Context or Intent or Action is null."

    invoke-interface {v0, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    return-void
.end method
