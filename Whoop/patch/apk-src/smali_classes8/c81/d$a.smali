.class final Lc81/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc81/d;->i(Landroidx/compose/ui/Modifier;Lc81/g;Lkd1/t;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.paceofagingmeter.PaceOfAgingMeterKt$PaceOfAgingMeter$1$1"
    f = "PaceOfAgingMeter.kt"
    l = {
        0x4f,
        0x51,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:F

.field G:I

.field final synthetic H:Lc81/g;

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp1/c1;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic K:Lkd1/t;

.field final synthetic L:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc81/g;Lp1/c1;Ljava/util/List;Lkd1/t;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc81/g;",
            "Lp1/c1;",
            "Ljava/util/List<",
            "+",
            "Lp1/c1;",
            ">;",
            "Lkd1/t;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lc81/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc81/d$a;->H:Lc81/g;

    iput-object p2, p0, Lc81/d$a;->I:Lp1/c1;

    iput-object p3, p0, Lc81/d$a;->J:Ljava/util/List;

    iput-object p4, p0, Lc81/d$a;->K:Lkd1/t;

    iput-object p5, p0, Lc81/d$a;->L:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;ILkd1/t;Li93/h;Lp1/c1;Lkotlin/jvm/internal/d0;Lc81/g;Ljava/util/List;J)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lc81/d$a;->h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;ILkd1/t;Li93/h;Lp1/c1;Lkotlin/jvm/internal/d0;Lc81/g;Ljava/util/List;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;ILkd1/t;Li93/h;Lp1/c1;Lkotlin/jvm/internal/d0;Lc81/g;Ljava/util/List;J)Ll83/a0;
    .locals 4

    iget-wide v0, p0, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p9, p0, Lkotlin/jvm/internal/f0;->w:J

    :cond_0
    iget-wide v0, p0, Lkotlin/jvm/internal/f0;->w:J

    sub-long/2addr p9, v0

    iput-wide p9, p1, Lkotlin/jvm/internal/f0;->w:J

    const/4 p0, 0x0

    if-eqz p2, :cond_1

    long-to-float p1, p9

    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_1
    move p1, p0

    :goto_0
    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p0, p2}, Le93/b;->m(FFF)F

    move-result p0

    invoke-virtual {p3, p4, p0}, Lkd1/t;->c(Li93/h;F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p5, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget p1, p6, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_5

    iget p1, p6, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-static {p0}, Le93/b;->X(F)I

    move-result p2

    if-eq p1, p2, :cond_5

    new-instance p1, Ll83/k;

    iget p2, p6, Lkotlin/jvm/internal/d0;->w:F

    float-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    float-to-int p5, p0

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-direct {p1, p2, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lkd1/t;->b(Ll83/k;)Li93/h;

    move-result-object p1

    iget p2, p1, Li93/h;->w:I

    iget p5, p1, Li93/h;->x:I

    iget p1, p1, Li93/h;->y:I

    if-lez p1, :cond_2

    if-le p2, p5, :cond_3

    :cond_2
    if-gez p1, :cond_5

    if-gt p5, p2, :cond_5

    :cond_3
    :goto_1
    invoke-virtual {p7}, Lc81/g;->j()Ljava/util/List;

    move-result-object p9

    invoke-static {p2, p9}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p9

    check-cast p9, Lc81/e;

    if-eqz p9, :cond_4

    invoke-static {p2, p8}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p10

    check-cast p10, Lp1/c1;

    if-eqz p10, :cond_4

    invoke-static {p4, p2, p9, p3}, Lc81/d;->m(Li93/h;ILc81/e;Lkd1/t;)J

    move-result-wide v0

    new-instance p9, Li2/x;

    invoke-direct {p9, v0, v1}, Li2/x;-><init>(J)V

    invoke-interface {p10, p9}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_4
    if-eq p2, p5, :cond_5

    add-int/2addr p2, p1

    goto :goto_1

    :cond_5
    iput p0, p6, Lkotlin/jvm/internal/d0;->w:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lc81/d$a;

    iget-object v1, p0, Lc81/d$a;->H:Lc81/g;

    iget-object v2, p0, Lc81/d$a;->I:Lp1/c1;

    iget-object v3, p0, Lc81/d$a;->J:Ljava/util/List;

    iget-object v4, p0, Lc81/d$a;->K:Lkd1/t;

    iget-object v5, p0, Lc81/d$a;->L:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lc81/d$a;-><init>(Lc81/g;Lp1/c1;Ljava/util/List;Lkd1/t;Lp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc81/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc81/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc81/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc81/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lc81/d$a;->G:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget v2, v0, Lc81/d$a;->F:F

    iget v5, v0, Lc81/d$a;->E:I

    iget-object v6, v0, Lc81/d$a;->z:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/d0;

    iget-object v7, v0, Lc81/d$a;->y:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/f0;

    iget-object v8, v0, Lc81/d$a;->x:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/f0;

    iget-object v9, v0, Lc81/d$a;->w:Ljava/lang/Object;

    check-cast v9, Li93/h;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move v14, v5

    move-object v13, v7

    move-object v12, v8

    :cond_0
    move-object/from16 v18, v6

    move-object/from16 v16, v9

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lc81/d$a;->H:Lc81/g;

    invoke-virtual {v2}, Lc81/g;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v3

    :cond_5
    iget-object v2, v0, Lc81/d$a;->I:Lp1/c1;

    iget-object v7, v0, Lc81/d$a;->H:Lc81/g;

    iget-object v8, v0, Lc81/d$a;->J:Ljava/util/List;

    iget-object v9, v0, Lc81/d$a;->K:Lkd1/t;

    iput v6, v0, Lc81/d$a;->G:I

    invoke-static {v2, v7, v8, v9, v0}, Lc81/d;->p(Lp1/c1;Lc81/g;Ljava/util/List;Lkd1/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_0
    iput v5, v0, Lc81/d$a;->G:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    iget-object v2, v0, Lc81/d$a;->H:Lc81/g;

    invoke-virtual {v2}, Lc81/g;->c()Li93/h;

    move-result-object v2

    iget-object v5, v0, Lc81/d$a;->K:Lkd1/t;

    invoke-virtual {v5, v2}, Lkd1/t;->a(Li93/h;)I

    move-result v5

    mul-int/lit8 v5, v5, 0x3c

    iget-object v6, v0, Lc81/d$a;->L:Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    new-instance v7, Lkotlin/jvm/internal/f0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const-wide/16 v8, -0x1

    iput-wide v8, v7, Lkotlin/jvm/internal/f0;->w:J

    new-instance v10, Lkotlin/jvm/internal/f0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    iput-wide v8, v10, Lkotlin/jvm/internal/f0;->w:J

    new-instance v8, Lkotlin/jvm/internal/d0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput v6, v8, Lkotlin/jvm/internal/d0;->w:F

    move-object/from16 v16, v2

    move v14, v5

    move v2, v6

    move-object v12, v7

    move-object/from16 v18, v8

    move-object v13, v10

    :goto_2
    iget-wide v5, v13, Lkotlin/jvm/internal/f0;->w:J

    int-to-long v7, v14

    cmp-long v5, v5, v7

    if-gez v5, :cond_8

    iget-object v15, v0, Lc81/d$a;->K:Lkd1/t;

    iget-object v5, v0, Lc81/d$a;->L:Lp1/c1;

    iget-object v6, v0, Lc81/d$a;->H:Lc81/g;

    iget-object v7, v0, Lc81/d$a;->J:Ljava/util/List;

    new-instance v11, Lc81/c;

    move-object/from16 v17, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    invoke-direct/range {v11 .. v20}, Lc81/c;-><init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/f0;ILkd1/t;Li93/h;Lp1/c1;Lkotlin/jvm/internal/d0;Lc81/g;Ljava/util/List;)V

    move-object/from16 v9, v16

    move-object/from16 v6, v18

    iput-object v9, v0, Lc81/d$a;->w:Ljava/lang/Object;

    iput-object v12, v0, Lc81/d$a;->x:Ljava/lang/Object;

    iput-object v13, v0, Lc81/d$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lc81/d$a;->z:Ljava/lang/Object;

    iput v14, v0, Lc81/d$a;->E:I

    iput v2, v0, Lc81/d$a;->F:F

    iput v4, v0, Lc81/d$a;->G:I

    invoke-static {v11, v0}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_0

    :goto_3
    return-object v1

    :cond_8
    move-object/from16 v9, v16

    iget-object v1, v0, Lc81/d$a;->I:Lp1/c1;

    invoke-interface {v1, v9}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v3
.end method
