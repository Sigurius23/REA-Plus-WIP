.class public final enum Lcom/whoop/domain/model/UnitSystem;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/UnitSystem;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/UnitSystem;

.field public static final enum IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

.field public static final enum METRIC:Lcom/whoop/domain/model/UnitSystem;

.field private static map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/domain/model/UnitSystem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lcom/whoop/domain/model/UnitSystem;
    .locals 2

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    sget-object v1, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    filled-new-array {v0, v1}, [Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/domain/model/UnitSystem;

    const-string v1, "metric"

    const-string v2, "METRIC"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/domain/model/UnitSystem;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    new-instance v0, Lcom/whoop/domain/model/UnitSystem;

    const/4 v1, 0x1

    const-string v2, "imperial"

    const-string v4, "IMPERIAL"

    invoke-direct {v0, v4, v1, v2}, Lcom/whoop/domain/model/UnitSystem;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    invoke-static {}, Lcom/whoop/domain/model/UnitSystem;->$values()[Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/UnitSystem;->$VALUES:[Lcom/whoop/domain/model/UnitSystem;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/UnitSystem;->map:Ljava/util/Map;

    invoke-static {}, Lcom/whoop/domain/model/UnitSystem;->values()[Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v2, v0, v3

    sget-object v4, Lcom/whoop/domain/model/UnitSystem;->map:Ljava/util/Map;

    iget-object v5, v2, Lcom/whoop/domain/model/UnitSystem;->name:Ljava/lang/String;

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
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

    iput-object p3, p0, Lcom/whoop/domain/model/UnitSystem;->name:Ljava/lang/String;

    return-void
.end method

.method public static fromName(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->map:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/UnitSystem;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value "

    const-string v2, " is not a valid UnitSystem value"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/UnitSystem;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/UnitSystem;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->$VALUES:[Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v0}, [Lcom/whoop/domain/model/UnitSystem;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method


# virtual methods
.method public toName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/UnitSystem;->name:Ljava/lang/String;

    return-object v0
.end method
