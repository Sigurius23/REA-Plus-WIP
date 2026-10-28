.class public final enum Lmp0/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmp0/o;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lmp0/o;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ALARM_FLOW_ON_BACK_PRESS",
        "SAVING_FLOW_ON_BACK_PRESS",
        "COLLAPSED_FLOW_ON_BACK_PRESS",
        "SYSTEM_BACK_PRESS",
        "ALARM_SET_REMINDER_ON_BACK_PRESS",
        "sleep-coach_release"
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

.field private static final synthetic $VALUES:[Lmp0/o;

.field public static final enum ALARM_FLOW_ON_BACK_PRESS:Lmp0/o;

.field public static final enum ALARM_SET_REMINDER_ON_BACK_PRESS:Lmp0/o;

.field public static final enum COLLAPSED_FLOW_ON_BACK_PRESS:Lmp0/o;

.field public static final enum SAVING_FLOW_ON_BACK_PRESS:Lmp0/o;

.field public static final enum SYSTEM_BACK_PRESS:Lmp0/o;


# direct methods
.method private static final synthetic $values()[Lmp0/o;
    .locals 5

    sget-object v0, Lmp0/o;->ALARM_FLOW_ON_BACK_PRESS:Lmp0/o;

    sget-object v1, Lmp0/o;->SAVING_FLOW_ON_BACK_PRESS:Lmp0/o;

    sget-object v2, Lmp0/o;->COLLAPSED_FLOW_ON_BACK_PRESS:Lmp0/o;

    sget-object v3, Lmp0/o;->SYSTEM_BACK_PRESS:Lmp0/o;

    sget-object v4, Lmp0/o;->ALARM_SET_REMINDER_ON_BACK_PRESS:Lmp0/o;

    filled-new-array {v0, v1, v2, v3, v4}, [Lmp0/o;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmp0/o;

    const-string v1, "ALARM_FLOW_ON_BACK_PRESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmp0/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/o;->ALARM_FLOW_ON_BACK_PRESS:Lmp0/o;

    new-instance v0, Lmp0/o;

    const-string v1, "SAVING_FLOW_ON_BACK_PRESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmp0/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/o;->SAVING_FLOW_ON_BACK_PRESS:Lmp0/o;

    new-instance v0, Lmp0/o;

    const-string v1, "COLLAPSED_FLOW_ON_BACK_PRESS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmp0/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/o;->COLLAPSED_FLOW_ON_BACK_PRESS:Lmp0/o;

    new-instance v0, Lmp0/o;

    const-string v1, "SYSTEM_BACK_PRESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmp0/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/o;->SYSTEM_BACK_PRESS:Lmp0/o;

    new-instance v0, Lmp0/o;

    const-string v1, "ALARM_SET_REMINDER_ON_BACK_PRESS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmp0/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmp0/o;->ALARM_SET_REMINDER_ON_BACK_PRESS:Lmp0/o;

    invoke-static {}, Lmp0/o;->$values()[Lmp0/o;

    move-result-object v0

    sput-object v0, Lmp0/o;->$VALUES:[Lmp0/o;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmp0/o;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lmp0/o;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmp0/o;
    .locals 1

    const-class v0, Lmp0/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmp0/o;

    return-object p0
.end method

.method public static values()[Lmp0/o;
    .locals 1

    sget-object v0, Lmp0/o;->$VALUES:[Lmp0/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmp0/o;

    return-object v0
.end method
