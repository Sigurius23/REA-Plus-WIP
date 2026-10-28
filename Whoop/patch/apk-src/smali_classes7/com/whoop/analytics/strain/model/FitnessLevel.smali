.class public final enum Lcom/whoop/analytics/strain/model/FitnessLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/analytics/strain/model/FitnessLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum collegiate:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum inactive:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum professional:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum recreational_enthusiast:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum serious_enthusiast:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field public static final enum tactical:Lcom/whoop/analytics/strain/model/FitnessLevel;


# instance fields
.field private final value:D


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-string v4, "collegiate"

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v0, Lcom/whoop/analytics/strain/model/FitnessLevel;->collegiate:Lcom/whoop/analytics/strain/model/FitnessLevel;

    new-instance v1, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const/4 v2, 0x1

    const-wide v3, -0x4019a66e1c54d3e0L    # -0.6984338232663312

    const-string v5, "serious_enthusiast"

    invoke-direct {v1, v5, v2, v3, v4}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v1, Lcom/whoop/analytics/strain/model/FitnessLevel;->serious_enthusiast:Lcom/whoop/analytics/strain/model/FitnessLevel;

    new-instance v2, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const-string v3, "tactical"

    const/4 v4, 0x2

    const-wide v5, -0x3ff80e33eb8c0deeL    # -2.9930650327571664

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v2, Lcom/whoop/analytics/strain/model/FitnessLevel;->tactical:Lcom/whoop/analytics/strain/model/FitnessLevel;

    new-instance v3, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const-string v4, "professional"

    const/4 v7, 0x3

    invoke-direct {v3, v4, v7, v5, v6}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v3, Lcom/whoop/analytics/strain/model/FitnessLevel;->professional:Lcom/whoop/analytics/strain/model/FitnessLevel;

    new-instance v4, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const/4 v5, 0x4

    const-wide v6, -0x3ff5a397672acdb0L    # -3.295121377950899

    const-string v8, "recreational_enthusiast"

    invoke-direct {v4, v8, v5, v6, v7}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v4, Lcom/whoop/analytics/strain/model/FitnessLevel;->recreational_enthusiast:Lcom/whoop/analytics/strain/model/FitnessLevel;

    new-instance v5, Lcom/whoop/analytics/strain/model/FitnessLevel;

    const/4 v6, 0x5

    const-wide v7, -0x3ff2a61c1bb22d22L    # -3.6688917003869923

    const-string v9, "inactive"

    invoke-direct {v5, v9, v6, v7, v8}, Lcom/whoop/analytics/strain/model/FitnessLevel;-><init>(Ljava/lang/String;ID)V

    sput-object v5, Lcom/whoop/analytics/strain/model/FitnessLevel;->inactive:Lcom/whoop/analytics/strain/model/FitnessLevel;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/analytics/strain/model/FitnessLevel;

    move-result-object v0

    sput-object v0, Lcom/whoop/analytics/strain/model/FitnessLevel;->$VALUES:[Lcom/whoop/analytics/strain/model/FitnessLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ID)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/FitnessLevel;->value:D

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/analytics/strain/model/FitnessLevel;
    .locals 1

    const-class v0, Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/strain/model/FitnessLevel;

    return-object p0
.end method

.method public static values()[Lcom/whoop/analytics/strain/model/FitnessLevel;
    .locals 1

    sget-object v0, Lcom/whoop/analytics/strain/model/FitnessLevel;->$VALUES:[Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-virtual {v0}, [Lcom/whoop/analytics/strain/model/FitnessLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/analytics/strain/model/FitnessLevel;

    return-object v0
.end method


# virtual methods
.method public getWeightForHeartRate()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/FitnessLevel;->value:D

    return-wide v0
.end method
