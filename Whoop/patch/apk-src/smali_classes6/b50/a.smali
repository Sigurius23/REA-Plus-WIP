.class public final Lb50/a;
.super Lb3/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Lkr/e;

.field public final f:Lz40/f;

.field public final synthetic g:Lb50/c;


# direct methods
.method public constructor <init>(Lb50/c;Lkr/e;Lz40/f;Landroid/os/Handler;Lu00/e;I)V
    .locals 0

    iput p6, p0, Lb50/a;->d:I

    iput-object p1, p0, Lb50/a;->g:Lb50/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lb3/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Lb50/a;->e:Lkr/e;

    iput-object p3, p0, Lb50/a;->f:Lz40/f;

    return-void
.end method


# virtual methods
.method public final F()V
    .locals 2

    iget v0, p0, Lb50/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb50/a;->e:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb50/a;->f:Lz40/f;

    iget-object v0, v0, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    iget-object v0, p0, Lb50/a;->g:Lb50/c;

    sget-object v1, Lb50/b;->c:Lb50/b;

    invoke-virtual {v0, v1}, Lb50/c;->e(Lx30/s0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb50/a;->e:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lb50/a;->f:Lz40/f;

    iget-object v0, v0, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    iget-object v0, p0, Lb50/a;->g:Lb50/c;

    sget-object v1, Lb50/b;->e:Lb50/b;

    invoke-virtual {v0, v1}, Lb50/c;->e(Lx30/s0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final G()V
    .locals 3

    iget v0, p0, Lb50/a;->d:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lb50/b;->d:Lb50/b;

    iget-object v1, p0, Lb50/a;->g:Lb50/c;

    invoke-virtual {v1, v0}, Lb50/c;->e(Lx30/s0;)V

    iget-object v0, v1, Lb50/c;->z:Lz40/k;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lz40/k;->a:Lz40/l;

    iget-object v1, v0, Lz40/l;->f:Lz40/e;

    instance-of v1, v1, Lz40/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iput-object v2, v0, Lz40/l;->f:Lz40/e;

    :cond_0
    invoke-virtual {v0, v2}, Lz40/l;->d(Ljava/lang/String;)V

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lb50/a;->g:Lb50/c;

    sget-object v1, Lb50/b;->d:Lb50/b;

    invoke-virtual {v0, v1}, Lb50/c;->e(Lx30/s0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
