.class public final synthetic Lcom/whoop/ui/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lcom/whoop/ui/j;->w:I

    iput-object p1, p0, Lcom/whoop/ui/j;->y:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/ui/j;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget v0, p0, Lcom/whoop/ui/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lcom/whoop/ui/j;->y:Ljava/lang/Object;

    check-cast p1, Ldb/o;

    iget-object v0, p1, Ldb/o;->e:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    iget v1, p1, Ldb/o;->d:I

    iget v2, p0, Lcom/whoop/ui/j;->x:I

    if-eq v2, v1, :cond_0

    iget-object p1, p1, Ldb/o;->c:[F

    aget p1, p1, v2

    invoke-static {v0, p1}, Ljo/s;->b(Ljo/s;F)V

    :cond_0
    iget-object p1, v0, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/whoop/ui/j;->y:Ljava/lang/Object;

    check-cast p1, Ldb/o;

    iget-object v0, p1, Ldb/o;->e:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    iget v1, p1, Ldb/o;->d:I

    iget v2, p0, Lcom/whoop/ui/j;->x:I

    if-eq v2, v1, :cond_1

    iget-object p1, p1, Ldb/o;->c:[F

    aget p1, p1, v2

    invoke-static {v0, p1}, Ldb/x;->a(Ldb/x;F)V

    :cond_1
    iget-object p1, v0, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/ui/j;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/k;

    iget v1, p0, Lcom/whoop/ui/j;->x:I

    invoke-static {v0, v1, p1}, Lcom/whoop/ui/k;->a(Lcom/whoop/ui/k;ILandroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
