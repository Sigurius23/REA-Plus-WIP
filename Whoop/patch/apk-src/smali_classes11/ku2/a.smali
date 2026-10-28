.class public final synthetic Lku2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lku2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 99

    move-object/from16 v0, p0

    iget v1, v0, Lku2/a;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lq3/y;

    const-wide/16 v2, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    invoke-direct {v1, v4, v5, v2, v3}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    return-object v1

    :pswitch_0
    sget-object v1, Ll1/n;->a:Lp1/u2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1
    sget-wide v3, Lo1/e;->z:J

    sget-wide v5, Lo1/e;->j:J

    sget-wide v7, Lo1/e;->A:J

    sget-wide v9, Lo1/e;->k:J

    sget-wide v11, Lo1/e;->e:J

    sget-wide v13, Lo1/e;->E:J

    sget-wide v15, Lo1/e;->n:J

    sget-wide v17, Lo1/e;->F:J

    sget-wide v19, Lo1/e;->o:J

    sget-wide v21, Lo1/e;->R:J

    sget-wide v23, Lo1/e;->t:J

    sget-wide v25, Lo1/e;->S:J

    sget-wide v27, Lo1/e;->u:J

    sget-wide v29, Lo1/e;->a:J

    sget-wide v31, Lo1/e;->g:J

    sget-wide v33, Lo1/e;->I:J

    sget-wide v35, Lo1/e;->r:J

    sget-wide v37, Lo1/e;->Q:J

    sget-wide v39, Lo1/e;->s:J

    sget-wide v43, Lo1/e;->f:J

    sget-wide v45, Lo1/e;->d:J

    sget-wide v47, Lo1/e;->b:J

    sget-wide v49, Lo1/e;->h:J

    sget-wide v51, Lo1/e;->c:J

    sget-wide v53, Lo1/e;->i:J

    sget-wide v55, Lo1/e;->x:J

    sget-wide v57, Lo1/e;->y:J

    sget-wide v59, Lo1/e;->D:J

    sget-wide v61, Lo1/e;->J:J

    sget-wide v65, Lo1/e;->K:J

    sget-wide v67, Lo1/e;->L:J

    sget-wide v69, Lo1/e;->M:J

    sget-wide v71, Lo1/e;->N:J

    sget-wide v73, Lo1/e;->O:J

    sget-wide v63, Lo1/e;->P:J

    sget-wide v75, Lo1/e;->B:J

    sget-wide v77, Lo1/e;->C:J

    sget-wide v79, Lo1/e;->l:J

    sget-wide v81, Lo1/e;->m:J

    sget-wide v83, Lo1/e;->G:J

    sget-wide v85, Lo1/e;->H:J

    sget-wide v87, Lo1/e;->p:J

    sget-wide v89, Lo1/e;->q:J

    sget-wide v91, Lo1/e;->T:J

    sget-wide v93, Lo1/e;->U:J

    sget-wide v95, Lo1/e;->v:J

    sget-wide v97, Lo1/e;->w:J

    new-instance v2, Ll1/m;

    move-wide/from16 v41, v3

    invoke-direct/range {v2 .. v98}, Ll1/m;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    return-object v2

    :pswitch_2
    sget v1, Ll1/a;->a:F

    sget-object v1, Ll1/j1;->a:Ll1/j1;

    return-object v1

    :pswitch_3
    invoke-static {}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_4
    invoke-static {}, Lkz2/g;->a()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    invoke-static {}, Lky2/j;->a()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    invoke-static {}, Lkw1/t;->b()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    invoke-static {}, Lkw1/j;->f()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_8
    invoke-static {}, Lkw1/d;->u()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_9
    invoke-static {}, Lkw1/d;->l()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    invoke-static {}, Lkw1/d;->h()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    invoke-static {}, Lkw1/d;->k()Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    invoke-static {}, Lkv1/a;->c()Luf3/a;

    move-result-object v1

    return-object v1

    :pswitch_d
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_e
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_f
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_10
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->b()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_11
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->c()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_12
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_13
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->d()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_14
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;->e()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_15
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_16
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->b()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_17
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_18
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_19
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_1a
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->b()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_1b
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->c()Lwc3/c;

    move-result-object v1

    return-object v1

    :pswitch_1c
    invoke-static {}, Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;->a()Lwc3/c;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
