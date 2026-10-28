.class public final Landroidx/fragment/app/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/t;->w:I

    iput-object p1, p0, Landroidx/fragment/app/t;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/t;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/s;

    iget-object v1, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/s;->e()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/t;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->callStartTransitionListener(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/t;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/y;

    invoke-static {v0}, Landroidx/fragment/app/y;->access$100(Landroidx/fragment/app/y;)Landroid/content/DialogInterface$OnDismissListener;

    move-result-object v1

    invoke-static {v0}, Landroidx/fragment/app/y;->access$000(Landroidx/fragment/app/y;)Landroid/app/Dialog;

    move-result-object v0

    invoke-interface {v1, v0}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
