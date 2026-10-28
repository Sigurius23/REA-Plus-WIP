.class public final enum Ly71/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly71/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ly71/q;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ONBOARDING",
        "OUTLINED",
        "RAF_MENU_ITEM",
        "REFER_A_FRIEND",
        "ALERT",
        "DOWNLOAD_CARE_PLAN",
        "SHOP",
        "SHOP_PROMO",
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

.field private static final synthetic $VALUES:[Ly71/q;

.field public static final enum ALERT:Ly71/q;

.field public static final enum DOWNLOAD_CARE_PLAN:Ly71/q;

.field public static final enum ONBOARDING:Ly71/q;

.field public static final enum OUTLINED:Ly71/q;

.field public static final enum RAF_MENU_ITEM:Ly71/q;

.field public static final enum REFER_A_FRIEND:Ly71/q;

.field public static final enum SHOP:Ly71/q;

.field public static final enum SHOP_PROMO:Ly71/q;


# direct methods
.method private static final synthetic $values()[Ly71/q;
    .locals 8

    sget-object v0, Ly71/q;->ONBOARDING:Ly71/q;

    sget-object v1, Ly71/q;->OUTLINED:Ly71/q;

    sget-object v2, Ly71/q;->RAF_MENU_ITEM:Ly71/q;

    sget-object v3, Ly71/q;->REFER_A_FRIEND:Ly71/q;

    sget-object v4, Ly71/q;->ALERT:Ly71/q;

    sget-object v5, Ly71/q;->DOWNLOAD_CARE_PLAN:Ly71/q;

    sget-object v6, Ly71/q;->SHOP:Ly71/q;

    sget-object v7, Ly71/q;->SHOP_PROMO:Ly71/q;

    filled-new-array/range {v0 .. v7}, [Ly71/q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly71/q;

    const-string v1, "ONBOARDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->ONBOARDING:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "OUTLINED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->OUTLINED:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "RAF_MENU_ITEM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->RAF_MENU_ITEM:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "REFER_A_FRIEND"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->REFER_A_FRIEND:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "ALERT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->ALERT:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "DOWNLOAD_CARE_PLAN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->DOWNLOAD_CARE_PLAN:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "SHOP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->SHOP:Ly71/q;

    new-instance v0, Ly71/q;

    const-string v1, "SHOP_PROMO"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ly71/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly71/q;->SHOP_PROMO:Ly71/q;

    invoke-static {}, Ly71/q;->$values()[Ly71/q;

    move-result-object v0

    sput-object v0, Ly71/q;->$VALUES:[Ly71/q;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ly71/q;->$ENTRIES:Lt83/a;

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

    sget-object v0, Ly71/q;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly71/q;
    .locals 1

    const-class v0, Ly71/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly71/q;

    return-object p0
.end method

.method public static values()[Ly71/q;
    .locals 1

    sget-object v0, Ly71/q;->$VALUES:[Ly71/q;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly71/q;

    return-object v0
.end method
