.class public final Ldx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ldx/b;->w:I

    iput-object p2, p0, Ldx/b;->y:Ljava/lang/Object;

    iput-object p3, p0, Ldx/b;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 2

    iget v0, p0, Ldx/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldx/b;->y:Ljava/lang/Object;

    check-cast v0, Llh3/n;

    iget-object v1, p0, Ldx/b;->x:Ljava/lang/Object;

    check-cast v1, Llh3/m;

    invoke-virtual {v0, v1}, Llh3/n;->a(Llh3/m;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ldx/b;->y:Ljava/lang/Object;

    check-cast v0, Leh3/f;

    iget-object v0, v0, Leh3/f;->y:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldx/b;->x:Ljava/lang/Object;

    check-cast v0, Lbh3/a;

    invoke-interface {v0}, Lbh3/a;->call()V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Ldx/b;->y:Ljava/lang/Object;

    check-cast v0, Leh3/c;

    iget-object v0, v0, Leh3/c;->w:Lmh3/c;

    iget-boolean v0, v0, Lmh3/c;->x:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ldx/b;->x:Ljava/lang/Object;

    check-cast v0, Lbh3/a;

    invoke-interface {v0}, Lbh3/a;->call()V

    :goto_1
    return-void

    :pswitch_2
    iget-object v0, p0, Ldx/b;->y:Ljava/lang/Object;

    check-cast v0, Lch3/q;

    iget-object v0, v0, Lch3/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Ldx/b;->x:Ljava/lang/Object;

    check-cast v1, Ldx/a;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
