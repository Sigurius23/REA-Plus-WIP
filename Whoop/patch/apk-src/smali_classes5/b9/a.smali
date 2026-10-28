.class public final Lb9/a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkr/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb9/a;->a:I

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    iput-object p1, p0, Lb9/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lb9/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb9/b;Lx8/r;Lb9/c0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb9/a;->a:I

    .line 4
    iput-object p1, p0, Lb9/a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 5
    iput-object p2, p0, Lb9/a;->c:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, Lb9/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    iget v0, p0, Lb9/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/a;->c:Ljava/lang/Object;

    check-cast v0, Lkr/e;

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "state"

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 v2, 0x0

    const-string v3, "message"

    const-string v4, "Wired headset device "

    const-string v5, ""

    const-string v6, "name"

    const/4 v7, 0x1

    if-ne p1, v7, :cond_1

    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, p1

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " connected"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb9/a;->d:Ljava/lang/Object;

    check-cast p1, Lz40/k;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lz40/k;->a:Lz40/l;

    iput-boolean v7, p1, Lz40/l;->g:Z

    invoke-virtual {p1, v2}, Lz40/l;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v5, p1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " disconnected"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb9/a;->d:Ljava/lang/Object;

    check-cast p1, Lz40/k;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lz40/k;->a:Lz40/l;

    iput-boolean v1, p1, Lz40/l;->g:Z

    invoke-virtual {p1, v2}, Lz40/l;->d(Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-void

    :pswitch_0
    const-string p1, "android.media.AUDIO_BECOMING_NOISY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lb9/a;->c:Ljava/lang/Object;

    check-cast p1, Lx8/r;

    new-instance p2, Landroidx/fragment/app/m;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
