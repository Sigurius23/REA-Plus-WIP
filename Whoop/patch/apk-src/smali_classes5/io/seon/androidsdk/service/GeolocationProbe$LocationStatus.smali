.class final enum Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum DISABLED:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum FAIL:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum NO_PERMISSION:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum NO_PROVIDER:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum TIMEOUT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

.field public static final enum UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;


# instance fields
.field private final statusCode:I


# direct methods
.method private static synthetic $values()[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;
    .locals 8

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v1, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v2, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->FAIL:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v3, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->TIMEOUT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v4, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PERMISSION:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v5, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PROVIDER:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v6, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->DISABLED:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    sget-object v7, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    filled-new-array/range {v0 .. v7}, [Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    move-result-object v0

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const/4 v1, -0x1

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->UNKNOWN:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->SUCCESS:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "FAIL"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->FAIL:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "TIMEOUT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->TIMEOUT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "NO_PERMISSION"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PERMISSION:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "NO_PROVIDER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_PROVIDER:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "DISABLED"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->DISABLED:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    new-instance v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    const-string v1, "NO_SUPPORT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v3}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->NO_SUPPORT:Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    invoke-static {}, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->$values()[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->$VALUES:[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->statusCode:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;
    .locals 1

    const-class v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    return-object p0
.end method

.method public static values()[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;
    .locals 1

    sget-object v0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->$VALUES:[Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    invoke-virtual {v0}, [Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;

    return-object v0
.end method


# virtual methods
.method public getStatusCode()I
    .locals 1

    iget v0, p0, Lio/seon/androidsdk/service/GeolocationProbe$LocationStatus;->statusCode:I

    return v0
.end method
