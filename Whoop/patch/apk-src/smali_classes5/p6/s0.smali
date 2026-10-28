.class public abstract Lp6/s0;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# static fields
.field public static final x:Lp6/p0;


# instance fields
.field private final w:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/p0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/s0;->x:Lp6/p0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    iput-object v0, p0, Lp6/s0;->w:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Lbc3/c0;Landroid/content/Context;[ILq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroid/content/Context;",
            "[I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lp6/q0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lp6/q0;

    iget v1, v0, Lp6/q0;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/q0;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/q0;

    invoke-direct {v0, p0, p4}, Lp6/q0;-><init>(Lp6/s0;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lp6/q0;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/q0;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lp6/q0;->z:I

    iget p2, v0, Lp6/q0;->y:I

    iget-object p3, v0, Lp6/q0;->x:[I

    iget-object v2, v0, Lp6/q0;->w:Landroid/content/Context;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p3

    move-object p3, v2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lp6/s0;->g(Lbc3/c0;Landroid/content/Context;)V

    array-length p1, p3

    const/4 p4, 0x0

    move-object v5, p3

    move-object p3, p2

    move p2, p4

    move-object p4, v5

    :goto_1
    if-ge p2, p1, :cond_4

    aget v2, p4, p2

    invoke-virtual {p0}, Lp6/s0;->f()Lp6/g0;

    move-result-object v4

    iput-object p3, v0, Lp6/q0;->w:Landroid/content/Context;

    iput-object p4, v0, Lp6/q0;->x:[I

    iput p2, v0, Lp6/q0;->y:I

    iput p1, v0, Lp6/q0;->z:I

    iput v3, v0, Lp6/q0;->G:I

    invoke-virtual {v4, p3, v2, v0}, Lp6/g0;->b(Landroid/content/Context;ILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr p2, v3

    goto :goto_1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Lbc3/c0;Landroid/content/Context;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lp6/s0;->g(Lbc3/c0;Landroid/content/Context;)V

    invoke-virtual {p0}, Lp6/s0;->f()Lp6/g0;

    move-result-object v0

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v5, p5

    invoke-static/range {v0 .. v7}, Lp6/g0;->o(Lp6/g0;Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(Lbc3/c0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroid/content/Context;",
            "I",
            "Landroid/os/Bundle;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lp6/s0;->g(Lbc3/c0;Landroid/content/Context;)V

    invoke-virtual {p0}, Lp6/s0;->f()Lp6/g0;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4, p5}, Lp6/g0;->m(Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lbc3/c0;Landroid/content/Context;[ILq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Landroid/content/Context;",
            "[I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lp6/s0;->g(Lbc3/c0;Landroid/content/Context;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p3, v2

    new-instance v4, Lmj/b;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p2, v3, v5}, Lmj/b;-><init>(Lp6/s0;Landroid/content/Context;ILq83/d;)V

    const/4 v3, 0x3

    invoke-static {p1, v5, v4, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0, p4}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public e()Lq83/j;
    .locals 1

    iget-object v0, p0, Lp6/s0;->w:Lq83/j;

    return-object v0
.end method

.method public abstract f()Lp6/g0;
.end method

.method public final g(Lbc3/c0;Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ln20/j;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-direct {v0, p2, p0, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v2, v2, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 7

    new-instance p2, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/16 v0, 0x8

    invoke-direct {p2, p0, p3, p4, v0}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-static {p1, p2}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lp6/s0;->e()Lq83/j;

    move-result-object p2

    new-instance v0, Ld20/p;

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object v1, p0

    move-object v2, p1

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Ld20/p;-><init>(Lp6/s0;Landroid/content/Context;ILjava/lang/Object;Lq83/d;I)V

    invoke-static {p0, p2, v0}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    return-void

    :cond_0
    move-object v1, p0

    return-void
.end method

.method public onDeleted(Landroid/content/Context;[I)V
    .locals 7

    new-instance v0, Lp6/o0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lp6/o0;-><init>(Lp6/s0;[II)V

    invoke-static {p1, v0}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp6/s0;->e()Lq83/j;

    move-result-object v0

    new-instance v1, Lp6/r0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lp6/r0;-><init>(Lp6/s0;Landroid/content/Context;[ILq83/d;I)V

    invoke-static {p0, v0, v1}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string v0, "appWidgetIds"

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x122164c

    if-eq v2, v3, :cond_7

    const v3, 0x26af776f

    if-eq v2, v3, :cond_6

    const v0, 0x76997177

    if-eq v2, v0, :cond_1

    :cond_0
    :goto_0
    move-object v2, p0

    move-object v3, p1

    goto/16 :goto_3

    :cond_1
    const-string v0, "ACTION_TRIGGER_LAMBDA"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "EXTRA_ACTION_KEY"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    const-string v0, "EXTRA_APPWIDGET_ID"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    if-eq v4, v1, :cond_4

    new-instance p2, Lcom/whoop/data/local/room/dao/wipeable/d;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v4, v5, v0}, Lcom/whoop/data/local/room/dao/wipeable/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-static {p1, p2}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lp6/s0;->e()Lq83/j;

    move-result-object p2

    new-instance v1, Ld20/p;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x0

    const/4 v7, 0x3

    move-object v2, p0

    move-object v3, p1

    :try_start_1
    invoke-direct/range {v1 .. v7}, Ld20/p;-><init>(Lp6/s0;Landroid/content/Context;ILjava/lang/Object;Lq83/d;I)V

    invoke-static {p0, p2, v1}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    return-void

    :catchall_0
    move-exception v0

    :goto_1
    move-object p1, v0

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto :goto_1

    :catch_0
    :cond_3
    move-object v2, p0

    goto/16 :goto_5

    :cond_4
    move-object v2, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Intent is missing AppWidgetId extra"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-object v2, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Intent is missing ActionKey extra"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object v2, p0

    move-object v3, p1

    const-string p1, "androidx.glance.appwidget.action.DEBUG_UPDATE"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_3

    :cond_7
    move-object v2, p0

    move-object v3, p1

    const-string p1, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {v3}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    new-instance v5, Landroid/content/ComponentName;

    invoke-direct {v5, v1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p1, v5}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object p2

    :goto_2
    invoke-virtual {p0, v3, p1, p2}, Lp6/s0;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    return-void

    :cond_a
    const-string p1, "no canonical name"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_3
    invoke-super {p0, v3, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :goto_4
    const-string p2, "GlanceAppWidget"

    const-string v0, "Error in Glance App Widget"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :catch_1
    :goto_5
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 6

    new-instance p2, Lp6/o0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p3, v0}, Lp6/o0;-><init>(Lp6/s0;[II)V

    invoke-static {p1, p2}, Lx43/j;->O(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lp6/s0;->e()Lq83/j;

    move-result-object p2

    new-instance v0, Lp6/r0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lp6/r0;-><init>(Lp6/s0;Landroid/content/Context;[ILq83/d;I)V

    invoke-static {p0, p2, v0}, Lvp/c;->a0(Landroid/content/BroadcastReceiver;Lq83/j;Lc93/m;)V

    return-void

    :cond_0
    move-object v1, p0

    return-void
.end method
