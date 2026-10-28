.class public final Lsj/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/amplitude/android/engagement/types/Nudge;

.field public final b:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final c:I

.field public final d:Lc93/a;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V
    .locals 1

    const-string v0, "step"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput p3, p0, Lsj/l;->c:I

    iput-object p4, p0, Lsj/l;->d:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v0, 0x43560a47

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    sget-object v0, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/amplitude/android/engagement/a;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v9, v7, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/amplitude/android/engagement/types/ButtonBlock;

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->L:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v4, v3, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_2

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-nez v13, :cond_3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    :cond_3
    invoke-static {v4, v8, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x1896950d

    invoke-virtual {v8, v0}, Lp1/q;->f0(I)V

    sget-object v13, Luj/k;->a:Lp1/u2;

    invoke-virtual {v8, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Luj/m;

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    iget v14, v14, Luj/m;->N:F

    move-object/from16 v16, v12

    move v12, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/16 v15, 0xd

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 p1, v1

    move-object/from16 v21, v16

    move-object/from16 v20, v18

    move-object/from16 v1, v19

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/m;

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    iget v0, v0, Luj/m;->N:F

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v11, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    move-object/from16 v13, v20

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v13, v21

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v8, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-static {v11, v8, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v8, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x64188de7

    invoke-virtual {v8, v0}, Lp1/q;->f0(I)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v15, 0x1

    if-eqz v0, :cond_26

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/amplitude/android/engagement/types/ButtonBlock;

    sget-object v0, Ltj/b;->a:Lp1/b0;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Llj/e0;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/ButtonBlock;->getMeta()Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object v4

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "Failed to serialize to JSON string: "

    const-string v0, "buttonMeta"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Lev/h;

    const/4 v13, 0x3

    invoke-direct {v0, v9, v4, v3, v13}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    :try_start_0
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Lcom/amplitude/android/engagement/types/NudgeStep;->Companion:Lcom/amplitude/android/engagement/types/v0;

    invoke-virtual {v14}, Lcom/amplitude/android/engagement/types/v0;->serializer()Lwc3/c;

    move-result-object v14

    check-cast v14, Lwc3/j;

    invoke-virtual {v0, v14, v9}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v14, v0

    goto :goto_5

    :catch_0
    move-exception v0

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v14}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v14, 0x0

    :goto_5
    :try_start_1
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v16, Lcom/amplitude/android/engagement/types/ButtonMeta;->Companion:Lcom/amplitude/android/engagement/types/h;

    invoke-virtual/range {v16 .. v16}, Lcom/amplitude/android/engagement/types/h;->serializer()Lwc3/c;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, v4}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_6
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Llj/e0;->toJSONString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    :cond_8
    const-string v1, "undefined"

    :cond_9
    iget-object v4, v6, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v11, Lb4/g;

    const/4 v13, 0x6

    invoke-direct {v11, v14, v0, v1, v13}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v0

    if-nez v0, :cond_a

    :goto_7
    const/4 v0, 0x0

    goto :goto_9

    :cond_a
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v13, v4, Lij/m;->c:Landroid/os/HandlerThread;

    invoke-virtual {v13}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v11, v0}, Lb4/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_9

    :cond_b
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v1, v15}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v19, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v22, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v4, v4, Lij/m;->d:Landroid/os/Handler;

    new-instance v18, Lij/k;

    move-object/from16 v21, v0

    move-object/from16 v23, v1

    move-object/from16 v20, v11

    invoke-direct/range {v18 .. v23}, Lij/k;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lb4/g;Lcom/amplitude/quickjs/wrapper/QuickJSContext;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;)V

    move-object/from16 v0, v18

    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_2
    invoke-virtual/range {v23 .. v23}, Ljava/util/concurrent/CountDownLatch;->await()V

    invoke-virtual/range {v22 .. v22}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    if-nez v0, :cond_c

    invoke-virtual/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    goto :goto_9

    :catch_2
    move-exception v0

    goto :goto_8

    :cond_c
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_8
    const-string v1, "Interrupted while waiting for evaluation"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    goto :goto_7

    :goto_9
    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_d

    :try_start_3
    sget-object v1, Lwj/b;->a:Lad3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/amplitude/android/engagement/types/Action;->Companion:Llj/a;

    invoke-virtual {v4}, Llj/a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-virtual {v1, v4, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_a

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Failed to deserialize from JSON string: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_a
    check-cast v0, Lcom/amplitude/android/engagement/types/Action;

    move-object v4, v0

    goto :goto_b

    :cond_d
    const/4 v4, 0x0

    :goto_b
    instance-of v0, v4, Lcom/amplitude/android/engagement/types/StepBackAction;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/ButtonBlock;->getMeta()Lcom/amplitude/android/engagement/types/ButtonMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/ButtonMeta;->getButtonType()Lcom/amplitude/android/engagement/types/ButtonType;

    move-result-object v1

    sget-object v11, Lcom/amplitude/android/engagement/types/ButtonType;->SNOOZE:Lcom/amplitude/android/engagement/types/ButtonType;

    if-eq v1, v11, :cond_f

    instance-of v1, v4, Lcom/amplitude/android/engagement/types/SnoozeAction;

    if-eqz v1, :cond_e

    goto :goto_c

    :cond_e
    const/4 v1, 0x0

    goto :goto_d

    :cond_f
    :goto_c
    move v1, v15

    :goto_d
    invoke-static {v9}, Lug/m;->z(Lcom/amplitude/android/engagement/types/NudgeStep;)Lcom/amplitude/android/engagement/types/ContentBlock;

    move-result-object v11

    invoke-static {v9}, Lug/m;->z(Lcom/amplitude/android/engagement/types/NudgeStep;)Lcom/amplitude/android/engagement/types/ContentBlock;

    move-result-object v12

    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    if-eqz v13, :cond_11

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v12

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/Required;->getValue()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_e

    :cond_10
    const/4 v12, 0x0

    goto :goto_e

    :cond_11
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    if-eqz v13, :cond_12

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v12

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/Required;->getValue()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_e

    :cond_12
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-eqz v13, :cond_13

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v12

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/Required;->getValue()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_e

    :cond_13
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v13, :cond_14

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v12

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/Required;->getValue()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_e

    :cond_14
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_e
    if-eqz v12, :cond_15

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    goto :goto_f

    :cond_15
    const/4 v12, 0x0

    :goto_f
    if-nez v12, :cond_17

    :cond_16
    const/4 v3, 0x0

    goto :goto_13

    :cond_17
    invoke-static {v9}, Lug/m;->z(Lcom/amplitude/android/engagement/types/NudgeStep;)Lcom/amplitude/android/engagement/types/ContentBlock;

    move-result-object v12

    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    if-eqz v13, :cond_18

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getUuid()Ljava/lang/String;

    move-result-object v12

    goto :goto_10

    :cond_18
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    if-eqz v13, :cond_19

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getUuid()Ljava/lang/String;

    move-result-object v12

    goto :goto_10

    :cond_19
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-eqz v13, :cond_1a

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v12

    goto :goto_10

    :cond_1a
    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v13, :cond_1b

    check-cast v12, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v12

    goto :goto_10

    :cond_1b
    const/4 v12, 0x0

    :goto_10
    if-eqz v3, :cond_1e

    if-nez v12, :cond_1c

    goto :goto_12

    :cond_1c
    invoke-virtual {v3}, Llj/e0;->getBlockId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1e

    instance-of v12, v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    if-eqz v12, :cond_1d

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SurveyResponseText;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    goto :goto_11

    :cond_1d
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_16

    :cond_1e
    :goto_12
    move v3, v15

    :goto_13
    if-eqz v3, :cond_1f

    if-nez v0, :cond_1f

    if-nez v1, :cond_1f

    move v1, v15

    goto :goto_14

    :cond_1f
    const/4 v1, 0x0

    :goto_14
    instance-of v0, v11, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    if-eqz v0, :cond_21

    check-cast v11, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Required;->getMessage()Ljava/lang/String;

    move-result-object v13

    :goto_15
    move-object v3, v13

    goto :goto_16

    :cond_20
    const/4 v3, 0x0

    goto :goto_16

    :cond_21
    instance-of v0, v11, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    if-eqz v0, :cond_22

    check-cast v11, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Required;->getMessage()Ljava/lang/String;

    move-result-object v13

    goto :goto_15

    :cond_22
    instance-of v0, v11, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-eqz v0, :cond_23

    check-cast v11, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Required;->getMessage()Ljava/lang/String;

    move-result-object v13

    goto :goto_15

    :cond_23
    instance-of v0, v11, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v0, :cond_20

    check-cast v11, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getValidation()Lcom/amplitude/android/engagement/types/ValidationConfig;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ValidationConfig;->getRequired()Lcom/amplitude/android/engagement/types/Required;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Required;->getMessage()Ljava/lang/String;

    move-result-object v13

    goto :goto_15

    :goto_16
    if-eqz v1, :cond_25

    if-eqz v3, :cond_24

    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    :cond_24
    move v0, v15

    goto :goto_17

    :cond_25
    const/4 v0, 0x0

    :goto_17
    xor-int/lit8 v11, v0, 0x1

    new-instance v0, Lsj/f;

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v7}, Lsj/f;-><init>(ZLandroid/content/Context;Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonBlock;Lcom/amplitude/android/engagement/a;Lsj/l;)V

    const/16 v1, 0x8

    invoke-static {v5, v11, v0, v8, v1}, Lse/a;->d(Lcom/amplitude/android/engagement/types/ButtonBlock;ZLsj/f;Landroidx/compose/runtime/Composer;I)V

    move v1, v12

    goto/16 :goto_4

    :cond_26
    move v12, v1

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_27

    goto :goto_18

    :cond_27
    new-instance v1, Lsj/g;

    const/4 v2, 0x0

    move/from16 v3, p2

    invoke-direct {v1, v7, v3, v2}, Lsj/g;-><init>(Lsj/l;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :goto_18
    return-void
.end method

.method public final b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v5, p3

    check-cast v5, Lp1/q;

    const p3, -0x78d04015

    invoke-virtual {v5, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_0
    iget-object p3, p0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {p3}, Lcom/amplitude/android/engagement/types/Nudge;->isDismissible()Z

    move-result p3

    if-eqz p3, :cond_4

    const/16 p3, 0x8

    int-to-float p3, p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v0, Lb2/e;->w:Lb2/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v1, v5, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v5, p3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v5, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_0
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v5, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, v5, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p3, 0x10

    int-to-float p3, p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lsj/c;->a:Lx1/b;

    const/high16 v6, 0x30000

    iget-object v0, p0, Lsj/l;->d:Lc93/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ll1/k3;->f(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 p3, 0x1

    invoke-virtual {v5, p3}, Lp1/q;->q(Z)V

    :cond_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-nez p3, :cond_5

    return-void

    :cond_5
    new-instance v0, Lc4/i;

    invoke-direct {v0, p0, p1, p2, p4}, Lc4/i;-><init>(Lsj/l;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final c(Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x75ec227f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    iget-object v2, v0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/Nudge;->getShowStepCounter()Z

    move-result v3

    if-eqz v3, :cond_c

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v6, 0x10

    int-to-float v6, v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v3, v6, v7, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x8

    int-to-float v6, v6

    sget-object v7, Lb2/e;->N:Lb2/k;

    invoke-static {v6, v7}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x36

    invoke-static {v7, v9, v1, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v1, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v1, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_0

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_0
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v1, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-nez v15, :cond_1

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    :cond_1
    invoke-static {v11, v1, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v1, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget v3, v0, Lsj/l;->c:I

    add-int/lit8 v11, v3, 0x1

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/Nudge;->getStepCounterFormat()Lcom/amplitude/android/engagement/types/StepCounterFormat;

    move-result-object v16

    sget-object v17, Lsj/k;->b:[I

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aget v8, v17, v16

    move-object/from16 v20, v2

    const/4 v2, 0x0

    const/4 v4, 0x1

    if-eq v8, v4, :cond_b

    const/4 v4, 0x2

    if-eq v8, v4, :cond_a

    const/4 v4, 0x3

    if-eq v8, v4, :cond_3

    const v3, -0x405e5ce8

    invoke-virtual {v1, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_1
    const/4 v7, 0x1

    goto/16 :goto_6

    :cond_3
    const v4, -0x405e6166

    invoke-virtual {v1, v4}, Lp1/q;->f0(I)V

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v8, 0x36

    invoke-static {v4, v9, v1, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v1, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v1, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v8, v1, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v1, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x405e6073

    invoke-virtual {v1, v4}, Lp1/q;->f0(I)V

    invoke-virtual/range {v20 .. v20}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    move v7, v2

    :goto_3
    if-ge v7, v4, :cond_9

    if-ne v7, v3, :cond_7

    const/4 v8, 0x1

    goto :goto_4

    :cond_7
    move v8, v2

    :goto_4
    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lt0/j;->a:Lt0/i;

    invoke-static {v9, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    if-eqz v8, :cond_8

    const v8, -0x4930f0fb

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    const v8, -0x1896950d

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    sget-object v10, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Luj/m;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    iget-wide v10, v10, Luj/m;->o:J

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    const v8, -0x1896950d

    const v10, -0x4930f069

    invoke-virtual {v1, v10}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    sget-object v8, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Luj/m;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    iget-wide v10, v8, Luj/m;->x:J

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_5
    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v1, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_9
    const/4 v7, 0x1

    invoke-static {v1, v2, v7, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto/16 :goto_6

    :cond_a
    const v3, -0x405e62f5

    invoke-virtual {v1, v3}, Lp1/q;->f0(I)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const v8, -0x1896950d

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    sget-object v4, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luj/m;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v5, v6, v1, v7}, Luj/m;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v5

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    iget-wide v8, v4, Luj/m;->p:J

    new-instance v10, Lw3/k;

    const/4 v4, 0x3

    invoke-direct {v10, v4}, Lw3/k;-><init>(I)V

    const/16 v20, 0x0

    const v21, 0xfdfa

    move v4, v2

    const/4 v2, 0x0

    move-object/from16 v17, v5

    const-wide/16 v5, 0x0

    move/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v18, v1

    move-object v1, v3

    move v11, v4

    move-wide v3, v8

    const-wide/16 v8, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v0, v23

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :cond_b
    move v0, v2

    const v2, -0x405e6484

    invoke-virtual {v1, v2}, Lp1/q;->f0(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v8, -0x1896950d

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v4, v6, v1, v7}, Luj/m;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v4

    invoke-virtual {v1, v8}, Lp1/q;->f0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    iget-wide v5, v3, Luj/m;->p:J

    new-instance v10, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v10, v3}, Lw3/k;-><init>(I)V

    const/16 v20, 0x0

    const v21, 0xfdfa

    move-object/from16 v18, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object/from16 v17, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1

    :goto_6
    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    const/4 v7, 0x1

    :goto_7
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    new-instance v1, Lsj/g;

    move-object/from16 v2, p0

    move/from16 v3, p2

    invoke-direct {v1, v2, v3, v7}, Lsj/g;-><init>(Lsj/l;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final d(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x45530b9c

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_0

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    sget-object v3, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/a;

    iget-object v4, v1, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v5

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/FormFactor;->getTitleAlignment()Lcom/amplitude/android/engagement/types/ContentAlignment;

    move-result-object v5

    if-nez v5, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    sget-object v6, Lsj/k;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    :goto_1
    const/4 v6, 0x5

    const/4 v7, 0x1

    if-eq v5, v7, :cond_2

    const/4 v7, 0x2

    if-eq v5, v7, :cond_4

    const/4 v7, 0x3

    if-eq v5, v7, :cond_3

    :cond_2
    :goto_2
    move v9, v6

    goto :goto_3

    :cond_3
    const/4 v6, 0x6

    goto :goto_2

    :cond_4
    const/4 v6, 0x4

    goto :goto_2

    :goto_3
    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/NudgeStep;->getTitle()Ljava/lang/String;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v4

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/FormFactor;->getTextAnimation()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v7

    iget-wide v7, v7, Luj/m;->o:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v10

    iget-wide v10, v10, Luj/m;->r:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v13, -0x3eea1dd0

    invoke-virtual {v0, v13}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v0}, Luj/m;->c(Landroidx/compose/runtime/Composer;)Lp3/i;

    move-result-object v21

    iget v13, v12, Luj/m;->e:F

    const-wide v14, 0x100000000L

    invoke-static {v13, v14, v15}, Lv63/c;->j(FJ)J

    move-result-wide v17

    new-instance v13, Lp3/r;

    iget v12, v12, Luj/m;->i:I

    invoke-direct {v13, v12}, Lp3/r;-><init>(I)V

    new-instance v14, Ll3/v0;

    const-wide/16 v27, 0x0

    const v29, 0xffffd9

    const-wide/16 v15, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v19, v13

    invoke-direct/range {v14 .. v29}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    iget-object v12, v14, Ll3/v0;->a:Ll3/m0;

    iget-wide v12, v12, Ll3/m0;->b:J

    invoke-static {v12, v13}, Ly3/o;->c(J)F

    move-result v12

    move-object v13, v6

    move-wide/from16 v30, v10

    move-object v10, v2

    move-object v2, v5

    move-wide v5, v7

    move-wide/from16 v7, v30

    new-instance v11, Lp3/r;

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v14

    iget v14, v14, Luj/m;->i:I

    invoke-direct {v11, v14}, Lp3/r;-><init>(I)V

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v14

    invoke-virtual {v14, v0}, Luj/m;->d(Landroidx/compose/runtime/Composer;)Landroid/graphics/Typeface;

    move-result-object v14

    new-instance v15, Lsj/h;

    move-object/from16 v16, v0

    const/4 v0, 0x0

    invoke-direct {v15, v3, v1, v0}, Lsj/h;-><init>(Lcom/amplitude/android/engagement/a;Lsj/l;I)V

    const/high16 v17, 0x8000000

    const/16 v18, 0x200

    move-object v0, v10

    move v10, v12

    move-object v3, v13

    move-object v12, v14

    const-wide/16 v13, 0x0

    invoke-static/range {v2 .. v18}, Lup/d;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_5

    return-void

    :cond_5
    move-object v2, v0

    new-instance v0, Lsj/i;

    const/4 v5, 0x0

    move/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lsj/i;-><init>(Lsj/l;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final e(IILandroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v0, p0

    move/from16 v1, p4

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    const v3, 0x46b2309c

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x5

    move v9, v3

    goto :goto_0

    :cond_0
    move/from16 v9, p1

    :goto_0
    sget-object v3, Lmj/r;->a:Lp1/u2;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/a;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v7, v8, v2, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_1

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v8, v2, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, 0x115e165f

    invoke-virtual {v2, v6}, Lp1/q;->f0(I)V

    iget-object v6, v0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lcom/amplitude/android/engagement/types/MarkdownBlock;

    if-eqz v12, :cond_4

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_3
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/amplitude/android/engagement/types/MarkdownBlock;

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/MarkdownBlock;->getMeta()Lcom/amplitude/android/engagement/types/MarkdownMeta;

    move-result-object v11

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/MarkdownMeta;->getValue()Ljava/lang/String;

    move-result-object v11

    const-string v12, "\n"

    invoke-static {v11, v12, v10}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/MarkdownBlock;->getMeta()Lcom/amplitude/android/engagement/types/MarkdownMeta;

    move-result-object v7

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/MarkdownMeta;->getValue()Ljava/lang/String;

    move-result-object v7

    if-eqz v11, :cond_6

    invoke-static {v8, v7}, Lyb3/r;->X(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :cond_6
    const-string v8, "<br>"

    invoke-static {v7, v8, v12, v10}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v11

    invoke-virtual {v11}, Lcom/amplitude/android/engagement/types/FormFactor;->getTextAnimation()Ljava/lang/String;

    move-result-object v11

    invoke-static {v2}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v12

    iget-wide v12, v12, Luj/m;->p:J

    invoke-static {v2}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v14

    iget-wide v14, v14, Luj/m;->r:J

    invoke-static {v2}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v4

    iget v4, v4, Luj/m;->d:F

    move/from16 v16, v10

    move v10, v4

    move-object v4, v11

    new-instance v11, Lp3/r;

    move-object/from16 p3, v4

    invoke-static {v2}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v4

    iget v4, v4, Luj/m;->h:I

    invoke-direct {v11, v4}, Lp3/r;-><init>(I)V

    invoke-static {v2}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v4

    invoke-virtual {v4, v2}, Luj/m;->d(Landroidx/compose/runtime/Composer;)Landroid/graphics/Typeface;

    move-result-object v4

    move/from16 v17, v16

    move-object/from16 v16, v2

    move-object v2, v7

    move-wide/from16 v24, v14

    move-object v14, v8

    move-wide/from16 v7, v24

    new-instance v15, Lsj/h;

    move-object/from16 v18, v2

    const/4 v2, 0x1

    invoke-direct {v15, v3, v0, v2}, Lsj/h;-><init>(Lcom/amplitude/android/engagement/a;Lsj/l;I)V

    move/from16 v2, v17

    const v17, 0x38000030

    move/from16 v20, v2

    move-object/from16 v2, v18

    const/16 v18, 0x0

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    move-wide v5, v12

    move-object v12, v3

    move-object v3, v14

    const-wide/16 v13, 0x64

    move/from16 v0, v20

    move-object/from16 v23, v22

    move-object/from16 v20, v12

    move-object/from16 v22, v21

    const/high16 v21, 0x3f800000    # 1.0f

    move-object v12, v4

    move-object/from16 v4, p3

    invoke-static/range {v2 .. v18}, Lup/d;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v10, v0

    move-object/from16 v2, v16

    move-object/from16 v3, v20

    move/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v0, p0

    goto/16 :goto_3

    :cond_7
    move v0, v10

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_8

    return-void

    :cond_8
    new-instance v2, Lsj/j;

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v2, v3, v9, v4, v1}, Lsj/j;-><init>(Lsj/l;III)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsj/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsj/l;

    iget-object v1, p0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v3, p1, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v3, p1, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lsj/l;->c:I

    iget v3, p1, Lsj/l;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsj/l;->d:Lc93/a;

    iget-object p1, p1, Lsj/l;->d:Lc93/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p3, Lp1/q;

    const v0, -0x29ac229

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_0
    move-object v2, p1

    sget-object p1, Lb2/e;->w:Lb2/m;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p1

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {p3, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_0
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {p3, p1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    iget-boolean v3, p3, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v1, p3, v1, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p1, La3/k;->d:La3/i;

    invoke-static {p3, p1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x63fafefb

    invoke-virtual {p3, p1}, Lp1/q;->f0(I)V

    iget-object p1, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v5, v4, Lcom/amplitude/android/engagement/types/ImageBlock;

    if-nez v5, :cond_5

    instance-of v4, v4, Lcom/amplitude/android/engagement/types/VideoBlock;

    if-eqz v4, :cond_4

    :cond_5
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v3, v1, Lcom/amplitude/android/engagement/types/ImageBlock;

    if-eqz v3, :cond_7

    const v3, 0x42e4c11c

    invoke-virtual {p3, v3}, Lp1/q;->f0(I)V

    check-cast v1, Lcom/amplitude/android/engagement/types/ImageBlock;

    shl-int/lit8 v3, p2, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v1, v2, p3, v3}, Lse/b;->h(Lcom/amplitude/android/engagement/types/ImageBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_7
    instance-of v3, v1, Lcom/amplitude/android/engagement/types/VideoBlock;

    if-eqz v3, :cond_8

    const v3, 0x42e4c19d

    invoke-virtual {p3, v3}, Lp1/q;->f0(I)V

    check-cast v1, Lcom/amplitude/android/engagement/types/VideoBlock;

    shl-int/lit8 v3, p2, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v1, v2, p3, v3}, Lse/h;->r(Lcom/amplitude/android/engagement/types/VideoBlock;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_8
    const v1, 0x42e4c215

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_9
    invoke-virtual {p3, v0}, Lp1/q;->q(Z)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-nez p1, :cond_a

    return-void

    :cond_a
    new-instance v0, Lsj/i;

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lsj/i;-><init>(Lsj/l;Landroidx/compose/ui/Modifier;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final g(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p1, Lp1/q;

    const v0, -0x3620c2c0    # -1828776.0f

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    sget-object v0, Ltj/b;->a:Lp1/b0;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/c1;

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p1, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p1, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    invoke-static {v4, p1, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p1, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x74dfc908

    invoke-virtual {p1, v1}, Lp1/q;->f0(I)V

    iget-object v1, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v6, v5, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    if-nez v6, :cond_4

    instance-of v6, v5, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    if-nez v6, :cond_4

    instance-of v6, v5, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-nez v6, :cond_4

    instance-of v5, v5, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v5, :cond_3

    :cond_4
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amplitude/android/engagement/types/ContentBlock;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llj/e0;

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_7

    :cond_6
    new-instance v6, Lpj/a;

    const/4 v5, 0x3

    invoke-direct {v6, v5, v0}, Lpj/a;-><init>(ILp1/c1;)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v4, v6, p1, v3}, Lrj/j;->c(Lcom/amplitude/android/engagement/types/ContentBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_8
    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-nez p1, :cond_9

    return-void

    :cond_9
    new-instance v0, Lsj/g;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lsj/g;-><init>(Lsj/l;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Nudge;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/NudgeStep;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lsj/l;->c:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lsj/l;->d:Lc93/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NudgeLayoutComponents(nudge="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsj/l;->a:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", step="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsj/l;->b:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stepIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lsj/l;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onClose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsj/l;->d:Lc93/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
