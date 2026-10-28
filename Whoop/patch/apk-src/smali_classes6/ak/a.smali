.class public final Lak/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak/c;


# instance fields
.field public final a:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lak/a;->a:[I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ll83/k;)Lxj/b;
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "targetType"

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lih0/d0;->w(ILjava/lang/String;)V

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    move-object/from16 v8, p0

    iget-object v4, v8, Lak/a;->a:[I

    invoke-virtual {v1, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v5, 0x0

    aget v5, v4, v5

    aget v3, v4, v3

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v7, v5

    cmpg-float v7, v2, v7

    const/4 v9, 0x0

    if-ltz v7, :cond_0

    add-int/2addr v5, v4

    int-to-float v4, v5

    cmpl-float v2, v2, v4

    if-gtz v2, :cond_0

    int-to-float v2, v3

    cmpg-float v2, v0, v2

    if-ltz v2, :cond_0

    add-int/2addr v3, v6

    int-to-float v2, v3

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v9

    :goto_0
    if-eqz v0, :cond_f

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v2, v0

    const/4 v3, -0x1

    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    if-eq v0, v3, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    const/high16 v4, -0x1000000

    and-int/2addr v0, v4

    if-nez v0, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    const v4, 0xffffff

    and-int/2addr v0, v4

    if-nez v0, :cond_4

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v9

    :goto_1
    if-nez v0, :cond_5

    const-string v0, ""

    goto :goto_2

    :cond_4
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    invoke-direct {v0}, Landroid/content/res/Resources$NotFoundException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    if-ne v0, v3, :cond_7

    move-object v0, v9

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v0

    const/16 v3, 0x10

    invoke-static {v3}, Lva3/d;->c(I)V

    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toString(this, checkRadix(radix))"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "0x"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v4, v0, Landroid/view/View;

    if-eqz v4, :cond_8

    check-cast v0, Landroid/view/View;

    goto :goto_4

    :cond_8
    move-object v0, v9

    goto :goto_4

    :cond_9
    const/4 v14, 0x0

    const/16 v15, 0x3e

    const-string v11, " \u2192 "

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    instance-of v4, v0, Ljava/lang/String;

    if-nez v4, :cond_b

    instance-of v4, v0, Ljava/lang/Number;

    if-nez v4, :cond_b

    instance-of v4, v0, Ljava/lang/Boolean;

    if-nez v4, :cond_b

    instance-of v4, v0, Ljava/lang/Character;

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    move-object v0, v9

    :cond_b
    :goto_5
    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_6

    :cond_c
    move-object v4, v9

    :goto_6
    instance-of v0, v1, Landroid/widget/Button;

    if-eqz v0, :cond_d

    move-object v0, v1

    check-cast v0, Landroid/widget/Button;

    goto :goto_7

    :cond_d
    move-object v0, v9

    :goto_7
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    :cond_e
    move-object v5, v9

    new-instance v0, Lxj/b;

    const-string v6, "android_view"

    invoke-direct/range {v0 .. v7}, Lxj/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_f
    return-object v9
.end method
