.class public final synthetic La8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:La8/f;


# direct methods
.method public synthetic constructor <init>(La8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/e;->a:La8/f;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    iget-object v0, p0, La8/e;->a:La8/f;

    iget-object v1, v0, La8/f;->y:Lqg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x5

    const-string v2, "ServiceConnection"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Binder died for client:HealthData"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v1, Landroid/os/RemoteException;

    const-string v2, "Binder died"

    invoke-direct {v1, v2}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, La8/f;->d(Ljava/lang/Exception;)V

    return-void
.end method
