.class public abstract Landroidx/compose/foundation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/BackgroundElement;

    const-wide/16 v1, 0x0

    const/4 v6, 0x1

    move v4, p0

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLi2/t;FLi2/a1;I)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;
    .locals 1

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Li2/w0;->a:Li2/v0;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_1
    invoke-static {p3, p0, p1, p2}, Landroidx/compose/foundation/a;->a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;
    .locals 7

    new-instance v0, Landroidx/compose/foundation/BackgroundElement;

    const/4 v3, 0x0

    const/4 v6, 0x2

    const/high16 v4, 0x3f800000    # 1.0f

    move-wide v1, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/BackgroundElement;-><init>(JLi2/t;FLi2/a1;I)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLjava/lang/String;Li3/i;Lc93/a;)Landroidx/compose/ui/Modifier;
    .locals 9

    instance-of v0, p2, Lf0/v0;

    if-eqz v0, :cond_0

    move-object v2, p2

    check-cast v2, Lf0/v0;

    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    const/4 v3, 0x0

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    goto :goto_0

    :cond_1
    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_2

    invoke-static {v6, p1, p2}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/compose/foundation/b;

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/b;-><init>(Lf0/v0;ZLjava/lang/String;Li3/i;Lc93/a;)V

    invoke-static {v6, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 7

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v5, p4

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->d(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLjava/lang/String;Li3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 1

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    :cond_1
    new-instance p4, Lf0/v;

    invoke-direct {p4, p3, p2, p1}, Lf0/v;-><init>(Lc93/a;Ljava/lang/String;Z)V

    invoke-static {p0, p4}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 8

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    move v4, p1

    and-int/lit8 p1, p5, 0x2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    move-object v5, v0

    goto :goto_0

    :cond_1
    move-object v5, p2

    :goto_0
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    move-object v6, v0

    goto :goto_1

    :cond_2
    move-object v6, p3

    :goto_1
    new-instance v0, Landroidx/compose/foundation/ClickableElement;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v1, 0x0

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lj0/i;Lf0/v0;ZZLjava/lang/String;Li3/i;Lc93/a;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroidx/compose/ui/Modifier;Lj0/i;Lc93/a;Lc93/a;I)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p4, p4, 0x40

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    new-instance p4, Landroidx/compose/foundation/CombinedClickableElement;

    invoke-direct {p4, p3, p2, p1}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Lc93/a;Lc93/a;Lj0/i;)V

    invoke-interface {p0, p4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroid/view/KeyEvent;)Z
    .locals 4

    invoke-static {p0}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget p0, Ls2/b;->r:I

    invoke-static {}, Ls2/a;->k()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ls2/b;->a(JJ)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Ls2/a;->p()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ls2/b;->a(JJ)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Ls2/a;->t()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ls2/b;->a(JJ)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {}, Ls2/a;->y()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ls2/b;->a(JJ)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZLh0/o1;Lj0/i;ZLf0/k;Lq0/g;)Landroidx/compose/ui/Modifier;
    .locals 9

    sget v0, Lf0/y;->a:F

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-ne p2, v0, :cond_0

    sget-object v0, Lf0/u1;->a:Lf0/u1;

    invoke-static {v1, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lf0/m0;->a:Lf0/m0;

    invoke-static {v1, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Landroidx/compose/foundation/ScrollingContainerElement;

    move-object v5, p1

    move-object v4, p2

    move v7, p3

    move-object v3, p4

    move-object v6, p5

    move v8, p6

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/ScrollingContainerElement;-><init>(Lf0/k;Lh0/s;Lh0/o1;Lh0/d2;Lh0/x2;Lj0/i;ZZ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
