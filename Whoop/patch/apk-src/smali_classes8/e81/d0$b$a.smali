.class final Le81/d0$b$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le81/d0$b;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.organism.piechart.PieChartKt$sliceSelection$1$1"
    f = "PieChart.kt"
    l = {
        0x128,
        0x135,
        0x141
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:F

.field I:F

.field J:I

.field private synthetic K:Ljava/lang/Object;

.field final synthetic L:Le81/r;

.field final synthetic M:F

.field final synthetic N:F

.field final synthetic O:Le81/u;

.field final synthetic P:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic Q:Lq2/a;

.field final synthetic R:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le81/h0;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic S:F

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le81/r;FFLe81/u;Lkotlin/jvm/functions/Function1;Lq2/a;Ljava/util/List;FLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/r;",
            "FF",
            "Le81/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq2/a;",
            "Ljava/util/List<",
            "Le81/h0;",
            ">;F",
            "Lq83/d<",
            "-",
            "Le81/d0$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le81/d0$b$a;->L:Le81/r;

    iput p2, p0, Le81/d0$b$a;->M:F

    iput p3, p0, Le81/d0$b$a;->N:F

    iput-object p4, p0, Le81/d0$b$a;->O:Le81/u;

    iput-object p5, p0, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Le81/d0$b$a;->Q:Lq2/a;

    iput-object p7, p0, Le81/d0$b$a;->R:Ljava/util/List;

    iput p8, p0, Le81/d0$b$a;->S:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Le81/t;FFLe81/r;Lkotlin/jvm/internal/g0;Lkotlin/jvm/functions/Function1;Le81/u;Lq2/a;Ljava/util/List;FLu2/r;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Le81/d0$b$a;->i(Le81/t;FFLe81/r;Lkotlin/jvm/internal/g0;Lkotlin/jvm/functions/Function1;Le81/u;Lq2/a;Ljava/util/List;FLu2/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Le81/t;FFLe81/r;Lkotlin/jvm/internal/g0;Lkotlin/jvm/functions/Function1;Le81/u;Lq2/a;Ljava/util/List;FLu2/r;)Ll83/a0;
    .locals 4

    invoke-virtual {p10}, Lu2/r;->a()V

    iget-wide v0, p10, Lu2/r;->c:J

    const/16 p10, 0x20

    shr-long v2, v0, p10

    long-to-int p10, v2

    invoke-static {p10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p10

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p0, p10, v0, p1, p2}, Le81/t;->j(FFFF)Le81/t$c;

    move-result-object p1

    invoke-virtual {p1}, Le81/t$c;->b()F

    move-result p2

    invoke-virtual {p0}, Le81/t;->a()F

    move-result p0

    cmpg-float p0, p2, p0

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-gez p0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p1}, Le81/t$c;->a()F

    move-result p0

    invoke-virtual {p3, p0}, Le81/r;->c(F)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-static {p3, p8, p9}, Le81/d0;->R(ILjava/util/List;F)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, p1

    :goto_0
    iget-object p3, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    iput-object p0, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-interface {p5, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    const/4 p3, 0x2

    invoke-static {p6, p7, p0, p3, p1}, Le81/d0;->P(Le81/u;Lq2/a;IILjava/lang/Object;)V

    :cond_2
    return-object p2
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Le81/d0$b$a;

    iget-object v1, p0, Le81/d0$b$a;->L:Le81/r;

    iget v2, p0, Le81/d0$b$a;->M:F

    iget v3, p0, Le81/d0$b$a;->N:F

    iget-object v4, p0, Le81/d0$b$a;->O:Le81/u;

    iget-object v5, p0, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Le81/d0$b$a;->Q:Lq2/a;

    iget-object v7, p0, Le81/d0$b$a;->R:Ljava/util/List;

    iget v8, p0, Le81/d0$b$a;->S:F

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Le81/d0$b$a;-><init>(Le81/r;FFLe81/u;Lkotlin/jvm/functions/Function1;Lq2/a;Ljava/util/List;FLq83/d;)V

    iput-object p1, v0, Le81/d0$b$a;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Lu2/b;Lq83/d;)Ljava/lang/Object;
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

    invoke-virtual {p0, p1, p2}, Le81/d0$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le81/d0$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le81/d0$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le81/d0$b$a;->h(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v1, p0

    iget-object v0, v1, Le81/d0$b$a;->K:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Le81/d0$b$a;->J:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v9, 0x1

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/16 v11, 0x20

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v9, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v2, v1, Le81/d0$b$a;->G:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v2, v1, Le81/d0$b$a;->F:Ljava/lang/Object;

    check-cast v2, Le81/t$c;

    iget-object v2, v1, Le81/d0$b$a;->E:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v2, v1, Le81/d0$b$a;->z:Ljava/lang/Object;

    check-cast v2, Le81/t$c;

    iget-object v2, v1, Le81/d0$b$a;->y:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v2, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    check-cast v2, Le81/t;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, p1

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v3, v1, Le81/d0$b$a;->I:F

    iget v6, v1, Le81/d0$b$a;->H:F

    iget-object v9, v1, Le81/d0$b$a;->z:Ljava/lang/Object;

    check-cast v9, Le81/t$c;

    iget-object v9, v1, Le81/d0$b$a;->y:Ljava/lang/Object;

    check-cast v9, Lu2/r;

    iget-object v9, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    check-cast v9, Le81/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v7, v3

    const-wide v20, 0xffffffffL

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_2
    iget v3, v1, Le81/d0$b$a;->I:F

    iget v9, v1, Le81/d0$b$a;->H:F

    iget-object v13, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    check-cast v13, Le81/t;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v8, p1

    move v7, v3

    move v6, v9

    move-object v9, v13

    const-wide v20, 0xffffffffL

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v14, Le81/t;

    move-object v3, v0

    check-cast v3, Lu2/g0;

    iget-object v13, v3, Lu2/g0;->F:Lu2/h0;

    const-wide v20, 0xffffffffL

    iget-wide v7, v13, Lu2/h0;->Y:J

    shr-long/2addr v7, v11

    long-to-int v7, v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float v15, v7, v8

    iget-object v7, v1, Le81/d0$b$a;->L:Le81/r;

    invoke-virtual {v7}, Le81/r;->a()I

    move-result v16

    iget v7, v1, Le81/d0$b$a;->M:F

    iget v13, v1, Le81/d0$b$a;->N:F

    move/from16 p1, v8

    iget-object v8, v1, Le81/d0$b$a;->O:Le81/u;

    invoke-virtual {v8}, Le81/u;->c()F

    move-result v8

    invoke-virtual {v3, v8}, Lu2/g0;->q0(F)F

    move-result v19

    move/from16 v17, v7

    move/from16 v18, v13

    invoke-direct/range {v14 .. v19}, Le81/t;-><init>(FIFFF)V

    iget-object v3, v3, Lu2/g0;->F:Lu2/h0;

    iget-wide v7, v3, Lu2/h0;->Y:J

    move-wide v15, v7

    shr-long v6, v15, v11

    long-to-int v6, v6

    int-to-float v6, v6

    div-float v6, v6, p1

    and-long v7, v15, v20

    long-to-int v7, v7

    int-to-float v7, v7

    div-float v7, v7, p1

    iput-object v0, v1, Le81/d0$b$a;->K:Ljava/lang/Object;

    iput-object v14, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    iput v6, v1, Le81/d0$b$a;->H:F

    iput v7, v1, Le81/d0$b$a;->I:F

    iput v9, v1, Le81/d0$b$a;->J:I

    invoke-static {v0, v1, v5}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v9, v14

    :goto_0
    check-cast v8, Lu2/r;

    invoke-static {v9}, Le81/d0;->Q(Le81/t;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_2

    :cond_5
    iget-wide v13, v8, Lu2/r;->c:J

    shr-long/2addr v13, v11

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    iget-wide v14, v8, Lu2/r;->c:J

    and-long v14, v14, v20

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    invoke-virtual {v9, v13, v14, v6, v7}, Le81/t;->j(FFFF)Le81/t$c;

    move-result-object v13

    invoke-virtual {v13}, Le81/t$c;->b()F

    move-result v13

    invoke-virtual {v9, v13}, Le81/t;->k(F)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_2

    :cond_6
    iget-wide v13, v8, Lu2/r;->a:J

    iput-object v0, v1, Le81/d0$b$a;->K:Ljava/lang/Object;

    iput-object v9, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    iput-object v12, v1, Le81/d0$b$a;->y:Ljava/lang/Object;

    iput-object v12, v1, Le81/d0$b$a;->z:Ljava/lang/Object;

    iput v6, v1, Le81/d0$b$a;->H:F

    iput v7, v1, Le81/d0$b$a;->I:F

    const/4 v3, 0x2

    iput v3, v1, Le81/d0$b$a;->J:I

    invoke-static {v0, v13, v14, v1}, Lh0/z0;->d(Lu2/b;JLs83/a;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto/16 :goto_4

    :cond_7
    :goto_1
    check-cast v3, Lu2/r;

    if-nez v3, :cond_8

    :goto_2
    return-object v10

    :cond_8
    iget-wide v13, v3, Lu2/r;->c:J

    move-wide v15, v13

    shr-long v12, v15, v11

    long-to-int v11, v12

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    and-long v12, v15, v20

    long-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    invoke-virtual {v9, v11, v12, v6, v7}, Le81/t;->j(FFFF)Le81/t$c;

    move-result-object v11

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    iget-object v13, v1, Le81/d0$b$a;->L:Le81/r;

    invoke-virtual {v11}, Le81/t$c;->a()F

    move-result v11

    invoke-virtual {v13, v11}, Le81/r;->c(F)Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_9

    iget-object v13, v1, Le81/d0$b$a;->R:Ljava/util/List;

    iget v14, v1, Le81/d0$b$a;->S:F

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v15

    invoke-static {v15, v13, v14}, Le81/d0;->R(ILjava/util/List;F)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_3

    :cond_9
    const/4 v11, 0x0

    :goto_3
    iput-object v11, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v13, v1, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    invoke-interface {v13, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v11, v1, Le81/d0$b$a;->O:Le81/u;

    iget-object v13, v1, Le81/d0$b$a;->Q:Lq2/a;

    invoke-static {v11, v13, v4}, Le81/d0;->H(Le81/u;Lq2/a;I)V

    :try_start_1
    iget-wide v13, v3, Lu2/r;->a:J

    iget-object v3, v1, Le81/d0$b$a;->L:Le81/r;

    iget-object v11, v1, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    iget-object v15, v1, Le81/d0$b$a;->O:Le81/u;

    iget-object v4, v1, Le81/d0$b$a;->Q:Lq2/a;

    iget-object v8, v1, Le81/d0$b$a;->R:Ljava/util/List;

    iget v5, v1, Le81/d0$b$a;->S:F

    new-instance v22, Le81/e0;

    move-object/from16 v26, v3

    move-object/from16 v30, v4

    move/from16 v32, v5

    move/from16 v24, v6

    move/from16 v25, v7

    move-object/from16 v31, v8

    move-object/from16 v23, v9

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    move-object/from16 v29, v15

    invoke-direct/range {v22 .. v32}, Le81/e0;-><init>(Le81/t;FFLe81/r;Lkotlin/jvm/internal/g0;Lkotlin/jvm/functions/Function1;Le81/u;Lq2/a;Ljava/util/List;F)V

    move-object/from16 v4, v22

    move/from16 v6, v24

    move/from16 v3, v25

    iput-object v0, v1, Le81/d0$b$a;->K:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v1, Le81/d0$b$a;->x:Ljava/lang/Object;

    iput-object v8, v1, Le81/d0$b$a;->y:Ljava/lang/Object;

    iput-object v8, v1, Le81/d0$b$a;->z:Ljava/lang/Object;

    iput-object v8, v1, Le81/d0$b$a;->E:Ljava/lang/Object;

    iput-object v8, v1, Le81/d0$b$a;->F:Ljava/lang/Object;

    iput-object v8, v1, Le81/d0$b$a;->G:Ljava/lang/Object;

    iput v6, v1, Le81/d0$b$a;->H:F

    iput v3, v1, Le81/d0$b$a;->I:F

    const/4 v3, 0x3

    iput v3, v1, Le81/d0$b$a;->J:I

    invoke-static {v0, v13, v14, v4, v1}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_a

    :goto_4
    return-object v2

    :cond_a
    :goto_5
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_c

    check-cast v0, Lu2/g0;

    iget-object v0, v0, Lu2/g0;->F:Lu2/h0;

    iget-object v0, v0, Lu2/h0;->T:Lu2/k;

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v2, :cond_c

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    invoke-static {v3}, Lu2/d0;->d(Lu2/r;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v3}, Lu2/r;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_c
    iget-object v0, v1, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-interface {v0, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v10

    :goto_7
    iget-object v2, v1, Le81/d0$b$a;->P:Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-interface {v2, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method
