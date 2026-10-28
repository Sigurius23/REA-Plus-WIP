.class public final enum Lcom/mapbox/maps/RequestErrorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mapbox/maps/RequestErrorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mapbox/maps/RequestErrorType;

.field public static final enum CONNECTION:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum IN_OFFLINE_MODE:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum NOT_FOUND:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum OTHER:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum RATE_LIMIT:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum SERVER:Lcom/mapbox/maps/RequestErrorType;

.field public static final enum SUCCESS:Lcom/mapbox/maps/RequestErrorType;


# instance fields
.field private str:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/mapbox/maps/RequestErrorType;

    const/4 v1, 0x0

    const-string v2, "Success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mapbox/maps/RequestErrorType;->SUCCESS:Lcom/mapbox/maps/RequestErrorType;

    new-instance v1, Lcom/mapbox/maps/RequestErrorType;

    const/4 v2, 0x1

    const-string v3, "NotFound"

    const-string v4, "NOT_FOUND"

    invoke-direct {v1, v4, v2, v3}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/mapbox/maps/RequestErrorType;->NOT_FOUND:Lcom/mapbox/maps/RequestErrorType;

    new-instance v2, Lcom/mapbox/maps/RequestErrorType;

    const/4 v3, 0x2

    const-string v4, "Server"

    const-string v5, "SERVER"

    invoke-direct {v2, v5, v3, v4}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/mapbox/maps/RequestErrorType;->SERVER:Lcom/mapbox/maps/RequestErrorType;

    new-instance v3, Lcom/mapbox/maps/RequestErrorType;

    const/4 v4, 0x3

    const-string v5, "Connection"

    const-string v6, "CONNECTION"

    invoke-direct {v3, v6, v4, v5}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/mapbox/maps/RequestErrorType;->CONNECTION:Lcom/mapbox/maps/RequestErrorType;

    new-instance v4, Lcom/mapbox/maps/RequestErrorType;

    const/4 v5, 0x4

    const-string v6, "RateLimit"

    const-string v7, "RATE_LIMIT"

    invoke-direct {v4, v7, v5, v6}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/mapbox/maps/RequestErrorType;->RATE_LIMIT:Lcom/mapbox/maps/RequestErrorType;

    new-instance v5, Lcom/mapbox/maps/RequestErrorType;

    const/4 v6, 0x5

    const-string v7, "InOfflineMode"

    const-string v8, "IN_OFFLINE_MODE"

    invoke-direct {v5, v8, v6, v7}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/mapbox/maps/RequestErrorType;->IN_OFFLINE_MODE:Lcom/mapbox/maps/RequestErrorType;

    new-instance v6, Lcom/mapbox/maps/RequestErrorType;

    const/4 v7, 0x6

    const-string v8, "Other"

    const-string v9, "OTHER"

    invoke-direct {v6, v9, v7, v8}, Lcom/mapbox/maps/RequestErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/mapbox/maps/RequestErrorType;->OTHER:Lcom/mapbox/maps/RequestErrorType;

    filled-new-array/range {v0 .. v6}, [Lcom/mapbox/maps/RequestErrorType;

    move-result-object v0

    sput-object v0, Lcom/mapbox/maps/RequestErrorType;->$VALUES:[Lcom/mapbox/maps/RequestErrorType;

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

    iput-object p3, p0, Lcom/mapbox/maps/RequestErrorType;->str:Ljava/lang/String;

    return-void
.end method

.method private getValue()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mapbox/maps/RequestErrorType;
    .locals 1

    const-class v0, Lcom/mapbox/maps/RequestErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mapbox/maps/RequestErrorType;

    return-object p0
.end method

.method public static values()[Lcom/mapbox/maps/RequestErrorType;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/RequestErrorType;->$VALUES:[Lcom/mapbox/maps/RequestErrorType;

    invoke-virtual {v0}, [Lcom/mapbox/maps/RequestErrorType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/maps/RequestErrorType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/RequestErrorType;->str:Ljava/lang/String;

    return-object v0
.end method
