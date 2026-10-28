.class public final synthetic Lqa1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqa1/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lqa1/a;->w:I

    const/16 v1, 0x2d

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x7

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lqm1/e;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lqm1/e;->i()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/startactivity/presession/domain/model/PreSessionRecentActivitiesRowModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lqf1/a;->a()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinSectionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvancedLabsJoinModels;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/advancedlabsjoin/feature/join/domain/models/AdvanceLabsJoinStickyModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    new-instance v0, Lqc3/j1;

    new-instance v2, Laa3/u0;

    invoke-direct {v2, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v2}, Lqc3/j1;-><init>(Laa3/u0;)V

    invoke-static {v0}, Lqc3/n;->h(Lqc3/n;)V

    invoke-static {v0, v1}, Lds/p;->v(Lqc3/o;C)V

    invoke-static {v0}, Lqc3/n;->g(Lqc3/n;)V

    new-instance v1, Lqc3/k1;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/k1;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_d
    new-instance v0, Lqc3/y0;

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/y0;-><init>(Laa3/u0;)V

    invoke-static {v0}, Lqc3/y0;->j(Lqc3/y0;)V

    invoke-static {v0}, Lqc3/y0;->k(Lqc3/y0;)V

    new-instance v1, Lqc3/z0;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/z0;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_e
    new-instance v0, Lqc3/y0;

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/y0;-><init>(Laa3/u0;)V

    new-instance v1, Lq80/f;

    const/16 v4, 0x19

    invoke-direct {v1, v4}, Lq80/f;-><init>(I)V

    new-array v3, v3, [Lkotlin/jvm/functions/Function1;

    aput-object v1, v3, v2

    new-instance v1, Lq80/f;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lq80/f;-><init>(I)V

    invoke-static {v0, v3, v1}, Lds/p;->q(Lqc3/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lqc3/z0;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/z0;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_f
    new-instance v0, Lqc3/y0;

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/y0;-><init>(Laa3/u0;)V

    new-instance v1, Lq80/f;

    const/16 v4, 0x17

    invoke-direct {v1, v4}, Lq80/f;-><init>(I)V

    new-array v3, v3, [Lkotlin/jvm/functions/Function1;

    aput-object v1, v3, v2

    new-instance v1, Lq80/f;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lq80/f;-><init>(I)V

    invoke-static {v0, v3, v1}, Lds/p;->q(Lqc3/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lqc3/z0;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/z0;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_10
    new-instance v0, Lqc3/d0;

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/d0;-><init>(Laa3/u0;)V

    sget-object v4, Lqc3/o0;->w:Lqc3/o0;

    new-instance v5, Lsc3/c;

    new-instance v6, Lqc3/r;

    invoke-direct {v6, v4}, Lqc3/r;-><init>(Lqc3/o0;)V

    invoke-direct {v5, v6}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-virtual {v1, v5}, Laa3/u0;->f(Lsc3/k;)V

    const/16 v5, 0x3a

    invoke-static {v0, v5}, Lds/p;->v(Lqc3/o;C)V

    new-instance v5, Lsc3/c;

    new-instance v6, Lqc3/g0;

    invoke-direct {v6, v4}, Lqc3/g0;-><init>(Lqc3/o0;)V

    invoke-direct {v5, v6}, Lsc3/c;-><init>(Lsc3/j;)V

    invoke-virtual {v1, v5}, Laa3/u0;->f(Lsc3/k;)V

    new-instance v1, Lq80/f;

    const/16 v4, 0x12

    invoke-direct {v1, v4}, Lq80/f;-><init>(I)V

    new-array v3, v3, [Lkotlin/jvm/functions/Function1;

    aput-object v1, v3, v2

    new-instance v1, Lq80/f;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lq80/f;-><init>(I)V

    invoke-static {v0, v3, v1}, Lds/p;->q(Lqc3/o;[Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lqc3/e0;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/e0;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_11
    new-instance v0, Lq80/f;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lq80/f;-><init>(I)V

    new-instance v1, Lqc3/a0;

    new-instance v2, Laa3/u0;

    invoke-direct {v2, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v1, v2}, Lqc3/a0;-><init>(Laa3/u0;)V

    invoke-virtual {v0, v1}, Lq80/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lqc3/b0;

    invoke-interface {v1}, Lqc3/b;->build()Lsc3/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lqc3/b0;-><init>(Lsc3/d;)V

    return-object v0

    :pswitch_12
    new-instance v0, Lqc3/x;

    new-instance v1, Laa3/u0;

    invoke-direct {v1, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v1}, Lqc3/x;-><init>(Laa3/u0;)V

    invoke-static {v0}, Lqc3/n;->h(Lqc3/n;)V

    invoke-static {v0}, Lqc3/n;->g(Lqc3/n;)V

    invoke-static {v0}, Lqc3/l;->e(Lqc3/l;)V

    new-instance v1, Lqc3/y;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/y;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_13
    new-instance v0, Lqc3/x;

    new-instance v2, Laa3/u0;

    invoke-direct {v2, v4}, Laa3/u0;-><init>(I)V

    invoke-direct {v0, v2}, Lqc3/x;-><init>(Laa3/u0;)V

    invoke-static {v0}, Lqc3/n;->h(Lqc3/n;)V

    invoke-static {v0, v1}, Lds/p;->v(Lqc3/o;C)V

    invoke-static {v0}, Lqc3/n;->g(Lqc3/n;)V

    invoke-static {v0, v1}, Lds/p;->v(Lqc3/o;C)V

    invoke-static {v0}, Lqc3/l;->e(Lqc3/l;)V

    new-instance v1, Lqc3/y;

    invoke-interface {v0}, Lqc3/b;->build()Lsc3/d;

    move-result-object v0

    invoke-direct {v1, v0}, Lqc3/y;-><init>(Lsc3/d;)V

    return-object v1

    :pswitch_14
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->d()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->e()Lwc3/c;

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
