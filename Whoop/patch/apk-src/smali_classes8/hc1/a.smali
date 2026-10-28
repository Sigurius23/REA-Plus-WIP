.class public abstract Lhc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhc1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a3\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;",
        "segmentStyle",
        "Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;",
        "plotStyle",
        "",
        "isTopLabel",
        "isBottomLabel",
        "Ly81/e;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZ)Ly81/e;",
        "c",
        "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Z)Ly81/e;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZ)Ly81/e;
    .locals 1

    const-string v0, "segmentStyle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plotStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->SLEEP:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    if-ne p1, v0, :cond_0

    sget-object p0, Lhc1/a$b;->w:Lhc1/a$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;->SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    if-ne p1, v0, :cond_1

    sget-object p0, Lhc1/a$c;->w:Lhc1/a$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_HOURS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    if-ne p0, p1, :cond_2

    sget-object p0, Lhc1/a$d;->w:Lhc1/a$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p1, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    if-ne p0, p1, :cond_3

    sget-object p0, Lhc1/a$e;->w:Lhc1/a$e;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_3
    if-eqz p2, :cond_4

    sget-object p0, Lhc1/a$f;->w:Lhc1/a$f;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0, p3}, Lhc1/a;->c(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Z)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZILjava/lang/Object;)Ly81/e;
    .locals 1

    and-int/lit8 p5, p4, 0x4

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lhc1/a;->a(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZ)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Z)Ly81/e;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_HOURS:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    if-eq p0, v0, :cond_3

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->SLEEP_NEED:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    if-eq p0, v0, :cond_3

    sget-object v0, Lhc1/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Lhc1/a$i;->w:Lhc1/a$i;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_1
    sget-object p0, Lhc1/a$h;->w:Lhc1/a$h;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_2
    if-eqz p1, :cond_0

    sget-object p0, Lhc1/a$q;->w:Lhc1/a$q;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lhc1/a$g;->w:Lhc1/a$g;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_3
    if-eqz p1, :cond_1

    sget-object p0, Lhc1/a$o;->w:Lhc1/a$o;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lhc1/a$p;->w:Lhc1/a$p;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_4
    if-eqz p1, :cond_2

    sget-object p0, Lhc1/a$m;->w:Lhc1/a$m;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lhc1/a$n;->w:Lhc1/a$n;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_5
    sget-object p0, Lhc1/a$l;->w:Lhc1/a$l;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_6
    sget-object p0, Lhc1/a$k;->w:Lhc1/a$k;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :pswitch_7
    sget-object p0, Lhc1/a$j;->w:Lhc1/a$j;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "SLEEP_HOURS/SLEEP_NEED handled in getTrendPlotColor"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
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
