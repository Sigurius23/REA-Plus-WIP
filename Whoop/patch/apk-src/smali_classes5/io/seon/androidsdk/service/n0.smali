.class public final Lio/seon/androidsdk/service/n0;
.super Lio/seon/androidsdk/service/e1;
.source "SourceFile"


# instance fields
.field public final h:Landroid/app/Activity;

.field public final i:Landroid/os/PowerManager;

.field public final j:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x10

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lio/seon/androidsdk/service/e1;-><init>(II)V

    invoke-static {}, Lio/seon/androidsdk/service/o;->k()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/n0;->h:Landroid/app/Activity;

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/n0;->h:Landroid/app/Activity;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    iput-object v0, p0, Lio/seon/androidsdk/service/n0;->i:Landroid/os/PowerManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object v0, p0, Lio/seon/androidsdk/service/n0;->h:Landroid/app/Activity;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lio/seon/androidsdk/service/n0;->j:Landroid/view/WindowManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-void
.end method


# virtual methods
.method public final a([F)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    aget p1, p1, v0

    iget-object v1, p0, Lio/seon/androidsdk/service/n0;->j:Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getState()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lio/seon/androidsdk/service/n0;->i:Landroid/os/PowerManager;

    invoke-virtual {v2}, Landroid/os/PowerManager;->isInteractive()Z

    move-result v2

    if-eqz v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x3

    new-array v3, v3, [F

    aput p1, v3, v0

    const/4 p1, 0x1

    aput v1, v3, p1

    const/4 p1, 0x2

    aput v2, v3, p1

    invoke-super {p0, v3}, Lio/seon/androidsdk/service/e1;->a([F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
