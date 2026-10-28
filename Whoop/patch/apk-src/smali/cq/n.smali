.class public final Lcq/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/p;
.implements Lcq/f;
.implements Lcq/e;
.implements Lcq/c;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/concurrent/Executor;

.field public final y:Lcq/b;

.field public final z:Lcq/u;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lcq/b;Lcq/u;I)V
    .locals 0

    iput p4, p0, Lcq/n;->w:I

    iput-object p1, p0, Lcq/n;->x:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcq/n;->y:Lcq/b;

    iput-object p3, p0, Lcq/n;->z:Lcq/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget v0, p0, Lcq/n;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcq/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcq/n;->x:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    new-instance v0, Lcq/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lcq/n;->x:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 1

    iget v0, p0, Lcq/n;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0}, Lcq/u;->d()V

    return-void
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, p1}, Lcq/u;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcq/n;->z:Lcq/u;

    invoke-virtual {v0, p1}, Lcq/u;->a(Ljava/lang/Object;)V

    return-void
.end method
