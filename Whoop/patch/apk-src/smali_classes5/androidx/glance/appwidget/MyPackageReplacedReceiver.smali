.class public Landroidx/glance/appwidget/MyPackageReplacedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/glance/appwidget/MyPackageReplacedReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "glance-appwidget"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    new-instance p2, Lov2/f;

    const/16 v0, 0x1b

    invoke-direct {p2, v0}, Lov2/f;-><init>(I)V

    invoke-static {p1, p2}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p2, Lkd/f;

    const/16 v0, 0x1a

    const/4 v1, 0x0

    invoke-direct {p2, p1, v1, v0}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    invoke-static {p0, p1, p2}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "onReceive intent is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "onReceive context is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
