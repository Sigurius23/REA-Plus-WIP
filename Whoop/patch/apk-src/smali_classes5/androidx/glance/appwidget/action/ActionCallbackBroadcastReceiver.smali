.class public Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "q6/e",
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
    .locals 9

    const-string v0, "ActionCallbackBroadcastReceiver:appWidgetId"

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lq6/e;->c(Landroid/os/Bundle;)Lo6/f;

    move-result-object v6

    const-string v2, "ActionCallbackBroadcastReceiver:callbackClass"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance v5, Lp6/b;

    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p2

    invoke-direct {v5, p2}, Lp6/b;-><init>(I)V

    new-instance p2, Lno0/j0;

    const/16 v0, 0x13

    invoke-direct {p2, v4, v5, v6, v0}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result p2

    if-nez p2, :cond_0

    new-instance v2, Lp33/m;

    const/4 v7, 0x0

    const/4 v8, 0x4

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    invoke-static {p0, p1, v2}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    return-void

    :cond_1
    const-string p1, "To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string p1, "The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p1, "The intent must have action parameters extras."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    const-string p1, "Intent is null"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    const-string p1, "Context is null"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    const-string p2, "GlanceAppWidget"

    const-string v0, "Error in Glance App Widget"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :goto_1
    throw p1
.end method
