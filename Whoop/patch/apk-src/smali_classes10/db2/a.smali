.class public final synthetic Ldb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldb2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldb2/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeValue;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressMiniArchModelResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressMiniArchModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgressModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/exerciseprogressminiarch/domain/models/ArchMiniExerciseProgress;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Ldd2/a;->b()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Ldd1/l;->r()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Ldd1/l;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Ldd1/l;->j()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Ldd1/l;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Ldd1/j;->c0()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Ldd1/j;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Ldd1/j;->M()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Ldd1/j;->Q()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Ldd1/e;->Z()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Ldd1/e;->w()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Ldd1/e;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Ldd1/e;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Ldd1/e;->k0()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Ldd1/e;->h0()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Ldc2/a;->b()Llb1/y0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV3;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/settings/banner/models/SettingsBannerDtoV2;->a()Lwc3/c;

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
