.class final Loj2/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loj2/a;->e(Lcom/whoop/stress/domain/model/StressIntervention;DDI)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lnj2/t;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.util.BreathingAnimationHelper$continuousAnimation$1"
    f = "BreathingAnimationHelper.kt"
    l = {
        0x8f,
        0x90,
        0x94
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field J:I

.field K:I

.field L:I

.field M:I

.field N:I

.field O:I

.field P:D

.field Q:D

.field R:I

.field private synthetic S:Ljava/lang/Object;

.field final synthetic T:Lcom/whoop/stress/domain/model/StressIntervention;

.field final synthetic U:Loj2/a;

.field final synthetic V:D

.field final synthetic W:D

.field final synthetic X:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/stress/domain/model/StressIntervention;Loj2/a;DDILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressIntervention;",
            "Loj2/a;",
            "DDI",
            "Lq83/d<",
            "-",
            "Loj2/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loj2/a$b;->T:Lcom/whoop/stress/domain/model/StressIntervention;

    iput-object p2, p0, Loj2/a$b;->U:Loj2/a;

    iput-wide p3, p0, Loj2/a$b;->V:D

    iput-wide p5, p0, Loj2/a$b;->W:D

    iput p7, p0, Loj2/a$b;->X:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Loj2/a$b;

    iget-object v1, p0, Loj2/a$b;->T:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v2, p0, Loj2/a$b;->U:Loj2/a;

    iget-wide v3, p0, Loj2/a$b;->V:D

    iget-wide v5, p0, Loj2/a$b;->W:D

    iget v7, p0, Loj2/a$b;->X:I

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Loj2/a$b;-><init>(Lcom/whoop/stress/domain/model/StressIntervention;Loj2/a;DDILq83/d;)V

    iput-object p1, v0, Loj2/a$b;->S:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loj2/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loj2/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loj2/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loj2/a$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Loj2/a$b;->S:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Loj2/a$b;->R:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v3, v0, Loj2/a$b;->N:I

    iget v9, v0, Loj2/a$b;->M:I

    iget v10, v0, Loj2/a$b;->L:I

    iget v11, v0, Loj2/a$b;->K:I

    iget v12, v0, Loj2/a$b;->J:I

    iget-wide v13, v0, Loj2/a$b;->Q:D

    iget-wide v4, v0, Loj2/a$b;->P:D

    iget v15, v0, Loj2/a$b;->I:I

    iget-object v6, v0, Loj2/a$b;->H:Ljava/lang/Object;

    check-cast v6, Lnj2/t;

    iget-object v6, v0, Loj2/a$b;->G:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    iget-object v6, v0, Loj2/a$b;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v0, Loj2/a$b;->z:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Loj2/a$b;->y:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/d0;

    iget-object v8, v0, Loj2/a$b;->x:Ljava/lang/Object;

    check-cast v8, Loj2/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Loj2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v19, v3

    move-wide/from16 v21, v13

    move-object/from16 v3, v16

    move-object v13, v6

    move-object v6, v7

    move v14, v12

    move-object v7, v1

    move v12, v9

    move v1, v15

    move v15, v11

    move-object v11, v2

    const/4 v2, 0x2

    move-wide/from16 v23, v4

    move-object v4, v8

    move-wide/from16 v8, v23

    move v5, v10

    goto/16 :goto_3

    :cond_2
    move-object/from16 v16, v1

    iget v1, v0, Loj2/a$b;->O:I

    iget v3, v0, Loj2/a$b;->N:I

    iget v4, v0, Loj2/a$b;->M:I

    iget v5, v0, Loj2/a$b;->L:I

    iget v6, v0, Loj2/a$b;->K:I

    iget v7, v0, Loj2/a$b;->J:I

    iget-wide v8, v0, Loj2/a$b;->Q:D

    iget-wide v10, v0, Loj2/a$b;->P:D

    iget v12, v0, Loj2/a$b;->I:I

    iget-object v13, v0, Loj2/a$b;->H:Ljava/lang/Object;

    check-cast v13, Lnj2/t;

    iget-object v13, v0, Loj2/a$b;->G:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    iget-object v14, v0, Loj2/a$b;->E:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v0, Loj2/a$b;->z:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v15, v0, Loj2/a$b;->y:Ljava/lang/Object;

    check-cast v15, Lkotlin/jvm/internal/d0;

    move/from16 v17, v1

    iget-object v1, v0, Loj2/a$b;->x:Ljava/lang/Object;

    check-cast v1, Loj2/a;

    move-object/from16 v18, v1

    iget-object v1, v0, Loj2/a$b;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 p1, v4

    move v4, v3

    move-object/from16 v3, v16

    move/from16 v16, v17

    move/from16 v17, p1

    move-object/from16 v20, v2

    move-object/from16 p1, v13

    move v13, v5

    move-object/from16 v5, v18

    move/from16 v18, v6

    move-object v6, v14

    move v14, v12

    move v12, v7

    move-object v7, v1

    move-wide v1, v8

    move-wide v8, v10

    goto/16 :goto_2

    :cond_3
    move-object/from16 v16, v1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Loj2/a$b;->T:Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressIntervention;->getRepeatCount()I

    move-result v1

    iget-object v3, v0, Loj2/a$b;->T:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v4, v0, Loj2/a$b;->U:Loj2/a;

    iget-wide v5, v0, Loj2/a$b;->V:D

    iget-wide v7, v0, Loj2/a$b;->W:D

    iget v9, v0, Loj2/a$b;->X:I

    move v10, v9

    const/4 v11, 0x0

    move-wide v8, v7

    move-wide v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, v16

    :goto_0
    if-ge v11, v1, :cond_7

    new-instance v12, Lkotlin/jvm/internal/d0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4}, Lcom/whoop/stress/domain/model/StressIntervention;->getFrames()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v14, v10

    move v15, v11

    const/16 v19, 0x0

    move-wide v10, v8

    move-wide v8, v6

    move-object v6, v12

    const/4 v12, 0x0

    move-object v7, v4

    move-object v4, v5

    move v5, v15

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    move-object/from16 p1, v4

    move-object v4, v6

    iget v6, v4, Lkotlin/jvm/internal/d0;->w:F

    move-object/from16 v17, v13

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v14}, Ljava/lang/Integer;-><init>(I)V

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v20, v2

    move/from16 v21, v5

    move-object/from16 v5, v16

    move-object/from16 v2, v17

    move/from16 v22, v18

    move/from16 v16, v15

    move-object v15, v4

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v13}, Loj2/a;->a(Loj2/a;Lcom/whoop/stress/domain/model/StressInterventionFrame;FLcom/whoop/stress/domain/model/StressIntervention;DDLo81/a;Ljava/lang/Integer;)Lnj2/t;

    move-result-object v6

    iget v12, v15, Lkotlin/jvm/internal/d0;->w:F

    move/from16 v17, v12

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->getTime()J

    move-result-wide v12

    long-to-float v12, v12

    add-float v12, v17, v12

    iput v12, v15, Lkotlin/jvm/internal/d0;->w:F

    iput-object v3, v0, Loj2/a$b;->S:Ljava/lang/Object;

    iput-object v7, v0, Loj2/a$b;->w:Ljava/lang/Object;

    iput-object v4, v0, Loj2/a$b;->x:Ljava/lang/Object;

    iput-object v15, v0, Loj2/a$b;->y:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v0, Loj2/a$b;->z:Ljava/lang/Object;

    iput-object v2, v0, Loj2/a$b;->E:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->F:Ljava/lang/Object;

    iput-object v5, v0, Loj2/a$b;->G:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->H:Ljava/lang/Object;

    iput v1, v0, Loj2/a$b;->I:I

    iput-wide v8, v0, Loj2/a$b;->P:D

    iput-wide v10, v0, Loj2/a$b;->Q:D

    iput v14, v0, Loj2/a$b;->J:I

    move/from16 v12, v16

    iput v12, v0, Loj2/a$b;->K:I

    move/from16 v13, v21

    iput v13, v0, Loj2/a$b;->L:I

    move/from16 v16, v1

    move/from16 v1, v22

    iput v1, v0, Loj2/a$b;->M:I

    move/from16 v18, v1

    move/from16 v1, v19

    iput v1, v0, Loj2/a$b;->N:I

    move/from16 v17, v1

    const/4 v1, 0x0

    iput v1, v0, Loj2/a$b;->O:I

    const/4 v1, 0x1

    iput v1, v0, Loj2/a$b;->R:I

    invoke-interface {v3, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v1, v20

    if-ne v6, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object/from16 v20, v1

    move-object v6, v2

    move-object/from16 p1, v5

    move-wide v1, v10

    move-object v5, v4

    move/from16 v4, v17

    move/from16 v17, v18

    move/from16 v18, v12

    move v12, v14

    move/from16 v14, v16

    const/16 v16, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->getTime()J

    move-result-wide v10

    iput-object v3, v0, Loj2/a$b;->S:Ljava/lang/Object;

    iput-object v7, v0, Loj2/a$b;->w:Ljava/lang/Object;

    iput-object v5, v0, Loj2/a$b;->x:Ljava/lang/Object;

    iput-object v15, v0, Loj2/a$b;->y:Ljava/lang/Object;

    move-object/from16 v19, v3

    const/4 v3, 0x0

    iput-object v3, v0, Loj2/a$b;->z:Ljava/lang/Object;

    iput-object v6, v0, Loj2/a$b;->E:Ljava/lang/Object;

    iput-object v3, v0, Loj2/a$b;->F:Ljava/lang/Object;

    iput-object v3, v0, Loj2/a$b;->G:Ljava/lang/Object;

    iput-object v3, v0, Loj2/a$b;->H:Ljava/lang/Object;

    iput v14, v0, Loj2/a$b;->I:I

    iput-wide v8, v0, Loj2/a$b;->P:D

    iput-wide v1, v0, Loj2/a$b;->Q:D

    iput v12, v0, Loj2/a$b;->J:I

    move/from16 v3, v18

    iput v3, v0, Loj2/a$b;->K:I

    iput v13, v0, Loj2/a$b;->L:I

    move-wide/from16 v21, v1

    move/from16 v1, v17

    iput v1, v0, Loj2/a$b;->M:I

    iput v4, v0, Loj2/a$b;->N:I

    move/from16 v2, v16

    iput v2, v0, Loj2/a$b;->O:I

    const/4 v2, 0x2

    iput v2, v0, Loj2/a$b;->R:I

    invoke-static {v10, v11, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v11, v20

    if-ne v10, v11, :cond_5

    move-object v1, v11

    goto/16 :goto_4

    :cond_5
    move/from16 v23, v12

    move v12, v1

    move v1, v14

    move/from16 v14, v23

    move-object/from16 v23, v15

    move v15, v3

    move-object/from16 v3, v19

    move/from16 v19, v4

    move-object v4, v5

    move v5, v13

    move-object v13, v6

    move-object/from16 v6, v23

    :goto_3
    move-object v2, v11

    move-wide/from16 v10, v21

    goto/16 :goto_1

    :cond_6
    move/from16 v16, v1

    move-object v1, v2

    move v12, v15

    const/4 v2, 0x2

    add-int/lit8 v5, v12, 0x1

    move v2, v5

    move-object v5, v4

    move-object v4, v7

    move-wide v6, v8

    move-wide v8, v10

    move v11, v2

    move-object v2, v1

    move v10, v14

    move/from16 v1, v16

    goto/16 :goto_0

    :cond_7
    move-object v1, v2

    iget-object v2, v0, Loj2/a$b;->U:Loj2/a;

    iget-object v4, v0, Loj2/a$b;->T:Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-static {v2, v4}, Loj2/a;->d(Loj2/a;Lcom/whoop/stress/domain/model/StressIntervention;)Lnj2/t;

    move-result-object v2

    const/4 v12, 0x0

    iput-object v12, v0, Loj2/a$b;->S:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->w:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->x:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->y:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->z:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->E:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->F:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->G:Ljava/lang/Object;

    iput-object v12, v0, Loj2/a$b;->H:Ljava/lang/Object;

    const/4 v15, 0x3

    iput v15, v0, Loj2/a$b;->R:I

    invoke-interface {v3, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
