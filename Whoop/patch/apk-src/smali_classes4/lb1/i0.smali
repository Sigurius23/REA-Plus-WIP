.class public final synthetic Llb1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb1/i0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llb1/i0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/f1;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/design/models/items/DetailsMetricTileModel;

    invoke-static {p1}, Llb1/d1;->e(Lcom/whoop/design/models/items/DetailsMetricTileModel;)Lty0/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/design/models/ComparisonBarsGraphModel;

    invoke-static {p1}, Llb1/d1;->b(Lcom/whoop/design/models/ComparisonBarsGraphModel;)Ly11/d;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/design/models/items/ArrowStatModel;

    invoke-static {p1}, Llb1/d1;->c(Lcom/whoop/design/models/items/ArrowStatModel;)Lly0/f;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/d1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/whoop/design/models/items/DesignItemGridModel;

    invoke-static {p1}, Llb1/x0;->c(Lcom/whoop/design/models/items/DesignItemGridModel;)Lt51/c;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/x0;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {p1}, Llb1/w0;->a(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/w0;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/design/models/items/DataHighlightModel;

    invoke-static {p1}, Llb1/u0;->a(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/u0;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/design/models/cards/ContentBlockListCardModel;

    invoke-static {p1}, Llb1/q0;->a(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/q0;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/whoop/design/models/cards/ContentBlockCardModel;

    invoke-static {p1}, Llb1/p0;->b(Lcom/whoop/design/models/cards/ContentBlockCardModel;)Lf01/e0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/p0;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/design/models/items/ComparisonTableModel;

    invoke-static {p1}, Llb1/n0;->a(Lcom/whoop/design/models/items/ComparisonTableModel;)Lz01/d;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    invoke-static {p1}, Llb1/n0;->e(Lcom/whoop/design/models/items/MembershipComparisonTableModel;)Lq21/i;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/StrainBreakDownModel;

    invoke-static {p1}, Llb1/n0;->c(Lcom/whoop/design/models/items/StrainBreakDownModel;)Ly01/c;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/n0;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcom/whoop/design/models/items/CompactTrendModel;

    invoke-static {p1}, Llb1/m0;->b(Lcom/whoop/design/models/items/CompactTrendModel;)Lo51/d;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/m0;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/design/models/cards/CompactButtonCardModel;

    invoke-static {p1}, Llb1/l0;->b(Lcom/whoop/design/models/cards/CompactButtonCardModel;)Lf01/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/l0;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/design/models/items/CommunityTeamTileModel;

    invoke-static {p1}, Llb1/k0;->b(Lcom/whoop/design/models/items/CommunityTeamTileModel;)Lx01/c;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lcom/whoop/design/models/items/FollowerRequestModel;

    invoke-static {p1}, Llb1/k0;->f(Lcom/whoop/design/models/items/FollowerRequestModel;)Lv11/j;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lcom/whoop/design/models/items/CommunityFollowerModel;

    invoke-static {p1}, Llb1/k0;->d(Lcom/whoop/design/models/items/CommunityFollowerModel;)Lu01/e;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/k0;->e(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/k0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Llb1/k0;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lcom/whoop/design/models/items/ArchMiniCommunityFollowerLookupModel;

    invoke-static {p1}, Llb1/j0;->b(Lcom/whoop/design/models/items/ArchMiniCommunityFollowerLookupModel;)Lw01/h;

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
