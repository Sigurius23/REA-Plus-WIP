.class public final Ly40/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final transient w:Landroid/os/Handler;

.field public final transient x:Lu40/h;

.field public final y:Ll83/p;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lu40/h;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly40/d;->w:Landroid/os/Handler;

    iput-object p3, p0, Ly40/d;->x:Lu40/h;

    new-instance p1, Lvv1/c;

    const/16 p3, 0x19

    invoke-direct {p1, p2, p3}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ly40/d;->y:Ll83/p;

    return-void
.end method


# virtual methods
.method public final getConfig()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Ly40/d;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final onError(I)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    sget-object v0, Lu40/d;->y:Lt9/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lu40/d;->J:Lt83/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :cond_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu40/d;

    iget v2, v0, Lu40/d;->w:I

    if-ne v2, p1, :cond_0

    new-instance p1, Lr5/b;

    const/16 v1, 0x15

    invoke-direct {p1, v1, p0, v0}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Ly40/d;->w:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unsupported error id: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onLoaded()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Ly40/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ly40/c;-><init>(Ly40/d;I)V

    iget-object v1, p0, Ly40/d;->w:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onOpen()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Ly40/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ly40/c;-><init>(Ly40/d;I)V

    iget-object v1, p0, Ly40/d;->w:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPass(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr5/b;

    const/16 v1, 0x16

    invoke-direct {v0, v1, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ly40/d;->w:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
