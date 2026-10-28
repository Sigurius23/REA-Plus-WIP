.class public abstract Lf1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:Ld30/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lej1/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lej1/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lf1/q;->a:Lp1/u2;

    new-instance v0, Ld30/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld30/c;-><init>(I)V

    sput-object v0, Lf1/q;->b:Ld30/c;

    return-void
.end method

.method public static final a(Lw0/a;Landroid/content/Context;ZLjava/lang/CharSequence;Ll3/u0;Lf1/p;Lkotlin/jvm/functions/Function1;)V
    .locals 12

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    if-eqz p3, :cond_a

    if-eqz v0, :cond_a

    if-eqz v1, :cond_a

    instance-of v4, v1, Lf1/p;

    if-nez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-wide v4, v0, Ll3/u0;->a:J

    iget-object v6, v1, Lf1/p;->h:Ljava/lang/Object;

    iget-object v7, v1, Lf1/p;->e:Lmc3/c;

    invoke-virtual {v7}, Lmc3/c;->tryLock()Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lf1/p;->g:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/f1;

    if-eqz v1, :cond_2

    iget-wide v10, v1, Lf1/f1;->b:J

    invoke-static {v4, v5, v10, v11}, Ll3/u0;->b(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v1, Lf1/f1;->a:Ljava/lang/CharSequence;

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, v1, Lf1/f1;->c:Landroid/view/textclassifier/TextClassification;

    goto :goto_0

    :cond_2
    move-object v1, v9

    :goto_0
    invoke-virtual {v7, v9}, Lmc3/c;->i(Ljava/lang/Object;)V

    move-object v9, v1

    :goto_1
    if-nez v9, :cond_3

    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_3
    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getActions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v4, 0x0

    if-nez v1, :cond_4

    new-instance v1, Lx0/h;

    invoke-direct {v1, v6, v9, v4}, Lx0/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    iget-object v5, p0, Lw0/a;->a:La0/q0;

    invoke-virtual {v5, v1}, La0/q0;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getLabel()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_5
    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getOnClickListener()Landroid/view/View$OnClickListener;

    move-result-object v1

    if-eqz v1, :cond_7

    :cond_6
    new-instance v1, Lx0/h;

    const/4 v5, -0x1

    invoke-direct {v1, v6, v9, v5}, Lx0/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    iget-object v5, p0, Lw0/a;->a:La0/q0;

    invoke-virtual {v5, v1}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_7
    :goto_2
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, Landroid/view/textclassifier/TextClassification;->getActions()Ljava/util/List;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_3
    if-ge v4, v2, :cond_9

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/RemoteAction;

    if-lez v4, :cond_8

    new-instance v5, Lx0/h;

    invoke-direct {v5, v6, v9, v4}, Lx0/h;-><init>(Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V

    iget-object v7, p0, Lw0/a;->a:La0/q0;

    invoke-virtual {v7, v5}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    :goto_4
    iget-wide v4, v0, Ll3/u0;->a:J

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lv0/b;->a(Lw0/a;Landroid/content/Context;ZLjava/lang/CharSequence;J)V

    return-void

    :cond_a
    :goto_5
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_b

    if-eqz v0, :cond_b

    iget-wide v4, v0, Ll3/u0;->a:J

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lv0/b;->a(Lw0/a;Landroid/content/Context;ZLjava/lang/CharSequence;J)V

    :cond_b
    return-void
.end method

.method public static final b(Lf1/s;Ls3/b;Landroidx/compose/runtime/Composer;I)Lf1/p;
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x19a9604b

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Lf1/q;->a:Lp1/u2;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    invoke-virtual {p2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    const/4 v5, 0x0

    if-le v3, v4, :cond_0

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v4, :cond_2

    :cond_1
    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    move p3, v5

    :goto_0
    or-int/2addr p3, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v2, p3, :cond_4

    :cond_3
    sget-object p3, Lf1/q;->b:Ld30/c;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lf1/p;

    invoke-direct {v2, v1, v0, p0, p1}, Lf1/p;-><init>(Lq83/j;Landroid/content/Context;Lf1/s;Ls3/b;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lf1/p;

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    return-object v2
.end method
