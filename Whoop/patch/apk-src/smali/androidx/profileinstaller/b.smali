.class public final synthetic Landroidx/profileinstaller/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/profileinstaller/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget v0, p0, Landroidx/profileinstaller/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object v0

    iget-object v0, v0, Lt/a;->a:Lt/b;

    iget-object v0, v0, Lt/b;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt/a;->W(Ljava/lang/Runnable;)V

    return-void

    :pswitch_1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
