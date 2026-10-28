.class public final synthetic Lhe1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhe1/b;->a:I

    iput-object p1, p0, Lhe1/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lhe1/b;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, v0, Lhe1/b;->b:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-static {v2, v1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;->q(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_0
    iget-object v2, v0, Lhe1/b;->b:Ljava/lang/Object;

    check-cast v2, Lpq0/b;

    invoke-static {v2, v1}, Lpq0/b;->B(Lpq0/b;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_1
    iget-object v1, v0, Lhe1/b;->b:Ljava/lang/Object;

    check-cast v1, Lb9/b;

    iget-object v2, v1, Lb9/b;->E:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Lm23/d;

    iget-boolean v1, v1, Lb9/b;->x:Z

    iget-object v2, v5, Lm23/d;->K:Landroid/widget/ImageView;

    iget-object v11, v5, Lm23/d;->H:Landroid/view/View;

    iget-object v12, v5, Lm23/d;->J:Landroid/widget/FrameLayout;

    const-string v13, "<this>"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Landroid/view/View;->setVisibility(I)V

    iget-object v15, v5, Lm23/d;->L:Lio/getstream/photoview/dialog/common/pager/MultiTouchViewPager;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v15, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v5, Lm23/d;->W:Li23/a;

    if-eqz v4, :cond_0

    iget-object v6, v5, Lm23/d;->V:Ljava/lang/Object;

    iget v7, v5, Lm23/d;->b0:I

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4, v2, v6}, Li23/a;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_0
    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lg73/d;

    invoke-direct {v4, v2, v12}, Lg73/d;-><init>(Landroid/widget/ImageView;Landroid/widget/FrameLayout;)V

    iput-object v4, v5, Lm23/d;->a0:Lg73/d;

    iget-object v2, v5, Lm23/d;->I:Landroid/view/ViewGroup;

    move v4, v3

    new-instance v3, Landroidx/room/v0;

    const/4 v9, 0x0

    const/16 v10, 0x9

    move v6, v4

    const/4 v4, 0x2

    move v7, v6

    const-class v6, Lm23/d;

    move v8, v7

    const-string v7, "handleSwipeViewMove"

    move/from16 v16, v8

    const-string v8, "handleSwipeViewMove(FI)V"

    move/from16 v14, v16

    invoke-direct/range {v3 .. v10}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v4, Lg23/a;

    new-instance v6, Lm23/a;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v7}, Lm23/a;-><init>(Lm23/d;I)V

    new-instance v7, Lm23/a;

    const/4 v8, 0x1

    invoke-direct {v7, v5, v8}, Lm23/a;-><init>(Lm23/d;I)V

    invoke-direct {v4, v2, v6, v3, v7}, Lg23/a;-><init>(Landroid/view/View;Lm23/a;Landroidx/room/v0;Lm23/a;)V

    iput-object v4, v5, Lm23/d;->Q:Lg23/a;

    iget-object v2, v5, Lm23/d;->G:Landroid/view/ViewGroup;

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_2

    iget-object v1, v5, Lm23/d;->a0:Lg73/d;

    if-eqz v1, :cond_1

    iget-object v1, v5, Lm23/d;->E:[I

    const-string v3, "containerPadding"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v15, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const-string v1, "transitionImageAnimator"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v11, v2}, Landroid/view/View;->setAlpha(F)V

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v14}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    :pswitch_2
    iget-object v2, v0, Lhe1/b;->b:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    invoke-static {v2, v1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->E(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroid/content/DialogInterface;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
