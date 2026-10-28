.class public abstract synthetic Llb1/a5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb1/a5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I

.field public static final synthetic d:[I

.field public static final synthetic e:[I

.field public static final synthetic f:[I

.field public static final synthetic g:[I

.field public static final synthetic h:[I

.field public static final synthetic i:[I

.field public static final synthetic j:[I

.field public static final synthetic k:[I

.field public static final synthetic l:[I

.field public static final synthetic m:[I


# direct methods
.method static constructor <clinit>()V
    .locals 20

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;->STANDARD:Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;->ONBOARDING:Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Llb1/a5$a;->a:[I

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->values()[Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v3, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->DISMISS:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v3, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->VIEW_ALL:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const/4 v3, 0x3

    :try_start_4
    sget-object v4, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->MORE:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Llb1/a5$a;->b:[I

    invoke-static {}, Lcom/whoop/design/models/items/MiniMonitorStatusType;->values()[Lcom/whoop/design/models/items/MiniMonitorStatusType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_5
    sget-object v4, Lcom/whoop/design/models/items/MiniMonitorStatusType;->OK:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v4, Lcom/whoop/design/models/items/MiniMonitorStatusType;->WARNING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v4, Lcom/whoop/design/models/items/MiniMonitorStatusType;->ALERT:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    const/4 v4, 0x4

    :try_start_8
    sget-object v5, Lcom/whoop/design/models/items/MiniMonitorStatusType;->LOW:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    const/4 v5, 0x5

    :try_start_9
    sget-object v6, Lcom/whoop/design/models/items/MiniMonitorStatusType;->MEDIUM:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    const/4 v6, 0x6

    :try_start_a
    sget-object v7, Lcom/whoop/design/models/items/MiniMonitorStatusType;->HIGH:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    const/4 v7, 0x7

    :try_start_b
    sget-object v8, Lcom/whoop/design/models/items/MiniMonitorStatusType;->CALIBRATING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    const/16 v8, 0x8

    :try_start_c
    sget-object v9, Lcom/whoop/design/models/items/MiniMonitorStatusType;->NO_DATA:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aput v8, v0, v9
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    const/16 v9, 0x9

    :try_start_d
    sget-object v10, Lcom/whoop/design/models/items/MiniMonitorStatusType;->DATA_HIDDEN:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aput v9, v0, v10
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    const/16 v10, 0xa

    :try_start_e
    sget-object v11, Lcom/whoop/design/models/items/MiniMonitorStatusType;->PENDING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v10, v0, v11
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    sput-object v0, Llb1/a5$a;->c:[I

    invoke-static {}, Ly71/q;->values()[Ly71/q;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_f
    sget-object v11, Ly71/q;->RAF_MENU_ITEM:Ly71/q;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v1, v0, v11
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :try_start_10
    sget-object v11, Ly71/q;->SHOP_PROMO:Ly71/q;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v2, v0, v11
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v11, Ly71/q;->SHOP:Ly71/q;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v3, v0, v11
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :try_start_12
    sget-object v11, Ly71/q;->ALERT:Ly71/q;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v4, v0, v11
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    :try_start_13
    sget-object v11, Ly71/q;->REFER_A_FRIEND:Ly71/q;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v5, v0, v11
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    sput-object v0, Llb1/a5$a;->d:[I

    invoke-static {}, Lcom/whoop/design/models/LegendStyle;->values()[Lcom/whoop/design/models/LegendStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_14
    sget-object v11, Lcom/whoop/design/models/LegendStyle;->POSITIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v1, v0, v11
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v11, Lcom/whoop/design/models/LegendStyle;->NEGATIVE_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v2, v0, v11
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :try_start_16
    sget-object v11, Lcom/whoop/design/models/LegendStyle;->NEUTRAL_TREND_TARGET:Lcom/whoop/design/models/LegendStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v3, v0, v11
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    sput-object v0, Llb1/a5$a;->e:[I

    invoke-static {}, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->values()[Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_17
    sget-object v11, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->POSITIVE:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v1, v0, v11
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v11, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->NEGATIVE:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v2, v0, v11
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :try_start_19
    sget-object v11, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->POSITIVE_RANGE:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v3, v0, v11
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v11, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->CONCERN_RANGE:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v4, v0, v11
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    :try_start_1b
    sget-object v11, Lcom/whoop/design/atomic/atom/TrendTypeEnum;->ALERT_RANGE:Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v5, v0, v11
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    sput-object v0, Llb1/a5$a;->f:[I

    invoke-static {}, Lcom/whoop/design/models/items/ImpactStyle;->values()[Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_1c
    sget-object v11, Lcom/whoop/design/models/items/ImpactStyle;->INELIGIBLE:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v1, v0, v11
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1d
    sget-object v11, Lcom/whoop/design/models/items/ImpactStyle;->RECOVERY:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v2, v0, v11
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    sput-object v0, Llb1/a5$a;->g:[I

    invoke-static {}, Lkd1/l;->values()[Lkd1/l;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_1e
    sget-object v11, Lkd1/l;->CARD_EXPIRED:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v1, v0, v11
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    :try_start_1f
    sget-object v11, Lkd1/l;->CARD_EXPIRING:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v2, v0, v11
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    :try_start_20
    sget-object v11, Lkd1/l;->NO_CARD_ON_FILE:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v3, v0, v11
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    :try_start_21
    sget-object v11, Lkd1/l;->PAYMENT_FAILED:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v4, v0, v11
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    :try_start_22
    sget-object v11, Lkd1/l;->MEMBERSHIP_EXPIRED:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v5, v0, v11
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    :catch_22
    :try_start_23
    sget-object v11, Lkd1/l;->MEMBERSHIP_EXPIRED_V2:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v6, v0, v11
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    :catch_23
    :try_start_24
    sget-object v11, Lkd1/l;->MEMBERSHIP_EXPIRING:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v7, v0, v11
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    :catch_24
    :try_start_25
    sget-object v11, Lkd1/l;->MEMBERSHIP_PAUSED:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v8, v0, v11
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    :catch_25
    :try_start_26
    sget-object v11, Lkd1/l;->STRAP_GEN_DEPRECATED:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v9, v0, v11
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    :catch_26
    :try_start_27
    sget-object v11, Lkd1/l;->UNKNOWN:Lkd1/l;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v10, v0, v11
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_27} :catch_27

    :catch_27
    const/16 v11, 0xb

    :try_start_28
    sget-object v12, Lkd1/l;->MEMBERSHIP_MISMATCH_UPGRADE_TO_LIFE_TIER:Lkd1/l;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aput v11, v0, v12
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_28} :catch_28

    :catch_28
    const/16 v12, 0xc

    :try_start_29
    sget-object v13, Lkd1/l;->MEMBERSHIP_MISMATCH_DEVICE_UPGRADE_REQUIRED:Lkd1/l;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aput v12, v0, v13
    :try_end_29
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_29} :catch_29

    :catch_29
    const/16 v13, 0xd

    :try_start_2a
    sget-object v14, Lkd1/l;->CRITICAL_OUTAGE:Lkd1/l;

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aput v13, v0, v14
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_2a} :catch_2a

    :catch_2a
    const/16 v14, 0xe

    :try_start_2b
    sget-object v15, Lkd1/l;->MAJOR_OUTAGE:Lkd1/l;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v14, v0, v15
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_2b} :catch_2b

    :catch_2b
    sput-object v0, Llb1/a5$a;->h:[I

    invoke-static {}, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->values()[Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2c
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->TITLE_ONLY:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v1, v0, v15
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2c .. :try_end_2c} :catch_2c

    :catch_2c
    :try_start_2d
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->TITLE_WITH_PARAGRAPH:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v2, v0, v15
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2d .. :try_end_2d} :catch_2d

    :catch_2d
    :try_start_2e
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->DISCOVER_MORE:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v3, v0, v15
    :try_end_2e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2e .. :try_end_2e} :catch_2e

    :catch_2e
    :try_start_2f
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->VIDEO:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v4, v0, v15
    :try_end_2f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2f .. :try_end_2f} :catch_2f

    :catch_2f
    :try_start_30
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->VIDEO_NO_OVERLAY:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v5, v0, v15
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_30 .. :try_end_30} :catch_30

    :catch_30
    :try_start_31
    sget-object v15, Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;->IMAGE_ONLY:Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v6, v0, v15
    :try_end_31
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_31} :catch_31

    :catch_31
    sput-object v0, Llb1/a5$a;->i:[I

    invoke-static {}, Lcom/whoop/design/models/items/BatteryStatus;->values()[Lcom/whoop/design/models/items/BatteryStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_32
    sget-object v15, Lcom/whoop/design/models/items/BatteryStatus;->CHARGED:Lcom/whoop/design/models/items/BatteryStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v1, v0, v15
    :try_end_32
    .catch Ljava/lang/NoSuchFieldError; {:try_start_32 .. :try_end_32} :catch_32

    :catch_32
    :try_start_33
    sget-object v15, Lcom/whoop/design/models/items/BatteryStatus;->LOW:Lcom/whoop/design/models/items/BatteryStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v2, v0, v15
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_33} :catch_33

    :catch_33
    sput-object v0, Llb1/a5$a;->j:[I

    invoke-static {}, Lcom/whoop/design/models/items/AlarmStatus;->values()[Lcom/whoop/design/models/items/AlarmStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_34
    sget-object v15, Lcom/whoop/design/models/items/AlarmStatus;->OFF:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v1, v0, v15
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_34} :catch_34

    :catch_34
    :try_start_35
    sget-object v15, Lcom/whoop/design/models/items/AlarmStatus;->ON:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v2, v0, v15
    :try_end_35
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_35} :catch_35

    :catch_35
    :try_start_36
    sget-object v15, Lcom/whoop/design/models/items/AlarmStatus;->EXACT_TIME:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v3, v0, v15
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_36 .. :try_end_36} :catch_36

    :catch_36
    :try_start_37
    sget-object v15, Lcom/whoop/design/models/items/AlarmStatus;->GREEN_RECOVERY:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v4, v0, v15
    :try_end_37
    .catch Ljava/lang/NoSuchFieldError; {:try_start_37 .. :try_end_37} :catch_37

    :catch_37
    :try_start_38
    sget-object v15, Lcom/whoop/design/models/items/AlarmStatus;->SLEEP_PERFORMANCE_100:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v5, v0, v15
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_38} :catch_38

    :catch_38
    sput-object v0, Llb1/a5$a;->k:[I

    invoke-static {}, Lcom/whoop/design/models/items/PlanStyle;->values()[Lcom/whoop/design/models/items/PlanStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_39
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->JANUARY0:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v1, v0, v15
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_39} :catch_39

    :catch_39
    :try_start_3a
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->JANUARY1:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v2, v0, v15
    :try_end_3a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3a .. :try_end_3a} :catch_3a

    :catch_3a
    :try_start_3b
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->JANUARY2:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v3, v0, v15
    :try_end_3b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3b .. :try_end_3b} :catch_3b

    :catch_3b
    :try_start_3c
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->JANUARY3:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v4, v0, v15
    :try_end_3c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3c .. :try_end_3c} :catch_3c

    :catch_3c
    :try_start_3d
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->TRAIN:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v5, v0, v15
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_3d} :catch_3d

    :catch_3d
    :try_start_3e
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->MAINTAIN:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v6, v0, v15
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3f
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->RECOVER:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v7, v0, v15
    :try_end_3f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3f .. :try_end_3f} :catch_3f

    :catch_3f
    :try_start_40
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->GET_BY:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v8, v0, v15
    :try_end_40
    .catch Ljava/lang/NoSuchFieldError; {:try_start_40 .. :try_end_40} :catch_40

    :catch_40
    :try_start_41
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->PRIORITIZE_SLEEP:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v9, v0, v15
    :try_end_41
    .catch Ljava/lang/NoSuchFieldError; {:try_start_41 .. :try_end_41} :catch_41

    :catch_41
    :try_start_42
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->REST:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v10, v0, v15
    :try_end_42
    .catch Ljava/lang/NoSuchFieldError; {:try_start_42 .. :try_end_42} :catch_42

    :catch_42
    :try_start_43
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->SLEEP_CONSISTENTLY:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v11, v0, v15
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_43} :catch_43

    :catch_43
    :try_start_44
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->SLEEP_DEEPER:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v12, v0, v15
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_44 .. :try_end_44} :catch_44

    :catch_44
    :try_start_45
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->SLEEP_LONGER:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v13, v0, v15
    :try_end_45
    .catch Ljava/lang/NoSuchFieldError; {:try_start_45 .. :try_end_45} :catch_45

    :catch_45
    :try_start_46
    sget-object v15, Lcom/whoop/design/models/items/PlanStyle;->WITHINGS_BODY_COMP:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v14, v0, v15
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_46 .. :try_end_46} :catch_46

    :catch_46
    const/16 v15, 0xf

    :try_start_47
    sget-object v16, Lcom/whoop/design/models/items/PlanStyle;->GLP1_COMPANION:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aput v15, v0, v16
    :try_end_47
    .catch Ljava/lang/NoSuchFieldError; {:try_start_47 .. :try_end_47} :catch_47

    :catch_47
    const/16 v16, 0x10

    :try_start_48
    sget-object v17, Lcom/whoop/design/models/items/PlanStyle;->TEST:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v16, v0, v17
    :try_end_48
    .catch Ljava/lang/NoSuchFieldError; {:try_start_48 .. :try_end_48} :catch_48

    :catch_48
    const/16 v17, 0x11

    :try_start_49
    sget-object v18, Lcom/whoop/design/models/items/PlanStyle;->CUSTOM:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    aput v17, v0, v18
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_49} :catch_49

    :catch_49
    :try_start_4a
    sget-object v18, Lcom/whoop/design/models/items/PlanStyle;->NONE:Lcom/whoop/design/models/items/PlanStyle;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    const/16 v19, 0x12

    aput v19, v0, v18
    :try_end_4a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4a .. :try_end_4a} :catch_4a

    :catch_4a
    sput-object v0, Llb1/a5$a;->l:[I

    invoke-static {}, Lcom/whoop/design/models/items/HeartRateTileId;->values()[Lcom/whoop/design/models/items/HeartRateTileId;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4b
    sget-object v18, Lcom/whoop/design/models/items/HeartRateTileId;->MAX:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    aput v1, v0, v18
    :try_end_4b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4b .. :try_end_4b} :catch_4b

    :catch_4b
    :try_start_4c
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->HARD:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_4c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4c .. :try_end_4c} :catch_4c

    :catch_4c
    :try_start_4d
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->MODERATE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4d .. :try_end_4d} :catch_4d

    :catch_4d
    :try_start_4e
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->VERY_LIGHT:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_4e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4e .. :try_end_4e} :catch_4e

    :catch_4e
    :try_start_4f
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->LIGHT:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1
    :try_end_4f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4f .. :try_end_4f} :catch_4f

    :catch_4f
    :try_start_50
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->RESTORATIVE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v6, v0, v1
    :try_end_50
    .catch Ljava/lang/NoSuchFieldError; {:try_start_50 .. :try_end_50} :catch_50

    :catch_50
    :try_start_51
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->INHALE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v7, v0, v1
    :try_end_51
    .catch Ljava/lang/NoSuchFieldError; {:try_start_51 .. :try_end_51} :catch_51

    :catch_51
    :try_start_52
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->EXHALE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v8, v0, v1
    :try_end_52
    .catch Ljava/lang/NoSuchFieldError; {:try_start_52 .. :try_end_52} :catch_52

    :catch_52
    :try_start_53
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->HOLD:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v9, v0, v1
    :try_end_53
    .catch Ljava/lang/NoSuchFieldError; {:try_start_53 .. :try_end_53} :catch_53

    :catch_53
    :try_start_54
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->NONE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v10, v0, v1
    :try_end_54
    .catch Ljava/lang/NoSuchFieldError; {:try_start_54 .. :try_end_54} :catch_54

    :catch_54
    :try_start_55
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->LIGHT_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v11, v0, v1
    :try_end_55
    .catch Ljava/lang/NoSuchFieldError; {:try_start_55 .. :try_end_55} :catch_55

    :catch_55
    :try_start_56
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->REM_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v12, v0, v1
    :try_end_56
    .catch Ljava/lang/NoSuchFieldError; {:try_start_56 .. :try_end_56} :catch_56

    :catch_56
    :try_start_57
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->SWS_SLEEP:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v13, v0, v1
    :try_end_57
    .catch Ljava/lang/NoSuchFieldError; {:try_start_57 .. :try_end_57} :catch_57

    :catch_57
    :try_start_58
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->AWAKE:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v14, v0, v1
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_58 .. :try_end_58} :catch_58

    :catch_58
    :try_start_59
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->HIGH_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v15, v0, v1
    :try_end_59
    .catch Ljava/lang/NoSuchFieldError; {:try_start_59 .. :try_end_59} :catch_59

    :catch_59
    :try_start_5a
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->LOW_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v16, v0, v1
    :try_end_5a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5a .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5b
    sget-object v1, Lcom/whoop/design/models/items/HeartRateTileId;->MEDIUM_STRESS:Lcom/whoop/design/models/items/HeartRateTileId;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v17, v0, v1
    :try_end_5b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5b .. :try_end_5b} :catch_5b

    :catch_5b
    sput-object v0, Llb1/a5$a;->m:[I

    return-void
.end method
