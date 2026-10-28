.class public final synthetic Llb1/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/m4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/m4;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;

    invoke-static {p1}, Llb1/a5;->I(Lcom/whoop/design/models/items/LockedImpactOnRecoveryModel;)Lt71/f;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModel;

    invoke-static {p1}, Llb1/a5;->h(Lcom/whoop/design/models/items/ArticleTileModel;)Ld41/h;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/items/MetricEducationModel;

    invoke-static {p1}, Llb1/a5;->O(Lcom/whoop/design/models/items/MetricEducationModel;)Lr21/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/InsufficientImpactTileModel;

    invoke-static {p1}, Llb1/a5;->G(Lcom/whoop/design/models/items/InsufficientImpactTileModel;)Lt71/p;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {p1}, Llb1/a5;->a(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/design/models/items/AlertTileModel;

    invoke-static {p1}, Llb1/a5;->R(Lcom/whoop/design/models/items/AlertTileModel;)Lc41/m0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/whoop/design/models/items/ImpactTileModel;

    invoke-static {p1}, Llb1/a5;->c0(Lcom/whoop/design/models/items/ImpactTileModel;)Lt71/j;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;

    invoke-static {p1}, Llb1/a5;->c(Lcom/whoop/design/models/ImpactMagnitudeTileModel;)Ls71/c;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/whoop/design/models/items/LogoNavModel;

    invoke-static {p1}, Llb1/a5;->D(Lcom/whoop/design/models/items/LogoNavModel;)Lx71/d;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/design/models/items/ImageAndIconModel;

    invoke-static {p1}, Llb1/a5;->B(Lcom/whoop/design/models/items/ImageAndIconModel;)Lx71/d;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-static {p1}, Llb1/a5;->x(Lcom/whoop/design/models/items/GoalSettingsTileModel;)Lf41/e;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/items/BehaviorCountTileModel;

    invoke-static {p1}, Llb1/a5;->a0(Lcom/whoop/design/models/items/BehaviorCountTileModel;)Lc41/j1;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/whoop/design/models/items/CurrentPlanTileModel;

    invoke-static {p1}, Llb1/a5;->M(Lcom/whoop/design/models/items/CurrentPlanTileModel;)Le11/d;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-static {p1}, Llb1/a5;->F(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)Lh51/f;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {p1}, Llb1/a5;->n(Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;

    invoke-static {p1}, Llb1/a5;->j(Lcom/whoop/design/models/items/CollapsableHeaderModel;)Ll51/g;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/a5;->v(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/MarkdownTextModel;

    invoke-static {p1}, Llb1/u4;->a(Lcom/whoop/design/models/MarkdownTextModel;)Lsz0/c0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-static {p1}, Llb1/u4;->c(Lcom/whoop/design/models/TitleSubTitleModel;)Lsz0/k1;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/AnnotatedTextModel;

    invoke-static {p1}, Llb1/u4;->d(Lcom/whoop/design/models/items/AnnotatedTextModel;)Lsz0/c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/u4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/items/TagSelectorModel;

    invoke-static {p1}, Llb1/r4;->a(Lcom/whoop/design/models/items/TagSelectorModel;)Ln81/f;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/r4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/TagModel;

    invoke-static {p1}, Llb1/q4;->a(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/q4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/items/SuggestionBubbleModel;

    invoke-static {p1}, Llb1/p4;->a(Lcom/whoop/design/models/items/SuggestionBubbleModel;)Loz0/c;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/p4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lcom/whoop/design/models/items/SplitColumnModel;

    invoke-static {p1}, Llb1/o4;->c(Lcom/whoop/design/models/items/SplitColumnModel;)Ll81/e;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/o4;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/SpecificationTableModel;

    invoke-static {p1}, Llb1/n4;->a(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;

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
