.class public final synthetic Lve/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lve/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lve/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/BehaviorTrackerDestinationDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lvp1/h;->T()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lvp1/h;->I()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lvp1/h;->p()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lvp1/h;->r()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lvo1/r;->K()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lvo1/r;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lvo1/h;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lvo1/d;->o()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lvo1/d;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lvn1/h;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lvm1/a;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lvl0/d;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/educationModels/StickyButton;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/educationModels/PodcastPlayer;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/educationModels/PodcastPicker;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/educationModels/OperatingSystem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationVideoDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationScreenDto;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationParagraphDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationDto;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationButtonDto;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/educationModels/FeatureEducationButtonDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/educationModels/EducationVideoTypeDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    const-string v0, "refreshing credentials cache"

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
