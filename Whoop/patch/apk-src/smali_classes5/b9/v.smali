.class public final synthetic Lb9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Li5/o;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lb9/v;->w:I

    iput-object p1, p0, Lb9/v;->y:Ljava/lang/Object;

    iput p2, p0, Lb9/v;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lb9/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb9/v;->y:Ljava/lang/Object;

    check-cast v0, Lrm/k0;

    iget v1, p0, Lb9/v;->x:I

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0, v1}, Lrm/z0;->c(Lrm/k0;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/v;->y:Ljava/lang/Object;

    check-cast v0, Lu8/x;

    iget v1, p0, Lb9/v;->x:I

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0, v1}, Lu8/h0;->onMediaItemTransition(Lu8/x;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lb9/v;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c1;

    check-cast p1, Lu8/h0;

    iget-object v0, v0, Lb9/c1;->a:Lu8/o0;

    iget v1, p0, Lb9/v;->x:I

    invoke-interface {p1, v0, v1}, Lu8/h0;->onTimelineChanged(Lu8/o0;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Lb9/v;->y:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget v0, p0, Lb9/v;->x:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->I(I)V

    const/4 p1, 0x1

    return p1
.end method
