.class public final Lch3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lxg3/t;


# direct methods
.method public constructor <init>(Lbh3/a;Lxg3/j;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lch3/y;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/y;->x:Ljava/lang/Object;

    iput-object p2, p0, Lch3/y;->y:Lxg3/t;

    return-void
.end method

.method public synthetic constructor <init>(Lxg3/t;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lch3/y;->w:I

    iput-object p1, p0, Lch3/y;->y:Lxg3/t;

    iput-object p2, p0, Lch3/y;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 4

    iget v0, p0, Lch3/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch3/y;->y:Lxg3/t;

    check-cast v0, Lxg3/j;

    :try_start_0
    iget-object v1, p0, Lch3/y;->x:Ljava/lang/Object;

    check-cast v1, Lbh3/a;

    invoke-interface {v1}, Lbh3/a;->call()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lxg3/t;->b()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lxg3/t;->b()V

    throw v1

    :pswitch_0
    iget-object v0, p0, Lch3/y;->y:Lxg3/t;

    check-cast v0, Leh3/f;

    iget-object v0, v0, Leh3/f;->y:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lch3/y;->x:Ljava/lang/Object;

    check-cast v0, Lbh3/a;

    invoke-interface {v0}, Lbh3/a;->call()V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lch3/y;->y:Lxg3/t;

    check-cast v0, Lch3/z;

    iget-object v1, p0, Lch3/y;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_1
    iget-boolean v2, v0, Lch3/z;->H:Z

    if-eqz v2, :cond_1

    monitor-exit v0

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    iget-object v2, v0, Lch3/z;->G:Ljava/util/LinkedList;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-ne v3, v1, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_4

    :try_start_2
    iget-object v2, v0, Lch3/z;->E:Lch3/o0;

    invoke-virtual {v2, v1}, Lch3/o0;->onNext(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    invoke-static {v1, v0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    :cond_4
    :goto_2
    return-void

    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
