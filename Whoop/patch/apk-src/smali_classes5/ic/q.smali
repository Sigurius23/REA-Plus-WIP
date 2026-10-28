.class public final synthetic Lic/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic y:Ld4/i;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ld4/i;Lc93/a;I)V
    .locals 0

    iput p4, p0, Lic/q;->w:I

    iput-object p1, p0, Lic/q;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lic/q;->y:Ld4/i;

    iput-object p3, p0, Lic/q;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lic/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lic/q;->y:Ld4/i;

    iget-object v1, p0, Lic/q;->z:Lc93/a;

    iget-object v2, p0, Lic/q;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld4/i;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0, v1}, Ld4/i;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lic/q;->y:Ld4/i;

    iget-object v1, p0, Lic/q;->z:Lc93/a;

    iget-object v2, p0, Lic/q;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ld4/i;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ld4/i;->b(Ljava/lang/Throwable;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
