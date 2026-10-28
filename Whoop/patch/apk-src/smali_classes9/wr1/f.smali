.class public final synthetic Lwr1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwr1/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/glance/session/SessionWorker;)V
    .locals 0

    .line 2
    const/16 p1, 0x1a

    iput p1, p0, Lwr1/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwr1/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/service/TimeZoneReceiver;->a()Lx82/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_4
    new-instance v0, Lyb3/p;

    const-string v1, "[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/stripe/android/ui/core/elements/OTPSpec;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/stripe/android/ui/core/elements/KeyboardType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/stripe/android/ui/core/elements/DisplayField;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_c
    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    new-instance v0, Lyb3/p;

    const-string v1, "^[0-9]{6}$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_f
    invoke-static {}, Lx11/b;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lwz0/d;->j()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lwz0/d;->i()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTargetsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTargetZone;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTargetType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/core/details/activitytargets/ActivityTarget;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

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
