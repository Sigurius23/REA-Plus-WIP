.class public final synthetic Lkn2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lkn2/e;->w:I

    iput-object p1, p0, Lkn2/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    iget v0, p0, Lkn2/e;->w:I

    iget-object v1, p0, Lkn2/e;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-static {v1, p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->H(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :pswitch_0
    check-cast v1, Lu40/c;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, v1, Lu40/c;->z:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    move-result p1

    :goto_0
    return p1

    :pswitch_1
    check-cast v1, Landroid/widget/PopupWindow;

    invoke-static {v1, p1, p2}, Lcom/whoop/ui/views/TooltipView;->a(Landroid/widget/PopupWindow;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
