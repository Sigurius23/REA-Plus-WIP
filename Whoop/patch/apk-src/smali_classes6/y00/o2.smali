.class public final enum Ly00/o2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/o2;

.field public static final synthetic F:[Ly00/o2;

.field public static final enum x:Ly00/o2;

.field public static final enum y:Ly00/o2;

.field public static final enum z:Ly00/o2;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly00/o2;

    const/4 v1, 0x0

    const-string v2, "not_supported_in_elements_session"

    const-string v3, "NotSupportedInElementsSession"

    invoke-direct {v0, v3, v1, v2}, Ly00/o2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/o2;->x:Ly00/o2;

    new-instance v1, Ly00/o2;

    const/4 v2, 0x1

    const-string v3, "link_configuration"

    const-string v4, "LinkConfiguration"

    invoke-direct {v1, v4, v2, v3}, Ly00/o2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/o2;->y:Ly00/o2;

    new-instance v2, Ly00/o2;

    const/4 v3, 0x2

    const-string v4, "card_brand_filtering"

    const-string v5, "CardBrandFiltering"

    invoke-direct {v2, v5, v3, v4}, Ly00/o2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/o2;->z:Ly00/o2;

    new-instance v3, Ly00/o2;

    const/4 v4, 0x3

    const-string v5, "billing_details_collection"

    const-string v6, "BillingDetailsCollection"

    invoke-direct {v3, v6, v4, v5}, Ly00/o2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/o2;->E:Ly00/o2;

    filled-new-array {v0, v1, v2, v3}, [Ly00/o2;

    move-result-object v0

    sput-object v0, Ly00/o2;->F:[Ly00/o2;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/o2;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/o2;
    .locals 1

    const-class v0, Ly00/o2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/o2;

    return-object p0
.end method

.method public static values()[Ly00/o2;
    .locals 1

    sget-object v0, Ly00/o2;->F:[Ly00/o2;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/o2;

    return-object v0
.end method
