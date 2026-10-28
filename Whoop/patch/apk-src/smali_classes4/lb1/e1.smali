.class public final synthetic Llb1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/e1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/e1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/items/ScoreGaugeModel;

    invoke-static {p1}, Llb1/u1;->e(Lcom/whoop/design/models/items/ScoreGaugeModel;)Lj81/i;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/ExplainerGaugeModel;

    invoke-static {p1}, Llb1/u1;->g(Lcom/whoop/design/models/items/ExplainerGaugeModel;)Lr11/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/StrainGaugeModel;

    invoke-static {p1}, Llb1/u1;->d(Lcom/whoop/design/models/items/StrainGaugeModel;)Lz51/r;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/RecoveryGaugeModel;

    invoke-static {p1}, Llb1/u1;->f(Lcom/whoop/design/models/items/RecoveryGaugeModel;)Lz51/r;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/items/OverviewGaugeModel;

    invoke-static {p1}, Llb1/u1;->a(Lcom/whoop/design/models/items/OverviewGaugeModel;)Lz51/l;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/u1;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/design/models/items/ArchMiniFilteredListModel;

    invoke-static {p1}, Llb1/s1;->b(Lcom/whoop/design/models/items/ArchMiniFilteredListModel;)Lu11/j;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/s1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/design/models/items/FileViewerModel;

    invoke-static {p1}, Llb1/r1;->b(Lcom/whoop/design/models/items/FileViewerModel;)Lhy0/r;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/r1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/design/models/cards/FertilityStatusItemModel;

    invoke-static {p1}, Llb1/q1;->b(Lcom/whoop/design/models/cards/FertilityStatusItemModel;)Lg01/g;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/cards/FertilityCardModel;

    invoke-static {p1}, Llb1/q1;->a(Lcom/whoop/design/models/cards/FertilityCardModel;)Lg01/d;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/q1;->f(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/items/FabMenuModel;

    invoke-static {p1}, Llb1/p1;->a(Lcom/whoop/design/models/items/FabMenuModel;)Lvy0/d0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/p1;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    invoke-static {p1}, Llb1/o1;->b(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;)Lw51/h;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/o1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/ExpandableContentModel;

    invoke-static {p1}, Llb1/n1;->b(Lcom/whoop/design/models/items/ExpandableContentModel;)Lv51/c;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/n1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/ExpandableCardModel;

    invoke-static {p1}, Llb1/m1;->c(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/m1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;

    invoke-static {p1}, Llb1/l1;->b(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/l1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/ExerciseBreakdownModel;

    invoke-static {p1}, Llb1/k1;->a(Lcom/whoop/design/models/items/ExerciseBreakdownModel;)Lm11/d;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/k1;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/items/EndpointButtonModel;

    invoke-static {p1}, Llb1/j1;->a(Lcom/whoop/design/models/items/EndpointButtonModel;)Ll11/e;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/j1;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/design/models/tiles/EmptyTileModel;

    invoke-static {p1}, Llb1/i1;->b(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/i1;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/DividerModel;

    invoke-static {p1}, Llb1/f1;->a(Lcom/whoop/design/models/items/DividerModel;)Lhy0/e;

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
