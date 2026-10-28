.class public final enum Lcom/mapbox/common/SessionSKUIdentifier;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mapbox/common/SessionSKUIdentifier;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV2_SES_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV2_SES_TRIP:Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV3_SES_CORE_AGTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV3_SES_CORE_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV3_SES_UX_AGTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

.field public static final enum NAV3_SES_UX_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;


# instance fields
.field private str:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v1, 0x0

    const-string v2, "Nav2SesTrip"

    const-string v3, "NAV2_SES_TRIP"

    invoke-direct {v0, v3, v1, v2}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mapbox/common/SessionSKUIdentifier;->NAV2_SES_TRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    new-instance v1, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v2, 0x1

    const-string v3, "Nav2SesFDTrip"

    const-string v4, "NAV2_SES_FDTRIP"

    invoke-direct {v1, v4, v2, v3}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/mapbox/common/SessionSKUIdentifier;->NAV2_SES_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    new-instance v2, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v3, 0x2

    const-string v4, "Nav3SesUxAGTrip"

    const-string v5, "NAV3_SES_UX_AGTRIP"

    invoke-direct {v2, v5, v3, v4}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/mapbox/common/SessionSKUIdentifier;->NAV3_SES_UX_AGTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    new-instance v3, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v4, 0x3

    const-string v5, "Nav3SesUxFDTrip"

    const-string v6, "NAV3_SES_UX_FDTRIP"

    invoke-direct {v3, v6, v4, v5}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/mapbox/common/SessionSKUIdentifier;->NAV3_SES_UX_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    new-instance v4, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v5, 0x4

    const-string v6, "Nav3SesCoreAGTrip"

    const-string v7, "NAV3_SES_CORE_AGTRIP"

    invoke-direct {v4, v7, v5, v6}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/mapbox/common/SessionSKUIdentifier;->NAV3_SES_CORE_AGTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    new-instance v5, Lcom/mapbox/common/SessionSKUIdentifier;

    const/4 v6, 0x5

    const-string v7, "Nav3SesCoreFDTrip"

    const-string v8, "NAV3_SES_CORE_FDTRIP"

    invoke-direct {v5, v8, v6, v7}, Lcom/mapbox/common/SessionSKUIdentifier;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/mapbox/common/SessionSKUIdentifier;->NAV3_SES_CORE_FDTRIP:Lcom/mapbox/common/SessionSKUIdentifier;

    filled-new-array/range {v0 .. v5}, [Lcom/mapbox/common/SessionSKUIdentifier;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/SessionSKUIdentifier;->$VALUES:[Lcom/mapbox/common/SessionSKUIdentifier;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/mapbox/common/SessionSKUIdentifier;->str:Ljava/lang/String;

    return-void
.end method

.method private getValue()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mapbox/common/SessionSKUIdentifier;
    .locals 1

    const-class v0, Lcom/mapbox/common/SessionSKUIdentifier;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/SessionSKUIdentifier;

    return-object p0
.end method

.method public static values()[Lcom/mapbox/common/SessionSKUIdentifier;
    .locals 1

    sget-object v0, Lcom/mapbox/common/SessionSKUIdentifier;->$VALUES:[Lcom/mapbox/common/SessionSKUIdentifier;

    invoke-virtual {v0}, [Lcom/mapbox/common/SessionSKUIdentifier;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/common/SessionSKUIdentifier;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/SessionSKUIdentifier;->str:Ljava/lang/String;

    return-object v0
.end method
