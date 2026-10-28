.class public final synthetic Lyo0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lyo0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lyo0/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/behaviordetails/BehaviorDetailsTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lz80/a;->e()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lz72/g;->y()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lz71/l;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lz71/l;->m()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/recoveryimpacts/domain/model/RecoveryImpactsResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lz51/b;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lz22/b;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lyw1/m;->b()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lyw1/i;->m()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorMetric;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/data/remote/domain/dto/healthmonitor/HealthMonitorDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lyt2/m;->a()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lyt2/c;->j()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lyt2/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lyt2/c;->k()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lyt2/c;->m()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lyo0/i;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lyo0/e;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lyo0/e;->u()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lyo0/e;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lyo0/e;->e()Ll83/a0;

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
