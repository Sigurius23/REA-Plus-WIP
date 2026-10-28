.class public abstract Lgc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;",
        "model",
        "La71/a;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;",
        "La71/d;",
        "style",
        "Ly81/e;",
        "f",
        "(La71/d;)Ly81/e;",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;",
        "phaseLabel",
        "Lhy0/h1;",
        "d",
        "(Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;)Lhy0/h1;",
        "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;",
        "La71/c;",
        "e",
        "(Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;)La71/c;",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCallout",
        "Lc41/p2;",
        "c",
        "(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;",
        "Lcom/whoop/design/models/items/graph/GraphLegendModel;",
        "graphLegend",
        "Ln21/e;",
        "b",
        "(Lcom/whoop/design/models/items/graph/GraphLegendModel;)Ln21/e;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;
    .locals 16

    if-nez p0, :cond_0

    new-instance v0, La71/a;

    const/16 v13, 0xf7f

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v14}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getPrimaryContextualDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getValue()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-float v0, v3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getValueDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getUnitDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getSecondaryContextualDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getScrubberStyle()La71/d;

    move-result-object v0

    invoke-static {v0}, Lgc1/a;->f(La71/d;)Ly81/e;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getDataContext()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getPhaseLabel()Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;

    move-result-object v0

    invoke-static {v0}, Lgc1/a;->d(Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;)Lhy0/h1;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getSupplementalDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lgc1/a;->e(Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;)La71/c;

    move-result-object v0

    move-object v11, v0

    goto :goto_1

    :cond_2
    move-object v11, v1

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v0

    invoke-static {v0}, Lgc1/a;->c(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;->getGraphLegends()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/graph/GraphLegendModel;

    invoke-static {v9}, Lgc1/a;->b(Lcom/whoop/design/models/items/graph/GraphLegendModel;)Ln21/e;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v12, v1

    new-instance v1, La71/a;

    const/16 v14, 0x80

    const/4 v15, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v15}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final b(Lcom/whoop/design/models/items/graph/GraphLegendModel;)Ln21/e;
    .locals 11

    new-instance v0, Ln21/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/GraphLegendModel;->getGraphLegendStyle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lvb1/b;->v(Ljava/lang/String;)Li91/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/GraphLegendModel;->getLegendText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/GraphLegendModel;->getGraphLegendStyle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lvb1/b;->x(Ljava/lang/String;)Ln21/i;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/GraphLegendModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v5

    sget-object v6, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v8, Lb91/c;->B3:Lb91/c;

    const/16 v9, 0x41

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v10}, Ln21/e;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Ly81/f;Lkotlin/jvm/functions/Function1;Lb91/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final c(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p0}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;)Lhy0/h1;
    .locals 30

    if-eqz p0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;->getStyle()La71/b;

    move-result-object v0

    sget-object v1, Lgc1/a$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eq v0, v1, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    if-ne v0, v2, :cond_0

    sget-object v0, Lgc1/a$h;->w:Lgc1/a$h;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v1, Lgc1/a$i;->w:Lgc1/a$i;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lgc1/a$f;->w:Lgc1/a$f;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v1, Lgc1/a$g;->w:Lgc1/a$g;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lgc1/a$d;->w:Lgc1/a$d;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v1, Lgc1/a$e;->w:Lgc1/a$e;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lgc1/a$b;->w:Lgc1/a$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v1, Lgc1/a$c;->w:Lgc1/a$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    iget-object v0, v4, Ll83/k;->w:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ly81/e;

    iget-object v0, v4, Ll83/k;->x:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ly81/e;

    new-instance v5, Lhy0/h1;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;->getDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v13, Lhy0/o1;->SYMPTOMS:Lhy0/o1;

    int-to-float v0, v3

    int-to-float v1, v2

    mul-float/2addr v0, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    const v28, 0x3ffd6a

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v5 .. v29}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final e(Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;)La71/c;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La71/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->getLeadingLabelDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->getLeadingRangeDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->getTrailingLabelDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->getTrailingRangeDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;->getUnitDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, La71/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final f(La71/d;)Ly81/e;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lgc1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    sget-object p0, Lgc1/a$k0;->w:Lgc1/a$k0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_0
    sget-object p0, Lgc1/a$j0;->w:Lgc1/a$j0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1
    sget-object p0, Lgc1/a$i0;->w:Lgc1/a$i0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Lgc1/a$h0;->w:Lgc1/a$h0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget-object p0, Lgc1/a$g0;->w:Lgc1/a$g0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_4
    sget-object p0, Lgc1/a$f0;->w:Lgc1/a$f0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_5
    sget-object p0, Lgc1/a$d0;->w:Lgc1/a$d0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_6
    sget-object p0, Lgc1/a$c0;->w:Lgc1/a$c0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_7
    sget-object p0, Lgc1/a$b0;->w:Lgc1/a$b0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_8
    sget-object p0, Lgc1/a$a0;->w:Lgc1/a$a0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_9
    sget-object p0, Lgc1/a$z;->w:Lgc1/a$z;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_a
    sget-object p0, Lgc1/a$y;->w:Lgc1/a$y;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_b
    sget-object p0, Lgc1/a$x;->w:Lgc1/a$x;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_c
    sget-object p0, Lgc1/a$w;->w:Lgc1/a$w;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_d
    sget-object p0, Lgc1/a$v;->w:Lgc1/a$v;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_e
    sget-object p0, Lgc1/a$u;->w:Lgc1/a$u;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_f
    sget-object p0, Lgc1/a$s;->w:Lgc1/a$s;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_10
    sget-object p0, Lgc1/a$r;->w:Lgc1/a$r;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_11
    sget-object p0, Lgc1/a$q;->w:Lgc1/a$q;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_12
    sget-object p0, Lgc1/a$p;->w:Lgc1/a$p;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_13
    sget-object p0, Lgc1/a$o;->w:Lgc1/a$o;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_14
    sget-object p0, Lgc1/a$n;->w:Lgc1/a$n;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_15
    sget-object p0, Lgc1/a$m;->w:Lgc1/a$m;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_16
    sget-object p0, Lgc1/a$l;->w:Lgc1/a$l;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_17
    sget-object p0, Lgc1/a$k;->w:Lgc1/a$k;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_18
    sget-object p0, Lgc1/a$j;->w:Lgc1/a$j;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_19
    sget-object p0, Lgc1/a$r0;->w:Lgc1/a$r0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1a
    sget-object p0, Lgc1/a$q0;->w:Lgc1/a$q0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1b
    sget-object p0, Lgc1/a$p0;->w:Lgc1/a$p0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1c
    sget-object p0, Lgc1/a$o0;->w:Lgc1/a$o0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1d
    sget-object p0, Lgc1/a$n0;->w:Lgc1/a$n0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1e
    sget-object p0, Lgc1/a$m0;->w:Lgc1/a$m0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1f
    sget-object p0, Lgc1/a$l0;->w:Lgc1/a$l0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_20
    sget-object p0, Lgc1/a$e0;->w:Lgc1/a$e0;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_21
    sget-object p0, Lgc1/a$t;->w:Lgc1/a$t;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
