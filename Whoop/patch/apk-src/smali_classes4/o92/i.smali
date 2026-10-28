.class public final Lo92/i;
.super Lm92/b;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001\u0018B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001a\u0010)\u001a\u00020$8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010(\u00a8\u0006-"
    }
    d2 = {
        "Lo92/i;",
        "Lm92/b;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lo92/s;",
        "pushContext",
        "Landroid/content/Context;",
        "context",
        "Lnl1/a;",
        "newFirmwareUpdateMonitor",
        "Lgt0/d;",
        "fwAnalyticsHelper",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "backgroundScope",
        "<init>",
        "(Lo92/s;Landroid/content/Context;Lnl1/a;Lgt0/d;Lci2/b;Lbc3/c0;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "Lm92/f;",
        "dataMap",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Landroid/content/Context;",
        "J",
        "Lnl1/a;",
        "K",
        "Lgt0/d;",
        "L",
        "Lci2/b;",
        "M",
        "Lbc3/c0;",
        "",
        "N",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "D",
        "deviceName",
        "O",
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
.field public static final O:Lo92/i$a;

.field public static final P:I

.field public static final Q:Lc12/d;


# instance fields
.field private final I:Landroid/content/Context;

.field private final J:Lnl1/a;

.field private final K:Lgt0/d;

.field private final L:Lci2/b;

.field private final M:Lbc3/c0;

.field private final N:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo92/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/i;->O:Lo92/i$a;

    const/16 v0, 0x8

    sput v0, Lo92/i;->P:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06500_FirmwareUpdate"

    sget v2, Lhi0/j;->d0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->n:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lo92/i;->Q:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Landroid/content/Context;Lnl1/a;Lgt0/d;Lci2/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newFirmwareUpdateMonitor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fwAnalyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    .line 2
    iput-object p2, p0, Lo92/i;->I:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lo92/i;->J:Lnl1/a;

    .line 4
    iput-object p4, p0, Lo92/i;->K:Lgt0/d;

    .line 5
    iput-object p5, p0, Lo92/i;->L:Lci2/b;

    .line 6
    iput-object p6, p0, Lo92/i;->M:Lbc3/c0;

    .line 7
    const-string p1, "FirmwareUpdateNotification"

    iput-object p1, p0, Lo92/i;->N:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lo92/s;Landroid/content/Context;Lnl1/a;Lgt0/d;Lci2/b;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    invoke-virtual {p1}, Lo92/s;->d()Lbc3/c0;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lo92/i;-><init>(Lo92/s;Landroid/content/Context;Lnl1/a;Lgt0/d;Lci2/b;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic A(Lo92/i;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lo92/i;->D()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lo92/i;)Lgt0/d;
    .locals 0

    iget-object p0, p0, Lo92/i;->K:Lgt0/d;

    return-object p0
.end method

.method public static final synthetic C(Lo92/i;)Lnl1/a;
    .locals 0

    iget-object p0, p0, Lo92/i;->J:Lnl1/a;

    return-object p0
.end method

.method private final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/i;->L:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    invoke-virtual {v0}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final synthetic z(Lo92/i;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lo92/i;->I:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 11

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-virtual {p1, v0}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p1

    :goto_1
    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p2, p1, v0, p1}, Lm92/b;->e(Lm92/b;Landroid/content/Context;Ljava/lang/Integer;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setContentText(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo92/i;->Q:Lc12/d;

    invoke-virtual {v0, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p0, p2}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object v0

    sget v1, Lhi0/e;->D2:I

    invoke-static {v0, v1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v4

    const-string p1, "build(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/16 v3, 0x71

    const/4 v8, 0x0

    move-object v2, p0

    move-object v5, p2

    invoke-static/range {v2 .. v10}, Lm92/b;->y(Lm92/b;ILandroid/app/Notification;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/i;->N:Ljava/lang/String;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lo92/i;->M:Lbc3/c0;

    new-instance v0, Lo92/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo92/i$b;-><init>(Lo92/i;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
