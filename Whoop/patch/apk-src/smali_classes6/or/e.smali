.class public final Lor/e;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lor/e;->a:I

    iput-object p1, p0, Lor/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget v0, p0, Lor/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lor/e;->b:Ljava/lang/Object;

    check-cast v0, Ls/v1;

    iget-object v1, v0, Ls/v1;->Z:Ls/v;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ls/v1;->c()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lor/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->i()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onInvalidated()V
    .locals 1

    iget v0, p0, Lor/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lor/e;->b:Ljava/lang/Object;

    check-cast v0, Ls/v1;

    invoke-virtual {v0}, Ls/v1;->dismiss()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lor/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->i()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
