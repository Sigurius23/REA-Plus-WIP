.class public final Lor2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lor2/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lor2/n;",
        "Lor2/o;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "deviceAddress",
        "",
        "a",
        "(Ljava/lang/String;)Z",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Landroid/companion/CompanionDeviceManager;",
        "b",
        "Landroid/companion/CompanionDeviceManager;",
        "manager",
        "c",
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
.field public static final c:Lor2/n$a;

.field public static final d:I

.field private static final e:Landroid/os/Handler;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Landroid/companion/CompanionDeviceManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lor2/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lor2/n;->c:Lor2/n$a;

    const/16 v0, 0x8

    sput v0, Lor2/n;->d:I

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "companion-device-handler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lor2/n;->e:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CompanionDeviceHelper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lor2/n;->a:Ltr2/n;

    const-class v0, Landroid/companion/CompanionDeviceManager;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/companion/CompanionDeviceManager;

    iput-object p1, p0, Lor2/n;->b:Landroid/companion/CompanionDeviceManager;

    return-void
.end method

.method public static final synthetic b()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lor2/n;->e:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/n;->b:Landroid/companion/CompanionDeviceManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/companion/CompanionDeviceManager;->getAssociations()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
