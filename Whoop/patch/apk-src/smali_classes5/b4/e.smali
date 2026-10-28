.class public final Lb4/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb4/l;


# direct methods
.method public synthetic constructor <init>(Lb4/l;I)V
    .locals 0

    iput p2, p0, Lb4/e;->w:I

    iput-object p1, p0, Lb4/e;->x:Lb4/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb4/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-object v1, p0, Lb4/e;->x:Lb4/l;

    packed-switch v0, :pswitch_data_1

    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_0

    :pswitch_0
    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/node/Owner;

    instance-of v0, p1, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/ui/platform/AndroidComposeView;

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    iget-object v0, p0, Lb4/e;->x:Lb4/l;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/h1;->getHolderToLayoutNode()Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
