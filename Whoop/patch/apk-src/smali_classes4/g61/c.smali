.class public final enum Lg61/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg61/c;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lg61/c;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FADED",
        "SOLID",
        "FADING",
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

.field private static final synthetic $VALUES:[Lg61/c;

.field public static final enum FADED:Lg61/c;

.field public static final enum FADING:Lg61/c;

.field public static final enum SOLID:Lg61/c;


# direct methods
.method private static final synthetic $values()[Lg61/c;
    .locals 3

    sget-object v0, Lg61/c;->FADED:Lg61/c;

    sget-object v1, Lg61/c;->SOLID:Lg61/c;

    sget-object v2, Lg61/c;->FADING:Lg61/c;

    filled-new-array {v0, v1, v2}, [Lg61/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg61/c;

    const-string v1, "FADED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg61/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg61/c;->FADED:Lg61/c;

    new-instance v0, Lg61/c;

    const-string v1, "SOLID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg61/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg61/c;->SOLID:Lg61/c;

    new-instance v0, Lg61/c;

    const-string v1, "FADING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg61/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg61/c;->FADING:Lg61/c;

    invoke-static {}, Lg61/c;->$values()[Lg61/c;

    move-result-object v0

    sput-object v0, Lg61/c;->$VALUES:[Lg61/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lg61/c;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lg61/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lg61/c;
    .locals 1

    const-class v0, Lg61/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg61/c;

    return-object p0
.end method

.method public static values()[Lg61/c;
    .locals 1

    sget-object v0, Lg61/c;->$VALUES:[Lg61/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg61/c;

    return-object v0
.end method
