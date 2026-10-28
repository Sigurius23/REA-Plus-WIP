.class public final Lcom/whoop/service/push/notifications/b;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0018B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/b;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Ldp0/g;",
        "globalCoachManager",
        "Liy1/c;",
        "metricWriter",
        "Lhj0/d;",
        "appLifecycle",
        "<init>",
        "(Lo92/s;Ldp0/g;Liy1/c;Lhj0/d;)V",
        "",
        "destinationJson",
        "",
        "B",
        "(Ljava/lang/String;)Z",
        "A",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Ldp0/g;",
        "J",
        "Liy1/c;",
        "K",
        "Lhj0/d;",
        "L",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "M",
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
.field public static final M:Lcom/whoop/service/push/notifications/b$a;

.field public static final N:I

.field private static final O:Lc12/d;


# instance fields
.field private final I:Ldp0/g;

.field private final J:Liy1/c;

.field private final K:Lhj0/d;

.field private final L:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/b;->M:Lcom/whoop/service/push/notifications/b$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/b;->N:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06690_WhoopCoach"

    sget v2, Lhi0/j;->F0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->F0:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/service/push/notifications/b;->O:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Ldp0/g;Liy1/c;Lhj0/d;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalCoachManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appLifecycle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lcom/whoop/service/push/notifications/b;->I:Ldp0/g;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/b;->J:Liy1/c;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/b;->K:Lhj0/d;

    const-string p1, "AiAgentPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/b;->L:Ljava/lang/String;

    return-void
.end method

.method private final A(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "parameters"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "ai_action"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "fingerprint"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    return-object v0

    :goto_0
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to parse ai_action fingerprint from AI_AGENT_MESSAGE push"

    invoke-interface {v1, v3, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v0
.end method

.method private final B(Ljava/lang/String;)Z
    .locals 7

    invoke-virtual {p0}, Lm92/b;->g()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v1, "android-suppress-foreground-chat-push-in-active-conversation"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const-string v0, "Suppression skipped: feature flag off"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/push/notifications/b;->K:Lhj0/d;

    invoke-virtual {v0}, Lhj0/d;->d()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const-string v0, "Suppression skipped: app backgrounded"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_1
    iget-object v0, p0, Lcom/whoop/service/push/notifications/b;->I:Ldp0/g;

    invoke-interface {v0}, Ldp0/g;->getState()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lep0/d;

    invoke-virtual {v0}, Lep0/d;->f()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const-string v0, "Suppression skipped: coach sheet not visible"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_2
    invoke-virtual {v0}, Lep0/d;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const-string v0, "Suppression skipped: open conversation has no fingerprint yet"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lcom/whoop/service/push/notifications/b;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const-string v0, "Suppression skipped: push carries no ai_action.fingerprint"

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v3

    const-string v4, " open="

    const-string v5, " match="

    const-string v6, "Suppression fingerprint check: push="

    invoke-static {v6, p1, v4, v0, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {v3, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v2
.end method

.method public static final synthetic z()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/service/push/notifications/b;->O:Lc12/d;

    return-object v0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 13

    move-object v3, p2

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    :try_start_0
    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "AI_AGENT_MESSAGE"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "title"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "body"

    invoke-virtual {p0, p1, v2}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v2, "destination"

    invoke-virtual {p0, p1, v2}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/whoop/service/push/notifications/b;->B(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v0

    const-string v2, "Suppressing AI_AGENT_MESSAGE push: coach sheet already open on the matching conversation"

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/service/push/notifications/b;->J:Liy1/c;

    new-instance v2, Ljy1/a;

    const-string v4, "push.aiagentmessage.suppressed"

    sget-object v6, Lm83/y;->w:Lm83/y;

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Liy1/c;->b(Ljy1/a;)V

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_0
    sget-object v5, Lm92/g;->a:Lm92/g;

    invoke-virtual {v5, v2}, Lm92/g;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v5, p2, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "android.intent.action.VIEW"

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v5, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 v2, 0xc000000

    const/16 v11, 0x72

    invoke-static {p2, v11, v5, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v12

    sget-object v2, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/high16 v5, 0x8000000

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0, p2, v4}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v12}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    new-instance v5, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v5, v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroidx/core/app/NotificationCompat$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const-string v4, "setDeleteIntent(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/whoop/service/push/notifications/b;->O:Lc12/d;

    invoke-virtual {v4, v2}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    const-string v4, "build(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    move-object v6, v9

    const/4 v9, 0x0

    move-object v3, v2

    const/16 v2, 0x72

    const/4 v7, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, v0

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance v0, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v1, "Unrecognized notification type sent to CoachEverywherePushNotification"

    invoke-direct {v0, p1, v1}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v1

    const-string v2, "Coach Everywhere notification failed"

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v1, "Unable to parse pushDataMap within CoachEverywherePushNotification"

    invoke-direct {v0, p1, v1}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/b;->L:Ljava/lang/String;

    return-object v0
.end method
