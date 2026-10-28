.class public final Lcom/whoop/service/push/notifications/g;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 )2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/g;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lwe1/a;",
        "entitlementChecker",
        "Lyp0/a;",
        "communityAccessChecker",
        "<init>",
        "(Lo92/s;Lwe1/a;Lyp0/a;)V",
        "Landroid/content/Context;",
        "context",
        "",
        "inviteId",
        "",
        "sourceId",
        "sendingUserId",
        "receivingUserId",
        "Landroid/app/PendingIntent;",
        "B",
        "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;",
        "C",
        "(Landroid/content/Context;)Landroid/app/PendingIntent;",
        "Lm92/f;",
        "dataMap",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwe1/a;",
        "J",
        "Lyp0/a;",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "",
        "D",
        "()Z",
        "isBeDrivenCommunityEnabled",
        "L",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final L:Lcom/whoop/service/push/notifications/g$a;

.field public static final M:I

.field private static final N:Lc12/d;


# instance fields
.field private final I:Lwe1/a;

.field private final J:Lyp0/a;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/g;->L:Lcom/whoop/service/push/notifications/g$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/g;->M:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06550_Communities"

    sget v2, Lhi0/j;->x0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->w0:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/service/push/notifications/g;->N:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwe1/a;Lyp0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityAccessChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lcom/whoop/service/push/notifications/g;->I:Lwe1/a;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/g;->J:Lyp0/a;

    const-string p1, "FollowerInvitePushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/g;->K:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/service/push/notifications/g;->N:Lc12/d;

    return-object v0
.end method

.method private final B(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "followers-service/v1/followers-home"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "?inviteId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_0

    invoke-static {p3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "&sourceId="

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "path"

    invoke-virtual {p3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    const-string p3, "method"

    const-string v0, "GET"

    invoke-virtual {p2, p3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "toString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "request"

    invoke-virtual {p3, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "selectedTab"

    const-string v0, "COMMUNITY"

    invoke-virtual {p3, p2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "open_community_request_push"

    invoke-static {p2, p4, p5}, Lo92/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p4, "onStartInteraction"

    invoke-virtual {p3, p4, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget p2, Lhi0/e;->g5:I

    invoke-static {p1, p2}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1, p3}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private final C(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 1

    invoke-virtual {p0, p1}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p1

    sget v0, Lhi0/e;->D2:I

    invoke-static {p1, v0}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {p1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private final D()Z
    .locals 3

    sget-object v0, Lm92/d;->a:Lm92/d;

    invoke-virtual {p0}, Lm92/b;->g()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/service/push/notifications/g;->I:Lwe1/a;

    invoke-virtual {v0, v1, v2}, Lm92/d;->a(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)Z

    move-result v0

    return v0
.end method

.method public static final synthetic z(Lcom/whoop/service/push/notifications/g;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 11

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "title"

    invoke-virtual {p0, p1, v3}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v3, "body"

    invoke-virtual {p0, p1, v3}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "invite_id"

    invoke-virtual {p0, p1, v3}, Lm92/b;->j(Lm92/f;Ljava/lang/String;)I

    move-result v3

    iget-object v4, p0, Lcom/whoop/service/push/notifications/g;->J:Lyp0/a;

    invoke-interface {v4}, Lyp0/a;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v3, Ld92/b;->a:Ld92/b;

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v4

    invoke-virtual {v3, v4}, Ld92/b;->b(Leb/j0;)Landroid/app/PendingIntent;

    move-result-object v3

    :goto_0
    move-object v2, v0

    move-object v10, v3

    goto :goto_1

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    invoke-direct {p0}, Lcom/whoop/service/push/notifications/g;->D()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Lm92/f;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, "sending_user_id"

    invoke-virtual {p1, v5}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "receiving_user_id"

    invoke-virtual {p1, v6}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Lcom/whoop/service/push/notifications/g;->B(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2}, Lcom/whoop/service/push/notifications/g;->C(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v3

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/high16 v3, 0x8000000

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v0

    const/16 v1, 0x7c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    new-instance v4, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v4, v7}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v3, "setDeleteIntent(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/whoop/service/push/notifications/g;->N:Lc12/d;

    invoke-virtual {v3, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    const-string v0, "build(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v8

    const/16 v8, 0x20

    const/4 v9, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    move-object v4, p2

    move v2, v1

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Failed to build or show FollowerInvite notification"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v0

    new-instance v2, Lcom/whoop/service/push/notifications/g$b;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Lcom/whoop/service/push/notifications/g$b;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/g;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v0, v3, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/g;->K:Ljava/lang/String;

    return-object v0
.end method
