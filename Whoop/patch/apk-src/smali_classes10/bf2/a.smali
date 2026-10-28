.class public final synthetic Lbf2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lbf2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbf2/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddPackToCartRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/ui/main/LinkingActivity;->z()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lbm2/e0;->B()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lbm2/e0;->n()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lbm2/e0;->u()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lbm0/l;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lbm0/e;->b()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateGroup;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutTemplateExercise;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveGroup;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveExercise;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutLibraryResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExercisesResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/straphistorysync/sync/e;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_17
    sget-object v0, Lbi/c;->a:Lci/a;

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/filteredlist/domain/model/FilteredListResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/filteredlist/domain/model/FilteredListResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lbg0/g;->c()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lbg0/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

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
