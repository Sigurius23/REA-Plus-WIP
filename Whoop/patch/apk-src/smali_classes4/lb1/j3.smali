.class public final synthetic Llb1/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/j3;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/j3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/y3;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/ProgressMetricRowModel;

    invoke-static {p1}, Llb1/w3;->b(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/w3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/ProgressMeterModel;

    invoke-static {p1}, Llb1/v3;->a(Lcom/whoop/design/models/ProgressMeterModel;)Lf81/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/v3;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/design/models/items/GoalProgressCardModel;

    invoke-static {p1}, Llb1/u3;->b(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/design/models/items/ProgressBreakdownModel;

    invoke-static {p1}, Llb1/u3;->d(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;

    invoke-static {p1}, Llb1/u3;->c(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/u3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {p1}, Llb1/t3;->b(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/t3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/cards/ProductTestCardModel;

    invoke-static {p1}, Llb1/r3;->b(Lcom/whoop/design/models/cards/ProductTestCardModel;)Lf01/p1;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/r3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/items/PieChartModel;

    invoke-static {p1}, Llb1/q3;->b(Lcom/whoop/design/models/items/PieChartModel;)Le81/f0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/q3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/PaceOfAgingMeterModel;

    invoke-static {p1}, Llb1/p3;->a(Lcom/whoop/design/models/items/PaceOfAgingMeterModel;)Lc81/g;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/p3;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/OptionInfoModel;

    invoke-static {p1}, Llb1/o3;->b(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/o3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/OptionCommitPanelModel;

    invoke-static {p1}, Llb1/n3;->a(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/n3;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/EntryPointModel;

    invoke-static {p1}, Llb1/l3;->i(Lcom/whoop/design/models/items/EntryPointModel;)Lc41/w1;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/design/models/cards/ActionCardModel;

    invoke-static {p1}, Llb1/l3;->c(Lcom/whoop/design/models/cards/ActionCardModel;)Lf01/d;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/cards/TextAndImageCardModel;

    invoke-static {p1}, Llb1/l3;->h(Lcom/whoop/design/models/cards/TextAndImageCardModel;)Lh01/t;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/design/models/cards/TextOnlyCardModel;

    invoke-static {p1}, Llb1/l3;->e(Lcom/whoop/design/models/cards/TextOnlyCardModel;)Lh01/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;

    invoke-static {p1}, Llb1/l3;->b(Lcom/whoop/design/models/cards/TextWithDesignItemCardModel;)Lh01/q;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    invoke-static {p1}, Llb1/l3;->a(Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;)Lh01/q;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/l3;->f(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;

    invoke-static {p1}, Llb1/k3;->b(Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;)Lhb1/n;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/k3;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

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
