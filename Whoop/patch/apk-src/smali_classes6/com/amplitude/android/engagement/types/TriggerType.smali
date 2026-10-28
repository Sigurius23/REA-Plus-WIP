.class public final enum Lcom/amplitude/android/engagement/types/TriggerType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/TriggerType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0010\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/TriggerType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "lj/t0",
        "ANALYTICS_EVENT",
        "ELEMENT_APPEARED",
        "ELEMENT_CLICKED",
        "AFTER_TIME",
        "DIRECT",
        "IMMEDIATELY",
        "ACTIVE",
        "SMART_DELAY",
        "RAGE_CLICK",
        "USER_CONFUSION",
        "NONE",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/TriggerType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum ACTIVE:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "active"
    .end annotation
.end field

.field public static final enum AFTER_TIME:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "after_time"
    .end annotation
.end field

.field public static final enum ANALYTICS_EVENT:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "analytics_event"
    .end annotation
.end field

.field public static final Companion:Llj/t0;

.field public static final enum DIRECT:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "direct"
    .end annotation
.end field

.field public static final enum ELEMENT_APPEARED:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "element_appeared"
    .end annotation
.end field

.field public static final enum ELEMENT_CLICKED:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "element_clicked"
    .end annotation
.end field

.field public static final enum IMMEDIATELY:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "immediately"
    .end annotation
.end field

.field public static final enum NONE:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "none"
    .end annotation
.end field

.field public static final enum RAGE_CLICK:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "rage_click"
    .end annotation
.end field

.field public static final enum SMART_DELAY:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "smart_delay"
    .end annotation
.end field

.field public static final enum USER_CONFUSION:Lcom/amplitude/android/engagement/types/TriggerType;
    .annotation runtime Lwc3/h;
        value = "user_confusion"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/TriggerType;
    .locals 11

    sget-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->ANALYTICS_EVENT:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v1, Lcom/amplitude/android/engagement/types/TriggerType;->ELEMENT_APPEARED:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v2, Lcom/amplitude/android/engagement/types/TriggerType;->ELEMENT_CLICKED:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v3, Lcom/amplitude/android/engagement/types/TriggerType;->AFTER_TIME:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v4, Lcom/amplitude/android/engagement/types/TriggerType;->DIRECT:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v5, Lcom/amplitude/android/engagement/types/TriggerType;->IMMEDIATELY:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v6, Lcom/amplitude/android/engagement/types/TriggerType;->ACTIVE:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v7, Lcom/amplitude/android/engagement/types/TriggerType;->SMART_DELAY:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v8, Lcom/amplitude/android/engagement/types/TriggerType;->RAGE_CLICK:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v9, Lcom/amplitude/android/engagement/types/TriggerType;->USER_CONFUSION:Lcom/amplitude/android/engagement/types/TriggerType;

    sget-object v10, Lcom/amplitude/android/engagement/types/TriggerType;->NONE:Lcom/amplitude/android/engagement/types/TriggerType;

    filled-new-array/range {v0 .. v10}, [Lcom/amplitude/android/engagement/types/TriggerType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "ANALYTICS_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->ANALYTICS_EVENT:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "ELEMENT_APPEARED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->ELEMENT_APPEARED:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "ELEMENT_CLICKED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->ELEMENT_CLICKED:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "AFTER_TIME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->AFTER_TIME:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "DIRECT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->DIRECT:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "IMMEDIATELY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->IMMEDIATELY:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "ACTIVE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->ACTIVE:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "SMART_DELAY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->SMART_DELAY:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "RAGE_CLICK"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->RAGE_CLICK:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "USER_CONFUSION"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->USER_CONFUSION:Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TriggerType;

    const-string v1, "NONE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TriggerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->NONE:Lcom/amplitude/android/engagement/types/TriggerType;

    invoke-static {}, Lcom/amplitude/android/engagement/types/TriggerType;->$values()[Lcom/amplitude/android/engagement/types/TriggerType;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->$VALUES:[Lcom/amplitude/android/engagement/types/TriggerType;

    new-instance v0, Llj/t0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->Companion:Llj/t0;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->c0:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->$cachedSerializer$delegate:Ll83/h;

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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/TriggerType;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/TriggerType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/TriggerType;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/TriggerType;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/TriggerType;->$VALUES:[Lcom/amplitude/android/engagement/types/TriggerType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/TriggerType;

    return-object v0
.end method
