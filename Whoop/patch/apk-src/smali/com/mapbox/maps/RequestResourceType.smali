.class public final enum Lcom/mapbox/maps/RequestResourceType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mapbox/maps/RequestResourceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mapbox/maps/RequestResourceType;

.field public static final enum GLYPHS:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum IMAGE:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum MODEL:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum SOURCE:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum SPRITE_IMAGE:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum SPRITE_JSON:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum STYLE:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum TILE:Lcom/mapbox/maps/RequestResourceType;

.field public static final enum UNKNOWN:Lcom/mapbox/maps/RequestResourceType;


# instance fields
.field private str:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/mapbox/maps/RequestResourceType;

    const/4 v1, 0x0

    const-string v2, "Unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mapbox/maps/RequestResourceType;->UNKNOWN:Lcom/mapbox/maps/RequestResourceType;

    new-instance v1, Lcom/mapbox/maps/RequestResourceType;

    const/4 v2, 0x1

    const-string v3, "Style"

    const-string v4, "STYLE"

    invoke-direct {v1, v4, v2, v3}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/mapbox/maps/RequestResourceType;->STYLE:Lcom/mapbox/maps/RequestResourceType;

    new-instance v2, Lcom/mapbox/maps/RequestResourceType;

    const/4 v3, 0x2

    const-string v4, "Source"

    const-string v5, "SOURCE"

    invoke-direct {v2, v5, v3, v4}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/mapbox/maps/RequestResourceType;->SOURCE:Lcom/mapbox/maps/RequestResourceType;

    new-instance v3, Lcom/mapbox/maps/RequestResourceType;

    const/4 v4, 0x3

    const-string v5, "Tile"

    const-string v6, "TILE"

    invoke-direct {v3, v6, v4, v5}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/mapbox/maps/RequestResourceType;->TILE:Lcom/mapbox/maps/RequestResourceType;

    new-instance v4, Lcom/mapbox/maps/RequestResourceType;

    const/4 v5, 0x4

    const-string v6, "Glyphs"

    const-string v7, "GLYPHS"

    invoke-direct {v4, v7, v5, v6}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/mapbox/maps/RequestResourceType;->GLYPHS:Lcom/mapbox/maps/RequestResourceType;

    new-instance v5, Lcom/mapbox/maps/RequestResourceType;

    const/4 v6, 0x5

    const-string v7, "SpriteImage"

    const-string v8, "SPRITE_IMAGE"

    invoke-direct {v5, v8, v6, v7}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/mapbox/maps/RequestResourceType;->SPRITE_IMAGE:Lcom/mapbox/maps/RequestResourceType;

    new-instance v6, Lcom/mapbox/maps/RequestResourceType;

    const/4 v7, 0x6

    const-string v8, "SpriteJSON"

    const-string v9, "SPRITE_JSON"

    invoke-direct {v6, v9, v7, v8}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/mapbox/maps/RequestResourceType;->SPRITE_JSON:Lcom/mapbox/maps/RequestResourceType;

    new-instance v7, Lcom/mapbox/maps/RequestResourceType;

    const/4 v8, 0x7

    const-string v9, "Image"

    const-string v10, "IMAGE"

    invoke-direct {v7, v10, v8, v9}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/mapbox/maps/RequestResourceType;->IMAGE:Lcom/mapbox/maps/RequestResourceType;

    new-instance v8, Lcom/mapbox/maps/RequestResourceType;

    const/16 v9, 0x8

    const-string v10, "Model"

    const-string v11, "MODEL"

    invoke-direct {v8, v11, v9, v10}, Lcom/mapbox/maps/RequestResourceType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/mapbox/maps/RequestResourceType;->MODEL:Lcom/mapbox/maps/RequestResourceType;

    filled-new-array/range {v0 .. v8}, [Lcom/mapbox/maps/RequestResourceType;

    move-result-object v0

    sput-object v0, Lcom/mapbox/maps/RequestResourceType;->$VALUES:[Lcom/mapbox/maps/RequestResourceType;

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

    iput-object p3, p0, Lcom/mapbox/maps/RequestResourceType;->str:Ljava/lang/String;

    return-void
.end method

.method private getValue()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mapbox/maps/RequestResourceType;
    .locals 1

    const-class v0, Lcom/mapbox/maps/RequestResourceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mapbox/maps/RequestResourceType;

    return-object p0
.end method

.method public static values()[Lcom/mapbox/maps/RequestResourceType;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/RequestResourceType;->$VALUES:[Lcom/mapbox/maps/RequestResourceType;

    invoke-virtual {v0}, [Lcom/mapbox/maps/RequestResourceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mapbox/maps/RequestResourceType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/RequestResourceType;->str:Ljava/lang/String;

    return-object v0
.end method
