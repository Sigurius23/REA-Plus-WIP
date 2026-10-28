.class public final synthetic Llo/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Llo/g;->w:I

    iput-object p1, p0, Llo/g;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    iget p1, p0, Llo/g;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Llo/g;->x:Ljava/lang/Object;

    check-cast p1, Lx8/i;

    iget-object v0, p1, Lx8/i;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx8/h;

    iget-object v3, p1, Lx8/i;->c:Lx8/g;

    iget-boolean v4, v1, Lx8/h;->d:Z

    if-nez v4, :cond_1

    iget-boolean v4, v1, Lx8/h;->c:Z

    if-eqz v4, :cond_1

    iget-object v4, v1, Lx8/h;->b:Llo/e;

    invoke-virtual {v4}, Llo/e;->c()Lu8/n;

    move-result-object v4

    new-instance v5, Llo/e;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Llo/e;-><init>(I)V

    iput-object v5, v1, Lx8/h;->b:Llo/e;

    const/4 v5, 0x0

    iput-boolean v5, v1, Lx8/h;->c:Z

    iget-object v1, v1, Lx8/h;->a:Ljava/lang/Object;

    invoke-interface {v3, v1, v4}, Lx8/g;->a(Ljava/lang/Object;Lu8/n;)V

    :cond_1
    iget-object v1, p1, Lx8/i;->b:Lx8/r;

    iget-object v1, v1, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    return v2

    :pswitch_0
    iget-object p1, p0, Llo/g;->x:Ljava/lang/Object;

    check-cast p1, Ld9/p;

    iget-object v0, p1, Ld9/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llo/j;

    iget-object v2, p1, Ld9/p;->d:Ljava/lang/Object;

    check-cast v2, Llo/i;

    iget-boolean v3, v1, Llo/j;->d:Z

    const/4 v4, 0x0

    if-nez v3, :cond_4

    iget-boolean v3, v1, Llo/j;->c:Z

    if-eqz v3, :cond_4

    iget-object v3, v1, Llo/j;->b:Llo/e;

    invoke-virtual {v3}, Llo/e;->b()Llo/f;

    move-result-object v3

    new-instance v5, Llo/e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Llo/e;-><init>(I)V

    iput-object v5, v1, Llo/j;->b:Llo/e;

    iput-boolean v4, v1, Llo/j;->c:Z

    iget-object v1, v1, Llo/j;->a:Ljava/lang/Object;

    invoke-interface {v2, v1, v3}, Llo/i;->a(Ljava/lang/Object;Llo/f;)V

    :cond_4
    iget-object v1, p1, Ld9/p;->c:Ljava/lang/Object;

    check-cast v1, Llo/v;

    iget-object v1, v1, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_5
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
