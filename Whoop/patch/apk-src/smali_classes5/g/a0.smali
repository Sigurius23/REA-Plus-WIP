.class public final Lg/a0;
.super Lg/t;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lg/a0;->d:I

    iput-object p1, p0, Lg/a0;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    iget v0, p0, Lg/a0;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg/a0;->e:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->r()Lt30/g;

    move-result-object v0

    sget-object v1, Lq30/c;->w:Lq30/c;

    invoke-virtual {v0, v1}, Lt30/g;->g(Lq30/h;)V

    return-void

    :pswitch_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lg/a0;->e:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f141007

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f141006

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, Llz/k;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Llz/k;-><init>(Ljava/lang/Object;I)V

    const v1, 0x7f141005

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/utils/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    const v2, 0x7f141004

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lg/a0;->e:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
