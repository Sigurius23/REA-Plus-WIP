.class public final synthetic Lcq/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcq/i;


# direct methods
.method public synthetic constructor <init>(ILcq/i;)V
    .locals 0

    iput p1, p0, Lcq/k;->w:I

    iput-object p2, p0, Lcq/k;->x:Lcq/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcq/k;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "TIMEOUT"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcq/k;->x:Lcq/i;

    invoke-virtual {v1, v0}, Lcq/i;->c(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Rpc"

    const-string v1, "No response"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :pswitch_0
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    iget-object v1, p0, Lcq/k;->x:Lcq/i;

    invoke-virtual {v1, v0}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
