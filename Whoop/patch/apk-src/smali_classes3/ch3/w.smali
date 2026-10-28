.class public final Lch3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxg3/s;


# direct methods
.method public synthetic constructor <init>(Lxg3/s;I)V
    .locals 0

    iput p2, p0, Lch3/w;->w:I

    iput-object p1, p0, Lch3/w;->x:Lxg3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 3

    iget v0, p0, Lch3/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/w;->x:Lxg3/s;

    check-cast v0, Lch3/z;

    invoke-virtual {v0}, Lch3/z;->g()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lch3/w;->x:Lxg3/s;

    check-cast v0, Lch3/x;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lch3/x;->F:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lch3/x;->I:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lch3/x;->I:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, v0, Lch3/x;->G:Ljava/lang/Object;

    check-cast v2, Lch3/o0;

    invoke-virtual {v2, v1}, Lch3/o0;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-static {v1, v0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    :goto_0
    return-void

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
