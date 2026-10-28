.class final Lt81/l$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt81/l;->O(ZZLu81/d;Lu81/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.zoomable.ZoomableGraphKt$ZoomableGraphAnimator$4$1"
    f = "ZoomableGraph.kt"
    l = {
        0x10c,
        0x112
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lu81/b;

.field final synthetic F:Z

.field final synthetic G:Z

.field final synthetic H:Lu81/d;

.field final synthetic I:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic J:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic K:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field w:J

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lu81/b;ZZLu81/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu81/b;",
            "ZZ",
            "Lu81/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lt81/l$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt81/l$d;->E:Lu81/b;

    iput-boolean p2, p0, Lt81/l$d;->F:Z

    iput-boolean p3, p0, Lt81/l$d;->G:Z

    iput-object p4, p0, Lt81/l$d;->H:Lu81/d;

    iput-object p5, p0, Lt81/l$d;->I:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lt81/l$d;->J:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lt81/l$d;->K:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;J)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lt81/l$d;->j(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(J)J
    .locals 0

    invoke-static {p0, p1}, Lt81/l$d;->i(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final i(J)J
    .locals 0

    return-wide p0
.end method

.method private static final j(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;J)Ll83/a0;
    .locals 10

    move-object/from16 v0, p6

    invoke-virtual {p1}, Lu81/d;->b()F

    move-result v2

    invoke-virtual {p1}, Lu81/d;->a()F

    move-result v3

    invoke-virtual {p2}, Lu81/b;->b()I

    move-result v4

    invoke-virtual {p2}, Lu81/b;->a()I

    move-result v5

    move-object v1, p0

    move-wide v8, p3

    move-wide/from16 v6, p9

    invoke-virtual/range {v1 .. v9}, Lt81/b;->a(FFIIJJ)Lt81/c;

    move-result-object p0

    invoke-virtual {p0}, Lt81/c;->c()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p5, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lt81/c;->a()F

    move-result p2

    iget p3, v0, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    move-object/from16 p3, p7

    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lt81/c;->a()F

    move-result p2

    iput p2, v0, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p0}, Lt81/c;->b()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lu81/d;->a()F

    move-result p0

    invoke-virtual {p1}, Lu81/d;->b()F

    move-result p2

    cmpl-float p0, p0, p2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1}, Lu81/d;->a()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    move-object/from16 p2, p8

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lt81/l$d;

    iget-object v1, p0, Lt81/l$d;->E:Lu81/b;

    iget-boolean v2, p0, Lt81/l$d;->F:Z

    iget-boolean v3, p0, Lt81/l$d;->G:Z

    iget-object v4, p0, Lt81/l$d;->H:Lu81/d;

    iget-object v5, p0, Lt81/l$d;->I:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lt81/l$d;->J:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lt81/l$d;->K:Lc93/m;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lt81/l$d;-><init>(Lu81/b;ZZLu81/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lt81/l$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt81/l$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt81/l$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt81/l$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt81/l$d;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v4, v0, Lt81/l$d;->w:J

    iget-object v2, v0, Lt81/l$d;->y:Ljava/lang/Object;

    check-cast v2, Lt81/b;

    iget-object v6, v0, Lt81/l$d;->x:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/d0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move-wide v12, v4

    move-object v15, v6

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lt81/p;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Lt81/p;-><init>(I)V

    iput v4, v0, Lt81/l$d;->z:I

    invoke-static {v2, v0}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    new-instance v2, Lkotlin/jvm/internal/d0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v6, v0, Lt81/l$d;->E:Lu81/b;

    invoke-virtual {v6}, Lu81/b;->b()I

    move-result v6

    int-to-float v6, v6

    iput v6, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-boolean v6, v0, Lt81/l$d;->F:Z

    if-eqz v6, :cond_5

    new-instance v6, Lt81/b;

    const/high16 v7, 0x43fa0000    # 500.0f

    invoke-direct {v6, v7}, Lt81/b;-><init>(F)V

    move-object v15, v2

    move-wide v12, v4

    move-object v9, v6

    :cond_4
    :goto_1
    iget-boolean v2, v0, Lt81/l$d;->G:Z

    if-eqz v2, :cond_5

    iget-object v10, v0, Lt81/l$d;->H:Lu81/d;

    iget-object v11, v0, Lt81/l$d;->E:Lu81/b;

    iget-object v14, v0, Lt81/l$d;->I:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lt81/l$d;->J:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lt81/l$d;->K:Lc93/m;

    new-instance v8, Lt81/q;

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    invoke-direct/range {v8 .. v17}, Lt81/q;-><init>(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;)V

    iput-object v15, v0, Lt81/l$d;->x:Ljava/lang/Object;

    iput-object v9, v0, Lt81/l$d;->y:Ljava/lang/Object;

    iput-wide v12, v0, Lt81/l$d;->w:J

    iput v3, v0, Lt81/l$d;->z:I

    invoke-static {v8, v0}, Lp1/x;->N(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_2
    return-object v1

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
