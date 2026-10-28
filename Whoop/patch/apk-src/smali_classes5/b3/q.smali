.class public final Lb3/q;
.super Lh5/b;
.source "SourceFile"


# instance fields
.field public final synthetic d:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final synthetic e:La3/n0;

.field public final synthetic f:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;La3/n0;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    iput-object p1, p0, Lb3/q;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Lb3/q;->e:La3/n0;

    iput-object p3, p0, Lb3/q;->f:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-direct {p0}, Lh5/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Li5/f;)V
    .locals 7

    iget-object v0, p2, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lh5/b;->a:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object p1, p0, Lb3/q;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, p1, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    invoke-virtual {v1}, Lb3/h0;->v()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    :cond_0
    iget-object v2, p0, Lb3/q;->e:La3/n0;

    invoke-virtual {v2}, La3/n0;->G()La3/n0;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v5, v3, La3/n0;->e0:La3/l1;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, La3/l1;->j(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, La3/n0;->G()La3/n0;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_3

    iget v3, v3, La3/n0;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_3
    const/4 v3, -0x1

    if-eqz v4, :cond_4

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v5

    invoke-virtual {v5}, Li3/r;->a()Li3/p;

    move-result-object v5

    iget v5, v5, Li3/p;->g:I

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v5, :cond_5

    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, p2, Li5/f;->b:I

    iget-object p2, p0, Lb3/q;->f:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    iget v2, v2, La3/n0;->x:I

    iget-object v4, v1, Lb3/h0;->E:La0/e0;

    invoke-virtual {v4, v2}, La0/e0;->d(I)I

    move-result v4

    if-eq v4, v3, :cond_7

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v5

    invoke-static {v5, v4}, Lb3/o0;->o(Lb3/h1;I)Lb4/l;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0, p2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    :goto_2
    iget-object v4, v1, Lb3/h0;->G:Ljava/lang/String;

    invoke-static {p1, v2, v0, v4}, Landroidx/compose/ui/platform/AndroidComposeView;->a(Landroidx/compose/ui/platform/AndroidComposeView;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    :cond_7
    iget-object v4, v1, Lb3/h0;->F:La0/e0;

    invoke-virtual {v4, v2}, La0/e0;->d(I)I

    move-result v4

    if-eq v4, v3, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v3

    invoke-static {v3, v4}, Lb3/o0;->o(Lb3/h1;I)Lb4/l;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v0, p2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;I)V

    :goto_3
    iget-object p2, v1, Lb3/h0;->H:Ljava/lang/String;

    invoke-static {p1, v2, v0, p2}, Landroidx/compose/ui/platform/AndroidComposeView;->a(Landroidx/compose/ui/platform/AndroidComposeView;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    :cond_9
    return-void
.end method
