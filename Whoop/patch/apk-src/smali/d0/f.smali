.class public abstract Ld0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/n;

.field public static final b:Ld0/o;

.field public static final c:Ld0/p;

.field public static final d:Ld0/q;

.field public static final e:Ld0/n;

.field public static final f:Ld0/o;

.field public static final g:Ld0/p;

.field public static final h:Ld0/q;

.field public static final i:Ld0/f2;

.field public static final j:Ld0/f2;

.field public static final k:Ld0/f2;

.field public static final l:Ld0/f2;

.field public static final m:Ld0/f2;

.field public static final n:Ld0/f2;

.field public static final o:Ld0/f2;

.field public static final p:Ld0/f2;

.field public static final q:Ld0/f2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ld0/n;

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    sput-object v0, Ld0/f;->a:Ld0/n;

    new-instance v0, Ld0/o;

    invoke-direct {v0, v1, v1}, Ld0/o;-><init>(FF)V

    sput-object v0, Ld0/f;->b:Ld0/o;

    new-instance v0, Ld0/p;

    invoke-direct {v0, v1, v1, v1}, Ld0/p;-><init>(FFF)V

    sput-object v0, Ld0/f;->c:Ld0/p;

    new-instance v0, Ld0/q;

    invoke-direct {v0, v1, v1, v1, v1}, Ld0/q;-><init>(FFFF)V

    sput-object v0, Ld0/f;->d:Ld0/q;

    new-instance v0, Ld0/n;

    const/high16 v1, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    sput-object v0, Ld0/f;->e:Ld0/n;

    new-instance v0, Ld0/o;

    invoke-direct {v0, v1, v1}, Ld0/o;-><init>(FF)V

    sput-object v0, Ld0/f;->f:Ld0/o;

    new-instance v0, Ld0/p;

    invoke-direct {v0, v1, v1, v1}, Ld0/p;-><init>(FFF)V

    sput-object v0, Ld0/f;->g:Ld0/p;

    new-instance v0, Ld0/q;

    invoke-direct {v0, v1, v1, v1, v1}, Ld0/q;-><init>(FFFF)V

    sput-object v0, Ld0/f;->h:Ld0/q;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->i:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->j:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->k:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->l:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->m:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->n:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->o:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->p:Ld0/f2;

    new-instance v0, Lcom/whoop/data/repositories/f;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Ld0/f;->q:Ld0/f2;

    return-void
.end method

.method public static a(F)Ld0/e;
    .locals 4

    new-instance v0, Ld0/e;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    const v1, 0x3c23d70a    # 0.01f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x8

    sget-object v3, Ld0/f;->i:Ld0/f2;

    invoke-direct {v0, p0, v3, v1, v2}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static b(FFI)Ld0/m;
    .locals 9

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Ld0/m;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Ld0/n;

    invoke-direct {v3, p1}, Ld0/n;-><init>(F)V

    sget-object v1, Ld0/f;->i:Ld0/f2;

    const-wide/high16 v4, -0x8000000000000000L

    const-wide/high16 v6, -0x8000000000000000L

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V

    return-object v0
.end method

.method public static final c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, p0}, Ljava/lang/Float;-><init>(F)V

    new-instance v4, Ljava/lang/Float;

    invoke-direct {v4, p1}, Ljava/lang/Float;-><init>(F)V

    new-instance p0, Ljava/lang/Float;

    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    sget-object v2, Ld0/f;->i:Ld0/f2;

    iget-object p1, v2, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld0/r;

    if-nez p0, :cond_0

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld0/r;

    invoke-virtual {p0}, Ld0/r;->c()Ld0/r;

    move-result-object p0

    :cond_0
    move-object v5, p0

    new-instance p1, Ld0/p1;

    move-object v0, p1

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    new-instance p0, Ld0/m;

    const/16 p2, 0x38

    invoke-direct {p0, v2, v3, v5, p2}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;I)V

    move-object p2, p4

    new-instance p4, La6/i;

    const/16 p3, 0x8

    invoke-direct {p4, p2, p3}, La6/i;-><init>(Ljava/lang/Object;I)V

    const-wide/high16 p2, -0x8000000000000000L

    invoke-static/range {p0 .. p5}, Ld0/f;->d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    move-object p0, p2

    :goto_0
    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    return-object p2
.end method

.method public static final d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v3, p1

    move-object/from16 v0, p5

    instance-of v1, v0, Ld0/o1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ld0/o1;

    iget v2, v1, Ld0/o1;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v2, v4

    if-eqz v5, :cond_0

    sub-int/2addr v2, v4

    iput v2, v1, Ld0/o1;->F:I

    :goto_0
    move-object v8, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ld0/o1;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Ld0/o1;->E:Ljava/lang/Object;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v1, v8, Ld0/o1;->F:I

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v11, :cond_1

    if-ne v1, v10, :cond_2

    :cond_1
    iget-object v1, v8, Ld0/o1;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v8, Ld0/o1;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, v8, Ld0/o1;->x:Ld0/h;

    iget-object v4, v8, Ld0/o1;->w:Ld0/m;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_a

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    invoke-interface {v3, v0, v1}, Ld0/h;->f(J)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v3, v0, v1}, Ld0/h;->b(J)Ld0/r;

    move-result-object v15

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v0, p2, v4

    if-nez v0, :cond_6

    :try_start_1
    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v6

    new-instance v0, Ld0/l1;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    move-object/from16 v5, p0

    move-object/from16 v7, p4

    move-object v2, v13

    move-object v4, v15

    :try_start_2
    invoke-direct/range {v0 .. v7}, Ld0/l1;-><init>(Lkotlin/jvm/internal/g0;Ljava/lang/Object;Ld0/h;Ld0/r;Ld0/m;FLkotlin/jvm/functions/Function1;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v7, v1

    :try_start_3
    iput-object v5, v8, Ld0/o1;->w:Ld0/m;

    iput-object v3, v8, Ld0/o1;->x:Ld0/h;

    move-object/from16 v6, p4

    iput-object v6, v8, Ld0/o1;->y:Lkotlin/jvm/functions/Function1;

    iput-object v7, v8, Ld0/o1;->z:Lkotlin/jvm/internal/g0;

    iput v11, v8, Ld0/o1;->F:I

    invoke-interface {v3}, Ld0/h;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, v8}, Ld0/f;->x(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_4
    new-instance v1, Lb11/b;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v0

    invoke-interface {v0, v1, v8}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_2
    if-ne v0, v9, :cond_5

    goto/16 :goto_9

    :cond_5
    move-object v4, v5

    move-object v2, v6

    goto :goto_6

    :goto_3
    move-object v4, v5

    :goto_4
    move-object v1, v7

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_5
    move-object v7, v1

    move-object v4, v5

    goto/16 :goto_a

    :catch_3
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_5

    :cond_6
    move-object/from16 v5, p0

    move-object/from16 v6, p4

    move-object v7, v1

    :try_start_4
    new-instance v12, Ld0/k;

    invoke-interface {v3}, Ld0/h;->e()Ld0/f2;

    move-result-object v14

    invoke-interface {v3}, Ld0/h;->g()Ljava/lang/Object;

    move-result-object v18

    new-instance v0, Ld0/m1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v5}, Ld0/m1;-><init>(ILd0/m;)V

    move-wide/from16 v19, p2

    move-wide/from16 v16, p2

    move-object/from16 v21, v0

    invoke-direct/range {v12 .. v21}, Ld0/k;-><init>(Ljava/lang/Object;Ld0/f2;Ld0/r;JLjava/lang/Object;JLc93/a;)V

    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v0

    move-wide/from16 v1, p2

    move-object v4, v3

    move v3, v0

    move-object v0, v12

    invoke-static/range {v0 .. v6}, Ld0/f;->n(Ld0/k;JFLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V

    move-object v12, v0

    iput-object v12, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    move-object/from16 v4, p0

    move-object/from16 v3, p1

    move-object/from16 v2, p4

    :goto_6
    move-object v1, v7

    :cond_7
    :goto_7
    :try_start_5
    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ld0/k;

    iget-object v0, v0, Ld0/k;->i:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Ld0/f;->p(Lq83/j;)F

    move-result v0

    new-instance v5, Ld0/n1;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    move/from16 p2, v0

    move-object/from16 p1, v1

    move-object/from16 p5, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p0, v5

    :try_start_6
    invoke-direct/range {p0 .. p5}, Ld0/n1;-><init>(Lkotlin/jvm/internal/g0;FLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v2, p5

    :try_start_7
    iput-object v4, v8, Ld0/o1;->w:Ld0/m;

    iput-object v3, v8, Ld0/o1;->x:Ld0/h;

    iput-object v2, v8, Ld0/o1;->y:Lkotlin/jvm/functions/Function1;

    iput-object v1, v8, Ld0/o1;->z:Lkotlin/jvm/internal/g0;

    iput v10, v8, Ld0/o1;->F:I

    invoke-interface {v3}, Ld0/h;->a()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-static {v0, v8}, Ld0/f;->x(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    :cond_8
    new-instance v5, Lb11/b;

    const/4 v6, 0x3

    invoke-direct {v5, v0, v6}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v8}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v0

    invoke-interface {v0, v5, v8}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    :goto_8
    if-ne v0, v9, :cond_7

    :goto_9
    return-object v9

    :catch_4
    move-exception v0

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    goto :goto_a

    :cond_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catch_5
    move-exception v0

    move-object/from16 v4, p0

    goto/16 :goto_4

    :goto_a
    iget-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Ld0/k;

    if-eqz v2, :cond_a

    iget-object v2, v2, Ld0/k;->i:Lp1/k1;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_a
    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ld0/k;

    if-eqz v1, :cond_b

    iget-wide v1, v1, Ld0/k;->g:J

    iget-wide v5, v4, Ld0/m;->z:J

    cmp-long v1, v1, v5

    if-nez v1, :cond_b

    const/4 v1, 0x0

    iput-boolean v1, v4, Ld0/m;->F:Z

    :cond_b
    throw v0
.end method

.method public static synthetic e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p2, 0x7

    const/4 p5, 0x0

    const/4 v0, 0x0

    invoke-static {p5, p5, p2, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p2

    :cond_0
    move-object v3, p2

    const/4 v2, 0x0

    move v0, p0

    move v1, p1

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Ld0/f;->c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ld0/m;Ld0/x;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ld0/m;->y:Ld0/r;

    iget-object v2, p0, Ld0/m;->w:Ld0/f2;

    new-instance v4, Ld0/w;

    invoke-direct {v4, p1, v2, v0, v1}, Ld0/w;-><init>(Ld0/x;Ld0/f2;Ljava/lang/Object;Ld0/r;)V

    if-eqz p2, :cond_0

    iget-wide p1, p0, Ld0/m;->z:J

    :goto_0
    move-object v3, p0

    move-wide v5, p1

    move-object v7, p3

    move-object v8, p4

    goto :goto_1

    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    goto :goto_0

    :goto_1
    invoke-static/range {v3 .. v8}, Ld0/f;->d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;
    .locals 9

    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_0

    const-string p4, "FloatAnimation"

    :cond_0
    move-object v5, p4

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    and-int/lit16 p1, p6, 0x3fe

    shl-int/lit8 p2, p6, 0x3

    const p4, 0xe000

    and-int/2addr p4, p2

    or-int/2addr p1, p4

    const/high16 p4, 0x70000

    and-int/2addr p2, p4

    or-int v7, p1, p2

    const/4 v8, 0x0

    sget-object v3, Ld0/f;->i:Ld0/f2;

    move-object v0, p0

    move-object v4, p3

    move-object v6, p5

    invoke-static/range {v0 .. v8}, Ld0/f;->j(Ld0/l0;Ljava/lang/Number;Ljava/lang/Number;Ld0/f2;Ld0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v3, p0, Ld0/m;->w:Ld0/f2;

    iget-object v6, p0, Ld0/m;->y:Ld0/r;

    new-instance v1, Ld0/p1;

    move-object v5, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    move-object p1, v1

    if-eqz p3, :cond_0

    iget-wide p2, p0, Ld0/m;->z:J

    goto :goto_0

    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    :goto_0
    invoke-static/range {p0 .. p5}, Ld0/f;->d(Ld0/m;Ld0/h;JLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic i(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;I)Ljava/lang/Object;
    .locals 6

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v0, p2, v1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    new-instance p4, Lcom/whoop/profile/view/edit/form/c;

    const/16 p2, 0x1a

    invoke-direct {p4, p2}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Ld0/f;->h(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ld0/l0;Ljava/lang/Number;Ljava/lang/Number;Ld0/f2;Ld0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;
    .locals 6

    check-cast p6, Lp1/q;

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    sget-object p8, Lp1/l;->a:Lp1/v0;

    if-ne p5, p8, :cond_0

    new-instance v0, Ld0/j0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ld0/j0;-><init>(Ld0/l0;Ljava/lang/Number;Ljava/lang/Number;Ld0/f2;Ld0/i0;)V

    invoke-virtual {p6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, v0

    goto :goto_0

    :cond_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    :goto_0
    check-cast p5, Ld0/j0;

    and-int/lit8 p0, p7, 0x70

    xor-int/lit8 p0, p0, 0x30

    const/16 p1, 0x20

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-le p0, p1, :cond_1

    invoke-virtual {p6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    and-int/lit8 p0, p7, 0x30

    if-ne p0, p1, :cond_3

    :cond_2
    move p0, p2

    goto :goto_1

    :cond_3
    move p0, p3

    :goto_1
    and-int/lit16 p1, p7, 0x380

    xor-int/lit16 p1, p1, 0x180

    const/16 p4, 0x100

    if-le p1, p4, :cond_4

    invoke-virtual {p6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    and-int/lit16 p1, p7, 0x180

    if-ne p1, p4, :cond_6

    :cond_5
    move p1, p2

    goto :goto_2

    :cond_6
    move p1, p3

    :goto_2
    or-int/2addr p0, p1

    const p1, 0xe000

    and-int/2addr p1, p7

    xor-int/lit16 p1, p1, 0x6000

    const/16 p4, 0x4000

    if-le p1, p4, :cond_7

    invoke-virtual {p6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_7
    and-int/lit16 p1, p7, 0x6000

    if-ne p1, p4, :cond_8

    goto :goto_3

    :cond_8
    move p2, p3

    :cond_9
    :goto_3
    or-int/2addr p0, p2

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_a

    if-ne p1, p8, :cond_b

    :cond_a
    new-instance p1, Ld0/m0;

    invoke-direct {p1, v2, p5, v3, v5}, Ld0/m0;-><init>(Ljava/lang/Number;Ld0/j0;Ljava/lang/Number;Ld0/i0;)V

    invoke-virtual {p6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast p1, Lc93/a;

    invoke-static {p1, p6}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_c

    if-ne p1, p8, :cond_d

    :cond_c
    new-instance p1, Lbp0/n;

    const/16 p0, 0x8

    invoke-direct {p1, p0, v1, p5}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {p5, p1, p6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object p5
.end method

.method public static final k(Ld0/x;FF)F
    .locals 1

    new-instance v0, Ld0/k2;

    iget-object p0, p0, Ld0/x;->a:Ld0/e0;

    invoke-direct {v0, p0}, Ld0/k2;-><init>(Ld0/e0;)V

    new-instance p0, Ld0/n;

    invoke-direct {p0, p1}, Ld0/n;-><init>(F)V

    new-instance p1, Ld0/n;

    invoke-direct {p1, p2}, Ld0/n;-><init>(F)V

    invoke-virtual {v0, p0, p1}, Ld0/k2;->a(Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p0

    check-cast p0, Ld0/n;

    iget p0, p0, Ld0/n;->a:F

    return p0
.end method

.method public static final l(Ld0/r;)Ld0/r;
    .locals 4

    invoke-virtual {p0}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, Ld0/r;->a(I)F

    move-result v3

    invoke-virtual {v0, v3, v2}, Ld0/r;->e(FI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static m(Ld0/m;FFI)Ld0/m;
    .locals 9

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Ld0/m;->x:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Ld0/m;->y:Ld0/r;

    check-cast p2, Ld0/n;

    iget p2, p2, Ld0/n;->a:F

    :cond_1
    iget-wide v4, p0, Ld0/m;->z:J

    iget-wide v6, p0, Ld0/m;->E:J

    iget-boolean v8, p0, Ld0/m;->F:Z

    new-instance v0, Ld0/m;

    iget-object v1, p0, Ld0/m;->w:Ld0/f2;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    new-instance v3, Ld0/n;

    invoke-direct {v3, p2}, Ld0/n;-><init>(F)V

    invoke-direct/range {v0 .. v8}, Ld0/m;-><init>(Ld0/f2;Ljava/lang/Object;Ld0/r;JJZ)V

    return-object v0
.end method

.method public static final n(Ld0/k;JFLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    invoke-interface {p4}, Ld0/h;->d()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ld0/k;->c:J

    sub-long v0, p1, v0

    long-to-float v0, v0

    div-float/2addr v0, p3

    float-to-long v0, v0

    :goto_0
    iput-wide p1, p0, Ld0/k;->g:J

    invoke-interface {p4, v0, v1}, Ld0/h;->f(J)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ld0/k;->e:Lp1/k1;

    invoke-virtual {p2, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p4, v0, v1}, Ld0/h;->b(J)Ld0/r;

    move-result-object p1

    iput-object p1, p0, Ld0/k;->f:Ld0/r;

    invoke-interface {p4, v0, v1}, Ld0/h;->c(J)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide p1, p0, Ld0/k;->g:J

    iput-wide p1, p0, Ld0/k;->h:J

    iget-object p1, p0, Ld0/k;->i:Lp1/k1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-static {p0, p5}, Ld0/f;->w(Ld0/k;Ld0/m;)V

    invoke-interface {p6, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static o()Ld0/x;
    .locals 2

    new-instance v0, Ld0/f0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/f0;-><init>(I)V

    new-instance v1, Ld0/x;

    invoke-direct {v1, v0}, Ld0/x;-><init>(Ld0/e0;)V

    return-object v1
.end method

.method public static final p(Lq83/j;)F
    .locals 1

    sget-object v0, Lb2/e;->P:Lb2/e;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lb2/w;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lb2/w;->h()F

    move-result p0

    goto :goto_0

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_1

    return p0

    :cond_1
    const-string v0, "negative scale factor"

    invoke-static {v0}, Ld0/u0;->b(Ljava/lang/String;)V

    return p0
.end method

.method public static q(Ld0/y;Ld0/v0;I)Ld0/i0;
    .locals 2

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Ld0/v0;->w:Ld0/v0;

    :cond_0
    const/4 p2, 0x0

    int-to-long v0, p2

    new-instance p2, Ld0/i0;

    invoke-direct {p2, p0, p1, v0, v1}, Ld0/i0;-><init>(Ld0/y;Ld0/v0;J)V

    return-object p2
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;)Ld0/p0;
    .locals 2

    new-instance v0, Ld0/p0;

    new-instance v1, Ld0/o0;

    invoke-direct {v1}, Ld0/o0;-><init>()V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, Ld0/p0;-><init>(Ld0/o0;)V

    return-object v0
.end method

.method public static final s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;
    .locals 0

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p0, p2, :cond_0

    new-instance p0, Ld0/l0;

    invoke-direct {p0}, Ld0/l0;-><init>()V

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p0, Ld0/l0;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ld0/l0;->a(Landroidx/compose/runtime/Composer;I)V

    return-object p0
.end method

.method public static t()Ld0/g1;
    .locals 2

    new-instance v0, Ld0/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/g1;-><init>(I)V

    return-object v0
.end method

.method public static u(FFILjava/lang/Object;)Ld0/i1;
    .locals 1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/high16 p0, 0x3f800000    # 1.0f

    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    const p1, 0x44bb8000    # 1500.0f

    :cond_1
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    :cond_2
    new-instance p2, Ld0/i1;

    invoke-direct {p2, p0, p1, p3}, Ld0/i1;-><init>(FFLjava/lang/Object;)V

    return-object p2
.end method

.method public static v(IILd0/z;I)Ld0/e2;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/16 p0, 0x12c

    :cond_0
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    sget-object p2, Ld0/b0;->a:Ld0/v;

    :cond_2
    new-instance p3, Ld0/e2;

    invoke-direct {p3, p0, p1, p2}, Ld0/e2;-><init>(IILd0/z;)V

    return-object p3
.end method

.method public static final w(Ld0/k;Ld0/m;)V
    .locals 5

    iget-object v0, p0, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p1, Ld0/m;->y:Ld0/r;

    iget-object v1, p0, Ld0/k;->f:Ld0/r;

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ld0/r;->a(I)F

    move-result v4

    invoke-virtual {v0, v4, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ld0/k;->h:J

    iput-wide v0, p1, Ld0/m;->E:J

    iget-wide v0, p0, Ld0/k;->g:J

    iput-wide v0, p1, Ld0/m;->z:J

    iget-object p0, p0, Ld0/k;->i:Lp1/k1;

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, p1, Ld0/m;->F:Z

    return-void
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lb3/h2;->w:Lb3/h2;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method
