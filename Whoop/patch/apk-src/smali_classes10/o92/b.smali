.class public final Lo92/b;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo92/b;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lo92/s;Lwm0/a;Lzr2/a;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwm0/a;",
        "J",
        "Lzr2/a;",
        "",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
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
.field public static final L:Lo92/b$a;

.field public static final M:I


# instance fields
.field private final I:Lwm0/a;

.field private final J:Lzr2/a;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo92/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/b;->L:Lo92/b$a;

    const/16 v0, 0x8

    sput v0, Lo92/b;->M:I

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwm0/a;Lzr2/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/b;->I:Lwm0/a;

    iput-object p3, p0, Lo92/b;->J:Lzr2/a;

    const-string p1, "AutoDetectedSleepPushNotification"

    iput-object p1, p0, Lo92/b;->K:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic z(Lo92/b;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/b;->I:Lwm0/a;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 12

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pillar"

    invoke-virtual {p1, v0}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "sleep"

    :cond_0
    const-string v2, "date"

    invoke-virtual {p1, v2}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lo92/b;->J:Lzr2/a;

    invoke-interface {v3}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "toString(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    const-string v5, "source"

    invoke-virtual {p1, v5}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    const-string v6, ""

    :cond_2
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v7

    new-instance v8, Lo92/b$b;

    const/4 v9, 0x0

    invoke-direct {v8, p0, v9}, Lo92/b$b;-><init>(Lo92/b;Lq83/d;)V

    const/4 v10, 0x3

    invoke-static {v7, v9, v9, v8, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v7, 0x0

    :try_start_0
    const-string v8, "collapse_key"

    invoke-virtual {p0, p1, v8}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v9, Lc12/a;->a:Lc12/a;

    invoke-virtual {v9, v8}, Lc12/a;->a(Ljava/lang/String;)I

    move-result v8

    const-string v9, "title"

    invoke-virtual {p1, v9}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "getString(...)"

    if-nez v9, :cond_3

    sget v9, Lhi0/j;->f:I

    invoke-virtual {p2, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    const-string v11, "body"

    invoke-virtual {p1, v11}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    sget p1, Lhi0/j;->e:I

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {p0, p2, v10}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v10

    invoke-virtual {v10, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v10

    const-string v11, "setContentText(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lo92/a;->M:Lc12/d;

    invoke-virtual {v11, v10}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v0, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v1

    sget v2, Lhi0/e;->y1:I

    invoke-static {v1, v2}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v1, v0}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v1

    const-string v2, "got sleep intent"

    new-array v3, v7, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v10, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    new-instance v1, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v1, v9}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v10}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    const-string v0, "build(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move v2, v8

    const/16 v8, 0x20

    move-object v5, v9

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v6, p1

    move-object v4, p2

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to get collapse key for AutoDetectedSleepPushNotification: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    throw p1
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/b;->K:Ljava/lang/String;

    return-object v0
.end method
