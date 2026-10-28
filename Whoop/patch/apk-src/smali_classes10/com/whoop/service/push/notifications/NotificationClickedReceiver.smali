.class public final Lcom/whoop/service/push/notifications/NotificationClickedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u00012\u00020\u0002:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/NotificationClickedReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "w",
        "a",
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
.field public static final w:Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;

.field public static final x:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/NotificationClickedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/NotificationClickedReceiver;->x:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "NotificationType"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lz82/g;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/g;

    invoke-virtual {v0, p1}, Lz82/g;->a(Ljava/lang/String;)V

    :cond_0
    const-string p1, "ContentPendingIntent"

    const-class v0, Landroid/app/PendingIntent;

    invoke-static {p2, p1, v0}, Ls4/g;->h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/PendingIntent;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/PendingIntent;->send()V

    :cond_1
    return-void
.end method
