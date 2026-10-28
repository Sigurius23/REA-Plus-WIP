.class public final synthetic Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModelKt$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModelKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
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
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->values()[Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEUTRAL:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->NEGATIVE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->POSITIVE_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->CONCERN_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;->ALERT_RANGE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModelKt$WhenMappings;->$EnumSwitchMapping$0:[I

    return-void
.end method
