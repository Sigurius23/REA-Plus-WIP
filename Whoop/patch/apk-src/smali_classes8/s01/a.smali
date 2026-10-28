.class public final enum Ls01/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls01/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0018\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ls01/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ACTIVITY_RECOMMENDATION",
        "ACTIVITY_RECOMMENDATION_REVIEW",
        "CHAT_WITH_AGENT",
        "FIRMWARE_UPDATE_ISSUE",
        "HELP_CENTER",
        "HISTORICAL_TREND",
        "HOME",
        "OVERVIEW",
        "PRESET_QUESTION",
        "RECOVERY",
        "RECOVERY_ACTIVITY",
        "SLEEP",
        "SLEEP_ACTIVITY",
        "SOBER_OCTOBER_CHALLENGE",
        "STRAIN",
        "STRAIN_ACTIVITY",
        "STRESS",
        "WAKE_UP_REPORT",
        "WEIGHTLIFTING_ACTIVITY",
        "WEIGHTLIFTING_LIBRARY",
        "WIND_DOWN_REPORT",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ls01/a;

.field public static final enum ACTIVITY_RECOMMENDATION:Ls01/a;

.field public static final enum ACTIVITY_RECOMMENDATION_REVIEW:Ls01/a;

.field public static final enum CHAT_WITH_AGENT:Ls01/a;

.field public static final enum FIRMWARE_UPDATE_ISSUE:Ls01/a;

.field public static final enum HELP_CENTER:Ls01/a;

.field public static final enum HISTORICAL_TREND:Ls01/a;

.field public static final enum HOME:Ls01/a;

.field public static final enum OVERVIEW:Ls01/a;

.field public static final enum PRESET_QUESTION:Ls01/a;

.field public static final enum RECOVERY:Ls01/a;

.field public static final enum RECOVERY_ACTIVITY:Ls01/a;

.field public static final enum SLEEP:Ls01/a;

.field public static final enum SLEEP_ACTIVITY:Ls01/a;

.field public static final enum SOBER_OCTOBER_CHALLENGE:Ls01/a;

.field public static final enum STRAIN:Ls01/a;

.field public static final enum STRAIN_ACTIVITY:Ls01/a;

.field public static final enum STRESS:Ls01/a;

.field public static final enum WAKE_UP_REPORT:Ls01/a;

.field public static final enum WEIGHTLIFTING_ACTIVITY:Ls01/a;

.field public static final enum WEIGHTLIFTING_LIBRARY:Ls01/a;

.field public static final enum WIND_DOWN_REPORT:Ls01/a;


# direct methods
.method private static final synthetic $values()[Ls01/a;
    .locals 22

    sget-object v1, Ls01/a;->ACTIVITY_RECOMMENDATION:Ls01/a;

    sget-object v2, Ls01/a;->ACTIVITY_RECOMMENDATION_REVIEW:Ls01/a;

    sget-object v3, Ls01/a;->CHAT_WITH_AGENT:Ls01/a;

    sget-object v4, Ls01/a;->FIRMWARE_UPDATE_ISSUE:Ls01/a;

    sget-object v5, Ls01/a;->HELP_CENTER:Ls01/a;

    sget-object v6, Ls01/a;->HISTORICAL_TREND:Ls01/a;

    sget-object v7, Ls01/a;->HOME:Ls01/a;

    sget-object v8, Ls01/a;->OVERVIEW:Ls01/a;

    sget-object v9, Ls01/a;->PRESET_QUESTION:Ls01/a;

    sget-object v10, Ls01/a;->RECOVERY:Ls01/a;

    sget-object v11, Ls01/a;->RECOVERY_ACTIVITY:Ls01/a;

    sget-object v12, Ls01/a;->SLEEP:Ls01/a;

    sget-object v13, Ls01/a;->SLEEP_ACTIVITY:Ls01/a;

    sget-object v14, Ls01/a;->SOBER_OCTOBER_CHALLENGE:Ls01/a;

    sget-object v15, Ls01/a;->STRAIN:Ls01/a;

    sget-object v16, Ls01/a;->STRAIN_ACTIVITY:Ls01/a;

    sget-object v17, Ls01/a;->STRESS:Ls01/a;

    sget-object v18, Ls01/a;->WAKE_UP_REPORT:Ls01/a;

    sget-object v19, Ls01/a;->WEIGHTLIFTING_ACTIVITY:Ls01/a;

    sget-object v20, Ls01/a;->WEIGHTLIFTING_LIBRARY:Ls01/a;

    sget-object v21, Ls01/a;->WIND_DOWN_REPORT:Ls01/a;

    filled-new-array/range {v1 .. v21}, [Ls01/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls01/a;

    const-string v1, "ACTIVITY_RECOMMENDATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->ACTIVITY_RECOMMENDATION:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "ACTIVITY_RECOMMENDATION_REVIEW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->ACTIVITY_RECOMMENDATION_REVIEW:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "CHAT_WITH_AGENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->CHAT_WITH_AGENT:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "FIRMWARE_UPDATE_ISSUE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->FIRMWARE_UPDATE_ISSUE:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "HELP_CENTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->HELP_CENTER:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "HISTORICAL_TREND"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->HISTORICAL_TREND:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "HOME"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->HOME:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "OVERVIEW"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->OVERVIEW:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "PRESET_QUESTION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->PRESET_QUESTION:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "RECOVERY"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->RECOVERY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "RECOVERY_ACTIVITY"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->RECOVERY_ACTIVITY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "SLEEP"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->SLEEP:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "SLEEP_ACTIVITY"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->SLEEP_ACTIVITY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "SOBER_OCTOBER_CHALLENGE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->SOBER_OCTOBER_CHALLENGE:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "STRAIN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->STRAIN:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "STRAIN_ACTIVITY"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->STRAIN_ACTIVITY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "STRESS"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->STRESS:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "WAKE_UP_REPORT"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->WAKE_UP_REPORT:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "WEIGHTLIFTING_ACTIVITY"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->WEIGHTLIFTING_ACTIVITY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "WEIGHTLIFTING_LIBRARY"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->WEIGHTLIFTING_LIBRARY:Ls01/a;

    new-instance v0, Ls01/a;

    const-string v1, "WIND_DOWN_REPORT"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Ls01/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls01/a;->WIND_DOWN_REPORT:Ls01/a;

    invoke-static {}, Ls01/a;->$values()[Ls01/a;

    move-result-object v0

    sput-object v0, Ls01/a;->$VALUES:[Ls01/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ls01/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ls01/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls01/a;
    .locals 1

    const-class v0, Ls01/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls01/a;

    return-object p0
.end method

.method public static values()[Ls01/a;
    .locals 1

    sget-object v0, Ls01/a;->$VALUES:[Ls01/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls01/a;

    return-object v0
.end method
