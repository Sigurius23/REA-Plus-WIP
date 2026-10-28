.class public final enum Lhy0/o1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhy0/o1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lhy0/o1;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NONE",
        "BEHAVIOR_DETAILS",
        "ONBOARDING",
        "JOURNAL_TRENDS",
        "JOURNAL_ONBOARDING",
        "JOURNAL_ACTION",
        "JOURNAL",
        "HOLIDAY",
        "SYMPTOMS",
        "PERIOD",
        "OVULATION",
        "COACH_RECOMMENDED",
        "BADGE_SMALL_SECONDARY_ACCENT",
        "BADGE_SMALL_PRIMARY_ACCENT",
        "BADGE_SMALL_ACCENT",
        "BADGE_SMALL_SECONDARY_NEUTRAL",
        "BADGE_SMALL_SECONDARY_NEGATIVE",
        "CONTEXT_CARD",
        "WEARABLE_UPSELL",
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

.field private static final synthetic $VALUES:[Lhy0/o1;

.field public static final enum BADGE_SMALL_ACCENT:Lhy0/o1;

.field public static final enum BADGE_SMALL_PRIMARY_ACCENT:Lhy0/o1;

.field public static final enum BADGE_SMALL_SECONDARY_ACCENT:Lhy0/o1;

.field public static final enum BADGE_SMALL_SECONDARY_NEGATIVE:Lhy0/o1;

.field public static final enum BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

.field public static final enum BEHAVIOR_DETAILS:Lhy0/o1;

.field public static final enum COACH_RECOMMENDED:Lhy0/o1;

.field public static final enum CONTEXT_CARD:Lhy0/o1;

.field public static final enum HOLIDAY:Lhy0/o1;

.field public static final enum JOURNAL:Lhy0/o1;

.field public static final enum JOURNAL_ACTION:Lhy0/o1;

.field public static final enum JOURNAL_ONBOARDING:Lhy0/o1;

.field public static final enum JOURNAL_TRENDS:Lhy0/o1;

.field public static final enum NONE:Lhy0/o1;

.field public static final enum ONBOARDING:Lhy0/o1;

.field public static final enum OVULATION:Lhy0/o1;

.field public static final enum PERIOD:Lhy0/o1;

.field public static final enum SYMPTOMS:Lhy0/o1;

.field public static final enum WEARABLE_UPSELL:Lhy0/o1;


# direct methods
.method private static final synthetic $values()[Lhy0/o1;
    .locals 20

    sget-object v1, Lhy0/o1;->NONE:Lhy0/o1;

    sget-object v2, Lhy0/o1;->BEHAVIOR_DETAILS:Lhy0/o1;

    sget-object v3, Lhy0/o1;->ONBOARDING:Lhy0/o1;

    sget-object v4, Lhy0/o1;->JOURNAL_TRENDS:Lhy0/o1;

    sget-object v5, Lhy0/o1;->JOURNAL_ONBOARDING:Lhy0/o1;

    sget-object v6, Lhy0/o1;->JOURNAL_ACTION:Lhy0/o1;

    sget-object v7, Lhy0/o1;->JOURNAL:Lhy0/o1;

    sget-object v8, Lhy0/o1;->HOLIDAY:Lhy0/o1;

    sget-object v9, Lhy0/o1;->SYMPTOMS:Lhy0/o1;

    sget-object v10, Lhy0/o1;->PERIOD:Lhy0/o1;

    sget-object v11, Lhy0/o1;->OVULATION:Lhy0/o1;

    sget-object v12, Lhy0/o1;->COACH_RECOMMENDED:Lhy0/o1;

    sget-object v13, Lhy0/o1;->BADGE_SMALL_SECONDARY_ACCENT:Lhy0/o1;

    sget-object v14, Lhy0/o1;->BADGE_SMALL_PRIMARY_ACCENT:Lhy0/o1;

    sget-object v15, Lhy0/o1;->BADGE_SMALL_ACCENT:Lhy0/o1;

    sget-object v16, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    sget-object v17, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEGATIVE:Lhy0/o1;

    sget-object v18, Lhy0/o1;->CONTEXT_CARD:Lhy0/o1;

    sget-object v19, Lhy0/o1;->WEARABLE_UPSELL:Lhy0/o1;

    filled-new-array/range {v1 .. v19}, [Lhy0/o1;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhy0/o1;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->NONE:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BEHAVIOR_DETAILS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BEHAVIOR_DETAILS:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "ONBOARDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->ONBOARDING:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "JOURNAL_TRENDS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->JOURNAL_TRENDS:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "JOURNAL_ONBOARDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->JOURNAL_ONBOARDING:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "JOURNAL_ACTION"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->JOURNAL_ACTION:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "JOURNAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->JOURNAL:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "HOLIDAY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->HOLIDAY:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "SYMPTOMS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->SYMPTOMS:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "PERIOD"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->PERIOD:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "OVULATION"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->OVULATION:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "COACH_RECOMMENDED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->COACH_RECOMMENDED:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BADGE_SMALL_SECONDARY_ACCENT"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BADGE_SMALL_SECONDARY_ACCENT:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BADGE_SMALL_PRIMARY_ACCENT"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BADGE_SMALL_PRIMARY_ACCENT:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BADGE_SMALL_ACCENT"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BADGE_SMALL_ACCENT:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BADGE_SMALL_SECONDARY_NEUTRAL"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEUTRAL:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "BADGE_SMALL_SECONDARY_NEGATIVE"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->BADGE_SMALL_SECONDARY_NEGATIVE:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "CONTEXT_CARD"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->CONTEXT_CARD:Lhy0/o1;

    new-instance v0, Lhy0/o1;

    const-string v1, "WEARABLE_UPSELL"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lhy0/o1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/o1;->WEARABLE_UPSELL:Lhy0/o1;

    invoke-static {}, Lhy0/o1;->$values()[Lhy0/o1;

    move-result-object v0

    sput-object v0, Lhy0/o1;->$VALUES:[Lhy0/o1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhy0/o1;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lhy0/o1;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhy0/o1;
    .locals 1

    const-class v0, Lhy0/o1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhy0/o1;

    return-object p0
.end method

.method public static values()[Lhy0/o1;
    .locals 1

    sget-object v0, Lhy0/o1;->$VALUES:[Lhy0/o1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhy0/o1;

    return-object v0
.end method
