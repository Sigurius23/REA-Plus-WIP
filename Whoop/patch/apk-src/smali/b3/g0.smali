.class public final Lb3/g0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb3/h0;


# direct methods
.method public synthetic constructor <init>(Lb3/h0;I)V
    .locals 0

    iput p2, p0, Lb3/g0;->w:I

    iput-object p1, p0, Lb3/g0;->x:Lb3/h0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lb3/g0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb3/v2;

    invoke-virtual {p1}, Lb3/v2;->U()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb3/g0;->x:Lb3/h0;

    iget-object v1, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La3/c2;

    move-result-object v1

    iget-object v2, v0, Lb3/h0;->P:Lb3/g0;

    new-instance v3, La3/z0;

    const/4 v4, 0x3

    invoke-direct {v3, v4, p1, v0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    iget-object v0, p0, Lb3/g0;->x:Lb3/h0;

    iget-object v1, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v0, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
