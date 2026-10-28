.class public final Lyp/c;
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

    iput p2, p0, Lyp/c;->w:I

    iput-object p1, p0, Lyp/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lyp/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyp/c;->x:Ljava/lang/Object;

    check-cast v0, Lw5/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lw5/d;->n(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lyp/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;

    iget-object v1, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    iget v2, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:I

    invoke-virtual {v1, v2}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v1

    iget-object v2, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineTop(I)I

    move-result v1

    iget-object v0, v0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
