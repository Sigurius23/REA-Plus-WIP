.class public final synthetic Lp0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/internal/b0;

.field public final synthetic F:Z

.field public final synthetic G:F

.field public final synthetic H:Lkotlin/jvm/internal/e0;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:Lkotlin/jvm/internal/g0;

.field public final synthetic w:Ln0/r;

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:Lkotlin/jvm/internal/d0;


# direct methods
.method public synthetic constructor <init>(Ln0/r;IFLkotlin/jvm/internal/d0;Lkotlin/jvm/internal/b0;ZFLkotlin/jvm/internal/e0;IILkotlin/jvm/internal/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/p0;->w:Ln0/r;

    iput p2, p0, Lp0/p0;->x:I

    iput p3, p0, Lp0/p0;->y:F

    iput-object p4, p0, Lp0/p0;->z:Lkotlin/jvm/internal/d0;

    iput-object p5, p0, Lp0/p0;->E:Lkotlin/jvm/internal/b0;

    iput-boolean p6, p0, Lp0/p0;->F:Z

    iput p7, p0, Lp0/p0;->G:F

    iput-object p8, p0, Lp0/p0;->H:Lkotlin/jvm/internal/e0;

    iput p9, p0, Lp0/p0;->I:I

    iput p10, p0, Lp0/p0;->J:I

    iput-object p11, p0, Lp0/p0;->K:Lkotlin/jvm/internal/g0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Ld0/k;

    iget-object v0, p0, Lp0/p0;->w:Ln0/r;

    iget v1, p0, Lp0/p0;->x:I

    invoke-static {v0, v1}, Lp0/r0;->c(Ln0/r;I)Z

    move-result v2

    iget-object v3, p0, Lp0/p0;->E:Lkotlin/jvm/internal/b0;

    iget-boolean v4, p0, Lp0/p0;->F:Z

    iget v5, p0, Lp0/p0;->J:I

    const/4 v6, 0x0

    if-nez v2, :cond_7

    const/4 v2, 0x0

    iget v7, p0, Lp0/p0;->y:F

    cmpl-float v2, v7, v2

    if-lez v2, :cond_1

    iget-object v2, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpl-float v8, v2, v7

    if-lez v8, :cond_0

    goto :goto_0

    :cond_0
    move v7, v2

    goto :goto_0

    :cond_1
    iget-object v2, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v8, v2, v7

    if-gez v8, :cond_0

    :goto_0
    iget-object v2, p0, Lp0/p0;->z:Lkotlin/jvm/internal/d0;

    iget v8, v2, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v7, v8

    invoke-interface {v0, v7}, Lh0/k2;->a(F)F

    move-result v8

    invoke-static {v0, v1}, Lp0/r0;->c(Ln0/r;I)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v4, v0, v1, v5}, Lp0/r0;->b(ZLn0/r;II)Z

    move-result v9

    if-nez v9, :cond_7

    cmpg-float v8, v7, v8

    if-nez v8, :cond_6

    iget v8, v2, Lkotlin/jvm/internal/d0;->w:F

    add-float/2addr v8, v7

    iput v8, v2, Lkotlin/jvm/internal/d0;->w:F

    iget v2, p0, Lp0/p0;->G:F

    if-eqz v4, :cond_3

    iget-object v7, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    cmpl-float v2, v7, v2

    if-lez v2, :cond_4

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_1

    :cond_3
    iget-object v7, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    neg-float v2, v2

    cmpg-float v2, v7, v2

    if-gez v2, :cond_4

    invoke-virtual {p1}, Ld0/k;->a()V

    :cond_4
    :goto_1
    iget-object v2, p0, Lp0/p0;->H:Lkotlin/jvm/internal/e0;

    iget v7, p0, Lp0/p0;->I:I

    const/4 v8, 0x2

    if-eqz v4, :cond_5

    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    if-lt v2, v8, :cond_7

    invoke-virtual {v0}, Ln0/r;->e()I

    move-result v2

    sub-int v2, v1, v2

    if-le v2, v7, :cond_7

    sub-int v2, v1, v7

    invoke-virtual {v0, v2, v6}, Ln0/r;->f(II)V

    goto :goto_2

    :cond_5
    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    if-lt v2, v8, :cond_7

    invoke-virtual {v0}, Ln0/r;->c()I

    move-result v2

    sub-int/2addr v2, v1

    if-le v2, v7, :cond_7

    add-int/2addr v7, v1

    invoke-virtual {v0, v7, v6}, Ln0/r;->f(II)V

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ld0/k;->a()V

    iput-boolean v6, v3, Lkotlin/jvm/internal/b0;->w:Z

    goto :goto_3

    :cond_7
    :goto_2
    invoke-static {v4, v0, v1, v5}, Lp0/r0;->b(ZLn0/r;II)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0, v1, v5}, Ln0/r;->f(II)V

    iput-boolean v6, v3, Lkotlin/jvm/internal/b0;->w:Z

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_3

    :cond_8
    invoke-static {v0, v1}, Lp0/r0;->c(Ln0/r;I)Z

    move-result p1

    if-nez p1, :cond_9

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    invoke-virtual {v0, v1}, Ln0/r;->b(I)I

    move-result p1

    new-instance v0, Lp0/i;

    iget-object v1, p0, Lp0/p0;->K:Lkotlin/jvm/internal/g0;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ld0/m;

    invoke-direct {v0, p1, v1}, Lp0/i;-><init>(ILd0/m;)V

    throw v0
.end method
