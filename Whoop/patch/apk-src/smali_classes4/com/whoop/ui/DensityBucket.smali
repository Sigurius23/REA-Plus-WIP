.class public final enum Lcom/whoop/ui/DensityBucket;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/DensityBucket$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/ui/DensityBucket;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/ui/DensityBucket;",
        "",
        "",
        "key",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "",
        "map",
        "getValueFromMap",
        "(Ljava/util/Map;)Ljava/lang/String;",
        "Ljava/lang/String;",
        "getKey",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "LDPI",
        "MDPI",
        "HDPI",
        "XHDPI",
        "XXHDPI",
        "XXXHDPI",
        "DEFAULT",
        "feature_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/ui/DensityBucket;

.field public static final Companion:Lcom/whoop/ui/DensityBucket$a;

.field public static final enum DEFAULT:Lcom/whoop/ui/DensityBucket;

.field public static final enum HDPI:Lcom/whoop/ui/DensityBucket;

.field public static final enum LDPI:Lcom/whoop/ui/DensityBucket;

.field public static final enum MDPI:Lcom/whoop/ui/DensityBucket;

.field public static final enum XHDPI:Lcom/whoop/ui/DensityBucket;

.field public static final enum XXHDPI:Lcom/whoop/ui/DensityBucket;

.field public static final enum XXXHDPI:Lcom/whoop/ui/DensityBucket;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/ui/DensityBucket;
    .locals 7

    sget-object v0, Lcom/whoop/ui/DensityBucket;->LDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v1, Lcom/whoop/ui/DensityBucket;->MDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v2, Lcom/whoop/ui/DensityBucket;->HDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v3, Lcom/whoop/ui/DensityBucket;->XHDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v4, Lcom/whoop/ui/DensityBucket;->XXHDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v5, Lcom/whoop/ui/DensityBucket;->XXXHDPI:Lcom/whoop/ui/DensityBucket;

    sget-object v6, Lcom/whoop/ui/DensityBucket;->DEFAULT:Lcom/whoop/ui/DensityBucket;

    filled-new-array/range {v0 .. v6}, [Lcom/whoop/ui/DensityBucket;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const/4 v1, 0x0

    const-string v2, "0.75x"

    const-string v3, "LDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->LDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const/4 v1, 0x1

    const-string v2, "1x"

    const-string v3, "MDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->MDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const/4 v1, 0x2

    const-string v2, "1.5x"

    const-string v3, "HDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->HDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const/4 v1, 0x3

    const-string v2, "2x"

    const-string v3, "XHDPI"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->XHDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const-string v1, "XXHDPI"

    const/4 v2, 0x4

    const-string v3, "3x"

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->XXHDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const/4 v1, 0x5

    const-string v2, "4x"

    const-string v4, "XXXHDPI"

    invoke-direct {v0, v4, v1, v2}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->XXXHDPI:Lcom/whoop/ui/DensityBucket;

    new-instance v0, Lcom/whoop/ui/DensityBucket;

    const-string v1, "DEFAULT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/ui/DensityBucket;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->DEFAULT:Lcom/whoop/ui/DensityBucket;

    invoke-static {}, Lcom/whoop/ui/DensityBucket;->$values()[Lcom/whoop/ui/DensityBucket;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/DensityBucket;->$VALUES:[Lcom/whoop/ui/DensityBucket;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/DensityBucket;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/ui/DensityBucket$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/DensityBucket$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/DensityBucket;->Companion:Lcom/whoop/ui/DensityBucket$a;

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

    iput-object p3, p0, Lcom/whoop/ui/DensityBucket;->key:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/ui/DensityBucket;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/ui/DensityBucket;
    .locals 1

    const-class v0, Lcom/whoop/ui/DensityBucket;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/ui/DensityBucket;

    return-object p0
.end method

.method public static values()[Lcom/whoop/ui/DensityBucket;
    .locals 1

    sget-object v0, Lcom/whoop/ui/DensityBucket;->$VALUES:[Lcom/whoop/ui/DensityBucket;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/ui/DensityBucket;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/DensityBucket;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueFromMap(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/DensityBucket;->key:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/ui/DensityBucket;->DEFAULT:Lcom/whoop/ui/DensityBucket;

    iget-object v0, v0, Lcom/whoop/ui/DensityBucket;->key:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    return-object v0
.end method
