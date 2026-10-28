.class final Lv41/d0$e$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/d0$e;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.PdfViewerKt$ZoomableBox$3$1$1"
    f = "PdfViewer.kt"
    l = {
        0x10c,
        0x10e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:F

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:F


# direct methods
.method public constructor <init>(FFLp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lv41/d0$e$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lv41/d0$e$a;->z:F

    iput p2, p0, Lv41/d0$e$a;->E:F

    iput-object p3, p0, Lv41/d0$e$a;->F:Lp1/c1;

    iput-object p4, p0, Lv41/d0$e$a;->G:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lv41/d0$e$a;

    iget v1, p0, Lv41/d0$e$a;->z:F

    iget v2, p0, Lv41/d0$e$a;->E:F

    iget-object v3, p0, Lv41/d0$e$a;->F:Lp1/c1;

    iget-object v4, p0, Lv41/d0$e$a;->G:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv41/d0$e$a;-><init>(FFLp1/c1;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lv41/d0$e$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lv41/d0$e$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/d0$e$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/d0$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/d0$e$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lv41/d0$e$a;->y:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lv41/d0$e$a;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v1, v0, Lv41/d0$e$a;->y:Ljava/lang/Object;

    iput v5, v0, Lv41/d0$e$a;->x:I

    invoke-static {v1, v0, v4}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iput-object v1, v0, Lv41/d0$e$a;->y:Ljava/lang/Object;

    iput v4, v0, Lv41/d0$e$a;->x:I

    invoke-static {v1, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    :goto_1
    return-object v2

    :cond_4
    :goto_2
    check-cast v3, Lu2/k;

    iget-object v6, v3, Lu2/k;->a:Ljava/lang/Object;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_5

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_4

    :cond_5
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x0

    :cond_6
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    iget-boolean v10, v10, Lu2/r;->d:Z

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ltz v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v1, 0x0

    throw v1

    :cond_8
    :goto_4
    if-ge v8, v4, :cond_a

    iget-object v7, v0, Lv41/d0$e$a;->F:Lp1/c1;

    invoke-static {v7}, Lv41/d0;->S(Lp1/c1;)F

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v7, v7, v8

    if-lez v7, :cond_9

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    move v7, v5

    :goto_6
    if-eqz v7, :cond_b

    invoke-static {v3}, Lh0/q3;->l(Lu2/k;)F

    move-result v7

    invoke-static {v3}, Lh0/q3;->j(Lu2/k;)J

    move-result-wide v10

    iget-object v3, v0, Lv41/d0$e$a;->F:Lp1/c1;

    invoke-static {v3}, Lv41/d0;->S(Lp1/c1;)F

    move-result v3

    mul-float/2addr v3, v7

    iget v7, v0, Lv41/d0$e$a;->z:F

    iget v8, v0, Lv41/d0$e$a;->E:F

    invoke-static {v3, v7, v8}, Le93/b;->m(FFF)F

    move-result v3

    move-object v7, v1

    check-cast v7, Lu2/g0;

    iget-object v7, v7, Lu2/g0;->F:Lu2/h0;

    iget-wide v7, v7, Lu2/h0;->Y:J

    const/16 v12, 0x20

    shr-long v13, v7, v12

    long-to-int v13, v13

    int-to-float v13, v13

    mul-float/2addr v13, v3

    shr-long v14, v7, v12

    long-to-int v14, v14

    int-to-float v14, v14

    sub-float/2addr v13, v14

    int-to-float v14, v4

    div-float/2addr v13, v14

    const-wide v15, 0xffffffffL

    and-long/2addr v7, v15

    long-to-int v7, v7

    int-to-float v7, v7

    mul-float v8, v7, v3

    sub-float/2addr v8, v7

    div-float/2addr v8, v14

    iget-object v7, v0, Lv41/d0$e$a;->G:Lp1/c1;

    invoke-static {v7}, Lv41/d0;->U(Lp1/c1;)J

    move-result-wide v17

    shr-long v4, v17, v12

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    move-wide/from16 v17, v10

    shr-long v9, v17, v12

    long-to-int v5, v9

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    add-float/2addr v5, v4

    neg-float v4, v13

    invoke-static {v5, v4, v13}, Le93/b;->m(FFF)F

    move-result v4

    iget-object v5, v0, Lv41/d0$e$a;->G:Lp1/c1;

    invoke-static {v5}, Lv41/d0;->U(Lp1/c1;)J

    move-result-wide v9

    and-long/2addr v9, v15

    long-to-int v5, v9

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    and-long v9, v17, v15

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    add-float/2addr v9, v5

    neg-float v5, v8

    invoke-static {v9, v5, v8}, Le93/b;->m(FFF)F

    move-result v5

    iget-object v8, v0, Lv41/d0$e$a;->F:Lp1/c1;

    invoke-static {v8, v3}, Lv41/d0;->T(Lp1/c1;F)V

    iget-object v3, v0, Lv41/d0$e$a;->G:Lp1/c1;

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v8, v12

    and-long/2addr v4, v15

    or-long/2addr v4, v8

    invoke-static {v3, v4, v5}, Lv41/d0;->V(Lp1/c1;J)V

    move-object v3, v6

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    invoke-virtual {v4}, Lu2/r;->a()V

    goto :goto_7

    :cond_b
    check-cast v6, Ljava/lang/Iterable;

    instance-of v3, v6, Ljava/util/Collection;

    if-eqz v3, :cond_d

    move-object v3, v6

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    :cond_c
    const/4 v9, 0x0

    goto :goto_8

    :cond_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    iget-boolean v4, v4, Lu2/r;->d:Z

    if-eqz v4, :cond_e

    const/4 v9, 0x1

    :goto_8
    if-nez v9, :cond_f

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_f
    const/4 v4, 0x2

    const/4 v5, 0x1

    goto/16 :goto_0
.end method
