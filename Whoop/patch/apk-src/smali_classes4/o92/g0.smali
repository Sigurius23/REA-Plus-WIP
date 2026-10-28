.class public final Lo92/g0;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lo92/g0;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "",
        "logTag",
        "<init>",
        "(Lo92/s;Ljava/lang/String;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "J",
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
.field public static final J:Lo92/g0$a;

.field public static final K:I

.field private static final L:Lc12/d;


# instance fields
.field private final I:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo92/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/g0;->J:Lo92/g0$a;

    const/16 v0, 0x8

    sput v0, Lo92/g0;->K:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "07700_Streaks"

    sget v2, Lhi0/j;->C0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->C0:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo92/g0;->L:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Ljava/lang/String;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    .line 2
    iput-object p2, p0, Lo92/g0;->I:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lo92/s;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    const-string p2, "StreakRestorationNotification"

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lo92/g0;-><init>(Lo92/s;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic z()Lc12/d;
    .locals 1

    sget-object v0, Lo92/g0;->L:Lc12/d;

    return-object v0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 10

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "title"

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p2, p1, v0, p1}, Lm92/b;->e(Lm92/b;Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setContentText(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo92/g0;->L:Lc12/d;

    invoke-virtual {v0, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lhi0/e;->a5:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    new-instance v0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v0, v5}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    const-string p1, "build(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/16 v2, 0x7b

    const/4 v7, 0x0

    move-object v1, p0

    move-object v4, p2

    invoke-static/range {v1 .. v9}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/g0;->I:Ljava/lang/String;

    return-object v0
.end method
