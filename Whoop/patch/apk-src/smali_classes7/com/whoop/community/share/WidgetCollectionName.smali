.class public final enum Lcom/whoop/community/share/WidgetCollectionName;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/community/share/WidgetCollectionName;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/community/share/WidgetCollectionName;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OVERVIEW",
        "OVERVIEW_TREND",
        "STRAIN",
        "STRAIN_TREND",
        "SLEEP",
        "SLEEP_TREND",
        "RECOVERY",
        "RECOVERY_TREND",
        "core_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum OVERVIEW:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum OVERVIEW_TREND:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum RECOVERY:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum RECOVERY_TREND:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum SLEEP:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum SLEEP_TREND:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum STRAIN:Lcom/whoop/community/share/WidgetCollectionName;

.field public static final enum STRAIN_TREND:Lcom/whoop/community/share/WidgetCollectionName;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/community/share/WidgetCollectionName;
    .locals 8

    sget-object v0, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v1, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v2, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v3, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v4, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v5, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v6, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY:Lcom/whoop/community/share/WidgetCollectionName;

    sget-object v7, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    filled-new-array/range {v0 .. v7}, [Lcom/whoop/community/share/WidgetCollectionName;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "OVERVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "OVERVIEW_TREND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "STRAIN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "STRAIN_TREND"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "SLEEP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "SLEEP_TREND"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "RECOVERY"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY:Lcom/whoop/community/share/WidgetCollectionName;

    new-instance v0, Lcom/whoop/community/share/WidgetCollectionName;

    const-string v1, "RECOVERY_TREND"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/community/share/WidgetCollectionName;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    invoke-static {}, Lcom/whoop/community/share/WidgetCollectionName;->$values()[Lcom/whoop/community/share/WidgetCollectionName;

    move-result-object v0

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->$VALUES:[Lcom/whoop/community/share/WidgetCollectionName;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/community/share/WidgetCollectionName;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/community/share/WidgetCollectionName;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/community/share/WidgetCollectionName;
    .locals 1

    const-class v0, Lcom/whoop/community/share/WidgetCollectionName;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/community/share/WidgetCollectionName;

    return-object p0
.end method

.method public static values()[Lcom/whoop/community/share/WidgetCollectionName;
    .locals 1

    sget-object v0, Lcom/whoop/community/share/WidgetCollectionName;->$VALUES:[Lcom/whoop/community/share/WidgetCollectionName;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/community/share/WidgetCollectionName;

    return-object v0
.end method
