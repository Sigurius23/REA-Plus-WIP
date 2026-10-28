.class public final Lg/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg/l;


# direct methods
.method public synthetic constructor <init>(Lg/l;I)V
    .locals 0

    iput p2, p0, Lg/k;->w:I

    iput-object p1, p0, Lg/k;->x:Lg/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lg/k;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lg/z;

    new-instance v1, Lg/c;

    const/4 v2, 0x1

    iget-object v3, p0, Lg/k;->x:Lg/l;

    invoke-direct {v1, v3, v2}, Lg/c;-><init>(Lg/l;I)V

    invoke-direct {v0, v1}, Lg/z;-><init>(Ljava/lang/Runnable;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Landroidx/lifecycle/m;

    const/4 v4, 0x5

    invoke-direct {v2, v4, v3, v0}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-static {v3, v0}, Lg/l;->access$addObserverForBackInvoker(Lg/l;Lg/z;)V

    :cond_1
    :goto_0
    return-object v0

    :pswitch_0
    new-instance v0, Lg/s;

    iget-object v1, p0, Lg/k;->x:Lg/l;

    invoke-static {v1}, Lg/l;->access$getReportFullyDrawnExecutor$p(Lg/l;)Lg/h;

    move-result-object v2

    new-instance v3, Lav/b;

    const/16 v4, 0x11

    invoke-direct {v3, v1, v4}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v2, v3}, Lg/s;-><init>(Lg/h;Lav/b;)V

    return-object v0

    :pswitch_1
    new-instance v0, Landroidx/lifecycle/s1;

    iget-object v1, p0, Lg/k;->x:Lg/l;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-direct {v0, v2, v1, v3}, Landroidx/lifecycle/s1;-><init>(Landroid/app/Application;Lpb/f;Landroid/os/Bundle;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
