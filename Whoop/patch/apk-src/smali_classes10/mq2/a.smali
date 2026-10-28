.class public final synthetic Lmq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lmq2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lmq2/a;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Ln92/b;->b()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Ln6/h;->a:Lp1/u2;

    sget-object v0, Lu6/a;->B:Lu6/a;

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No default glance id"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    sget-object v0, Ln6/h;->a:Lp1/u2;

    return-object v1

    :pswitch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No default context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No default size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    invoke-static {}, Ln50/d;->f()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Ln50/d;->p()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Ln31/h;->b()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_8
    new-instance v0, Ln1/o;

    new-instance v2, Ld0/e;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-object v4, Ld0/f;->i:Ld0/f2;

    const/16 v5, 0xc

    invoke-direct {v2, v3, v4, v1, v5}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-direct {v0, v2}, Ln1/o;-><init>(Ld0/e;)V

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/navigation/models/GenericHttpMethod;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/navigation/models/ApiRequest;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_c
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_d
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecordsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ArchMiniExerciseRecords;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lmt2/e;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lmt2/e;->o()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lmt0/f;->s()Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingLoadingState;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/weeklyplan/api/ChallengeLandingCustomPlanCard;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lmq2/g;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lmq2/c;->a()Lmq2/b;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lmq2/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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
