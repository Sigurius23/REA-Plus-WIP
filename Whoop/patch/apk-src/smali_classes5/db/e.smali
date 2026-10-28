.class public final synthetic Ldb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ldb/e;->a:I

    iput-object p1, p0, Ldb/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    iget v0, p0, Ldb/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lsv/d;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/mapbox/maps/threading/AnimationThreadController;->INSTANCE:Lcom/mapbox/maps/threading/AnimationThreadController;

    new-instance v2, Lr5/c;

    const/4 v3, 0x5

    invoke-direct {v2, v3, p1, v0}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/threading/AnimationThreadController;->postOnMainThread(Lc93/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/presentation/ui/SimpleDial;

    invoke-static {v0, p1}, Lrq0/i$b;->b(Lcom/whoop/community/presentation/ui/SimpleDial;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lrq/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr v1, p1

    float-to-int v1, v1

    iget-object v2, v0, Lrq/c;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iput p1, v0, Lrq/c;->x:F

    return-void

    :pswitch_2
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->q(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lq52/a;->a(Lkotlin/jvm/functions/Function1;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lm52/m;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->u0(Lm52/m;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/coaching/sleepcoach/wizard/d;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->H(Lcom/whoop/coaching/sleepcoach/wizard/d;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lkv/d;

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v1, v0, Lkv/d;->H:Llv/b;

    iget v1, v1, Llv/b;->G:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_1

    iget-object v0, v0, Lkv/d;->y:Lkv/a;

    if-eqz v0, :cond_0

    check-cast v0, Lkv/b;

    invoke-virtual {v0, p1}, Lkv/b;->setCompassAlpha(F)V

    goto :goto_0

    :cond_0
    const-string p1, "compassView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void

    :pswitch_7
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Ljo/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, Ljo/e;->i0:F

    iget-object p1, v0, Ljo/e;->w:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/internal/AnimationUtilsKt;->a(Landroid/view/View;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Lg23/a;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lg23/a;->y:Landroidx/room/v0;

    iget-object v1, v0, Lg23/a;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v0, v0, Lg23/a;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroidx/room/v0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_a
    iget-object v0, p0, Ldb/e;->b:Ljava/lang/Object;

    check-cast v0, Ldb/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, v0, Ldb/f;->i0:F

    iget-object p1, v0, Ldb/f;->w:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
