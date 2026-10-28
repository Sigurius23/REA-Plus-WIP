.class public final Lc12/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc12/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lc12/e;",
        "Lc12/c;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/NotificationManager;",
        "b",
        "(Landroid/content/Context;)Landroid/app/NotificationManager;",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "a",
        "(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;",
        "Lc12/d;",
        "Lc12/d;",
        "SETTINGS_GENERAL",
        "c",
        "SETTINGS_ALERTS",
        "notifications_release"
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
.field public static final a:Lc12/e;

.field public static final b:Lc12/d;

.field public static final c:Lc12/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lc12/e;

    invoke-direct {v0}, Lc12/e;-><init>()V

    sput-object v0, Lc12/e;->a:Lc12/e;

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->HIGH:Lc12/b;

    const-string v2, "00100_General"

    sget v3, Lb12/g;->b:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    sput-object v0, Lc12/e;->b:Lc12/d;

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->URGENT:Lc12/b;

    const-string v2, "00200_Alerts"

    sget v3, Lb12/g;->a:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    const-string v1, "setLightsEnabled(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lc12/e;->c:Lc12/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    const-string v1, "00100_General"

    invoke-direct {v0, p1, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lb12/f;->a:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lb12/e;->a:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    const-string v0, "setColor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Landroid/content/Context;)Landroid/app/NotificationManager;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Landroid/app/NotificationManager;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    sget-object v1, Lc12/e;->b:Lc12/d;

    invoke-virtual {v1, v0, p1}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    sget-object v1, Lc12/e;->c:Lc12/d;

    invoke-virtual {v1, v0, p1}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    return-object v0
.end method
