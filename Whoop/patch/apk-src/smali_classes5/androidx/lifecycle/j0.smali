.class public abstract Landroidx/lifecycle/j0;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;


# instance fields
.field public final w:La33/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, La33/d;

    invoke-direct {v0, p0}, La33/d;-><init>(Landroidx/lifecycle/j0;)V

    iput-object v0, p0, Landroidx/lifecycle/j0;->w:La33/d;

    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/j0;->w:La33/d;

    iget-object v0, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/j0;->w:La33/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {p1, v0}, La33/d;->D(Landroidx/lifecycle/v;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/j0;->w:La33/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, La33/d;->D(Landroidx/lifecycle/v;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/j0;->w:La33/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, La33/d;->D(Landroidx/lifecycle/v;)V

    sget-object v1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, La33/d;->D(Landroidx/lifecycle/v;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStart(Landroid/content/Intent;I)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/j0;->w:La33/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, La33/d;->D(Landroidx/lifecycle/v;)V

    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    return-void
.end method
