.class public final Lcom/amplitude/android/engagement/AmplitudeEngagementInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyb/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyb/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/AmplitudeEngagementInitializer;",
        "Lyb/b;",
        "Ll83/a0;",
        "<init>",
        "()V",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Landroid/app/Application;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v1, "No application context available"

    const-string v3, "AmplitudeEngagement"

    if-nez v0, :cond_1

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    instance-of v5, v4, Landroid/app/Application;

    if-eqz v5, :cond_2

    check-cast v4, Landroid/app/Application;

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    if-nez v4, :cond_3

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    sget-object v1, Lhj/u;->w:Lhj/u;

    invoke-virtual {v4, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    sput-object v2, Lhj/u;->x:Ljava/lang/ref/WeakReference;

    :goto_2
    sget-object v1, Lhj/u;->w:Lhj/u;

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_4

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v1, v2}, Lhj/u;->onActivityResumed(Landroid/app/Activity;)V

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
