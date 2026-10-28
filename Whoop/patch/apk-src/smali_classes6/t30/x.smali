.class public final synthetic Lt30/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/InformationZoneView;I)V
    .locals 0

    iput p2, p0, Lt30/x;->w:I

    iput-object p1, p0, Lt30/x;->x:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, Lt30/x;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lt30/x;->x:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    iget-object v0, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->H:Landroidx/appcompat/widget/AppCompatImageView;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->E:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iget-object v2, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->F:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {p1, v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->a(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lt30/x;->x:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    iget-object v0, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->z:Landroidx/appcompat/widget/AppCompatImageView;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iget-object v2, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->x:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {p1, v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->a(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
