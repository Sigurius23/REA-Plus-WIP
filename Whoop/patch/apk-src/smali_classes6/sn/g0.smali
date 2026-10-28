.class public final synthetic Lsn/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsn/k0;


# direct methods
.method public synthetic constructor <init>(Lsn/k0;I)V
    .locals 0

    iput p2, p0, Lsn/g0;->w:I

    iput-object p1, p0, Lsn/g0;->x:Lsn/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lsn/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsn/g0;->x:Lsn/k0;

    iget-boolean v1, v0, Lsn/k0;->k0:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Lsn/k0;->P:Lsn/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Lsn/s0;->c(Lsn/t0;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lsn/g0;->x:Lsn/k0;

    invoke-virtual {v0}, Lsn/k0;->z()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
