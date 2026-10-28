.class public final Lgq2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u0008J!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lgq2/a;",
        "",
        "<init>",
        "()V",
        "",
        "style",
        "Li2/x;",
        "c",
        "(Ljava/lang/String;)J",
        "theme",
        "a",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;",
        "statItems",
        "Lsq2/b;",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/String;)J
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "STRAIN_ZONE_5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :pswitch_1
    const-string v0, "STRAIN_ZONE_4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :pswitch_2
    const-string v0, "STRAIN_ZONE_3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :pswitch_3
    const-string v0, "STRAIN_ZONE_2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :pswitch_4
    const-string v0, "STRAIN_ZONE_1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_0
    const-string v0, "LIGHT_STRAIN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    const-wide v0, 0xff0e4a86L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_1
    const-string v0, "SUFFICIENT_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Ly81/f;->SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_2
    const-string v0, "LIGHT_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p1, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_3
    const-string v0, "YELLOW_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p1, Ly81/f;->RECOVERY_MEDIUM_RECOVERY:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_4
    const-string v0, "HIGH_STRESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_0

    :cond_9
    const-wide v0, 0xffffa722L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_5
    const-string v0, "REM_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_0

    :cond_a
    sget-object p1, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_6
    const-string v0, "MODERATE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    const-wide v0, 0xff086bb2L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_7
    const-string v0, "DEEP_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_0

    :cond_c
    sget-object p1, Ly81/f;->SLEEP_DEEP_SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_8
    const-string v0, "INSUFFICIENT_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_0

    :cond_d
    sget-object p1, Ly81/f;->SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    const p1, 0x3ecccccd    # 0.4f

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_9
    const-string v0, "AWAKE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object p1, Ly81/f;->SLEEP_AWAKE:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_a
    const-string v0, "ALL_OUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_0

    :cond_f
    const-wide v0, 0xff66deffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_b
    const-string v0, "AVERAGE_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_0

    :cond_10
    sget-object p1, Ly81/f;->SLEEP:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    const p1, 0x3f333333    # 0.7f

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_c
    const-string v0, "MAXIMAL_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_0

    :cond_11
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_d
    const-string v0, "LOW_STRESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_0

    :cond_12
    const-wide v0, 0xff67aee6L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_e
    const-string v0, "MEDIUM_STRESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto :goto_0

    :cond_13
    const-wide v0, 0xff00f19fL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_f
    const-string v0, "GREEN_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_0

    :cond_14
    sget-object p1, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    :sswitch_10
    const-string v0, "STRENUOUS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto :goto_0

    :cond_15
    const-wide v0, 0xff018ee0L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :sswitch_11
    const-string v0, "RED_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    :goto_0
    const-wide v0, 0xffffffffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    return-wide v0

    :cond_16
    sget-object p1, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    invoke-virtual {p1}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v0

    return-wide v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f892c5d -> :sswitch_11
        -0x6bfcebce -> :sswitch_10
        -0x4e35268f -> :sswitch_f
        -0x4cb91e42 -> :sswitch_e
        -0x37b5a6e1 -> :sswitch_d
        -0x230060f5 -> :sswitch_c
        -0x1c302e0b -> :sswitch_b
        -0xb7f4890 -> :sswitch_a
        0x3bc8165 -> :sswitch_9
        0x5d8137b -> :sswitch_8
        0x8692da4 -> :sswitch_7
        0x9c2ed03 -> :sswitch_6
        0xdae12b2 -> :sswitch_5
        0x136b32f1 -> :sswitch_4
        0x31a48b00 -> :sswitch_3
        0x3582c62e -> :sswitch_2
        0x647cf456 -> :sswitch_1
        0x7b4c94de -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x3fb26998
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Ljava/lang/String;)J
    .locals 4

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x1a5c6dff

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "WIR_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_2
    const-string v0, "OUTRO"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :sswitch_3
    const-string v0, "RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const p1, 0x1a5cc4ff

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_4
    const-string v0, "WIR_STRAIN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :sswitch_5
    const-string v0, "WIR_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_6
    const-string v0, "WIR_OUTRO"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const p1, 0x1aa4a3f1

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_7
    const-string v0, "STRAIN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const p1, 0x1a0093e7

    invoke-static {p1}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :cond_4
    :goto_0
    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_data_0
    .sparse-switch
        -0x6d97ca8b -> :sswitch_7
        -0x652bf354 -> :sswitch_6
        -0x64f7e688 -> :sswitch_5
        -0x398e552c -> :sswitch_4
        -0xfb906b -> :sswitch_3
        0x48129eb -> :sswitch_2
        0x4b536b7 -> :sswitch_1
        0x56860934 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;",
            ">;)",
            "Ljava/util/List<",
            "Lsq2/b;",
            ">;"
        }
    .end annotation

    const-string v0, "statItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;

    new-instance v2, Lsq2/b;

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;->getStyle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lgq2/a;->c(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;->getFillPercentage()F

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;->getPrimary()Z

    move-result v6

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;->getStatistic()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/DonutStatisticsItem;->getValue()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v9}, Lsq2/b;-><init>(JFZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
