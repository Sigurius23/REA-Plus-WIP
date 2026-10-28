.class public final synthetic La13/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La13/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La13/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lem1/a0;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Le61/h;->c()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Le61/h;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Le61/h;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Le61/h;->g()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Ldp0/h;->a()Ldp0/g;

    move-result-object v0

    return-object v0

    :pswitch_c
    new-instance v0, Lz1/v;

    new-instance v1, Lcom/whoop/data/repositories/f;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/whoop/data/repositories/f;-><init>(I)V

    invoke-direct {v0, v1}, Lz1/v;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lz1/v;->e()V

    return-object v0

    :pswitch_d
    invoke-static {}, Lc03/a;->c()Llb1/y0;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lbh2/b;->a()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    new-instance v0, Lud3/l0;

    invoke-direct {v0}, Lud3/l0;-><init>()V

    return-object v0

    :pswitch_11
    invoke-static {}, Lb52/b;->g()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lb52/b;->j()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lb52/b;->n()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lb52/b;->a()Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_16
    sget-object v0, Lad3/f;->a:Lad3/f;

    invoke-virtual {v0}, Lad3/f;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_17
    sget-object v0, Lad3/b0;->a:Lad3/b0;

    invoke-virtual {v0}, Lad3/b0;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_18
    sget-object v0, Lad3/t;->a:Lad3/t;

    invoke-virtual {v0}, Lad3/t;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_19
    sget-object v0, Lad3/x;->a:Lad3/x;

    invoke-virtual {v0}, Lad3/x;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_1a
    sget-object v0, Lad3/d0;->a:Lad3/d0;

    invoke-virtual {v0}, Lad3/d0;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0

    :pswitch_1b
    sget-object v0, La2/f;->a:Lp1/u2;

    const/4 v0, 0x0

    return-object v0

    :pswitch_1c
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

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
