.class public final Lsr/f;
.super Lip/h;
.source "SourceFile"

# interfaces
.implements Lxr/s;


# instance fields
.field public final g:Lcq/i;

.field public final synthetic h:Lsr/h;

.field public final synthetic i:I

.field public final j:Lxr/t;

.field public final synthetic k:Lsr/h;


# direct methods
.method public constructor <init>(Lsr/h;Lcq/i;B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsr/f;->h:Lsr/h;

    const/4 p1, 0x5

    .line 2
    invoke-direct {p0, p1}, Lip/h;-><init>(I)V

    .line 3
    const-string p1, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback"

    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lsr/f;->g:Lcq/i;

    return-void
.end method

.method public constructor <init>(Lsr/h;Lcq/i;I)V
    .locals 0

    iput p3, p0, Lsr/f;->i:I

    packed-switch p3, :pswitch_data_0

    .line 5
    iput-object p1, p0, Lsr/f;->k:Lsr/h;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lsr/f;-><init>(Lsr/h;Lcq/i;B)V

    new-instance p1, Lxr/t;

    const-string p2, "OnRequestIntegrityTokenCallback"

    .line 6
    invoke-direct {p1, p2}, Lxr/t;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lsr/f;->j:Lxr/t;

    return-void

    .line 7
    :pswitch_0
    iput-object p1, p0, Lsr/f;->k:Lsr/h;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lsr/f;-><init>(Lsr/h;Lcq/i;B)V

    new-instance p1, Lxr/t;

    const-string p2, "OnWarmUpIntegrityTokenCallback"

    .line 8
    invoke-direct {p1, p2}, Lxr/t;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lsr/f;->j:Lxr/t;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public U(Landroid/os/Bundle;)V
    .locals 3

    iget v0, p0, Lsr/f;->i:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lsr/f;->o0(Landroid/os/Bundle;)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p1}, Lsr/f;->o0(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lsr/f;->j:Lxr/t;

    const-string v2, "onWarmUpExpressIntegrityToken"

    invoke-virtual {v1, v2, v0}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lsr/f;->k:Lsr/h;

    iget-object v0, v0, Lsr/h;->d:Lng3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    move-object v1, v2

    :goto_0
    iget-object v0, p0, Lsr/f;->g:Lcq/i;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    goto :goto_1

    :cond_1
    const-string v1, "warm.up.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcq/i;->d(Ljava/lang/Object;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 6

    iget v0, p0, Lsr/f;->i:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Lsr/f;->n0(Landroid/os/Bundle;)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p1}, Lsr/f;->n0(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lsr/f;->j:Lxr/t;

    const-string v2, "onRequestExpressIntegrityToken"

    invoke-virtual {v1, v2, v0}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lsr/f;->k:Lsr/h;

    iget-object v0, v0, Lsr/h;->d:Lng3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "error"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Exception;)V

    move-object v1, v2

    :goto_0
    iget-object v0, p0, Lsr/f;->g:Lcq/i;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    goto :goto_1

    :cond_1
    const-string v1, "request.token.sid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    const-string v3, "]  PID: ["

    const-string v4, "] "

    const-string v5, "UID: ["

    invoke-static {v1, v2, v5, v3, v4}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IntegrityDialogWrapper"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    const-string v1, "token"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v1, Lsr/j;

    invoke-direct {v1, p1}, Lsr/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcq/i;->d(Ljava/lang/Object;)V

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null token"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n0(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lsr/f;->h:Lsr/h;

    iget-object p1, p1, Lsr/h;->e:Lxr/b;

    iget-object v0, p0, Lsr/f;->g:Lcq/i;

    invoke-virtual {p1, v0}, Lxr/b;->c(Lcq/i;)V

    return-void
.end method

.method public final o0(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lsr/f;->h:Lsr/h;

    iget-object p1, p1, Lsr/h;->e:Lxr/b;

    iget-object v0, p0, Lsr/f;->g:Lcq/i;

    invoke-virtual {p1, v0}, Lxr/b;->c(Lcq/i;)V

    return-void
.end method
