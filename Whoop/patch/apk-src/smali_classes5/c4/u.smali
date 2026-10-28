.class public final synthetic Lc4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lc4/u;->a:I

    iput-object p1, p0, Lc4/u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 1

    iget v0, p0, Lc4/u;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc4/u;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc4/u;->b:Ljava/lang/Object;

    check-cast v0, Lm/a0;

    invoke-virtual {v0}, Lm/a0;->H()Z

    return-void

    :pswitch_1
    iget-object v0, p0, Lc4/u;->b:Ljava/lang/Object;

    check-cast v0, Lav/b;

    invoke-virtual {v0}, Lav/b;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_2
    iget-object v0, p0, Lc4/u;->b:Ljava/lang/Object;

    check-cast v0, Ler/b;

    invoke-interface {v0}, Ler/b;->d()V

    return-void

    :pswitch_3
    iget-object v0, p0, Lc4/u;->b:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
