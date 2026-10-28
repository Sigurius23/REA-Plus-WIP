.class public final Lg1/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Li93/f;

.field public final synthetic y:I

.field public final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(ZLi93/f;ILp1/c1;FZLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/c6;->w:Z

    iput-object p2, p0, Lg1/c6;->x:Li93/f;

    iput p3, p0, Lg1/c6;->y:I

    iput-object p4, p0, Lg1/c6;->z:Lp1/c1;

    iput p5, p0, Lg1/c6;->E:F

    iput-boolean p6, p0, Lg1/c6;->F:Z

    iput-object p7, p0, Lg1/c6;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    iget-boolean v0, p0, Lg1/c6;->w:Z

    if-nez v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_c

    iget-object v0, p0, Lg1/c6;->x:Li93/f;

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    sub-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v4, p0, Lg1/c6;->y:I

    if-lez v4, :cond_1

    add-int/2addr v4, v3

    goto :goto_0

    :cond_1
    const/16 v4, 0x64

    :goto_0
    int-to-float v5, v4

    div-float/2addr v1, v5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Ls2/h;->b(I)J

    move-result-wide v5

    sget-wide v7, Ls2/b;->d:J

    invoke-static {v5, v6, v7, v8}, Ls2/b;->a(JJ)Z

    move-result p1

    iget v7, p0, Lg1/c6;->E:F

    iget-object v8, p0, Lg1/c6;->z:Lp1/c1;

    if-eqz p1, :cond_3

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    add-float/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    move v2, v3

    goto/16 :goto_4

    :cond_3
    sget-wide v9, Ls2/b;->e:J

    invoke-static {v5, v6, v9, v10}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    sub-float/2addr v7, v1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    sget-wide v9, Ls2/b;->g:J

    invoke-static {v5, v6, v9, v10}, Ls2/b;->a(JJ)Z

    move-result p1

    const/4 v9, -0x1

    iget-boolean v10, p0, Lg1/c6;->F:Z

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    goto :goto_2

    :cond_5
    move v9, v3

    :goto_2
    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    int-to-float v2, v9

    mul-float/2addr v2, v1

    add-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    sget-wide v11, Ls2/b;->f:J

    invoke-static {v5, v6, v11, v12}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    move v9, v3

    :goto_3
    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    int-to-float v2, v9

    mul-float/2addr v2, v1

    sub-float/2addr v7, v2

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_8
    sget-wide v9, Ls2/b;->m:J

    invoke-static {v5, v6, v9, v10}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_9
    sget-wide v9, Ls2/b;->n:J

    invoke-static {v5, v6, v9, v10}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    sget-wide v9, Ls2/b;->o:J

    invoke-static {v5, v6, v9, v10}, Ls2/b;->a(JJ)Z

    move-result p1

    const/16 v9, 0xa

    if-eqz p1, :cond_b

    div-int/2addr v4, v9

    invoke-static {v4, v3, v9}, Le93/b;->n(III)I

    move-result p1

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    int-to-float p1, p1

    mul-float/2addr p1, v1

    sub-float/2addr v7, p1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_b
    sget-wide v10, Ls2/b;->p:J

    invoke-static {v5, v6, v10, v11}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_e

    div-int/2addr v4, v9

    invoke-static {v4, v3, v9}, Le93/b;->n(III)I

    move-result p1

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    int-to-float p1, p1

    mul-float/2addr p1, v1

    add-float/2addr p1, v7

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1, v0}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_c
    if-ne v0, v3, :cond_e

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Ls2/h;->b(I)J

    move-result-wide v0

    sget-wide v4, Ls2/b;->d:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->e:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->g:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->f:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->m:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->n:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->o:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_d

    sget-wide v4, Ls2/b;->p:J

    invoke-static {v0, v1, v4, v5}, Ls2/b;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_d
    iget-object p1, p0, Lg1/c6;->G:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/a;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto/16 :goto_1

    :cond_e
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
