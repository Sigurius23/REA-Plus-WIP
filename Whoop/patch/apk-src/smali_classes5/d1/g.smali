.class public final synthetic Ld1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld1/g;->a:I

    iput-object p1, p0, Ld1/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 4

    iget v0, p0, Ld1/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/g;->b:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld1/g;->b:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_0

    sget-wide v2, Ll3/u0;->b:J

    invoke-virtual {v1, v2, v3}, Lu0/s0;->e(J)V

    :cond_0
    iget-object v0, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_1

    sget-wide v1, Ll3/u0;->b:J

    invoke-virtual {v0, v1, v2}, Lu0/s0;->f(J)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
