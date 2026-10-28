.class final Lwr0/u0$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwr0/u0;->K(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/lang/String;ZFLandroidx/compose/ui/Modifier;Lc93/n;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "velocity",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;F)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.communitymoments.view.MomentStackKt$MomentStackPager$3$1"
    f = "MomentStack.kt"
    l = {
        0xfb,
        0xfc,
        0x104
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:F

.field final synthetic G:Lp1/z0;

.field final synthetic H:F

.field final synthetic I:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic K:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic L:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic M:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic N:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:F

.field x:F

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lp1/z0;FLd0/e;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/c1;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/z0;",
            "F",
            "Ld0/e;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lwr0/u0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwr0/u0$d;->G:Lp1/z0;

    iput p2, p0, Lwr0/u0$d;->H:F

    iput-object p3, p0, Lwr0/u0$d;->I:Ld0/e;

    iput-object p4, p0, Lwr0/u0$d;->J:Lp1/t2;

    iput-object p5, p0, Lwr0/u0$d;->K:Lp1/t2;

    iput-object p6, p0, Lwr0/u0$d;->L:Lp1/t2;

    iput-object p7, p0, Lwr0/u0$d;->M:Lp1/c1;

    iput-object p8, p0, Lwr0/u0$d;->N:Lp1/t2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/z0;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwr0/u0$d;->i(Lp1/z0;Ld0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lp1/z0;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final h(Lbc3/c0;FLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "F",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwr0/u0$d;

    iget-object v1, p0, Lwr0/u0$d;->G:Lp1/z0;

    iget v2, p0, Lwr0/u0$d;->H:F

    iget-object v3, p0, Lwr0/u0$d;->I:Ld0/e;

    iget-object v4, p0, Lwr0/u0$d;->J:Lp1/t2;

    iget-object v5, p0, Lwr0/u0$d;->K:Lp1/t2;

    iget-object v6, p0, Lwr0/u0$d;->L:Lp1/t2;

    iget-object v7, p0, Lwr0/u0$d;->M:Lp1/c1;

    iget-object v8, p0, Lwr0/u0$d;->N:Lp1/t2;

    move-object v9, p3

    invoke-direct/range {v0 .. v9}, Lwr0/u0$d;-><init>(Lp1/z0;FLd0/e;Lp1/t2;Lp1/t2;Lp1/t2;Lp1/c1;Lp1/t2;Lq83/d;)V

    iput p2, v0, Lwr0/u0$d;->F:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lwr0/u0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lwr0/u0$d;->h(Lbc3/c0;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v4, p0

    iget v6, v4, Lwr0/u0$d;->F:F

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v4, Lwr0/u0$d;->E:I

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v13, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v12, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v4, Lwr0/u0$d;->x:F

    iget v1, v4, Lwr0/u0$d;->w:F

    iget v2, v4, Lwr0/u0$d;->z:I

    iget v3, v4, Lwr0/u0$d;->y:I

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1

    :cond_2
    iget v0, v4, Lwr0/u0$d;->x:F

    iget v2, v4, Lwr0/u0$d;->w:F

    iget v3, v4, Lwr0/u0$d;->z:I

    iget v5, v4, Lwr0/u0$d;->y:I

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v10, v2

    move v9, v3

    move v8, v5

    :cond_3
    move v7, v0

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, Lwr0/u0$d;->J:Lp1/t2;

    invoke-static {v0}, Lwr0/u0;->Y(Lp1/t2;)I

    move-result v8

    iget-object v0, v4, Lwr0/u0$d;->K:Lp1/t2;

    invoke-static {v0}, Lwr0/u0;->Z(Lp1/t2;)I

    move-result v9

    iget-object v0, v4, Lwr0/u0$d;->L:Lp1/t2;

    invoke-static {v0}, Lwr0/u0;->a0(Lp1/t2;)F

    move-result v10

    iget-object v0, v4, Lwr0/u0$d;->G:Lp1/z0;

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v5

    iget v0, v4, Lwr0/u0$d;->H:F

    const v3, 0x3e4ccccd    # 0.2f

    mul-float/2addr v3, v10

    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static/range {v5 .. v10}, Lwr0/u0;->q0(FFFIIF)F

    move-result v0

    iget-object v3, v4, Lwr0/u0$d;->M:Lp1/c1;

    invoke-static {v3, v2}, Lwr0/u0;->c0(Lp1/c1;Z)V

    :try_start_3
    iget-object v3, v4, Lwr0/u0$d;->I:Ld0/e;

    iget-object v5, v4, Lwr0/u0$d;->G:Lp1/z0;

    check-cast v5, Lp1/g1;

    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v5

    new-instance v7, Ljava/lang/Float;

    invoke-direct {v7, v5}, Ljava/lang/Float;-><init>(F)V

    iput v6, v4, Lwr0/u0$d;->F:F

    iput v8, v4, Lwr0/u0$d;->y:I

    iput v9, v4, Lwr0/u0$d;->z:I

    iput v10, v4, Lwr0/u0$d;->w:F

    iput v0, v4, Lwr0/u0$d;->x:F

    iput v2, v4, Lwr0/u0$d;->E:I

    invoke-virtual {v3, v7, v4}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_3

    goto/16 :goto_3

    :goto_0
    iget-object v0, v4, Lwr0/u0$d;->I:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v7}, Ljava/lang/Float;-><init>(F)V

    const/16 v3, 0xdc

    const/4 v5, 0x6

    const/4 v14, 0x0

    invoke-static {v3, v13, v14, v5}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    iget-object v5, v4, Lwr0/u0$d;->G:Lp1/z0;

    move-object v14, v2

    move-object v2, v3

    new-instance v3, Lwr0/v0;

    const/4 v15, 0x0

    invoke-direct {v3, v5, v15}, Lwr0/v0;-><init>(Ljava/lang/Object;I)V

    iput v6, v4, Lwr0/u0$d;->F:F

    iput v8, v4, Lwr0/u0$d;->y:I

    iput v9, v4, Lwr0/u0$d;->z:I

    iput v10, v4, Lwr0/u0$d;->w:F

    iput v7, v4, Lwr0/u0$d;->x:F

    iput v1, v4, Lwr0/u0$d;->E:I

    const/4 v5, 0x4

    move-object v1, v14

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_5

    goto :goto_3

    :cond_5
    move v0, v7

    move v3, v8

    move v2, v9

    move v1, v10

    :goto_1
    const/4 v5, 0x0

    cmpg-float v7, v0, v5

    if-gez v7, :cond_6

    iget-object v7, v4, Lwr0/u0$d;->N:Lp1/t2;

    invoke-static {v7}, Lwr0/u0;->b0(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v7

    invoke-static {v3, v2}, Lwr0/u0;->j0(II)I

    move-result v8

    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v7, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    cmpl-float v7, v0, v5

    if-lez v7, :cond_7

    iget-object v7, v4, Lwr0/u0$d;->N:Lp1/t2;

    invoke-static {v7}, Lwr0/u0;->b0(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object v7

    invoke-static {v3, v2}, Lwr0/u0;->p0(II)I

    move-result v8

    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v7, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    iget-object v7, v4, Lwr0/u0$d;->G:Lp1/z0;

    check-cast v7, Lp1/g1;

    invoke-virtual {v7, v5}, Lp1/g1;->y(F)V

    iget-object v7, v4, Lwr0/u0$d;->I:Ld0/e;

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, v5}, Ljava/lang/Float;-><init>(F)V

    iput v6, v4, Lwr0/u0$d;->F:F

    iput v3, v4, Lwr0/u0$d;->y:I

    iput v2, v4, Lwr0/u0$d;->z:I

    iput v1, v4, Lwr0/u0$d;->w:F

    iput v0, v4, Lwr0/u0$d;->x:F

    iput v12, v4, Lwr0/u0$d;->E:I

    invoke-virtual {v7, v8, v4}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v11, :cond_8

    :goto_3
    return-object v11

    :cond_8
    :goto_4
    iget-object v0, v4, Lwr0/u0$d;->M:Lp1/c1;

    invoke-static {v0, v13}, Lwr0/u0;->c0(Lp1/c1;Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_5
    iget-object v1, v4, Lwr0/u0$d;->M:Lp1/c1;

    invoke-static {v1, v13}, Lwr0/u0;->c0(Lp1/c1;Z)V

    throw v0
.end method
