.class public final Lcom/iterable/iterableapi/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/iterable/iterableapi/d1;


# direct methods
.method public synthetic constructor <init>(Lcom/iterable/iterableapi/d1;I)V
    .locals 0

    iput p2, p0, Lcom/iterable/iterableapi/c1;->w:I

    iput-object p1, p0, Lcom/iterable/iterableapi/c1;->x:Lcom/iterable/iterableapi/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/iterable/iterableapi/c1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/iterable/iterableapi/c1;->x:Lcom/iterable/iterableapi/d1;

    iget-object v0, v0, Lcom/iterable/iterableapi/d1;->H:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/iterable/iterableapi/c1;->x:Lcom/iterable/iterableapi/d1;

    iget-object v1, v1, Lcom/iterable/iterableapi/d1;->H:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/ClassCastException;

    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :pswitch_0
    iget-object v0, p0, Lcom/iterable/iterableapi/c1;->x:Lcom/iterable/iterableapi/d1;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/d1;->f()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
