.class public final Lb3/d0;
.super Lad3/z;
.source "SourceFile"


# instance fields
.field public final synthetic y:Lb3/h0;


# direct methods
.method public constructor <init>(Lb3/h0;)V
    .locals 0

    iput-object p1, p0, Lb3/d0;->y:Lb3/h0;

    const/16 p1, 0xe

    invoke-direct {p0, p1}, Lad3/z;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final d(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lb3/d0;->y:Lb3/h0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lb3/h0;->j(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final i(I)Li5/f;
    .locals 41

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v2, v0, Lb3/d0;->y:Lb3/h0;

    iget-object v3, v2, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    iget-object v4, v2, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v5, v5, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-interface {v5}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    sget-object v7, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne v5, v7, :cond_2

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v3

    new-instance v6, Li5/f;

    invoke-direct {v6, v3}, Li5/f;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    move v5, v1

    move-object v9, v2

    goto/16 :goto_5a

    :cond_2
    invoke-virtual {v2}, Lb3/h0;->t()La0/s;

    move-result-object v5

    invoke-virtual {v5, v1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    if-nez v5, :cond_3

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v3

    new-instance v6, Li5/f;

    invoke-direct {v6, v3}, Li5/f;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_1

    :cond_3
    iget-object v7, v5, Li3/q;->a:Li3/p;

    invoke-virtual {v7}, Li3/p;->k()Li3/l;

    move-result-object v8

    iget-object v9, v7, Li3/p;->c:La3/n0;

    sget-object v10, Li3/u;->n:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_4

    const/4 v8, 0x0

    :cond_4
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-static {v3}, Lx43/j;->J(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v10

    if-nez v10, :cond_5

    move v5, v1

    move-object v9, v2

    const/4 v6, 0x0

    goto/16 :goto_5a

    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v10

    new-instance v11, Li5/f;

    invoke-direct {v11, v10}, Li5/f;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x22

    const/4 v14, 0x0

    if-lt v12, v13, :cond_6

    invoke-static {v10, v8}, Li5/e;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    if-eqz v12, :cond_8

    const-string v13, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v15

    and-int/lit8 v15, v15, -0x41

    if-eqz v8, :cond_7

    const/16 v8, 0x40

    goto :goto_2

    :cond_7
    move v8, v14

    :goto_2
    or-int/2addr v8, v15

    invoke-virtual {v12, v13, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_8
    :goto_3
    const/4 v8, -0x1

    if-ne v1, v8, :cond_a

    invoke-virtual {v4}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v12

    instance-of v13, v12, Landroid/view/View;

    if-eqz v13, :cond_9

    check-cast v12, Landroid/view/View;

    goto :goto_4

    :cond_9
    const/4 v12, 0x0

    :goto_4
    iput v8, v11, Li5/f;->b:I

    invoke-virtual {v10, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Li3/p;->l()Li3/p;

    move-result-object v12

    if-eqz v12, :cond_b

    iget v12, v12, Li3/p;->g:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_5

    :cond_b
    const/4 v12, 0x0

    :goto_5
    if-eqz v12, :cond_ad

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v13

    invoke-virtual {v13}, Li3/r;->a()Li3/p;

    move-result-object v13

    iget v13, v13, Li3/p;->g:I

    if-ne v12, v13, :cond_c

    move v12, v8

    :cond_c
    iput v12, v11, Li5/f;->b:I

    invoke-virtual {v10, v4, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    :goto_6
    iput v1, v11, Li5/f;->c:I

    invoke-virtual {v10, v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    invoke-virtual {v2, v5}, Lb3/h0;->k(Li3/q;)Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    sget-object v5, Lb3/h0;->Q:La0/f0;

    iget-object v12, v2, Lb3/h0;->M:La0/e0;

    iget-object v13, v2, Lb3/h0;->v:La0/g1;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    const-string v6, "android.view.View"

    invoke-virtual {v11, v6}, Li5/f;->h(Ljava/lang/CharSequence;)V

    iget-object v6, v7, Li3/p;->d:Li3/l;

    iget-object v14, v6, Li3/l;->w:La0/v0;

    sget-object v8, Li3/u;->E:Li3/y;

    invoke-virtual {v14, v8}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const-string v8, "android.widget.EditText"

    invoke-virtual {v11, v8}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :cond_d
    sget-object v8, Li3/u;->A:Li3/y;

    invoke-virtual {v14, v8}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "android.widget.TextView"

    invoke-virtual {v11, v8}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :cond_e
    sget-object v8, Li3/u;->x:Li3/y;

    invoke-virtual {v14, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_f

    const/4 v8, 0x0

    :cond_f
    check-cast v8, Li3/i;

    if-eqz v8, :cond_14

    iget v0, v8, Li3/i;->a:I

    move-object/from16 v18, v3

    iget-boolean v3, v7, Li3/p;->e:Z

    if-nez v3, :cond_10

    const/4 v3, 0x4

    invoke-static {v3, v7}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v17

    move-object/from16 v19, v13

    if-eqz v17, :cond_15

    goto :goto_7

    :cond_10
    const/4 v3, 0x4

    move-object/from16 v19, v13

    :goto_7
    const-string v13, "AccessibilityNodeInfo.roleDescription"

    if-ne v0, v3, :cond_11

    const v0, 0x7f14112b

    invoke-virtual {v15, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v13, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_11
    const/4 v3, 0x2

    if-ne v0, v3, :cond_12

    const v0, 0x7f14112a

    invoke-virtual {v15, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v13, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_12
    invoke-static {v0}, Lb3/o0;->p(I)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x5

    if-ne v0, v13, :cond_13

    invoke-virtual {v7}, Li3/p;->p()Z

    move-result v0

    if-nez v0, :cond_13

    iget-boolean v0, v6, Li3/l;->y:Z

    if-eqz v0, :cond_15

    :cond_13
    invoke-virtual {v11, v3}, Li5/f;->h(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_14
    move-object/from16 v18, v3

    move-object/from16 v19, v13

    :cond_15
    :goto_8
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    invoke-static {v7}, Li3/s;->f(Li3/p;)Z

    move-result v0

    invoke-virtual {v10, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    invoke-static/range {v18 .. v18}, Lx43/j;->J(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v0

    const/4 v3, 0x4

    invoke-static {v3, v7}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v13

    move-object v3, v13

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v18, v0

    move-object/from16 v20, v5

    move-object/from16 v21, v9

    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_9
    iget-object v9, v11, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-ge v0, v3, :cond_1d

    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    move/from16 v23, v0

    move-object/from16 v0, v22

    check-cast v0, Li3/p;

    move/from16 v22, v3

    invoke-virtual {v2}, Lb3/h0;->t()La0/s;

    move-result-object v3

    move-object/from16 v24, v13

    iget v13, v0, Li3/p;->g:I

    invoke-virtual {v3, v13}, La0/s;->a(I)Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v3

    invoke-virtual {v3}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v3

    iget-object v0, v0, Li3/p;->c:La3/n0;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/l;

    const/4 v3, -0x1

    if-ne v13, v3, :cond_16

    goto :goto_c

    :cond_16
    if-eqz v0, :cond_17

    invoke-virtual {v10, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    goto :goto_b

    :cond_17
    invoke-virtual {v2}, Lb3/h0;->t()La0/s;

    move-result-object v0

    invoke-virtual {v0, v13}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/q;

    if-eqz v0, :cond_19

    iget-object v0, v0, Li3/q;->a:Li3/p;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v0

    sget-object v3, Li3/u;->n:Li3/y;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    invoke-virtual {v0, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_18

    const/4 v0, 0x0

    :cond_18
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_a

    :cond_19
    const/4 v0, 0x0

    :goto_a
    if-nez v18, :cond_1a

    if-nez v0, :cond_1b

    :cond_1a
    invoke-virtual {v9, v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    :cond_1b
    :goto_b
    invoke-virtual {v12, v13, v5}, La0/e0;->f(II)V

    add-int/lit8 v5, v5, 0x1

    :cond_1c
    :goto_c
    add-int/lit8 v0, v23, 0x1

    move/from16 v3, v22

    move-object/from16 v13, v24

    goto :goto_9

    :cond_1d
    iget v0, v2, Lb3/h0;->n:I

    const/4 v3, 0x1

    if-ne v1, v0, :cond_1e

    invoke-virtual {v9, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    sget-object v0, Li5/d;->g:Li5/d;

    invoke-virtual {v11, v0}, Li5/f;->b(Li5/d;)V

    goto :goto_d

    :cond_1e
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    sget-object v0, Li5/d;->f:Li5/d;

    invoke-virtual {v11, v0}, Li5/f;->b(Li5/d;)V

    :goto_d
    invoke-static {v7}, Lb3/o0;->j(Li3/p;)Ll3/g;

    move-result-object v0

    if-eqz v0, :cond_39

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getFontFamilyResolver()Lp3/h;

    move-result-object v5

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Ly3/c;

    move-result-object v25

    iget-object v13, v2, Lb3/h0;->I:Ls/m2;

    new-instance v3, Landroid/text/SpannableString;

    move-object/from16 v28, v5

    iget-object v5, v0, Ll3/g;->x:Ljava/lang/String;

    move-object/from16 v29, v4

    iget-object v4, v0, Ll3/g;->w:Ljava/util/List;

    invoke-direct {v3, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object/from16 v30, v5

    iget-object v5, v0, Ll3/g;->y:Ljava/util/ArrayList;

    move-object/from16 v31, v2

    if-eqz v5, :cond_2b

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v2

    move-object/from16 v32, v12

    const/4 v12, 0x0

    :goto_e
    if-ge v12, v2, :cond_2a

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    move/from16 v33, v2

    move-object/from16 v2, v22

    check-cast v2, Ll3/e;

    move-object/from16 v34, v5

    iget-object v5, v2, Ll3/e;->a:Ljava/lang/Object;

    check-cast v5, Ll3/m0;

    move/from16 v35, v12

    iget v12, v2, Ll3/e;->b:I

    iget v2, v2, Ll3/e;->c:I

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    const-wide/16 v6, 0x0

    const v1, 0xffdf

    move-object/from16 v38, v8

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8, v1}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    iget-object v5, v1, Ll3/m0;->a:Lw3/o;

    iget-object v6, v1, Ll3/m0;->j:Lw3/p;

    iget-object v7, v1, Ll3/m0;->m:Lw3/l;

    iget-object v8, v1, Ll3/m0;->f:Lp3/i;

    move-object/from16 v22, v5

    iget-object v5, v1, Ll3/m0;->d:Lp3/n;

    move-object/from16 v40, v9

    move-object/from16 v39, v10

    invoke-interface/range {v22 .. v22}, Lw3/o;->b()J

    move-result-wide v9

    invoke-static {v3, v9, v10, v12, v2}, Ldt/b;->P(Landroid/text/Spannable;JII)V

    iget-wide v9, v1, Ll3/m0;->b:J

    move/from16 v27, v2

    move-object/from16 v22, v3

    move-wide/from16 v23, v9

    move/from16 v26, v12

    invoke-static/range {v22 .. v27}, Ldt/b;->Q(Landroid/text/Spannable;JLy3/c;II)V

    move-object/from16 v2, v22

    move/from16 v3, v26

    move/from16 v9, v27

    iget-object v10, v1, Ll3/m0;->c:Lp3/r;

    if-nez v10, :cond_20

    if-eqz v5, :cond_1f

    goto :goto_f

    :cond_1f
    const/16 v5, 0x21

    goto :goto_11

    :cond_20
    :goto_f
    if-nez v10, :cond_21

    sget-object v10, Lp3/r;->F:Lp3/r;

    :cond_21
    if-eqz v5, :cond_22

    iget v5, v5, Lp3/n;->a:I

    goto :goto_10

    :cond_22
    const/4 v5, 0x0

    :goto_10
    new-instance v12, Landroid/text/style/StyleSpan;

    invoke-static {v10, v5}, Lse/g;->x(Lp3/r;I)I

    move-result v5

    invoke-direct {v12, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v5, 0x21

    invoke-virtual {v2, v12, v3, v9, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_11
    if-eqz v8, :cond_23

    instance-of v10, v8, Lp3/t;

    if-eqz v10, :cond_24

    new-instance v10, Landroid/text/style/TypefaceSpan;

    check-cast v8, Lp3/t;

    iget-object v8, v8, Lp3/t;->F:Ljava/lang/String;

    invoke-direct {v10, v8}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10, v3, v9, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_23
    move v8, v5

    move-object/from16 v22, v15

    goto :goto_13

    :cond_24
    iget-object v5, v1, Ll3/m0;->e:Lp3/o;

    if-eqz v5, :cond_25

    iget v5, v5, Lp3/o;->a:I

    goto :goto_12

    :cond_25
    const v5, 0xffff

    :goto_12
    sget-object v10, Lp3/r;->F:Lp3/r;

    move-object/from16 v12, v28

    check-cast v12, Lp3/j;

    move-object/from16 v22, v15

    const/4 v15, 0x0

    invoke-virtual {v12, v8, v10, v15, v5}, Lp3/j;->b(Lp3/i;Lp3/r;II)Lp3/e0;

    move-result-object v5

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/graphics/Typeface;

    invoke-static {v5}, Lt3/i;->a(Landroid/graphics/Typeface;)Landroid/text/style/TypefaceSpan;

    move-result-object v5

    const/16 v8, 0x21

    invoke-virtual {v2, v5, v3, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :goto_13
    if-eqz v7, :cond_27

    iget v5, v7, Lw3/l;->a:I

    or-int/lit8 v7, v5, 0x1

    if-ne v7, v5, :cond_26

    new-instance v7, Landroid/text/style/UnderlineSpan;

    invoke-direct {v7}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v2, v7, v3, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_26
    or-int/lit8 v7, v5, 0x2

    if-ne v7, v5, :cond_27

    new-instance v5, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v5}, Landroid/text/style/StrikethroughSpan;-><init>()V

    invoke-virtual {v2, v5, v3, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_27
    if-eqz v6, :cond_28

    new-instance v5, Landroid/text/style/ScaleXSpan;

    iget v6, v6, Lw3/p;->a:F

    invoke-direct {v5, v6}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    invoke-virtual {v2, v5, v3, v9, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_28
    iget-object v5, v1, Ll3/m0;->k:Ls3/b;

    invoke-static {v2, v5, v3, v9}, Ldt/b;->R(Landroid/text/Spannable;Ls3/b;II)V

    iget-wide v5, v1, Ll3/m0;->l:J

    const-wide/16 v7, 0x10

    cmp-long v1, v5, v7

    if-eqz v1, :cond_29

    new-instance v1, Landroid/text/style/BackgroundColorSpan;

    invoke-static {v5, v6}, Li2/w0;->H(J)I

    move-result v5

    invoke-direct {v1, v5}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v5, 0x21

    invoke-virtual {v2, v1, v3, v9, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_29
    add-int/lit8 v12, v35, 0x1

    move/from16 v1, p1

    move-object v3, v2

    move-object/from16 v15, v22

    move/from16 v2, v33

    move-object/from16 v5, v34

    move-object/from16 v7, v36

    move-object/from16 v6, v37

    move-object/from16 v8, v38

    move-object/from16 v10, v39

    move-object/from16 v9, v40

    goto/16 :goto_e

    :cond_2a
    :goto_14
    move-object v2, v3

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    move-object/from16 v38, v8

    move-object/from16 v40, v9

    move-object/from16 v39, v10

    move-object/from16 v22, v15

    goto :goto_15

    :cond_2b
    move-object/from16 v32, v12

    goto :goto_14

    :goto_15
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_2d

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_16
    if-ge v7, v6, :cond_2e

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ll3/e;

    iget-object v10, v9, Ll3/e;->a:Ljava/lang/Object;

    instance-of v10, v10, Ll3/x0;

    if-eqz v10, :cond_2c

    iget v10, v9, Ll3/e;->b:I

    iget v9, v9, Ll3/e;->c:I

    const/4 v15, 0x0

    invoke-static {v15, v1, v10, v9}, Ll3/h;->b(IIII)Z

    move-result v9

    if-eqz v9, :cond_2c

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    add-int/lit8 v7, v7, 0x1

    goto :goto_16

    :cond_2d
    move-object v5, v3

    :cond_2e
    move-object v1, v5

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v6, 0x0

    :goto_17
    if-ge v6, v1, :cond_2f

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll3/e;

    iget-object v8, v7, Ll3/e;->a:Ljava/lang/Object;

    check-cast v8, Ll3/x0;

    iget v9, v7, Ll3/e;->b:I

    iget v7, v7, Ll3/e;->c:I

    invoke-static {v8}, Ls4/d;->k(Ll3/x0;)Landroid/text/style/TtsSpan;

    move-result-object v8

    const/16 v10, 0x21

    invoke-virtual {v2, v8, v9, v7, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_17

    :cond_2f
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v4, :cond_31

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_18
    if-ge v6, v5, :cond_31

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ll3/e;

    iget-object v9, v8, Ll3/e;->a:Ljava/lang/Object;

    instance-of v9, v9, Ll3/w0;

    if-eqz v9, :cond_30

    iget v9, v8, Ll3/e;->b:I

    iget v8, v8, Ll3/e;->c:I

    const/4 v15, 0x0

    invoke-static {v15, v1, v9, v8}, Ll3/h;->b(IIII)Z

    move-result v8

    if-eqz v8, :cond_30

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    :cond_31
    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_19
    if-ge v4, v1, :cond_33

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll3/e;

    iget-object v6, v5, Ll3/e;->a:Ljava/lang/Object;

    check-cast v6, Ll3/w0;

    iget v7, v5, Ll3/e;->b:I

    iget v5, v5, Ll3/e;->c:I

    iget-object v8, v13, Ls/m2;->w:Ljava/lang/Object;

    check-cast v8, Ljava/util/WeakHashMap;

    invoke-virtual {v8, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_32

    new-instance v9, Landroid/text/style/URLSpan;

    invoke-virtual {v6}, Ll3/w0;->a()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_32
    check-cast v9, Landroid/text/style/URLSpan;

    const/16 v8, 0x21

    invoke-virtual {v2, v9, v7, v5, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_19

    :cond_33
    invoke-virtual/range {v30 .. v30}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ll3/g;->a(I)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_1a
    if-ge v3, v1, :cond_38

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    iget v5, v4, Ll3/e;->b:I

    iget-object v6, v4, Ll3/e;->a:Ljava/lang/Object;

    iget v7, v4, Ll3/e;->c:I

    if-eq v5, v7, :cond_37

    move-object v8, v6

    check-cast v8, Ll3/v;

    instance-of v9, v8, Ll3/u;

    if-eqz v9, :cond_35

    move-object v9, v8

    check-cast v9, Ll3/u;

    iget-object v9, v9, Ll3/u;->c:Li20/z0;

    if-nez v9, :cond_35

    new-instance v4, Ll3/e;

    const-string v8, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ll3/u;

    invoke-direct {v4, v6, v5, v7}, Ll3/e;-><init>(Ljava/lang/Object;II)V

    iget-object v8, v13, Ls/m2;->x:Ljava/lang/Object;

    check-cast v8, Ljava/util/WeakHashMap;

    invoke-virtual {v8, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_34

    new-instance v9, Landroid/text/style/URLSpan;

    iget-object v6, v6, Ll3/u;->a:Ljava/lang/String;

    invoke-direct {v9, v6}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_34
    check-cast v9, Landroid/text/style/URLSpan;

    const/16 v8, 0x21

    invoke-virtual {v2, v9, v5, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1b

    :cond_35
    iget-object v6, v13, Ls/m2;->y:Ljava/lang/Object;

    check-cast v6, Ljava/util/WeakHashMap;

    invoke-virtual {v6, v4}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_36

    new-instance v9, Lt3/e;

    invoke-direct {v9, v8}, Lt3/e;-><init>(Ll3/v;)V

    invoke-virtual {v6, v4, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_36
    check-cast v9, Landroid/text/style/ClickableSpan;

    const/16 v8, 0x21

    invoke-virtual {v2, v9, v5, v7, v8}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1b

    :cond_37
    const/16 v8, 0x21

    :goto_1b
    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    :cond_38
    invoke-static {v2}, Lb3/h0;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableString;

    goto :goto_1c

    :cond_39
    move-object/from16 v31, v2

    move-object/from16 v29, v4

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    move-object/from16 v38, v8

    move-object/from16 v40, v9

    move-object/from16 v39, v10

    move-object/from16 v32, v12

    move-object/from16 v22, v15

    const/4 v0, 0x0

    :goto_1c
    invoke-virtual {v11, v0}, Li5/f;->l(Ljava/lang/CharSequence;)V

    sget-object v0, Li3/u;->K:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    move-object/from16 v1, v39

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3a

    const/4 v0, 0x0

    :cond_3a
    check-cast v0, Ljava/lang/CharSequence;

    move-object/from16 v2, v40

    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    :goto_1d
    move-object/from16 v3, v22

    move-object/from16 v0, v36

    goto :goto_1e

    :cond_3b
    move-object/from16 v1, v39

    move-object/from16 v2, v40

    goto :goto_1d

    :goto_1e
    invoke-static {v0, v3}, Lb3/o0;->i(Li3/p;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v5, v6, :cond_3c

    invoke-static {v2, v4}, Le3/c;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    goto :goto_1f

    :cond_3c
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :goto_1f
    invoke-static {v0}, Lb3/o0;->h(Li3/p;)Z

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    sget-object v4, Li3/u;->I:Li3/y;

    invoke-virtual {v14, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3d

    const/4 v4, 0x0

    :cond_3d
    check-cast v4, Lk3/a;

    if-eqz v4, :cond_3f

    sget-object v5, Lk3/a;->w:Lk3/a;

    if-ne v4, v5, :cond_3e

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    goto :goto_20

    :cond_3e
    sget-object v5, Lk3/a;->x:Lk3/a;

    if-ne v4, v5, :cond_3f

    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    :cond_3f
    :goto_20
    sget-object v4, Li3/u;->H:Li3/y;

    invoke-virtual {v14, v4}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_40

    const/4 v4, 0x0

    :cond_40
    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_43

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v38, :cond_41

    move-object/from16 v8, v38

    goto :goto_21

    :cond_41
    move-object/from16 v8, v38

    iget v5, v8, Li3/i;->a:I

    const/4 v6, 0x4

    if-ne v5, v6, :cond_42

    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    goto :goto_22

    :cond_42
    :goto_21
    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    :goto_22
    move-object/from16 v4, v37

    goto :goto_23

    :cond_43
    move-object/from16 v8, v38

    goto :goto_22

    :goto_23
    iget-boolean v5, v4, Li3/l;->y:Z

    if-eqz v5, :cond_44

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x4

    invoke-static {v5, v0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_46

    :cond_44
    sget-object v5, Li3/u;->a:Li3/y;

    invoke-static {v4, v5}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_45

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_24

    :cond_45
    const/4 v5, 0x0

    :goto_24
    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_46
    sget-object v5, Li3/u;->y:Li3/y;

    invoke-static {v4, v5}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_49

    move-object v6, v0

    :goto_25
    if-eqz v6, :cond_48

    iget-object v7, v6, Li3/p;->d:Li3/l;

    sget-object v9, Li3/v;->a:Li3/y;

    iget-object v10, v7, Li3/l;->w:La0/v0;

    invoke-virtual {v10, v9}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_47

    invoke-virtual {v7, v9}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_26

    :cond_47
    invoke-virtual {v6}, Li3/p;->l()Li3/p;

    move-result-object v6

    goto :goto_25

    :cond_48
    const/4 v6, 0x0

    :goto_26
    if-eqz v6, :cond_49

    invoke-virtual {v1, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    :cond_49
    sget-object v5, Li3/u;->h:Li3/y;

    invoke-static {v4, v5}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/a0;

    if-eqz v5, :cond_4a

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    :cond_4a
    move/from16 v5, p1

    const/4 v6, -0x1

    if-eq v5, v6, :cond_4c

    iget v7, v0, Li3/p;->g:I

    move-object/from16 v9, v32

    invoke-virtual {v9, v7}, La0/e0;->d(I)I

    move-result v7

    if-eq v7, v6, :cond_4b

    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    goto :goto_27

    :cond_4b
    const-string v6, "AccessibilityDelegate"

    const-string v7, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4c
    :goto_27
    sget-object v6, Li3/u;->J:Li3/y;

    invoke-virtual {v14, v6}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v1, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    sget-object v6, Li3/u;->M:Li3/y;

    invoke-virtual {v14, v6}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v1, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    sget-object v6, Li3/u;->N:Li3/y;

    invoke-static {v4, v6}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_4d

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_28

    :cond_4d
    const/4 v6, -0x1

    :goto_28
    invoke-virtual {v2, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v6

    invoke-virtual {v2, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    sget-object v6, Li3/u;->k:Li3/y;

    invoke-virtual {v14, v6}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v2, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    move-result v7

    if-eqz v7, :cond_4f

    invoke-virtual {v4, v6}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual {v2, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v7

    if-eqz v7, :cond_4e

    const/4 v7, 0x2

    invoke-virtual {v11, v7}, Li5/f;->a(I)V

    move-object/from16 v9, v31

    iput v5, v9, Lb3/h0;->o:I

    :goto_29
    const/4 v10, 0x1

    goto :goto_2a

    :cond_4e
    move-object/from16 v9, v31

    const/4 v7, 0x2

    const/4 v10, 0x1

    invoke-virtual {v11, v10}, Li5/f;->a(I)V

    goto :goto_2a

    :cond_4f
    move-object/from16 v9, v31

    const/4 v7, 0x2

    goto :goto_29

    :goto_2a
    invoke-static {v0}, Li3/s;->e(Li3/p;)Z

    move-result v12

    xor-int/2addr v12, v10

    invoke-virtual {v2, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    sget-object v10, Li3/u;->j:Li3/y;

    invoke-static {v4, v10}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li3/f;

    if-eqz v10, :cond_54

    iget v10, v10, Li3/f;->a:I

    if-nez v10, :cond_50

    const/4 v12, 0x1

    goto :goto_2b

    :cond_50
    const/4 v12, 0x0

    :goto_2b
    if-eqz v12, :cond_52

    :cond_51
    const/4 v7, 0x1

    goto :goto_2d

    :cond_52
    const/4 v12, 0x1

    if-ne v10, v12, :cond_53

    const/4 v10, 0x1

    goto :goto_2c

    :cond_53
    const/4 v10, 0x0

    :goto_2c
    if-eqz v10, :cond_51

    :goto_2d
    invoke-virtual {v1, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    :cond_54
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    sget-object v7, Li3/k;->b:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_5d

    sget-object v10, Li3/u;->H:Li3/y;

    invoke-static {v4, v10}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v8, :cond_56

    :cond_55
    const/4 v12, 0x0

    goto :goto_2e

    :cond_56
    iget v12, v8, Li3/i;->a:I

    const/4 v13, 0x4

    if-ne v12, v13, :cond_55

    const/4 v12, 0x1

    :goto_2e
    if-nez v12, :cond_5a

    if-nez v8, :cond_58

    :cond_57
    const/4 v8, 0x0

    goto :goto_2f

    :cond_58
    iget v8, v8, Li3/i;->a:I

    const/4 v12, 0x3

    if-ne v8, v12, :cond_57

    const/4 v8, 0x1

    :goto_2f
    if-eqz v8, :cond_59

    goto :goto_30

    :cond_59
    const/4 v8, 0x0

    goto :goto_31

    :cond_5a
    :goto_30
    const/4 v8, 0x1

    :goto_31
    if-eqz v8, :cond_5c

    if-eqz v8, :cond_5b

    if-nez v10, :cond_5b

    goto :goto_32

    :cond_5b
    const/4 v8, 0x0

    goto :goto_33

    :cond_5c
    :goto_32
    const/4 v8, 0x1

    :goto_33
    invoke-virtual {v2, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v8

    if-eqz v8, :cond_5d

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v8

    if-eqz v8, :cond_5d

    new-instance v8, Li5/d;

    const/16 v10, 0x10

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_5d
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    sget-object v7, Li3/k;->c:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_5e

    const/4 v10, 0x1

    invoke-virtual {v2, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v8

    if-eqz v8, :cond_5e

    new-instance v8, Li5/d;

    const/16 v10, 0x20

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_5e
    sget-object v7, Li3/k;->p:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_5f

    new-instance v8, Li5/d;

    const/16 v10, 0x4000

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_5f
    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v7

    if-eqz v7, :cond_64

    sget-object v7, Li3/k;->j:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_60

    new-instance v8, Li5/d;

    const/high16 v10, 0x200000

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_60
    sget-object v7, Li3/k;->o:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_61

    new-instance v8, Li5/d;

    const v10, 0x1020054

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_61
    sget-object v7, Li3/k;->q:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_62

    new-instance v8, Li5/d;

    const/high16 v10, 0x10000

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_62
    sget-object v7, Li3/k;->r:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    if-eqz v7, :cond_64

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v8

    if-eqz v8, :cond_64

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Lb3/j;

    move-result-object v8

    iget-object v8, v8, Lb3/j;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v8}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v8

    if-eqz v8, :cond_63

    const-string v10, "text/*"

    invoke-virtual {v8, v10}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v8

    goto :goto_34

    :cond_63
    move v8, v15

    :goto_34
    if-eqz v8, :cond_64

    new-instance v8, Li5/d;

    const v10, 0x8000

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    :cond_64
    invoke-static {v0}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_66

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_65

    goto :goto_35

    :cond_65
    move v7, v15

    goto :goto_36

    :cond_66
    :goto_35
    const/4 v7, 0x1

    :goto_36
    if-nez v7, :cond_71

    invoke-virtual {v9, v0}, Lb3/h0;->s(Li3/p;)I

    move-result v7

    invoke-virtual {v9, v0}, Lb3/h0;->r(Li3/p;)I

    move-result v8

    invoke-virtual {v1, v7, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    sget-object v7, Li3/k;->i:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li3/a;

    new-instance v8, Li5/d;

    if-eqz v7, :cond_67

    iget-object v7, v7, Li3/a;->a:Ljava/lang/String;

    goto :goto_37

    :cond_67
    const/4 v7, 0x0

    :goto_37
    const/high16 v10, 0x20000

    invoke-direct {v8, v10, v7}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    const/16 v7, 0x100

    invoke-virtual {v11, v7}, Li5/f;->a(I)V

    const/16 v7, 0x200

    invoke-virtual {v11, v7}, Li5/f;->a(I)V

    const/16 v7, 0xb

    invoke-virtual {v2, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    sget-object v7, Li3/u;->a:Li3/y;

    invoke-static {v4, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    check-cast v7, Ljava/util/Collection;

    if-eqz v7, :cond_69

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_68

    goto :goto_38

    :cond_68
    move v7, v15

    goto :goto_39

    :cond_69
    :goto_38
    const/4 v7, 0x1

    :goto_39
    if-eqz v7, :cond_71

    sget-object v7, Li3/k;->a:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_71

    sget-object v7, Li3/u;->E:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6a

    invoke-static {v4, v6}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6a

    goto :goto_3e

    :cond_6a
    invoke-virtual/range {v21 .. v21}, La3/n0;->G()La3/n0;

    move-result-object v7

    :goto_3a
    if-eqz v7, :cond_6d

    invoke-virtual {v7}, La3/n0;->I()Li3/l;

    move-result-object v8

    if-eqz v8, :cond_6b

    iget-boolean v10, v8, Li3/l;->y:Z

    const/4 v12, 0x1

    if-ne v10, v12, :cond_6b

    sget-object v10, Li3/u;->E:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6b

    const/4 v8, 0x1

    goto :goto_3b

    :cond_6b
    move v8, v15

    :goto_3b
    if-eqz v8, :cond_6c

    goto :goto_3c

    :cond_6c
    invoke-virtual {v7}, La3/n0;->G()La3/n0;

    move-result-object v7

    goto :goto_3a

    :cond_6d
    const/4 v7, 0x0

    :goto_3c
    if-eqz v7, :cond_70

    invoke-virtual {v7}, La3/n0;->I()Li3/l;

    move-result-object v7

    if-eqz v7, :cond_6f

    iget-object v7, v7, Li3/l;->w:La0/v0;

    invoke-virtual {v7, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_6e

    const/4 v6, 0x0

    :cond_6e
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3d

    :cond_6f
    move v6, v15

    :goto_3d
    if-nez v6, :cond_70

    :goto_3e
    const/4 v6, 0x1

    goto :goto_3f

    :cond_70
    move v6, v15

    :goto_3f
    if-nez v6, :cond_71

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    move-result v6

    or-int/lit8 v6, v6, 0x14

    invoke-virtual {v2, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    :cond_71
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-string v7, "androidx.compose.ui.semantics.id"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Li5/f;->g()Ljava/lang/CharSequence;

    move-result-object v7

    if-eqz v7, :cond_73

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_72

    goto :goto_40

    :cond_72
    move v7, v15

    goto :goto_41

    :cond_73
    :goto_40
    const/4 v7, 0x1

    :goto_41
    if-nez v7, :cond_74

    sget-object v7, Li3/k;->a:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_74

    const-string v7, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_74
    sget-object v7, Li3/u;->y:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_75

    const-string v7, "androidx.compose.ui.semantics.testTag"

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_75
    sget-object v7, Li3/u;->O:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_76

    const-string v7, "androidx.compose.ui.semantics.shapeCorners"

    const-string v8, "androidx.compose.ui.semantics.shapeRegion"

    const-string v10, "androidx.compose.ui.semantics.shapeType"

    const-string v12, "androidx.compose.ui.semantics.shapeRect"

    invoke-static {v6, v10, v12, v7, v8}, Ld;->C(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_76
    invoke-virtual {v1, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAvailableExtraData(Ljava/util/List;)V

    sget-object v1, Li3/u;->c:Li3/y;

    invoke-static {v4, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/h;

    if-eqz v1, :cond_7b

    iget v4, v1, Li3/h;->a:F

    iget-object v6, v1, Li3/h;->b:Li93/f;

    sget-object v7, Li3/k;->h:Li3/y;

    invoke-virtual {v14, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_77

    const-string v8, "android.widget.SeekBar"

    invoke-virtual {v11, v8}, Li5/f;->h(Ljava/lang/CharSequence;)V

    goto :goto_42

    :cond_77
    const-string v8, "android.widget.ProgressBar"

    invoke-virtual {v11, v8}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :goto_42
    sget-object v8, Li3/h;->d:Li3/h;

    if-eq v1, v8, :cond_78

    invoke-interface {v6}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v6}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    new-instance v10, Lbu/c;

    const/4 v12, 0x1

    invoke-static {v12, v1, v8, v4}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object v1

    invoke-direct {v10, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iget-object v1, v10, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    iget-object v8, v11, Li5/f;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v8, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    :cond_78
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7b

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v1

    if-eqz v1, :cond_7b

    invoke-interface {v6}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v6}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v1, v7}, Le93/b;->j(FF)F

    move-result v1

    cmpg-float v1, v4, v1

    if-gez v1, :cond_79

    sget-object v1, Li5/d;->h:Li5/d;

    invoke-virtual {v11, v1}, Li5/f;->b(Li5/d;)V

    :cond_79
    invoke-interface {v6}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v6}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    cmpl-float v7, v1, v6

    if-lez v7, :cond_7a

    move v1, v6

    :cond_7a
    cmpl-float v1, v4, v1

    if-lez v1, :cond_7b

    sget-object v1, Li5/d;->i:Li5/d;

    invoke-virtual {v11, v1}, Li5/f;->b(Li5/d;)V

    :cond_7b
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v4

    if-eqz v4, :cond_7d

    iget-object v4, v0, Li3/p;->d:Li3/l;

    sget-object v6, Li3/k;->h:Li3/y;

    iget-object v4, v4, Li3/l;->w:La0/v0;

    invoke-virtual {v4, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_7c

    const/4 v4, 0x0

    :cond_7c
    check-cast v4, Li3/a;

    if-eqz v4, :cond_7d

    new-instance v6, Li5/d;

    const v7, 0x102003d

    iget-object v4, v4, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v6, v7, v4}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v6}, Li5/f;->b(Li5/d;)V

    :cond_7d
    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v4

    sget-object v6, Li3/u;->f:Li3/y;

    iget-object v4, v4, Li3/l;->w:La0/v0;

    invoke-virtual {v4, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v4, :cond_7e

    move-object v4, v6

    :cond_7e
    check-cast v4, Li3/b;

    const/4 v7, 0x0

    if-eqz v4, :cond_7f

    iget v6, v4, Li3/b;->a:I

    iget v4, v4, Li3/b;->b:I

    invoke-static {v6, v4, v7, v7}, Lg9/b;->c(IIIZ)Lg9/b;

    move-result-object v4

    invoke-virtual {v11, v4}, Li5/f;->i(Lg9/b;)V

    goto :goto_46

    :cond_7f
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v10, Li3/u;->e:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_80

    goto :goto_43

    :cond_80
    move-object v6, v8

    :goto_43
    if-eqz v6, :cond_82

    const/4 v6, 0x4

    invoke-static {v6, v0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    move v10, v7

    :goto_44
    if-ge v10, v8, :cond_82

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Li3/p;

    invoke-virtual {v12}, Li3/p;->k()Li3/l;

    move-result-object v13

    sget-object v14, Li3/u;->H:Li3/y;

    iget-object v13, v13, Li3/l;->w:La0/v0;

    invoke-virtual {v13, v14}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_81

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_81
    add-int/lit8 v10, v10, 0x1

    goto :goto_44

    :cond_82
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_85

    invoke-static {v4}, Lq83/g;->l(Ljava/util/ArrayList;)Z

    move-result v6

    const/4 v8, 0x1

    if-eqz v6, :cond_83

    move v10, v8

    goto :goto_45

    :cond_83
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v10

    :goto_45
    if-eqz v6, :cond_84

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    :cond_84
    invoke-static {v10, v8, v7, v7}, Lg9/b;->c(IIIZ)Lg9/b;

    move-result-object v4

    invoke-virtual {v11, v4}, Li5/f;->i(Lg9/b;)V

    :cond_85
    :goto_46
    invoke-static {v0, v11}, Lq83/g;->W(Li3/p;Li5/f;)V

    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v4

    sget-object v6, Li3/u;->t:Li3/y;

    invoke-static {v4, v6}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li3/j;

    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v6

    sget-object v7, Li3/k;->d:Li3/y;

    invoke-static {v6, v7}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li3/a;

    const/4 v7, 0x0

    if-eqz v4, :cond_91

    if-eqz v6, :cond_91

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v10, Li3/u;->f:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_86

    const/4 v8, 0x0

    :cond_86
    if-nez v8, :cond_89

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v10, Li3/u;->e:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_87

    const/4 v8, 0x0

    :cond_87
    if-eqz v8, :cond_88

    goto :goto_47

    :cond_88
    move v8, v15

    goto :goto_48

    :cond_89
    :goto_47
    const/4 v8, 0x1

    :goto_48
    if-nez v8, :cond_8a

    const-string v8, "android.widget.HorizontalScrollView"

    invoke-virtual {v11, v8}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :cond_8a
    iget-object v8, v4, Li3/j;->b:Lc93/a;

    invoke-interface {v8}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    cmpl-float v8, v8, v7

    if-lez v8, :cond_8b

    const/4 v10, 0x1

    invoke-virtual {v11, v10}, Li5/f;->k(Z)V

    :cond_8b
    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v8

    if-eqz v8, :cond_91

    invoke-static {v4}, Lb3/h0;->z(Li3/j;)Z

    move-result v8

    if-eqz v8, :cond_8e

    sget-object v8, Li5/d;->h:Li5/d;

    invoke-virtual {v11, v8}, Li5/f;->b(Li5/d;)V

    move-object/from16 v8, v21

    iget-object v10, v8, La3/n0;->Y:Ly3/m;

    sget-object v12, Ly3/m;->x:Ly3/m;

    if-ne v10, v12, :cond_8c

    const/4 v10, 0x1

    goto :goto_49

    :cond_8c
    move v10, v15

    :goto_49
    if-nez v10, :cond_8d

    sget-object v10, Li5/d;->p:Li5/d;

    goto :goto_4a

    :cond_8d
    sget-object v10, Li5/d;->n:Li5/d;

    :goto_4a
    invoke-virtual {v11, v10}, Li5/f;->b(Li5/d;)V

    goto :goto_4b

    :cond_8e
    move-object/from16 v8, v21

    :goto_4b
    invoke-static {v4}, Lb3/h0;->y(Li3/j;)Z

    move-result v4

    if-eqz v4, :cond_91

    sget-object v4, Li5/d;->i:Li5/d;

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    iget-object v4, v8, La3/n0;->Y:Ly3/m;

    sget-object v8, Ly3/m;->x:Ly3/m;

    if-ne v4, v8, :cond_8f

    const/4 v4, 0x1

    goto :goto_4c

    :cond_8f
    move v4, v15

    :goto_4c
    if-nez v4, :cond_90

    sget-object v4, Li5/d;->n:Li5/d;

    goto :goto_4d

    :cond_90
    sget-object v4, Li5/d;->p:Li5/d;

    :goto_4d
    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    :cond_91
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v4

    sget-object v8, Li3/u;->u:Li3/y;

    invoke-static {v4, v8}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li3/j;

    if-eqz v4, :cond_99

    if-eqz v6, :cond_99

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v6

    sget-object v8, Li3/u;->f:Li3/y;

    iget-object v6, v6, Li3/l;->w:La0/v0;

    invoke-virtual {v6, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_92

    const/4 v6, 0x0

    :cond_92
    if-nez v6, :cond_95

    invoke-virtual {v0}, Li3/p;->k()Li3/l;

    move-result-object v6

    sget-object v8, Li3/u;->e:Li3/y;

    iget-object v6, v6, Li3/l;->w:La0/v0;

    invoke-virtual {v6, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_93

    const/4 v6, 0x0

    :cond_93
    if-eqz v6, :cond_94

    goto :goto_4e

    :cond_94
    move v6, v15

    goto :goto_4f

    :cond_95
    :goto_4e
    const/4 v6, 0x1

    :goto_4f
    if-nez v6, :cond_96

    const-string v6, "android.widget.ScrollView"

    invoke-virtual {v11, v6}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :cond_96
    iget-object v6, v4, Li3/j;->b:Lc93/a;

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    cmpl-float v6, v6, v7

    const/4 v10, 0x1

    if-lez v6, :cond_97

    invoke-virtual {v11, v10}, Li5/f;->k(Z)V

    :cond_97
    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v6

    if-eqz v6, :cond_9a

    invoke-static {v4}, Lb3/h0;->z(Li3/j;)Z

    move-result v6

    if-eqz v6, :cond_98

    sget-object v6, Li5/d;->h:Li5/d;

    invoke-virtual {v11, v6}, Li5/f;->b(Li5/d;)V

    sget-object v6, Li5/d;->o:Li5/d;

    invoke-virtual {v11, v6}, Li5/f;->b(Li5/d;)V

    :cond_98
    invoke-static {v4}, Lb3/h0;->y(Li3/j;)Z

    move-result v4

    if-eqz v4, :cond_9a

    sget-object v4, Li5/d;->i:Li5/d;

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    sget-object v4, Li5/d;->m:Li5/d;

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    goto :goto_50

    :cond_99
    const/4 v10, 0x1

    :cond_9a
    :goto_50
    const/16 v4, 0x1d

    if-lt v1, v4, :cond_9b

    invoke-static {v0, v11}, Lb3/o0;->d(Li3/p;Li5/f;)V

    :cond_9b
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    sget-object v4, Li3/u;->d:Li3/y;

    invoke-static {v1, v4}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lb3/o0;->a(Li3/p;)Z

    move-result v1

    if-eqz v1, :cond_a6

    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    sget-object v4, Li3/k;->s:Li3/y;

    invoke-static {v1, v4}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/a;

    if-eqz v1, :cond_9c

    new-instance v4, Li5/d;

    const/high16 v6, 0x40000

    iget-object v1, v1, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v4, v6, v1}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    :cond_9c
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    sget-object v4, Li3/k;->t:Li3/y;

    invoke-static {v1, v4}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/a;

    if-eqz v1, :cond_9d

    new-instance v4, Li5/d;

    const/high16 v6, 0x80000

    iget-object v1, v1, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v4, v6, v1}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    :cond_9d
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    sget-object v4, Li3/k;->u:Li3/y;

    invoke-static {v1, v4}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/a;

    if-eqz v1, :cond_9e

    new-instance v4, Li5/d;

    const/high16 v6, 0x100000

    iget-object v1, v1, Li3/a;->a:Ljava/lang/String;

    invoke-direct {v4, v6, v1}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v4}, Li5/f;->b(Li5/d;)V

    :cond_9e
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    sget-object v4, Li3/k;->w:Li3/y;

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v4}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a6

    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v1

    invoke-virtual {v1, v4}, Li3/l;->c(Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move-object/from16 v6, v20

    iget v7, v6, La0/f0;->b:I

    if-ge v4, v7, :cond_a5

    new-instance v4, La0/g1;

    const/4 v8, 0x0

    invoke-direct {v4, v8}, La0/g1;-><init>(Ljava/lang/Object;)V

    invoke-static {}, La0/z0;->a()La0/m0;

    move-result-object v7

    move-object/from16 v8, v19

    invoke-virtual {v8, v5}, La0/g1;->c(I)Z

    move-result v12

    if-eqz v12, :cond_a3

    invoke-virtual {v8, v5}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La0/m0;

    new-instance v13, La0/f0;

    invoke-direct {v13}, La0/f0;-><init>()V

    iget-object v14, v6, La0/f0;->a:[I

    iget v6, v6, La0/f0;->b:I

    move v10, v15

    :goto_51
    if-ge v10, v6, :cond_9f

    aget v15, v14, v10

    invoke-virtual {v13, v15}, La0/f0;->a(I)V

    add-int/lit8 v10, v10, 0x1

    const/4 v15, 0x0

    goto :goto_51

    :cond_9f
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v1

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v14, 0x0

    :goto_52
    if-ge v14, v10, :cond_a2

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li3/d;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move/from16 v16, v10

    invoke-virtual {v15}, Li3/d;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, La0/m0;->d(Ljava/lang/Object;)I

    move-result v10

    if-ltz v10, :cond_a0

    const/4 v10, 0x1

    goto :goto_53

    :cond_a0
    const/4 v10, 0x0

    :goto_53
    if-eqz v10, :cond_a1

    invoke-virtual {v15}, Li3/d;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, La0/m0;->e(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v12

    invoke-virtual {v15}, Li3/d;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v10, v12}, La0/g1;->f(ILjava/lang/Object;)V

    invoke-virtual {v15}, Li3/d;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12, v10}, La0/m0;->h(Ljava/lang/Object;I)V

    invoke-virtual {v13, v10}, La0/f0;->e(I)V

    new-instance v12, Li5/d;

    invoke-virtual {v15}, Li3/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v12, v10, v15}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v12}, Li5/f;->b(Li5/d;)V

    goto :goto_54

    :cond_a1
    move-object/from16 v17, v12

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_54
    add-int/lit8 v14, v14, 0x1

    move/from16 v10, v16

    move-object/from16 v12, v17

    goto :goto_52

    :cond_a2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v14, 0x0

    :goto_55
    if-ge v14, v1, :cond_a4

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li3/d;

    invoke-virtual {v13, v14}, La0/f0;->c(I)I

    move-result v12

    invoke-virtual {v10}, Li3/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v12, v15}, La0/g1;->f(ILjava/lang/Object;)V

    invoke-virtual {v10}, Li3/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v15, v12}, La0/m0;->h(Ljava/lang/Object;I)V

    new-instance v15, Li5/d;

    invoke-virtual {v10}, Li3/d;->a()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v15, v12, v10}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v15}, Li5/f;->b(Li5/d;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_55

    :cond_a3
    move-object v10, v1

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v14, 0x0

    :goto_56
    if-ge v14, v10, :cond_a4

    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Li3/d;

    invoke-virtual {v6, v14}, La0/f0;->c(I)I

    move-result v13

    invoke-virtual {v12}, Li3/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v13, v15}, La0/g1;->f(ILjava/lang/Object;)V

    invoke-virtual {v12}, Li3/d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7, v15, v13}, La0/m0;->h(Ljava/lang/Object;I)V

    new-instance v15, Li5/d;

    invoke-virtual {v12}, Li3/d;->a()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v15, v13, v12}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-virtual {v11, v15}, Li5/f;->b(Li5/d;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_56

    :cond_a4
    iget-object v1, v9, Lb3/h0;->u:La0/g1;

    invoke-virtual {v1, v5, v4}, La0/g1;->f(ILjava/lang/Object;)V

    invoke-virtual {v8, v5, v7}, La0/g1;->f(ILjava/lang/Object;)V

    goto :goto_57

    :cond_a5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t have more than "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v6, La0/f0;->b:I

    const-string v3, " custom actions for one widget"

    invoke-static {v1, v2, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a6
    :goto_57
    invoke-static {v0, v3}, Lb3/o0;->c(Li3/p;Landroid/content/res/Resources;)Z

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    iget-object v1, v9, Lb3/h0;->E:La0/e0;

    invoke-virtual {v1, v5}, La0/e0;->d(I)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_a8

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v3

    invoke-static {v3, v1}, Lb3/o0;->o(Lb3/h1;I)Lb4/l;

    move-result-object v3

    if-eqz v3, :cond_a7

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    move-object/from16 v3, v29

    goto :goto_58

    :cond_a7
    move-object/from16 v3, v29

    invoke-virtual {v2, v3, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    :goto_58
    iget-object v1, v9, Lb3/h0;->G:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-virtual {v9, v5, v11, v1, v8}, Lb3/h0;->j(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_59

    :cond_a8
    move-object/from16 v3, v29

    const/4 v8, 0x0

    :goto_59
    iget-object v1, v9, Lb3/h0;->F:La0/e0;

    invoke-virtual {v1, v5}, La0/e0;->d(I)I

    move-result v1

    const/4 v6, -0x1

    if-eq v1, v6, :cond_a9

    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v3

    invoke-static {v3, v1}, Lb3/o0;->o(Lb3/h1;I)Lb4/l;

    move-result-object v1

    if-eqz v1, :cond_a9

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    iget-object v1, v9, Lb3/h0;->H:Ljava/lang/String;

    invoke-virtual {v9, v5, v11, v1, v8}, Lb3/h0;->j(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_a9
    invoke-virtual {v0}, Li3/p;->n()Li3/l;

    move-result-object v0

    sget-object v1, Li3/v;->b:Li3/y;

    invoke-static {v0, v1}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_aa

    invoke-virtual {v11, v0}, Li5/f;->h(Ljava/lang/CharSequence;)V

    :cond_aa
    move-object v6, v11

    :goto_5a
    iget-boolean v0, v9, Lb3/h0;->r:Z

    if-eqz v0, :cond_ac

    iget v0, v9, Lb3/h0;->n:I

    if-ne v5, v0, :cond_ab

    iput-object v6, v9, Lb3/h0;->p:Li5/f;

    :cond_ab
    iget v0, v9, Lb3/h0;->o:I

    if-ne v5, v0, :cond_ac

    iput-object v6, v9, Lb3/h0;->q:Li5/f;

    :cond_ac
    return-object v6

    :cond_ad
    move v5, v1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "semanticsNode "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " has null parent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final k(I)Li5/f;
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, Lb3/d0;->y:Lb3/h0;

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget p1, v1, Lb3/h0;->n:I

    invoke-virtual {p0, p1}, Lb3/d0;->i(I)Li5/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown focus type: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget p1, v1, Lb3/h0;->o:I

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-virtual {p0, p1}, Lb3/d0;->i(I)Li5/f;

    move-result-object p1

    return-object p1
.end method

.method public final s(IILandroid/os/Bundle;)Z
    .locals 20

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    iget-object v4, v2, Lb3/d0;->y:Lb3/h0;

    iget-object v5, v4, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    iget-object v8, v4, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Lb3/h0;->t()La0/s;

    move-result-object v9

    invoke-virtual {v9, v0}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li3/q;

    if-eqz v9, :cond_0

    iget-object v12, v9, Li3/q;->a:Li3/p;

    if-nez v12, :cond_1

    :cond_0
    :goto_0
    const/16 v18, 0x0

    goto/16 :goto_3f

    :cond_1
    iget-object v9, v12, Li3/p;->c:La3/n0;

    iget v11, v12, Li3/p;->g:I

    iget-object v13, v12, Li3/p;->d:Li3/l;

    iget-object v14, v13, Li3/l;->w:La0/v0;

    sget-object v15, Li3/u;->n:Li3/y;

    invoke-virtual {v14, v15}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v16, v6

    if-nez v15, :cond_2

    const/4 v15, 0x0

    :cond_2
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-static {v5}, Lx43/j;->J(Landroid/view/accessibility/AccessibilityManager;)Z

    move-result v15

    if-nez v15, :cond_3

    goto :goto_0

    :cond_3
    const/16 v15, 0x40

    if-eq v1, v15, :cond_7e

    const/16 v5, 0x80

    if-eq v1, v5, :cond_7c

    const/16 v15, 0x200

    const/16 v5, 0x100

    const/4 v10, -0x1

    if-eq v1, v5, :cond_63

    if-eq v1, v15, :cond_63

    const/16 v5, 0x4000

    if-eq v1, v5, :cond_61

    const/high16 v5, 0x20000

    if-eq v1, v5, :cond_5d

    invoke-static {v12}, Lb3/o0;->a(Li3/p;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x1

    if-eq v1, v5, :cond_5a

    const/4 v5, 0x2

    if-eq v1, v5, :cond_58

    sparse-switch v1, :sswitch_data_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    iget-object v3, v4, Lb3/h0;->u:La0/g1;

    invoke-virtual {v3, v0}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/g1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v1, Li3/k;->w:Li3/y;

    invoke-virtual {v14, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_6

    const/4 v6, 0x0

    goto :goto_1

    :cond_6
    move-object v6, v1

    :goto_1
    check-cast v6, Ljava/util/List;

    if-nez v6, :cond_7

    goto :goto_0

    :cond_7
    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v1, :cond_0

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li3/d;

    iget-object v5, v4, Li3/d;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v0, v4, Li3/d;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :pswitch_0
    sget-object v0, Li3/k;->A:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    const/4 v6, 0x0

    goto :goto_3

    :cond_9
    move-object v6, v0

    :goto_3
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_1
    sget-object v0, Li3/k;->y:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_a

    const/4 v6, 0x0

    goto :goto_4

    :cond_a
    move-object v6, v0

    :goto_4
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_2
    sget-object v0, Li3/k;->z:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_b

    const/4 v6, 0x0

    goto :goto_5

    :cond_b
    move-object v6, v0

    :goto_5
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_3
    sget-object v0, Li3/k;->x:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 v6, 0x0

    goto :goto_6

    :cond_c
    move-object v6, v0

    :goto_6
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_0
    sget-object v0, Li3/k;->o:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d

    const/4 v6, 0x0

    goto :goto_7

    :cond_d
    move-object v6, v0

    :goto_7
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_1
    if-eqz v3, :cond_0

    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object v1, Li3/k;->h:Li3/y;

    invoke-virtual {v14, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_f

    const/4 v6, 0x0

    goto :goto_8

    :cond_f
    move-object v6, v1

    :goto_8
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v1, v6, Li3/a;->b:Ll83/e;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_0

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_2
    invoke-virtual {v12}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v1, v0, Li3/p;->d:Li3/l;

    sget-object v3, Li3/k;->d:Li3/y;

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_10

    const/4 v1, 0x0

    :cond_10
    check-cast v1, Li3/a;

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    :goto_9
    if-eqz v0, :cond_14

    if-eqz v1, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v0}, Li3/p;->l()Li3/p;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v1, v0, Li3/p;->d:Li3/l;

    sget-object v3, Li3/k;->d:Li3/y;

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_13

    const/4 v1, 0x0

    :cond_13
    check-cast v1, Li3/a;

    goto :goto_9

    :cond_14
    :goto_a
    if-nez v0, :cond_15

    invoke-virtual {v12}, Li3/p;->g()Lh2/c;

    move-result-object v0

    new-instance v1, Landroid/graphics/Rect;

    iget v3, v0, Lh2/c;->a:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    iget v4, v0, Lh2/c;->b:F

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    iget v5, v0, Lh2/c;->c:F

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    iget v0, v0, Lh2/c;->d:F

    float-to-double v6, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-float v0, v6

    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    invoke-direct {v1, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v8, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    move-result v0

    return v0

    :cond_15
    iget-object v3, v0, Li3/p;->d:Li3/l;

    iget-object v3, v3, Li3/l;->w:La0/v0;

    iget-object v0, v0, Li3/p;->c:La3/n0;

    iget-object v4, v0, La3/n0;->e0:La3/l1;

    iget-object v4, v4, La3/l1;->d:Ljava/lang/Object;

    check-cast v4, Landroidx/compose/ui/node/a;

    invoke-static {v4}, Ly2/q1;->e(Ly2/y;)Lh2/c;

    move-result-object v4

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->V()Ly2/y;

    move-result-object v0

    const-wide/16 v5, 0x0

    if-eqz v0, :cond_16

    check-cast v0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v0, v5, v6}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v7

    goto :goto_b

    :cond_16
    move-wide v7, v5

    :goto_b
    invoke-virtual {v4, v7, v8}, Lh2/c;->l(J)Lh2/c;

    move-result-object v0

    invoke-virtual {v12}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v4

    if-eqz v4, :cond_18

    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v7

    iget-boolean v7, v7, Lb2/v;->N:Z

    if-eqz v7, :cond_17

    goto :goto_c

    :cond_17
    const/4 v4, 0x0

    :goto_c
    if-eqz v4, :cond_18

    invoke-virtual {v4, v5, v6}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v7

    goto :goto_d

    :cond_18
    move-wide v7, v5

    :goto_d
    invoke-virtual {v12}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v4

    if-eqz v4, :cond_19

    iget-wide v5, v4, Ly2/j1;->y:J

    :cond_19
    invoke-static {v5, v6}, Lv63/b;->l(J)J

    move-result-wide v4

    invoke-static {v7, v8, v4, v5}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v4

    sget-object v5, Li3/u;->t:Li3/y;

    invoke-virtual {v3, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1a

    const/4 v5, 0x0

    :cond_1a
    check-cast v5, Li3/j;

    sget-object v5, Li3/u;->u:Li3/y;

    invoke-virtual {v3, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1b

    const/4 v6, 0x0

    goto :goto_e

    :cond_1b
    move-object v6, v3

    :goto_e
    check-cast v6, Li3/j;

    iget v3, v4, Lh2/c;->a:F

    iget v5, v0, Lh2/c;->a:F

    sub-float/2addr v3, v5

    iget v5, v4, Lh2/c;->c:F

    iget v6, v0, Lh2/c;->c:F

    sub-float/2addr v5, v6

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v6

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v7

    cmpg-float v6, v6, v7

    if-nez v6, :cond_1d

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v7

    cmpg-float v6, v6, v7

    if-gez v6, :cond_1c

    goto :goto_f

    :cond_1c
    move v3, v5

    goto :goto_f

    :cond_1d
    move/from16 v3, v16

    :goto_f
    iget-object v5, v9, La3/n0;->Y:Ly3/m;

    sget-object v6, Ly3/m;->x:Ly3/m;

    if-ne v5, v6, :cond_1e

    neg-float v3, v3

    :cond_1e
    iget v5, v4, Lh2/c;->b:F

    iget v6, v0, Lh2/c;->b:F

    sub-float/2addr v5, v6

    iget v4, v4, Lh2/c;->d:F

    iget v0, v0, Lh2/c;->d:F

    sub-float/2addr v4, v0

    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v6

    cmpg-float v0, v0, v6

    if-nez v0, :cond_20

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v0, v0, v6

    if-gez v0, :cond_1f

    move v6, v5

    goto :goto_10

    :cond_1f
    move v6, v4

    goto :goto_10

    :cond_20
    move/from16 v6, v16

    :goto_10
    if-eqz v1, :cond_0

    iget-object v0, v1, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/m;

    if-eqz v0, :cond_0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_0

    return v5

    :sswitch_3
    if-eqz v3, :cond_21

    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :cond_21
    const/4 v0, 0x0

    :goto_11
    sget-object v1, Li3/k;->j:Li3/y;

    invoke-virtual {v14, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_22

    const/4 v6, 0x0

    goto :goto_12

    :cond_22
    move-object v6, v1

    :goto_12
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v1, v6, Li3/a;->b:Ll83/e;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_0

    new-instance v3, Ll3/g;

    if-nez v0, :cond_23

    const-string v0, ""

    :cond_23
    invoke-direct {v3, v0}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_4
    sget-object v0, Li3/k;->u:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_24

    const/4 v6, 0x0

    goto :goto_13

    :cond_24
    move-object v6, v0

    :goto_13
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_5
    sget-object v0, Li3/k;->t:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_25

    const/4 v6, 0x0

    goto :goto_14

    :cond_25
    move-object v6, v0

    :goto_14
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_6
    sget-object v0, Li3/k;->s:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_26

    const/4 v6, 0x0

    goto :goto_15

    :cond_26
    move-object v6, v0

    :goto_15
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_7
    sget-object v0, Li3/k;->q:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_27

    const/4 v6, 0x0

    goto :goto_16

    :cond_27
    move-object v6, v0

    :goto_16
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_8
    sget-object v0, Li3/k;->r:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_28

    const/4 v6, 0x0

    goto :goto_17

    :cond_28
    move-object v6, v0

    :goto_17
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :pswitch_4
    :sswitch_9
    const/16 v0, 0x1000

    if-ne v1, v0, :cond_29

    const/4 v0, 0x1

    goto :goto_18

    :cond_29
    const/4 v0, 0x0

    :goto_18
    const/16 v3, 0x2000

    if-ne v1, v3, :cond_2a

    const/4 v3, 0x1

    goto :goto_19

    :cond_2a
    const/4 v3, 0x0

    :goto_19
    const v4, 0x1020039

    if-ne v1, v4, :cond_2b

    const/4 v4, 0x1

    goto :goto_1a

    :cond_2b
    const/4 v4, 0x0

    :goto_1a
    const v5, 0x102003b

    if-ne v1, v5, :cond_2c

    const/4 v5, 0x1

    goto :goto_1b

    :cond_2c
    const/4 v5, 0x0

    :goto_1b
    const v6, 0x1020038

    if-ne v1, v6, :cond_2d

    const/4 v6, 0x1

    goto :goto_1c

    :cond_2d
    const/4 v6, 0x0

    :goto_1c
    const v8, 0x102003a

    if-ne v1, v8, :cond_2e

    const/4 v1, 0x1

    goto :goto_1d

    :cond_2e
    const/4 v1, 0x0

    :goto_1d
    if-nez v4, :cond_30

    if-nez v5, :cond_30

    if-nez v0, :cond_30

    if-eqz v3, :cond_2f

    goto :goto_1e

    :cond_2f
    const/4 v8, 0x0

    goto :goto_1f

    :cond_30
    :goto_1e
    const/4 v8, 0x1

    :goto_1f
    if-nez v6, :cond_32

    if-nez v1, :cond_32

    if-nez v0, :cond_32

    if-eqz v3, :cond_31

    goto :goto_20

    :cond_31
    const/4 v1, 0x0

    goto :goto_21

    :cond_32
    :goto_20
    const/4 v1, 0x1

    :goto_21
    if-nez v0, :cond_33

    if-eqz v3, :cond_3a

    :cond_33
    sget-object v0, Li3/u;->c:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_34

    const/4 v0, 0x0

    :cond_34
    check-cast v0, Li3/h;

    sget-object v10, Li3/k;->h:Li3/y;

    invoke-virtual {v14, v10}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_35

    const/4 v10, 0x0

    :cond_35
    check-cast v10, Li3/a;

    if-eqz v0, :cond_3a

    iget-object v11, v0, Li3/h;->b:Li93/f;

    if-eqz v10, :cond_3a

    invoke-interface {v11}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v11}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    cmpg-float v5, v1, v4

    if-gez v5, :cond_36

    move v1, v4

    :cond_36
    invoke-interface {v11}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-interface {v11}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpl-float v6, v4, v5

    if-lez v6, :cond_37

    move v4, v5

    :cond_37
    iget v5, v0, Li3/h;->c:I

    if-lez v5, :cond_38

    sub-float/2addr v1, v4

    const/16 v19, 0x1

    add-int/lit8 v5, v5, 0x1

    int-to-float v4, v5

    :goto_22
    div-float/2addr v1, v4

    goto :goto_23

    :cond_38
    sub-float/2addr v1, v4

    const/16 v4, 0x14

    int-to-float v4, v4

    goto :goto_22

    :goto_23
    if-eqz v3, :cond_39

    neg-float v1, v1

    :cond_39
    iget-object v3, v10, Li3/a;->b:Ll83/e;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_0

    iget v0, v0, Li3/h;->a:F

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_3a
    iget-object v0, v9, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    invoke-static {v0}, Ly2/q1;->e(Ly2/y;)Lh2/c;

    move-result-object v0

    invoke-virtual {v0}, Lh2/c;->e()J

    move-result-wide v10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v12, Li3/k;->B:Li3/y;

    invoke-virtual {v14, v12}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_3b

    const/4 v12, 0x0

    :cond_3b
    check-cast v12, Li3/a;

    if-eqz v12, :cond_3c

    iget-object v12, v12, Li3/a;->b:Ll83/e;

    check-cast v12, Lkotlin/jvm/functions/Function1;

    if-eqz v12, :cond_3c

    invoke-interface {v12, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_3c

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    goto :goto_24

    :cond_3c
    const/4 v0, 0x0

    :goto_24
    sget-object v12, Li3/k;->d:Li3/y;

    invoke-virtual {v14, v12}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_3d

    const/4 v12, 0x0

    :cond_3d
    check-cast v12, Li3/a;

    if-nez v12, :cond_3e

    goto/16 :goto_0

    :cond_3e
    iget-object v12, v12, Li3/a;->b:Ll83/e;

    sget-object v13, Li3/u;->t:Li3/y;

    invoke-virtual {v14, v13}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_3f

    const/4 v13, 0x0

    :cond_3f
    check-cast v13, Li3/j;

    if-eqz v13, :cond_4a

    if-eqz v8, :cond_4a

    if-eqz v0, :cond_40

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v8

    move-object/from16 p2, v0

    move/from16 p1, v1

    goto :goto_25

    :cond_40
    const/16 v8, 0x20

    move-object/from16 p2, v0

    move/from16 p1, v1

    shr-long v0, v10, v8

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    :goto_25
    if-nez v4, :cond_41

    if-eqz v3, :cond_42

    :cond_41
    neg-float v8, v8

    :cond_42
    iget-object v0, v9, La3/n0;->Y:Ly3/m;

    sget-object v1, Ly3/m;->x:Ly3/m;

    if-ne v0, v1, :cond_44

    if-nez v4, :cond_43

    if-eqz v5, :cond_44

    :cond_43
    neg-float v8, v8

    :cond_44
    invoke-static {v13, v8}, Lb3/h0;->x(Li3/j;F)Z

    move-result v0

    if-eqz v0, :cond_4b

    sget-object v0, Li3/k;->y:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_46

    sget-object v1, Li3/k;->A:Li3/y;

    invoke-virtual {v14, v1}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    goto :goto_26

    :cond_45
    check-cast v12, Lc93/m;

    if-eqz v12, :cond_0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v12, v0, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_46
    :goto_26
    cmpl-float v1, v8, v16

    if-lez v1, :cond_48

    sget-object v0, Li3/k;->A:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_47

    const/4 v6, 0x0

    goto :goto_27

    :cond_47
    move-object v6, v0

    :goto_27
    check-cast v6, Li3/a;

    goto :goto_29

    :cond_48
    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_49

    const/4 v6, 0x0

    goto :goto_28

    :cond_49
    move-object v6, v0

    :goto_28
    check-cast v6, Li3/a;

    :goto_29
    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_4a
    move-object/from16 p2, v0

    move/from16 p1, v1

    :cond_4b
    sget-object v0, Li3/u;->u:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4c

    const/4 v0, 0x0

    :cond_4c
    check-cast v0, Li3/j;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_4d

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_2a

    :cond_4d
    const-wide v4, 0xffffffffL

    and-long/2addr v4, v10

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    :goto_2a
    if-nez v6, :cond_4e

    if-eqz v3, :cond_4f

    :cond_4e
    neg-float v1, v1

    :cond_4f
    invoke-static {v0, v1}, Lb3/h0;->x(Li3/j;F)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Li3/k;->x:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_51

    sget-object v3, Li3/k;->z:Li3/y;

    invoke-virtual {v14, v3}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_50

    goto :goto_2b

    :cond_50
    check-cast v12, Lc93/m;

    if-eqz v12, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v12, v7, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_51
    :goto_2b
    cmpl-float v1, v1, v16

    if-lez v1, :cond_53

    sget-object v0, Li3/k;->z:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_52

    const/4 v6, 0x0

    goto :goto_2c

    :cond_52
    move-object v6, v0

    :goto_2c
    check-cast v6, Li3/a;

    goto :goto_2e

    :cond_53
    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_54

    const/4 v6, 0x0

    goto :goto_2d

    :cond_54
    move-object v6, v0

    :goto_2d
    check-cast v6, Li3/a;

    :goto_2e
    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_a
    sget-object v0, Li3/k;->c:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_55

    const/4 v6, 0x0

    goto :goto_2f

    :cond_55
    move-object v6, v0

    :goto_2f
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :sswitch_b
    sget-object v1, Li3/k;->b:Li3/y;

    invoke-virtual {v14, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_56

    const/4 v1, 0x0

    :cond_56
    check-cast v1, Li3/a;

    if-eqz v1, :cond_57

    iget-object v1, v1, Li3/a;->b:Ll83/e;

    check-cast v1, Lc93/a;

    if-eqz v1, :cond_57

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    move-object/from16 v17, v1

    :goto_30
    const/16 v1, 0xc

    const/4 v3, 0x0

    const/4 v5, 0x1

    goto :goto_31

    :cond_57
    const/16 v17, 0x0

    goto :goto_30

    :goto_31
    invoke-static {v4, v0, v5, v3, v1}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    if-eqz v17, :cond_0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_58
    sget-object v0, Li3/u;->k:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_59

    const/4 v0, 0x0

    :cond_59
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v8}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    const/16 v1, 0x8

    const/4 v5, 0x1

    const/4 v12, 0x0

    invoke-virtual {v0, v1, v12, v5}, Lg2/l;->d(IZZ)Z

    return v5

    :cond_5a
    invoke-virtual {v8}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_5b

    invoke-virtual {v8}, Landroid/view/View;->requestFocusFromTouch()Z

    :cond_5b
    sget-object v0, Li3/k;->v:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5c

    const/4 v6, 0x0

    goto :goto_32

    :cond_5c
    move-object v6, v0

    :goto_32
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_5d
    if-eqz v3, :cond_5e

    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    invoke-virtual {v3, v0, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_33

    :cond_5e
    move v0, v10

    :goto_33
    if-eqz v3, :cond_5f

    const-string v1, "ACTION_ARGUMENT_SELECTION_END_INT"

    invoke-virtual {v3, v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    :cond_5f
    const/4 v1, 0x0

    invoke-virtual {v4, v12, v0, v10, v1}, Lb3/h0;->K(Li3/p;IIZ)Z

    move-result v0

    if-eqz v0, :cond_60

    invoke-virtual {v4, v11}, Lb3/h0;->A(I)I

    move-result v3

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static {v4, v3, v1, v6, v5}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    :cond_60
    return v0

    :cond_61
    sget-object v0, Li3/k;->p:Li3/y;

    invoke-virtual {v14, v0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_62

    const/4 v6, 0x0

    goto :goto_34

    :cond_62
    move-object v6, v0

    :goto_34
    check-cast v6, Li3/a;

    if-eqz v6, :cond_0

    iget-object v0, v6, Li3/a;->b:Ll83/e;

    check-cast v0, Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_63
    if-eqz v3, :cond_0

    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    if-ne v1, v5, :cond_64

    const/4 v1, 0x1

    goto :goto_35

    :cond_64
    const/4 v1, 0x0

    :goto_35
    iget-object v6, v4, Lb3/h0;->x:Ljava/lang/Integer;

    if-nez v6, :cond_65

    goto :goto_36

    :cond_65
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v11, v6, :cond_66

    :goto_36
    iput v10, v4, Lb3/h0;->w:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v4, Lb3/h0;->x:Ljava/lang/Integer;

    :cond_66
    invoke-static {v12}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_67

    goto/16 :goto_0

    :cond_67
    invoke-static {v12}, Lb3/h0;->u(Li3/p;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_69

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_68

    goto :goto_37

    :cond_68
    const/4 v9, 0x1

    if-eq v0, v9, :cond_70

    const/4 v9, 0x2

    if-eq v0, v9, :cond_6f

    const/4 v8, 0x4

    if-eq v0, v8, :cond_6b

    const/16 v9, 0x8

    if-eq v0, v9, :cond_6a

    const/16 v9, 0x10

    if-eq v0, v9, :cond_6b

    :cond_69
    :goto_37
    const/4 v8, 0x0

    goto :goto_38

    :cond_6a
    invoke-static {}, Lbi/g;->F()Lb3/f;

    move-result-object v8

    invoke-virtual {v8, v7}, Lb3/b;->v(Ljava/lang/String;)V

    goto :goto_38

    :cond_6b
    sget-object v9, Li3/k;->a:Li3/y;

    invoke-virtual {v14, v9}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6c

    goto :goto_37

    :cond_6c
    invoke-static {v13}, Lb3/o0;->l(Li3/l;)Ll3/r0;

    move-result-object v9

    if-nez v9, :cond_6d

    goto :goto_37

    :cond_6d
    if-ne v0, v8, :cond_6e

    sget-object v8, Lb3/d;->e:Lb3/d;

    invoke-static {}, Lx43/j;->C()Lb3/d;

    move-result-object v8

    invoke-virtual {v8, v7, v9}, Lb3/d;->M(Ljava/lang/String;Ll3/r0;)V

    goto :goto_38

    :cond_6e
    sget-object v8, Lb3/e;->f:Lb3/e;

    invoke-static {}, Lo73/a;->E()Lb3/e;

    move-result-object v8

    invoke-virtual {v8, v7, v9, v12}, Lb3/e;->M(Ljava/lang/String;Ll3/r0;Li3/p;)V

    goto :goto_38

    :cond_6f
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {v8}, Lbp/b;->u(Ljava/util/Locale;)Lb3/c;

    move-result-object v8

    invoke-virtual {v8, v7}, Lb3/c;->v(Ljava/lang/String;)V

    goto :goto_38

    :cond_70
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    iget-object v8, v8, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {v8}, Lx30/s0;->r(Ljava/util/Locale;)Lb3/c;

    move-result-object v8

    invoke-virtual {v8, v7}, Lb3/c;->v(Ljava/lang/String;)V

    :goto_38
    if-nez v8, :cond_71

    goto/16 :goto_0

    :cond_71
    invoke-virtual {v4, v12}, Lb3/h0;->r(Li3/p;)I

    move-result v7

    if-ne v7, v10, :cond_73

    if-eqz v1, :cond_72

    const/4 v6, 0x0

    goto :goto_39

    :cond_72
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    :goto_39
    move v7, v6

    :cond_73
    if-eqz v1, :cond_74

    invoke-virtual {v8, v7}, Lb3/b;->n(I)[I

    move-result-object v6

    goto :goto_3a

    :cond_74
    invoke-virtual {v8, v7}, Lb3/b;->C(I)[I

    move-result-object v6

    :goto_3a
    if-nez v6, :cond_75

    goto/16 :goto_0

    :cond_75
    const/16 v18, 0x0

    aget v7, v6, v18

    const/16 v19, 0x1

    aget v16, v6, v19

    if-eqz v3, :cond_79

    sget-object v3, Li3/u;->a:Li3/y;

    invoke-virtual {v14, v3}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_79

    sget-object v3, Li3/u;->E:Li3/y;

    invoke-virtual {v14, v3}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_79

    invoke-virtual {v4, v12}, Lb3/h0;->s(Li3/p;)I

    move-result v3

    if-ne v3, v10, :cond_77

    if-eqz v1, :cond_76

    move v3, v7

    goto :goto_3b

    :cond_76
    move/from16 v3, v16

    :cond_77
    :goto_3b
    if-eqz v1, :cond_78

    move/from16 v6, v16

    goto :goto_3d

    :cond_78
    move v6, v7

    goto :goto_3d

    :cond_79
    if-eqz v1, :cond_7a

    move/from16 v3, v16

    goto :goto_3c

    :cond_7a
    move v3, v7

    :goto_3c
    move v6, v3

    :goto_3d
    if-eqz v1, :cond_7b

    move v13, v5

    goto :goto_3e

    :cond_7b
    move v13, v15

    :goto_3e
    new-instance v11, Lb3/e0;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v17

    move v14, v0

    move v15, v7

    invoke-direct/range {v11 .. v18}, Lb3/e0;-><init>(Li3/p;IIIIJ)V

    iput-object v11, v4, Lb3/h0;->B:Lb3/e0;

    const/4 v5, 0x1

    invoke-virtual {v4, v12, v3, v6, v5}, Lb3/h0;->K(Li3/p;IIZ)Z

    return v5

    :cond_7c
    const/4 v5, 0x1

    iget v1, v4, Lb3/h0;->n:I

    if-ne v1, v0, :cond_7d

    const/high16 v1, -0x80000000

    iput v1, v4, Lb3/h0;->n:I

    const/4 v3, 0x0

    iput-object v3, v4, Lb3/h0;->p:Li5/f;

    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    const/high16 v1, 0x10000

    const/16 v6, 0xc

    invoke-static {v4, v0, v1, v3, v6}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    return v5

    :cond_7d
    const/16 v18, 0x0

    return v18

    :cond_7e
    const/high16 v1, 0x10000

    const/4 v3, 0x0

    const/16 v6, 0xc

    const/16 v18, 0x0

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v7

    if-eqz v7, :cond_81

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v5

    if-eqz v5, :cond_81

    iget v5, v4, Lb3/h0;->n:I

    if-ne v5, v0, :cond_7f

    return v18

    :cond_7f
    const/high16 v7, -0x80000000

    if-eq v5, v7, :cond_80

    invoke-static {v4, v5, v1, v3, v6}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    :cond_80
    iput v0, v4, Lb3/h0;->n:I

    invoke-virtual {v8}, Landroid/view/View;->invalidate()V

    const v1, 0x8000

    invoke-static {v4, v0, v1, v3, v6}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    const/16 v19, 0x1

    return v19

    :cond_81
    const/16 v18, 0x0

    :goto_3f
    return v18

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_9
        0x2000 -> :sswitch_9
        0x8000 -> :sswitch_8
        0x10000 -> :sswitch_7
        0x40000 -> :sswitch_6
        0x80000 -> :sswitch_5
        0x100000 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x1020036 -> :sswitch_2
        0x102003d -> :sswitch_1
        0x1020054 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
