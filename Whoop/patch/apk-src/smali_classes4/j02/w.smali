.class public final synthetic Lj02/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lj02/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj02/w;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lm91/l;->i()Lm91/p;

    move-result-object v0

    return-object v0

    :pswitch_2
    sget-object v0, Lm8/a;->a:Lp1/b0;

    const/4 v0, 0x0

    return-object v0

    :pswitch_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/metrics/domain/models/MetricsBody;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/metrics/domain/models/MetricDto;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Llb1/z3;->c()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Llb1/y1;->a()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Llb1/n1;->c()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Llb1/m1;->b()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Llb1/g0;->b()Ljb1/a;

    move-result-object v0

    return-object v0

    :pswitch_b
    new-instance v0, Ll0/j0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/j0;-><init>(I)V

    return-object v0

    :pswitch_c
    invoke-static {}, Lkd1/p;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lkd1/n;->a()Lkd1/m;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/addactivity/network/model/ScoreType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/addactivity/network/model/RecentActivity;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/addactivity/network/model/Activity;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lk80/i;->b()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Ljs1/l;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CompositionLocal LocalLifecycleOwner not present"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/navigation/StreaksExplainerModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/navigation/SleepPlannerScreenModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/navigation/NavigationScreenModel$None;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/navigation/DrawerPresentation;->a()Lwc3/c;

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
