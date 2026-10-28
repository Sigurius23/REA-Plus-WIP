.class public final Ls/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ls/g0;->w:I

    iput-object p1, p0, Ls/g0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    iget p4, p0, Ls/g0;->w:I

    packed-switch p4, :pswitch_data_0

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpp/d;

    iget-object p2, p0, Ls/g0;->x:Ljava/lang/Object;

    check-cast p2, Lyp/f;

    new-instance p3, Landroid/content/Intent;

    iget-object p4, p2, Lyp/f;->F:Landroid/content/Context;

    const-class p5, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    invoke-direct {p3, p4, p5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p4, "license"

    invoke-virtual {p3, p4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p2, p3}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ls/g0;->x:Ljava/lang/Object;

    check-cast p1, Ls/i0;

    iget-object p4, p1, Ls/i0;->g0:Ls/l0;

    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p5

    if-eqz p5, :cond_0

    iget-object p5, p1, Ls/i0;->d0:Ls/f0;

    invoke-virtual {p5, p3}, Ls/f0;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    invoke-virtual {p1}, Ls/v1;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
