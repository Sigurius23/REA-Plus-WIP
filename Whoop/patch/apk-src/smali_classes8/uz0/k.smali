.class public final enum Luz0/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Luz0/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Luz0/k;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "STRAIN_ZONE_1",
        "STRAIN_ZONE_2",
        "STRAIN_ZONE_3",
        "STRAIN_ZONE_4",
        "STRAIN_ZONE_5",
        "UNKNOWN",
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

.field private static final synthetic $VALUES:[Luz0/k;

.field public static final enum STRAIN_ZONE_1:Luz0/k;

.field public static final enum STRAIN_ZONE_2:Luz0/k;

.field public static final enum STRAIN_ZONE_3:Luz0/k;

.field public static final enum STRAIN_ZONE_4:Luz0/k;

.field public static final enum STRAIN_ZONE_5:Luz0/k;

.field public static final enum UNKNOWN:Luz0/k;


# direct methods
.method private static final synthetic $values()[Luz0/k;
    .locals 6

    sget-object v0, Luz0/k;->STRAIN_ZONE_1:Luz0/k;

    sget-object v1, Luz0/k;->STRAIN_ZONE_2:Luz0/k;

    sget-object v2, Luz0/k;->STRAIN_ZONE_3:Luz0/k;

    sget-object v3, Luz0/k;->STRAIN_ZONE_4:Luz0/k;

    sget-object v4, Luz0/k;->STRAIN_ZONE_5:Luz0/k;

    sget-object v5, Luz0/k;->UNKNOWN:Luz0/k;

    filled-new-array/range {v0 .. v5}, [Luz0/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Luz0/k;

    const-string v1, "STRAIN_ZONE_1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->STRAIN_ZONE_1:Luz0/k;

    new-instance v0, Luz0/k;

    const-string v1, "STRAIN_ZONE_2"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->STRAIN_ZONE_2:Luz0/k;

    new-instance v0, Luz0/k;

    const-string v1, "STRAIN_ZONE_3"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->STRAIN_ZONE_3:Luz0/k;

    new-instance v0, Luz0/k;

    const-string v1, "STRAIN_ZONE_4"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->STRAIN_ZONE_4:Luz0/k;

    new-instance v0, Luz0/k;

    const-string v1, "STRAIN_ZONE_5"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->STRAIN_ZONE_5:Luz0/k;

    new-instance v0, Luz0/k;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Luz0/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz0/k;->UNKNOWN:Luz0/k;

    invoke-static {}, Luz0/k;->$values()[Luz0/k;

    move-result-object v0

    sput-object v0, Luz0/k;->$VALUES:[Luz0/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Luz0/k;->$ENTRIES:Lt83/a;

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

    sget-object v0, Luz0/k;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Luz0/k;
    .locals 1

    const-class v0, Luz0/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Luz0/k;

    return-object p0
.end method

.method public static values()[Luz0/k;
    .locals 1

    sget-object v0, Luz0/k;->$VALUES:[Luz0/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Luz0/k;

    return-object v0
.end method
