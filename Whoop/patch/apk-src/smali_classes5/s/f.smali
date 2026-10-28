.class public final Ls/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Ls/d;

.field public final synthetic x:Ls/h;


# direct methods
.method public constructor <init>(Ls/h;Ls/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/f;->x:Ls/h;

    iput-object p2, p0, Ls/f;->w:Ls/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls/f;->x:Ls/h;

    iget-object v1, v0, Ls/h;->y:Lr/l;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lr/l;->f:Lr/j;

    if-eqz v2, :cond_0

    invoke-interface {v2, v1}, Lr/j;->b(Lr/l;)V

    :cond_0
    iget-object v1, v0, Ls/h;->H:Lr/z;

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ls/f;->w:Ls/d;

    invoke-virtual {v1}, Lr/v;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lr/v;->e:Landroid/view/View;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, Lr/v;->d(IIZZ)V

    :goto_0
    iput-object v1, v0, Ls/h;->S:Ls/d;

    :cond_3
    :goto_1
    const/4 v1, 0x0

    iput-object v1, v0, Ls/h;->U:Ls/f;

    return-void
.end method
