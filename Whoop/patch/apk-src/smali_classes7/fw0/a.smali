.class public final synthetic Lfw0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lfw0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lfw0/a;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphLegendTheme;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphLegendTheme;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/items/graph/GraphCardCtaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lg81/b;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lg32/k;->j()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lg32/k;->f()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lg32/k;->h()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lg32/k;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lg11/c;->l()Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_b
    new-instance v0, Lg1/l5;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const/4 v3, 0x0

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, Lg1/l5;-><init>(Lt0/a;Lt0/i;Lt0/i;)V

    return-object v0

    :pswitch_c
    sget-object v0, Lg1/g5;->a:Lp1/u2;

    return-object v1

    :pswitch_d
    invoke-static {}, Lcom/whoop/widget/model/WidgetType;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/widget/model/WidgetStressState;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/widget/model/WidgetStressResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/widget/model/WidgetStatistic;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/widget/model/WidgetModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/widget/model/WidgetLockedContent;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/widget/model/LockedContentButtonStyle;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Shapes provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Colors provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No Typography provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_17
    sget-object v0, Lg00/g;->a:Lp1/u2;

    return-object v1

    :pswitch_18
    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_19
    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->g()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->e()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->f()Lwc3/c;

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
