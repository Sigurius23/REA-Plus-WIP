.class public final synthetic Lht/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lht/g;

.field public final synthetic y:Ljava/lang/Runnable;

.field public final synthetic z:Lhm/d;


# direct methods
.method public synthetic constructor <init>(Lht/g;Ljava/lang/Runnable;Lhm/d;I)V
    .locals 0

    iput p4, p0, Lht/e;->w:I

    iput-object p1, p0, Lht/e;->x:Lht/g;

    iput-object p2, p0, Lht/e;->y:Ljava/lang/Runnable;

    iput-object p3, p0, Lht/e;->z:Lhm/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lht/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lht/e;->x:Lht/g;

    iget-object v0, v0, Lht/g;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lht/c;

    const/4 v2, 0x1

    iget-object v3, p0, Lht/e;->y:Ljava/lang/Runnable;

    iget-object v4, p0, Lht/e;->z:Lhm/d;

    invoke-direct {v1, v3, v4, v2}, Lht/c;-><init>(Ljava/lang/Runnable;Lhm/d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lht/e;->x:Lht/g;

    iget-object v0, v0, Lht/g;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lht/c;

    const/4 v2, 0x2

    iget-object v3, p0, Lht/e;->y:Ljava/lang/Runnable;

    iget-object v4, p0, Lht/e;->z:Lhm/d;

    invoke-direct {v1, v3, v4, v2}, Lht/c;-><init>(Ljava/lang/Runnable;Lhm/d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lht/e;->x:Lht/g;

    iget-object v0, v0, Lht/g;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lht/c;

    const/4 v2, 0x0

    iget-object v3, p0, Lht/e;->y:Ljava/lang/Runnable;

    iget-object v4, p0, Lht/e;->z:Lhm/d;

    invoke-direct {v1, v3, v4, v2}, Lht/c;-><init>(Ljava/lang/Runnable;Lhm/d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
