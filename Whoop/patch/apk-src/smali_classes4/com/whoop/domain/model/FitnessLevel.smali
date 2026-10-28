.class public final enum Lcom/whoop/domain/model/FitnessLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/FitnessLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum COLLEGIATE:Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum INACTIVE:Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum PROFESSIONAL:Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum RECREATIONAL:Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum SERIOUS:Lcom/whoop/domain/model/FitnessLevel;

.field public static final enum TACTICAL:Lcom/whoop/domain/model/FitnessLevel;

.field private static map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/domain/model/FitnessLevel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final displayNameResId:I

.field private final value:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/whoop/domain/model/FitnessLevel;
    .locals 6

    sget-object v0, Lcom/whoop/domain/model/FitnessLevel;->INACTIVE:Lcom/whoop/domain/model/FitnessLevel;

    sget-object v1, Lcom/whoop/domain/model/FitnessLevel;->RECREATIONAL:Lcom/whoop/domain/model/FitnessLevel;

    sget-object v2, Lcom/whoop/domain/model/FitnessLevel;->COLLEGIATE:Lcom/whoop/domain/model/FitnessLevel;

    sget-object v3, Lcom/whoop/domain/model/FitnessLevel;->SERIOUS:Lcom/whoop/domain/model/FitnessLevel;

    sget-object v4, Lcom/whoop/domain/model/FitnessLevel;->PROFESSIONAL:Lcom/whoop/domain/model/FitnessLevel;

    sget-object v5, Lcom/whoop/domain/model/FitnessLevel;->TACTICAL:Lcom/whoop/domain/model/FitnessLevel;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "inactive"

    sget v2, Luv0/c;->y:I

    const-string v3, "INACTIVE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->INACTIVE:Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "recreational_enthusiast"

    sget v2, Luv0/c;->A:I

    const-string v3, "RECREATIONAL"

    const/4 v5, 0x1

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->RECREATIONAL:Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "collegiate"

    sget v2, Luv0/c;->x:I

    const-string v3, "COLLEGIATE"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->COLLEGIATE:Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "serious_enthusiast"

    sget v2, Luv0/c;->B:I

    const-string v3, "SERIOUS"

    const/4 v5, 0x3

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->SERIOUS:Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "professional"

    sget v2, Luv0/c;->z:I

    const-string v3, "PROFESSIONAL"

    const/4 v5, 0x4

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->PROFESSIONAL:Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Lcom/whoop/domain/model/FitnessLevel;

    const-string v1, "tactical"

    sget v2, Luv0/c;->C:I

    const-string v3, "TACTICAL"

    const/4 v5, 0x5

    invoke-direct {v0, v3, v5, v1, v2}, Lcom/whoop/domain/model/FitnessLevel;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->TACTICAL:Lcom/whoop/domain/model/FitnessLevel;

    invoke-static {}, Lcom/whoop/domain/model/FitnessLevel;->$values()[Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->$VALUES:[Lcom/whoop/domain/model/FitnessLevel;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/FitnessLevel;->map:Ljava/util/Map;

    invoke-static {}, Lcom/whoop/domain/model/FitnessLevel;->values()[Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v2, v0, v4

    sget-object v3, Lcom/whoop/domain/model/FitnessLevel;->map:Ljava/util/Map;

    iget-object v5, v2, Lcom/whoop/domain/model/FitnessLevel;->value:Ljava/lang/String;

    invoke-interface {v3, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/domain/model/FitnessLevel;->value:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/domain/model/FitnessLevel;->displayNameResId:I

    return-void
.end method

.method public static fromNameKey(Ljava/lang/String;)Lcom/whoop/domain/model/FitnessLevel;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget-object v0, Lcom/whoop/domain/model/FitnessLevel;->map:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/FitnessLevel;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value "

    const-string v2, " is not a valid FitnessLevel value"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/FitnessLevel;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/FitnessLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/FitnessLevel;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/FitnessLevel;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/FitnessLevel;->$VALUES:[Lcom/whoop/domain/model/FitnessLevel;

    invoke-virtual {v0}, [Lcom/whoop/domain/model/FitnessLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/FitnessLevel;

    return-object v0
.end method


# virtual methods
.method public getUserShortDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/FitnessLevel;->displayNameResId:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toNameKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/FitnessLevel;->value:Ljava/lang/String;

    return-object v0
.end method
